package schematics.schematics_server.beamlineschematics.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.mapper.BeamlineSchematicMapper;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicPositionEntityRepository;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BeamlineSchematicPositionService {

    private final BeamlineSchematicPositionEntityRepository beamlineSchematicPositionEntityRepository;
    private final BeamlineSchematicMapper beamlineSchematicMapper;

    public List<BeamlineSchematicPosition> findAllPositions(Long referentialId, Instant elValidFromDay) {
        return beamlineSchematicPositionEntityRepository.findAllPositions(referentialId, elValidFromDay).stream()
                .map(beamlineSchematicMapper::toSchematicPosition).collect(java.util.stream.Collectors.toList());
    }
}
