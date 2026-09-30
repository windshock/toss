package o;

import o.hz;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jl extends jdn {
    public jl() {
        super(hz.onWarmupCompleted.TEXT);
    }

    @Override // o.jdn, o.jxj
    public void onExtraCallback() throws gjv {
        super.onExtraCallback();
        if (!mtm.onExtraCallbackWithResult(IAuthTabCallback())) {
            throw new gjv(1007, "Received text is no valid utf8 string!");
        }
    }
}
