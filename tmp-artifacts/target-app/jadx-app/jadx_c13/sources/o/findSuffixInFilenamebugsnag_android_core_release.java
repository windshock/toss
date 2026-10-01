package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class findSuffixInFilenamebugsnag_android_core_release extends findErrorTypesForEventbugsnag_android_core_release {
    private final List<String> onWarmupCompleted;

    findSuffixInFilenamebugsnag_android_core_release(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.onWarmupCompleted = list;
    }

    @Override // o.findErrorTypesForEventbugsnag_android_core_release
    List<String> onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "ArrayBasedTraceState{entries=" + this.onWarmupCompleted + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof findErrorTypesForEventbugsnag_android_core_release) {
            return this.onWarmupCompleted.equals(((findErrorTypesForEventbugsnag_android_core_release) obj).onExtraCallbackWithResult());
        }
        return false;
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode() ^ 1000003;
    }
}
