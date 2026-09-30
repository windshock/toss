package viva.republica.toss.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.dangerouslyReset;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ dangerouslyReset f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;

    public /* synthetic */ SecurityUtil$$ExternalSyntheticLambda0(String str, String str2, String str3, dangerouslyReset dangerouslyreset, String str4, String str5) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = dangerouslyreset;
        this.f$4 = str4;
        this.f$5 = str5;
    }

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CommonModule_setLeftEdgeTouchEnabled) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2128718451);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 30 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24887, 1335973091, false, "IAuthTabCallback", new Class[]{String.class, String.class, String.class, dangerouslyReset.class, String.class, String.class, CommonModule_setLeftEdgeTouchEnabled.class});
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
