package im.toss.feature.credit.ui.main.home;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditDualViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public static boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
