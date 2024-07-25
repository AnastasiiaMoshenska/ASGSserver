package schematics.schematics_server.beamlineschematics;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicMachineEntityRepository;

import java.time.Instant;

@Component
public class SeedDB {
    public BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository;

    public SeedDB(BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository) {
        this.beamlineSchematicMachineEntityRepository = beamlineSchematicMachineEntityRepository;
    }

    @PostConstruct
    public void init(){
        BeamlineSchematicMachineEntity entity = new BeamlineSchematicMachineEntity(
                1L,
                1,
                "BI",
                "BI Transfer Line",
                Instant.now(),
                Instant.parse("2027-12-31T23:59:59.00Z"),
                10.0,
                true
        );
        beamlineSchematicMachineEntityRepository.save(entity);
    }
}