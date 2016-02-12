package com.greenowl.callisto.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table(name = "T_PARKING_SALES_ACTIVITY")
public class ParkingSaleActivity extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Access(AccessType.PROPERTY)
    private Long id;

    @Column(name = "lot_id", nullable = false)
    private Long lotId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User activityHolder;


    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_phone_number")
    private String userPhoneNumber;

    @Column(name = "user_license_plate")
    private String userLicensePlate;

    @Column(name = "plan_id")
    private Long planId;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "plan_subscription_date")
    @Type(type = "java.sql.Timestamp")
    private Timestamp planSubscriptionDate;

    @Column(name = "plan_expiry_date")
    @Type(type = "java.sql.Timestamp")
    private Timestamp planExpiryDate;


    @Column(name = "charge_amount")
    private Double chargeAmount;

    @Column(name = "service_amount")
    private Double serviceAmount;

    @Column(name = "net_amount")
    private Double netAmount;

    @Column(name = "pp_id")
    private Long ppId;

    @Column(name = "entry_datetime")
    @Type(type = "java.sql.Timestamp")
    private Timestamp entryDatetime;

    @Column(name = "exit_datetime")
    @Type(type = "java.sql.Timestamp")
    private Timestamp exitDatetime;

    @Column(name = "parking_status")
    private String parkingStatus;

    @Column(name = "exception_flag")
    private String exceptionFlag;

    @Column(name = "invoice_id")
    private String invoiceId;
    
    @Column(name = "gate_response")
    private String gateResponse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public User getActivityHolder() {
        return activityHolder;
    }

    public void setActivityHolder(User activityHolder) {
        this.activityHolder = activityHolder;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserLicensePlate() {
        return userLicensePlate;
    }

    public void setUserLicensePlate(String userLicensePlate) {
        this.userLicensePlate = userLicensePlate;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Timestamp getPlanSubscriptionDate() {
        return planSubscriptionDate;
    }

    public void setPlanSubscriptionDate(Timestamp planSubscriptionDate) {
        this.planSubscriptionDate = planSubscriptionDate;
    }

    public Timestamp getPlanExpiryDate() {
        return planExpiryDate;
    }

    public void setPlan_ExpiryDate(Timestamp planExpiryDate) {
        this.planExpiryDate = planExpiryDate;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Double getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(Double serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Long getPpId() {
        return ppId;
    }

    public void setPpId(Long ppId) {
        this.ppId = ppId;
    }

    public Timestamp getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(Timestamp entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public Timestamp getExitDatetime() {
        return exitDatetime;
    }

    public void setExitDatetime(Timestamp exitDatetime) {
        this.exitDatetime = exitDatetime;
    }

    public String getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(String parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public String getExceptionFlag() {
        return exceptionFlag;
    }

    public void setExceptionFlag(String exceptionFlag) {
        this.exceptionFlag = exceptionFlag;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

	public String getGateResponse() {
		return gateResponse;
	}

	public void setGateResponse(String gateResponse) {
		this.gateResponse = gateResponse;
	}

    
}
