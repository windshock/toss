package o;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getHandle {
    private boolean IAuthTabCallback;
    private final Intent onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final getResultData onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHandle)) {
            return false;
        }
        getHandle gethandle = (getHandle) obj;
        return this.onTransact == gethandle.onTransact && Intrinsics.areEqual(this.onWarmupCompleted, gethandle.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, gethandle.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, gethandle.onExtraCallback) && this.onNavigationEvent == gethandle.onNavigationEvent && this.IAuthTabCallback == gethandle.IAuthTabCallback;
    }

    public int hashCode() {
        int iHashCode = this.onTransact.hashCode();
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
        Intent intent = this.onExtraCallback;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (intent == null ? 0 : intent.hashCode())) * 31) + Long.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "AccountAgreementTerm(type=" + this.onTransact + ", title=" + this.onWarmupCompleted + ", contentUrl=" + this.onExtraCallbackWithResult + ", contentIntent=" + this.onExtraCallback + ", termId=" + this.onNavigationEvent + ", agreed=" + this.IAuthTabCallback + ")";
    }

    public final String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }
}
