package com.krc.pl_card.model;

import com.krc.pl_card.enums.ResponseCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KRCEpCardResponse<T> {
    private final String additionalCode;
    private final ResponseCode code;
    private final T data;
    private final String message;
    private final boolean result;

    public KRCEpCardResponse(boolean z, @Nullable T t, @NotNull String str, @NotNull ResponseCode responseCode, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(responseCode, "");
        this.result = z;
        this.data = t;
        this.message = str;
        this.code = responseCode;
        this.additionalCode = str2;
    }

    public /* synthetic */ KRCEpCardResponse(boolean z, Object obj, String str, ResponseCode responseCode, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, obj, str, (i2 & 8) != 0 ? ResponseCode.UNKNOWN_ERROR : responseCode, (i2 & 16) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KRCEpCardResponse copy$default(KRCEpCardResponse kRCEpCardResponse, boolean z, Object obj, String str, ResponseCode responseCode, String str2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = kRCEpCardResponse.result;
        }
        T t = obj;
        if ((i2 & 2) != 0) {
            t = kRCEpCardResponse.data;
        }
        T t2 = t;
        if ((i2 & 4) != 0) {
            str = kRCEpCardResponse.message;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            responseCode = kRCEpCardResponse.code;
        }
        ResponseCode responseCode2 = responseCode;
        if ((i2 & 16) != 0) {
            str2 = kRCEpCardResponse.additionalCode;
        }
        return kRCEpCardResponse.copy(z, t2, str3, responseCode2, str2);
    }

    public final boolean component1() {
        return this.result;
    }

    public final T component2() {
        return this.data;
    }

    public final String component3() {
        return this.message;
    }

    public final ResponseCode component4() {
        return this.code;
    }

    public final String component5() {
        return this.additionalCode;
    }

    public final KRCEpCardResponse<T> copy(boolean z, @Nullable T t, @NotNull String str, @NotNull ResponseCode responseCode, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(responseCode, "");
        return new KRCEpCardResponse<>(z, t, str, responseCode, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KRCEpCardResponse)) {
            return false;
        }
        KRCEpCardResponse kRCEpCardResponse = (KRCEpCardResponse) obj;
        return this.result == kRCEpCardResponse.result && Intrinsics.areEqual(this.data, kRCEpCardResponse.data) && Intrinsics.areEqual(this.message, kRCEpCardResponse.message) && this.code == kRCEpCardResponse.code && Intrinsics.areEqual(this.additionalCode, kRCEpCardResponse.additionalCode);
    }

    public final String getAdditionalCode() {
        return this.additionalCode;
    }

    public final ResponseCode getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getResult() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.result;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        T t = this.data;
        int iHashCode = t == null ? 0 : t.hashCode();
        int iHashCode2 = this.message.hashCode();
        int iHashCode3 = this.code.hashCode();
        String str = this.additionalCode;
        return (((((((r0 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "KRCEpCardResponse(result=" + this.result + ", data=" + this.data + ", message=" + this.message + ", code=" + this.code + ", additionalCode=" + this.additionalCode + ')';
    }
}
