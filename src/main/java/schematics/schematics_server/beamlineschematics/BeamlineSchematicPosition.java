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
@JsonDeserialize(builder = BeamlineSchematicPosition.BeamlineSchematicPositionBuilder.class)
public class BeamlineSchematicPosition {
    private final Long elementId;
    private final String elementName;
    private final Long referentialId;
    private final Double upstreamX;
    private final Double midstreamX;
    private final Double downstreamX;
    private final Instant elementValidFromDay;
    private final Instant elementExpiryDay;

    @JsonPOJOBuilder(withPrefix = "")
    public static class BeamlineSchematicPositionBuilder {
    }
}
