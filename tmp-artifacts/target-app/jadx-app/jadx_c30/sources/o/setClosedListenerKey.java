package o;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setClosedListenerKey {
    private final Map<t_, Class<?>> onExtraCallbackWithResult;

    public setClosedListenerKey(Map<t_, Class<?>> map) {
        HashMap map2 = new HashMap();
        this.onExtraCallbackWithResult = map2;
        onNavigationEvent();
        map2.putAll(map);
    }

    public setClosedListenerKey() {
        this(Collections.EMPTY_MAP);
    }

    Set<t_> onWarmupCompleted() {
        return this.onExtraCallbackWithResult.keySet();
    }

    public Class<?> onExtraCallback(t_ t_Var) {
        return this.onExtraCallbackWithResult.get(t_Var);
    }

    private void onNavigationEvent() {
        this.onExtraCallbackWithResult.put(t_.ARRAY, List.class);
        this.onExtraCallbackWithResult.put(t_.BINARY, getExpectExpressWidth.class);
        this.onExtraCallbackWithResult.put(t_.BOOLEAN, Boolean.class);
        this.onExtraCallbackWithResult.put(t_.DATE_TIME, Date.class);
        this.onExtraCallbackWithResult.put(t_.DB_POINTER, RFEndCardBackUpLayout2.class);
        this.onExtraCallbackWithResult.put(t_.DOCUMENT, jc6.class);
        this.onExtraCallbackWithResult.put(t_.DOUBLE, Double.class);
        this.onExtraCallbackWithResult.put(t_.INT32, Integer.class);
        this.onExtraCallbackWithResult.put(t_.INT64, Long.class);
        this.onExtraCallbackWithResult.put(t_.DECIMAL128, Decimal128.class);
        this.onExtraCallbackWithResult.put(t_.MAX_KEY, setClickListener.class);
        this.onExtraCallbackWithResult.put(t_.MIN_KEY, setBannerClickClosedListener.class);
        this.onExtraCallbackWithResult.put(t_.JAVASCRIPT, getRenderEngineCacheType.class);
        this.onExtraCallbackWithResult.put(t_.JAVASCRIPT_WITH_SCOPE, setClickCreativeListener.class);
        this.onExtraCallbackWithResult.put(t_.OBJECT_ID, ObjectId.class);
        this.onExtraCallbackWithResult.put(t_.REGULAR_EXPRESSION, ea41.class);
        this.onExtraCallbackWithResult.put(t_.STRING, String.class);
        this.onExtraCallbackWithResult.put(t_.SYMBOL, setBackupListener.class);
        this.onExtraCallbackWithResult.put(t_.TIMESTAMP, p_.class);
        this.onExtraCallbackWithResult.put(t_.UNDEFINED, jc4.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.onExtraCallbackWithResult.equals(((setClosedListenerKey) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }
}
