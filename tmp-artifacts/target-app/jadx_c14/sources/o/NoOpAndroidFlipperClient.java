package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NoOpAndroidFlipperClient implements NativeKeyboardObserverSpec {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final onExtraCallbackWithResult banner;
    private boolean isAccount;
    private boolean isAccountLink;
    private boolean isPhoneLink;
    private final String logId;
    private String name;
    private String scheme;
    private String value;
    private final String value2;

    public NoOpAndroidFlipperClient() {
        this(null, null, null, null, null, false, false, false, null, 511, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoOpAndroidFlipperClient)) {
            return false;
        }
        NoOpAndroidFlipperClient noOpAndroidFlipperClient = (NoOpAndroidFlipperClient) obj;
        if (!Intrinsics.areEqual(this.name, noOpAndroidFlipperClient.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logId, noOpAndroidFlipperClient.logId)) {
            int i3 = IAuthTabCallback + 121;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.value, noOpAndroidFlipperClient.value) || !Intrinsics.areEqual(this.value2, noOpAndroidFlipperClient.value2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.scheme, noOpAndroidFlipperClient.scheme)) {
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isAccount != noOpAndroidFlipperClient.isAccount) {
            return false;
        }
        if (this.isAccountLink != noOpAndroidFlipperClient.isAccountLink) {
            int i6 = IAuthTabCallback + 65;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.isPhoneLink == noOpAndroidFlipperClient.isPhoneLink) {
            return Intrinsics.areEqual(this.banner, noOpAndroidFlipperClient.banner);
        }
        int i8 = IAuthTabCallback + 117;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.logId.hashCode();
        int iHashCode3 = this.value.hashCode();
        int iHashCode4 = this.value2.hashCode();
        int iHashCode5 = this.scheme.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isAccount);
        int iHashCode7 = Boolean.hashCode(this.isAccountLink);
        int iHashCode8 = Boolean.hashCode(this.isPhoneLink);
        onExtraCallbackWithResult onextracallbackwithresult = this.banner;
        int iHashCode9 = (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (onextracallbackwithresult == null ? 0 : onextracallbackwithresult.hashCode());
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Property(name=" + this.name + ", logId=" + this.logId + ", value=" + this.value + ", value2=" + this.value2 + ", scheme=" + this.scheme + ", isAccount=" + this.isAccount + ", isAccountLink=" + this.isAccountLink + ", isPhoneLink=" + this.isPhoneLink + ", banner=" + this.banner + ")";
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return str;
    }

    public NoOpAndroidFlipperClient(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.logId = str2;
        this.value = str3;
        this.value2 = str4;
        this.scheme = str5;
        this.isAccount = z;
        this.isAccountLink = z2;
        this.isPhoneLink = z3;
        this.banner = onextracallbackwithresult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NoOpAndroidFlipperClient(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, onExtraCallbackWithResult onextracallbackwithresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        boolean z4;
        boolean z5;
        String str9 = "";
        String str10 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = null;
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                onextracallbackwithresult2.hashCode();
                throw null;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = 2 % 2;
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str9 = str5;
        }
        boolean z6 = false;
        if ((i & 32) != 0) {
            int i8 = onExtraCallback + 119;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 64) != 0) {
            int i10 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 128) != 0) {
            int i11 = 2 % 2;
        } else {
            z6 = z3;
        }
        if ((i & 256) != 0) {
            int i12 = onExtraCallback + 35;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 / 4;
            } else {
                int i14 = 2 % 2;
            }
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        this(str10, str6, str7, str8, str9, z4, z5, z6, onextracallbackwithresult2);
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jIAuthTabCallback;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.name;
            int i4 = 34 / 0;
        } else {
            str = this.name;
        }
        int i5 = i2 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value2;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallbackWithResult onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.banner;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = "PROPERTY:" + this.name;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.scheme.length() <= 0) {
            return false;
        }
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            processBytes processbytesAsBinder = asBinder();
            if (processbytesAsBinder == null || StringsKt.isBlank(processbytesAsBinder.onWarmupCompleted()) || StringsKt.isBlank(processbytesAsBinder.onNavigationEvent())) {
                return false;
            }
            int i3 = onExtraCallback;
            int i4 = i3 + 69;
            IAuthTabCallback = i4 % 128;
            boolean z = !(i4 % 2 == 0);
            int i5 = i3 + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
        asBinder();
        throw null;
    }

    public final processBytes asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? enableFabricLogs.onWarmupCompleted(enableFabricLogs.onExtraCallback, this.value, false, (String) null, 74, (Object) null) : enableFabricLogs.onWarmupCompleted(enableFabricLogs.onExtraCallback, this.value, false, (String) null, 6, (Object) null);
    }

    public static final class onExtraCallbackWithResult {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final List<String> descriptions;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i4 = IAuthTabCallback + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.title, onextracallbackwithresult.title)) {
                int i6 = IAuthTabCallback + 115;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.descriptions, onextracallbackwithresult.descriptions)) {
                return true;
            }
            int i8 = onExtraCallback + 79;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.title.hashCode() * 31) + this.descriptions.hashCode();
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Banner(title=" + this.title + ", descriptions=" + this.descriptions + ")";
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.title = str;
            this.descriptions = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i & 1) != 0 ? "" : str;
            if ((i & 2) != 0) {
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                list = CollectionsKt.emptyList();
                int i4 = IAuthTabCallback + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(str, list);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.title;
            int i4 = i2 + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final List<String> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 101;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            List<String> list = this.descriptions;
            int i4 = i2 + 103;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
            return list;
        }
    }
}
