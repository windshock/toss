package viva.republica.toss.dev.screencapture;

import android.app.Activity;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$ReactNative$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Object f$0;

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            try {
                Object[] objArr = {this.f$0, (Activity) obj};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(912754667);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22037 - Color.blue(0)), Color.blue(0) + 42, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24488, 120027515, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (22037 - Color.green(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, 24488 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Activity.class});
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
        try {
            Object[] objArr2 = {this.f$0, (Activity) obj};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(912754667);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22037 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, ((byte) KeyEvent.getModifierMetaStateMask()) + 24489, 120027515, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 22038), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, 24488 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Activity.class});
            }
            ((Method) objOnExtraCallback2).invoke(null, objArr2);
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
