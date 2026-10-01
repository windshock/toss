package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLottieAppNameMaxLength implements SerialDescriptor {
    private final String IAuthTabCallback;
    private final spv onNavigationEvent;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallback() {
        return 0;
    }

    public setLottieAppNameMaxLength(@NotNull String str, @NotNull spv spvVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spvVar, "");
        this.IAuthTabCallback = str;
        this.onNavigationEvent = spvVar;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public spv IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onWarmupCompleted(int i) {
        IAuthTabCallbackStub();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallbackStub();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onExtraCallback(int i) {
        IAuthTabCallbackStub();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        IAuthTabCallbackStub();
        throw new setWrite();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onExtraCallbackWithResult(int i) {
        IAuthTabCallbackStub();
        throw new setWrite();
    }

    public String toString() {
        return "PrimitiveDescriptor(" + onExtraCallbackWithResult() + ')';
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLottieAppNameMaxLength)) {
            return false;
        }
        setLottieAppNameMaxLength setlottieappnamemaxlength = (setLottieAppNameMaxLength) obj;
        return Intrinsics.areEqual(onExtraCallbackWithResult(), setlottieappnamemaxlength.onExtraCallbackWithResult()) && Intrinsics.areEqual(IAuthTabCallback(), setlottieappnamemaxlength.IAuthTabCallback());
    }

    public int hashCode() {
        return onExtraCallbackWithResult().hashCode() + (IAuthTabCallback().hashCode() * 31);
    }

    private final Void IAuthTabCallbackStub() {
        throw new IllegalStateException("Primitive descriptor " + onExtraCallbackWithResult() + " does not have elements");
    }
}
