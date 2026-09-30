package viva.republica.toss.dev.overlay;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.deInitialize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenInfoOverlayController$Companion$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        deInitialize deinitialize = (deInitialize) obj;
        if (i2 % 2 != 0) {
            try {
                Object[] objArr = {deinitialize};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(23028895);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23088, 807377423, false, "onNavigationEvent", new Class[]{deInitialize.class});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Object[] objArr2 = {deinitialize};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(23028895);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 41 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 23089 - (ViewConfiguration.getScrollBarSize() >> 8), 807377423, false, "onNavigationEvent", new Class[]{deInitialize.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback2).invoke(null, objArr2);
            int i3 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objInvoke;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
