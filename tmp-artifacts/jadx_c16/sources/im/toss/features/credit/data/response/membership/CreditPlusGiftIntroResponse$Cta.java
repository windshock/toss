package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse$Cta$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusGiftIntroResponse$Cta {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String linkUrl;
    private final String title;

    static {
        int i = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditPlusGiftIntroResponse$Cta)) {
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.linkUrl, ((CreditPlusGiftIntroResponse$Cta) obj).linkUrl)) {
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.title, r6.title))) {
            return true;
        }
        int i6 = onExtraCallback + 49;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.linkUrl;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        if (str2 != null) {
            int i4 = onExtraCallback + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Cta(linkUrl=" + this.linkUrl + ", title=" + this.title + ")";
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CreditPlusGiftIntroResponse$Cta(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallback + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = CreditPlusGiftIntroResponse$Cta$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = CreditPlusGiftIntroResponse$Cta$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.linkUrl = str;
        this.title = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(CreditPlusGiftIntroResponse$Cta creditPlusGiftIntroResponse$Cta, vyl vylVar, SerialDescriptor serialDescriptor) {
        getWriggleLayout getwrigglelayout;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, creditPlusGiftIntroResponse$Cta.linkUrl);
        } else {
            getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, creditPlusGiftIntroResponse$Cta.linkUrl);
            i3 = 1;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, i3, getwrigglelayout, creditPlusGiftIntroResponse$Cta.title);
    }
}
