package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_GET_LIBLICENSEINFO extends toRealPath {
    private final int IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UST_GET_LIBLICENSEINFO) && this.IAuthTabCallback == ((UST_GET_LIBLICENSEINFO) obj).IAuthTabCallback;
    }

    public int hashCode() {
        return Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "YearViewModel(year=" + this.IAuthTabCallback + ")";
    }

    public final int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public long onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final String onExtraCallback() {
        return this.IAuthTabCallback + "년";
    }
}
