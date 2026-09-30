package im.toss.feature.credit.ui.history.detail;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHistoryDetailViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public static boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
