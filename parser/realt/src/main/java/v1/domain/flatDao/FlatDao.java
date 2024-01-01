package v1.domain.flatDao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="flats")
public class FlatDao {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID,generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "generator")
    private String id;
    private int category;
    private int usd840;
    private int rub933;
    private int paymentStatus;
    private Date raiseDate;
    private Date createdAt;
    private Date updatedAt;
    private String seller;
    private String stateRegionName;
    private String stateDistrictName;
    private String townName;
    private String townDistrictName;
    private String townSubDistrictName;
    private String streetName;
    private int houseNumber;
    private String url;

    public FlatDao() {
    }

    public FlatDao(int category, int usd840, int rub933, int paymentStatus, Date raiseDate, Date createdAt, Date updatedAt, String seller, String stateRegionName, String stateDistrictName, String townName, String townDistrictName, String townSubDistrictName, String streetName, int houseNumber, String url) {
        this.category = category;
        this.usd840 = usd840;
        this.rub933 = rub933;
        this.paymentStatus = paymentStatus;
        this.raiseDate = raiseDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.seller = seller;
        this.stateRegionName = stateRegionName;
        this.stateDistrictName = stateDistrictName;
        this.townName = townName;
        this.townDistrictName = townDistrictName;
        this.townSubDistrictName = townSubDistrictName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getUsd840() {
        return usd840;
    }

    public void setUsd840(int usd840) {
        this.usd840 = usd840;
    }

    public int getRub933() {
        return rub933;
    }

    public void setRub933(int rub933) {
        this.rub933 = rub933;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getRaiseDate() {
        return raiseDate;
    }

    public void setRaiseDate(Date raiseDate) {
        this.raiseDate = raiseDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getStateRegionName() {
        return stateRegionName;
    }

    public void setStateRegionName(String stateRegionName) {
        this.stateRegionName = stateRegionName;
    }

    public String getStateDistrictName() {
        return stateDistrictName;
    }

    public void setStateDistrictName(String stateDistrictName) {
        this.stateDistrictName = stateDistrictName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getTownDistrictName() {
        return townDistrictName;
    }

    public void setTownDistrictName(String townDistrictName) {
        this.townDistrictName = townDistrictName;
    }

    public String getTownSubDistrictName() {
        return townSubDistrictName;
    }

    public void setTownSubDistrictName(String townSubDistrictName) {
        this.townSubDistrictName = townSubDistrictName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
