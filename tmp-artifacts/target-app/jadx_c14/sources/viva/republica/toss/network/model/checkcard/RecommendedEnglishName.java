package viva.republica.toss.network.model.checkcard;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecommendedEnglishName {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("name")
    private final String name;

    @SerializedName("score")
    private final String score;

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendedEnglishName() {
        String str = null;
        this(str, str, 3, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return !r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r7 instanceof viva.republica.toss.network.model.checkcard.RecommendedEnglishName) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r1 = r1 + 45;
        viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r7 = (viva.republica.toss.network.model.checkcard.RecommendedEnglishName) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.name, r7.name) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r7 = viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult + 99;
        viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.score, r7.score) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r7 = viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted + 75;
        viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 99;
        viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r3 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult
            int r2 = r1 + 97
            int r3 = r2 % 128
            viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 65
            int r2 = r2 / r5
            if (r6 != r7) goto L25
            goto L18
        L16:
            if (r6 != r7) goto L25
        L18:
            int r3 = r3 + 99
            int r7 = r3 % 128
            viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult = r7
            int r3 = r3 % r0
            if (r3 == 0) goto L22
            r5 = r4
        L22:
            r7 = r5 ^ 1
            return r7
        L25:
            boolean r2 = r7 instanceof viva.republica.toss.network.model.checkcard.RecommendedEnglishName
            if (r2 != 0) goto L31
            int r1 = r1 + 45
            int r7 = r1 % 128
            viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted = r7
            int r1 = r1 % r0
            return r5
        L31:
            viva.republica.toss.network.model.checkcard.RecommendedEnglishName r7 = (viva.republica.toss.network.model.checkcard.RecommendedEnglishName) r7
            java.lang.String r1 = r6.name
            java.lang.String r2 = r7.name
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L47
            int r7 = viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult
            int r7 = r7 + 99
            int r1 = r7 % 128
            viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted = r1
            int r7 = r7 % r0
            return r5
        L47:
            java.lang.String r1 = r6.score
            java.lang.String r7 = r7.score
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r7 != 0) goto L52
            return r5
        L52:
            int r7 = viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onWarmupCompleted
            int r7 = r7 + 75
            int r1 = r7 % 128
            viva.republica.toss.network.model.checkcard.RecommendedEnglishName.onExtraCallbackWithResult = r1
            int r7 = r7 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.checkcard.RecommendedEnglishName.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.name.hashCode() * 31) + this.score.hashCode();
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecommendedEnglishName(name=" + this.name + ", score=" + this.score + ")";
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RecommendedEnglishName(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.score = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecommendedEnglishName(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.name;
            int i4 = 10 / 0;
        } else {
            str = this.name;
        }
        int i5 = i2 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
