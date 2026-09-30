package o;

import o.hz;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class iqv extends jxj {
    public iqv(hz.onWarmupCompleted onwarmupcompleted) {
        super(onwarmupcompleted);
    }

    @Override // o.jxj
    public void onExtraCallback() throws gjv {
        if (!IAuthTabCallbackStub()) {
            throw new gmd("Control frame cant have fin==false set");
        }
        if (asBinder()) {
            throw new gmd("Control frame cant have rsv1==true set");
        }
        if (asInterface()) {
            throw new gmd("Control frame cant have rsv2==true set");
        }
        if (onTransact()) {
            throw new gmd("Control frame cant have rsv3==true set");
        }
    }
}
