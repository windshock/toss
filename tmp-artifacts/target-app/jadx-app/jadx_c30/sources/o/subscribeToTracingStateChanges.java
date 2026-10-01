package o;

import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class subscribeToTracingStateChanges extends reportTimeStamp {
    private boolean IAuthTabCallback;
    private final String onExtraCallback;
    private final Intent onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private Boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof subscribeToTracingStateChanges)) {
            return false;
        }
        subscribeToTracingStateChanges subscribetotracingstatechanges = (subscribeToTracingStateChanges) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, subscribetotracingstatechanges.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, subscribetotracingstatechanges.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, subscribetotracingstatechanges.onExtraCallbackWithResult) && this.IAuthTabCallback == subscribetotracingstatechanges.IAuthTabCallback && Intrinsics.areEqual(this.onWarmupCompleted, subscribetotracingstatechanges.onWarmupCompleted);
    }

    public int hashCode() {
        int iHashCode = this.onNavigationEvent.hashCode();
        int iHashCode2 = this.onExtraCallback.hashCode();
        Intent intent = this.onExtraCallbackWithResult;
        int iHashCode3 = intent == null ? 0 : intent.hashCode();
        int iHashCode4 = Boolean.hashCode(this.IAuthTabCallback);
        Boolean bool = this.onWarmupCompleted;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "TermItem(title=" + this.onNavigationEvent + ", contentsUrl=" + this.onExtraCallback + ", contentIntent=" + this.onExtraCallbackWithResult + ", agreed=" + this.IAuthTabCallback + ", headerOptional=" + this.onWarmupCompleted + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public subscribeToTracingStateChanges(@NotNull String str, @NotNull String str2, @Nullable Intent intent, boolean z, @Nullable Boolean bool) {
        super(null);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.onNavigationEvent = str;
        this.onExtraCallback = str2;
        this.onExtraCallbackWithResult = intent;
        this.IAuthTabCallback = z;
        this.onWarmupCompleted = bool;
    }

    public /* synthetic */ subscribeToTracingStateChanges(String str, String str2, Intent intent, boolean z, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : intent, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bool);
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final Intent onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final void onWarmupCompleted(boolean z) {
        this.IAuthTabCallback = z;
    }

    public final Boolean onNavigationEvent() {
        return this.onWarmupCompleted;
    }
}
