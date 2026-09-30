package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getFollowSslRedirectsokhttp {
    void onNavigationEvent(@Nullable hasProvider hasprovider);

    default void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        if (str == null) {
            str = "";
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null));
    }
}
