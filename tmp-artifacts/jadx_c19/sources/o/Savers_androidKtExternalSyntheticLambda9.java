package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.TextInclusionStrategyCompanionExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Savers_androidKtExternalSyntheticLambda9<K extends TextInclusionStrategyCompanionExternalSyntheticLambda1, V> {
    private final IAuthTabCallback<K, V> IAuthTabCallback = new IAuthTabCallback<>();
    private final Map<K, IAuthTabCallback<K, V>> onExtraCallbackWithResult = new HashMap();

    Savers_androidKtExternalSyntheticLambda9() {
    }

    public void IAuthTabCallback(K k, V v) {
        IAuthTabCallback<K, V> iAuthTabCallback = this.onExtraCallbackWithResult.get(k);
        if (iAuthTabCallback == null) {
            iAuthTabCallback = new IAuthTabCallback<>(k);
            onNavigationEvent(iAuthTabCallback);
            this.onExtraCallbackWithResult.put(k, iAuthTabCallback);
        } else {
            k.onExtraCallback();
        }
        iAuthTabCallback.IAuthTabCallback(v);
    }

    public V onWarmupCompleted(K k) {
        IAuthTabCallback<K, V> iAuthTabCallback = this.onExtraCallbackWithResult.get(k);
        if (iAuthTabCallback == null) {
            iAuthTabCallback = new IAuthTabCallback<>(k);
            this.onExtraCallbackWithResult.put(k, iAuthTabCallback);
        } else {
            k.onExtraCallback();
        }
        IAuthTabCallback(iAuthTabCallback);
        return iAuthTabCallback.IAuthTabCallback();
    }

    public V onNavigationEvent() {
        for (IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback.onNavigationEvent; !iAuthTabCallback.equals(this.IAuthTabCallback); iAuthTabCallback = iAuthTabCallback.onNavigationEvent) {
            V v = (V) iAuthTabCallback.IAuthTabCallback();
            if (v != null) {
                return v;
            }
            onExtraCallback(iAuthTabCallback);
            this.onExtraCallbackWithResult.remove(iAuthTabCallback.onExtraCallback);
            ((TextInclusionStrategyCompanionExternalSyntheticLambda1) iAuthTabCallback.onExtraCallback).onExtraCallback();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback.onExtraCallbackWithResult;
        boolean z = false;
        while (!iAuthTabCallback.equals(this.IAuthTabCallback)) {
            sb.append('{');
            sb.append(iAuthTabCallback.onExtraCallback);
            sb.append(':');
            sb.append(iAuthTabCallback.onExtraCallback());
            sb.append("}, ");
            iAuthTabCallback = iAuthTabCallback.onExtraCallbackWithResult;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    private void IAuthTabCallback(IAuthTabCallback<K, V> iAuthTabCallback) {
        onExtraCallback(iAuthTabCallback);
        IAuthTabCallback<K, V> iAuthTabCallback2 = this.IAuthTabCallback;
        iAuthTabCallback.onNavigationEvent = iAuthTabCallback2;
        iAuthTabCallback.onExtraCallbackWithResult = iAuthTabCallback2.onExtraCallbackWithResult;
        onExtraCallbackWithResult(iAuthTabCallback);
    }

    private void onNavigationEvent(IAuthTabCallback<K, V> iAuthTabCallback) {
        onExtraCallback(iAuthTabCallback);
        IAuthTabCallback<K, V> iAuthTabCallback2 = this.IAuthTabCallback;
        iAuthTabCallback.onNavigationEvent = iAuthTabCallback2.onNavigationEvent;
        iAuthTabCallback.onExtraCallbackWithResult = iAuthTabCallback2;
        onExtraCallbackWithResult(iAuthTabCallback);
    }

    private static <K, V> void onExtraCallbackWithResult(IAuthTabCallback<K, V> iAuthTabCallback) {
        iAuthTabCallback.onExtraCallbackWithResult.onNavigationEvent = iAuthTabCallback;
        iAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult = iAuthTabCallback;
    }

    private static <K, V> void onExtraCallback(IAuthTabCallback<K, V> iAuthTabCallback) {
        IAuthTabCallback<K, V> iAuthTabCallback2 = iAuthTabCallback.onNavigationEvent;
        iAuthTabCallback2.onExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult;
        iAuthTabCallback.onExtraCallbackWithResult.onNavigationEvent = iAuthTabCallback2;
    }

    static class IAuthTabCallback<K, V> {
        final K onExtraCallback;
        IAuthTabCallback<K, V> onExtraCallbackWithResult;
        IAuthTabCallback<K, V> onNavigationEvent;
        private List<V> onWarmupCompleted;

        IAuthTabCallback() {
            this(null);
        }

        IAuthTabCallback(K k) {
            this.onNavigationEvent = this;
            this.onExtraCallbackWithResult = this;
            this.onExtraCallback = k;
        }

        public V IAuthTabCallback() {
            int iOnExtraCallback = onExtraCallback();
            if (iOnExtraCallback > 0) {
                return this.onWarmupCompleted.remove(iOnExtraCallback - 1);
            }
            return null;
        }

        public int onExtraCallback() {
            List<V> list = this.onWarmupCompleted;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void IAuthTabCallback(V v) {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = new ArrayList();
            }
            this.onWarmupCompleted.add(v);
        }
    }
}
