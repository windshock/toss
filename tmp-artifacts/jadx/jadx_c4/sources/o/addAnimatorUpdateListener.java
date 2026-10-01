package o;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface addAnimatorUpdateListener {
    void IAuthTabCallback(@NotNull Map<String, String> map);

    String onExtraCallbackWithResult(@NotNull String str);

    Map<String, String> onExtraCallbackWithResult(@NotNull String... strArr);

    void onNavigationEvent(@NotNull String str, @NotNull String str2);
}
