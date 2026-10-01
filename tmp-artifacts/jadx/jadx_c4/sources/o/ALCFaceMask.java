package o;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCFaceMask {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onWarmupCompleted;

    IAnimation<MotionEvent> extraCallback();

    void onExtraCallback(@NotNull MotionEvent motionEvent);

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        static final /* synthetic */ onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = IAuthTabCallback + 49;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class IAuthTabCallback implements ALCFaceMask {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final getBorderRadius<MotionEvent> onExtraCallback;
            private final IAnimation<MotionEvent> onNavigationEvent;

            IAuthTabCallback() {
                getBorderRadius<MotionEvent> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 1, CloseableUtils.DROP_OLDEST, 1, (Object) null);
                this.onExtraCallback = getborderradiusOnWarmupCompleted;
                this.onNavigationEvent = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
            }

            @Override // o.ALCFaceMask
            public IAnimation<MotionEvent> extraCallback() {
                IAnimation<MotionEvent> iAnimation;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 39;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 != 0) {
                    iAnimation = this.onNavigationEvent;
                    int i4 = 11 / 0;
                } else {
                    iAnimation = this.onNavigationEvent;
                }
                int i5 = i3 + 35;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return iAnimation;
            }

            @Override // o.ALCFaceMask
            public void onExtraCallback(MotionEvent motionEvent) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(motionEvent, "");
                this.onExtraCallback.onNavigationEvent(motionEvent);
                int i4 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public final ALCFaceMask onWarmupCompleted() {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
