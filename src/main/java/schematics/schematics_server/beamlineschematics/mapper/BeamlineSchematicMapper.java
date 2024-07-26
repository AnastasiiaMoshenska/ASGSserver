package schematics.schematics_server.beamlineschematics.mapper;

import org.springframework.stereotype.Component;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicElement;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicElementEntity;
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

    public BeamlineSchematicElement toSchematicElement(BeamlineSchematicElementEntity beamlineSchematicElementEntity){
        return BeamlineSchematicElement.builder()
                .id(beamlineSchematicElementEntity.getId())
                .elementId(beamlineSchematicElementEntity.getId())
                .elementLabel(beamlineSchematicElementEntity.getElementLabel())
                .elementName(beamlineSchematicElementEntity.getElementName())
                .expertName(beamlineSchematicElementEntity.getExpertName())
                .mainClass(beamlineSchematicElementEntity.getMainClass())
                .depthLevel(beamlineSchematicElementEntity.getDepthLevel())
                .validFromDay(beamlineSchematicElementEntity.getValidFromDay())
                .expiryDay(beamlineSchematicElementEntity.getExpiryDay())
                .expiryDayLabel(beamlineSchematicElementEntity.getExpiryDayLabel())
                .expiryDayId(beamlineSchematicElementEntity.getExpiryDayId())
                .elementTypeId(beamlineSchematicElementEntity.getElementTypeId())
                .typeName(beamlineSchematicElementEntity.getTypeName())
                .bgColor(beamlineSchematicElementEntity.getBgColor())
                .txtColor(beamlineSchematicElementEntity.getTxtColor())
                .width(beamlineSchematicElementEntity.getWidth())
                .height(beamlineSchematicElementEntity.getHeight())
                .depth(beamlineSchematicElementEntity.getDepth())
                .downstreamX(beamlineSchematicElementEntity.getDownstreamX())
                .downstreamY(beamlineSchematicElementEntity.getDownstreamY())
                .downstreamZ(beamlineSchematicElementEntity.getDownstreamZ())
                .midstreamX(beamlineSchematicElementEntity.getMidstreamX())
                .midstreamY(beamlineSchematicElementEntity.getMidstreamY())
                .midstreamZ(beamlineSchematicElementEntity.getMidstreamZ())
                .upstreamX(beamlineSchematicElementEntity.getUpstreamX())
                .upstreamY(beamlineSchematicElementEntity.getUpstreamY())
                .upstreamZ(beamlineSchematicElementEntity.getUpstreamZ())
                .build();
    }
}
