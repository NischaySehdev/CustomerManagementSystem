/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sarvshiksha.cms.datamodel;

import jakarta.persistence.Id;

/**
 *
 * @author nisch
 */

public class Credentials {
    
    @Id
    private final String username;
    private final String password;
    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
