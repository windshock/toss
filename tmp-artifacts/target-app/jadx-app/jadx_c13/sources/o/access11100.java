package o;

import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface access11100 {

    public enum onExtraCallbackWithResult {
        INITIAL,
        UPDATE,
        ERROR
    }

    public static class onExtraCallback {
        public final int IAuthTabCallback;
        public final int onExtraCallbackWithResult;

        public onExtraCallback(int i, int i2) {
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = i2;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.onExtraCallbackWithResult), Integer.valueOf(this.IAuthTabCallback));
        }
    }
}
