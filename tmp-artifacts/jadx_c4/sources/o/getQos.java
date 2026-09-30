package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.tmoney.LiveCheckConstants;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerType;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.attachAppLovinSdk;
import o.decrementVideoUsage;
import o.getQos;
import o.getViewTypeCount;
import o.isInVideoUsage;
import o.liteTrackWatchDogHandlerThreadOpt;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getQos {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 44129;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 10303;
    private static char onNavigationEvent = 3167;
    private static char onWarmupCompleted = 45441;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[CreditHomeLargeBannerType.values().length];
            try {
                iArr[CreditHomeLargeBannerType.HIGH_INTEREST_RATES_COMPARISON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreditHomeLargeBannerType.CARD_NEEDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreditHomeLargeBannerType.LOAN_NEEDS_V2.ordinal()] = 3;
                int i = onNavigationEvent + 93;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CreditHomeLargeBannerType.DUAL_CTA.ordinal()] = 4;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CreditHomeLargeBannerType.DUAL_ROW.ordinal()] = 5;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CreditHomeLargeBannerType.NONE.ordinal()] = 6;
                int i5 = onNavigationEvent + 21;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallback = iArr;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeLargeBannerResponse, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeLargeBannerResponse, function1, z, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeLargeBannerResponse, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        int i6 = onExtraCallback + 63;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {creditHomeLargeBannerResponse, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(-2004947172, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 2004947174, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i5 = IAuthTabCallbackDefault + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(function1, creditHomeLargeBannerResponse);
        }
        onWarmupCompleted(function1, creditHomeLargeBannerResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, creditHomeLargeBannerResponse, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        int i6 = onExtraCallback + 87;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, creditHomeLargeBannerResponse, function1, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(1793451788, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1793451785, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i7 = IAuthTabCallbackDefault + 85;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, Function1 function12, boolean z2, boolean z3, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 57;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, litetrackwatchdoghandlerthreadopt, z, creditHomeLargeBannerResponse, function1, function12, z2, z3, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 107;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i3 = IAuthTabCallbackDefault + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallbackWithResult(451290588, new Object[]{getsupportedhighspeedresolutionsfor, boolValueOf}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -451290582, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        } else {
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallbackWithResult(451290588, new Object[]{getsupportedhighspeedresolutionsfor, boolValueOf}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -451290582, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        String str = (String) objArr[2];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {Boolean.valueOf(zBooleanValue), quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(1376192920, objArr2, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1376192919, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = IAuthTabCallbackDefault + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(RowScope rowScope, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(rowScope, quirksExternalSyntheticBackport0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onNavigationEvent(rowScope, quirksExternalSyntheticBackport0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(creditHomeLargeBannerResponse, function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(creditHomeLargeBannerResponse, function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, creditHomeLargeBannerResponse);
        int i4 = onExtraCallback + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, Function1 function12, boolean z2, boolean z3, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 33;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(-1351414432, new Object[]{quirksExternalSyntheticBackport0, str, litetrackwatchdoghandlerthreadopt, Boolean.valueOf(z), creditHomeLargeBannerResponse, function1, function12, Boolean.valueOf(z2), Boolean.valueOf(z3), function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1351414441, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        } else {
            onExtraCallbackWithResult(-1351414432, new Object[]{quirksExternalSyntheticBackport0, str, litetrackwatchdoghandlerthreadopt, Boolean.valueOf(z), creditHomeLargeBannerResponse, function1, function12, Boolean.valueOf(z2), Boolean.valueOf(z3), function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1351414441, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, function1, creditHomeLargeBannerResponse);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        Function0 function0;
        boolean z3;
        final Function1 function1;
        boolean z4;
        int i12;
        Object obj;
        final Function0 function02;
        final boolean z5;
        final boolean z6;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0 function03;
        boolean z7;
        Function1 function12;
        Object obj2;
        CreditHomeLargeBannerType creditHomeLargeBannerType;
        final boolean z8;
        int i13;
        int i14;
        int i15;
        int i16 = ~i5;
        int i17 = ~(i16 | i);
        int i18 = ~i;
        int i19 = i17 | (~(i18 | i5 | i4));
        int i20 = ~(i16 | i18);
        int i21 = (~i4) | i18;
        int i22 = i20 | (~i21);
        int i23 = ~(i21 | i5);
        int i24 = i5 + i + i3 + ((-1261570137) * i2) + (2040842291 * i6);
        int i25 = i24 * i24;
        int i26 = ((i5 * 1408203179) - 1033136887) + (i * 1408203179) + (i19 * (-338)) + (i22 * (-676)) + (i23 * 338) + (1408202841 * i3) + ((-1046847217) * i2) + ((-121732677) * i6) + (i25 * 1741225984);
        switch (((i5 * (-750812765)) - 1471086592) + ((-750812765) * i) + (1493335646 * i19) + ((-1308296004) * i22) + ((-1493335646) * i23) + (742522880 * i3) + ((-1928462336) * i2) + (1629880320 * i6) + (2096168960 * i25) + (i26 * i26 * 838795264)) {
            case 1:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
                String str = (String) objArr[2];
                CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[3];
                Function1 function13 = (Function1) objArr[4];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[5];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                int iIntValue = ((Number) objArr[7]).intValue();
                int i27 = 2 % 2;
                if ((iIntValue & 3) != 2) {
                    int i28 = IAuthTabCallbackDefault + 29;
                    onExtraCallback = i28 % 128;
                    int i29 = i28 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    int i30 = IAuthTabCallbackDefault + 13;
                    onExtraCallback = i30 % 128;
                    int i31 = i30 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i32 = IAuthTabCallbackDefault + 55;
                        onExtraCallback = i32 % 128;
                        int i33 = i32 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1823624910, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBanner.<anonymous> (CreditHomeLargeBanner.kt:179)");
                    }
                    if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-568310749);
                        if (zBooleanValue) {
                            int i34 = IAuthTabCallbackDefault + 27;
                            onExtraCallback = i34 % 128;
                            int i35 = i34 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-568215641);
                            quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0, onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-568105994);
                            quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0, RuntimeEnvironmentProxy.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        RuntimeHelper.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, str, creditHomeLargeBannerResponse, (Function1<? super String, Unit>) function13, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i36 = onExtraCallback + 45;
                        IAuthTabCallbackDefault = i36 % 128;
                        if (i36 % 2 == 0) {
                            int i37 = 2 % 4;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-567836976);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                int i38 = 2 % 2;
                Intrinsics.checkNotNullParameter((Rally) objArr[0], "");
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[0], 1646601245, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1646601244);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i39 = 2 % 2;
                        int i40 = onWarmupCompleted + 23;
                        onNavigationEvent = i40 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj3;
                        if (i40 % 2 == 0) {
                            getQos.onNavigationEvent(attachapplovinsdk);
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = getQos.onNavigationEvent(attachapplovinsdk);
                        int i41 = onNavigationEvent + 27;
                        onWarmupCompleted = i41 % 128;
                        int i42 = i41 % 2;
                        return unitOnNavigationEvent;
                    }
                });
                Float fValueOf3 = Float.valueOf(0.5f);
                AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(isMuted.onTransact(appLovinSdkSettingsOnExtraCallback, fValueOf3, fValueOf2, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i39 = 2 % 2;
                        int i40 = onWarmupCompleted + 85;
                        onExtraCallback = i40 % 128;
                        int i41 = i40 % 2;
                        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                        Unit unit = (Unit) getQos.onExtraCallbackWithResult(1184578854, new Object[]{(attachAppLovinSdk) obj3}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1184578846, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
                        int i42 = onExtraCallback + 15;
                        onWarmupCompleted = i42 % 128;
                        int i43 = i42 % 2;
                        return unit;
                    }
                }), Float.valueOf(125.0f), fValueOf, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i39 = 2 % 2;
                        int i40 = onWarmupCompleted + 107;
                        onNavigationEvent = i40 % 128;
                        int i41 = i40 % 2;
                        Unit unitOnWarmupCompleted = getQos.onWarmupCompleted((attachAppLovinSdk) obj3);
                        int i42 = onNavigationEvent + 35;
                        onWarmupCompleted = i42 % 128;
                        int i43 = i42 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                getVersionCode getversioncode = getVersionCode.MEDIUM;
                AppLovinSdkSettings appLovinSdkSettingsAccess000 = isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(interfaceDescriptor, getversioncode, getversioncode, (Function1) null, 4, (Object) null), fValueOf3, fValueOf3, (Function1) null, 4, (Object) null), fValueOf3, fValueOf3, (Function1) null, 4, (Object) null);
                int i39 = onExtraCallback + 119;
                IAuthTabCallbackDefault = i39 % 128;
                int i40 = i39 % 2;
                return appLovinSdkSettingsAccess000;
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[0];
                final String str2 = (String) objArr[1];
                final liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) objArr[2];
                boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = (CreditHomeLargeBannerResponse) objArr[4];
                Function1 function14 = (Function1) objArr[5];
                final Function1 function15 = (Function1) objArr[6];
                boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[8]).booleanValue();
                Function0 function04 = (Function0) objArr[9];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
                int iIntValue2 = ((Number) objArr[11]).intValue();
                final int iIntValue3 = ((Number) objArr[12]).intValue();
                int i41 = 2 % 2;
                int i42 = onExtraCallback + 117;
                IAuthTabCallbackDefault = i42 % 128;
                int i43 = i42 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(function14, "");
                Intrinsics.checkNotNullParameter(function15, "");
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-252671599);
                int i44 = iIntValue3 & 1;
                if (i44 != 0) {
                    i7 = iIntValue2 | 6;
                } else if ((iIntValue2 & 6) == 0) {
                    i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 4 : 2) | iIntValue2;
                } else {
                    i7 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(litetrackwatchdoghandlerthreadopt)) {
                        int i45 = IAuthTabCallbackDefault + 115;
                        onExtraCallback = i45 % 128;
                        int i46 = i45 % 2;
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i7 |= i15;
                }
                if ((iIntValue2 & 3072) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2)) {
                        int i47 = onExtraCallback + 63;
                        IAuthTabCallbackDefault = i47 % 128;
                        i14 = i47 % 2 == 0 ? 16486 : 2048;
                    } else {
                        i14 = 1024;
                    }
                    i7 |= i14;
                }
                if ((iIntValue2 & 24576) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse2) ? 16384 : 8192;
                }
                if ((196608 & iIntValue2) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 131072 : 65536;
                }
                if ((1572864 & iIntValue2) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15)) {
                        int i48 = onExtraCallback + 15;
                        IAuthTabCallbackDefault = i48 % 128;
                        int i49 = i48 % 2;
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i7 |= i13;
                }
                int i50 = iIntValue3 & 128;
                if (i50 == 0) {
                    if ((12582912 & iIntValue2) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3)) {
                            int i51 = IAuthTabCallbackDefault + 101;
                            z2 = zBooleanValue3;
                            onExtraCallback = i51 % 128;
                            int i52 = i51 % 2;
                            i8 = 8388608;
                        } else {
                            z2 = zBooleanValue3;
                            i8 = 4194304;
                        }
                        i7 |= i8;
                    }
                    i9 = iIntValue3 & 256;
                    if (i9 != 0) {
                        if ((100663296 & iIntValue2) == 0) {
                            i10 = i7 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue4) ? 67108864 : 33554432);
                        }
                        i11 = iIntValue3 & 512;
                        if (i11 == 0) {
                            if ((iIntValue2 & 805306368) == 0) {
                                onextracallback = onextracallback3;
                                function0 = function04;
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 536870912 : 268435456;
                            }
                            Function0 function05 = function0;
                            if ((i10 & 306783379) == 306783378) {
                                int i53 = onExtraCallback + 93;
                                IAuthTabCallbackDefault = i53 % 128;
                                int i54 = i53 % 2;
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i10 & 1)) {
                                function1 = function14;
                                z4 = zBooleanValue2;
                                i12 = iIntValue2;
                                obj = null;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                function02 = function05;
                                z5 = z2;
                                z6 = zBooleanValue4;
                                onextracallback2 = onextracallback;
                            } else {
                                int i55 = IAuthTabCallbackDefault + 19;
                                onExtraCallback = i55 % 128;
                                int i56 = i55 % 2;
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = i44 != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
                                boolean z9 = i50 != 0 ? false : z2;
                                boolean z10 = i9 != 0 ? true : zBooleanValue4;
                                if (i11 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    Object obj3 = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Object obj4 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda18
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke() {
                                                int i57 = 2 % 2;
                                                int i58 = onExtraCallbackWithResult + 121;
                                                onExtraCallback = i58 % 128;
                                                int i59 = i58 % 2;
                                                Unit unitOnWarmupCompleted = getQos.onWarmupCompleted();
                                                int i60 = onExtraCallbackWithResult + 107;
                                                onExtraCallback = i60 % 128;
                                                if (i60 % 2 == 0) {
                                                    return unitOnWarmupCompleted;
                                                }
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                                        obj3 = obj4;
                                    }
                                    function03 = (Function0) obj3;
                                } else {
                                    function03 = function05;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    i12 = iIntValue2;
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-252671599, i10, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBanner (CreditHomeLargeBanner.kt:77)");
                                } else {
                                    i12 = iIntValue2;
                                }
                                boolean z11 = creditHomeLargeBannerResponse2 != null && appIdForPluginAndTinyApp.onExtraCallbackWithResult(creditHomeLargeBannerResponse2) && z10;
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                boolean z12 = z10;
                                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                    z7 = z9;
                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                    objOnMinimized2 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                                } else {
                                    z7 = z9;
                                }
                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    function12 = function14;
                                    obj2 = null;
                                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(!z11), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                } else {
                                    function12 = function14;
                                    obj2 = null;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                                z4 = zBooleanValue2;
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback4, 0.0f, 1, obj2), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 2, (Object) null);
                                boolean z13 = (i10 & 896) == 256;
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z13 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized4 = new onExtraCallbackWithResult(litetrackwatchdoghandlerthreadopt, getsupportedhighspeedresolutionsfor2, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(litetrackwatchdoghandlerthreadopt, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 >> 6) & 14);
                                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z11);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnExtraCallback || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized5 = new onNavigationEvent(z11, getsupportedhighspeedresolutionsfor3, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                }
                                int i57 = i10 >> 12;
                                onextracallback2 = onextracallback4;
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(creditHomeLargeBannerResponse2, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i57 & 14);
                                if (creditHomeLargeBannerResponse2 != null) {
                                    creditHomeLargeBannerType = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse2}, zzgsa.onWarmupCompleted());
                                } else {
                                    creditHomeLargeBannerType = null;
                                }
                                switch (creditHomeLargeBannerType == null ? -1 : onExtraCallback.onExtraCallback[creditHomeLargeBannerType.ordinal()]) {
                                    case -1:
                                    case 6:
                                        z8 = z7;
                                        function1 = function12;
                                        obj = null;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1742995468);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        Unit unit = Unit.INSTANCE;
                                        break;
                                    case 0:
                                    default:
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1995770051);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        throw new NoWhenBranchMatchedException();
                                    case 1:
                                        z8 = z7;
                                        function1 = function12;
                                        obj = null;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1739317101);
                                        onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, creditHomeLargeBannerResponse2, function1, z8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i10 >> 9) & 1008) | (i57 & 7168), 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        Unit unit2 = Unit.INSTANCE;
                                        break;
                                    case 2:
                                        z8 = z7;
                                        function1 = function12;
                                        obj = null;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1739592877);
                                        onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, creditHomeLargeBannerResponse2, function1, z8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i57 & 7168) | ((i10 >> 9) & 1008), 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        Unit unit3 = Unit.INSTANCE;
                                        break;
                                    case 3:
                                        obj = null;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1739880340);
                                        z8 = z7;
                                        function1 = function12;
                                        EngineInitFailedPoint.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)))), z4 && onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2), ForwardingCameraControl.onExtraCallback(544781295, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda19
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i58 = 2 % 2;
                                                int i59 = onExtraCallbackWithResult + 7;
                                                onExtraCallback = i59 % 128;
                                                int i60 = i59 % 2;
                                                Unit unitIAuthTabCallback = getQos.IAuthTabCallback(creditHomeLargeBannerResponse2, function1, z8, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                int i61 = onExtraCallback + 53;
                                                onExtraCallbackWithResult = i61 % 128;
                                                if (i61 % 2 == 0) {
                                                    int i62 = 18 / 0;
                                                }
                                                return unitIAuthTabCallback;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        Unit unit4 = Unit.INSTANCE;
                                        break;
                                    case 4:
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1740455080);
                                        final boolean zOnExtraCallbackWithResult = appIdForPluginAndTinyApp.onExtraCallbackWithResult(creditHomeLargeBannerResponse2);
                                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1992876495, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda20
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i58 = 2 % 2;
                                                int i59 = onExtraCallbackWithResult + 87;
                                                onNavigationEvent = i59 % 128;
                                                if (i59 % 2 != 0) {
                                                    return getQos.onWarmupCompleted(zOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback, str2, creditHomeLargeBannerResponse2, function15, getsupportedhighspeedresolutionsfor3, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                }
                                                Unit unitOnWarmupCompleted = getQos.onWarmupCompleted(zOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback, str2, creditHomeLargeBannerResponse2, function15, getsupportedhighspeedresolutionsfor3, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                int i60 = 50 / 0;
                                                return unitOnWarmupCompleted;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                        if (zOnExtraCallbackWithResult) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1741126013);
                                            obj = null;
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setHoverListener.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, onQueryRefine.onExtraCallback(0.0f, 200.0f, ExtensionsManager1.onNavigationEvent(setSwitchPadding.onWarmupCompleted(ExtensionsManager1.Companion)), 1, (Object) null), (Function2) null, 2, (Object) null);
                                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        } else {
                                            obj = null;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1741552232);
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        Unit unit5 = Unit.INSTANCE;
                                        z8 = z7;
                                        function1 = function12;
                                        break;
                                    case 5:
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1741689655);
                                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z11);
                                        boolean z14 = (1879048192 & i10) == 536870912;
                                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if ((zOnExtraCallback2 | z14) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized6 = new onWarmupCompleted(z11, function03, null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                        }
                                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z11), (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        final boolean z15 = z11;
                                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1823624910, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda21
                                            private static int onExtraCallback = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i58 = 2 % 2;
                                                int i59 = onExtraCallback + 9;
                                                onNavigationEvent = i59 % 128;
                                                int i60 = i59 % 2;
                                                boolean z16 = z15;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                Object[] objArr2 = {Boolean.valueOf(z16), quirksExternalSyntheticBackport0OnExtraCallback, str2, creditHomeLargeBannerResponse2, function15, getsupportedhighspeedresolutionsfor3, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(iIntValue4)};
                                                int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                                                Unit unit6 = (Unit) getQos.onExtraCallbackWithResult(-187684607, objArr2, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 187684607, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
                                                int i61 = onNavigationEvent + 69;
                                                onExtraCallback = i61 % 128;
                                                if (i61 % 2 == 0) {
                                                    return unit6;
                                                }
                                                Object obj7 = null;
                                                obj7.hashCode();
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                        if (z11) {
                                            int i58 = IAuthTabCallbackDefault + 59;
                                            onExtraCallback = i58 % 128;
                                            int i59 = i58 % 2;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1742469181);
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setHoverListener.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, onQueryRefine.onExtraCallback(0.0f, 200.0f, ExtensionsManager1.onNavigationEvent(setSwitchPadding.onWarmupCompleted(ExtensionsManager1.Companion)), 1, (Object) null), (Function2) null, 2, (Object) null);
                                            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                                getAwbState.onExtraCallback();
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
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
                                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1742895400);
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            int i60 = onExtraCallback + 31;
                                            IAuthTabCallbackDefault = i60 % 128;
                                            if (i60 % 2 == 0) {
                                                int i61 = 5 % 4;
                                            }
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        Unit unit6 = Unit.INSTANCE;
                                        z8 = z7;
                                        function1 = function12;
                                        obj = null;
                                        break;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i62 = onExtraCallback + 81;
                                    IAuthTabCallbackDefault = i62 % 128;
                                    int i63 = i62 % 2;
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                z5 = z8;
                                function02 = function03;
                                z6 = z12;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = onextracallback2;
                                final boolean z16 = z4;
                                final Function1 function16 = function1;
                                final int i64 = i12;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda22
                                    private static int onExtraCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj5, Object obj6) throws Throwable {
                                        int i65 = 2 % 2;
                                        int i66 = onExtraCallback + 27;
                                        onExtraCallbackWithResult = i66 % 128;
                                        int i67 = i66 % 2;
                                        Unit unitIAuthTabCallback = getQos.IAuthTabCallback(onextracallback5, str2, litetrackwatchdoghandlerthreadopt, z16, creditHomeLargeBannerResponse2, function16, function15, z5, z6, function02, i64, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                        int i68 = onExtraCallbackWithResult + 5;
                                        onExtraCallback = i68 % 128;
                                        int i69 = i68 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                });
                            }
                            return obj;
                        }
                        i10 |= 805306368;
                        onextracallback = onextracallback3;
                        function0 = function04;
                        Function0 function052 = function0;
                        if ((i10 & 306783379) == 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i10 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                        return obj;
                    }
                    i7 |= 100663296;
                    i10 = i7;
                    i11 = iIntValue3 & 512;
                    if (i11 == 0) {
                    }
                    onextracallback = onextracallback3;
                    function0 = function04;
                    Function0 function0522 = function0;
                    if ((i10 & 306783379) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    return obj;
                }
                i7 |= 12582912;
                z2 = zBooleanValue3;
                i9 = iIntValue3 & 256;
                if (i9 != 0) {
                }
                i10 = i7;
                i11 = iIntValue3 & 512;
                if (i11 == 0) {
                }
                onextracallback = onextracallback3;
                function0 = function04;
                Function0 function05222 = function0;
                if ((i10 & 306783379) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return obj;
            case 10:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, creditHomeLargeBannerResponse, function1, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RowScope rowScope, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rowScope, quirksExternalSyntheticBackport0, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 71 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeLargeBannerResponse, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 123;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 17;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeLargeBannerResponse, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackDefault + 73;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(-988319843, new Object[]{attachapplovinsdk}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 988319847, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int i3 = 78 / 0;
        return (Unit) onExtraCallbackWithResult(-988319843, new Object[]{attachapplovinsdk}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 988319847, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(-262831152, new Object[0], PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 262831162, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i3 = 59 / 0;
        } else {
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(-262831152, new Object[0], PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 262831162, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        int i4 = IAuthTabCallbackDefault + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(attachapplovinsdk);
        int i4 = IAuthTabCallbackDefault + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(z, quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(z, quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onExtraCallbackWithResult(-795577509, new Object[]{rally}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 795577516, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = onExtraCallback + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return appLovinSdkSettings;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(Rally rally, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(rally, isinvideousage);
        }
        onExtraCallbackWithResult(rally, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Rally onExtraCallback;

        public IAuthTabCallback(Rally rally) {
            this.onExtraCallback = rally;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.onExtraCallback.ICustomTabsServiceStub();
                obj.hashCode();
                throw null;
            }
            this.onExtraCallback.ICustomTabsServiceStub();
            int i3 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ liteTrackWatchDogHandlerThreadOpt $event;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $startAnimation$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$event = litetrackwatchdoghandlerthreadopt;
            this.$startAnimation$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$event, this.$startAnimation$delegate, access13800Var);
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 69 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 53 / 0;
            }
            int i5 = onWarmupCompleted + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor;
            boolean z;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (this.$event instanceof liteTrackWatchDogHandlerThreadOpt.IAuthTabCallbackStubProxy) {
                int i4 = onWarmupCompleted + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    getsupportedhighspeedresolutionsfor = this.$startAnimation$delegate;
                    z = false;
                } else {
                    getsupportedhighspeedresolutionsfor = this.$startAnimation$delegate;
                    z = true;
                }
                getQos.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, z);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $shouldOverlayAnimate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showDelayedBanner$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$shouldOverlayAnimate = z;
            this.$showDelayedBanner$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$shouldOverlayAnimate, this.$showDelayedBanner$delegate, access13800Var);
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 96 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$shouldOverlayAnimate) {
                    int i5 = IAuthTabCallback + 77;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    getQos.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$showDelayedBanner$delegate, false);
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(220L, this) == objOnWarmupCompleted) {
                        int i7 = onNavigationEvent + 3;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            getQos.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$showDelayedBanner$delegate, true);
            return Unit.INSTANCE;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 95;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $10 + 79;
            $11 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i11 = 10 - (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, i11, packedPositionChild, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.red(0) + 10, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 13 - TextUtils.indexOf((CharSequence) "", '0', 0), 19901 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback;
            int i4 = i3 + 55;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 79;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 2;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 13;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(544781295, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBanner.<anonymous> (CreditHomeLargeBanner.kt:130)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(544781295, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBanner.<anonymous> (CreditHomeLargeBanner.kt:130)");
            }
            onExtraCallback(creditHomeLargeBannerResponse, function1, z, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        Rally rallyOnNavigationEvent;
        Function1 function12;
        int i2;
        int i3;
        int i4 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onExtraCallback + 55;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1992876495, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBanner.<anonymous> (CreditHomeLargeBanner.kt:142)");
            }
            if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-450674166);
                if (z) {
                    int i6 = IAuthTabCallbackDefault + 39;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-450584824);
                        rallyOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 1);
                        function12 = null;
                        i2 = 0;
                        i3 = 5;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-450584824);
                        rallyOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
                        function12 = null;
                        i2 = 0;
                        i3 = 2;
                    }
                    quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0, rallyOnNavigationEvent, function12, cameraCaptureResultEmptyCameraCaptureResult, i2, i3);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-450475177);
                    quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0, RuntimeEnvironmentProxy.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                RuntimeEnvironmentProxy.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, str, creditHomeLargeBannerResponse, function1, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-450206159);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = IAuthTabCallbackDefault + 55;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 % 2;
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 87;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallbackDefault + 119;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0<Unit> $onDualRowAnimationShown;
        final /* synthetic */ boolean $shouldOverlayAnimate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, Function0<Unit> function0, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$shouldOverlayAnimate = z;
            this.$onDualRowAnimationShown = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$shouldOverlayAnimate, this.$onDualRowAnimationShown, access13800Var);
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$shouldOverlayAnimate) {
                this.$onDualRowAnimationShown.invoke();
                int i2 = IAuthTabCallback + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 % 2;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 2392;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
            i = 18593;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
            i = 500;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        attachapplovinsdk.IAuthTabCallback(500);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Rally onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1828030334, i, -1, "im.toss.feature.credit.ui.main.home.component.createBannerEntranceRally (CreditHomeLargeBanner.kt:216)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 87;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = getQos.onWarmupCompleted((Rally) obj);
                    if (i6 != 0) {
                        int i7 = 32 / 0;
                    }
                    return appLovinSdkSettingsOnWarmupCompleted;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 24576, 16383);
        Unit unit = Unit.INSTANCE;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj) {
                    decrementVideoUsage decrementvideousageOnWarmupCompleted;
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 93;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        decrementvideousageOnWarmupCompleted = getQos.onWarmupCompleted(rallyOnExtraCallback, (isInVideoUsage) obj);
                        int i6 = 21 / 0;
                    } else {
                        decrementvideousageOnWarmupCompleted = getQos.onWarmupCompleted(rallyOnExtraCallback, (isInVideoUsage) obj);
                    }
                    int i7 = onExtraCallback + 57;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return decrementvideousageOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(unit, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallbackDefault + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return rallyOnExtraCallback;
    }

    private static final Unit onNavigationEvent(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeLargeBannerResponse);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        String str;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault;
        String str2;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jPostMessage;
        long jNewSession;
        long jPostMessage2;
        Object objOnMinimized;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault2;
        String str3;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault3;
        String strOnExtraCallbackWithResult;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent;
        String strOnExtraCallbackWithResult2;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent2;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackDefault + 59;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2129367241, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleDualColumnBanner.<anonymous> (CreditHomeLargeBanner.kt:262)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda3.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, 1, (Object) null), CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda1.Min);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = onExtraCallback + 47;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                getAwbState.onExtraCallback();
                int i7 = onExtraCallback + 47;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onExtraCallback + 81;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda15
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 49;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitOnWarmupCompleted = getQos.onWarmupCompleted((useAndConfigureProgramWithTexture) obj2);
                        if (i13 != 0) {
                            int i14 = 68 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, getExtensionsBeforeInitialized.IAuthTabCallback(onextracallback, true, (Function1) objOnMinimized2), 1.0f, false, 2, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 11, (Object) null);
            CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault4 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
            if (dualColumnContentsIAuthTabCallbackDefault4 == null || (columnContentOnNavigationEvent2 = dualColumnContentsIAuthTabCallbackDefault4.onNavigationEvent()) == null) {
                str = "";
                dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                if (dualColumnContentsIAuthTabCallbackDefault != null || (columnContentOnNavigationEvent = dualColumnContentsIAuthTabCallbackDefault.onNavigationEvent()) == null || (strOnExtraCallbackWithResult2 = columnContentOnNavigationEvent.onExtraCallbackWithResult()) == null) {
                    int i11 = onExtraCallback + 73;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                    str2 = "";
                } else {
                    str2 = strOnExtraCallbackWithResult2;
                }
                onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0OnExtraCallback, str, str2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-335451089);
                    jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).postMessage();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-335452273);
                    jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).newSession();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage, 0.0f)));
                if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-335444817);
                    jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).newSessionWithExtras();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-335443633);
                    jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).newSession();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(jNewSession));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-335439249);
                    jPostMessage2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).postMessage();
                } else {
                    int i13 = IAuthTabCallbackDefault + 57;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-335440433);
                    jPostMessage2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).newSession();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0AsBinder, new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage2, 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult, 390, 4), cameraCaptureResultEmptyCameraCaptureResult, 0);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda16
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i15 = 2 % 2;
                            int i16 = onNavigationEvent + 63;
                            onExtraCallbackWithResult = i16 % 128;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                            if (i16 % 2 != 0) {
                                return getQos.IAuthTabCallback(useandconfigureprogramwithtexture);
                            }
                            getQos.IAuthTabCallback(useandconfigureprogramwithtexture);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, getExtensionsBeforeInitialized.IAuthTabCallback(onextracallback, true, (Function1) objOnMinimized), 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), 0.0f, 10, (Object) null);
                dualColumnContentsIAuthTabCallbackDefault2 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                if (dualColumnContentsIAuthTabCallbackDefault2 != null || (columnContentOnWarmupCompleted = dualColumnContentsIAuthTabCallbackDefault2.onWarmupCompleted()) == null) {
                    str3 = "";
                    dualColumnContentsIAuthTabCallbackDefault3 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    if (dualColumnContentsIAuthTabCallbackDefault3 != null) {
                        int i15 = onExtraCallback + 123;
                        IAuthTabCallbackDefault = i15 % 128;
                        int i16 = i15 % 2;
                        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted2 = dualColumnContentsIAuthTabCallbackDefault3.onWarmupCompleted();
                        String str4 = (columnContentOnWarmupCompleted2 == null || (strOnExtraCallbackWithResult = columnContentOnWarmupCompleted2.onExtraCallbackWithResult()) == null) ? "" : strOnExtraCallbackWithResult;
                        onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0OnExtraCallback2, str3, str4, cameraCaptureResultEmptyCameraCaptureResult, 6);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), onextracallbackwithresult.IAuthTabCallbackStub());
                        Object[] objArr = new Object[1];
                        a(new char[]{33401, 45059, 33771, 49871, 19509, 8306, 22372, 65145, 6421, 31420, 12807, 62368, 52086, 49600, 36963, 18460, 32063, 31361, 31300, 11799, 55117, 60016, 55812, 9868, 19119, 1616, 42507, 40164, 38266, 42330, 10943, 31217, 15839, 35450, 27756, 47080, 52086, 49600, 17202, 51160, 597, 36725, 41292, 36138, 32183, 48846, 35057, 36779, 17526, 34420, 33401, 45059, 22355, 25209, 53916, 33884, 16436, 38573, 47264, 39091, 16481, 52632, 54651, 7740, 10943, 31217}, 65 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnWarmupCompleted4, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i17 = IAuthTabCallbackDefault + 121;
                            onExtraCallback = i17 % 128;
                            int i18 = i17 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    int i19 = IAuthTabCallbackDefault + 25;
                    onExtraCallback = i19 % 128;
                    if (i19 % 2 != 0) {
                        columnContentOnWarmupCompleted.onNavigationEvent();
                        throw null;
                    }
                    String strOnNavigationEvent = columnContentOnWarmupCompleted.onNavigationEvent();
                    if (strOnNavigationEvent != null) {
                        str3 = strOnNavigationEvent;
                    }
                    dualColumnContentsIAuthTabCallbackDefault3 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    if (dualColumnContentsIAuthTabCallbackDefault3 != null) {
                    }
                }
            } else {
                int i20 = IAuthTabCallbackDefault + 9;
                onExtraCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    columnContentOnNavigationEvent2.onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                String strOnNavigationEvent2 = columnContentOnNavigationEvent2.onNavigationEvent();
                if (strOnNavigationEvent2 != null) {
                    str = strOnNavigationEvent2;
                }
                dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                if (dualColumnContentsIAuthTabCallbackDefault != null) {
                    int i112 = onExtraCallback + 73;
                    IAuthTabCallbackDefault = i112 % 128;
                    int i122 = i112 % 2;
                    str2 = "";
                    onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0OnExtraCallback, str, str2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
                    y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage, 0.0f)));
                    if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(jNewSession));
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0AsBinder2, new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback22, getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage2, 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult, 390, 4), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, getExtensionsBeforeInitialized.IAuthTabCallback(onextracallback, true, (Function1) objOnMinimized), 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), 0.0f, 10, (Object) null);
                    dualColumnContentsIAuthTabCallbackDefault2 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                    if (dualColumnContentsIAuthTabCallbackDefault2 != null) {
                        str3 = "";
                        dualColumnContentsIAuthTabCallbackDefault3 = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
                        if (dualColumnContentsIAuthTabCallbackDefault3 != null) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, final Function1<? super CreditHomeLargeBannerResponse, Unit> function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        final boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-543680611);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse)) {
                int i8 = onExtraCallback + 111;
                int i9 = i8 % 128;
                IAuthTabCallbackDefault = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 81;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i13 = onExtraCallback + 47;
            IAuthTabCallbackDefault = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 15 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i16 = onExtraCallback + 29;
                    IAuthTabCallbackDefault = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                z3 = z2;
            } else {
                if (i15 != 0) {
                    int i18 = IAuthTabCallbackDefault + 85;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i20 = IAuthTabCallbackDefault + 81;
                    onExtraCallback = i20 % 128;
                    if (i20 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-543680611, i3, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleDualColumnBanner (CreditHomeLargeBanner.kt:252)");
                        int i21 = 10 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-543680611, i3, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleDualColumnBanner (CreditHomeLargeBanner.kt:252)");
                    }
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                boolean z5 = (i3 & 112) == 32;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnExtraCallback | z5)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda12
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i22 = 2 % 2;
                                int i23 = onWarmupCompleted + 97;
                                onNavigationEvent = i23 % 128;
                                int i24 = i23 % 2;
                                Function1 function12 = function1;
                                if (i24 == 0) {
                                    return getQos.onExtraCallback(function12, creditHomeLargeBannerResponse);
                                }
                                int i25 = 62 / 0;
                                return getQos.onExtraCallback(function12, creditHomeLargeBannerResponse);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                        obj = function0;
                    }
                    BlankScreenPoint.onWarmupCompleted(configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, (Function0) obj, 251, (Object) null), 16, 14, 20, z4, ForwardingCameraControl.onExtraCallback(-2129367241, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda13
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3) throws Throwable {
                            int i22 = 2 % 2;
                            int i23 = onWarmupCompleted + 101;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = creditHomeLargeBannerResponse;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (i24 == 0) {
                                return getQos.IAuthTabCallback(creditHomeLargeBannerResponse2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                            }
                            getQos.IAuthTabCallback(creditHomeLargeBannerResponse2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (57344 & (i3 << 6)) | 200112, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    z3 = z4;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda14
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3) {
                        Unit unitOnExtraCallbackWithResult;
                        int i22 = 2 % 2;
                        int i23 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i23 % 128;
                        if (i23 % 2 == 0) {
                            unitOnExtraCallbackWithResult = getQos.onExtraCallbackWithResult(creditHomeLargeBannerResponse, function1, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i24 = 39 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = getQos.onExtraCallbackWithResult(creditHomeLargeBannerResponse, function1, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i25 = onNavigationEvent + 83;
                        onExtraCallbackWithResult = i25 % 128;
                        int i26 = i25 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        int i22 = onExtraCallback + 19;
        IAuthTabCallbackDefault = i22 % 128;
        int i23 = i22 % 2;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[PHI: r1
      0x006e: PHI (r1v14 java.lang.String) = (r1v13 java.lang.String), (r1v15 java.lang.String) binds: [B:22:0x006b, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str;
        long jICustomTabsService;
        String strIAuthTabCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onExtraCallback + 77;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 41;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(153949068, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleListRowBanner.<anonymous>.<anonymous>.<anonymous> (CreditHomeLargeBanner.kt:337)");
                    int i6 = 0 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(153949068, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleListRowBanner.<anonymous>.<anonymous>.<anonymous> (CreditHomeLargeBanner.kt:337)");
                }
            }
            CreditHomeLargeBannerResponse.Content contentOnExtraCallbackWithResult = creditHomeLargeBannerResponse.onExtraCallbackWithResult();
            if (contentOnExtraCallbackWithResult != null) {
                int i7 = onExtraCallback + 17;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    strIAuthTabCallback = contentOnExtraCallbackWithResult.IAuthTabCallback();
                    int i8 = 82 / 0;
                    str = strIAuthTabCallback == null ? "" : strIAuthTabCallback;
                } else {
                    strIAuthTabCallback = contentOnExtraCallbackWithResult.IAuthTabCallback();
                    if (strIAuthTabCallback == null) {
                    }
                }
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1916174003);
                    jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1916174963);
                    long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    int i9 = IAuthTabCallbackDefault + 95;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    jICustomTabsService = jLongValue;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, new getHumanReadableName(jICustomTabsService, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777212, (DefaultConstructorMarker) null), 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131066}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CreditHomeLargeBannerResponse.Content contentOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        IAuthTabCallbackDefault = i3 % 128;
        String str = "";
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 110) != 18) {
                int i4 = onExtraCallback + 51;
                IAuthTabCallbackDefault = i4 % 128;
                z = i4 % 2 != 0;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallback + 49;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 20 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1561649523, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleListRowBanner.<anonymous>.<anonymous>.<anonymous> (CreditHomeLargeBanner.kt:346)");
                }
                contentOnExtraCallbackWithResult = creditHomeLargeBannerResponse.onExtraCallbackWithResult();
                Object obj = null;
                if (contentOnExtraCallbackWithResult != null) {
                    int i7 = onExtraCallback + 83;
                    IAuthTabCallbackDefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        contentOnExtraCallbackWithResult.onExtraCallbackWithResult();
                        obj.hashCode();
                        throw null;
                    }
                    String strOnExtraCallbackWithResult = contentOnExtraCallbackWithResult.onExtraCallbackWithResult();
                    if (strOnExtraCallbackWithResult != null) {
                        str = strOnExtraCallbackWithResult;
                    }
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(AppLovinCmpErrorCode.onNavigationEvent(str, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2), (QuirksExternalSyntheticBackport0) null, new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262138);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                contentOnExtraCallbackWithResult = creditHomeLargeBannerResponse.onExtraCallbackWithResult();
                Object obj2 = null;
                if (contentOnExtraCallbackWithResult != null) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(AppLovinCmpErrorCode.onNavigationEvent(str, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2), (QuirksExternalSyntheticBackport0) null, new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262138);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z = false;
        final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int i = 3;
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i5 = onExtraCallback + 69;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i7 = onExtraCallback + 67;
                    IAuthTabCallbackDefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        i = 4;
                    }
                } else {
                    i = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i8 = onExtraCallback + 125;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(868424645, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleListRowBanner.<anonymous>.<anonymous> (CreditHomeLargeBanner.kt:335)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, ForwardingCameraControl.onExtraCallback(153949068, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 117;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = creditHomeLargeBannerResponse;
                    RowScope rowScope = (RowScope) obj;
                    if (i12 != 0) {
                        return getQos.onExtraCallbackWithResult(creditHomeLargeBannerResponse2, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = getQos.onExtraCallbackWithResult(creditHomeLargeBannerResponse2, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = 49 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1561649523, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i11 % 128;
                    Object obj4 = null;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    Unit unit = (Unit) getQos.onExtraCallbackWithResult(244922370, new Object[]{creditHomeLargeBannerResponse, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -244922365, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
                    int i12 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unit;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1732372494, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1732372479, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function1 function1, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(creditHomeLargeBannerResponse);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final Function1 function1, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<ImageLoaderBuilderExternalSyntheticLambda6>) getsupportedhighspeedresolutionsfor).onWarmupCompleted(new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = getQos.IAuthTabCallback(function1, creditHomeLargeBannerResponse);
                int i5 = onExtraCallback + 89;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final Function1 function1, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onExtraCallback + 87;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(545928866, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleListRowBanner.<anonymous> (CreditHomeLargeBanner.kt:333)");
            }
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(868424645, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 97;
                    onWarmupCompleted = i8 % 128;
                    Object obj4 = null;
                    if (i8 % 2 != 0) {
                        getQos.IAuthTabCallback(creditHomeLargeBannerResponse, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = getQos.IAuthTabCallback(creditHomeLargeBannerResponse, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = onWarmupCompleted + 97;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
            getViewTypeCount.onTransact ontransactIAuthTabCallback = getViewTypeCount.onTransact.Companion.IAuthTabCallback();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeLargeBannerResponse);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda9
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 117;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitOnExtraCallback = getQos.onExtraCallback(getsupportedhighspeedresolutionsfor, function1, creditHomeLargeBannerResponse);
                            int i10 = onWarmupCompleted + 81;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                Float fValueOf = Float.valueOf(0.0f);
                w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{encoderProfilesProxyVideoProfileProxyOnExtraCallback, true, null, null, null, null, null, onextracallbackOnNavigationEvent, null, fValueOf, null, null, null, ontransactIAuthTabCallback, null, (Function0) obj, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12582966, 3072, 221052}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, final Function1<? super CreditHomeLargeBannerResponse, Unit> function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        boolean z2;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z3;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2070641288);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            int i8 = IAuthTabCallbackDefault + 49;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse)) {
                int i10 = IAuthTabCallbackDefault + 87;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                int i13 = IAuthTabCallbackDefault + 79;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    i4 = 2048;
                } else {
                    int i15 = onExtraCallback + 5;
                    IAuthTabCallbackDefault = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (i12 != 0) {
                    int i17 = IAuthTabCallbackDefault + 45;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2070641288, i3, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeSimpleListRowBanner (CreditHomeLargeBanner.kt:323)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new ImageLoaderBuilderExternalSyntheticLambda6(2000L), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                BlankScreenPoint.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), 0, 8, 0, z3, ForwardingCameraControl.onExtraCallback(545928866, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda10
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = 2 % 2;
                        int i20 = onNavigationEvent + 23;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitIAuthTabCallback = getQos.IAuthTabCallback(function1, creditHomeLargeBannerResponse, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i22 = onExtraCallback + 51;
                        onNavigationEvent = i22 % 128;
                        int i23 = i22 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 57344) | 197040, 8);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = IAuthTabCallbackDefault + 23;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                z2 = z3;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final boolean z4 = z2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i21 = 2 % 2;
                        int i22 = onExtraCallbackWithResult + 61;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 == 0) {
                            return getQos.IAuthTabCallback(quirksExternalSyntheticBackport03, creditHomeLargeBannerResponse, function1, z4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        Unit unitIAuthTabCallback = getQos.IAuthTabCallback(quirksExternalSyntheticBackport03, creditHomeLargeBannerResponse, function1, z4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i23 = 14 / 0;
                        return unitIAuthTabCallback;
                    }
                });
                return;
            }
            return;
        }
        int i21 = onExtraCallback + 49;
        IAuthTabCallbackDefault = i21 % 128;
        i3 = i21 % 2 == 0 ? i3 | 4195 : i3 | 3072;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final RowScope rowScope, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, final String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jOnUnminimized;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(82173556);
        if ((i & 48) == 0) {
            int i6 = IAuthTabCallbackDefault + 83;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i8 = IAuthTabCallbackDefault + 71;
                onExtraCallback = i8 % 128;
                i4 = i8 % 2 != 0 ? 121 : 32;
            } else {
                i4 = 16;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            int i9 = IAuthTabCallbackDefault + 113;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
            int i10 = onExtraCallback + 59;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i & 3072) == 0) {
            int i12 = onExtraCallback + 17;
            IAuthTabCallbackDefault = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 91 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
            }
            i2 |= i3;
        }
        int i14 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 1169) != 1168, i14 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(82173556, i14, -1, "im.toss.feature.credit.ui.main.home.component.ColumnItem (CreditHomeLargeBanner.kt:376)");
            }
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, Long.valueOf(jIsEngagementSignalsApiAvailable), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i14 >> 9) & 14) | 24576), 196608, 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13);
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(142993905);
                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(142994865);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
            }
            long j = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            GraphicDeviceInfo graphicDeviceInfoOnTransact = isrepeatingenabled.onTransact();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), Long.valueOf(jOnExtraCallback2), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnTransact, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i14 >> 6) & 14) | 24576), 196608, 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 123;
                IAuthTabCallbackDefault = i15 % 128;
                if (i15 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i16 = 20 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLargeBannerKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = IAuthTabCallback + 113;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        return getQos.onExtraCallbackWithResult(rowScope, quirksExternalSyntheticBackport0, str, str2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    getQos.onExtraCallbackWithResult(rowScope, quirksExternalSyntheticBackport0, str, str2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallback + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = onExtraCallback + 77;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            return null;
        }
        int i4 = 81 / 0;
        return null;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(Rally rally, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(rally);
        int i2 = IAuthTabCallbackDefault + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final ImageLoaderBuilderExternalSyntheticLambda6 onNavigationEvent(getSupportedHighSpeedResolutionsFor<ImageLoaderBuilderExternalSyntheticLambda6> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6 = (ImageLoaderBuilderExternalSyntheticLambda6) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return imageLoaderBuilderExternalSyntheticLambda6;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-187684607, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 187684607, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(1184578854, new Object[]{attachapplovinsdk}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1184578846, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditHomeLargeBannerResponse, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(244922370, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -244922365, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @Nullable liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, boolean z, @Nullable CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, @NotNull Function1<? super CreditHomeLargeBannerResponse, Unit> function1, @NotNull Function1<? super String, Unit> function12, boolean z2, boolean z3, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, litetrackwatchdoghandlerthreadopt, Boolean.valueOf(z), creditHomeLargeBannerResponse, function1, function12, Boolean.valueOf(z2), Boolean.valueOf(z3), function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(-1351414432, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 1351414441, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-262831152, new Object[0], PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 262831162, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(1376192920, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1376192919, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) throws Throwable {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(451290588, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -451290582, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditHomeLargeBannerResponse, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-2004947172, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 2004947174, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, creditHomeLargeBannerResponse, function1, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(1793451788, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1793451785, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final AppLovinSdkSettings onExtraCallback(Rally rally) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (AppLovinSdkSettings) onExtraCallbackWithResult(-795577509, new Object[]{rally}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 795577516, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-988319843, new Object[]{attachapplovinsdk}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 988319847, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }
}
