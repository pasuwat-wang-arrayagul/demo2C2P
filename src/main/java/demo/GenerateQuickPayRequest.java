package demo;

import org.apache.commons.lang.time.DateUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GenerateQuickPayRequest implements QPRequest {
    private String version;
    private String timeStamp;
    private String merchantID;
    private String orderIdPrefix;
    private String description;
    private String currency;
    private String amount;
    private String allowMultiplePayment;
    private String maxTransaction;
    private String expiry;
    private String promotion;    
    private String paymentOption;
    private String ippInterestType;
    private String categoryId;
    private String request3DS;
    private String enableStoreCard;
    private String recurring;
    private String recurringAmount;
    private String allowAccumulate;	
    private String maxAccumulateAmount;
    private String recurringInterval;
    private String recurringCount;
    private String chargeNextDate;
    private String chargeOnDate;
    private String userData1;
    private String userData2;
    private String userData3;
    private String userData4;
    private String userData5;
    private String resultUrl1;
    private String resultUrl2;
    private String paymentExpiry;
    
    private String hashValue;

    public GenerateQuickPayRequest() {
        version = "2.1";
        //SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
        timeStamp = "20210128135341"; //df.format(new Timestamp((new Date()).getTime())); 
        merchantID = "764764000002062";
        orderIdPrefix = "AP1";
        description = "This is test";
        currency = "THB";
        allowMultiplePayment = "N";
        amount = "15.50";
        //df = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
        expiry = "29012021";//df.format(new Timestamp(DateUtils.addDays(new Date(),1).getTime()));
        userData1 = "SO10001";
        promotion = "";
        resultUrl1 = "";
        resultUrl2 = "";
        paymentOption = "C";
        ippInterestType = "";
        request3DS = "N";
        enableStoreCard = "N";
        recurring = "N";
        categoryId = "";
        recurringAmount = "";
        maxTransaction = "";
        allowAccumulate = "";
        maxAccumulateAmount = "";
        recurringInterval = "";
        recurringCount = "";
        chargeNextDate = "";
        chargeOnDate = "";
        userData2 = "";
        userData3 = "";
        userData4 = "";
        userData5 = "";
        //df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        paymentExpiry = "2021-01-29 13:53:41";//df.format(new Timestamp(DateUtils.addDays(new Date(),1).getTime())); 
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getOrderIdPrefix() {
        return orderIdPrefix;
    }

    public void setOrderIdPrefix(String orderIdPrefix) {
        this.orderIdPrefix = orderIdPrefix;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    

    public String getAllowMultiplePayment() {
		return allowMultiplePayment;
	}

	public void setAllowMultiplePayment(String allowMultiplePayment) {
		this.allowMultiplePayment = allowMultiplePayment;
	}

	public String getMaxTransaction() {
		return maxTransaction;
	}

	public void setMaxTransaction(String maxTransaction) {
		this.maxTransaction = maxTransaction;
	}

	public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getUserData1() {
        return userData1;
    }

    public void setUserData1(String userData1) {
        this.userData1 = userData1;
    }

    public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public String getResultUrl1() {
		return resultUrl1;
	}

	public void setResultUrl1(String resultUrl1) {
		this.resultUrl1 = resultUrl1;
	}

	public String getResultUrl2() {
		return resultUrl2;
	}

	public void setResultUrl2(String resultUrl2) {
		this.resultUrl2 = resultUrl2;
	}

	public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }
    
    

    public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	

	public String getIppInterestType() {
		return ippInterestType;
	}

	public void setIppInterestType(String ippInterestType) {
		this.ippInterestType = ippInterestType;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getRequest3DS() {
		return request3DS;
	}

	public void setRequest3DS(String request3ds) {
		request3DS = request3ds;
	}

	public String getEnableStoreCard() {
		return enableStoreCard;
	}

	public void setEnableStoreCard(String enableStoreCard) {
		this.enableStoreCard = enableStoreCard;
	}

	public String getRecurring() {
		return recurring;
	}

	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}

	public String getRecurringAmount() {
		return recurringAmount;
	}

	public void setRecurringAmount(String recurringAmount) {
		this.recurringAmount = recurringAmount;
	}

	public String getAllowAccumulate() {
		return allowAccumulate;
	}

	public void setAllowAccumulate(String allowAccumulate) {
		this.allowAccumulate = allowAccumulate;
	}

	public String getMaxAccumulateAmount() {
		return maxAccumulateAmount;
	}

	public void setMaxAccumulateAmount(String maxAccumulateAmount) {
		this.maxAccumulateAmount = maxAccumulateAmount;
	}

	public String getRecurringInterval() {
		return recurringInterval;
	}

	public void setRecurringInterval(String recurringInterval) {
		this.recurringInterval = recurringInterval;
	}

	public String getRecurringCount() {
		return recurringCount;
	}

	public void setRecurringCount(String recurringCount) {
		this.recurringCount = recurringCount;
	}

	public String getChargeNextDate() {
		return chargeNextDate;
	}

	public void setChargeNextDate(String chargeNextDate) {
		this.chargeNextDate = chargeNextDate;
	}

	public String getChargeOnDate() {
		return chargeOnDate;
	}

	public void setChargeOnDate(String chargeOnDate) {
		this.chargeOnDate = chargeOnDate;
	}

	public String getUserData2() {
		return userData2;
	}

	public void setUserData2(String userData2) {
		this.userData2 = userData2;
	}

	public String getUserData3() {
		return userData3;
	}

	public void setUserData3(String userData3) {
		this.userData3 = userData3;
	}

	public String getUserData4() {
		return userData4;
	}

	public void setUserData4(String userData4) {
		this.userData4 = userData4;
	}

	public String getUserData5() {
		return userData5;
	}

	public void setUserData5(String userData5) {
		this.userData5 = userData5;
	}

	public String getPaymentExpiry() {
		return paymentExpiry;
	}

	public void setPaymentExpiry(String paymentExpiry) {
		this.paymentExpiry = paymentExpiry;
	}

	/*version + timeStamp + merchantID + orderIdPrefix + description +
	currency + amount +
	allowMultiplePayment +
	maxTransaction + expiry +
	userData1 + userData2 + userData3 + userData4 + userData5 +
	promotion + categoryId +
	resultUrl1 + resultUrl2 +
	paymentOption + ippInterestType + paymentExpiry + request3DS +
	enableStoreCard + recurring +
	recurringAmount +
	allowAccumulate +
	maxAccumulateAmount +
	recurringInterval + recurringCount + chargeNextDate + chargeOnDate
	*/
	@JsonIgnore
    public String getMessage(){
        return version + timeStamp + merchantID + orderIdPrefix + description +
        		currency + amount +
        		allowMultiplePayment +
        		maxTransaction + expiry +
        		userData1 + userData2 + userData3 + userData4 + userData5 +
        		promotion + categoryId +
        		resultUrl1 + resultUrl2 +
        		paymentOption + ippInterestType + paymentExpiry + request3DS +
        		enableStoreCard + recurring +
        		recurringAmount +
        		allowAccumulate +
        		maxAccumulateAmount +
        		recurringInterval + recurringCount + chargeNextDate + chargeOnDate
                ;
    }
}
