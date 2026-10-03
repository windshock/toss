package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRuntimeScheduler {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("debug")
    private final boolean debug;

    @SerializedName("domain")
    private final String domain;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if ((r6 instanceof o.getRuntimeScheduler) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r6 = (o.getRuntimeScheduler) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.domain, r6.domain) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r5.debug == r6.debug) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r6 = o.getRuntimeScheduler.onExtraCallback + 105;
        o.getRuntimeScheduler.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r6 = o.getRuntimeScheduler.IAuthTabCallback + 13;
        o.getRuntimeScheduler.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 99;
        o.getRuntimeScheduler.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
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
            int r1 = o.getRuntimeScheduler.IAuthTabCallback
            int r2 = r1 + 81
            int r3 = r2 % 128
            o.getRuntimeScheduler.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 52
            int r2 = r2 / r4
            if (r5 != r6) goto L24
            goto L18
        L16:
            if (r5 != r6) goto L24
        L18:
            int r1 = r1 + 99
            int r6 = r1 % 128
            o.getRuntimeScheduler.onExtraCallback = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            return r3
        L22:
            r6 = 0
            throw r6
        L24:
            boolean r1 = r6 instanceof o.getRuntimeScheduler
            if (r1 != 0) goto L29
            return r4
        L29:
            o.getRuntimeScheduler r6 = (o.getRuntimeScheduler) r6
            java.lang.String r1 = r5.domain
            java.lang.String r2 = r6.domain
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L36
            return r4
        L36:
            boolean r1 = r5.debug
            boolean r6 = r6.debug
            if (r1 == r6) goto L46
            int r6 = o.getRuntimeScheduler.onExtraCallback
            int r6 = r6 + 105
            int r1 = r6 % 128
            o.getRuntimeScheduler.IAuthTabCallback = r1
            int r6 = r6 % r0
            return r4
        L46:
            int r6 = o.getRuntimeScheduler.IAuthTabCallback
            int r6 = r6 + 13
            int r1 = r6 % 128
            o.getRuntimeScheduler.onExtraCallback = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRuntimeScheduler.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.domain.hashCode() * 31) + Boolean.hashCode(this.debug);
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UrlVerifyRequest(domain=" + this.domain + ", debug=" + this.debug + ")";
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public getRuntimeScheduler(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
        this.debug = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getRuntimeScheduler(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                z = zzaj.onNavigationEvent().onActivityLayout();
                int i3 = 2 % 2;
            } else {
                zzaj.onNavigationEvent().onActivityLayout();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(str, z);
    }
}
