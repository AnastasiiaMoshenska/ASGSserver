package schematics.schematics_server.beamlineschematics;

import lombok.Data;

import java.time.Instant;

@Data
public class BeamlineSchematicsQueryParams {
    private Instant date;
    private float dcumStart;
    private float dcumEnd;
}
