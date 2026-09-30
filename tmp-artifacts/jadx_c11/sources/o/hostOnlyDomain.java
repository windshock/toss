package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hostOnlyDomain {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final deprecated_persistent IAuthTabCallback;
    private final deprecated_path onExtraCallbackWithResult;

    public hostOnlyDomain(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar) throws IOException {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        this.IAuthTabCallback = deprecated_persistentVar;
        deprecated_path deprecated_pathVarIAuthTabCallback = deprecated_hostonly.IAuthTabCallback("simple_quad", "simple_mask");
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.onExtraCallbackWithResult = deprecated_pathVarIAuthTabCallback;
    }

    public final deprecated_path onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        deprecated_path deprecated_pathVar = this.onExtraCallbackWithResult;
        int i4 = i3 + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_pathVar;
    }

    public final void IAuthTabCallback(@NotNull getTlsVersionsokhttp gettlsversionsokhttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(gettlsversionsokhttp, "");
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback);
            gettlsversionsokhttp.onWarmupCompleted(4);
            this.onExtraCallbackWithResult.onWarmupCompleted("u_Mask", 3);
        } else {
            Intrinsics.checkNotNullParameter(gettlsversionsokhttp, "");
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback);
            gettlsversionsokhttp.onWarmupCompleted(2);
            this.onExtraCallbackWithResult.onWarmupCompleted("u_Mask", 2);
        }
        int i3 = onNavigationEvent + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull setCipherSuitesokhttp setciphersuitesokhttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setciphersuitesokhttp, "");
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback);
        setciphersuitesokhttp.onWarmupCompleted(3);
        this.onExtraCallbackWithResult.onWarmupCompleted("u_Background", 3);
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
