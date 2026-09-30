package com.iap.ac.android.biz.common.proxy.common;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class HttpProxyResponseInfo {
    private String errorCode;
    private String errorMessage;
    private boolean isSuccess;
    private String proxyResponseData;
    private String proxyResponseHeader;

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getProxyResponseData() {
        return this.proxyResponseData;
    }

    public String getProxyResponseHeader() {
        return this.proxyResponseHeader;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setProxyResponseData(String str) {
        this.proxyResponseData = str;
    }

    public void setProxyResponseHeader(String str) {
        this.proxyResponseHeader = str;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }
}
