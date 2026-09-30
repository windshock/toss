package o;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.model.NativeExtension;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.features.tosscert.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.JavaScriptReplyProxyImplExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.UtilsKtExternalSyntheticLambda17;
import o.onReceivedHttpError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class JavaScriptReplyProxyImplExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final JavaScriptReplyProxyImplExternalSyntheticLambda0 onExtraCallbackWithResult = new JavaScriptReplyProxyImplExternalSyntheticLambda0();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        Context context = (Context) objArr[3];
        NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[4];
        String str2 = (String) objArr[5];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(nativeAdsManager, str, adAsset, context, creative, str2);
        }
        asInterface(nativeAdsManager, str, adAsset, context, creative, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, NativeAdsDto.Creative creative) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, creative);
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, Context context, NativeAdsDto.Creative creative, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(-69863308, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 69863313, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{nativeAdsManager, str, adAsset, context, creative, str2});
        }
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallback(-964809370, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 964809371, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue();
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7);
        int i9 = (~i) | (~(i7 | i4));
        int i10 = i4 | i | i7;
        int i11 = i + i3 + i6 + (1635157569 * i5) + ((-1141649966) * i2);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i) - 711983104) + (488484398 * i3) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i5) + (1566572544 * i2) + (1631846400 * i12);
        int i14 = (i * 1521345644) + 2088555610 + (i3 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i5 * (-1382509809)) + (i2 * 37969358) + (i12 * (-671350784));
        switch (i13 + (i14 * i14 * (-1069809664))) {
            case 1:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                int i15 = 2 % 2;
                int i16 = onExtraCallback + 67;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
                int i18 = onNavigationEvent + 29;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                Context context = (Context) objArr[0];
                NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[1];
                int i20 = 2 % 2;
                int i21 = onNavigationEvent + 91;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, ((NativeAdsDto.Creative.RightBanner) creative).onWarmupCompleted(), 0, 2, null);
                Unit unit = Unit.INSTANCE;
                int i23 = onNavigationEvent + 31;
                onExtraCallback = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onExtraCallbackWithResult(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, str);
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, Context context, NativeAdsDto.Creative creative, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsManager, str, adAsset, context, creative, str2);
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, NativeAdsDto.Creative creative) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(1117654836, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1117654832, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{context, creative});
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, Context context, NativeAdsDto.Creative creative, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(1218455292, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1218455286, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{nativeAdsManager, str, adAsset, context, creative, str2});
        }
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(1218455292, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1218455286, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[]{nativeAdsManager, str, adAsset, context, creative, str2});
        int i3 = 59 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset, Context context, Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsManager, nativeAdsDto, adAsset, context, num);
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Context context = (Context) objArr[0];
        NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(context, creative);
        }
        onTransact(context, creative);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(context, adAsset);
        }
        onExtraCallbackWithResult(context, adAsset);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, NativeAdsDto.Creative creative) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(context, creative);
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsManager, str, adAsset, nativeAdsEventLogType);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private JavaScriptReplyProxyImplExternalSyntheticLambda0() {
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Context context, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, adAsset.onExtraCallbackWithResult().onWarmupCompleted(), 0, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto, final NativeAdsDto.AdAsset adAsset, final Context context, Integer num) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsManager, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(context, adAsset);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(context, adAsset);
                int i4 = onExtraCallback + 107;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        }, 56, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Context context, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, str, 0, 3, null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, str, 0, 2, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Context context, NativeAdsDto.Creative creative) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, ((NativeAdsDto.Creative.Normal) creative).onWarmupCompleted(), 0, 2, null);
        } else {
            getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, ((NativeAdsDto.Creative.Normal) creative).onWarmupCompleted(), 0, 2, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 53;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        NativeAdsEventLogType.onExtraCallback onextracallback;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        final Context context = (Context) objArr[3];
        final NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[4];
        String str2 = (String) objArr[5];
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (str2 != null) {
            NativeAdsEventLogType.onExtraCallback onextracallback2 = new NativeAdsEventLogType.onExtraCallback(str2);
            int i4 = onNavigationEvent + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onextracallback = onextracallback2;
        } else {
            onextracallback = null;
        }
        getFillAlpha.onWarmupCompleted(nativeAdsManager, str, adAsset, onextracallback, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda14
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = JavaScriptReplyProxyImplExternalSyntheticLambda0.IAuthTabCallback(context, creative);
                int i9 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallback;
            }
        }, 56, null);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(Context context, NativeAdsDto.Creative creative) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, ((NativeAdsDto.Creative.Feed) creative).onWarmupCompleted(), 0, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, final Context context, final NativeAdsDto.Creative creative, String str2) throws Throwable {
        NativeAdsEventLogType.onExtraCallback onextracallback;
        int i = 2 % 2;
        Object obj = null;
        if (str2 != null) {
            NativeAdsEventLogType.onExtraCallback onextracallback2 = new NativeAdsEventLogType.onExtraCallback(str2);
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = onextracallback2;
        } else {
            onextracallback = null;
        }
        getFillAlpha.onWarmupCompleted(nativeAdsManager, str, adAsset, onextracallback, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 99;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Context context2 = context;
                if (i6 == 0) {
                    return JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(context2, creative);
                }
                JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(context2, creative);
                throw null;
            }
        }, 56, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        calculatePageOffsets.onExtraCallback(nativeAdsManager.onExtraCallbackWithResult(), str, adAsset, nativeAdsEventLogType, (Function1) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(Context context, NativeAdsDto.Creative creative) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, ((NativeAdsDto.Creative.FeedVideo) creative).onWarmupCompleted(), 1, 4, null);
        } else {
            getStrokeWidth.IAuthTabCallback(getStrokeWidth.onExtraCallback, context, ((NativeAdsDto.Creative.FeedVideo) creative).onWarmupCompleted(), 0, 2, null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        final Context context = (Context) objArr[3];
        final NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[4];
        String str2 = (String) objArr[5];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getFillAlpha.onWarmupCompleted(nativeAdsManager, str, adAsset, str2 != null ? new NativeAdsEventLogType.onExtraCallback(str2) : null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 81;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr2 = {context, creative};
                int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                Unit unit = (Unit) JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallback(1182430511, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1182430509, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2);
                int i6 = onExtraCallback + 45;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 25 / 0;
                }
                return unit;
            }
        }, 56, null);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, final Context context, final NativeAdsDto.Creative creative, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getFillAlpha.onWarmupCompleted(nativeAdsManager, str, adAsset, str2 != null ? new NativeAdsEventLogType.onExtraCallback(str2) : null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Context context2 = context;
                if (i5 == 0) {
                    return JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult(context2, creative);
                }
                JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult(context2, creative);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 56, null);
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final NativeAdsDto nativeAdsDto, @NotNull final NativeAdsDto.AdAsset adAsset, @NotNull final NativeAdsManager nativeAdsManager, boolean z, @Nullable onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z2;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        onReceivedHttpError.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
        boolean z4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Object obj;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent;
        boolean z5;
        boolean zOnExtraCallback2;
        boolean zOnNavigationEvent2;
        boolean z6;
        boolean zOnExtraCallback3;
        boolean zOnNavigationEvent3;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(nativeAdsManager, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1432405192);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = (i2 & 1) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 16) != 0) {
            int i5 = onNavigationEvent + 113;
            onExtraCallback = i5 % 128;
            z2 = i5 % 2 == 0;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            z3 = z2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            iAuthTabCallbackOnExtraCallbackWithResult = onReceivedHttpError.onNavigationEvent.onExtraCallbackWithResult(false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResult, 100663296, 255);
        } else {
            z3 = z2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
        }
        ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl2 = (i2 & 64) != 0 ? null : viewPager2LinearLayoutManagerImpl;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1432405192, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsPreset.PresetContent (NativeAdsPreset.kt:50)");
        }
        NativeExtension nativeExtensionIAuthTabCallbackStub = adAsset.IAuthTabCallbackStub();
        if (nativeExtensionIAuthTabCallbackStub != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2011407317);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeExtensionIAuthTabCallbackStub);
            boolean z7 = (((3670016 & i) ^ 1572864) > 1048576 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(viewPager2LinearLayoutManagerImpl2)) || (i & 1572864) == 1048576;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent4 | z7)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallback = getOrCreateProfile.onExtraCallback(nativeExtensionIAuthTabCallbackStub.onWarmupCompleted(), viewPager2LinearLayoutManagerImpl2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getbacktracenoteOnExtraCallback);
                    obj2 = getbacktracenoteOnExtraCallback;
                }
                getBacktraceNote getbacktracenote = (getBacktraceNote) obj2;
                if (getbacktracenote != null) {
                    int i6 = onExtraCallback + 19;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2011143352);
                    final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z3), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    final boolean z8 = z3;
                    boolean z9 = (((i & 57344) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z8)) || (i & 24576) == 16384;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (z9 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke() {
                                int i8 = 2 % 2;
                                int i9 = IAuthTabCallback + 95;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                Unit unitOnWarmupCompleted = JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(getsupportedhighspeedresolutionsfor, z8);
                                int i11 = IAuthTabCallback + 111;
                                onExtraCallback = i11 % 128;
                                int i12 = i11 % 2;
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeExtensionIAuthTabCallbackStub);
                    boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strIAuthTabCallbackStub);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent6 | zOnNavigationEvent5) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = onPageScrollStateChanged.Companion.onExtraCallbackWithResult(nativeExtensionIAuthTabCallbackStub, new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda4
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3) throws Throwable {
                                int i8 = 2 % 2;
                                int i9 = onWarmupCompleted + 37;
                                onExtraCallback = i9 % 128;
                                Object obj4 = null;
                                if (i9 % 2 == 0) {
                                    JavaScriptReplyProxyImplExternalSyntheticLambda0.onNavigationEvent(nativeAdsManager, nativeAdsDto, adAsset, context, (Integer) obj3);
                                    throw null;
                                }
                                Unit unitOnNavigationEvent = JavaScriptReplyProxyImplExternalSyntheticLambda0.onNavigationEvent(nativeAdsManager, nativeAdsDto, adAsset, context, (Integer) obj3);
                                int i10 = onWarmupCompleted + 53;
                                onExtraCallback = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return unitOnNavigationEvent;
                                }
                                obj4.hashCode();
                                throw null;
                            }
                        }, new ProfileStore(nativeAdsDto.IAuthTabCallbackStub(), adAsset, nativeAdsManager, nativeAdsDto.onTransact().asBinder(), new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i8 = 2 % 2;
                                int i9 = IAuthTabCallback + 99;
                                onNavigationEvent = i9 % 128;
                                int i10 = i9 % 2;
                                Boolean boolValueOf = Boolean.valueOf(JavaScriptReplyProxyImplExternalSyntheticLambda0.IAuthTabCallback(getsupportedhighspeedresolutionsfor));
                                int i11 = IAuthTabCallback + 89;
                                onNavigationEvent = i11 % 128;
                                int i12 = i11 % 2;
                                return boolValueOf;
                            }
                        }, new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda6
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj3) {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallback + 121;
                                onNavigationEvent = i9 % 128;
                                int i10 = i9 % 2;
                                Context context2 = context;
                                String str = (String) obj3;
                                if (i10 == 0) {
                                    return JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallback(context2, str);
                                }
                                JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallback(context2, str);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        }));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    WebViewCompatExternalSyntheticLambda0.onExtraCallback(getbacktracenote, (onPageScrollStateChanged) objOnMinimized4, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport02, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return;
                }
                z4 = z3;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2009465446);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        } else {
            z4 = z3;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2009455526);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        final Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        final String strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
        boolean zAsBinder = nativeAdsDto.onTransact().asBinder();
        deleteProfile deleteprofileAsBinder = nativeAdsManager.asBinder(strIAuthTabCallbackStub2);
        boolean zOnTransact = adAsset.onTransact();
        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset.IAuthTabCallback());
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent7 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
            objOnMinimized5 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
        boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset.IAuthTabCallback());
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent8) {
            int i8 = onExtraCallback + 45;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized6 = (NativeAdsDto.Creative.ThumbnailBanner) onExtraCallback(1242647353, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1242647353, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{onExtraCallbackWithResult, adAsset.onExtraCallbackWithResult()});
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
            }
        }
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objOnMinimized6;
        String strIAuthTabCallback = adAsset.IAuthTabCallback();
        boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
        boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallback);
        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent10 | zOnNavigationEvent9)) {
            int i10 = onNavigationEvent + 47;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized7 = Boolean.valueOf(onExtraCallbackWithResult.onExtraCallback(strIAuthTabCallbackStub2, thumbnailBanner, nativeAdsManager));
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
            }
        }
        boolean zBooleanValue = ((Boolean) objOnMinimized7).booleanValue();
        if (!onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2) && zBooleanValue && thumbnailBanner != null) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2008714006);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent11) {
                int i12 = onExtraCallback + 25;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda7
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i14 = 2 % 2;
                            int i15 = onNavigationEvent + 109;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnExtraCallbackWithResult = JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2);
                            int i17 = IAuthTabCallback + 37;
                            onNavigationEvent = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 46 / 0;
                            }
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized8);
                }
            }
            int i14 = i << 3;
            onReceiveValue.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted, strIAuthTabCallbackStub2, adAsset, thumbnailBanner, nativeAdsManager, z4, (Function0) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, (i & 896) | (57344 & i14) | (i14 & 458752), 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2008298854);
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        final NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Normal) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2008160160);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(nativeAdsManager);
            boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
            boolean z10 = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset)) || (i & 384) == 256;
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
            boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (((zOnExtraCallback4 | zOnNavigationEvent12 | z10 | zOnExtraCallback5) || zOnNavigationEvent13) || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                i3 = i;
                Function1 function1 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda8
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i15 = 2 % 2;
                        int i16 = onWarmupCompleted + 11;
                        onExtraCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            return JavaScriptReplyProxyImplExternalSyntheticLambda0.IAuthTabCallback(nativeAdsManager, strIAuthTabCallbackStub2, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj3);
                        }
                        JavaScriptReplyProxyImplExternalSyntheticLambda0.IAuthTabCallback(nativeAdsManager, strIAuthTabCallbackStub2, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj3);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function1);
                objOnMinimized9 = function1;
            } else {
                i3 = i;
            }
            Function1 function12 = (Function1) objOnMinimized9;
            if (zOnTransact) {
                int i15 = onExtraCallback + 7;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2007728578);
                getWindowAreaDisplayMetrics.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), zAsBinder, deleteprofileAsBinder, (NativeAdsDto.Creative.Normal) creativeOnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, function12, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 57344, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2007314914);
                WebViewCompatExternalSyntheticLambda2.onExtraCallbackWithResult(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), Boolean.valueOf(zAsBinder), deleteprofileAsBinder, (NativeAdsDto.Creative.Normal) creativeOnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 >> 3) & 57344), 0}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1585448721, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1585448720);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Feed) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2006849976);
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(nativeAdsManager);
            boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
            if (((i & 896) ^ 384) <= 256 || !cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset)) {
                if ((i & 384) == 256) {
                    int i17 = onExtraCallback + 5;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 != 0) {
                        z6 = true;
                    }
                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback6 | zOnNavigationEvent14 | z6 | zOnExtraCallback3 | zOnNavigationEvent3) {
                        Object obj3 = objOnMinimized10;
                        if (objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function1 function13 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda9
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj4) {
                                    int i18 = 2 % 2;
                                    int i19 = IAuthTabCallback + 87;
                                    onExtraCallbackWithResult = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        Object[] objArr = {nativeAdsManager, strIAuthTabCallbackStub2, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj4};
                                        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                                        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                                        return (Unit) JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallback(322586800, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -322586797, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr);
                                    }
                                    Object[] objArr2 = {nativeAdsManager, strIAuthTabCallbackStub2, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj4};
                                    int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                                    int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function13);
                            obj3 = function13;
                        }
                        Function1 function14 = (Function1) obj3;
                        if (zOnTransact) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2006418270);
                            WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2131091957, new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), Boolean.valueOf(zAsBinder), deleteprofileAsBinder, (NativeAdsDto.Creative.Feed) creativeOnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, function14, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 3) & 57344), 0}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2131091956, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2006008574);
                            onWebAuthnIntent.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), zAsBinder, deleteprofileAsBinder, (NativeAdsDto.Creative.Feed) creativeOnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, (Function1<? super String, Unit>) function14, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 57344, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
                z6 = false;
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
                Object objOnMinimized102 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback6 | zOnNavigationEvent14 | z6 | zOnExtraCallback3 | zOnNavigationEvent3) {
                }
            }
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FeedVideo) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2005520200);
            boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(nativeAdsManager);
            boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
            int i18 = (i & 896) ^ 384;
            boolean z11 = (i18 > 256 && cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset)) || (i & 384) == 256;
            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback7 | zOnNavigationEvent15 | z11)) {
                int i19 = onExtraCallback + 75;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 72 / 0;
                    obj = objOnMinimized11;
                    if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function15 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda10
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4) {
                                int i21 = 2 % 2;
                                int i22 = onNavigationEvent + 75;
                                IAuthTabCallback = i22 % 128;
                                int i23 = i22 % 2;
                                NativeAdsManager nativeAdsManager2 = nativeAdsManager;
                                if (i23 == 0) {
                                    return JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(nativeAdsManager2, strIAuthTabCallbackStub2, adAsset, (NativeAdsEventLogType) obj4);
                                }
                                JavaScriptReplyProxyImplExternalSyntheticLambda0.onWarmupCompleted(nativeAdsManager2, strIAuthTabCallbackStub2, adAsset, (NativeAdsEventLogType) obj4);
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function15);
                        obj = function15;
                    }
                    Function1 function16 = (Function1) obj;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(nativeAdsManager);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
                    if (i18 <= 256) {
                        int i21 = onNavigationEvent + 79;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset)) {
                            z5 = true;
                        }
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback | zOnNavigationEvent | z5 | zOnExtraCallback2 | zOnNavigationEvent2)) {
                            Object obj4 = objOnMinimized12;
                            if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function1 function17 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda11
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj5) {
                                        int i23 = 2 % 2;
                                        int i24 = onWarmupCompleted + 31;
                                        onExtraCallbackWithResult = i24 % 128;
                                        int i25 = i24 % 2;
                                        NativeAdsManager nativeAdsManager2 = nativeAdsManager;
                                        String str = strIAuthTabCallbackStub2;
                                        if (i25 == 0) {
                                            JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult(nativeAdsManager2, str, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj5);
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                        Unit unitOnExtraCallbackWithResult = JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult(nativeAdsManager2, str, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj5);
                                        int i26 = onWarmupCompleted + 61;
                                        onExtraCallbackWithResult = i26 % 128;
                                        int i27 = i26 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function17);
                                obj4 = function17;
                            }
                            Function1 function18 = (Function1) obj4;
                            if (zOnTransact) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2004812563);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                                NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) creativeOnExtraCallbackWithResult;
                                List<String> listOnWarmupCompleted = adAsset.onWarmupCompleted();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
                                Iterator<T> it = listOnWarmupCompleted.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it.next()));
                                }
                                WindowAreaComponentApi3Requirements.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted2, zAsBinder, deleteprofileAsBinder, feedVideo, arrayList, z4, iAuthTabCallbackOnExtraCallbackWithResult, function16, function18, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 4128768, 0);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2004191571);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                                NativeAdsDto.Creative.FeedVideo feedVideo2 = (NativeAdsDto.Creative.FeedVideo) creativeOnExtraCallbackWithResult;
                                List<String> listOnWarmupCompleted2 = adAsset.onWarmupCompleted();
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted2, 10));
                                Iterator<T> it2 = listOnWarmupCompleted2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it2.next()));
                                }
                                onReceivedError.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted3, zAsBinder, deleteprofileAsBinder, feedVideo2, arrayList2, z4, iAuthTabCallbackOnExtraCallbackWithResult, function16, function18, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 4128768, 0);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                    if ((i & 384) != 256) {
                        z5 = true;
                    } else {
                        int i23 = onExtraCallback + 3;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        z5 = false;
                    }
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
                    Object objOnMinimized122 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback | zOnNavigationEvent | z5 | zOnExtraCallback2 | zOnNavigationEvent2)) {
                    }
                } else {
                    obj = objOnMinimized11;
                    if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    Function1 function162 = (Function1) obj;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(nativeAdsManager);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
                    if (i18 <= 256) {
                    }
                    if ((i & 384) != 256) {
                    }
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
                    Object objOnMinimized1222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback | zOnNavigationEvent | z5 | zOnExtraCallback2 | zOnNavigationEvent2)) {
                    }
                }
            }
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailBanner) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2003543206);
            int i25 = i << 3;
            onReceiveValue.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), strIAuthTabCallbackStub2, adAsset, (NativeAdsDto.Creative.ThumbnailBanner) creativeOnExtraCallbackWithResult, nativeAdsManager, z4, null, cameraCaptureResultEmptyCameraCaptureResult, (i & 896) | (57344 & i25) | (i25 & 458752), 64);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailVideo) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2003136858);
            int i26 = i << 3;
            onReceiveValue.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), strIAuthTabCallbackStub2, adAsset, ((NativeAdsDto.Creative.ThumbnailVideo) creativeOnExtraCallbackWithResult).IAuthTabCallbackDefault(), nativeAdsManager, z4, null, cameraCaptureResultEmptyCameraCaptureResult, (i & 896) | (57344 & i26) | (i26 & 458752), 64);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.RightBanner) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2002686366);
            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(nativeAdsManager);
            boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallbackStub2);
            boolean z12 = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(adAsset)) || (i & 384) == 256;
            boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
            boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(creativeOnExtraCallbackWithResult);
            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback8 | zOnNavigationEvent16 | z12 | zOnExtraCallback9 | zOnNavigationEvent17)) {
                Object obj5 = objOnMinimized13;
                if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function19 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsPreset$$ExternalSyntheticLambda12
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj6) {
                            int i27 = 2 % 2;
                            int i28 = onNavigationEvent + 21;
                            onExtraCallbackWithResult = i28 % 128;
                            if (i28 % 2 != 0) {
                                return JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallback(nativeAdsManager, strIAuthTabCallbackStub2, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj6);
                            }
                            int i29 = 46 / 0;
                            return JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallback(nativeAdsManager, strIAuthTabCallbackStub2, adAsset, context2, creativeOnExtraCallbackWithResult, (String) obj6);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function19);
                    obj5 = function19;
                }
                Function1 function110 = (Function1) obj5;
                if (zOnTransact) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2002254753);
                    addRearDisplayPresentationStatusListener.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), zAsBinder, deleteprofileAsBinder, (NativeAdsDto.Creative.RightBanner) creativeOnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, function110, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 57344, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2001842081);
                    WebViewCompatExternalSyntheticLambda3.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), Boolean.valueOf(zAsBinder), deleteprofileAsBinder, (NativeAdsDto.Creative.RightBanner) creativeOnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, function110, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 3) & 57344), 0}, -1278614798, 1278614799, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2142772628);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
    }

    public final String IAuthTabCallback(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(nativeAdsManager, "");
        boolean zOnTransact = adAsset.onTransact();
        Object[] objArr = {this, adAsset.onExtraCallbackWithResult()};
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) onExtraCallback(1242647353, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1242647353, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
        if (!(!onExtraCallback(str, thumbnailBanner, nativeAdsManager)) && thumbnailBanner != null) {
            return "thumbnail:" + zOnTransact;
        }
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Normal) {
            return "normal:" + zOnTransact;
        }
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Feed) {
            return "feed:" + zOnTransact;
        }
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FeedVideo) {
            return "feedVideo:" + zOnTransact;
        }
        if ((creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailBanner) || (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailVideo)) {
            return "thumbnail:" + zOnTransact;
        }
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.RightBanner) {
            return "rightBanner:" + zOnTransact;
        }
        String str2 = "unknown:" + zOnTransact;
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[PHI: r5 r15
      0x0086: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v9 java.lang.String) binds: [B:29:0x0084, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r15v9 java.lang.Object) = (r15v8 java.lang.Object), (r15v10 java.lang.Object) binds: [B:29:0x0084, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(String str, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, NativeAdsManager nativeAdsManager) {
        String interfaceDescriptor;
        NativeAdsDto.Mediation mediation;
        Iterator<T> it;
        Object next;
        String str2;
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        int i = 2 % 2;
        AdmobAdFormat admobAdFormat = null;
        if (thumbnailBanner != null) {
            interfaceDescriptor = thumbnailBanner.getInterfaceDescriptor();
        } else {
            int i2 = onNavigationEvent + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 3;
            }
            interfaceDescriptor = null;
        }
        if (interfaceDescriptor != null && !StringsKt.isBlank(interfaceDescriptor)) {
            NativeAdsDto nativeAdsDtoOnNavigationEvent = nativeAdsManager.onNavigationEvent(str);
            if (nativeAdsDtoOnNavigationEvent == null || (extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact()) == null) {
                mediation = new NativeAdsDto.Mediation((String) null, (List) null, (NativeAdsDto.AdmobInfo) null, (NativeAdsDto.MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
                it = mediation.IAuthTabCallbackDefault().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int i4 = onNavigationEvent + 37;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            next = it.next();
                            str2 = (String) next;
                            if (StringsKt.equals(str2, "ADMOB", true)) {
                                break;
                            }
                        } else {
                            next = it.next();
                            str2 = (String) next;
                            if (StringsKt.equals(str2, "ADMOB", false)) {
                                break;
                            }
                            int i5 = onExtraCallback + 115;
                            onNavigationEvent = i5 % 128;
                            if (i5 % 2 == 0) {
                                if (StringsKt.equals(str2, "TOSS", true)) {
                                    break;
                                }
                            } else if (StringsKt.equals(str2, "TOSS", true)) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (StringsKt.equals((String) next, "ADMOB", true)) {
                    NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediation.onExtraCallbackWithResult();
                    if (admobInfoOnExtraCallbackWithResult != null) {
                        admobAdFormat = (AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038);
                    }
                    if (admobAdFormat == AdmobAdFormat.NATIVE) {
                        return true;
                    }
                }
            } else {
                int i6 = onExtraCallback + 35;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                mediation = extraInfoOnTransact.onNavigationEvent();
                if (mediation == null) {
                }
                it = mediation.IAuthTabCallbackDefault().iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                if (StringsKt.equals((String) next, "ADMOB", true)) {
                }
            }
        }
        return false;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[1];
        int i = 2 % 2;
        if (creative instanceof NativeAdsDto.Creative.Normal) {
            NativeAdsDto.Creative.Normal normal = (NativeAdsDto.Creative.Normal) creative;
            return new NativeAdsDto.Creative.ThumbnailBanner(normal.IAuthTabCallback(), normal.asBinder(), normal.asBinder(), "", normal.onWarmupCompleted(), normal.asInterface(), normal.IAuthTabCallbackStub(), (String) null, normal.IAuthTabCallbackDefault(), 128, (DefaultConstructorMarker) null);
        }
        if (creative instanceof NativeAdsDto.Creative.Feed) {
            NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) creative;
            return new NativeAdsDto.Creative.ThumbnailBanner(feed.IAuthTabCallback(), feed.getInterfaceDescriptor(), feed.getInterfaceDescriptor(), "", feed.onWarmupCompleted(), feed.asInterface(), feed.IAuthTabCallbackStub(), feed.asBinder(), feed.onTransact());
        }
        if (creative instanceof NativeAdsDto.Creative.FeedVideo) {
            return ((NativeAdsDto.Creative.FeedVideo) creative).IAuthTabCallback_Parcel();
        }
        if (creative instanceof NativeAdsDto.Creative.ThumbnailBanner) {
            return (NativeAdsDto.Creative.ThumbnailBanner) creative;
        }
        if (creative instanceof NativeAdsDto.Creative.ThumbnailVideo) {
            return ((NativeAdsDto.Creative.ThumbnailVideo) creative).IAuthTabCallbackDefault();
        }
        if (!(creative instanceof NativeAdsDto.Creative.RightBanner)) {
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        NativeAdsDto.Creative.RightBanner rightBanner = (NativeAdsDto.Creative.RightBanner) creative;
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = new NativeAdsDto.Creative.ThumbnailBanner(rightBanner.IAuthTabCallback(), rightBanner.asBinder(), rightBanner.asBinder(), "", rightBanner.onWarmupCompleted(), rightBanner.asInterface(), rightBanner.IAuthTabCallbackStub(), (String) null, rightBanner.IAuthTabCallbackDefault(), 128, (DefaultConstructorMarker) null);
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return thumbnailBanner;
        }
        throw null;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, NativeAdsDto.Creative creative) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(1182430511, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1182430509, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{context, creative});
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, Context context, NativeAdsDto.Creative creative, String str2) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(322586800, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -322586797, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{nativeAdsManager, str, adAsset, context, creative, str2});
    }

    private static final Unit onNavigationEvent(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, Context context, NativeAdsDto.Creative creative, String str2) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-69863308, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 69863313, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{nativeAdsManager, str, adAsset, context, creative, str2});
    }

    private static final Unit onTransact(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, Context context, NativeAdsDto.Creative creative, String str2) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(1218455292, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1218455286, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{nativeAdsManager, str, adAsset, context, creative, str2});
    }

    private static final Unit IAuthTabCallbackStub(Context context, NativeAdsDto.Creative creative) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(1117654836, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1117654832, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{context, creative});
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(-964809370, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 964809371, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue();
    }

    private final NativeAdsDto.Creative.ThumbnailBanner IAuthTabCallback(NativeAdsDto.Creative creative) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (NativeAdsDto.Creative.ThumbnailBanner) onExtraCallback(1242647353, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1242647353, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this, creative});
    }
}
