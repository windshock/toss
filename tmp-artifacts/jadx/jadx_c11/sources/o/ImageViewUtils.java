package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ImageViewUtils implements r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageViewUtils() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public ImageViewUtils(boolean z, boolean z2) {
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z2), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageViewUtils(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i5 % 128;
            z2 = i5 % 2 != 0;
        }
        this(z, z2);
    }

    @Override // o.r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    @Override // o.r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback();
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    @Override // o.r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM
    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(z);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(z);
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
        throw null;
    }
}
