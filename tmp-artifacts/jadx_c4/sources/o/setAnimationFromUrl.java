package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setAnimationFromUrl {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public setAnimationFromUrl() {
        Boolean bool = Boolean.FALSE;
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
            int i3 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return zBooleanValue;
            }
            throw null;
        }
        ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
