package viva.republica.toss.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ Activity f$0;

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, (DialogInterface) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1590229955);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 30 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24887, 1871185235, false, "onNavigationEvent", new Class[]{Activity.class, DialogInterface.class});
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
