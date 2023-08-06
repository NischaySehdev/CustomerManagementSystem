/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sarvshiksha.cms.utilities;

import in.sarvshiksha.cms.datamodel.ProductDescription;
import in.sarvshiksha.cms.logic.Concern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nisch
 */
public class Utilities {

    private ProductDescription productDescription;
    private final Map<String, List<String>> dropDownCriticalIssueMap, dropDownNonCriticalIssueMap;

    public Utilities() {
        dropDownCriticalIssueMap = new HashMap<>();
        dropDownNonCriticalIssueMap = new HashMap<>();
        init();
    }

    private void init() {
        initializeCriticalIssues();
        initializeNonCriticalIssues();
    }

    private void initializeCriticalIssues() {
        dropDownCriticalIssueMap.put(Concern.CRITICAL_TYPE.WISHMASTER_RELATED.name(), List.of("Wishmaster information",
                "Wishmaster took extra money",
                "Wishmaster behaviour issue"));
        dropDownCriticalIssueMap.put(Concern.CRITICAL_TYPE.TECHNICIAN_RELATED.name(), List.of("Techincian_date_breached",
                "Technician_alingment",
                "Technician_behaviour_issue",
                "Techinician_didn't_check_the_product_appropraitely"));
        dropDownCriticalIssueMap.put(Concern.CRITICAL_TYPE.CUSTOMER_CARE_RELATED.name(), List.of("Behaviour_issue",
                "Other_issue"));
        dropDownCriticalIssueMap.put(Concern.CRITICAL_TYPE.INSTALLATION_RELATED.name(), List.of("Installation_Related_info",
                "Installation_delay_issue",
                "Installation_alingment",
                "Installation_Behaviour_issue"));
        dropDownCriticalIssueMap.put(Concern.CRITICAL_TYPE.OFFER_RELATED.name(), new ArrayList<>());
    }

    private void initializeNonCriticalIssues() {
        dropDownNonCriticalIssueMap.put(Concern.NON_CRITICAL_TYPE.DELIVERY_RELATED.name(), List.of("Delivery date breached"));
        dropDownNonCriticalIssueMap.put(Concern.NON_CRITICAL_TYPE.RETURN_RELATED.name(), List.of("Accessory_defective",
                "Accessory_missing",
                "Used_Product",
                "Damaged_Product",
                "Product_missing",
                "Defective_Issue",
                "Product_different(Different Model)",
                "Product_different(Different Brand)",
                "Product_different(Different color)",
                "Product_different(Totally Different)",
                "Multiple_Reason"));
        dropDownNonCriticalIssueMap.put(Concern.NON_CRITICAL_TYPE.PAYMENT_RELATED.name(), List.of("Payment_is_debited_but_oder_not_confirmed",
                "Wrong_amount_debited",
                "Amount_not_credited"));
        dropDownNonCriticalIssueMap.put(Concern.NON_CRITICAL_TYPE.ACCOUNT_RELATED.name(), List.of("Payment_is_debited_but_oder_not_confirmed",
                "Wrong_amount_debited",
                "Amount_not_credited"));
        dropDownNonCriticalIssueMap.put(Concern.NON_CRITICAL_TYPE.EMI_RELATED.name(), List.of("EMI_related_info",
                "Wrong_EMI_debited",
                "Other_issue"));
    }

    public List<String> getCrticalDropDownOptions(String issue) {
        return dropDownCriticalIssueMap.get(issue);
    }

    public List<String> getNonCrticalDropDownOptions(String issue) {
        return dropDownNonCriticalIssueMap.get(issue);
    }

    public ProductDescription getProductDetails() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

}
