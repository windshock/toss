package o;

import im.toss.devtool.domain.network.DevCustomHeaderProvider$Companion$;
import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public interface getSplashView {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onExtraCallbackWithResult;

    Map<String, String> onWarmupCompleted();

    public static final class onWarmupCompleted {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);
        static final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static final Lazy<getSplashView> onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i4;
            int i9 = ~i2;
            int i10 = (~(i7 | i9)) | i8;
            int i11 = ~(i9 | i8 | i7);
            int i12 = i4 + i6 + i + ((-112346298) * i5) + (505796074 * i3);
            int i13 = i12 * i12;
            int i14 = ((1543607772 * i4) - 1525940224) + (1734765094 * i6) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i) + (859308032 * i5) + (310902784 * i3) + (417529856 * i13);
            int i15 = (i4 * (-1233303660)) + 1670658458 + (i6 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i * (-1233302909)) + (i5 * 1075253458) + (i3 * 745806526) + (i13 * 1512636416);
            int i16 = i14 + (i15 * i15 * (-1737162752));
            return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if (((((i4 & i3) | (i3 ^ i4)) >> 14) & 1) != 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted() {
        }

        static {
            DevCustomHeaderProvider$Companion$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new DevCustomHeaderProvider$Companion$.ExternalSyntheticLambda0();
            int iOnWarmupCompleted = ((IAuthTabCallback ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517)) >> 10) & 1;
            onWarmupCompleted = LazyKt.onExtraCallbackWithResult(externalSyntheticLambda0);
            if (iOnWarmupCompleted == 0) {
                int i = 70 / 0;
            }
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4403);
            int i3 = (~iOnWarmupCompleted2) & i2;
            int i4 = (~i2) & iOnWarmupCompleted2;
            if (((((i4 & i3) | (i3 ^ i4)) >> 18) & 1) == 0) {
                int i5 = 6 / 0;
            }
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5320);
            if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 15) & 1) == 0) {
                return (getSplashView) onWarmupCompleted.getValue();
            }
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2116);
            Response response = Response.onNavigationEvent;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallbackWithResult.class);
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 30) & 1;
            Object obj = null;
            getSplashView getsplashview = (getSplashView) onextracallbackwithresult.onRelationshipValidationResult$2257361c();
            if (i3 != 0) {
                throw null;
            }
            int i4 = IAuthTabCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1495);
            int i5 = (~iOnWarmupCompleted2) & i4;
            int i6 = (~i4) & iOnWarmupCompleted2;
            if (((((i6 & i5) | (i5 ^ i6)) >> 23) & 1) != 0) {
                return getsplashview;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ getSplashView onExtraCallback() {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (getSplashView) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1706016469, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1706016467);
        }

        private static final getSplashView onNavigationEvent() {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (getSplashView) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1911502655, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1911502655);
        }

        public final getSplashView onExtraCallbackWithResult() {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (getSplashView) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 266816693, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -266816692);
        }
    }
}
