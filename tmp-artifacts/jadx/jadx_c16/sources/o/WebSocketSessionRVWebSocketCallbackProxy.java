package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WebSocketSessionRVWebSocketCallbackProxy {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final WebSocketSessionRVWebSocketCallbackProxy onWarmupCompleted = new WebSocketSessionRVWebSocketCallbackProxy();

    static {
        int i = onExtraCallbackWithResult + 115;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private WebSocketSessionRVWebSocketCallbackProxy() {
    }

    public final String onExtraCallback(@NotNull String str, long j, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = j + ":" + str.length() + ":" + str + ":" + str2.length() + ":" + str2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r5 == o.WebSocketSessionRVWebSocketCallbackProxy.onExtraCallbackWithResult.TRIGGER) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (onExtraCallback(r5, r6, r7, r8) == o.WebSocketSessionRVWebSocketCallbackProxy.onExtraCallbackWithResult.TRIGGER) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r5 = o.WebSocketSessionRVWebSocketCallbackProxy.onNavigationEvent + 123;
        o.WebSocketSessionRVWebSocketCallbackProxy.IAuthTabCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(@Nullable String str, @NotNull String str2, @NotNull String str3, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(str, str2, str3, z);
            int i3 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (kotlin.text.StringsKt.contains(r4, "QA", false) != true) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final onExtraCallbackWithResult onExtraCallback(@Nullable String str, @NotNull String str2, @NotNull String str3, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (z) {
            int i3 = onNavigationEvent + 123;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                if (str != null) {
                }
                return onExtraCallbackWithResult.RELEASE_NOTE_NOT_QA;
            }
            int i4 = 83 / 0;
            if (str != null) {
            }
            return onExtraCallbackWithResult.RELEASE_NOTE_NOT_QA;
        }
        if (!Intrinsics.areEqual(str2, str3)) {
            return onExtraCallbackWithResult.TRIGGER;
        }
        int i5 = IAuthTabCallback + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onExtraCallbackWithResult.IGNORED_RELEASE;
    }
}
