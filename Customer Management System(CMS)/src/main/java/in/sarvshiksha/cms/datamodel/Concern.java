/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sarvshiksha.cms.logic;

import jakarta.persistence.Entity;
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

    private final int issueId;
    private final String oderId;
    private final String customerName;
    private final BigDecimal customerMobileNumber;
    private final Date issueCreationDate;
    private final Date issueResolutionDate;
    private final String issueType;
    private final String reason;
    private final String comment;

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

    public String getReason() {
        return reason;
    }

    public String getComment() {
        return comment;
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
