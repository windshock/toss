package viva.republica.toss.dev.screencapture;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: classes.dex */
final class ScreenCaptureAlertDialog$onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {64977, 64964, 64990, 64991, 64981, 65065, 64979, 64978, 64980, 64915, 64987, 64988, 64965, 64961, 64960, 64967, 65064, 64986, 64976, 64982, 64983, 64989, 64916, 64966, 64984};
    private static char onWarmupCompleted = 51244;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScreenCaptureAlertDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCaptureAlertDialog$onTransact(ScreenCaptureAlertDialog screenCaptureAlertDialog, access13800<? super ScreenCaptureAlertDialog$onTransact> access13800Var) {
        super(2, access13800Var);
        this.this$0 = screenCaptureAlertDialog;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ScreenCaptureAlertDialog$onTransact screenCaptureAlertDialog$onTransact = new ScreenCaptureAlertDialog$onTransact(this.this$0, access13800Var);
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return screenCaptureAlertDialog$onTransact;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return onNavigationEvent(findresandmsg, access13800Var);
        }
        Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        int i3 = 65 / 0;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r14 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba A[PHI: r2 r14
      0x00ba: PHI (r2v4 viva.republica.toss.network.model.SchemeManagerInfoResponse) = 
      (r2v5 viva.republica.toss.network.model.SchemeManagerInfoResponse)
      (r2v7 viva.republica.toss.network.model.SchemeManagerInfoResponse)
     binds: [B:23:0x00b8, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r14v12 java.lang.Object) = (r14v17 java.lang.Object), (r14v0 java.lang.Object) binds: [B:23:0x00b8, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r21, byte r22, int r23, java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onTransact.a(char[], byte, int, java.lang.Object[]):void");
    }
}
