package viva.republica.toss.dev.overlay;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppLovinExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenLogOverlay$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AppLovinExceptionHandler f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        AppLovinExceptionHandler appLovinExceptionHandler;
        String str;
        String str2;
        Map map;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = ((i2 & (-116)) | ((~i2) & 115)) + ((i2 & 115) << 1);
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            appLovinExceptionHandler = this.f$0;
            str = (String) obj;
            str2 = (String) obj2;
            map = (Map) obj3;
            int i4 = 17 / 0;
        } else {
            appLovinExceptionHandler = this.f$0;
            str = (String) obj;
            str2 = (String) obj2;
            map = (Map) obj3;
        }
        try {
            Object[] objArr = {appLovinExceptionHandler, str, str2, map};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-46843089);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), AndroidCharacter.getMirror('0') - '(', 23131 - (ViewConfiguration.getPressedStateDuration() >> 16), -864696897, false, "onExtraCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 9, 23131 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), String.class, String.class, Map.class});
            }
            Object obj4 = null;
            Object objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            int i5 = onWarmupCompleted + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvoke;
            }
            obj4.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
