package androidx.media3.session;

import o.SurfaceKtExternalSyntheticLambda1;
import o.SurfaceKtExternalSyntheticLambda7;
import o.SwipeableStateExternalSyntheticLambda1;
import o.TabRowKtExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class MediaSessionService$MediaSessionServiceStub$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda1.IAuthTabCallback f$0;
    public final /* synthetic */ SurfaceKtExternalSyntheticLambda7 f$1;
    public final /* synthetic */ TabRowKtExternalSyntheticLambda10.onNavigationEvent f$2;
    public final /* synthetic */ SurfaceKtExternalSyntheticLambda1 f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ MediaSessionService$MediaSessionServiceStub$$ExternalSyntheticLambda0(SwipeableStateExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback, SurfaceKtExternalSyntheticLambda7 surfaceKtExternalSyntheticLambda7, TabRowKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent, SurfaceKtExternalSyntheticLambda1 surfaceKtExternalSyntheticLambda1, boolean z) {
        this.f$0 = iAuthTabCallback;
        this.f$1 = surfaceKtExternalSyntheticLambda7;
        this.f$2 = onnavigationevent;
        this.f$3 = surfaceKtExternalSyntheticLambda1;
        this.f$4 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SwipeableStateExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
