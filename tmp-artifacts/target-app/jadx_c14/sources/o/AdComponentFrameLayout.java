package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdComponentFrameLayout {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("infos")
    private final List<S2SRewardedVideoAdExtendedListener> infos;

    @SerializedName("messages")
    private final List<String> messages;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdComponentFrameLayout() {
        List list = null;
        this(list, list, 3, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AdComponentFrameLayout)) {
            return false;
        }
        AdComponentFrameLayout adComponentFrameLayout = (AdComponentFrameLayout) obj;
        if (!Intrinsics.areEqual(this.infos, adComponentFrameLayout.infos)) {
            int i4 = onExtraCallback + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.messages, adComponentFrameLayout.messages)) {
            return true;
        }
        int i6 = onExtraCallback + 39;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<S2SRewardedVideoAdExtendedListener> list = this.infos;
        int iHashCode2 = 0;
        if (list == null) {
            int i5 = i2 + 49;
            IAuthTabCallback = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = list.hashCode();
        }
        List<String> list2 = this.messages;
        if (list2 != null) {
            int i6 = IAuthTabCallback + 47;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 77 / 0;
                iHashCode2 = list2.hashCode();
            } else {
                iHashCode2 = list2.hashCode();
            }
        }
        int i8 = (iHashCode * 31) + iHashCode2;
        int i9 = onExtraCallback + 91;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationInfoResp(infos=" + this.infos + ", messages=" + this.messages + ")";
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AdComponentFrameLayout(@Nullable List<S2SRewardedVideoAdExtendedListener> list, @Nullable List<String> list2) {
        this.infos = list;
        this.messages = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdComponentFrameLayout(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i & 1) != 0 ? null : list;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 37;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            list2 = null;
        }
        this(list, list2);
    }

    public final List<S2SRewardedVideoAdExtendedListener> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<S2SRewardedVideoAdExtendedListener> list = this.infos;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return list;
    }
}
