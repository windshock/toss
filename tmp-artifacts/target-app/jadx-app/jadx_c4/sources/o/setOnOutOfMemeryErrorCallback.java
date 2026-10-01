package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.setOnOutOfMemeryErrorCallback;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setOnOutOfMemeryErrorCallback {
    static /* synthetic */ Unit onExtraCallback(startRunning startrunning) {
        int i = 2 % 2;
        return onWarmupCompleted(startrunning);
    }

    static /* synthetic */ Unit onNavigationEvent(startRunning startrunning) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(startrunning);
    }

    void IAuthTabCallback(@NotNull Function1<? super startRunning, Unit> function1);

    void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> map);

    void onNavigationEvent(@NotNull String str, @Nullable Map<?, ?> map);

    void onNavigationEvent(@NotNull String str, @NotNull Function1<? super startRunning, Unit> function1);

    void onNavigationEvent(@NotNull String str, @NotNull Object[] objArr, @Nullable String str2, @NotNull ALCFaceValidation aLCFaceValidation, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
        }
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxy$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 1;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnExtraCallback = setOnOutOfMemeryErrorCallback.onExtraCallback((startRunning) obj2);
                    int i6 = onExtraCallback + 35;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            };
        }
        setonoutofmemeryerrorcallback.IAuthTabCallback(function1);
    }

    private static Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = access8100.onNavigationEvent();
        }
        setonoutofmemeryerrorcallback.onExtraCallbackWithResult(str, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeWebCallback");
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxy$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted + 85;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnNavigationEvent = setOnOutOfMemeryErrorCallback.onNavigationEvent((startRunning) obj2);
                    if (i5 != 0) {
                        int i6 = 25 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            };
        }
        setonoutofmemeryerrorcallback.onNavigationEvent(str, (Function1<? super startRunning, Unit>) function1);
    }

    private static Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeReactCallback");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        setonoutofmemeryerrorcallback.onNavigationEvent(str, (Map<?, ?>) map);
    }

    static /* synthetic */ void onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, Object[] objArr, String str2, ALCFaceValidation aLCFaceValidation, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestLogging");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = false;
        }
        setonoutofmemeryerrorcallback.onNavigationEvent(str, objArr, str3, aLCFaceValidation, z);
    }
}
