package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class b10 {
    public static final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback;
        CoroutineContext context = access13800Var.getContext();
        getFullPackage.IAuthTabCallback(context);
        access13800 access13800VarOnExtraCallbackWithResult = access14200.onExtraCallbackWithResult(access13800Var);
        setFlexWrap setflexwrap = access13800VarOnExtraCallbackWithResult instanceof setFlexWrap ? (setFlexWrap) access13800VarOnExtraCallbackWithResult : null;
        if (setflexwrap == null) {
            objOnExtraCallback = Unit.INSTANCE;
        } else {
            if (setMaxLine.onWarmupCompleted(setflexwrap.onExtraCallback, context)) {
                setflexwrap.IAuthTabCallback(context, (CoroutineContext) Unit.INSTANCE);
            } else {
                StatisticModelPackageStatisticModel statisticModelPackageStatisticModel = new StatisticModelPackageStatisticModel();
                CoroutineContext coroutineContextPlus = context.plus(statisticModelPackageStatisticModel);
                Unit unit = Unit.INSTANCE;
                setflexwrap.IAuthTabCallback(coroutineContextPlus, (CoroutineContext) unit);
                if (statisticModelPackageStatisticModel.onExtraCallback && !setMaxLine.onWarmupCompleted(setflexwrap)) {
                    objOnExtraCallback = unit;
                }
            }
            objOnExtraCallback = access14100.onExtraCallback();
        }
        if (objOnExtraCallback == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
