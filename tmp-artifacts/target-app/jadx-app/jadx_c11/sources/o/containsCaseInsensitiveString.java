package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class containsCaseInsensitiveString {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setImageUri $selectedType;
        final /* synthetic */ ImageViewUtilsExternalSyntheticLambda4 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(ImageViewUtilsExternalSyntheticLambda4 imageViewUtilsExternalSyntheticLambda4, setImageUri setimageuri, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = imageViewUtilsExternalSyntheticLambda4;
            this.$selectedType = setimageuri;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$selectedType, access13800Var);
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.onNavigationEvent(this.$selectedType);
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ImageViewUtilsExternalSyntheticLambda3 IAuthTabCallback(@Nullable setImageUri setimageuri, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        boolean z = true;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            setimageuri = setImageUri.SUMMARY;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(27029826, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.markabstract.rememberTdsAgreementV4MarkAbstractState (TdsAgreementV4MarkAbstractState.kt:40)");
        }
        int i5 = i & 14;
        int i6 = i5 ^ 6;
        boolean z2 = (i6 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setimageuri.ordinal())) || (i & 6) == 4;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z2) {
            int i7 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ImageViewUtilsExternalSyntheticLambda4(setimageuri);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        ImageViewUtilsExternalSyntheticLambda4 imageViewUtilsExternalSyntheticLambda4 = (ImageViewUtilsExternalSyntheticLambda4) objOnMinimized;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(imageViewUtilsExternalSyntheticLambda4);
        if ((i6 <= 4 || (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setimageuri.ordinal()))) && (i & 6) != 4) {
            z = false;
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | z) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new onExtraCallback(imageViewUtilsExternalSyntheticLambda4, setimageuri, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(setimageuri, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, i5);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i10 != 0) {
                int i11 = 38 / 0;
            }
            int i12 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
        }
        return imageViewUtilsExternalSyntheticLambda4;
    }
}
