package viva.republica.toss.network.stats;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.text.StringsKt;
import o.access8100;
import o.getCodeNameBytes;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecordMap implements Map<String, Long>, KMutableMap {
    private final /* synthetic */ HashMap<String, Long> onNavigationEvent = new HashMap<>();

    public int IAuthTabCallback() {
        return this.onNavigationEvent.size();
    }

    @Override // java.util.Map
    public void clear() {
        this.onNavigationEvent.clear();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.onNavigationEvent.isEmpty();
    }

    public Long onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onNavigationEvent.remove(str);
    }

    public Long onExtraCallback(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onNavigationEvent.put(str, Long.valueOf(j));
    }

    public boolean onExtraCallback(long j) {
        return this.onNavigationEvent.containsValue(Long.valueOf(j));
    }

    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet = this.onNavigationEvent.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        return setKeySet;
    }

    public boolean onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onNavigationEvent.containsKey(str);
    }

    public Long onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onNavigationEvent.get(str);
    }

    public Set<Map.Entry<String, Long>> onNavigationEvent() {
        Set<Map.Entry<String, Long>> setEntrySet = this.onNavigationEvent.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        return setEntrySet;
    }

    public Collection<Long> onWarmupCompleted() {
        Collection<Long> collectionValues = this.onNavigationEvent.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return collectionValues;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends Long> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onNavigationEvent.putAll(map);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return onExtraCallbackWithResult((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Long) {
            return onExtraCallback(((Number) obj).longValue());
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Long>> entrySet() {
        return onNavigationEvent();
    }

    @Override // java.util.Map
    public final /* synthetic */ Long get(Object obj) {
        if (obj instanceof String) {
            return onNavigationEvent((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return onExtraCallbackWithResult();
    }

    @Override // java.util.Map
    public /* synthetic */ Long put(String str, Long l) {
        return onExtraCallback(str, l.longValue());
    }

    @Override // java.util.Map
    public final /* synthetic */ Long remove(Object obj) {
        if (obj instanceof String) {
            return onExtraCallback((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return IAuthTabCallback();
    }

    @Override // java.util.Map
    public final Collection<Long> values() {
        return onWarmupCompleted();
    }

    public final void onWarmupCompleted(@NotNull String str, long j) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Long l = (Long) get(str);
            if (l != null) {
                j += l.longValue();
            }
            onExtraCallback(str, j);
        }
    }

    public final String onExtraCallback() {
        Object obj;
        String str;
        Iterator<T> it = entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int length = ((String) ((Map.Entry) next).getKey()).length();
                do {
                    Object next2 = it.next();
                    int length2 = ((String) ((Map.Entry) next2).getKey()).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        int length3 = (entry == null || (str = (String) entry.getKey()) == null) ? 0 : str.length();
        List<Pair> listSortedWith = CollectionsKt.sortedWith(access8100.onExtraCallback(this), new Comparator() { // from class: viva.republica.toss.network.stats.RecordMap$toLogString$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getCodeNameBytes.IAuthTabCallback((Long) ((Pair) t2).getSecond(), (Long) ((Pair) t).getSecond());
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (Pair pair : listSortedWith) {
            arrayList.add(pair.getFirst() + " " + StringsKt.repeat(" ", length3 - ((String) pair.getFirst()).length()) + "| " + pair.getSecond());
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", "\n", (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null);
    }
}
