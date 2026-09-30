package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getHostAndPath {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ boolean $enableSlideAnimation;
        final /* synthetic */ isAlphaNumeric $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(isAlphaNumeric isalphanumeric, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = isalphanumeric;
            this.$enableSlideAnimation = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$enableSlideAnimation, access13800Var);
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onNavigationEvent(this.$enableSlideAnimation);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final encodeUriString onNavigationEvent(@Nullable Object obj, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(880739499, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.top.rememberTdsAgreementV4TopState (TdsAgreementV4TopState.kt:49)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        int i5 = (i & 112) ^ 48;
        if (i5 > 32) {
            int i6 = onNavigationEvent + 57;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
                z2 = (i & 48) == 32;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new isAlphaNumeric(obj, z);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        isAlphaNumeric isalphanumeric = (isAlphaNumeric) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(isalphanumeric);
        boolean z3 = (i5 > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) || (i & 48) == 32;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent2 | z3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new onExtraCallback(isalphanumeric, z, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return isalphanumeric;
    }
}
