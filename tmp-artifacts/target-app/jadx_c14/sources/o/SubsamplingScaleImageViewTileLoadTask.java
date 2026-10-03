package o;

import android.view.View;
import com.tmoney.a;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.SubsamplingScaleImageViewTileLoadTask;
import o.getEnabledAmazonAdUnitIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageViewTileLoadTask {
    public static final SubsamplingScaleImageViewTileLoadTask onNavigationEvent = new SubsamplingScaleImageViewTileLoadTask();

    private SubsamplingScaleImageViewTileLoadTask() {
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull getEnabledAmazonAdUnitIds getenabledamazonadunitids, @Nullable View view, int i, @Nullable Integer num, @Nullable String str2, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getenabledamazonadunitids, "");
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(IAuthTabCallback(str, getenabledamazonadunitids, view, i, str2, function0), 100, num, 0, 4, (Object) null);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull getEnabledAmazonAdUnitIds getenabledamazonadunitids, @Nullable View view, int i, @Nullable Integer num, @Nullable String str2, @Nullable Function0<Unit> function0, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getenabledamazonadunitids, "");
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(IAuthTabCallback(str, getenabledamazonadunitids, view, i, str2, function0), i2, num, 0, 4, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final TdsToastV1.onNavigationEvent IAuthTabCallback(String str, getEnabledAmazonAdUnitIds getenabledamazonadunitids, View view, int i, String str2, final Function0<Unit> function0) throws NoWhenBranchMatchedException {
        TdsToastV1.onNavigationEvent onnavigationeventOnWarmupCompleted = isShowTransAnimate.onWarmupCompleted(TdsToastV1.Companion, str);
        if (view != null) {
            onnavigationeventOnWarmupCompleted.onNavigationEvent(view);
        }
        if (getenabledamazonadunitids instanceof getEnabledAmazonAdUnitIds.onWarmupCompleted) {
            TdsToastV1.onNavigationEvent.onNavigationEvent(onnavigationeventOnWarmupCompleted, ((getEnabledAmazonAdUnitIds.onWarmupCompleted) getenabledamazonadunitids).onExtraCallback(), 0, 2, (Object) null);
        } else {
            if (!(getenabledamazonadunitids instanceof getEnabledAmazonAdUnitIds.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            TdsToastV1.onNavigationEvent.onExtraCallback(onnavigationeventOnWarmupCompleted, ((getEnabledAmazonAdUnitIds.IAuthTabCallback) getenabledamazonadunitids).onExtraCallbackWithResult(), 0, 2, (Object) null);
        }
        if (str2 != null && !StringsKt.isBlank(str2) && function0 != null) {
            Object[] objArr = {onnavigationeventOnWarmupCompleted, str2, new Function1() { // from class: viva.republica.toss.main.GlobalSnackBar$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return SubsamplingScaleImageViewTileLoadTask.IAuthTabCallback(function0, (TdsToastV1) obj);
                }
            }};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        }
        return onnavigationeventOnWarmupCompleted.IAuthTabCallback(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Function0 function0, TdsToastV1 tdsToastV1) {
        Intrinsics.checkNotNullParameter(tdsToastV1, "");
        function0.invoke();
        return Unit.INSTANCE;
    }
}
