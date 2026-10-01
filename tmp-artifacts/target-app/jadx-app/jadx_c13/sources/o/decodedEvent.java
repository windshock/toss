package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface decodedEvent<T> {
    static <T> decodedEvent<T> onWarmupCompleted(String str) {
        return new getEvent(str);
    }
}
