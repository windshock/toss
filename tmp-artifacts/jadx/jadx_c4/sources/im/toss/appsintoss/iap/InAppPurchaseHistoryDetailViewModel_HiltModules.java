package im.toss.appsintoss.iap;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchaseHistoryDetailViewModel_HiltModules {

    public static final class KeyModule {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public static boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
            return true;
        }
    }
}
