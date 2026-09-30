package o;

import android.net.Uri;
import im.toss.core.webkit.MessageHandlerInterface$;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface drawTextBox {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallback;

    static /* synthetic */ boolean onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(str, str2);
    }

    default boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        return true;
    }

    default boolean onNavigationEvent() {
        int i = 2 % 2;
        return false;
    }

    default onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        return new onOutOfMemory.IAuthTabCallback(new MessageHandlerInterface$.ExternalSyntheticLambda0());
    }

    private static boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return filterCreatePageParams.onTransact(Uri.parse(str));
    }

    default ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        return ALCFaceValidation.WITHOUT_CONTENTS;
    }

    public static final class IAuthTabCallback {
        static final /* synthetic */ IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 33;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback() {
        }
    }
}
