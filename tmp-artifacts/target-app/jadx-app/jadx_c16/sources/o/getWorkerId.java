package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface getWorkerId {
    void IAuthTabCallback(int i, @NotNull EngineStack engineStack);

    void onExtraCallback(int i, @NotNull EngineStack engineStack, @NotNull EngineFactory engineFactory, boolean z);

    static /* synthetic */ void onExtraCallbackWithResult(getWorkerId getworkerid, int i, EngineStack engineStack, EngineFactory engineFactory, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickItem");
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        getworkerid.onExtraCallback(i, engineStack, engineFactory, z);
    }
}
