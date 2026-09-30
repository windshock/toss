package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface HorizontalCenterOpticallyKtExternalSyntheticLambda1 {

    public interface IAuthTabCallback {
        long onNavigationEvent(long j);
    }

    IAuthTabCallback onNavigationEvent();

    public static class onExtraCallback implements HorizontalCenterOpticallyKtExternalSyntheticLambda1 {
        private final IAuthTabCallback onExtraCallback = new IAuthTabCallback() { // from class: o.HorizontalCenterOpticallyKtExternalSyntheticLambda1.onExtraCallback.4
            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda1.IAuthTabCallback
            public long onNavigationEvent(long j) {
                return -1L;
            }
        };

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda1
        public IAuthTabCallback onNavigationEvent() {
            return this.onExtraCallback;
        }
    }

    public static class onWarmupCompleted implements HorizontalCenterOpticallyKtExternalSyntheticLambda1 {
        private final IAuthTabCallback onNavigationEvent = new IAuthTabCallback() { // from class: o.HorizontalCenterOpticallyKtExternalSyntheticLambda1.onWarmupCompleted.4
            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda1.IAuthTabCallback
            public long onNavigationEvent(long j) {
                return j;
            }
        };

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda1
        public IAuthTabCallback onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }

    public static class onExtraCallbackWithResult implements HorizontalCenterOpticallyKtExternalSyntheticLambda1 {
        long IAuthTabCallback = 0;

        long onExtraCallback() {
            long j = this.IAuthTabCallback;
            this.IAuthTabCallback = 1 + j;
            return j;
        }

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda1
        public IAuthTabCallback onNavigationEvent() {
            return new onExtraCallback();
        }

        class onExtraCallback implements IAuthTabCallback {
            private final setFirstBaselineToTopHeight<Long> onNavigationEvent = new setFirstBaselineToTopHeight<>();

            onExtraCallback() {
            }

            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda1.IAuthTabCallback
            public long onNavigationEvent(long j) {
                Long lValueOf = (Long) this.onNavigationEvent.onWarmupCompleted(j);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(onExtraCallbackWithResult.this.onExtraCallback());
                    this.onNavigationEvent.onExtraCallback(j, lValueOf);
                }
                return lValueOf.longValue();
            }
        }
    }
}
