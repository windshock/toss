package o;

import com.fasterxml.jackson.core.JsonParseException;
import java.util.HashSet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setEnterSharedElementCallback {
    protected HashSet<String> IAuthTabCallback;
    protected final Object onExtraCallbackWithResult;
    protected String onNavigationEvent;
    protected String onWarmupCompleted;

    private setEnterSharedElementCallback(Object obj) {
        this.onExtraCallbackWithResult = obj;
    }

    public static setEnterSharedElementCallback onWarmupCompleted(getViewLifecycleOwner getviewlifecycleowner) {
        return new setEnterSharedElementCallback(getviewlifecycleowner);
    }

    public static setEnterSharedElementCallback onNavigationEvent(getView getview) {
        return new setEnterSharedElementCallback(getview);
    }

    public setEnterSharedElementCallback IAuthTabCallback() {
        return new setEnterSharedElementCallback(this.onExtraCallbackWithResult);
    }

    public void onWarmupCompleted() {
        this.onWarmupCompleted = null;
        this.onNavigationEvent = null;
        this.IAuthTabCallback = null;
    }

    public Object onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public boolean onWarmupCompleted(String str) throws JsonParseException {
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            this.onWarmupCompleted = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.onNavigationEvent;
        if (str3 == null) {
            this.onNavigationEvent = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.IAuthTabCallback == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.IAuthTabCallback = hashSet;
            hashSet.add(this.onWarmupCompleted);
            this.IAuthTabCallback.add(this.onNavigationEvent);
        }
        return !this.IAuthTabCallback.add(str);
    }
}
