package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import o.dj7;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dj7 {
    private final String IAuthTabCallback;
    private final Map<String, String> IAuthTabCallbackStub;
    private final int asBinder;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Map<String, String> onNavigationEvent = new HashMap();
    private final int onWarmupCompleted;

    public dj7(Map<String, String> map, String str) {
        this.IAuthTabCallbackStub = Collections.unmodifiableMap(map);
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            int length = entry.getKey().length();
            i = length > i ? length : i;
            i2 = length < i2 ? length : i2;
            String value = entry.getValue();
            int length2 = value.length();
            if (length2 > 0) {
                this.onNavigationEvent.computeIfAbsent(value, new Function() { // from class: org.apache.commons.compress.compressors.FileNameUtil$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return dj7.onExtraCallback(entry, (String) obj);
                    }
                });
                i4 = length2 > i4 ? length2 : i4;
                if (length2 < i3) {
                    i3 = length2;
                }
            }
        }
        this.onWarmupCompleted = i;
        this.onExtraCallbackWithResult = i4;
        this.onExtraCallback = i2;
        this.asBinder = i3;
        this.IAuthTabCallback = str;
    }

    public static /* synthetic */ String onExtraCallback(Map.Entry entry, String str) {
        return (String) entry.getKey();
    }
}
