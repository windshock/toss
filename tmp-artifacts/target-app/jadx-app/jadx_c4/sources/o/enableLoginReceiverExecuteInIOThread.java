package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableLoginReceiverExecuteInIOThread {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final getHeaders onExtraCallbackWithResult;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableLoginReceiverExecuteInIOThread enableloginreceiverexecuteiniothread = enableLoginReceiverExecuteInIOThread.this;
            if (i3 == 0) {
                enableloginreceiverexecuteiniothread.onWarmupCompleted(null, null, this);
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = enableloginreceiverexecuteiniothread.onWarmupCompleted(null, null, this);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = onNavigationEvent + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    @Inject
    public enableLoginReceiverExecuteInIOThread(@NotNull getHeaders getheaders) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        this.onExtraCallbackWithResult = getheaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@Nullable enableContextFromLogger enablecontextfromlogger, @Nullable Boolean bool, @NotNull access13800<? super kotlin.Result<enableEndSpmReportInIOThread>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 77;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompleted.label = i4 << Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i4 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onwarmupcompleted.label;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = onWarmupCompleted + 87;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            return ((kotlin.Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        getHeaders getheaders = this.onExtraCallbackWithResult;
        onwarmupcompleted.L$0 = access15400.onNavigationEvent(enablecontextfromlogger);
        onwarmupcompleted.L$1 = access15400.onNavigationEvent(bool);
        onwarmupcompleted.label = 1;
        Object objOnWarmupCompleted2 = getheaders.onWarmupCompleted(enablecontextfromlogger, bool, onwarmupcompleted);
        if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
            return objOnWarmupCompleted2;
        }
        int i9 = onWarmupCompleted + 7;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }
}
