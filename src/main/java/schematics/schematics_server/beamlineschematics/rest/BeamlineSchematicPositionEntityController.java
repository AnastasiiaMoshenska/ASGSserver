package schematics.schematics_server.beamlineschematics.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicPosition;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicPositionService;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/beamline-schematics/positions")
@RequiredArgsConstructor
public class BeamlineSchematicPositionEntityController {

    private final BeamlineSchematicPositionService beamlineSchematicPositionService;

    @CrossOrigin(origins = "https://localhost:4200")
    @GetMapping("/referential/{referentialId}/elValidFromDay/{elValidFromDay}")
    public List<BeamlineSchematicPosition> findAllPositions(
            @PathVariable(name = "referentialId") long referentialId,
            @PathVariable(name = "elValidFromDay") Instant elValidFromDay
    ) {
        return beamlineSchematicPositionService.findAllPositions(referentialId, elValidFromDay);
    }
}
