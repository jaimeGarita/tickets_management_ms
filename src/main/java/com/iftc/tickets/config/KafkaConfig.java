package com.iftc.tickets.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.api.serder.config.ProtoBufDeserializer;
import com.google.protobuf.Message;
import com.iftc.tickets.model.proto.LightUserDTOOuterClass;
import com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO;

@Configuration
@EnableKafka
public class KafkaConfig {
    
    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Bean
    public Class<LightUserDTOOuterClass.LightUserDTO> LightUserDTOOuterClass() {
        return LightUserDTOOuterClass.LightUserDTO.class;
    }

    //CONFIG PROPS CONSUMER
    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ProtoBufDeserializer.class);
        props.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "json");
        return props;
    }
    
    @Bean
    public <T extends Message> ConsumerFactory<String, T> consumerFactory(Class<T> messageType) {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(), new ProtoBufDeserializer<>(messageType));
    }

    @Bean
    public <T extends Message> ConcurrentKafkaListenerContainerFactory<String, T> kafkaListenerContainerFactory(Class<T> messageType) {
        ConcurrentKafkaListenerContainerFactory<String, T> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory(messageType));
        return factory;
    }
}

