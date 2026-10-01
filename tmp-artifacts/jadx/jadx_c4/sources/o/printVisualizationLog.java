package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.features.credit.data.response.CreditHomeHeaderCta;
import im.toss.features.credit.data.response.CreditHomeHeaderItem;
import im.toss.features.credit.data.response.CreditHomeHeaderProgressInfo;
import im.toss.features.credit.data.response.CreditHomeHeaderResponse;
import im.toss.features.credit.data.response.CreditHomeHeaderTextColor;
import im.toss.features.credit.data.response.CreditHomeHeaderType;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerType;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.createWifiConfiguration;
import o.getKekid;
import o.getViewTypeCount;
import o.printVisualizationLog;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.w3b;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class printVisualizationLog {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[CreditHomeHeaderType.values().length];
            try {
                iArr[CreditHomeHeaderType.POSITIVE.ordinal()] = 1;
                int i = onExtraCallback + 71;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreditHomeHeaderType.NEGATIVE.ordinal()] = 2;
                int i4 = onExtraCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeHeaderResponse creditHomeHeaderResponse, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, Function0 function0, Function1 function1, Function2 function2, Function1 function12, Function1 function13, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeHeaderResponse, creditHomeLargeBannerResponse, z, function0, function1, function2, function12, function13, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, creditHomeHeaderResponse);
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeHeaderItem creditHomeHeaderItem, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeHeaderItem, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(CreditHomeHeaderResponse creditHomeHeaderResponse, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, Function0 function0, Function1 function1, Function2 function2, Function1 function12, Function1 function13, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(creditHomeHeaderResponse, creditHomeLargeBannerResponse, z, function0, function1, function2, function12, function13, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{function2, Integer.valueOf(i), creditHomeHeaderItem}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 239338484, getKekid.onExtraCallback(), -239338479);
        int i5 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CreditHomeHeaderItem creditHomeHeaderItem, boolean z, boolean z2, long j, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, creditHomeHeaderItem, z, z2, j, graphicDeviceInfo, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, creditHomeHeaderItem, z, z2, j, graphicDeviceInfo, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, String str, CreditHomeHeaderItem creditHomeHeaderItem, long j, GraphicDeviceInfo graphicDeviceInfo, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(z, str, creditHomeHeaderItem, j, graphicDeviceInfo, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(z, str, creditHomeHeaderItem, j, graphicDeviceInfo, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeHeaderCta creditHomeHeaderCta, Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem, boolean z, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{creditHomeHeaderCta, function1, creditHomeHeaderItem, Boolean.valueOf(z), rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -2143451427, getKekid.onExtraCallback(), 2143451427);
        int i5 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, creditHomeHeaderItem}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -336545249, getKekid.onExtraCallback(), 336545255);
        int i4 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, creditHomeHeaderResponse);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onWarmupCompleted(new Object[]{function1, creditHomeLargeBannerResponse}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1430947184, getKekid.onExtraCallback(), -1430947180);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(function2, i, creditHomeHeaderItem);
        }
        IAuthTabCallback(function2, i, creditHomeHeaderItem);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CreditHomeHeaderResponse creditHomeHeaderResponse, CreditHomeHeaderItem creditHomeHeaderItem, CreditHomeHeaderItem creditHomeHeaderItem2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, creditHomeHeaderResponse, creditHomeHeaderItem, creditHomeHeaderItem2);
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, creditHomeHeaderItem);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = i6 | i7 | i8;
        int i10 = ~(i2 | i7);
        int i11 = (~(i7 | i8)) | (~i6);
        int i12 = i6 + i4 + i5 + ((-1537480081) * i) + ((-1176924877) * i3);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i6) - 1179058176) + ((-1443770816) * i4) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i5) + (1226178560 * i) + ((-1044512768) * i3) + (1201733632 * i13);
        int i15 = (i6 * 1018573086) + 1206756779 + (i4 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i5 * 1018572655) + (i * (-758184159)) + (i3 * (-595421667)) + (i13 * (-1647378432));
        switch (i14 + (i15 * i15 * 1518272512)) {
            case 1:
                Function1 function1 = (Function1) objArr[0];
                CreditHomeHeaderResponse creditHomeHeaderResponse = (CreditHomeHeaderResponse) objArr[1];
                int i16 = 2 % 2;
                int i17 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1, creditHomeHeaderResponse);
                int i19 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                return unitIAuthTabCallbackStub;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, Function0 function0, Function1 function12, boolean z2, boolean z3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeLargeBannerResponse, function1, z, function0, function12, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function1, creditHomeLargeBannerResponse, Boolean.valueOf(z)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(objArr, iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback4, -511455377, iOnExtraCallback2, 511455380);
        int i4 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CreditHomeHeaderItem creditHomeHeaderItem, boolean z, boolean z2, long j, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, creditHomeHeaderItem, z, z2, j, graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, creditHomeHeaderItem, z, z2, j, graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (zBooleanValue) {
            int i5 = i2 + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                function1.invoke(creditHomeLargeBannerResponse);
            } else {
                function1.invoke(creditHomeLargeBannerResponse);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(creditHomeLargeBannerResponse);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        function1.invoke(creditHomeLargeBannerResponse);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, final Function1 function1, boolean z, Function0 function0, final Function1 function12, boolean z2, boolean z3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z4;
        String strOnExtraCallback;
        String strOnExtraCallbackWithResult;
        String strIAuthTabCallback;
        setByteOrder setbyteorderOnNavigationEvent;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted2;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent2;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 61;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z4 = true;
        } else {
            z4 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(541899181, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSection.<anonymous>.<anonymous> (CreditHomeTopReasonSection.kt:88)");
                    virtualCameraControlExternalSyntheticLambda1.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(541899181, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSection.<anonymous>.<anonymous> (CreditHomeTopReasonSection.kt:88)");
            }
            if (creditHomeLargeBannerResponse != null) {
                int i9 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1063472359);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1063472359);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                String strValueOf = String.valueOf((dualColumnContentsIAuthTabCallbackDefault == null || (columnContentOnNavigationEvent3 = dualColumnContentsIAuthTabCallbackDefault.onNavigationEvent()) == null) ? null : columnContentOnNavigationEvent3.onExtraCallbackWithResult());
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeLargeBannerResponse);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function13 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda14
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2) {
                                int i10 = 2 % 2;
                                int i11 = IAuthTabCallback + 71;
                                onExtraCallbackWithResult = i11 % 128;
                                int i12 = i11 % 2;
                                Unit unitOnWarmupCompleted = printVisualizationLog.onWarmupCompleted(function1, creditHomeLargeBannerResponse, ((Boolean) obj2).booleanValue());
                                int i13 = onExtraCallbackWithResult + 63;
                                IAuthTabCallback = i13 % 128;
                                if (i13 % 2 != 0) {
                                    return unitOnWarmupCompleted;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function13);
                        obj = function13;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(onextracallback2, 0.0f, strValueOf, null, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 13);
                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault2 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    String str = "";
                    if (dualColumnContentsIAuthTabCallbackDefault2 == null || (strOnExtraCallback = dualColumnContentsIAuthTabCallbackDefault2.onExtraCallback()) == null) {
                        strOnExtraCallback = "";
                    }
                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault3 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    if (dualColumnContentsIAuthTabCallbackDefault3 == null || (columnContentOnNavigationEvent2 = dualColumnContentsIAuthTabCallbackDefault3.onNavigationEvent()) == null || (strOnExtraCallbackWithResult = columnContentOnNavigationEvent2.onExtraCallbackWithResult()) == null) {
                        strOnExtraCallbackWithResult = "";
                    }
                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault4 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    if (dualColumnContentsIAuthTabCallbackDefault4 != null && (columnContentOnWarmupCompleted2 = dualColumnContentsIAuthTabCallbackDefault4.onWarmupCompleted()) != null) {
                        int i10 = onNavigationEvent + 125;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        String strOnExtraCallbackWithResult2 = columnContentOnWarmupCompleted2.onExtraCallbackWithResult();
                        if (strOnExtraCallbackWithResult2 != null) {
                            str = strOnExtraCallbackWithResult2;
                        }
                    }
                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault5 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    if (dualColumnContentsIAuthTabCallbackDefault5 != null) {
                        strIAuthTabCallback = dualColumnContentsIAuthTabCallbackDefault5.IAuthTabCallback();
                        int i12 = onExtraCallbackWithResult + 93;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        strIAuthTabCallback = null;
                    }
                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault6 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted = (dualColumnContentsIAuthTabCallbackDefault6 == null || (columnContentOnNavigationEvent = dualColumnContentsIAuthTabCallbackDefault6.onNavigationEvent()) == null) ? null : columnContentOnNavigationEvent.onWarmupCompleted();
                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault7 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted2 = (dualColumnContentsIAuthTabCallbackDefault7 == null || (columnContentOnWarmupCompleted = dualColumnContentsIAuthTabCallbackDefault7.onWarmupCompleted()) == null) ? null : columnContentOnWarmupCompleted.onWarmupCompleted();
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeLargeBannerResponse);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent2 | zOnExtraCallback2)) {
                        int i14 = onExtraCallbackWithResult + 23;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda15
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i16 = 2 % 2;
                                    int i17 = onExtraCallbackWithResult + 115;
                                    onWarmupCompleted = i17 % 128;
                                    int i18 = i17 % 2;
                                    Unit unitOnNavigationEvent = printVisualizationLog.onNavigationEvent(function12, creditHomeLargeBannerResponse);
                                    int i19 = onExtraCallbackWithResult + 23;
                                    onWarmupCompleted = i19 % 128;
                                    int i20 = i19 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                            obj2 = function02;
                        }
                        Function0 function03 = (Function0) obj2;
                        if (z3) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1074112084);
                            long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jICustomTabsService);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1062250960);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            setbyteorderOnNavigationEvent = null;
                        }
                        addInfoPartTwo.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, strOnExtraCallback, strOnExtraCallbackWithResult, str, strIAuthTabCallback, changeTypeOnWarmupCompleted, changeTypeOnWarmupCompleted2, z, (Function0<Unit>) function0, (Function0<Unit>) function03, !z2, setbyteorderOnNavigationEvent, z3 ? isRepeatingEnabled.onExtraCallback.onTransact() : null, z3 ? VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) : null, z3 ? VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)) : null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1061938603);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function1 function1, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeHeaderResponse);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function2 function2, CreditHomeHeaderResponse creditHomeHeaderResponse, CreditHomeHeaderItem creditHomeHeaderItem, CreditHomeHeaderItem creditHomeHeaderItem2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem2, "");
            function2.invoke(creditHomeHeaderItem2, Integer.valueOf(creditHomeHeaderResponse.IAuthTabCallback().indexOf(creditHomeHeaderItem)));
            unit = Unit.INSTANCE;
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem2, "");
            function2.invoke(creditHomeHeaderItem2, Integer.valueOf(creditHomeHeaderResponse.IAuthTabCallback().indexOf(creditHomeHeaderItem)));
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeHeaderResponse);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        function2.invoke(creditHomeHeaderItem, Integer.valueOf(iIntValue));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeHeaderResponse);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        function2.invoke(creditHomeHeaderItem, Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final CreditHomeHeaderResponse creditHomeHeaderResponse, @Nullable final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, final boolean z, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super CreditHomeHeaderResponse, Unit> function1, @NotNull final Function2<? super CreditHomeHeaderItem, ? super Integer, Unit> function2, @NotNull final Function1<? super CreditHomeLargeBannerResponse, Unit> function12, @NotNull final Function1<? super CreditHomeLargeBannerResponse, Unit> function13, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        String str2;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str3;
        int i3;
        boolean z3;
        final CreditHomeHeaderItem creditHomeHeaderItem;
        long jOnNavigationEvent;
        Object obj;
        Object obj2;
        final Function1<? super CreditHomeHeaderResponse, Unit> function14;
        final Function2<? super CreditHomeHeaderItem, ? super Integer, Unit> function22;
        int i4;
        Object obj3;
        boolean z4;
        boolean z5;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        float f;
        Object obj4;
        CreditHomeHeaderItem next;
        CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderResponse, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(680459223);
        int i9 = (i & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeHeaderResponse) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 96 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
            }
            i9 |= i7;
        }
        if ((i & 3072) == 0) {
            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
        }
        Object obj5 = null;
        if ((196608 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i12 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i9 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                int i13 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 != 0) {
                    obj5.hashCode();
                    throw null;
                }
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i9 |= i5;
        }
        if ((12582912 & i) == 0) {
            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 8388608 : 4194304;
        }
        int i14 = i2 & 256;
        if (i14 != 0) {
            i9 |= 100663296;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 100663296) == 0) {
                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 67108864 : 33554432;
            }
        }
        if ((i9 & 38347923) != 38347922) {
            int i15 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i9 & 1)) {
            String str4 = i14 != 0 ? "" : str2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(680459223, i9, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSection (CreditHomeTopReasonSection.kt:60)");
            }
            boolean z6 = (creditHomeLargeBannerResponse != null ? (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, zzgsa.onWarmupCompleted()) : null) == CreditHomeLargeBannerType.LOAN_NEEDS_V2;
            if (z6) {
                CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted2 = (dualColumnContentsIAuthTabCallbackDefault == null || (columnContentOnNavigationEvent = dualColumnContentsIAuthTabCallbackDefault.onNavigationEvent()) == null) ? null : columnContentOnNavigationEvent.onWarmupCompleted();
                CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault2 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                if (dualColumnContentsIAuthTabCallbackDefault2 != null) {
                    int i17 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted = dualColumnContentsIAuthTabCallbackDefault2.onWarmupCompleted();
                    if (columnContentOnWarmupCompleted != null) {
                        int i19 = onExtraCallbackWithResult + 63;
                        i3 = i9;
                        onNavigationEvent = i19 % 128;
                        if (i19 % 2 == 0) {
                            columnContentOnWarmupCompleted.onWarmupCompleted();
                            throw null;
                        }
                        changeTypeOnWarmupCompleted = columnContentOnWarmupCompleted.onWarmupCompleted();
                    } else {
                        i3 = i9;
                        changeTypeOnWarmupCompleted = null;
                    }
                    boolean z7 = addInfoPartTwo.IAuthTabCallback(changeTypeOnWarmupCompleted2, changeTypeOnWarmupCompleted) ? false : true;
                    createWifiConfiguration.IAuthTabCallback iAuthTabCallback = createWifiConfiguration.IAuthTabCallback.IAuthTabCallback;
                    z3 = !iAuthTabCallback.onNavigationEvent(str4) && z6 && creditHomeHeaderResponse.onWarmupCompleted();
                    final boolean z8 = !iAuthTabCallback.onExtraCallback(str4) && creditHomeHeaderResponse.onWarmupCompleted();
                    if (z3) {
                        str3 = str4;
                        creditHomeHeaderItem = null;
                    } else {
                        Iterator it = creditHomeHeaderResponse.IAuthTabCallback().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str3 = str4;
                                next = 0;
                                break;
                            } else {
                                next = it.next();
                                str3 = str4;
                                if (Intrinsics.areEqual(((CreditHomeHeaderItem) next).IAuthTabCallbackDefault(), "score_reason")) {
                                    break;
                                } else {
                                    str4 = str3;
                                }
                            }
                        }
                        creditHomeHeaderItem = next;
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
                    if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1086333576);
                        jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1086332075);
                        jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onWarmupCompleted();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jOnNavigationEvent, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)))), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), (DefaultConstructorMarker) null));
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    int i20 = i3;
                    boolean z9 = z7;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    final boolean z10 = z3;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(541899181, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj6, Object obj7) throws Throwable {
                            Unit unitOnWarmupCompleted;
                            int i21 = 2 % 2;
                            int i22 = onExtraCallback + 45;
                            IAuthTabCallback = i22 % 128;
                            if (i22 % 2 != 0) {
                                unitOnWarmupCompleted = printVisualizationLog.onWarmupCompleted(creditHomeLargeBannerResponse, function12, z, function0, function13, z8, z10, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                int i23 = 42 / 0;
                            } else {
                                unitOnWarmupCompleted = printVisualizationLog.onWarmupCompleted(creditHomeLargeBannerResponse, function12, z, function0, function13, z8, z10, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                            }
                            int i24 = onExtraCallback + 15;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                    if (z6 || z3) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1706582977);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1706329273);
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        rotateYUV.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).mayLaunchUrl(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, 390, 8);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    int i21 = 458752;
                    if (z3) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1708063506);
                        final int i22 = 0;
                        for (Object obj6 : creditHomeHeaderResponse.IAuthTabCallback()) {
                            if (i22 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            CreditHomeHeaderItem creditHomeHeaderItem2 = (CreditHomeHeaderItem) obj6;
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                            boolean z11 = (i20 & 57344) == 16384;
                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderResponse);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(z11 | zOnExtraCallback3)) {
                                obj = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda6
                                        private static int onExtraCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        public final Object invoke() {
                                            int i23 = 2 % 2;
                                            int i24 = onExtraCallback + 1;
                                            onExtraCallbackWithResult = i24 % 128;
                                            if (i24 % 2 != 0) {
                                                throw null;
                                            }
                                            Unit unit = (Unit) printVisualizationLog.onWarmupCompleted(new Object[]{function1, creditHomeHeaderResponse}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1168318050, getKekid.onExtraCallback(), -1168318049);
                                            int i25 = onExtraCallback + 107;
                                            onExtraCallbackWithResult = i25 % 128;
                                            if (i25 % 2 != 0) {
                                                int i26 = 47 / 0;
                                            }
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function02);
                                    obj = function02;
                                }
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback2, 0.0f, null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult2, 6, 3);
                            boolean z12 = (i20 & i21) == 131072;
                            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i22);
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(z12 | zOnExtraCallback4)) {
                                obj2 = objOnMinimized2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function1 function15 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda7
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj7) {
                                            int i23 = 2 % 2;
                                            int i24 = onWarmupCompleted + 27;
                                            onExtraCallbackWithResult = i24 % 128;
                                            if (i24 % 2 == 0) {
                                                printVisualizationLog.onNavigationEvent(function2, i22, (CreditHomeHeaderItem) obj7);
                                                throw null;
                                            }
                                            Unit unitOnNavigationEvent = printVisualizationLog.onNavigationEvent(function2, i22, (CreditHomeHeaderItem) obj7);
                                            int i25 = onExtraCallbackWithResult + 29;
                                            onWarmupCompleted = i25 % 128;
                                            int i26 = i25 % 2;
                                            return unitOnNavigationEvent;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function15);
                                    obj2 = function15;
                                }
                            }
                            onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted2, creditHomeHeaderItem2, false, z9, 0L, null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult2, 0, 52);
                            if (i22 == CollectionsKt.getLastIndex(creditHomeHeaderResponse.IAuthTabCallback()) || z6) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1751008795);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1750820439);
                                rotateYUV.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).mayLaunchUrl(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, 384, 9);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            i22++;
                            i21 = 458752;
                        }
                    } else {
                        int i23 = onNavigationEvent + 117;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1706664910);
                        if (creditHomeHeaderItem != null) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1706694143);
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            boolean z13 = (i20 & 57344) == 16384;
                            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderResponse);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (z13 || zOnExtraCallback5) {
                                i4 = 2;
                            } else {
                                int i25 = onNavigationEvent + 111;
                                onExtraCallbackWithResult = i25 % 128;
                                i4 = 2;
                                if (i25 % 2 != 0) {
                                    int i26 = 57 / 0;
                                    if (objOnMinimized3 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        function14 = function1;
                                        obj3 = objOnMinimized3;
                                    }
                                } else if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult2, 6, 3);
                                if (creditHomeHeaderItem.onWarmupCompleted() == null && (!StringsKt.isBlank(r8))) {
                                    int i27 = onExtraCallbackWithResult + 103;
                                    onNavigationEvent = i27 % 128;
                                    int i28 = i27 % i4;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                                z5 = (i20 & 458752) != 131072;
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderResponse);
                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderItem);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (((!z5 && !zOnExtraCallback) && !zOnExtraCallback2) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    function22 = function2;
                                    f = 0.0f;
                                    Function1 function16 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda3
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj7) {
                                            int i29 = 2 % 2;
                                            int i30 = onWarmupCompleted + 97;
                                            onExtraCallbackWithResult = i30 % 128;
                                            int i31 = i30 % 2;
                                            Function2 function23 = function22;
                                            if (i31 == 0) {
                                                return printVisualizationLog.onNavigationEvent(function23, creditHomeHeaderResponse, creditHomeHeaderItem, (CreditHomeHeaderItem) obj7);
                                            }
                                            printVisualizationLog.onNavigationEvent(function23, creditHomeHeaderResponse, creditHomeHeaderItem, (CreditHomeHeaderItem) obj7);
                                            Object obj8 = null;
                                            obj8.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function16);
                                    obj4 = function16;
                                } else {
                                    function22 = function2;
                                    f = 0.0f;
                                    obj4 = objOnMinimized4;
                                }
                                onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted3, creditHomeHeaderItem, false, z4, jLongValue, graphicDeviceInfoOnExtraCallbackWithResult, (Function1) obj4, cameraCaptureResultEmptyCameraCaptureResult2, 196992, 0);
                                rotateYUV.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), f, i4, (Object) null), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).mayLaunchUrl(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, 390, 8);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            function14 = function1;
                            Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda2
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke() {
                                    int i29 = 2 % 2;
                                    int i30 = onExtraCallback + 95;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    Function1 function17 = function14;
                                    if (i31 != 0) {
                                        return printVisualizationLog.onNavigationEvent(function17, creditHomeHeaderResponse);
                                    }
                                    printVisualizationLog.onNavigationEvent(function17, creditHomeHeaderResponse);
                                    Object obj7 = null;
                                    obj7.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function03);
                            obj3 = function03;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult2, 6, 3);
                            if (creditHomeHeaderItem.onWarmupCompleted() == null) {
                                z4 = false;
                                y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                                long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult2 = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                                if ((i20 & 458752) != 131072) {
                                }
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderResponse);
                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderItem);
                                Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!(z5 | zOnExtraCallback | zOnExtraCallback2)) {
                                    function22 = function2;
                                    f = 0.0f;
                                    Function1 function162 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda3
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj7) {
                                            int i29 = 2 % 2;
                                            int i30 = onWarmupCompleted + 97;
                                            onExtraCallbackWithResult = i30 % 128;
                                            int i31 = i30 % 2;
                                            Function2 function23 = function22;
                                            if (i31 == 0) {
                                                return printVisualizationLog.onNavigationEvent(function23, creditHomeHeaderResponse, creditHomeHeaderItem, (CreditHomeHeaderItem) obj7);
                                            }
                                            printVisualizationLog.onNavigationEvent(function23, creditHomeHeaderResponse, creditHomeHeaderItem, (CreditHomeHeaderItem) obj7);
                                            Object obj8 = null;
                                            obj8.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function162);
                                    obj4 = function162;
                                    onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted32, creditHomeHeaderItem, false, z4, jLongValue2, graphicDeviceInfoOnExtraCallbackWithResult2, (Function1) obj4, cameraCaptureResultEmptyCameraCaptureResult2, 196992, 0);
                                    rotateYUV.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), f, i4, (Object) null), y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).mayLaunchUrl(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, 390, 8);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                            }
                        } else {
                            function14 = function1;
                            function22 = function2;
                            i4 = 2;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1707526369);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1440556456);
                        Iterator it2 = creditHomeHeaderResponse.IAuthTabCallback().iterator();
                        final int i29 = 0;
                        while (!(!it2.hasNext())) {
                            int i30 = onExtraCallbackWithResult + 17;
                            onNavigationEvent = i30 % 128;
                            int i31 = i30 % i4;
                            Object next2 = it2.next();
                            if (i29 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            CreditHomeHeaderItem creditHomeHeaderItem3 = (CreditHomeHeaderItem) next2;
                            if (!Intrinsics.areEqual(creditHomeHeaderItem3, creditHomeHeaderItem)) {
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                                boolean z14 = (i20 & 57344) == 16384;
                                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditHomeHeaderResponse);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!(z14 | zOnExtraCallback6)) {
                                    Object obj7 = objOnMinimized5;
                                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function04 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda4
                                            private static int IAuthTabCallback = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke() {
                                                int i32 = 2 % 2;
                                                int i33 = IAuthTabCallback + 99;
                                                onWarmupCompleted = i33 % 128;
                                                int i34 = i33 % 2;
                                                Unit unitIAuthTabCallback = printVisualizationLog.IAuthTabCallback(function14, creditHomeHeaderResponse);
                                                int i35 = IAuthTabCallback + 25;
                                                onWarmupCompleted = i35 % 128;
                                                if (i35 % 2 == 0) {
                                                    return unitIAuthTabCallback;
                                                }
                                                Object obj8 = null;
                                                obj8.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function04);
                                        obj7 = function04;
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback3, 0.0f, null, (Function0) obj7, cameraCaptureResultEmptyCameraCaptureResult2, 6, 3);
                                    boolean z15 = (i20 & 458752) == 131072;
                                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i29);
                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (!(z15 | zOnExtraCallback7)) {
                                        Object obj8 = objOnMinimized6;
                                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function1 function17 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda5
                                                private static int onExtraCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj9) {
                                                    int i32 = 2 % 2;
                                                    int i33 = onExtraCallback + 47;
                                                    onWarmupCompleted = i33 % 128;
                                                    int i34 = i33 % 2;
                                                    Function2 function23 = function22;
                                                    if (i34 != 0) {
                                                        return printVisualizationLog.onExtraCallback(function23, i29, (CreditHomeHeaderItem) obj9);
                                                    }
                                                    printVisualizationLog.onExtraCallback(function23, i29, (CreditHomeHeaderItem) obj9);
                                                    Object obj10 = null;
                                                    obj10.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function17);
                                            obj8 = function17;
                                        }
                                        onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted4, creditHomeHeaderItem3, false, z9, 0L, null, (Function1) obj8, cameraCaptureResultEmptyCameraCaptureResult2, 0, 52);
                                    }
                                }
                            }
                            i29++;
                            i4 = 2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                i3 = i9;
            }
            createWifiConfiguration.IAuthTabCallback iAuthTabCallback2 = createWifiConfiguration.IAuthTabCallback.IAuthTabCallback;
            if (iAuthTabCallback2.onNavigationEvent(str4)) {
                if (iAuthTabCallback2.onExtraCallback(str4)) {
                    if (z3) {
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback4, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
                    if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult22 = setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, jOnNavigationEvent, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)))), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), (DefaultConstructorMarker) null));
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult22);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    int i202 = i3;
                    boolean z92 = z7;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    final boolean z102 = z3;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(541899181, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj62, Object obj72) throws Throwable {
                            Unit unitOnWarmupCompleted;
                            int i212 = 2 % 2;
                            int i222 = onExtraCallback + 45;
                            IAuthTabCallback = i222 % 128;
                            if (i222 % 2 != 0) {
                                unitOnWarmupCompleted = printVisualizationLog.onWarmupCompleted(creditHomeLargeBannerResponse, function12, z, function0, function13, z8, z102, (CameraCaptureResultEmptyCameraCaptureResult) obj62, ((Integer) obj72).intValue());
                                int i232 = 42 / 0;
                            } else {
                                unitOnWarmupCompleted = printVisualizationLog.onWarmupCompleted(creditHomeLargeBannerResponse, function12, z, function0, function13, z8, z102, (CameraCaptureResultEmptyCameraCaptureResult) obj62, ((Integer) obj72).intValue());
                            }
                            int i242 = onExtraCallback + 15;
                            IAuthTabCallback = i242 % 128;
                            int i252 = i242 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                    if (z6) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1706582977);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        int i212 = 458752;
                        if (z3) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            str3 = str2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final String str5 = str3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj9, Object obj10) {
                    int i32 = 2 % 2;
                    int i33 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i33 % 128;
                    int i34 = i33 % 2;
                    Unit unitIAuthTabCallback = printVisualizationLog.IAuthTabCallback(creditHomeHeaderResponse, creditHomeLargeBannerResponse, z, function0, function1, function2, function12, function13, str5, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj9, ((Integer) obj10).intValue());
                    int i35 = onWarmupCompleted + 107;
                    onExtraCallbackWithResult = i35 % 128;
                    int i36 = i35 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    private static final long onNavigationEvent(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(968678585);
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(968678585);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(968678585, i, -1, "im.toss.feature.credit.ui.main.home.component.parseDescriptionTextColor (CreditHomeTopReasonSection.kt:178)");
        }
        if (str != null && !StringsKt.isBlank(str)) {
            int i4 = i << 3;
            long jIAuthTabCallback = getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, str, j, cameraCaptureResultEmptyCameraCaptureResult, (i4 & 112) | 6 | (i4 & 896));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return jIAuthTabCallback;
        }
        int i5 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeHeaderItem);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallbackWithResult(CreditHomeHeaderItem creditHomeHeaderItem, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        long jICustomTabsCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1727336015, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditReasonTypeRow.<anonymous> (CreditHomeTopReasonSection.kt:210)");
                int i7 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f));
            int i9 = onExtraCallbackWithResult.onNavigationEvent[creditHomeHeaderItem.IAuthTabCallbackStubProxy().ordinal()];
            if (i9 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2112542433);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2112544727);
                    jICustomTabsCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2112543735);
                    jICustomTabsCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (i9 != 2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2112539948);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2112547637);
                jICustomTabsCallback = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, jICustomTabsCallback, RoundedCornerShapeKt.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0180 A[PHI: r3 r4
      0x0180: PHI (r3v32 o.getHumanReadableName) = (r3v31 o.getHumanReadableName), (r3v38 o.getHumanReadableName) binds: [B:43:0x017e, B:40:0x014a] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r4v15 int) = (r4v14 int), (r4v28 int) binds: [B:43:0x017e, B:40:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc A[PHI: r3
      0x01bc: PHI (r3v35 o.getHumanReadableName) = (r3v31 o.getHumanReadableName), (r3v38 o.getHumanReadableName) binds: [B:43:0x017e, B:40:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(boolean z, String str, CreditHomeHeaderItem creditHomeHeaderItem, long j, GraphicDeviceInfo graphicDeviceInfo, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        ?? r26;
        getHumanReadableName gethumanreadablename;
        int i2;
        addFixedPosition addfixedpositionIAuthTabCallback;
        long jOnVerticalScrollEvent;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(792243211, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditReasonTypeRow.<anonymous> (CreditHomeTopReasonSection.kt:226)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z ? 6.0f : 0.0f);
            int i5 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, fIAuthTabCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), 4, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (str != null) {
                int i8 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 25 / 0;
                    if (StringsKt.isBlank(str)) {
                        r26 = 0;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1568004627);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        int i10 = onNavigationEvent + 37;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1567490492);
                            gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                            i2 = onExtraCallbackWithResult.onNavigationEvent[creditHomeHeaderItem.IAuthTabCallbackStubProxy().ordinal()];
                            if (i2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(743308535);
                                jOnVerticalScrollEvent = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 2111452320, OverseasRrnInputTextField.IAuthTabCallback(), -2111452315)).longValue();
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            } else {
                                if (i2 != 2) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(743305639);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i11 = onNavigationEvent + 19;
                                onExtraCallbackWithResult = i11 % 128;
                                if (i11 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(743311317);
                                    addfixedpositionIAuthTabCallback = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 82);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(743311317);
                                    addfixedpositionIAuthTabCallback = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
                                }
                                jOnVerticalScrollEvent = addfixedpositionIAuthTabCallback.onVerticalScrollEvent();
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1567490492);
                            gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                            i2 = onExtraCallbackWithResult.onNavigationEvent[creditHomeHeaderItem.IAuthTabCallbackStubProxy().ordinal()];
                            if (i2 != 1) {
                            }
                        }
                        r26 = 0;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablename, Long.valueOf(jOnVerticalScrollEvent), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else if (!StringsKt.isBlank(str)) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{creditHomeHeaderItem.asInterface(), null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r26), Boolean.valueOf((boolean) r26), graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((int) r26), Integer.valueOf((int) r26), 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeHeaderItem);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        int i;
        String strIAuthTabCallback;
        Float f;
        Float f2;
        int i2;
        int i3;
        long jExtraCallback;
        Pair[] pairArr;
        long jMediaMetadataCompat;
        long jIconCompatParcelizer;
        String strOnWarmupCompleted;
        long jLongValue;
        CreditHomeHeaderCta creditHomeHeaderCta = (CreditHomeHeaderCta) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        final CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        RightPreset rightPreset = (RightPreset) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i4 = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 17) != 16) {
            int i5 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1759600326, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditReasonTypeRow.<anonymous> (CreditHomeTopReasonSection.kt:256)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1759600326, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditReasonTypeRow.<anonymous> (CreditHomeTopReasonSection.kt:256)");
            }
            if (creditHomeHeaderCta != null) {
                int i8 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-177424039);
                String strOnNavigationEvent = creditHomeHeaderCta.onNavigationEvent();
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
                setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeHeaderItem);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i10 = 2 % 2;
                                int i11 = IAuthTabCallback + 45;
                                onNavigationEvent = i11 % 128;
                                if (i11 % 2 != 0) {
                                    throw null;
                                }
                                Unit unit = (Unit) printVisualizationLog.onWarmupCompleted(new Object[]{function1, creditHomeHeaderItem}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -836299589, getKekid.onExtraCallback(), 836299591);
                                int i12 = IAuthTabCallback + 77;
                                onNavigationEvent = i12 % 128;
                                int i13 = i12 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj2 = function0;
                    }
                    setAdvertiser.onExtraCallbackWithResult(strOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted, onextracallback, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj2, false, false, cameraCaptureResultEmptyCameraCaptureResult, 28032, 0, 1762);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                if (creditHomeHeaderItem.onWarmupCompleted() == null || !(!StringsKt.isBlank(r0))) {
                    if (((CreditHomeHeaderProgressInfo) CreditHomeHeaderItem.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{creditHomeHeaderItem}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2118534374, 2118534374, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent())) != null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-176117017);
                        CreditHomeHeaderProgressInfo creditHomeHeaderProgressInfo = (CreditHomeHeaderProgressInfo) CreditHomeHeaderItem.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{creditHomeHeaderItem}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2118534374, 2118534374, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                        if (creditHomeHeaderProgressInfo == null || (strIAuthTabCallback = creditHomeHeaderProgressInfo.IAuthTabCallback()) == null) {
                            CreditHomeHeaderProgressInfo creditHomeHeaderProgressInfo2 = (CreditHomeHeaderProgressInfo) CreditHomeHeaderItem.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{creditHomeHeaderItem}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2118534374, 2118534374, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                            strIAuthTabCallback = (creditHomeHeaderProgressInfo2 != null ? Integer.valueOf(creditHomeHeaderProgressInfo2.onNavigationEvent()) : null) + "%";
                        }
                        String str = strIAuthTabCallback;
                        CreditHomeHeaderProgressInfo creditHomeHeaderProgressInfo3 = (CreditHomeHeaderProgressInfo) CreditHomeHeaderItem.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{creditHomeHeaderItem}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2118534374, 2118534374, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                        int iOnNavigationEvent = creditHomeHeaderProgressInfo3 != null ? creditHomeHeaderProgressInfo3.onNavigationEvent() : 0;
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f) * iOnNavigationEvent) / 100.0f);
                        RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f));
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)), (QuirkSettingsLoader.onNavigationEvent) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), 0.0f, 2, (Object) null), roundedCornerShapeOnNavigationEvent);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout(), roundedCornerShapeOnNavigationEvent), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCommand(), roundedCornerShapeOnNavigationEvent);
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            f2 = fValueOf;
                            int i10 = onNavigationEvent + 95;
                            f = fValueOf2;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                                int i11 = 76 / 0;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                            }
                        } else {
                            f = fValueOf2;
                            f2 = fValueOf;
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        if (iOnNavigationEvent > 0) {
                            int i12 = onNavigationEvent + 7;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(757469944);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback2), roundedCornerShapeOnNavigationEvent);
                            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null), fIAuthTabCallback), RoundedCornerShapeKt.onExtraCallback(0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 3, (Object) null));
                            if (iOnNavigationEvent > 30) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1048221535);
                                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1142187975);
                                    jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).RatingCompat();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1142186951);
                                    jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(f, setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jMediaMetadataCompat, 0.8f)));
                                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1142179207);
                                    jIconCompatParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1142178183);
                                    jIconCompatParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IconCompatParcelizer();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                pairArr = new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(f2, setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jIconCompatParcelizer, 0.4f)))};
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            } else {
                                Float f3 = f;
                                Float f4 = f2;
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1047537210);
                                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                    int i14 = onNavigationEvent + 117;
                                    onExtraCallbackWithResult = i14 % 128;
                                    int i15 = i14 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1142165736);
                                    i3 = 6;
                                    jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
                                } else {
                                    i3 = 6;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1142164744);
                                    jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                pairArr = new Pair[]{getWrite.IAuthTabCallback(f3, setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jExtraCallback, 0.8f))), getWrite.IAuthTabCallback(f4, setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i3).readTypedObject(), 0.4f)))};
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, pairArr, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult, 384, 4), onextracallbackwithresult.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            int i16 = onExtraCallbackWithResult + 111;
                            onNavigationEvent = i16 % 128;
                            i2 = 2;
                            int i17 = i16 % 2;
                        } else {
                            i2 = 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(759492849);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        i = i2;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, i2, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 48, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        i = 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-172880028);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i18 = onExtraCallbackWithResult + 37;
                        onNavigationEvent = i18 % 128;
                        if (i18 % i == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    int i19 = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i19 % 128;
                    int i20 = i19 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-177057464);
                    QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback3);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = CaptureNoResponseQuirk.onWarmupCompleted(onextracallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(zBooleanValue ? 4.0f : 0.0f), 0.0f, 2, (Object) null);
                    String strOnWarmupCompleted2 = creditHomeHeaderItem.onWarmupCompleted();
                    if (strOnWarmupCompleted2 == null) {
                        strOnWarmupCompleted2 = "";
                    }
                    getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                    boolean zBooleanValue2 = ((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue();
                    CreditHomeHeaderTextColor creditHomeHeaderTextColorOnExtraCallback = creditHomeHeaderItem.onExtraCallback();
                    if (zBooleanValue2) {
                        strOnWarmupCompleted = creditHomeHeaderTextColorOnExtraCallback != null ? creditHomeHeaderTextColorOnExtraCallback.onExtraCallbackWithResult() : null;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-458427943);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                        } else {
                            int i21 = onNavigationEvent + 33;
                            onExtraCallbackWithResult = i21 % 128;
                            int i22 = i21 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-458428903);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnWarmupCompleted2, quirksExternalSyntheticBackport0OnWarmupCompleted4, gethumanreadablename, Long.valueOf(onNavigationEvent(strOnWarmupCompleted, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, 0)), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        if (creditHomeHeaderTextColorOnExtraCallback != null) {
                            strOnWarmupCompleted = creditHomeHeaderTextColorOnExtraCallback.onWarmupCompleted();
                        }
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnWarmupCompleted2, quirksExternalSyntheticBackport0OnWarmupCompleted4, gethumanreadablename, Long.valueOf(onNavigationEvent(strOnWarmupCompleted, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, 0)), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        Unit unit32 = Unit.INSTANCE;
                    }
                }
            }
            i = 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final CreditHomeHeaderItem creditHomeHeaderItem, boolean z, boolean z2, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @NotNull final Function1<? super CreditHomeHeaderItem, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        GraphicDeviceInfo graphicDeviceInfo2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final boolean z4;
        final boolean z5;
        final GraphicDeviceInfo graphicDeviceInfo3;
        final long j2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jICustomTabsService;
        GraphicDeviceInfo graphicDeviceInfoOnTransact;
        int i6;
        final CreditHomeHeaderCta creditHomeHeaderCtaIAuthTabCallback;
        boolean z6;
        getViewTypeCount.IAuthTabCallback IAuthTabCallback;
        boolean z7;
        getViewTypeCount.IAuthTabCallback iAuthTabCallback;
        boolean z8;
        boolean zOnExtraCallback;
        String strOnWarmupCompleted;
        boolean z9 = z2;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(100608974);
        if ((i & 6) == 0) {
            int i8 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            int i10 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeHeaderItem) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            int i13 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                int i15 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                int i17 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z9);
                    throw null;
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z9) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                int i18 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                i3 |= ((i2 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    graphicDeviceInfo2 = graphicDeviceInfo;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if (i12 != 0) {
                            z3 = true;
                        }
                        if (i4 != 0) {
                            int i20 = onNavigationEvent + 23;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            z9 = true;
                        }
                        if ((i2 & 16) != 0) {
                            jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                            i3 &= -57345;
                        } else {
                            jICustomTabsService = j;
                        }
                        if (i5 != 0) {
                            int i22 = onExtraCallbackWithResult + 83;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            graphicDeviceInfoOnTransact = isRepeatingEnabled.onExtraCallback.onTransact();
                            i6 = i3;
                        }
                        final long j3 = jICustomTabsService;
                        boolean z10 = z9;
                        final boolean z11 = z3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(100608974, i6, -1, "im.toss.feature.credit.ui.main.home.component.CreditReasonTypeRow (CreditHomeTopReasonSection.kt:192)");
                        }
                        final String strAsBinder = creditHomeHeaderItem.asBinder();
                        creditHomeHeaderCtaIAuthTabCallback = creditHomeHeaderItem.IAuthTabCallback();
                        if (creditHomeHeaderCtaIAuthTabCallback == null || !((strOnWarmupCompleted = creditHomeHeaderItem.onWarmupCompleted()) == null || StringsKt.isBlank(strOnWarmupCompleted))) {
                            z6 = false;
                            if (creditHomeHeaderCtaIAuthTabCallback != null || z6) {
                                IAuthTabCallback = null;
                                z7 = false;
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                                if (z11) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-644391544);
                                    getViewTypeCount.IAuthTabCallback iAuthTabCallbackOnExtraCallback = ForwardingCameraControl.onExtraCallback(1727336015, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda9
                                        private static int onExtraCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                            int i24 = 2 % 2;
                                            int i25 = onWarmupCompleted + 107;
                                            onExtraCallback = i25 % 128;
                                            int i26 = i25 % 2;
                                            Unit unitOnExtraCallback = printVisualizationLog.onExtraCallback(creditHomeHeaderItem, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            int i27 = onWarmupCompleted + 75;
                                            onExtraCallback = i27 % 128;
                                            if (i27 % 2 == 0) {
                                                return unitOnExtraCallback;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-643819656);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    iAuthTabCallback = IAuthTabCallback;
                                }
                                if (z7) {
                                    IAuthTabCallback = getViewTypeCount.IAuthTabCallback.Companion.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                                }
                                getViewTypeCount.IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback;
                                final boolean z12 = z7;
                                final GraphicDeviceInfo graphicDeviceInfo4 = graphicDeviceInfoOnTransact;
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(792243211, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda10
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                        Unit unitOnExtraCallbackWithResult;
                                        int i24 = 2 % 2;
                                        int i25 = IAuthTabCallback + 49;
                                        onNavigationEvent = i25 % 128;
                                        if (i25 % 2 == 0) {
                                            unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(z11, strAsBinder, creditHomeHeaderItem, j3, graphicDeviceInfo4, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            int i26 = 57 / 0;
                                        } else {
                                            unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(z11, strAsBinder, creditHomeHeaderItem, j3, graphicDeviceInfo4, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        }
                                        int i27 = IAuthTabCallback + 105;
                                        onNavigationEvent = i27 % 128;
                                        if (i27 % 2 == 0) {
                                            int i28 = 80 / 0;
                                        }
                                        return unitOnExtraCallbackWithResult;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1759600326, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda11
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i24 = 2 % 2;
                                        int i25 = onNavigationEvent + 115;
                                        onWarmupCompleted = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            printVisualizationLog.onNavigationEvent(creditHomeHeaderCtaIAuthTabCallback, function1, creditHomeHeaderItem, z12, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            throw null;
                                        }
                                        Unit unitOnNavigationEvent = printVisualizationLog.onNavigationEvent(creditHomeHeaderCtaIAuthTabCallback, function1, creditHomeHeaderItem, z12, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i26 = onWarmupCompleted + 101;
                                        onNavigationEvent = i26 % 128;
                                        int i27 = i26 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                z8 = (3670016 & i6) == 1048576;
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeHeaderItem);
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z8 | zOnExtraCallback)) {
                                    Object obj = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda12
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke() {
                                                int i24 = 2 % 2;
                                                int i25 = onExtraCallbackWithResult + 51;
                                                onWarmupCompleted = i25 % 128;
                                                int i26 = i25 % 2;
                                                Unit unitOnNavigationEvent = printVisualizationLog.onNavigationEvent(function1, creditHomeHeaderItem);
                                                int i27 = onWarmupCompleted + 33;
                                                onExtraCallbackWithResult = i27 % 128;
                                                if (i27 % 2 == 0) {
                                                    int i28 = 37 / 0;
                                                }
                                                return unitOnNavigationEvent;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                                        obj = function0;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, quirksExternalSyntheticBackport0, iAuthTabCallback, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, iAuthTabCallback2, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i6 << 6) & 896) | 1572870, 0, 56752);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    z5 = z11;
                                    z4 = z10;
                                    j2 = j3;
                                    graphicDeviceInfo3 = graphicDeviceInfoOnTransact;
                                }
                            } else {
                                int i24 = onNavigationEvent + 65;
                                onExtraCallbackWithResult = i24 % 128;
                                if (i24 % 2 != 0) {
                                    throw null;
                                }
                                if (z10) {
                                    z7 = true;
                                    IAuthTabCallback = null;
                                }
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                                if (z11) {
                                }
                                if (z7) {
                                }
                                getViewTypeCount.IAuthTabCallback iAuthTabCallback22 = IAuthTabCallback;
                                final boolean z122 = z7;
                                final GraphicDeviceInfo graphicDeviceInfo42 = graphicDeviceInfoOnTransact;
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(792243211, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda10
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj2, Object obj22, Object obj3) throws NoWhenBranchMatchedException {
                                        Unit unitOnExtraCallbackWithResult;
                                        int i242 = 2 % 2;
                                        int i25 = IAuthTabCallback + 49;
                                        onNavigationEvent = i25 % 128;
                                        if (i25 % 2 == 0) {
                                            unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(z11, strAsBinder, creditHomeHeaderItem, j3, graphicDeviceInfo42, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                            int i26 = 57 / 0;
                                        } else {
                                            unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(z11, strAsBinder, creditHomeHeaderItem, j3, graphicDeviceInfo42, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                        }
                                        int i27 = IAuthTabCallback + 105;
                                        onNavigationEvent = i27 % 128;
                                        if (i27 % 2 == 0) {
                                            int i28 = 80 / 0;
                                        }
                                        return unitOnExtraCallbackWithResult;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback22 = ForwardingCameraControl.onExtraCallback(-1759600326, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda11
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj2, Object obj22, Object obj3) {
                                        int i242 = 2 % 2;
                                        int i25 = onNavigationEvent + 115;
                                        onWarmupCompleted = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            printVisualizationLog.onNavigationEvent(creditHomeHeaderCtaIAuthTabCallback, function1, creditHomeHeaderItem, z122, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                            throw null;
                                        }
                                        Unit unitOnNavigationEvent = printVisualizationLog.onNavigationEvent(creditHomeHeaderCtaIAuthTabCallback, function1, creditHomeHeaderItem, z122, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                        int i26 = onWarmupCompleted + 101;
                                        onNavigationEvent = i26 % 128;
                                        int i27 = i26 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                if ((3670016 & i6) == 1048576) {
                                }
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeHeaderItem);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z8 | zOnExtraCallback)) {
                                }
                            }
                        } else {
                            if (((CreditHomeHeaderProgressInfo) CreditHomeHeaderItem.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{creditHomeHeaderItem}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2118534374, 2118534374, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent())) != null) {
                                z6 = true;
                            }
                            if (creditHomeHeaderCtaIAuthTabCallback != null) {
                                IAuthTabCallback = null;
                                z7 = false;
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback22 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                                if (z11) {
                                }
                                if (z7) {
                                }
                                getViewTypeCount.IAuthTabCallback iAuthTabCallback222 = IAuthTabCallback;
                                final boolean z1222 = z7;
                                final GraphicDeviceInfo graphicDeviceInfo422 = graphicDeviceInfoOnTransact;
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback32 = ForwardingCameraControl.onExtraCallback(792243211, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda10
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj2, Object obj22, Object obj3) throws NoWhenBranchMatchedException {
                                        Unit unitOnExtraCallbackWithResult;
                                        int i242 = 2 % 2;
                                        int i25 = IAuthTabCallback + 49;
                                        onNavigationEvent = i25 % 128;
                                        if (i25 % 2 == 0) {
                                            unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(z11, strAsBinder, creditHomeHeaderItem, j3, graphicDeviceInfo422, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                            int i26 = 57 / 0;
                                        } else {
                                            unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(z11, strAsBinder, creditHomeHeaderItem, j3, graphicDeviceInfo422, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                        }
                                        int i27 = IAuthTabCallback + 105;
                                        onNavigationEvent = i27 % 128;
                                        if (i27 % 2 == 0) {
                                            int i28 = 80 / 0;
                                        }
                                        return unitOnExtraCallbackWithResult;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback222 = ForwardingCameraControl.onExtraCallback(-1759600326, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda11
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj2, Object obj22, Object obj3) {
                                        int i242 = 2 % 2;
                                        int i25 = onNavigationEvent + 115;
                                        onWarmupCompleted = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            printVisualizationLog.onNavigationEvent(creditHomeHeaderCtaIAuthTabCallback, function1, creditHomeHeaderItem, z1222, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                            throw null;
                                        }
                                        Unit unitOnNavigationEvent = printVisualizationLog.onNavigationEvent(creditHomeHeaderCtaIAuthTabCallback, function1, creditHomeHeaderItem, z1222, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                        int i26 = onWarmupCompleted + 101;
                                        onNavigationEvent = i26 % 128;
                                        int i27 = i26 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                if ((3670016 & i6) == 1048576) {
                                }
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeHeaderItem);
                                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z8 | zOnExtraCallback)) {
                                }
                            }
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 16) != 0) {
                            int i25 = onExtraCallbackWithResult + 113;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            i3 &= -57345;
                        }
                        jICustomTabsService = j;
                    }
                    i6 = i3;
                    graphicDeviceInfoOnTransact = graphicDeviceInfo2;
                    final long j32 = jICustomTabsService;
                    boolean z102 = z9;
                    final boolean z112 = z3;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    final String strAsBinder2 = creditHomeHeaderItem.asBinder();
                    creditHomeHeaderCtaIAuthTabCallback = creditHomeHeaderItem.IAuthTabCallback();
                    if (creditHomeHeaderCtaIAuthTabCallback == null) {
                        z6 = false;
                        if (creditHomeHeaderCtaIAuthTabCallback != null) {
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    z4 = z9;
                    z5 = z3;
                    graphicDeviceInfo3 = graphicDeviceInfo2;
                    j2 = j;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeTopReasonSectionKt$$ExternalSyntheticLambda13
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i27 = 2 % 2;
                            int i28 = onExtraCallback + 59;
                            onNavigationEvent = i28 % 128;
                            int i29 = i28 % 2;
                            Unit unitOnExtraCallbackWithResult = printVisualizationLog.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, creditHomeHeaderItem, z5, z4, j2, graphicDeviceInfo3, function1, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i30 = onNavigationEvent + 111;
                            onExtraCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            graphicDeviceInfo2 = graphicDeviceInfo;
            if ((i & 1572864) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        graphicDeviceInfo2 = graphicDeviceInfo;
        if ((i & 1572864) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem) {
        return (Unit) onWarmupCompleted(new Object[]{function1, creditHomeHeaderItem}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -836299589, getKekid.onExtraCallback(), 836299591);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        return (Unit) onWarmupCompleted(new Object[]{function1, creditHomeHeaderResponse}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1168318050, getKekid.onExtraCallback(), -1168318049);
    }

    private static final Unit IAuthTabCallback(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z) {
        return (Unit) onWarmupCompleted(new Object[]{function1, creditHomeLargeBannerResponse, Boolean.valueOf(z)}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -511455377, getKekid.onExtraCallback(), 511455380);
    }

    private static final Unit IAuthTabCallback(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        return (Unit) onWarmupCompleted(new Object[]{function1, creditHomeLargeBannerResponse}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1430947184, getKekid.onExtraCallback(), -1430947180);
    }

    private static final Unit onWarmupCompleted(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        return (Unit) onWarmupCompleted(new Object[]{function2, Integer.valueOf(i), creditHomeHeaderItem}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 239338484, getKekid.onExtraCallback(), -239338479);
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeHeaderCta creditHomeHeaderCta, Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem, boolean z, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{creditHomeHeaderCta, function1, creditHomeHeaderItem, Boolean.valueOf(z), rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -2143451427, getKekid.onExtraCallback(), 2143451427);
    }

    private static final Unit onExtraCallback(Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem) {
        return (Unit) onWarmupCompleted(new Object[]{function1, creditHomeHeaderItem}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -336545249, getKekid.onExtraCallback(), 336545255);
    }
}
