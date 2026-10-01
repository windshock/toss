package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class connectAnimatedNodeToShadowNodeFamily {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("destination")
    private final String destination;

    @SerializedName("tag")
    private final String tag;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof connectAnimatedNodeToShadowNodeFamily)) {
            int i4 = IAuthTabCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
            }
            return false;
        }
        connectAnimatedNodeToShadowNodeFamily connectanimatednodetoshadownodefamily = (connectAnimatedNodeToShadowNodeFamily) obj;
        if (!Intrinsics.areEqual(this.destination, connectanimatednodetoshadownodefamily.destination)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tag, connectanimatednodetoshadownodefamily.tag)) {
            return true;
        }
        int i6 = onWarmupCompleted + 81;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.destination.hashCode() * 31) + this.tag.hashCode();
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShortenParam(destination=" + this.destination + ", tag=" + this.tag + ")";
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
