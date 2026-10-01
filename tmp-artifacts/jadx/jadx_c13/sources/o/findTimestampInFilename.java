package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface findTimestampInFilename {
    updateSeverityInternal onNavigationEvent(String str);

    default updateSeverityReason onWarmupCompleted(String str) {
        return onNavigationEvent(str).onNavigationEvent();
    }

    static findTimestampInFilename onNavigationEvent() {
        return getImpl.onWarmupCompleted();
    }
}
