package o;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$;
import im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$TdsAnimateLogoFlip$2$1$;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AppLovinNativeAdEventListener;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.QuirksExternalSyntheticBackport0;
import o.RecomposerawaitIdle2;
import o.flipHorizontally;
import o.getMediaView;
import o.getTimebase;
import o.immediateFailedFuture;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdEventListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ int IAuthTabCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = onWarmupCompleted(gettimebase);
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(float f, float f2, long j, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, f2, j, fliphorizontally);
        int i4 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(list, quirksExternalSyntheticBackport0, j, immediatefailedfuture, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            IAuthTabCallback(list, quirksExternalSyntheticBackport0, j, immediatefailedfuture, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, long j, setOnQueryTextListener setonquerytextlistener, boolean z, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, list, j, setonquerytextlistener, z, immediatefailedfuture, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, getOptionsView getoptionsview, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, list, getoptionsview, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onExtraCallback(1980459376, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1980459372, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        } else {
            Object[] objArr2 = {quirksExternalSyntheticBackport0, list, getoptionsview, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onExtraCallback(1980459376, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1980459372, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(RecomposerawaitIdle2 recomposerawaitIdle2, float f, float f2, immediateFailedFuture immediatefailedfuture, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i5 % 128;
        onExtraCallback(recomposerawaitIdle2, f, f2, immediatefailedfuture, j, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i4 != 0) {
            onExtraCallback(-1522120441, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1522120441, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        } else {
            onExtraCallback(-1522120441, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1522120441, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            int i5 = 57 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iIntValue = ((Integer) onExtraCallback(2029382255, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -2029382248, iOnExtraCallback, new Object[]{gettimebase}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue();
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        int i5 = 90 / 0;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~(i5 | i7);
        int i11 = i | i10 | (~(i8 | i4));
        int i12 = i + i4 + i3 + ((-393945980) * i2) + (1728320405 * i6);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i) + 1566572544 + ((-1100352524) * i4) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i3) + (2076180480 * i2) + ((-877658112) * i6) + (214302720 * i13);
        int i15 = ((i * (-252835662)) - 192251156) + (i4 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i3 * (-252835169)) + (i2 * 1574575612) + (i6 * 147979147) + (i13 * (-1426456576));
        switch (i14 + (i15 * i15 * 2075787264)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                float fFloatValue = ((Number) objArr[0]).floatValue();
                HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) objArr[1];
                getMediaView getmediaview = (getMediaView) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i16 = 2 % 2;
                int i17 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(fFloatValue, highSpeedResolverExternalSyntheticLambda2, getmediaview, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i19 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                return unitIAuthTabCallback;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                getTimebase gettimebase = (getTimebase) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i21 = 2 % 2;
                int i22 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                gettimebase.onExtraCallback(iIntValue2);
                int i24 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebaseIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return gettimebaseIAuthTabCallbackDefault;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, long j, setOnQueryTextListener setonquerytextlistener, boolean z, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, list, j, setonquerytextlistener, z, immediatefailedfuture, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, getOptionsView getoptionsview, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, list, getoptionsview, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(1980459376, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1980459372, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 91 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2, float f, float f2, immediateFailedFuture immediatefailedfuture, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            IAuthTabCallback(recomposerawaitIdle2, f, f2, immediatefailedfuture, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(recomposerawaitIdle2, f, f2, immediatefailedfuture, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, float f2, List list, float f3, immediateFailedFuture immediatefailedfuture, getTimebase gettimebase, getTimebase gettimebase2, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), list, Float.valueOf(f3), immediatefailedfuture, gettimebase, gettimebase2, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(-102964766, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 102964768, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(list, quirksExternalSyntheticBackport0, j, immediatefailedfuture, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, long j, setOnQueryTextListener setonquerytextlistener, boolean z, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, list, j, setonquerytextlistener, z, immediatefailedfuture, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 10 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, getOptionsView getoptionsview, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, list, getoptionsview, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, list, getoptionsview, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getTimebase onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(list, quirksExternalSyntheticBackport0, j, immediatefailedfuture, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, long j, setOnQueryTextListener setonquerytextlistener, boolean z, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, list, j, setonquerytextlistener, z, immediatefailedfuture, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, list, j, setonquerytextlistener, z, immediatefailedfuture, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(-1303534836, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1303534841, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        List list = (List) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, quirksExternalSyntheticBackport0, jLongValue, immediatefailedfuture, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, getOptionsView getoptionsview, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, list, getoptionsview, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 82 / 0;
        }
        int i8 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, isQueryRefinementEnabled isqueryrefinementenabled, float f, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, isqueryrefinementenabled, f, fliphorizontally);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ getTimebase onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebaseOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return gettimebaseOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(gettimebase, i);
        int i5 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final getTimebase IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebaseOnWarmupCompleted = notifyPublicListeners.onWarmupCompleted(0);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return gettimebaseOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getTimebase $currentIndex$delegate;
        final /* synthetic */ long $eachDuration;
        final /* synthetic */ setOnQueryTextListener $easing;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $hasFlipped$delegate;
        final /* synthetic */ boolean $isAnimationEnabled;
        final /* synthetic */ List<getMediaView> $logos;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $rotationYAnim;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, long j, setOnQueryTextListener setonquerytextlistener, getTimebase gettimebase, List<getMediaView> list, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$isAnimationEnabled = z;
            this.$rotationYAnim = isqueryrefinementenabled;
            this.$eachDuration = j;
            this.$easing = setonquerytextlistener;
            this.$currentIndex$delegate = gettimebase;
            this.$logos = list;
            this.$hasFlipped$delegate = getsupportedhighspeedresolutionsfor;
        }

        public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getTimebase gettimebase, List list, isQueryRefinementEnabled isqueryrefinementenabled) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, gettimebase, list, isqueryrefinementenabled);
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            int i5 = onExtraCallbackWithResult + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$isAnimationEnabled, this.$rotationYAnim, this.$eachDuration, this.$easing, this.$currentIndex$delegate, this.$logos, this.$hasFlipped$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(1000, r14) == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:19:0x0059). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bb -> B:25:0x0080). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled;
            Float fOnExtraCallbackWithResult;
            getThumbPosition getthumbpositionOnExtraCallbackWithResult;
            TdsAnimateLogoKt$TdsAnimateLogoFlip$2$1$.ExternalSyntheticLambda0 externalSyntheticLambda0;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$isAnimationEnabled) {
                    this.label = 1;
                } else {
                    this.label = 2;
                    if (formatMsgs.onWarmupCompleted(500L, this) != objOnWarmupCompleted) {
                    }
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    int i5 = onExtraCallback + 89;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (i4 == 3) {
                        ResultKt.onNavigationEvent(obj);
                        isqueryrefinementenabled = this.$rotationYAnim;
                        fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(180.0f);
                        getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult((int) this.$eachDuration, 0, this.$easing, 2, (Object) null);
                        externalSyntheticLambda0 = new TdsAnimateLogoKt$TdsAnimateLogoFlip$2$1$.ExternalSyntheticLambda0(this.$hasFlipped$delegate, this.$currentIndex$delegate, this.$logos);
                        this.label = 4;
                        if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, externalSyntheticLambda0, this, 4, (Object) null) != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    }
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = onExtraCallbackWithResult + 111;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getTimebase gettimebase = this.$currentIndex$delegate;
                int iIAuthTabCallback = AppLovinNativeAdEventListener.IAuthTabCallback(gettimebase) + 1;
                if (iIAuthTabCallback >= this.$logos.size()) {
                    int i9 = onExtraCallback + 77;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    iIAuthTabCallback = 0;
                }
                AppLovinNativeAdEventListener.onWarmupCompleted(gettimebase, iIAuthTabCallback);
                this.label = 1;
            }
            AppLovinNativeAdEventListener.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$hasFlipped$delegate, false);
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$rotationYAnim;
            Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(0.0f);
            this.label = 3;
            if (isqueryrefinementenabled2.onWarmupCompleted(fOnExtraCallbackWithResult2, this) != objOnWarmupCompleted) {
                isqueryrefinementenabled = this.$rotationYAnim;
                fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(180.0f);
                getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult((int) this.$eachDuration, 0, this.$easing, 2, (Object) null);
                externalSyntheticLambda0 = new TdsAnimateLogoKt$TdsAnimateLogoFlip$2$1$.ExternalSyntheticLambda0(this.$hasFlipped$delegate, this.$currentIndex$delegate, this.$logos);
                this.label = 4;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, externalSyntheticLambda0, this, 4, (Object) null) != objOnWarmupCompleted) {
                    AppLovinNativeAdEventListener.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$hasFlipped$delegate, false);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled22 = this.$rotationYAnim;
                    Float fOnExtraCallbackWithResult22 = access14000.onExtraCallbackWithResult(0.0f);
                    this.label = 3;
                    if (isqueryrefinementenabled22.onWarmupCompleted(fOnExtraCallbackWithResult22, this) != objOnWarmupCompleted) {
                    }
                }
            }
            return objOnWarmupCompleted;
        }

        private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getTimebase gettimebase, List list, isQueryRefinementEnabled isqueryrefinementenabled) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue();
                throw null;
            }
            if (((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue() > 90.0f && !AppLovinNativeAdEventListener.onExtraCallback(getsupportedhighspeedresolutionsfor)) {
                int i3 = onExtraCallbackWithResult + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                AppLovinNativeAdEventListener.onExtraCallback(getsupportedhighspeedresolutionsfor, true);
                int iIAuthTabCallback = AppLovinNativeAdEventListener.IAuthTabCallback(gettimebase) + 1;
                if (iIAuthTabCallback >= list.size()) {
                    int i5 = onExtraCallback + 25;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    iIAuthTabCallback = 0;
                }
                AppLovinNativeAdEventListener.onWarmupCompleted(gettimebase, iIAuthTabCallback);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(boolean z, isQueryRefinementEnabled isqueryrefinementenabled, float f, flipHorizontally fliphorizontally) {
        float fFloatValue;
        float f2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            int i3 = 37 / 0;
            if (z) {
                fFloatValue = ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue();
            } else {
                int i4 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                fFloatValue = 0.0f;
            }
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            if (z) {
            }
        }
        fliphorizontally.asBinder(fFloatValue);
        if (!z || ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue() <= 90.0f) {
            f2 = 1.0f;
        } else {
            int i6 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i6 % 128;
            f2 = -1.0f;
            if (i6 % 2 != 0) {
                int i7 = 50 / 0;
            }
        }
        fliphorizontally.IAuthTabCallbackStubProxy(f2);
        fliphorizontally.onTransact(Math.max(1.0E-4f, f));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull List<getMediaView> list, long j, @Nullable setOnQueryTextListener setonquerytextlistener, boolean z, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        immediateFailedFuture immediatefailedfuture2;
        int i9;
        int i10;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        immediateFailedFuture immediatefailedfuture3;
        long j3;
        setOnQueryTextListener setonquerytextlistener2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        TdsAnimateLogoKt$.ExternalSyntheticLambda5 externalSyntheticLambda8;
        long j4;
        boolean z3;
        float f;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getTimebase gettimebase;
        isQueryRefinementEnabled isqueryrefinementenabled;
        boolean z4;
        ?? r11;
        Object obj;
        int i11;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1420560235);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i14 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2 == 0 ? 2 : 4;
                i3 = i15 | i;
            }
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i16 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                i11 = 32;
            } else {
                int i18 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                i11 = 16;
            }
            i3 |= i11;
        }
        int i20 = i2 & 4;
        if (i20 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                j2 = j;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    int i21 = onExtraCallbackWithResult + 115;
                    IAuthTabCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 52 / 0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setonquerytextlistener)) {
                            int i23 = IAuthTabCallback + 13;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            i5 = 2048;
                        } else {
                            i5 = 1024;
                        }
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setonquerytextlistener)) {
                    }
                    i6 = i5 | i3;
                    int i25 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i25 % 128;
                    int i26 = i25 % 2;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    i6 |= 24576;
                } else if ((i & 24576) == 0) {
                    int i27 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i27 % 128;
                    if (i27 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                        throw null;
                    }
                    i6 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8192 : 16384;
                }
                i8 = i2 & 32;
                if (i8 == 0) {
                    if ((196608 & i) == 0) {
                        immediatefailedfuture2 = immediatefailedfuture;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfuture2)) {
                            int i28 = IAuthTabCallback + 79;
                            onExtraCallbackWithResult = i28 % 128;
                            int i29 = i28 % 2;
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i6 |= i9;
                    }
                    i10 = i6;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) == 74898, i10 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        z2 = z;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        immediatefailedfuture3 = immediatefailedfuture2;
                        j3 = j2;
                        setonquerytextlistener2 = setonquerytextlistener;
                    } else {
                        if (i13 != 0) {
                            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if (i20 != 0) {
                            int i30 = onExtraCallbackWithResult + 69;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            j4 = 1700;
                        } else {
                            j4 = j2;
                        }
                        setOnQueryTextListener setonquerytextlistener3 = i4 != 0 ? (getMediaContentViewGroup) getCallToActionButton.IAuthTabCallback(-1178288673, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{getCallToActionButton.onExtraCallback}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1178288673) : setonquerytextlistener;
                        boolean z5 = i7 != 0 ? true : z;
                        immediateFailedFuture immediatefailedfutureIAuthTabCallback = i8 != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture2;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1420560235, i10, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoFlip (TdsAnimateLogo.kt:47)");
                        }
                        if (list.isEmpty()) {
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                externalSyntheticLambda8 = new TdsAnimateLogoKt$.ExternalSyntheticLambda5(quirksExternalSyntheticBackport02, list, j4, setonquerytextlistener3, z5, immediatefailedfutureIAuthTabCallback, i, i2);
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda8);
                                return;
                            }
                            return;
                        }
                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        if (((Number) objOnMinimized).floatValue() > 0.0f) {
                            int i32 = IAuthTabCallback + 7;
                            onExtraCallbackWithResult = i32 % 128;
                            int i33 = i32 % 2;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Object[] objArr = new Object[0];
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new TdsAnimateLogoKt$.ExternalSyntheticLambda6();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        getTimebase gettimebase2 = (getTimebase) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objOnMinimized3;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        boolean z6 = (57344 & i10) == 16384;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z6 | zOnNavigationEvent) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = Float.valueOf(z5 ? r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) : 1.0E-4f);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                        }
                        float fFloatValue = ((Number) objOnMinimized5).floatValue();
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettimebase2);
                        boolean z7 = (i10 & 112) == 32;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                        boolean z8 = (i10 & 896) == 256;
                        boolean z9 = (i10 & 7168) == 2048;
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (((zOnNavigationEvent2 | z7 | zOnExtraCallback | z8) || z9) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            f = fFloatValue;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            gettimebase = gettimebase2;
                            isqueryrefinementenabled = isqueryrefinementenabled2;
                            z4 = z3;
                            r11 = 0;
                            onNavigationEvent onnavigationevent = new onNavigationEvent(z3, isqueryrefinementenabled2, j4, setonquerytextlistener3, gettimebase2, list, getsupportedhighspeedresolutionsfor, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onnavigationevent);
                            obj = onnavigationevent;
                        } else {
                            f = fFloatValue;
                            isqueryrefinementenabled = isqueryrefinementenabled2;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            gettimebase = gettimebase2;
                            z4 = z3;
                            r11 = 0;
                            obj = objOnMinimized6;
                        }
                        int i34 = i10 >> 3;
                        isZslDisabledByByUserCaseConfig.IAuthTabCallback(list, Long.valueOf(j4), Boolean.valueOf(z4), (Function2) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i34 & 14) | 384 | (i34 & 112));
                        RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallback = onExtraCallback(list.get(onWarmupCompleted(gettimebase)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, r11);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport05, 0.0f, 1, (Object) null);
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), (boolean) r11);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r11));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                        isQueryRefinementEnabled isqueryrefinementenabled3 = isqueryrefinementenabled;
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
                        float f2 = f;
                        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnExtraCallback2 | zIAuthTabCallback) || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = new TdsAnimateLogoKt$.ExternalSyntheticLambda7(z4, isqueryrefinementenabled3, f2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) objOnMinimized7);
                        AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(recomposerawaitIdle2OnExtraCallback, (String) null, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, "AsyncImage", recomposerawaitIdle2OnExtraCallback, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult2, (3670016 & (i10 << 3)) | 48, 0, 1960);
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        j3 = j4;
                        setonquerytextlistener2 = setonquerytextlistener3;
                        z2 = z5;
                        immediatefailedfuture3 = immediatefailedfutureIAuthTabCallback;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        externalSyntheticLambda8 = new TdsAnimateLogoKt$.ExternalSyntheticLambda8(quirksExternalSyntheticBackport03, list, j3, setonquerytextlistener2, z2, immediatefailedfuture3, i, i2);
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda8);
                        return;
                    }
                    return;
                }
                i6 |= 196608;
                immediatefailedfuture2 = immediatefailedfuture;
                i10 = i6;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) == 74898, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i3;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            i8 = i2 & 32;
            if (i8 == 0) {
            }
            immediatefailedfuture2 = immediatefailedfuture;
            i10 = i6;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) == 74898, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        j2 = j;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i6 = i3;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        i8 = i2 & 32;
        if (i8 == 0) {
        }
        immediatefailedfuture2 = immediatefailedfuture;
        i10 = i6;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) == 74898, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        List list;
        final getOptionsView getoptionsview;
        final float f;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        Function2 function2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final float fIAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[0];
        final List list2 = (List) objArr[1];
        getOptionsView getoptionsview2 = (getOptionsView) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1362425940);
        int i4 = iIntValue2 & 1;
        if (i4 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list2) ? 32 : 16;
        }
        Object obj = null;
        if ((iIntValue & 384) == 0) {
            if ((iIntValue2 & 4) == 0) {
                int i5 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getoptionsview2);
                    obj.hashCode();
                    throw null;
                }
                int i6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getoptionsview2) ? 256 : 128;
                i |= i6;
            }
        }
        int i7 = iIntValue2 & 8;
        if (i7 != 0) {
            i |= 3072;
        } else if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 2048 : 1024;
        }
        int i8 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 1171) != 1170, i8 & 1)) {
            int i9 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                int i11 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue2 & 2) != 0) {
                        int i12 = onExtraCallbackWithResult + 35;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        i8 &= -897;
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue2 & 4) != 0) {
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                }
                return null;
            }
            if (i4 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            if ((iIntValue2 & 4) != 0) {
                int i14 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                getoptionsview2 = (getOptionsView) r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(1129917488, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{null, null, false, false, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 15}, -1129917481);
                i8 &= -897;
            }
            if (i7 != 0) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f);
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1362425940, i8, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoSlide (TdsAnimateLogo.kt:111)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1362425940, i8, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoSlide (TdsAnimateLogo.kt:111)");
            }
            if (!list2.isEmpty()) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    final getOptionsView getoptionsview3 = getoptionsview2;
                    final float f2 = fIAuthTabCallback;
                    function2 = new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i17 = 2 % 2;
                            int i18 = onExtraCallbackWithResult + 123;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 != 0) {
                                return AppLovinNativeAdEventListener.onWarmupCompleted(quirksExternalSyntheticBackport04, list2, getoptionsview3, f2, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            }
                            Unit unitOnWarmupCompleted = AppLovinNativeAdEventListener.onWarmupCompleted(quirksExternalSyntheticBackport04, list2, getoptionsview3, f2, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i19 = 97 / 0;
                            return unitOnWarmupCompleted;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return null;
            }
            i2 = iIntValue;
            getoptionsview2.IAuthTabCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            list = list2;
            r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(quirksExternalSyntheticBackport02, getoptionsview2, list2, 0.0f, (setTaggedAddrCtrl) ForwardingCameraControl.onExtraCallback(-1287103245, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    float f3 = fIAuthTabCallback;
                    int iIntValue3 = ((Integer) obj5).intValue();
                    Object[] objArr2 = {Float.valueOf(f3), (HighSpeedResolverExternalSyntheticLambda2) obj2, (getMediaView) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue3)};
                    int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    if (i19 != 0) {
                        return (Unit) AppLovinNativeAdEventListener.onExtraCallback(1784433427, iOnExtraCallback3, iOnExtraCallback2, -1784433424, iOnExtraCallback, objArr2, iOnExtraCallback4);
                    }
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult, (i8 & 14) | 24576 | ((i8 >> 3) & 112) | ((i8 << 3) & 896), 8);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
            f = fIAuthTabCallback;
            getoptionsview = getoptionsview2;
            fIAuthTabCallback = fFloatValue;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            if (!list2.isEmpty()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            list = list2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            getoptionsview = getoptionsview2;
            f = fFloatValue;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 != null) {
            final List list3 = list;
            final int i19 = i2;
            function2 = new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 19;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        return AppLovinNativeAdEventListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, list3, getoptionsview, f, i19, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    AppLovinNativeAdEventListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, list3, getoptionsview, f, i19, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        return null;
    }

    private static final Unit IAuthTabCallback(float f, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getMediaView getmediaview, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(getmediaview, "");
        if ((i & 48) == 0) {
            int i6 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getmediaview);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = i | (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getmediaview) ^ true) ? 32 : 16);
            int i7 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 145) == 144), i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1287103245, i2, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoSlide.<anonymous> (TdsAnimateLogo.kt:119)");
            }
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{getmediaview.onExtraCallback(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, f), null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 4 / 4;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final getTimebase onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebaseOnWarmupCompleted = notifyPublicListeners.onWarmupCompleted(0);
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return gettimebaseOnWarmupCompleted;
        }
        throw null;
    }

    private static final getTimebase IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebaseOnWarmupCompleted = notifyPublicListeners.onWarmupCompleted(1);
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return gettimebaseOnWarmupCompleted;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getTimebase $behindIndex$delegate;
        final /* synthetic */ long $eachDuration;
        final /* synthetic */ getTimebase $frontIndex$delegate;
        final /* synthetic */ boolean $isAnimationEnabled;
        final /* synthetic */ List<getMediaView> $logos;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, long j, getTimebase gettimebase, List<getMediaView> list, getTimebase gettimebase2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$isAnimationEnabled = z;
            this.$progress = isqueryrefinementenabled;
            this.$eachDuration = j;
            this.$frontIndex$delegate = gettimebase;
            this.$logos = list;
            this.$behindIndex$delegate = gettimebase2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$isAnimationEnabled, this.$progress, this.$eachDuration, this.$frontIndex$delegate, this.$logos, this.$behindIndex$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(1000, r22) == r10) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
        
            if (o.isQueryRefinementEnabled.onWarmupCompleted(r0, r1, r2, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r22, 12, (java.lang.Object) null) != r10) goto L40;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:23:0x005d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e9 -> B:37:0x00eb). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$isAnimationEnabled) {
                    this.label = 2;
                    if (formatMsgs.onWarmupCompleted(500L, this) != objOnWarmupCompleted) {
                    }
                } else {
                    this.label = 1;
                }
                return objOnWarmupCompleted;
            }
            if (i4 == 1) {
                ResultKt.onNavigationEvent(obj);
                int iIntValue = ((Integer) AppLovinNativeAdEventListener.onExtraCallback(1407555541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1407555533, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.$frontIndex$delegate}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue() + 1;
                if (iIntValue >= this.$logos.size()) {
                    iIntValue = 0;
                }
                AppLovinNativeAdEventListener.IAuthTabCallback(this.$frontIndex$delegate, iIntValue);
                getTimebase gettimebase = this.$behindIndex$delegate;
                int iIntValue2 = ((Integer) AppLovinNativeAdEventListener.onExtraCallback(1407555541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1407555533, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.$frontIndex$delegate}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue() + 1;
                if (iIntValue2 >= this.$logos.size()) {
                    int i5 = IAuthTabCallback + 45;
                    onExtraCallbackWithResult = i5 % 128;
                    iIntValue2 = i5 % 2 != 0 ? 1 : 0;
                }
                AppLovinNativeAdEventListener.onNavigationEvent(gettimebase, iIntValue2);
                this.label = 1;
            } else if (i4 != 2) {
                int i6 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0 ? i4 == 3 : i4 == 5) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$progress;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult((int) this.$eachDuration, 0, getCallToActionButton.onExtraCallback.asBinder(), 2, (Object) null);
                    this.label = 4;
                } else {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int iIntValue3 = ((Integer) AppLovinNativeAdEventListener.onExtraCallback(1407555541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1407555533, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.$frontIndex$delegate}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue() + 1;
                    if (iIntValue3 >= this.$logos.size()) {
                        int i7 = onExtraCallbackWithResult + 9;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 4 % 4;
                        }
                        iIntValue3 = 0;
                    }
                    AppLovinNativeAdEventListener.IAuthTabCallback(this.$frontIndex$delegate, iIntValue3);
                    getTimebase gettimebase2 = this.$behindIndex$delegate;
                    int iIntValue4 = ((Integer) AppLovinNativeAdEventListener.onExtraCallback(1407555541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1407555533, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.$frontIndex$delegate}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue() + 1;
                    if (iIntValue4 >= this.$logos.size()) {
                        int i9 = onExtraCallbackWithResult + 9;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        iIntValue4 = 0;
                    }
                    AppLovinNativeAdEventListener.onNavigationEvent(gettimebase2, iIntValue4);
                }
            } else {
                ResultKt.onNavigationEvent(obj);
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$progress;
            Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(0.0f);
            this.label = 3;
            if (isqueryrefinementenabled2.onWarmupCompleted(fOnExtraCallbackWithResult2, this) != objOnWarmupCompleted) {
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3 = this.$progress;
                Float fOnExtraCallbackWithResult3 = access14000.onExtraCallbackWithResult(1.0f);
                getThumbPosition getthumbpositionOnExtraCallbackWithResult2 = onQueryRefine.onExtraCallbackWithResult((int) this.$eachDuration, 0, getCallToActionButton.onExtraCallback.asBinder(), 2, (Object) null);
                this.label = 4;
            }
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z;
        float fFloatValue = ((Number) objArr[0]).floatValue();
        float fFloatValue2 = ((Number) objArr[1]).floatValue();
        List list = (List) objArr[2];
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        int i = 4;
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[4];
        getTimebase gettimebase = (getTimebase) objArr[5];
        getTimebase gettimebase2 = (getTimebase) objArr[6];
        FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9 = (FocusMeteringControlExternalSyntheticLambda9) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9)) {
                int i5 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    i = 5;
                }
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i6 % 128;
            z = i6 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1806319406, iIntValue, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoSwap.<anonymous> (TdsAnimateLogo.kt:175)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1806319406, iIntValue, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoSwap.<anonymous> (TdsAnimateLogo.kt:175)");
            }
            float fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(focusMeteringControlExternalSyntheticLambda9.IAuthTabCallback());
            float f = fFloatValue * (fOnExtraCallback / 2.0f);
            float f2 = (fOnExtraCallback / 8.0f) * (1.0f - fFloatValue);
            boolean z2 = fFloatValue2 >= 0.5f;
            RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallback = onExtraCallback((getMediaView) list.get(((Integer) onExtraCallback(2029382255, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2029382248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{gettimebase}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue()), cameraCaptureResultEmptyCameraCaptureResult, 0);
            RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallback2 = onExtraCallback((getMediaView) list.get(onNavigationEvent(gettimebase2)), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (z2) {
                int i8 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(416592738);
                onExtraCallback(recomposerawaitIdle2OnExtraCallback2, f2, fFloatValue3, immediatefailedfuture, getDoubleValue.IAuthTabCallback(0.0f, 0.5f), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                onExtraCallback(recomposerawaitIdle2OnExtraCallback, f, fFloatValue2, immediatefailedfuture, getDoubleValue.IAuthTabCallback(0.0f, 0.5f), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(417156194);
                onExtraCallback(recomposerawaitIdle2OnExtraCallback, f, fFloatValue2, immediatefailedfuture, getDoubleValue.IAuthTabCallback(0.0f, 0.5f), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                onExtraCallback(recomposerawaitIdle2OnExtraCallback2, f2, fFloatValue3, immediatefailedfuture, getDoubleValue.IAuthTabCallback(0.0f, 0.5f), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final List<getMediaView> list, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        int i6;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i7;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final immediateFailedFuture immediatefailedfuture2;
        final long j2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        boolean z;
        boolean z2;
        getTimebase gettimebase;
        isQueryRefinementEnabled isqueryrefinementenabled;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Object obj;
        getTimebase gettimebase2;
        ?? r10;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        float f;
        final float fFloatValue;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2024706244);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            int i10 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i12 = onExtraCallbackWithResult + 95;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 384;
                int i14 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
            } else {
                if ((i & 384) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfutureIAuthTabCallback) ? 2048 : 1024;
                    }
                    i7 = i3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) == 1170, i7 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                        j2 = j;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        long j3 = i5 != 0 ? 1670L : j;
                        if (i6 != 0) {
                            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2024706244, i7, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLogoSwap (TdsAnimateLogo.kt:133)");
                            int i16 = IAuthTabCallback + 57;
                            onExtraCallbackWithResult = i16 % 128;
                            int i17 = i16 % 2;
                        }
                        if (list.size() < 2) {
                            int i18 = onExtraCallbackWithResult + 79;
                            IAuthTabCallback = i18 % 128;
                            int i19 = i18 % 2;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport06;
                                final long j4 = j3;
                                final immediateFailedFuture immediatefailedfuture3 = immediatefailedfutureIAuthTabCallback;
                                function2 = new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda9
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj2, Object obj3) {
                                        Unit unitOnNavigationEvent;
                                        int i20 = 2 % 2;
                                        int i21 = onNavigationEvent + 67;
                                        onExtraCallbackWithResult = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            unitOnNavigationEvent = AppLovinNativeAdEventListener.onNavigationEvent(list, quirksExternalSyntheticBackport07, j4, immediatefailedfuture3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            int i22 = 3 / 0;
                                        } else {
                                            unitOnNavigationEvent = AppLovinNativeAdEventListener.onNavigationEvent(list, quirksExternalSyntheticBackport07, j4, immediatefailedfuture3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        }
                                        int i23 = onExtraCallbackWithResult + 5;
                                        onNavigationEvent = i23 % 128;
                                        int i24 = i23 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                };
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                                return;
                            }
                            return;
                        }
                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        if (((Number) objOnMinimized).floatValue() > 0.0f) {
                            int i20 = IAuthTabCallback + 79;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        Object[] objArr = new Object[0];
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda10
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke() {
                                    int i22 = 2 % 2;
                                    int i23 = onExtraCallbackWithResult + 101;
                                    IAuthTabCallback = i23 % 128;
                                    if (i23 % 2 == 0) {
                                        AppLovinNativeAdEventListener.onWarmupCompleted();
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    getTimebase gettimebaseOnWarmupCompleted = AppLovinNativeAdEventListener.onWarmupCompleted();
                                    int i24 = IAuthTabCallback + 113;
                                    onExtraCallbackWithResult = i24 % 128;
                                    int i25 = i24 % 2;
                                    return gettimebaseOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        getTimebase gettimebase3 = (getTimebase) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        Object[] objArr2 = new Object[0];
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda11
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i22 = 2 % 2;
                                    int i23 = IAuthTabCallback + 59;
                                    onNavigationEvent = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                        return (getTimebase) AppLovinNativeAdEventListener.onExtraCallback(996872248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -996872242, iOnExtraCallback, new Object[0], CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                                    }
                                    int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                    int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        getTimebase gettimebase4 = (getTimebase) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized4 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objOnMinimized4;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettimebase3);
                        int i22 = i7 & 14;
                        boolean z3 = i22 == 4;
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettimebase4);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                        if ((i7 & 896) == 256) {
                            int i23 = IAuthTabCallback + 5;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (((zOnNavigationEvent | z3 | zOnNavigationEvent2 | zOnExtraCallback) || z2) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            gettimebase = gettimebase3;
                            isqueryrefinementenabled = isqueryrefinementenabled2;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport06;
                            obj = null;
                            gettimebase2 = gettimebase4;
                            r10 = 1;
                            onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(z, isqueryrefinementenabled2, j3, gettimebase, list, gettimebase4, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onwarmupcompleted2);
                            objOnMinimized5 = onwarmupcompleted2;
                        } else {
                            gettimebase = gettimebase3;
                            isqueryrefinementenabled = isqueryrefinementenabled2;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport06;
                            gettimebase2 = gettimebase4;
                            obj = null;
                            r10 = 1;
                        }
                        isZslDisabledByByUserCaseConfig.IAuthTabCallback(list, Long.valueOf(j3), Boolean.valueOf(z), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i22 | 384 | ((i7 >> 3) & 112));
                        if (z) {
                            int i25 = onExtraCallbackWithResult + 43;
                            IAuthTabCallback = i25 % 128;
                            int i26 = i25 % 2;
                            fFloatValue = ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue();
                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            f = 0.0f;
                        } else {
                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            f = 0.0f;
                            fFloatValue = 0.0f;
                        }
                        final float f2 = 1.0f - fFloatValue;
                        final float f3 = fFloatValue;
                        final immediateFailedFuture immediatefailedfuture4 = immediatefailedfutureIAuthTabCallback;
                        final getTimebase gettimebase5 = gettimebase;
                        final getTimebase gettimebase6 = gettimebase2;
                        FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport05, f, (int) r10, obj), QuirkSettingsLoader.Companion.onExtraCallback(), false, ForwardingCameraControl.onExtraCallback(1806319406, (boolean) r10, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda12
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i27 = 2 % 2;
                                int i28 = onWarmupCompleted + 65;
                                onExtraCallback = i28 % 128;
                                int i29 = i28 % 2;
                                Unit unitOnExtraCallbackWithResult = AppLovinNativeAdEventListener.onExtraCallbackWithResult(f3, f2, list, fFloatValue, immediatefailedfuture4, gettimebase5, gettimebase6, (FocusMeteringControlExternalSyntheticLambda9) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                int i30 = onExtraCallback + 41;
                                onWarmupCompleted = i30 % 128;
                                int i31 = i30 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 4);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i27 = IAuthTabCallback + 77;
                            onExtraCallbackWithResult = i27 % 128;
                            if (i27 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                int i28 = 80 / 0;
                            } else {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                        j2 = j3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        function2 = new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda13
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i29 = 2 % 2;
                                int i30 = onExtraCallback + 83;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                List list2 = list;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport08 = quirksExternalSyntheticBackport03;
                                long j5 = j2;
                                immediateFailedFuture immediatefailedfuture5 = immediatefailedfuture2;
                                int i32 = i;
                                int i33 = i2;
                                int iIntValue = ((Integer) obj3).intValue();
                                Object[] objArr3 = {list2, quirksExternalSyntheticBackport08, Long.valueOf(j5), immediatefailedfuture5, Integer.valueOf(i32), Integer.valueOf(i33), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                Unit unit = (Unit) AppLovinNativeAdEventListener.onExtraCallback(-1769213105, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1769213106, iOnExtraCallback, objArr3, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                                int i34 = onNavigationEvent + 67;
                                onExtraCallback = i34 % 128;
                                if (i34 % 2 == 0) {
                                    int i35 = 72 / 0;
                                }
                                return unit;
                            }
                        };
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
                i7 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) == 1170, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
            i7 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) == 1170, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        i7 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) == 1170, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final RecomposerawaitIdle2 onExtraCallback(getMediaView getmediaview, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object objOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-288633508, i, -1, "im.toss.tds.compose.component.anim.logo.rememberImageRequest (TdsAnimateLogo.kt:219)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        String strOnWarmupCompleted = getmediaview.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i5 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 32 / 0;
                if (strOnWarmupCompleted.length() != 0) {
                    objOnNavigationEvent = getmediaview.onWarmupCompleted();
                    Intrinsics.checkNotNull(objOnNavigationEvent);
                } else {
                    Integer numOnNavigationEvent = getmediaview.onNavigationEvent();
                    if (numOnNavigationEvent == null || numOnNavigationEvent.intValue() <= 0) {
                        throw new IllegalArgumentException();
                    }
                    objOnNavigationEvent = getmediaview.onNavigationEvent();
                    Intrinsics.checkNotNull(objOnNavigationEvent);
                }
            } else if (strOnWarmupCompleted.length() != 0) {
            }
        }
        String strIAuthTabCallback = getmediaview.IAuthTabCallback();
        String strOnWarmupCompleted2 = getmediaview.onWarmupCompleted();
        Integer numOnNavigationEvent2 = getmediaview.onNavigationEvent();
        SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnExtraCallbackWithResult = getmediaview.onExtraCallbackWithResult();
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strIAuthTabCallback);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnWarmupCompleted2);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(numOnNavigationEvent2);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnExtraCallbackWithResult);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(objOnNavigationEvent);
            SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnExtraCallbackWithResult2 = getmediaview.onExtraCallbackWithResult();
            if (singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnExtraCallbackWithResult2 != null) {
                int i7 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[] singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1Arr = new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[0];
                    singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1Arr[1] = singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnExtraCallbackWithResult2;
                    RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1Arr);
                } else {
                    RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnExtraCallbackWithResult2});
                }
            }
            objOnMinimized = onnavigationeventOnExtraCallback.onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i8 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        RecomposerawaitIdle2 recomposerawaitIdle2 = (RecomposerawaitIdle2) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return recomposerawaitIdle2;
    }

    private static final Unit onExtraCallbackWithResult(float f, float f2, long j, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallback_Parcel(f);
        fliphorizontally.IAuthTabCallbackStubProxy(RangesKt.coerceAtLeast(f2, 0.0f));
        fliphorizontally.getInterfaceDescriptor(RangesKt.coerceAtLeast(f2, 0.0f));
        fliphorizontally.asInterface(j);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final RecomposerawaitIdle2 recomposerawaitIdle2, final float f, final float f2, final immediateFailedFuture immediatefailedfuture, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        long j2;
        long jIAuthTabCallback;
        long j3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-486528232);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(recomposerawaitIdle2)) {
                int i10 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i12 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i13 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2)) {
                int i15 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfuture)) {
                int i17 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i17 % 128;
                i5 = i17 % 2 == 0 ? 19624 : 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i18 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i18 % 128;
                int i19 = i18 % 2;
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 16) != 0) {
                    jIAuthTabCallback = getDoubleValue.IAuthTabCallback(0.5f, 0.5f);
                    i3 &= -57345;
                    j3 = jIAuthTabCallback;
                }
                j3 = j;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 16) != 0) {
                    jIAuthTabCallback = j;
                    i3 &= -57345;
                    j3 = jIAuthTabCallback;
                }
                j3 = j;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-486528232, i3, -1, "im.toss.tds.compose.component.anim.logo.ScaledTranslatedLogo (TdsAnimateLogo.kt:240)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            if ((i3 & 112) == 32) {
                int i20 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 896) == 256) {
                int i22 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i22 % 128;
                boolean z2 = i22 % 2 == 0;
                final long j4 = j3;
                boolean z3 = (((i3 & 57344) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4)) || (i3 & 24576) == 16384;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z | z2 | z3)) {
                    int i23 = onExtraCallbackWithResult + 25;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2) {
                                int i25 = 2 % 2;
                                int i26 = onExtraCallback + 97;
                                onNavigationEvent = i26 % 128;
                                int i27 = i26 % 2;
                                Unit unitIAuthTabCallback = AppLovinNativeAdEventListener.IAuthTabCallback(f, f2, j4, (flipHorizontally) obj2);
                                int i28 = onExtraCallback + 31;
                                onNavigationEvent = i28 % 128;
                                int i29 = i28 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    j2 = j4;
                    getNavigationIcon.IAuthTabCallback(AccessibilityServiceStateProvider_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(recomposerawaitIdle2, (Function1) null, (Function1) null, (immediateFailedFuture) null, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 14, 30), (String) null, setAdVideoPlaybackListener.onWarmupCompleted(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized), "Image"), (QuirkSettingsLoader) null, immediatefailedfuture, 0.0f, (seek) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 57344) | 48, 104);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = onExtraCallbackWithResult + 117;
                        IAuthTabCallback = i25 % 128;
                        if (i25 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            j2 = j;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final long j5 = j2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLogoKt$$ExternalSyntheticLambda4
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i26 = 2 % 2;
                    int i27 = onNavigationEvent + 107;
                    onWarmupCompleted = i27 % 128;
                    if (i27 % 2 != 0) {
                        return AppLovinNativeAdEventListener.onExtraCallback(recomposerawaitIdle2, f, f2, immediatefailedfuture, j5, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    AppLovinNativeAdEventListener.onExtraCallback(recomposerawaitIdle2, f, f2, immediatefailedfuture, j5, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            });
        }
    }

    private static final int onWarmupCompleted(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return iOnWarmupCompleted;
    }

    private static final void onExtraCallbackWithResult(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            gettimebase.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i3 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return Integer.valueOf(iOnWarmupCompleted);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        gettimebase.onExtraCallback(iIntValue);
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final int onNavigationEvent(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, immediateFailedFuture immediatefailedfuture, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {list, quirksExternalSyntheticBackport0, Long.valueOf(j), immediatefailedfuture, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallback(-1769213105, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1769213106, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ getTimebase onExtraCallback() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (getTimebase) onExtraCallback(996872248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -996872242, iOnExtraCallback, new Object[0], CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getMediaView getmediaview, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Float.valueOf(f), highSpeedResolverExternalSyntheticLambda2, getmediaview, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallback(1784433427, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1784433424, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull List<getMediaView> list, @Nullable getOptionsView getoptionsview, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, list, getoptionsview, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(1980459376, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1980459372, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onExtraCallback(float f, float f2, List list, float f3, immediateFailedFuture immediatefailedfuture, getTimebase gettimebase, getTimebase gettimebase2, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), list, Float.valueOf(f3), immediatefailedfuture, gettimebase, gettimebase2, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallback(-102964766, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 102964768, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final int onExtraCallbackWithResult(getTimebase gettimebase) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Integer) onExtraCallback(2029382255, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -2029382248, iOnExtraCallback, new Object[]{gettimebase}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue();
    }

    private static final void onExtraCallback(getTimebase gettimebase, int i) {
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(-1522120441, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1522120441, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final void asBinder(getTimebase gettimebase, int i) {
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(-1303534836, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1303534841, iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static final /* synthetic */ int onExtraCallback(getTimebase gettimebase) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Integer) onExtraCallback(1407555541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -1407555533, iOnExtraCallback, new Object[]{gettimebase}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).intValue();
    }
}
