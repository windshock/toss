package viva.republica.toss.dev.screencapture;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$ReactNative$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ ScreenCaptureType$ReactNative$$ExternalSyntheticLambda4(Object obj, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = obj;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = {this.f$0, this.f$1, (View) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1532895769);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22038 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 43, 24488 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1780407433, false, "onExtraCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (22037 - Color.alpha(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, 24488 - View.MeasureSpec.getMode(0)), getTypedExportedConstants.class, View.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            int i5 = onWarmupCompleted;
            int i6 = i5 & 85;
            int i7 = (i5 | 85) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 & i8) + (i7 | i8);
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 40 / 0;
            }
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
