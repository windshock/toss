package io.invertase.googlemobileads.common;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.invertase.googlemobileads.common.ReactNativeEventEmitter$;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BugsnagStateModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReactNativeEventEmitter {
    private static ReactNativeEventEmitter onWarmupCompleted = new ReactNativeEventEmitter();
    private ReactContext asInterface;
    private int onExtraCallback;
    private final List<BugsnagStateModule> IAuthTabCallbackStub = new ArrayList();
    private final Handler onNavigationEvent = new Handler(Looper.getMainLooper());
    private final HashMap<String, Integer> onExtraCallbackWithResult = new HashMap<>();
    private Boolean IAuthTabCallback = Boolean.FALSE;

    public static ReactNativeEventEmitter onWarmupCompleted() {
        return onWarmupCompleted;
    }

    public void IAuthTabCallback(final ReactContext reactContext) {
        this.onNavigationEvent.post(new Runnable() { // from class: io.invertase.googlemobileads.common.ReactNativeEventEmitter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onExtraCallbackWithResult(reactContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void onExtraCallbackWithResult(ReactContext reactContext) {
        this.asInterface = reactContext;
        onExtraCallback();
    }

    public void onNavigationEvent(Boolean bool) {
        this.onNavigationEvent.post(new ReactNativeEventEmitter$.ExternalSyntheticLambda1(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void onExtraCallback(Boolean bool) {
        this.IAuthTabCallback = bool;
        onExtraCallback();
    }

    public void onNavigationEvent(final BugsnagStateModule bugsnagStateModule) {
        this.onNavigationEvent.post(new Runnable() { // from class: io.invertase.googlemobileads.common.ReactNativeEventEmitter$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onWarmupCompleted(bugsnagStateModule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void onWarmupCompleted(BugsnagStateModule bugsnagStateModule) {
        synchronized (this.onExtraCallbackWithResult) {
            if (!this.onExtraCallbackWithResult.containsKey(bugsnagStateModule.onExtraCallback()) || !IAuthTabCallback(bugsnagStateModule)) {
                this.IAuthTabCallbackStub.add(bugsnagStateModule);
            }
        }
    }

    public void onNavigationEvent(String str) {
        synchronized (this.onExtraCallbackWithResult) {
            this.onExtraCallback++;
            if (!this.onExtraCallbackWithResult.containsKey(str)) {
                this.onExtraCallbackWithResult.put(str, 1);
            } else {
                this.onExtraCallbackWithResult.put(str, Integer.valueOf(this.onExtraCallbackWithResult.get(str).intValue() + 1));
            }
        }
        this.onNavigationEvent.post(new ReactNativeEventEmitter$.ExternalSyntheticLambda0(this));
    }

    public void onNavigationEvent(String str, Boolean bool) {
        synchronized (this.onExtraCallbackWithResult) {
            if (this.onExtraCallbackWithResult.containsKey(str)) {
                int iIntValue = this.onExtraCallbackWithResult.get(str).intValue();
                if (iIntValue <= 1 || bool.booleanValue()) {
                    this.onExtraCallbackWithResult.remove(str);
                } else {
                    this.onExtraCallbackWithResult.put(str, Integer.valueOf(iIntValue - 1));
                }
                int i = this.onExtraCallback;
                if (!bool.booleanValue()) {
                    iIntValue = 1;
                }
                this.onExtraCallback = i - iIntValue;
            }
        }
    }

    public WritableMap onExtraCallbackWithResult() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", this.onExtraCallback);
        writableMapCreateMap.putInt("queued", this.IAuthTabCallbackStub.size());
        synchronized (this.onExtraCallbackWithResult) {
            for (Map.Entry<String, Integer> entry : this.onExtraCallbackWithResult.entrySet()) {
                writableMapCreateMap2.putInt(entry.getKey(), entry.getValue().intValue());
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback() {
        synchronized (this.onExtraCallbackWithResult) {
            Iterator it = new ArrayList(this.IAuthTabCallbackStub).iterator();
            while (it.hasNext()) {
                BugsnagStateModule bugsnagStateModule = (BugsnagStateModule) it.next();
                if (this.onExtraCallbackWithResult.containsKey(bugsnagStateModule.onExtraCallback())) {
                    this.IAuthTabCallbackStub.remove(bugsnagStateModule);
                    onNavigationEvent(bugsnagStateModule);
                }
            }
        }
    }

    private boolean IAuthTabCallback(BugsnagStateModule bugsnagStateModule) {
        ReactContext reactContext;
        if (!this.IAuthTabCallback.booleanValue() || (reactContext = this.asInterface) == null || !reactContext.hasActiveCatalystInstance()) {
            return false;
        }
        try {
            this.asInterface.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("rnapp_" + bugsnagStateModule.onExtraCallback(), bugsnagStateModule.onNavigationEvent());
            return true;
        } catch (Exception e) {
            Log.wtf("RN_EVENT_EMITTER", "Error sending Event " + bugsnagStateModule.onExtraCallback(), e);
            return false;
        }
    }
}
