package o;

import android.content.Context;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AppLovinAdClickListener;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setCacheComposition;
import o.setClipToCompositionBounds;
import o.setIso;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setClipToCompositionBounds {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final setClipToCompositionBounds onWarmupCompleted = new setClipToCompositionBounds();

    static {
        int i = onNavigationEvent + 65;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(rally);
        }
        onNavigationEvent(rally);
        throw null;
    }

    private static final Unit onExtraCallback(setClipToCompositionBounds setcliptocompositionbounds, selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, int i, setAnimationFromUrl setanimationfromurl, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        setcliptocompositionbounds.onNavigationEvent(selectparentresolutions, function1, iAuthTabCallbackStub, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, i, setanimationfromurl, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3));
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7;
        long jAudioAttributesImplBaseParcelizer;
        long j;
        long jWarmup;
        int i8;
        long jAsInterface;
        long j2;
        int i9;
        long jAudioAttributesImplBaseParcelizer2;
        int i10;
        long jMediaMetadataCompat;
        long jMediaMetadataCompat2;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        int i11;
        int i12 = i5 | i2 | i6;
        int i13 = (~((~i6) | i2)) | i5;
        int i14 = ~((~i5) | i2);
        int i15 = i5 + i2 + i4 + (1132004924 * i3) + ((-2047965933) * i);
        int i16 = i15 * i15;
        int i17 = ((i5 * (-767560105)) - 1188649921) + ((-767559017) * i2) + (i12 * (-544)) + (i13 * 544) + (i14 * 544) + ((-767559561) * i4) + (1544553956 * i3) + ((-1468578859) * i) + (i16 * (-2108293120));
        int i18 = ((1650805025 * i5) - 289800192) + ((-1513965855) * i2) + ((-565098208) * i12) + (i13 * 565098208) + (565098208 * i14) + ((-2079064064) * i4) + (1823473664 * i3) + (830210048 * i) + ((-1143341056) * i16) + (i17 * i17 * (-2075787264));
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onExtraCallback(objArr);
        }
        if (i18 != 3) {
            return onNavigationEvent(objArr);
        }
        setClipToCompositionBounds setcliptocompositionbounds = (setClipToCompositionBounds) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        long jLongValue4 = ((Number) objArr[4]).longValue();
        long jLongValue5 = ((Number) objArr[5]).longValue();
        long jLongValue6 = ((Number) objArr[6]).longValue();
        long jLongValue7 = ((Number) objArr[7]).longValue();
        long jLongValue8 = ((Number) objArr[8]).longValue();
        long jLongValue9 = ((Number) objArr[9]).longValue();
        long jLongValue10 = ((Number) objArr[10]).longValue();
        long jLongValue11 = ((Number) objArr[11]).longValue();
        long jLongValue12 = ((Number) objArr[12]).longValue();
        long jLongValue13 = ((Number) objArr[13]).longValue();
        long jLongValue14 = ((Number) objArr[14]).longValue();
        long jLongValue15 = ((Number) objArr[15]).longValue();
        long jLongValue16 = ((Number) objArr[16]).longValue();
        long jLongValue17 = ((Number) objArr[17]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[18];
        int iIntValue = ((Number) objArr[19]).intValue();
        int iIntValue2 = ((Number) objArr[20]).intValue();
        int iIntValue3 = ((Number) objArr[21]).intValue();
        int i19 = 2 % 2;
        if ((iIntValue3 & 1) != 0) {
            int i20 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
            jAudioAttributesImplBaseParcelizer = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
            i7 = 6;
        } else {
            i7 = 6;
            jAudioAttributesImplBaseParcelizer = jLongValue;
        }
        if ((iIntValue3 & 2) != 0) {
            jLongValue2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i7).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback();
        }
        if ((iIntValue3 & 4) != 0) {
            long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
            int i22 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            j = jIAuthTabCallbackDefault;
        } else {
            j = jLongValue3;
        }
        if ((iIntValue3 & 8) != 0) {
            int i24 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i24 % 128;
            int i25 = i24 % 2;
            jWarmup = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).warmup();
        } else {
            jWarmup = jLongValue4;
        }
        if ((iIntValue3 & 16) != 0) {
            int i26 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i26 % 128;
            int i27 = i26 % 2;
            i8 = 6;
            jAsInterface = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().asInterface();
        } else {
            i8 = 6;
            jAsInterface = jLongValue5;
        }
        long jIAuthTabCallbackStub = (iIntValue3 & 32) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i8).IAuthTabCallbackStub() : jLongValue6;
        long jIAuthTabCallbackDefault2 = (iIntValue3 & 64) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : jLongValue7;
        if ((iIntValue3 & 128) != 0) {
            int i28 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i28 % 128;
            int i29 = i28 % 2;
            long jOnTransact = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onTransact();
            int i30 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i30 % 128;
            int i31 = i30 % 2;
            j2 = jOnTransact;
        } else {
            j2 = jLongValue8;
        }
        long jLongValue18 = (iIntValue3 & 256) != 0 ? ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue() : jLongValue9;
        if ((iIntValue3 & 512) != 0) {
            i9 = 6;
            jAudioAttributesImplBaseParcelizer2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            i9 = 6;
            jAudioAttributesImplBaseParcelizer2 = jLongValue10;
        }
        long jAudioAttributesImplBaseParcelizer3 = (iIntValue3 & 1024) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i9).AudioAttributesImplBaseParcelizer() : jLongValue11;
        long jWrite = (iIntValue3 & 2048) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i9).write() : jLongValue12;
        long jOnExtraCallback = (iIntValue3 & 4096) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i9).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : jLongValue13;
        if ((iIntValue3 & 8192) != 0) {
            int i32 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i32 % 128;
            int i33 = i32 % 2;
            i10 = 6;
            jMediaMetadataCompat = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
        } else {
            i10 = 6;
            jMediaMetadataCompat = jLongValue14;
        }
        long jRatingCompat1 = (iIntValue3 & 16384) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i10).RatingCompat1() : jLongValue15;
        long jWrite2 = (32768 & iIntValue3) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i10).write() : jLongValue16;
        if ((iIntValue3 & 65536) != 0) {
            int i34 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i34 % 128;
            if (i34 % 2 == 0) {
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                i11 = 114;
            } else {
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                i11 = 6;
            }
            jMediaMetadataCompat2 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i11).MediaMetadataCompat();
        } else {
            jMediaMetadataCompat2 = jLongValue17;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-28203780, iIntValue, iIntValue2, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.textFieldColors (TextFields.kt:867)");
        }
        setCacheComposition.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = setcliptocompositionbounds.onExtraCallbackWithResult(jAudioAttributesImplBaseParcelizer, jLongValue2, j, MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().mayLaunchUrl(), jWarmup, jAsInterface, jIAuthTabCallbackStub, jIAuthTabCallbackDefault2, j2, jLongValue18, jAudioAttributesImplBaseParcelizer2, jAudioAttributesImplBaseParcelizer3, jWrite, jOnExtraCallback, jMediaMetadataCompat, jRatingCompat1, jWrite2, jMediaMetadataCompat2);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setClipToCompositionBounds setcliptocompositionbounds, selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, int i, setAnimationFromUrl setanimationfromurl, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setcliptocompositionbounds, selectparentresolutions, function1, iAuthTabCallbackStub, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, i, setanimationfromurl, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        if (i7 == 0) {
            int i8 = 45 / 0;
        }
        return unitOnExtraCallback;
    }

    private setClipToCompositionBounds() {
    }

    public static final /* synthetic */ getHumanReadableName onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(cameraPresenceProviderExternalSyntheticLambda6);
            throw null;
        }
        getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = IAuthTabCallbackStub(cameraPresenceProviderExternalSyntheticLambda6);
        int i3 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return gethumanreadablenameIAuthTabCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asBinder(cameraPresenceProviderExternalSyntheticLambda6);
            obj.hashCode();
            throw null;
        }
        getHumanReadableName gethumanreadablenameAsBinder = asBinder(cameraPresenceProviderExternalSyntheticLambda6);
        int i3 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return gethumanreadablenameAsBinder;
        }
        throw null;
    }

    public static final /* synthetic */ getHumanReadableName onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablenameIAuthTabCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return gethumanreadablenameIAuthTabCallback;
    }

    public static final /* synthetic */ getHumanReadableName onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            return (getHumanReadableName) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 760463165, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnWarmupCompleted3, iOnWarmupCompleted2, -760463164, iOnWarmupCompleted);
        }
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted5 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted6 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setCacheComposition.onNavigationEvent IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        long jAudioAttributesImplBaseParcelizer;
        long jAsInterface;
        long jIAuthTabCallbackStub;
        long jIAuthTabCallbackDefault;
        long j17;
        int i4;
        long jOnTransact;
        long j18;
        long jAudioAttributesImplBaseParcelizer2;
        long j19;
        int i5;
        long jAudioAttributesImplBaseParcelizer3;
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0 || (i3 & 1) == 0) {
            jAudioAttributesImplBaseParcelizer = j;
        } else {
            jAudioAttributesImplBaseParcelizer = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
            int i8 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        long jOnExtraCallback = (i3 & 2) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j2;
        long jWarmup = (i3 & 4) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).warmup() : j3;
        if ((i3 & 8) != 0) {
            int i10 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            jAsInterface = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().asInterface();
        } else {
            jAsInterface = j4;
        }
        if ((i3 & 16) != 0) {
            int i12 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i12 % 128;
            jIAuthTabCallbackStub = (i12 % 2 == 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 107) : y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)).IAuthTabCallbackStub();
        } else {
            jIAuthTabCallbackStub = j5;
        }
        if ((i3 & 32) != 0) {
            int i13 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                setByteOrder.Companion.IAuthTabCallbackDefault();
                throw null;
            }
            jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
        } else {
            jIAuthTabCallbackDefault = j6;
        }
        if ((i3 & 64) != 0) {
            j17 = jIAuthTabCallbackDefault;
            i4 = 6;
            jOnTransact = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onTransact();
        } else {
            j17 = jIAuthTabCallbackDefault;
            i4 = 6;
            jOnTransact = j7;
        }
        long jLongValue = (i3 & 128) != 0 ? ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue() : j8;
        if ((i3 & 256) != 0) {
            j18 = jLongValue;
            jAudioAttributesImplBaseParcelizer2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            j18 = jLongValue;
            jAudioAttributesImplBaseParcelizer2 = j9;
        }
        if ((i3 & 512) != 0) {
            j19 = jAudioAttributesImplBaseParcelizer2;
            i5 = 6;
            jAudioAttributesImplBaseParcelizer3 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            j19 = jAudioAttributesImplBaseParcelizer2;
            i5 = 6;
            jAudioAttributesImplBaseParcelizer3 = j10;
        }
        long jWrite = (i3 & 1024) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).write() : j11;
        long jOnExtraCallback2 = (i3 & 2048) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j12;
        long jMediaMetadataCompat = (i3 & 4096) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).MediaMetadataCompat() : j13;
        long jRatingCompat1 = (i3 & 8192) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).RatingCompat1() : j14;
        long jWrite2 = (i3 & 16384) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).write() : j15;
        long jMediaMetadataCompat2 = (i3 & 32768) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).MediaMetadataCompat() : j16;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1834603922, i, i2, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.heroColors (TextFields.kt:906)");
        }
        int i14 = i << 3;
        int i15 = i2 << 3;
        setCacheComposition.onNavigationEvent onnavigationevent = (setCacheComposition.onNavigationEvent) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 481627402, new Object[]{this, Long.valueOf(jAudioAttributesImplBaseParcelizer), Long.valueOf(jOnExtraCallback), Long.valueOf(setByteOrder.Companion.IAuthTabCallbackDefault()), Long.valueOf(jWarmup), Long.valueOf(jAsInterface), Long.valueOf(jIAuthTabCallbackStub), Long.valueOf(j17), Long.valueOf(jOnTransact), Long.valueOf(j18), Long.valueOf(j19), Long.valueOf(jAudioAttributesImplBaseParcelizer3), Long.valueOf(jWrite), Long.valueOf(jOnExtraCallback2), Long.valueOf(jMediaMetadataCompat), Long.valueOf(jRatingCompat1), Long.valueOf(jWrite2), Long.valueOf(jMediaMetadataCompat2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i14 & 1879048192) | (i & 14) | 384 | (i & 112) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024)), Integer.valueOf(((i >> 27) & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128)), 0}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -481627399, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i16 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
        }
        return onnavigationevent;
    }

    public final setCacheComposition.onNavigationEvent onExtraCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        long jAudioAttributesImplBaseParcelizer;
        long jOnExtraCallback;
        long jAudioAttributesImplBaseParcelizer2;
        int i4;
        long jMediaMetadataCompat;
        int i5 = 2 % 2;
        int i6 = 6;
        if ((i3 & 1) != 0) {
            int i7 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            jAudioAttributesImplBaseParcelizer = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            jAudioAttributesImplBaseParcelizer = j;
        }
        if ((i3 & 2) != 0) {
            int i9 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            jOnExtraCallback = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback();
            int i11 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            jOnExtraCallback = j2;
        }
        long jWarmup = (i3 & 4) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).warmup() : j3;
        long jAsInterface = (i3 & 8) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().asInterface() : j4;
        long jIAuthTabCallbackStub = (i3 & 16) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub() : j5;
        long jIAuthTabCallbackStub2 = (i3 & 32) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub() : j6;
        long jOnTransact = (i3 & 64) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onTransact() : j7;
        long jLongValue = (i3 & 128) != 0 ? ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue() : j8;
        if ((i3 & 256) != 0) {
            int i13 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                jAudioAttributesImplBaseParcelizer2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 53).AudioAttributesImplBaseParcelizer();
                i6 = 6;
            } else {
                i6 = 6;
                jAudioAttributesImplBaseParcelizer2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
            }
        } else {
            jAudioAttributesImplBaseParcelizer2 = j9;
        }
        long jAudioAttributesImplBaseParcelizer3 = (i3 & 512) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i6).AudioAttributesImplBaseParcelizer() : j10;
        long jWrite = (i3 & 1024) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i6).write() : j11;
        long jOnExtraCallback2 = (i3 & 2048) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j12;
        if ((i3 & 4096) != 0) {
            int i14 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 == 0) {
                jMediaMetadataCompat = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 73).MediaMetadataCompat();
                i4 = 6;
            } else {
                i4 = 6;
                jMediaMetadataCompat = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
            }
        } else {
            i4 = 6;
            jMediaMetadataCompat = j13;
        }
        long jRatingCompat1 = (i3 & 8192) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).RatingCompat1() : j14;
        long jWrite2 = (i3 & 16384) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).write() : j15;
        long jMediaMetadataCompat2 = (i3 & 32768) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).MediaMetadataCompat() : j16;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i15 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-318886268, i, i2, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.lineBigColors (TextFields.kt:944)");
        }
        int i17 = i << 3;
        int i18 = i2 << 3;
        setCacheComposition.onNavigationEvent onnavigationevent = (setCacheComposition.onNavigationEvent) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 481627402, new Object[]{this, Long.valueOf(jAudioAttributesImplBaseParcelizer), Long.valueOf(jOnExtraCallback), Long.valueOf(setByteOrder.Companion.IAuthTabCallbackDefault()), Long.valueOf(jWarmup), Long.valueOf(jAsInterface), Long.valueOf(jIAuthTabCallbackStub), Long.valueOf(jIAuthTabCallbackStub2), Long.valueOf(jOnTransact), Long.valueOf(jLongValue), Long.valueOf(jAudioAttributesImplBaseParcelizer2), Long.valueOf(jAudioAttributesImplBaseParcelizer3), Long.valueOf(jWrite), Long.valueOf(jOnExtraCallback2), Long.valueOf(jMediaMetadataCompat), Long.valueOf(jRatingCompat1), Long.valueOf(jWrite2), Long.valueOf(jMediaMetadataCompat2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i17 & 1879048192) | (i & 14) | 384 | (i & 112) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024)), Integer.valueOf(((i >> 27) & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128)), 0}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -481627399, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i19 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i21 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i21 % 128;
            int i22 = i21 % 2;
        }
        return onnavigationevent;
    }

    public final setCacheComposition.onNavigationEvent onWarmupCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        long jWarmup;
        long jAsInterface;
        long jIAuthTabCallbackStub;
        long j17;
        long jLongValue;
        long j18;
        long jAudioAttributesImplBaseParcelizer;
        long j19;
        long jAudioAttributesImplBaseParcelizer2;
        long j20;
        int i4;
        long jWrite;
        long j21;
        int i5;
        long jRatingCompat1;
        long jMediaMetadataCompat;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        int i6;
        int i7 = 2 % 2;
        int i8 = 6;
        long jAudioAttributesImplBaseParcelizer3 = (i3 & 1) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer() : j;
        long jOnExtraCallback = (i3 & 2) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j2;
        if ((i3 & 4) != 0) {
            int i9 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            jWarmup = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).warmup();
        } else {
            jWarmup = j3;
        }
        if ((i3 & 8) != 0) {
            jAsInterface = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().asInterface();
            int i11 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            jAsInterface = j4;
        }
        long jIAuthTabCallbackStub2 = (i3 & 16) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub() : j5;
        if ((i3 & 32) != 0) {
            int i13 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            i8 = 6;
            jIAuthTabCallbackStub = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub();
        } else {
            jIAuthTabCallbackStub = j6;
        }
        long jOnTransact = (i3 & 64) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i8).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onTransact() : j7;
        if ((i3 & 128) != 0) {
            int i15 = IAuthTabCallback + 121;
            j17 = jOnTransact;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            jLongValue = ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
        } else {
            j17 = jOnTransact;
            jLongValue = j8;
        }
        if ((i3 & 256) != 0) {
            j18 = jLongValue;
            jAudioAttributesImplBaseParcelizer = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            j18 = jLongValue;
            jAudioAttributesImplBaseParcelizer = j9;
        }
        if ((i3 & 512) != 0) {
            j19 = jAudioAttributesImplBaseParcelizer;
            jAudioAttributesImplBaseParcelizer2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            j19 = jAudioAttributesImplBaseParcelizer;
            jAudioAttributesImplBaseParcelizer2 = j10;
        }
        if ((i3 & 1024) != 0) {
            int i17 = IAuthTabCallback + 125;
            j20 = jAudioAttributesImplBaseParcelizer2;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 == 0) {
                jWrite = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 67).write();
                i4 = 6;
            } else {
                i4 = 6;
                jWrite = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).write();
            }
        } else {
            j20 = jAudioAttributesImplBaseParcelizer2;
            i4 = 6;
            jWrite = j11;
        }
        long jOnExtraCallback2 = (i3 & 2048) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j12;
        long jMediaMetadataCompat2 = (i3 & 4096) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).MediaMetadataCompat() : j13;
        if ((i3 & 8192) != 0) {
            int i18 = onExtraCallbackWithResult + 45;
            j21 = jMediaMetadataCompat2;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            i5 = 6;
            jRatingCompat1 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).RatingCompat1();
        } else {
            j21 = jMediaMetadataCompat2;
            i5 = 6;
            jRatingCompat1 = j14;
        }
        long jWrite2 = (i3 & 16384) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).write() : j15;
        if ((i3 & 32768) != 0) {
            int i20 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i20 % 128;
            if (i20 % 2 == 0) {
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                i6 = 83;
            } else {
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                i6 = 6;
            }
            jMediaMetadataCompat = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i6).MediaMetadataCompat();
        } else {
            jMediaMetadataCompat = j16;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1809928424, i, i2, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.lineColors (TextFields.kt:982)");
            int i21 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = i << 3;
        int i24 = i2 << 3;
        Object[] objArr = {this, Long.valueOf(jAudioAttributesImplBaseParcelizer3), Long.valueOf(jOnExtraCallback), Long.valueOf(setByteOrder.Companion.IAuthTabCallbackDefault()), Long.valueOf(jWarmup), Long.valueOf(jAsInterface), Long.valueOf(jIAuthTabCallbackStub2), Long.valueOf(jIAuthTabCallbackStub), Long.valueOf(j17), Long.valueOf(j18), Long.valueOf(j19), Long.valueOf(j20), Long.valueOf(jWrite), Long.valueOf(jOnExtraCallback2), Long.valueOf(j21), Long.valueOf(jRatingCompat1), Long.valueOf(jWrite2), Long.valueOf(jMediaMetadataCompat), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i23 & 7168) | (i & 14) | 384 | (i & 112) | (i23 & 57344) | (i23 & 458752) | (i23 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192)), Integer.valueOf(((i >> 27) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128)), 0};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        setCacheComposition.onNavigationEvent onnavigationevent = (setCacheComposition.onNavigationEvent) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 481627402, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -481627399, iOnWarmupCompleted);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i25 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 92 / 0;
        }
        return onnavigationevent;
    }

    public final setCacheComposition.onNavigationEvent IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        long jWarmup;
        long jOnWarmupCompleted;
        long j19;
        int i4;
        long jAudioAttributesImplBaseParcelizer;
        long j20;
        long jMediaMetadataCompat;
        long j21;
        int i5;
        long jRatingCompat1;
        long j22;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        int i6;
        int i7 = 2 % 2;
        int i8 = 6;
        long jAudioAttributesImplBaseParcelizer2 = (i3 & 1) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer() : j;
        long jOnExtraCallback = (i3 & 2) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j2;
        long jOnMessageChannelReady = (i3 & 4) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onMessageChannelReady() : j3;
        long jMayLaunchUrl = (i3 & 8) != 0 ? MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().mayLaunchUrl() : j4;
        if ((i3 & 16) != 0) {
            int i9 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            jWarmup = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).warmup();
        } else {
            jWarmup = j5;
        }
        long jOnNavigationEvent = (i3 & 32) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onNavigationEvent() : j6;
        long jIAuthTabCallbackDefault = (i3 & 64) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j7;
        if ((i3 & 128) != 0) {
            int i11 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            i8 = 6;
            jOnWarmupCompleted = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j8;
        }
        long jIAuthTabCallback = (i3 & 256) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i8).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().IAuthTabCallback() : j9;
        long jLongValue = (i3 & 512) != 0 ? ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i8)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue() : j10;
        if ((i3 & 1024) != 0) {
            int i13 = IAuthTabCallback + 45;
            j19 = jLongValue;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            i4 = 6;
            jAudioAttributesImplBaseParcelizer = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
        } else {
            j19 = jLongValue;
            i4 = 6;
            jAudioAttributesImplBaseParcelizer = j11;
        }
        long jAudioAttributesImplBaseParcelizer3 = (i3 & 2048) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).AudioAttributesImplBaseParcelizer() : j12;
        long jWrite = (i3 & 4096) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).write() : j13;
        long jOnExtraCallback2 = (i3 & 8192) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).IAuthTabCallbackDefault().ICustomTabsCallbackDefault().onExtraCallback() : j14;
        if ((i3 & 16384) != 0) {
            int i15 = IAuthTabCallback + 9;
            j20 = jOnExtraCallback2;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                i6 = 88;
            } else {
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                i6 = 6;
            }
            jMediaMetadataCompat = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i6).MediaMetadataCompat();
        } else {
            j20 = jOnExtraCallback2;
            jMediaMetadataCompat = j15;
        }
        if ((32768 & i3) != 0) {
            int i16 = IAuthTabCallback + 67;
            j21 = jMediaMetadataCompat;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 == 0) {
                jRatingCompat1 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 99).RatingCompat1();
                i5 = 6;
            } else {
                i5 = 6;
                jRatingCompat1 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).RatingCompat1();
            }
        } else {
            j21 = jMediaMetadataCompat;
            i5 = 6;
            jRatingCompat1 = j16;
        }
        long jWrite2 = (65536 & i3) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).write() : j17;
        long jMediaMetadataCompat2 = (i3 & 131072) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i5).MediaMetadataCompat() : j18;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            j22 = jMediaMetadataCompat2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-142488303, i, i2, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.boxColors (TextFields.kt:1022)");
            int i17 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
        } else {
            j22 = jMediaMetadataCompat2;
        }
        setCacheComposition.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(jAudioAttributesImplBaseParcelizer2, jOnExtraCallback, jOnMessageChannelReady, jMayLaunchUrl, jWarmup, jOnNavigationEvent, jIAuthTabCallbackDefault, jOnWarmupCompleted, jIAuthTabCallback, j19, jAudioAttributesImplBaseParcelizer, jAudioAttributesImplBaseParcelizer3, jWrite, j20, j21, jRatingCompat1, jWrite2, j22);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return onnavigationeventOnExtraCallbackWithResult;
    }

    private final setCacheComposition.onNavigationEvent onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        int i = 2 % 2;
        setApplyingShadowToLayersEnabled setapplyingshadowtolayersenabled = new setApplyingShadowToLayersEnabled(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, null);
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return setapplyingshadowtolayersenabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List onNavigationEvent(Rally rally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            deprecated_socketFactory.onWarmupCompleted.onNavigationEvent(deprecated_proxySelector.SMALL, certificatePinner.X).onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rally, "");
        List listOnNavigationEvent = deprecated_socketFactory.onWarmupCompleted.onNavigationEvent(deprecated_proxySelector.SMALL, certificatePinner.X).onNavigationEvent();
        int i3 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return listOnNavigationEvent;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setAnimationFromUrl $inputState;
        final /* synthetic */ Context $localContext;
        final /* synthetic */ Rally $wiggleRally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(setAnimationFromUrl setanimationfromurl, Rally rally, Context context, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$inputState = setanimationfromurl;
            this.$wiggleRally = rally;
            this.$localContext = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$inputState, this.$wiggleRally, this.$localContext, access13800Var);
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 77;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (this.$inputState.onExtraCallbackWithResult()) {
                int i7 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 49 / 0;
                    if (!this.$wiggleRally.postMessage()) {
                        this.$wiggleRally.receiveFile();
                        minFresh.onNavigationEvent(this.$localContext, noStore.Companion.onWarmupCompleted());
                    }
                } else if (!this.$wiggleRally.postMessage()) {
                }
            }
            Unit unit = Unit.INSTANCE;
            int i9 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }
    }

    public static final class onWarmupCompleted implements getCurrentBacktraceCount<Float, setByteOrder, setByteOrder, Float, Float, getSwitchMinWidth<setAnimationFromUrl>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int ICustomTabsCallbackDefault = 0;
        private static int ICustomTabsService = 1;
        final /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> IAuthTabCallbackDefault;
        final /* synthetic */ getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub;
        final /* synthetic */ Function1<selectParentResolutions, Unit> IAuthTabCallbackStubProxy;
        final /* synthetic */ getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel;
        final /* synthetic */ setCacheComposition.onExtraCallbackWithResult ICustomTabsCallback;
        final /* synthetic */ Rally ICustomTabsCallbackStub;
        final /* synthetic */ setCacheComposition.onTransact ICustomTabsCallbackStubProxy;
        final /* synthetic */ Function0<Unit> access000;
        final /* synthetic */ QuirkSettingsLoader access100;
        final /* synthetic */ setAnimationFromUrl asBinder;
        final /* synthetic */ boolean asInterface;
        final /* synthetic */ setCacheComposition.IAuthTabCallbackDefault extraCallback;
        final /* synthetic */ QuirksExternalSyntheticBackport0 extraCallbackWithResult;
        final /* synthetic */ getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onActivityLayout;
        final /* synthetic */ getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized;
        final /* synthetic */ getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
        final /* synthetic */ AppLovinAdClickListener onExtraCallbackWithResult;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onMessageChannelReady;
        final /* synthetic */ int onMinimized;
        final /* synthetic */ setCacheComposition.onNavigationEvent onNavigationEvent;
        final /* synthetic */ setCacheComposition.IAuthTabCallbackStub onPostMessage;
        final /* synthetic */ boolean onRelationshipValidationResult;
        final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 onTransact;
        final /* synthetic */ selectParentResolutions onUnminimized;
        final /* synthetic */ Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> readTypedObject;
        final /* synthetic */ getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;

        onWarmupCompleted(setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onNavigationEvent onnavigationevent, AppLovinAdClickListener appLovinAdClickListener, setAnimationFromUrl setanimationfromurl, Rally rally, Function0<Unit> function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onTransact ontransact, CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, QuirkSettingsLoader quirkSettingsLoader, selectParentResolutions selectparentresolutions, int i, CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda62, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda64, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, boolean z2, Function1<? super selectParentResolutions, Unit> function1, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6) {
            this.onPostMessage = iAuthTabCallbackStub;
            this.onNavigationEvent = onnavigationevent;
            this.onExtraCallbackWithResult = appLovinAdClickListener;
            this.asBinder = setanimationfromurl;
            this.ICustomTabsCallbackStub = rally;
            this.access000 = function0;
            this.onTransact = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            this.IAuthTabCallbackStub = getbacktracenote;
            this.onRelationshipValidationResult = z;
            this.IAuthTabCallback = quirksExternalSyntheticBackport0;
            this.ICustomTabsCallbackStubProxy = ontransact;
            this.IAuthTabCallbackDefault = cameraPresenceProviderExternalSyntheticLambda6;
            this.IAuthTabCallback_Parcel = getbacktracenote2;
            this.access100 = quirkSettingsLoader;
            this.onUnminimized = selectparentresolutions;
            this.onMinimized = i;
            this.onActivityLayout = cameraPresenceProviderExternalSyntheticLambda62;
            this.getInterfaceDescriptor = getbacktracenote3;
            this.writeTypedObject = getbacktracenote4;
            this.ICustomTabsCallback = onextracallbackwithresult;
            this.extraCallbackWithResult = quirksExternalSyntheticBackport02;
            this.onWarmupCompleted = function2;
            this.extraCallback = iAuthTabCallbackDefault;
            this.readTypedObject = cameraPresenceProviderExternalSyntheticLambda63;
            this.onMessageChannelReady = cameraPresenceProviderExternalSyntheticLambda64;
            this.onActivityResized = getbacktracenote5;
            this.asInterface = z2;
            this.IAuthTabCallbackStubProxy = function1;
            this.onExtraCallback = getbacktracenote6;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 35;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            if (i3 == 0) {
                int i4 = 22 / 0;
            }
            int i5 = ICustomTabsCallbackDefault + 51;
            ICustomTabsService = i5 % 128;
            if (i5 % 2 != 0) {
                return unitOnWarmupCompleted;
            }
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsCallbackDefault + 111;
            ICustomTabsService = i3 % 128;
            int i4 = i3 % 2;
            Unit unitAsInterface = asInterface(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = ICustomTabsService + 57;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return unitAsInterface;
        }

        public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, boolean z, selectParentResolutions selectparentresolutions, flipHorizontally fliphorizontally) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 123;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutions, z, selectparentresolutions, fliphorizontally);
            int i4 = ICustomTabsCallbackDefault + 97;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ removeObserverLocked IAuthTabCallback(AppLovinAdClickListener appLovinAdClickListener, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 95;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(appLovinAdClickListener, j, sessionProcessorCaptureCallback);
                throw null;
            }
            removeObserverLocked removeobserverlockedOnWarmupCompleted = onWarmupCompleted(appLovinAdClickListener, j, sessionProcessorCaptureCallback);
            int i3 = ICustomTabsCallbackDefault + 63;
            ICustomTabsService = i3 % 128;
            if (i3 % 2 != 0) {
                return removeobserverlockedOnWarmupCompleted;
            }
            throw null;
        }

        private static final boolean IAuthTabCallback(getBacktraceNote getbacktracenote) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 93;
            int i3 = i2 % 128;
            ICustomTabsCallbackDefault = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (getbacktracenote != null) {
                return true;
            }
            int i4 = i3 + 17;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public static /* synthetic */ float onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 29;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {Float.valueOf(f)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            if (i3 == 0) {
                return ((Float) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 624681434, -624681430, iOnExtraCallback)).floatValue();
            }
            float fFloatValue = ((Float) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 624681434, -624681430, iOnExtraCallback)).floatValue();
            int i4 = 66 / 0;
            return fFloatValue;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
            RowScope rowScope = (RowScope) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i = 2 % 2;
            int i2 = ICustomTabsService + 113;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = ICustomTabsCallbackDefault + 99;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallbackDefault;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsCallbackDefault + 95;
            ICustomTabsService = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {getbacktracenote, iAuthTabCallbackStub, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            if (i4 != 0) {
                return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1424144230, -1424144230, iOnExtraCallback);
            }
            int i5 = 23 / 0;
            return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1424144230, -1424144230, iOnExtraCallback);
        }

        public static /* synthetic */ Unit onExtraCallback(boolean z, float f, flipHorizontally fliphorizontally) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 73;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(f);
            if (i3 == 0) {
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            Unit unit = (Unit) onNavigationEvent(new Object[]{boolValueOf, fValueOf, fliphorizontally}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 496868478, -496868475, iOnExtraCallback2);
            int i4 = ICustomTabsService + 45;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ boolean onExtraCallback(getBacktraceNote getbacktracenote) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 41;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(getbacktracenote);
            int i4 = ICustomTabsService + 79;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return zIAuthTabCallback;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
            RowScope rowScope = (RowScope) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 21;
            ICustomTabsService = i2 % 128;
            if (i2 % 2 != 0) {
                return asBinder(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            asBinder(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(float f, float f2, float f3, float f4, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, float f5, float f6, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f7, flipHorizontally fliphorizontally) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 41;
            ICustomTabsService = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(f, f2, f3, f4, iAuthTabCallbackStub, f5, f6, getsupportedhighspeedresolutions, f7, fliphorizontally);
            }
            onWarmupCompleted(f, f2, f3, f4, iAuthTabCallbackStub, f5, f6, getsupportedhighspeedresolutions, f7, fliphorizontally);
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinAdClickListener appLovinAdClickListener, long j, setIso setiso) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 35;
            ICustomTabsService = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(appLovinAdClickListener, j, setiso);
            }
            onExtraCallback(appLovinAdClickListener, j, setiso);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsCallbackDefault + 53;
            ICustomTabsService = i3 % 128;
            int i4 = i3 % 2;
            Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = ICustomTabsService + 83;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return unitIAuthTabCallbackStub;
        }

        public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~((~i5) | i4);
            int i8 = ~i6;
            int i9 = i7 | (~(i8 | i4));
            int i10 = ~i4;
            int i11 = ~(i10 | i8);
            int i12 = ~(i10 | i5);
            int i13 = (~(i8 | i5)) | i11 | i12;
            int i14 = (~(i6 | i10)) | i12;
            int i15 = i5 + i4 + i3 + (1039959776 * i) + ((-2046201414) * i2);
            int i16 = i15 * i15;
            int i17 = ((357140864 * i5) - 8388608) + ((-1785926397) * i4) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i3) + ((-201326592) * i) + ((-406847488) * i2) + (529399808 * i16);
            int i18 = ((i5 * 868240256) - 1765242424) + (i4 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i3 * 868239597) + (i * 817356128) + (i2 * 406493490) + (i16 * 645267456);
            switch (i17 + (i18 * i18 * 681705472)) {
                case 1:
                    return onExtraCallback(objArr);
                case 2:
                    return IAuthTabCallback(objArr);
                case 3:
                    boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                    float fFloatValue = ((Number) objArr[1]).floatValue();
                    flipHorizontally fliphorizontally = (flipHorizontally) objArr[2];
                    int i19 = 2 % 2;
                    int i20 = ICustomTabsService + 13;
                    ICustomTabsCallbackDefault = i20 % 128;
                    int i21 = i20 % 2;
                    Intrinsics.checkNotNullParameter(fliphorizontally, "");
                    if (!(!zBooleanValue)) {
                        int i22 = ICustomTabsService + 79;
                        ICustomTabsCallbackDefault = i22 % 128;
                        int i23 = i22 % 2;
                        fFloatValue = 0.0f;
                    }
                    fliphorizontally.IAuthTabCallbackStub(fFloatValue);
                    return Unit.INSTANCE;
                case 4:
                    return onWarmupCompleted(objArr);
                case 5:
                    return onExtraCallbackWithResult(objArr);
                case 6:
                    return onTransact(objArr);
                default:
                    return onNavigationEvent(objArr);
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(Function1 function1, selectParentResolutions selectparentresolutions, String str) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 41;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(function1, selectparentresolutions, str);
            }
            onExtraCallbackWithResult(function1, selectparentresolutions, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsCallbackDefault + 101;
            ICustomTabsService = i3 % 128;
            if (i3 % 2 == 0) {
                onTransact(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnTransact = onTransact(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i4 = ICustomTabsService + 25;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unitOnTransact;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            float fFloatValue = ((Number) objArr[0]).floatValue();
            int i = 2 % 2;
            int i2 = ICustomTabsService + 23;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return Float.valueOf(fFloatValue);
            }
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 109;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback(getsupportedhighspeedresolutions, extensionsManager1);
            }
            onExtraCallback(getsupportedhighspeedresolutions, extensionsManager1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 9;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(((Number) obj).floatValue(), ((setByteOrder) obj2).access100(), ((setByteOrder) obj3).access100(), ((Number) obj4).floatValue(), ((Number) obj5).floatValue(), (getSwitchMinWidth) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Number) obj8).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ICustomTabsCallbackDefault + 87;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v38 ??, still in use, count: 1, list:
              (r12v38 ?? I:java.lang.Object) from 0x1059: INVOKE (r15v15 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r12v38 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:2608)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final void onWarmupCompleted(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v38 ??, still in use, count: 1, list:
              (r12v38 ?? I:java.lang.Object) from 0x1059: INVOKE (r15v15 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r12v38 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:2608)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r120v0 ??
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
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
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

        private static final removeObserverLocked onWarmupCompleted(final AppLovinAdClickListener appLovinAdClickListener, final long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
            removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3Defaults$DecorationBox$2$$ExternalSyntheticLambda15
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    AppLovinAdClickListener appLovinAdClickListener2 = appLovinAdClickListener;
                    if (i4 == 0) {
                        return setClipToCompositionBounds.onWarmupCompleted.onExtraCallbackWithResult(appLovinAdClickListener2, j, (setIso) obj);
                    }
                    Unit unitOnExtraCallbackWithResult = setClipToCompositionBounds.onWarmupCompleted.onExtraCallbackWithResult(appLovinAdClickListener2, j, (setIso) obj);
                    int i5 = 80 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
            int i2 = ICustomTabsService + 113;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return removeobserverlockedIAuthTabCallback;
        }

        private static final Unit onExtraCallback(AppLovinAdClickListener appLovinAdClickListener, long j, setIso setiso) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            rotate rotateVarIAuthTabCallback = appLovinAdClickListener.IAuthTabCallback(setiso.onTransact(), setiso.onExtraCallbackWithResult(), setiso);
            removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
            setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, rotateVarIAuthTabCallback);
            setOrientationDegrees.onExtraCallback(setiso, removetimestampOnWarmupCompleted, new createString(j, (DefaultConstructorMarker) null), 0.0f, new ExifOutputStream(setiso.onExtraCallback(AppLovinAdLoadListener.onExtraCallbackWithResult.onNavigationEvent()), 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i2 = ICustomTabsCallbackDefault + 35;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }

        static final class onNavigationEvent implements Function0<setByteOrder> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ float IAuthTabCallback;
            final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallback;

            onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6, float f) {
                this.onExtraCallback = cameraPresenceProviderExternalSyntheticLambda6;
                this.IAuthTabCallback = f;
            }

            public /* synthetic */ Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return setByteOrder.onNavigationEvent(onWarmupCompleted());
                }
                setByteOrder.onNavigationEvent(onWarmupCompleted());
                throw null;
            }

            public final long onWarmupCompleted() {
                long jAccess100;
                float fCoerceIn;
                float f;
                float f2;
                float f3;
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    jAccess100 = ((setByteOrder) this.onExtraCallback.onExtraCallbackWithResult()).access100();
                    fCoerceIn = RangesKt.coerceIn(this.IAuthTabCallback, 1.0f, 1.0f);
                    f = 2.0f;
                    f2 = 1.0f;
                    f3 = 1.0f;
                    i = 2;
                } else {
                    jAccess100 = ((setByteOrder) this.onExtraCallback.onExtraCallbackWithResult()).access100();
                    fCoerceIn = RangesKt.coerceIn(this.IAuthTabCallback, 0.0f, 1.0f);
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    i = 14;
                }
                long jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jAccess100, fCoerceIn, f, f2, f3, i, (Object) null);
                int i4 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return jOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onTransact(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = ICustomTabsService;
            int i4 = i3 + 69;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 3) {
                z = false;
            } else {
                int i5 = i3 + 95;
                ICustomTabsCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                int i6 = ICustomTabsCallbackDefault + 69;
                ICustomTabsService = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(842653336, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1267)");
                }
                getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, boolean z, selectParentResolutions selectparentresolutions, flipHorizontally fliphorizontally) {
            float f;
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 87;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallback_Parcel(getsupportedhighspeedresolutions.onNavigationEvent());
            if (!(!z)) {
                f = 0.0f;
            } else {
                int i4 = ICustomTabsCallbackDefault + 125;
                ICustomTabsService = i4 % 128;
                int i5 = i4 % 2;
                if (selectparentresolutions.onNavigationEvent().length() <= 0) {
                    int i6 = ICustomTabsService + 93;
                    ICustomTabsCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    f = 1.0f;
                }
            }
            fliphorizontally.IAuthTabCallbackStub(f);
            Unit unit = Unit.INSTANCE;
            int i8 = ICustomTabsService + 79;
            ICustomTabsCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 53 / 0;
            }
            return unit;
        }

        private static final Unit asBinder(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsCallbackDefault + 65;
            ICustomTabsService = i3 % 128;
            int i4 = i3 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 3) == 2), i & 1))) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = ICustomTabsCallbackDefault + 3;
                    ICustomTabsService = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-181460334, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1304)");
                }
                getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = ICustomTabsCallbackDefault + 121;
                    ICustomTabsService = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i8 = 21 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
            int i = 2 % 2;
            int i2 = ICustomTabsService + 25;
            ICustomTabsCallbackDefault = i2 % 128;
            getsupportedhighspeedresolutions.onNavigationEvent((int) (i2 % 2 != 0 ? extensionsManager1.onExtraCallbackWithResult() >> 25 : extensionsManager1.onExtraCallbackWithResult() >> 32));
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsService + 89;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        private static final Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsCallbackDefault + 85;
            ICustomTabsService = i3 % 128;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
                int i4 = ICustomTabsCallbackDefault + 87;
                ICustomTabsService = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = ICustomTabsCallbackDefault + 27;
                    ICustomTabsService = i5 % 128;
                    if (i5 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1605588292, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1318)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1605588292, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1318)");
                }
                getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit asInterface(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            if ((i & 3) != 2) {
                int i3 = ICustomTabsCallbackDefault + 115;
                ICustomTabsService = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = ICustomTabsCallbackDefault + 97;
                    ICustomTabsService = i5 % 128;
                    if (i5 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1780518894, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1341)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1780518894, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1341)");
                }
                getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = ICustomTabsCallbackDefault + 105;
                    ICustomTabsService = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i = 2 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1))) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1431492403, iIntValue, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1364)");
                }
                if (getbacktracenote == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-859838655);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-859838654);
                    if (!(iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onWarmupCompleted)) {
                        int i2 = ICustomTabsService + 85;
                        ICustomTabsCallbackDefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            boolean z = iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onExtraCallbackWithResult;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        float f = iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onExtraCallbackWithResult ? 4.0f : 0.0f;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 7, (Object) null);
                        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            int i3 = ICustomTabsCallbackDefault + 57;
                            ICustomTabsService = i3 % 128;
                            if (i3 % 2 == 0) {
                                getAwbState.onExtraCallback();
                                int i4 = 83 / 0;
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        getbacktracenote.invoke(RowScopeInstance.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = ICustomTabsCallbackDefault + 45;
                    ICustomTabsService = i5 % 128;
                    if (i5 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i6 = 84 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                int i7 = ICustomTabsService + 97;
                ICustomTabsCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallbackWithResult(Function1 function1, selectParentResolutions selectparentresolutions, String str) {
            selectParentResolutions selectparentresolutionsOnExtraCallback;
            int i = 2 % 2;
            int i2 = ICustomTabsService + 25;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(selectparentresolutions, str, 0L, (getNumberOfTargets) null, 21, (Object) null);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(selectparentresolutions, str, 0L, (getNumberOfTargets) null, 6, (Object) null);
            }
            function1.invoke(selectparentresolutionsOnExtraCallback);
            return Unit.INSTANCE;
        }

        private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsService + 105;
            ICustomTabsCallbackDefault = i3 % 128;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
                int i4 = ICustomTabsCallbackDefault + 15;
                ICustomTabsService = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-822041609, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1449)");
                }
                if (getbacktracenote == null) {
                    int i5 = ICustomTabsService + 105;
                    ICustomTabsCallbackDefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(461999906);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i6 = 82 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(461999906);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(461999907);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 8, (Object) null);
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i7 = ICustomTabsService + 49;
                        ICustomTabsCallbackDefault = i7 % 128;
                        if (i7 % 2 != 0) {
                            getAwbState.onExtraCallback();
                            int i8 = 27 / 0;
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    getbacktracenote.invoke(RowScopeInstance.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                int i9 = ICustomTabsCallbackDefault + 57;
                ICustomTabsService = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }

        private static final Unit onWarmupCompleted(float f, float f2, float f3, float f4, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, float f5, float f6, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f7, flipHorizontally fliphorizontally) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.asInterface(getDoubleValue.IAuthTabCallback(0.0f, 0.0f));
            fliphorizontally.access000((f + f2 + f3) * f4);
            if (iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent) {
                int i2 = ICustomTabsService + 77;
                int i3 = i2 % 128;
                ICustomTabsCallbackDefault = i3;
                f6 = i2 % 2 != 0 ? f5 + f4 : f5 * f4;
                int i4 = i3 + 33;
                ICustomTabsService = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                }
            }
            fliphorizontally.IAuthTabCallback_Parcel(f6 + (getsupportedhighspeedresolutions.onNavigationEvent() * f4));
            fliphorizontally.IAuthTabCallbackStubProxy(f7);
            fliphorizontally.getInterfaceDescriptor(f7);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallbackDefault(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = ICustomTabsService + 69;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
                int i5 = ICustomTabsCallbackDefault + 111;
                ICustomTabsService = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 13 / 0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(198513152, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:1531)");
                    }
                    getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object onTransact(Object[] objArr) {
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
            int i = 2 % 2;
            int i2 = ICustomTabsService + 99;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
            int i4 = ICustomTabsCallbackDefault + 55;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }

        private static final getHumanReadableName onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 55;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
            if (i3 != 0) {
                return gethumanreadablename;
            }
            throw null;
        }

        private static final GraphicDeviceInfo onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<GraphicDeviceInfo> cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallbackDefault + 85;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
            int i4 = ICustomTabsCallbackDefault + 79;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            return graphicDeviceInfo;
        }

        public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 491544759, -491544758, iOnExtraCallback);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1746714370, 1746714372, iOnExtraCallback);
        }

        public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 810024508, -810024503, iOnExtraCallback);
        }

        private static final float onWarmupCompleted(float f) {
            Object[] objArr = {Float.valueOf(f)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return ((Float) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 624681434, -624681430, iOnExtraCallback)).floatValue();
        }

        private static final Unit onWarmupCompleted(boolean z, float f, flipHorizontally fliphorizontally) {
            Object[] objArr = {Boolean.valueOf(z), Float.valueOf(f), fliphorizontally};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 496868478, -496868475, iOnExtraCallback);
        }

        private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {getbacktracenote, iAuthTabCallbackStub, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1424144230, -1424144230, iOnExtraCallback);
        }

        private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return ((Boolean) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -900752004, 900752010, iOnExtraCallback)).booleanValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull final setCacheComposition.onExtraCallback onextracallback, @Nullable final Function0<Unit> function0, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, final boolean z, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6, @Nullable final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull final setCacheComposition.onWarmupCompleted onwarmupcompleted, @NotNull final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, final int i, @NotNull final setAnimationFromUrl setanimationfromurl, @NotNull final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(setanimationfromurl, "");
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-138686398);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i11 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i2 & 384) == 0) {
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ^ true) ? 256 : 128;
        }
        int i13 = 1024;
        if ((i2 & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            int i14 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                int i16 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 22 / 0;
                }
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        if ((12582912 & i2) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
        }
        int i18 = 67108864;
        if ((100663296 & i2) == 0) {
            int i19 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 0 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 67108864 : 33554432;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3)) {
            }
            i4 |= i7;
        }
        if ((805306368 & i2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4)) {
                int i21 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 16 / 0;
                }
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i4 |= i6;
        }
        int i23 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackDefault) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal())) {
                int i24 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i24 % 128;
                i13 = i24 % 2 != 0 ? 29191 : 2048;
            }
            i5 |= i13;
        }
        if ((i3 & 24576) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            int i25 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i25 % 128;
            if (i25 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                throw null;
            }
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setanimationfromurl) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i26 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 52 / 0;
                }
            } else {
                i18 = 33554432;
            }
            i5 |= i18;
        }
        int i28 = i5;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i23) == 306783378 && (38347923 & i28) == 38347922) ? false : true, i23 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-138686398, i23, i28, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.DecorationBox (TextFields.kt:1104)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized = new AppLovinAdClickListener(AppLovinAdSize.onWarmupCompleted.onExtraCallback(), (DefaultConstructorMarker) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) objOnMinimized;
            setCacheComposition.onTransact ontransactOnExtraCallbackWithResult = iAuthTabCallbackStub.onExtraCallbackWithResult();
            setCacheComposition.onNavigationEvent onNavigationEvent2 = iAuthTabCallbackStub.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i23 >> 6) & 14);
            CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = ontransactOnExtraCallbackWithResult.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = ontransactOnExtraCallbackWithResult.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = ontransactOnExtraCallbackWithResult.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = ontransactOnExtraCallbackWithResult.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int i29 = i23 & 7168;
            boolean z3 = i29 == 2048;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z3) {
                int i30 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i30 % 128;
                int i31 = i30 % 2;
                if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                    if (onextracallback instanceof setCacheComposition.onExtraCallback.onWarmupCompleted) {
                        int i32 = onExtraCallbackWithResult + 79;
                        IAuthTabCallback = i32 % 128;
                        if (i32 % 2 != 0) {
                            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, ((setCacheComposition.onExtraCallback.onWarmupCompleted) onextracallback).onExtraCallbackWithResult());
                            throw null;
                        }
                        quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, ((setCacheComposition.onExtraCallback.onWarmupCompleted) onextracallback).onExtraCallbackWithResult());
                    } else {
                        if (!(onextracallback instanceof setCacheComposition.onExtraCallback.onExtraCallbackWithResult)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        quirksExternalSyntheticBackport0IAuthTabCallback = QuirksExternalSyntheticBackport0.Companion;
                    }
                    objOnMinimized2 = quirksExternalSyntheticBackport0IAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objOnMinimized2;
                if (onextracallback instanceof setCacheComposition.onExtraCallback.onWarmupCompleted) {
                    quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.IAuthTabCallback_Parcel();
                } else {
                    if (!(onextracallback instanceof setCacheComposition.onExtraCallback.onExtraCallbackWithResult)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                }
                QuirkSettingsLoader quirkSettingsLoader = quirkSettingsLoaderOnExtraCallback;
                boolean z4 = i29 == 2048;
                boolean z5 = (i23 & 896) == 256;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z5 || z4) || objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    if ((onextracallback instanceof setCacheComposition.onExtraCallback.onExtraCallbackWithResult) && (iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent)) {
                        z2 = true;
                        quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, AppLovinAdType.onExtraCallbackWithResult.asInterface(), 1, (Object) null);
                    } else {
                        z2 = true;
                        quirksExternalSyntheticBackport0OnNavigationEvent = QuirksExternalSyntheticBackport0.Companion;
                    }
                    objOnMinimized3 = quirksExternalSyntheticBackport0OnNavigationEvent;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                } else {
                    z2 = true;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objOnMinimized3;
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized4 = new Function1() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3Defaults$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i33 = 2 % 2;
                            int i34 = onWarmupCompleted + 53;
                            onExtraCallback = i34 % 128;
                            Rally rally = (Rally) obj;
                            if (i34 % 2 != 0) {
                                int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                                int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                                int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                            int iOnWarmupCompleted5 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                            int iOnWarmupCompleted6 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                            List list = (List) setClipToCompositionBounds.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1443052809, new Object[]{rally}, iOnWarmupCompleted6, iOnWarmupCompleted5, -1443052807, iOnWarmupCompleted4);
                            int i35 = onExtraCallback + 63;
                            onWarmupCompleted = i35 % 128;
                            int i36 = i35 % 2;
                            return list;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                Rally rally = (Rally) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 515399683, -515399667, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{0, null, 0, null, null, 0, null, null, null, null, null, null, null, null, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 24576, 16383}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
                boolean z6 = selectparentresolutions.onNavigationEvent().length() == 0 ? z2 : false;
                boolean zOnExtraCallbackWithResult = setanimationfromurl.onExtraCallbackWithResult();
                boolean z7 = (3670016 & i28) == 1048576 ? z2 : false;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rally);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z7 | zOnNavigationEvent | zOnExtraCallback) || objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized5 = new onExtraCallback(setanimationfromurl, rally, context, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zOnExtraCallbackWithResult), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                setApplyingOpacityToLayersEnabled.onExtraCallback.onWarmupCompleted(onwarmupcompleted, setanimationfromurl, z6, onNavigationEvent2, (getCurrentBacktraceCount<? super Float, ? super setByteOrder, ? super setByteOrder, ? super Float, ? super Float, ? super getSwitchMinWidth<setAnimationFromUrl>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1591700429, true, new onWarmupCompleted(iAuthTabCallbackStub, onNavigationEvent2, appLovinAdClickListener, setanimationfromurl, rally, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getbacktracenote, z, quirksExternalSyntheticBackport02, ontransactOnExtraCallbackWithResult, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult, getbacktracenote2, quirkSettingsLoader, selectparentresolutions, i, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, getbacktracenote5, getbacktracenote4, onextracallbackwithresult, quirksExternalSyntheticBackport0, function2, iAuthTabCallbackDefault, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent, getbacktracenote3, z6, function1, getbacktracenote6), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, ((i28 >> 9) & 14) | 221184 | ((i28 >> 15) & 112));
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3Defaults$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i33 = 2 % 2;
                    int i34 = onExtraCallback + 85;
                    onWarmupCompleted = i34 % 128;
                    int i35 = i34 % 2;
                    Unit unitOnWarmupCompleted = setClipToCompositionBounds.onWarmupCompleted(this.f$0, selectparentresolutions, function1, iAuthTabCallbackStub, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, i, setanimationfromurl, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i36 = onWarmupCompleted + 11;
                    onExtraCallback = i36 % 128;
                    int i37 = i36 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    public final setCacheComposition.onTransact onExtraCallbackWithResult(@Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable getHumanReadableName gethumanreadablename, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable getHumanReadableName gethumanreadablename2, @Nullable GraphicDeviceInfo graphicDeviceInfo3, @Nullable getHumanReadableName gethumanreadablename3, @Nullable GraphicDeviceInfo graphicDeviceInfo4, @Nullable getHumanReadableName gethumanreadablename4, @Nullable GraphicDeviceInfo graphicDeviceInfo5, @Nullable getHumanReadableName gethumanreadablename5, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        getHumanReadableName gethumanreadablename6;
        GraphicDeviceInfo graphicDeviceInfoAsBinder;
        getHumanReadableName gethumanreadablename7;
        GraphicDeviceInfo graphicDeviceInfoOnTransact;
        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i5 % 128;
        GraphicDeviceInfo graphicDeviceInfoOnTransact2 = (i5 % 2 == 0 && (i3 & 1) != 0) ? isRepeatingEnabled.onExtraCallback.onTransact() : graphicDeviceInfo;
        if ((i3 & 2) != 0) {
            gethumanreadablename6 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        } else {
            gethumanreadablename6 = gethumanreadablename;
        }
        if ((i3 & 4) != 0) {
            int i6 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            graphicDeviceInfoAsBinder = isRepeatingEnabled.onExtraCallback.asBinder();
        } else {
            graphicDeviceInfoAsBinder = graphicDeviceInfo2;
        }
        if ((i3 & 8) != 0) {
            gethumanreadablename7 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        } else {
            gethumanreadablename7 = gethumanreadablename2;
        }
        if ((i3 & 16) != 0) {
            graphicDeviceInfoOnTransact = isRepeatingEnabled.onExtraCallback.onTransact();
            int i8 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 2;
            }
        } else {
            graphicDeviceInfoOnTransact = graphicDeviceInfo3;
        }
        GraphicDeviceInfo graphicDeviceInfo6 = null;
        getHumanReadableName gethumanreadablename8 = (i3 & 32) != 0 ? null : gethumanreadablename3;
        GraphicDeviceInfo graphicDeviceInfoOnTransact3 = (i3 & 64) != 0 ? isRepeatingEnabled.onExtraCallback.onTransact() : graphicDeviceInfo4;
        getHumanReadableName gethumanreadablename9 = (i3 & 128) != 0 ? null : gethumanreadablename4;
        if ((i3 & 256) != 0) {
            int i10 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                graphicDeviceInfo6.hashCode();
                throw null;
            }
        } else {
            graphicDeviceInfo6 = graphicDeviceInfo5;
        }
        if ((i3 & 512) != 0) {
            gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
            int i11 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        } else {
            gethumanreadablenameIAuthTabCallback_Parcel = gethumanreadablename5;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1541741555, i, i2, "im.toss.compose.v3.textfield.TdsTextFieldV3Defaults.textStyles (TextFields.kt:1552)");
        }
        setAsyncUpdates setasyncupdates = new setAsyncUpdates(graphicDeviceInfoOnTransact2, gethumanreadablename6, graphicDeviceInfoAsBinder, gethumanreadablename7, graphicDeviceInfoOnTransact, gethumanreadablename8, graphicDeviceInfoOnTransact3, gethumanreadablename9, graphicDeviceInfo6, gethumanreadablenameIAuthTabCallback_Parcel);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setasyncupdates;
    }

    private static final getHumanReadableName IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return gethumanreadablename;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return gethumanreadablename;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getHumanReadableName IAuthTabCallbackStub(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return gethumanreadablename;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getHumanReadableName asBinder(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        int i5 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return gethumanreadablename;
    }

    public static /* synthetic */ List IAuthTabCallback(Rally rally) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (List) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1443052809, new Object[]{rally}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1443052807, iOnWarmupCompleted);
    }

    private static final getHumanReadableName IAuthTabCallbackDefault(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (getHumanReadableName) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 760463165, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnWarmupCompleted3, iOnWarmupCompleted2, -760463164, iOnWarmupCompleted);
    }

    public static final /* synthetic */ getHumanReadableName onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (getHumanReadableName) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2111696139, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnWarmupCompleted3, iOnWarmupCompleted2, -2111696139, iOnWarmupCompleted);
    }

    public final setCacheComposition.onNavigationEvent onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object[] objArr = {this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14), Long.valueOf(j15), Long.valueOf(j16), Long.valueOf(j17), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (setCacheComposition.onNavigationEvent) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 481627402, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, -481627399, iOnWarmupCompleted);
    }
}
