package o;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.access22200.onWarmupCompleted;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access22200<T extends onWarmupCompleted> {
    private List<T> onExtraCallback = new CopyOnWriteArrayList();
    private boolean onExtraCallbackWithResult = false;

    public interface onExtraCallbackWithResult<T extends onWarmupCompleted> {
        void onExtraCallbackWithResult(T t, Object obj);
    }

    public static abstract class onWarmupCompleted<T, S> {
        final WeakReference<T> IAuthTabCallback;
        public final S onExtraCallback;
        boolean onNavigationEvent = false;

        public onWarmupCompleted(T t, S s) {
            this.onExtraCallback = s;
            this.IAuthTabCallback = new WeakReference<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return this.onExtraCallback.equals(onwarmupcompleted.onExtraCallback) && this.IAuthTabCallback.get() == onwarmupcompleted.IAuthTabCallback.get();
        }

        public int hashCode() {
            T t = this.IAuthTabCallback.get();
            int iHashCode = t != null ? t.hashCode() : 0;
            S s = this.onExtraCallback;
            return ((iHashCode + 527) * 31) + (s != null ? s.hashCode() : 0);
        }
    }

    public void IAuthTabCallback(onExtraCallbackWithResult<T> onextracallbackwithresult) {
        for (T t : this.onExtraCallback) {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            Object obj = t.IAuthTabCallback.get();
            if (obj == null) {
                this.onExtraCallback.remove(t);
            } else if (!t.onNavigationEvent) {
                onextracallbackwithresult.onExtraCallbackWithResult(t, obj);
            }
        }
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallback.isEmpty();
    }

    public void onWarmupCompleted() {
        this.onExtraCallbackWithResult = true;
        this.onExtraCallback.clear();
    }

    public void onExtraCallback(T t) {
        if (!this.onExtraCallback.contains(t)) {
            this.onExtraCallback.add(t);
            t.onNavigationEvent = false;
        }
        if (this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult = false;
        }
    }

    public <S, U> void IAuthTabCallback(S s, U u) {
        for (T t : this.onExtraCallback) {
            if (s == t.IAuthTabCallback.get() && u.equals(t.onExtraCallback)) {
                t.onNavigationEvent = true;
                this.onExtraCallback.remove(t);
                return;
            }
        }
    }

    public void onWarmupCompleted(Object obj) {
        for (T t : this.onExtraCallback) {
            Object obj2 = t.IAuthTabCallback.get();
            if (obj2 == null || obj2 == obj) {
                t.onNavigationEvent = true;
                this.onExtraCallback.remove(t);
            }
        }
    }

    public int onExtraCallback() {
        return this.onExtraCallback.size();
    }
}
