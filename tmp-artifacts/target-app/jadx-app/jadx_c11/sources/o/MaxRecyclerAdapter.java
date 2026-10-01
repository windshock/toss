package o;

import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.tds.compose.foundation.graphics.shadow.ShadowModifierKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.MaxRecyclerAdapter;
import o.SessionProcessorCaptureCallback;
import o.flipHorizontally;
import o.removeObserverLocked;
import o.removeTimestamp;
import o.rotate;
import o.setIso;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRecyclerAdapter {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i3;
        int i10 = (~(i9 | i2)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i2;
        int i13 = i10 | (~i12);
        int i14 = i7 | i3;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i3));
        int i17 = i2 + i3 + i6 + ((-1254723898) * i) + ((-1667789834) * i4);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i2) + 1379663872 + ((-481802647) * i3) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i6) + ((-1033371648) * i) + ((-106430464) * i4) + (1552875520 * i18);
        int i20 = ((i2 * (-402395399)) - 1316031342) + (i3 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i6 * (-402393527)) + (i * (-1219896714)) + (i4 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        return i21 != 1 ? i21 != 2 ? i21 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static final /* synthetic */ rotate IAuthTabCallback(setRepeatingInterval setrepeatinginterval, toMetersPerSecond tometerspersecond, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        rotate rotateVarOnExtraCallback = onExtraCallback(setrepeatinginterval, tometerspersecond, f);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        return rotateVarOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Configuration configuration, Cacheurls1 cacheurls1, Function1 function1, getAdPlacer getadplacer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(configuration, cacheurls1, function1, getadplacer);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, setRepeatingInterval setrepeatinginterval, setRepeatingInterval setrepeatinginterval2, setIso setiso) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(function1, setrepeatinginterval, setrepeatinginterval2, setiso);
        }
        IAuthTabCallback(function1, setrepeatinginterval, setrepeatinginterval2, setiso);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Paint onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(f);
            throw null;
        }
        Paint paintOnExtraCallback = onExtraCallback(f);
        int i3 = onWarmupCompleted + 109;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return paintOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        removeObserverLocked removeobserverlocked;
        setRepeatingInterval setrepeatinginterval = (setRepeatingInterval) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            removeobserverlocked = (removeObserverLocked) IAuthTabCallback(new Object[]{setrepeatinginterval, function1, sessionProcessorCaptureCallback}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -646480604, 646480604, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
            int i3 = 25 / 0;
        } else {
            removeobserverlocked = (removeObserverLocked) IAuthTabCallback(new Object[]{setrepeatinginterval, function1, sessionProcessorCaptureCallback}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -646480604, 646480604, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        }
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlocked;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setRepeatingInterval setrepeatinginterval, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(setrepeatinginterval, fliphorizontally);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(setrepeatinginterval, fliphorizontally);
        int i3 = onWarmupCompleted + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Cacheurls1 cacheurls1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(cacheurls1, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = IAuthTabCallback + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1174991305, i, -1, "im.toss.tds.compose.foundation.graphics.shadow.shadow (ShadowModifier.kt:38)");
        }
        long jOnExtraCallback = AppLovinRtbInterstitialRenderer.onExtraCallback(cacheurls1, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(cacheurls1.onExtraCallbackWithResult());
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, jOnExtraCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(cacheurls1.onExtraCallback()), 0.0f, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback) << 32) | (Float.floatToRawIntBits(fIAuthTabCallback2) & 4294967295L)), null, false, false, 116, null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallback + 5;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Cacheurls1 cacheurls1, @NotNull Function1<? super setLookAhead, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(cacheurls1, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1277600586, i, -1, "im.toss.tds.compose.foundation.graphics.shadow.shadow (ShadowModifier.kt:48)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, cacheurls1, (Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult()), function1);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallback + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = IAuthTabCallback + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, float f2, long j2, toMetersPerSecond tometerspersecond, boolean z, boolean z2, int i, Object obj) {
        long jOnExtraCallback;
        toMetersPerSecond tometerspersecondOnExtraCallback;
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long jOnNavigationEvent = (i & 1) != 0 ? setByteOrder.Companion.onNavigationEvent() : j;
        float fIAuthTabCallback = (i & 4) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                jOnExtraCallback = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.Companion.onExtraCallback();
                int i6 = 29 / 0;
            } else {
                jOnExtraCallback = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.Companion.onExtraCallback();
            }
        } else {
            jOnExtraCallback = j2;
        }
        if ((i & 16) != 0) {
            int i7 = IAuthTabCallback + 85;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            tometerspersecondOnExtraCallback = RectangleShapeKt.onExtraCallback();
        } else {
            tometerspersecondOnExtraCallback = tometerspersecond;
        }
        if ((i & 32) != 0) {
            int i9 = onWarmupCompleted + 33;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 64) != 0) {
            int i11 = onWarmupCompleted + 35;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            z4 = true;
        } else {
            z4 = z2;
        }
        return onNavigationEvent(quirksExternalSyntheticBackport0, jOnNavigationEvent, f, fIAuthTabCallback, jOnExtraCallback, tometerspersecondOnExtraCallback, z3, z4);
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, float f2, long j2, @NotNull toMetersPerSecond tometerspersecond, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(tometerspersecond, "");
            return onWarmupCompleted(quirksExternalSyntheticBackport0, (setRepeatingInterval) IAuthTabCallback(new Object[]{Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j2), tometerspersecond, Boolean.valueOf(z), Boolean.valueOf(z2)}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -824877232, 824877235, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback()), null, 5, null);
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(tometerspersecond, "");
        return onWarmupCompleted(quirksExternalSyntheticBackport0, (setRepeatingInterval) IAuthTabCallback(new Object[]{Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j2), tometerspersecond, Boolean.valueOf(z), Boolean.valueOf(z2)}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -824877232, 824877235, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback()), null, 2, null);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, new getAdPlacer(), (Function1<? super getAdPlacer, Unit>) function1);
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Cacheurls1 cacheurls1, @NotNull Configuration configuration, @NotNull Function1<? super setLookAhead, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(cacheurls1, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, new getAdPlacer(), (Function1<? super getAdPlacer, Unit>) new ShadowModifierKt$.ExternalSyntheticLambda0(configuration, cacheurls1, function1));
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(Configuration configuration, Cacheurls1 cacheurls1, Function1 function1, getAdPlacer getadplacer) {
        int iOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getadplacer, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                cacheurls1.onNavigationEvent();
                throw null;
            }
            iOnWarmupCompleted = cacheurls1.onNavigationEvent();
        } else {
            iOnWarmupCompleted = cacheurls1.onWarmupCompleted();
            int i5 = IAuthTabCallback + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        getadplacer.onExtraCallback(ByteOrderedDataOutputStream.onExtraCallback(iOnWarmupCompleted));
        getadplacer.IAuthTabCallbackStub(0.0f);
        getadplacer.IAuthTabCallbackDefault(getadplacer.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(cacheurls1.onExtraCallbackWithResult())));
        getadplacer.asInterface(getadplacer.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(cacheurls1.onExtraCallback())));
        function1.invoke(getadplacer);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 123;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setRepeatingInterval setrepeatinginterval, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            function1 = null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, setrepeatinginterval, (Function1<? super setRepeatingInterval, Unit>) function1);
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final setRepeatingInterval setrepeatinginterval = (setRepeatingInterval) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        setrepeatinginterval.onExtraCallback(sessionProcessorCaptureCallback);
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.foundation.graphics.shadow.ShadowModifierKt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 41;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = MaxRecyclerAdapter.onExtraCallbackWithResult(function1, setrepeatinginterval, setrepeatinginterval, (setIso) obj);
                int i5 = onWarmupCompleted + 81;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(Function1 function1, setRepeatingInterval setrepeatinginterval, setRepeatingInterval setrepeatinginterval2, setIso setiso) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        if (function1 != null) {
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(setrepeatinginterval);
        }
        if (setrepeatinginterval2.asBinder()) {
            setiso.onWarmupCompleted();
        }
        readShort readshortOnNavigationEvent = setiso.onExtraCallback().onNavigationEvent();
        int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(setrepeatinginterval2.asInterface(), setrepeatinginterval2.onWarmupCompleted()));
        float fOnExtraCallback = setrepeatinginterval2.onExtraCallback();
        if (Math.abs(fOnExtraCallback) <= Float.MAX_VALUE && fOnExtraCallback != 0.0f) {
            setrepeatinginterval2.access100().setMaskFilter(new BlurMaskFilter(setrepeatinginterval2.onExtraCallback(), BlurMaskFilter.Blur.NORMAL));
        }
        setrepeatinginterval2.access100().setColor(iOnNavigationEvent);
        Canvas canvasOnExtraCallback = ExecutedBy.onExtraCallback(readshortOnNavigationEvent);
        int iSave = canvasOnExtraCallback.save();
        Object obj = null;
        if (setrepeatinginterval2.asBinder()) {
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                setrepeatinginterval2.extraCallback();
                obj.hashCode();
                throw null;
            }
            rotate rotateVarIAuthTabCallback = setrepeatinginterval2.extraCallback() ? setrepeatinginterval2.IAuthTabCallbackStubProxy().IAuthTabCallback(setiso.onTransact(), setiso.onExtraCallbackWithResult(), setiso) : setrepeatinginterval2.getInterfaceDescriptor();
            onExtraCallback(readshortOnNavigationEvent, rotateVarIAuthTabCallback, 0, 2, (Object) null);
            Rect rectIAuthTabCallback = rotateVarIAuthTabCallback.IAuthTabCallback();
            canvasOnExtraCallback.saveLayer(rectIAuthTabCallback.IAuthTabCallbackStubProxy(), rectIAuthTabCallback.extraCallback(), rectIAuthTabCallback.IAuthTabCallback_Parcel(), rectIAuthTabCallback.IAuthTabCallbackDefault(), setrepeatinginterval2.onExtraCallbackWithResult());
        }
        readshortOnNavigationEvent.onNavigationEvent(setrepeatinginterval2.IAuthTabCallbackDefault() - setrepeatinginterval2.access000(), setrepeatinginterval2.IAuthTabCallbackStub() - setrepeatinginterval2.access000());
        setDescription.onWarmupCompleted(readshortOnNavigationEvent, setrepeatinginterval2.getInterfaceDescriptor(), setrepeatinginterval2.ICustomTabsCallback());
        canvasOnExtraCallback.restoreToCount(iSave);
        if (!setrepeatinginterval2.asBinder()) {
            int i5 = IAuthTabCallback + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                setiso.onWarmupCompleted();
                throw null;
            }
            setiso.onWarmupCompleted();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final <T extends setRepeatingInterval> QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final T t, final Function1<? super T, Unit> function1) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.tds.compose.foundation.graphics.shadow.ShadowModifierKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                removeObserverLocked removeobserverlocked = (removeObserverLocked) MaxRecyclerAdapter.IAuthTabCallback(new Object[]{t, function1, (SessionProcessorCaptureCallback) obj}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2143554966, -2143554964, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
                int i5 = onExtraCallback + 61;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
                return removeobserverlocked;
            }
        }), new Function1() { // from class: im.toss.tds.compose.foundation.graphics.shadow.ShadowModifierKt$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    MaxRecyclerAdapter.onWarmupCompleted(t, (flipHorizontally) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = MaxRecyclerAdapter.onWarmupCompleted(t, (flipHorizontally) obj);
                int i4 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallback(setRepeatingInterval setrepeatinginterval, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.onWarmupCompleted(setrepeatinginterval.onTransact());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onExtraCallback(readShort readshort, rotate rotateVar, int i, int i2, Object obj) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 2) != 0) {
            i = readUnsignedShort.Companion.onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult(readshort, rotateVar, i);
        int i6 = IAuthTabCallback + 43;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void onExtraCallbackWithResult(readShort readshort, rotate rotateVar, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (rotateVar instanceof rotate.onExtraCallback) {
            readshort.onExtraCallbackWithResult(((rotate.onExtraCallback) rotateVar).onWarmupCompleted(), i);
            return;
        }
        Object obj = null;
        if (rotateVar instanceof rotate.onWarmupCompleted) {
            readshort.onExtraCallbackWithResult(((rotate.onWarmupCompleted) rotateVar).onExtraCallback(), i);
            int i5 = onWarmupCompleted + 45;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!(rotateVar instanceof rotate.onExtraCallbackWithResult)) {
            throw new NoWhenBranchMatchedException();
        }
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        removeTimestamp.onExtraCallback(removetimestampOnWarmupCompleted, ((rotate.onExtraCallbackWithResult) rotateVar).onExtraCallback(), (removeTimestamp.onNavigationEvent) null, 2, (Object) null);
        readshort.onExtraCallbackWithResult(removetimestampOnWarmupCompleted, i);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        int i = 2 % 2;
        MaxRecyclerAdapterMaxAdRecyclerViewHolder maxRecyclerAdapterMaxAdRecyclerViewHolder = new MaxRecyclerAdapterMaxAdRecyclerViewHolder(jLongValue, fFloatValue, fFloatValue2, jLongValue2, tometerspersecond, zBooleanValue, zBooleanValue2, null);
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return maxRecyclerAdapterMaxAdRecyclerViewHolder;
    }

    private static final rotate onExtraCallback(setRepeatingInterval setrepeatinginterval, toMetersPerSecond tometerspersecond, float f) {
        long jExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        if (!(!setrepeatinginterval.extraCallback())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (setrepeatinginterval.extraCallbackWithResult() >> 32));
            float f2 = f * 2.0f;
            jExtraCallbackWithResult = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) r1) + f2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat + f2) << 32));
            i = IAuthTabCallback + 57;
        } else {
            jExtraCallbackWithResult = setrepeatinginterval.extraCallbackWithResult();
            i = IAuthTabCallback + 41;
        }
        onWarmupCompleted = i % 128;
        int i3 = i % 2;
        return tometerspersecond.IAuthTabCallback(jExtraCallbackWithResult, setrepeatinginterval.readTypedObject(), setrepeatinginterval);
    }

    private static final Paint onExtraCallback(float f) {
        int i = 2 % 2;
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, f * 255.0f})));
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(setRepeatingInterval setrepeatinginterval, Function1 function1, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        return (removeObserverLocked) IAuthTabCallback(new Object[]{setrepeatinginterval, function1, sessionProcessorCaptureCallback}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 2143554966, -2143554964, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    private static final setRepeatingInterval onExtraCallbackWithResult(long j, float f, float f2, long j2, toMetersPerSecond tometerspersecond, boolean z, boolean z2) {
        return (setRepeatingInterval) IAuthTabCallback(new Object[]{Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j2), tometerspersecond, Boolean.valueOf(z), Boolean.valueOf(z2)}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -824877232, 824877235, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function1<? super setLookAhead, Unit> function1) {
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(new Object[]{quirksExternalSyntheticBackport0, function1}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1302002350, 1302002351, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    private static final removeObserverLocked IAuthTabCallback(setRepeatingInterval setrepeatinginterval, Function1 function1, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        return (removeObserverLocked) IAuthTabCallback(new Object[]{setrepeatinginterval, function1, sessionProcessorCaptureCallback}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -646480604, 646480604, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }
}
