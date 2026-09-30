package im.toss.global.features.kyc.test;

import com.bytedance.sdk.openadsdk.wwx.lt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.hasNotSupportCdnRule;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$onWarmupCompleted.class);
    final /* synthetic */ String $status;
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$onWarmupCompleted(GlobalKycTestViewModel globalKycTestViewModel, String str, access13800<? super GlobalKycTestViewModel$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
        this.$status = str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalKycTestViewModel$onWarmupCompleted globalKycTestViewModel$onWarmupCompleted = (GlobalKycTestViewModel$onWarmupCompleted) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
        Object objInvokeSuspend = globalKycTestViewModel$onWarmupCompleted.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 7) & 1) != 0) {
            int i5 = 16 / 0;
        }
        return objInvokeSuspend;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$onWarmupCompleted globalKycTestViewModel$onWarmupCompleted = (GlobalKycTestViewModel$onWarmupCompleted) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$onWarmupCompleted globalKycTestViewModel$onWarmupCompleted2 = new GlobalKycTestViewModel$onWarmupCompleted(globalKycTestViewModel$onWarmupCompleted.this$0, globalKycTestViewModel$onWarmupCompleted.$status, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
        return globalKycTestViewModel$onWarmupCompleted2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i5 | i4);
        int i12 = i3 | i11;
        int i13 = (~(i3 | i4)) | (~(i7 | i8 | i9)) | i11 | (~(i5 | i3));
        int i14 = i5 + i4 + i + (1272450877 * i2) + ((-51365948) * i6);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i5) + 922746880 + ((-1437248296) * i4) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i) + ((-1881145344) * i2) + ((-578813952) * i6) + ((-124846080) * i15);
        int i17 = (i5 * 1187242746) + 1002376400 + (i4 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i * 1187242569) + (i2 * (-1484311963)) + (i6 * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 9) & 1) != 0) {
            int i3 = 25 / 0;
        }
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GlobalKycTestViewModel$onWarmupCompleted globalKycTestViewModel$onWarmupCompleted = (GlobalKycTestViewModel$onWarmupCompleted) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = globalKycTestViewModel$onWarmupCompleted.label;
        if (i2 != 0) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
            if ((((((~i3) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i3)) >> 27) & 1) != 0) {
                ResultKt.onNavigationEvent(obj);
                ((Result) obj).onNavigationEvent();
                int i4 = 66 / 0;
            } else {
                ResultKt.onNavigationEvent(obj);
                ((Result) obj).onNavigationEvent();
            }
        } else {
            ResultKt.onNavigationEvent(obj);
            Object[] objArr2 = {globalKycTestViewModel$onWarmupCompleted.this$0};
            hasNotSupportCdnRule hasnotsupportcdnrule = (hasNotSupportCdnRule) GlobalKycTestViewModel.onNavigationEvent(172548271, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -172548268, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            String str = globalKycTestViewModel$onWarmupCompleted.$status;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
            globalKycTestViewModel$onWarmupCompleted.label = 1;
            if (hasnotsupportcdnrule.IAuthTabCallback(str, globalKycTestViewModel$onWarmupCompleted) == objOnWarmupCompleted) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1443);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
                return objOnWarmupCompleted;
            }
        }
        Unit unit = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        return unit;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (access13800) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 101084377, -101084376, new Object[]{this, obj, access13800Var}, lt.40.onExtraCallbackWithResult());
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return onWarmupCompleted(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 745255680, -745255678, new Object[]{this, findresandmsg, access13800Var}, lt.40.onExtraCallbackWithResult());
    }

    public final Object invokeSuspend(Object obj) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return onWarmupCompleted(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1492102168, 1492102168, new Object[]{this, obj}, lt.40.onExtraCallbackWithResult());
    }
}
