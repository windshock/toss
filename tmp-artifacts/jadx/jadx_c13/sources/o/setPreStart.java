package o;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setPreStart implements setOnShakeListener {
    private final setIsPreventTouchEvent onNavigationEvent;

    public setPreStart(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        this.onNavigationEvent = new setIsPreventTouchEvent(inputStream, Charsets.UTF_8);
    }

    @Override // o.setOnShakeListener
    public int IAuthTabCallback(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return this.onNavigationEvent.IAuthTabCallback(cArr, i, i2);
    }

    public final void onNavigationEvent() {
        this.onNavigationEvent.IAuthTabCallback();
    }
}
