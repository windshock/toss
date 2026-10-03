package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getDescriptionTextSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setAutoplay {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("list")
    private List<getDescriptionTextSize.IAuthTabCallback> list;

    @SerializedName("serviceType")
    private final NativeAdListener serviceType;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 55;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof setAutoplay)) {
            return false;
        }
        setAutoplay setautoplay = (setAutoplay) obj;
        if (!Intrinsics.areEqual(this.list, setautoplay.list)) {
            return false;
        }
        if (this.serviceType == setautoplay.serviceType) {
            return true;
        }
        int i7 = onExtraCallback + 21;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.list.hashCode() * 31) + this.serviceType.hashCode();
        int i4 = onExtraCallbackWithResult + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareAccountDocumentRequest(list=" + this.list + ", serviceType=" + this.serviceType + ")";
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public setAutoplay(@NotNull List<getDescriptionTextSize.IAuthTabCallback> list, @NotNull NativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(nativeAdListener, "");
        this.list = list;
        this.serviceType = nativeAdListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setAutoplay(List list, NativeAdListener nativeAdListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            nativeAdListener = NativeAdListener.WITHDRAW_AGREEMENT;
            int i4 = onExtraCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(list, nativeAdListener);
    }
}
