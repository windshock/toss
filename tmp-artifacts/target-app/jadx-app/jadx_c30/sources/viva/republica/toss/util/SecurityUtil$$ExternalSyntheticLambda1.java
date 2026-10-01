package viva.republica.toss.util;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.dangerouslyReset;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ dangerouslyReset f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;

    public /* synthetic */ SecurityUtil$$ExternalSyntheticLambda1(String str, dangerouslyReset dangerouslyreset, String str2, String str3, String str4, String str5) {
        this.f$0 = str;
        this.f$1 = dangerouslyreset;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = str5;
    }

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (DialogInterface) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(442290255);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 24887, 723267295, false, "onExtraCallback", new Class[]{String.class, dangerouslyReset.class, String.class, String.class, String.class, String.class, DialogInterface.class});
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
}
