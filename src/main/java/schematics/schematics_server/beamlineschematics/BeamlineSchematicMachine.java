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
@JsonDeserialize(builder = BeamlineSchematicMachine.BeamlineSchematicMachineBuilder.class)
public class BeamlineSchematicMachine {
    private final Long machineElementId;
    private final Long referentialId;
    private final String machineCode;
    private final String description;
    private final Instant validFromDay;
    private final Instant expiryDay;
    private final Double machineLength;

    @JsonPOJOBuilder(withPrefix = "")
    public static class BeamlineSchematicMachineBuilder {
    }
}
