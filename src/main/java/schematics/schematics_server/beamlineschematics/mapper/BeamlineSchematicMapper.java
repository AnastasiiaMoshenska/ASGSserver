package schematics.schematics_server.beamlineschematics.mapper;

import org.springframework.stereotype.Component;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;

@Component
public class BeamlineSchematicMapper {

    public BeamlineSchematicMachine toSchematicMachine(BeamlineSchematicMachineEntity beamlineSchematicMachineEntity) {
        return BeamlineSchematicMachine.builder()
                .machineElementId(beamlineSchematicMachineEntity.getId())
                .referentialId(beamlineSchematicMachineEntity.getReferentialId())
                .machineCode(beamlineSchematicMachineEntity.getMachineCode())
                .description(beamlineSchematicMachineEntity.getDescription())
                .validFromDay(beamlineSchematicMachineEntity.getValidFromDay())
                .expiryDay(beamlineSchematicMachineEntity.getExpiryDay())
                .machineLength(beamlineSchematicMachineEntity.getMachineLength())
                .build();
    }
}
