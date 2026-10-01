package im.toss.tds.compose.component.theme.component;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RedDotColorScheme {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final long IAuthTabCallback;

    public /* synthetic */ RedDotColorScheme(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private RedDotColorScheme(long j) {
        this.IAuthTabCallback = j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i3 + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
