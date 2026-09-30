package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setLottieAdDescMaxLength<Array> {
    public abstract int onExtraCallback();

    public abstract Array onExtraCallbackWithResult();

    public abstract void onWarmupCompleted(int i);

    public static /* synthetic */ void onExtraCallbackWithResult(setLottieAdDescMaxLength setlottieaddescmaxlength, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = setlottieaddescmaxlength.onExtraCallback() + 1;
        }
        setlottieaddescmaxlength.onWarmupCompleted(i);
    }
}
