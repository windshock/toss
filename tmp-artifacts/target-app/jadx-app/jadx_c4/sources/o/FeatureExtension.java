package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface FeatureExtension {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.IAuthTabCallback;

    default long IAuthTabCallback() {
        int i = 2 % 2;
        return 10485760L;
    }

    default long onExtraCallback() {
        int i = 2 % 2;
        return 0L;
    }

    default long onExtraCallbackWithResult() {
        int i = 2 % 2;
        return 102400L;
    }

    default long onNavigationEvent() {
        int i = 2 % 2;
        return 10000L;
    }

    default int onWarmupCompleted() {
        int i = 2 % 2;
        return 500;
    }

    public static final class onExtraCallbackWithResult {
        private static int asInterface = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static final FeatureExtension onExtraCallbackWithResult = new onWarmupCompleted();

        private onExtraCallbackWithResult() {
        }

        public static final class onWarmupCompleted implements FeatureExtension {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            onWarmupCompleted() {
            }

            @Override // o.FeatureExtension
            public /* bridge */ long IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                long jIAuthTabCallback = super.IAuthTabCallback();
                int i4 = onExtraCallback + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return jIAuthTabCallback;
            }

            @Override // o.FeatureExtension
            public /* bridge */ long onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                long jOnExtraCallback = super.onExtraCallback();
                int i4 = onExtraCallback + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return jOnExtraCallback;
                }
                throw null;
            }

            @Override // o.FeatureExtension
            public /* bridge */ long onExtraCallbackWithResult() {
                long jOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    jOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
                    int i3 = 66 / 0;
                } else {
                    jOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
                }
                int i4 = onExtraCallbackWithResult + 43;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return jOnExtraCallbackWithResult;
            }

            @Override // o.FeatureExtension
            public /* bridge */ long onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return super.onNavigationEvent();
                }
                super.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.FeatureExtension
            public /* bridge */ int onWarmupCompleted() {
                int iOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    iOnWarmupCompleted = super.onWarmupCompleted();
                    int i3 = 70 / 0;
                } else {
                    iOnWarmupCompleted = super.onWarmupCompleted();
                }
                int i4 = onExtraCallbackWithResult + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iOnWarmupCompleted;
            }
        }

        static {
            int i = onWarmupCompleted + 13;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 24 / 0;
            }
        }

        public final FeatureExtension onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 29;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FeatureExtension featureExtension = onExtraCallbackWithResult;
            int i4 = i3 + 115;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
            return featureExtension;
        }
    }
}
