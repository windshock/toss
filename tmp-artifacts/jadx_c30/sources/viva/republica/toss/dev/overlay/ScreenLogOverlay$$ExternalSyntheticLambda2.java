package viva.republica.toss.dev.overlay;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppLovinExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenLogOverlay$$ExternalSyntheticLambda2 implements Runnable {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AppLovinExceptionHandler f$0;
    public final /* synthetic */ PopupWindow f$1;
    public final /* synthetic */ View f$2;

    public /* synthetic */ ScreenLogOverlay$$ExternalSyntheticLambda2(AppLovinExceptionHandler appLovinExceptionHandler, PopupWindow popupWindow, View view) {
        this.f$0 = appLovinExceptionHandler;
        this.f$1 = popupWindow;
        this.f$2 = view;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = {this.f$0, this.f$1, this.f$2};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-216440062);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23131 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1034314350, false, "onWarmupCompleted", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 8, (ViewConfiguration.getJumpTapTimeout() >> 16) + 23131), PopupWindow.class, View.class});
            }
            Object obj = null;
            ((Method) objOnExtraCallback).invoke(null, objArr);
            int i5 = onNavigationEvent;
            int i6 = i5 & 43;
            int i7 = -(-((i5 ^ 43) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
