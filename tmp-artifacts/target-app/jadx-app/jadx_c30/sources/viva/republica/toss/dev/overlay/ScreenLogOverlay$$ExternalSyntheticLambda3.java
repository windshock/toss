package viva.republica.toss.dev.overlay;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppLovinExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenLogOverlay$$ExternalSyntheticLambda3 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AppLovinExceptionHandler f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ScreenLogOverlay$$ExternalSyntheticLambda3(AppLovinExceptionHandler appLovinExceptionHandler, String str, Map map, String str2) {
        this.f$0 = appLovinExceptionHandler;
        this.f$1 = str;
        this.f$2 = map;
        this.f$3 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 & 23;
        int i4 = (i2 | 23) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        AppLovinExceptionHandler appLovinExceptionHandler = this.f$0;
        String str = this.f$1;
        Map map = this.f$2;
        String str2 = this.f$3;
        int i9 = i7 & 125;
        int i10 = ((i7 ^ 125) | i9) << 1;
        int i11 = -((i7 | 125) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        try {
            Object[] objArr = {appLovinExceptionHandler, str, map, str2};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1700761437);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 8 - (Process.myTid() >> 22), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23131, 1411346893, false, "onWarmupCompleted", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23131), String.class, Map.class, String.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            int i14 = onExtraCallback;
            int i15 = ((i14 & 111) - (~(-(-(i14 | 111))))) - 1;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
