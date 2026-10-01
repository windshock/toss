package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class MaxAdPlacer extends getOptionsContentViewGroup implements setStarRatingContentViewGroupId {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxAdPlacer(@NotNull setBodyTextViewId setbodytextviewid, @NotNull MaxNativeAdViewa maxNativeAdViewa, boolean z) {
        super(setbodytextviewid);
        Intrinsics.checkNotNullParameter(setbodytextviewid, "");
        Intrinsics.checkNotNullParameter(maxNativeAdViewa, "");
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(maxNativeAdViewa, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.setStarRatingContentViewGroupId
    public MaxNativeAdViewa onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MaxNativeAdViewa maxNativeAdViewaIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = IAuthTabCallback + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return maxNativeAdViewaIAuthTabCallbackStub;
    }

    @Override // o.setStarRatingContentViewGroupId
    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface();
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setStarRatingContentViewGroupId
    public void IAuthTabCallback(@NotNull MaxNativeAdViewa maxNativeAdViewa) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxNativeAdViewa, "");
        onNavigationEvent(maxNativeAdViewa);
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(z);
        if (i3 != 0) {
            throw null;
        }
    }

    private final MaxNativeAdViewa IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
            return (MaxNativeAdViewa) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        return (MaxNativeAdViewa) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    private final void onNavigationEvent(MaxNativeAdViewa maxNativeAdViewa) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(maxNativeAdViewa);
            int i3 = 20 / 0;
        } else {
            this.onExtraCallbackWithResult.IAuthTabCallback(maxNativeAdViewa);
        }
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = 79 / 0;
        } else {
            this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
        }
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
