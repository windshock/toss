package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getSignForPKCS7V2WithAttr {
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public getSignForPKCS7V2WithAttr() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSignForPKCS7V2WithAttr)) {
            return false;
        }
        getSignForPKCS7V2WithAttr getsignforpkcs7v2withattr = (getSignForPKCS7V2WithAttr) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, getsignforpkcs7v2withattr.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, getsignforpkcs7v2withattr.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, getsignforpkcs7v2withattr.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getsignforpkcs7v2withattr.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (((((this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "GraniteVideoTextTrack(title=" + this.IAuthTabCallback + ", language=" + this.onNavigationEvent + ", type=" + this.onWarmupCompleted + ", uri=" + this.onExtraCallbackWithResult + ")";
    }

    public getSignForPKCS7V2WithAttr(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.IAuthTabCallback = str;
        this.onNavigationEvent = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
    }

    public /* synthetic */ getSignForPKCS7V2WithAttr(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4);
    }
}
