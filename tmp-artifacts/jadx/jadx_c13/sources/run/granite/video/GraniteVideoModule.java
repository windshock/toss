package run.granite.video;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getSignForPKCS7AppCertAndVIDR;
import o.getSignForPKCS7NoContents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteVideoModule extends ReactContextBaseJavaModule {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final String NAME = "GraniteVideoModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraniteVideoModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void clearCache(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            getSignForPKCS7NoContents getsignforpkcs7nocontentsOnNavigationEvent = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult.onNavigationEvent();
            if (getsignforpkcs7nocontentsOnNavigationEvent != null) {
                getsignforpkcs7nocontentsOnNavigationEvent.onExtraCallback();
            }
            promise.resolve((Object) null);
        } catch (Exception e) {
            promise.reject("CLEAR_CACHE_ERROR", e.getMessage(), e);
        }
    }

    @ReactMethod
    public final void getWidevineLevel(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            getSignForPKCS7NoContents getsignforpkcs7nocontentsOnNavigationEvent = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult.onNavigationEvent();
            promise.resolve(Integer.valueOf(getsignforpkcs7nocontentsOnNavigationEvent != null ? getsignforpkcs7nocontentsOnNavigationEvent.onTransact() : 0));
        } catch (Exception e) {
            promise.reject("WIDEVINE_ERROR", e.getMessage(), e);
        }
    }

    @ReactMethod
    public final void isCodecSupported(@NotNull String str, int i, int i2, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            getSignForPKCS7NoContents getsignforpkcs7nocontentsOnNavigationEvent = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult.onNavigationEvent();
            promise.resolve(Boolean.valueOf(getsignforpkcs7nocontentsOnNavigationEvent != null ? getsignforpkcs7nocontentsOnNavigationEvent.onExtraCallback(str, i, i2) : false));
        } catch (Exception e) {
            promise.reject("CODEC_ERROR", e.getMessage(), e);
        }
    }

    @ReactMethod
    public final void isHEVCSupported(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            getSignForPKCS7NoContents getsignforpkcs7nocontentsOnNavigationEvent = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult.onNavigationEvent();
            promise.resolve(Boolean.valueOf(getsignforpkcs7nocontentsOnNavigationEvent != null ? getsignforpkcs7nocontentsOnNavigationEvent.IAuthTabCallbackDefault() : false));
        } catch (Exception e) {
            promise.reject("HEVC_ERROR", e.getMessage(), e);
        }
    }

    @ReactMethod
    public final void getCurrentPosition(int i, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "");
        promise.resolve(Double.valueOf(0.0d));
    }

    @ReactMethod
    public final void save(int i, @Nullable ReadableMap readableMap, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "");
        promise.reject("NOT_IMPLEMENTED", "Save is not implemented on Android");
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
