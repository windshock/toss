package com.iap.ac.android.acs.operation.biz.region.proxy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.core.adapter.HttpProxyRequestInfo;
import com.alibaba.griver.core.adapter.HttpProxyResponseInfo;
import com.alibaba.griver.core.adapter.OperationNetworkProxy;
import com.alibaba.griver.core.adapter.OperationNetworkProxyAdapter;
import com.alibaba.griver.core.adapter.OperationNetworkProxyManager;
import com.iap.ac.android.acs.operation.biz.region.RegionManager;
import com.iap.ac.android.acs.operation.utils.MonitorUtil;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import com.iap.ac.android.rpc.http.impl.HttpUrlTransport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class HttpTransportCreatorUtils$CommonNetworkProxyHttpTransport implements AbstractHttpTransport {
    private final OperationNetworkProxy proxy;
    private final AbstractHttpTransport transporter;

    private HttpTransportCreatorUtils$CommonNetworkProxyHttpTransport(@Nullable OperationNetworkProxy operationNetworkProxy) {
        this.proxy = operationNetworkProxy;
        this.transporter = new HttpUrlTransport(false, RegionManager.getInstance().getContext());
    }

    public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
        HttpProxyResponseInfo httpProxyResponseInfoSendHttpRequest;
        RVLogger.d("GriverOperation", "performRequest");
        HttpProxyRequestInfo httpProxyRequestInfo = new HttpProxyRequestInfo();
        Map<String, String> map = httpRequest.headers;
        if (map != null && map.containsKey("regionRpcType") && "DIRECT".equals(map.get("regionRpcType"))) {
            return this.transporter.performRequest(httpRequest);
        }
        httpProxyRequestInfo.setRequestHeader(assembleHeader2Str(map));
        httpProxyRequestInfo.setProxyRequestData(httpRequest.data);
        OperationNetworkProxyAdapter operationNetworkAdapter = OperationNetworkProxyManager.getInstance().getOperationNetworkAdapter();
        if (operationNetworkAdapter != null) {
            httpProxyResponseInfoSendHttpRequest = operationNetworkAdapter.sendHttpRequest(httpProxyRequestInfo);
        } else {
            OperationNetworkProxy operationNetworkProxy = this.proxy;
            httpProxyResponseInfoSendHttpRequest = operationNetworkProxy != null ? operationNetworkProxy.sendHttpRequest(httpProxyRequestInfo) : null;
        }
        if (httpProxyResponseInfoSendHttpRequest == null) {
            HttpResponse httpResponse = new HttpResponse(500, "proxy request fail:common network proxy SPI return null", (byte[]) null, (Map) null);
            eventTrack(httpProxyRequestInfo, null);
            return httpResponse;
        }
        return new HttpResponse(200, "request success", (httpProxyResponseInfoSendHttpRequest.getProxyResponseData() == null ? "{}" : httpProxyResponseInfoSendHttpRequest.getProxyResponseData()).getBytes(), headerStr2Map(httpProxyResponseInfoSendHttpRequest.getProxyResponseHeader()));
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
        MonitorUtil.monitorProxyRequest(requestHeader, proxyRequestData, str, proxyResponseData, errorCode);
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
            RVLogger.e("GriverOperation", e.getMessage());
            return map;
        }
    }

    private String assembleHeader2Str(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("AppId", "GMP_ECO_REGION");
        return JsonUtils.toJson(map);
    }
}
