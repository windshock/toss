package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class shouldBeKeptAsChild {
    public final String IAuthTabCallback;
    public final boolean onExtraCallbackWithResult;
    public final boolean onNavigationEvent;

    public shouldBeKeptAsChild(String str, boolean z, boolean z2) {
        this.IAuthTabCallback = str;
        this.onNavigationEvent = z;
        this.onExtraCallbackWithResult = z2;
    }

    public shouldBeKeptAsChild(List<shouldBeKeptAsChild> list) {
        this.IAuthTabCallback = onExtraCallbackWithResult(list);
        this.onNavigationEvent = onExtraCallback(list).booleanValue();
        this.onExtraCallbackWithResult = onWarmupCompleted(list).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        shouldBeKeptAsChild shouldbekeptaschild = (shouldBeKeptAsChild) obj;
        if (this.onNavigationEvent == shouldbekeptaschild.onNavigationEvent && this.onExtraCallbackWithResult == shouldbekeptaschild.onExtraCallbackWithResult) {
            return this.IAuthTabCallback.equals(shouldbekeptaschild.IAuthTabCallback);
        }
        return false;
    }

    public int hashCode() {
        return (((this.IAuthTabCallback.hashCode() * 31) + (this.onNavigationEvent ? 1 : 0)) * 31) + (this.onExtraCallbackWithResult ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.IAuthTabCallback + "', granted=" + this.onNavigationEvent + ", shouldShowRequestPermissionRationale=" + this.onExtraCallbackWithResult + '}';
    }

    private String onExtraCallbackWithResult(List<shouldBeKeptAsChild> list) {
        return ((StringBuilder) getByteBuffer.onExtraCallback(list).asInterface(new deserializeIntNullableCollection<shouldBeKeptAsChild, String>() { // from class: o.shouldBeKeptAsChild.4
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public String apply(shouldBeKeptAsChild shouldbekeptaschild) throws Exception {
                return shouldbekeptaschild.IAuthTabCallback;
            }
        }).onExtraCallbackWithResult(new StringBuilder(), new deserializeDouble<StringBuilder, String>() { // from class: o.shouldBeKeptAsChild.5
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public void accept(StringBuilder sb, String str) throws Exception {
                if (sb.length() == 0) {
                    sb.append(str);
                } else {
                    sb.append(", ");
                    sb.append(str);
                }
            }
        }).onNavigationEvent()).toString();
    }

    private Boolean onExtraCallback(List<shouldBeKeptAsChild> list) {
        return (Boolean) getByteBuffer.onExtraCallback(list).onExtraCallback(new deserializeLongCollection<shouldBeKeptAsChild>() { // from class: o.shouldBeKeptAsChild.2
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public boolean test(shouldBeKeptAsChild shouldbekeptaschild) throws Exception {
                return shouldbekeptaschild.onNavigationEvent;
            }
        }).onNavigationEvent();
    }

    private Boolean onWarmupCompleted(List<shouldBeKeptAsChild> list) {
        return (Boolean) getByteBuffer.onExtraCallback(list).onExtraCallbackWithResult(new deserializeLongCollection<shouldBeKeptAsChild>() { // from class: o.shouldBeKeptAsChild.1
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public boolean test(shouldBeKeptAsChild shouldbekeptaschild) throws Exception {
                return shouldbekeptaschild.onExtraCallbackWithResult;
            }
        }).onNavigationEvent();
    }
}
