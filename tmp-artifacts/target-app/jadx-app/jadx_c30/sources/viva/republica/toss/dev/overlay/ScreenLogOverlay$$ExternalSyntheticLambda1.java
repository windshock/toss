package viva.republica.toss.dev.overlay;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppLovinExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenLogOverlay$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ AppLovinExceptionHandler f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ScreenLogOverlay$$ExternalSyntheticLambda1(AppLovinExceptionHandler appLovinExceptionHandler, String str, Map map, String str2) {
        this.f$0 = appLovinExceptionHandler;
        this.f$1 = str;
        this.f$2 = map;
        this.f$3 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 & 53;
        int i4 = ((i2 ^ 53) | i3) << 1;
        int i5 = -((~i3) & (i2 | 53));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        AppLovinExceptionHandler appLovinExceptionHandler = this.f$0;
        String str = this.f$1;
        Map map = this.f$2;
        int i8 = i2 + 109;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {appLovinExceptionHandler, str, map, this.f$3, view};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1339051770);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 8 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 23132, -2123411562, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((Process.getThreadPriority(0) + 20) >> 6), 8 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 23131 - View.combineMeasuredStates(0, 0)), String.class, Map.class, String.class, View.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            int i10 = onExtraCallback;
            int i11 = i10 & 99;
            int i12 = ((i10 | 99) & (~i11)) + (i11 << 1);
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
