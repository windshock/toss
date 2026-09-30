package o;

import com.fasterxml.jackson.core.util.RecyclerPool;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dispatchFragmentsOnCreateView {
    public static RecyclerPool<setSharedElementReturnTransition> onExtraCallback() {
        return onNavigationEvent();
    }

    public static RecyclerPool<setSharedElementReturnTransition> onNavigationEvent() {
        return onWarmupCompleted.onNavigationEvent;
    }

    public static RecyclerPool<setSharedElementReturnTransition> onWarmupCompleted() {
        return IAuthTabCallback.onExtraCallbackWithResult;
    }

    public static class onWarmupCompleted extends RecyclerPool.ThreadLocalPoolBase<setSharedElementReturnTransition> {
        protected static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static final long serialVersionUID = 1;

        private onWarmupCompleted() {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool.ThreadLocalPoolBase, com.fasterxml.jackson.core.util.RecyclerPool
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public setSharedElementReturnTransition aj_() {
            return setReturnTransition.IAuthTabCallback();
        }

        protected Object readResolve() {
            return onNavigationEvent;
        }
    }

    public static class IAuthTabCallback extends RecyclerPool.NonRecyclingPoolBase<setSharedElementReturnTransition> {
        protected static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static final long serialVersionUID = 1;

        protected IAuthTabCallback() {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool.NonRecyclingPoolBase, com.fasterxml.jackson.core.util.RecyclerPool
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public setSharedElementReturnTransition aj_() {
            return new setSharedElementReturnTransition();
        }

        protected Object readResolve() {
            return onExtraCallbackWithResult;
        }
    }
}
