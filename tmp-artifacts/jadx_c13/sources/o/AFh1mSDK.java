package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1mSDK {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final boolean onExtraCallbackWithResult(@NotNull Context context, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean zOnNavigationEvent = onNavigationEvent(context, Uri.parse(str));
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static final boolean onNavigationEvent(@NotNull Context context, @NotNull Uri uri) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            context.startActivity(intent);
            int i2 = onNavigationEvent + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } catch (ActivityNotFoundException e) {
            auth.onNavigationEvent.IAuthTabCallback(e, (Map) null);
            return false;
        }
    }
}
