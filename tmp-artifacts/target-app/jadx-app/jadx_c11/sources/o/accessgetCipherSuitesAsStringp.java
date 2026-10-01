package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetCipherSuitesAsStringp {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final int onExtraCallbackWithResult(@NotNull connectionCount connectioncount, @NotNull Context context, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(connectioncount, "");
        Intrinsics.checkNotNullParameter(context, "");
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(Float.valueOf(connectioncount.onExtraCallbackWithResult(context.getResources().getConfiguration().fontScale, f)), context);
        int i4 = IAuthTabCallback + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onWarmupCompleted(connectionCount connectioncount, Context context, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            f = connectioncount.onNavigationEvent();
        }
        float fOnExtraCallback = onExtraCallback(connectioncount, context, f);
        int i4 = IAuthTabCallback + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final float onExtraCallback(@NotNull connectionCount connectioncount, @NotNull Context context, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(connectioncount, "");
            Intrinsics.checkNotNullParameter(context, "");
            varyMatches.onNavigationEvent(Float.valueOf(connectioncount.onExtraCallbackWithResult(context.getResources().getConfiguration().fontScale, f)), context);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(connectioncount, "");
        Intrinsics.checkNotNullParameter(context, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(connectioncount.onExtraCallbackWithResult(context.getResources().getConfiguration().fontScale, f)), context);
        int i3 = IAuthTabCallback + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return fOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final float onWarmupCompleted(@NotNull connectionCount connectioncount, @NotNull Context context, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(connectioncount, "");
        Intrinsics.checkNotNullParameter(context, "");
        float fOnExtraCallbackWithResult = connectioncount.onExtraCallbackWithResult(context.getResources().getConfiguration().fontScale, f);
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final float IAuthTabCallback(@NotNull connectionCount connectioncount, @NotNull Context context, float f, @NotNull InterfaceC0083handshake interfaceC0083handshake) {
        float fIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(connectioncount, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            fIAuthTabCallback = protocol.IAuthTabCallback(connectioncount.onExtraCallbackWithResult(context.getResources().getConfiguration().fontScale, f), interfaceC0083handshake);
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(connectioncount, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            fIAuthTabCallback = protocol.IAuthTabCallback(connectioncount.onExtraCallbackWithResult(context.getResources().getConfiguration().fontScale, f), interfaceC0083handshake);
        }
        int i4 = IAuthTabCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }
}
