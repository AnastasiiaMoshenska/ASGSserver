package schematics.schematics_server.beamlineschematics.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "SCHEMATIC_BEAM_LINE_CANDIDATE_ELEMENTS_V")
public class BeamlineSchematicPositionEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String elementName;
    private Long referentialId;
    private Double upstreamX;
    private Double midstreamX;
    private Double downstreamX;
    private Instant validFromDay;
    private Instant expiryDay;

    public BeamlineSchematicPositionEntity(Long id, String elementName, Long referentialId, Double upstreamX, Double midstreamX, Double downstreamX, Instant validFromDay, Instant expiryDay) {
        this.setId(id);
        this.setElementName(elementName);
        this.setReferentialId(referentialId);
        this.setUpstreamX(upstreamX);
        this.setMidstreamX(midstreamX);
        this.setDownstreamX(downstreamX);
        this.setValidFromDay(validFromDay);
        this.setExpiryDay(expiryDay);
    }

    public BeamlineSchematicPositionEntity() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public void setReferentialId(Long referentialId) {
        this.referentialId = referentialId;
    }

    public void setUpstreamX(Double upstreamX) {
        this.upstreamX = upstreamX;
    }

    public void setMidstreamX(Double midstreamX) {
        this.midstreamX = midstreamX;
    }

    public void setDownstreamX(Double downstreamX) {
        this.downstreamX = downstreamX;
    }

    public void setValidFromDay(Instant validFromDay) {
        this.validFromDay = validFromDay;
    }

    public void setExpiryDay(Instant expiryDay) {
        this.expiryDay = expiryDay;
    }
}
