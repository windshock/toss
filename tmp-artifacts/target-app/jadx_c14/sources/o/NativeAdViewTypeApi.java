package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdViewTypeApi {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String funnelId;
    private final String name;
    private final String rrn;
    private final String sessionId;

    public NativeAdViewTypeApi() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof NativeAdViewTypeApi) {
            NativeAdViewTypeApi nativeAdViewTypeApi = (NativeAdViewTypeApi) obj;
            if (!Intrinsics.areEqual(this.name, nativeAdViewTypeApi.name)) {
                int i3 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if ((!Intrinsics.areEqual(this.rrn, nativeAdViewTypeApi.rrn)) || !Intrinsics.areEqual(this.funnelId, nativeAdViewTypeApi.funnelId) || (!Intrinsics.areEqual(this.sessionId, nativeAdViewTypeApi.sessionId))) {
                return false;
            }
            int i4 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        return i3 == 0 ? (((((iHashCode - 13) >> this.rrn.hashCode()) * 103) - this.funnelId.hashCode()) / 117) - this.sessionId.hashCode() : (((((iHashCode * 31) + this.rrn.hashCode()) * 31) + this.funnelId.hashCode()) * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueRrnCheckRequest(name=" + this.name + ", rrn=" + this.rrn + ", funnelId=" + this.funnelId + ", sessionId=" + this.sessionId + ")";
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public NativeAdViewTypeApi(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.name = str;
        this.rrn = str2;
        this.funnelId = str3;
        this.sessionId = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdViewTypeApi(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            int i6 = i3 + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str3 = "";
        }
        if ((i & 8) != 0) {
            int i9 = IAuthTabCallback + 7;
            int i10 = i9 % 128;
            onExtraCallbackWithResult = i10;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i11 = i10 + 123;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 2;
            }
            str4 = "";
        }
        this(str, str2, str3, str4);
    }
}
