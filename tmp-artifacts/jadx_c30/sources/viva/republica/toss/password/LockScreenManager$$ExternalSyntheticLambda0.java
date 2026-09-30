package viva.republica.toss.password;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockScreenManager$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, (SetDetectableSize) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1024919844);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14 - Color.red(0), ImageFormat.getBitsPerPixel(0) + 24780, -207091636, false, "onExtraCallbackWithResult", new Class[]{String.class, SetDetectableSize.class});
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
