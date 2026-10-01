package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BufferMemoryChunkPool {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("sessionId")
    private final long sessionId;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r8 instanceof o.BufferMemoryChunkPool) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 77;
        r8 = r2 % 128;
        o.BufferMemoryChunkPool.onNavigationEvent = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r8 = r8 + 111;
        o.BufferMemoryChunkPool.IAuthTabCallback = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r7.sessionId == ((o.BufferMemoryChunkPool) r8).sessionId) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        boolean z = true;
        if (i2 % 2 != 0) {
            int i4 = 88 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.sessionId);
        }
        Long.hashCode(this.sessionId);
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareUpdateUserCertifyResponse(sessionId=" + this.sessionId + ")";
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
