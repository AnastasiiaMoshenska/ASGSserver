package schematics.schematics_server.beamlineschematics.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import schematics.schematics_server.beamlineschematics.BeamlineSchematicElement;
import schematics.schematics_server.beamlineschematics.service.BeamlineSchematicElementService;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/beamline-schematics/elements")
@RequiredArgsConstructor
public class BeamlineSchematicElementController {

    private final BeamlineSchematicElementService beamlineSchematicElementService;

    @GetMapping("/machine/{machineElemId}/referential/{referentialId}")
    public List<BeamlineSchematicElement> getAllElements(
            @PathVariable(name = "machineElemId") long id,
            @PathVariable(name = "referentialId") long elementId,
            @RequestParam(name = "date") Instant date,
            @RequestParam(name = "dcumStart") float dcumStart,
            @RequestParam(name = "dcumEnd") float dcumEnd
    ) {
        return beamlineSchematicElementService.findAllElements(id, elementId, date, dcumStart, dcumEnd);
    }
}