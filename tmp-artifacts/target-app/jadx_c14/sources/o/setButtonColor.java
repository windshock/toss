package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o.getDescriptionTextSize;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setButtonColor extends BaseApiResponse<onExtraCallbackWithResult> {

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @SerializedName("list")
        private ArrayList<getDescriptionTextSize.onExtraCallback> list;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 119;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 != 0;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return Intrinsics.areEqual(this.list, ((onExtraCallbackWithResult) obj).list);
            }
            int i6 = i2 + 95;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.list.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.list.hashCode();
            int i3 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(list=" + this.list + ")";
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
            }
            return str;
        }

        public final ArrayList<getDescriptionTextSize.onExtraCallback> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ArrayList<getDescriptionTextSize.onExtraCallback> arrayList = this.list;
            int i5 = i2 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return arrayList;
            }
            throw null;
        }
    }
}
