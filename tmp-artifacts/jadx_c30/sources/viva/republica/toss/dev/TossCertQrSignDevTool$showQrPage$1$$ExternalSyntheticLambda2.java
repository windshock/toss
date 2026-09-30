package viva.republica.toss.dev;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatDialog;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossCertQrSignDevTool$showQrPage$1$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Ref.BooleanRef f$0;
    public final /* synthetic */ AppCompatDialog f$1;

    public /* synthetic */ TossCertQrSignDevTool$showQrPage$1$$ExternalSyntheticLambda2(Ref.BooleanRef booleanRef, AppCompatDialog appCompatDialog) {
        this.f$0 = booleanRef;
        this.f$1 = appCompatDialog;
    }

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 & 67;
        int i4 = (i3 - (~(-(-((i2 ^ 67) | i3))))) - 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = {this.f$0, this.f$1, (View) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176684051);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (9883 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 31 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22907, 1002898051, false, "onWarmupCompleted", new Class[]{Ref.BooleanRef.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9881), Color.red(0) + 32, 22907 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), View.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            int i6 = IAuthTabCallback;
            int i7 = ((i6 ^ 103) | (i6 & 103)) << 1;
            int i8 = -(((~i6) & 103) | (i6 & (-104)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                return objInvoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
