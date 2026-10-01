package o;

import android.text.Editable;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ProfileInstallerExternalSyntheticLambda0 {
    private final Editable onExtraCallback;
    private final TextView onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileInstallerExternalSyntheticLambda0)) {
            return false;
        }
        ProfileInstallerExternalSyntheticLambda0 profileInstallerExternalSyntheticLambda0 = (ProfileInstallerExternalSyntheticLambda0) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, profileInstallerExternalSyntheticLambda0.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, profileInstallerExternalSyntheticLambda0.onExtraCallback);
    }

    public int hashCode() {
        TextView textView = this.onExtraCallbackWithResult;
        int iHashCode = textView != null ? textView.hashCode() : 0;
        Editable editable = this.onExtraCallback;
        return (iHashCode * 31) + (editable != null ? editable.hashCode() : 0);
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent(view=" + this.onExtraCallbackWithResult + ", editable=" + ((Object) this.onExtraCallback) + ")";
    }

    public ProfileInstallerExternalSyntheticLambda0(@NotNull TextView textView, @Nullable Editable editable) {
        Intrinsics.checkParameterIsNotNull(textView, "");
        this.onExtraCallbackWithResult = textView;
        this.onExtraCallback = editable;
    }

    public final Editable onExtraCallback() {
        return this.onExtraCallback;
    }
}
