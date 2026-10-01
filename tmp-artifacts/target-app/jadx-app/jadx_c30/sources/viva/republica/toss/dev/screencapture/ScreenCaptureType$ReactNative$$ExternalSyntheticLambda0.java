package viva.republica.toss.dev.screencapture;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$ReactNative$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Object f$0;

    public final Object invoke() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 & 71;
        int i4 = ((((i2 ^ 71) | i3) << 1) - (~(-((i2 | 71) & (~i3))))) - 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = {this.f$0};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1956737629);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22037), View.combineMeasuredStates(0, 0) + 42, (ViewConfiguration.getJumpTapTimeout() >> 16) + 24488, -1172409549, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (KeyEvent.normalizeMetaState(0) + 22037), 42 - KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 24488)});
            }
            Object objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 & 1;
            int i8 = (i6 | 1) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 & i9) + (i8 | i9);
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 85 / 0;
            }
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
