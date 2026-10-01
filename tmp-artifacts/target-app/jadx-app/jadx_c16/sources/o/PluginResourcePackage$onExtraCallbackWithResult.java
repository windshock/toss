package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PluginResourcePackage$onExtraCallbackWithResult implements PluginResourcePackage {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.PluginResourcePackage$onExtraCallbackWithResult) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 27;
        o.PluginResourcePackage$onExtraCallbackWithResult.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, ((o.PluginResourcePackage$onExtraCallbackWithResult) r6).IAuthTabCallback)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r6 = o.PluginResourcePackage$onExtraCallbackWithResult.onNavigationEvent + 73;
        o.PluginResourcePackage$onExtraCallbackWithResult.onExtraCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if ((r6 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r6 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
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
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            int i4 = 41 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.IAuthTabCallback.hashCode();
            int i3 = 96 / 0;
        } else {
            iHashCode = this.IAuthTabCallback.hashCode();
        }
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickBridgePageButton(buttonType=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public PluginResourcePackage$onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i2 + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return str;
    }
}
