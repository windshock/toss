package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableInputHideOpt {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final getHeaders onNavigationEvent;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = enableInputHideOpt.this.onExtraCallback(null, this);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return objOnExtraCallback;
        }
    }

    @Inject
    public enableInputHideOpt(@NotNull getHeaders getheaders) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        this.onNavigationEvent = getheaders;
    }

    public static /* synthetic */ Object IAuthTabCallback(enableInputHideOpt enableinputhideopt, Integer num, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            num = null;
        }
        return enableinputhideopt.onExtraCallback(num, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@Nullable Integer num, @NotNull access13800<? super setHeaders> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Object objIAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i4 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 != 0) {
            int i6 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((kotlin.Result) obj).onNavigationEvent();
        } else {
            ResultKt.onNavigationEvent(obj);
            getHeaders getheaders = this.onNavigationEvent;
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(num);
            onwarmupcompleted.label = 1;
            objIAuthTabCallback = getheaders.IAuthTabCallback(num, onwarmupcompleted);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i7 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return objOnWarmupCompleted;
            }
        }
        if (kotlin.Result.onExtraCallback(objIAuthTabCallback)) {
            int i9 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i9 % 128;
            Object obj2 = null;
            if (i9 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            objIAuthTabCallback = null;
        }
        int i10 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return objIAuthTabCallback;
    }
}
