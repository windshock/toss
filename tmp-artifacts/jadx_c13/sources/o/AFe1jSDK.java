package o;

import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.ArrayList;
import java.util.List;
import o.AFe1fSDK;
import o.getAdvertisingId;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1jSDK {
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> IAuthTabCallback;
    private static final AFe1fSDK.onExtraCallbackWithResult<Integer> IAuthTabCallbackDefault;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> IAuthTabCallbackStub;
    private static final AFe1fSDK.onExtraCallbackWithResult<Integer> IAuthTabCallbackStubProxy;
    private static final AFe1fSDK.onExtraCallbackWithResult<String> IAuthTabCallback_Parcel;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> ICustomTabsCallback;
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStub = 1;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static final AFe1fSDK.onExtraCallbackWithResult<String> access000;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> access100;
    private static final AFe1fSDK.onNavigationEvent<Boolean> asBinder;
    private static final AFe1fSDK.onExtraCallbackWithResult<String> asInterface;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> extraCallback;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> extraCallbackWithResult;
    private static final AFe1fSDK.onExtraCallbackWithResult<Integer> getInterfaceDescriptor;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> onActivityLayout;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> onActivityResized;
    public static final AFe1jSDK onExtraCallback;
    private static final AFe1fSDK.onExtraCallbackWithResult<String> onExtraCallbackWithResult;
    private static final AFe1fSDK.onNavigationEvent<String> onMessageChannelReady;
    private static final AFe1fSDK.onExtraCallbackWithResult<Boolean> onMinimized;
    public static final int onNavigationEvent;
    private static int onPostMessage;
    private static final AFe1fSDK.onExtraCallbackWithResult<String> onTransact;
    private static final List<AFe1fSDK<?>> onWarmupCompleted;
    private static final AFe1fSDK.onExtraCallbackWithResult<String> readTypedObject;
    private static final AFe1fSDK.onExtraCallbackWithResult<Integer> writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = i9 | i10 | (~(i8 | i));
        int i12 = i10 | i2;
        int i13 = ~i;
        int i14 = (~(i2 | i13 | i6)) | (~(i7 | i13 | i8)) | (~(i8 | i6 | i));
        int i15 = i6 + i + i3 + ((-1329026341) * i5) + ((-1277752516) * i4);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i6) - 1912602624) + ((-659060787) * i) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i3) + (494927872 * i5) + (1577058304 * i4) + ((-1783103488) * i16);
        int i18 = (i6 * 595972471) + 129777640 + (i * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i3 * 595972219) + (i5 * (-1341978823)) + (i4 * 731850196) + (i16 * 1869086720);
        return i17 + ((i18 * i18) * (-846725120)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private AFe1jSDK() {
    }

    static {
        AFe1jSDK aFe1jSDK = new AFe1jSDK();
        onExtraCallback = aFe1jSDK;
        onWarmupCompleted = new ArrayList();
        getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.NativeAuthEnabled;
        Boolean bool = Boolean.FALSE;
        onActivityLayout = aFe1jSDK.IAuthTabCallback(onextracallbackwithresult, bool);
        IAuthTabCallbackStub = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.EarningCallPipHideAppBridgeEnabled, bool);
        writeTypedObject = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.HighTextContrastGuideMaxExposureCount, 1000000);
        getInterfaceDescriptor = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.HighTextContrastGuideMaxClickCount, 2);
        IAuthTabCallbackDefault = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.EarningCallSessionMaxCount, 1);
        IAuthTabCallback = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.EarningCallMediaServiceLogEnabled, bool);
        asInterface = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.EarningCallUpcomingDescriptionLink, _UrlKt.FRAGMENT_ENCODE_SET);
        onActivityResized = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.WatchListCheetahEntryEnabled, bool);
        onMinimized = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.NewPriceEnabled, bool);
        ICustomTabsCallback = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.KrxExtendedHoursEnabled, bool);
        readTypedObject = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.HomeNativeAiEntryPath, _UrlKt.FRAGMENT_ENCODE_SET);
        extraCallback = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.HomeNativeAiEntryInteractionEnabled, bool);
        extraCallbackWithResult = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.HomeNativeAiEntryEnabled, bool);
        onExtraCallbackWithResult = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.AppBridgeDedupWhitelist, _UrlKt.FRAGMENT_ENCODE_SET);
        access100 = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.FeatureControlEnabled, bool);
        IAuthTabCallback_Parcel = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.FeatureControlFallbackKeys, _UrlKt.FRAGMENT_ENCODE_SET);
        IAuthTabCallbackStubProxy = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.FeatureControlMaxCachingSize, 30);
        access000 = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.FeatureControlLogLevel, "balanced");
        onTransact = aFe1jSDK.IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.FeatureControlEmployeeOnlyReleasedKeys, _UrlKt.FRAGMENT_ENCODE_SET);
        asBinder = aFe1jSDK.onExtraCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.EarningCallPipEnabled, bool);
        onMessageChannelReady = aFe1jSDK.onExtraCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult.RequiredVersion, "5.225.0");
        onNavigationEvent = 8;
        int i = onPostMessage + 47;
        ICustomTabsCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final List<AFe1fSDK<?>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final <T> AFe1fSDK.onExtraCallbackWithResult<T> IAuthTabCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, T t) {
        int i = 2 % 2;
        AFe1fSDK.onExtraCallbackWithResult<T> onextracallbackwithresult2 = new AFe1fSDK.onExtraCallbackWithResult<>(onextracallbackwithresult, t);
        onWarmupCompleted.add(onextracallbackwithresult2);
        int i2 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onextracallbackwithresult2;
        }
        throw null;
    }

    private final <T> AFe1fSDK.onNavigationEvent<T> onExtraCallback(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, T t) {
        int i = 2 % 2;
        AFe1fSDK.onNavigationEvent<T> onnavigationevent = new AFe1fSDK.onNavigationEvent<>(onextracallbackwithresult, t);
        onWarmupCompleted.add(onnavigationevent);
        int i2 = ICustomTabsCallbackStubProxy + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Boolean> asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AFe1fSDK.onExtraCallbackWithResult<Boolean> onextracallbackwithresult = onActivityLayout;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return onextracallbackwithresult;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Boolean> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 113;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        AFe1fSDK.onExtraCallbackWithResult<Boolean> onextracallbackwithresult = IAuthTabCallbackStub;
        int i5 = i2 + 109;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Integer> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 1;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject;
        }
        throw null;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Integer> onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        AFe1fSDK.onExtraCallbackWithResult<Integer> onextracallbackwithresult = getInterfaceDescriptor;
        int i5 = i3 + 73;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Integer> onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 59;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        AFe1fSDK.onExtraCallbackWithResult<Integer> onextracallbackwithresult = IAuthTabCallbackDefault;
        int i5 = i2 + 43;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AFe1fSDK.onExtraCallbackWithResult<Boolean> onextracallbackwithresult = IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return onextracallbackwithresult;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Boolean> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 43;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        AFe1fSDK.onExtraCallbackWithResult<Boolean> onextracallbackwithresult = onMinimized;
        int i5 = i3 + 3;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback;
        }
        throw null;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 65;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        AFe1fSDK.onExtraCallbackWithResult<String> onextracallbackwithresult = onExtraCallbackWithResult;
        int i5 = i3 + 57;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return onextracallbackwithresult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 49;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        AFe1fSDK.onNavigationEvent<String> onnavigationevent = onMessageChannelReady;
        int i5 = i2 + 107;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public final AFe1fSDK.onExtraCallbackWithResult<Boolean> asBinder() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (AFe1fSDK.onExtraCallbackWithResult) IAuthTabCallback(1577628073, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, -1577628073);
    }

    public final AFe1fSDK.onNavigationEvent<String> access000() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (AFe1fSDK.onNavigationEvent) IAuthTabCallback(353714350, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, -353714349);
    }
}
