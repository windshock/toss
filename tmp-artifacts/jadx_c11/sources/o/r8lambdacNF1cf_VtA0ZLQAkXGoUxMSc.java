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
public final class r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final playerPlaying onNavigationEvent;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc.this.IAuthTabCallback(null, false, this);
            if (i3 != 0 ? objIAuthTabCallback != access14300.onWarmupCompleted() : objIAuthTabCallback != access14300.onWarmupCompleted()) {
                Result resultIAuthTabCallback = Result.IAuthTabCallback(objIAuthTabCallback);
                int i4 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return resultIAuthTabCallback;
                }
                throw null;
            }
            int i5 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 39;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc(@NotNull playerPlaying playerplaying) {
        Intrinsics.checkNotNullParameter(playerplaying, "");
        this.onNavigationEvent = playerplaying;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r8lambdacnf1cf_vta0zlqakxgouxmsc, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return r8lambdacnf1cf_vta0zlqakxgouxmsc.IAuthTabCallback(str, z, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull String str, boolean z, @NotNull access13800<? super Result<Boolean>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        Object obj = null;
        if (access13800Var instanceof IAuthTabCallback) {
            int i2 = IAuthTabCallback + 61;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((IAuthTabCallback) access13800Var).label;
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object obj2 = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj2);
            playerPlaying playerplaying = this.onNavigationEvent;
            iAuthTabCallback2.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallback2.Z$0 = z;
            iAuthTabCallback2.label = 1;
            Object objOnNavigationEvent = playerPlaying.onNavigationEvent(playerplaying, str, z, (List) null, iAuthTabCallback2, 4, (Object) null);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i6 = IAuthTabCallback + 125;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
            int i8 = IAuthTabCallback + 111;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return objOnNavigationEvent;
        }
        int i10 = IAuthTabCallbackDefault + 25;
        int i11 = i10 % 128;
        IAuthTabCallback = i11;
        if (i10 % 2 == 0 ? i5 != 1 : i5 != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i12 = i11 + 93;
        IAuthTabCallbackDefault = i12 % 128;
        if (i12 % 2 != 0) {
            ResultKt.onNavigationEvent(obj2);
            return ((Result) obj2).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj2);
        ((Result) obj2).onNavigationEvent();
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
