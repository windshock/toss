package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class loadScriptFromFile {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("authLevel")
    private final loadScriptFromPathToMemory authLevel;

    @SerializedName("availableAuthMethods")
    private final List<String> availableAuthMethods;

    @SerializedName("happyTalkAvailable")
    private final boolean happyTalkAvailable;

    @SerializedName("linkUrl")
    private final String linkUrl;

    @SerializedName("unblockType")
    private final loadSplitBundleFromFile unblockType;

    @SerializedName("videoCallUrl")
    private final String videoCallUrl;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loadScriptFromFile)) {
            return false;
        }
        loadScriptFromFile loadscriptfromfile = (loadScriptFromFile) obj;
        if (!Intrinsics.areEqual(this.availableAuthMethods, loadscriptfromfile.availableAuthMethods)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.videoCallUrl, loadscriptfromfile.videoCallUrl)) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 117;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (this.happyTalkAvailable != loadscriptfromfile.happyTalkAvailable) {
            int i7 = onExtraCallback + 17;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.linkUrl, loadscriptfromfile.linkUrl)) {
            return false;
        }
        if (this.unblockType != loadscriptfromfile.unblockType) {
            int i9 = onExtraCallback + 111;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.authLevel == loadscriptfromfile.authLevel) {
            return true;
        }
        int i11 = onExtraCallback + 99;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.availableAuthMethods.hashCode() * 31) + this.videoCallUrl.hashCode()) * 31) + Boolean.hashCode(this.happyTalkAvailable)) * 31) + this.linkUrl.hashCode()) * 31) + this.unblockType.hashCode()) * 31) + this.authLevel.hashCode();
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnblockSessionInfoNewResponse(availableAuthMethods=" + this.availableAuthMethods + ", videoCallUrl=" + this.videoCallUrl + ", happyTalkAvailable=" + this.happyTalkAvailable + ", linkUrl=" + this.linkUrl + ", unblockType=" + this.unblockType + ", authLevel=" + this.authLevel + ")";
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final List<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.availableAuthMethods;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.videoCallUrl;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.linkUrl;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final loadScriptFromPathToMemory onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.authLevel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
