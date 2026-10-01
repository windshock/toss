package o;

import java.lang.ref.SoftReference;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setReturnTransition {
    private static final markFragmentsCreated onExtraCallbackWithResult;
    protected static final ThreadLocal<SoftReference<setSharedElementReturnTransition>> onNavigationEvent;

    static {
        onExtraCallbackWithResult = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? markFragmentsCreated.IAuthTabCallback() : null;
        onNavigationEvent = new ThreadLocal<>();
    }

    @Deprecated
    public static setSharedElementReturnTransition IAuthTabCallback() {
        SoftReference<setSharedElementReturnTransition> softReference;
        ThreadLocal<SoftReference<setSharedElementReturnTransition>> threadLocal = onNavigationEvent;
        SoftReference<setSharedElementReturnTransition> softReference2 = threadLocal.get();
        setSharedElementReturnTransition setsharedelementreturntransition = softReference2 == null ? null : softReference2.get();
        if (setsharedelementreturntransition == null) {
            setsharedelementreturntransition = new setSharedElementReturnTransition();
            markFragmentsCreated markfragmentscreated = onExtraCallbackWithResult;
            if (markfragmentscreated != null) {
                softReference = markfragmentscreated.onExtraCallback(setsharedelementreturntransition);
            } else {
                softReference = new SoftReference<>(setsharedelementreturntransition);
            }
            threadLocal.set(softReference);
        }
        return setsharedelementreturntransition;
    }
}
