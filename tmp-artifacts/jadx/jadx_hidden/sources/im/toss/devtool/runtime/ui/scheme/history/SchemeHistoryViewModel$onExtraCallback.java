package im.toss.devtool.runtime.ui.scheme.history;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AppNode9;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IAnimation;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.bindContext;
import o.setRipple;

/* loaded from: classes.dex */
public final class SchemeHistoryViewModel$onExtraCallback implements IAnimation<AppNode9> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(SchemeHistoryViewModel$onExtraCallback.class);
    final /* synthetic */ IAnimation onExtraCallbackWithResult;

    /* renamed from: im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements setRipple {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 478308882;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ setRipple onExtraCallbackWithResult;

        /* renamed from: im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends ContinuationImpl {
            static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass2.class);
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass2(access13800 access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                int i5 = (((i4 & i3) | (i3 ^ i4)) >> 20) & 1;
                this.result = obj;
                if (i5 != 0) {
                    throw null;
                }
                int i6 = this.label;
                int i7 = i6 ^ Integer.MIN_VALUE;
                int i8 = i6 & Integer.MIN_VALUE;
                this.label = (i8 & i7) | (i7 ^ i8);
                Object objEmit = AnonymousClass1.this.emit(null, this);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
                return objEmit;
            }
        }

        public AnonymousClass1(setRipple setripple) {
            this.onExtraCallbackWithResult = setripple;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r13, o.access13800 r14) {
            /*
                r12 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.onWarmupCompleted
                int r1 = r1 + 39
                int r2 = r1 % 128
                im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.onExtraCallback = r2
                int r1 = r1 % r0
                boolean r1 = r14 instanceof im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.AnonymousClass2
                if (r1 == 0) goto L2f
                r1 = r14
                im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback$1$2 r1 = (im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.AnonymousClass2) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L2f
                int r14 = im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.onWarmupCompleted
                int r14 = r14 + 81
                int r4 = r14 % 128
                im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.onExtraCallback = r4
                int r14 = r14 % r0
                if (r14 != 0) goto L2b
                int r14 = r2 << r3
                r1.label = r14
                goto L34
            L2b:
                int r2 = r2 + r3
                r1.label = r2
                goto L34
            L2f:
                im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback$1$2 r1 = new im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback$1$2
                r1.<init>(r14)
            L34:
                java.lang.Object r14 = r1.result
                java.lang.Object r2 = o.access14300.onWarmupCompleted()
                int r3 = r1.label
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L82
                if (r3 != r4) goto L4f
                java.lang.Object r13 = r1.L$3
                o.setRipple r13 = (o.setRipple) r13
                java.lang.Object r13 = r1.L$1
                im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback$1$2 r13 = (im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.AnonymousClass2) r13
                kotlin.ResultKt.onNavigationEvent(r14)
                goto Lca
            L4f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                int r14 = android.view.ViewConfiguration.getMinimumFlingVelocity()
                int r14 = r14 >> 16
                r0 = 47
                int r6 = 47 - r14
                r14 = 0
                float r1 = android.util.TypedValue.complexToFraction(r5, r14, r14)
                int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                int r7 = r14 + 8
                char[] r8 = new char[r0]
                r8 = {x00ce: FILL_ARRAY_DATA , data: [-60, 19, 24, -60, 16, 16, 5, 7, 9, 18, 13, 24, 25, 19, 22, 19, 7, -60, 12, 24, 13, 27, -60, -53, 9, 15, 19, 26, 18, 13, -53, -60, 9, 22, 19, 10, 9, 6, -60, -53, 9, 17, 25, 23, 9, 22, -53} // fill-array
                r9 = 1
                int r14 = android.graphics.drawable.Drawable.resolveOpacity(r5, r5)
                int r10 = 151 - r14
                java.lang.Object[] r14 = new java.lang.Object[r4]
                r11 = r14
                a(r6, r7, r8, r9, r10, r11)
                r14 = r14[r5]
                java.lang.String r14 = (java.lang.String) r14
                java.lang.String r14 = r14.intern()
                r13.<init>(r14)
                throw r13
            L82:
                kotlin.ResultKt.onNavigationEvent(r14)
                o.setRipple r14 = r12.onExtraCallbackWithResult
                r3 = r13
                java.util.List r3 = (java.util.List) r3
                if (r3 != 0) goto L8f
                o.AppNode9$onWarmupCompleted r3 = o.AppNode9.onWarmupCompleted.IAuthTabCallback
                goto L9e
            L8f:
                boolean r6 = r3.isEmpty()
                if (r6 == 0) goto L98
                o.AppNode9$onExtraCallback r3 = o.AppNode9.onExtraCallback.onExtraCallbackWithResult
                goto L9e
            L98:
                o.AppNode9$onNavigationEvent r6 = new o.AppNode9$onNavigationEvent
                r6.<init>(r3)
                r3 = r6
            L9e:
                java.lang.Object r6 = o.access15400.onNavigationEvent(r13)
                r1.L$0 = r6
                java.lang.Object r6 = o.access15400.onNavigationEvent(r1)
                r1.L$1 = r6
                java.lang.Object r13 = o.access15400.onNavigationEvent(r13)
                r1.L$2 = r13
                java.lang.Object r13 = o.access15400.onNavigationEvent(r14)
                r1.L$3 = r13
                r1.I$0 = r5
                r1.label = r4
                java.lang.Object r13 = r14.emit(r3, r1)
                if (r13 != r2) goto Lca
                int r13 = im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.onWarmupCompleted
                int r13 = r13 + 21
                int r14 = r13 % 128
                im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.onExtraCallback = r14
                int r13 = r13 % r0
                return r2
            Lca:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel$onExtraCallback.AnonymousClass1.emit(java.lang.Object, o.access13800):java.lang.Object");
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i5] = bindContext.access000.g(cArr2[i5], IAuthTabCallback);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i8 = $10 + 29;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    public SchemeHistoryViewModel$onExtraCallback(IAnimation iAnimation) {
        this.onExtraCallbackWithResult = iAnimation;
    }

    public Object collect(setRipple setripple, access13800 access13800Var) {
        int i = 2 % 2;
        IAnimation iAnimation = this.onExtraCallbackWithResult;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(setripple);
        if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792)) >> 5) & 1) == 0) {
            iAnimation.collect(anonymousClass1, access13800Var);
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objCollect = iAnimation.collect(anonymousClass1, access13800Var);
        if (objCollect == access14300.onWarmupCompleted()) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
            return objCollect;
        }
        Unit unit = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
        return unit;
    }
}
