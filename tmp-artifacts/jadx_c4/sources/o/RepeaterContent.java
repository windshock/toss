package o;

import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RepeaterContent {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Locale $locale;
        final /* synthetic */ RoundedCornersContent $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(RoundedCornersContent roundedCornersContent, Locale locale, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = roundedCornersContent;
            this.$locale = locale;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$locale, access13800Var);
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 22 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(this.$locale);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RememberLottieCompositionKtawait22 IAuthTabCallback(@Nullable Locale locale, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 1) != 0) {
            locale = Locale.KOREA;
            Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1791737647, i, -1, "im.toss.compose.widget.textinput.number.money.rememberTdsMoneyTextFieldState (TdsMoneyTextFieldState.kt:64)");
        }
        boolean z = false;
        setAnimationFromUrl setanimationfromurlOnWarmupCompleted = setDefaultFontFileExtension.onWarmupCompleted(false, false, new Object[0], cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new RoundedCornersContent(locale, setanimationfromurlOnWarmupCompleted);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        RoundedCornersContent roundedCornersContent = (RoundedCornersContent) objOnMinimized;
        int i6 = i & 14;
        if ((i6 ^ 6) > 4) {
            int i7 = onExtraCallbackWithResult + 27;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(locale) : cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(locale)) {
                z = true;
            } else if ((i & 6) != 4) {
                int i8 = onExtraCallback + 73;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!z) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new onNavigationEvent(roundedCornersContent, locale, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(locale, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, i6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onExtraCallback + 91;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return roundedCornersContent;
    }
}
