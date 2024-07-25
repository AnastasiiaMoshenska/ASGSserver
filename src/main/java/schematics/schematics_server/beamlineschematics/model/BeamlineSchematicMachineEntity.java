package schematics.schematics_server.beamlineschematics.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "MACHINE_ELEM_REFERENTIALS_MV")
public class BeamlineSchematicMachineEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int referentialId;
    private String machineCode;
    private String description;
    private Instant validFromDay;
    private Instant expiryDay;
    private Double machineLength;
    private Boolean schematicSupport;

    public BeamlineSchematicMachineEntity(){}

    public BeamlineSchematicMachineEntity(Long id, int referentialId, String machineCode, String description, Instant validFromDay, Instant expiryDay, Double machineLength, Boolean schematicSupport) {
        this.setId(id);
        this.setReferentialId(referentialId);
        this.setMachineCode(machineCode);
        this.setDescription(description);
        this.setValidFromDay(validFromDay);
        this.setExpiryDay(expiryDay);
        this.setMachineLength(machineLength);
        this.setSchematicSupport(schematicSupport);

    }

    private boolean setSchematicSupport(boolean schematicSupport){
        return this.schematicSupport = schematicSupport;
    }

    private Double setMachineLength(Double machineLength) {
        return this.machineLength = machineLength;
    }

    private Instant setExpiryDay(Instant expiryDay) {
        return this.expiryDay = expiryDay;
    }

    private Instant setValidFromDay(Instant validFromDay) {
        return this.validFromDay = validFromDay;
    }

    private String setDescription(String description) {
        return this.description = description;
    }

    private String setMachineCode(String machineCode) {
        return this.machineCode = machineCode;
    }

    private int setReferentialId(int referentialId) {
        return this.referentialId = referentialId;
    }

    private Long setId(Long id) {
        return this.id = id;
    }
}
