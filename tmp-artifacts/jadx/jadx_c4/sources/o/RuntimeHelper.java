package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.tmoney.LiveCheckConstants;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerType;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.RuntimeHelper;
import o.SessionProcessorCaptureCallback;
import o.SetDetectableSize;
import o.createCameraCaptureCallback;
import o.getPrivacyDestinationUri;
import o.handleNativeAdClick;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.readFully;
import o.removeObserverLocked;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RuntimeHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onExtraCallback = {64978, 64963, 64981, 64924, 64976, 64960, 65065, 64961, 64989, 64926, 64925, 64982, 64905, 64966, 64991, 64985, 64988, 64983, 65004, 64990, 64980, 64977, 64967, 64987, 64986};
    private static char onWarmupCompleted = 51244;

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), -99806412, C40Encoder.onExtraCallback(), iOnExtraCallback, 99806414, objArr, iOnExtraCallback2);
        int i6 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, long j, long j2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(str, j, j2, i, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, CreditHomeLargeBannerResponse.DualRowContents dualRowContents, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function1, dualRowContents, str, creditHomeLargeBannerResponse};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        if (i3 != 0) {
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), 937706777, C40Encoder.onExtraCallback(), iOnExtraCallback, -937706777, objArr, iOnExtraCallback3);
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 = (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, String str2, String str3, String str4, String str5, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, creditHomeLargeBannerResponse, str2, str3, str4, str5, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(readfully, setorientationdegrees);
        }
        onWarmupCompleted(readfully, setorientationdegrees);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i4)) | i8 | (~(i2 | i4));
        int i10 = (~((~i2) | i5)) | (~(i5 | i4));
        int i11 = (~((~i4) | i7)) | i8;
        int i12 = i5 + i2 + i6 + (1821889583 * i3) + ((-349070011) * i);
        int i13 = i12 * i12;
        int i14 = (575745661 * i5) + 325058560 + (1920428227 * i2) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i6) + (473956352 * i3) + (1723858944 * i) + ((-1436549120) * i13);
        int i15 = (i5 * 921699331) + 387174459 + (i2 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i6 * 921699455) + (i3 * 347275089) + (i * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        CreditHomeLargeBannerResponse.DualRowContents dualRowContents = (CreditHomeLargeBannerResponse.DualRowContents) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, creditHomeLargeBannerResponse, dualRowContents, setDetectableSize);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, long j, long j2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(str, j, j2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(str, j, j2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, String str2, String str3, String str4, String str5, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(str, creditHomeLargeBannerResponse, str2, str3, str4, str5, function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, String str2, String str3, String str4, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, creditHomeLargeBannerResponse, str2, str3, str4, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, creditHomeLargeBannerResponse, str2, str3, str4, setDetectableSize);
        int i3 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, String str, String str2, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {function1, str, str2, creditHomeLargeBannerResponse, str3, str4, str5};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), -243180836, C40Encoder.onExtraCallback(), iOnExtraCallback, 243180837, objArr, iOnExtraCallback2);
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(addFixedPosition addfixedposition, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(addfixedposition, sessionProcessorCaptureCallback);
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditHomeLargeBannerResponse.DualRowContents dualRowContents, SetDetectableSize setDetectableSize) throws Throwable {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{6, '\f', 1, '\f', 13898, 13898, '\f', 6}, (byte) (98 - Color.argb(0, 0, 0, 0)), 8 - TextUtils.indexOf("", ""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, zzgsa.onWarmupCompleted())).name());
        setDetectableSize.onExtraCallback("log_type", creditHomeLargeBannerResponse.asInterface());
        Object[] objArr2 = new Object[1];
        a(new char[]{23, 20, 24, '\f', 13941}, (byte) (TextUtils.lastIndexOf("", '0') + 119), Process.getGidForName("") + 6, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), dualRowContents.IAuthTabCallback());
        CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult = dualRowContents.onExtraCallbackWithResult();
        String strIAuthTabCallback = null;
        if (rowItemOnExtraCallbackWithResult != null) {
            int i4 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            objOnNavigationEvent = rowItemOnExtraCallbackWithResult.onNavigationEvent();
        } else {
            objOnNavigationEvent = null;
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{23, 11, 13838, 13838, 18, 6, 17, 23, 20, 23, '\n', '\f'}, (byte) (TextUtils.getOffsetBefore("", 0) + 32), Process.getGidForName("") + 13, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), objOnNavigationEvent);
        CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult2 = dualRowContents.onExtraCallbackWithResult();
        if ((rowItemOnExtraCallbackWithResult2 != null ? rowItemOnExtraCallbackWithResult2.onExtraCallbackWithResult() : null) == null || !(!StringsKt.isBlank(r2))) {
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult3 = dualRowContents.onExtraCallbackWithResult();
            if (rowItemOnExtraCallbackWithResult3 != null) {
                strIAuthTabCallback = rowItemOnExtraCallbackWithResult3.IAuthTabCallback();
            }
        } else {
            int i6 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                dualRowContents.onExtraCallbackWithResult();
                strIAuthTabCallback.hashCode();
                throw null;
            }
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult4 = dualRowContents.onExtraCallbackWithResult();
            String strIAuthTabCallback2 = rowItemOnExtraCallbackWithResult4 != null ? rowItemOnExtraCallbackWithResult4.IAuthTabCallback() : null;
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult5 = dualRowContents.onExtraCallbackWithResult();
            if (rowItemOnExtraCallbackWithResult5 != null) {
                int i7 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    rowItemOnExtraCallbackWithResult5.onExtraCallbackWithResult();
                    strIAuthTabCallback.hashCode();
                    throw null;
                }
                strIAuthTabCallback = rowItemOnExtraCallbackWithResult5.onExtraCallbackWithResult();
                int i8 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 % 2;
                }
            }
            strIAuthTabCallback = strIAuthTabCallback2 + "|" + strIAuthTabCallback;
        }
        setDetectableSize.onExtraCallback("button_value", strIAuthTabCallback);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        String strOnExtraCallback;
        Function1 function1 = (Function1) objArr[0];
        final CreditHomeLargeBannerResponse.DualRowContents dualRowContents = (CreditHomeLargeBannerResponse.DualRowContents) objArr[1];
        final String str = (String) objArr[2];
        final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[3];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1652780L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 11;
                onWarmupCompleted = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    Object[] objArr2 = {str, creditHomeLargeBannerResponse, dualRowContents, (SetDetectableSize) obj};
                    int iOnExtraCallback = C40Encoder.onExtraCallback();
                    int iOnExtraCallback2 = C40Encoder.onExtraCallback();
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr3 = {str, creditHomeLargeBannerResponse, dualRowContents, (SetDetectableSize) obj};
                int iOnExtraCallback3 = C40Encoder.onExtraCallback();
                int iOnExtraCallback4 = C40Encoder.onExtraCallback();
                Unit unit = (Unit) RuntimeHelper.onNavigationEvent(C40Encoder.onExtraCallback(), 1338497235, C40Encoder.onExtraCallback(), iOnExtraCallback3, -1338497232, objArr3, iOnExtraCallback4);
                int i4 = onNavigationEvent + 43;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult = dualRowContents.onExtraCallbackWithResult();
        if (rowItemOnExtraCallbackWithResult != null) {
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                rowItemOnExtraCallbackWithResult.onExtraCallback();
                throw null;
            }
            strOnExtraCallback = rowItemOnExtraCallbackWithResult.onExtraCallback();
            if (strOnExtraCallback == null) {
                int i3 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallback = "";
            }
        }
        function1.invoke(strOnExtraCallback);
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked IAuthTabCallback(addFixedPosition addfixedposition, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{addfixedposition}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0.1f)), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())}), 0L, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda8
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 29;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = RuntimeHelper.onExtraCallbackWithResult(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                int i5 = onWarmupCompleted + 59;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, readfully, 0.0f, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @NotNull final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        long jIPostMessageService_Parcel;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        String strOnExtraCallbackWithResult;
        String strOnExtraCallback;
        Object obj;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(538632078);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i6 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            int i12 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i12 % 128;
            Object obj2 = null;
            if (i12 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(538632078, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBanner (CreditHomeDualRowBanner.kt:52)");
            }
            final CreditHomeLargeBannerResponse.DualRowContents dualRowContentsOnTransact = creditHomeLargeBannerResponse.onTransact();
            if (dualRowContentsOnTransact == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = onExtraCallbackWithResult + 113;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda4
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i15 = 2 % 2;
                            int i16 = onWarmupCompleted + 45;
                            onExtraCallback = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitIAuthTabCallback = RuntimeHelper.IAuthTabCallback(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i18 = onWarmupCompleted + 15;
                            onExtraCallback = i18 % 128;
                            if (i18 % 2 != 0) {
                                int i19 = 19 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return;
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            final addFixedPosition addfixedpositionIAuthTabCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            boolean z = dualRowContentsOnTransact.onExtraCallback() == null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2065601319);
                jIPostMessageService_Parcel = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2065600231);
                jIPostMessageService_Parcel = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IPostMessageService_Parcel();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, jIPostMessageService_Parcel, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f))));
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), (DefaultConstructorMarker) null)), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(189472782);
                boolean z2 = (i2 & 112) == 32;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(dualRowContentsOnTransact);
                i3 = i2;
                boolean z3 = (i2 & 7168) == 2048;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z3 || (z2 | zOnExtraCallback | zOnExtraCallback2)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke() {
                            int i15 = 2 % 2;
                            int i16 = IAuthTabCallback + 41;
                            onExtraCallback = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitOnExtraCallback = RuntimeHelper.onExtraCallback(function1, dualRowContentsOnTransact, str, creditHomeLargeBannerResponse);
                            int i18 = onExtraCallback + 37;
                            IAuthTabCallback = i18 % 128;
                            int i19 = i18 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                    obj = function0;
                } else {
                    obj = objOnMinimized;
                }
                quirksExternalSyntheticBackport0OnExtraCallback = configureReward.onExtraCallback(quirksExternalSyntheticBackport02, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, (Function0) obj, 251, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                i3 = i2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(190337682);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport02;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = quirksExternalSyntheticBackport0OnExtraCallback3.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback4);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i15 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 7, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback5);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = CaptureNoResponseQuirk.onExtraCallback(FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback.onExtraCallbackWithResult(quirksExternalSyntheticBackport02), 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-120.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-40.0f));
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(addfixedpositionIAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda6
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallbackWithResult + 59;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        removeObserverLocked removeobserverlockedOnWarmupCompleted = RuntimeHelper.onWarmupCompleted(addfixedpositionIAuthTabCallback, (SessionProcessorCaptureCallback) obj3);
                        int i20 = onWarmupCompleted + 83;
                        onExtraCallbackWithResult = i20 % 128;
                        int i21 = i20 % 2;
                        return removeobserverlockedOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback6, (Function1) objOnMinimized2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, 12, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback7);
            Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i17 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback5);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback8 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, 13, (Object) null);
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Lottie;
            handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f));
            Object[] objArr = new Object[1];
            a(new char[]{24, 23, 21, 2, 7, '\n', 13810, 13810, 7, 20, 2, 20, 4, '\t', '\f', 20, 15, 6, '\n', 15, 4, 24, 4, '\r', 17, 21, 23, 20, '\n', 6, 1, 23, '\n', 14, 14, 6, '\t', 22, 13863, 13863, '\n', '\f', 5, 6, 15, 4, 13875, 13875, 7, 4, 5, '\n', 20, '\f', 20, '\n', 18, 6}, (byte) (61 - (ViewConfiguration.getLongPressTimeout() >> 16)), 58 - TextUtils.getOffsetBefore("", 0), objArr);
            setMainImageUri.IAuthTabCallback(((String) objArr[0]).intern(), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0OnExtraCallback8, onWarmupCompleted2, 0L, Integer.MAX_VALUE, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 200118, 0, 8144);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = CaptureNoResponseQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 5, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-6.0f), 0.0f, 2, (Object) null);
            String strIAuthTabCallback = dualRowContentsOnTransact.IAuthTabCallback();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallback == null ? "" : strIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted6, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IAuthTabCallbackDefault()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult = dualRowContentsOnTransact.onExtraCallbackWithResult();
            String strOnNavigationEvent = rowItemOnExtraCallbackWithResult != null ? rowItemOnExtraCallbackWithResult.onNavigationEvent() : null;
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult2 = dualRowContentsOnTransact.onExtraCallbackWithResult();
            String strIAuthTabCallback2 = rowItemOnExtraCallbackWithResult2 != null ? rowItemOnExtraCallbackWithResult2.IAuthTabCallback() : null;
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult3 = dualRowContentsOnTransact.onExtraCallbackWithResult();
            if (rowItemOnExtraCallbackWithResult3 != null) {
                int i18 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                strOnExtraCallbackWithResult = rowItemOnExtraCallbackWithResult3.onExtraCallbackWithResult();
            } else {
                strOnExtraCallbackWithResult = null;
            }
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult4 = dualRowContentsOnTransact.onExtraCallbackWithResult();
            int i20 = ((i3 >> 3) & 126) | ((i3 << 9) & 3670016);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            onNavigationEvent(str, creditHomeLargeBannerResponse, strOnNavigationEvent, strIAuthTabCallback2, strOnExtraCallbackWithResult, rowItemOnExtraCallbackWithResult4 != null ? rowItemOnExtraCallbackWithResult4.onExtraCallback() : null, function1, !z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i20, 0);
            if (dualRowContentsOnTransact.onExtraCallback() != null) {
                int i21 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1406814896);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).mayLaunchUrl(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback = dualRowContentsOnTransact.onExtraCallback();
                String strOnNavigationEvent2 = rowItemOnExtraCallback != null ? rowItemOnExtraCallback.onNavigationEvent() : null;
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback2 = dualRowContentsOnTransact.onExtraCallback();
                String strIAuthTabCallback3 = rowItemOnExtraCallback2 != null ? rowItemOnExtraCallback2.IAuthTabCallback() : null;
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback3 = dualRowContentsOnTransact.onExtraCallback();
                String strOnExtraCallbackWithResult2 = rowItemOnExtraCallback3 != null ? rowItemOnExtraCallback3.onExtraCallbackWithResult() : null;
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback4 = dualRowContentsOnTransact.onExtraCallback();
                if (rowItemOnExtraCallback4 != null) {
                    int i23 = IAuthTabCallback + 9;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    strOnExtraCallback = rowItemOnExtraCallback4.onExtraCallback();
                } else {
                    strOnExtraCallback = null;
                }
                onNavigationEvent(str, creditHomeLargeBannerResponse, strOnNavigationEvent2, strIAuthTabCallback3, strOnExtraCallbackWithResult2, strOnExtraCallback, function1, false, cameraCaptureResultEmptyCameraCaptureResult2, i20, 128);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1406034564);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj4, Object obj5) throws Throwable {
                    int i25 = 2 % 2;
                    int i26 = IAuthTabCallback + 85;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    Unit unitOnExtraCallbackWithResult = RuntimeHelper.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i28 = onWarmupCompleted + 13;
                    IAuthTabCallback = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 77 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, String str2, String str3, String str4, SetDetectableSize setDetectableSize) throws Throwable {
        String str5;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{6, '\f', 1, '\f', 13898, 13898, '\f', 6}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 98), 8 - Color.green(0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        setDetectableSize.onExtraCallback("banner_type", ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, iOnWarmupCompleted)).name());
        setDetectableSize.onExtraCallback("log_type", creditHomeLargeBannerResponse.asInterface());
        CreditHomeLargeBannerResponse.DualRowContents dualRowContentsOnTransact = creditHomeLargeBannerResponse.onTransact();
        String strIAuthTabCallback = null;
        if (dualRowContentsOnTransact != null) {
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                dualRowContentsOnTransact.IAuthTabCallback();
                throw null;
            }
            strIAuthTabCallback = dualRowContentsOnTransact.IAuthTabCallback();
        } else {
            int i3 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{23, 20, 24, '\f', 13941}, (byte) (TextUtils.getCapsMode("", 0, 0) + 118), View.getDefaultSize(0, 0) + 5, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), strIAuthTabCallback);
        Object[] objArr3 = new Object[1];
        a(new char[]{23, 11, 13838, 13838, 18, 6, 17, 23, 20, 23, '\n', '\f'}, (byte) (TextUtils.getOffsetBefore("", 0) + 32), 12 - TextUtils.getOffsetBefore("", 0), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str2);
        if (str3 != null) {
            int i5 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (StringsKt.isBlank(str3)) {
                str5 = str4;
            } else {
                str5 = str4 + "|" + str3;
            }
        }
        setDetectableSize.onExtraCallback("button_value", str5);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        String str = (String) objArr[1];
        final String str2 = (String) objArr[2];
        final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[3];
        final String str3 = (String) objArr[4];
        final String str4 = (String) objArr[5];
        final String str5 = (String) objArr[6];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1652780L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda10
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 123;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = RuntimeHelper.onWarmupCompleted(str2, creditHomeLargeBannerResponse, str3, str4, str5, (SetDetectableSize) obj);
                if (i4 == 0) {
                    int i5 = 66 / 0;
                }
                int i6 = onNavigationEvent + 95;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        if (str == null) {
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i5 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(74676596, i, -1, "im.toss.feature.credit.ui.main.home.component.DualRow.<anonymous>.<anonymous> (CreditHomeDualRowBanner.kt:219)");
            }
            String str3 = str == null ? "" : str;
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            onNavigationEvent(str3, jOnExtraCallback, jLongValue2, iAuthTabCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (str2 != null) {
                int i9 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-102313881);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
                if (!(!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue())) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1250218373);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onRelationshipValidationResult();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1250217413);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0AsBinder, jLongValue, (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                onNavigationEvent(str2, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), iAuthTabCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-101753618);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            setIconUri.IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onTransact(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, StackSampler3.onExtraCallback.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 12585990, 118);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i13 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i13 % 128;
        int i14 = i13 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final String str, @NotNull final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, @NotNull final Function1<? super String, Unit> function1, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z4;
        String str6;
        boolean z5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        Object obj;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1930868587);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            int i6 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 131072 : 65536;
        }
        Object obj2 = null;
        if ((i & 1572864) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i8 = IAuthTabCallback + 3;
                int i9 = i8 % 128;
                onExtraCallbackWithResult = i9;
                if (i8 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i10 = i9 + 45;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        int i12 = i2 & 128;
        if (i12 == 0) {
            if ((i & 12582912) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 8388608 : 4194304;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) == 4793490, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                z3 = z2;
            } else {
                if (i12 != 0) {
                    int i13 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1930868587, i3, -1, "im.toss.feature.credit.ui.main.home.component.DualRow (CreditHomeDualRowBanner.kt:180)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                if (z4) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(9502893);
                    boolean z6 = (i3 & 14) == 4;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse);
                    if ((i3 & 896) == 256) {
                        int i15 = onExtraCallbackWithResult + 7;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z7 = (57344 & i3) == 16384;
                    str6 = "";
                    boolean z8 = !((i3 & 7168) != 2048);
                    boolean z9 = (3670016 & i3) == 1048576;
                    boolean z10 = (i3 & 458752) == 131072;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((z6 | zOnExtraCallback | z5 | z7 | z8 | z9) || z10) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnExtraCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i17 = 2 % 2;
                                int i18 = onExtraCallback + 51;
                                onWarmupCompleted = i18 % 128;
                                int i19 = i18 % 2;
                                Function1 function12 = function1;
                                String str7 = str5;
                                if (i19 != 0) {
                                    RuntimeHelper.onWarmupCompleted(function12, str7, str, creditHomeLargeBannerResponse, str2, str4, str3);
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = RuntimeHelper.onWarmupCompleted(function12, str7, str, creditHomeLargeBannerResponse, str2, str4, str3);
                                int i20 = onWarmupCompleted + 107;
                                onExtraCallback = i20 % 128;
                                if (i20 % 2 == 0) {
                                    int i21 = 67 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0);
                        obj = function0;
                    } else {
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnExtraCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        obj = objOnMinimized;
                    }
                    quirksExternalSyntheticBackport0OnExtraCallback = configureReward.onExtraCallback(quirksExternalSyntheticBackport0, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, (Function0) obj, 251, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    str6 = "";
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(10257991);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnWarmupCompleted.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult2, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                    int i17 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        obj2.hashCode();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                if (str2 == null) {
                    int i18 = onExtraCallbackWithResult + 21;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    str6 = str2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str6, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                ImageLoaderBuilderExternalSyntheticLambda5.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -965895646, new Object[]{rowScopeInstance, Float.valueOf(1.0f), cameraCaptureResultEmptyCameraCaptureResult2, 54}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 965895647);
                ZslControlImplExternalSyntheticLambda2.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, focusMeteringControlExternalSyntheticLambda12.onWarmupCompleted(), focusMeteringControlExternalSyntheticLambda12.onNavigationEvent(), onextracallbackwithresult.IAuthTabCallbackDefault(), 0, 0, ForwardingCameraControl.onExtraCallback(74676596, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallbackWithResult + 63;
                        onWarmupCompleted = i21 % 128;
                        if (i21 % 2 != 0) {
                            Object[] objArr = {str3, str4, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                            int iOnExtraCallback = C40Encoder.onExtraCallback();
                            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {str3, str4, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
                        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
                        Unit unit = (Unit) RuntimeHelper.onNavigationEvent(C40Encoder.onExtraCallback(), 1666621247, C40Encoder.onExtraCallback(), iOnExtraCallback3, -1666621243, objArr2, iOnExtraCallback4);
                        int i22 = onExtraCallbackWithResult + 79;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1576368, 49);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                z3 = z4;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallback + 57;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitOnExtraCallbackWithResult = RuntimeHelper.onExtraCallbackWithResult(str, creditHomeLargeBannerResponse, str2, str3, str4, str5, function1, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i23 = onExtraCallback + 121;
                        IAuthTabCallback = i23 % 128;
                        if (i23 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallback;
        char c = '0';
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myTid() >> 22) + 26, TextUtils.lastIndexOf("", c) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionChild(0L) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = '0';
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 26 - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 16800355, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 24825), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 73, TextUtils.lastIndexOf("", '0') + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $11 + 77;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final void onNavigationEvent(final String str, final long j, final long j2, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        int i5;
        String str2 = str;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(382174315);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i7 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i7 % 128;
                i5 = i7 % 2 != 0 ? 108 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            int i8 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 5;
            }
        }
        if ((i2 & 384) == 0) {
            int i10 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i12 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i14 = i3;
        int i15 = 0;
        if ((i14 & 1171) != 1170) {
            int i16 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i14 & 1)) {
            int i18 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i18 % 128;
            int i19 = i18 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(382174315, i14, -1, "im.toss.feature.credit.ui.main.home.component.NumericAwareRollingNumber (CreditHomeDualRowBanner.kt:262)");
                int i20 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
            }
            while (true) {
                if (i15 >= str.length()) {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-602703302);
                    int i22 = i14 << 9;
                    r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback("", (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, j2, j, 0L, createCameraCaptureCallback.onExtraCallback(i), 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onExtraCallback.onExtraCallback.onNavigationEvent, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, str, 0L, false, false, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i14 << 3) & 7168) | 6 | (i22 & 57344) | (i22 & 3670016), ((i14 << 18) & 3670016) | 432, 0, 4122534);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    break;
                }
                if (Character.isDigit(str2.charAt(i15))) {
                    int i23 = IAuthTabCallback + 31;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-603007846);
                    int i25 = i14 << 9;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, j2, j, 0L, createCameraCaptureCallback.onExtraCallback(i), 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onExtraCallback.onExtraCallback.onNavigationEvent, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, "", 0L, false, false, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 & 14) | ((i14 << 3) & 7168) | (i25 & 57344) | (i25 & 3670016), 1573296, 0, 4122534);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    break;
                }
                i15++;
                str2 = str;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i26 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i26 % 128;
                if (i26 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualRowBannerKt$$ExternalSyntheticLambda9
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i27 = 2 % 2;
                    int i28 = onNavigationEvent + 49;
                    onWarmupCompleted = i28 % 128;
                    int i29 = i28 % 2;
                    Unit unitOnWarmupCompleted = RuntimeHelper.onWarmupCompleted(str, j, j2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i30 = onWarmupCompleted + 47;
                    onNavigationEvent = i30 % 128;
                    int i31 = i30 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, str2, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), 1666621247, C40Encoder.onExtraCallback(), iOnExtraCallback, -1666621243, objArr, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditHomeLargeBannerResponse.DualRowContents dualRowContents, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), 1338497235, iOnExtraCallback3, iOnExtraCallback, -1338497232, new Object[]{str, creditHomeLargeBannerResponse, dualRowContents, setDetectableSize}, iOnExtraCallback2);
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), -99806412, C40Encoder.onExtraCallback(), iOnExtraCallback, 99806414, objArr, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(Function1 function1, CreditHomeLargeBannerResponse.DualRowContents dualRowContents, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), 937706777, iOnExtraCallback3, iOnExtraCallback, -937706777, new Object[]{function1, dualRowContents, str, creditHomeLargeBannerResponse}, iOnExtraCallback2);
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, String str, String str2, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, String str3, String str4, String str5) {
        Object[] objArr = {function1, str, str2, creditHomeLargeBannerResponse, str3, str4, str5};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onNavigationEvent(C40Encoder.onExtraCallback(), -243180836, C40Encoder.onExtraCallback(), iOnExtraCallback, 243180837, objArr, iOnExtraCallback2);
    }
}
