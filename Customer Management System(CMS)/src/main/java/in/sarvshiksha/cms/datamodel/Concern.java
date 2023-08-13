/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sarvshiksha.cms.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author nisch
 */
@Entity
public class Concern {

    public enum CRITICAL_TYPE {
        WISHMASTER_RELATED,
        TECHNICIAN_RELATED,
        CUSTOMER_CARE_RELATED,
        INSTALLATION_RELATED,
        OFFER_RELATED,
        OTHER_CONCERN;

    }

    public enum NON_CRITICAL_TYPE {
        DELIVERY_RELATED,
        RETURN_RELATED,
        PAYMENT_RELATED,
        ACCOUNT_RELATED,
        EMI_RELATED;
    }

    private int issueId;
    private String oderId;
    private String customerName;
    private BigDecimal customerMobileNumber;
    private Date issueCreationDate;
    private Date issueResolutionDate;
    private String issueType;
    private String reason;
    private String comment;

    @Id
    public int getIssueId() {
        return issueId;
    }

    public String getOderId() {
        return oderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public BigDecimal getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public Date getIssueCreationDate() {
        return issueCreationDate;
    }

    public Date getIssueResolutionDate() {
        return issueResolutionDate;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public void setOderId(String oderId) {
        this.oderId = oderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobileNumber(BigDecimal customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setIssueCreationDate(Date issueCreationDate) {
        this.issueCreationDate = issueCreationDate;
    }

    public void setIssueResolutionDate(Date issueResolutionDate) {
        this.issueResolutionDate = issueResolutionDate;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReason() {
        return reason;
    }

    public String getComment() {
        return comment;
    }

    public Concern() {
    }

    public Concern(int issueId, String oderId, String customerName, BigDecimal customerMobileNumber, Date issueCreationDate, Date issueResolutionDate, String issueType, String reason, String comment) {
        this.issueId = issueId;
        this.oderId = oderId;
        this.customerName = customerName;
        this.customerMobileNumber = customerMobileNumber;
        this.issueCreationDate = issueCreationDate;
        this.issueResolutionDate = issueResolutionDate;
        this.issueType = issueType;
        this.reason = reason;
        this.comment = comment;
    }

}
