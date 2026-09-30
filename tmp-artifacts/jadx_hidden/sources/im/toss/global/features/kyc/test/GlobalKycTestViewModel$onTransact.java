package im.toss.global.features.kyc.test;

import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.getPricingPhaseList;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$onTransact.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    public static final /* synthetic */ class onWarmupCompleted {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[getPricingPhaseList.values().length];
            try {
                getPricingPhaseList getpricingphaselist = getPricingPhaseList.EU;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
                iArr[getpricingphaselist.ordinal()] = 1;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPricingPhaseList.AU.ordinal()] = 2;
                int i2 = IAuthTabCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
                int i3 = i2 & iOnWarmupCompleted;
                if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 27) & 1) != 0) {
                    int i4 = 2 % 4;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPricingPhaseList.KR.ordinal()] = 3;
                int i6 = IAuthTabCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1851);
                if ((1 & ((((~i6) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i6)) >> 25)) != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getPricingPhaseList.JP.ordinal()] = 4;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3338);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$onTransact(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$onTransact> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i5);
        int i9 = ~(i5 | i6);
        int i10 = i7 | (~i5);
        int i11 = i9 | (~(i10 | i));
        int i12 = (~i) | i10;
        int i13 = i5 + i6 + i3 + (1134938392 * i2) + ((-1730424158) * i4);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i5) + 1061748736 + ((-382549644) * i6) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i3) + (1924136960 * i2) + (748945408 * i4) + (912850944 * i14);
        int i16 = (i5 * 1914917686) + 639827133 + (i6 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i3 * 1914918157) + (i2 * (-1451741640)) + (i4 * (-1338016710)) + (i14 * (-1605042176));
        int i17 = i15 + (i16 * i16 * (-230752256));
        return i17 != 1 ? i17 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalKycTestViewModel$onTransact globalKycTestViewModel$onTransact = (GlobalKycTestViewModel$onTransact) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 7) & 1;
        GlobalKycTestViewModel$onTransact globalKycTestViewModel$onTransactCreate = globalKycTestViewModel$onTransact.create(findresandmsg, access13800Var);
        if (i3 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
        Object objInvokeSuspend = globalKycTestViewModel$onTransactCreate.invokeSuspend(unit2);
        int i4 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
        if (((((i4 | iOnWarmupCompleted2) & (~(i4 & iOnWarmupCompleted2))) >> 18) & 1) == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GlobalKycTestViewModel$onTransact globalKycTestViewModel$onTransact = (GlobalKycTestViewModel$onTransact) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$onTransact globalKycTestViewModel$onTransact2 = new GlobalKycTestViewModel$onTransact(globalKycTestViewModel$onTransact.this$0, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
        return globalKycTestViewModel$onTransact2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        int i3 = i2 & iOnWarmupCompleted;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 23) & 1) == 0) {
            objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = 13 / 0;
        } else {
            objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        }
        if ((((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100)) >> 22) & 1) == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
    
        if (r13.onExtraCallback("예약 완료", r1) == r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.kyc.test.GlobalKycTestViewModel$onTransact.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return (access13800) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, obj, access13800Var}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1248089426, -1248089425);
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, findresandmsg, access13800Var}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1510038617, 1510038617);
    }

    public final Object invokeSuspend(Object obj) {
        return onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, obj}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1960156150, -1960156148);
    }
}
