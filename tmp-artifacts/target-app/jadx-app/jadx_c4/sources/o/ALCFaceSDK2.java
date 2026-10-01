package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCFaceSDK2 {
    Map<String, Object> onWarmupCompleted();

    default <T> ALCFaceSDKExternalSyntheticLambda5<T> IAuthTabCallback(@NotNull String str, @NotNull T t) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        return new ALCFaceSDKExternalSyntheticLambda5<>(this, str, t);
    }
}
