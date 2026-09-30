package im.toss.global.features.kyc.test;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.getPricingPhaseList;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$access000.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);

        static {
            int[] iArr = new int[getPricingPhaseList.values().length];
            try {
                getPricingPhaseList getpricingphaselist = getPricingPhaseList.AU;
                int i = onWarmupCompleted;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(18);
                int i2 = i & iOnWarmupCompleted;
                if ((((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 22) & 1) == 0) {
                    iArr[getpricingphaselist.ordinal()] = 1;
                } else {
                    iArr[getpricingphaselist.ordinal()] = 1;
                }
                int i3 = onWarmupCompleted;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
                if ((((((~i3) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i3)) >> 31) & 1) == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPricingPhaseList.EU.ordinal()] = 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPricingPhaseList.KR.ordinal()] = 3;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getPricingPhaseList.JP.ordinal()] = 4;
                int i7 = onWarmupCompleted;
                int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
                int i8 = i7 & iOnWarmupCompleted3;
                if ((1 & ((((i7 ^ iOnWarmupCompleted3) | i8) & (~i8)) >> 20)) != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1560);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$access000(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$access000> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$access000 globalKycTestViewModel$access000 = (GlobalKycTestViewModel$access000) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$access000 globalKycTestViewModel$access0002 = new GlobalKycTestViewModel$access000(globalKycTestViewModel$access000.this$0, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
        return globalKycTestViewModel$access0002;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = ~i2;
        int i12 = (~(i7 | i)) | (~(i8 | i11)) | (~(i8 | i6));
        int i13 = ~(i11 | i9);
        int i14 = i6 + i + i5 + (1938118820 * i4) + ((-1869228383) * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * (-1046486968)) + 2037645312 + ((-1046486968) * i) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i5) + ((-1907359744) * i4) + (1374945280 * i3) + (1516044288 * i15);
        int i17 = ((i6 * 647972376) - 1941852458) + (i * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i5 * 647973227) + (i4 * (-1260466036)) + (i3 * 1557372491) + (i15 * 1239351296);
        int i18 = i16 + (i17 * i17 * 490405888);
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GlobalKycTestViewModel$access000 globalKycTestViewModel$access000 = (GlobalKycTestViewModel$access000) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5226);
        Object objInvokeSuspend = globalKycTestViewModel$access000.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
        return objInvokeSuspend;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3487);
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 18) & 1) == 0) {
            int i3 = 49 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
    
        if (r13 == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[PHI: r4
      0x005c: PHI (r4v8 java.lang.Object) = (r4v5 java.lang.Object), (r4v9 java.lang.Object) binds: [B:8:0x0030, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r6
      0x0032: PHI (r6v1 int) = (r6v0 int), (r6v9 int) binds: [B:8:0x0030, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.kyc.test.GlobalKycTestViewModel$access000.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (access13800) onNavigationEvent(new Object[]{this, obj, access13800Var}, -1827621391, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, 1827621391);
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return onNavigationEvent(new Object[]{this, findresandmsg, access13800Var}, -836143414, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, 836143416);
    }

    public final Object invokeSuspend(Object obj) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return onNavigationEvent(new Object[]{this, obj}, 353513482, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, -353513481);
    }
}
