package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableStartClientBundleToStringOpt {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final getSortedAppVersionsThresholdValue onExtraCallbackWithResult;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = enableStartClientBundleToStringOpt.this.onWarmupCompleted(i3 == 0, this);
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public enableStartClientBundleToStringOpt(@NotNull getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue) {
        Intrinsics.checkNotNullParameter(getsortedappversionsthresholdvalue, "");
        this.onExtraCallbackWithResult = getsortedappversionsthresholdvalue;
    }

    public static /* synthetic */ Object IAuthTabCallback(enableStartClientBundleToStringOpt enablestartclientbundletostringopt, boolean z, access13800 access13800Var, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            z = false;
        }
        Object objOnWarmupCompleted = enablestartclientbundletostringopt.onWarmupCompleted(z, access13800Var);
        int i5 = onExtraCallback + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(boolean z, @NotNull access13800<? super String> access13800Var) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        Object objIAuthTabCallback;
        int i = 2 % 2;
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onnavigationevent.label = i2 - 2147483648;
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        Long lOnExtraCallback = null;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue = this.onExtraCallbackWithResult;
            enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt = enableShowReminderOnAppPauseOpt.CREDIT_MAIN;
            onnavigationevent.Z$0 = z;
            onnavigationevent.label = 1;
            objIAuthTabCallback = getsortedappversionsthresholdvalue.IAuthTabCallback(z, enableshowreminderonapppauseopt, onnavigationevent);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i6 = onNavigationEvent + 21;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = onExtraCallback + 9;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                ((kotlin.Result) obj).onNavigationEvent();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((kotlin.Result) obj).onNavigationEvent();
        }
        if (kotlin.Result.onExtraCallback(objIAuthTabCallback)) {
            objIAuthTabCallback = null;
        }
        CreditOverview creditOverview = (CreditOverview) objIAuthTabCallback;
        if (creditOverview != null) {
            int i9 = onNavigationEvent + 83;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                access14000.onExtraCallback(creditOverview.IAuthTabCallbackDefault());
                throw null;
            }
            lOnExtraCallback = access14000.onExtraCallback(creditOverview.IAuthTabCallbackDefault());
        }
        return String.valueOf(lOnExtraCallback);
    }
}
