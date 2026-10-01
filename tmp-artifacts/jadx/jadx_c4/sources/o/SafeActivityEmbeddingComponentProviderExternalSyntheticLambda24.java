package o;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda24 implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35> IAuthTabCallback;
    private final getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34> onExtraCallback;
    private final getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35> onNavigationEvent;
    private final getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34> onWarmupCompleted;

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda24() {
        getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted;
        this.onWarmupCompleted = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onNavigationEvent = getborderradiusOnWarmupCompleted2;
        this.IAuthTabCallback = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted2);
    }

    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20
    public getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20
    public getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35> IAuthTabCallback() {
        getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35> gettilemodex;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 19;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            gettilemodex = this.IAuthTabCallback;
            int i4 = 30 / 0;
        } else {
            gettilemodex = this.IAuthTabCallback;
        }
        int i5 = i2 + 9;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20
    public Object onNavigationEvent(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34 safeActivityEmbeddingComponentProviderExternalSyntheticLambda34, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objEmit = this.onExtraCallback.emit(safeActivityEmbeddingComponentProviderExternalSyntheticLambda34, access13800Var);
        if (objEmit == access14300.onWarmupCompleted()) {
            int i2 = IAuthTabCallbackStub + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return objEmit;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20
    public Object onExtraCallback(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35 safeActivityEmbeddingComponentProviderExternalSyntheticLambda35, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objEmit = this.onNavigationEvent.emit(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35, access13800Var);
        if (objEmit == access14300.onWarmupCompleted()) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return objEmit;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return unit;
    }
}
