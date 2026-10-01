package o;

import android.util.LruCache;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSecondaryProgress {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final LruCache<drawAll, String> IAuthTabCallback = new LruCache<>(100);

    public final void onExtraCallbackWithResult(@NotNull drawAll drawall, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(drawall, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (str.length() > 4096) {
            getLayoutWidth.onWarmupCompleted();
            str.length();
            getLayoutWidth.onExtraCallbackWithResult(str, 48, null, 2, null);
            Objects.toString(drawall);
            return;
        }
        this.IAuthTabCallback.put(drawall, str);
        getLayoutWidth.onWarmupCompleted();
        str.length();
        getLayoutWidth.onExtraCallbackWithResult(str, 48, null, 2, null);
        this.IAuthTabCallback.size();
        Objects.toString(drawall);
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r4 = o.getSecondaryProgress.onExtraCallback + 89;
        o.getSecondaryProgress.onNavigationEvent = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r4 = 49 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        o.getLayoutWidth.onWarmupCompleted();
        r0 = r3.IAuthTabCallback;
        java.util.Objects.toString(r4);
        java.util.Objects.toString(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onWarmupCompleted(@NotNull drawAll drawall) {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(drawall, "");
            str = this.IAuthTabCallback.get(drawall);
            int i3 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(drawall, "");
            str = this.IAuthTabCallback.get(drawall);
        }
    }
}
