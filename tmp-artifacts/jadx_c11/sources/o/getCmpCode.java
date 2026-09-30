package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.o7d;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCmpCode extends getCmpMessage {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final long IAuthTabCallback;
    private final Function2<p6, o7d, Unit> onExtraCallback;
    private final o7d.onExtraCallback onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getCmpCode getcmpcode = getCmpCode.this;
            if (i3 == 0) {
                return getcmpcode.onNavigationEvent(null, this);
            }
            getcmpcode.onNavigationEvent(null, this);
            throw null;
        }
    }

    @Override // o.getCmpMessage
    public void onExtraCallback(@NotNull p6 p6Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p6Var, "");
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCmpCode(long j, @NotNull Function2<? super p6, ? super o7d, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = j;
        this.onExtraCallback = function2;
        this.onWarmupCompleted = o7d.onExtraCallback.onExtraCallback;
    }

    @Override // o.getCmpMessage
    public /* synthetic */ o7d onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        o7d.onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return onextracallbackOnExtraCallbackWithResult;
    }

    public o7d.onExtraCallback onExtraCallbackWithResult() {
        o7d.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onextracallback = this.onWarmupCompleted;
            int i4 = 88 / 0;
        } else {
            onextracallback = this.onWarmupCompleted;
        }
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    @Override // o.getCmpMessage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull p6 p6Var, @NotNull access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i5 = i2 + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i7 = onextracallback.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    onextracallback.label = i7 - 2147483648;
                } else {
                    onextracallback.label = i7 - 2147483648;
                }
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = onextracallback.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj);
            long j = this.IAuthTabCallback;
            onextracallback.L$0 = p6Var;
            onextracallback.label = 1;
            if (formatMsgs.onWarmupCompleted(j, onextracallback) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                p6Var = (p6) onextracallback.L$0;
                ResultKt.onNavigationEvent(obj);
                int i11 = 10 / 0;
            } else {
                p6Var = (p6) onextracallback.L$0;
                ResultKt.onNavigationEvent(obj);
            }
        }
        this.onExtraCallback.invoke(p6Var, onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }
}
