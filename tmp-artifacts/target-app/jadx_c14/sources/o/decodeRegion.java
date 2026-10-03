package o;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface decodeRegion {
    getByteBuffer<Boolean> getMainTabBarVisibleState();

    default boolean isMainTabBarCurrentlyVisible() {
        return true;
    }

    default boolean isTabBarAlwaysOpaque() {
        return true;
    }

    default void onMainTabBarVisibilityChanged(boolean z) {
    }

    default boolean shouldAnimateMainTabBarVisibility() {
        return true;
    }
}
