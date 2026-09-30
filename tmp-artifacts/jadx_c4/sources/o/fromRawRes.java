package o;

import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface fromRawRes {
    List<DefaultVar> IAuthTabCallback();

    void IAuthTabCallback(@NotNull List<DefaultVar> list);

    void onExtraCallback(@NotNull String str, @NotNull String str2);

    void onExtraCallbackWithResult(@NotNull String str);

    void onExtraCallbackWithResult(@NotNull Map<String, String> map);

    String onNavigationEvent(@NotNull String str);

    Map<String, String> onNavigationEvent(@NotNull String... strArr);
}
