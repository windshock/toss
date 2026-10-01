package io.invertase.googlemobileads;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsConsentModule$;
import io.invertase.googlemobileads.common.ReactNativeModule;
import java.lang.reflect.Method;
import javax.annotation.Nonnull;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReactNativeGoogleMobileAdsConsentModule extends ReactNativeModule {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String NAME = "RNGoogleMobileAdsConsentModule";
    private static char[] onExtraCallback = {27236, 27167, 27138, 27138, 27136, 27165, 27164, 27251, 27188, 27343, 27341, 27339, 27335, 27343, 27343, 27328, 27329, 27337, 27338};
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private ConsentInformation consentInformation;

    public static /* synthetic */ void $r8$lambda$Jmp97RD2zwN0UC1bgAnzEkIXhSc(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$loadAndShowConsentFormIfRequired$8(promise, formError);
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$L3yyoQvWLOze0abcYILJ3Q7_0xQ(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Activity activity, Promise promise, ConsentForm consentForm) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$showForm$3(activity, promise, consentForm);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$LqbLZiuXITnxuHWvLzzu4_qVfO8(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Activity activity, Promise promise) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$loadAndShowConsentFormIfRequired$9(activity, promise);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$UpexeNvrJEVr9DhsoRyMo3EHyOg(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Activity activity, Promise promise) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$showForm$5(activity, promise);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$_VfVI23EgeBnY3Dr31iqu4z7gCE(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$showPrivacyOptionsForm$6(promise, formError);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$b3q28wSrcxfqui1EpjC3VyTMuwo(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$showForm$2(promise, formError);
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$f4Yb0uAQl2m8JjyPItJwEkkDQPA(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Promise promise) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$requestInfoUpdate$0(promise);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: $r8$lambda$ievdew1bD2enzcEf9d0-YEIgLYA, reason: not valid java name */
    public static /* synthetic */ void m26$r8$lambda$ievdew1bD2enzcEf9d0YEIgLYA(ReactNativeGoogleMobileAdsConsentModule reactNativeGoogleMobileAdsConsentModule, Activity activity, Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        reactNativeGoogleMobileAdsConsentModule.lambda$showPrivacyOptionsForm$7(activity, promise);
        int i4 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public ReactNativeGoogleMobileAdsConsentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, NAME);
        this.consentInformation = UserMessagingPlatform.getConsentInformation(reactApplicationContext);
    }

    private String getConsentStatusString(int i) throws Throwable {
        int i2 = 2 % 2;
        if (i == 1) {
            Object[] objArr = new Object[1];
            a(new int[]{7, 12, 54, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr);
            return ((String) objArr[0]).intern();
        }
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 93;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if (i == 2) {
            int i7 = i5 + 43;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return "REQUIRED";
            }
            throw null;
        }
        int i8 = i3 + 45;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        if (i == 3) {
            return "OBTAINED";
        }
        int i10 = i3 + 47;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 7, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1}, objArr2);
            return ((String) objArr2[0]).intern();
        }
        Object[] objArr3 = new Object[1];
        a(new int[]{0, 7, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1}, objArr3);
        return ((String) objArr3[0]).intern();
    }

    /* renamed from: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsConsentModule$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[ConsentInformation.PrivacyOptionsRequirementStatus.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private String getPrivacyOptionsRequirementStatusString(ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            i = AnonymousClass1.onNavigationEvent[privacyOptionsRequirementStatus.ordinal()];
            if (i == 1) {
                return "REQUIRED";
            }
        } else {
            i = AnonymousClass1.onNavigationEvent[privacyOptionsRequirementStatus.ordinal()];
            if (i == 1) {
                return "REQUIRED";
            }
        }
        if (i == 2) {
            Object[] objArr = new Object[1];
            a(new int[]{7, 12, 54, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 7, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1}, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private WritableMap getConsentInformation() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", getConsentStatusString(this.consentInformation.getConsentStatus()));
        writableMapCreateMap.putBoolean("canRequestAds", this.consentInformation.canRequestAds());
        writableMapCreateMap.putString("privacyOptionsRequirementStatus", getPrivacyOptionsRequirementStatusString(this.consentInformation.getPrivacyOptionsRequirementStatus()));
        writableMapCreateMap.putBoolean("isConsentFormAvailable", this.consentInformation.isConsentFormAvailable());
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return writableMapCreateMap;
    }

    private /* synthetic */ void lambda$requestInfoUpdate$0(Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            promise.resolve(getConsentInformation());
            int i3 = 57 / 0;
        } else {
            promise.resolve(getConsentInformation());
        }
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$mxLIeFQw7a_zZAkHJYx3StKJzQc(Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-update-failed", formError.getMessage());
            int i3 = 94 / 0;
        } else {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-update-failed", formError.getMessage());
        }
    }

    @ReactMethod
    public void requestInfoUpdate(@Nonnull ReadableMap readableMap, Promise promise) throws Throwable {
        int i = 2 % 2;
        try {
            ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
            ConsentDebugSettings.Builder builder2 = new ConsentDebugSettings.Builder(getApplicationContext());
            if (readableMap.hasKey("testDeviceIdentifiers")) {
                ReadableArray array = readableMap.getArray("testDeviceIdentifiers");
                for (int i2 = 0; i2 < array.size(); i2++) {
                    builder2.addTestDeviceHashedId(array.getString(i2));
                }
            }
            if (readableMap.hasKey("debugGeography")) {
                int i3 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                builder2.setDebugGeography(readableMap.getInt("debugGeography"));
                int i5 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            builder.setConsentDebugSettings(builder2.build());
            if (readableMap.hasKey("tagForUnderAgeOfConsent")) {
                builder.setTagForUnderAgeOfConsent(readableMap.getBoolean("tagForUnderAgeOfConsent"));
            }
            ConsentRequestParameters consentRequestParametersBuild = builder.build();
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                this.consentInformation.requestConsentInfoUpdate(currentActivity, consentRequestParametersBuild, new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda2(this, promise), new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda3(promise));
                return;
            }
            int i7 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "null-activity", "Attempted to request a consent info update but the current Activity was null.");
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-update-failed", e.toString());
        }
    }

    private /* synthetic */ void lambda$showForm$5(Activity activity, Promise promise) {
        int i = 2 % 2;
        UserMessagingPlatform.loadConsentForm(getReactApplicationContext(), new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda6(this, activity, promise), new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda7(promise));
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    private /* synthetic */ void lambda$showForm$3(Activity activity, Promise promise, ConsentForm consentForm) {
        int i = 2 % 2;
        consentForm.show(activity, new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda4(this, promise));
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void lambda$showForm$2(Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        if (formError == null) {
            promise.resolve(getConsentInformation());
            return;
        }
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", formError.getMessage());
            int i3 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", formError.getMessage());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$sZjQVH5Wy1dc6UXKTn-6Fi5iWaE, reason: not valid java name */
    public static /* synthetic */ void m27$r8$lambda$sZjQVH5Wy1dc6UXKTn6Fi5iWaE(Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", formError.getMessage());
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactMethod
    public void showForm(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                getCurrentActivity();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda1(this, currentActivity, promise));
                return;
            }
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "null-activity", "Consent form attempted to show but the current Activity was null.");
            int i5 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", e.toString());
        }
    }

    private /* synthetic */ void lambda$showPrivacyOptionsForm$7(Activity activity, Promise promise) {
        int i = 2 % 2;
        UserMessagingPlatform.showPrivacyOptionsForm(activity, new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda5(this, promise));
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private /* synthetic */ void lambda$showPrivacyOptionsForm$6(Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (formError == null) {
            promise.resolve(getConsentInformation());
            return;
        }
        ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "privacy-options-form-error", formError.getMessage());
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactMethod
    public void showPrivacyOptionsForm(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda8(this, currentActivity, promise));
                return;
            }
            int i4 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "null-activity", "Privacy options form attempted to show but the current Activity was null.");
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", e.toString());
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        float f = 0.0f;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35283), 35 - KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), Drawable.resolveOpacity(0, 0) + 29, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ExpandableListView.getPackedPositionChild(0L)), 66 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 49467), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70, View.MeasureSpec.getMode(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj = null;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
            int i14 = $11 + 91;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 2 / 4;
            }
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i16 = $11 + 31;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i18 = $11 + 89;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private /* synthetic */ void lambda$loadAndShowConsentFormIfRequired$9(Activity activity, Promise promise) {
        int i = 2 % 2;
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda0(this, promise));
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void lambda$loadAndShowConsentFormIfRequired$8(Promise promise, FormError formError) throws Throwable {
        int i = 2 % 2;
        if (formError != null) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", formError.getMessage());
            return;
        }
        promise.resolve(getConsentInformation());
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    @ReactMethod
    public void loadAndShowConsentFormIfRequired(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsConsentModule$.ExternalSyntheticLambda9(this, currentActivity, promise));
                return;
            }
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "null-activity", "Consent form attempted to load and show if required but the current Activity was null.");
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-form-error", e.toString());
            int i6 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 56 / 0;
            }
        }
    }

    @ReactMethod
    public void getConsentInfo(Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            promise.resolve(getConsentInformation());
            throw null;
        }
        promise.resolve(getConsentInformation());
        int i3 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactMethod
    public void reset() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.consentInformation.reset();
            obj.hashCode();
            throw null;
        }
        this.consentInformation.reset();
        int i3 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    @ReactMethod
    public void getTCString(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                promise.resolve(PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getString("IABTCF_TCString", null));
                int i3 = 84 / 0;
            } else {
                promise.resolve(PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getString("IABTCF_TCString", null));
            }
            int i4 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i4 % 128;
            promise = i4 % 2;
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-string-error", e.toString());
        }
    }

    @ReactMethod
    public void getGdprApplies(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean z = false;
            if (PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getInt("IABTCF_gdprApplies", 0) == 1) {
                int i4 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-string-error", e.toString());
        }
    }

    @ReactMethod
    public void getPurposeConsents(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                promise.resolve(PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getString("IABTCF_PurposeConsents", _UrlKt.FRAGMENT_ENCODE_SET));
                int i3 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 98 / 0;
                    return;
                }
                return;
            }
            promise.resolve(PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getString("IABTCF_PurposeConsents", _UrlKt.FRAGMENT_ENCODE_SET));
            throw null;
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-string-error", e.toString());
        }
    }

    @ReactMethod
    public void getPurposeLegitimateInterests(Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                promise.resolve(PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getString("IABTCF_PurposeLegitimateInterests", _UrlKt.FRAGMENT_ENCODE_SET));
                return;
            }
            promise.resolve(PreferenceManager.getDefaultSharedPreferences(getReactApplicationContext()).getString("IABTCF_PurposeLegitimateInterests", _UrlKt.FRAGMENT_ENCODE_SET));
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "consent-string-error", e.toString());
        }
    }
}
