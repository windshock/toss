package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieDrawableExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final getSupportedHighSpeedResolutions onNavigationEvent = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
    private final getSupportedHighSpeedResolutions onExtraCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            float fOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
            int i3 = IAuthTabCallback + 79;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return fOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
        this.onNavigationEvent.onNavigationEvent();
        throw null;
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.onNavigationEvent(f);
            int i3 = IAuthTabCallback + 103;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
                return;
            }
            return;
        }
        this.onNavigationEvent.onNavigationEvent(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        float fOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            fOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
            int i3 = 47 / 0;
        } else {
            fOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        }
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return fOnNavigationEvent;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.onNavigationEvent(f);
            int i3 = 41 / 0;
        } else {
            this.onExtraCallback.onNavigationEvent(f);
        }
    }
}
