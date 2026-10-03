package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class loadScriptFromBytes {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("sessionId")
    private final long sessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loadScriptFromBytes)) {
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.sessionId != ((loadScriptFromBytes) obj).sessionId) {
            return false;
        }
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.sessionId);
        }
        Long.hashCode(this.sessionId);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareUnblockResponse(sessionId=" + this.sessionId + ")";
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.sessionId;
            int i4 = 63 / 0;
        } else {
            j = this.sessionId;
        }
        int i5 = i2 + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
