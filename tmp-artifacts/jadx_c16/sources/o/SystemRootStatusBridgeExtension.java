package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.benefit.ui.component.ThumbnailAdMobController;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemRootStatusBridgeExtension extends ExoPlayerImplExternalSyntheticLambda3<BasicSystemInfoExtension, SensorBridgeExtension3, onExtraCallbackWithResult> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final Function1<String, Unit> IAuthTabCallback;
    private final Function1<BasicSystemInfoExtension, Unit> onExtraCallback;
    private final Function1<ThumbnailAdMobController, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemRootStatusBridgeExtension(@NotNull Function1<? super ThumbnailAdMobController, Unit> function1, @NotNull Function1<? super String, Unit> function12, @NotNull Function1<? super BasicSystemInfoExtension, Unit> function13) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.onNavigationEvent = function1;
        this.IAuthTabCallback = function12;
        this.onExtraCallback = function13;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((BasicSystemInfoExtension) obj, (onExtraCallbackWithResult) viewHolder, list);
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    public /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = onExtraCallback((SensorBridgeExtension3) obj, list, i);
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        int i6 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return zOnExtraCallback;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(viewGroup);
            obj.hashCode();
            throw null;
        }
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(viewGroup);
        int i3 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onextracallbackwithresultOnExtraCallback;
        }
        throw null;
    }

    protected boolean onExtraCallback(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
            Intrinsics.checkNotNullParameter(list, "");
            return sensorBridgeExtension3 instanceof BasicSystemInfoExtension;
        }
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof BasicSystemInfoExtension;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected onExtraCallbackWithResult onExtraCallback(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        sendHCEStateResult sendhcestateresultOnWarmupCompleted = sendHCEStateResult.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(sendhcestateresultOnWarmupCompleted, "");
        this.onNavigationEvent.invoke(sendhcestateresultOnWarmupCompleted.onWarmupCompleted);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(sendhcestateresultOnWarmupCompleted);
        onextracallbackwithresult.setIsRecyclable(false);
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    protected void onNavigationEvent(@NotNull BasicSystemInfoExtension basicSystemInfoExtension, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull List<Object> list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(basicSystemInfoExtension, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(list, "");
        onextracallbackwithresult.onNavigationEvent(basicSystemInfoExtension, this.IAuthTabCallback, this.onExtraCallback);
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
