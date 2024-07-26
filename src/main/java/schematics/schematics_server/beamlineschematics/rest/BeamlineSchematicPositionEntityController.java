package schematics.schematics_server.beamlineschematics.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicPositionService;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/beamline-schematics/positions")
@RequiredArgsConstructor
public class BeamlineSchematicPositionEntityController {

    private final BeamlineSchematicPositionService beamlineSchematicPositionService;

    @GetMapping("/referential/{referentialId}/elValidFromDay/{elValidFromDay}")
    public List<BeamlineSchematicPosition> findAllPositions(
            @PathVariable(name = "referentialId") long referentialId,
            @PathVariable(name = "elValidFromDay") Instant elValidFromDay
    ) {
        return beamlineSchematicPositionService.findAllPositions(referentialId, elValidFromDay);
    }
}
