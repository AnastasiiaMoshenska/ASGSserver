package schematics.schematics_server.beamlineschematics.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicMachine;
import schematics.schematics_server.beamlineschematics.mapper.BeamlineSchematicMapper;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicMachineEntityRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BeamlineSchematicMachineService {

    private final BeamlineSchematicMachineEntityRepository beamlineSchematicsMachineEntityRepository;
    private final BeamlineSchematicMapper beamlineSchematicMapper;

    public List<BeamlineSchematicMachine> findAllMachines() {
        return beamlineSchematicsMachineEntityRepository.findAllMachines().stream()
                .map(beamlineSchematicMapper::toSchematicMachine).collect(Collectors.toList());
    }
}