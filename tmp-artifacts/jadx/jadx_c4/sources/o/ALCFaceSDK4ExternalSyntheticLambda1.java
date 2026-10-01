package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCFaceSDK4ExternalSyntheticLambda1 {
    void IAuthTabCallback();

    <T> void IAuthTabCallback(@NotNull String str, @NotNull T t);

    boolean IAuthTabCallback(@NotNull String str);

    void onExtraCallbackWithResult(@NotNull String str);

    <T> T onNavigationEvent(@NotNull String str, @NotNull Class<T> cls, @Nullable T t);
}
