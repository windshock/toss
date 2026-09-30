package viva.republica.toss.dev.screencapture;

import android.app.Activity;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$Web$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Object f$0;

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = ((i2 ^ 87) | (i2 & 87)) << 1;
        int i4 = -(((~i2) & 87) | (i2 & (-88)));
        int i5 = (i3 & i4) + (i4 | i3);
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            try {
                Object[] objArr = {this.f$0, (Activity) obj};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-731814217);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (9854 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 24658, -450783193, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (9853 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0)), 49 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 24659), Activity.class});
                }
                return ((Method) objOnExtraCallback).invoke(null, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Object[] objArr2 = {this.f$0, (Activity) obj};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-731814217);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (9853 - Color.green(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, 24658 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -450783193, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (9853 - Color.alpha(0)), 50 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), ExpandableListView.getPackedPositionChild(0L) + 24659), Activity.class});
            }
            int i6 = 57 / 0;
            return ((Method) objOnExtraCallback2).invoke(null, objArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
