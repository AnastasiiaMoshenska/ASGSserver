package schematics.schematics_server.beamlineschematics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicPositionEntity;

import java.time.Instant;
import java.util.List;

public interface BeamlineSchematicPositionEntityRepository extends JpaRepository<BeamlineSchematicPositionEntity, Long> {

    @Query("select position from BeamlineSchematicPositionEntity position where position.referentialId = :referentialId " +
            "and position.validFromDay <= :timeValue and position.expiryDay >= :timeValue ")
    List<BeamlineSchematicPositionEntity> findAllPositions(@Param("referentialId") Long referentialId, @Param("timeValue") Instant timeValue);
}