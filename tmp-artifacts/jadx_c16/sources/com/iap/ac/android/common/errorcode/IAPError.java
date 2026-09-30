package com.iap.ac.android.common.errorcode;

import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.common.a.a;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class IAPError implements Serializable {
    public static final long serialVersionUID = -7742425729580836000L;
    public String errorCode;
    public String errorMessage;
    public String memo;

    public IAPError(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.memo = "";
    }

    public String toString() {
        return this.errorCode + ", errorMessage='" + this.errorMessage + "', memo='" + this.memo + "'}";
    }

    public IAPError(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.memo = str3;
    }

    public IAPError(RpcException rpcException) {
        StringBuilder sbA = a.a("");
        sbA.append(rpcException.getCode());
        this.errorCode = sbA.toString();
        this.errorMessage = rpcException.getMsg();
        this.memo = "";
    }
}
