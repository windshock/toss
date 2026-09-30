package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.addRuntimeMonitorLog;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSortedAppVersionsThresholdValue {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final enableLitePreloadOpt onNavigationEvent;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[enablePreTaskOpt.values().length];
            try {
                iArr[enablePreTaskOpt.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[enablePreTaskOpt.GET_LOCAL_OR_REMOTE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[enablePreTaskOpt.GET_LOCAL_OR_REFRESH.ordinal()] = 3;
                int i = onExtraCallbackWithResult + 117;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[enablePreTaskOpt.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue = getSortedAppVersionsThresholdValue.this;
            if (i3 != 0 ? (objIAuthTabCallback = getsortedappversionsthresholdvalue.IAuthTabCallback(false, null, this)) == access14300.onWarmupCompleted() : (objIAuthTabCallback = getsortedappversionsthresholdvalue.IAuthTabCallback(true, null, this)) == access14300.onWarmupCompleted()) {
                return objIAuthTabCallback;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            int i4 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallbackWithResult = getSortedAppVersionsThresholdValue.this.onExtraCallbackWithResult(null, null, this);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
            int i4 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public getSortedAppVersionsThresholdValue(@NotNull enableLitePreloadOpt enablelitepreloadopt) {
        Intrinsics.checkNotNullParameter(enablelitepreloadopt, "");
        this.onNavigationEvent = enablelitepreloadopt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(boolean z, @NotNull enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, @NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        enablePreTaskOpt enablepretaskopt;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onnavigationevent.label;
        if (i3 != 0) {
            int i4 = onExtraCallback + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
            int i5 = IAuthTabCallback + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
            }
            return objOnNavigationEvent;
        }
        ResultKt.onNavigationEvent(obj);
        if (!z) {
            enablepretaskopt = enablePreTaskOpt.GET_LOCAL_OR_REMOTE_CACHE;
            int i7 = onExtraCallback + 3;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            enablepretaskopt = enablePreTaskOpt.REFRESH;
        }
        onnavigationevent.L$0 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
        onnavigationevent.Z$0 = z;
        onnavigationevent.label = 1;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(enableshowreminderonapppauseopt, enablepretaskopt, onnavigationevent);
        if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
            int i9 = IAuthTabCallback + 99;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
        int i10 = onExtraCallback + 27;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 43 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r1 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (r1 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (r1 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, @NotNull enablePreTaskOpt enablepretaskopt, @NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) throws NoWhenBranchMatchedException {
        onWarmupCompleted onwarmupcompleted;
        Object objOnExtraCallback;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((onWarmupCompleted) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 93;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompleted.label = i4 >>> Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i4 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj2 = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onwarmupcompleted.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj2);
            int i7 = onExtraCallbackWithResult.onExtraCallback[enablepretaskopt.ordinal()];
            if (i7 == 1) {
                enableLitePreloadOpt enablelitepreloadopt = this.onNavigationEvent;
                String param = enableshowreminderonapppauseopt.getParam();
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(enablepretaskopt);
                onwarmupcompleted.label = 1;
                objOnExtraCallback = enablelitepreloadopt.onExtraCallback(true, param, onwarmupcompleted);
            } else if (i7 == 2) {
                enableLitePreloadOpt enablelitepreloadopt2 = this.onNavigationEvent;
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(enablepretaskopt);
                onwarmupcompleted.label = 2;
                objOnExtraCallback = enablelitepreloadopt2.IAuthTabCallback(onwarmupcompleted);
            } else if (i7 != 3) {
                int i8 = onExtraCallback;
                int i9 = i8 + 45;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0 ? i7 != 4 : i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i10 = i8 + 29;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Result.Companion companion = kotlin.Result.Companion;
                objOnExtraCallback = kotlin.Result.constructor-impl(ResultKt.createFailure(addRuntimeMonitorLog.onExtraCallback.IAuthTabCallback));
            } else {
                enableLitePreloadOpt enablelitepreloadopt3 = this.onNavigationEvent;
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(enablepretaskopt);
                onwarmupcompleted.label = 3;
                objOnExtraCallback = enablelitepreloadopt3.onWarmupCompleted(enableshowreminderonapppauseopt, onwarmupcompleted);
            }
        } else {
            if (i6 != 1 && i6 != 2 && i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
            objOnExtraCallback = ((kotlin.Result) obj2).onNavigationEvent();
        }
        if (!kotlin.Result.onNavigationEvent(objOnExtraCallback)) {
            return kotlin.Result.constructor-impl(objOnExtraCallback);
        }
        Result.Companion companion2 = kotlin.Result.Companion;
        CreditOverview creditOverviewOnWarmupCompleted = (CreditOverview) objOnExtraCallback;
        int iOnWarmupCompleted = addPolicy.ITrustedWebActivityCallbackDefault().onWarmupCompleted("KEY_CREDIT_TEST_KCB_SCORE", 0);
        if (iOnWarmupCompleted > 0) {
            creditOverviewOnWarmupCompleted = CreditOverview.onWarmupCompleted(creditOverviewOnWarmupCompleted, 0L, null, access14000.onNavigationEvent(iOnWarmupCompleted), null, null, null, null, null, null, null, null, null, null, 8187, null);
        }
        return kotlin.Result.constructor-impl(creditOverviewOnWarmupCompleted);
    }
}
