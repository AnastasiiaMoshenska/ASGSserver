package schematics.schematics_server.beamlineschematics.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "MACHINE_ELEM_REFERENTIALS_MV")
public class BeamlineSchematicMachineEntity {
    @Id
    private Long id;
    private Long referentialId;
    private String machineCode;
    private String description;
    private Instant validFromDay;
    private Instant expiryDay;
    private Double machineLength;
    private Boolean schematicSupport;

    public BeamlineSchematicMachineEntity(){}

    public BeamlineSchematicMachineEntity(Long id, Long referentialId, String machineCode, String description, Instant validFromDay, Instant expiryDay, Double machineLength, Boolean schematicSupport) {
        this.setId(id);
        this.setReferentialId(referentialId);
        this.setMachineCode(machineCode);
        this.setDescription(description);
        this.setValidFromDay(validFromDay);
        this.setExpiryDay(expiryDay);
        this.setMachineLength(machineLength);
        this.setSchematicSupport(schematicSupport);

    }

    public boolean setSchematicSupport(boolean schematicSupport){
        return this.schematicSupport = schematicSupport;
    }

    public Double setMachineLength(Double machineLength) {
        return this.machineLength = machineLength;
    }

    public Instant setExpiryDay(Instant expiryDay) {
        return this.expiryDay = expiryDay;
    }

    public Instant setValidFromDay(Instant validFromDay) {
        return this.validFromDay = validFromDay;
    }

    public String setDescription(String description) {
        return this.description = description;
    }

    public String setMachineCode(String machineCode) {
        return this.machineCode = machineCode;
    }

    public Long setReferentialId(Long referentialId) {
        return this.referentialId = referentialId;
    }

    public Long setId(Long id) {
        return this.id = id;
    }
}
