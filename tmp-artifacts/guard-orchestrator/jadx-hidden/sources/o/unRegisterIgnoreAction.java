package o;

import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;

/* loaded from: classes.dex */
public final class unRegisterIgnoreAction implements setSize<QuickActionBottomSheetActivity> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(unRegisterIgnoreAction.class);

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i7 | i5;
        int i9 = ~i8;
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i10;
        int i13 = (~(i2 | i5)) | (~(i7 | (~i5)));
        int i14 = i5 + i6 + i3 + ((-1311665080) * i4) + (1761575915 * i);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i5) + 412680192 + (1917570655 * i6) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i3) + (175112192 * i4) + ((-649461760) * i) + (1783169024 * i15);
        int i17 = ((i5 * 1226044109) - 1701849991) + (i6 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i3 * 1226043599) + (i4 * (-858626504)) + (i * 1069087493) + (i15 * 1627848704);
        return i16 + ((i17 * i17) * 739704832) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuickActionBottomSheetActivity quickActionBottomSheetActivity = (QuickActionBottomSheetActivity) objArr[0];
        getStartParams getstartparams = (getStartParams) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = 1 & (((i4 & i3) | (i3 ^ i4)) >> 16);
        quickActionBottomSheetActivity.schemeRepository = getstartparams;
        if (i5 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuickActionBottomSheetActivity quickActionBottomSheetActivity = (QuickActionBottomSheetActivity) objArr[0];
        destroy destroyVar = (destroy) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
        quickActionBottomSheetActivity.controller = destroyVar;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 15) & 1) != 0) {
            return null;
        }
        throw null;
    }

    public static void onWarmupCompleted(QuickActionBottomSheetActivity quickActionBottomSheetActivity, destroy destroyVar) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, new Object[]{quickActionBottomSheetActivity, destroyVar}, iOnExtraCallback3, -968328551, 968328551);
    }

    public static void onExtraCallbackWithResult(QuickActionBottomSheetActivity quickActionBottomSheetActivity, getStartParams getstartparams) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, new Object[]{quickActionBottomSheetActivity, getstartparams}, iOnExtraCallback3, 1425524831, -1425524830);
    }
}
