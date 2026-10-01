package im.toss.features.foreigner.home.ui.test;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.flipHorizontally;
import o.getSupportedHighSpeedResolutions;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (flipHorizontally) obj};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        if (i3 != 0) {
            return (Unit) setCallUrl.onExtraCallback(793478775, iOnExtraCallback2, iOnExtraCallback, -793478764, iOnExtraCallback3, iOnExtraCallback4, objArr);
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
