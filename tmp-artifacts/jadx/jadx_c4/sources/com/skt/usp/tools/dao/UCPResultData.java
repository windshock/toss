package com.skt.usp.tools.dao;

import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPResultData {
    private static UCPResultData a;
    protected APITypeCode api;
    protected Object data;
    protected APIResultCode result_code;

    public void setType(APITypeCode aPITypeCode) {
        this.api = aPITypeCode;
    }

    public APITypeCode getType() {
        return this.api;
    }

    public void setResultCode(APIResultCode aPIResultCode) {
        this.result_code = aPIResultCode;
    }

    public APIResultCode getResultCode() {
        return this.result_code;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public Object getData() {
        return this.data;
    }

    private UCPResultData() {
        this.api = null;
        this.result_code = null;
        this.data = null;
        this.api = APITypeCode.NONE;
        this.result_code = APIResultCode.ERROR_UNKNOWN;
        this.data = null;
    }

    private UCPResultData(APITypeCode aPITypeCode, APIResultCode aPIResultCode, Object obj) {
        this.api = aPITypeCode;
        this.result_code = aPIResultCode;
        this.data = obj;
    }

    public static UCPResultData getInstance() {
        if (a == null) {
            a = new UCPResultData();
        }
        return a;
    }

    public static UCPResultData getInstance(APITypeCode aPITypeCode, APIResultCode aPIResultCode, Object obj) {
        if (a == null) {
            a = new UCPResultData();
        }
        a.setType(aPITypeCode);
        a.setResultCode(aPIResultCode);
        a.setData(obj);
        return a;
    }
}
