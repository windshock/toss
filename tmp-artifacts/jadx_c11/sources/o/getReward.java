package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getReward {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final getSupportedHighSpeedResolutions onNavigationEvent;

    public getReward(float f) {
        this.onNavigationEvent = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
    }

    public final getSupportedHighSpeedResolutions onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = this.onNavigationEvent;
        int i4 = i3 + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutions;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(f);
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
