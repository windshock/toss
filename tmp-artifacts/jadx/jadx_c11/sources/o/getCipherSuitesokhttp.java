package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCipherSuitesokhttp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final setSupportsTlsExtensionsokhttp onNavigationEvent;
    private final getTlsokhttp onWarmupCompleted;

    public getCipherSuitesokhttp(@NotNull getTlsokhttp gettlsokhttp, @NotNull setSupportsTlsExtensionsokhttp setsupportstlsextensionsokhttp) {
        Intrinsics.checkNotNullParameter(gettlsokhttp, "");
        Intrinsics.checkNotNullParameter(setsupportstlsextensionsokhttp, "");
        this.onWarmupCompleted = gettlsokhttp;
        this.onNavigationEvent = setsupportstlsextensionsokhttp;
    }

    public final getTlsokhttp onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getTlsokhttp gettlsokhttp = this.onWarmupCompleted;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return gettlsokhttp;
    }

    public final setSupportsTlsExtensionsokhttp onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setSupportsTlsExtensionsokhttp setsupportstlsextensionsokhttp = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return setsupportstlsextensionsokhttp;
    }
}
