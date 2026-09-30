package o;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final playerBuffering onWarmupCompleted;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.this;
            if (i3 != 0 ? (objOnNavigationEvent = r8lambdackpzfvkcnb19lbykxqj6b3xvcwe.onNavigationEvent(null, false, this)) == access14300.onWarmupCompleted() : (objOnNavigationEvent = r8lambdackpzfvkcnb19lbykxqj6b3xvcwe.onNavigationEvent(null, true, this)) == access14300.onWarmupCompleted()) {
                return objOnNavigationEvent;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnNavigationEvent);
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return resultIAuthTabCallback;
            }
            throw null;
        }
    }

    public interface onNavigationEvent {
        r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE LocalActivityKtExternalSyntheticLambda0();
    }

    static {
        int i = IAuthTabCallback + 17;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE(@NotNull playerBuffering playerbuffering) {
        Intrinsics.checkNotNullParameter(playerbuffering, "");
        this.onWarmupCompleted = playerbuffering;
    }

    public static /* synthetic */ Object onNavigationEvent(r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 57;
        asBinder = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i3 + 57;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        return r8lambdackpzfvkcnb19lbykxqj6b3xvcwe.onNavigationEvent(str, z, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull String str, boolean z, @NotNull access13800<? super Result<Boolean>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = asBinder + 15;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    onextracallbackwithresult.label = i2 << Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i2 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                int i4 = onNavigationEvent + 41;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object obj = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallbackwithresult2.label;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        playerBuffering playerbuffering = this.onWarmupCompleted;
        onextracallbackwithresult2.L$0 = access15400.onNavigationEvent(str);
        onextracallbackwithresult2.Z$0 = z;
        onextracallbackwithresult2.label = 1;
        Object objOnExtraCallbackWithResult = playerBuffering.onExtraCallbackWithResult(playerbuffering, str, z, (List) null, onextracallbackwithresult2, 4, (Object) null);
        if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        int i7 = onNavigationEvent + 121;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 19 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcweLocalActivityKtExternalSyntheticLambda0 = ((onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onNavigationEvent.class)).LocalActivityKtExternalSyntheticLambda0();
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return r8lambdackpzfvkcnb19lbykxqj6b3xvcweLocalActivityKtExternalSyntheticLambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
