package com.alibaba.exthub.event;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.exthub.base.ExtHubEventContext;
import com.alibaba.exthub.base.ExtHubPage;
import com.alibaba.exthub.common.ExtHubLogger;
import com.alibaba.exthub.event.listener.ExtHubEventListener;
import com.alibaba.exthub.event.listener.ExtHubEventWithBizTypeListener;
import com.alibaba.fastjson.JSONObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubEventUtil {
    public static void sendEvent(Page page, ExtHubEventContext extHubEventContext, String str, @Nullable JSONObject jSONObject, SendToRenderCallback sendToRenderCallback) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (page == null) {
            ExtHubLogger.d("sendEvent page is null");
            return;
        }
        sendEvent(page, str, jSONObject, sendToRenderCallback);
        if (extHubEventContext == null || !(page instanceof ExtHubPage)) {
            return;
        }
        extHubEventContext.sendEvent(str, jSONObject);
    }

    public static void sendEvent(Page page, String str, @Nullable JSONObject jSONObject, SendToRenderCallback sendToRenderCallback) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (page == null) {
            ExtHubLogger.d("sendEvent page is null");
            return;
        }
        if (page instanceof ExtHubPage) {
            ExtHubLogger.d("send Native Event: " + str);
            sendNativeEvent(str, jSONObject);
            return;
        }
        ExtHubLogger.d("send Render Event: " + str);
        Render render = page.getRender();
        if (render == null || render.getRenderBridge() == null) {
            ExtHubLogger.d("send Render Event null");
        } else {
            render.getRenderBridge().sendToRender(RenderCallContext.newBuilder(page.getRender()).type(RenderCallContext.TYPE_CALL).action(str).param(jSONObject).build(), sendToRenderCallback, true);
        }
    }

    public static void sendNativeEvent(String str, @Nullable JSONObject jSONObject) {
        List<ExtHubEventWithBizTypeListener> list;
        List<ExtHubEventListener> list2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Map<String, List<ExtHubEventListener>>> activityEventMap = ExtHubEventManager.getInstance().getActivityEventMap();
        if (activityEventMap != null) {
            for (Map<String, List<ExtHubEventListener>> map : activityEventMap.values()) {
                if (map != null && (list2 = map.get(str)) != null) {
                    Iterator<ExtHubEventListener> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, jSONObject);
                    }
                }
            }
        }
        Map<String, Map<String, List<ExtHubEventWithBizTypeListener>>> bizTypeEventMap = ExtHubEventManager.getInstance().getBizTypeEventMap();
        if (bizTypeEventMap != null) {
            for (String str2 : bizTypeEventMap.keySet()) {
                Map<String, List<ExtHubEventWithBizTypeListener>> map2 = bizTypeEventMap.get(str2);
                if (map2 != null && (list = map2.get(str)) != null) {
                    Iterator<ExtHubEventWithBizTypeListener> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEvent(str2, str, jSONObject);
                    }
                }
            }
        }
    }
}
