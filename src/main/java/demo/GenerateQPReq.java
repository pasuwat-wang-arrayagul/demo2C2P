package demo;

import org.apache.commons.lang.time.DateUtils;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateQPReq implements QPRequest {
    private String version;
    private Timestamp timeStamp;
    private String merchantID;
    private String orderPrefix;
    private String description;
    private String currency;
    private BigDecimal amount;
    private Timestamp expiry;
    private String userData1;

    public GenerateQPReq() {
        version = "2.0";
        timeStamp = new Timestamp((new Date()).getTime());
        merchantID = "JT04";
        orderPrefix = "AP";
        description = "This is test";
        currency = "THB";
        amount = BigDecimal.valueOf(15.50d);
        expiry = new Timestamp(DateUtils.addDays(new Date(),1).getTime());
        userData1 = "SO10001";
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getOrderPrefix() {
        return orderPrefix;
    }

    public void setOrderPrefix(String orderPrefix) {
        this.orderPrefix = orderPrefix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getExpiry() {
    	SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
        return df.format(expiry);
    }

    public void setExpiry(Timestamp expiry) {
        this.expiry = expiry;
    }

    public String getUserData1() {
        return userData1;
    }

    public void setUserData1(String userData1) {
        this.userData1 = userData1;
    }
}
