package schematics.schematics_server.beamlineschematics.mapper;

import org.springframework.stereotype.Component;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicPositionEntity;

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

    public BeamlineSchematicPosition toSchematicPosition(BeamlineSchematicPositionEntity beamlineSchematicPositionEntity) {
        return BeamlineSchematicPosition.builder()
                .elementId(beamlineSchematicPositionEntity.getId())
                .elementName(beamlineSchematicPositionEntity.getElementName())
                .referentialId(beamlineSchematicPositionEntity.getReferentialId())
                .upstreamX(beamlineSchematicPositionEntity.getUpstreamX())
                .midstreamX(beamlineSchematicPositionEntity.getMidstreamX())
                .downstreamX(beamlineSchematicPositionEntity.getDownstreamX())
                .elementValidFromDay(beamlineSchematicPositionEntity.getValidFromDay())
                .elementExpiryDay(beamlineSchematicPositionEntity.getExpiryDay())
                .build();
    }
}
