package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class isAlphaNumeric implements encodeUriString {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Object IAuthTabCallback;
    private final getTimebase onNavigationEvent = notifyPublicListeners.onWarmupCompleted(0);
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public isAlphaNumeric(@Nullable Object obj, boolean z) {
        this.IAuthTabCallback = obj;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.encodeUriString
    public Object onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object obj2 = this.IAuthTabCallback;
        int i4 = i3 + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return obj2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.encodeUriString
    public int onNavigationEvent() {
        int iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iIAuthTabCallback = IAuthTabCallback();
            int i3 = 49 / 0;
        } else {
            iIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = onExtraCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.encodeUriString
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    @Override // o.encodeUriString
    public void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        if (i < 0) {
            throw new IllegalArgumentException((i + " must be >= 0").toString());
        }
        int i3 = onExtraCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallback(i);
            int i4 = onExtraCallbackWithResult + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        onExtraCallback(i);
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(z);
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
            int i3 = onExtraCallback + 83;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return iOnWarmupCompleted;
            }
            throw null;
        }
        this.onNavigationEvent.onWarmupCompleted();
        throw null;
    }

    private final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.onExtraCallback(i);
        int i5 = onExtraCallback + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = onExtraCallbackWithResult + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
        throw null;
    }
}
