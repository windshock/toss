package o;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.global.features.kyc.test.GlobalKycTestActivity;

/* loaded from: classes.dex */
public final class EngineConfigEngineConfigInner implements setSize<GlobalKycTestActivity> {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(EngineConfigEngineConfigInner.class);

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~(i | i5)) | i2;
        int i8 = (~((~i5) | i)) | i2;
        int i9 = (~i2) | i;
        int i10 = i2 + i + i3 + (440753341 * i6) + ((-634449194) * i4);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i3) + (780402688 * i6) + ((-180879360) * i4) + (353763328 * i11);
        int i13 = (i2 * 892202253) + 1676176333 + (i * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i3 * 892200819) + (i6 * (-770690073)) + (i4 * 448958498) + (i11 * 1390542848);
        return i12 + ((i13 * i13) * (-1042677760)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestActivity globalKycTestActivity = (GlobalKycTestActivity) objArr[0];
        postHandle posthandle = (postHandle) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5320);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = 1 & (((i4 & i3) | (i3 ^ i4)) >> 19);
        globalKycTestActivity.globalKycLauncher = posthandle;
        if (i5 == 0) {
            return null;
        }
        int i6 = 43 / 0;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GlobalKycTestActivity globalKycTestActivity = (GlobalKycTestActivity) objArr[0];
        zzad zzadVar = (zzad) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 15) & 1;
        Object obj = null;
        globalKycTestActivity.environments = zzadVar;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
        int i6 = i5 & iOnWarmupCompleted2;
        if ((((((i5 ^ iOnWarmupCompleted2) | i6) & (~i6)) >> 24) & 1) != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallbackWithResult(GlobalKycTestActivity globalKycTestActivity, zzad zzadVar) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent(64639701, -64639700, iOnNavigationEvent2, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, new Object[]{globalKycTestActivity, zzadVar}, iOnNavigationEvent3);
    }

    public static void onExtraCallback(GlobalKycTestActivity globalKycTestActivity, postHandle posthandle) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent(-1882162014, 1882162014, iOnNavigationEvent2, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, new Object[]{globalKycTestActivity, posthandle}, iOnNavigationEvent3);
    }
}
