package im.toss.features.benefit.dto;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitActivationIntelligence$Footer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String buttonLandingUrl;
    private final String buttonTitle;

    static {
        int i = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BenefitActivationIntelligence$Footer() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if ((!(r6 instanceof im.toss.features.benefit.dto.BenefitActivationIntelligence$Footer)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r6 = (im.toss.features.benefit.dto.BenefitActivationIntelligence$Footer) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.buttonTitle, r6.buttonTitle) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.buttonLandingUrl, r6.buttonLandingUrl) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r6 = im.toss.features.benefit.dto.BenefitActivationIntelligence$Footer.onNavigationEvent + 45;
        im.toss.features.benefit.dto.BenefitActivationIntelligence$Footer.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r6 = r1 + 25;
        im.toss.features.benefit.dto.BenefitActivationIntelligence$Footer.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
        r1 = r1 + 65;
        im.toss.features.benefit.dto.BenefitActivationIntelligence$Footer.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? (str = this.buttonTitle) != null : (str = this.buttonTitle) != null) ? str.hashCode() : 0;
        String str2 = this.buttonLandingUrl;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Footer(buttonTitle=" + this.buttonTitle + ", buttonLandingUrl=" + this.buttonLandingUrl + ")";
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BenefitActivationIntelligence$Footer(int i, String str, String str2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.buttonTitle = null;
        } else {
            this.buttonTitle = str;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            this.buttonLandingUrl = str2;
            int i4 = onNavigationEvent + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.buttonLandingUrl = null;
        int i6 = onNavigationEvent + 67;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public BenefitActivationIntelligence$Footer(@Nullable String str, @Nullable String str2) {
        this.buttonTitle = str;
        this.buttonLandingUrl = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(BenefitActivationIntelligence$Footer benefitActivationIntelligence$Footer, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || benefitActivationIntelligence$Footer.buttonTitle != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, benefitActivationIntelligence$Footer.buttonTitle);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
                if (benefitActivationIntelligence$Footer.buttonLandingUrl == null) {
                    return;
                }
            } else if (benefitActivationIntelligence$Footer.buttonLandingUrl == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, benefitActivationIntelligence$Footer.buttonLandingUrl);
        int i6 = onNavigationEvent + 83;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenefitActivationIntelligence$Footer(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            str2 = null;
        }
        this(str, str2);
    }
}
