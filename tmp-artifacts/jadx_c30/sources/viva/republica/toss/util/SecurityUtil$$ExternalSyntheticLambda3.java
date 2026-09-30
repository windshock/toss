package viva.republica.toss.util;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ SecurityUtil$$ExternalSyntheticLambda3(String str, String str2, String str3, String str4, String str5) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$4 = str5;
    }

    public final Object invoke(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (SetDetectableSize) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(798123334);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), 24886 - ExpandableListView.getPackedPositionChild(0L), 517118934, false, "IAuthTabCallback", new Class[]{String.class, String.class, String.class, String.class, String.class, SetDetectableSize.class});
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
