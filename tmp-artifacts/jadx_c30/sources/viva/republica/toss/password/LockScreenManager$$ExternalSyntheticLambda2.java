package viva.republica.toss.password;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DimensionPropConverterCompanion;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ DimensionPropConverterCompanion f$0;

    public final Object invoke() throws Throwable {
        try {
            Object[] objArr = {this.f$0};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2057906646);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 14 - View.getDefaultSize(0, 0), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 24779, 1273616198, false, "onExtraCallback", new Class[]{DimensionPropConverterCompanion.class});
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
