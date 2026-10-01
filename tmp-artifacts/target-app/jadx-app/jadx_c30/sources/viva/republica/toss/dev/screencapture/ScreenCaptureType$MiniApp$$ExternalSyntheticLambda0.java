package viva.republica.toss.dev.screencapture;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$MiniApp$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = (((i2 | 50) << 1) - (i2 ^ 50)) - 1;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        Activity activity = (Activity) obj;
        if (i3 % 2 == 0) {
            try {
                Object[] objArr = {activity};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1715362050);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (55936 - Color.green(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 24446, 1467918226, false, "onExtraCallback", new Class[]{Activity.class});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                obj2.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Object[] objArr2 = {activity};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1715362050);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 55937), Color.rgb(0, 0, 0) + 16777258, 24446 - KeyEvent.normalizeMetaState(0), 1467918226, false, "onExtraCallback", new Class[]{Activity.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback2).invoke(null, objArr2);
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvoke;
            }
            obj2.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
