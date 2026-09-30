package viva.republica.toss.password;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DimensionPropConverterCompanion;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ UIKitBaseActivity f$0;
    public final /* synthetic */ DimensionPropConverterCompanion f$1;

    public /* synthetic */ LockScreenManager$$ExternalSyntheticLambda9(UIKitBaseActivity uIKitBaseActivity, DimensionPropConverterCompanion dimensionPropConverterCompanion) {
        this.f$0 = uIKitBaseActivity;
        this.f$1 = dimensionPropConverterCompanion;
    }

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, this.f$1, (Throwable) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1815437610);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - (Process.myTid() >> 22), 24778 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 1567989690, false, "onWarmupCompleted", new Class[]{UIKitBaseActivity.class, DimensionPropConverterCompanion.class, Throwable.class});
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
