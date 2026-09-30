package viva.republica.toss.network;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ApiService$$ExternalSyntheticLambda2 implements Function0 {
    public final Object invoke() throws Throwable {
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-905719671);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, 24734 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -79483367, false, "onNavigationEvent", new Class[0]);
            }
            return ((Method) objOnExtraCallback).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
