package viva.republica.toss.dev.screencapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class ScreenCaptureAlertDialog$IAuthTabCallbackDefault extends ContinuationImpl {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(ScreenCaptureAlertDialog$IAuthTabCallbackDefault.class);
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ ScreenCaptureAlertDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCaptureAlertDialog$IAuthTabCallbackDefault(ScreenCaptureAlertDialog screenCaptureAlertDialog, access13800<? super ScreenCaptureAlertDialog$IAuthTabCallbackDefault> access13800Var) {
        super(access13800Var);
        this.this$0 = screenCaptureAlertDialog;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 7) & 1;
        this.result = obj;
        int i5 = this.label;
        if (i4 != 0) {
            this.label = (i5 & Integer.MIN_VALUE) | (i5 ^ Integer.MIN_VALUE);
            int i6 = 82 / 0;
        } else {
            int i7 = (Integer.MAX_VALUE & i5) | ((~i5) & Integer.MIN_VALUE);
            int i8 = i5 & Integer.MIN_VALUE;
            this.label = (i8 & i7) | (i7 ^ i8);
        }
        if ((((onExtraCallbackWithResult ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2116)) >> 17) & 1) == 0) {
            ScreenCaptureAlertDialog.onExtraCallbackWithResult(this.this$0, (Long) null, this);
            throw null;
        }
        Object objOnExtraCallbackWithResult = ScreenCaptureAlertDialog.onExtraCallbackWithResult(this.this$0, (Long) null, this);
        int i9 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
        int i10 = (~iOnWarmupCompleted2) & i9;
        int i11 = (~i9) & iOnWarmupCompleted2;
        if (((((i11 & i10) | (i10 ^ i11)) >> 29) & 1) != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }
}
