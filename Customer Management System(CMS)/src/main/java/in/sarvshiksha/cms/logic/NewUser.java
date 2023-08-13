package in.sarvshiksha.cms.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import in.sarvshiksha.cms.constant.Messages;
import in.sarvshiksha.cms.datamodel.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class NewUser extends javax.swing.JFrame {

    /**
     * Creates new form ExistingUser
     */
    private String type;
    private final CmsConfiguration appConfiguration;

    public NewUser(CmsConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        Title.setText("Welcome to the CMS");

        Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Username.setText("Username");

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        MobileNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MobileNumber.setText("Mobile number");

        mobileNumberField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobileNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumberFieldActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Password.setText("Password");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        submitCredentialButton.setText("Submit");
        submitCredentialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCredentialButtonActionPerformed(evt);
            }
        });

        alreadyAUserButton.setText("Already registered?, Click here");
        alreadyAUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alreadyAUserButtonActionPerformed(evt);
            }
        });

        supervisorRadioButton.setText("Supervisor");
        supervisorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisorRadioButtonActionPerformed(evt);
            }
        });

        agentRadioButton.setText("Agent ");
        agentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(supervisorRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agentRadioButton))
                    .addComponent(MobileNumber)
                    .addComponent(mobileNumberField)
                    .addComponent(Password)
                    .addComponent(Username)
                    .addComponent(usernameField)
                    .addComponent(passwordField)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitCredentialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alreadyAUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MobileNumber)
                .addGap(18, 18, 18)
                .addComponent(mobileNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supervisorRadioButton)
                    .addComponent(agentRadioButton))
                .addGap(4, 4, 4)
                .addComponent(submitCredentialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alreadyAUserButton)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitCredentialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCredentialButtonActionPerformed
        if (this.isUsernameValid(usernameField.getText())) {
            JOptionPane.showMessageDialog(this, Messages.INVALID_USERNAME, Messages.ERROR, JOptionPane.ERROR_MESSAGE);
            usernameField.setText("");
        } else if (mobileNumberField.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, Messages.INVALID_MOBILE_NUMBER, Messages.ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (this.isPasswordValid(passwordField.getText())) {
            JOptionPane.showMessageDialog(this, Messages.INVALID_PASSWORD, Messages.ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (supervisorRadioButton.isSelected() == false && agentRadioButton.isSelected() == false) {
            JOptionPane.showMessageDialog(this, Messages.NOTHING_SELECTED, Messages.ERROR, JOptionPane.ERROR_MESSAGE);
        } else {
            User user = new User(usernameField.getText(), mobileNumberField.getText(), passwordField.getText(), type);
            appConfiguration.setObject(user);
        }
    }//GEN-LAST:event_submitCredentialButtonActionPerformed

    private Boolean isUsernameValid(final String username) {
        Pattern numericPattern = Pattern.compile("/[0-9]/");
        Matcher isNumricPatternMatches = numericPattern.matcher(username.charAt(0) + "");
        return isNumricPatternMatches.matches();
    }

    private Boolean isMobileNumber(final String mobileNumber) {
        return mobileNumber.length() == 10;
    }

    private Boolean isPasswordValid(final String password) {
        return password.length() == 10;
    }

    private void alreadyAUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alreadyAUserButtonActionPerformed
        dispose();
        appConfiguration.getLogin().setVisible(true);
    }//GEN-LAST:event_alreadyAUserButtonActionPerformed

    private void supervisorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisorRadioButtonActionPerformed
        agentRadioButton.setSelected(false);
        type = User.TYPE.SUPERVISOR.name();
    }//GEN-LAST:event_supervisorRadioButtonActionPerformed

    private void agentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentRadioButtonActionPerformed
        supervisorRadioButton.setSelected(false);
        type = User.TYPE.AGENT.name();
    }//GEN-LAST:event_agentRadioButtonActionPerformed

    private void mobileNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileNumberFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username;
    private final javax.swing.JRadioButton agentRadioButton = new javax.swing.JRadioButton();
    private final javax.swing.JButton alreadyAUserButton = new javax.swing.JButton();
    private final javax.swing.JTextField mobileNumberField = new javax.swing.JTextField();
    private final javax.swing.JTextField passwordField = new javax.swing.JTextField();
    private final javax.swing.JButton submitCredentialButton = new javax.swing.JButton();
    private final javax.swing.JRadioButton supervisorRadioButton = new javax.swing.JRadioButton();
    private final javax.swing.JTextField usernameField = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables

}
