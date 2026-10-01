package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface RestrictionAllowlist {
    public static final onExtraCallback Companion = onExtraCallback.onWarmupCompleted;

    void onExtraCallbackWithResult();

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallback + 57;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onExtraCallback() {
        }
    }
}
