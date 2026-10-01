package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class protocol {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final boolean onNavigationEvent(@NotNull InterfaceC0083handshake interfaceC0083handshake) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        boolean z = !Intrinsics.areEqual(interfaceC0083handshake, InterfaceC0083handshake.Companion.IAuthTabCallback());
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onExtraCallback(float f, InterfaceC0083handshake interfaceC0083handshake, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            interfaceC0083handshake = InterfaceC0083handshake.Companion.IAuthTabCallback();
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        float fIAuthTabCallback = IAuthTabCallback(f, interfaceC0083handshake);
        int i6 = onExtraCallback + 25;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return fIAuthTabCallback;
    }

    public static final float IAuthTabCallback(float f, @NotNull InterfaceC0083handshake interfaceC0083handshake) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        if (!onNavigationEvent(interfaceC0083handshake)) {
            float fOnExtraCallback = f * onExtraCallback(f, interfaceC0083handshake);
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
            }
            return fOnExtraCallback;
        }
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceC0083handshake.onExtraCallbackWithResult(f);
        }
        interfaceC0083handshake.onExtraCallbackWithResult(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float onExtraCallback(float f, @NotNull InterfaceC0083handshake interfaceC0083handshake) {
        float fOnExtraCallbackWithResult;
        float f2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            int i3 = 67 / 0;
            if (onNavigationEvent(interfaceC0083handshake)) {
                int i4 = onExtraCallback + 93;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    interfaceC0083handshake.onExtraCallbackWithResult(f);
                    throw null;
                }
                fOnExtraCallbackWithResult = interfaceC0083handshake.onExtraCallbackWithResult(f);
            } else if (f > 20.0f) {
                fOnExtraCallbackWithResult = 10.0f + f;
            } else {
                f2 = 1.5f;
            }
            f2 = fOnExtraCallbackWithResult / f;
        } else {
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            if (onNavigationEvent(interfaceC0083handshake)) {
            }
            f2 = fOnExtraCallbackWithResult / f;
        }
        return RangesKt.coerceAtLeast(f2, ConnectionPool.onWarmupCompleted.onWarmupCompleted().IAuthTabCallback());
    }
}
