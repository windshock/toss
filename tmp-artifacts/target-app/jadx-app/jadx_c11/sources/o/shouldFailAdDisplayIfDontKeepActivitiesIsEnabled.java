package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
    default void IAuthTabCallback(float f) {
        int i = 2 % 2;
    }

    default void onExtraCallback(float f) {
        int i = 2 % 2;
    }

    default void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
    }

    default void onExtraCallbackWithResult(@Nullable Object obj) {
        int i = 2 % 2;
    }

    default void onNavigationEvent(float f) {
        int i = 2 % 2;
    }

    default void onWarmupCompleted(float f) {
        int i = 2 % 2;
    }
}
