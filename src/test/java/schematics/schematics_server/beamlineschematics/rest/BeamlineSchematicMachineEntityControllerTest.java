package schematics.schematics_server.beamlineschematics.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicMachineService;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BeamlineSchematicMachineEntityControllerTest {

    @Mock
    private BeamlineSchematicMachineService beamlineSchematicMachineService;

    @InjectMocks
    private BeamlineSchematicMachineEntityController beamlineSchematicMachineEntityController;


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

        when(beamlineSchematicMachineService.findAllMachines()).thenReturn(expectedMachines);

        // when
        List<BeamlineSchematicMachine> result = beamlineSchematicMachineEntityController.findAllMachines();

        // then
        assertEquals(expectedMachines.size(), result.size());
        assertEquals(expectedMachines.get(0), result.get(0));
    }
}