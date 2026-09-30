package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.AppLovinError;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface AppLovinError {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        AppLovinError ReportDrawnKtExternalSyntheticLambda2();
    }

    void IAuthTabCallback(boolean z);

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();
        private static final Lazy<AppLovinError> IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.core.ApplicationProcessManager$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinError appLovinErrorOnWarmupCompleted = AppLovinError.onWarmupCompleted.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinErrorOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });

        public static /* synthetic */ AppLovinError onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AppLovinError appLovinErrorIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return appLovinErrorIAuthTabCallback;
        }

        private onWarmupCompleted() {
        }

        static {
            int i = onExtraCallbackWithResult + 75;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                int i2 = 79 / 0;
            }
        }

        public final AppLovinError onExtraCallbackWithResult() {
            AppLovinError appLovinError;
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                appLovinError = (AppLovinError) IAuthTabCallback.getValue();
                int i3 = 48 / 0;
            } else {
                appLovinError = (AppLovinError) IAuthTabCallback.getValue();
            }
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return appLovinError;
        }

        private static final AppLovinError IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            AppLovinError appLovinErrorReportDrawnKtExternalSyntheticLambda2 = ((onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallbackWithResult.class)).ReportDrawnKtExternalSyntheticLambda2();
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return appLovinErrorReportDrawnKtExternalSyntheticLambda2;
        }
    }
}
