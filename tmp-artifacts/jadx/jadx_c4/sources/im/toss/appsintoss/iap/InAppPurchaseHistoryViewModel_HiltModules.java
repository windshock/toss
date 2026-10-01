package im.toss.appsintoss.iap;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchaseHistoryViewModel_HiltModules {

    public static final class KeyModule {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public static boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 71;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
