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
public abstract class setDiffuseSpeed implements SerialDescriptor {
    private final SerialDescriptor IAuthTabCallback;
    private final int onExtraCallback;
    private final String onNavigationEvent;
    private final SerialDescriptor onWarmupCompleted;

    public /* synthetic */ setDiffuseSpeed(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    private setDiffuseSpeed(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.onNavigationEvent = str;
        this.onWarmupCompleted = serialDescriptor;
        this.IAuthTabCallback = serialDescriptor2;
        this.onExtraCallback = 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return uu.onWarmupCompleted.onWarmupCompleted;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int onExtraCallback() {
        return this.onExtraCallback;
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
        throw new IllegalArgumentException(str + " is not a valid map index");
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
        int i2 = i % 2;
        if (i2 == 0) {
            return this.onWarmupCompleted;
        }
        if (i2 == 1) {
            return this.IAuthTabCallback;
        }
        throw new IllegalStateException("Unreached");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDiffuseSpeed)) {
            return false;
        }
        setDiffuseSpeed setdiffusespeed = (setDiffuseSpeed) obj;
        return Intrinsics.areEqual(onExtraCallbackWithResult(), setdiffusespeed.onExtraCallbackWithResult()) && Intrinsics.areEqual(this.onWarmupCompleted, setdiffusespeed.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, setdiffusespeed.IAuthTabCallback);
    }

    public int hashCode() {
        return (((onExtraCallbackWithResult().hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return onExtraCallbackWithResult() + '(' + this.onWarmupCompleted + ", " + this.IAuthTabCallback + ')';
    }
}
