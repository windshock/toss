package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class initOneSlotMultipleAdsLayout {
    static int onNavigationEvent(int i) {
        if (i <= 9) {
            return i;
        }
        return 0;
    }

    static int onWarmupCompleted(int i) {
        if (i >= 12) {
            return i - 11;
        }
        return 0;
    }

    initOneSlotMultipleAdsLayout() {
    }
}
