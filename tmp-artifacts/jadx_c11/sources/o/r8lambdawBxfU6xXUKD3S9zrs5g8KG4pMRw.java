package o;

import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdawBxfU6xXUKD3S9zrs5g8KG4pMRw {
    private static int IAuthTabCallback = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private final playerSeekComplete onExtraCallbackWithResult;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = 8;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        long J$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = r8lambdawBxfU6xXUKD3S9zrs5g8KG4pMRw.this.onExtraCallbackWithResult(0L, this);
            if (i3 != 0 ? objOnExtraCallbackWithResult == access14300.onWarmupCompleted() : objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
                return objOnExtraCallbackWithResult;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            int i4 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    static {
        int i = IAuthTabCallback + 25;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public r8lambdawBxfU6xXUKD3S9zrs5g8KG4pMRw(@NotNull playerSeekComplete playerseekcomplete) {
        Intrinsics.checkNotNullParameter(playerseekcomplete, "");
        this.onExtraCallbackWithResult = playerseekcomplete;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(long j, @NotNull access13800<? super Result<Boolean>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = asInterface + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((onWarmupCompleted) access13800Var).label;
                throw null;
            }
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = asInterface + 27;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompleted.label = i4 % Integer.MIN_VALUE;
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
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        playerSeekComplete playerseekcomplete = this.onExtraCallbackWithResult;
        onwarmupcompleted.J$0 = j;
        onwarmupcompleted.label = 1;
        Object objOnNavigationEvent = playerseekcomplete.onNavigationEvent(j, onwarmupcompleted);
        if (objOnNavigationEvent == objOnWarmupCompleted) {
            int i7 = onWarmupCompleted + 49;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return objOnWarmupCompleted;
        }
        int i9 = asInterface + 17;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
