package viva.republica.toss.util;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.dangerouslyReset;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ dangerouslyReset f$0;

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, (DialogInterface) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1525686328);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 29 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 24888, -1806753448, false, "onNavigationEvent", new Class[]{dangerouslyReset.class, DialogInterface.class});
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
