package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class wr implements Encoder, vyl {
    @Override // kotlinx.serialization.encoding.Encoder
    public vyl onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this;
    }

    public boolean onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return true;
    }

    public void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this;
    }

    public void onWarmupCompleted(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        throw new qn("Non-serializable " + Reflection.getOrCreateKotlinClass(obj.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted() {
        throw new qn("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted(boolean z) {
        onWarmupCompleted(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(byte b) {
        onWarmupCompleted(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(short s) {
        onWarmupCompleted(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted(int i) {
        onWarmupCompleted(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(long j) {
        onWarmupCompleted(Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onExtraCallback(float f) {
        onWarmupCompleted(Float.valueOf(f));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onNavigationEvent(double d) {
        onWarmupCompleted(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void IAuthTabCallback(char c) {
        onWarmupCompleted(Character.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onWarmupCompleted(Integer.valueOf(i));
    }

    @Override // o.vyl
    public final void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onWarmupCompleted(z);
        }
    }

    @Override // o.vyl
    public final void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallbackWithResult(b);
        }
    }

    @Override // o.vyl
    public final void onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallbackWithResult(s);
        }
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onWarmupCompleted(i2);
        }
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallbackWithResult(j);
        }
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallback(f);
        }
    }

    @Override // o.vyl
    public final void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onNavigationEvent(d);
        }
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            IAuthTabCallback(c);
        }
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallbackWithResult(str);
        }
    }

    @Override // o.vyl
    public final Encoder onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult(serialDescriptor, i) ? onWarmupCompleted(serialDescriptor.onNavigationEvent(i)) : getHaloAnimation.onExtraCallbackWithResult;
    }

    @Override // o.vyl
    public <T> void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull py<? super T> pyVar, T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallbackWithResult((py<? super py<? super T>>) pyVar, (py<? super T>) t);
        }
    }

    public <T> void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull py<? super T> pyVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (onExtraCallbackWithResult(serialDescriptor, i)) {
            onExtraCallback((py<? super py<? super T>>) pyVar, (py<? super T>) t);
        }
    }
}
