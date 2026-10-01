package io.realm.internal;

import io.realm.RealmChangeListener;
import javax.annotation.Nullable;
import o.access11000;
import o.access11100;
import o.access22200;
import o.access22300;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ObservableCollection {
    void notifyChangeListeners(long j);

    public static class onNavigationEvent<T> extends access22200.onWarmupCompleted<T, Object> {
        onNavigationEvent(T t, Object obj) {
            super(t, obj);
        }

        public void onNavigationEvent(T t, OsCollectionChangeSet osCollectionChangeSet) {
            S s = this.onExtraCallback;
            if (s instanceof access11000) {
                ((access11000) s).onChange(t, new access22300(osCollectionChangeSet));
            } else {
                if (s instanceof RealmChangeListener) {
                    ((RealmChangeListener) s).onChange(t);
                    return;
                }
                throw new RuntimeException("Unsupported listener type: " + this.onExtraCallback);
            }
        }
    }

    public static class IAuthTabCallback<T> implements access11000<T> {
        private final RealmChangeListener<T> onExtraCallback;

        public IAuthTabCallback(RealmChangeListener<T> realmChangeListener) {
            this.onExtraCallback = realmChangeListener;
        }

        @Override // o.access11000
        public void onChange(T t, @Nullable access11100 access11100Var) {
            this.onExtraCallback.onChange(t);
        }

        public boolean equals(Object obj) {
            return (obj instanceof IAuthTabCallback) && this.onExtraCallback == ((IAuthTabCallback) obj).onExtraCallback;
        }

        public int hashCode() {
            return this.onExtraCallback.hashCode();
        }
    }

    public static class onExtraCallbackWithResult implements access22200.onExtraCallbackWithResult<onNavigationEvent> {
        private final OsCollectionChangeSet onExtraCallback;

        onExtraCallbackWithResult(OsCollectionChangeSet osCollectionChangeSet) {
            this.onExtraCallback = osCollectionChangeSet;
        }

        @Override // o.access22200.onExtraCallbackWithResult
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, Object obj) {
            onnavigationevent.onNavigationEvent(obj, this.onExtraCallback);
        }
    }
}
