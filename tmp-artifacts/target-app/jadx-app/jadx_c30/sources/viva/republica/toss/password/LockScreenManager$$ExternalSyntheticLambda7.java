package viva.republica.toss.password;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.isJSONTypeIgnore;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ UIKitBaseActivity f$0;

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, (isJSONTypeIgnore) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1814794798);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 14 - Gravity.getAbsoluteGravity(0, 0), 24779 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1567321278, false, "onWarmupCompleted", new Class[]{UIKitBaseActivity.class, isJSONTypeIgnore.class});
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
