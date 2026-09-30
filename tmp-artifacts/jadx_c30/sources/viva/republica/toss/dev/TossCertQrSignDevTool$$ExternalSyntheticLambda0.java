package viva.republica.toss.dev;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossCertQrSignDevTool$$ExternalSyntheticLambda0 implements DialogInterface.OnDismissListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Ref.BooleanRef f$1;

    public /* synthetic */ TossCertQrSignDevTool$$ExternalSyntheticLambda0(Function1 function1, Ref.BooleanRef booleanRef) {
        this.f$0 = function1;
        this.f$1 = booleanRef;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 & 79;
        int i4 = i3 + ((i2 ^ 79) | i3);
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            try {
                Object[] objArr = {this.f$0, this.f$1, dialogInterface};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(9023835);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 44537), 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 22893, 835276747, false, "IAuthTabCallback", new Class[]{Function1.class, Ref.BooleanRef.class, DialogInterface.class});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        try {
            Object[] objArr2 = {this.f$0, this.f$1, dialogInterface};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(9023835);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (44537 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), (-16777202) - Color.rgb(0, 0, 0), 22893 - (ViewConfiguration.getTouchSlop() >> 8), 835276747, false, "IAuthTabCallback", new Class[]{Function1.class, Ref.BooleanRef.class, DialogInterface.class});
            }
            ((Method) objOnExtraCallback2).invoke(null, objArr2);
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
