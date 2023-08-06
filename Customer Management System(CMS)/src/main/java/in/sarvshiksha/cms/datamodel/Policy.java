package in.sarvshiksha.cms.datamodel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author nisch
 */
@Entity
public class Policy {

    public enum TYPE {
        REFUND, REPLACEMENT;
    }
    private final int duration;
    private final String description;
    @Id
    private final String policyType;

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
