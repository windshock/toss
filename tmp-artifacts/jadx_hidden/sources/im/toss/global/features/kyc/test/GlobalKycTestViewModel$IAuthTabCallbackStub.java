package im.toss.global.features.kyc.test;

import im.toss.features.tosscert.ui.R;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$IAuthTabCallbackStub.class);
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$IAuthTabCallbackStub(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$IAuthTabCallbackStub> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~i) | i8;
        int i10 = i7 | (~i9);
        int i11 = i | i8;
        int i12 = ~(i9 | i5);
        int i13 = i2 + i5 + i6 + (1075552530 * i4) + ((-1519595880) * i3);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i2) - 1639710720) + ((-2116975300) * i5) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i6) + ((-189792256) * i4) + (1111490560 * i3) + (1415839744 * i14);
        int i16 = (i2 * 251836610) + 257048825 + (i5 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i6 * 251837547) + (i4 * 1710852742) + (i3 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalKycTestViewModel$IAuthTabCallbackStub globalKycTestViewModel$IAuthTabCallbackStub = (GlobalKycTestViewModel$IAuthTabCallbackStub) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$IAuthTabCallbackStub globalKycTestViewModel$IAuthTabCallbackStub2 = new GlobalKycTestViewModel$IAuthTabCallbackStub(globalKycTestViewModel$IAuthTabCallbackStub.this$0, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
        return globalKycTestViewModel$IAuthTabCallbackStub2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unit;
        GlobalKycTestViewModel$IAuthTabCallbackStub globalKycTestViewModel$IAuthTabCallbackStub = (GlobalKycTestViewModel$IAuthTabCallbackStub) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(273);
        int i3 = (((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) & 1;
        GlobalKycTestViewModel$IAuthTabCallbackStub globalKycTestViewModel$IAuthTabCallbackStubCreate = globalKycTestViewModel$IAuthTabCallbackStub.create(findresandmsg, access13800Var);
        if (i3 != 0) {
            unit = Unit.INSTANCE;
            int i4 = 12 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
        if ((((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 19) & 1) == 0) {
            globalKycTestViewModel$IAuthTabCallbackStubCreate.invokeSuspend(unit);
            throw null;
        }
        Object objInvokeSuspend = globalKycTestViewModel$IAuthTabCallbackStubCreate.invokeSuspend(unit);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2570);
        return objInvokeSuspend;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2336);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (((((i4 & i3) | (i3 ^ i4)) >> 11) & 1) != 0) {
            return onWarmupCompleted(findresandmsg, access13800Var);
        }
        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        int i5 = 3 / 0;
        return objOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
    
        if (r5.onExtraCallback(r6, r1) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[PHI: r4
      0x007d: PHI (r4v12 java.lang.Object) = (r4v8 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0035, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r4 r5
      0x0037: PHI (r4v9 java.lang.Object) = (r4v8 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0035, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r5v4 int) = (r5v3 int), (r5v16 int) binds: [B:8:0x0035, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackStub.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (access13800) IAuthTabCallback(iIAuthTabCallback, 663967850, R.drawable.IAuthTabCallback(), new Object[]{this, obj, access13800Var}, iIAuthTabCallback3, -663967848, iIAuthTabCallback2);
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return IAuthTabCallback(iIAuthTabCallback, -1255678484, R.drawable.IAuthTabCallback(), new Object[]{this, findresandmsg, access13800Var}, iIAuthTabCallback3, 1255678485, iIAuthTabCallback2);
    }

    public final Object invokeSuspend(Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return IAuthTabCallback(iIAuthTabCallback, -95578403, R.drawable.IAuthTabCallback(), new Object[]{this, obj}, iIAuthTabCallback3, 95578403, iIAuthTabCallback2);
    }
}
