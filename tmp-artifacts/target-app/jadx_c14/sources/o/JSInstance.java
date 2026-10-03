package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.HalfHourlySyncReq;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSInstance {
    private final int IAuthTabCallback;
    private final List<HalfHourlySyncReq.Step> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSInstance)) {
            return false;
        }
        JSInstance jSInstance = (JSInstance) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, jSInstance.onExtraCallbackWithResult) && this.IAuthTabCallback == jSInstance.IAuthTabCallback;
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "StepRecordingData(halfHourlySteps=" + this.onExtraCallbackWithResult + ", todayStepCount=" + this.IAuthTabCallback + ")";
    }

    public JSInstance(@NotNull List<HalfHourlySyncReq.Step> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = i;
    }

    public final List<HalfHourlySyncReq.Step> IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final int onExtraCallback() {
        return this.IAuthTabCallback;
    }
}
