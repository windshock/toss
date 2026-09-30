package o;

import android.view.animation.Interpolator;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.setAuthenticatorokhttp;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setAuthenticatorokhttp {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextInfiniteMotionPreset$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Interpolator interpolatorOnWarmupCompleted = setAuthenticatorokhttp.onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            return interpolatorOnWarmupCompleted;
        }
    });

    public static /* synthetic */ Interpolator onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorAsInterface = asInterface();
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return interpolatorAsInterface;
    }

    public abstract AnimateText.IAuthTabCallback IAuthTabCallback();

    public abstract int onExtraCallback();

    public abstract Pair<AppLovinSdkSettings, AppLovinSdkSettings> onNavigationEvent();

    public final Interpolator onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.onWarmupCompleted.getValue();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return interpolator;
    }

    private static final Interpolator asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.46f), Float.valueOf(0.03f), Float.valueOf(0.52f), Float.valueOf(0.96f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = onExtraCallback + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return interpolator;
    }

    public interface onExtraCallback {

        public static final class onExtraCallbackWithResult extends setAuthenticatorokhttp implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallback + 31;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            @Override // o.setAuthenticatorokhttp
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 85;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return 100;
            }

            private onExtraCallbackWithResult() {
            }

            @Override // o.setAuthenticatorokhttp
            public Pair<AppLovinSdkSettings, AppLovinSdkSettings> onNavigationEvent() {
                int i = 2 % 2;
                Pair<AppLovinSdkSettings, AppLovinSdkSettings> pair = new Pair<>(isMuted.onNavigationEvent(RallysKt.onExtraCallback(onExtraCallbackWithResult(), 1200), (Float) null, Float.valueOf(0.4f), (Function1) null, 5, (Object) null), isMuted.onNavigationEvent(RallysKt.onExtraCallback(onExtraCallbackWithResult(), 1200), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null));
                int i2 = IAuthTabCallback + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return pair;
            }

            @Override // o.setAuthenticatorokhttp
            public AnimateText.IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                int i4 = IAuthTabCallback + 83;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }
        }
    }

    public interface onNavigationEvent {

        public static final class onExtraCallback extends setAuthenticatorokhttp implements onNavigationEvent {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            private final int IAuthTabCallback;
            private final int onExtraCallbackWithResult;

            @Override // o.setAuthenticatorokhttp
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 31;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 89;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 80;
            }

            public onExtraCallback(int i, int i2) {
                this.onExtraCallbackWithResult = i;
                this.IAuthTabCallback = i2;
            }

            public final int IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 115;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.onExtraCallbackWithResult;
                int i5 = i2 + 19;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public final int asBinder() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.IAuthTabCallback;
                if (i3 == 0) {
                    int i5 = 55 / 0;
                }
                return i4;
            }

            @Override // o.setAuthenticatorokhttp
            public Pair<AppLovinSdkSettings, AppLovinSdkSettings> onNavigationEvent() {
                int i = 2 % 2;
                Pair<AppLovinSdkSettings, AppLovinSdkSettings> pair = new Pair<>(isMuted.IAuthTabCallback(RallysKt.onExtraCallback(onExtraCallbackWithResult(), 1200), Integer.valueOf(this.onExtraCallbackWithResult), Integer.valueOf(this.IAuthTabCallback), (Function1) null, 4, (Object) null), isMuted.IAuthTabCallback(RallysKt.onExtraCallback(onExtraCallbackWithResult(), 1200), Integer.valueOf(this.IAuthTabCallback), Integer.valueOf(this.onExtraCallbackWithResult), (Function1) null, 4, (Object) null));
                int i2 = onExtraCallback + 17;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return pair;
                }
                throw null;
            }

            @Override // o.setAuthenticatorokhttp
            public AnimateText.IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                    throw null;
                }
                AnimateText.IAuthTabCallback iAuthTabCallback2 = AnimateText.IAuthTabCallback.Char;
                int i3 = onExtraCallback + 73;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return iAuthTabCallback2;
            }
        }
    }
}
