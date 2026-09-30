package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.RecyclerPool.WithPool;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RecyclerPool<P extends WithPool<P>> extends Serializable {

    public interface WithPool<P extends WithPool<P>> {
        P onExtraCallbackWithResult(RecyclerPool<P> recyclerPool);
    }

    P aj_();

    void onExtraCallback(P p);

    default P asBinder() {
        return (P) aj_().onExtraCallbackWithResult(this);
    }

    public static abstract class ThreadLocalPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public abstract P aj_();

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void onExtraCallback(P p) {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P asBinder() {
            return (P) aj_();
        }
    }

    public static abstract class NonRecyclingPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public abstract P aj_();

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void onExtraCallback(P p) {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P asBinder() {
            return (P) aj_();
        }
    }
}
