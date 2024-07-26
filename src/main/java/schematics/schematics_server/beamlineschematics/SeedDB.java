package schematics.schematics_server.beamlineschematics;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicElementEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicPositionEntity;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicElementEntityRepository;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicMachineEntityRepository;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicPositionEntityRepository;

import java.time.Instant;

@Component
public class SeedDB {
    private final BeamlineSchematicElementEntityRepository beamlineSchematicElementEntityRepository;
    public BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository;
    public BeamlineSchematicPositionEntityRepository beamlineSchematicPositionEntityRepository;

    public SeedDB(BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository, BeamlineSchematicPositionEntityRepository beamlineSchematicPositionEntityRepository, BeamlineSchematicElementEntityRepository beamlineSchematicElementEntityRepository) {
        this.beamlineSchematicMachineEntityRepository = beamlineSchematicMachineEntityRepository;
        this.beamlineSchematicPositionEntityRepository= beamlineSchematicPositionEntityRepository;
        this.beamlineSchematicElementEntityRepository = beamlineSchematicElementEntityRepository;
    }

    @PostConstruct
    public void init(){
        BeamlineSchematicMachineEntity machine = new BeamlineSchematicMachineEntity(
                1L,
                1,
                "BI",
                "BI Transfer Line",
                Instant.now(),
                Instant.parse("2027-12-31T23:59:59.00Z"),
                10.0,
                true
        );
        beamlineSchematicMachineEntityRepository.save(machine);

        BeamlineSchematicPositionEntity position = new BeamlineSchematicPositionEntity(
                1L,
                "BI position",
                1L,
                5.0,
                6.0,
                7.0,
                Instant.parse("2022-12-31T23:59:59.00Z"),
                Instant.parse("2027-12-31T23:59:59.00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position);

        BeamlineSchematicElementEntity element = new BeamlineSchematicElementEntity(
                1L,
                1L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                1,
                "test",
                "test",
                "test",
                1.0,
                2.0,
                1.0,
                1.0,
                0.0,
                0.0,
                2.0,
                0.0,
                0.0,
                3.0,
                0.0,
                0.0,
                "test"
        );

        beamlineSchematicElementEntityRepository.save(element);
    }
}