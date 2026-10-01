package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetSDKVersion {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final void onNavigationEvent(@NotNull Map<String, Object> map, @Nullable String str, @Nullable String str2, @Nullable Long l) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null && !StringsKt.isBlank(str)) {
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("tns_id", str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            map.put("tns_id", str);
        }
        if (str2 != null && !StringsKt.isBlank(str2)) {
            map.put("tns_question_id", str2);
        }
        if (l != null) {
            int i3 = onNavigationEvent + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (l.longValue() > -1) {
                map.put("tns_service_id", l);
            }
        }
    }
}
