package viva.republica.toss.password;

import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TypeUtils7;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda1 implements Function1 {
    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {(TypeUtils7) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1917377990);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, 24779 - (ViewConfiguration.getTapTimeout() >> 16), 1124606806, false, "onExtraCallbackWithResult", new Class[]{TypeUtils7.class});
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
