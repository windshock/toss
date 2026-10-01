package im.toss.features.faceverify.impl.ui.pass;

import android.content.DialogInterface;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function0 function0 = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 != 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return (Unit) FacePassActivity.onExtraCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), -852387072, new Object[]{function0, dialogInterface}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 852387077);
        }
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
