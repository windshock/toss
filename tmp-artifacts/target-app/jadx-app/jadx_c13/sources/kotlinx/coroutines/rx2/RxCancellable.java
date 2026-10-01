package kotlinx.coroutines.rx2;

import o.deserializeFloatArray;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxCancellable implements deserializeFloatArray {
    private final getPackageType onExtraCallbackWithResult;

    public RxCancellable(@NotNull getPackageType getpackagetype) {
        this.onExtraCallbackWithResult = getpackagetype;
    }

    @Override // o.deserializeFloatArray
    public void cancel() {
        getPackageType.onWarmupCompleted.onWarmupCompleted(this.onExtraCallbackWithResult, null, 1, null);
    }
}
