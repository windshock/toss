package o;

import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getRawResponse {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

    default boolean IAuthTabCallback() {
        int i = 2 % 2;
        return false;
    }

    default boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        return false;
    }

    default float onExtraCallbackWithResult() {
        int i = 2 % 2;
        return 0.0f;
    }

    default boolean onNavigationEvent() {
        int i = 2 % 2;
        return false;
    }

    default float onWarmupCompleted() {
        int i = 2 % 2;
        return 0.0f;
    }

    default String onExtraCallback() {
        int i = 2 % 2;
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public static final class IAuthTabCallback {
        private static int asBinder = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();
        private static final getRawResponse IAuthTabCallback = new onNavigationEvent();

        public static final class onNavigationEvent implements getRawResponse {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            onNavigationEvent() {
            }

            @Override // o.getRawResponse
            public /* bridge */ boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return super.IAuthTabCallback();
                }
                super.IAuthTabCallback();
                throw null;
            }

            @Override // o.getRawResponse
            public /* bridge */ boolean IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return super.IAuthTabCallbackStub();
                }
                super.IAuthTabCallbackStub();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.getRawResponse
            public /* bridge */ String onExtraCallback() {
                String strOnExtraCallback;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    strOnExtraCallback = super.onExtraCallback();
                    int i3 = 5 / 0;
                } else {
                    strOnExtraCallback = super.onExtraCallback();
                }
                int i4 = IAuthTabCallback + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return strOnExtraCallback;
            }

            @Override // o.getRawResponse
            public /* bridge */ float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                float fOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 43 / 0;
                }
                return fOnExtraCallbackWithResult;
            }

            @Override // o.getRawResponse
            public /* bridge */ boolean onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnNavigationEvent = super.onNavigationEvent();
                int i4 = IAuthTabCallback + 39;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return zOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.getRawResponse
            public /* bridge */ float onWarmupCompleted() {
                float fOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    fOnWarmupCompleted = super.onWarmupCompleted();
                    int i3 = 7 / 0;
                } else {
                    fOnWarmupCompleted = super.onWarmupCompleted();
                }
                int i4 = IAuthTabCallback + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return fOnWarmupCompleted;
            }
        }

        private IAuthTabCallback() {
        }

        static {
            int i = onNavigationEvent + 85;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getRawResponse onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getRawResponse getrawresponse = IAuthTabCallback;
            int i5 = i2 + 101;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return getrawresponse;
            }
            throw null;
        }
    }
}
