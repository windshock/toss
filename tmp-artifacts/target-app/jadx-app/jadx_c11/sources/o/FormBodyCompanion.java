package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class FormBodyCompanion {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i3 = onExtraCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-textbutton-mono");
                throw null;
            }
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-textbutton-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
