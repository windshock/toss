package viva.republica.toss.util;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SecurityUtil$$ExternalSyntheticLambda6 implements deserializeFloat {
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.f$0, obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(297195040);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), View.resolveSizeAndState(0, 0, 0) + 30, ExpandableListView.getPackedPositionGroup(0L) + 24887, 553003184, false, "onWarmupCompleted", new Class[]{Function1.class, Object.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
