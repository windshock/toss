package okhttp3;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.PlatformRegistry;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class OkHttp {
    public static final OkHttp INSTANCE = new OkHttp();
    public static final String VERSION = "5.3.2";

    private OkHttp() {
    }

    public final void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        PlatformRegistry platformRegistry = PlatformRegistry.INSTANCE;
        if (platformRegistry.getApplicationContext() == null) {
            platformRegistry.setApplicationContext(context.getApplicationContext());
        }
    }
}
