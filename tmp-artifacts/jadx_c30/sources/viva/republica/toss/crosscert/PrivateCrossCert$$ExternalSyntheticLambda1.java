package viva.republica.toss.crosscert;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PrivateCrossCert$$ExternalSyntheticLambda1 implements Handler.Callback {
    public final /* synthetic */ Object f$0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        try {
            Object[] objArr = {this.f$0, message};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1117694160);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - (Process.myTid() >> 22)), 48 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 22744, -1943950944, false, "onNavigationEvent", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (28960 - (ViewConfiguration.getTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 48, 22744 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Message.class});
            }
            return ((Boolean) ((Method) objOnExtraCallback).invoke(null, objArr)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
