package im.toss.global.features.kyc.test;

import im.toss.TossApplication;
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
final class GlobalKycTestViewModel$asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$asBinder.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$asBinder(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$asBinder> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = i6 | i7 | i8;
        int i10 = (~(i7 | i4)) | (~(i8 | i6));
        int i11 = (~(i4 | i6)) | (~(i7 | (~i6) | i8));
        int i12 = i6 + i3 + i2 + ((-160716491) * i5) + (1883135422 * i);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i6) - 666828800) + ((-962678542) * i3) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i2) + ((-1967783936) * i5) + ((-2092695552) * i) + ((-870252544) * i13);
        int i15 = (i6 * 1975847376) + 750996803 + (i3 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i2 * 1975846509) + (i5 * (-526956143)) + (i * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        return i16 != 1 ? i16 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$asBinder globalKycTestViewModel$asBinder = (GlobalKycTestViewModel$asBinder) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
        Object objInvokeSuspend = globalKycTestViewModel$asBinder.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 26) & 1) != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GlobalKycTestViewModel$asBinder globalKycTestViewModel$asBinder = (GlobalKycTestViewModel$asBinder) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$asBinder globalKycTestViewModel$asBinder2 = new GlobalKycTestViewModel$asBinder(globalKycTestViewModel$asBinder.this$0, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
        return globalKycTestViewModel$asBinder2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalKycTestViewModel$asBinder globalKycTestViewModel$asBinder = (GlobalKycTestViewModel$asBinder) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 30) & 1) == 0) {
            access14300.onWarmupCompleted();
            int i5 = globalKycTestViewModel$asBinder.label;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = globalKycTestViewModel$asBinder.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            Object[] objArr2 = {globalKycTestViewModel$asBinder.this$0};
            hasNotSupportCdnRule hasnotsupportcdnrule = (hasNotSupportCdnRule) GlobalKycTestViewModel.onNavigationEvent(172548271, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -172548268, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            globalKycTestViewModel$asBinder.label = 1;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
            if (hasnotsupportcdnrule.onNavigationEvent(globalKycTestViewModel$asBinder) == objOnWarmupCompleted) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
                int i7 = onNavigationEvent;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
                int i8 = (~iOnWarmupCompleted2) & i7;
                int i9 = (~i7) & iOnWarmupCompleted2;
                if (((((i9 & i8) | (i8 ^ i9)) >> 23) & 1) == 0) {
                    int i10 = 13 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
            ResultKt.onNavigationEvent(obj);
            ((Result) obj).onNavigationEvent();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onNavigationEvent;
        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
        int i12 = i11 & iOnWarmupCompleted3;
        if ((((((i11 ^ iOnWarmupCompleted3) | i12) & (~i12)) >> 16) & 1) != 0) {
            int i13 = 30 / 0;
        }
        return unit;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (access13800) onExtraCallback(new Object[]{this, obj, access13800Var}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 2010068741, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), -2010068740);
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return onExtraCallback(new Object[]{this, findresandmsg, access13800Var}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1998820316, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), -1998820316);
    }

    public final Object invokeSuspend(Object obj) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return onExtraCallback(new Object[]{this, obj}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 683632744, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), -683632742);
    }
}
