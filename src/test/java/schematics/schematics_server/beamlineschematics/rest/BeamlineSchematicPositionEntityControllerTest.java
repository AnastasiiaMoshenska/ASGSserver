package schematics.schematics_server.beamlineschematics.rest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicPositionService;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BeamlineSchematicPositionEntityControllerTest {

    @Mock
    private BeamlineSchematicPositionService beamlineSchematicPositionService;

    @InjectMocks
    private BeamlineSchematicPositionEntityController beamlineSchematicPositionEntityController;


    @Test
    void findAllPositions() {
        Long referentialId = 1L;
        Instant elValidFromDay = Instant.now();

        // given
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

        when(beamlineSchematicPositionService.findAllPositions(referentialId, elValidFromDay))
                .thenReturn(expectedPositions);

        // when
        List<BeamlineSchematicPosition> result = beamlineSchematicPositionEntityController.findAllPositions(referentialId, elValidFromDay);

        // then
        assertEquals(expectedPositions.size(), result.size());
        assertEquals(expectedPositions.get(0), result.get(0));
    }
}