package androidx.media3.session;

import o.SwipeableStateExternalSyntheticLambda0;
import o.SwipeableStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class MediaSessionLegacyStub$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda2.3 f$0;
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda0.asBinder f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda0.asInterface f$3;

    public /* synthetic */ MediaSessionLegacyStub$1$$ExternalSyntheticLambda0(SwipeableStateExternalSyntheticLambda2.3 r1, SwipeableStateExternalSyntheticLambda0.asBinder asbinder, boolean z, SwipeableStateExternalSyntheticLambda0.asInterface asinterface) {
        this.f$0 = r1;
        this.f$1 = asbinder;
        this.f$2 = z;
        this.f$3 = asinterface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SwipeableStateExternalSyntheticLambda2.3.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
