package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface FragmentStateAdapter1 {
    default void onNavigationEvent(@NotNull OkHttpClient.Builder builder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
    }
}
