package in.sarvshiksha.cms.datamodel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

/**
 *
 * @author nisch
 */
@Entity
@Embeddable
public class Policy {

    public enum TYPE {
        REFUND, REPLACEMENT;
    }
    private int duration;
    private String description;
    private String policyType;

    public Policy() {
    }

    public Policy(int duration, String description, String policyType) {
        this.duration = duration;
        this.description = description;
        this.policyType = policyType;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public String getPolicyType() {
        return policyType;
    }
}
