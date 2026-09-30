package o;

import android.content.Context;
import im.toss.features.mobileid.impl.glance.MobileIdAppWidget$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJSONBytesWithFastJsonConfig extends LazyListStateExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final int onExtraCallback = LazyListStateExternalSyntheticLambda0.onWarmupCompleted;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws setWrite {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = toJSONBytesWithFastJsonConfig.this.onNavigationEvent(null, null, this);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            int i5 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static {
        int i = onNavigationEvent + 17;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(context, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(context, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public toJSONBytesWithFastJsonConfig() {
        super(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (o.LazyListStateExternalSyntheticLambda3.onNavigationEvent(r5, r8, r1) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (o.LazyListStateExternalSyntheticLambda3.onNavigationEvent(r5, r8, r1) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (o.LazyListStateExternalSyntheticLambda3.onNavigationEvent(r5, r8, r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull Context context, @NotNull SpacerMeasurePolicyExternalSyntheticLambda0 spacerMeasurePolicyExternalSyntheticLambda0, @NotNull access13800<? super Unit> access13800Var) throws setWrite {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (Class.forName("o.toJSONBytesWithFastJsonConfig$onWarmupCompleted").isInstance(access13800Var)) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i4 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 != 0) {
            if (i5 == 1) {
                ResultKt.onNavigationEvent(obj);
                throw new setWrite();
            }
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            throw new setWrite();
        }
        ResultKt.onNavigationEvent(obj);
        if (setProgressAsync.onExtraCallback.onExtraCallback(context, Class.forName("im.toss.features.mobileid.impl.glance.MobileIdAppWidgetReceiver"))) {
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1269710947, true, new MobileIdAppWidget$.ExternalSyntheticLambda0(context));
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(context);
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(spacerMeasurePolicyExternalSyntheticLambda0);
            onwarmupcompleted.label = 2;
        } else {
            int i6 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnExtraCallbackWithResult = handleResovleTask.onNavigationEvent.onExtraCallbackWithResult();
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(context);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(spacerMeasurePolicyExternalSyntheticLambda0);
                onwarmupcompleted.label = 1;
            } else {
                Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnExtraCallbackWithResult2 = handleResovleTask.onNavigationEvent.onExtraCallbackWithResult();
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(context);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(spacerMeasurePolicyExternalSyntheticLambda0);
                onwarmupcompleted.label = 1;
            }
        }
        return objOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1269710947, i, -1, "im.toss.features.mobileid.impl.glance.MobileIdAppWidget.provideGlance.<anonymous> (MobileIdAppWidget.kt:21)");
                int i10 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            toJavaObject.onExtraCallback(onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(setBigDataHandler.Companion.onExtraCallbackWithResult(context).onWarmupCompleted(), fatalError$onExtraCallbackWithResult.IAuthTabCallback, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2)), false, cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final fatalError onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends fatalError> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        fatalError fatalerror = (fatalError) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fatalerror;
    }
}
