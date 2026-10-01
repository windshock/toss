package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class tpg implements SerialDescriptor {
    private final SerialDescriptor onExtraCallback;
    private final String onNavigationEvent;
    public final KClass<?> onWarmupCompleted;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return this.onExtraCallback.IAuthTabCallback();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean asInterface() {
        return this.onExtraCallback.asInterface();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallback() {
        return this.onExtraCallback.onExtraCallback();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onExtraCallback(int i) {
        return this.onExtraCallback.onExtraCallback(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onExtraCallback.onExtraCallbackWithResult(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onExtraCallbackWithResult(int i) {
        return this.onExtraCallback.onExtraCallbackWithResult(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onNavigationEvent() {
        return this.onExtraCallback.onNavigationEvent();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        return this.onExtraCallback.onNavigationEvent(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onWarmupCompleted(int i) {
        return this.onExtraCallback.onWarmupCompleted(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onWarmupCompleted() {
        return this.onExtraCallback.onWarmupCompleted();
    }

    public tpg(@NotNull SerialDescriptor serialDescriptor, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        this.onExtraCallback = serialDescriptor;
        this.onWarmupCompleted = kClass;
        this.onNavigationEvent = serialDescriptor.onExtraCallbackWithResult() + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        tpg tpgVar = obj instanceof tpg ? (tpg) obj : null;
        return tpgVar != null && Intrinsics.areEqual(this.onExtraCallback, tpgVar.onExtraCallback) && Intrinsics.areEqual(tpgVar.onWarmupCompleted, this.onWarmupCompleted);
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + onExtraCallbackWithResult().hashCode();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.onWarmupCompleted + ", original: " + this.onExtraCallback + ')';
    }
}
