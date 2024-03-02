package com.iftc.tickets.mapper;

import com.iftc.tickets.model.LightUser;
import com.iftc.tickets.model.proto.LightUserDTOOuterClass;

public interface UserMapper {
    
    LightUser contractToUserDTO(LightUserDTOOuterClass.LightUserDTO user);

}
