package im.toss.features.edoc.register;

import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda12 implements deserializeDecimalCollection {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AptPasswordActivity f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AptPasswordActivity.IAuthTabCallback(this.f$0);
            obj.hashCode();
            throw null;
        }
        AptPasswordActivity.IAuthTabCallback(this.f$0);
        int i3 = onExtraCallback + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
