package schematics.schematics_server.beamlineschematics.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.mapper.BeamlineSchematicMapper;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicMachineEntityRepository;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BeamlineSchematicMachineServiceTest {

    @Mock
    private BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository;

    @Mock
    private BeamlineSchematicMapper beamlineSchematicMapper;

    @InjectMocks
    private BeamlineSchematicMachineService beamlineSchematicMachineService;

    @Test
    void findAllMachines() {
        // given
        List<BeamlineSchematicMachine> expectedMachines = Collections.singletonList(
                BeamlineSchematicMachine.builder()
                        .referentialId(1L)
                        .machineCode("code")
                        .description("description")
                        .validFromDay(Instant.ofEpochSecond(200))
                        .machineElementId(1L)
                        .machineLength(1D)
                        .build()
        );

        BeamlineSchematicMachineEntity dummyEntity = new BeamlineSchematicMachineEntity();
        dummyEntity.setReferentialId(1L);
        dummyEntity.setMachineCode("code");
        dummyEntity.setDescription("description");
        dummyEntity.setValidFromDay(Instant.ofEpochSecond(200));
        dummyEntity.setExpiryDay(Instant.ofEpochSecond(200));
        dummyEntity.setMachineLength(1D);
        dummyEntity.setSchematicSupport(true);

        when(beamlineSchematicMachineEntityRepository.findAllMachines()).thenReturn(Collections.singletonList(dummyEntity));

        // when
        List<BeamlineSchematicMachine> result = beamlineSchematicMachineService.findAllMachines();

        // then
        assertEquals(expectedMachines.size(), result.size());
    }
}