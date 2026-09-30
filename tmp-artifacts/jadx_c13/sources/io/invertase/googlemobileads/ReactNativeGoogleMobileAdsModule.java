package io.invertase.googlemobileads;

import android.app.Activity;
import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsModule$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8000;
import o.getWrite;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactNativeGoogleMobileAdsModule extends ReactContextBaseJavaModule {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final String NAME = "RNGoogleMobileAdsModule";
    private static int asInterface;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static boolean onWarmupCompleted;

    public static /* synthetic */ void $r8$lambda$8vcLbmfZwW15UeIdAP3PmGo2ZSw(ReactNativeGoogleMobileAdsModule reactNativeGoogleMobileAdsModule, Promise promise) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        openAdInspector$lambda$0(reactNativeGoogleMobileAdsModule, promise);
        int i4 = onExtraCallback + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: $r8$lambda$MJN-bEyyxt0Cfbm8bLtk5hvuCSg, reason: not valid java name */
    public static /* synthetic */ void m29$r8$lambda$MJNbEyyxt0Cfbm8bLtk5hvuCSg(Promise promise, InitializationStatus initializationStatus) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initialize$lambda$0(promise, initializationStatus);
        int i4 = onExtraCallback + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$Soph4qYxkCQOhAjlAcGeDaWE6rY(Promise promise, AdInspectorError adInspectorError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        openAdInspector$lambda$0$0(promise, adInspectorError);
        int i4 = onExtraCallback + 123;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$nvFxoFjYJgFqzMhOlHwkeXO0arE(ReactNativeGoogleMobileAdsModule reactNativeGoogleMobileAdsModule, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        openDebugMenu$lambda$0(reactNativeGoogleMobileAdsModule, str);
        int i4 = onExtraCallback + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    static {
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallbackStub + 93;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeGoogleMobileAdsModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = i3 + 103;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return NAME;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getConstants() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapIAuthTabCallbackStub = access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("REVENUE_PRECISION_UNKNOWN", 0), getWrite.IAuthTabCallback("REVENUE_PRECISION_ESTIMATED", 1), getWrite.IAuthTabCallback("REVENUE_PRECISION_PUBLISHER_PROVIDED", 2), getWrite.IAuthTabCallback("REVENUE_PRECISION_PRECISE", 3));
        int i4 = onExtraCallback + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallbackStub;
    }

    private final RequestConfiguration buildRequestConfiguration(ReadableMap readableMap) {
        int i = 2 % 2;
        RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
        if (readableMap.hasKey("testDeviceIdentifiers")) {
            int i2 = onExtraCallback + 19;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            ReadableArray array = readableMap.getArray("testDeviceIdentifiers");
            if (array == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ArrayList arrayList = array.toArrayList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj : arrayList) {
                Intrinsics.checkNotNull(obj, "");
                String str = (String) obj;
                if (Intrinsics.areEqual(str, "EMULATOR")) {
                    str = "B3EEABB8EE11C2BE770B684D95219ECB";
                }
                arrayList2.add(str);
            }
            builder.setTestDeviceIds(arrayList2);
        }
        if (readableMap.hasKey("maxAdContentRating")) {
            int i4 = IAuthTabCallbackDefault + 51;
            onExtraCallback = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                readableMap.getString("maxAdContentRating");
                throw null;
            }
            String string = readableMap.getString("maxAdContentRating");
            if (string != null) {
                int iHashCode = string.hashCode();
                if (iHashCode != 71) {
                    int i5 = IAuthTabCallbackDefault + 29;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    int i7 = i5 % 2;
                    if (iHashCode != 84) {
                        if (iHashCode != 2452) {
                            if (iHashCode == 2551) {
                                int i8 = i6 + 63;
                                IAuthTabCallbackDefault = i8 % 128;
                                if (i8 % 2 == 0) {
                                    string.equals("PG");
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (string.equals("PG")) {
                                    builder.setMaxAdContentRating("PG");
                                }
                            }
                        } else if (string.equals("MA")) {
                            builder.setMaxAdContentRating("MA");
                        }
                    } else if (string.equals("T")) {
                        int i9 = IAuthTabCallbackDefault + 87;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        builder.setMaxAdContentRating("T");
                    }
                } else if (string.equals("G")) {
                    builder.setMaxAdContentRating("G");
                }
            }
        }
        if (readableMap.hasKey("tagForChildDirectedTreatment")) {
            builder.setTagForChildDirectedTreatment(readableMap.getBoolean("tagForChildDirectedTreatment") ? 1 : 0);
        } else {
            builder.setTagForChildDirectedTreatment(-1);
        }
        if (readableMap.hasKey("tagForUnderAgeOfConsent")) {
            builder.setTagForUnderAgeOfConsent(readableMap.getBoolean("tagForUnderAgeOfConsent") ? 1 : 0);
        } else {
            builder.setTagForUnderAgeOfConsent(-1);
            int i11 = onExtraCallback + 81;
            IAuthTabCallbackDefault = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 / 5;
            }
        }
        RequestConfiguration requestConfigurationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(requestConfigurationBuild, "");
        return requestConfigurationBuild;
    }

    @ReactMethod
    public final void initialize(@NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        ReactApplicationContext currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            int i2 = IAuthTabCallbackDefault + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            currentActivity = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(currentActivity, "");
            int i4 = onExtraCallback + 79;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        MobileAds.initialize(currentActivity, new ReactNativeGoogleMobileAdsModule$.ExternalSyntheticLambda3(promise));
    }

    private static final void initialize$lambda$0(Promise promise, InitializationStatus initializationStatus) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(initializationStatus, "");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Map adapterStatusMap = initializationStatus.getAdapterStatusMap();
        Intrinsics.checkNotNullExpressionValue(adapterStatusMap, "");
        int i4 = onExtraCallback + 93;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        for (Map.Entry entry : adapterStatusMap.entrySet()) {
            String str = (String) entry.getKey();
            AdapterStatus adapterStatus = (AdapterStatus) entry.getValue();
            WritableMap writableMapCreateMap = Arguments.createMap();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            writableMapCreateMap.putString(((String) objArr[0]).intern(), str);
            writableMapCreateMap.putInt("state", adapterStatus.getInitializationState().ordinal());
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-127, -116, -119, -117, -118, -119, -120, -121, -122, -124, -123}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, objArr2);
            writableMapCreateMap.putString(((String) objArr2[0]).intern(), adapterStatus.getDescription());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        promise.resolve(writableArrayCreateArray);
    }

    @ReactMethod
    public final void setRequestConfiguration(@NotNull ReadableMap readableMap, @NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        MobileAds.setRequestConfiguration(buildRequestConfiguration(readableMap));
        promise.resolve((Object) null);
        int i4 = onExtraCallback + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactMethod
    public final void openAdInspector(@NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsModule$.ExternalSyntheticLambda1(this, promise));
            return;
        }
        int i4 = IAuthTabCallbackDefault + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            promise.reject("null-activity", "Ad Inspector attempted to open but the current Activity was null.");
            return;
        }
        promise.reject("null-activity", "Ad Inspector attempted to open but the current Activity was null.");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void openAdInspector$lambda$0(ReactNativeGoogleMobileAdsModule reactNativeGoogleMobileAdsModule, Promise promise) {
        int i = 2 % 2;
        MobileAds.openAdInspector(reactNativeGoogleMobileAdsModule.getReactApplicationContext(), new ReactNativeGoogleMobileAdsModule$.ExternalSyntheticLambda0(promise));
        int i2 = IAuthTabCallbackDefault + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 int) = (r1v4 int), (r1v10 int) binds: [B:10:0x001f, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void openAdInspector$lambda$0$0(Promise promise, AdInspectorError adInspectorError) {
        int code;
        String str;
        int i = 2 % 2;
        if (adInspectorError == null) {
            promise.resolve((Object) null);
            return;
        }
        int i2 = onExtraCallback + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            code = adInspectorError.getCode();
            int i3 = 39 / 0;
            if (code != 0) {
                int i4 = IAuthTabCallbackDefault;
                int i5 = i4 + 7;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (code == 1) {
                    str = "FAILED_TO_LOAD";
                } else if (code == 2) {
                    str = "NOT_IN_TEST_MODE";
                } else if (code != 3) {
                    int i7 = i4 + 3;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 96 / 0;
                    }
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                } else {
                    str = "ALREADY_OPEN";
                }
            } else {
                int i9 = IAuthTabCallbackDefault + 77;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                str = "INTERNAL_ERROR";
            }
        } else {
            code = adInspectorError.getCode();
            if (code != 0) {
            }
        }
        promise.reject(str, adInspectorError.getMessage());
    }

    @ReactMethod
    public final void openDebugMenu(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getReactApplicationContext().getCurrentActivity();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsModule$.ExternalSyntheticLambda2(this, str));
        }
        int i3 = IAuthTabCallbackDefault + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
    }

    private static final void openDebugMenu$lambda$0(ReactNativeGoogleMobileAdsModule reactNativeGoogleMobileAdsModule, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Activity currentActivity = reactNativeGoogleMobileAdsModule.getReactApplicationContext().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        MobileAds.openDebugMenu(currentActivity, str);
        int i4 = IAuthTabCallbackDefault + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 77 - Color.alpha(0), (ViewConfiguration.getTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            char c = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 74 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), (ViewConfiguration.getTapTimeout() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i4 = 1052772399;
            if (onExtraCallbackWithResult) {
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 25;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 64, 12213 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i9 = $11 + 1;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    c = '0';
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $11 + 47;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i13 = $10 + 17;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i15 = $10 + 113;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 63 - (KeyEvent.getMaxKeyCode() >> 16), 12262 - AndroidCharacter.getMirror('0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i4 = 1052772399;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @ReactMethod
    public final void setAppVolume(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        MobileAds.setAppVolume(f);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
    }

    @ReactMethod
    public final void setAppMuted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        MobileAds.setAppMuted(z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{32274, 32487, 32275, 32283, 32484, 32277, 32485, 32278, 32287, 32272, 32276, 32273};
        IAuthTabCallback = -1184334208;
        onWarmupCompleted = true;
        onExtraCallbackWithResult = true;
    }
}
