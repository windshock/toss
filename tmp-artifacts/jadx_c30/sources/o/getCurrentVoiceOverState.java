package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurrentVoiceOverState {
    public static final int $stable = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("type")
    private final String type;

    /* JADX WARN: Illegal instructions before constructor call */
    public getCurrentVoiceOverState() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getCurrentVoiceOverState)) {
                return false;
            }
            if (Intrinsics.areEqual(this.type, ((getCurrentVoiceOverState) obj).type)) {
                return true;
            }
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 25;
        onWarmupCompleted = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 53;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r2 = r2 + 85;
        o.getCurrentVoiceOverState.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.type;
            int i4 = 7 / 0;
        } else {
            str = this.type;
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Navbar(type=" + this.type + ")";
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getCurrentVoiceOverState(@Nullable String str) {
        this.type = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCurrentVoiceOverState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }
}
