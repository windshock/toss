package o;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.snakeyaml.engine.v2.api.RepresentToNode;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class uh29 {
    protected final Map<Class<?>, RepresentToNode> onExtraCallback = new HashMap();
    protected final Map<Class<?>, RepresentToNode> onExtraCallbackWithResult = new LinkedHashMap();
    protected final Map<Object, uh2> onNavigationEvent = new IdentityHashMap<Object, uh2>() { // from class: o.uh29.5
        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public uh2 put(Object obj, uh2 uh2Var) {
            return (uh2) super.put(obj, new uh18(uh2Var));
        }
    };
    protected sya6 IAuthTabCallback = sya6.PLAIN;
    protected sya19 onWarmupCompleted = sya19.AUTO;

    public static /* synthetic */ uh16 IAuthTabCallback(Object obj) {
        return new uh16("Representer is not defined for " + obj.getClass());
    }
}
