package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHistoryContentsResponse$Banner$;
import im.toss.features.credit.data.response.CreditHistoryContentsResponse$Disclaimers$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditHistoryContentsResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Banner banner;
    private final Disclaimers disclaimers;

    static {
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditHistoryContentsResponse() {
        Banner banner = null;
        this(banner, (Disclaimers) banner, 3, (DefaultConstructorMarker) banner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if ((r7 instanceof im.toss.features.credit.data.response.CreditHistoryContentsResponse) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r1 = r1 + 91;
        im.toss.features.credit.data.response.CreditHistoryContentsResponse.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r7 = (im.toss.features.credit.data.response.CreditHistoryContentsResponse) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.banner, r7.banner) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.disclaimers, r7.disclaimers) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 77;
        im.toss.features.credit.data.response.CreditHistoryContentsResponse.onNavigationEvent = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Banner banner = this.banner;
        int iHashCode2 = 0;
        if (banner == null) {
            iHashCode = 0;
        } else {
            iHashCode = banner.hashCode();
            int i4 = onExtraCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        Disclaimers disclaimers = this.disclaimers;
        if (disclaimers != null) {
            int i6 = onNavigationEvent + 13;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                disclaimers.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = disclaimers.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHistoryContentsResponse(banner=" + this.banner + ", disclaimers=" + this.disclaimers + ")";
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CreditHistoryContentsResponse(int i, Banner banner, Disclaimers disclaimers, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.banner = null;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 4;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.banner = banner;
            int i5 = onNavigationEvent + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
        }
        if ((i & 2) != 0) {
            this.disclaimers = disclaimers;
            return;
        }
        int i7 = onNavigationEvent + 81;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        this.disclaimers = null;
    }

    public CreditHistoryContentsResponse(@Nullable Banner banner, @Nullable Disclaimers disclaimers) {
        this.banner = banner;
        this.disclaimers = disclaimers;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(CreditHistoryContentsResponse creditHistoryContentsResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                Banner banner = creditHistoryContentsResponse.banner;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (creditHistoryContentsResponse.banner != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, CreditHistoryContentsResponse$Banner$.serializer.INSTANCE, creditHistoryContentsResponse.banner);
                int i5 = onExtraCallback + 33;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || creditHistoryContentsResponse.disclaimers != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, CreditHistoryContentsResponse$Disclaimers$.serializer.INSTANCE, creditHistoryContentsResponse.disclaimers);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditHistoryContentsResponse(Banner banner, Disclaimers disclaimers, int i, DefaultConstructorMarker defaultConstructorMarker) {
        banner = (i & 1) != 0 ? null : banner;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            disclaimers = null;
        }
        this(banner, disclaimers);
    }

    public final Banner onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Banner banner = this.banner;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return banner;
    }

    public final Disclaimers onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Disclaimers disclaimers = this.disclaimers;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return disclaimers;
        }
        throw null;
    }
}
