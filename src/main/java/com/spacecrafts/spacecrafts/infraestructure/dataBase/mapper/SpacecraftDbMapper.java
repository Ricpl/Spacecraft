package com.spacecrafts.spacecrafts.infraestructure.dataBase.mapper;

import com.spacecrafts.spacecrafts.domain.Spacecraft;
import com.spacecrafts.spacecrafts.infraestructure.dataBase.jparepository.SpacecraftDB;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpacecraftDbMapper {

    Spacecraft fromDBtoDomain(SpacecraftDB spacecraft);
    SpacecraftDB fromDomainToDB(Spacecraft spacecraft);
    List<Spacecraft> fromDBtoDomainList(List<SpacecraftDB> spacecraft);

}
