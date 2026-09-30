package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface yw {
    public static final onNavigationEvent Companion = onNavigationEvent.onWarmupCompleted;

    double IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, int i);

    hfycx IAuthTabCallback();

    long IAuthTabCallbackDefault(@NotNull SerialDescriptor serialDescriptor, int i);

    short IAuthTabCallbackStub(@NotNull SerialDescriptor serialDescriptor, int i);

    default int asBinder(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return -1;
    }

    Decoder asBinder(@NotNull SerialDescriptor serialDescriptor, int i);

    String asInterface(@NotNull SerialDescriptor serialDescriptor, int i);

    default boolean extraCallbackWithResult() {
        return false;
    }

    byte onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i);

    <T> T onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull jp<? extends T> jpVar, @Nullable T t);

    void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor);

    boolean onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i);

    char onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i);

    int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor);

    <T> T onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull jp<? extends T> jpVar, @Nullable T t);

    int onTransact(@NotNull SerialDescriptor serialDescriptor, int i);

    float onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i);

    public static final class onNavigationEvent {
        static final /* synthetic */ onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        private onNavigationEvent() {
        }
    }

    static /* synthetic */ Object onExtraCallback(yw ywVar, SerialDescriptor serialDescriptor, int i, jp jpVar, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return ywVar.onNavigationEvent(serialDescriptor, i, jpVar, obj);
    }
}
