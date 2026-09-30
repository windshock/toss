package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGNodeRemoveChildJNI extends GeckoHubImp {
    public static final jni_YGNodeRemoveChildJNI IAuthTabCallback = new jni_YGNodeRemoveChildJNI();

    private jni_YGNodeRemoveChildJNI() {
    }

    @Override // o.GeckoHubImp
    public void onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        jni_YGNodeInsertChildJNI.onNavigationEvent.onNavigationEvent(runnable, true, true);
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        jni_YGNodeInsertChildJNI.onNavigationEvent.onNavigationEvent(runnable, true, false);
    }

    @Override // o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        setShowDividerHorizontal.onNavigationEvent(i);
        if (i >= jni_YGNodeRemoveAllChildrenJNI.IAuthTabCallback) {
            return setShowDividerHorizontal.onExtraCallback(this, str);
        }
        return super.onWarmupCompleted(i, str);
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return "Dispatchers.IO";
    }
}
