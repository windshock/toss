package viva.republica.toss.crosscert;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PrivateCrossCert$$ExternalSyntheticLambda2 implements Handler.Callback {
    public final /* synthetic */ Object f$0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        try {
            Object[] objArr = {this.f$0, message};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1135016542);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 28961), View.MeasureSpec.getMode(0) + 48, KeyEvent.getDeadChar(0, 0) + 22744, -1927677134, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28960), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 48, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 22744), Message.class});
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
