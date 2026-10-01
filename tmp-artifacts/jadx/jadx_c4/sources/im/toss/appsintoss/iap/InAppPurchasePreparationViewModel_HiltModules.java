package im.toss.appsintoss.iap;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchasePreparationViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public static boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
