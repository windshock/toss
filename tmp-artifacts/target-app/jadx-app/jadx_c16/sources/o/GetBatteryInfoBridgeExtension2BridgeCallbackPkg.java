package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GetBatteryInfoBridgeExtension2BridgeCallbackPkg extends ExoPlayerImplExternalSyntheticLambda3<DeviceOrientationBridgeExtension, SensorBridgeExtension3, onWarmupCompleted> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Function2<Boolean, String, Boolean> IAuthTabCallback;
    private final Function2<Context, String, Unit> onExtraCallbackWithResult;
    private final Function0<Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public GetBatteryInfoBridgeExtension2BridgeCallbackPkg(@NotNull Function2<? super Boolean, ? super String, Boolean> function2, @NotNull Function0<Unit> function0, @NotNull Function2<? super Context, ? super String, Unit> function22) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.IAuthTabCallback = function2;
        this.onNavigationEvent = function0;
        this.onExtraCallbackWithResult = function22;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((DeviceOrientationBridgeExtension) obj, (onWarmupCompleted) viewHolder, list);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = onExtraCallback((SensorBridgeExtension3) obj, list, i);
        int i5 = onWarmupCompleted + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return onwarmupcompletedOnExtraCallbackWithResult;
    }

    protected boolean onExtraCallback(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof DeviceOrientationBridgeExtension;
        int i5 = onWarmupCompleted + 109;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected onWarmupCompleted onExtraCallbackWithResult(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        getDisplayPostal getdisplaypostalOnExtraCallbackWithResult = getDisplayPostal.onExtraCallbackWithResult(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(getdisplaypostalOnExtraCallbackWithResult, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(getdisplaypostalOnExtraCallbackWithResult, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult);
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    protected void onWarmupCompleted(@NotNull DeviceOrientationBridgeExtension deviceOrientationBridgeExtension, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull List<Object> list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceOrientationBridgeExtension, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.contains("PAYLOAD_BANK_CARD_CASHBACK_REWARD_UPDATE")) {
            onwarmupcompleted.onExtraCallback(deviceOrientationBridgeExtension);
            return;
        }
        onwarmupcompleted.onExtraCallbackWithResult(deviceOrientationBridgeExtension);
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
