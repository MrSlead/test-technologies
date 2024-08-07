package com.almod.api.mapper;

import com.almod.api.dto.broker.activemq.EmployeeDto;
import com.almod.store.entity.broker.activemq.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends com.almod.api.mapper.Mapper<EmployeeDto, EmployeeEntity> {
    EmployeeDto toDto(EmployeeEntity entity);
    EmployeeEntity toEntity(EmployeeDto dto);
}
