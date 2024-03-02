package com.iftc.tickets.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.iftc.tickets.mapper.UserMapper;
import com.iftc.tickets.model.LightUser;
import com.iftc.tickets.model.proto.LightUserDTOOuterClass;
import com.iftc.tickets.repository.LightUserRepository;


@Component
public class KafkaConsumer {
    
    @Autowired
    UserMapper userMapper;

    @Autowired
    LightUserRepository lightUserRepository;    

    @KafkaListener(topics = "topic-1", groupId = "jaimeGroup")
    public void listen(LightUserDTOOuterClass.LightUserDTO message) {
        LightUser lightUser = userMapper.contractToUserDTO(message);
        System.out.println("USER " + lightUser.getUsername() + " SAVE");
        lightUserRepository.save(lightUser);
    }

}
