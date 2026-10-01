package o;

import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableLifeExtensionMonitorOpt {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final getHeaders IAuthTabCallback;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableLifeExtensionMonitorOpt enablelifeextensionmonitoropt = enableLifeExtensionMonitorOpt.this;
            if (i3 != 0 ? (objOnWarmupCompleted = enablelifeextensionmonitoropt.onWarmupCompleted(0, null, this)) == access14300.onWarmupCompleted() : (objOnWarmupCompleted = enablelifeextensionmonitoropt.onWarmupCompleted(1, null, this)) == access14300.onWarmupCompleted()) {
                return objOnWarmupCompleted;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return resultIAuthTabCallback;
        }
    }

    @Inject
    public enableLifeExtensionMonitorOpt(@NotNull getHeaders getheaders) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        this.IAuthTabCallback = getheaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r1 r4
      0x0034: PHI (r1v10 o.enableLifeExtensionMonitorOpt$onExtraCallback) = (r1v9 o.enableLifeExtensionMonitorOpt$onExtraCallback), (r1v12 o.enableLifeExtensionMonitorOpt$onExtraCallback) binds: [B:12:0x0032, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v4 int) = (r4v3 int), (r4v6 int) binds: [B:12:0x0032, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(int i, @NotNull String str, @NotNull access13800<? super kotlin.Result<enableIpcClientKernelUtilsOpt>> access13800Var) {
        onExtraCallback onextracallback;
        Object objAsBinder;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 95;
        onWarmupCompleted = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            boolean z = access13800Var instanceof onExtraCallback;
            throw null;
        }
        if (access13800Var instanceof onExtraCallback) {
            int i6 = i4 + 111;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                onextracallback = (onExtraCallback) access13800Var;
                i2 = onextracallback.label;
                int i7 = 6 / 0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i2 - 2147483648;
                    int i8 = onExtraCallback + 89;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    onextracallback = new onExtraCallback(access13800Var);
                }
            } else {
                onextracallback = (onExtraCallback) access13800Var;
                i2 = onextracallback.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj2 = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = onextracallback.label;
        if (i10 != 0) {
            int i11 = onExtraCallback + 113;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0 ? i10 != 1 : i10 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = onextracallback.I$0;
            str = (String) onextracallback.L$0;
            ResultKt.onNavigationEvent(obj2);
            objAsBinder = ((kotlin.Result) obj2).onNavigationEvent();
        } else {
            ResultKt.onNavigationEvent(obj2);
            getHeaders getheaders = this.IAuthTabCallback;
            onextracallback.L$0 = str;
            onextracallback.I$0 = i;
            onextracallback.label = 1;
            objAsBinder = getheaders.asBinder(onextracallback);
            if (objAsBinder == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        if (!kotlin.Result.onNavigationEvent(objAsBinder)) {
            return kotlin.Result.constructor-impl(objAsBinder);
        }
        Result.Companion companion = kotlin.Result.Companion;
        enableIpcClientKernelUtilsOpt enableipcclientkernelutilsopt = (enableIpcClientKernelUtilsOpt) objAsBinder;
        if (i <= 0) {
            int i12 = onExtraCallback + 57;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                enableipcclientkernelutilsopt.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            i = enableipcclientkernelutilsopt.IAuthTabCallback();
        }
        int i13 = i;
        if (StringsKt.isBlank(str)) {
            str = enableipcclientkernelutilsopt.onExtraCallback();
        }
        return kotlin.Result.constructor-impl(enableIpcClientKernelUtilsOpt.onNavigationEvent(enableipcclientkernelutilsopt, 0.0f, i13, str, 1, null));
    }
}
