package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class allowsDeviceAuth {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final long cardId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof allowsDeviceAuth)) {
            int i4 = i3 + 59;
            onWarmupCompleted = i4 % 128;
            return !(i4 % 2 == 0);
        }
        if (this.cardId == ((allowsDeviceAuth) obj).cardId) {
            return true;
        }
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Long.hashCode(this.cardId);
            throw null;
        }
        int iHashCode = Long.hashCode(this.cardId);
        int i3 = onWarmupCompleted + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardIdRequest(cardId=" + this.cardId + ")";
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
