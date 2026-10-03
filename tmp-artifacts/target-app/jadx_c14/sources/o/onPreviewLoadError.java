package o;

import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.onPreviewLoadError;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onPreviewLoadError implements onImageLoadError {
    private final g1 onExtraCallback;
    private final zzad onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = onPreviewLoadError.this.onExtraCallback(null, null, this);
            return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Result.IAuthTabCallback(objOnExtraCallback);
        }
    }

    @Inject
    public onPreviewLoadError(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onExtraCallback = g1Var;
        this.onExtraCallbackWithResult = zzadVar;
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.intoss.cookie.service.AppsInTossCookieFetcher$$ExternalSyntheticLambda0
            public final Object invoke() {
                return onPreviewLoadError.onWarmupCompleted(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final onInterruptedByUser onWarmupCompleted() {
        return (onInterruptedByUser) this.onNavigationEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onInterruptedByUser onWarmupCompleted(onPreviewLoadError onpreviewloaderror) {
        return (onInterruptedByUser) g1.onExtraCallback(onpreviewloaderror.onExtraCallback, onInterruptedByUser.class, onpreviewloaderror.onExtraCallbackWithResult.access000(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.onImageLoadError
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<? extends viva.republica.toss.intoss.cookie.SignedCookieDto>> r27) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPreviewLoadError.onExtraCallback(java.lang.String, java.lang.String, o.access13800):java.lang.Object");
    }
}
