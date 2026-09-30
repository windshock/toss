package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface vyl {
    void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, char c);

    void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, float f);

    void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, int i2);

    void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, long j);

    void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str);

    void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, byte b);

    void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, double d);

    <T> void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull py<? super T> pyVar, @Nullable T t);

    Encoder onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i);

    void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor);

    <T> void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull py<? super T> pyVar, T t);

    void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, boolean z);

    void onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i, short s);

    default boolean onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return true;
    }
}
