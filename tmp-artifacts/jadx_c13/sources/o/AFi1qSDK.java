package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1qSDK {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private Long onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public final void onExtraCallback(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = l;
        this.onWarmupCompleted = false;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Long IAuthTabCallback(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Long l2 = this.onExtraCallbackWithResult;
        if (l2 == null) {
            return l;
        }
        int i4 = i2 + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return l2;
        }
        obj.hashCode();
        throw null;
    }

    public final AFi1oSDK onNavigationEvent(boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!this.onWarmupCompleted) {
                Long l = this.onExtraCallbackWithResult;
                this.onWarmupCompleted = true;
                this.onExtraCallbackWithResult = null;
                return new AFi1oSDK(true, l);
            }
        }
        AFi1oSDK aFi1oSDK = new AFi1oSDK(false, this.onExtraCallbackWithResult);
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return aFi1oSDK;
    }

    public final AFi1mSDK onWarmupCompleted() {
        int i = 2 % 2;
        Long l = this.onExtraCallbackWithResult;
        boolean z = this.onWarmupCompleted;
        this.onExtraCallbackWithResult = null;
        this.onWarmupCompleted = false;
        AFi1mSDK aFi1mSDK = new AFi1mSDK(!z, l);
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return aFi1mSDK;
        }
        throw null;
    }
}
