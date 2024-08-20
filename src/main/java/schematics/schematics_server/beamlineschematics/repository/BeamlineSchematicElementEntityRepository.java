package schematics.schematics_server.beamlineschematics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicElementEntity;

import java.time.Instant;
import java.util.List;

public interface BeamlineSchematicElementEntityRepository extends JpaRepository<BeamlineSchematicElementEntity, Long> {

    @Query("select element from BeamlineSchematicElementEntity element where element.elementTypeId = :id " +
            "and element.elementId = :elementId and element.upstreamX >= :dcumStart and element.downstreamX <= :dcumEnd and element.validFromDay <= :timeValue and element.expiryDay >= :timeValue ")
    List<BeamlineSchematicElementEntity> findAllElements(@Param("id") Long id, @Param("elementId") Long elementId, @Param("timeValue") Instant timeValue, @Param("dcumStart") Float dcumStart, @Param("dcumEnd") Float dcumEnd);
}