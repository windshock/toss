package viva.republica.toss.dev.screencapture;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureObserver$$ExternalSyntheticLambda0 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Object f$0;

    public final Object invoke() throws Throwable {
        int i = 2 % 2;
        int i2 = (-2) - ((onNavigationEvent + 60) ^ (-1));
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            try {
                Object[] objArr = {this.f$0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-47642319);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 24 - Color.green(0), 24259 - (ViewConfiguration.getScrollBarSize() >> 8), -865470559, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 25, 24259 - (ViewConfiguration.getKeyRepeatDelay() >> 16))});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                obj.hashCode();
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
            Object[] objArr2 = {this.f$0};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-47642319);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24259 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -865470559, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24259 - (ViewConfiguration.getScrollDefaultDelay() >> 16))});
            }
            Object objInvoke = ((Method) objOnExtraCallback2).invoke(null, objArr2);
            int i3 = onNavigationEvent;
            int i4 = i3 & 23;
            int i5 = -(-(i3 | 23));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return objInvoke;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
