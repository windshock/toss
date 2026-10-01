package o;

import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getAvailableMediatedNetworks {
    AppLovinSdkSdkInitializationListener getAnimationStore();

    sslSocketFactory getScrollTriggerStore();

    default void clearAnimationStore() {
        int i = 2 % 2;
        getAnimationStore().onExtraCallbackWithResult();
        getScrollTriggerStore().IAuthTabCallback();
    }

    default isFireOS<?> getPlayable(@NotNull View view, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        return getAnimationStore().onNavigationEvent(view, j);
    }

    default isFireOS<?> getPlayable(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        return (isFireOS) CollectionsKt.firstOrNull(getAnimationStore().onWarmupCompleted(view));
    }

    default List<isFireOS<?>> getPlayables(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        return getAnimationStore().onWarmupCompleted(view);
    }

    default void clearPlayable(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        getAnimationStore().onNavigationEvent(view);
    }
}
