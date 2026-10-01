package im.toss.feature.credit.ui.main.consulting;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditConsultingViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public static boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
