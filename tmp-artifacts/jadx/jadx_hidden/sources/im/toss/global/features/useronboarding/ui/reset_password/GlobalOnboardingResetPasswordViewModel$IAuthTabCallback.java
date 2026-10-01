package im.toss.global.features.useronboarding.ui.reset_password;

import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.GetBillingConfigParamsBuilder;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.getBooleanFromAdObject;

/* loaded from: classes.dex */
final class GlobalOnboardingResetPasswordViewModel$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = -615545090;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static byte[] onExtraCallback = {-1, 13, -3, -9, 14, -11, 11, 4, 75, -80, -4, 3, -6, 95, -15, -54, -14, -12, -15, 0, 13, 74, 15, -77, -5, 11, 1, 9, 11, 74, -15, -54, -16, -16, 10, 6, -5, 67, 15, -71, -13, 92, -68, 8, 3, -10, 8};
    private static short[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 165975674;
    private static int onWarmupCompleted = -1538795507;
    final /* synthetic */ GetBillingConfigParamsBuilder $unifiedSessions;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GlobalOnboardingResetPasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalOnboardingResetPasswordViewModel$IAuthTabCallback(GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, GetBillingConfigParamsBuilder getBillingConfigParamsBuilder, access13800<? super GlobalOnboardingResetPasswordViewModel$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalOnboardingResetPasswordViewModel;
        this.$unifiedSessions = getBillingConfigParamsBuilder;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalOnboardingResetPasswordViewModel$IAuthTabCallback globalOnboardingResetPasswordViewModel$IAuthTabCallback = new GlobalOnboardingResetPasswordViewModel$IAuthTabCallback(this.this$0, this.$unifiedSessions, access13800Var);
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return globalOnboardingResetPasswordViewModel$IAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = asInterface + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fa, code lost:
    
        if (r13.onExtraCallback(r6, r12) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$IAuthTabCallback.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onWarmupCompleted);
        boolean z2 = iO == -1;
        if (z2) {
            byte[] bArr2 = onExtraCallback;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr3[i7] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr2[i7]);
                }
                bArr2 = bArr3;
            }
            iO = bArr2 != null ? (byte) (((byte) (onExtraCallback[getBooleanFromAdObject.onWarmupCompleted.o(i, IAuthTabCallback)] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))) : (short) (((short) (onExtraCallbackWithResult[((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            int i8 = ((i + iO) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
            if (!(!z2)) {
                int i9 = $10 + 93;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i4;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, onNavigationEvent, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr4 = onExtraCallback;
            if (bArr4 != null) {
                int i11 = $10 + 9;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    int i12 = $10 + 71;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        bArr[i5] = (byte) (bArr4[i5] % (-4629411779493505016L));
                    } else {
                        bArr[i5] = (byte) (bArr4[i5] ^ (-4629411779493505016L));
                        i5++;
                    }
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                z = true;
            } else {
                int i13 = $11 + 9;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                z = false;
            }
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                int i15 = $10 + 105;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                if (z) {
                    byte[] bArr5 = onExtraCallback;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }
}
