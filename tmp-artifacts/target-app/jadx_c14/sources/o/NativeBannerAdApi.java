package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeBannerAdApi {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int cursor;
    private final Map<String, Object> formValues;
    private final String sessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof NativeBannerAdApi)) {
            return false;
        }
        NativeBannerAdApi nativeBannerAdApi = (NativeBannerAdApi) obj;
        if (!Intrinsics.areEqual(this.sessionId, nativeBannerAdApi.sessionId)) {
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.cursor != nativeBannerAdApi.cursor) {
            return false;
        }
        if (Intrinsics.areEqual(this.formValues, nativeBannerAdApi.formValues)) {
            return true;
        }
        int i5 = onWarmupCompleted + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sessionId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.cursor)) * 31) + this.formValues.hashCode();
        int i3 = IAuthTabCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueSaveFunnelRequest(sessionId=" + this.sessionId + ", cursor=" + this.cursor + ", formValues=" + this.formValues + ")";
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NativeBannerAdApi(@Nullable String str, int i, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.sessionId = str;
        this.cursor = i;
        this.formValues = map;
    }
}
