package com.iap.ac.android.biz.common.proxy;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class NetworkProxy$1 implements HttpTransportFactory.Creater {
    final /* synthetic */ NetworkProxy this$0;
    final /* synthetic */ HttpTransporter val$proxy;

    public NetworkProxy$1(NetworkProxy networkProxy, HttpTransporter httpTransporter) {
        this.this$0 = networkProxy;
        this.val$proxy = httpTransporter;
    }

    public AbstractHttpTransport createHttpTransport(@NonNull Context context) throws Exception {
        return new AbstractHttpTransport() { // from class: com.iap.ac.android.biz.common.proxy.NetworkProxy$1.1
            private void handleRequest(@NonNull HttpRequest httpRequest) {
            }

            private void handleResponse(@NonNull HttpResponse httpResponse) {
                Map map = httpResponse.headers;
                if (map == null || !map.containsKey("Ac-UserId")) {
                    ACLog.d("NetworkProxy", "can not resolve user id key");
                    return;
                }
                List list = (List) map.get("Ac-UserId");
                if (list == null || list.isEmpty()) {
                    ACLog.d("NetworkProxy", "can not resolve user id from header");
                    return;
                }
                ACUserInfo aCUserInfo = new ACUserInfo();
                aCUserInfo.openId = (String) list.get(0);
                ACUserInfoManager.getInstance("ac_biz").setUserInfo(aCUserInfo);
                ACLog.d("NetworkProxy", "resolve user id: " + aCUserInfo.openId);
            }

            public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
                ACLog.d("NetworkProxy", "performRequest");
                handleRequest(httpRequest);
                HttpResponse httpResponseSendHttpRequest = NetworkProxy$1.this.val$proxy.sendHttpRequest(httpRequest);
                handleResponse(httpResponseSendHttpRequest);
                return httpResponseSendHttpRequest;
            }
        };
    }
}
