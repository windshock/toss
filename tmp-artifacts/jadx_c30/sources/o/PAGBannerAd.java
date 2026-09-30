package o;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGBannerAd extends ClassVisitor {
    public static int onExtraCallbackWithResult = 262144;
    private addNetworkExtrasBundle IAuthTabCallback;
    private final onNavigationEvent onNavigationEvent;
    private final onExtraCallback onWarmupCompleted;

    public class onExtraCallback extends FieldVisitor {
        public onExtraCallback() {
            super(PAGBannerAd.onExtraCallbackWithResult);
        }
    }

    public class onNavigationEvent extends MethodVisitor {
        public onNavigationEvent() {
            super(PAGBannerAd.onExtraCallbackWithResult);
        }
    }

    public PAGBannerAd() {
        super(onExtraCallbackWithResult);
        this.onWarmupCompleted = new onExtraCallback();
        this.onNavigationEvent = new onNavigationEvent();
    }

    public addNetworkExtrasBundle onWarmupCompleted() {
        return this.IAuthTabCallback;
    }
}
