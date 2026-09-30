package o;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getTopDisLike<L, R> implements Map.Entry<L, R>, Comparable<getTopDisLike<L, R>>, Serializable {
    public static final getTopDisLike<?, ?>[] onExtraCallbackWithResult = new onNavigationEvent[0];
    private static final long serialVersionUID = 4954918890077093841L;

    public abstract R IAuthTabCallback();

    public abstract L onExtraCallbackWithResult();

    static final class onNavigationEvent<L, R> extends getTopDisLike<L, R> {
        private static final long serialVersionUID = 1;

        @Override // o.getTopDisLike
        public R IAuthTabCallback() {
            return null;
        }

        @Override // o.getTopDisLike
        public L onExtraCallbackWithResult() {
            return null;
        }

        @Override // java.util.Map.Entry
        public R setValue(R r) {
            return null;
        }

        private onNavigationEvent() {
        }

        @Override // o.getTopDisLike, java.lang.Comparable
        public /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((getTopDisLike) obj);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(getTopDisLike<L, R> gettopdislike) {
        return new PAGAppOpenRequest().onWarmupCompleted(onExtraCallbackWithResult(), gettopdislike.onExtraCallbackWithResult()).onWarmupCompleted(IAuthTabCallback(), gettopdislike.IAuthTabCallback()).onWarmupCompleted();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return onExtraCallbackWithResult();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return IAuthTabCallback();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    public String toString() {
        return "(" + onExtraCallbackWithResult() + ',' + IAuthTabCallback() + ')';
    }
}
