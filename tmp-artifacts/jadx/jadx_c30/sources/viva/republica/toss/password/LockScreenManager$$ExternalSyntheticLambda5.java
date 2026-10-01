package viva.republica.toss.password;

import android.view.View;
import android.view.ViewConfiguration;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DimensionPropConverterCompanion;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ UIKitBaseActivity f$0;
    public final /* synthetic */ DimensionPropConverterCompanion f$1;

    public /* synthetic */ LockScreenManager$$ExternalSyntheticLambda5(UIKitBaseActivity uIKitBaseActivity, DimensionPropConverterCompanion dimensionPropConverterCompanion) {
        this.f$0 = uIKitBaseActivity;
        this.f$1 = dimensionPropConverterCompanion;
    }

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, this.f$1, (Throwable) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-891406060);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, 24779 - View.combineMeasuredStates(0, 0), -73480316, false, "onExtraCallback", new Class[]{UIKitBaseActivity.class, DimensionPropConverterCompanion.class, Throwable.class});
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
