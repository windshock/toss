package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViewsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk {
    private static int IAuthTabCallback = 1;
    public static final r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk onExtraCallback = new r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk() {
    }

    public final <T extends RemoteViewsService> Intent onExtraCallback(@NotNull Context context, @NotNull Class<T> cls, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.fromParts("content", i + "_" + System.currentTimeMillis(), null));
        int i3 = onNavigationEvent + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }
}
