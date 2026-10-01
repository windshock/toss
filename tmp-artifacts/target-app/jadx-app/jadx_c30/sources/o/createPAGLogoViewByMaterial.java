package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import o.createPAGLogoViewByMaterial;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class createPAGLogoViewByMaterial {
    public setVideoAdInteractionListener IAuthTabCallback;
    protected final Map<uh25, setAdCreativeClickListener> onExtraCallbackWithResult = new HashMap();
    final Map<uh2, Object> onWarmupCompleted = new HashMap();
    private final Set<uh2> onNavigationEvent = new HashSet();
    private final ArrayList<onNavigationEvent<Map<Object, Object>, onNavigationEvent<Object, Object>>> onExtraCallback = new ArrayList<>();
    private final ArrayList<onNavigationEvent<Set<Object>, Object>> asBinder = new ArrayList<>();

    public createPAGLogoViewByMaterial(setVideoAdInteractionListener setvideoadinteractionlistener) {
        this.IAuthTabCallback = setvideoadinteractionlistener;
    }

    public Object onExtraCallback(Optional<uh2> optional) {
        if (!optional.isPresent() || uh25.asInterface.equals(optional.get().onExtraCallback())) {
            return this.onExtraCallbackWithResult.get(uh25.asInterface).onExtraCallbackWithResult(optional.orElse(null));
        }
        return onWarmupCompleted(optional.get());
    }

    protected Object onWarmupCompleted(uh2 uh2Var) {
        try {
            try {
                try {
                    Object objIAuthTabCallback = IAuthTabCallback(uh2Var);
                    IAuthTabCallback();
                    return objIAuthTabCallback;
                } catch (uh16 e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw new uh16(e2);
            }
        } finally {
            this.onWarmupCompleted.clear();
            this.onNavigationEvent.clear();
        }
    }

    private void IAuthTabCallback() {
        if (!this.onExtraCallback.isEmpty()) {
            Iterator<onNavigationEvent<Map<Object, Object>, onNavigationEvent<Object, Object>>> it = this.onExtraCallback.iterator();
            while (it.hasNext()) {
                onNavigationEvent<Map<Object, Object>, onNavigationEvent<Object, Object>> next = it.next();
                onNavigationEvent<Object, Object> onnavigationeventOnExtraCallbackWithResult = next.onExtraCallbackWithResult();
                next.onExtraCallback().put(onnavigationeventOnExtraCallbackWithResult.onExtraCallback(), onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            this.onExtraCallback.clear();
        }
        if (this.asBinder.isEmpty()) {
            return;
        }
        Iterator<onNavigationEvent<Set<Object>, Object>> it2 = this.asBinder.iterator();
        while (it2.hasNext()) {
            onNavigationEvent<Set<Object>, Object> next2 = it2.next();
            next2.onExtraCallback().add(next2.onExtraCallbackWithResult());
        }
        this.asBinder.clear();
    }

    public Object IAuthTabCallback(uh2 uh2Var) {
        Objects.requireNonNull(uh2Var, "Node cannot be null");
        if (this.onWarmupCompleted.containsKey(uh2Var)) {
            return this.onWarmupCompleted.get(uh2Var);
        }
        return onExtraCallbackWithResult(uh2Var);
    }

    protected Object onExtraCallbackWithResult(final uh2 uh2Var) throws Throwable {
        if (this.onNavigationEvent.contains(uh2Var)) {
            throw new sya9(null, Optional.empty(), "found unconstructable recursive node", uh2Var.onNavigationEvent());
        }
        this.onNavigationEvent.add(uh2Var);
        setAdCreativeClickListener setadcreativeclicklistenerOrElseThrow = onNavigationEvent(uh2Var).orElseThrow(new Supplier() { // from class: org.snakeyaml.engine.v2.constructor.BaseConstructor$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return createPAGLogoViewByMaterial.onExtraCallback(uh2Var);
            }
        });
        Object objOnExtraCallbackWithResult = this.onWarmupCompleted.containsKey(uh2Var) ? this.onWarmupCompleted.get(uh2Var) : setadcreativeclicklistenerOrElseThrow.onExtraCallbackWithResult(uh2Var);
        this.onWarmupCompleted.put(uh2Var, objOnExtraCallbackWithResult);
        this.onNavigationEvent.remove(uh2Var);
        if (uh2Var.IAuthTabCallbackDefault()) {
            setadcreativeclicklistenerOrElseThrow.onExtraCallback(uh2Var, objOnExtraCallbackWithResult);
        }
        return objOnExtraCallbackWithResult;
    }

    public static /* synthetic */ sya9 onExtraCallback(uh2 uh2Var) {
        return new sya9(null, Optional.empty(), "could not determine a constructor for the tag " + uh2Var.onExtraCallback(), uh2Var.onNavigationEvent());
    }

    protected Optional<setAdCreativeClickListener> onNavigationEvent(uh2 uh2Var) {
        uh25 uh25VarOnExtraCallback = uh2Var.onExtraCallback();
        if (this.IAuthTabCallback.IAuthTabCallbackStubProxy().containsKey(uh25VarOnExtraCallback)) {
            return Optional.of(this.IAuthTabCallback.IAuthTabCallbackStubProxy().get(uh25VarOnExtraCallback));
        }
        if (this.onExtraCallbackWithResult.containsKey(uh25VarOnExtraCallback)) {
            return Optional.of(this.onExtraCallbackWithResult.get(uh25VarOnExtraCallback));
        }
        return Optional.empty();
    }

    protected List<Object> onExtraCallbackWithResult(uh21 uh21Var) {
        return this.IAuthTabCallback.asBinder().apply(uh21Var.onWarmupCompleted().size());
    }

    protected Set<Object> onExtraCallback(uh17 uh17Var) {
        return this.IAuthTabCallback.IAuthTabCallbackStub().apply(uh17Var.onWarmupCompleted().size());
    }

    protected Map<Object, Object> onWarmupCompleted(uh17 uh17Var) {
        return this.IAuthTabCallback.onTransact().apply(uh17Var.onWarmupCompleted().size());
    }

    protected List<Object> onNavigationEvent(uh21 uh21Var) {
        List<Object> listApply = this.IAuthTabCallback.asBinder().apply(uh21Var.onWarmupCompleted().size());
        onWarmupCompleted(uh21Var, listApply);
        return listApply;
    }

    protected void onWarmupCompleted(uh21 uh21Var, Collection<Object> collection) {
        Iterator<uh2> it = uh21Var.onWarmupCompleted().iterator();
        while (it.hasNext()) {
            collection.add(IAuthTabCallback(it.next()));
        }
    }

    protected Set<Object> IAuthTabCallback(uh17 uh17Var) {
        Set<Object> setApply = this.IAuthTabCallback.IAuthTabCallbackStub().apply(uh17Var.onWarmupCompleted().size());
        onWarmupCompleted(uh17Var, setApply);
        return setApply;
    }

    protected Map<Object, Object> onNavigationEvent(uh17 uh17Var) {
        Map<Object, Object> mapApply = this.IAuthTabCallback.onTransact().apply(uh17Var.onWarmupCompleted().size());
        onWarmupCompleted(uh17Var, mapApply);
        return mapApply;
    }

    protected void onWarmupCompleted(uh17 uh17Var, Map<Object, Object> map) {
        for (uh24 uh24Var : uh17Var.onWarmupCompleted()) {
            uh2 uh2VarOnExtraCallback = uh24Var.onExtraCallback();
            uh2 uh2VarOnExtraCallbackWithResult = uh24Var.onExtraCallbackWithResult();
            Object objIAuthTabCallback = IAuthTabCallback(uh2VarOnExtraCallback);
            if (objIAuthTabCallback != null) {
                try {
                    objIAuthTabCallback.hashCode();
                } catch (Exception e) {
                    throw new sya9("while constructing a mapping", uh17Var.onNavigationEvent(), "found unacceptable key " + objIAuthTabCallback, uh24Var.onExtraCallback().onNavigationEvent(), e);
                }
            }
            Object objIAuthTabCallback2 = IAuthTabCallback(uh2VarOnExtraCallbackWithResult);
            if (uh2VarOnExtraCallback.IAuthTabCallbackDefault()) {
                if (this.IAuthTabCallback.onExtraCallbackWithResult()) {
                    onExtraCallback(map, objIAuthTabCallback, objIAuthTabCallback2);
                } else {
                    throw new uh16("Recursive key for mapping is detected but it is not configured to be allowed.");
                }
            } else {
                map.put(objIAuthTabCallback, objIAuthTabCallback2);
            }
        }
    }

    public void onExtraCallback(Map<Object, Object> map, Object obj, Object obj2) {
        this.onExtraCallback.add(0, new onNavigationEvent<>(map, new onNavigationEvent(obj, obj2)));
    }

    protected void onWarmupCompleted(uh17 uh17Var, Set<Object> set) {
        for (uh24 uh24Var : uh17Var.onWarmupCompleted()) {
            uh2 uh2VarOnExtraCallback = uh24Var.onExtraCallback();
            Object objIAuthTabCallback = IAuthTabCallback(uh2VarOnExtraCallback);
            if (objIAuthTabCallback != null) {
                try {
                    objIAuthTabCallback.hashCode();
                } catch (Exception e) {
                    throw new sya9("while constructing a Set", uh17Var.onNavigationEvent(), "found unacceptable key " + objIAuthTabCallback, uh24Var.onExtraCallback().onNavigationEvent(), e);
                }
            }
            if (uh2VarOnExtraCallback.IAuthTabCallbackDefault()) {
                if (this.IAuthTabCallback.onExtraCallbackWithResult()) {
                    onNavigationEvent(set, objIAuthTabCallback);
                } else {
                    throw new uh16("Recursive key for mapping is detected but it is not configured to be allowed.");
                }
            } else {
                set.add(objIAuthTabCallback);
            }
        }
    }

    protected void onNavigationEvent(Set<Object> set, Object obj) {
        this.asBinder.add(0, new onNavigationEvent<>(set, obj));
    }

    static class onNavigationEvent<T, K> {
        private final K IAuthTabCallback;
        private final T onNavigationEvent;

        public onNavigationEvent(T t, K k) {
            this.onNavigationEvent = t;
            this.IAuthTabCallback = k;
        }

        public K onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public T onExtraCallback() {
            return this.onNavigationEvent;
        }
    }
}
