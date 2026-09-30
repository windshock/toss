package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getHaloAnimation extends wr {
    public static final getHaloAnimation onExtraCallbackWithResult = new getHaloAnimation();
    private static final hfycx onExtraCallback = tnycx.onNavigationEvent();

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void IAuthTabCallback(char c) {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallback(float f) {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(byte b) {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(long j) {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(short s) {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onNavigationEvent(double d) {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted() {
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted(int i) {
    }

    @Override // o.wr
    public void onWarmupCompleted(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted(boolean z) {
    }

    private getHaloAnimation() {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public hfycx onNavigationEvent() {
        return onExtraCallback;
    }
}
