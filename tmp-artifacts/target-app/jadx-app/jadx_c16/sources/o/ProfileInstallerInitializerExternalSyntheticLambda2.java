package o;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ProfileInstallerInitializerExternalSyntheticLambda2 {
    private final int IAuthTabCallback;
    private final CharSequence onExtraCallback;
    private final TextView onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileInstallerInitializerExternalSyntheticLambda2)) {
            return false;
        }
        ProfileInstallerInitializerExternalSyntheticLambda2 profileInstallerInitializerExternalSyntheticLambda2 = (ProfileInstallerInitializerExternalSyntheticLambda2) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, profileInstallerInitializerExternalSyntheticLambda2.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, profileInstallerInitializerExternalSyntheticLambda2.onExtraCallback) && this.IAuthTabCallback == profileInstallerInitializerExternalSyntheticLambda2.IAuthTabCallback && this.onWarmupCompleted == profileInstallerInitializerExternalSyntheticLambda2.onWarmupCompleted && this.onNavigationEvent == profileInstallerInitializerExternalSyntheticLambda2.onNavigationEvent;
    }

    public int hashCode() {
        TextView textView = this.onExtraCallbackWithResult;
        int iHashCode = textView != null ? textView.hashCode() : 0;
        CharSequence charSequence = this.onExtraCallback;
        return (((((((iHashCode * 31) + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.IAuthTabCallback) * 31) + this.onWarmupCompleted) * 31) + this.onNavigationEvent;
    }

    public String toString() {
        return "TextViewTextChangeEvent(view=" + this.onExtraCallbackWithResult + ", text=" + this.onExtraCallback + ", start=" + this.IAuthTabCallback + ", before=" + this.onWarmupCompleted + ", count=" + this.onNavigationEvent + ")";
    }

    public ProfileInstallerInitializerExternalSyntheticLambda2(@NotNull TextView textView, @NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(textView, "");
        Intrinsics.checkParameterIsNotNull(charSequence, "");
        this.onExtraCallbackWithResult = textView;
        this.onExtraCallback = charSequence;
        this.IAuthTabCallback = i;
        this.onWarmupCompleted = i2;
        this.onNavigationEvent = i3;
    }

    public final CharSequence onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }
}
