package o;

import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private final playerError onNavigationEvent;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onWarmupCompleted = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnNavigationEvent = r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc.this.onNavigationEvent(null, this);
            if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnNavigationEvent);
            }
            int i2 = onWarmupCompleted + 81;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 45 / 0;
            }
            int i5 = i3 + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    @Inject
    public r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc(@NotNull playerError playererror) {
        Intrinsics.checkNotNullParameter(playererror, "");
        this.onNavigationEvent = playererror;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super Result<Boolean>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i2 = IAuthTabCallbackStub + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
                int i5 = onExtraCallback + 63;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 4;
                }
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        playerError playererror = this.onNavigationEvent;
        iAuthTabCallback.L$0 = access15400.onNavigationEvent(str);
        iAuthTabCallback.label = 1;
        Object objOnExtraCallbackWithResult = playererror.onExtraCallbackWithResult(str, iAuthTabCallback);
        if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            return objOnExtraCallbackWithResult;
        }
        int i8 = IAuthTabCallbackStub;
        int i9 = i8 + 61;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 79;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return objOnWarmupCompleted;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
