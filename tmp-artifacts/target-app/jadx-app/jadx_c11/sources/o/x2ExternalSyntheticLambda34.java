package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda34 implements x2ExternalSyntheticLambda30 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final getTimebase onWarmupCompleted = notifyPublicListeners.onWarmupCompleted(0);

    @Override // o.x2ExternalSyntheticLambda30
    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallbackWithResult;
    }

    @Override // o.x2ExternalSyntheticLambda30
    public void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = onExtraCallback + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        int i4 = onExtraCallback + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted.onExtraCallback(i);
        int i5 = IAuthTabCallback + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }
}
