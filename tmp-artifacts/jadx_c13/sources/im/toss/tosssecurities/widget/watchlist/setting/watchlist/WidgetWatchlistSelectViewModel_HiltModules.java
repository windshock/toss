package im.toss.tosssecurities.widget.watchlist.setting.watchlist;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WidgetWatchlistSelectViewModel_HiltModules {

    public static final class KeyModule {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public static boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
