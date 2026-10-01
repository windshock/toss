package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidKtExternalSyntheticLambda3 {
    public static final ExposedDropdownMenu_androidKtExternalSyntheticLambda3 onWarmupCompleted = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(0, 0);
    public final long onExtraCallbackWithResult;
    public final long onNavigationEvent;

    public ExposedDropdownMenu_androidKtExternalSyntheticLambda3(long j, long j2) {
        this.onExtraCallbackWithResult = j;
        this.onNavigationEvent = j2;
    }

    public String toString() {
        return "[timeUs=" + this.onExtraCallbackWithResult + ", position=" + this.onNavigationEvent + "]";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExposedDropdownMenu_androidKtExternalSyntheticLambda3.class != obj.getClass()) {
            return false;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = (ExposedDropdownMenu_androidKtExternalSyntheticLambda3) obj;
        return this.onExtraCallbackWithResult == exposedDropdownMenu_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult && this.onNavigationEvent == exposedDropdownMenu_androidKtExternalSyntheticLambda3.onNavigationEvent;
    }

    public int hashCode() {
        return (((int) this.onExtraCallbackWithResult) * 31) + ((int) this.onNavigationEvent);
    }
}
