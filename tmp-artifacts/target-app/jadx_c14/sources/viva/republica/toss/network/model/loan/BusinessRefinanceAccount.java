package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BusinessRefinanceAccount {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String companyLogoUrl;
    private final String companyName;
    private final String corporateName;
    private final long id;
    private final double interestRate;
    private final long loanAmount;
    private final String loanName;

    static {
        int i = onExtraCallback + 101;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessRefinanceAccount)) {
            return false;
        }
        BusinessRefinanceAccount businessRefinanceAccount = (BusinessRefinanceAccount) obj;
        if (this.id != businessRefinanceAccount.id || this.loanAmount != businessRefinanceAccount.loanAmount || Double.compare(this.interestRate, businessRefinanceAccount.interestRate) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.loanName, businessRefinanceAccount.loanName)) {
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.companyName, businessRefinanceAccount.companyName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.companyLogoUrl, businessRefinanceAccount.companyLogoUrl)) {
            return Intrinsics.areEqual(this.corporateName, businessRefinanceAccount.corporateName);
        }
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.loanAmount)) * 31) + Double.hashCode(this.interestRate)) * 31) + this.loanName.hashCode()) * 31) + this.companyName.hashCode()) * 31) + this.companyLogoUrl.hashCode()) * 31) + this.corporateName.hashCode();
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BusinessRefinanceAccount(id=" + this.id + ", loanAmount=" + this.loanAmount + ", interestRate=" + this.interestRate + ", loanName=" + this.loanName + ", companyName=" + this.companyName + ", companyLogoUrl=" + this.companyLogoUrl + ", corporateName=" + this.corporateName + ")";
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BusinessRefinanceAccount> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            BusinessRefinanceAccount$$serializer businessRefinanceAccount$$serializer = BusinessRefinanceAccount$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return businessRefinanceAccount$$serializer;
        }
    }

    public /* synthetic */ BusinessRefinanceAccount(int i, long j, long j2, double d, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, BusinessRefinanceAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.loanAmount = j2;
        this.interestRate = d;
        if ((i & 8) == 0) {
            this.loanName = "";
        } else {
            this.loanName = str;
        }
        if ((i & 16) == 0) {
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.companyName = "";
        } else {
            this.companyName = str2;
        }
        int i6 = 2 % 2;
        if ((i & 32) == 0) {
            int i7 = IAuthTabCallback + 47;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            this.companyLogoUrl = "";
            if (i8 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            this.companyLogoUrl = str3;
        }
        int i9 = 2 % 2;
        if ((i & 64) == 0) {
            this.corporateName = "";
        } else {
            this.corporateName = str4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(BusinessRefinanceAccount businessRefinanceAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, businessRefinanceAccount.id);
        vylVar.onExtraCallback(serialDescriptor, 1, businessRefinanceAccount.loanAmount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, businessRefinanceAccount.interestRate);
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3)) || !Intrinsics.areEqual(businessRefinanceAccount.loanName, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, businessRefinanceAccount.loanName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || (!Intrinsics.areEqual(businessRefinanceAccount.companyName, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 4, businessRefinanceAccount.companyName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(businessRefinanceAccount.companyLogoUrl, "")) {
            vylVar.onExtraCallback(serialDescriptor, 5, businessRefinanceAccount.companyLogoUrl);
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i4 = IAuthTabCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(businessRefinanceAccount.corporateName, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 6, businessRefinanceAccount.corporateName);
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.id;
        int i5 = i2 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.loanAmount;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        double d = this.interestRate;
        int i4 = i3 + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return d;
        }
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.loanName;
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.companyName;
        int i4 = i3 + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.companyLogoUrl;
            int i4 = 75 / 0;
        } else {
            str = this.companyLogoUrl;
        }
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.corporateName;
        int i5 = i3 + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
