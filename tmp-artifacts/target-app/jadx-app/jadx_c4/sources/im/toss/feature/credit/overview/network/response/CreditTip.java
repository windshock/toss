package im.toss.feature.credit.overview.network.response;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditTip {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String assessmentType;
    private final String description;
    private final Link link;
    private final String title;
    private final String type;

    static {
        int i = onNavigationEvent + 105;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public CreditTip() {
        this((String) null, (String) null, (String) null, (String) null, (Link) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof CreditTip)) {
            return false;
        }
        CreditTip creditTip = (CreditTip) obj;
        if (!Intrinsics.areEqual(this.title, creditTip.title)) {
            int i3 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, creditTip.description)) {
            int i5 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.type, creditTip.type) || !Intrinsics.areEqual(this.assessmentType, creditTip.assessmentType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.link, creditTip.link)) {
            return true;
        }
        int i6 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int iHashCode2 = (i2 % 2 == 0 ? (str = this.title) != null : (str = this.title) != null) ? str.hashCode() : 0;
        String str2 = this.description;
        int iHashCode3 = 1;
        if (str2 == null) {
            int i3 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.type;
        if (str3 == null) {
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.assessmentType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Link link = this.link;
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (link != null ? link.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditTip(title=" + this.title + ", description=" + this.description + ", type=" + this.type + ", assessmentType=" + this.assessmentType + ", link=" + this.link + ")";
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditTip> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                CreditTip$$serializer creditTip$$serializer = CreditTip$$serializer.INSTANCE;
                throw null;
            }
            CreditTip$$serializer creditTip$$serializer2 = CreditTip$$serializer.INSTANCE;
            int i3 = onExtraCallback + 85;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return creditTip$$serializer2;
            }
            throw null;
        }
    }

    public /* synthetic */ CreditTip(int i, String str, String str2, String str3, String str4, Link link, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = null;
            int i2 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            int i3 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.description = null;
            if (i4 == 0) {
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
            int i6 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.assessmentType = null;
        } else {
            this.assessmentType = str4;
        }
        if ((i & 16) != 0) {
            this.link = link;
            return;
        }
        int i7 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        this.link = null;
    }

    public CreditTip(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Link link) {
        this.title = str;
        this.description = str2;
        this.type = str3;
        this.assessmentType = str4;
        this.link = link;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(CreditTip creditTip, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (creditTip.title != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, creditTip.title);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || creditTip.description != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, creditTip.description);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || creditTip.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, creditTip.type);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                String str = creditTip.assessmentType;
                throw null;
            }
            if (creditTip.assessmentType != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, creditTip.assessmentType);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || creditTip.link != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, Link$$serializer.INSTANCE, creditTip.link);
            int i5 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditTip(String str, String str2, String str3, String str4, Link link, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        Link link2 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        String str7 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 67;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 107;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i & 16) != 0) {
            int i12 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            link2 = link;
        }
        this(str, str5, str7, str6, link2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.assessmentType;
        }
        throw null;
    }

    public final Link onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Link link = this.link;
        int i4 = i3 + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return link;
        }
        obj.hashCode();
        throw null;
    }
}
