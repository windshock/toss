package o;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final LocalDateTime IAuthTabCallbackDefault;
    private final LocalDateTime IAuthTabCallbackStub;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37)) {
            return false;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.IAuthTabCallback)) {
            int i3 = onTransact + 101;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.asInterface)) {
            int i5 = onTransact + 89;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.IAuthTabCallbackStub)) {
            int i7 = asBinder + 25;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onWarmupCompleted) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onNavigationEvent, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onNavigationEvent)) {
            return false;
        }
        int i9 = asBinder + 45;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.onExtraCallback.hashCode();
        LocalDateTime localDateTime = this.IAuthTabCallbackDefault;
        int iHashCode6 = 0;
        int iHashCode7 = localDateTime == null ? 0 : localDateTime.hashCode();
        LocalDateTime localDateTime2 = this.IAuthTabCallbackStub;
        if (localDateTime2 == null) {
            int i3 = onTransact + 73;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = localDateTime2.hashCode();
        }
        String str = this.onWarmupCompleted;
        if (str == null) {
            int i5 = asBinder + 31;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.onExtraCallbackWithResult;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onNavigationEvent;
        if (str3 != null) {
            int i7 = onTransact + 101;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            iHashCode6 = str3.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode6;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "InAppPurchaseCashReceiptUiState(appName=" + this.IAuthTabCallback + ", itemName=" + this.asInterface + ", displayAmount=" + this.onExtraCallback + ", paidAt=" + this.IAuthTabCallbackDefault + ", issuedAt=" + this.IAuthTabCallbackStub + ", approvalNumber=" + this.onWarmupCompleted + ", businessName=" + this.onExtraCallbackWithResult + ", businessRegistrationNumber=" + this.onNavigationEvent + ")";
        int i3 = onTransact + 49;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable LocalDateTime localDateTime, @Nullable LocalDateTime localDateTime2, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallback = str;
        this.asInterface = str2;
        this.onExtraCallback = str3;
        this.IAuthTabCallbackDefault = localDateTime;
        this.IAuthTabCallbackStub = localDateTime2;
        this.onWarmupCompleted = str4;
        this.onExtraCallbackWithResult = str5;
        this.onNavigationEvent = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37(String str, String str2, String str3, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        LocalDateTime localDateTime3;
        LocalDateTime localDateTime4;
        String str7;
        Object obj = null;
        if ((i2 & 8) != 0) {
            int i3 = asBinder + 95;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            localDateTime3 = null;
        } else {
            localDateTime3 = localDateTime;
        }
        if ((i2 & 16) != 0) {
            int i5 = 2 % 2;
            localDateTime4 = null;
        } else {
            localDateTime4 = localDateTime2;
        }
        if ((i2 & 32) != 0) {
            int i6 = asBinder + 11;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        this(str, str2, str3, localDateTime3, localDateTime4, str7, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
    }

    public final String onWarmupCompleted() {
        String str;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.IAuthTabCallback;
            int i5 = 24 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i6 = i3 + 109;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = asBinder + 75;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        String str = this.onExtraCallback;
        int i6 = i4 + 23;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final LocalDateTime asBinder() {
        LocalDateTime localDateTime;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 101;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            localDateTime = this.IAuthTabCallbackDefault;
            int i5 = 61 / 0;
        } else {
            localDateTime = this.IAuthTabCallbackDefault;
        }
        int i6 = i3 + 51;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return localDateTime;
    }

    public final LocalDateTime onTransact() {
        int i2 = 2 % 2;
        int i3 = asBinder + 77;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        LocalDateTime localDateTime = this.IAuthTabCallbackStub;
        int i6 = i4 + 63;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return localDateTime;
    }

    public final String onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.onWarmupCompleted;
        int i6 = i3 + 43;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        String str = this.onExtraCallbackWithResult;
        int i6 = i3 + 93;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onTransact + 23;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }
}
