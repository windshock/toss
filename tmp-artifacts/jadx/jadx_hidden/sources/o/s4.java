package o;

import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.security.impl.malware.MalwareDetectActivity;

/* loaded from: classes.dex */
public final class s4 implements setSize<MalwareDetectActivity> {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(s4.class);

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i3) | i6);
        int i8 = ~((~i6) | i5);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i5) | i6));
        int i11 = i6 + i5 + i4 + (762724209 * i) + (1201824936 * i2);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i5) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i4) + (1302855680 * i) + (1514143744 * i2) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i5 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i4 * 162560975) + (i * 701011807) + (i2 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MalwareDetectActivity malwareDetectActivity = (MalwareDetectActivity) objArr[0];
        s8ExternalSyntheticLambda2 s8externalsyntheticlambda2 = (s8ExternalSyntheticLambda2) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
        malwareDetectActivity.malwareAppDetector = s8externalsyntheticlambda2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2782);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 29) & 1) == 0) {
            int i3 = 56 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MalwareDetectActivity malwareDetectActivity = (MalwareDetectActivity) objArr[0];
        s5a s5aVar = (s5a) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = 1 & (((i4 & i3) | (i3 ^ i4)) >> 13);
        Object obj = null;
        malwareDetectActivity.malwareAppRepository = s5aVar;
        if (i5 == 0) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MalwareDetectActivity malwareDetectActivity = (MalwareDetectActivity) objArr[0];
        setAdUnitIds setadunitids = (setAdUnitIds) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
        malwareDetectActivity.loginStatus = setadunitids;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MalwareDetectActivity malwareDetectActivity = (MalwareDetectActivity) objArr[0];
        zzad zzadVar = (zzad) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3393);
        malwareDetectActivity.injectedEnvironments = zzadVar;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
        return null;
    }

    public static void IAuthTabCallback(MalwareDetectActivity malwareDetectActivity, zzad zzadVar) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{malwareDetectActivity, zzadVar}, -1915524826, 1915524826);
    }

    public static void onExtraCallbackWithResult(MalwareDetectActivity malwareDetectActivity, setAdUnitIds setadunitids) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{malwareDetectActivity, setadunitids}, -1072520234, 1072520236);
    }

    public static void onWarmupCompleted(MalwareDetectActivity malwareDetectActivity, s8ExternalSyntheticLambda2 s8externalsyntheticlambda2) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{malwareDetectActivity, s8externalsyntheticlambda2}, -689099100, 689099101);
    }

    public static void IAuthTabCallback(MalwareDetectActivity malwareDetectActivity, s5a s5aVar) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{malwareDetectActivity, s5aVar}, 609924034, -609924031);
    }
}
