package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzaq;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MaxAppOpenAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PreviewOrientationIncorrectQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.createCameraCaptureCallback;
import o.diffGcInfo;
import o.mExternalSyntheticApiModelOutline1;
import o.mc;
import o.oExternalSyntheticLambda0;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.setCallToAction;
import o.setHeaders;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u3;
import o.u4;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class diffGcInfo {
    private static final byte[] $$a = {68, 4, -12, -68};
    private static final int $$b = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onNavigationEvent = 59213;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[getGcInfo.values().length];
            try {
                iArr[getGcInfo.LOWEST_INTEREST_RATE.ordinal()] = 1;
                int i = onWarmupCompleted + 81;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getGcInfo.MAX_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2 = s2 * 2;
        int i3 = 110 - s;
        int i4 = 3 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i = 0;
            int i8 = i4 + i6;
            i4 = i7;
            i3 = i8;
            bArr2[i] = (byte) i3;
            int i9 = i4 + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i++;
            i6 = bArr[i9];
            i4 = i3;
            i7 = i9;
            int i82 = i4 + i6;
            i4 = i7;
            i3 = i82;
            bArr2[i] = (byte) i3;
            int i92 = i4 + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            int i922 = i4 + 1;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, Function0 function0, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, function0, maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function0);
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function0 function02, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 91;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i5)) | i4;
        int i9 = ~i4;
        int i10 = ~(i7 | i9);
        int i11 = ~i5;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i5 | i9)) | (~(i7 | i11));
        int i14 = i2 + i4 + i3 + (417615942 * i) + (566850886 * i6);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i2) + 147849216 + ((-2147356519) * i4) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i3) + ((-354418688) * i) + ((-85983232) * i6) + ((-608960512) * i15);
        int i17 = (i2 * (-1357469509)) + 140661806 + (i4 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i3 * (-1357469401)) + (i * 1137340586) + (i6 * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 3) {
            return onExtraCallback(objArr);
        }
        if (i18 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i18 != 5) {
            return onExtraCallbackWithResult(objArr);
        }
        Function0 function0 = (Function0) objArr[0];
        int i19 = 2 % 2;
        int i20 = onExtraCallback + 59;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i22 = onExtraCallback + 17;
        IAuthTabCallback = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(function0);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function0);
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, String str, String str2, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, str, str2, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 85;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function0 function02, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 61;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(int i, String str, String str2, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(i, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 1;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onNavigationEvent(str, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, Function0 function02, getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function03, Function0 function04, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, function02, getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 40 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(zzaq.onNavigationEvent(), 720745934, zzaq.onNavigationEvent(), -720745934, new Object[]{function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 41;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        Object[] objArr = {getgcinfo, Integer.valueOf(i), setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3)), Integer.valueOf(i4)};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        onExtraCallback(zzaq.onNavigationEvent(), -1420630163, zzaq.onNavigationEvent(), 1420630164, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 77;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        Function0 function02 = (Function0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, function02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = IAuthTabCallback + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function0 function02, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 77;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(function0);
        }
        onNavigationEvent(function0);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(zzaq.onNavigationEvent(), 780207149, iOnNavigationEvent2, -780207144, new Object[]{function0}, iOnNavigationEvent, zzaq.onNavigationEvent());
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 103;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, function03, function04, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        if (i8 == 0) {
            int i9 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallbackStub(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, final Function0 function0, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
            if ((i & 105) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener)) {
                    i2 = 4;
                } else {
                    int i6 = onExtraCallback + 125;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
            if ((i & 6) == 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i3 & 19) == 18), i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 117;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1520070027, i3, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreen.<anonymous>.<anonymous>.<anonymous> (CreditLoanNeedsFullPageScreen.kt:89)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda10
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 23;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 == 0) {
                                diffGcInfo.onWarmupCompleted(function0);
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = diffGcInfo.onWarmupCompleted(function0);
                            int i12 = onNavigationEvent + 7;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj = function02;
                }
                MaxAppOpenAdapterListener.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, new Object[]{maxAppOpenAdapterListener, str, (Function0) obj, null, false, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 << 15) & 458752), 28}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onExtraCallback + 79;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onExtraCallback + 59;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final Function0 function0, final Function0 function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onExtraCallback + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 97;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1287625015, i, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreen.<anonymous>.<anonymous> (CreditLoanNeedsFullPageScreen.kt:84)");
            }
            final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guide, cameraCaptureResultEmptyCameraCaptureResult, 0);
            long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i7 = IAuthTabCallback + 115;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda12
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 5;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr = {function0};
                            int iOnNavigationEvent = zzaq.onNavigationEvent();
                            Unit unit = (Unit) diffGcInfo.onExtraCallback(zzaq.onNavigationEvent(), 1568840727, zzaq.onNavigationEvent(), -1568840724, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
                            int i12 = IAuthTabCallback + 43;
                            onNavigationEvent = i12 % 128;
                            if (i12 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                    obj = function03;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, jIAuthTabCallbackDefault, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(1520070027, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda13
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 51;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0) {
                            diffGcInfo.IAuthTabCallback(strOnExtraCallback, function02, (MaxAppOpenAdapterListener) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            throw null;
                        }
                        Unit unitIAuthTabCallback = diffGcInfo.IAuthTabCallback(strOnExtraCallback, function02, (MaxAppOpenAdapterListener) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i11 = onExtraCallbackWithResult + 103;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 36 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 1597440, 174);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallback + 51;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getGcInfo getgcinfo, int i, setHeaders setheaders, String str, String str2, String str3, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function0 function02, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Object obj = null;
        if ((i2 & 6) == 0) {
            int i6 = onExtraCallback + 75;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                i4 = 4;
            } else {
                int i7 = onExtraCallback + 115;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i9 = IAuthTabCallback + 103;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 103;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1917123018, i3, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreen.<anonymous>.<anonymous> (CreditLoanNeedsFullPageScreen.kt:97)");
            }
            onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = IAuthTabCallback + 45;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final Function0 function0, final Function0 function02, final getGcInfo getgcinfo, final int i, final setHeaders setheaders, final String str, final String str2, final String str3, final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, final Function0 function03, final Function0 function04, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 115;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        int i7 = i5 % 2;
        if ((i2 & 3) != 2) {
            int i8 = i4 + 67;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = i6 + 69;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i12 = IAuthTabCallback + 9;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onExtraCallback + 55;
                IAuthTabCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1340502685, i2, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreen.<anonymous> (CreditLoanNeedsFullPageScreen.kt:67)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1340502685, i2, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreen.<anonymous> (CreditLoanNeedsFullPageScreen.kt:67)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CaptureNoResponseQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(450.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-80.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-200.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback((QuirksExternalSyntheticBackport0) setImageAssetsFolder.onWarmupCompleted(162130703, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, 0L, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onExtraCallback())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), 0.0f)))}, Float.valueOf(0.0f), Float.valueOf(0.0f), 0L, false, false, Float.valueOf(0.0f), 253, null}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -162130702, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
            PreviewOrientationIncorrectQuirk.onWarmupCompleted onwarmupcompleted = PreviewOrientationIncorrectQuirk.Companion;
            clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(UseTorchAsFlashQuirk.onExtraCallback(onextracallback, StillCaptureFlashStopRepeatingQuirk.IAuthTabCallback(ZslDisablerQuirk.asInterface(onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 6), ZslDisablerQuirk.onWarmupCompleted(onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 6))), 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(-1287625015, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onWarmupCompleted + 23;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    Function0 function05 = function0;
                    if (i17 != 0) {
                        Object[] objArr = {function05, function02, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        int iOnNavigationEvent = zzaq.onNavigationEvent();
                        return (Unit) diffGcInfo.onExtraCallback(zzaq.onNavigationEvent(), 573245233, zzaq.onNavigationEvent(), -573245231, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
                    }
                    Object[] objArr2 = {function05, function02, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnNavigationEvent2 = zzaq.onNavigationEvent();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), true, null, null, null, 0, false, Long.valueOf(setByteOrder.Companion.IAuthTabCallbackDefault()), 0L, ForwardingCameraControl.onExtraCallback(-1917123018, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 19;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallback = diffGcInfo.onExtraCallback(getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function03, function04, (DeviceQuirksExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i18 = IAuthTabCallback + 27;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 805309824, 48, 1522}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        boolean z;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final Function0 function0;
        final Function0 function02;
        Function0 function03;
        String str2;
        String str3;
        setHeaders setheaders;
        Function0 function04;
        final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult;
        int i6;
        int i7;
        int i8;
        final getGcInfo getgcinfo = (getGcInfo) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        final setHeaders setheaders2 = (setHeaders) objArr[2];
        final String str4 = (String) objArr[3];
        final String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2 = (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) objArr[6];
        final Function0 function05 = (Function0) objArr[7];
        Function0 function06 = (Function0) objArr[8];
        Function0 function07 = (Function0) objArr[9];
        final Function0 function08 = (Function0) objArr[10];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue2 = ((Number) objArr[12]).intValue();
        final int iIntValue3 = ((Number) objArr[13]).intValue();
        final int iIntValue4 = ((Number) objArr[14]).intValue();
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(getgcinfo, "");
        Intrinsics.checkNotNullParameter(setheaders2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        Intrinsics.checkNotNullParameter(function07, "");
        Intrinsics.checkNotNullParameter(function08, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1430610165);
        if ((iIntValue2 & 6) == 0) {
            int i10 = onExtraCallback + 9;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 18 / 0;
                i8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getgcinfo.ordinal()) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getgcinfo.ordinal())) {
            }
            i = i8 | iIntValue2;
        } else {
            int i12 = IAuthTabCallback + 17;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue)) {
                int i14 = onExtraCallback + 51;
                i2 = iIntValue;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                i7 = 32;
            } else {
                i2 = iIntValue;
                i7 = 16;
            }
            i |= i7;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue2 & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setheaders2) ? 256 : 128;
        }
        if ((iIntValue2 & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 2048 : 1024;
        }
        if ((iIntValue2 & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 16384 : 8192;
        }
        if ((196608 & iIntValue2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6)) {
                int i16 = IAuthTabCallback + 87;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i |= i6;
        }
        int i18 = iIntValue4 & 64;
        if (i18 != 0) {
            int i19 = onExtraCallback + 101;
            str = str6;
            IAuthTabCallback = i19 % 128;
            if (i19 % 2 == 0) {
                i |= 1572864;
                int i20 = 54 / 0;
            } else {
                i3 = 1572864;
                i |= i3;
            }
        } else {
            str = str6;
            if ((1572864 & iIntValue2) == 0) {
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult2 == null ? -1 : onextracallbackwithresult2.ordinal()))) {
                    int i21 = IAuthTabCallback + 121;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    i3 = 1048576;
                } else {
                    i3 = 524288;
                }
                i |= i3;
            }
        }
        if ((12582912 & iIntValue2) == 0) {
            int i23 = onExtraCallback + 107;
            IAuthTabCallback = i23 % 128;
            int i24 = i23 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 8388608 : 4194304;
        }
        if ((100663296 & iIntValue2) == 0) {
            i |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06) ^ true) ? 67108864 : 33554432;
        }
        if ((805306368 & iIntValue2) == 0) {
            int i25 = onExtraCallback + 119;
            IAuthTabCallback = i25 % 128;
            int i26 = i25 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function07) ? 536870912 : 268435456;
        }
        if ((iIntValue3 & 6) == 0) {
            int i27 = onExtraCallback + 67;
            IAuthTabCallback = i27 % 128;
            int i28 = i27 % 2;
            i4 = iIntValue3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function08) ? 4 : 2);
        } else {
            i4 = iIntValue3;
        }
        if ((306783379 & i) == 306783378) {
            int i29 = onExtraCallback + 115;
            IAuthTabCallback = i29 % 128;
            int i30 = i29 % 2;
            z = (i4 & 3) != 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (i18 != 0) {
                onextracallbackwithresult2 = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center;
            }
            final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1430610165, i, i4, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreen (CreditLoanNeedsFullPageScreen.kt:65)");
            }
            function0 = function07;
            final int i31 = i2;
            function02 = function06;
            function03 = function05;
            i5 = iIntValue2;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            function04 = function08;
            final String str7 = str;
            str2 = str5;
            str3 = str4;
            setheaders = setheaders2;
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1340502685, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda7
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i32 = 2 % 2;
                    int i33 = onNavigationEvent + 21;
                    onExtraCallback = i33 % 128;
                    int i34 = i33 % 2;
                    Unit unitOnExtraCallbackWithResult = diffGcInfo.onExtraCallbackWithResult(function05, function08, getgcinfo, i31, setheaders2, str4, str5, str7, onextracallbackwithresult3, function02, function0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i35 = onExtraCallback + 91;
                    onNavigationEvent = i35 % 128;
                    if (i35 % 2 != 0) {
                        int i36 = 21 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            onextracallbackwithresult = onextracallbackwithresult3;
        } else {
            i5 = iIntValue2;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            function0 = function07;
            function02 = function06;
            function03 = function05;
            str2 = str5;
            str3 = str4;
            setheaders = setheaders2;
            function04 = function08;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            onextracallbackwithresult = onextracallbackwithresult2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        final int i32 = i2;
        final setHeaders setheaders3 = setheaders;
        final String str8 = str3;
        final String str9 = str2;
        final String str10 = str;
        final Function0 function09 = function03;
        final Function0 function010 = function02;
        final Function0 function011 = function0;
        final Function0 function012 = function04;
        final int i33 = i5;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i34 = 2 % 2;
                int i35 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i35 % 128;
                int i36 = i35 % 2;
                Unit unitOnWarmupCompleted = diffGcInfo.onWarmupCompleted(getgcinfo, i32, setheaders3, str8, str9, str10, onextracallbackwithresult, function09, function010, function011, function012, i33, iIntValue3, iIntValue4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i37 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i37 % 128;
                if (i37 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        return null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 25;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 25;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int offsetAfter = TextUtils.getOffsetAfter("", i4) + 43;
                    int i9 = (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1)) + 1451;
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), offsetAfter, i9, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(i4, i4) + 49123);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(i4) + 44;
                    int modifierMetaStateMask = 1493 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b3 = (byte) ($$b & 5);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iNormalizeMetaState, modifierMetaStateMask, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23972), 50 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45847), ExpandableListView.getPackedPositionType(0L) + 29, 12576 - TextUtils.lastIndexOf("", '0', 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i10 = $10 + 63;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar))) {
                int i5 = onExtraCallback + 49;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onExtraCallback + 73;
            IAuthTabCallback = i7 % 128;
            z = i7 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1706977130, i2, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsContents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditLoanNeedsFullPageScreen.kt:146)");
                int i8 = IAuthTabCallback + 35;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            mcVar.onExtraCallbackWithResult(str, mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), QuirkSettingsLoader.Companion.onTransact(), false, 2, (Object) null), 0, (getHumanReadableName) null, 0L, 0L, 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, onextracallbackwithresult, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 100666752, (i2 << 15) & 458752, 24304);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, final Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = IAuthTabCallback + 21;
                onExtraCallback = i5 % 128;
                i3 = i5 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = IAuthTabCallback + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1064139541, i2, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsContents.<anonymous>.<anonymous> (CreditLoanNeedsFullPageScreen.kt:241)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 107;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr = {function0};
                        int iOnNavigationEvent = zzaq.onNavigationEvent();
                        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
                        if (i10 != 0) {
                            return (Unit) diffGcInfo.onExtraCallback(zzaq.onNavigationEvent(), 1672935224, iOnNavigationEvent2, -1672935220, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u4Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 9;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        boolean zOnNavigationEvent;
        final Function0 function0 = (Function0) objArr[0];
        u3 u3Var = (u3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1523800348, iIntValue, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsContents.<anonymous>.<anonymous> (CreditLoanNeedsFullPageScreen.kt:247)");
                }
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.close, cameraCaptureResultEmptyCameraCaptureResult, 0);
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda11
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i6 = 2 % 2;
                                int i7 = onNavigationEvent + 81;
                                onExtraCallbackWithResult = i7 % 128;
                                int i8 = i7 % 2;
                                Function0 function03 = function0;
                                if (i8 == 0) {
                                    return diffGcInfo.IAuthTabCallback(function03);
                                }
                                diffGcInfo.IAuthTabCallback(function03);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                        obj = function02;
                    }
                    u3Var.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 3072, 54);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i6 = onExtraCallback + 25;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i8 = onExtraCallback + 29;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.close, cameraCaptureResultEmptyCameraCaptureResult, 0);
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = IAuthTabCallback + 49;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final getGcInfo getgcinfo, final int i, @NotNull final setHeaders setheaders, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) throws Throwable {
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String strOnExtraCallback;
        int i4;
        Pair pair;
        int i5;
        Pair pair2;
        Pair pair3;
        String strOnExtraCallback2;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = IAuthTabCallback + 25;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(getgcinfo, "");
        Intrinsics.checkNotNullParameter(setheaders, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1935036370);
        if ((i2 & 6) != 0) {
            i3 = i2;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
            int i11 = IAuthTabCallback + 43;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2 != 0 ? 2 : 4;
            i3 = i12 | i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getgcinfo.ordinal()) ^ true) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setheaders)) {
                int i13 = onExtraCallback + 61;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                int i15 = IAuthTabCallback + 9;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i2) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 536870912 : 268435456;
        }
        int i17 = i3;
        if ((306783379 & i17) != 306783378) {
            int i18 = onExtraCallback + 21;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i17 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1935036370, i17, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsContents (CreditLoanNeedsFullPageScreen.kt:128)");
            }
            setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult2.onTransact();
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(setContentInsetsAbsolute.IAuthTabCallback(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult2.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                int i20 = IAuthTabCallback + 19;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(1706977130, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i22 = 2 % 2;
                    int i23 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    String str4 = str;
                    if (i24 != 0) {
                        return diffGcInfo.onNavigationEvent(str4, onextracallbackwithresult, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnNavigationEvent = diffGcInfo.onNavigationEvent(str4, onextracallbackwithresult, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i25 = 51 / 0;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback3);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult3.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(350.0f));
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) - 1152190438, new char[]{20833, 60974, 54559, 17428, 51268, 740, 53304, 57671, 22479, 13373, 33857, 24422, 32185, 18562, 58213, 55843, 32361, 56774, 39345, 50730, 36324, 57324, 14945, 49431, 718, 4935, 4762, 60693, 16979, 9224, 60312, 60899, 33226, 28811, 34653, 8688, 60064, 17962, 35980, 15080, 5583, 10711, 4404, 59818, 64816, 20155, 48857, 50369, 6068, 3533, 63714, 34601, 41595, 22731, 25360, 42283, 62837, 20344, 22116, 58285, 45092, 59602, 55830, 44884, 57259, 55324, 24483, 34140, 41263, 19287, 24546, 35487, 64757, 48747, 8574}, new char[]{0, 0, 0, 0}, new char[]{6756, 21240, 51899, 56373}, objArr);
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, false, false, 0, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 0, 8188);
            setHeaders.onExtraCallback onextracallbackOnWarmupCompleted = setheaders.onWarmupCompleted();
            String str4 = (onextracallbackOnWarmupCompleted != null ? onextracallbackOnWarmupCompleted.IAuthTabCallback() : setheaders.IAuthTabCallback()) + "%";
            int i22 = im.toss.features.credit.ui.R.string.credit_history_detail_my_lowest_interest_rates;
            Pair pair4 = new Pair(str4, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            Object objOnNavigationEvent = setheaders.onNavigationEvent();
            if (objOnNavigationEvent == null) {
                objOnNavigationEvent = "??";
            }
            new Pair(objOnNavigationEvent + "%", DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.credit.ui.R.string.credit_history_detail_my_loan_approval_rates_full, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            if (onextracallbackOnWarmupCompleted == null || (strOnExtraCallback = onextracallbackOnWarmupCompleted.onExtraCallback()) == null) {
                strOnExtraCallback = setheaders.onExtraCallback();
            }
            if (strOnExtraCallback == null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1083990521);
                i4 = 0;
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.credit.ui.R.string.credit_history_detail_my_lowest_max_limit_null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            } else {
                i4 = 0;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1083987576);
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i23 = im.toss.features.credit.ui.R.string.credit_history_detail_my_lowest_max_limit;
            Pair pair5 = new Pair(strOnExtraCallback, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i23, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4));
            int[] iArr = IAuthTabCallback.IAuthTabCallback;
            int i24 = iArr[getgcinfo.ordinal()];
            if (i24 != 1) {
                i5 = 2;
                if (i24 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i25 = onExtraCallback + 5;
                pair = pair5;
                int i26 = i25 % 128;
                IAuthTabCallback = i26;
                int i27 = i25 % 2;
                int i28 = i26 + 69;
                onExtraCallback = i28 % 128;
                int i29 = i28 % 2;
                pair2 = pair;
            } else {
                pair = pair5;
                i5 = 2;
                pair2 = pair4;
            }
            int i30 = iArr[getgcinfo.ordinal()];
            if (i30 == 1) {
                pair3 = pair;
            } else {
                if (i30 != i5) {
                    throw new NoWhenBranchMatchedException();
                }
                pair3 = pair4;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 0.0f, 0.0f, 13, (Object) null);
            component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onNavigationEvent(), onextracallbackwithresult2.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback4);
            Function0 function0IAuthTabCallback5 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i31 = onExtraCallback + 13;
                IAuthTabCallback = i31 % 128;
                int i32 = i31 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback5);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i33 = onExtraCallback + 11;
                IAuthTabCallback = i33 % 128;
                int i34 = i33 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnNavigationEvent3, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult3.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(140.0f));
            getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
            long jOnTransact = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().onTransact();
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, quirksExternalSyntheticBackport0AsBinder, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jOnTransact), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i17 >> 15) & 14) | 805306416), 196608, 97520}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(180.0f)), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{(String) pair2.getFirst(), quirksExternalSyntheticBackport0OnExtraCallback5, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(32)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, 24624, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            String str5 = (String) pair3.getFirst();
            int i35 = iArr[getgcinfo.ordinal()];
            if (i35 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1084063316);
                strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i23, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                if (i35 != 2) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1084060451);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1084067865);
                strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i22, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            onWarmupCompleted(i, str5, strOnExtraCallback2, cameraCaptureResultEmptyCameraCaptureResult2, (i17 >> 6) & 14);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            onPageLoadError.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(1064139541, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i36 = 2 % 2;
                    int i37 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i37 % 128;
                    int i38 = i37 % 2;
                    Unit unitOnExtraCallbackWithResult = diffGcInfo.onExtraCallbackWithResult(str3, function02, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i39 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i39 % 128;
                    int i40 = i39 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(1523800348, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i36 = 2 % 2;
                    int i37 = onExtraCallback + 113;
                    onNavigationEvent = i37 % 128;
                    int i38 = i37 % 2;
                    Unit unitOnExtraCallbackWithResult = diffGcInfo.onExtraCallbackWithResult(function0, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i39 = onNavigationEvent + 111;
                    onExtraCallback = i39 % 128;
                    int i40 = i39 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 12583296, 0, 3963);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    int i36 = 2 % 2;
                    int i37 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i37 % 128;
                    int i38 = i37 % 2;
                    Unit unitOnNavigationEvent = diffGcInfo.onNavigationEvent(quirksExternalSyntheticBackport0, getgcinfo, i, setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i39 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i39 % 128;
                    if (i39 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x066d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final int i, final String str, final String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jLongValue;
        int i4;
        long jLongValue2;
        int i5;
        int i6;
        long jLongValue3;
        int i7;
        int i8;
        long jPostMessage;
        long jNewSession;
        long jPostMessage2;
        int i9;
        long jLongValue4;
        long jLongValue5;
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-916985938);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        int i11 = i3;
        if ((i11 & 147) != 146) {
            int i12 = IAuthTabCallback + 59;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
            int i14 = IAuthTabCallback + 45;
            onExtraCallback = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 57 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-916985938, i11, -1, "im.toss.feature.credit.ui.main.home.loan_needs.CreditRollingLoanNeedsBanner (CreditLoanNeedsFullPageScreen.kt:262)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(380.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnNavigationEvent = focusMeteringControlExternalSyntheticLambda12.onNavigationEvent();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnNavigationEvent, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    int i16 = onExtraCallback + 97;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = rowScopeInstance.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), onextracallbackwithresult.access000());
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i18 = onExtraCallback + 61;
                    IAuthTabCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    int i19 = onExtraCallback + 83;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    int i21 = onExtraCallback + 101;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.credit_score, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537715259);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537714299);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                getHumanReadableName gethumanreadablenameAsInterface = appLovinPostbackService.asInterface();
                r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted = new r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted(3);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    i4 = 6;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537723611);
                    jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537722651);
                    i4 = 6;
                    jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                }
                long j = jLongValue2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i23 = onExtraCallback + 27;
                IAuthTabCallback = i23 % 128;
                int i24 = i23 % 2;
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(24);
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
                createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
                i5 = i4;
                Object obj = null;
                r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(String.valueOf(i), (QuirksExternalSyntheticBackport0) null, gethumanreadablenameAsInterface, j, jOnExtraCallback, 0L, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.onTransact()), fIAuthTabCallback, (bindChildren) null, (use) null, 0L, graphicDeviceInfoOnExtraCallbackWithResult, onwarmupcompleted, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, strOnExtraCallback, jLongValue, false, true, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12607488, 805306416, 0, 3467042);
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.credit_ui_history_list_score_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i5)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    i6 = i5;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537737851);
                    jLongValue3 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    int i25 = IAuthTabCallback + 59;
                    onExtraCallback = i25 % 128;
                    if (i25 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537736891);
                        jLongValue3 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 49).ICustomTabsService();
                        i6 = i5;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(537736891);
                        i6 = i5;
                        jLongValue3 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i6).ICustomTabsService();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                i7 = i6;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback2, null, gethumanreadablename, Long.valueOf(jLongValue3), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98034}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i7)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    i8 = i7;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-902202952);
                    jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8).postMessage();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-902204136);
                    i8 = i7;
                    jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8).newSession();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage, 0.0f)));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i8)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-902196264);
                    jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8).newSession();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-902197448);
                    jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8).newSessionWithExtras();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(jNewSession));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i8)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-902192136);
                    jPostMessage2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8).postMessage();
                } else {
                    int i26 = IAuthTabCallback + 43;
                    onExtraCallback = i26 % 128;
                    int i27 = i26 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-902193320);
                    jPostMessage2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8).newSession();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0AsBinder, new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage2, 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                i9 = i8;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    int i28 = IAuthTabCallback + 101;
                    onExtraCallback = i28 % 128;
                    if (i28 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                getHumanReadableName gethumanreadablenameAsInterface2 = appLovinPostbackService.asInterface();
                r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted2 = new r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted(3);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i9)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1102149412);
                    jLongValue4 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1102148452);
                    jLongValue4 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9).ICustomTabsService();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, gethumanreadablenameAsInterface2, jLongValue4, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(24), 0L, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), (bindChildren) null, (use) null, 0L, isrepeatingenabled.onExtraCallbackWithResult(), onwarmupcompleted2, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, (String) null, 0L, false, true, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i11 >> 3) & 14) | 12607488, 805306416, 0, 3663650);
                getHumanReadableName gethumanreadablename2 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i9)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1102161828);
                    jLongValue5 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1102160868);
                    jLongValue5 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9).ICustomTabsService();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, gethumanreadablename2, Long.valueOf(jLongValue5), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i11 >> 6) & 14), 196608, 98034}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(380.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda122 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnNavigationEvent2 = focusMeteringControlExternalSyntheticLambda122.onNavigationEvent();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(asbinderOnNavigationEvent2, onextracallbackwithresult3.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback3);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult22.onTransact());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = rowScopeInstance2.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance2, onextracallback2, 1.0f, false, 2, (Object) null), onextracallbackwithresult3.access000());
                component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub(), onextracallbackwithresult3.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback22);
                Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnNavigationEvent3, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.credit_score, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                AppLovinPostbackService appLovinPostbackService2 = AppLovinPostbackService.onExtraCallbackWithResult;
                getHumanReadableName gethumanreadablenameAsInterface3 = appLovinPostbackService2.asInterface();
                r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted3 = new r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted(3);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                long j2 = jLongValue2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i232 = onExtraCallback + 27;
                IAuthTabCallback = i232 % 128;
                int i242 = i232 % 2;
                isRepeatingEnabled isrepeatingenabled2 = isRepeatingEnabled.onExtraCallback;
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult2 = isrepeatingenabled2.onExtraCallbackWithResult();
                long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(24);
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
                createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback2 = createCameraCaptureCallback.Companion;
                i5 = i4;
                Object obj2 = null;
                r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(String.valueOf(i), (QuirksExternalSyntheticBackport0) null, gethumanreadablenameAsInterface3, j2, jOnExtraCallback2, 0L, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback2.onTransact()), fIAuthTabCallback2, (bindChildren) null, (use) null, 0L, graphicDeviceInfoOnExtraCallbackWithResult2, onwarmupcompleted3, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, strOnExtraCallback3, jLongValue, false, true, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12607488, 805306416, 0, 3467042);
                String strOnExtraCallback22 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.credit_ui_history_list_score_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                getHumanReadableName gethumanreadablename3 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i5)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                i7 = i6;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback22, null, gethumanreadablename3, Long.valueOf(jLongValue3), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback2.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98034}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i7)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage, 0.0f)));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i8)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(jNewSession));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i8)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0AsBinder2, new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback22, getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage2, 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                i9 = i8;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = RowScope.onNavigationEvent(rowScopeInstance2, onextracallback2, 1.0f, false, 2, (Object) null);
                component5 component5VarOnNavigationEvent22 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub(), onextracallbackwithresult3.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode32 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                Function0 function0IAuthTabCallback32 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, component5VarOnNavigationEvent22, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, Integer.valueOf(iHashCode32), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, quirksExternalSyntheticBackport0OnWarmupCompleted32, onextracallbackwithresult22.onTransact());
                getHumanReadableName gethumanreadablenameAsInterface22 = appLovinPostbackService2.asInterface();
                r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted22 = new r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted(3);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i9)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, gethumanreadablenameAsInterface22, jLongValue4, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(24), 0L, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback2.IAuthTabCallback()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), (bindChildren) null, (use) null, 0L, isrepeatingenabled2.onExtraCallbackWithResult(), onwarmupcompleted22, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, (String) null, 0L, false, true, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i11 >> 3) & 14) | 12607488, 805306416, 0, 3663650);
                getHumanReadableName gethumanreadablename22 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i9)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, gethumanreadablename22, Long.valueOf(jLongValue5), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback2.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i11 >> 6) & 14), 196608, 98034}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.CreditLoanNeedsFullPageScreenKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3, Object obj4) {
                    int i29 = 2 % 2;
                    int i30 = onWarmupCompleted + 111;
                    onExtraCallback = i30 % 128;
                    int i31 = i30 % 2;
                    Unit unitOnExtraCallback = diffGcInfo.onExtraCallback(i, str, str2, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i32 = onWarmupCompleted + 3;
                    onExtraCallback = i32 % 128;
                    int i33 = i32 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, Function0 function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function0, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(zzaq.onNavigationEvent(), 573245233, zzaq.onNavigationEvent(), -573245231, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(zzaq.onNavigationEvent(), 1672935224, iOnNavigationEvent2, -1672935220, new Object[]{function0}, iOnNavigationEvent, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(zzaq.onNavigationEvent(), 1568840727, iOnNavigationEvent2, -1568840724, new Object[]{function0}, iOnNavigationEvent, zzaq.onNavigationEvent());
    }

    private static final Unit onExtraCallback(Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(zzaq.onNavigationEvent(), 720745934, zzaq.onNavigationEvent(), -720745934, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
    }

    public static final void onWarmupCompleted(@NotNull getGcInfo getgcinfo, int i, @NotNull setHeaders setheaders, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        Object[] objArr = {getgcinfo, Integer.valueOf(i), setheaders, str, str2, str3, onextracallbackwithresult, function0, function02, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        onExtraCallback(zzaq.onNavigationEvent(), -1420630163, zzaq.onNavigationEvent(), 1420630164, objArr, iOnNavigationEvent, zzaq.onNavigationEvent());
    }

    private static final Unit IAuthTabCallbackDefault(Function0 function0) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(zzaq.onNavigationEvent(), 780207149, iOnNavigationEvent2, -780207144, new Object[]{function0}, iOnNavigationEvent, zzaq.onNavigationEvent());
    }
}
