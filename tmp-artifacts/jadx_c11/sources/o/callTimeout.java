package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class callTimeout {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final void onNavigationEvent(@NotNull eventListener eventlistener, @Nullable String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eventlistener, "");
        if (!(!(eventlistener instanceof getConnectionPoolokhttp))) {
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((getFollowSslRedirectsokhttp) eventlistener).onNavigationEvent(str);
            int i4 = onExtraCallbackWithResult + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final void onExtraCallback(@NotNull eventListener eventlistener, @Nullable hasProvider hasprovider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eventlistener, "");
        if (eventlistener instanceof getConnectionPoolokhttp) {
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ((getFollowSslRedirectsokhttp) eventlistener).onNavigationEvent(hasprovider);
        }
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void onNavigationEvent(@NotNull eventListener eventlistener, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(eventlistener, "");
        if (eventlistener instanceof connectTimeout) {
            int i4 = onExtraCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ((getNetworkInterceptorsokhttp) eventlistener).onNavigationEvent(num);
            int i6 = onExtraCallbackWithResult + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final void IAuthTabCallback(@NotNull eventListener eventlistener, @Nullable setByteOrder setbyteorder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eventlistener, "");
        if (eventlistener instanceof connectTimeout) {
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((getNetworkInterceptorsokhttp) eventlistener).onExtraCallbackWithResult(setbyteorder);
        }
        int i4 = onExtraCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
