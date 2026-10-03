package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdOptionsView {
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdOptionsView)) {
            return false;
        }
        AdOptionsView adOptionsView = (AdOptionsView) obj;
        return Intrinsics.areEqual(this.IAuthTabCallbackDefault, adOptionsView.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onNavigationEvent, adOptionsView.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, adOptionsView.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, adOptionsView.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, adOptionsView.onExtraCallback) && Intrinsics.areEqual(this.asInterface, adOptionsView.asInterface) && Intrinsics.areEqual(this.IAuthTabCallback, adOptionsView.IAuthTabCallback);
    }

    public int hashCode() {
        String str = this.IAuthTabCallbackDefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.onNavigationEvent;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onWarmupCompleted;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.onExtraCallbackWithResult;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.onExtraCallback;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.asInterface;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.IAuthTabCallback;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "PullUpWebRequest(url=" + this.IAuthTabCallbackDefault + ", size=" + this.onNavigationEvent + ", ui=" + this.onWarmupCompleted + ", external=" + this.onExtraCallbackWithResult + ", style=" + this.onExtraCallback + ", universalLink=" + this.asInterface + ", transparent=" + this.IAuthTabCallback + ")";
    }

    public AdOptionsView(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.IAuthTabCallbackDefault = str;
        this.onNavigationEvent = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
        this.onExtraCallback = str5;
        this.asInterface = str6;
        this.IAuthTabCallback = str7;
    }

    public final String onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final String onTransact() {
        return this.asInterface;
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }
}
