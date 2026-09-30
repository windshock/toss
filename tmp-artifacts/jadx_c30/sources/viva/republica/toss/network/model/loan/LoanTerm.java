package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LoanTerm {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private boolean agreed;
    private final String contentUrl;
    private final long termsId;
    private final String title;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public LoanTerm() {
        this(0L, (String) null, (String) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof viva.republica.toss.network.model.loan.LoanTerm) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (viva.republica.toss.network.model.loan.LoanTerm) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r8.termsId == r9.termsId) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.title, r9.title) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.contentUrl, r9.contentUrl) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r9 = viva.republica.toss.network.model.loan.LoanTerm.onNavigationEvent + 31;
        viva.republica.toss.network.model.loan.LoanTerm.onExtraCallbackWithResult = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r8.agreed == r9.agreed) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.termsId);
        int iHashCode3 = this.title.hashCode();
        String str = this.contentUrl;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + Boolean.hashCode(this.agreed);
        int i7 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanTerm(termsId=" + this.termsId + ", title=" + this.title + ", contentUrl=" + this.contentUrl + ", agreed=" + this.agreed + ")";
        int i2 = onExtraCallbackWithResult + 57;
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
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanTerm> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanTerm$$serializer loanTerm$$serializer = LoanTerm$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return loanTerm$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ LoanTerm(int i, long j, String str, String str2, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            j = 0;
        }
        this.termsId = j;
        if ((i & 2) == 0) {
            this.title = BuildConfig.FLAVOR;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.contentUrl = null;
        } else {
            this.contentUrl = str2;
        }
        int i3 = 2 % 2;
        if ((i & 8) == 0) {
            int i4 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.agreed = false;
            return;
        }
        this.agreed = z;
        int i6 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public LoanTerm(long j, @NotNull String str, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.termsId = j;
        this.title = str;
        this.contentUrl = str2;
        this.agreed = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(LoanTerm loanTerm, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || loanTerm.termsId != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, loanTerm.termsId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(loanTerm.title, BuildConfig.FLAVOR);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(loanTerm.title, BuildConfig.FLAVOR)) {
                vylVar.onExtraCallback(serialDescriptor, 1, loanTerm.title);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (loanTerm.contentUrl != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, loanTerm.contentUrl);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || loanTerm.agreed) {
            vylVar.onNavigationEvent(serialDescriptor, 3, loanTerm.agreed);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanTerm(long j, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            j = 0;
        }
        long j2 = j;
        String str3 = (i & 2) != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 4) != 0) {
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            str2 = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        this(j2, str3, str4, z);
    }
}
