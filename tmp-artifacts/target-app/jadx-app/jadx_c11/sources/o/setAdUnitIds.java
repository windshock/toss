package o;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.setAdUnitIds;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface setAdUnitIds {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallback;

    public interface onExtraCallbackWithResult {
        setAdUnitIds Rcolor();
    }

    boolean IAuthTabCallback();

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        static final /* synthetic */ IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static final Lazy<setAdUnitIds> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.guest.LoginStatus$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                setAdUnitIds setadunitidsOnExtraCallbackWithResult = setAdUnitIds.IAuthTabCallback.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return setadunitidsOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public static /* synthetic */ setAdUnitIds onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setAdUnitIds setadunitidsOnExtraCallback = onExtraCallback();
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return setadunitidsOnExtraCallback;
        }

        private IAuthTabCallback() {
        }

        static {
            int i = IAuthTabCallback + 73;
            asInterface = i % 128;
            int i2 = i % 2;
        }

        public final setAdUnitIds onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setAdUnitIds setadunitids = (setAdUnitIds) onExtraCallbackWithResult.getValue();
            if (i3 == 0) {
                return setadunitids;
            }
            throw null;
        }

        private static final setAdUnitIds onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
            if (i3 == 0) {
                int i4 = 34 / 0;
                return ((onExtraCallbackWithResult) Response.onExtraCallback(contextOnExtraCallback, onExtraCallbackWithResult.class)).Rcolor();
            }
            return ((onExtraCallbackWithResult) Response.onExtraCallback(contextOnExtraCallback, onExtraCallbackWithResult.class)).Rcolor();
        }
    }
}
