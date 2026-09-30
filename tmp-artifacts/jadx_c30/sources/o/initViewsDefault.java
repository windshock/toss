package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class initViewsDefault extends jc2 implements List<jc2>, Cloneable {
    private final List<jc2> onExtraCallbackWithResult;

    public initViewsDefault(List<? extends jc2> list) {
        this(list, true);
    }

    public initViewsDefault() {
        this(new ArrayList(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public initViewsDefault(List<? extends jc2> list, boolean z) {
        if (z) {
            this.onExtraCallbackWithResult = new ArrayList(list);
        } else {
            this.onExtraCallbackWithResult = list;
        }
    }

    public List<jc2> onNavigationEvent() {
        return Collections.unmodifiableList(this.onExtraCallbackWithResult);
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.ARRAY;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.onExtraCallbackWithResult.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.onExtraCallbackWithResult.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.onExtraCallbackWithResult.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<jc2> iterator() {
        return this.onExtraCallbackWithResult.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.onExtraCallbackWithResult.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.onExtraCallbackWithResult.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean add(jc2 jc2Var) {
        return this.onExtraCallbackWithResult.add(jc2Var);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.onExtraCallbackWithResult.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.onExtraCallbackWithResult.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends jc2> collection) {
        return this.onExtraCallbackWithResult.addAll(collection);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends jc2> collection) {
        return this.onExtraCallbackWithResult.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.onExtraCallbackWithResult.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.onExtraCallbackWithResult.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.onExtraCallbackWithResult.clear();
    }

    @Override // java.util.List
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public jc2 get(int i) {
        return this.onExtraCallbackWithResult.get(i);
    }

    @Override // java.util.List
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public jc2 set(int i, jc2 jc2Var) {
        return this.onExtraCallbackWithResult.set(i, jc2Var);
    }

    @Override // java.util.List
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void add(int i, jc2 jc2Var) {
        this.onExtraCallbackWithResult.add(i, jc2Var);
    }

    @Override // java.util.List
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jc2 remove(int i) {
        return this.onExtraCallbackWithResult.remove(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.onExtraCallbackWithResult.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.onExtraCallbackWithResult.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<jc2> listIterator() {
        return this.onExtraCallbackWithResult.listIterator();
    }

    @Override // java.util.List
    public ListIterator<jc2> listIterator(int i) {
        return this.onExtraCallbackWithResult.listIterator(i);
    }

    @Override // java.util.List
    public List<jc2> subList(int i, int i2) {
        return this.onExtraCallbackWithResult.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof initViewsDefault) {
            return onNavigationEvent().equals(((initViewsDefault) obj).onNavigationEvent());
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "BsonArray{values=" + this.onExtraCallbackWithResult + '}';
    }

    @Override // 
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public initViewsDefault clone() {
        initViewsDefault initviewsdefault = new initViewsDefault();
        Iterator<jc2> it = iterator();
        while (it.hasNext()) {
            jc2 next = it.next();
            int i = AnonymousClass4.onNavigationEvent[next.IAuthTabCallback().ordinal()];
            if (i == 1) {
                initviewsdefault.add(next.IAuthTabCallback_Parcel().clone());
            } else if (i == 2) {
                initviewsdefault.add(next.onTransact().clone());
            } else if (i == 3) {
                initviewsdefault.add(initOneSlotMultipleAdsLayoutLandscape.onExtraCallbackWithResult(next.IAuthTabCallbackDefault()));
            } else if (i == 4) {
                initviewsdefault.add(getOutline.IAuthTabCallback(next.extraCallback()));
            } else {
                initviewsdefault.add(next);
            }
        }
        return initviewsdefault;
    }

    /* renamed from: o.initViewsDefault$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[t_.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[t_.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[t_.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[t_.BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[t_.JAVASCRIPT_WITH_SCOPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
