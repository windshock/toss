package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.uu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ycx21 implements SerialDescriptor {
    private final int IAuthTabCallback;
    private final SerialDescriptor onExtraCallbackWithResult;

    public /* synthetic */ ycx21(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }

    private ycx21(SerialDescriptor serialDescriptor) {
        this.onExtraCallbackWithResult = serialDescriptor;
        this.IAuthTabCallback = 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return uu.onNavigationEvent.onExtraCallbackWithResult;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onWarmupCompleted(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onExtraCallback(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + onExtraCallbackWithResult() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> onExtraCallbackWithResult(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Illegal index " + i + ", " + onExtraCallbackWithResult() + " expects only non-negative indices").toString());
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Illegal index " + i + ", " + onExtraCallbackWithResult() + " expects only non-negative indices").toString());
        }
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycx21)) {
            return false;
        }
        ycx21 ycx21Var = (ycx21) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, ycx21Var.onExtraCallbackWithResult) && Intrinsics.areEqual(onExtraCallbackWithResult(), ycx21Var.onExtraCallbackWithResult());
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + onExtraCallbackWithResult().hashCode();
    }

    public String toString() {
        return onExtraCallbackWithResult() + '(' + this.onExtraCallbackWithResult + ')';
    }
}
