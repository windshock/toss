package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferSigningMethod;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAnimatedModuleExternalSyntheticLambda3 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[isNumber.values().length];
            try {
                iArr[isNumber.BIOMETRIC.ordinal()] = 1;
                int i = IAuthTabCallback + 87;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isNumber.PASSWORD.ordinal()] = 2;
                int i4 = onNavigationEvent + 19;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isNumber.TOSS_FACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final TransferSigningMethod onNavigationEvent(@NotNull isNumber isnumber) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isnumber, "");
        int i4 = onExtraCallbackWithResult.$EnumSwitchMapping$0[isnumber.ordinal()];
        if (i4 == 1) {
            return TransferSigningMethod.BIOMETRIC;
        }
        int i5 = onNavigationEvent;
        int i6 = i5 + 23;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        if (i4 == 2) {
            return TransferSigningMethod.PIN;
        }
        int i8 = i5 + 81;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = i5 + 17;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return TransferSigningMethod.TOSS_FACE;
        }
        TransferSigningMethod transferSigningMethod = TransferSigningMethod.TOSS_FACE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
