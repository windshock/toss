package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35 {
    private static int asBinder = 1;
    private static int onTransact;
    private final long IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asInterface;
    private final int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = asBinder + 25;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult)) {
            int i5 = asBinder + 107;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return false;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult) obj;
        if (!Intrinsics.areEqual(this.asInterface, safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.IAuthTabCallbackDefault)) {
            int i7 = onTransact + 69;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.onExtraCallbackWithResult)) {
            int i9 = asBinder + 99;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.onNavigationEvent)) {
            int i11 = onTransact + 121;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.IAuthTabCallback != safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.IAuthTabCallback || this.onExtraCallback != safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.onExtraCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackStub, safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.IAuthTabCallbackStub)) {
            return true;
        }
        int i13 = asBinder + 89;
        onTransact = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((((this.asInterface.hashCode() * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + Long.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + this.IAuthTabCallbackStub.hashCode();
        int i5 = asBinder + 103;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "BeProductGranted(orderId=" + this.asInterface + ", productId=" + this.IAuthTabCallbackDefault + ", displayName=" + this.onWarmupCompleted + ", displayPrice=" + this.onExtraCallbackWithResult + ", currency=" + this.onNavigationEvent + ", amount=" + this.IAuthTabCallback + ", fraction=" + this.onExtraCallback + ", miniAppIconUrl=" + this.IAuthTabCallbackStub + ")";
        int i3 = onTransact + 55;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, int i2, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.asInterface = str;
        this.IAuthTabCallbackDefault = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
        this.onNavigationEvent = str5;
        this.IAuthTabCallback = j;
        this.onExtraCallback = i2;
        this.IAuthTabCallbackStub = str6;
    }

    public final String asInterface() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.asInterface;
        int i6 = i3 + 119;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String asBinder() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.IAuthTabCallbackDefault;
        int i6 = i3 + 41;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.onWarmupCompleted;
        int i6 = i3 + 73;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i2 = 2 % 2;
        int i3 = onTransact + 27;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            str = this.onExtraCallbackWithResult;
            int i5 = 84 / 0;
        } else {
            str = this.onExtraCallbackWithResult;
        }
        int i6 = i4 + 29;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact + 49;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onTransact + 13;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.onExtraCallback;
        int i7 = i3 + 61;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final String IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        String str = this.IAuthTabCallbackStub;
        int i6 = i4 + 59;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
