package schematics.schematics_server.beamlineschematics.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicElement;
import schematics.schematics_server.beamlineschematics.mapper.BeamlineSchematicMapper;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicElementEntityRepository;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BeamlineSchematicElementService {

    private final BeamlineSchematicElementEntityRepository beamlineSchematicElementEntityRepository;
    private final BeamlineSchematicMapper beamlineSchematicMapper;

    public List<BeamlineSchematicElement> findAllElements(Long id, Long elementId, Instant date, Float dcumStart, Float dcumEnd) {
        return beamlineSchematicElementEntityRepository.findAllElements(id, elementId, date, dcumStart, dcumEnd).stream()
                .map(beamlineSchematicMapper::toSchematicElement).collect(java.util.stream.Collectors.toList());
    }

}
