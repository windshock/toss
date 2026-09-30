package im.toss.feature.credit.ui.main.report;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditScoreReportViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public static boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
