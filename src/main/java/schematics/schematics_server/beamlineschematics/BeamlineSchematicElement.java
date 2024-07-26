package schematics.schematics_server.beamlineschematics;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Builder
@Getter
@ToString
@JsonDeserialize(builder = BeamlineSchematicElement.BeamlineSchematicElementBuilder.class)
public class BeamlineSchematicElement {
    private final Long id;
    private final Long elementId;
    private final String elementLabel;
    private final String elementName;
    private final String expertName;
    private final String mainClass;
    private final Integer depthLevel;
    private final Instant validFromDay;
    private final Integer validFromDayId;
    private final Instant expiryDay;
    private final String expiryDayLabel;
    private final Integer expiryDayId;
    private final Integer elementTypeId;
    private final String typeName;
    private final String bgColor;
    private final String txtColor;
    private final Double width;
    private final Double height;
    private final Double depth;
    private final Double downstreamX;
    private final Double downstreamY;
    private final Double downstreamZ;
    private final Double midstreamX;
    private final Double midstreamY;
    private final Double midstreamZ;
    private final Double upstreamX;
    private final Double upstreamY;
    private final Double upstreamZ;
    private final String sequences;

    @JsonPOJOBuilder(withPrefix = "")
    public static class BeamlineSchematicElementBuilder {
    }
}
