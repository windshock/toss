package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerReactInstanceEventListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("afterBalance")
    private final Integer afterBalance;

    @SerializedName("beforeBalance")
    private final Integer beforeBalance;

    @SerializedName("gaNo")
    private final String gaNo;

    @SerializedName("manufacturer")
    private final String manufacturer;

    @SerializedName("note")
    private final String note;

    @SerializedName("os")
    private final String os;

    @SerializedName("payToken")
    private final String payToken;

    @SerializedName("resultCode")
    private final String resultCode;

    @SerializedName("transactedAt")
    private final String transactedAt;

    @SerializedName("transportationCardNumber")
    private final String transportationCardNumber;

    @SerializedName("type")
    private final createUIManager type;

    @SerializedName("userNo")
    private final String userNo;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.ReactInstanceManagerReactInstanceEventListener) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.ReactInstanceManagerReactInstanceEventListener) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.userNo, r6.userNo) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.gaNo, r6.gaNo) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.os, r6.os) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r5.type == r6.type) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r6 = o.ReactInstanceManagerReactInstanceEventListener.onWarmupCompleted + 121;
        o.ReactInstanceManagerReactInstanceEventListener.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.manufacturer, r6.manufacturer)) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.resultCode, r6.resultCode) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.note, r6.note) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.beforeBalance, r6.beforeBalance) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.afterBalance, r6.afterBalance) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r6 = o.ReactInstanceManagerReactInstanceEventListener.IAuthTabCallback + 113;
        o.ReactInstanceManagerReactInstanceEventListener.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.transactedAt, r6.transactedAt) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r6 = o.ReactInstanceManagerReactInstanceEventListener.IAuthTabCallback + 41;
        o.ReactInstanceManagerReactInstanceEventListener.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.transportationCardNumber, r6.transportationCardNumber) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        r6 = o.ReactInstanceManagerReactInstanceEventListener.onWarmupCompleted + 13;
        o.ReactInstanceManagerReactInstanceEventListener.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if ((r6 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        r6 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.payToken, r6.payToken)) == true) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
    
        return false;
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
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ReactInstanceManagerReactInstanceEventListener.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.userNo.hashCode();
        int iHashCode4 = this.gaNo.hashCode();
        int iHashCode5 = this.os.hashCode();
        int iHashCode6 = this.type.hashCode();
        int iHashCode7 = this.manufacturer.hashCode();
        int iHashCode8 = this.resultCode.hashCode();
        int iHashCode9 = this.note.hashCode();
        Integer num = this.beforeBalance;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        Integer num2 = this.afterBalance;
        if (num2 == null) {
            int i4 = onWarmupCompleted + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num2.hashCode();
        }
        String str = this.transactedAt;
        if (str == null) {
            int i6 = onWarmupCompleted + 25;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        int iHashCode11 = this.transportationCardNumber.hashCode();
        String str2 = this.payToken;
        int iHashCode12 = (((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i8 = IAuthTabCallback + 79;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return iHashCode12;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionLogItem(userNo=" + this.userNo + ", gaNo=" + this.gaNo + ", os=" + this.os + ", type=" + this.type + ", manufacturer=" + this.manufacturer + ", resultCode=" + this.resultCode + ", note=" + this.note + ", beforeBalance=" + this.beforeBalance + ", afterBalance=" + this.afterBalance + ", transactedAt=" + this.transactedAt + ", transportationCardNumber=" + this.transportationCardNumber + ", payToken=" + this.payToken + ")";
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return str;
    }

    public ReactInstanceManagerReactInstanceEventListener(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull createUIManager createuimanager, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable String str7, @NotNull String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(createuimanager, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.userNo = str;
        this.gaNo = str2;
        this.os = str3;
        this.type = createuimanager;
        this.manufacturer = str4;
        this.resultCode = str5;
        this.note = str6;
        this.beforeBalance = num;
        this.afterBalance = num2;
        this.transactedAt = str7;
        this.transportationCardNumber = str8;
        this.payToken = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReactInstanceManagerReactInstanceEventListener(String str, String str2, String str3, createUIManager createuimanager, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String strOnMinimized;
        String str10;
        String str11;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            strOnMinimized = PlayerErrorCode.onMinimized();
        } else {
            strOnMinimized = str;
        }
        String strOnActivityLayout = (i & 2) != 0 ? PlayerErrorCode.onActivityLayout() : str2;
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str10 = "ANDROID";
        } else {
            str10 = str3;
        }
        if ((i & 2048) != 0) {
            int i6 = IAuthTabCallback + 87;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            str11 = null;
        } else {
            str11 = str9;
        }
        this(strOnMinimized, strOnActivityLayout, str10, createuimanager, str4, str5, str6, num, num2, str7, str8, str11);
    }
}
