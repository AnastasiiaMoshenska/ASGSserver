package schematics.schematics_server.beamlineschematics.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicElement;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicElementService;

import java.time.Instant;
import java.util.List;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BeamlineSchematicElementControllerTest {

    @Mock
    private BeamlineSchematicElementService beamlineSchematicElementService;

    @InjectMocks
    private BeamlineSchematicElementController beamlineSchematicElementController;

    @Test
    void getAllElements() {

        Long machineElemId = 1L;
        Long referentialId = 2L;
        Instant date = Instant.now();
        float dcumStart = 0F;
        float dcumEnd = 10F;


        // given
        List<BeamlineSchematicElement> expectedElements = Collections.singletonList(
                BeamlineSchematicElement.builder()
                        .id(1L)
                        .elementId(1L)
                        .elementLabel("Label")
                        .elementName("Name")
                        .expertName("Expert")
                        .mainClass("Main Class")
                        .depthLevel(1)
                        .validFromDay(Instant.ofEpochSecond(200))
                        .expiryDay(Instant.ofEpochSecond(300))
                        .expiryDayLabel("Expiry Label")
                        .elementTypeId(1L)
                        .typeName("Type Name")
                        .bgColor("#FFFFFF")
                        .txtColor("#000000")
                        .width(10.0)
                        .height(20.0)
                        .depth(30.0)
                        .downstreamX(1.0)
                        .downstreamY(2.0)
                        .downstreamZ(3.0)
                        .midstreamX(4.0)
                        .midstreamY(5.0)
                        .midstreamZ(6.0)
                        .upstreamX(7.0)
                        .upstreamY(8.0)
                        .upstreamZ(9.0)
                        .sequences("sequence")
                        .build()
        );

        when(beamlineSchematicElementService.findAllElements(machineElemId, referentialId, date, dcumStart, dcumEnd))
                .thenReturn(expectedElements);

        // when
        List<BeamlineSchematicElement> result = beamlineSchematicElementController.getAllElements(machineElemId, referentialId, date, dcumStart, dcumEnd);

        // then
        assertEquals(expectedElements.size(), result.size());
        assertEquals(expectedElements.get(0), result.get(0));

    }
}