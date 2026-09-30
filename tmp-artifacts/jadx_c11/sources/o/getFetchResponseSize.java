package o;

import android.content.Context;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import im.toss.TossApplication;
import o.getClCode;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getFetchResponseSize extends TossApplication implements captureEndValues {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private boolean onWarmupCompleted = false;
    private final excludeObject onExtraCallback = new excludeObject(new excludeType() { // from class: o.getFetchResponseSize.5
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public Object onExtraCallback() {
            int i = 2 % 2;
            getClCode.onNavigationEvent onnavigationeventIAuthTabCallback = getAdDomain.IAuthTabCallback().onExtraCallback(new ApplicationContextModule(getFetchResponseSize.this)).IAuthTabCallback();
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationeventIAuthTabCallback;
        }
    });

    public final excludeObject cancelNotification() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        excludeObject excludeobject = this.onExtraCallback;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return excludeobject;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        excludeObject excludeobjectCancelNotification = cancelNotification();
        if (i3 == 0) {
            return excludeobjectCancelNotification.generatedComponent();
        }
        excludeobjectCancelNotification.generatedComponent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityCallbackStubProxy();
        super.onCreate();
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            int i4 = 58 / 0;
            if (this.onWarmupCompleted) {
                return;
            }
        } else if (this.onWarmupCompleted) {
            return;
        }
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.onWarmupCompleted = true;
        ((getColorFromAdObject) generatedComponent()).onWarmupCompleted((getFetchLatencyMillis) animate.onExtraCallbackWithResult(this));
        int i7 = IAuthTabCallback + 11;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
