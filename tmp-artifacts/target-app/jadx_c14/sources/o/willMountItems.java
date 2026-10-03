package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.TransferAccountDto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class willMountItems {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final TransferAccountDto onNavigationEvent(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        int iIntValue = 0;
        if (keyBoardVisiblePoint instanceof onDisclaimerClick) {
            Integer intOrNull = StringsKt.toIntOrNull(keyBoardVisiblePoint.asInterface());
            if (intOrNull != null) {
                int i4 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iIntValue = intOrNull.intValue();
            }
            return new TransferAccountDto(iIntValue, keyBoardVisiblePoint.onExtraCallbackWithResult());
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(keyBoardVisiblePoint.asInterface());
        if (intOrNull2 != null) {
            int i6 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                intOrNull2.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iIntValue = intOrNull2.intValue();
        }
        return new TransferAccountDto(iIntValue, keyBoardVisiblePoint.bP_());
    }

    public static final TransferAccountDto onExtraCallbackWithResult(@NotNull MyAccountInfo myAccountInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        TransferAccountDto transferAccountDto = new TransferAccountDto(myAccountInfo.IAuthTabCallbackStub(), myAccountInfo.onExtraCallback());
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return transferAccountDto;
    }
}
