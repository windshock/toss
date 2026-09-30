package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class releaseGeckoResLoader {
    private static final boolean onWarmupCompleted = djExternalSyntheticApiModelOutline2.onWarmupCompleted("kotlinx.coroutines.main.delay", false);
    private static final BufferOutputStream onExtraCallback = onExtraCallbackWithResult();

    public static final BufferOutputStream onExtraCallback() {
        return onExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final BufferOutputStream onExtraCallbackWithResult() {
        if (!onWarmupCompleted) {
            return GeckoHubImpa.onExtraCallback;
        }
        setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
        return (lud4.IAuthTabCallback(setpatchOnExtraCallback) || !(setpatchOnExtraCallback instanceof BufferOutputStream)) ? GeckoHubImpa.onExtraCallback : (BufferOutputStream) setpatchOnExtraCallback;
    }
}
