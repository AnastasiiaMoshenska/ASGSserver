package schematics.schematics_server.beamlineschematics.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicElement;
import schematics.schematics_server.beamlineschematics.mapper.BeamlineSchematicMapper;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicElementEntity;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicElementEntityRepository;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BeamlineSchematicElementServiceTest {

    @Mock
    private BeamlineSchematicElementEntityRepository beamlineSchematicElementEntityRepository;

    @Mock
    private BeamlineSchematicMapper beamlineSchematicMapper;

    @InjectMocks
    private BeamlineSchematicElementService beamlineSchematicElementService;

    @Test
    void findAllElements() {
        Long machineElemId = 1L;
        Long referentialId = 2L;
        Instant timeValue = Instant.now();
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

        BeamlineSchematicElementEntity dummyEntity = new BeamlineSchematicElementEntity();
        dummyEntity.setId(1L);
        dummyEntity.setElementId(1L);
        dummyEntity.setElementLabel("Label");
        dummyEntity.setElementName("Name");
        dummyEntity.setExpertName("Expert");
        dummyEntity.setMainClass("Main Class");
        dummyEntity.setDepthLevel(1);
        dummyEntity.setValidFromDay(Instant.ofEpochSecond(200));
        dummyEntity.setExpiryDay(Instant.ofEpochSecond(300));
        dummyEntity.setExpiryDayLabel("Expiry Label");
        dummyEntity.setElementTypeId(1L);
        dummyEntity.setTypeName("Type Name");
        dummyEntity.setBgColor("#FFFFFF");
        dummyEntity.setTxtColor("#000000");
        dummyEntity.setWidth(10.0);
        dummyEntity.setHeight(20.0);
        dummyEntity.setDepth(30.0);
        dummyEntity.setDownstreamX(1.0);
        dummyEntity.setDownstreamY(2.0);
        dummyEntity.setDownstreamZ(3.0);
        dummyEntity.setMidstreamX(4.0);
        dummyEntity.setMidstreamY(5.0);
        dummyEntity.setMidstreamZ(6.0);
        dummyEntity.setUpstreamX(7.0);
        dummyEntity.setUpstreamY(8.0);
        dummyEntity.setUpstreamZ(9.0);
        dummyEntity.setSequences("sequence");

        when(beamlineSchematicElementEntityRepository.findAllElements(machineElemId, referentialId, timeValue, dcumStart,
                dcumEnd)).thenReturn(Collections.singletonList(dummyEntity));

        // when
        List<BeamlineSchematicElement> result = beamlineSchematicElementService.findAllElements(machineElemId, referentialId, timeValue, dcumStart,
                dcumEnd);

        // then
        assertEquals(expectedElements.size(), result.size());
    }
}