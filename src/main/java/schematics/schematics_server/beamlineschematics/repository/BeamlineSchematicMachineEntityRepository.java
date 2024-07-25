package schematics.schematics_server.beamlineschematics.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;

import java.util.List;

public interface BeamlineSchematicMachineEntityRepository extends JpaRepository<BeamlineSchematicMachineEntity, Long> {

    @Query("select machine from BeamlineSchematicMachineEntity machine where machine.schematicSupport=true")
    List<BeamlineSchematicMachineEntity> findAllMachines();
}
