package o;

import androidx.recyclerview.widget.RecyclerView;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.benefit.log.BenefitTabImpressionHandler;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVContactDialog extends RecyclerView.AdapterDataObserver {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Function0<List<SensorBridgeExtension3>> IAuthTabCallback;
    private final BenefitTabImpressionHandler onExtraCallback;
    private final AppSetIdAndScope1 onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RVContactDialog(@NotNull Function0<? extends List<? extends SensorBridgeExtension3>> function0, @NotNull BenefitTabImpressionHandler benefitTabImpressionHandler, @NotNull AppSetIdAndScope1 appSetIdAndScope1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(benefitTabImpressionHandler, "");
        Intrinsics.checkNotNullParameter(appSetIdAndScope1, "");
        this.IAuthTabCallback = function0;
        this.onExtraCallback = benefitTabImpressionHandler;
        this.onNavigationEvent = appSetIdAndScope1;
    }

    private final void onExtraCallbackWithResult(int i, int i2, String str, String str2) {
        Object obj;
        int i3 = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            List list = (List) this.IAuthTabCallback.invoke();
            int iCoerceAtMost = RangesKt.coerceAtMost(i2 + i, list.size());
            if (i < list.size()) {
                List listSubList = list.subList(i, iCoerceAtMost);
                if ((!(listSubList instanceof Collection)) || !listSubList.isEmpty()) {
                    Iterator it = listSubList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((SensorBridgeExtension3) it.next()) instanceof SensorBridgeExtension) {
                            Object[] objArr = {this.onExtraCallback, str};
                            BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), objArr);
                            break;
                        }
                    }
                }
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            int i4 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            int i6 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public void onChanged() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(0, ((List) this.IAuthTabCallback.invoke()).size(), "onChanged", "onChanged");
        int i4 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onItemRangeChanged(int i, int i2) {
        int i3 = 2 % 2;
        onExtraCallbackWithResult(i, i2, "onItemRangeChanged", "onItemRangeChanged");
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
        int i3 = 2 % 2;
        Objects.toString(obj);
        onExtraCallbackWithResult(i, i2, "onItemRangeChanged with payload:" + obj, "onItemRangeChanged");
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    public void onItemRangeInserted(int i, int i2) {
        int i3 = 2 % 2;
        onExtraCallbackWithResult(i, i2, "onItemRangeInserted", "onItemRangeInserted");
        int i4 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onItemRangeRemoved(int i, int i2) {
        int i3 = 2 % 2;
        Object[] objArr = {this.onExtraCallback, "onItemRangeRemoved"};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, iIAuthTabCallback, objArr);
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        int i4 = 2 % 2;
        Object[] objArr = {this.onExtraCallback, "onItemRangeMoved"};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, iIAuthTabCallback, objArr);
        int i5 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
