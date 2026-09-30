package o;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface F0 {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.IAuthTabCallback;

    public interface IAuthTabCallback {
        F0 RequiresFeature();
    }

    String IAuthTabCallback(@Nullable Activity activity);

    public static final class onExtraCallbackWithResult {
        static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 71;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallbackWithResult() {
        }

        public final F0 onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Response response = Response.onNavigationEvent;
                ((IAuthTabCallback) Response.onExtraCallback(context, IAuthTabCallback.class)).RequiresFeature();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Response response2 = Response.onNavigationEvent;
            F0 f0RequiresFeature = ((IAuthTabCallback) Response.onExtraCallback(context, IAuthTabCallback.class)).RequiresFeature();
            int i3 = onExtraCallback + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return f0RequiresFeature;
        }
    }
}
