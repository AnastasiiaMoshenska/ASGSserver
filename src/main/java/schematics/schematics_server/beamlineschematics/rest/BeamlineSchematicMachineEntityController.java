package schematics.schematics_server.beamlineschematics.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicMachineService;

import java.util.List;

@RestController
@RequestMapping("/beamline-schematics/machines")
@RequiredArgsConstructor
public class BeamlineSchematicMachineEntityController {
    private final BeamlineSchematicMachineService beamlineSchematicMachineService;

    @GetMapping("")
    public List<BeamlineSchematicMachine> findAllMachinesDto() {
        return beamlineSchematicMachineService.findAllMachines();
    }
}
