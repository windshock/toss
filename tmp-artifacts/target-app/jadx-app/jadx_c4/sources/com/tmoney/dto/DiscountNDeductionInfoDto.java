package com.tmoney.dto;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DiscountNDeductionInfoDto implements Serializable {

    @SerializedName("denoCd")
    private String cardType;

    @SerializedName("deductionYn")
    private String deductionYn;

    @SerializedName("discountYn")
    private String discountYn;

    @SerializedName("msg")
    private String message;

    @SerializedName("msgCd")
    private String resultCode;

    public String getCardType() {
        return this.cardType;
    }

    public String getMessage() {
        return this.message;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public boolean isDeductionYn() {
        return this.deductionYn.equals("Y");
    }

    public boolean isDiscountYn() {
        return this.discountYn.equals("Y");
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setDeductionYn(String str) {
        this.deductionYn = str;
    }

    public void setDiscountYn(String str) {
        this.discountYn = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }
}
