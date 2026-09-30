package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7 {
    private final String IAuthTabCallback;
    private final int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public getSignForPKCS7() {
        this(0, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSignForPKCS7)) {
            return false;
        }
        getSignForPKCS7 getsignforpkcs7 = (getSignForPKCS7) obj;
        return this.onExtraCallback == getsignforpkcs7.onExtraCallback && Intrinsics.areEqual(this.onNavigationEvent, getsignforpkcs7.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, getsignforpkcs7.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getsignforpkcs7.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.onExtraCallback) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "GraniteVideoErrorData(code=" + this.onExtraCallback + ", domain=" + this.onNavigationEvent + ", localizedDescription=" + this.IAuthTabCallback + ", errorString=" + this.onExtraCallbackWithResult + ")";
    }

    public getSignForPKCS7(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onExtraCallback = i;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallbackWithResult = str3;
    }

    public /* synthetic */ getSignForPKCS7(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str, (i2 & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str2, (i2 & 8) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str3);
    }

    public final int onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final String onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }
}
