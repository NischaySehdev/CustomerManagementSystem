/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sarvshiksha.cms.logic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author nisch
 */
@Entity
public class User {

    public static enum TYPE {
        AGENT, SUPERVISOR
    }
    @Id
    private String fullName;
    private String mobileNumber;
    private String password;
    private String type;

    public String getFirstName() {
        return fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public User(String fullName, String mobileNumber, String password, String type) {
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.type = type;
    }

    public User(String fullName, String password) {
        this(fullName, null, password, null);
    }

}
