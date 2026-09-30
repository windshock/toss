package viva.republica.toss.dev.screencapture;

import android.app.Activity;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$ReactNative$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Object f$0;

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 & 39;
        int i4 = (((i2 | 39) & (~i3)) - (~(i3 << 1))) - 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = {this.f$0, (Activity) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1016578320);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22037 - (Process.myPid() >> 22)), KeyEvent.getDeadChar(0, 0) + 42, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 24489, 232210304, false, "onWarmupCompleted", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (22037 - (KeyEvent.getMaxKeyCode() >> 16)), 42 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 24488 - View.MeasureSpec.getSize(0)), Activity.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            int i6 = onNavigationEvent;
            int i7 = ((i6 ^ 21) | (i6 & 21)) << 1;
            int i8 = -(((~i6) & 21) | (i6 & (-22)));
            int i9 = (i7 & i8) + (i8 | i7);
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
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
