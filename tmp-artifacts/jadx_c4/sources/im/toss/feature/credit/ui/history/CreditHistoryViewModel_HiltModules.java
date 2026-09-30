package im.toss.feature.credit.ui.history;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHistoryViewModel_HiltModules {

    public static final class KeyModule {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public static boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
