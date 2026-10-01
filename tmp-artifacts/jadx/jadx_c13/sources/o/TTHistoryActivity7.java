package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int onExtraCallbackWithResult(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }
}
