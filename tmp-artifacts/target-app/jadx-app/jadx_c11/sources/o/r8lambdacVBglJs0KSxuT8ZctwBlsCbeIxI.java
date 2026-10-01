package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (o.setByteOrder.onExtraCallbackWithResult(r8.onExtraCallback, r9.onExtraCallback) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r9 = o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.asInterface + 7;
        o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.onTransact = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r9 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (o.setByteOrder.onExtraCallbackWithResult(r8.IAuthTabCallback, r9.IAuthTabCallback) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r9 = o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.asInterface + 85;
        o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.onTransact = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (o.setByteOrder.onExtraCallbackWithResult(r8.onExtraCallbackWithResult, r9.onExtraCallbackWithResult) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r9 = o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.asInterface + 101;
        o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.onTransact = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (o.setByteOrder.onExtraCallbackWithResult(r8.onWarmupCompleted, r9.onWarmupCompleted) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r9 = o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.asInterface + 75;
        o.r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI.onTransact = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (o.setByteOrder.onExtraCallbackWithResult(r8.onNavigationEvent, r9.onNavigationEvent) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = (((((((setByteOrder.onTransact(this.onExtraCallback) * 31) + setByteOrder.onTransact(this.IAuthTabCallback)) * 31) + setByteOrder.onTransact(this.onExtraCallbackWithResult)) * 31) + setByteOrder.onTransact(this.onWarmupCompleted)) * 31) + setByteOrder.onTransact(this.onNavigationEvent);
        int i4 = asInterface + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iOnTransact;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackColors(background=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback) + ", border=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallback) + ", progressGradientStart=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallbackWithResult) + ", progressGradientEnd=" + setByteOrder.IAuthTabCallbackDefault(this.onWarmupCompleted) + ", progressShadow=" + setByteOrder.IAuthTabCallbackDefault(this.onNavigationEvent) + ")";
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI(long j, long j2, long j3, long j4, long j5) {
        this.onExtraCallback = j;
        this.IAuthTabCallback = j2;
        this.onExtraCallbackWithResult = j3;
        this.onWarmupCompleted = j4;
        this.onNavigationEvent = j5;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        int i3 = 4 / 0;
        return this.onExtraCallback;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i3 + 67;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        int i3 = 13 / 0;
        return this.onExtraCallbackWithResult;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 3;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
