package im.toss.securities.widget.overview.ui.setting;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossSecWidgetOverviewSettingViewModel_HiltModules {

    public static final class KeyModule {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public static boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
