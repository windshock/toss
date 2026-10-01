package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setPreFinish implements setOnShakeListener {
    private Character onExtraCallback;

    public abstract int onExtraCallbackWithResult();

    public abstract boolean onWarmupCompleted();

    @Override // o.setOnShakeListener
    public final int IAuthTabCallback(@NotNull char[] cArr, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(cArr, "");
        Character ch = this.onExtraCallback;
        if (ch != null) {
            Intrinsics.checkNotNull(ch);
            cArr[i] = ch.charValue();
            this.onExtraCallback = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !onWarmupCompleted()) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (iOnExtraCallbackWithResult <= 65535) {
                cArr[i + i3] = (char) iOnExtraCallbackWithResult;
                i3++;
            } else {
                char c = (char) ((iOnExtraCallbackWithResult >>> 10) + 55232);
                char c2 = (char) ((iOnExtraCallbackWithResult & 1023) + 56320);
                cArr[i + i3] = c;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c2;
                    i3 += 2;
                } else {
                    this.onExtraCallback = Character.valueOf(c2);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
