package o;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import o.UST_TRANS_Finalize;
import org.yaml.snakeyaml.representer.Represent;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getBSignPriKeyFH {
    protected final Map<Class<?>, Represent> onExtraCallbackWithResult = new HashMap();
    protected final Map<Class<?>, Represent> onExtraCallback = new LinkedHashMap();
    protected UST_TRANS_Finalize.onExtraCallback onNavigationEvent = UST_TRANS_Finalize.onExtraCallback.PLAIN;
    protected UST_TRANS_Finalize.onExtraCallbackWithResult onWarmupCompleted = UST_TRANS_Finalize.onExtraCallbackWithResult.AUTO;
    protected final Map<Object, getBSignPriKeyCCFFH> IAuthTabCallback = new IdentityHashMap<Object, getBSignPriKeyCCFFH>() { // from class: o.getBSignPriKeyFH.3
        private static final long serialVersionUID = -5576159264232131854L;

        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public getBSignPriKeyCCFFH put(Object obj, getBSignPriKeyCCFFH getbsignprikeyccffh) {
            return (getBSignPriKeyCCFFH) super.put(obj, new getBSignPriKey(getbsignprikeyccffh));
        }
    };
    private boolean onTransact = false;
}
