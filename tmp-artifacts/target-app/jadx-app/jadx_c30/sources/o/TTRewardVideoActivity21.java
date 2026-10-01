package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTRewardVideoActivity21 {
    private final TTRewardVideoActivity onExtraCallbackWithResult;
    private final Object onNavigationEvent;

    public TTRewardVideoActivity21(TTRewardVideoActivity tTRewardVideoActivity, Object obj) {
        this.onExtraCallbackWithResult = tTRewardVideoActivity;
        this.onNavigationEvent = obj;
        if (obj == null || TTPlayableLandingPageActivity2.onExtraCallback(tTRewardVideoActivity).onNavigationEvent(obj)) {
            return;
        }
        throw new IllegalArgumentException("The " + tTRewardVideoActivity + " method doesn't support options of type " + obj.getClass());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TTRewardVideoActivity21 tTRewardVideoActivity21 = (TTRewardVideoActivity21) obj;
        return Objects.equals(this.onExtraCallbackWithResult, tTRewardVideoActivity21.onExtraCallbackWithResult) && Objects.equals(this.onNavigationEvent, tTRewardVideoActivity21.onNavigationEvent);
    }

    public TTRewardVideoActivity onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public Object onExtraCallback() {
        return this.onNavigationEvent;
    }

    public int hashCode() {
        TTRewardVideoActivity tTRewardVideoActivity = this.onExtraCallbackWithResult;
        if (tTRewardVideoActivity == null) {
            return 0;
        }
        return tTRewardVideoActivity.hashCode();
    }
}
