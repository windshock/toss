package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.uu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ea11 implements SerialDescriptor {
    public static final ea11 onExtraCallbackWithResult = new ea11();
    private static final vbt onExtraCallback = uu.onExtraCallback.onExtraCallbackWithResult;
    private static final String IAuthTabCallback = "kotlin.Nothing";

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallback() {
        return 0;
    }

    private ea11() {
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return onExtraCallback;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return IAuthTabCallback;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onWarmupCompleted(int i) {
        onTransact();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onTransact();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onExtraCallback(int i) {
        onTransact();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        onTransact();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onExtraCallbackWithResult(int i) {
        onTransact();
        throw new setWrite();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }

    public int hashCode() {
        return onExtraCallbackWithResult().hashCode() + (IAuthTabCallback().hashCode() * 31);
    }

    private final Void onTransact() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }
}
