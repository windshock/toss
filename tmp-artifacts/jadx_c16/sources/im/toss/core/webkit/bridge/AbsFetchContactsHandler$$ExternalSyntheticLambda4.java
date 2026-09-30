package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ AbsFetchContactsHandler$$ExternalSyntheticLambda4(int i, int i2, String str) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            surfaceDestroyed.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = surfaceDestroyed.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
