package im.toss.features.foreigner.home.ui.test;

import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda31 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InventoryAdManager f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        if (i3 != 0) {
            return (Unit) setCallUrl.onExtraCallback(1787198320, iOnExtraCallback2, iOnExtraCallback, -1787198319, iOnExtraCallback3, iOnExtraCallback4, objArr);
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
