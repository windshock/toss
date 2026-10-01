package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.googlemobileads.common.RCTConvert;
import io.invertase.googlemobileads.common.ReactNativeEvent;
import io.invertase.googlemobileads.common.ReactNativeEventEmitter;
import io.invertase.googlemobileads.common.ReactNativeJSON;
import io.invertase.googlemobileads.common.ReactNativeMeta;
import io.invertase.googlemobileads.common.ReactNativeModule;
import io.invertase.googlemobileads.common.ReactNativePreferences;
import o.BugsnagStateModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReactNativeAppModule extends ReactNativeModule {
    static final String NAME = "RNAppModule";

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
    }

    ReactNativeAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, NAME);
    }

    @Override // io.invertase.googlemobileads.common.ReactNativeModule
    public void initialize() {
        super.initialize();
        ReactNativeEventEmitter.onWarmupCompleted().IAuthTabCallback(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        promise.resolve(readableMap);
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        ReactNativeEventEmitter.onWarmupCompleted().onNavigationEvent(bool);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(ReactNativeEventEmitter.onWarmupCompleted().onExtraCallbackWithResult());
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        ReactNativeEventEmitter.onWarmupCompleted().onNavigationEvent((BugsnagStateModule) new ReactNativeEvent(str, RCTConvert.IAuthTabCallback(readableMap)));
        promise.resolve(RCTConvert.IAuthTabCallback(readableMap));
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        ReactNativeEventEmitter.onWarmupCompleted().onNavigationEvent(str);
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        ReactNativeEventEmitter.onWarmupCompleted().onNavigationEvent(str, bool);
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(ReactNativeMeta.onExtraCallbackWithResult().onWarmupCompleted());
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(ReactNativeJSON.onWarmupCompleted().IAuthTabCallback());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z, Promise promise) {
        ReactNativePreferences.onWarmupCompleted().onExtraCallbackWithResult(str, z);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        ReactNativePreferences.onWarmupCompleted().onExtraCallback(str, str2);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(ReactNativePreferences.onWarmupCompleted().onExtraCallbackWithResult());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        ReactNativePreferences.onWarmupCompleted().IAuthTabCallback();
        promise.resolve((Object) null);
    }
}
