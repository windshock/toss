package im.toss.global.features.kyc.test;

import com.google.android.gms.internal.ads.zzgsa;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.APMTfsAdapter;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.access13800;
import o.buildHighAvailabilityUrls;
import o.findResAndMsg;
import o.getBillingPeriod;
import o.getPricingPhaseList;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$asInterface.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);

        static {
            int[] iArr = new int[getPricingPhaseList.values().length];
            try {
                int iOrdinal = getPricingPhaseList.AU.ordinal();
                int i = onExtraCallbackWithResult;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2782);
                int i2 = i & iOnWarmupCompleted;
                if ((((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 10) & 1) != 0) {
                    iArr[iOrdinal] = 0;
                } else {
                    iArr[iOrdinal] = 1;
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPricingPhaseList.EU.ordinal()] = 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPricingPhaseList.KR.ordinal()] = 3;
                int i5 = onExtraCallbackWithResult;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5512);
                int i6 = (~iOnWarmupCompleted2) & i5;
                int i7 = (~i5) & iOnWarmupCompleted2;
                if (((((i7 & i6) | (i6 ^ i7)) >> 20) & 1) == 0) {
                    int i8 = 2 / 3;
                } else {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getPricingPhaseList.JP.ordinal()] = 4;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int i11 = onExtraCallbackWithResult;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
            int i12 = i11 & iOnWarmupCompleted3;
            if ((((((i11 ^ iOnWarmupCompleted3) | i12) & (~i12)) >> 16) & 1) == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$asInterface(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$asInterface> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalKycTestViewModel$asInterface globalKycTestViewModel$asInterface = (GlobalKycTestViewModel$asInterface) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$asInterface globalKycTestViewModel$asInterface2 = new GlobalKycTestViewModel$asInterface(globalKycTestViewModel$asInterface.this$0, (access13800) objArr[2]);
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 2) & 1) != 0) {
            return globalKycTestViewModel$asInterface2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GlobalKycTestViewModel$asInterface globalKycTestViewModel$asInterface = (GlobalKycTestViewModel$asInterface) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 14) & 1;
        Object obj = null;
        GlobalKycTestViewModel$asInterface globalKycTestViewModel$asInterfaceCreate = globalKycTestViewModel$asInterface.create(findresandmsg, access13800Var);
        if (i3 != 0) {
            globalKycTestViewModel$asInterfaceCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = globalKycTestViewModel$asInterfaceCreate.invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
        int i5 = i4 & iOnWarmupCompleted2;
        if ((((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 22) & 1) == 0) {
            return objInvokeSuspend;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i6);
        int i11 = i9 | i10 | (~(i8 | i6));
        int i12 = i10 | i3;
        int i13 = ~i6;
        int i14 = (~(i3 | i13 | i5)) | (~(i7 | i13 | i8)) | (~(i8 | i5 | i6));
        int i15 = i5 + i6 + i + ((-1329026341) * i2) + ((-1277752516) * i4);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i6) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i) + (494927872 * i2) + (1577058304 * i4) + ((-1783103488) * i16);
        int i18 = (i5 * 595972471) + 129777640 + (i6 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i * 595972219) + (i2 * (-1341978823)) + (i4 * 731850196) + (i16 * 1869086720);
        int i19 = i17 + (i18 * i18 * (-846725120));
        return i19 != 1 ? i19 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
        int i3 = i2 & iOnWarmupCompleted;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 29) & 1) != 0) {
            return onExtraCallbackWithResult(findresandmsg, access13800Var);
        }
        onExtraCallbackWithResult(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        GlobalKycTestViewModel$asInterface globalKycTestViewModel$asInterface = (GlobalKycTestViewModel$asInterface) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
        if (globalKycTestViewModel$asInterface.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(832);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 8) & 1;
        Object obj2 = null;
        ResultKt.onNavigationEvent(obj);
        if (i3 != 0) {
            Object[] objArr2 = {globalKycTestViewModel$asInterface.this$0};
            ((getBillingPeriod) GlobalKycTestViewModel.onNavigationEvent(-1415513248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1415513248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).onExtraCallbackWithResult();
            throw null;
        }
        Object[] objArr3 = {globalKycTestViewModel$asInterface.this$0};
        int i4 = onWarmupCompleted.IAuthTabCallback[((getBillingPeriod) GlobalKycTestViewModel.onNavigationEvent(-1415513248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1415513248, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr3, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).onExtraCallbackWithResult().ordinal()];
        if (i4 != 1) {
            int i5 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
            int i6 = (~iOnWarmupCompleted2) & i5;
            int i7 = (~i5) & iOnWarmupCompleted2;
            if (((((i7 & i6) | (i6 ^ i7)) >> 2) & 1) == 0 ? i4 == 2 : i4 == 3) {
                Object[] objArr4 = {globalKycTestViewModel$asInterface.this$0};
                ((buildHighAvailabilityUrls) GlobalKycTestViewModel.onNavigationEvent(44637605, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -44637596, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr4, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).onExtraCallbackWithResult();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5625);
            } else if (i4 != 3) {
                int i8 = onNavigationEvent;
                int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
                int i9 = i8 & iOnWarmupCompleted3;
                if ((((((i8 ^ iOnWarmupCompleted3) | i9) & (~i9)) >> 6) & 1) == 0 ? i4 != 4 : i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            Object[] objArr5 = {globalKycTestViewModel$asInterface.this$0};
            Result.IAuthTabCallback(((APMTfsAdapter) GlobalKycTestViewModel.onNavigationEvent(-279829733, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 279829748, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr5, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).IAuthTabCallbackDefault());
            int i10 = onNavigationEvent;
            int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
            if ((((((~i10) & iOnWarmupCompleted4) | ((~iOnWarmupCompleted4) & i10)) >> 9) & 1) != 0) {
                int i11 = 68 / 0;
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onNavigationEvent;
        int iOnWarmupCompleted5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
        int i13 = i12 & iOnWarmupCompleted5;
        if ((((((i12 ^ iOnWarmupCompleted5) | i13) & (~i13)) >> 14) & 1) == 0) {
            return unit;
        }
        obj2.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (access13800) onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this, obj, access13800Var}, zzgsa.onWarmupCompleted(), -1209677698, 1209677699);
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this, findresandmsg, access13800Var}, zzgsa.onWarmupCompleted(), -662968922, 662968924);
    }

    public final Object invokeSuspend(Object obj) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this, obj}, zzgsa.onWarmupCompleted(), 1975884338, -1975884338);
    }
}
