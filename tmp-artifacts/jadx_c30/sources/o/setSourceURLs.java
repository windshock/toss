package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setSourceURLs {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("happyTalkAvailable")
    private final boolean happyTalkAvailable;

    @SerializedName("happyTalkEncUserNo")
    private final String happyTalkEncUserNo;

    @SerializedName("linkType")
    private final String linkType;

    @SerializedName("linkUrl")
    private final String linkUrl;

    @SerializedName("unblockType")
    private final loadSplitBundleFromFile unblockType;

    @SerializedName("userMessage")
    private final String userMessage;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof setSourceURLs)) {
            return false;
        }
        setSourceURLs setsourceurls = (setSourceURLs) obj;
        if (this.unblockType != setsourceurls.unblockType) {
            return false;
        }
        if (!Intrinsics.areEqual(this.happyTalkEncUserNo, setsourceurls.happyTalkEncUserNo)) {
            int i3 = onExtraCallbackWithResult + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 45 / 0;
            }
            return false;
        }
        if (this.happyTalkAvailable != setsourceurls.happyTalkAvailable) {
            int i5 = onExtraCallback + 77;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.userMessage, setsourceurls.userMessage)) {
            int i7 = onExtraCallbackWithResult + 1;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.linkType, setsourceurls.linkType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.linkUrl, setsourceurls.linkUrl)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 3;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        loadSplitBundleFromFile loadsplitbundlefromfile;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode2 = (i2 % 2 == 0 ? (loadsplitbundlefromfile = this.unblockType) != null : (loadsplitbundlefromfile = this.unblockType) != null) ? loadsplitbundlefromfile.hashCode() : 0;
        String str = this.happyTalkEncUserNo;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Boolean.hashCode(this.happyTalkAvailable);
        String str2 = this.userMessage;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.linkType;
        if (str3 == null) {
            int i3 = onExtraCallbackWithResult + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.linkUrl;
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnblockSessionInfoResponse(unblockType=" + this.unblockType + ", happyTalkEncUserNo=" + this.happyTalkEncUserNo + ", happyTalkAvailable=" + this.happyTalkAvailable + ", userMessage=" + this.userMessage + ", linkType=" + this.linkType + ", linkUrl=" + this.linkUrl + ")";
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
