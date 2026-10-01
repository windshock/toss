package im.toss.global.features.kyc.test;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
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
final class GlobalKycTestViewModel$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$onNavigationEvent.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$onNavigationEvent(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GlobalKycTestViewModel$onNavigationEvent globalKycTestViewModel$onNavigationEvent = (GlobalKycTestViewModel$onNavigationEvent) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$onNavigationEvent globalKycTestViewModel$onNavigationEvent2 = new GlobalKycTestViewModel$onNavigationEvent(globalKycTestViewModel$onNavigationEvent.this$0, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
        return globalKycTestViewModel$onNavigationEvent2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$onNavigationEvent globalKycTestViewModel$onNavigationEvent = (GlobalKycTestViewModel$onNavigationEvent) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
        GlobalKycTestViewModel$onNavigationEvent globalKycTestViewModel$onNavigationEventCreate = globalKycTestViewModel$onNavigationEvent.create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
        Object objInvokeSuspend = globalKycTestViewModel$onNavigationEventCreate.invokeSuspend(unit);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1212);
        return objInvokeSuspend;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = i3 | i7 | (~i2);
        int i9 = ~i3;
        int i10 = (~(i2 | i7)) | (~(i7 | i9));
        int i11 = i + i3 + i6 + ((-92689393) * i4) + (1942122663 * i5);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i) - 357761024) + ((-674687396) * i3) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i6) + ((-1056047104) * i4) + ((-742522880) * i5) + ((-592117760) * i12);
        int i14 = (i * 1048061654) + 1366922925 + (i3 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i6 * 1048061961) + (i4 * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        return i15 != 1 ? i15 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1495);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (((((i4 & i3) | (i3 ^ i4)) >> 16) & 1) == 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i5 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
        if ((((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 13) & 1) == 0) {
            int i6 = 31 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GlobalKycTestViewModel$onNavigationEvent globalKycTestViewModel$onNavigationEvent = (GlobalKycTestViewModel$onNavigationEvent) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = globalKycTestViewModel$onNavigationEvent.label;
        if (i2 != 0) {
            int i3 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
            if (((((i3 | iOnWarmupCompleted) & (~(i3 & iOnWarmupCompleted))) >> 16) & 1) != 0 ? i2 != 1 : i2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
            ResultKt.onNavigationEvent(obj);
            ((Result) obj).onNavigationEvent();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
        } else {
            ResultKt.onNavigationEvent(obj);
            Object[] objArr2 = {globalKycTestViewModel$onNavigationEvent.this$0};
            hasNotSupportCdnRule hasnotsupportcdnrule = (hasNotSupportCdnRule) GlobalKycTestViewModel.onNavigationEvent(172548271, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -172548268, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            globalKycTestViewModel$onNavigationEvent.label = 1;
            int i4 = onExtraCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
            int i5 = i4 & iOnWarmupCompleted2;
            if ((1 & ((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 27)) == 0) {
                hasnotsupportcdnrule.onExtraCallback(globalKycTestViewModel$onNavigationEvent);
                throw null;
            }
            if (hasnotsupportcdnrule.onExtraCallback(globalKycTestViewModel$onNavigationEvent) == objOnWarmupCompleted) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4550);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3276);
                return objOnWarmupCompleted;
            }
        }
        Unit unit = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        return unit;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (access13800) onWarmupCompleted(1129137238, iOnExtraCallbackWithResult, -1129137236, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, obj, access13800Var}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return onWarmupCompleted(-147444828, iOnExtraCallbackWithResult, 147444829, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, findresandmsg, access13800Var}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public final Object invokeSuspend(Object obj) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return onWarmupCompleted(-1522419570, iOnExtraCallbackWithResult, 1522419570, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, obj}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }
}
