package im.toss.ble.gatt.client;

import o.WorkerUpdaterExternalSyntheticLambda1;
import o.isUseTextureView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossGattClientBleManager$$ExternalSyntheticLambda2 implements isUseTextureView {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ WorkerUpdaterExternalSyntheticLambda1 f$0;

    public final void onInvalidRequest() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        WorkerUpdaterExternalSyntheticLambda1.IAuthTabCallback(this.f$0);
        if (i3 != 0) {
            throw null;
        }
    }
}
