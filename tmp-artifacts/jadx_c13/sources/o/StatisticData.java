package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.StatisticData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StatisticData {
    public static final String IAuthTabCallback(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    public static final CoroutineContext IAuthTabCallback(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextOnExtraCallbackWithResult == putChannelInfo.onWarmupCompleted() || coroutineContextOnExtraCallbackWithResult.get(access13700.onWarmupCompleted) != null) ? coroutineContextOnExtraCallbackWithResult : coroutineContextOnExtraCallbackWithResult.plus(putChannelInfo.onWarmupCompleted());
    }

    public static final CoroutineContext IAuthTabCallback(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !onExtraCallback(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : onExtraCallbackWithResult(coroutineContext, coroutineContext2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(boolean z, CoroutineContext.Element element) {
        return z || (element instanceof loadFinish);
    }

    private static final boolean onExtraCallback(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(StatisticData.IAuthTabCallback(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext onExtraCallbackWithResult(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean zOnExtraCallback = onExtraCallback(coroutineContext);
        boolean zOnExtraCallback2 = onExtraCallback(coroutineContext2);
        if (!zOnExtraCallback && !zOnExtraCallback2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        access13600 access13600Var = access13600.IAuthTabCallback;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(access13600Var, new Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StatisticData.onExtraCallback(objectRef, z, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zOnExtraCallback2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(access13600Var, new Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatisticData.onWarmupCompleted((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext onExtraCallback(Ref.ObjectRef objectRef, boolean z, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof loadFinish)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) objectRef.element).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z ? ((loadFinish) element).onExtraCallback() : (loadFinish) element);
        }
        objectRef.element = ((CoroutineContext) objectRef.element).minusKey(element.getKey());
        return coroutineContext.plus(((loadFinish) element).onExtraCallbackWithResult(element2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext onWarmupCompleted(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (element instanceof loadFinish) {
            return coroutineContext.plus(((loadFinish) element).onExtraCallback());
        }
        return coroutineContext.plus(element);
    }

    public static final doPost<?> onWarmupCompleted(@NotNull access13800<?> access13800Var, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(access13800Var instanceof access14900) || coroutineContext.get(IStatisticMonitor.onWarmupCompleted) == null) {
            return null;
        }
        doPost<?> dopostOnExtraCallback = onExtraCallback((access14900) access13800Var);
        if (dopostOnExtraCallback != null) {
            dopostOnExtraCallback.onWarmupCompleted(coroutineContext, obj);
        }
        return dopostOnExtraCallback;
    }

    public static final doPost<?> onExtraCallback(@NotNull access14900 access14900Var) {
        while (!(access14900Var instanceof CheckRequestBodyModel) && (access14900Var = access14900Var.getCallerFrame()) != null) {
            if (access14900Var instanceof doPost) {
                return (doPost) access14900Var;
            }
        }
        return null;
    }
}
