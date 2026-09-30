package im.toss.tds.compose.foundation;

import androidx.lifecycle.ViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import o.access6900;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RememberInMemoryHolder extends ViewModel {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Map<String, access6900<Object>> onExtraCallback = new LinkedHashMap();

    public final Map<String, access6900<Object>> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<String, access6900<Object>> map = this.onExtraCallback;
        int i5 = i2 + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
