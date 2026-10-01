package im.toss.features.home.core.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CardBillAccount {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountName;
    private final long balanceAmount;
    private final int bankCode;
    private final String imageUrl;
    private final boolean isTossBank;
    private final String landingUrl;
    private final String mydataOrgCode;
    private final String referenceId;

    static {
        int i = onWarmupCompleted + 113;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public CardBillAccount() {
        this((String) null, 0L, (String) null, (String) null, (String) null, (String) null, false, 0, 255, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBillAccount)) {
            return false;
        }
        CardBillAccount cardBillAccount = (CardBillAccount) obj;
        if (!Intrinsics.areEqual(this.accountName, cardBillAccount.accountName)) {
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.balanceAmount != cardBillAccount.balanceAmount) {
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.imageUrl, cardBillAccount.imageUrl) || !Intrinsics.areEqual(this.mydataOrgCode, cardBillAccount.mydataOrgCode) || !Intrinsics.areEqual(this.referenceId, cardBillAccount.referenceId) || !Intrinsics.areEqual(this.landingUrl, cardBillAccount.landingUrl) || this.isTossBank != cardBillAccount.isTossBank) {
            return false;
        }
        if (this.bankCode == cardBillAccount.bankCode) {
            return true;
        }
        int i5 = onNavigationEvent + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.accountName.hashCode() * 31) + Long.hashCode(this.balanceAmount)) * 31) + this.imageUrl.hashCode()) * 31) + this.mydataOrgCode.hashCode()) * 31) + this.referenceId.hashCode()) * 31) + this.landingUrl.hashCode()) * 31) + Boolean.hashCode(this.isTossBank)) * 31) + Integer.hashCode(this.bankCode);
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardBillAccount(accountName=" + this.accountName + ", balanceAmount=" + this.balanceAmount + ", imageUrl=" + this.imageUrl + ", mydataOrgCode=" + this.mydataOrgCode + ", referenceId=" + this.referenceId + ", landingUrl=" + this.landingUrl + ", isTossBank=" + this.isTossBank + ", bankCode=" + this.bankCode + ")";
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardBillAccount(int i, String str, long j, String str2, String str3, String str4, String str5, boolean z, int i2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.accountName = "";
        } else {
            this.accountName = str;
        }
        if ((i & 2) == 0) {
            this.balanceAmount = 0L;
        } else {
            this.balanceAmount = j;
            int i3 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
        if ((i & 8) == 0) {
            this.mydataOrgCode = "";
        } else {
            this.mydataOrgCode = str3;
        }
        if ((i & 16) == 0) {
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.referenceId = "";
            if (i5 != 0) {
                throw null;
            }
        } else {
            this.referenceId = str4;
        }
        if ((i & 32) == 0) {
            this.landingUrl = "";
        } else {
            this.landingUrl = str5;
        }
        if ((i & 64) != 0) {
            this.isTossBank = z;
            int i6 = onNavigationEvent + 83;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
            }
            if ((i & 128) == 0) {
                this.bankCode = i2;
                return;
            }
            int i7 = onNavigationEvent + 81;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            this.bankCode = 0;
            return;
        }
        this.isTossBank = false;
        int i9 = 2 % 2;
        if ((i & 128) == 0) {
        }
    }

    public CardBillAccount(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.accountName = str;
        this.balanceAmount = j;
        this.imageUrl = str2;
        this.mydataOrgCode = str3;
        this.referenceId = str4;
        this.landingUrl = str5;
        this.isTossBank = z;
        this.bankCode = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(CardBillAccount cardBillAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, cardBillAccount.accountName);
        } else if (!Intrinsics.areEqual(cardBillAccount.accountName, "")) {
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || cardBillAccount.balanceAmount != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, cardBillAccount.balanceAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = onNavigationEvent + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(cardBillAccount.imageUrl, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, cardBillAccount.imageUrl);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(cardBillAccount.mydataOrgCode, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, cardBillAccount.mydataOrgCode);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(cardBillAccount.referenceId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 4, cardBillAccount.referenceId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i5 = IAuthTabCallback + 119;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.areEqual(cardBillAccount.landingUrl, "");
                throw null;
            }
            if (!Intrinsics.areEqual(cardBillAccount.landingUrl, "")) {
                vylVar.onExtraCallback(serialDescriptor, 5, cardBillAccount.landingUrl);
                int i6 = onNavigationEvent + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i8 = IAuthTabCallback + 7;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            boolean z = cardBillAccount.isTossBank;
            if (i9 != 0) {
                int i10 = 91 / 0;
                if (z) {
                    vylVar.onNavigationEvent(serialDescriptor, 6, cardBillAccount.isTossBank);
                }
            } else if (z) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || cardBillAccount.bankCode != 0) {
            vylVar.onExtraCallback(serialDescriptor, 7, cardBillAccount.bankCode);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardBillAccount(String str, long j, String str2, String str3, String str4, String str5, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        String str6;
        String str7;
        boolean z2;
        String str8 = "";
        String str9 = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 9;
            onNavigationEvent = i4 % 128;
            j2 = i4 % 2 != 0 ? 1L : 0L;
            int i5 = i3 + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            j2 = j;
        }
        if ((i2 & 4) != 0) {
            int i8 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i2 & 8) != 0) {
            int i9 = 2 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        String str10 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) != 0) {
            int i10 = 2 % 2;
        } else {
            str8 = str5;
        }
        if ((i2 & 64) != 0) {
            int i11 = onNavigationEvent + 49;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(str9, j2, str6, str7, str10, str8, z2, (i2 & 128) == 0 ? i : 0);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.accountName;
        int i5 = i3 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.balanceAmount;
        int i5 = i3 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imageUrl;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.mydataOrgCode;
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.referenceId;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.landingUrl;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.isTossBank;
        int i5 = i3 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.bankCode;
        int i6 = i2 + 49;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
