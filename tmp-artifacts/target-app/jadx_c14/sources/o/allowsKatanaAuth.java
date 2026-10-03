package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class allowsKatanaAuth {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("cardId")
    private final long cardId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof allowsKatanaAuth)) {
            int i4 = i2 + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.cardId == ((allowsKatanaAuth) obj).cardId) {
            return true;
        }
        int i6 = i2 + 75;
        onExtraCallback = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.cardId);
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardDesignSaveResponse(cardId=" + this.cardId + ")";
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return str;
    }
}
