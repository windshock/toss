package viva.republica.toss.util;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ Activity f$0;

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1418557948);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24887 - View.MeasureSpec.makeMeasureSpec(0, 0), 1707968364, false, "onNavigationEvent", new Class[]{Activity.class, CommonModule_setLeftEdgeTouchEnabled.class});
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
}
