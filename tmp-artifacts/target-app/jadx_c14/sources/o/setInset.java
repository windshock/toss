package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setInset {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("accountType")
    private final onCollectWhenDestroy accountType;

    @SerializedName("id")
    private final String id;

    @SerializedName("loginMethod")
    private final String loginMethod;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof o.setInset) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r6 = (o.setInset) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r5.accountType == r6.accountType) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.id, r6.id) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.loginMethod, r6.loginMethod) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r6 = o.setInset.IAuthTabCallback + 117;
        o.setInset.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setInset.onExtraCallback
            int r1 = r1 + 65
            int r2 = r1 % 128
            o.setInset.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L15
            int r1 = r3 / r3
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r2
        L18:
            boolean r1 = r6 instanceof o.setInset
            if (r1 != 0) goto L1d
            return r3
        L1d:
            o.setInset r6 = (o.setInset) r6
            o.onCollectWhenDestroy r1 = r5.accountType
            o.onCollectWhenDestroy r4 = r6.accountType
            if (r1 == r4) goto L26
            return r3
        L26:
            java.lang.String r1 = r5.id
            java.lang.String r4 = r6.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L31
            return r3
        L31:
            java.lang.String r1 = r5.loginMethod
            java.lang.String r6 = r6.loginMethod
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L45
            int r6 = o.setInset.IAuthTabCallback
            int r6 = r6 + 117
            int r1 = r6 % 128
            o.setInset.onExtraCallback = r1
            int r6 = r6 % r0
            return r3
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInset.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r1 r3 r4
      0x0034: PHI (r1v11 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setInset.IAuthTabCallback
            int r1 = r1 + 75
            int r2 = r1 % 128
            o.setInset.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L23
            o.onCollectWhenDestroy r1 = r6.accountType
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.id
            int r3 = r3.hashCode()
            java.lang.String r4 = r6.loginMethod
            r5 = 66
            int r5 = r5 / r2
            if (r4 != 0) goto L34
            goto L38
        L23:
            o.onCollectWhenDestroy r1 = r6.accountType
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.id
            int r3 = r3.hashCode()
            java.lang.String r4 = r6.loginMethod
            if (r4 != 0) goto L34
            goto L38
        L34:
            int r2 = r4.hashCode()
        L38:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r2 = o.setInset.onExtraCallback
            int r2 = r2 + 91
            int r3 = r2 % 128
            o.setInset.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L4a
            return r1
        L4a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInset.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeleteAccountReq(accountType=" + this.accountType + ", id=" + this.id + ", loginMethod=" + this.loginMethod + ")";
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setInset(@NotNull onCollectWhenDestroy oncollectwhendestroy, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(oncollectwhendestroy, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.accountType = oncollectwhendestroy;
        this.id = str;
        this.loginMethod = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setInset(onCollectWhenDestroy oncollectwhendestroy, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 65 / 0;
            }
            int i4 = 2 % 2;
            str2 = null;
        }
        this(oncollectwhendestroy, str, str2);
    }
}
