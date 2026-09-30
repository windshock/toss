package com.iap.ac.android.biz.common.proxy.common;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import com.iap.ac.android.rpc.http.impl.HttpUrlTransport;
import com.lguplus.usimlib.TsmResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class HttpTransportCreatorUtils$CommonNetworkProxyHttpTransport implements AbstractHttpTransport {
    private final NetworkProxy proxy;
    private final ProxyScene proxyScene;
    private AbstractHttpTransport transporter;

    private String assembleHeader2Str(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.proxyScene == ProxyScene.PROXY_SCENE_MINI_PROGRAM) {
            map.put("AppId", "GMP_ECO_REGION");
        }
        return JsonUtils.toJson(map);
    }

    private Map<String, List<String>> headerStr2Map(String str) {
        HashMap map = new HashMap();
        try {
            Map map2 = (Map) JsonUtils.fromJson(str, Map.class);
            if (map2 != null) {
                for (Object obj : map2.keySet()) {
                    if (obj != null || (obj instanceof String)) {
                        List arrayList = (List) map.get(obj);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(obj.toString(), arrayList);
                        }
                        Object obj2 = map2.get(obj);
                        if (obj2 instanceof String) {
                            arrayList.add(obj2.toString());
                        } else if (obj2 instanceof List) {
                            arrayList.addAll((List) obj2);
                        }
                    }
                }
            }
            return map;
        } catch (Exception e) {
            ACLog.e("IAPConnect", e.getMessage());
            return map;
        }
    }

    public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
        HttpResponse httpResponse;
        ACLog.d("IAPConnect", "performRequest");
        Map map = httpRequest.headers;
        if (map == null || !"PROXY".equals(map.get("ACRpcType"))) {
            return this.transporter.performRequest(httpRequest);
        }
        HttpProxyRequestInfo httpProxyRequestInfo = new HttpProxyRequestInfo();
        httpProxyRequestInfo.setRequestHeader(assembleHeader2Str(httpRequest.headers));
        httpProxyRequestInfo.setProxyRequestData(httpRequest.data);
        httpProxyRequestInfo.setScene(this.proxyScene);
        HttpProxyResponseInfo httpProxyResponseInfoSendHttpRequest = this.proxy.sendHttpRequest(httpProxyRequestInfo);
        if (httpProxyResponseInfoSendHttpRequest == null) {
            httpResponse = new HttpResponse(500, "proxy request fail:common network proxy SPI return null", (byte[]) null, (Map) null);
        } else {
            httpResponse = new HttpResponse(200, "request success", (httpProxyResponseInfoSendHttpRequest.getProxyResponseData() == null ? "{}" : httpProxyResponseInfoSendHttpRequest.getProxyResponseData()).toString().getBytes(), headerStr2Map(httpProxyResponseInfoSendHttpRequest.getProxyResponseHeader()));
        }
        eventTrack(httpProxyRequestInfo, httpProxyResponseInfoSendHttpRequest);
        return httpResponse;
    }

    private HttpTransportCreatorUtils$CommonNetworkProxyHttpTransport(@NonNull NetworkProxy networkProxy, ProxyScene proxyScene) {
        this.proxy = networkProxy;
        this.proxyScene = proxyScene;
        this.transporter = new HttpUrlTransport(false, ACManager.getInstance().getContext());
    }

    private void eventTrack(HttpProxyRequestInfo httpProxyRequestInfo, HttpProxyResponseInfo httpProxyResponseInfo) {
        String str;
        String proxyRequestData;
        String requestHeader;
        String errorCode;
        String proxyResponseData;
        str = "";
        if (httpProxyRequestInfo == null) {
            proxyRequestData = "";
            requestHeader = proxyRequestData;
        } else {
            requestHeader = httpProxyRequestInfo.getRequestHeader() == null ? "" : httpProxyRequestInfo.getRequestHeader();
            proxyRequestData = httpProxyRequestInfo.getProxyRequestData() == null ? "" : httpProxyRequestInfo.getProxyRequestData();
        }
        if (httpProxyResponseInfo == null) {
            errorCode = "";
            proxyResponseData = errorCode;
        } else {
            String proxyResponseHeader = httpProxyResponseInfo.getProxyResponseHeader() == null ? "" : httpProxyResponseInfo.getProxyResponseHeader();
            proxyResponseData = httpProxyResponseInfo.getProxyResponseData() == null ? "" : httpProxyResponseInfo.getProxyResponseData();
            errorCode = httpProxyResponseInfo.getErrorCode() != null ? httpProxyResponseInfo.getErrorCode() : "";
            str = proxyResponseHeader;
        }
        ACLogEvent.newLogger("iapconnect_center", "ac_region_rpc_spi_call_record").addParams("proxyRequestHeader", requestHeader).addParams("proxyRequestData", proxyRequestData).addParams("proxyResponseHeader", str).addParams("proxyResponseData", proxyResponseData).addParams(TsmResponse.errorCode, errorCode).event();
    }
}
