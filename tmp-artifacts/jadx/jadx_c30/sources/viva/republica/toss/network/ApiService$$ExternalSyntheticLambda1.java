package viva.republica.toss.network;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ApiService$$ExternalSyntheticLambda1 implements Function0 {
    public final Object invoke() throws Throwable {
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(312788142);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 29426), 21 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), View.getDefaultSize(0, 0) + 24734, 602159678, false, "onWarmupCompleted", new Class[0]);
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
