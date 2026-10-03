package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class turnOnDebugger extends BaseApiResponse<onNavigationEvent> {

    public static final class onNavigationEvent {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @SerializedName("token")
        private final String token;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof onNavigationEvent) {
                    return Intrinsics.areEqual(this.token, ((onNavigationEvent) obj).token);
                }
                int i2 = onWarmupCompleted + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onNavigationEvent + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.token.hashCode();
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(token=" + this.token + ")";
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.token;
            int i5 = i3 + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
