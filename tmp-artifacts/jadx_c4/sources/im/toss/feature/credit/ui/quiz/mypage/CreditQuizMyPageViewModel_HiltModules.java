package im.toss.feature.credit.ui.quiz.mypage;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditQuizMyPageViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public static boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
