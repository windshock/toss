package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAppearanceSpec {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("description")
    private final String description;

    @SerializedName("title")
    private final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeAppearanceSpec() {
        String str = null;
        this(str, str, 3, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.NativeAppearanceSpec) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 89;
        o.NativeAppearanceSpec.onWarmupCompleted = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r6 = (o.NativeAppearanceSpec) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.title, r6.title)) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.description, r6.description) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r6 = o.NativeAppearanceSpec.onWarmupCompleted + 105;
        o.NativeAppearanceSpec.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.NativeAppearanceSpec.onWarmupCompleted
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.NativeAppearanceSpec.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 19
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof o.NativeAppearanceSpec
            if (r1 != 0) goto L28
            int r2 = r2 + 89
            int r6 = r2 % 128
            o.NativeAppearanceSpec.onWarmupCompleted = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            return r3
        L27:
            return r4
        L28:
            o.NativeAppearanceSpec r6 = (o.NativeAppearanceSpec) r6
            java.lang.String r1 = r5.title
            java.lang.String r2 = r6.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L36
            return r4
        L36:
            java.lang.String r1 = r5.description
            java.lang.String r6 = r6.description
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L4a
            int r6 = o.NativeAppearanceSpec.onWarmupCompleted
            int r6 = r6 + 105
            int r1 = r6 % 128
            o.NativeAppearanceSpec.onExtraCallbackWithResult = r1
            int r6 = r6 % r0
            return r4
        L4a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAppearanceSpec.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.title.hashCode() + 18;
            str = this.description;
        } else {
            iHashCode = this.title.hashCode() * 31;
            str = this.description;
        }
        int iHashCode2 = iHashCode + str.hashCode();
        int i3 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DialogInfo(title=" + this.title + ", description=" + this.description + ")";
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return str;
    }

    public NativeAppearanceSpec(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.description = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAppearanceSpec(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return str;
    }
}
