package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface accessinit {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallbackWithResult;

    getORDER_BY_NAMEokhttp onNavigationEvent(float f);

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        static {
            int i = onExtraCallback + 91;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 5 / 0;
            }
        }

        private IAuthTabCallback() {
        }
    }
}
