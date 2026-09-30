package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class jc6 implements Map<String, Object>, Serializable {
    private static final long serialVersionUID = 6297731997167536582L;
    private final LinkedHashMap<String, Object> documentAsMap = new LinkedHashMap<>();

    @Override // java.util.Map
    public int size() {
        return this.documentAsMap.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.documentAsMap.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.documentAsMap.containsValue(obj);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.documentAsMap.containsKey(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.documentAsMap.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        return this.documentAsMap.put(str, obj);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.documentAsMap.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.documentAsMap.putAll(map);
    }

    @Override // java.util.Map
    public void clear() {
        this.documentAsMap.clear();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.documentAsMap.keySet();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.documentAsMap.values();
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.documentAsMap.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.documentAsMap.equals(((jc6) obj).documentAsMap);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.documentAsMap.hashCode();
    }

    public String toString() {
        return "Document{" + this.documentAsMap + '}';
    }
}
