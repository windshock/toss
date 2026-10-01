package im.toss.tosssecurities.widget.watchlist.setting.product;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WidgetProductSelectViewModel_HiltModules {

    public static final class KeyModule {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public static boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
