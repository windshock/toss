package im.toss.tds.compose.foundation.anim.rally;

import androidx.compose.runtime.saveable.RememberSaveableKt;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.ExtensionsManager1;
import o.MaxInterstitialAd;
import o.QuirksExternalSyntheticBackport0;
import o.decrementVideoUsage;
import o.flipHorizontally;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;
import o.isZslDisabledByByUserCaseConfig;
import o.setCreativeDebuggerEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyModifierKt {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static final long onNavigationEvent = ExtensionsManager1.onWarmupCompleted(-9223372034707292160L);
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = ~(i | i6);
        int i11 = i9 | i10;
        int i12 = ~i5;
        int i13 = (~(i12 | i6)) | (~(i12 | i)) | i10;
        int i14 = (~(i7 | i6)) | (~(i8 | i));
        int i15 = i + i6 + i3 + (1040777104 * i4) + ((-1861505373) * i2);
        int i16 = i15 * i15;
        int i17 = (i * (-1036928585)) + 527892480 + ((-1036928585) * i6) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i3) + (1608515584 * i4) + ((-1123418112) * i2) + ((-2114519040) * i16);
        int i18 = (i * 1703033811) + 1712528133 + (i6 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i3 * 1703034565) + (i4 * (-2114876976)) + (i2 * 1880022383) + (i16 * (-720175104));
        return i17 + ((i18 * i18) * (-739180544)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallback = onExtraCallback();
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return getsupportedhighspeedresolutionsforOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(Rally rally, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(rally, getsupportedhighspeedresolutionsfor, isinvideousage);
        }
        onNavigationEvent(rally, getsupportedhighspeedresolutionsfor, isinvideousage);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final Rally rally, @Nullable Function1<? super flipHorizontally, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(rally, "");
        Object obj = null;
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-224561776, i, -1, "im.toss.tds.compose.foundation.anim.rally.rally (RallyModifier.kt:37)");
        }
        setCreativeDebuggerEnabled<?> setcreativedebuggerenabledValidateRelationship = rally.validateRelationship();
        if (!(setcreativedebuggerenabledValidateRelationship instanceof MaxInterstitialAd)) {
            throw new IllegalArgumentException("compose Rally motion target must be ComposableRallyTarget");
        }
        Object[] objArr = {rally};
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function0() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyModifierKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 23;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                    int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                    int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RallyModifierKt.onNavigationEvent(677149313, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[0], iOnWarmupCompleted, -677149313);
                    int i7 = onNavigationEvent + 121;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return getsupportedhighspeedresolutionsfor;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 48);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
        if (((48 ^ (i & 112)) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rally)) && (i & 48) != 32) {
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | z)) {
            int i6 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyModifierKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 59;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Rally rally2 = rally;
                        if (i10 == 0) {
                            return RallyModifierKt.onWarmupCompleted(rally2, getsupportedhighspeedresolutionsfor, (isInVideoUsage) obj2);
                        }
                        RallyModifierKt.onWarmupCompleted(rally2, getsupportedhighspeedresolutionsfor, (isInVideoUsage) obj2);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(rally, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(onNavigationEvent((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, (MaxInterstitialAd) setcreativedebuggerenabledValidateRelationship, function1));
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i8 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final getSupportedHighSpeedResolutionsFor onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, MaxInterstitialAd maxInterstitialAd, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 0 / 0;
            }
            function1 = null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, maxInterstitialAd, (Function1<? super flipHorizontally, Unit>) function1);
        int i5 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull MaxInterstitialAd maxInterstitialAd, @Nullable Function1<? super flipHorizontally, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new RallySizeAnimationModifierElement(maxInterstitialAd.ICustomTabsCallback().onNavigationEvent())).onExtraCallback(new RallyGraphicsLayerElement(maxInterstitialAd.ICustomTabsCallback().onWarmupCompleted(), function1)).onExtraCallback(new RallyDrawBehindElement(maxInterstitialAd.ICustomTabsCallback().IAuthTabCallback()));
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public static final boolean onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !ExtensionsManager1.IAuthTabCallback(j, onNavigationEvent);
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final decrementVideoUsage onNavigationEvent(final Rally rally, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(isinvideousage, "");
            int i3 = 21 / 0;
            if (!onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor)) {
                int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, true);
            }
        } else {
            Intrinsics.checkNotNullParameter(isinvideousage, "");
            if (!onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor)) {
            }
        }
        decrementVideoUsage decrementvideousage = new decrementVideoUsage() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyModifierKt$rally$lambda$4$0$$inlined$onDispose$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void dispose() {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 21;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    rally.ICustomTabsServiceStub();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                rally.ICustomTabsServiceStub();
                int i6 = onWarmupCompleted + 55;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 48 / 0;
                }
            }
        };
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return decrementvideousage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return zBooleanValue;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = onExtraCallback + 115;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallback() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (getSupportedHighSpeedResolutionsFor) onNavigationEvent(677149313, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[0], iOnWarmupCompleted, -677149313);
    }

    public static final long onExtraCallbackWithResult() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return ((Long) onNavigationEvent(-1094323199, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[0], iOnWarmupCompleted, 1094323200)).longValue();
    }
}
