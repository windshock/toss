package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.tds.compose.R;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.flipHorizontally;
import o.getBacktraceNote;
import o.initMiniApp;
import o.initSDK;
import o.isQueryRefinementEnabled;
import o.setCurrentIndex;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.v3;
import o.v6a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        onWarmupCompleted(jLongValue, tometerspersecond, quirksExternalSyntheticBackport0, (getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(isqueryrefinementenabled, fliphorizontally);
        }
        onExtraCallbackWithResult(isqueryrefinementenabled, fliphorizontally);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(accessgetCameraFactoryp[] accessgetcamerafactorypArr, initMiniApp initminiapp, v6a.IAuthTabCallback iAuthTabCallback, Function0 function0, Rally rally, long j, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(accessgetcamerafactorypArr, initminiapp, iAuthTabCallback, function0, rally, j, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unitIAuthTabCallback;
        initMiniApp initminiapp = (initMiniApp) objArr[0];
        v6a.IAuthTabCallback iAuthTabCallback = (v6a.IAuthTabCallback) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Rally rally = (Rally) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[5];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = IAuthTabCallback(initminiapp, iAuthTabCallback, function0, rally, jLongValue, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i3 = 82 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(initminiapp, iAuthTabCallback, function0, rally, jLongValue, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, v6a.IAuthTabCallback iAuthTabCallback, long j, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, iAuthTabCallback, j, tometerspersecond, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 13;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 17 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        v6a.IAuthTabCallback iAuthTabCallback = (v6a.IAuthTabCallback) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Rally rally = (Rally) objArr[2];
        Context context = (Context) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, function0, rally, context);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, toMetersPerSecond tometerspersecond, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 113;
        IAuthTabCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            Object[] objArr = {Long.valueOf(j), tometerspersecond, quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            throw null;
        }
        Object[] objArr2 = {Long.valueOf(j), tometerspersecond, quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 821056751, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), -821056749, objArr2);
        int i6 = IAuthTabCallback + 111;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 53;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(getbacktracenote, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i2) | i6);
        int i11 = i9 | i10 | (~(i6 | i4));
        int i12 = (~(i4 | i2)) | (~(i7 | i2));
        int i13 = i8 | i10;
        int i14 = i2 + i6 + i + (793188503 * i5) + (2090109681 * i3);
        int i15 = i14 * i14;
        int i16 = (837707615 * i2) + 1286602752 + ((-1676358574) * i6) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i) + (1186463744 * i5) + (1166540800 * i3) + ((-1956446208) * i15);
        int i17 = ((i2 * 1389925299) - 652765764) + (i6 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i * 1389926445) + (i5 * (-1551828341)) + (i3 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[1];
        Configuration configuration = (Configuration) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[4];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[5];
        initSDK initsdk = (initSDK) objArr[6];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, isqueryrefinementenabled, configuration, jLongValue, tometerspersecond, getbacktracenote, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i3 = 39 / 0;
        return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, isqueryrefinementenabled, configuration, jLongValue, tometerspersecond, getbacktracenote, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
    }

    public static /* synthetic */ List onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        List list = (List) onWarmupCompleted(iOnNavigationEvent2, -733949933, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, 733949934, new Object[]{rally});
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function0 function0, v6a.IAuthTabCallback iAuthTabCallback, long j, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(function0, iAuthTabCallback, j, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 47;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 38 / 0;
        }
        int i7 = IAuthTabCallback + 27;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Context $context;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Boolean> $isPressed;
        final /* synthetic */ Rally $rally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, Rally rally, Context context, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$isPressed = cameraPresenceProviderExternalSyntheticLambda6;
            this.$rally = rally;
            this.$context = context;
        }

        public static /* synthetic */ boolean onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return zIAuthTabCallback;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$isPressed, this.$rally, this.$context, access13800Var);
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public static final class onNavigationEvent implements IAnimation<Boolean> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ IAnimation onExtraCallbackWithResult;

            /* renamed from: o.v3$onExtraCallback$onNavigationEvent$5, reason: invalid class name */
            public static final class AnonymousClass5<T> implements setRipple {
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ setRipple onNavigationEvent;

                /* renamed from: o.v3$onExtraCallback$onNavigationEvent$5$4, reason: invalid class name */
                public static final class AnonymousClass4 extends ContinuationImpl {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass4(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 51;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass5.this.emit(null, this);
                        int i4 = onExtraCallback + 61;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 83 / 0;
                        }
                        return objEmit;
                    }
                }

                public AnonymousClass5(setRipple setripple) {
                    this.onNavigationEvent = setripple;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
                  0x002b: PHI (r1v9 o.v3$onExtraCallback$onNavigationEvent$5$4) = (r1v8 o.v3$onExtraCallback$onNavigationEvent$5$4), (r1v11 o.v3$onExtraCallback$onNavigationEvent$5$4) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
                  0x002b: PHI (r4v2 int) = (r4v1 int), (r4v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass4 anonymousClass4;
                    int i;
                    int i2 = 2 % 2;
                    if (access13800Var instanceof AnonymousClass4) {
                        int i3 = onWarmupCompleted + 5;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0) {
                            anonymousClass4 = (AnonymousClass4) access13800Var;
                            i = anonymousClass4.label;
                            int i4 = 70 / 0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                int i5 = onExtraCallbackWithResult + 93;
                                onWarmupCompleted = i5 % 128;
                                if (i5 % 2 == 0) {
                                    anonymousClass4.label = i / Integer.MIN_VALUE;
                                } else {
                                    anonymousClass4.label = i - 2147483648;
                                }
                            } else {
                                anonymousClass4 = new AnonymousClass4(access13800Var);
                            }
                        } else {
                            anonymousClass4 = (AnonymousClass4) access13800Var;
                            i = anonymousClass4.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                            }
                        }
                    }
                    Object obj2 = anonymousClass4.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i6 = anonymousClass4.label;
                    if (i6 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onNavigationEvent;
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass4.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass4.L$1 = access15400.onNavigationEvent(anonymousClass4);
                            anonymousClass4.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass4.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass4.I$0 = 0;
                            anonymousClass4.label = 1;
                            if (setripple.emit(obj, anonymousClass4) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = onWarmupCompleted + 51;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            ResultKt.onNavigationEvent(obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        ResultKt.onNavigationEvent(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public onNavigationEvent(IAnimation iAnimation) {
                this.onExtraCallbackWithResult = iAnimation;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass5(setripple), access13800Var);
                if (objCollect != access14300.onWarmupCompleted()) {
                    Unit unit = Unit.INSTANCE;
                    int i2 = IAuthTabCallback + 111;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return unit;
                }
                int i4 = onExtraCallback + 45;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objCollect;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static final boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
            int i4 = onWarmupCompleted + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6 = this.$isPressed;
                onNavigationEvent onnavigationevent = new onNavigationEvent(ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$animateRallyOnPress$1$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 47;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Boolean boolValueOf = Boolean.valueOf(v3.onExtraCallback.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6));
                        int i7 = IAuthTabCallback + 53;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return boolValueOf;
                    }
                })));
                final Rally rally = this.$rally;
                final Context context = this.$context;
                setRipple setripple = new setRipple() { // from class: o.v3.onExtraCallback.4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 77;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        if (i6 == 0) {
                            onNavigationEvent(zBooleanValue, access13800Var);
                            throw null;
                        }
                        Object objOnNavigationEvent = onNavigationEvent(zBooleanValue, access13800Var);
                        int i7 = IAuthTabCallback + 15;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnNavigationEvent;
                    }

                    public final Object onNavigationEvent(boolean z, access13800<? super Unit> access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 61;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            rally.postMessage();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        if (!rally.postMessage()) {
                            rally.receiveFile();
                            minFresh.onNavigationEvent(context, noStore.Companion.access100());
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = IAuthTabCallback + 49;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return unit;
                    }
                };
                this.label = 1;
                if (onnavigationevent.collect(setripple, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 33;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 66 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onWarmupCompleted + 115;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(v6a.IAuthTabCallback iAuthTabCallback, Function0 function0, Rally rally, Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
            if (iAuthTabCallback.onWarmupCompleted()) {
                function0.invoke();
            } else if (!rally.postMessage()) {
                int i4 = IAuthTabCallback + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    rally.receiveFile();
                    minFresh.onNavigationEvent(context, noStore.Companion.access100());
                    int i5 = 98 / 0;
                } else {
                    rally.receiveFile();
                    minFresh.onNavigationEvent(context, noStore.Companion.access100());
                }
                int i6 = IAuthTabCallback + 111;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        } else if (!iAuthTabCallback.onWarmupCompleted()) {
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ initMiniApp $autoLogScreen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(initMiniApp initminiapp, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$autoLogScreen = initminiapp;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$autoLogScreen, access13800Var);
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            enableLoopMonitor enableloopmonitor = this.$autoLogScreen;
            if (enableloopmonitor instanceof enableLoopMonitor) {
                this.$autoLogScreen.onExtraCallback(getUserData.Companion.IAuthTabCallback(enableloopmonitor.onExtraCallbackWithResult()));
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(initMiniApp initminiapp, v6a.IAuthTabCallback iAuthTabCallback, Function0 function0, Rally rally, long j, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1230894858, i, -1, "im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1.<anonymous>.<anonymous> (BasicTdsDialogV1.kt:98)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initminiapp);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Function0 function02 = null;
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallbackWithResult(initminiapp, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 107;
                        onExtraCallback = i6 % 128;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                        if (i6 % 2 != 0) {
                            v3.IAuthTabCallback(useandconfigureprogramwithtexture);
                            throw null;
                        }
                        Unit unitIAuthTabCallback = v3.IAuthTabCallback(useandconfigureprogramwithtexture);
                        int i7 = onExtraCallbackWithResult + 1;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized2, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                int i5 = onExtraCallback + 35;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3;
            if (iAuthTabCallback.IAuthTabCallback()) {
                function02 = function0;
            } else {
                int i7 = onExtraCallback + 45;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            IAuthTabCallback(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function02, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!iAuthTabCallback.IAuthTabCallback()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1850359106);
                quirksExternalSyntheticBackport0IAuthTabCallback = onNavigationEvent(quirksExternalSyntheticBackport0, rally, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, false, cameraCaptureResultEmptyCameraCaptureResult, 3462, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (!iAuthTabCallback.onWarmupCompleted()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1850695487);
                quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0, rally, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(752439288);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0IAuthTabCallback = quirksExternalSyntheticBackport0;
            }
            onWarmupCompleted(j, tometerspersecond, quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback), (getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(accessgetCameraFactoryp[] accessgetcamerafactorypArr, final initMiniApp initminiapp, final v6a.IAuthTabCallback iAuthTabCallback, final Function0 function0, final Rally rally, final long j, final toMetersPerSecond tometerspersecond, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 9;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(702435914, i, -1, "im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1.<anonymous> (BasicTdsDialogV1.kt:95)");
            }
            accessgetCameraFactoryp[] accessgetcamerafactorypArr2 = (accessgetCameraFactoryp[]) ArraysKt.plus(accessgetcamerafactorypArr, setThreadList.access100().onExtraCallback(initminiapp));
            setPostviewFormatSelector.onExtraCallback((accessgetCameraFactoryp[]) Arrays.copyOf(accessgetcamerafactorypArr2, accessgetcamerafactorypArr2.length), ForwardingCameraControl.onExtraCallback(1230894858, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda9
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 79;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    initMiniApp initminiapp2 = initminiapp;
                    v6a.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    Function0 function02 = function0;
                    Rally rally2 = rally;
                    long j2 = j;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {initminiapp2, iAuthTabCallback2, function02, rally2, Long.valueOf(j2), tometerspersecond, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                    Unit unit = (Unit) v3.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1168100997, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent(), -1168100994, objArr);
                    int i13 = onExtraCallback + 47;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 77;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onExtraCallback + 77;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i14 = onExtraCallback + 91;
        IAuthTabCallback = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 16 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final Function0<Unit> function0, @Nullable v6a.IAuthTabCallback iAuthTabCallback, long j, @Nullable toMetersPerSecond tometerspersecond, @NotNull final getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        v6a.IAuthTabCallback iAuthTabCallback2;
        toMetersPerSecond tometerspersecond2;
        final long j2;
        final v6a.IAuthTabCallback iAuthTabCallback3;
        final toMetersPerSecond tometerspersecond3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        v6a.IAuthTabCallback iAuthTabCallback4;
        long j3;
        final v6a.IAuthTabCallback iAuthTabCallback5;
        toMetersPerSecond appLovinAdClickListener;
        long jIAuthTabCallback = j;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1963515533);
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onExtraCallback + 23;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
                iAuthTabCallback2 = iAuthTabCallback;
            } else {
                iAuthTabCallback2 = iAuthTabCallback;
                int i8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 32 : 16;
                i3 |= i8;
            }
            i3 |= i8;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        if ((i & 384) == 0) {
            int i9 = onExtraCallback + 17;
            int i10 = i9 % 128;
            IAuthTabCallback = i10;
            int i11 = i9 % 2;
            if ((i2 & 4) == 0) {
                int i12 = i10 + 87;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jIAuthTabCallback);
                    throw null;
                }
                int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jIAuthTabCallback) ? 256 : 128;
                i3 |= i13;
            }
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                tometerspersecond2 = tometerspersecond;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 16384 : 8192;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                j2 = jIAuthTabCallback;
                iAuthTabCallback3 = iAuthTabCallback2;
                tometerspersecond3 = tometerspersecond2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                    int i15 = onExtraCallback + 97;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage())) {
                        if ((i2 & 2) != 0) {
                            iAuthTabCallback4 = new v6a.IAuthTabCallback(false, false, null, 7, null);
                            i3 &= -113;
                        } else {
                            iAuthTabCallback4 = iAuthTabCallback2;
                        }
                        if ((i2 & 4) != 0) {
                            jIAuthTabCallback = v7.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            i3 &= -897;
                        }
                        j3 = jIAuthTabCallback;
                        iAuthTabCallback5 = iAuthTabCallback4;
                        appLovinAdClickListener = i14 != 0 ? new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), null) : tometerspersecond2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            int i17 = onExtraCallback + 61;
                            IAuthTabCallback = i17 % 128;
                            i3 = i17 % 2 == 0 ? i3 & 4853 : i3 & (-897);
                        }
                        j3 = jIAuthTabCallback;
                        iAuthTabCallback5 = iAuthTabCallback2;
                        appLovinAdClickListener = tometerspersecond2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1963515533, i3, -1, "im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1 (BasicTdsDialogV1.kt:72)");
                    }
                    final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    final Rally rallyIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    final initMiniApp initminiapp = (initMiniApp) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setThreadList.access100());
                    final accessgetCameraFactoryp<?>[] accessgetcamerafactorypArrOnNavigationEvent = lExternalSyntheticLambda5.onNavigationEvent((accessisMonitoringp[]) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(lExternalSyntheticLambda5.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (((i3 & 112) ^ 48) > 32) {
                        int i18 = onExtraCallback + 33;
                        IAuthTabCallback = i18 % 128;
                        int i19 = i18 % 2;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback5)) {
                            boolean z = (i3 & 48) == 32;
                            boolean z2 = (i3 & 14) == 4;
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyIAuthTabCallback);
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z2 | z | zOnNavigationEvent | zOnExtraCallback)) {
                                Object obj = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda3
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke() {
                                            Unit unit;
                                            int i20 = 2 % 2;
                                            int i21 = onWarmupCompleted + 27;
                                            onExtraCallback = i21 % 128;
                                            if (i21 % 2 == 0) {
                                                Object[] objArr = {iAuthTabCallback5, function0, rallyIAuthTabCallback, context};
                                                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                                                unit = (Unit) v3.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 653372596, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent(), -653372592, objArr);
                                                int i22 = 70 / 0;
                                            } else {
                                                Object[] objArr2 = {iAuthTabCallback5, function0, rallyIAuthTabCallback, context};
                                                int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                                                unit = (Unit) v3.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 653372596, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), -653372592, objArr2);
                                            }
                                            int i23 = onWarmupCompleted + 77;
                                            onExtraCallback = i23 % 128;
                                            if (i23 % 2 != 0) {
                                                return unit;
                                            }
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                    obj = function02;
                                }
                                final v6a.IAuthTabCallback iAuthTabCallback6 = iAuthTabCallback5;
                                final long j4 = j3;
                                final toMetersPerSecond tometerspersecond4 = appLovinAdClickListener;
                                setImageProcessor.onExtraCallback((Function0) obj, new PreviewProcessor(true, false, iAuthTabCallback5.onExtraCallback(), false, false, (String) null, 48, (DefaultConstructorMarker) null), ForwardingCameraControl.onExtraCallback(702435914, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda4
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i20 = 2 % 2;
                                        int i21 = onWarmupCompleted + 91;
                                        onExtraCallbackWithResult = i21 % 128;
                                        if (i21 % 2 != 0) {
                                            return v3.IAuthTabCallback(accessgetcamerafactorypArrOnNavigationEvent, initminiapp, iAuthTabCallback6, function0, rallyIAuthTabCallback, j4, tometerspersecond4, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        }
                                        Unit unitIAuthTabCallback = v3.IAuthTabCallback(accessgetcamerafactorypArrOnNavigationEvent, initminiapp, iAuthTabCallback6, function0, rallyIAuthTabCallback, j4, tometerspersecond4, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i22 = 63 / 0;
                                        return unitIAuthTabCallback;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                iAuthTabCallback3 = iAuthTabCallback5;
                                j2 = j3;
                                tometerspersecond3 = appLovinAdClickListener;
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i20 = 2 % 2;
                        int i21 = onWarmupCompleted + 39;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitOnExtraCallback = v3.onExtraCallback(function0, iAuthTabCallback3, j2, tometerspersecond3, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i23 = onExtraCallback + 21;
                        onWarmupCompleted = i23 % 128;
                        int i24 = i23 % 2;
                        return unitOnExtraCallback;
                    }
                });
            }
            int i20 = onExtraCallback + 79;
            IAuthTabCallback = i20 % 128;
            int i21 = i20 % 2;
        }
        i3 |= 3072;
        tometerspersecond2 = tometerspersecond;
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        int i202 = onExtraCallback + 79;
        IAuthTabCallback = i202 % 128;
        int i212 = i202 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $isSystemInDarkTheme;
        final /* synthetic */ Window $window;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Window window, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$window = window;
            this.$isSystemInDarkTheme = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$window, this.$isSystemInDarkTheme, access13800Var);
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 44 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = onNavigationEvent + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            float f;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Window window = this.$window;
            if (window != null) {
                int i4 = onExtraCallback;
                int i5 = i4 + 97;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (this.$isSystemInDarkTheme) {
                    int i6 = i4 + 87;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    f = 0.56f;
                } else {
                    f = 0.2f;
                }
                window.setDimAmount(f);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, Float.MAX_VALUE);
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, Float.MAX_VALUE);
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void IAuthTabCallback(final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s r8lambdaztwkibi2wkyqwqyt0nttpaydx0s;
        Window windowOnWarmupCompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2034845273);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i4 = onExtraCallback + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onExtraCallback + 15;
            IAuthTabCallback = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2034845273, i2, -1, "im.toss.tds.compose.component.compound.dialog.Scrim (BasicTdsDialogV1.kt:142)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s parent = view.getParent();
            if (parent instanceof r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s) {
                int i7 = IAuthTabCallback + 57;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    r8lambdaztwkibi2wkyqwqyt0nttpaydx0s = parent;
                    int i8 = 69 / 0;
                } else {
                    r8lambdaztwkibi2wkyqwqyt0nttpaydx0s = parent;
                }
            } else {
                r8lambdaztwkibi2wkyqwqyt0nttpaydx0s = null;
            }
            if (r8lambdaztwkibi2wkyqwqyt0nttpaydx0s != null) {
                int i9 = onExtraCallback + 49;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    r8lambdaztwkibi2wkyqwqyt0nttpaydx0s.onWarmupCompleted();
                    throw null;
                }
                windowOnWarmupCompleted = r8lambdaztwkibi2wkyqwqyt0nttpaydx0s.onWarmupCompleted();
            } else {
                windowOnWarmupCompleted = null;
            }
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(windowOnWarmupCompleted);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnExtraCallbackWithResult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallback(windowOnWarmupCompleted, zOnExtraCallbackWithResult, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_dialog_close, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            if (function0 != null) {
                int i10 = onExtraCallback + 73;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(907930694);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj2) {
                            int i12 = 2 % 2;
                            int i13 = IAuthTabCallback + 19;
                            onExtraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            String str = strOnExtraCallback;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                            if (i14 == 0) {
                                return v3.onExtraCallbackWithResult(str, useandconfigureprogramwithtexture);
                            }
                            v3.onExtraCallbackWithResult(str, useandconfigureprogramwithtexture);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized2, 1, (Object) null);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    int i12 = IAuthTabCallback + 27;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                        obj.hashCode();
                        throw null;
                    }
                    objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3, (getSubtitle) null, false, strOnExtraCallback, (Role) null, function0, 20, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(908237129);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0IAuthTabCallback = getAdaptiveAdViewWidth.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, false, 2, null);
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                    if (i15 != 0) {
                        return v3.onWarmupCompleted(camera2CapturePipelineTorchTaskExternalSyntheticLambda22, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    v3.onWarmupCompleted(camera2CapturePipelineTorchTaskExternalSyntheticLambda22, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
            int i13 = onExtraCallback + 97;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $transition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$transition = isqueryrefinementenabled;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$transition, access13800Var);
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 72 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$transition;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, (onItemClicked) null, (Object) null, (Function1) null, this, 14, (Object) null) == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent + 87;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.access000(fliphorizontally.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f)) * (1.0f - ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue()));
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onWarmupCompleted implements PointerInputEventHandler {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        static {
            int i = onNavigationEvent + 23;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 62 / 0;
            }
        }

        onWarmupCompleted() {
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i3 + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1727958137, i, -1, "im.toss.tds.compose.component.compound.dialog.DialogContent.<anonymous>.<anonymous>.<anonymous> (BasicTdsDialogV1.kt:202)");
            }
            getbacktracenote.invoke(meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final isQueryRefinementEnabled isqueryrefinementenabled, Configuration configuration, long j, toMetersPerSecond tometerspersecond, final getBacktraceNote getbacktracenote, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i5 = IAuthTabCallback + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 145) != 144, i2 & 1)) {
            int i7 = onExtraCallback + 15;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 117;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1752743633, i2, -1, "im.toss.tds.compose.component.compound.dialog.DialogContent.<anonymous> (BasicTdsDialogV1.kt:186)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1752743633, i2, -1, "im.toss.tds.compose.component.compound.dialog.DialogContent.<anonymous> (BasicTdsDialogV1.kt:186)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = IAuthTabCallback + 125;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitIAuthTabCallback = v3.IAuthTabCallback(isqueryrefinementenabled, (flipHorizontally) obj2);
                        int i13 = IAuthTabCallback + 31;
                        onNavigationEvent = i13 % 128;
                        if (i13 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(320.0f), 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenWidthDp) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f) * 2.0f))), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenHeightDp) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f) * 2.0f)), 1, (Object) null), j, tometerspersecond), tometerspersecond);
            Unit unit = Unit.INSTANCE;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = onWarmupCompleted.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, unit, (PointerInputEventHandler) objOnMinimized2);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i10 = IAuthTabCallback + 105;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
                int i11 = IAuthTabCallback + 45;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            final LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            setPostviewFormatSelector.onNavigationEvent(lc.onNavigationEvent().onExtraCallback(setByteOrder.onNavigationEvent(j)), ForwardingCameraControl.onExtraCallback(-1727958137, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    if (i15 != 0) {
                        return v3.onNavigationEvent(getbacktracenote2, lowLightBoostControlExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    v3.onNavigationEvent(getbacktracenote2, lowLightBoostControlExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallback + 103;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit2 = Unit.INSTANCE;
        int i14 = onExtraCallback + 9;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final long j, final toMetersPerSecond tometerspersecond, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(865870598);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 2048 : 1024;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i6 = onExtraCallback + 29;
                IAuthTabCallback = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    throw null;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i5 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(865870598, i3, -1, "im.toss.tds.compose.component.compound.dialog.DialogContent (BasicTdsDialogV1.kt:179)");
                    int i7 = IAuthTabCallback + 65;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                final Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized;
                Unit unit = Unit.INSTANCE;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new onNavigationEvent(isqueryrefinementenabled, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                setThreadList.IAuthTabCallback(IOOMCallback.Dialog, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(1752743633, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 95;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        isQueryRefinementEnabled isqueryrefinementenabled2 = isqueryrefinementenabled;
                        Configuration configuration2 = configuration;
                        if (i11 == 0) {
                            long j2 = j;
                            int iIntValue = ((Integer) obj5).intValue();
                            Object[] objArr = {quirksExternalSyntheticBackport05, isqueryrefinementenabled2, configuration2, Long.valueOf(j2), tometerspersecond, getbacktracenote, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue)};
                            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                            return (Unit) v3.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1007164046, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent(), -1007164046, objArr);
                        }
                        long j3 = j;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        Object[] objArr2 = {quirksExternalSyntheticBackport05, isqueryrefinementenabled2, configuration2, Long.valueOf(j3), tometerspersecond, getbacktracenote, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue2)};
                        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                        int i12 = 13 / 0;
                        return (Unit) v3.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1007164046, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), -1007164046, objArr2);
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallback + 99;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 57;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        long j2 = j;
                        toMetersPerSecond tometerspersecond2 = tometerspersecond;
                        if (i12 == 0) {
                            v3.onNavigationEvent(j2, tometerspersecond2, quirksExternalSyntheticBackport05, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnNavigationEvent = v3.onNavigationEvent(j2, tometerspersecond2, quirksExternalSyntheticBackport05, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i13 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        int i10 = onExtraCallback + 47;
        IAuthTabCallback = i10 % 128;
        i3 = i10 % 2 == 0 ? i3 | 27605 : i3 | 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Rally rally, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Rally rallyIAuthTabCallback;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 67;
        IAuthTabCallback = i5 % 128;
        boolean z3 = true;
        if (i5 % 2 == 0 || (i2 & 1) == 0) {
            rallyIAuthTabCallback = rally;
        } else {
            int i6 = i4 + 39;
            IAuthTabCallback = i6 % 128;
            rallyIAuthTabCallback = i6 % 2 == 0 ? IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 1) : IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
        }
        if ((i2 & 4) != 0) {
            int i7 = IAuthTabCallback + 121;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1680090882, i, -1, "im.toss.tds.compose.component.compound.dialog.animateRallyOnPress (BasicTdsDialogV1.kt:213)");
            int i9 = onExtraCallback + 67;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
        int i11 = i & 112;
        if ((i11 ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyIAuthTabCallback)) {
            if ((i & 48) == 32) {
                int i12 = IAuthTabCallback + 31;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    z3 = false;
                }
            }
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        boolean z4 = zOnExtraCallback | z3 | zOnNavigationEvent;
        Object obj = null;
        if (z4 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult, rallyIAuthTabCallback, context, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = RallyModifierKt.IAuthTabCallback(onextracallback, rallyIAuthTabCallback, null, cameraCaptureResultEmptyCameraCaptureResult, i11 | 6, 2).onExtraCallback(quirksExternalSyntheticBackport0).onExtraCallback(getAdaptiveAdViewWidth.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z2));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = onExtraCallback + 35;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Rally IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onExtraCallback + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1849851093, i, -1, "im.toss.tds.compose.component.compound.dialog.wiggleRally (BasicTdsDialogV1.kt:235)");
            int i5 = IAuthTabCallback + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.BasicTdsDialogV1Kt$$ExternalSyntheticLambda8
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 19;
                    onExtraCallback = i8 % 128;
                    Rally rally = (Rally) obj;
                    if (i8 % 2 != 0) {
                        return v3.onWarmupCompleted(rally);
                    }
                    v3.onWarmupCompleted(rally);
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i7 = IAuthTabCallback + 37;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Rally rally = (Rally) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 515399683, -515399667, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{0, null, 0, null, null, 0, null, null, null, null, null, null, null, null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 24576, 16383}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onExtraCallback + 77;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 % 2;
            }
        }
        return rally;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        List<AppLovinSdkSettings> listOnNavigationEvent = deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, EnumC0079certificatePinner.X).onNavigationEvent();
        int i4 = IAuthTabCallback + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return listOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, isQueryRefinementEnabled isqueryrefinementenabled, Configuration configuration, long j, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, isqueryrefinementenabled, configuration, Long.valueOf(j), tometerspersecond, getbacktracenote, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1007164046, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent(), -1007164046, objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(v6a.IAuthTabCallback iAuthTabCallback, Function0 function0, Rally rally, Context context) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (Unit) onWarmupCompleted(iOnNavigationEvent2, 653372596, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, -653372592, new Object[]{iAuthTabCallback, function0, rally, context});
    }

    public static /* synthetic */ Unit onExtraCallback(initMiniApp initminiapp, v6a.IAuthTabCallback iAuthTabCallback, Function0 function0, Rally rally, long j, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {initminiapp, iAuthTabCallback, function0, rally, Long.valueOf(j), tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1168100997, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent(), -1168100994, objArr);
    }

    private static final Unit IAuthTabCallback(long j, toMetersPerSecond tometerspersecond, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Long.valueOf(j), tometerspersecond, quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 821056751, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent(), -821056749, objArr);
    }

    private static final List onNavigationEvent(Rally rally) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (List) onWarmupCompleted(iOnNavigationEvent2, -733949933, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, 733949934, new Object[]{rally});
    }
}
