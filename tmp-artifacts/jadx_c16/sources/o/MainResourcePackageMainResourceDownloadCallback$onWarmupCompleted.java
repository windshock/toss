package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MainResourcePackageMainResourceDownloadCallback$onWarmupCompleted extends MainResourcePackageMainResourceDownloadCallback {
    private static int asBinder = 1;
    private static int asInterface;
    private final Long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainResourcePackageMainResourceDownloadCallback$onWarmupCompleted)) {
            return false;
        }
        MainResourcePackageMainResourceDownloadCallback$onWarmupCompleted mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted = (MainResourcePackageMainResourceDownloadCallback$onWarmupCompleted) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.onNavigationEvent)) {
            return false;
        }
        if (this.IAuthTabCallbackStub != mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.IAuthTabCallbackStub) {
            int i4 = asBinder + 21;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.IAuthTabCallback)) {
            return this.onExtraCallbackWithResult == mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.onExtraCallbackWithResult && this.onExtraCallback == mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.onExtraCallback && this.IAuthTabCallbackDefault == mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.IAuthTabCallbackDefault && Intrinsics.areEqual(this.onWarmupCompleted, mainResourcePackageMainResourceDownloadCallback$onWarmupCompleted.onWarmupCompleted);
        }
        int i6 = asInterface + 45;
        asBinder = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = Long.hashCode(this.IAuthTabCallbackStub);
        Long l = this.IAuthTabCallback;
        if (l == null) {
            iHashCode = 1;
            int i2 = asInterface + 1;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = 0;
            }
        } else {
            iHashCode = l.hashCode();
            int i3 = asBinder + 63;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.onExtraCallback)) * 31) + Long.hashCode(this.IAuthTabCallbackDefault)) * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowStandardTerms(moneyTypes=" + this.onNavigationEvent + ", totalAmount=" + this.IAuthTabCallbackStub + ", point=" + this.IAuthTabCallback + ", tossMoney=" + this.onExtraCallbackWithResult + ", tossMoneyCommission=" + this.onExtraCallback + ", tossMoneyMinimumWithdrawAmount=" + this.IAuthTabCallbackDefault + ", standardTermsCode=" + this.onWarmupCompleted + ")";
        int i2 = asInterface + 61;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainResourcePackageMainResourceDownloadCallback$onWarmupCompleted(@NotNull String str, long j, @Nullable Long l, long j2, long j3, long j4, @NotNull String str2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onNavigationEvent = str;
        this.IAuthTabCallbackStub = j;
        this.IAuthTabCallback = l;
        this.onExtraCallbackWithResult = j2;
        this.onExtraCallback = j3;
        this.IAuthTabCallbackDefault = j4;
        this.onWarmupCompleted = str2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i3 + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackStub;
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = i3 + 33;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return j;
    }

    public final Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Long l = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return l;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 89;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        if (i4 != 0) {
            int i5 = 73 / 0;
        }
        int i6 = i3 + 27;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.IAuthTabCallbackDefault;
        int i4 = i3 + 81;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return j;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }
}
