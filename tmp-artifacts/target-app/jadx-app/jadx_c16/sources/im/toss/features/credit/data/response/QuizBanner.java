package im.toss.features.credit.data.response;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class QuizBanner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String ctaText;
    private final String iconUrl;
    private final String linkUrl;
    private final String subtitle;
    private final String title;

    static {
        Object obj = null;
        int i = onNavigationEvent + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public QuizBanner() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 29;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof QuizBanner)) {
            int i6 = i2 + 3;
            onExtraCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        QuizBanner quizBanner = (QuizBanner) obj;
        if (!Intrinsics.areEqual(this.title, quizBanner.title) || !Intrinsics.areEqual(this.subtitle, quizBanner.subtitle) || !Intrinsics.areEqual(this.iconUrl, quizBanner.iconUrl)) {
            return false;
        }
        if (Intrinsics.areEqual(this.linkUrl, quizBanner.linkUrl)) {
            return Intrinsics.areEqual(this.ctaText, quizBanner.ctaText);
        }
        int i7 = onExtraCallbackWithResult + 47;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v15 java.lang.String) = (r1v4 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.title;
            iHashCode = 1;
            iHashCode2 = str == null ? 0 : str.hashCode();
        } else {
            str = this.title;
            iHashCode = 0;
            if (str == null) {
            }
        }
        String str2 = this.subtitle;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUrl;
        if (str3 == null) {
            int i3 = onExtraCallbackWithResult + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.linkUrl;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.ctaText;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizBanner(title=" + this.title + ", subtitle=" + this.subtitle + ", iconUrl=" + this.iconUrl + ", linkUrl=" + this.linkUrl + ", ctaText=" + this.ctaText + ")";
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ QuizBanner(int i, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
            int i3 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i4 = onExtraCallback + 73;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            int i6 = i4 % 2;
            this.iconUrl = "";
            if (i6 == 0) {
                throw null;
            }
            int i7 = i5 + 33;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.iconUrl = str3;
        }
        if ((i & 8) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str4;
        }
        if ((i & 16) != 0) {
            this.ctaText = str5;
            return;
        }
        this.ctaText = "";
        int i9 = onExtraCallback + 83;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public QuizBanner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.subtitle = str2;
        this.iconUrl = str3;
        this.linkUrl = str4;
        this.ctaText = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(QuizBanner quizBanner, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(quizBanner.title, "");
                throw null;
            }
            if (!Intrinsics.areEqual(quizBanner.title, "")) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, quizBanner.title);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(quizBanner.subtitle, "")) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, quizBanner.subtitle);
            int i3 = onExtraCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(quizBanner.iconUrl, "")) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, quizBanner.iconUrl);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i5 = onExtraCallbackWithResult + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!Intrinsics.areEqual(quizBanner.linkUrl, "")) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, quizBanner.linkUrl);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(quizBanner.ctaText, "")) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, quizBanner.ctaText);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QuizBanner(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 21;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i9 = onExtraCallback + 109;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            str9 = "";
        } else {
            str9 = str5;
        }
        this(str10, str6, str7, str8, str9);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subtitle;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.linkUrl;
        int i4 = i2 + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ctaText;
        int i4 = i3 + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
