package org.mapstruct;

import org.mapstruct.bean.A;
import org.mapstruct.bean.dto.ADto;
import org.mapstruct.generator.DataGenerator;
import org.mapstruct.mappers.CustomMapper;

public class AppMain {

    public static void main(String[] args) {
        A a = DataGenerator.generateData();

        ADto aDto = CustomMapper.INSTANCE.atoADto(a);
        System.out.println(aDto.getId());
    }
}
