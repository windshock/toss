package com.alibaba.ariver.engine.common.bridge;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.NativeCallNotFoundPoint;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.common.log.APILogUtils;
import com.alibaba.ariver.engine.api.point.NativeCallDispatchPoint;
import com.alibaba.ariver.engine.api.point.NativeCallResultPoint;
import com.alibaba.ariver.engine.api.proxy.RVBridgeInterceptProxy;
import com.alibaba.ariver.engine.api.proxy.RVJsStatTrackService;
import com.alibaba.ariver.engine.common.bridge.dispatch.BridgeDispatcher;
import com.alibaba.ariver.engine.common.track.JSAPIEventTrackerProxy;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeGuard;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgePermission;
import com.alibaba.ariver.kernel.api.security.AccessControlException;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.api.security.internal.DefaultAccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.permission.DefaultAccessControlManagement;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DefaultNativeBridge implements NativeBridge {
    public static final String TAG = "AriverEngine:NativeBridge";
    private boolean mEnableNetJsApiTimeoutMonitor;
    private EngineRouter mEngineRouter;
    private boolean mReleased = false;
    private final RVJsStatTrackService mJsStatTrackService = (RVJsStatTrackService) RVProxy.get(RVJsStatTrackService.class);

    protected void onRelease() {
    }

    public DefaultNativeBridge() {
        this.mEnableNetJsApiTimeoutMonitor = true;
        this.mEnableNetJsApiTimeoutMonitor = JSONUtils.getBoolean(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_net_jsapi_timeout_config"), "enable", true);
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public void bindEngineRouter(EngineRouter engineRouter) {
        this.mEngineRouter = engineRouter;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback) {
        if (this.mReleased || nativeCallContext == null) {
            RVLogger.w(TAG, "sendToNative but released!");
            return false;
        }
        return executeNative(nativeCallContext, sendToNativeCallback, true);
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback, boolean z) {
        if (this.mReleased || nativeCallContext == null) {
            RVLogger.w(TAG, "sendToNative but released!");
            return false;
        }
        return executeNative(nativeCallContext, sendToNativeCallback, z);
    }

    private boolean executeNative(final NativeCallContext nativeCallContext, @Nullable final SendToNativeCallback sendToNativeCallback, boolean z) {
        List<Render> registeredRender;
        SendToRenderCallback sendToRenderCallbackTakeCallback;
        Page activePage;
        if (nativeCallContext == null) {
            RVLogger.w(TAG, "executeNative but bridgeContext == null!");
            return false;
        }
        if (nativeCallContext.getNode() == null) {
            RVLogger.w(TAG, "executeNative with node == null!!! may cause memory leak");
        }
        nativeCallContext.getStatData().triggerTimeStamp = SystemClock.elapsedRealtime();
        if (nativeCallContext.getRender() == null) {
            if (nativeCallContext.getNode() instanceof Page) {
                nativeCallContext.setRender(nativeCallContext.getNode().getRender());
            } else if ((nativeCallContext.getNode() instanceof App) && (activePage = nativeCallContext.getNode().getActivePage()) != null) {
                nativeCallContext.setRender(activePage.getRender());
            }
        }
        EngineRouter engineRouter = this.mEngineRouter;
        if (engineRouter != null && (registeredRender = engineRouter.getRegisteredRender()) != null) {
            for (Render render : registeredRender) {
                if (render.getRenderBridge() != null && (sendToRenderCallbackTakeCallback = render.getRenderBridge().takeCallback(nativeCallContext.getId())) != null) {
                    RVLogger.d(TAG, "executeNative hit callback! " + nativeCallContext.getId());
                    sendToRenderCallbackTakeCallback.onCallBack(nativeCallContext.getParams());
                    return true;
                }
            }
        }
        if (TextUtils.isEmpty(nativeCallContext.getName())) {
            RVLogger.w(TAG, "cannot dispatch empty API!");
            return true;
        }
        BridgeResponseHelper bridgeResponseHelper = new BridgeResponseHelper(new SendToNativeCallback() { // from class: com.alibaba.ariver.engine.common.bridge.DefaultNativeBridge.1
            public void onCallback(JSONObject jSONObject, boolean z2) {
                DefaultNativeBridge.this.getCallTimeoutHandlerPoint(nativeCallContext).removeMonitor(nativeCallContext);
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_JSAPI_onCallback_ + nativeCallContext.getName());
                if (DefaultNativeBridge.this.mEnableNetJsApiTimeoutMonitor && sendToNativeCallback != null) {
                    nativeCallContext.getStatData().callbackTimeStamp = SystemClock.elapsedRealtime();
                }
                try {
                    NativeCallResultPoint nativeCallResultPoint = DefaultNativeBridge.this.getNativeCallResultPoint(nativeCallContext);
                    if (nativeCallResultPoint != null) {
                        nativeCallResultPoint.onSendBack(nativeCallContext, jSONObject);
                    }
                    ((JSAPIEventTrackerProxy) RVProxy.get(JSAPIEventTrackerProxy.class)).trackKeyJSAPIResult(nativeCallContext, jSONObject);
                    if (DefaultNativeBridge.this.mJsStatTrackService != null) {
                        DefaultNativeBridge.this.mJsStatTrackService.onSendBack(nativeCallContext);
                    }
                } catch (Exception e) {
                    RVLogger.w(DefaultNativeBridge.TAG, "nativeCallResultPoint error", e);
                }
                if (sendToNativeCallback != null) {
                    if (!DefaultNativeBridge.this.mEnableNetJsApiTimeoutMonitor) {
                        nativeCallContext.getStatData().callbackTimeStamp = SystemClock.elapsedRealtime();
                    }
                    sendToNativeCallback.onCallback(jSONObject, z2);
                }
                try {
                    String string = JSONUtils.toString(jSONObject);
                    RVLogger.d(DefaultNativeBridge.TAG, "executeNative jsapi rep name={" + nativeCallContext.getName() + "} " + nativeCallContext.getId() + " " + string + ", keepCallback: " + z2 + ", stat: " + nativeCallContext.getStatData().print());
                    if (!nativeCallContext.getFromXRiver()) {
                        APILogUtils.logApiSendBack(nativeCallContext, jSONObject, string);
                    }
                } catch (Exception e2) {
                    RVLogger.w(DefaultNativeBridge.TAG, "logApiSendBack error", e2);
                }
                RVTraceUtils.traceEndSection(RVTraceKey.RV_JSAPI_onCallback_ + nativeCallContext.getName());
            }
        });
        RVJsStatTrackService rVJsStatTrackService = this.mJsStatTrackService;
        if (rVJsStatTrackService != null) {
            rVJsStatTrackService.onCallDispatch(nativeCallContext);
        }
        if (((RVBridgeInterceptProxy) RVProxy.get(RVBridgeInterceptProxy.class)).shouldInterceptPreInvoke(nativeCallContext.getName())) {
            getNativeCallDispatchPoint(nativeCallContext).onCallDispatch(nativeCallContext);
        }
        if (!nativeCallContext.getFromXRiver()) {
            APILogUtils.logApiDispatch(nativeCallContext);
        }
        ((JSAPIEventTrackerProxy) RVProxy.get(JSAPIEventTrackerProxy.class)).trackKeyJSAPIInvoke(nativeCallContext);
        getCallTimeoutHandlerPoint(nativeCallContext).monitorTimeout(nativeCallContext, bridgeResponseHelper);
        if (((RVBridgeInterceptProxy) RVProxy.get(RVBridgeInterceptProxy.class)).preDispatch(nativeCallContext, bridgeResponseHelper)) {
            RVLogger.w(TAG, "executeNative but intercepted by RVBridgeInterceptProxy!");
            return true;
        }
        if (BridgeDispatcher.getInstance().dispatch(nativeCallContext, bridgeResponseHelper, z)) {
            return true;
        }
        RVLogger.w(TAG, "executeNative but not found Extension!" + nativeCallContext.getName());
        if (z && doCheckPermission(nativeCallContext, bridgeResponseHelper)) {
            return true;
        }
        if (ExtensionPoint.as(NativeCallNotFoundPoint.class).node(nativeCallContext.getNode()).useCache(true).create().handleNotFound(nativeCallContext, bridgeResponseHelper)) {
            getCallTimeoutHandlerPoint(nativeCallContext).monitorTimeout(nativeCallContext, bridgeResponseHelper);
            RVLogger.d(TAG, "executeNative handleNotFound intercepted");
            return true;
        }
        bridgeResponseHelper.sendNotFound();
        return false;
    }

    public boolean doCheckPermission(NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        try {
            DefaultAccessControlManagement defaultAccessControlManagement = new DefaultAccessControlManagement(nativeCallContext, bridgeResponseHelper, BridgeDispatcher.getInstance().getExtensionManager());
            DefaultAccessController defaultAccessController = new DefaultAccessController();
            defaultAccessController.setAccessControlManagement(defaultAccessControlManagement);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BridgeGuard(new BridgePermission(nativeCallContext.getName(), nativeCallContext.getName())));
            if (defaultAccessController.check(nativeCallContext.getNode(), arrayList, (AccessController.ApplyCallback) null)) {
                RVLogger.d(TAG, "executeNative check pending! " + nativeCallContext.getName());
                return true;
            }
            RVLogger.d(TAG, "executeNative check success! " + nativeCallContext.getName());
            return false;
        } catch (AccessControlException e) {
            RVLogger.d(TAG, "executeNative check failed for legacy call! " + nativeCallContext.getName());
            String message = e.getMessage();
            if (message.startsWith("N22")) {
                bridgeResponseHelper.sendNoRigHtToInvoke(message);
            } else {
                bridgeResponseHelper.sendNoRigHtToInvoke();
            }
            return true;
        }
    }

    public NativeCallResultPoint getNativeCallResultPoint(NativeCallContext nativeCallContext) {
        return ExtensionPoint.as(NativeCallResultPoint.class).node(nativeCallContext.getNode()).create();
    }

    public NativeCallDispatchPoint getNativeCallDispatchPoint(NativeCallContext nativeCallContext) {
        return ExtensionPoint.as(NativeCallDispatchPoint.class).node(nativeCallContext.getNode()).create();
    }

    public NativeCallTimeoutHandlerPoint getCallTimeoutHandlerPoint(NativeCallContext nativeCallContext) {
        return ExtensionPoint.as(NativeCallTimeoutHandlerPoint.class).node(nativeCallContext.getNode()).create();
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public final void release() {
        if (this.mReleased) {
            return;
        }
        this.mReleased = true;
        onRelease();
    }
}
