package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextInclusionStrategyCompanionExternalSyntheticLambda0 implements Savers_androidKtExternalSyntheticLambda6 {
    private final int IAuthTabCallback;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> IAuthTabCallbackStub;
    private final onNavigationEvent onExtraCallback;
    private int onExtraCallbackWithResult;
    private final Map<Class<?>, Savers_androidKtExternalSyntheticLambda7<?>> onNavigationEvent;
    private final Savers_androidKtExternalSyntheticLambda9<onExtraCallbackWithResult, Object> onWarmupCompleted;

    public TextInclusionStrategyCompanionExternalSyntheticLambda0() {
        this.onWarmupCompleted = new Savers_androidKtExternalSyntheticLambda9<>();
        this.onExtraCallback = new onNavigationEvent();
        this.IAuthTabCallbackStub = new HashMap();
        this.onNavigationEvent = new HashMap();
        this.IAuthTabCallback = 4194304;
    }

    public TextInclusionStrategyCompanionExternalSyntheticLambda0(int i2) {
        this.onWarmupCompleted = new Savers_androidKtExternalSyntheticLambda9<>();
        this.onExtraCallback = new onNavigationEvent();
        this.IAuthTabCallbackStub = new HashMap();
        this.onNavigationEvent = new HashMap();
        this.IAuthTabCallback = i2;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda6
    public <T> void onNavigationEvent(T t) {
        synchronized (this) {
            Class<?> cls = t.getClass();
            Savers_androidKtExternalSyntheticLambda7<T> savers_androidKtExternalSyntheticLambda7OnWarmupCompleted = onWarmupCompleted(cls);
            int iOnWarmupCompleted = savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onWarmupCompleted(t);
            int iOnExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onExtraCallbackWithResult() * iOnWarmupCompleted;
            if (IAuthTabCallback(iOnExtraCallbackWithResult)) {
                onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(iOnWarmupCompleted, cls);
                this.onWarmupCompleted.IAuthTabCallback(onextracallbackwithresultOnWarmupCompleted, t);
                NavigableMap<Integer, Integer> navigableMapOnNavigationEvent = onNavigationEvent(cls);
                Integer num = navigableMapOnNavigationEvent.get(Integer.valueOf(onextracallbackwithresultOnWarmupCompleted.onExtraCallback));
                navigableMapOnNavigationEvent.put(Integer.valueOf(onextracallbackwithresultOnWarmupCompleted.onExtraCallback), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                this.onExtraCallbackWithResult += iOnExtraCallbackWithResult;
                IAuthTabCallback();
            }
        }
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda6
    public <T> T onNavigationEvent(int i2, Class<T> cls) {
        T t;
        synchronized (this) {
            t = (T) IAuthTabCallback(this.onExtraCallback.onWarmupCompleted(i2, cls), cls);
        }
        return t;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda6
    public <T> T onExtraCallback(int i2, Class<T> cls) {
        onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        T t;
        synchronized (this) {
            Integer numCeilingKey = onNavigationEvent((Class<?>) cls).ceilingKey(Integer.valueOf(i2));
            if (onExtraCallback(i2, numCeilingKey)) {
                onextracallbackwithresultOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(numCeilingKey.intValue(), cls);
            } else {
                onextracallbackwithresultOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(i2, cls);
            }
            t = (T) IAuthTabCallback(onextracallbackwithresultOnWarmupCompleted, cls);
        }
        return t;
    }

    private <T> T IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Class<T> cls) {
        Savers_androidKtExternalSyntheticLambda7<T> savers_androidKtExternalSyntheticLambda7OnWarmupCompleted = onWarmupCompleted(cls);
        T t = (T) IAuthTabCallback(onextracallbackwithresult);
        if (t != null) {
            this.onExtraCallbackWithResult -= savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onWarmupCompleted(t) * savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onExtraCallbackWithResult();
            IAuthTabCallback(savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onWarmupCompleted(t), (Class<?>) cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onWarmupCompleted(), 2)) {
            savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onWarmupCompleted();
            int i2 = onextracallbackwithresult.onExtraCallback;
        }
        return savers_androidKtExternalSyntheticLambda7OnWarmupCompleted.onNavigationEvent(onextracallbackwithresult.onExtraCallback);
    }

    private <T> T IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        return (T) this.onWarmupCompleted.onWarmupCompleted(onextracallbackwithresult);
    }

    private boolean IAuthTabCallback(int i2) {
        return i2 <= this.IAuthTabCallback / 2;
    }

    private boolean onExtraCallback(int i2, Integer num) {
        if (num != null) {
            return onExtraCallbackWithResult() || num.intValue() <= (i2 << 3);
        }
        return false;
    }

    private boolean onExtraCallbackWithResult() {
        int i2 = this.onExtraCallbackWithResult;
        return i2 == 0 || this.IAuthTabCallback / i2 >= 2;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda6
    public void onWarmupCompleted() {
        synchronized (this) {
            onExtraCallback(0);
        }
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda6
    public void onNavigationEvent(int i2) {
        synchronized (this) {
            try {
                if (i2 >= 40) {
                    onWarmupCompleted();
                } else if (i2 >= 20 || i2 == 15) {
                    onExtraCallback(this.IAuthTabCallback / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void IAuthTabCallback() {
        onExtraCallback(this.IAuthTabCallback);
    }

    private void onExtraCallback(int i2) {
        while (this.onExtraCallbackWithResult > i2) {
            Object objOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
            markHierarchyDirty.onExtraCallbackWithResult(objOnNavigationEvent);
            Savers_androidKtExternalSyntheticLambda7 savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult = onExtraCallbackWithResult(objOnNavigationEvent);
            this.onExtraCallbackWithResult -= savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted(objOnNavigationEvent) * savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult.onExtraCallbackWithResult();
            IAuthTabCallback(savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted(objOnNavigationEvent), objOnNavigationEvent.getClass());
            if (Log.isLoggable(savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted(), 2)) {
                savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted();
                savers_androidKtExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted(objOnNavigationEvent);
            }
        }
    }

    private void IAuthTabCallback(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapOnNavigationEvent = onNavigationEvent(cls);
        Integer num = navigableMapOnNavigationEvent.get(Integer.valueOf(i2));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
        }
        if (num.intValue() == 1) {
            navigableMapOnNavigationEvent.remove(Integer.valueOf(i2));
        } else {
            navigableMapOnNavigationEvent.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> onNavigationEvent(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.IAuthTabCallbackStub.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.IAuthTabCallbackStub.put(cls, treeMap);
        return treeMap;
    }

    private <T> Savers_androidKtExternalSyntheticLambda7<T> onExtraCallbackWithResult(T t) {
        return onWarmupCompleted(t.getClass());
    }

    private <T> Savers_androidKtExternalSyntheticLambda7<T> onWarmupCompleted(Class<T> cls) {
        Savers_androidKtExternalSyntheticLambda7<T> spanStyleKtExternalSyntheticLambda0;
        Savers_androidKtExternalSyntheticLambda7<T> savers_androidKtExternalSyntheticLambda7 = (Savers_androidKtExternalSyntheticLambda7) this.onNavigationEvent.get(cls);
        if (savers_androidKtExternalSyntheticLambda7 != null) {
            return savers_androidKtExternalSyntheticLambda7;
        }
        if (cls.equals(int[].class)) {
            spanStyleKtExternalSyntheticLambda0 = new Savers_androidKtExternalSyntheticLambda8();
        } else if (cls.equals(byte[].class)) {
            spanStyleKtExternalSyntheticLambda0 = new SpanStyleKtExternalSyntheticLambda0();
        } else {
            throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
        }
        this.onNavigationEvent.put(cls, spanStyleKtExternalSyntheticLambda0);
        return spanStyleKtExternalSyntheticLambda0;
    }

    static final class onNavigationEvent extends Savers_androidKtExternalSyntheticLambda4<onExtraCallbackWithResult> {
        onNavigationEvent() {
        }

        onExtraCallbackWithResult onWarmupCompleted(int i2, Class<?> cls) {
            onExtraCallbackWithResult onExtraCallbackWithResult = onExtraCallbackWithResult();
            onExtraCallbackWithResult.onExtraCallbackWithResult(i2, cls);
            return onExtraCallbackWithResult;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.Savers_androidKtExternalSyntheticLambda4
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public onExtraCallbackWithResult onExtraCallback() {
            return new onExtraCallbackWithResult(this);
        }
    }

    static final class onExtraCallbackWithResult implements TextInclusionStrategyCompanionExternalSyntheticLambda1 {
        int onExtraCallback;
        private Class<?> onExtraCallbackWithResult;
        private final onNavigationEvent onNavigationEvent;

        onExtraCallbackWithResult(onNavigationEvent onnavigationevent) {
            this.onNavigationEvent = onnavigationevent;
        }

        void onExtraCallbackWithResult(int i2, Class<?> cls) {
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.onExtraCallback == onextracallbackwithresult.onExtraCallback && this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult;
        }

        public String toString() {
            return "Key{size=" + this.onExtraCallback + "array=" + this.onExtraCallbackWithResult + '}';
        }

        @Override // o.TextInclusionStrategyCompanionExternalSyntheticLambda1
        public void onExtraCallback() {
            this.onNavigationEvent.IAuthTabCallback(this);
        }

        public int hashCode() {
            int i2 = this.onExtraCallback;
            Class<?> cls = this.onExtraCallbackWithResult;
            return (i2 * 31) + (cls != null ? cls.hashCode() : 0);
        }
    }
}
