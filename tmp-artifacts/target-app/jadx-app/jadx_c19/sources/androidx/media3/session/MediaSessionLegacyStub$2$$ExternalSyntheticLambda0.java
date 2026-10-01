package androidx.media3.session;

import java.util.List;
import o.SwipeableStateExternalSyntheticLambda0;
import o.SwipeableStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class MediaSessionLegacyStub$2$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda2.1 f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ List f$2;
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda0.asInterface f$3;

    public /* synthetic */ MediaSessionLegacyStub$2$$ExternalSyntheticLambda0(SwipeableStateExternalSyntheticLambda2.1 r1, int i2, List list, SwipeableStateExternalSyntheticLambda0.asInterface asinterface) {
        this.f$0 = r1;
        this.f$1 = i2;
        this.f$2 = list;
        this.f$3 = asinterface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SwipeableStateExternalSyntheticLambda2.1.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
