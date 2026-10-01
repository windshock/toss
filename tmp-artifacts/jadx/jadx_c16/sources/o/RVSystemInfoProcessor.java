package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVSystemInfoProcessor extends ExoPlayerImplExternalSyntheticLambda3<watchShake, SensorBridgeExtension3, onNavigationEvent> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Function2<Context, watchShake, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RVSystemInfoProcessor(@NotNull Function2<? super Context, ? super watchShake, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.onNavigationEvent = function2;
    }

    public /* bridge */ /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onExtraCallbackWithResult((watchShake) obj, (onNavigationEvent) viewHolder, (List<Object>) list);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted((SensorBridgeExtension3) obj, list, i);
        int i5 = IAuthTabCallback + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return zOnWarmupCompleted;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onNavigationEvent = onNavigationEvent(viewGroup);
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onNavigationEvent;
    }

    protected boolean onWarmupCompleted(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof watchShake;
        int i5 = onExtraCallback + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected onNavigationEvent onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        setOnItemClickListener setonitemclicklistenerOnNavigationEvent = setOnItemClickListener.onNavigationEvent(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(setonitemclicklistenerOnNavigationEvent, "");
        onNavigationEvent onnavigationevent = new onNavigationEvent(setonitemclicklistenerOnNavigationEvent);
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    protected void onExtraCallbackWithResult(@NotNull watchShake watchshake, @NotNull onNavigationEvent onnavigationevent, @NotNull List<Object> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(watchshake, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(list, "");
            onnavigationevent.onNavigationEvent(watchshake, this.onNavigationEvent);
            throw null;
        }
        Intrinsics.checkNotNullParameter(watchshake, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(list, "");
        onnavigationevent.onNavigationEvent(watchshake, this.onNavigationEvent);
        int i3 = onExtraCallback + 81;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
