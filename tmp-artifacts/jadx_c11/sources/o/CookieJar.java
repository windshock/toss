package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CookieJar {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final saveFromResponse IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public /* synthetic */ CookieJar(long j, saveFromResponse savefromresponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, savefromresponse, i);
    }

    public static /* synthetic */ CookieJar onExtraCallback(CookieJar cookieJar, long j, saveFromResponse savefromresponse, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 119;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            j = cookieJar.onNavigationEvent;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 91;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            saveFromResponse savefromresponse2 = cookieJar.IAuthTabCallback;
            int i9 = i7 + 33;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            savefromresponse = savefromresponse2;
        }
        if ((i2 & 4) != 0) {
            int i11 = onExtraCallback + 95;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = cookieJar.onExtraCallbackWithResult;
                throw null;
            }
            i = cookieJar.onExtraCallbackWithResult;
        }
        return cookieJar.IAuthTabCallback(j, savefromresponse, i);
    }

    public final CookieJar IAuthTabCallback(long j, @NotNull saveFromResponse savefromresponse, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(savefromresponse, "");
        CookieJar cookieJar = new CookieJar(j, savefromresponse, i, null);
        int i3 = onExtraCallback + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cookieJar;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookieJar)) {
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CookieJar cookieJar = (CookieJar) obj;
        if (!ExtensionsManager1.IAuthTabCallback(this.onNavigationEvent, cookieJar.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, cookieJar.IAuthTabCallback)) {
            int i4 = onWarmupCompleted + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return false;
        }
        if (this.onExtraCallbackWithResult == cookieJar.onExtraCallbackWithResult) {
            return true;
        }
        int i6 = onExtraCallback + 87;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = (((ExtensionsManager1.IAuthTabCallback(this.onNavigationEvent) * 31) + this.IAuthTabCallback.hashCode()) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FramebufferSpecification(size=" + ExtensionsManager1.onTransact(this.onNavigationEvent) + ", attachmentsSpec=" + this.IAuthTabCallback + ", downSampleFactor=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private CookieJar(long j, saveFromResponse savefromresponse, int i) {
        Intrinsics.checkNotNullParameter(savefromresponse, "");
        this.onNavigationEvent = j;
        this.IAuthTabCallback = savefromresponse;
        this.onExtraCallbackWithResult = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CookieJar(long j, saveFromResponse savefromresponse, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 1;
        }
        this(j, savefromresponse, i, null);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i2 + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return j;
    }

    public final saveFromResponse onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        saveFromResponse savefromresponse = this.IAuthTabCallback;
        int i5 = i2 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return savefromresponse;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.onExtraCallbackWithResult;
            int i5 = 73 / 0;
        } else {
            i = this.onExtraCallbackWithResult;
        }
        int i6 = i3 + 3;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
