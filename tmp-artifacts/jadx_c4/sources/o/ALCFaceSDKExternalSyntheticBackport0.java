package o;

import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDKExternalSyntheticBackport0 {
    private static final getFaceSDK IAuthTabCallback = new onExtraCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public static final class onExtraCallback implements getFaceSDK {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallback() {
        }

        @Override // o.getFaceSDK
        public Date onExtraCallback() {
            int i = 2 % 2;
            Date date = new Date(System.currentTimeMillis());
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return date;
        }
    }

    static {
        int i = onNavigationEvent + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final getFaceSDK IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getFaceSDK getfacesdk = IAuthTabCallback;
        int i5 = i2 + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getfacesdk;
    }
}
