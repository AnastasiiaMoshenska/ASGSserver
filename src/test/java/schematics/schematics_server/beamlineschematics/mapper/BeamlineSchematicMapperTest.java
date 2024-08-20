package schematics.schematics_server.beamlineschematics.mapper;

import org.junit.jupiter.api.Test;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicElement;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicElementEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicPositionEntity;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BeamlineSchematicMapperTest {

    @Test
    void toSchematicMachine() {
        // given
        BeamlineSchematicMachineEntity beamlineSchematicMachineEntity = mock(BeamlineSchematicMachineEntity.class);
        when(beamlineSchematicMachineEntity.getId()).thenReturn(42L);
        when(beamlineSchematicMachineEntity.getReferentialId()).thenReturn(42L);
        when(beamlineSchematicMachineEntity.getMachineCode()).thenReturn("LHC");
        when(beamlineSchematicMachineEntity.getDescription()).thenReturn("description");
        when(beamlineSchematicMachineEntity.getValidFromDay()).thenReturn(Instant.ofEpochSecond(200));
        when(beamlineSchematicMachineEntity.getExpiryDay()).thenReturn(Instant.ofEpochSecond(200));
        when(beamlineSchematicMachineEntity.getMachineLength()).thenReturn(10D);

        // when
        BeamlineSchematicMachine result = new BeamlineSchematicMapper().toSchematicMachine(beamlineSchematicMachineEntity);

        // then
        assertEquals(42L, result.getMachineElementId());
        assertEquals(42, result.getReferentialId());
        assertEquals("LHC", result.getMachineCode());
        assertEquals("description", result.getDescription());
        assertEquals(Instant.ofEpochSecond(200), result.getValidFromDay());
        assertEquals(Instant.ofEpochSecond(200), result.getExpiryDay());
        assertEquals(10F, result.getMachineLength());
    }

    @Test
    void toSchematicPosition() {
        // given
        BeamlineSchematicPositionEntity beamlineSchematicPositionEntity = mock(BeamlineSchematicPositionEntity.class);
        when(beamlineSchematicPositionEntity.getId()).thenReturn(42L);
        when(beamlineSchematicPositionEntity.getElementName()).thenReturn("dipole");
        when(beamlineSchematicPositionEntity.getReferentialId()).thenReturn(42L);
        when(beamlineSchematicPositionEntity.getUpstreamX()).thenReturn(0D);
        when(beamlineSchematicPositionEntity.getMidstreamX()).thenReturn(0D);
        when(beamlineSchematicPositionEntity.getDownstreamX()).thenReturn(0D);
        when(beamlineSchematicPositionEntity.getValidFromDay()).thenReturn(Instant.ofEpochSecond(200));
        when(beamlineSchematicPositionEntity.getExpiryDay()).thenReturn(Instant.ofEpochSecond(200));

        // when
        BeamlineSchematicPosition result = new BeamlineSchematicMapper().toSchematicPosition(beamlineSchematicPositionEntity);

        // then
        assertEquals(42L, result.getElementId());
        assertEquals("dipole", result.getElementName());
        assertEquals(42L, result.getReferentialId());
        assertEquals(0F, result.getUpstreamX());
        assertEquals(0F, result.getMidstreamX());
        assertEquals(0F, result.getDownstreamX());
        assertEquals(Instant.ofEpochSecond(200), result.getElementValidFromDay());
        assertEquals(Instant.ofEpochSecond(200), result.getElementExpiryDay());
    }

    @Test
    void toSchematicElement() {
        // given
        BeamlineSchematicElementEntity beamlineSchematicElementEntity = mock(BeamlineSchematicElementEntity.class);
        when(beamlineSchematicElementEntity.getId()).thenReturn(42L);
        when(beamlineSchematicElementEntity.getElementLabel()).thenReturn("Label");
        when(beamlineSchematicElementEntity.getElementName()).thenReturn("Element Name");
        when(beamlineSchematicElementEntity.getExpertName()).thenReturn("Expert Name");
        when(beamlineSchematicElementEntity.getMainClass()).thenReturn("Main Class");
        when(beamlineSchematicElementEntity.getDepthLevel()).thenReturn(1);
        when(beamlineSchematicElementEntity.getValidFromDay()).thenReturn(Instant.ofEpochSecond(200));
        when(beamlineSchematicElementEntity.getExpiryDay()).thenReturn(Instant.ofEpochSecond(200));
        when(beamlineSchematicElementEntity.getExpiryDayLabel()).thenReturn("Expires at end of year");
        when(beamlineSchematicElementEntity.getExpiryDayId()).thenReturn(100);
        when(beamlineSchematicElementEntity.getElementTypeId()).thenReturn(10L);
        when(beamlineSchematicElementEntity.getTypeName()).thenReturn("Type Name");
        when(beamlineSchematicElementEntity.getBgColor()).thenReturn("#FFFFFF");
        when(beamlineSchematicElementEntity.getTxtColor()).thenReturn("#000000");
        when(beamlineSchematicElementEntity.getWidth()).thenReturn(100D);
        when(beamlineSchematicElementEntity.getHeight()).thenReturn(200D);
        when(beamlineSchematicElementEntity.getDepth()).thenReturn(50D);
        when(beamlineSchematicElementEntity.getDownstreamX()).thenReturn(1.0);
        when(beamlineSchematicElementEntity.getDownstreamY()).thenReturn(2.0);
        when(beamlineSchematicElementEntity.getDownstreamZ()).thenReturn(3.0);
        when(beamlineSchematicElementEntity.getMidstreamX()).thenReturn(4.0);
        when(beamlineSchematicElementEntity.getMidstreamY()).thenReturn(5.0);
        when(beamlineSchematicElementEntity.getMidstreamZ()).thenReturn(6.0);
        when(beamlineSchematicElementEntity.getUpstreamX()).thenReturn(7.0);
        when(beamlineSchematicElementEntity.getUpstreamY()).thenReturn(8.0);
        when(beamlineSchematicElementEntity.getUpstreamZ()).thenReturn(9.0);

        //when
        BeamlineSchematicElement result = new BeamlineSchematicMapper().toSchematicElement(beamlineSchematicElementEntity);

        // then
        assertNotNull(result);
        assertEquals(42L, result.getId());
        assertEquals("Label", result.getElementLabel());
        assertEquals("Element Name", result.getElementName());
        assertEquals("Expert Name", result.getExpertName());
        assertEquals("Main Class", result.getMainClass());
        assertEquals(1, result.getDepthLevel());
        assertEquals(Instant.ofEpochSecond(200), result.getValidFromDay());
        assertEquals(Instant.ofEpochSecond(200), result.getExpiryDay());
        assertEquals("Expires at end of year", result.getExpiryDayLabel());
        assertEquals(100, result.getExpiryDayId());
        assertEquals(10L, result.getElementTypeId());
        assertEquals("Type Name", result.getTypeName());
        assertEquals("#FFFFFF", result.getBgColor());
        assertEquals("#000000", result.getTxtColor());
        assertEquals(100, result.getWidth());
        assertEquals(200, result.getHeight());
        assertEquals(50, result.getDepth());
        assertEquals(1.0, result.getDownstreamX());
        assertEquals(2.0, result.getDownstreamY());
        assertEquals(3.0, result.getDownstreamZ());
        assertEquals(4.0, result.getMidstreamX());
        assertEquals(5.0, result.getMidstreamY());
        assertEquals(6.0, result.getMidstreamZ());
        assertEquals(7.0, result.getUpstreamX());
        assertEquals(8.0, result.getUpstreamY());
        assertEquals(9.0, result.getUpstreamZ());

    }
}