package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycx15 implements ea61 {
    volatile boolean onWarmupCompleted = false;
    final Map<String, ycx161> IAuthTabCallback = new ConcurrentHashMap();
    final LinkedBlockingQueue<ea9> onExtraCallbackWithResult = new LinkedBlockingQueue<>();

    @Override // o.ea61
    public AppSetIdAndScope1 onWarmupCompleted(String str) {
        ycx161 ycx161Var;
        synchronized (this) {
            ycx161Var = this.IAuthTabCallback.get(str);
            if (ycx161Var == null) {
                ycx161Var = new ycx161(str, this.onExtraCallbackWithResult, this.onWarmupCompleted);
                this.IAuthTabCallback.put(str, ycx161Var);
            }
        }
        return ycx161Var;
    }

    public List<ycx161> onWarmupCompleted() {
        return new ArrayList(this.IAuthTabCallback.values());
    }

    public LinkedBlockingQueue<ea9> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public void onNavigationEvent() {
        this.onWarmupCompleted = true;
    }

    public void onExtraCallback() {
        this.IAuthTabCallback.clear();
        this.onExtraCallbackWithResult.clear();
    }
}
