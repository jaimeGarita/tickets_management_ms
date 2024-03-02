package com.iftc.tickets.mapper;

import org.springframework.stereotype.Component;

import com.iftc.tickets.model.LightUser;
import com.iftc.tickets.model.proto.LightUserDTOOuterClass;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public LightUser contractToUserDTO(LightUserDTOOuterClass.LightUserDTO user) {
        LightUser ligthUserDTO = new LightUser();
        ligthUserDTO.setId((long) user.getId());
        ligthUserDTO.setUsername(user.getUsername());

        return ligthUserDTO;
    }

}
