package o;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access4002 implements decodeRegion {
    private final setTid<Boolean> onExtraCallbackWithResult;

    public access4002() {
        setTid<Boolean> settidIAuthTabCallbackDefault = setTid.IAuthTabCallbackDefault(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(settidIAuthTabCallbackDefault, "");
        this.onExtraCallbackWithResult = settidIAuthTabCallbackDefault;
    }

    @Override // o.decodeRegion
    public /* bridge */ boolean isTabBarAlwaysOpaque() {
        return super.isTabBarAlwaysOpaque();
    }

    @Override // o.decodeRegion
    public /* bridge */ boolean shouldAnimateMainTabBarVisibility() {
        return super.shouldAnimateMainTabBarVisibility();
    }

    @Override // o.decodeRegion
    public void onMainTabBarVisibilityChanged(boolean z) {
        this.onExtraCallbackWithResult.onExtraCallback(Boolean.valueOf(z));
    }

    @Override // o.decodeRegion
    public getByteBuffer<Boolean> getMainTabBarVisibleState() {
        getByteBuffer<Boolean> interfaceDescriptor = this.onExtraCallbackWithResult.getInterfaceDescriptor();
        Intrinsics.checkNotNullExpressionValue(interfaceDescriptor, "");
        return interfaceDescriptor;
    }

    @Override // o.decodeRegion
    public boolean isMainTabBarCurrentlyVisible() {
        Boolean bool = (Boolean) this.onExtraCallbackWithResult.onWarmupCompleted();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
