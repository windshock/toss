package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.appsintoss.R$string;
import im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem;
import im.toss.appsintoss.iap.screen.InAppPurchaseHistoryListScreenKt$;
import im.toss.tds.compose.R;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPrivacyDestinationUri;
import o.oExternalSyntheticLambda0;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = -2828124857048429403L;

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder();
        int i4 = onExtraCallback + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3);
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 103;
        onExtraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            IAuthTabCallbackStub(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 89;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 29;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 51;
        onExtraCallback = i5 % 128;
        IAuthTabCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 59;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact();
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface();
            throw null;
        }
        Unit unitAsInterface = asInterface();
        int i3 = IAuthTabCallback + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, 1727116706, iOnWarmupCompleted2, iOnWarmupCompleted, -1727116701, new Object[]{str, str2, str3});
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i6;
        int i8 = ~(i7 | i3 | i5);
        int i9 = (~((~i5) | i3)) | (~(i3 | i6));
        int i10 = i3 + i6 + i4 + (32217706 * i2) + (238734613 * i);
        int i11 = i10 * i10;
        int i12 = ((1127137324 * i3) - 440746823) + (i6 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (1127136485 * i4) + (976419026 * i2) + (1106960329 * i) + (i11 * 279773184);
        int i13 = (((-3446596) * i3) - 528416768) + (677943110 * i6) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i2) + ((-131989504) * i) + ((-1876361216) * i11) + (i12 * i12 * (-1943076864));
        if (i13 == 1) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
            InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = (InAppPurchaseHistoryViewModel) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
            getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[4];
            Function0 function0 = (Function0) objArr[5];
            Function0 function02 = (Function0) objArr[6];
            Function0 function03 = (Function0) objArr[7];
            Function0 function04 = (Function0) objArr[8];
            int iIntValue = ((Number) objArr[9]).intValue();
            int iIntValue2 = ((Number) objArr[10]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
            int iIntValue3 = ((Number) objArr[12]).intValue();
            int i14 = 2 % 2;
            int i15 = onExtraCallback + 123;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, zBooleanValue, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            int i17 = onExtraCallback + 15;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            return unitOnWarmupCompleted;
        }
        if (i13 == 2) {
            return onExtraCallback(objArr);
        }
        if (i13 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i13 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i13 == 5) {
            return IAuthTabCallback(objArr);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[0];
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel2 = (InAppPurchaseHistoryViewModel) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[3];
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[4];
        Function0 function05 = (Function0) objArr[5];
        Function0 function06 = (Function0) objArr[6];
        Function0 function07 = (Function0) objArr[7];
        Function0 function08 = (Function0) objArr[8];
        int iIntValue4 = ((Number) objArr[9]).intValue();
        int iIntValue5 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue6 = ((Number) objArr[12]).intValue();
        int i19 = 2 % 2;
        int i20 = IAuthTabCallback + 59;
        onExtraCallback = i20 % 128;
        int i21 = i20 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, inAppPurchaseHistoryViewModel2, zBooleanValue2, getbacktracenote3, getbacktracenote4, function05, function06, function07, function08, iIntValue4, iIntValue5, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue6);
        int i22 = onExtraCallback + 61;
        IAuthTabCallback = i22 % 128;
        int i23 = i22 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        Function0 function02 = (Function0) objArr[4];
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = (InAppPurchaseHistoryViewModel) objArr[5];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[6];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote, getbacktracenote2, function0, function02, inAppPurchaseHistoryViewModel, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote, getbacktracenote2, function0, function02, inAppPurchaseHistoryViewModel, audioRestrictionControllerImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, 533259609, iOnWarmupCompleted2, iOnWarmupCompleted, -533259605, new Object[0]);
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = onExtraCallback + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitAsInterface = asInterface(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 68 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = IAuthTabCallback + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = IAuthTabCallback + 83;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, z, getbacktracenote, getbacktracenote2, function0, function02, function03, function04, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 49;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 63;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        return unit2;
    }

    private static final Unit asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            int i3 = 81 / 0;
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-931558824, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryListScreen.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryListScreen.kt:70)");
            }
            y1a y1aVar = y1a.onWarmupCompleted;
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.appsintoss_purchase_history_action_disclaimer, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i5 = onExtraCallback + 87;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda14(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                    obj = externalSyntheticLambda14;
                }
                y1aVar.onExtraCallbackWithResult(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, 0L, (getHumanReadableName) null, (GraphicDeviceInfo) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 6, 510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = IAuthTabCallback + 41;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 43;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, ImageFormat.getBitsPerPixel(0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 27;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 59 - TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $11 + 125;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final Unit asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onExtraCallback implements getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30 onWarmupCompleted;

        onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30 safeActivityEmbeddingComponentProviderExternalSyntheticLambda30) {
            this.onWarmupCompleted = safeActivityEmbeddingComponentProviderExternalSyntheticLambda30;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((areAllItemsEnabled) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            boolean z;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            Object obj = null;
            if ((i & 6) == 0) {
                int i4 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled);
                    obj.hashCode();
                    throw null;
                }
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled) ? 4 : 2) | i;
                int i5 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i7 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i9 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1965414750, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryListScreen.kt:129)");
            }
            areallitemsenabled.onWarmupCompleted(this.onWarmupCompleted.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.asBinder(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 196608, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
            }
        }
    }

    static final class onNavigationEvent implements getBacktraceNote<String, String, String, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getBacktraceNote<String, String, String, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote) {
            this.onWarmupCompleted = getbacktracenote;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((String) obj, (String) obj2, (String) obj3);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(String str, String str2, String str3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.onWarmupCompleted.invoke(str, str2, str3);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onWarmupCompleted.invoke(str, str2, str3);
            int i3 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 75 / 0;
            }
        }
    }

    static final class onExtraCallbackWithResult implements getBacktraceNote<String, String, String, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getBacktraceNote<String, String, String, Unit> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote) {
            this.onNavigationEvent = getbacktracenote;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            String str = (String) obj;
            String str2 = (String) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(str, str2, (String) obj3);
                Unit unit = Unit.INSTANCE;
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            onNavigationEvent(str, str2, (String) obj3);
            Unit unit2 = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        public final void onNavigationEvent(String str, String str2, String str3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.onNavigationEvent.invoke(str, str2, str3);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onNavigationEvent.invoke(str, str2, str3);
            int i3 = IAuthTabCallback + 13;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 78 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    static final class IAuthTabCallback implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Unit> IAuthTabCallback;

        IAuthTabCallback(Function0<Unit> function0) {
            this.IAuthTabCallback = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke();
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
        }
    }

    static final class IAuthTabCallbackDefault implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Unit> onExtraCallback;
        final /* synthetic */ InAppPurchaseHistoryViewModel onExtraCallbackWithResult;

        IAuthTabCallbackDefault(Function0<Unit> function0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel) {
            this.onExtraCallback = function0;
            this.onExtraCallbackWithResult = inAppPurchaseHistoryViewModel;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.invoke();
                this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                int i3 = onWarmupCompleted + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.onExtraCallback.invoke();
            this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List listIAuthTabCallback = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback();
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(listIAuthTabCallback.size(), (Function1) null, new asBinder(listIAuthTabCallback), ForwardingCameraControl.onExtraCallbackWithResult(2039820996, true, new onTransact(listIAuthTabCallback, getbacktracenote, getbacktracenote2, function0, function02, inAppPurchaseHistoryViewModel)));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, @Nullable getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote, @Nullable getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote3;
        getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote4;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda4;
        getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote5;
        Function0<Unit> function09;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Function0<Unit> function012;
        int i11;
        int i12;
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel2;
        Object objOnMinimized;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(inAppPurchaseHistoryViewModel, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1765629986);
        int iExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.extraCallback();
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            int i15 = onExtraCallback + 53;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchaseHistoryViewModel) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i18 = onExtraCallback + 67;
                    IAuthTabCallback = i18 % 128;
                    i4 = i18 % 2 == 0 ? 23699 : 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    int i19 = IAuthTabCallback + 115;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((i & 1572864) == 0) {
                            int i21 = onExtraCallback + 111;
                            IAuthTabCallback = i21 % 128;
                            int i22 = i21 % 2;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 8388608 : 4194304;
                        }
                        i10 = i2 & 256;
                        if (i10 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 67108864 : 33554432;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                            quirksExternalSyntheticBackport02 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if (i17 != 0) {
                                int i23 = onExtraCallback + 35;
                                IAuthTabCallback = i23 % 128;
                                z3 = i23 % 2 == 0;
                            } else {
                                z3 = z2;
                            }
                            if (i5 != 0) {
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized2 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda0();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                getbacktracenote5 = (getBacktraceNote) objOnMinimized2;
                            } else {
                                getbacktracenote5 = getbacktracenote;
                            }
                            if (i6 != 0) {
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized3 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda5();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                }
                                getbacktracenote4 = (getBacktraceNote) objOnMinimized3;
                            } else {
                                getbacktracenote4 = getbacktracenote2;
                            }
                            if (i7 != 0) {
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized4 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda6();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                function09 = (Function0) objOnMinimized4;
                            } else {
                                function09 = function0;
                            }
                            if (i8 != 0) {
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized5 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda7();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                }
                                function010 = (Function0) objOnMinimized5;
                            } else {
                                function010 = function02;
                            }
                            if (i9 != 0) {
                                int i24 = onExtraCallback + 21;
                                IAuthTabCallback = i24 % 128;
                                if (i24 % 2 == 0) {
                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    int i25 = 63 / 0;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda8();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    function011 = (Function0) objOnMinimized;
                                } else {
                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    }
                                    function011 = (Function0) objOnMinimized;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda4);
                                return;
                            }
                            function011 = function03;
                            if (i10 != 0) {
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized6 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda9();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                }
                                function012 = (Function0) objOnMinimized6;
                            } else {
                                function012 = function04;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1765629986, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryListScreen (InAppPurchaseHistoryListScreen.kt:58)");
                            }
                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(inAppPurchaseHistoryViewModel.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                int i26 = onExtraCallback + 17;
                                IAuthTabCallback = i26 % 128;
                                int i27 = i26 % 2;
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-693210756);
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
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
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2090888741);
                            boolean z4 = (234881024 & i3) == 67108864;
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z4) {
                                Object obj = objOnMinimized7;
                                if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda10(function012);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda10);
                                    obj = externalSyntheticLambda10;
                                }
                                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-931558824, true, new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda11(function011), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572864, 190);
                                if (onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(inAppPurchaseHistoryViewModel.IAuthTabCallbackDefault(), Boolean.FALSE, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2))) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2091155309);
                                    removeAllUpdateListeners.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), false, false, (TdsSkeletonV1View.onWarmupCompleted) null, TdsSkeletonV1View.IAuthTabCallback.asInterface.onExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (TdsSkeletonV1View.IAuthTabCallback.asInterface.onWarmupCompleted << 12) | 6, 14);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iExtraCallback);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        return;
                                    }
                                    externalSyntheticLambda4 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda12(quirksExternalSyntheticBackport02, inAppPurchaseHistoryViewModel, z3, getbacktracenote5, getbacktracenote4, function09, function010, function011, function012, i, i2);
                                } else {
                                    function08 = function012;
                                    function07 = function011;
                                    Object obj2 = null;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2091396520);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onExtraCallback() == null) {
                                        int i28 = onExtraCallback + 109;
                                        IAuthTabCallback = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2091437873);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2091437873);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        if (z3) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2091952195);
                                            i12 = 0;
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setContentInsetsAbsolute.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                                            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
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
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized8 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda1();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                                            }
                                            i11 = 1;
                                            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Success", null, iAuthTabCallbackOnNavigationEvent, null, null, null, (Function0) objOnMinimized8, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573254, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        } else {
                                            i11 = 1;
                                            i12 = 0;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2092326024);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).IAuthTabCallback().isEmpty()) {
                                            int i29 = onExtraCallback + 59;
                                            IAuthTabCallback = i29 % 128;
                                            int i30 = i29 % 2;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2092377825);
                                            getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackDefault = getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault();
                                            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.appsintoss_purchase_history_empty_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i12);
                                            Object[] objArr = new Object[i11];
                                            a(new char[]{35322, 53683, 14668, 33053, 59573, 12289, 38979, 58350, 19273, 37659, 64161, 16961, 43527, 62880, 23834, 42269, 3245, 21572, 48155, 2035, 28511, 46854, 7923, 26205, 52741, 10667, 28996, 55564, 8379, 34880, 53321, 15290, 33629, 60170, 12981, 39522, 57864, 19956, 38249, 64780, 17578, 44155, 62489, 24568, 42877, 3859, 22203, 48765, 1612, 25021, 51579, 4370, 30904}, View.MeasureSpec.getMode(i12) + 22613, objArr);
                                            x2ExternalSyntheticLambda13.onNavigationEvent((QuirksExternalSyntheticBackport0) null, 0L, 0.0f, onextracallbackwithresultIAuthTabCallbackDefault, 0L, strOnExtraCallback, ((String) objArr[i12]).intern(), 0, (String) null, (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1575936, 0, 8087);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iExtraCallback);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                return;
                                            } else {
                                                externalSyntheticLambda4 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda2(quirksExternalSyntheticBackport02, inAppPurchaseHistoryViewModel, z3, getbacktracenote5, getbacktracenote4, function09, function010, function07, function08, i, i2);
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2092722824);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                            int i31 = (i3 & 7168) == 2048 ? i11 : i12;
                                            int i32 = (57344 & i3) == 16384 ? i11 : i12;
                                            int i33 = (3670016 & i3) == 1048576 ? i11 : i12;
                                            if ((i3 & 458752) == 131072) {
                                                inAppPurchaseHistoryViewModel2 = inAppPurchaseHistoryViewModel;
                                            } else {
                                                inAppPurchaseHistoryViewModel2 = inAppPurchaseHistoryViewModel;
                                                i11 = i12;
                                            }
                                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchaseHistoryViewModel2);
                                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (((zOnExtraCallback ? 1 : 0) | (zOnNavigationEvent ? 1 : 0) | i31 | i32 | i33 | i11) == 0) {
                                                int i34 = IAuthTabCallback + 53;
                                                onExtraCallback = i34 % 128;
                                                if (i34 % 2 != 0) {
                                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                    throw null;
                                                }
                                                Object obj3 = objOnMinimized9;
                                                if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda3(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, getbacktracenote5, getbacktracenote4, function010, function09, inAppPurchaseHistoryViewModel);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda3);
                                                    obj3 = externalSyntheticLambda3;
                                                }
                                                ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 511);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                getbacktracenote3 = getbacktracenote5;
                                                function05 = function09;
                                                function06 = function010;
                                            }
                                        }
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2091437874);
                                        Object[] objArr2 = new Object[1];
                                        a(new char[]{35322, 3825, 34760, 7335, 38333, 10971, 41783, 14364, 45401, 13865, 53013, 17435, 56559, 21978, 60158, 25535, 63629, 29030, 63103, 36617, 1079, 40220, 4679, 43696, 9182, 47232, 12705, 46738, 20345, 50275, 23881, 53800, 27485, 57360, 30893, 61937, 30363, 4080, 33985, 7486, 37496, 11096, 40992, 14650, 48660, 14071, 53150, 17627, 56748, 21138}, 34631 - AndroidCharacter.getMirror('0'), objArr2);
                                        x2ExternalSyntheticLambda13.onNavigationEvent((QuirksExternalSyntheticBackport0) null, 0L, 0.0f, new getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), RectangleShapeKt.onExtraCallback(), (DefaultConstructorMarker) null), 0L, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), deprecated_followSslRedirects.onExtraCallback(((String) objArr2[0]).intern()), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_message, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 0, 3863);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iExtraCallback);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                            return;
                                        } else {
                                            externalSyntheticLambda4 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda13(quirksExternalSyntheticBackport02, inAppPurchaseHistoryViewModel, z3, getbacktracenote5, getbacktracenote4, function09, function010, function07, function08, i, i2);
                                        }
                                    }
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda4);
                            return;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        getbacktracenote3 = getbacktracenote;
                        getbacktracenote4 = getbacktracenote2;
                        function05 = function0;
                        function06 = function02;
                        function07 = function03;
                        function08 = function04;
                        z3 = z2;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            externalSyntheticLambda4 = new InAppPurchaseHistoryListScreenKt$.ExternalSyntheticLambda4(quirksExternalSyntheticBackport02, inAppPurchaseHistoryViewModel, z3, getbacktracenote3, getbacktracenote4, function05, function06, function07, function08, i, i2);
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda4);
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static final class asBinder implements Function1<Integer, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List onNavigationEvent;

        public asBinder(List list) {
            this.onNavigationEvent = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIntValue = ((Number) obj).intValue();
            if (i3 == 0) {
                IAuthTabCallback(iIntValue);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(iIntValue);
            int i4 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent.get(i);
            int i5 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
    }

    public static final class onTransact implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ getBacktraceNote onExtraCallback;
        final /* synthetic */ getBacktraceNote onExtraCallbackWithResult;
        final /* synthetic */ Function0 onNavigationEvent;
        final /* synthetic */ InAppPurchaseHistoryViewModel onTransact;
        final /* synthetic */ List onWarmupCompleted;

        public onTransact(List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel) {
            this.onWarmupCompleted = list;
            this.onExtraCallbackWithResult = getbacktracenote;
            this.onExtraCallback = getbacktracenote2;
            this.IAuthTabCallback = function0;
            this.onNavigationEvent = function02;
            this.onTransact = inAppPurchaseHistoryViewModel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = asInterface + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackDefault + 29;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:77:0x034c  */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
            int i3;
            boolean z;
            int i4;
            int i5 = 2 % 2;
            if ((i2 & 6) == 0) {
                int i6 = asInterface + 83;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i8 = asInterface + 125;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                int i10 = asInterface + 113;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38 safeActivityEmbeddingComponentProviderExternalSyntheticLambda38 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30) this.onWarmupCompleted.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(720817693);
            if (!(safeActivityEmbeddingComponentProviderExternalSyntheticLambda38 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32)) {
                if (!(!(safeActivityEmbeddingComponentProviderExternalSyntheticLambda38 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38))) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(721377242);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItemOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda38.onExtraCallback();
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onExtraCallbackWithResult);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new onNavigationEvent(this.onExtraCallbackWithResult);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    getBacktraceNote getbacktracenote = (getBacktraceNote) objOnMinimized;
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onExtraCallback);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new onExtraCallbackWithResult(this.onExtraCallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda2.onExtraCallback(onextracallback, appsInTossPurchasedHistoryItemOnExtraCallback, getbacktracenote, (getBacktraceNote) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda38, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda29.IAuthTabCallback)) {
                    int i12 = asInterface + 41;
                    IAuthTabCallbackDefault = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(722020461);
                    Unit unit = Unit.INSTANCE;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new onWarmupCompleted(null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f));
                    TdsSkeletonV1View.IAuthTabCallback.onExtraCallback onextracallback2 = new TdsSkeletonV1View.IAuthTabCallback.onExtraCallback(CollectionsKt.listOf(new TdsSkeletonV1View.onExtraCallbackWithResult.onWarmupCompleted()));
                    onextracallback2.onExtraCallback(3);
                    removeAllUpdateListeners.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, false, false, (TdsSkeletonV1View.onWarmupCompleted) null, onextracallback2, cameraCaptureResultEmptyCameraCaptureResult, (TdsSkeletonV1View.IAuthTabCallback.onExtraCallback.onNavigationEvent << 12) | 6, 14);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    if (!Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda38, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda39.onWarmupCompleted)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1639315802);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(722791865);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.IAuthTabCallback);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent3 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new IAuthTabCallback(this.IAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, (Object) null, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 6, 3);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onNavigationEvent);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.onTransact);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent4 | zOnExtraCallback) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized5 = new IAuthTabCallbackDefault(this.onNavigationEvent, this.onTransact);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, false, (String) null, (Role) null, (Function0) objOnMinimized5, 28, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 1, (Object) null);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i14 = asInterface + 57;
                        IAuthTabCallbackDefault = i14 % 128;
                        if (i14 % 2 != 0) {
                            getAwbState.onExtraCallback();
                            int i15 = 82 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.appsintoss_purchase_history_error_footer, cameraCaptureResultEmptyCameraCaptureResult, 0), null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131058}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return;
                }
                int i16 = IAuthTabCallbackDefault + 27;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                return;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(720820265);
            w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1965414750, true, new onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda38), cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onNavigationEvent(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 3078, 0, 4086);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
    }

    private static final boolean onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return zBooleanValue;
    }

    private static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda15;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote, getbacktracenote2, function0, function02, inAppPurchaseHistoryViewModel, audioRestrictionControllerImplExternalSyntheticLambda0};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 2092631064, iOnWarmupCompleted2, iOnWarmupCompleted, -2092631061, objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, Boolean.valueOf(z), getbacktracenote, getbacktracenote2, function0, function02, function03, function04, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1333665987, iOnWarmupCompleted2, iOnWarmupCompleted, 1333665988, objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, Boolean.valueOf(z), getbacktracenote, getbacktracenote2, function0, function02, function03, function04, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1272705832, iOnWarmupCompleted2, iOnWarmupCompleted, -1272705832, objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, -511892865, iOnWarmupCompleted2, iOnWarmupCompleted, 511892867, new Object[0]);
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, 1727116706, iOnWarmupCompleted2, iOnWarmupCompleted, -1727116701, new Object[]{str, str2, str3});
    }

    private static final Unit IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) onNavigationEvent(zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, 533259609, iOnWarmupCompleted2, iOnWarmupCompleted, -533259605, new Object[0]);
    }
}
