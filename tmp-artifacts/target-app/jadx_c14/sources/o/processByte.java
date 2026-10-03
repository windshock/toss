package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class processByte {

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return processByte.IAuthTabCallback(null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.NotNull o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r9, boolean r10, @org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Boolean> r11) {
        /*
            boolean r0 = r11 instanceof o.processByte.onExtraCallbackWithResult
            if (r0 == 0) goto L13
            r0 = r11
            o.processByte$onExtraCallbackWithResult r0 = (o.processByte.onExtraCallbackWithResult) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.processByte$onExtraCallbackWithResult r0 = new o.processByte$onExtraCallbackWithResult
            r0.<init>(r11)
        L18:
            r4 = r0
            java.lang.Object r11 = r4.result
            java.lang.Object r0 = o.access14300.onWarmupCompleted()
            int r1 = r4.label
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L3d
            if (r1 != r7) goto L35
            java.lang.Object r9 = r4.L$0
            o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r9 = (o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc) r9
            kotlin.ResultKt.onNavigationEvent(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r9 = r11.onNavigationEvent()
            goto L59
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.ResultKt.onNavigationEvent(r11)
            if (r10 == 0) goto L6d
            java.lang.Object r11 = o.access15400.onNavigationEvent(r9)
            r4.L$0 = r11
            r4.Z$0 = r10
            r4.label = r7
            java.lang.String r2 = "STD_1421_BLE_SCAN"
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            java.lang.Object r9 = o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc.onExtraCallbackWithResult(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L59
            return r0
        L59:
            java.lang.Boolean r10 = o.access14000.onNavigationEvent(r8)
            boolean r11 = kotlin.Result.onExtraCallback(r9)
            if (r11 == 0) goto L64
            r9 = r10
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6d
            goto L6e
        L6d:
            r7 = r8
        L6e:
            java.lang.Boolean r9 = o.access14000.onNavigationEvent(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.processByte.IAuthTabCallback(o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc, boolean, o.access13800):java.lang.Object");
    }
}
