package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jczb implements getNativeVideoController {
    private final ycx17 IAuthTabCallback = new ycx17();
    private final InheritableThreadLocal<Map<String, String>> onNavigationEvent = new InheritableThreadLocal<Map<String, String>>() { // from class: o.jczb.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    };
}
