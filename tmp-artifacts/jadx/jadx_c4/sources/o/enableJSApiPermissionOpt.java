package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableJSApiPermissionOpt {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final getHeaders IAuthTabCallback;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = enableJSApiPermissionOpt.this.onExtraCallback(this);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnExtraCallback);
            }
            int i4 = onExtraCallback + 17;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            if (i4 % 2 == 0) {
                int i6 = 30 / 0;
            }
            int i7 = i5 + 101;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    @Inject
    public enableJSApiPermissionOpt(@NotNull getHeaders getheaders) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        this.IAuthTabCallback = getheaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super kotlin.Result<enableActivityMonitorInitFloatOpt>> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!(!(access13800Var instanceof onNavigationEvent))) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i4 = onnavigationevent.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                onnavigationevent.label = i4 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onnavigationevent.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj);
            getHeaders getheaders = this.IAuthTabCallback;
            onnavigationevent.label = 1;
            Object objIAuthTabCallback = getheaders.IAuthTabCallback(onnavigationevent);
            return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
        }
        int i8 = onNavigationEvent + 53;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        Object objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
        int i9 = onExtraCallback + 61;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return objOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
