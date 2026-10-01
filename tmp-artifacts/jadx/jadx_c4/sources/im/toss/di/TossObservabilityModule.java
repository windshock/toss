package im.toss.di;

import android.content.Context;
import im.toss.state.spec.SessionState;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.PageExitListener;
import o.PlayerErrorCode;
import o.a6a;
import o.a8;
import o.clearFaultAdjacentMetadata;
import o.doCreateCallbackThread;
import o.drawTextProgress;
import o.getLocationStatus;
import o.getNetworkAccess;
import o.getScreenDensityDpi;
import o.getTextProgressSize;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.service.SchemeLabActivity;
import viva.republica.toss.splash.BaseSchemeActivity;
import viva.republica.toss.splash.SchemeActivity;
import viva.republica.toss.splash.SplashActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossObservabilityModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final TossObservabilityModule onNavigationEvent = new TossObservabilityModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TossObservabilityModule() {
    }

    @Singleton
    public final Set<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{SplashActivity.class.getName(), BaseSchemeActivity.class.getName(), SchemeActivity.class.getName(), SchemeLabActivity.class.getName()});
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return setOnExtraCallback;
    }

    public static final class onWarmupCompleted implements doCreateCallbackThread {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Context IAuthTabCallback;
        final /* synthetic */ SessionState onExtraCallback;
        final /* synthetic */ a8 onNavigationEvent;

        onWarmupCompleted(Context context, SessionState sessionState, a8 a8Var) {
            this.IAuthTabCallback = context;
            this.onExtraCallback = sessionState;
            this.onNavigationEvent = a8Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public getScreenDensityDpi onNavigationEvent() {
            boolean z;
            String code;
            int i = 2 % 2;
            getNetworkAccess getnetworkaccessOnWarmupCompleted = getScreenDensityDpi.onWarmupCompleted();
            doCreateCallbackThread.onWarmupCompleted onwarmupcompleted = doCreateCallbackThread.Companion;
            getNetworkAccess getnetworkaccessOnNavigationEvent = getnetworkaccessOnWarmupCompleted.onNavigationEvent(onwarmupcompleted.onExtraCallback(), PageExitListener.IAuthTabCallback(this.IAuthTabCallback).toLanguageTag()).onNavigationEvent(onwarmupcompleted.onExtraCallbackWithResult(), this.onExtraCallback.onNavigationEvent());
            getLocationStatus getlocationstatusOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            if (this.onNavigationEvent.onWarmupCompleted() != null) {
                z = true;
            } else {
                int i2 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                z = false;
            }
            getNetworkAccess getnetworkaccessOnNavigationEvent2 = getnetworkaccessOnNavigationEvent.onNavigationEvent(getlocationstatusOnNavigationEvent, Boolean.valueOf(z));
            getLocationStatus getlocationstatusIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            drawTextProgress drawtextprogressOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
            if (drawtextprogressOnWarmupCompleted != null) {
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                code = drawtextprogressOnWarmupCompleted.getCode();
                if (code == null) {
                    code = "";
                }
            }
            getScreenDensityDpi getscreendensitydpiOnExtraCallback = getnetworkaccessOnNavigationEvent2.onNavigationEvent(getlocationstatusIAuthTabCallback, code).onNavigationEvent(onwarmupcompleted.onWarmupCompleted(), PlayerErrorCode.onMinimized()).onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(getscreendensitydpiOnExtraCallback, "");
            int i6 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return getscreendensitydpiOnExtraCallback;
        }
    }

    @Singleton
    public final doCreateCallbackThread onExtraCallbackWithResult(@NotNull Context context, @NotNull SessionState sessionState, @NotNull a8 a8Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(a8Var, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(context, sessionState, a8Var);
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return onwarmupcompleted;
    }

    public final a6a IAuthTabCallback(@NotNull getTextProgressSize gettextprogresssize, @NotNull SessionState sessionState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gettextprogresssize, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        a6a a6aVar = new a6a(gettextprogresssize, sessionState, PlayerErrorCode.onMinimized());
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return a6aVar;
    }
}
