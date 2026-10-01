package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableGetTitleFromPageDataOpt {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final getHeaders onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableGetTitleFromPageDataOpt enablegettitlefrompagedataopt = enableGetTitleFromPageDataOpt.this;
            if (i3 == 0) {
                enablegettitlefrompagedataopt.onExtraCallbackWithResult(this);
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnExtraCallbackWithResult = enablegettitlefrompagedataopt.onExtraCallbackWithResult(this);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
            int i4 = onExtraCallbackWithResult + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public enableGetTitleFromPageDataOpt(@NotNull getHeaders getheaders) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        this.onWarmupCompleted = getheaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull access13800<? super kotlin.Result<enableAppModelOpt>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onNavigationEvent + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            getHeaders getheaders = this.onWarmupCompleted;
            onwarmupcompleted.label = 1;
            Object objOnWarmupCompleted2 = getheaders.onWarmupCompleted(onwarmupcompleted);
            return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
        }
        int i6 = IAuthTabCallback + 125;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        return ((kotlin.Result) obj).onNavigationEvent();
    }
}
