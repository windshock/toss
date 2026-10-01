package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda11<E> implements Iterable<E> {
    private final Object IAuthTabCallback = new Object();
    private final Map<E, Integer> onExtraCallbackWithResult = new HashMap();
    private Set<E> onWarmupCompleted = Collections.EMPTY_SET;
    private List<E> onNavigationEvent = Collections.EMPTY_LIST;

    public void onExtraCallback(E e) {
        synchronized (this.IAuthTabCallback) {
            ArrayList arrayList = new ArrayList(this.onNavigationEvent);
            arrayList.add(e);
            this.onNavigationEvent = Collections.unmodifiableList(arrayList);
            Integer num = this.onExtraCallbackWithResult.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.onWarmupCompleted);
                hashSet.add(e);
                this.onWarmupCompleted = Collections.unmodifiableSet(hashSet);
            }
            this.onExtraCallbackWithResult.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void onNavigationEvent(E e) {
        synchronized (this.IAuthTabCallback) {
            Integer num = this.onExtraCallbackWithResult.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.onNavigationEvent);
            arrayList.remove(e);
            this.onNavigationEvent = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.onExtraCallbackWithResult.remove(e);
                HashSet hashSet = new HashSet(this.onWarmupCompleted);
                hashSet.remove(e);
                this.onWarmupCompleted = Collections.unmodifiableSet(hashSet);
            } else {
                this.onExtraCallbackWithResult.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public Set<E> onExtraCallbackWithResult() {
        Set<E> set;
        synchronized (this.IAuthTabCallback) {
            set = this.onWarmupCompleted;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.IAuthTabCallback) {
            it = this.onNavigationEvent.iterator();
        }
        return it;
    }

    public int onExtraCallbackWithResult(E e) {
        int iIntValue;
        synchronized (this.IAuthTabCallback) {
            iIntValue = this.onExtraCallbackWithResult.containsKey(e) ? this.onExtraCallbackWithResult.get(e).intValue() : 0;
        }
        return iIntValue;
    }
}
