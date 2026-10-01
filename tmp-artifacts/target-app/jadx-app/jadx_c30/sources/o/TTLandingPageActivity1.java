package o;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTLandingPageActivity1 extends TTLandingPageActivity11 implements Map.Entry {
    protected TTLandingPageActivity1(Object obj, Object obj2) {
        super(obj, obj2);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object obj2 = this.onExtraCallback;
        this.onExtraCallback = obj;
        return obj2;
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
        if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
            if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }
}
