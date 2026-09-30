package o;

import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DelayMetCommandHandlerExternalSyntheticLambda0$IAuthTabCallback implements WorkDatabaseCompanionExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    final /* synthetic */ DelayMetCommandHandlerExternalSyntheticLambda0 onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallbackWithResult = DelayMetCommandHandlerExternalSyntheticLambda0$IAuthTabCallback.this.onExtraCallbackWithResult(null, null, this);
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            obj2.hashCode();
            throw null;
        }
    }

    DelayMetCommandHandlerExternalSyntheticLambda0$IAuthTabCallback(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0) {
        this.onWarmupCompleted = delayMetCommandHandlerExternalSyntheticLambda0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(String str, WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
                int i3 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            DelayMetCommandHandlerExternalSyntheticLambda0.onWarmupCompleted(this.onWarmupCompleted).asInterface().incrementAndGet();
            getBorderRadius getborderradius = (getBorderRadius) DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1165915105, -1165915102);
            onnavigationevent.L$0 = str;
            onnavigationevent.L$1 = access15400.onNavigationEvent(workerUpdaterExternalSyntheticLambda2);
            onnavigationevent.label = 1;
            if (getborderradius.emit(workerUpdaterExternalSyntheticLambda2, onnavigationevent) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = (String) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1 = (WorkerUpdaterExternalSyntheticLambda1) DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(this.onWarmupCompleted).remove(str);
        if (workerUpdaterExternalSyntheticLambda1 != null) {
            workerUpdaterExternalSyntheticLambda1.onWarmupCompleted();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(String str, Throwable th, access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    onwarmupcompleted.label = i2 >> Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i2 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
                int i4 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onwarmupcompleted.label;
        if (i6 != 0) {
            int i7 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            DelayMetCommandHandlerExternalSyntheticLambda0.onWarmupCompleted(this.onWarmupCompleted).onWarmupCompleted().incrementAndGet();
            getBorderRadius getborderradiusOnNavigationEvent = DelayMetCommandHandlerExternalSyntheticLambda0.onNavigationEvent(this.onWarmupCompleted);
            onwarmupcompleted.L$0 = str;
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(th);
            onwarmupcompleted.label = 1;
            if (getborderradiusOnNavigationEvent.emit(th, onwarmupcompleted) == objOnWarmupCompleted) {
                int i9 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        }
        WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1 = (WorkerUpdaterExternalSyntheticLambda1) DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(this.onWarmupCompleted).remove(str);
        if (workerUpdaterExternalSyntheticLambda1 != null) {
            workerUpdaterExternalSyntheticLambda1.onWarmupCompleted();
            int i10 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }
}
