package viva.republica.toss.password;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda4 implements deserializeFloat {
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1797023739);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 15, (ViewConfiguration.getTapTimeout() >> 16) + 24779, 1516018027, false, "IAuthTabCallback", new Class[]{Function1.class, Object.class});
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
