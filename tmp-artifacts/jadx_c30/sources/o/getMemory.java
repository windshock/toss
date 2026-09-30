package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getMemory implements Comparable<getMemory> {
    @Nullable
    public abstract Long onExtraCallback();

    getMemory() {
    }

    public final int hashCode() {
        Long lOnExtraCallback = onExtraCallback();
        if (lOnExtraCallback == null) {
            return 0;
        }
        return lOnExtraCallback.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getMemory)) {
            return false;
        }
        Long lOnExtraCallback = onExtraCallback();
        Long lOnExtraCallback2 = ((getMemory) obj).onExtraCallback();
        if (lOnExtraCallback == null) {
            return lOnExtraCallback2 == null;
        }
        return lOnExtraCallback.equals(lOnExtraCallback2);
    }
}
