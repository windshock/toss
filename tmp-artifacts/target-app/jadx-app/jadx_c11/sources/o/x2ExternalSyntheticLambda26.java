package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda26 implements x2ExternalSyntheticLambda28 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;

    public x2ExternalSyntheticLambda26(boolean z) {
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.x2ExternalSyntheticLambda28
    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    private final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
            int i3 = IAuthTabCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return zBooleanValue;
        }
        ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }
}
