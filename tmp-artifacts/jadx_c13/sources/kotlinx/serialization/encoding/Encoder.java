package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.hfycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Encoder {
    default void IAuthTabCallback() {
    }

    void IAuthTabCallback(char c);

    vyl onExtraCallback(@NotNull SerialDescriptor serialDescriptor);

    void onExtraCallback(float f);

    void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i);

    void onExtraCallbackWithResult(byte b);

    void onExtraCallbackWithResult(long j);

    void onExtraCallbackWithResult(@NotNull String str);

    void onExtraCallbackWithResult(short s);

    hfycx onNavigationEvent();

    void onNavigationEvent(double d);

    Encoder onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor);

    void onWarmupCompleted();

    void onWarmupCompleted(int i);

    void onWarmupCompleted(boolean z);

    default vyl IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallback(serialDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void onExtraCallbackWithResult(@NotNull py<? super T> pyVar, T t) {
        Intrinsics.checkNotNullParameter(pyVar, "");
        pyVar.serialize(this, t);
    }

    default <T> void onExtraCallback(@NotNull py<? super T> pyVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (pyVar.getDescriptor().asInterface()) {
            onExtraCallbackWithResult(pyVar, t);
        } else if (t == null) {
            onWarmupCompleted();
        } else {
            IAuthTabCallback();
            onExtraCallbackWithResult(pyVar, t);
        }
    }
}
