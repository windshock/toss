package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface isDoNotSellSet {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallbackWithResult;

    default boolean onExtraCallback() {
        int i = 2 % 2;
        return false;
    }

    default boolean onWarmupCompleted() {
        int i = 2 % 2;
        return false;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = 0;
        static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static final isDoNotSellSet onNavigationEvent = new C0039onExtraCallbackWithResult();
        private static int onWarmupCompleted = 1;

        private onExtraCallbackWithResult() {
        }

        /* renamed from: o.isDoNotSellSet$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0039onExtraCallbackWithResult implements isDoNotSellSet {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            C0039onExtraCallbackWithResult() {
            }

            @Override // o.isDoNotSellSet
            public /* bridge */ boolean onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnExtraCallback = super.onExtraCallback();
                int i4 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return zOnExtraCallback;
            }

            @Override // o.isDoNotSellSet
            public /* bridge */ boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnWarmupCompleted = super.onWarmupCompleted();
                int i4 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return zOnWarmupCompleted;
            }
        }

        static {
            int i = IAuthTabCallback + 87;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final isDoNotSellSet onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
