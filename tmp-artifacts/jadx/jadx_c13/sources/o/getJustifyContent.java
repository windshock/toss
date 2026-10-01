package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import o.getJustifyContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getJustifyContent<N extends getJustifyContent<N>> {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onNavigationEvent = AtomicReferenceFieldUpdater.newUpdater(getJustifyContent.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(getJustifyContent.class, Object.class, "_prev$volatile");

    public abstract boolean asInterface();

    public getJustifyContent(@Nullable N n) {
        this._prev$volatile = n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IAuthTabCallbackDefault() {
        return onNavigationEvent.get(this);
    }

    public final boolean onNavigationEvent(@NotNull N n) {
        return RequestBuilder.onWarmupCompleted(onNavigationEvent, this, (Object) null, n);
    }

    public final boolean asBinder() {
        return onExtraCallbackWithResult() == null;
    }

    public final N onNavigationEvent() {
        return (N) onExtraCallbackWithResult.get(this);
    }

    public final void onWarmupCompleted() {
        onExtraCallbackWithResult.set(this, null);
    }

    public final boolean onTransact() {
        return RequestBuilder.onWarmupCompleted(onNavigationEvent, this, (Object) null, getLargestMainSize.onWarmupCompleted);
    }

    public final void IAuthTabCallbackStub() {
        Object obj;
        if (asBinder()) {
            return;
        }
        while (true) {
            getJustifyContent getjustifycontentOnExtraCallback = onExtraCallback();
            getJustifyContent getjustifycontentIAuthTabCallback = IAuthTabCallback();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
            do {
                obj = atomicReferenceFieldUpdater.get(getjustifycontentIAuthTabCallback);
            } while (!RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, getjustifycontentIAuthTabCallback, obj, ((getJustifyContent) obj) == null ? null : getjustifycontentOnExtraCallback));
            if (getjustifycontentOnExtraCallback != null) {
                onNavigationEvent.set(getjustifycontentOnExtraCallback, getjustifycontentIAuthTabCallback);
            }
            if (!getjustifycontentIAuthTabCallback.asInterface() || getjustifycontentIAuthTabCallback.asBinder()) {
                if (getjustifycontentOnExtraCallback == null || !getjustifycontentOnExtraCallback.asInterface()) {
                    return;
                }
            }
        }
    }

    private final N onExtraCallback() {
        N n = (N) onNavigationEvent();
        while (n != null && n.asInterface()) {
            n = (N) onExtraCallbackWithResult.get(n);
        }
        return n;
    }

    private final N IAuthTabCallback() {
        getJustifyContent getjustifycontentOnExtraCallbackWithResult;
        N n = (N) onExtraCallbackWithResult();
        Intrinsics.checkNotNull(n);
        while (n.asInterface() && (getjustifycontentOnExtraCallbackWithResult = n.onExtraCallbackWithResult()) != null) {
            n = (N) getjustifycontentOnExtraCallbackWithResult;
        }
        return n;
    }

    public final N onExtraCallbackWithResult() {
        Object objIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == getLargestMainSize.onWarmupCompleted) {
            return null;
        }
        return (N) objIAuthTabCallbackDefault;
    }
}
