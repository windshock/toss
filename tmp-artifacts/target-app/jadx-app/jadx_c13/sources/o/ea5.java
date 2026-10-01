package o;

import java.util.Queue;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ea5 extends syc3 {
    private static final long serialVersionUID = -176083308134819629L;
    Queue<ea9> eventQueue;
    ycx161 logger;
    String name;

    @Override // o.AppSetIdAndScope1
    public boolean IAuthTabCallback() {
        return true;
    }

    @Override // o.AppSetIdAndScope1
    public boolean asInterface() {
        return true;
    }

    @Override // o.AppSetIdAndScope1
    public boolean onExtraCallback() {
        return true;
    }

    @Override // o.AppSetIdAndScope1
    public boolean onNavigationEvent() {
        return true;
    }

    @Override // o.AppSetIdAndScope1
    public boolean onWarmupCompleted() {
        return true;
    }

    public ea5(ycx161 ycx161Var, Queue<ea9> queue) {
        this.logger = ycx161Var;
        this.name = ycx161Var.onExtraCallbackWithResult();
        this.eventQueue = queue;
    }

    @Override // o.ea7, o.AppSetIdAndScope1
    public String onExtraCallbackWithResult() {
        return this.name;
    }
}
