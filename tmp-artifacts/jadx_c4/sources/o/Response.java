package o;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Response {
    public static final Response onNavigationEvent = new Response();

    private Response() {
    }

    @JvmStatic
    public static final <T> T onExtraCallback(@NotNull Context context, @NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) setSlingshotDistance.onNavigationEvent(FragmentTransitionSupport.IAuthTabCallback(context.getApplicationContext()), cls);
    }

    @JvmStatic
    public static final <T> T onWarmupCompleted(@NotNull Activity activity, @NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) setSlingshotDistance.onNavigationEvent(activity, cls);
    }
}
