package o;

import kotlin.coroutines.CoroutineContext;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ComponentModelb implements findResAndMsg {
    public static final ComponentModelb onExtraCallback = new ComponentModelb();

    private ComponentModelb() {
    }

    @Override // o.findResAndMsg
    public CoroutineContext getCoroutineContext() {
        return access13600.IAuthTabCallback;
    }
}
