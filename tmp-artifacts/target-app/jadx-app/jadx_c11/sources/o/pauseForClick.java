package o;

import android.content.Context;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface pauseForClick {
    onExtraCallbackWithResult onExtraCallbackWithResult(@NotNull Context context, @NotNull Uri uri, boolean z);

    public interface onExtraCallbackWithResult {

        public static final class IAuthTabCallback implements onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

            static {
                int i = IAuthTabCallback + 55;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private IAuthTabCallback() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onWarmupCompleted() {
            }
        }
    }
}
