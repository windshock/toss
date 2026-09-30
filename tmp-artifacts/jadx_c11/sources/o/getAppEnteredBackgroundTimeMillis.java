package o;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.getAppEnteredBackgroundTimeMillis;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getAppEnteredBackgroundTimeMillis {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onNavigationEvent;

    public interface onExtraCallbackWithResult {
        getAppEnteredBackgroundTimeMillis ReportDrawnCompositionExternalSyntheticLambda0();
    }

    IAnimation<r8lambdaEK35TGWCjvE5YDlTcJsm53divws> IAuthTabCallback();

    void IAuthTabCallback(@NotNull r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws);

    r8lambdaEK35TGWCjvE5YDlTcJsm53divws onExtraCallback();

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        static final /* synthetic */ onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static final Lazy<getAppEnteredBackgroundTimeMillis> IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.util.AppOpenTrigger$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    getAppEnteredBackgroundTimeMillis.onWarmupCompleted.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
                getAppEnteredBackgroundTimeMillis getappenteredbackgroundtimemillisIAuthTabCallback = getAppEnteredBackgroundTimeMillis.onWarmupCompleted.IAuthTabCallback();
                int i3 = onExtraCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return getappenteredbackgroundtimemillisIAuthTabCallback;
                }
                throw null;
            }
        });

        public static /* synthetic */ getAppEnteredBackgroundTimeMillis IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getAppEnteredBackgroundTimeMillis getappenteredbackgroundtimemillisOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getappenteredbackgroundtimemillisOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted() {
        }

        static {
            int i = onExtraCallback + 1;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                int i2 = 83 / 0;
            }
        }

        public final getAppEnteredBackgroundTimeMillis onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getAppEnteredBackgroundTimeMillis getappenteredbackgroundtimemillis = (getAppEnteredBackgroundTimeMillis) IAuthTabCallback.getValue();
            int i4 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getappenteredbackgroundtimemillis;
        }

        private static final getAppEnteredBackgroundTimeMillis onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
            if (i3 == 0) {
                return ((onExtraCallbackWithResult) Response.onExtraCallback(contextOnExtraCallback, onExtraCallbackWithResult.class)).ReportDrawnCompositionExternalSyntheticLambda0();
            }
            ((onExtraCallbackWithResult) Response.onExtraCallback(contextOnExtraCallback, onExtraCallbackWithResult.class)).ReportDrawnCompositionExternalSyntheticLambda0();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
