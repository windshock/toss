package o;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RetainInstanceUsageViolation {
    public abstract Object onExtraCallbackWithResult(Object obj);

    public abstract RetainInstanceUsageViolation onWarmupCompleted(Object obj, Object obj2);

    public static RetainInstanceUsageViolation onWarmupCompleted() {
        return onExtraCallback.onExtraCallbackWithResult();
    }

    public static class onExtraCallback extends RetainInstanceUsageViolation implements Serializable {
        protected static final onExtraCallback IAuthTabCallback = new onExtraCallback(Collections.EMPTY_MAP);
        protected static final Object onNavigationEvent = new Object();
        private static final long serialVersionUID = 1;
        protected final Map<?, ?> _shared;
        protected transient Map<Object, Object> onExtraCallbackWithResult;

        protected onExtraCallback(Map<?, ?> map) {
            this._shared = map;
            this.onExtraCallbackWithResult = null;
        }

        protected onExtraCallback(Map<?, ?> map, Map<Object, Object> map2) {
            this._shared = map;
            this.onExtraCallbackWithResult = map2;
        }

        public static RetainInstanceUsageViolation onExtraCallbackWithResult() {
            return IAuthTabCallback;
        }

        @Override // o.RetainInstanceUsageViolation
        public Object onExtraCallbackWithResult(Object obj) {
            Object obj2;
            Map<Object, Object> map = this.onExtraCallbackWithResult;
            if (map != null && (obj2 = map.get(obj)) != null) {
                if (obj2 == onNavigationEvent) {
                    return null;
                }
                return obj2;
            }
            return this._shared.get(obj);
        }

        @Override // o.RetainInstanceUsageViolation
        public RetainInstanceUsageViolation onWarmupCompleted(Object obj, Object obj2) {
            if (obj2 == null) {
                if (this._shared.containsKey(obj)) {
                    obj2 = onNavigationEvent;
                } else {
                    Map<Object, Object> map = this.onExtraCallbackWithResult;
                    if (map != null && map.containsKey(obj)) {
                        this.onExtraCallbackWithResult.remove(obj);
                    }
                    return this;
                }
            }
            Map<Object, Object> map2 = this.onExtraCallbackWithResult;
            if (map2 == null) {
                return onExtraCallback(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        protected RetainInstanceUsageViolation onExtraCallback(Object obj, Object obj2) {
            HashMap map = new HashMap();
            if (obj2 == null) {
                obj2 = onNavigationEvent;
            }
            map.put(obj, obj2);
            return new onExtraCallback(this._shared, map);
        }
    }
}
