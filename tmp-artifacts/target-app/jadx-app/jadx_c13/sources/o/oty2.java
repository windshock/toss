package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class oty2<Tag> implements Encoder, vyl {
    private final ArrayList<Tag> IAuthTabCallback = new ArrayList<>();

    protected void IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    protected abstract Tag asInterface(@NotNull SerialDescriptor serialDescriptor, int i);

    @Override // kotlinx.serialization.encoding.Encoder
    public vyl onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public hfycx onNavigationEvent() {
        return tnycx.onNavigationEvent();
    }

    protected void onExtraCallback(Tag tag, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        throw new qn("Non-serializable " + Reflection.getOrCreateKotlinClass(obj.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    protected void IAuthTabCallback(Tag tag) {
        throw new qn("null is not supported");
    }

    protected void onNavigationEvent(Tag tag, int i) {
        onExtraCallback((oty2<Tag>) tag, Integer.valueOf(i));
    }

    protected void onExtraCallbackWithResult(Tag tag, byte b) {
        onExtraCallback((oty2<Tag>) tag, Byte.valueOf(b));
    }

    protected void onExtraCallbackWithResult(Tag tag, short s) {
        onExtraCallback((oty2<Tag>) tag, Short.valueOf(s));
    }

    protected void onExtraCallback(Tag tag, long j) {
        onExtraCallback((oty2<Tag>) tag, Long.valueOf(j));
    }

    protected void onExtraCallbackWithResult(Tag tag, float f) {
        onExtraCallback((oty2<Tag>) tag, Float.valueOf(f));
    }

    protected void onNavigationEvent(Tag tag, double d) {
        onExtraCallback((oty2<Tag>) tag, Double.valueOf(d));
    }

    protected void onExtraCallbackWithResult(Tag tag, boolean z) {
        onExtraCallback((oty2<Tag>) tag, Boolean.valueOf(z));
    }

    protected void IAuthTabCallback(Tag tag, char c) {
        onExtraCallback((oty2<Tag>) tag, Character.valueOf(c));
    }

    protected void onWarmupCompleted(Tag tag, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback((oty2<Tag>) tag, str);
    }

    protected void onExtraCallbackWithResult(Tag tag, @NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallback((oty2<Tag>) tag, Integer.valueOf(i));
    }

    public Encoder onExtraCallbackWithResult(Tag tag, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallback((oty2<Tag>) tag);
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult((oty2<Tag>) IAuthTabCallbackStub(), serialDescriptor);
    }

    private final boolean onExtraCallbackWithResult(SerialDescriptor serialDescriptor, int i) {
        onExtraCallback((oty2<Tag>) asInterface(serialDescriptor, i));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void IAuthTabCallback() {
        onExtraCallbackWithResult();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted() {
        IAuthTabCallback((oty2<Tag>) IAuthTabCallbackStub());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onWarmupCompleted(boolean z) {
        onExtraCallbackWithResult((oty2<Tag>) IAuthTabCallbackStub(), z);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onExtraCallbackWithResult(byte b) {
        onExtraCallbackWithResult((oty2<Tag>) IAuthTabCallbackStub(), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onExtraCallbackWithResult(short s) {
        onExtraCallbackWithResult((oty2<Tag>) IAuthTabCallbackStub(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onWarmupCompleted(int i) {
        onNavigationEvent((oty2<Tag>) IAuthTabCallbackStub(), i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onExtraCallbackWithResult(long j) {
        onExtraCallback((oty2<Tag>) IAuthTabCallbackStub(), j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onExtraCallback(float f) {
        onExtraCallbackWithResult((oty2<Tag>) IAuthTabCallbackStub(), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onNavigationEvent(double d) {
        onNavigationEvent((oty2<Tag>) IAuthTabCallbackStub(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void IAuthTabCallback(char c) {
        IAuthTabCallback((oty2<Tag>) IAuthTabCallbackStub(), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted((oty2<Tag>) IAuthTabCallbackStub(), str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult((oty2<Tag>) IAuthTabCallbackStub(), serialDescriptor, i);
    }

    @Override // o.vyl
    public final void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (!this.IAuthTabCallback.isEmpty()) {
            IAuthTabCallbackStub();
        }
        IAuthTabCallback(serialDescriptor);
    }

    @Override // o.vyl
    public final void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult((oty2<Tag>) asInterface(serialDescriptor, i), z);
    }

    @Override // o.vyl
    public final void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult((oty2<Tag>) asInterface(serialDescriptor, i), b);
    }

    @Override // o.vyl
    public final void onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult((oty2<Tag>) asInterface(serialDescriptor, i), s);
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onNavigationEvent((oty2<Tag>) asInterface(serialDescriptor, i), i2);
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallback((oty2<Tag>) asInterface(serialDescriptor, i), j);
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult((oty2<Tag>) asInterface(serialDescriptor, i), f);
    }

    @Override // o.vyl
    public final void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onNavigationEvent((oty2<Tag>) asInterface(serialDescriptor, i), d);
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        IAuthTabCallback((oty2<Tag>) asInterface(serialDescriptor, i), c);
    }

    @Override // o.vyl
    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted((oty2<Tag>) asInterface(serialDescriptor, i), str);
    }

    @Override // o.vyl
    public final Encoder onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult((oty2<Tag>) asInterface(serialDescriptor, i), serialDescriptor.onNavigationEvent(i));
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

    public final Tag onExtraCallbackWithResult() {
        return (Tag) CollectionsKt___CollectionsKt.last((List) this.IAuthTabCallback);
    }

    public final Tag ct_() {
        return (Tag) CollectionsKt___CollectionsKt.lastOrNull((List) this.IAuthTabCallback);
    }

    public final void onExtraCallback(Tag tag) {
        this.IAuthTabCallback.add(tag);
    }

    protected final Tag IAuthTabCallbackStub() {
        if (!this.IAuthTabCallback.isEmpty()) {
            ArrayList<Tag> arrayList = this.IAuthTabCallback;
            return arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
        }
        throw new qn("No tag in stack for requested element");
    }
}
