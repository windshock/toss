package im.toss.feature.credit.ui.main.home;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHomeViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public static boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
            return true;
        }
    }
}
