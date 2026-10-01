package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ISDKTypeFactory extends createOpenAdLoader {
    private boolean IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private int onNavigationEvent;

    public ISDKTypeFactory(String str, int i) {
        super((byte) 1, i);
        Objects.requireNonNull(str, "utf8");
        this.onExtraCallbackWithResult = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.onExtraCallbackWithResult.equals(((ISDKTypeFactory) obj).onExtraCallbackWithResult);
        }
        return false;
    }

    private void onExtraCallbackWithResult() {
        this.IAuthTabCallback = true;
        this.onNavigationEvent = this.onExtraCallbackWithResult.hashCode() + 31;
    }

    public int hashCode() {
        if (!this.IAuthTabCallback) {
            onExtraCallbackWithResult();
        }
        return this.onNavigationEvent;
    }

    public void IAuthTabCallback(int i) {
        this.onExtraCallback = i;
    }

    public String toString() {
        return "UTF8: " + this.onExtraCallbackWithResult;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }
}
