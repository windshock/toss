package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.addRuntimeMonitorLog;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableTransferTinyOpt {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r0 = 35 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            return kotlin.Result.IAuthTabCallback(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            r1 = o.enableTransferTinyOpt.IAuthTabCallback.IAuthTabCallback + 9;
            o.enableTransferTinyOpt.IAuthTabCallback.onExtraCallbackWithResult = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = enableTransferTinyOpt.onExtraCallbackWithResult((enablePreTaskOpt) null, (enableShowReminderOnAppPauseOpt) null, (getBacktraceNote) null, (access13800) this);
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = enableTransferTinyOpt.onWarmupCompleted(null, null, null, this);
            if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                int i2 = onExtraCallback + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return objOnWarmupCompleted;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(enablePreTaskOpt enablepretaskopt, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, getBacktraceNote getbacktracenote, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent(enablepretaskopt, enableshowreminderonapppauseopt, getbacktracenote, access13800Var);
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Object onWarmupCompleted(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, getBacktraceNote getbacktracenote, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, (getBacktraceNote<? super RememberLottieCompositionKtlottieComposition1, ? super UTF8Decoder, ? super access13800<? super kotlin.Result<Unit>>, ? extends Object>) getbacktracenote, (access13800<? super kotlin.Result<Unit>>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, (getBacktraceNote<? super RememberLottieCompositionKtlottieComposition1, ? super UTF8Decoder, ? super access13800<? super kotlin.Result<Unit>>, ? extends Object>) getbacktracenote, (access13800<? super kotlin.Result<Unit>>) access13800Var);
        int i3 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, getBacktraceNote<? super RememberLottieCompositionKtlottieComposition1, ? super UTF8Decoder, ? super access13800<? super kotlin.Result<Unit>>, ? extends Object> getbacktracenote, access13800<? super kotlin.Result<Unit>> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i4 = onnavigationevent.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    onnavigationevent.label = i4 - 2147483648;
                } else {
                    onnavigationevent.label = i4 - 2147483648;
                }
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object objInvoke = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onnavigationevent.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objInvoke);
            if (rememberLottieCompositionKtlottieComposition1 == null) {
                int i7 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Result.Companion companion = kotlin.Result.Companion;
                Object obj = kotlin.Result.constructor-impl(ResultKt.createFailure(addRuntimeMonitorLog.onNavigationEvent.onNavigationEvent));
                int i9 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return obj;
            }
            onnavigationevent.L$0 = access15400.onNavigationEvent(rememberLottieCompositionKtlottieComposition1);
            onnavigationevent.L$1 = access15400.onNavigationEvent(uTF8Decoder);
            onnavigationevent.L$2 = access15400.onNavigationEvent(getbacktracenote);
            onnavigationevent.label = 1;
            objInvoke = getbacktracenote.invoke(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, onnavigationevent);
            if (objInvoke == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            ResultKt.onNavigationEvent(objInvoke);
        }
        Object objOnNavigationEvent = ((kotlin.Result) objInvoke).onNavigationEvent();
        if (kotlin.Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(addRuntimeMonitorLog.onNavigationEvent.onNavigationEvent));
        }
        Result.Companion companion3 = kotlin.Result.Companion;
        Object obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
        int i13 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i13 % 128;
        if (i13 % 2 == 0) {
            return obj2;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object onNavigationEvent(enablePreTaskOpt enablepretaskopt, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, getBacktraceNote<? super enablePreTaskOpt, ? super enableShowReminderOnAppPauseOpt, ? super access13800<? super kotlin.Result<CreditOverview>>, ? extends Object> getbacktracenote, access13800<? super kotlin.Result<CreditOverview>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (!(!(access13800Var instanceof IAuthTabCallback))) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objInvoke = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objInvoke);
            if (enablepretaskopt == enablePreTaskOpt.NONE) {
                int i6 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    Result.Companion companion = kotlin.Result.Companion;
                    return kotlin.Result.constructor-impl((Object) null);
                }
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl((Object) null);
                throw null;
            }
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(enablepretaskopt);
            iAuthTabCallback.L$1 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
            iAuthTabCallback.L$2 = access15400.onNavigationEvent(getbacktracenote);
            iAuthTabCallback.label = 1;
            objInvoke = getbacktracenote.invoke(enablepretaskopt, enableshowreminderonapppauseopt, iAuthTabCallback);
            if (objInvoke == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objInvoke);
        }
        Object objOnNavigationEvent = ((kotlin.Result) objInvoke).onNavigationEvent();
        if (kotlin.Result.exceptionOrNull-impl(objOnNavigationEvent) == null) {
            Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl((CreditOverview) objOnNavigationEvent);
        }
        Result.Companion companion4 = kotlin.Result.Companion;
        return kotlin.Result.constructor-impl(ResultKt.createFailure(addRuntimeMonitorLog.onExtraCallback.IAuthTabCallback));
    }
}
