package viva.republica.toss.util;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda5 implements Function1 {
    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {(Throwable) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1532633929);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 30 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 24887, 1780145625, false, "onWarmupCompleted", new Class[]{Throwable.class});
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
