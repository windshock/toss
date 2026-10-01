package o;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.google.common.collect.Synchronized;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.compose.R;
import im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$;
import im.toss.tds.compose.foundation.anim.rally.RallyKeyframes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AUTextView;
import o.AppLovinVastMediaViewa;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MaxAppOpenAd;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.deprecated_followRedirects;
import o.getSwitchMinWidth;
import o.isContainerClickable;
import o.noStore;
import o.populatePlayPauseImage;
import o.readFully;
import o.removeAdapter;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinVastMediaViewa {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(maxAppOpenAd);
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(removeadapter);
        int i4 = onNavigationEvent + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ deprecated_followRedirects IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(f);
        }
        onNavigationEvent(f);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        readFully readfully = (readFully) objArr[0];
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(readfully, setorientationdegrees);
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        RallyKeyframes rallyKeyframes = (RallyKeyframes) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(rallyKeyframes);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        removeAdapter removeadapter = (removeAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(removeadapter);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(removeadapter);
        int i3 = onNavigationEvent + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(f, (getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnNavigationEvent = onNavigationEvent(f, (getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, j);
        int i3 = IAuthTabCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return fOnNavigationEvent;
    }

    public static final /* synthetic */ float onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(getsupportedhighspeedresolutions);
        }
        onNavigationEvent(getsupportedhighspeedresolutions);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        showMediaImageView showmediaimageview = (showMediaImageView) objArr[3];
        float fFloatValue3 = ((Number) objArr[4]).floatValue();
        float fFloatValue4 = ((Number) objArr[5]).floatValue();
        int iIntValue = ((Number) objArr[6]).intValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        populatePlayPauseImage.onExtraCallback onextracallback = (populatePlayPauseImage.onExtraCallback) objArr[9];
        populatePlayPauseImage.onExtraCallback onextracallback2 = (populatePlayPauseImage.onExtraCallback) objArr[10];
        Function1 function12 = (Function1) objArr[11];
        int iIntValue2 = ((Number) objArr[12]).intValue();
        int iIntValue3 = ((Number) objArr[13]).intValue();
        int iIntValue4 = ((Number) objArr[14]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, fFloatValue, fFloatValue2, showmediaimageview, fFloatValue3, fFloatValue4, iIntValue, quirksExternalSyntheticBackport0, zBooleanValue, onextracallback, onextracallback2, function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue3), iIntValue4);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, showMediaImageView showmediaimageview, float f2, Function1 function1, populatePlayPauseImage.onNavigationEvent onnavigationevent, populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Float.valueOf(f2), function1, onnavigationevent, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 1855124953, -1855124949, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        } else {
            Object[] objArr2 = {Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Float.valueOf(f2), function1, onnavigationevent, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onWarmupCompleted(C40Encoder.onExtraCallback(), objArr2, C40Encoder.onExtraCallback(), 1855124953, -1855124949, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 109;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(deprecated_followRedirects deprecated_followredirects, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, showMediaImageView showmediaimageview, boolean z, boolean z2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {deprecated_followredirects, Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Boolean.valueOf(z), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), -882863030, 882863032, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        } else {
            Object[] objArr2 = {deprecated_followredirects, Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Boolean.valueOf(z), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onWarmupCompleted(C40Encoder.onExtraCallback(), objArr2, C40Encoder.onExtraCallback(), -882863030, 882863032, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 25;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, extensionsManager1}, C40Encoder.onExtraCallback(), -204290661, 204290669, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(populatePlayPauseImage.onExtraCallback onextracallback, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, getsupportedhighspeedresolutions, f);
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(f, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions);
        }
        onNavigationEvent(f, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 59;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, float f, float f2, showMediaImageView showmediaimageview, float f3, float f4, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, populatePlayPauseImage.onExtraCallback onextracallback, populatePlayPauseImage.onExtraCallback onextracallback2, Function1 function12, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 53;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        Object[] objArr = {function1, Float.valueOf(f), Float.valueOf(f2), showmediaimageview, Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), quirksExternalSyntheticBackport0, Boolean.valueOf(z), onextracallback, onextracallback2, function12, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        Unit unit = (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 367661570, -367661565, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        int i9 = onNavigationEvent + 71;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(maxAppOpenAd);
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(populatePlayPauseImage.onExtraCallback onextracallback, populatePlayPauseImage.onExtraCallback onextracallback2, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(onextracallback, onextracallback2, function1, getsupportedhighspeedresolutionsfor, f, z);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallback, onextracallback2, function1, getsupportedhighspeedresolutionsfor, f, z);
        int i3 = IAuthTabCallback + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(removeadapter);
            throw null;
        }
        Unit unitAsInterface = asInterface(removeadapter);
        int i3 = IAuthTabCallback + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(showMediaImageView showmediaimageview, float f, float f2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function1 function1, float f3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, populatePlayPauseImage.onExtraCallback onextracallback, populatePlayPauseImage.onExtraCallback onextracallback2, int i, float f4, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, float f5, Function1 function12, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(showmediaimageview, f, f2, quirksExternalSyntheticBackport0, z, function1, f3, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, onextracallback, onextracallback2, i, f4, cameraPresenceProviderExternalSyntheticLambda6, f5, function12, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, float f2, populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, populatePlayPauseImage.onNavigationEvent onnavigationevent, Function1 function1, showMediaImageView showmediaimageview, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(f, f2, onextracallbackwithresult, quirksExternalSyntheticBackport0, onnavigationevent, function1, showmediaimageview, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(f, f2, onextracallbackwithresult, quirksExternalSyntheticBackport0, onnavigationevent, function1, showmediaimageview, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, str, useandconfigureprogramwithtexture);
        int i5 = onNavigationEvent + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RallyKeyframes rallyKeyframes) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rallyKeyframes);
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(removeadapter);
        }
        asBinder(removeadapter);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        View view = (View) objArr[5];
        String str2 = (String) objArr[6];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[7];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iIntValue, iIntValue2, str, function1, fFloatValue, view, str2, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7;
        int i8;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i9;
        int i10;
        showMediaImageView showmediaimageview;
        int i11;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final float f;
        final populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult;
        final showMediaImageView showmediaimageview2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        showMediaImageView showmediaimageviewOnWarmupCompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        showMediaImageView showmediaimageview3;
        int i12;
        int i13 = ~i4;
        int i14 = ~(i13 | i);
        int i15 = ~i;
        int i16 = i14 | (~(i15 | i3));
        int i17 = (~(i | i3)) | (~((~i3) | i13 | i15));
        int i18 = i13 | i3 | i15;
        int i19 = i3 + i4 + i5 + (1362283521 * i2) + ((-853422242) * i6);
        int i20 = i19 * i19;
        int i21 = ((i3 * 722868660) - 41817558) + (i4 * 722869710) + (i16 * (-525)) + (i17 * (-525)) + (i18 * 525) + (722869185 * i5) + (1172694977 * i2) + ((-747618338) * i6) + (i20 * 791674880);
        switch (((1713903284 * i3) - 1228931072) + ((-782767794) * i4) + (i16 * 1248335539) + (1248335539 * i17) + ((-1248335539) * i18) + (i5 * 465567744) + (465567744 * i2) + (1887436800 * i6) + ((-1154482176) * i20) + (i21 * i21 * 751828992)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                final float fFloatValue = ((Number) objArr[0]).floatValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = (QuirksExternalSyntheticBackport0) objArr[1];
                showMediaImageView showmediaimageview4 = (showMediaImageView) objArr[2];
                float fFloatValue2 = ((Number) objArr[3]).floatValue();
                final Function1 function1 = (Function1) objArr[4];
                final populatePlayPauseImage.onNavigationEvent onnavigationeventOnExtraCallback = (populatePlayPauseImage.onNavigationEvent) objArr[5];
                populatePlayPauseImage.onExtraCallbackWithResult onExtraCallbackWithResult2 = (populatePlayPauseImage.onExtraCallbackWithResult) objArr[6];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
                final int iIntValue = ((Number) objArr[8]).intValue();
                final int iIntValue2 = ((Number) objArr[9]).intValue();
                int i22 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-359995121);
                if ((iIntValue & 6) == 0) {
                    i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 4 : 2) | iIntValue;
                } else {
                    i7 = iIntValue;
                }
                int i23 = iIntValue2 & 2;
                if (i23 != 0) {
                    i7 |= 48;
                } else if ((iIntValue & 48) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport04) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if ((iIntValue2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(showmediaimageview4)) {
                        int i24 = onNavigationEvent + 13;
                        IAuthTabCallback = i24 % 128;
                        i12 = i24 % 2 == 0 ? 23487 : 256;
                    } else {
                        i12 = 128;
                    }
                    i7 |= i12;
                }
                int i25 = iIntValue2 & 8;
                if (i25 != 0) {
                    int i26 = onNavigationEvent + 67;
                    IAuthTabCallback = i26 % 128;
                    i7 = i26 % 2 == 0 ? i7 | 30673 : i7 | 3072;
                } else if ((iIntValue & 3072) == 0) {
                    int i27 = IAuthTabCallback + 107;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue2) ? 2048 : 1024;
                }
                int i29 = iIntValue2 & 16;
                if (i29 != 0) {
                    int i30 = onNavigationEvent + 29;
                    IAuthTabCallback = i30 % 128;
                    int i31 = i30 % 2;
                    i7 |= 24576;
                } else if ((iIntValue & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                        int i32 = IAuthTabCallback + 65;
                        onNavigationEvent = i32 % 128;
                        i8 = i32 % 2 != 0 ? 30511 : 16384;
                    } else {
                        i8 = 8192;
                    }
                    i7 |= i8;
                }
                int i33 = iIntValue2 & 32;
                if (i33 == 0) {
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport04;
                    if ((196608 & iIntValue) == 0) {
                        int i34 = onNavigationEvent + 71;
                        IAuthTabCallback = i34 % 128;
                        int i35 = i34 % 2;
                        i9 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationeventOnExtraCallback) ? 65536 : 131072) | i7;
                    }
                    i10 = iIntValue2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & iIntValue) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onExtraCallbackWithResult2)) {
                                int i36 = onNavigationEvent + 25;
                                showmediaimageview = showmediaimageview4;
                                IAuthTabCallback = i36 % 128;
                                int i37 = i36 % 2;
                                i11 = 1048576;
                            } else {
                                showmediaimageview = showmediaimageview4;
                                i11 = 524288;
                            }
                            i9 |= i11;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i9) != 599186, i9 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((iIntValue & 1) != 0) {
                                int i38 = onNavigationEvent + 67;
                                IAuthTabCallback = i38 % 128;
                                int i39 = i38 % 2;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i23 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    if ((iIntValue2 & 4) != 0) {
                                        showmediaimageviewOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        i9 &= -897;
                                    } else {
                                        showmediaimageviewOnWarmupCompleted = showmediaimageview;
                                    }
                                    if (i25 != 0) {
                                        fFloatValue2 = 5.0f;
                                    }
                                    if (i29 != 0) {
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        Object obj = objOnMinimized;
                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Object obj2 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda8
                                                private static int onNavigationEvent = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj3) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onWarmupCompleted + 5;
                                                    onNavigationEvent = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    deprecated_followRedirects deprecated_followredirectsIAuthTabCallback = AppLovinVastMediaViewa.IAuthTabCallback(((Float) obj3).floatValue());
                                                    int i43 = onWarmupCompleted + 93;
                                                    onNavigationEvent = i43 % 128;
                                                    int i44 = i43 % 2;
                                                    return deprecated_followredirectsIAuthTabCallback;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj2);
                                            obj = obj2;
                                        }
                                        function1 = (Function1) obj;
                                    }
                                    if (i33 != 0) {
                                        onnavigationeventOnExtraCallback = populatePlayPauseImage.onNavigationEvent.Companion.onExtraCallback();
                                    }
                                    if (i10 != 0) {
                                        onExtraCallbackWithResult2 = populatePlayPauseImage.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                    showmediaimageview3 = showmediaimageviewOnWarmupCompleted;
                                } else {
                                    int i40 = IAuthTabCallback + 69;
                                    onNavigationEvent = i40 % 128;
                                    int i41 = i40 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((iIntValue2 & 4) != 0) {
                                        i9 &= -897;
                                    }
                                    showmediaimageview3 = showmediaimageview;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                }
                                final Function1 function12 = function1;
                                final populatePlayPauseImage.onNavigationEvent onnavigationevent = onnavigationeventOnExtraCallback;
                                final populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult2 = onExtraCallbackWithResult2;
                                final float f2 = fFloatValue2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-359995121, i9, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1 (TdsRatingV1.kt:393)");
                                }
                                getHumanReadableName gethumanreadablenameOnExtraCallbackWithResult = onextracallbackwithresult2.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i9 >> 18) & 14);
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport03;
                                final showMediaImageView showmediaimageview5 = showmediaimageview3;
                                PreviewExternalSyntheticLambda3.IAuthTabCallback(gethumanreadablenameOnExtraCallbackWithResult, ForwardingCameraControl.onExtraCallback(-1704314752, true, new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda9
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i42 = 2 % 2;
                                        int i43 = IAuthTabCallback + 109;
                                        onWarmupCompleted = i43 % 128;
                                        int i44 = i43 % 2;
                                        Unit unitOnNavigationEvent = AppLovinVastMediaViewa.onNavigationEvent(fFloatValue, f2, onextracallbackwithresult2, quirksExternalSyntheticBackport06, onnavigationevent, function12, showmediaimageview5, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                        int i45 = onWarmupCompleted + 85;
                                        IAuthTabCallback = i45 % 128;
                                        int i46 = i45 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport07;
                                f = f2;
                                showmediaimageview2 = showmediaimageview3;
                                function1 = function12;
                                onnavigationeventOnExtraCallback = onnavigationevent;
                                onextracallbackwithresult = onextracallbackwithresult2;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            f = fFloatValue2;
                            onextracallbackwithresult = onExtraCallbackWithResult2;
                            showmediaimageview2 = showmediaimageview;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda10
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                                    int i42 = 2 % 2;
                                    int i43 = onExtraCallbackWithResult + 79;
                                    onNavigationEvent = i43 % 128;
                                    int i44 = i43 % 2;
                                    Unit unitOnWarmupCompleted = AppLovinVastMediaViewa.onWarmupCompleted(fFloatValue, quirksExternalSyntheticBackport02, showmediaimageview2, f, function1, onnavigationeventOnExtraCallback, onextracallbackwithresult, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i45 = onExtraCallbackWithResult + 89;
                                    onNavigationEvent = i45 % 128;
                                    if (i45 % 2 == 0) {
                                        int i46 = 29 / 0;
                                    }
                                    return unitOnWarmupCompleted;
                                }
                            });
                        }
                        return null;
                    }
                    i9 |= 1572864;
                    showmediaimageview = showmediaimageview4;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i9) != 599186, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    return null;
                }
                int i42 = onNavigationEvent + 29;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport04;
                IAuthTabCallback = i42 % 128;
                int i43 = i42 % 2;
                i7 |= 196608;
                i9 = i7;
                i10 = iIntValue2 & 64;
                if (i10 != 0) {
                }
                showmediaimageview = showmediaimageview4;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i9) != 599186, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return null;
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access100(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, showMediaImageView showmediaimageview, float f2, Function1 function1, populatePlayPauseImage.onNavigationEvent onnavigationevent, populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(f, quirksExternalSyntheticBackport0, showmediaimageview, f2, function1, onnavigationevent, onextracallbackwithresult, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(f, quirksExternalSyntheticBackport0, showmediaimageview, f2, function1, onnavigationevent, onextracallbackwithresult, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 33 / 0;
        }
        int i7 = onNavigationEvent + 35;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RallyKeyframes rallyKeyframes) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(rallyKeyframes);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rallyKeyframes);
        int i3 = onNavigationEvent + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{str, useandconfigureprogramwithtexture}, C40Encoder.onExtraCallback(), -990438241, 990438254, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        int i4 = onNavigationEvent + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(deprecated_followRedirects deprecated_followredirects, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, showMediaImageView showmediaimageview, boolean z, boolean z2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(deprecated_followredirects, f, quirksExternalSyntheticBackport0, showmediaimageview, z, z2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(deprecated_followredirects, f, quirksExternalSyntheticBackport0, showmediaimageview, z, z2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(populatePlayPauseImage.onExtraCallback onextracallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onextracallback, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, Float.valueOf(f)};
        Unit unit = (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 1708948247, -1708948237, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ deprecated_followRedirects onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(f);
        }
        onExtraCallback(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Function1 function1, float f, View view, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, f, view, str);
        int i4 = IAuthTabCallback + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private static final deprecated_followRedirects onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        accessgetDEFAULT_PROTOCOLScp accessgetdefault_protocolscpOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted();
        int i4 = IAuthTabCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return accessgetdefault_protocolscpOnWarmupCompleted;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        String str = (String) objArr[0];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(float f, float f2, populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, populatePlayPauseImage.onNavigationEvent onnavigationevent, Function1 function1, showMediaImageView showmediaimageview, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 99;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1704314752, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.<anonymous> (TdsRatingV1.kt:395)");
            }
            final String strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.accessibility_rating_readonly, new Object[]{(String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{Float.valueOf(f)}, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback()), (String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{Float.valueOf(f2)}, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult());
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.onExtraCallback());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strIAuthTabCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda26
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 93;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnWarmupCompleted = AppLovinVastMediaViewa.onWarmupCompleted(strIAuthTabCallback, (useAndConfigureProgramWithTexture) obj);
                        int i8 = onWarmupCompleted + 77;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized, 1, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                int i5 = IAuthTabCallback + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            onnavigationevent.onWarmupCompleted(f, f2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            IAuthTabCallback(function1, onextracallbackwithresult.onNavigationEvent(), onextracallbackwithresult.onWarmupCompleted(), showmediaimageview, onnavigationevent.onExtraCallback().transform(f), f2, onnavigationevent.onNavigationEvent(), null, false, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 3968);
            onnavigationevent.onNavigationEvent(f, f2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 111;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
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

    private static final deprecated_followRedirects onExtraCallback(float f) {
        accessgetDEFAULT_PROTOCOLScp accessgetdefault_protocolscpOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            accessgetdefault_protocolscpOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted();
            int i3 = 14 / 0;
        } else {
            accessgetdefault_protocolscpOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted();
        }
        int i4 = onNavigationEvent + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return accessgetdefault_protocolscpOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        Function1 function1;
        float fFloatValue = ((Number) objArr[0]).floatValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        showMediaImageView showmediaimageviewOnWarmupCompleted = (showMediaImageView) objArr[2];
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Function1 function12 = (Function1) objArr[5];
        populatePlayPauseImage.onWarmupCompleted onwarmupcompletedOnExtraCallback = (populatePlayPauseImage.onWarmupCompleted) objArr[6];
        Function1 function13 = (Function1) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int iIntValue3 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function13, "");
        Object obj = null;
        if ((iIntValue3 & 2) != 0) {
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                obj.hashCode();
                throw null;
            }
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue3 & 4) != 0) {
            showmediaimageviewOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6);
        }
        showMediaImageView showmediaimageview = showmediaimageviewOnWarmupCompleted;
        float f = (iIntValue3 & 8) != 0 ? 5.0f : fFloatValue2;
        int i5 = (iIntValue3 & 16) != 0 ? 5 : iIntValue;
        if ((iIntValue3 & 32) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda25
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 99;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = AppLovinVastMediaViewa.onWarmupCompleted(((Float) obj2).floatValue());
                        int i9 = onExtraCallbackWithResult + 11;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 != 0) {
                            return deprecated_followredirectsOnWarmupCompleted;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function1 = (Function1) objOnMinimized;
        } else {
            function1 = function12;
        }
        if ((iIntValue3 & 64) != 0) {
            onwarmupcompletedOnExtraCallback = populatePlayPauseImage.onWarmupCompleted.Companion.onExtraCallback();
            int i6 = onNavigationEvent + 73;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1654088044, iIntValue2, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1 (TdsRatingV1.kt:431)");
        }
        int i8 = iIntValue2 << 6;
        IAuthTabCallback(function1, onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(), onwarmupcompletedOnExtraCallback.onNavigationEvent(), showmediaimageview, fFloatValue, f, i5, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, onwarmupcompletedOnExtraCallback.IAuthTabCallback()), false, null, null, function13, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue2 >> 15) & 14) | ((iIntValue2 << 3) & 7168) | ((iIntValue2 << 12) & 57344) | (458752 & i8) | (i8 & 3670016), (iIntValue2 >> 18) & 112, 1792);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static final float onNavigationEvent(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        if (((Boolean) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, C40Encoder.onExtraCallback(), -1600247101, 1600247104, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())).booleanValue()) {
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                f = onNavigationEvent(getsupportedhighspeedresolutions);
                int i3 = 96 / 0;
            } else {
                f = onNavigationEvent(getsupportedhighspeedresolutions);
            }
        }
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Context $context;
        final /* synthetic */ getSupportedHighSpeedResolutions $panValue$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Context context, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$panValue$delegate = getsupportedhighspeedresolutions;
            this.$context = context;
        }

        public static /* synthetic */ float onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            float fIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutions);
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return fIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$panValue$delegate, this.$context, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            int i5 = onWarmupCompleted + 29;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            int i5 = onNavigationEvent + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = this.$panValue$delegate;
            ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$CoreRatingV1$1$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 93;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    float fOnWarmupCompleted = AppLovinVastMediaViewa.onExtraCallbackWithResult.onWarmupCompleted(getsupportedhighspeedresolutions);
                    if (i6 == 0) {
                        return Float.valueOf(fOnWarmupCompleted);
                    }
                    Float.valueOf(fOnWarmupCompleted);
                    throw null;
                }
            })), new AnonymousClass3(this.$context, null)), findresandmsg);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
            return unit;
        }

        private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallback = AppLovinVastMediaViewa.onExtraCallback(getsupportedhighspeedresolutions);
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            return fOnExtraCallback;
        }

        /* renamed from: o.AppLovinVastMediaViewa$onExtraCallbackWithResult$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<Float, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Context context, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$context, access13800Var);
                int i2 = onExtraCallback + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                float fFloatValue = ((Number) obj).floatValue();
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 != 0) {
                    return onWarmupCompleted(fFloatValue, access13800Var);
                }
                onWarmupCompleted(fFloatValue, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(float f, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(Float.valueOf(f), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 11;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                Unit unit;
                int i = 2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = IAuthTabCallback + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i3 != 0) {
                    Context context = this.$context;
                    Object[] objArr = {noStore.Companion};
                    int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                    minFresh.onNavigationEvent(context, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
                    unit = Unit.INSTANCE;
                    int i4 = 16 / 0;
                } else {
                    Context context2 = this.$context;
                    Object[] objArr2 = {noStore.Companion};
                    int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                    minFresh.onNavigationEvent(context2, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr2, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2));
                    unit = Unit.INSTANCE;
                }
                int i5 = onExtraCallback + 115;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        float fTransform;
        populatePlayPauseImage.onExtraCallback onextracallback = (populatePlayPauseImage.onExtraCallback) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
            fTransform = onextracallback.transform(fFloatValue);
        } else {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
            fTransform = onextracallback.transform(fFloatValue);
        }
        onExtraCallbackWithResult(getsupportedhighspeedresolutions, fTransform);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(populatePlayPauseImage.onExtraCallback onextracallback, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(getsupportedhighspeedresolutions, onextracallback.transform(f));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(populatePlayPauseImage.onExtraCallback onextracallback, populatePlayPauseImage.onExtraCallback onextracallback2, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, boolean z) {
        int i = 2 % 2;
        if (!z) {
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = onextracallback2;
        }
        function1.invoke(Float.valueOf(onextracallback.transform(f)));
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, new setSupplier(1, i));
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(Function1 function1, float f, View view, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Float.valueOf(f));
        view.announceForAccessibility(str);
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final Unit onWarmupCompleted(int i, int i2, String str, final Function1 function1, final float f, final View view, final String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, new DefaultSurfaceProcessorExternalSyntheticLambda9(0, 1, i, i2));
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
        unregisterOutputSurface.IAuthTabCallbackDefault(useandconfigureprogramwithtexture, (String) null, new Function0() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 63;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Boolean boolValueOf = Boolean.valueOf(AppLovinVastMediaViewa.onWarmupCompleted(function1, f, view, str2));
                int i7 = onNavigationEvent + 75;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return boolValueOf;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.onExtraCallbackWithResult(removeadapter, null, null, getIconContentView.onWarmupCompleted.asBinder(), 0.9f, 3, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(RallyKeyframes rallyKeyframes) {
        getIconContentView geticoncontentview;
        float f;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rallyKeyframes, "");
            geticoncontentview = getIconContentView.onWarmupCompleted;
            rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(1.1f), geticoncontentview.asBinder());
            f = 2.0f;
        } else {
            Intrinsics.checkNotNullParameter(rallyKeyframes, "");
            geticoncontentview = getIconContentView.onWarmupCompleted;
            rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(1.1f), geticoncontentview.asBinder());
            f = 1.0f;
        }
        rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(f), geticoncontentview.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(removeAdapter removeadapter) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) null, (setOnQueryTextListener) null, (Float) null, new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AppLovinVastMediaViewa.onWarmupCompleted((RallyKeyframes) obj);
                int i5 = IAuthTabCallback + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, 7, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.TRUE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 79;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) AppLovinVastMediaViewa.onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{(removeAdapter) obj}, C40Encoder.onExtraCallback(), 806992773, -806992767, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                int i5 = onExtraCallback + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 125;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = AppLovinVastMediaViewa.onNavigationEvent((removeAdapter) obj);
                int i5 = onExtraCallback + 69;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.onExtraCallbackWithResult(removeadapter, 1, null, null, 1.0f, 6, null);
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) 1, (Integer) null, (setOnQueryTextListener) null, 0.0f, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(RallyKeyframes rallyKeyframes) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rallyKeyframes, "");
        getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
        rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(1.5f), geticoncontentview.asBinder());
        rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(1.0f), geticoncontentview.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unit;
    }

    private static final Unit asBinder(RallyKeyframes rallyKeyframes) {
        Float fValueOf;
        getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rallyKeyframes, "");
            getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
            rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(0.5f), geticoncontentview.asBinder());
            fValueOf = Float.valueOf(2.0f);
            getstarratingcontentviewgroupOnExtraCallbackWithResult = geticoncontentview.onExtraCallbackWithResult();
        } else {
            Intrinsics.checkNotNullParameter(rallyKeyframes, "");
            getIconContentView geticoncontentview2 = getIconContentView.onWarmupCompleted;
            rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(0.5f), geticoncontentview2.asBinder());
            fValueOf = Float.valueOf(0.0f);
            getstarratingcontentviewgroupOnExtraCallbackWithResult = geticoncontentview2.onExtraCallbackWithResult();
        }
        rallyKeyframes.onWarmupCompleted((RallyKeyframes) fValueOf, getstarratingcontentviewgroupOnExtraCallbackWithResult);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(removeAdapter removeadapter) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) null, (setOnQueryTextListener) null, (Float) null, new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 75;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = AppLovinVastMediaViewa.onNavigationEvent((RallyKeyframes) obj);
                if (i4 == 0) {
                    int i5 = 21 / 0;
                }
                return unitOnNavigationEvent;
            }
        }, 7, (Object) null);
        removeAdapter.onExtraCallback(removeadapter, (Integer) null, (setOnQueryTextListener) null, (Float) null, new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda24
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) AppLovinVastMediaViewa.onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{(RallyKeyframes) obj}, C40Encoder.onExtraCallback(), -129610470, 129610481, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                int i5 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 7, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.TRUE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = AppLovinVastMediaViewa.IAuthTabCallback((removeAdapter) obj);
                int i5 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda21
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 == 0) {
                    return AppLovinVastMediaViewa.onExtraCallbackWithResult(removeadapter);
                }
                AppLovinVastMediaViewa.onExtraCallbackWithResult(removeadapter);
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(readFully readfully, setOrientationDegrees setorientationdegrees) {
        long j;
        long j2;
        float f;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            j = 1;
            j2 = 0;
            f = 1.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 1;
            i2 = 46;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            j = 0;
            j2 = 0;
            f = 0.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 0;
            i2 = 126;
        }
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, j, j2, f, hasmoreelements, seekVar, i, i2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03d2 A[PHI: r16
      0x03d2: PHI (r16v14 boolean) = (r16v13 boolean), (r16v15 boolean) binds: [B:91:0x03d0, B:88:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(showMediaImageView showmediaimageview, float f, float f2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, final Function1 function1, float f3, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, final populatePlayPauseImage.onExtraCallback onextracallback, final populatePlayPauseImage.onExtraCallback onextracallback2, final int i, float f4, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, float f5, Function1 function12, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z2;
        Object objOnWarmupCompleted;
        View view;
        String str;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent;
        readFully readfully;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        float f6;
        ?? r11;
        int i4;
        final View view2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z3;
        boolean z4;
        View view3;
        Object obj;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized;
        boolean zOnNavigationEvent3;
        boolean zOnNavigationEvent4;
        boolean zOnNavigationEvent5;
        boolean zOnNavigationEvent6;
        Object objOnMinimized2;
        int i5;
        int i6;
        final Function1 function13 = function1;
        final int i7 = i;
        float f7 = f4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(iscontainerclickable)) {
                int i9 = onNavigationEvent + 67;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i2 | i6;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i11 = IAuthTabCallback + 41;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getswitchminwidth)) {
                int i13 = onNavigationEvent + 85;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            int i15 = IAuthTabCallback + 55;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 4 / 2;
            }
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z2, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(72996455, i3, -1, "im.toss.tds.compose.component.atom.rating.CoreRatingV1.<anonymous> (TdsRatingV1.kt:480)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = showmediaimageview.onNavigationEvent(true, true, false, cameraCaptureResultEmptyCameraCaptureResult, 438);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent7 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent)), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent), 0.0f))}), 0L, r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(f7) / 2.0f, 0, 10, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnWarmupCompleted);
            } else {
                objOnWarmupCompleted = objOnMinimized3;
            }
            readFully readfully2 = (readFully) objOnWarmupCompleted;
            View view4 = (View) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            String strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.accessibility_rating_control_container, new Object[]{(String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{Float.valueOf(f)}, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback()), (String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{Float.valueOf(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6))}, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResult3, 0);
            FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(f2);
            if (!z || function13 == null) {
                view = view4;
                str = strIAuthTabCallback;
                onnavigationevent = onnavigationeventOnExtraCallback;
                readfully = readfully2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1430174927);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0IAuthTabCallback = QuirksExternalSyntheticBackport0.Companion;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1384817175);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                Object[] objArr = {Float.valueOf(f3)};
                boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutions);
                boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent8 | zOnNavigationEvent9) && !zOnNavigationEvent10) {
                    view3 = view4;
                    obj = objOnMinimized4;
                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    Function1 function14 = (Function1) obj;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutions);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback2);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda12
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i17 = 2 % 2;
                                int i18 = onWarmupCompleted + 71;
                                onExtraCallback = i18 % 128;
                                int i19 = i18 % 2;
                                Unit unitOnExtraCallback = AppLovinVastMediaViewa.onExtraCallback(onextracallback2, getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                                int i20 = onWarmupCompleted + 69;
                                onExtraCallback = i20 % 128;
                                if (i20 % 2 == 0) {
                                    return unitOnExtraCallback;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
                    }
                    Function1 function15 = (Function1) objOnMinimized;
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback2);
                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback);
                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function13);
                    zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda13
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i17 = 2 % 2;
                                int i18 = onNavigationEvent + 121;
                                onExtraCallback = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return AppLovinVastMediaViewa.onExtraCallbackWithResult(onextracallback2, onextracallback, function13, getsupportedhighspeedresolutionsfor, ((Float) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                                }
                                AppLovinVastMediaViewa.onExtraCallbackWithResult(onextracallback2, onextracallback, function13, getsupportedhighspeedresolutionsfor, ((Float) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                    }
                    view = view3;
                    str = strIAuthTabCallback;
                    onnavigationevent = onnavigationeventOnExtraCallback;
                    readfully = readfully2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(onextracallback3, objArr, f, function14, function15, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    view3 = view4;
                }
                Function1 function16 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda11
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i17 = 2 % 2;
                        int i18 = onWarmupCompleted + 89;
                        onExtraCallbackWithResult = i18 % 128;
                        Object obj3 = null;
                        if (i18 % 2 == 0) {
                            AppLovinVastMediaViewa.onWarmupCompleted(onextracallback, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = AppLovinVastMediaViewa.onWarmupCompleted(onextracallback, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                        int i19 = onExtraCallbackWithResult + 21;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function16);
                obj = function16;
                Function1 function142 = (Function1) obj;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutions);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback2);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda12
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i17 = 2 % 2;
                            int i18 = onWarmupCompleted + 71;
                            onExtraCallback = i18 % 128;
                            int i19 = i18 % 2;
                            Unit unitOnExtraCallback = AppLovinVastMediaViewa.onExtraCallback(onextracallback2, getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                            int i20 = onWarmupCompleted + 69;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
                    Function1 function152 = (Function1) objOnMinimized;
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback2);
                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(onextracallback);
                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function13);
                    zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6)) {
                        objOnMinimized2 = new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda13
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i17 = 2 % 2;
                                int i18 = onNavigationEvent + 121;
                                onExtraCallback = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return AppLovinVastMediaViewa.onExtraCallbackWithResult(onextracallback2, onextracallback, function13, getsupportedhighspeedresolutionsfor, ((Float) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                                }
                                AppLovinVastMediaViewa.onExtraCallbackWithResult(onextracallback2, onextracallback, function13, getsupportedhighspeedresolutionsfor, ((Float) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                        view = view3;
                        str = strIAuthTabCallback;
                        onnavigationevent = onnavigationeventOnExtraCallback;
                        readfully = readfully2;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                        quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(onextracallback3, objArr, f, function142, function152, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i7);
            final String str2 = str;
            boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str2);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent11)) {
                int i17 = onNavigationEvent + 21;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda14
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) {
                            int i19 = 2 % 2;
                            int i20 = IAuthTabCallback + 31;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnNavigationEvent = AppLovinVastMediaViewa.onNavigationEvent(i7, str2, (useAndConfigureProgramWithTexture) obj2);
                            int i22 = onExtraCallbackWithResult + 27;
                            IAuthTabCallback = i22 % 128;
                            int i23 = i22 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                }
                int i19 = 0;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized5, 1, (Object) null);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationevent, QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                    int i20 = IAuthTabCallback + 27;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
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
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-685391480);
                final int i22 = 0;
                while (i22 < i7) {
                    int i23 = i22 + 1;
                    final float f8 = f5 * i23;
                    float fOnWarmupCompleted = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6) >= f8 ? 1.0f : f8 - onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6) < f5 ? 1.0f - ((f8 - onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6)) / f5) : 0.0f;
                    final String strIAuthTabCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.accessibility_rating_control_item, new Object[]{(String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{Float.valueOf(f8)}, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResult2, i19);
                    final String strIAuthTabCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.accessibility_rating_control_click, new Object[]{(String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{Float.valueOf(f8)}, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResult2, i19);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport05, f7);
                    if (!z || function13 == null) {
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0IAuthTabCallbackDefault;
                        f6 = f8;
                        r11 = i19;
                        i4 = i23;
                        view2 = view;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-685339053);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = quirksExternalSyntheticBackport03;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(228426870);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i22);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i7);
                        boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallback2);
                        boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function13);
                        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f8);
                        view2 = view;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(view2);
                        boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strIAuthTabCallback3);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent12 | zOnNavigationEvent13 | zIAuthTabCallback | zOnExtraCallback4) && !zOnNavigationEvent14) {
                            int i24 = IAuthTabCallback + 115;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0IAuthTabCallbackDefault;
                            onNavigationEvent = i24 % 128;
                            if (i24 % 2 != 0) {
                                z3 = false;
                                int i25 = 96 / 0;
                                if (objOnMinimized6 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    int i26 = IAuthTabCallback + 61;
                                    onNavigationEvent = i26 % 128;
                                    int i27 = i26 % 2;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                    f6 = f8;
                                    i4 = i23;
                                    z4 = z3;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                }
                            } else {
                                z3 = false;
                                if (objOnMinimized6 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                            }
                            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, z4, (Function1) objOnMinimized6, 1, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            r11 = z4;
                        } else {
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0IAuthTabCallbackDefault;
                            z3 = false;
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        i4 = i23;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        f6 = f8;
                        z4 = z3;
                        Function1 function17 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda15
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2) {
                                int i28 = 2 % 2;
                                int i29 = onNavigationEvent + 91;
                                onExtraCallback = i29 % 128;
                                int i30 = i29 % 2;
                                int i31 = i22;
                                int i32 = i;
                                String str3 = strIAuthTabCallback2;
                                Function1 function18 = function1;
                                float f9 = f8;
                                Object[] objArr2 = {Integer.valueOf(i31), Integer.valueOf(i32), str3, function18, Float.valueOf(f9), view2, strIAuthTabCallback3, (useAndConfigureProgramWithTexture) obj2};
                                Unit unit = (Unit) AppLovinVastMediaViewa.onWarmupCompleted(C40Encoder.onExtraCallback(), objArr2, C40Encoder.onExtraCallback(), 892723266, -892723257, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                                int i33 = onNavigationEvent + 3;
                                onExtraCallback = i33 % 128;
                                int i34 = i33 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function17);
                        objOnMinimized6 = function17;
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, z4, (Function1) objOnMinimized6, 1, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        r11 = z4;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), (boolean) r11);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, (int) r11));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i28 = IAuthTabCallback + 5;
                        onNavigationEvent = i28 % 128;
                        if (i28 % 2 != 0) {
                            getAwbState.onExtraCallback();
                            int i29 = 81 / r11;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        int i30 = onNavigationEvent + 63;
                        IAuthTabCallback = i30 % 128;
                        if (i30 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) function12.invoke(Float.valueOf(f6));
                    boolean zBooleanValue = ((Boolean) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, C40Encoder.onExtraCallback(), -1600247101, 1600247104, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())).booleanValue();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda16
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3) {
                                int i31 = 2 % 2;
                                int i32 = onWarmupCompleted + 49;
                                onNavigationEvent = i32 % 128;
                                MaxAppOpenAd maxAppOpenAd = (MaxAppOpenAd) obj3;
                                if (i32 % 2 == 0) {
                                    return AppLovinVastMediaViewa.onExtraCallbackWithResult(maxAppOpenAd);
                                }
                                AppLovinVastMediaViewa.onExtraCallbackWithResult(maxAppOpenAd);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, getswitchminwidth, (Function1) objOnMinimized7);
                    final readFully readfully3 = readfully;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
                    View view5 = view2;
                    onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{deprecated_followredirects, Float.valueOf(fOnWarmupCompleted), quirksExternalSyntheticBackport0OnExtraCallback3, showmediaimageview, Boolean.valueOf((boolean) r11), Boolean.valueOf(zBooleanValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((int) r11), 16}, C40Encoder.onExtraCallback(), -882863030, 882863032, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                    if (fOnWarmupCompleted == 1.0f) {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-782909430);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized8 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda17
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj3) {
                                    int i31 = 2 % 2;
                                    int i32 = onWarmupCompleted + 97;
                                    onExtraCallback = i32 % 128;
                                    MaxAppOpenAd maxAppOpenAd = (MaxAppOpenAd) obj3;
                                    if (i32 % 2 != 0) {
                                        AppLovinVastMediaViewa.IAuthTabCallback(maxAppOpenAd);
                                        throw null;
                                    }
                                    Unit unitIAuthTabCallback = AppLovinVastMediaViewa.IAuthTabCallback(maxAppOpenAd);
                                    int i33 = onWarmupCompleted + 5;
                                    onExtraCallback = i33 % 128;
                                    int i34 = i33 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized8);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, getswitchminwidth, (Function1) objOnMinimized8);
                        boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(readfully3);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent15 || objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized9 = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda18
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                public final Object invoke(Object obj3) {
                                    int i31 = 2 % 2;
                                    int i32 = IAuthTabCallback + 117;
                                    onExtraCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    Object[] objArr2 = {readfully3, (setOrientationDegrees) obj3};
                                    Unit unit = (Unit) AppLovinVastMediaViewa.onWarmupCompleted(C40Encoder.onExtraCallback(), objArr2, C40Encoder.onExtraCallback(), 1492183230, -1492183223, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                                    int i34 = onExtraCallback + 61;
                                    IAuthTabCallback = i34 % 128;
                                    if (i34 % 2 != 0) {
                                        return unit;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized9);
                        }
                        isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback4, (Function1) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResult4, (int) r11);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-781643793);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    i22 = i4;
                    function13 = function1;
                    i7 = i;
                    view = view5;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                    readfully = readfully3;
                    i19 = r11;
                    f7 = f4;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final Function1<? super Float, ? extends deprecated_followRedirects> function1, final float f, final float f2, @NotNull final showMediaImageView showmediaimageview, final float f3, final float f4, final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable populatePlayPauseImage.onExtraCallback onextracallback, @Nullable populatePlayPauseImage.onExtraCallback onextracallback2, @Nullable Function1<? super Float, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z2;
        final populatePlayPauseImage.onExtraCallback onextracallback3;
        final populatePlayPauseImage.onExtraCallback onextracallback4;
        final Function1<? super Float, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z3;
        populatePlayPauseImage.onExtraCallback onextracallback5;
        char c;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i12;
        int i13;
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(showmediaimageview, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1003742464);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i15 = onNavigationEvent + 23;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(showmediaimageview) ? 2048 : 1024;
        }
        Object obj = null;
        if ((i2 & 24576) == 0) {
            int i17 = onNavigationEvent + 53;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f3);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f3)) {
                int i18 = IAuthTabCallback + 99;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        if ((196608 & i2) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i20 = onNavigationEvent + 9;
            IAuthTabCallback = i20 % 128;
            int i21 = i20 % 2;
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 1048576 : 524288;
        }
        int i22 = i4 & 128;
        if (i22 != 0) {
            i5 |= 12582912;
        } else {
            if ((12582912 & i2) == 0) {
                int i23 = IAuthTabCallback + 51;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 8388608 : 4194304;
            }
            i6 = i4 & 256;
            if (i6 == 0) {
                i5 |= 100663296;
            } else {
                if ((i2 & 100663296) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
                }
                i7 = i4 & 512;
                if (i7 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 536870912 : 268435456;
                }
                i8 = i4 & 1024;
                if (i8 != 0) {
                    i9 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i9 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2);
                } else {
                    i9 = i3;
                }
                i10 = i4 & 2048;
                if (i10 == 0) {
                    if ((i3 & 48) == 0) {
                        i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 32 : 16;
                    }
                    i11 = i9;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i11 & 19) != 18, i5 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        z2 = z;
                        onextracallback3 = onextracallback;
                        onextracallback4 = onextracallback2;
                        function13 = function12;
                    } else {
                        if (i22 != 0) {
                            int i25 = IAuthTabCallback + 115;
                            onNavigationEvent = i25 % 128;
                            if (i25 % 2 != 0) {
                                quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                int i26 = 84 / 0;
                            } else {
                                quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        } else {
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        }
                        if (i6 != 0) {
                            int i27 = onNavigationEvent + 105;
                            IAuthTabCallback = i27 % 128;
                            z3 = i27 % 2 != 0;
                        } else {
                            z3 = z;
                        }
                        populatePlayPauseImage.onExtraCallback onextracallbackOnNavigationEvent = i7 != 0 ? populatePlayPauseImage.onExtraCallback.Companion.onNavigationEvent() : onextracallback;
                        if (i8 != 0) {
                            onextracallback5 = (populatePlayPauseImage.onExtraCallback) populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onWarmupCompleted(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -855871671, 855871671, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{populatePlayPauseImage.onExtraCallback.Companion});
                        } else {
                            onextracallback5 = onextracallback2;
                        }
                        Function1<? super Float, Unit> function14 = i10 != 0 ? null : function12;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1003742464, i5, i11, "im.toss.tds.compose.component.atom.rating.CoreRatingV1 (TdsRatingV1.kt:459)");
                        }
                        if (i > 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-928771086);
                            int i28 = 57344 & i5;
                            boolean z4 = i28 == 16384;
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z4 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                c = 2;
                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                            } else {
                                c = 2;
                            }
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                            boolean z5 = i28 == 16384;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z5) {
                                Object obj2 = objOnMinimized2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutionsOnExtraCallbackWithResult = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f3);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsOnExtraCallbackWithResult);
                                    obj2 = getsupportedhighspeedresolutionsOnExtraCallbackWithResult;
                                }
                                final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) obj2;
                                boolean z6 = i28 == 16384;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z6) {
                                    Object obj3 = objOnMinimized3;
                                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda3
                                            private static int onExtraCallback = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke() {
                                                int i29 = 2 % 2;
                                                int i30 = onExtraCallback + 125;
                                                onNavigationEvent = i30 % 128;
                                                int i31 = i30 % 2;
                                                Float fValueOf = Float.valueOf(AppLovinVastMediaViewa.onExtraCallbackWithResult(f3, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions));
                                                int i32 = onNavigationEvent + 75;
                                                onExtraCallback = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    return fValueOf;
                                                }
                                                throw null;
                                            }
                                        });
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                                        obj3 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                                    }
                                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) obj3;
                                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                    float fOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions);
                                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutions);
                                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized4 = new onExtraCallbackWithResult(getsupportedhighspeedresolutions, context, null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                    }
                                    isZslDisabledByByUserCaseConfig.onExtraCallback(context, Float.valueOf(fOnNavigationEvent), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    final float f5 = f4 / i;
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                    final boolean z7 = z3;
                                    final Function1<? super Float, Unit> function15 = function14;
                                    final populatePlayPauseImage.onExtraCallback onextracallback6 = onextracallbackOnNavigationEvent;
                                    final populatePlayPauseImage.onExtraCallback onextracallback7 = onextracallback5;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Boolean.valueOf(((Boolean) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, C40Encoder.onExtraCallback(), -1600247101, 1600247104, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())).booleanValue()), null, 0, 0, ForwardingCameraControl.onExtraCallback(72996455, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda4
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) throws NoWhenBranchMatchedException {
                                            int i29 = 2 % 2;
                                            int i30 = onExtraCallback + 111;
                                            onWarmupCompleted = i30 % 128;
                                            int i31 = i30 % 2;
                                            Unit unitOnExtraCallbackWithResult = AppLovinVastMediaViewa.onExtraCallbackWithResult(showmediaimageview, f4, f2, quirksExternalSyntheticBackport05, z7, function15, f3, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, onextracallback6, onextracallback7, i, f, cameraPresenceProviderExternalSyntheticLambda6, f5, function1, (isContainerClickable) obj4, (getSwitchMinWidth) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                            int i32 = onWarmupCompleted + 81;
                                            onExtraCallback = i32 % 128;
                                            int i33 = i32 % 2;
                                            return unitOnExtraCallbackWithResult;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-922082526);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i29 = onNavigationEvent + 43;
                            IAuthTabCallback = i29 % 128;
                            int i30 = i29 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        z2 = z3;
                        onextracallback3 = onextracallbackOnNavigationEvent;
                        onextracallback4 = onextracallback5;
                        function13 = function14;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda5
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4, Object obj5) {
                                int i31 = 2 % 2;
                                int i32 = onNavigationEvent + 61;
                                onExtraCallbackWithResult = i32 % 128;
                                int i33 = i32 % 2;
                                Unit unitOnExtraCallbackWithResult = AppLovinVastMediaViewa.onExtraCallbackWithResult(function1, f, f2, showmediaimageview, f3, f4, i, quirksExternalSyntheticBackport02, z2, onextracallback3, onextracallback4, function13, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                int i34 = onNavigationEvent + 65;
                                onExtraCallbackWithResult = i34 % 128;
                                int i35 = i34 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        });
                        return;
                    }
                    return;
                }
                int i31 = onNavigationEvent + 85;
                IAuthTabCallback = i31 % 128;
                i9 = i31 % 2 == 0 ? i9 | 79 : i9 | 48;
                i11 = i9;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i11 & 19) != 18, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i4 & 512;
            if (i7 != 0) {
            }
            i8 = i4 & 1024;
            if (i8 != 0) {
            }
            i10 = i4 & 2048;
            if (i10 == 0) {
            }
            i11 = i9;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i11 & 19) != 18, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i4 & 256;
        if (i6 == 0) {
        }
        i7 = i4 & 512;
        if (i7 != 0) {
        }
        i8 = i4 & 1024;
        if (i8 != 0) {
        }
        i10 = i4 & 2048;
        if (i10 == 0) {
        }
        i11 = i9;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i11 & 19) != 18, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i4;
        float f;
        final boolean z;
        final boolean z2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        final showMediaImageView showmediaimageview;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        showMediaImageView showmediaimageview2;
        boolean z4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = (QuirksExternalSyntheticBackport0) objArr[2];
        showMediaImageView showmediaimageviewOnWarmupCompleted = (showMediaImageView) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        final int iIntValue2 = ((Number) objArr[8]).intValue();
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(616554804);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i6 = IAuthTabCallback + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 32 : 16;
        }
        int i8 = iIntValue2 & 4;
        if (i8 != 0) {
            int i9 = IAuthTabCallback + 47;
            onNavigationEvent = i9 % 128;
            i = i9 % 2 != 0 ? i | 30588 : i | 384;
        } else if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport04)) {
                int i10 = onNavigationEvent + 43;
                IAuthTabCallback = i10 % 128;
                i2 = i10 % 2 == 0 ? 16600 : 256;
            } else {
                i2 = 128;
            }
            i |= i2;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((iIntValue2 & 8) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(showmediaimageviewOnWarmupCompleted)) ? 2048 : 1024;
        }
        int i11 = iIntValue2 & 16;
        if (i11 != 0) {
            i |= 24576;
        } else if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 16384 : 8192;
        }
        int i12 = iIntValue2 & 32;
        if (i12 != 0) {
            i |= 196608;
        } else if ((iIntValue & 196608) == 0) {
            int i13 = IAuthTabCallback + 9;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 35 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 131072 : 65536;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2)) {
            }
            i |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((74899 & i) == 74898), i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i8 != 0) {
                    int i15 = IAuthTabCallback + 91;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0) {
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        throw null;
                    }
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                }
                if ((iIntValue2 & 8) != 0) {
                    int i16 = IAuthTabCallback + 85;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        showmediaimageviewOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        i &= 18542;
                    } else {
                        showmediaimageviewOnWarmupCompleted = prepareMediaPlayer.IAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i &= -7169;
                    }
                }
                if (i11 != 0) {
                    int i17 = IAuthTabCallback + 119;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    zBooleanValue = true;
                }
                if (i12 != 0) {
                    int i19 = onNavigationEvent + 23;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    z3 = false;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    showmediaimageview2 = showmediaimageviewOnWarmupCompleted;
                    z4 = zBooleanValue;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(616554804, i, -1, "im.toss.tds.compose.component.atom.rating.RatingIcon (TdsRatingV1.kt:607)");
                }
                if (fFloatValue > 0.0f || fFloatValue >= 1.0f) {
                    obj = null;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                    i4 = iIntValue;
                    f = fFloatValue;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1789678385);
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport05, 0.0f, 1, (Object) null), ((setByteOrder) showmediaimageview2.onNavigationEvent(f != 1.0f, z4, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 9) & 1008) | (i & 7168)).onExtraCallbackWithResult()).access100(), null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i & 14, 504);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    int i21 = IAuthTabCallback + 57;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1790634797);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    int i23 = i >> 9;
                    int i24 = (i23 & 112) | 6 | (i23 & 896) | (i & 7168);
                    long jAccess100 = ((setByteOrder) showmediaimageview2.onNavigationEvent(true, z4, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i24).onExtraCallbackWithResult()).access100();
                    QuirkSettingsLoader quirkSettingsLoaderAsInterface = onextracallbackwithresult.asInterface();
                    immediateFailedFuture immediatefailedfutureOnWarmupCompleted = immediateFailedFuture.Companion.onWarmupCompleted();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    int i25 = i & 14;
                    i4 = iIntValue;
                    f = fFloatValue;
                    AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), new maybeFireTrackers(fFloatValue, false)), jAccess100, null, null, null, quirkSettingsLoaderAsInterface, immediatefailedfutureOnWarmupCompleted, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25 | 14155776, 312);
                    AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), new maybeFireTrackers(1.0f - f, true)), ((setByteOrder) showmediaimageview2.onNavigationEvent(false, z4, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i24).onExtraCallbackWithResult()).access100(), null, null, null, onextracallbackwithresult.IAuthTabCallbackStub(), null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25 | 1572864, 440);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    obj = null;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i26 = onNavigationEvent + 107;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                showmediaimageview = showmediaimageview2;
                z = z4;
                z2 = z3;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((iIntValue2 & 8) != 0) {
                    i &= -7169;
                }
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            showmediaimageview2 = showmediaimageviewOnWarmupCompleted;
            z4 = zBooleanValue;
            z3 = zBooleanValue2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            if (fFloatValue > 0.0f) {
                obj = null;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport02;
                i4 = iIntValue;
                f = fFloatValue;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1789678385);
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport052;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport052, 0.0f, 1, (Object) null), ((setByteOrder) showmediaimageview2.onNavigationEvent(f != 1.0f, z4, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 9) & 1008) | (i & 7168)).onExtraCallbackWithResult()).access100(), null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i & 14, 504);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                showmediaimageview = showmediaimageview2;
                z = z4;
                z2 = z3;
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i4 = iIntValue;
            f = fFloatValue;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            z = zBooleanValue;
            z2 = zBooleanValue2;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport04;
            showmediaimageview = showmediaimageviewOnWarmupCompleted;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final float f2 = f;
            final int i28 = i4;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1Kt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i29 = 2 % 2;
                    int i30 = IAuthTabCallback + 79;
                    onExtraCallback = i30 % 128;
                    int i31 = i30 % 2;
                    Unit unitOnWarmupCompleted = AppLovinVastMediaViewa.onWarmupCompleted(deprecated_followredirects, f2, quirksExternalSyntheticBackport0, showmediaimageview, z, z2, i28, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i32 = onExtraCallback + 103;
                    IAuthTabCallback = i32 % 128;
                    int i33 = i32 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
        return obj;
    }

    private static final float onNavigationEvent(float f, getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fCoerceIn = RangesKt.coerceIn((Float.intBitsToFloat((int) (j >> 32)) / ((int) (onExtraCallback(getsupportedhighspeedresolutionsfor) >> 32))) * f, 0.0f, f);
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fCoerceIn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 ??, still in use, count: 1, list:
          (r11v2 ?? I:java.lang.Object) from 0x0141: INVOKE (r24v0 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r11v2 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:852)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static final o.QuirksExternalSyntheticBackport0 IAuthTabCallback(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 ??, still in use, count: 1, list:
          (r11v2 ?? I:java.lang.Object) from 0x0141: INVOKE (r24v0 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r11v2 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:852)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, Long.valueOf(extensionsManager1.onExtraCallbackWithResult())}, C40Encoder.onExtraCallback(), -364738173, 364738174, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    static final class onExtraCallback implements PointerInputEventHandler {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;
        final /* synthetic */ Function1<Float, Unit> IAuthTabCallback;
        final /* synthetic */ float onExtraCallback;
        final /* synthetic */ Function1<Float, Unit> onExtraCallbackWithResult;
        final /* synthetic */ Function2<Float, Boolean, Unit> onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<ExtensionsManager1> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(Function1<? super Float, Unit> function1, Function1<? super Float, Unit> function12, Function2<? super Float, ? super Boolean, Unit> function2, float f, getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
            this.IAuthTabCallback = function1;
            this.onExtraCallbackWithResult = function12;
            this.onNavigationEvent = function2;
            this.onExtraCallback = f;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, new AnonymousClass5(this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted, null), access13800Var);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 49;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
            return objOnWarmupCompleted;
        }

        /* renamed from: o.AppLovinVastMediaViewa$onExtraCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<ExtensionsManager1> $containerSize$delegate;
            final /* synthetic */ float $maxValue;
            final /* synthetic */ Function1<Float, Unit> $onPointerDown;
            final /* synthetic */ Function1<Float, Unit> $onPointerDrag;
            final /* synthetic */ Function2<Float, Boolean, Unit> $onPointerUp;
            float F$0;
            float F$1;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(Function1<? super Float, Unit> function1, Function1<? super Float, Unit> function12, Function2<? super Float, ? super Boolean, Unit> function2, float f, getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$onPointerDown = function1;
                this.$onPointerDrag = function12;
                this.$onPointerUp = function2;
                this.$maxValue = f;
                this.$containerSize$delegate = getsupportedhighspeedresolutionsfor;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$onPointerDown, this.$onPointerDrag, this.$onPointerUp, this.$maxValue, this.$containerSize$delegate, access13800Var);
                anonymousClass5.L$0 = obj;
                int i2 = onWarmupCompleted + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((AudioExecutor1) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 9;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 98 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 39;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(audioExecutor1, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 21;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
            
                if (r15 != r8) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
            
                if (r15 != r8) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
            
                return r8;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:21:0x008d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                HandlerScheduledExecutorService2 handlerScheduledExecutorService2;
                float f;
                float f2;
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 13;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                AudioExecutor1 audioExecutor1 = (AudioExecutor1) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = this.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.L$0 = audioExecutor1;
                    this.label = 1;
                    obj = Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(audioExecutor1, false, (createPostFailedException) null, this, 2, (Object) null);
                } else if (i5 != 1) {
                    int i6 = IAuthTabCallback + 17;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0 ? i5 != 2 : i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    f = this.F$1;
                    f2 = this.F$0;
                    handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) obj;
                    if (handlerScheduledExecutorService22 != null) {
                        int i7 = IAuthTabCallback + 59;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        if (Math.abs(Float.intBitsToFloat((int) (handlerScheduledExecutorService22.IAuthTabCallback() >> 32)) - Float.intBitsToFloat((int) (handlerScheduledExecutorService2.IAuthTabCallback() >> 32))) >= audioExecutor1.asBinder().onNavigationEvent()) {
                            float fOnExtraCallback = AppLovinVastMediaViewa.onExtraCallback(this.$maxValue, this.$containerSize$delegate, handlerScheduledExecutorService22.IAuthTabCallback());
                            if (fOnExtraCallback == f) {
                                int i9 = IAuthTabCallback + 77;
                                onWarmupCompleted = i9 % 128;
                                int i10 = i9 % 2;
                            } else {
                                this.$onPointerDrag.invoke(access14000.onExtraCallbackWithResult(fOnExtraCallback));
                                f = fOnExtraCallback;
                                i = 1;
                            }
                        }
                    }
                    if (handlerScheduledExecutorService22 == null) {
                        int i11 = IAuthTabCallback + 87;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        this.$onPointerUp.invoke(access14000.onExtraCallbackWithResult(f), access14000.onNavigationEvent(i != 0));
                        return Unit.INSTANCE;
                    }
                    long jOnNavigationEvent = handlerScheduledExecutorService2.onNavigationEvent();
                    this.L$0 = audioExecutor1;
                    this.L$1 = handlerScheduledExecutorService2;
                    this.F$0 = f2;
                    this.F$1 = f;
                    this.I$0 = i;
                    this.label = 2;
                    obj = FeatureCombinationQueryImplExternalSyntheticLambda10.IAuthTabCallback(audioExecutor1, jOnNavigationEvent, this);
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                HandlerScheduledExecutorService2 handlerScheduledExecutorService23 = (HandlerScheduledExecutorService2) obj;
                float fOnExtraCallback2 = AppLovinVastMediaViewa.onExtraCallback(this.$maxValue, this.$containerSize$delegate, handlerScheduledExecutorService23.IAuthTabCallback());
                this.$onPointerDown.invoke(access14000.onExtraCallbackWithResult(fOnExtraCallback2));
                handlerScheduledExecutorService2 = handlerScheduledExecutorService23;
                f = fOnExtraCallback2;
                f2 = f;
                i = 0;
                long jOnNavigationEvent2 = handlerScheduledExecutorService2.onNavigationEvent();
                this.L$0 = audioExecutor1;
                this.L$1 = handlerScheduledExecutorService2;
                this.F$0 = f2;
                this.F$1 = f;
                this.I$0 = i;
                this.label = 2;
                obj = FeatureCombinationQueryImplExternalSyntheticLambda10.IAuthTabCallback(audioExecutor1, jOnNavigationEvent2, this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
      0x0021: PHI (r4v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onNavigationEvent = i3 % 128;
        boolean z = false;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(62679974);
            int i4 = 2 / 0;
            if (i != 0) {
                z = true;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(62679974);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(62679974, i, -1, "im.toss.tds.compose.component.atom.rating.Preview (TdsRatingV1.kt:708)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) maybeHandleResume.IAuthTabCallback.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 61;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsRatingV1Kt$.ExternalSyntheticLambda22(i));
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        int i = 2 % 2;
        int i2 = (int) fFloatValue;
        if (fFloatValue != i2) {
            String strValueOf = String.valueOf(fFloatValue);
            int i3 = IAuthTabCallback + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return strValueOf;
        }
        int i5 = onNavigationEvent + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return String.valueOf(i2);
        }
        String.valueOf(i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final long onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return fOnNavigationEvent;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            fFloatValue = number.floatValue();
            int i4 = 22 / 0;
        } else {
            fFloatValue = number.floatValue();
        }
        int i5 = IAuthTabCallback + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final long onExtraCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = ((ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(jLongValue));
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(readFully readfully, setOrientationDegrees setorientationdegrees) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{readfully, setorientationdegrees}, C40Encoder.onExtraCallback(), 1492183230, -1492183223, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(int i, int i2, String str, Function1 function1, float f, View view, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, function1, Float.valueOf(f), view, str2, useandconfigureprogramwithtexture};
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 892723266, -892723257, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(removeAdapter removeadapter) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{removeadapter}, C40Encoder.onExtraCallback(), 806992773, -806992767, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(RallyKeyframes rallyKeyframes) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{rallyKeyframes}, C40Encoder.onExtraCallback(), -129610470, 129610481, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        return ((Boolean) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, C40Encoder.onExtraCallback(), -1600247101, 1600247104, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())).booleanValue();
    }

    private static final Unit onNavigationEvent(Function1 function1, float f, float f2, showMediaImageView showmediaimageview, float f3, float f4, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, populatePlayPauseImage.onExtraCallback onextracallback, populatePlayPauseImage.onExtraCallback onextracallback2, Function1 function12, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {function1, Float.valueOf(f), Float.valueOf(f2), showmediaimageview, Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), quirksExternalSyntheticBackport0, Boolean.valueOf(z), onextracallback, onextracallback2, function12, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 367661570, -367661565, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final Unit onNavigationEvent(populatePlayPauseImage.onExtraCallback onextracallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {onextracallback, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, Float.valueOf(f)};
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 1708948247, -1708948237, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final void onNavigationEvent(deprecated_followRedirects deprecated_followredirects, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, showMediaImageView showmediaimageview, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {deprecated_followredirects, Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Boolean.valueOf(z), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), -882863030, 882863032, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static final void IAuthTabCallback(float f, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable showMediaImageView showmediaimageview, float f2, int i, @Nullable Function1<? super Float, ? extends deprecated_followRedirects> function1, @Nullable populatePlayPauseImage.onWarmupCompleted onwarmupcompleted, @NotNull Function1<? super Float, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        Object[] objArr = {Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Float.valueOf(f2), Integer.valueOf(i), function1, onwarmupcompleted, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), -1608759216, 1608759216, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static final void onNavigationEvent(float f, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable showMediaImageView showmediaimageview, float f2, @Nullable Function1<? super Float, ? extends deprecated_followRedirects> function1, @Nullable populatePlayPauseImage.onNavigationEvent onnavigationevent, @Nullable populatePlayPauseImage.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {Float.valueOf(f), quirksExternalSyntheticBackport0, showmediaimageview, Float.valueOf(f2), function1, onnavigationevent, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), 1855124953, -1855124949, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{str, useandconfigureprogramwithtexture}, C40Encoder.onExtraCallback(), -990438241, 990438254, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) throws NoWhenBranchMatchedException {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j)};
        onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), -364738173, 364738174, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, extensionsManager1}, C40Encoder.onExtraCallback(), -204290661, 204290669, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private static final String onExtraCallbackWithResult(float f) {
        Object[] objArr = {Float.valueOf(f)};
        return (String) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), -2068953001, 2068953013, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }
}
