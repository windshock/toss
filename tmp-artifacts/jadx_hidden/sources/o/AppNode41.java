package o;

import im.toss.devtool.runtime.data.util.DevToolActionActivity;

/* loaded from: classes.dex */
public final class AppNode41 implements setSize<DevToolActionActivity> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode41.class);

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~((~i6) | i8 | i5);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i5);
        int i13 = (~(i6 | i7)) | (~(i7 | i4)) | i10;
        int i14 = i5 + i4 + i3 + (1787548100 * i) + (1101416392 * i2);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i5) - 623378432) + (561581232 * i4) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i3) + ((-778043392) * i) + ((-46137344) * i2) + (324403200 * i15);
        int i17 = (i5 * (-930662234)) + 656878810 + (i4 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i3 * (-930661477)) + (i * 2052861356) + (i2 * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DevToolActionActivity devToolActionActivity = (DevToolActionActivity) objArr[0];
        destroy destroyVar = (destroy) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
        devToolActionActivity.controller = destroyVar;
        if ((((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240)) >> 20) & 1) == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DevToolActionActivity devToolActionActivity = (DevToolActionActivity) objArr[0];
        getScopeType getscopetype = (getScopeType) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
        devToolActionActivity.repository = getscopetype;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 24) & 1) == 0) {
            int i4 = 27 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DevToolActionActivity devToolActionActivity = (DevToolActionActivity) objArr[0];
        zzad zzadVar = (zzad) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
        devToolActionActivity.environments = zzadVar;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
        return null;
    }

    public static void onExtraCallback(DevToolActionActivity devToolActionActivity, destroy destroyVar) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{devToolActionActivity, destroyVar}, 1317112532, -1317112532, iIAuthTabCallback);
    }

    public static void onWarmupCompleted(DevToolActionActivity devToolActionActivity, zzad zzadVar) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{devToolActionActivity, zzadVar}, -1108565799, 1108565800, iIAuthTabCallback);
    }

    public static void onNavigationEvent(DevToolActionActivity devToolActionActivity, getScopeType getscopetype) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{devToolActionActivity, getscopetype}, -1784014623, 1784014625, iIAuthTabCallback);
    }
}
