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
public final class QuizNextTimeInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String message;
    private final String title;

    static {
        int i = onWarmupCompleted + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuizNextTimeInfo() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuizNextTimeInfo)) {
            int i2 = onExtraCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        QuizNextTimeInfo quizNextTimeInfo = (QuizNextTimeInfo) obj;
        if (!Intrinsics.areEqual(this.title, quizNextTimeInfo.title)) {
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.message, quizNextTimeInfo.message)) {
            return false;
        }
        int i6 = onNavigationEvent + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.message;
        if (str2 != null) {
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizNextTimeInfo(title=" + this.title + ", message=" + this.message + ")";
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ QuizNextTimeInfo(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 2;
            }
            if ((i & 2) == 0) {
                this.message = str2;
                int i4 = onNavigationEvent + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 32 / 0;
                    return;
                }
                return;
            }
            int i6 = onNavigationEvent + 93;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            this.message = "";
            if (i7 == 0) {
                int i8 = 58 / 0;
                return;
            }
            return;
        }
        this.title = str;
        int i9 = onExtraCallback + 123;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 2 % 2;
        if ((i & 2) == 0) {
        }
    }

    public QuizNextTimeInfo(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.message = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(QuizNextTimeInfo quizNextTimeInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, quizNextTimeInfo.title);
        } else {
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(quizNextTimeInfo.title, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(quizNextTimeInfo.message, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(quizNextTimeInfo.message, "")) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, quizNextTimeInfo.message);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QuizNextTimeInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.message;
        }
        throw null;
    }
}
