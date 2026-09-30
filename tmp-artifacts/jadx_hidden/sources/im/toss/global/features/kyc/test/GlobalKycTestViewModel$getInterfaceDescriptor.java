package im.toss.global.features.kyc.test;

import com.google.android.gms.internal.firebase-auth-api.zzmr;
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
final class GlobalKycTestViewModel$getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$getInterfaceDescriptor.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$getInterfaceDescriptor(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$getInterfaceDescriptor> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GlobalKycTestViewModel$getInterfaceDescriptor globalKycTestViewModel$getInterfaceDescriptor = (GlobalKycTestViewModel$getInterfaceDescriptor) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$getInterfaceDescriptor globalKycTestViewModel$getInterfaceDescriptor2 = new GlobalKycTestViewModel$getInterfaceDescriptor(globalKycTestViewModel$getInterfaceDescriptor.this$0, (access13800) objArr[2]);
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5720);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 19) & 1) != 0) {
            return globalKycTestViewModel$getInterfaceDescriptor2;
        }
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i4);
        int i10 = ~i4;
        int i11 = i9 | (~(i7 | i10 | i3));
        int i12 = (~(i4 | i8)) | i7 | (~(i10 | i3));
        int i13 = i6 + i3 + i + (1112421973 * i2) + ((-1897213938) * i5);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i6) - 781189120) + ((-1395624931) * i3) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i) + ((-1446510592) * i2) + (892338176 * i5) + ((-1657864192) * i14);
        int i16 = (i6 * 2010092721) + 1217064380 + (i3 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i * 2010091741) + (i2 * (-1378896031)) + (i5 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GlobalKycTestViewModel$getInterfaceDescriptor globalKycTestViewModel$getInterfaceDescriptor = (GlobalKycTestViewModel$getInterfaceDescriptor) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
        Object objInvokeSuspend = globalKycTestViewModel$getInterfaceDescriptor.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5625);
        return objInvokeSuspend;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3939);
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$getInterfaceDescriptor globalKycTestViewModel$getInterfaceDescriptor = (GlobalKycTestViewModel$getInterfaceDescriptor) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 11) & 1;
        Object obj2 = null;
        if (i3 != 0) {
            access14300.onWarmupCompleted();
            int i4 = globalKycTestViewModel$getInterfaceDescriptor.label;
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = globalKycTestViewModel$getInterfaceDescriptor.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            Object[] objArr2 = {globalKycTestViewModel$getInterfaceDescriptor.this$0};
            hasNotSupportCdnRule hasnotsupportcdnrule = (hasNotSupportCdnRule) GlobalKycTestViewModel.onNavigationEvent(172548271, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -172548268, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            globalKycTestViewModel$getInterfaceDescriptor.label = 1;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
            if (hasnotsupportcdnrule.onWarmupCompleted(globalKycTestViewModel$getInterfaceDescriptor) == objOnWarmupCompleted) {
                int i6 = IAuthTabCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
                int i7 = i6 & iOnWarmupCompleted2;
                if ((((((i6 ^ iOnWarmupCompleted2) | i7) & (~i7)) >> 1) & 1) == 0) {
                    return objOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = IAuthTabCallback;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
            if ((((((~i8) & iOnWarmupCompleted3) | ((~iOnWarmupCompleted3) & i8)) >> 23) & 1) != 0) {
                ResultKt.onNavigationEvent(obj);
                ((Result) obj).onNavigationEvent();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            ((Result) obj).onNavigationEvent();
        }
        Unit unit = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
        return unit;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return (access13800) IAuthTabCallback(new Object[]{this, obj, access13800Var}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1589077068, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1589077070);
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(new Object[]{this, findresandmsg, access13800Var}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1667739481, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1667739482);
    }

    public final Object invokeSuspend(Object obj) {
        return IAuthTabCallback(new Object[]{this, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1578766782, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1578766782);
    }
}
