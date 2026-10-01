package im.toss.define;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface RegionScope {
    public static final Companion Companion = Companion.onNavigationEvent;

    public static final class Companion {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ Companion onNavigationEvent = new Companion();
        private static final Region IAuthTabCallback = new Region("kr");
        private static final Region onExtraCallback = new Region("au");

        private Companion() {
        }

        static {
            int i = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public final Region onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 85;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Region region = IAuthTabCallback;
            int i5 = i2 + 5;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return region;
        }
    }
}
