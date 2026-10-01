package o;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_hostOnly {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, deprecated_path> IAuthTabCallback;
    private final AssetManager onExtraCallback;

    public deprecated_hostOnly(@NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "");
        this.onExtraCallback = assetManager;
        this.IAuthTabCallback = new LinkedHashMap();
    }

    public final String onExtraCallbackWithResult(@NotNull String str) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        InputStream inputStreamOpen = this.onExtraCallback.open(str);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, (Throwable) null);
            int i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return text;
        } finally {
        }
    }

    public final void onNavigationEvent(@NotNull deprecated_path deprecated_pathVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_pathVar, "");
        deprecated_pathVar.IAuthTabCallback();
        this.IAuthTabCallback.remove(deprecated_pathVar.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final deprecated_path IAuthTabCallback(@NotNull String str, @NotNull String str2) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Map<String, deprecated_path> map = this.IAuthTabCallback;
        String str3 = str + "_" + str2;
        deprecated_path deprecated_pathVarOnExtraCallback = map.get(str3);
        if (deprecated_pathVarOnExtraCallback == null) {
            deprecated_pathVarOnExtraCallback = deprecated_path.Companion.onExtraCallback(this.onExtraCallback, "shader/" + str + ".vert", "shader/" + str2 + ".frag");
            map.put(str3, deprecated_pathVarOnExtraCallback);
        }
        deprecated_path deprecated_pathVar = deprecated_pathVarOnExtraCallback;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return deprecated_pathVar;
    }

    public final deprecated_path onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Map<String, deprecated_path> map = this.IAuthTabCallback;
        deprecated_path deprecated_pathVarOnWarmupCompleted = map.get(str);
        if (deprecated_pathVarOnWarmupCompleted == null) {
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            deprecated_pathVarOnWarmupCompleted = deprecated_path.Companion.onWarmupCompleted(str, str2, str3);
            map.put(str, deprecated_pathVarOnWarmupCompleted);
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return deprecated_pathVarOnWarmupCompleted;
    }

    public final deprecated_path onWarmupCompleted(@NotNull String str, @NotNull String str2) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Map<String, deprecated_path> map = this.IAuthTabCallback;
        deprecated_path deprecated_pathVarIAuthTabCallback = map.get(str);
        if (deprecated_pathVarIAuthTabCallback == null) {
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            deprecated_pathVarIAuthTabCallback = deprecated_path.Companion.IAuthTabCallback(this.onExtraCallback, str2);
            map.put(str, deprecated_pathVarIAuthTabCallback);
            int i4 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_path deprecated_pathVar = deprecated_pathVarIAuthTabCallback;
        int i6 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_pathVar;
    }
}
