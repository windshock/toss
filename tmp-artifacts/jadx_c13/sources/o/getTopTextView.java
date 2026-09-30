package o;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getTopTextView implements SerialDescriptor, getDynamicClickListener {
    private final String IAuthTabCallback;
    private final SerialDescriptor onExtraCallback;
    private final Set<String> onNavigationEvent;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return this.onExtraCallback.IAuthTabCallback();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean asInterface() {
        return true;
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

    public getTopTextView(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.onExtraCallback = serialDescriptor;
        this.IAuthTabCallback = serialDescriptor.onExtraCallbackWithResult() + '?';
        this.onNavigationEvent = setImageLottieTosPath.IAuthTabCallback(serialDescriptor);
    }

    public final SerialDescriptor IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.getDynamicClickListener
    public Set<String> asBinder() {
        return this.onNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getTopTextView) && Intrinsics.areEqual(this.onExtraCallback, ((getTopTextView) obj).onExtraCallback);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.onExtraCallback);
        sb.append('?');
        return sb.toString();
    }

    public int hashCode() {
        return this.onExtraCallback.hashCode() * 31;
    }
}
