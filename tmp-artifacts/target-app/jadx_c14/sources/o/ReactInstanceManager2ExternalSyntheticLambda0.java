package o;

import com.google.gson.annotations.SerializedName;
import im.toss.core.workerservice.WorkerService$Companion$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManager2ExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("amount")
    private final int amount;

    @SerializedName("fee")
    private final int fee;

    @SerializedName("isUssCard")
    private final boolean isUssCard;

    @SerializedName("payStatus")
    private ReactInstanceManager3 payStatus;

    @SerializedName("payToken")
    private final String payToken;

    @SerializedName("transportationCardChargingErrorCode")
    private String transportationCardChargingErrorCode;

    @SerializedName("transportationCardChargingErrorMessage")
    private String transportationCardChargingErrorMessage;

    @SerializedName("transportationCardChargingStatus")
    private ReactNativeApplicationEntryPoint transportationCardChargingStatus;

    @SerializedName("transportationCardChargingStatusUpdatedAt")
    private String transportationCardChargingStatusUpdatedAt;

    @SerializedName("transportationCardNumber")
    private final String transportationCardNumber;

    @SerializedName("transportationCardTransactionCode")
    private final String transportationCardTransactionCode;

    @SerializedName("transportationCardTransactionNumber")
    private final String transportationCardTransactionNumber;

    @SerializedName("transportationCardTransactionTypeCode")
    private final String transportationCardTransactionTypeCode;

    public static /* synthetic */ ReactInstanceManager2ExternalSyntheticLambda0 IAuthTabCallback(ReactInstanceManager2ExternalSyntheticLambda0 reactInstanceManager2ExternalSyntheticLambda0, int i, int i2, boolean z, ReactInstanceManager3 reactInstanceManager3, String str, String str2, String str3, ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint, String str4, String str5, String str6, String str7, String str8, int i3, Object obj) {
        boolean z2;
        String str9;
        String str10;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i5 + 1;
        onNavigationEvent = i6 % 128;
        int i7 = (i6 % 2 == 0 ? (i3 & 1) == 0 : (i3 & 1) == 0) ? i : reactInstanceManager2ExternalSyntheticLambda0.amount;
        int i8 = (i3 & 2) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.fee : i2;
        if ((i3 & 4) != 0) {
            int i9 = i5 + 85;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z2 = reactInstanceManager2ExternalSyntheticLambda0.isUssCard;
        } else {
            z2 = z;
        }
        ReactInstanceManager3 reactInstanceManager32 = (i3 & 8) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.payStatus : reactInstanceManager3;
        if ((i3 & 16) != 0) {
            str9 = reactInstanceManager2ExternalSyntheticLambda0.payToken;
            int i11 = i5 + 49;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str9 = str;
        }
        if ((i3 & 32) != 0) {
            int i13 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            str10 = reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingErrorCode;
        } else {
            str10 = str2;
        }
        return reactInstanceManager2ExternalSyntheticLambda0.IAuthTabCallback(i7, i8, z2, reactInstanceManager32, str9, str10, (i3 & 64) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingErrorMessage : str3, (i3 & 128) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingStatus : reactNativeApplicationEntryPoint, (i3 & 256) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingStatusUpdatedAt : str4, (i3 & 512) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardNumber : str5, (i3 & 1024) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardTransactionCode : str6, (i3 & 2048) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardTransactionNumber : str7, (i3 & 4096) != 0 ? reactInstanceManager2ExternalSyntheticLambda0.transportationCardTransactionTypeCode : str8);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i2 | i6);
        int i12 = i5 | i11;
        int i13 = (~(i5 | i6)) | (~(i7 | i8 | i9)) | i11 | (~(i2 | i5));
        int i14 = i2 + i6 + i3 + (1272450877 * i4) + ((-51365948) * i);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i2) + 922746880 + ((-1437248296) * i6) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i3) + ((-1881145344) * i4) + ((-578813952) * i) + ((-124846080) * i15);
        int i17 = (i2 * 1187242746) + 1002376400 + (i6 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i3 * 1187242569) + (i4 * (-1484311963)) + (i * 1141305060) + (i15 * 516358144);
        return i16 + ((i17 * i17) * (-861863936)) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public final ReactInstanceManager2ExternalSyntheticLambda0 IAuthTabCallback(int i, int i2, boolean z, @Nullable ReactInstanceManager3 reactInstanceManager3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(reactNativeApplicationEntryPoint, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        ReactInstanceManager2ExternalSyntheticLambda0 reactInstanceManager2ExternalSyntheticLambda0 = new ReactInstanceManager2ExternalSyntheticLambda0(i, i2, z, reactInstanceManager3, str, str2, str3, reactNativeApplicationEntryPoint, str4, str5, str6, str7, str8);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return reactInstanceManager2ExternalSyntheticLambda0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactInstanceManager2ExternalSyntheticLambda0)) {
            return false;
        }
        ReactInstanceManager2ExternalSyntheticLambda0 reactInstanceManager2ExternalSyntheticLambda0 = (ReactInstanceManager2ExternalSyntheticLambda0) obj;
        if (this.amount != reactInstanceManager2ExternalSyntheticLambda0.amount || this.fee != reactInstanceManager2ExternalSyntheticLambda0.fee) {
            return false;
        }
        if (this.isUssCard != reactInstanceManager2ExternalSyntheticLambda0.isUssCard) {
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.payStatus != reactInstanceManager2ExternalSyntheticLambda0.payStatus || !Intrinsics.areEqual(this.payToken, reactInstanceManager2ExternalSyntheticLambda0.payToken) || !Intrinsics.areEqual(this.transportationCardChargingErrorCode, reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingErrorCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transportationCardChargingErrorMessage, reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingErrorMessage)) {
            int i6 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.transportationCardChargingStatus != reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingStatus) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transportationCardChargingStatusUpdatedAt, reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingStatusUpdatedAt)) {
            int i7 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.transportationCardNumber, reactInstanceManager2ExternalSyntheticLambda0.transportationCardNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transportationCardTransactionCode, reactInstanceManager2ExternalSyntheticLambda0.transportationCardTransactionCode)) {
            int i8 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.transportationCardTransactionNumber, reactInstanceManager2ExternalSyntheticLambda0.transportationCardTransactionNumber)) {
            int i9 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.transportationCardTransactionTypeCode, reactInstanceManager2ExternalSyntheticLambda0.transportationCardTransactionTypeCode)) {
            return true;
        }
        int i11 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i11 % 128;
        return i11 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.amount);
        int iHashCode3 = Integer.hashCode(this.fee);
        int iHashCode4 = Boolean.hashCode(this.isUssCard);
        ReactInstanceManager3 reactInstanceManager3 = this.payStatus;
        if (reactInstanceManager3 == null) {
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = reactInstanceManager3.hashCode();
        }
        return (((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + this.payToken.hashCode()) * 31) + this.transportationCardChargingErrorCode.hashCode()) * 31) + this.transportationCardChargingErrorMessage.hashCode()) * 31) + this.transportationCardChargingStatus.hashCode()) * 31) + this.transportationCardChargingStatusUpdatedAt.hashCode()) * 31) + this.transportationCardNumber.hashCode()) * 31) + this.transportationCardTransactionCode.hashCode()) * 31) + this.transportationCardTransactionNumber.hashCode()) * 31) + this.transportationCardTransactionTypeCode.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TmoneyChargingErrorSyncRequest(amount=" + this.amount + ", fee=" + this.fee + ", isUssCard=" + this.isUssCard + ", payStatus=" + this.payStatus + ", payToken=" + this.payToken + ", transportationCardChargingErrorCode=" + this.transportationCardChargingErrorCode + ", transportationCardChargingErrorMessage=" + this.transportationCardChargingErrorMessage + ", transportationCardChargingStatus=" + this.transportationCardChargingStatus + ", transportationCardChargingStatusUpdatedAt=" + this.transportationCardChargingStatusUpdatedAt + ", transportationCardNumber=" + this.transportationCardNumber + ", transportationCardTransactionCode=" + this.transportationCardTransactionCode + ", transportationCardTransactionNumber=" + this.transportationCardTransactionNumber + ", transportationCardTransactionTypeCode=" + this.transportationCardTransactionTypeCode + ")";
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ReactInstanceManager2ExternalSyntheticLambda0(int i, int i2, boolean z, @Nullable ReactInstanceManager3 reactInstanceManager3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(reactNativeApplicationEntryPoint, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.amount = i;
        this.fee = i2;
        this.isUssCard = z;
        this.payStatus = reactInstanceManager3;
        this.payToken = str;
        this.transportationCardChargingErrorCode = str2;
        this.transportationCardChargingErrorMessage = str3;
        this.transportationCardChargingStatus = reactNativeApplicationEntryPoint;
        this.transportationCardChargingStatusUpdatedAt = str4;
        this.transportationCardNumber = str5;
        this.transportationCardTransactionCode = str6;
        this.transportationCardTransactionNumber = str7;
        this.transportationCardTransactionTypeCode = str8;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isUssCard;
        int i4 = i3 + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ReactInstanceManager2ExternalSyntheticLambda0 reactInstanceManager2ExternalSyntheticLambda0 = (ReactInstanceManager2ExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReactInstanceManager3 reactInstanceManager3 = reactInstanceManager2ExternalSyntheticLambda0.payStatus;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return reactInstanceManager3;
    }

    public final void onExtraCallback(@Nullable ReactInstanceManager3 reactInstanceManager3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.payStatus = reactInstanceManager3;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.payToken;
        int i4 = i3 + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ReactInstanceManager2ExternalSyntheticLambda0 reactInstanceManager2ExternalSyntheticLambda0 = (ReactInstanceManager2ExternalSyntheticLambda0) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        reactInstanceManager2ExternalSyntheticLambda0.transportationCardChargingErrorCode = str;
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.transportationCardChargingErrorMessage = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.transportationCardChargingErrorMessage = str;
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull ReactNativeApplicationEntryPoint reactNativeApplicationEntryPoint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeApplicationEntryPoint, "");
        this.transportationCardChargingStatus = reactNativeApplicationEntryPoint;
        int i4 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final ReactNativeApplicationEntryPoint onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transportationCardChargingStatus;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.transportationCardChargingStatusUpdatedAt = str;
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.transportationCardNumber;
            int i4 = 2 / 0;
        } else {
            str = this.transportationCardNumber;
        }
        int i5 = i2 + 123;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ReactInstanceManager3 onExtraCallbackWithResult() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (ReactInstanceManager3) onExtraCallbackWithResult(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -534255163, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback, 534255163, new Object[]{this});
    }

    public final void onNavigationEvent(@NotNull String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onExtraCallbackWithResult(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -284728004, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback, 284728005, new Object[]{this, str});
    }
}
