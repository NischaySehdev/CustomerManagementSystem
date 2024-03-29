/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sarvshiksha.cms.logic;

import in.sarvshiksha.cms.constant.Messages;
import static in.sarvshiksha.cms.constant.Messages.NOTHING_ENTERED;
import in.sarvshiksha.cms.datamodel.ProductDescription;
import in.sarvshiksha.cms.utilities.Utilities;
import javax.swing.JOptionPane;

/**
 *
 * @author nisch
 */
public class Agent extends javax.swing.JFrame {

    /**
     * Creates new form Agent
     */
    private final CmsConfiguration configuration;
    private final Utilities utilities;
    private ProductDescription productDescription;

    public Agent(CmsConfiguration appConfiguration) {
        this.configuration = appConfiguration;
        utilities = new Utilities();
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

        enterorderid = new javax.swing.JLabel();
        orderidfield = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        productis = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        customername = new javax.swing.JLabel();
        dateofpurchase = new javax.swing.JLabel();
        policytype = new javax.swing.JLabel();
        policyduraiton = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nonCriticalIssuesDropDown = new javax.swing.JComboBox<>();
        criticalissueDropDown = new javax.swing.JComboBox<>();
        Choosetheaction = new javax.swing.JLabel();
        type1acion = new javax.swing.JLabel();
        type2action = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        customerNameField = new javax.swing.JTextField();
        dateOfPurchaseField = new javax.swing.JTextField();
        policyTypeField = new javax.swing.JTextField();
        policyDurationField = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.orange);

        enterorderid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterorderid.setText("Enter OderId ");

        orderidfield.setToolTipText("Please enter Oderid or Phone from here");

        searchbutton.setText("Search");
        searchbutton.setToolTipText("Please search the OderId(intiates should be OD) or Phone number(Without code) from here");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        productis.setText("Product is");

        customername.setText("Customer name");

        dateofpurchase.setText("Date of Purchase");

        policytype.setText("Policy type");

        policyduraiton.setText("Policy Duration");

        nonCriticalIssuesDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an issue", "DELIVERY_RELATED", "RETURN_RELATED", "PAYMENT_RELATED", "ACCOUNT_RELATED", "EMI_RELATED" }));
        nonCriticalIssuesDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonCriticalIssuesDropDownActionPerformed(evt);
            }
        });

        criticalissueDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select_reason", "WISHMASTER_RELATED,", "TECHNICIAN_RELATED,", "CUSTOMER_CARE_RELATED,", "INSTALLATION_RELATED,", "OFFER_RELATED,", "OTHER_CONCERN;", " " }));
        criticalissueDropDown.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        criticalissueDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criticalissueDropDownActionPerformed(evt);
            }
        });

        Choosetheaction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Choosetheaction.setText("Choose the action");

        type1acion.setText("Type 1 Action");

        type2action.setText("Type 2 Action");

        productNameField.setText("Product name is ");
        productNameField.setEnabled(false);

        customerNameField.setText("Customer name is ");
        customerNameField.setEnabled(false);

        dateOfPurchaseField.setText("Date of purchase");
        dateOfPurchaseField.setEnabled(false);

        policyTypeField.setText("Policy type");
        policyTypeField.setEnabled(false);

        policyDurationField.setText("Duration");
        policyDurationField.setEnabled(false);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterorderid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orderidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customername)
                            .addComponent(dateofpurchase)
                            .addComponent(policytype)
                            .addComponent(policyduraiton))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerNameField)
                            .addComponent(productNameField)
                            .addComponent(policyTypeField)
                            .addComponent(dateOfPurchaseField)
                            .addComponent(policyDurationField))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nonCriticalIssuesDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type1acion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type2action, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criticalissueDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Choosetheaction, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(enterorderid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productis)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customername)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateofpurchase)
                    .addComponent(dateOfPurchaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policytype)
                    .addComponent(policyTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policyduraiton)
                    .addComponent(policyDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Choosetheaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type1acion)
                    .addComponent(type2action))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nonCriticalIssuesDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criticalissueDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(exit)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        if (orderidfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, NOTHING_ENTERED, Messages.ERROR, JOptionPane.ERROR_MESSAGE);
        } else {
            productDescription = (ProductDescription) configuration.getObjectFromSession(ProductDescription.class, orderidfield.getText());
            if (productDescription != null) {
                productNameField.setText(productDescription.getProductName());
                customerNameField.setText(productDescription.getCustomerName());
                dateOfPurchaseField.setText(productDescription.getDateOfPurchase().toString());
                policyTypeField.setText(productDescription.getPolicy().getDescription());
                policyDurationField.setText(String.valueOf(productDescription.getPolicy().getDuration()));
            } else {
                JOptionPane.showMessageDialog(this, Messages.WRONG_ODERID, Messages.ERROR, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void criticalissueDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criticalissueDropDownActionPerformed
        switch (criticalissueDropDown.getSelectedIndex()) {
            case 1, 2, 3, 4, 5 -> {
                String issue = criticalissueDropDown.getSelectedItem().toString();
                configuration.getIssue().init(issue, productDescription, utilities.getCrticalDropDownOptions((issue)));
            }
            default -> {
                JOptionPane.showMessageDialog(this, Messages.NOTHING_SELECTED, Messages.INFO, JOptionPane.PLAIN_MESSAGE);
            }

        }
    }//GEN-LAST:event_criticalissueDropDownActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        JOptionPane.showMessageDialog(this, Messages.LOGOUT, Messages.INFO, JOptionPane.PLAIN_MESSAGE);
        configuration.getLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void nonCriticalIssuesDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonCriticalIssuesDropDownActionPerformed
        String issue = nonCriticalIssuesDropDown.getSelectedItem().toString();
        if (issue.equals(Messages.CHOOSE_AN_OPTION)) {
            JOptionPane.showMessageDialog(this, Messages.NOTHING_SELECTED, Messages.INFO, JOptionPane.PLAIN_MESSAGE);
        } else {
            configuration.getIssue().init(issue, productDescription, utilities.getNonCrticalDropDownOptions(issue));
        }
    }//GEN-LAST:event_nonCriticalIssuesDropDownActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Choosetheaction;
    private javax.swing.JComboBox<String> criticalissueDropDown;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customername;
    private javax.swing.JTextField dateOfPurchaseField;
    private javax.swing.JLabel dateofpurchase;
    private javax.swing.JLabel enterorderid;
    private javax.swing.JButton exit;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton logoutButton;
    public javax.swing.JComboBox<String> nonCriticalIssuesDropDown;
    public javax.swing.JTextField orderidfield;
    private javax.swing.JTextField policyDurationField;
    private javax.swing.JTextField policyTypeField;
    private javax.swing.JLabel policyduraiton;
    private javax.swing.JLabel policytype;
    private javax.swing.JTextField productNameField;
    private javax.swing.JLabel productis;
    private javax.swing.JButton searchbutton;
    private javax.swing.JLabel type1acion;
    private javax.swing.JLabel type2action;
    // End of variables declaration//GEN-END:variables
}
