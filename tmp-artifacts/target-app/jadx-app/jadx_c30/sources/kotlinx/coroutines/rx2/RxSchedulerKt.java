package kotlinx.coroutines.rx2;

import io.reactivex.plugins.RxJavaPlugins;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import o.access13800;
import o.access14300;
import o.bigDecimalOrDouble;
import o.deserializeUriNullableCollection;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getChannelIndex;
import o.setDeployments;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RxSchedulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeUriNullableCollection onWarmupCompleted(findResAndMsg findresandmsg, Runnable runnable, long j, Function1<? super Function1<? super access13800<? super Unit>, ? extends Object>, ? extends Runnable> function1) {
        CoroutineContext coroutineContext = findresandmsg.getCoroutineContext();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RxSchedulerKt.onWarmupCompleted(objectRef);
            }
        });
        Runnable runnable2 = (Runnable) function1.invoke(new RxSchedulerKt$scheduleTask$toSchedule$1(deserializeurinullablecollectionOnExtraCallback, coroutineContext, RxJavaPlugins.onNavigationEvent(runnable)));
        if (!findRes.onWarmupCompleted(findresandmsg)) {
            return bigDecimalOrDouble.onExtraCallback();
        }
        if (j <= 0) {
            runnable2.run();
            return deserializeurinullablecollectionOnExtraCallback;
        }
        objectRef.element = formatMsgs.onExtraCallback(coroutineContext).onWarmupCompleted(j, runnable2, coroutineContext);
        return deserializeurinullablecollectionOnExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Ref.ObjectRef objectRef) {
        setDeployments setdeployments = (setDeployments) objectRef.element;
        if (setdeployments != null) {
            setdeployments.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection, CoroutineContext coroutineContext, final Runnable runnable, access13800<? super Unit> access13800Var) {
        RxSchedulerKt$scheduleTask$task$1 rxSchedulerKt$scheduleTask$task$1;
        if (access13800Var instanceof RxSchedulerKt$scheduleTask$task$1) {
            rxSchedulerKt$scheduleTask$task$1 = (RxSchedulerKt$scheduleTask$task$1) access13800Var;
            int i = rxSchedulerKt$scheduleTask$task$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                rxSchedulerKt$scheduleTask$task$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                rxSchedulerKt$scheduleTask$task$1 = new RxSchedulerKt$scheduleTask$task$1(access13800Var);
            }
        }
        Object obj = rxSchedulerKt$scheduleTask$task$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = rxSchedulerKt$scheduleTask$task$1.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (deserializeurinullablecollection.isDisposed()) {
                    return Unit.INSTANCE;
                }
                Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return RxSchedulerKt.onExtraCallback(runnable);
                    }
                };
                rxSchedulerKt$scheduleTask$task$1.L$0 = coroutineContext;
                rxSchedulerKt$scheduleTask$task$1.label = 1;
                if (getChannelIndex.onWarmupCompleted((CoroutineContext) null, function0, rxSchedulerKt$scheduleTask$task$1, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineContext = (CoroutineContext) rxSchedulerKt$scheduleTask$task$1.L$0;
                ResultKt.onNavigationEvent(obj);
            }
        } catch (Throwable th) {
            RxCancellableKt.onNavigationEvent(th, coroutineContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Runnable runnable) {
        runnable.run();
        return Unit.INSTANCE;
    }
}
