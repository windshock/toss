package im.toss.global.features.kyc.test;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.getPreRenderJob;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$IAuthTabCallback.class);
    Object L$0;
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$IAuthTabCallback(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i3 | i6);
        int i11 = i9 | i10;
        int i12 = ~i3;
        int i13 = i9 | (~(i12 | i4)) | i10;
        int i14 = (~(i6 | i3 | i4)) | (~(i7 | i12 | i8));
        int i15 = i3 + i4 + i + (1322235619 * i2) + (440487356 * i5);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i3) - 2100690944) + ((-281430247) * i4) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i) + ((-942931968) * i2) + ((-1410334720) * i5) + (1251606528 * i16);
        int i18 = (i3 * 157034417) + 1376579869 + (i4 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i * 157035401) + (i2 * (-982187909)) + (i5 * (-1869533796)) + (i16 * (-899022848));
        int i19 = i17 + (i18 * i18 * (-511311872));
        return i19 != 1 ? i19 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$IAuthTabCallback globalKycTestViewModel$IAuthTabCallback = (GlobalKycTestViewModel$IAuthTabCallback) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$IAuthTabCallback globalKycTestViewModel$IAuthTabCallback2 = new GlobalKycTestViewModel$IAuthTabCallback(globalKycTestViewModel$IAuthTabCallback.this$0, (access13800) objArr[2]);
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2116);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 14) & 1) != 0) {
            return globalKycTestViewModel$IAuthTabCallback2;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GlobalKycTestViewModel$IAuthTabCallback globalKycTestViewModel$IAuthTabCallback = (GlobalKycTestViewModel$IAuthTabCallback) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
        GlobalKycTestViewModel$IAuthTabCallback globalKycTestViewModel$IAuthTabCallbackCreate = globalKycTestViewModel$IAuthTabCallback.create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if ((1 & ((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884)) >> 23)) != 0) {
            Object objInvokeSuspend = globalKycTestViewModel$IAuthTabCallbackCreate.invokeSuspend(unit);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
            return objInvokeSuspend;
        }
        globalKycTestViewModel$IAuthTabCallbackCreate.invokeSuspend(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 7) & 1) != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x017e, code lost:
    
        if (r0.onExtraCallback(r14, r1) == r4) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallback.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (access13800) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, obj, access13800Var}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1702275222, 1702275224, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, findresandmsg, access13800Var}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1078972041, -1078972041, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final Object invokeSuspend(Object obj) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, obj}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1918685672, 1918685673, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback);
    }
}
