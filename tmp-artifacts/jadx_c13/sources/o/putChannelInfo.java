package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class putChannelInfo {
    public static final putChannelInfo onExtraCallbackWithResult = new putChannelInfo();
    private static final GeckoHubImp onExtraCallback = jni_YGNodeInsertChildJNI.onNavigationEvent;
    private static final GeckoHubImp IAuthTabCallback = INetWork.onNavigationEvent;

    private putChannelInfo() {
    }

    public static final GeckoHubImp onWarmupCompleted() {
        return onExtraCallback;
    }

    public static final setPatch onExtraCallback() {
        return lud3.onWarmupCompleted;
    }

    public static final GeckoHubImp onExtraCallbackWithResult() {
        return IAuthTabCallback;
    }

    public static final GeckoHubImp IAuthTabCallback() {
        return jni_YGNodeCloneJNI.onNavigationEvent;
    }
}
