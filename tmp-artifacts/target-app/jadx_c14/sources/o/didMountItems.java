package o;

import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferAccountHolder;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class didMountItems {
    private static final String ERROR_CODE_DELAYED_TRANSFER = "TE_TRANSIT_TO_DELAYED_TRANSFER";
    private static final String ERROR_CODE_NOT_DEPOSITABLE = "TE_NOT_DEPOSITABLE_ACCOUNT";
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final boolean onNavigationEvent(@NotNull BaseApiResponse<TransferAccountHolder> baseApiResponse) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, "");
        ApiServerError apiServerErrorAsInterface = baseApiResponse.asInterface();
        if (apiServerErrorAsInterface != null) {
            strOnExtraCallbackWithResult = apiServerErrorAsInterface.onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strOnExtraCallbackWithResult = null;
        }
        return Intrinsics.areEqual(strOnExtraCallbackWithResult, ERROR_CODE_NOT_DEPOSITABLE);
    }

    public static final boolean onExtraCallbackWithResult(@NotNull BaseApiResponse<TransferAccountHolder> baseApiResponse) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, "");
        ApiServerError apiServerErrorAsInterface = baseApiResponse.asInterface();
        Object obj = null;
        if (apiServerErrorAsInterface != null) {
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallbackWithResult = apiServerErrorAsInterface.onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
        } else {
            strOnExtraCallbackWithResult = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(strOnExtraCallbackWithResult, ERROR_CODE_DELAYED_TRANSFER);
        int i5 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return zAreEqual;
        }
        obj.hashCode();
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull BaseApiResponse<TransferAccountHolder> baseApiResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, "");
        ApiServerError apiServerErrorAsInterface = baseApiResponse.asInterface();
        if (apiServerErrorAsInterface != null) {
            apiServerErrorAsInterface.onWarmupCompleted(ERROR_CODE_DELAYED_TRANSFER);
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }
}
