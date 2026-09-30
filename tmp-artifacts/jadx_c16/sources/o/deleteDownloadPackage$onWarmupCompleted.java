package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class deleteDownloadPackage$onWarmupCompleted implements deleteDownloadPackage {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r7 instanceof o.deleteDownloadPackage$onWarmupCompleted) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r3 = r3 + 41;
        o.deleteDownloadPackage$onWarmupCompleted.IAuthTabCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.onWarmupCompleted, ((o.deleteDownloadPackage$onWarmupCompleted) r7).onWarmupCompleted) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r7 = o.deleteDownloadPackage$onWarmupCompleted.onExtraCallbackWithResult + 87;
        o.deleteDownloadPackage$onWarmupCompleted.IAuthTabCallback = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if ((r7 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 89;
        o.deleteDownloadPackage$onWarmupCompleted.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i3 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickConfirmButton(buttonTitle=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public deleteDownloadPackage$onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 123;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return str;
    }
}
