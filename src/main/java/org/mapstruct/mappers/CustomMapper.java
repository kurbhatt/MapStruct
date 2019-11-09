package org.mapstruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.bean.A;
import org.mapstruct.bean.dto.ADto;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomMapper {

    CustomMapper INSTANCE = Mappers.getMapper(CustomMapper.class);

    ADto atoADto(A a);
}
