package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class verifySignEX {
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof verifySignEX) && Intrinsics.areEqual(this.onExtraCallback, ((verifySignEX) obj).onExtraCallback);
    }

    public int hashCode() {
        String str = this.onExtraCallback;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ClosePageEvent(url=" + this.onExtraCallback + ")";
    }

    public verifySignEX(@Nullable String str) {
        this.onExtraCallback = str;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallback;
    }
}
