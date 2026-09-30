package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setWidthAndHeightRatio extends wiesya implements Comparable<setWidthAndHeightRatio> {
    private final int onExtraCallbackWithResult;

    public setWidthAndHeightRatio(int i) {
        this.onExtraCallbackWithResult = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int compareTo(setWidthAndHeightRatio setwidthandheightratio) {
        int i = this.onExtraCallbackWithResult;
        int i2 = setwidthandheightratio.onExtraCallbackWithResult;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.INT32;
    }

    public int onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && setWidthAndHeightRatio.class == obj.getClass() && this.onExtraCallbackWithResult == ((setWidthAndHeightRatio) obj).onExtraCallbackWithResult;
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "BsonInt32{value=" + this.onExtraCallbackWithResult + '}';
    }
}
