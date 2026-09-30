package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerAppHandler$onWarmupCompleted implements registerAppHandler {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final String IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onNavigationEvent;
    private final boolean onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.registerAppHandler$onWarmupCompleted) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.registerAppHandler$onWarmupCompleted) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5.onExtraCallback == r6.onExtraCallback) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r6 = o.registerAppHandler$onWarmupCompleted.onExtraCallbackWithResult + 97;
        o.registerAppHandler$onWarmupCompleted.IAuthTabCallbackStub = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.IAuthTabCallback.hashCode() * 31) + Boolean.hashCode(this.onExtraCallback);
        int i4 = IAuthTabCallbackStub + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBank(label=" + this.IAuthTabCallback + ", isRedPointVisible=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackStub + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public registerAppHandler$onWarmupCompleted(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = z;
        this.onNavigationEvent = "toss_bank";
        this.onWarmupCompleted = z;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 57;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
