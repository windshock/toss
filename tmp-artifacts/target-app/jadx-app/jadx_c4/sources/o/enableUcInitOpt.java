package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableUcInitOpt {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final enableLitePreloadOpt onExtraCallbackWithResult;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        
            r0 = 76 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            r4 = kotlin.Result.IAuthTabCallback(r4);
            r1 = o.enableUcInitOpt.IAuthTabCallback.onExtraCallback + 45;
            o.enableUcInitOpt.IAuthTabCallback.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        
            if (r4 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        
            if (r4 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        
            r1 = o.enableUcInitOpt.IAuthTabCallback.onExtraCallbackWithResult + 113;
            o.enableUcInitOpt.IAuthTabCallback.onExtraCallback = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = enableUcInitOpt.this.IAuthTabCallback(this);
            if (i3 != 0) {
                int i4 = 63 / 0;
            }
        }
    }

    @Inject
    public enableUcInitOpt(@NotNull enableLitePreloadOpt enablelitepreloadopt) {
        Intrinsics.checkNotNullParameter(enablelitepreloadopt, "");
        this.onExtraCallbackWithResult = enablelitepreloadopt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((kotlin.Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        enableLitePreloadOpt enablelitepreloadopt = this.onExtraCallbackWithResult;
        iAuthTabCallback.label = 1;
        Object objOnExtraCallback = enablelitepreloadopt.onExtraCallback(iAuthTabCallback);
        if (objOnExtraCallback == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        int i6 = onExtraCallback + 51;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return objOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
