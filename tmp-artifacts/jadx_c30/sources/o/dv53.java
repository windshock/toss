package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class dv53<T> {
    private static final dv53<Object> onNavigationEvent = new dv53<Object>() { // from class: o.dv53.3
        @Override // o.dv53
        public boolean onWarmupCompleted() {
            return true;
        }

        @Override // o.dv53
        public Object onExtraCallback() {
            throw new NoSuchElementException(".get call on None!");
        }
    };

    public abstract T onExtraCallback();

    public abstract boolean onWarmupCompleted();

    dv53() {
    }

    public static <T> dv53<T> onNavigationEvent(T t) {
        if (t == null) {
            return (dv53<T>) onNavigationEvent;
        }
        return new onWarmupCompleted(t);
    }

    public String toString() {
        return "None";
    }

    public static class onWarmupCompleted<T> extends dv53<T> {
        private final T onExtraCallbackWithResult;

        @Override // o.dv53
        public boolean onWarmupCompleted() {
            return false;
        }

        onWarmupCompleted(T t) {
            this.onExtraCallbackWithResult = t;
        }

        @Override // o.dv53
        public T onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.dv53
        public String toString() {
            return String.format("Some(%s)", this.onExtraCallbackWithResult);
        }
    }
}
