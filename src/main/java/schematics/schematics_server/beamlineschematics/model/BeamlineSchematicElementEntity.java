package schematics.schematics_server.beamlineschematics.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "ELEMENTS")
public class BeamlineSchematicElementEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long elementId;
    private String elementLabel;
    private String elementName;
    private String expertName;
    private String mainClass;
    private Integer depthLevel;
    private Instant validFromDay;
    private Integer validFromDayId;
    private Instant expiryDay;
    private String expiryDayLabel;
    private Integer expiryDayId;
    private Long elementTypeId;
    private String typeName;
    private String bgColor;
    private String txtColor;
    private Double width;
    private Double height;
    private Double depth;
    private Double downstreamX;
    private Double downstreamY;
    private Double downstreamZ;
    private Double midstreamX;
    private Double midstreamY;
    private Double midstreamZ;
    private Double upstreamX;
    private Double upstreamY;
    private Double upstreamZ;
    private String sequences;


    public BeamlineSchematicElementEntity() {
    }

    public BeamlineSchematicElementEntity(Long id, Long elementId, String elementLabel, String elementName, String expertName, Integer depthLevel, String mainClass, Instant validFromDay, Integer validFromDayId, Instant expiryDay, String expiryDayLabel, Integer expiryDayId, Long elementTypeId, String typeName, String bgColor, String txtColor, Double width, Double height, Double depth, Double downstreamX, Double downstreamY, Double downstreamZ, Double midstreamX, Double midstreamY, Double midstreamZ, Double upstreamX, Double upstreamY, Double upstreamZ, String sequences) {
        this.setId(id);
        this.setElementId(elementId);
        this.setElementLabel(elementLabel);
        this.setElementName(elementName);
        this.setExpertName(expertName);
        this.setMainClass(mainClass);
        this.setDepthLevel(depthLevel);
        this.setValidFromDay(validFromDay);
        this.setValidFromDayId(validFromDayId);
        this.setExpiryDay(expiryDay);
        this.setExpiryDayLabel(expiryDayLabel);
        this.setExpiryDayId(expiryDayId);
        this.setElementTypeId(elementTypeId);
        this.setTypeName(typeName);
        this.setBgColor(bgColor);
        this.setTxtColor(txtColor);
        this.setWidth(width);
        this.setHeight(height);
        this.setDepth(depth);
        this.setDownstreamX(downstreamX);
        this.setDownstreamY(downstreamY);
        this.setDownstreamZ(downstreamZ);
        this.setMidstreamX(midstreamX);
        this.setMidstreamY(midstreamY);
        this.setMidstreamZ(midstreamZ);
        this.setUpstreamX(upstreamX);
        this.setUpstreamY(upstreamY);
        this.setUpstreamZ(upstreamZ);
        this.setSequences(sequences);
    }

    public Long setId(Long id) {
        return this.id = id;
    }

    public Long setElementId(Long elementId) {
        return this.elementId = elementId;
    }

    public String setElementLabel(String elementLabel) {
        return this.elementLabel = elementLabel;
    }

    public String setElementName(String elementName) {
        return this.elementName = elementName;
    }

    public String setExpertName(String expertName) {
        return this.expertName = expertName;
    }

    public String setMainClass(String mainClass) {
        return this.mainClass = mainClass;
    }

    public Integer setDepthLevel(Integer depthLevel) {
        return this.depthLevel = depthLevel;
    }

    public Instant setValidFromDay(Instant validFromDay) {
        return this.validFromDay = validFromDay;
    }

    public Integer setValidFromDayId(Integer validFromDayId) {
        return this.validFromDayId = validFromDayId;
    }

    public Instant setExpiryDay(Instant expiryDay) {
        return this.expiryDay = expiryDay;
    }

    public String setExpiryDayLabel(String expiryDayLabel) {
        return this.expiryDayLabel = expiryDayLabel;
    }

    public Integer setExpiryDayId(Integer expiryDayId) {
        return this.expiryDayId = expiryDayId;
    }

    public Long setElementTypeId(Long elementTypeId) {
        return this.elementTypeId = elementTypeId;
    }

    public String setTypeName(String typeName) {
        return this.typeName = typeName;
    }

    public String setBgColor(String bgColor) {
        return this.bgColor = bgColor;
    }

    public String setTxtColor(String txtColor) {
        return this.txtColor = txtColor;
    }

    public Double setWidth(Double width) {
        return this.width = width;
    }

    public Double setHeight(Double height) {
        return this.height = height;
    }

    public Double setDepth(Double depth) {
        return this.depth = depth;
    }

    public Double setDownstreamX(Double downstreamX) {
        return this.downstreamX = downstreamX;
    }

    public Double setDownstreamY(Double downstreamY) {
        return this.downstreamY = downstreamY;
    }

    public Double setDownstreamZ(Double downstreamZ) {
        return this.downstreamZ = downstreamZ;
    }

    public Double setMidstreamY(Double midstreamY) {
        return this.midstreamY = midstreamY;
    }

    public Double setMidstreamX(Double midstreamX) {
        return this.midstreamX = midstreamX;
    }

    public Double setMidstreamZ(Double midstreamZ) {
        return this.midstreamZ = midstreamZ;
    }

    public Double setUpstreamX(Double upstreamX) {
        return this.upstreamX = upstreamX;
    }

    public Double setUpstreamY(Double upstreamY) {
        return this.upstreamY = upstreamY;
    }

    public Double setUpstreamZ(Double upstreamZ) {
        return this.upstreamZ = upstreamZ;
    }

    public String setSequences(String sequences) {
        return this.sequences = sequences;
    }
}
