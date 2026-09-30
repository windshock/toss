package viva.republica.toss.util;

import android.os.Process;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda8 implements deserializeFloat {
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2121022075);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 29 - Process.getGidForName(BuildConfig.FLAVOR), 24887 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1328334059, false, "onNavigationEvent", new Class[]{Function1.class, Object.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
