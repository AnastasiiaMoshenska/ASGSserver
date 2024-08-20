package schematics.schematics_server.beamlineschematics.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.mapper.BeamlineSchematicMapper;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicPositionEntity;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicPositionEntityRepository;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BeamlineSchematicPositionServiceTest {

    @Mock
    private BeamlineSchematicPositionEntityRepository beamlineSchematicPositionEntityRepository;

    @Mock
    private BeamlineSchematicMapper beamlineSchematicMapper;

    @InjectMocks
    private BeamlineSchematicPositionService beamlineSchematicPositionService;

    @Test
    void findAllPositions() {
        // given
        Long referentialId= 1L;
        Instant timeValue = Instant.now();

        List<BeamlineSchematicPosition> expectedPositions = Collections.singletonList(
                BeamlineSchematicPosition.builder()
                        .elementName("name")
                        .referentialId(1L)
                        .upstreamX(1D)
                        .midstreamX(1D)
                        .downstreamX(1D)
                        .elementValidFromDay(Instant.ofEpochSecond(200))
                        .elementExpiryDay(Instant.ofEpochSecond(200))
                        .build()
        );

        BeamlineSchematicPositionEntity dummyEntity = new BeamlineSchematicPositionEntity();
        dummyEntity.setElementName("name");
        dummyEntity.setReferentialId(1L);
        dummyEntity.setUpstreamX(1D);
        dummyEntity.setMidstreamX(1D);
        dummyEntity.setDownstreamX(1D);
        dummyEntity.setValidFromDay(Instant.ofEpochSecond(200));
        dummyEntity.setExpiryDay(Instant.ofEpochSecond(200));

        when(beamlineSchematicPositionEntityRepository.findAllPositions(referentialId, timeValue)).thenReturn(Collections.singletonList(dummyEntity));

        // when
        List<BeamlineSchematicPosition> result = beamlineSchematicPositionService.findAllPositions(referentialId, timeValue);

        // then
        assertEquals(expectedPositions.size(), result.size());
    }
}