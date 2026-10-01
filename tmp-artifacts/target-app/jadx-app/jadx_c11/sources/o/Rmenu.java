package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Rmenu {
    private static int onExtraCallback = 1;
    public static final Rmenu onExtraCallbackWithResult = new Rmenu();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 39;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private Rmenu() {
    }

    public static final class onNavigationEvent extends AppLovinWebViewActivityaExternalSyntheticLambda0 {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public onNavigationEvent(double d, double d2) {
            super(d, d2);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallback = (float) (1.0d - onNavigationEvent().onExtraCallback(1.0d - f));
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return fOnExtraCallback;
        }
    }
}
