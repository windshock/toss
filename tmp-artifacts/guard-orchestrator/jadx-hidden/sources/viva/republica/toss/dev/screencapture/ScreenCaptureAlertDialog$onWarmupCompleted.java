package viva.republica.toss.dev.screencapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.SchemeManagerInfoResponse;

/* loaded from: classes.dex */
final class ScreenCaptureAlertDialog$onWarmupCompleted extends ContinuationImpl {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(ScreenCaptureAlertDialog$onWarmupCompleted.class);
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ ScreenCaptureAlertDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCaptureAlertDialog$onWarmupCompleted(ScreenCaptureAlertDialog screenCaptureAlertDialog, access13800<? super ScreenCaptureAlertDialog$onWarmupCompleted> access13800Var) {
        super(access13800Var);
        this.this$0 = screenCaptureAlertDialog;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        ScreenCaptureAlertDialog screenCaptureAlertDialog;
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
        this.result = obj;
        int i2 = this.label;
        int i3 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
        int i4 = (~iOnWarmupCompleted) & i3;
        int i5 = (~i3) & iOnWarmupCompleted;
        if (((((i5 & i4) | (i4 ^ i5)) >> 27) & 1) == 0) {
            int i6 = i2 & Integer.MIN_VALUE;
            int i7 = (i2 | Integer.MIN_VALUE) & (~i6);
            this.label = (i7 & i6) | (i7 ^ i6);
            screenCaptureAlertDialog = this.this$0;
            int i8 = 18 / 0;
        } else {
            int i9 = i2 & Integer.MIN_VALUE;
            this.label = ((i2 | Integer.MIN_VALUE) & (~i9)) | i9;
            screenCaptureAlertDialog = this.this$0;
        }
        int i10 = IAuthTabCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
        if (((((i10 | iOnWarmupCompleted2) & (~(i10 & iOnWarmupCompleted2))) >> 30) & 1) != 0) {
            return screenCaptureAlertDialog.onWarmupCompleted((SchemeManagerInfoResponse) null, (String) null, this);
        }
        screenCaptureAlertDialog.onWarmupCompleted((SchemeManagerInfoResponse) null, (String) null, this);
        throw null;
    }
}
