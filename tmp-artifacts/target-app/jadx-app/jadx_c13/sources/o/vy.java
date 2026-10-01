package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class vy implements Decoder, yw {
    @Override // kotlinx.serialization.encoding.Decoder
    public Void onExtraCallback() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this;
    }

    public void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean onNavigationEvent() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public yw onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this;
    }

    public Object cu_() {
        throw new qn(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean onExtraCallbackWithResult() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Boolean) objCu_).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte IAuthTabCallbackStub() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Byte) objCu_).byteValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short IAuthTabCallbackStubProxy() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Short) objCu_).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int asInterface() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Integer) objCu_).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long access100() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Long) objCu_).longValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float asBinder() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Float) objCu_).floatValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double IAuthTabCallbackDefault() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Double) objCu_).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char onTransact() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Character) objCu_).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String IAuthTabCallback_Parcel() {
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return (String) objCu_;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Object objCu_ = cu_();
        Intrinsics.checkNotNull(objCu_, "");
        return ((Integer) objCu_).intValue();
    }

    public <T> T IAuthTabCallback(@NotNull jp<? extends T> jpVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (T) onWarmupCompleted(jpVar);
    }

    @Override // o.yw
    public final boolean onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult();
    }

    @Override // o.yw
    public final byte onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallbackStub();
    }

    @Override // o.yw
    public final short IAuthTabCallbackStub(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallbackStubProxy();
    }

    @Override // o.yw
    public final int onTransact(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return asInterface();
    }

    @Override // o.yw
    public final long IAuthTabCallbackDefault(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return access100();
    }

    @Override // o.yw
    public final float onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return asBinder();
    }

    @Override // o.yw
    public final double IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallbackDefault();
    }

    @Override // o.yw
    public final char onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onTransact();
    }

    @Override // o.yw
    public final String asInterface(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallback_Parcel();
    }

    @Override // o.yw
    public Decoder asBinder(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallback(serialDescriptor.onNavigationEvent(i));
    }

    public <T> T onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull jp<? extends T> jpVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (T) IAuthTabCallback((jp<? extends jp<? extends T>>) jpVar, (jp<? extends T>) t);
    }

    @Override // o.yw
    public final <T> T onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull jp<? extends T> jpVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (jpVar.getDescriptor().asInterface() || onNavigationEvent()) ? (T) IAuthTabCallback((jp<? extends jp<? extends T>>) jpVar, (jp<? extends T>) t) : (T) onExtraCallback();
    }
}
