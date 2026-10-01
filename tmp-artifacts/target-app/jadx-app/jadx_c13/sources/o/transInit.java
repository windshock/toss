package o;

import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface transInit extends getTitleResource {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onNavigationEvent;

    Object IAuthTabCallback(@NotNull String str, @NotNull String str2, boolean z, @NotNull access13800<? super Boolean> access13800Var);

    Object IAuthTabCallback(@NotNull access13800<? super Boolean> access13800Var);

    Object onExtraCallback(@NotNull String str, @NotNull transGetSignPriKey transgetsignprikey, boolean z, @NotNull access13800<? super Boolean> access13800Var);

    Object onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull access13800<? super Boolean> access13800Var);

    Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super Boolean> access13800Var);

    Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super WritableMap> access13800Var);

    Object onNavigationEvent(@NotNull String str, boolean z, @NotNull access13800<? super WritableMap> access13800Var);

    Object onNavigationEvent(@NotNull access13800<? super Boolean> access13800Var);

    Object onNavigationEvent(boolean z, @NotNull access13800<? super WritableMap> access13800Var);
}
