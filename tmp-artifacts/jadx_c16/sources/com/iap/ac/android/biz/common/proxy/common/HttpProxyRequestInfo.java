package com.iap.ac.android.biz.common.proxy.common;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class HttpProxyRequestInfo {
    private String proxyRequestData;
    private String requestHeader;
    private ProxyScene scene;

    public String getProxyRequestData() {
        return this.proxyRequestData;
    }

    public String getRequestHeader() {
        return this.requestHeader;
    }

    public ProxyScene getScene() {
        return this.scene;
    }

    public void setProxyRequestData(String str) {
        this.proxyRequestData = str;
    }

    public void setRequestHeader(String str) {
        this.requestHeader = str;
    }

    public void setScene(ProxyScene proxyScene) {
        this.scene = proxyScene;
    }
}
