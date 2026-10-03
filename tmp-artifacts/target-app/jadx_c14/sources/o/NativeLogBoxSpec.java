package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeLogBoxSpec implements NativeKeyboardObserverSpec {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final deleteTimer icon;
    private final boolean isAccount;
    private final boolean isAccountLink;
    private final boolean isPhoneLink;
    private final boolean isSpacer;
    private final String logId;
    private final String name;
    private final String scheme;
    private final String value;
    private final String value2;

    public NativeLogBoxSpec() {
        this(null, null, null, null, null, false, false, false, false, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeLogBoxSpec)) {
            return false;
        }
        NativeLogBoxSpec nativeLogBoxSpec = (NativeLogBoxSpec) obj;
        if (!Intrinsics.areEqual(this.name, nativeLogBoxSpec.name)) {
            int i2 = onExtraCallback + 95;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        if (!Intrinsics.areEqual(this.logId, nativeLogBoxSpec.logId)) {
            int i6 = onExtraCallback + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.value, nativeLogBoxSpec.value) || !Intrinsics.areEqual(this.value2, nativeLogBoxSpec.value2) || !Intrinsics.areEqual(this.scheme, nativeLogBoxSpec.scheme)) {
            return false;
        }
        if (this.isAccount != nativeLogBoxSpec.isAccount) {
            int i8 = IAuthTabCallback + 67;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.isAccountLink != nativeLogBoxSpec.isAccountLink || this.isPhoneLink != nativeLogBoxSpec.isPhoneLink) {
            return false;
        }
        if (this.isSpacer != nativeLogBoxSpec.isSpacer) {
            int i10 = onExtraCallback + 53;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.icon, nativeLogBoxSpec.icon)) {
            int i12 = onExtraCallback + 31;
            IAuthTabCallback = i12 % 128;
            return i12 % 2 == 0;
        }
        int i13 = onExtraCallback + 15;
        IAuthTabCallback = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.logId.hashCode();
        int iHashCode3 = this.value.hashCode();
        int iHashCode4 = this.value2.hashCode();
        int iHashCode5 = this.scheme.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isAccount);
        int iHashCode7 = Boolean.hashCode(this.isAccountLink);
        int iHashCode8 = Boolean.hashCode(this.isPhoneLink);
        int iHashCode9 = Boolean.hashCode(this.isSpacer);
        deleteTimer deletetimer = this.icon;
        if (deletetimer == null) {
            int i5 = onExtraCallback + 85;
            IAuthTabCallback = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode10 = deletetimer.hashCode();
            int i6 = IAuthTabCallback + 91;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode10;
        }
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdditionalProperty(name=" + this.name + ", logId=" + this.logId + ", value=" + this.value + ", value2=" + this.value2 + ", scheme=" + this.scheme + ", isAccount=" + this.isAccount + ", isAccountLink=" + this.isAccountLink + ", isPhoneLink=" + this.isPhoneLink + ", isSpacer=" + this.isSpacer + ", icon=" + this.icon + ")";
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeLogBoxSpec(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, boolean z4, @Nullable deleteTimer deletetimer) {
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
        this.isSpacer = z4;
        this.icon = deletetimer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeLogBoxSpec(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, deleteTimer deletetimer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        boolean z5;
        boolean z6;
        boolean z7;
        String str8 = "";
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                deletetimer.hashCode();
                throw null;
            }
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        String str9 = (i & 4) != 0 ? "" : str3;
        String str10 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 37;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                deletetimer.hashCode();
                throw null;
            }
        } else {
            str8 = str5;
        }
        boolean z8 = false;
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallback;
            int i8 = i7 + 111;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 31;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i & 64) != 0) {
            int i13 = IAuthTabCallback + 73;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i & 128) != 0) {
            int i15 = IAuthTabCallback + 111;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i & 256) != 0) {
            int i17 = onExtraCallback + 119;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 2 % 2;
        } else {
            z8 = z4;
        }
        this(str6, str7, str9, str10, str8, z5, z6, z7, z8, (i & 512) == 0 ? deletetimer : null);
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.IAuthTabCallback();
        }
        super.IAuthTabCallback();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheme;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSpacer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deleteTimer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        deleteTimer deletetimer = this.icon;
        int i4 = i2 + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return deletetimer;
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = "PROPERTY:" + this.name;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r1 = 55 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4.scheme.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.scheme.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = o.NativeLogBoxSpec.onExtraCallback + 111;
        o.NativeLogBoxSpec.IAuthTabCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean asInterface() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.NativeLogBoxSpec.onExtraCallback
            int r1 = r1 + 31
            int r2 = r1 % 128
            o.NativeLogBoxSpec.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1b
            java.lang.String r1 = r4.scheme
            int r1 = r1.length()
            r3 = 8
            int r3 = r3 / r2
            if (r1 <= 0) goto L33
            goto L23
        L1b:
            java.lang.String r1 = r4.scheme
            int r1 = r1.length()
            if (r1 <= 0) goto L33
        L23:
            int r1 = o.NativeLogBoxSpec.onExtraCallback
            int r1 = r1 + 111
            int r3 = r1 % 128
            o.NativeLogBoxSpec.IAuthTabCallback = r3
            int r1 = r1 % r0
            r0 = 1
            if (r1 != 0) goto L32
            r1 = 55
            int r1 = r1 / r2
        L32:
            return r0
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeLogBoxSpec.asInterface():boolean");
    }

    public final NoOpAndroidFlipperClient asBinder() {
        int i = 2 % 2;
        NoOpAndroidFlipperClient noOpAndroidFlipperClient = new NoOpAndroidFlipperClient(this.name, this.logId, this.value, this.value2, this.scheme, this.isAccount, this.isAccountLink, this.isPhoneLink, null, 256, null);
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return noOpAndroidFlipperClient;
    }
}
