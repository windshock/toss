package viva.republica.toss.dev;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatDialog;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossCertQrSignDevTool$showQrPage$1$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AppCompatDialog f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            try {
                Object[] objArr = {this.f$0, view};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(974562242);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9882), 32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myTid() >> 22) + 22907, 190209362, false, "onWarmupCompleted", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (Color.argb(0, 0, 0, 0) + 9882), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22906), View.class});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        try {
            Object[] objArr2 = {this.f$0, view};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(974562242);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 9882), 31 - Process.getGidForName(BuildConfig.FLAVOR), Color.red(0) + 22907, 190209362, false, "onWarmupCompleted", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 9882), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 32, 22907 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), View.class});
            }
            ((Method) objOnExtraCallback2).invoke(null, objArr2);
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
