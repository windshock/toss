package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import o.setOnShakeViewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setOnShakeViewListener<Tag> implements Decoder, yw {
    private final ArrayList<Tag> IAuthTabCallback = new ArrayList<>();
    private boolean onWarmupCompleted;

    protected abstract Tag access000(@NotNull SerialDescriptor serialDescriptor, int i);

    protected boolean asInterface(Tag tag) {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void onExtraCallback() {
        return null;
    }

    public void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public yw onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder, o.yw
    public hfycx IAuthTabCallback() {
        return tnycx.onNavigationEvent();
    }

    protected Object IAuthTabCallback_Parcel(Tag tag) {
        throw new qn(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    protected boolean onNavigationEvent(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Boolean) objIAuthTabCallback_Parcel).booleanValue();
    }

    protected byte IAuthTabCallback(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Byte) objIAuthTabCallback_Parcel).byteValue();
    }

    protected short IAuthTabCallbackDefault(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Short) objIAuthTabCallback_Parcel).shortValue();
    }

    protected int IAuthTabCallbackStub(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Integer) objIAuthTabCallback_Parcel).intValue();
    }

    protected long onTransact(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Long) objIAuthTabCallback_Parcel).longValue();
    }

    protected float onExtraCallbackWithResult(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Float) objIAuthTabCallback_Parcel).floatValue();
    }

    protected double onExtraCallback(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Double) objIAuthTabCallback_Parcel).doubleValue();
    }

    protected char onWarmupCompleted(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Character) objIAuthTabCallback_Parcel).charValue();
    }

    protected String asBinder(Tag tag) {
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return (String) objIAuthTabCallback_Parcel;
    }

    protected int IAuthTabCallback(Tag tag, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Object objIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(tag);
        Intrinsics.checkNotNull(objIAuthTabCallback_Parcel, "");
        return ((Integer) objIAuthTabCallback_Parcel).intValue();
    }

    public Decoder onExtraCallbackWithResult(Tag tag, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        IAuthTabCallbackStubProxy(tag);
        return this;
    }

    protected <T> T onExtraCallbackWithResult(@NotNull jp<? extends T> jpVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (T) onWarmupCompleted((jp) jpVar);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult((setOnShakeViewListener<Tag>) ICustomTabsCallback(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean onNavigationEvent() {
        Tag interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            return false;
        }
        return asInterface(interfaceDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean onExtraCallbackWithResult() {
        return onNavigationEvent((setOnShakeViewListener<Tag>) ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte IAuthTabCallbackStub() {
        return IAuthTabCallback((setOnShakeViewListener<Tag>) ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short IAuthTabCallbackStubProxy() {
        return IAuthTabCallbackDefault(ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int asInterface() {
        return IAuthTabCallbackStub(ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long access100() {
        return onTransact(ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float asBinder() {
        return onExtraCallbackWithResult((setOnShakeViewListener<Tag>) ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double IAuthTabCallbackDefault() {
        return onExtraCallback((setOnShakeViewListener<Tag>) ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char onTransact() {
        return onWarmupCompleted((setOnShakeViewListener<Tag>) ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String IAuthTabCallback_Parcel() {
        return asBinder((setOnShakeViewListener<Tag>) ICustomTabsCallback());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallback((setOnShakeViewListener<Tag>) ICustomTabsCallback(), serialDescriptor);
    }

    @Override // o.yw
    public final boolean onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onNavigationEvent((setOnShakeViewListener<Tag>) access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final byte onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallback((setOnShakeViewListener<Tag>) access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final short IAuthTabCallbackStub(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallbackDefault(access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final int onTransact(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return IAuthTabCallbackStub(access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final long IAuthTabCallbackDefault(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onTransact(access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final float onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult((setOnShakeViewListener<Tag>) access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final double IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallback((setOnShakeViewListener<Tag>) access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final char onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onWarmupCompleted((setOnShakeViewListener<Tag>) access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final String asInterface(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return asBinder((setOnShakeViewListener<Tag>) access000(serialDescriptor, i));
    }

    @Override // o.yw
    public final Decoder asBinder(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallbackWithResult((setOnShakeViewListener<Tag>) access000(serialDescriptor, i), serialDescriptor.onNavigationEvent(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallback(setOnShakeViewListener setonshakeviewlistener, jp jpVar, Object obj) {
        return setonshakeviewlistener.onExtraCallbackWithResult((jp<? extends jp>) jpVar, (jp) obj);
    }

    @Override // o.yw
    public final <T> T onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull final jp<? extends T> jpVar, @Nullable final T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (T) onExtraCallback((setOnShakeViewListener<Tag>) access000(serialDescriptor, i), new Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setOnShakeViewListener.onExtraCallback(this.f$0, jpVar, t);
            }
        });
    }

    @Override // o.yw
    public final <T> T onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull final jp<? extends T> jpVar, @Nullable final T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (T) onExtraCallback((setOnShakeViewListener<Tag>) access000(serialDescriptor, i), new Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setOnShakeViewListener.IAuthTabCallback(this.f$0, jpVar, t);
            }
        });
    }

    private final <E> E onExtraCallback(Tag tag, Function0<? extends E> function0) {
        IAuthTabCallbackStubProxy(tag);
        E eInvoke = function0.invoke();
        if (!this.onWarmupCompleted) {
            ICustomTabsCallback();
        }
        this.onWarmupCompleted = false;
        return eInvoke;
    }

    public final ArrayList<Tag> cs_() {
        return this.IAuthTabCallback;
    }

    public final Tag getInterfaceDescriptor() {
        return (Tag) CollectionsKt___CollectionsKt.lastOrNull((List) this.IAuthTabCallback);
    }

    public final void IAuthTabCallbackStubProxy(Tag tag) {
        this.IAuthTabCallback.add(tag);
    }

    protected final Tag ICustomTabsCallback() {
        ArrayList<Tag> arrayList = this.IAuthTabCallback;
        Tag tagRemove = arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
        this.onWarmupCompleted = true;
        return tagRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IAuthTabCallback(setOnShakeViewListener setonshakeviewlistener, jp jpVar, Object obj) {
        return (jpVar.getDescriptor().asInterface() || setonshakeviewlistener.onNavigationEvent()) ? setonshakeviewlistener.onExtraCallbackWithResult((jp<? extends jp>) jpVar, (jp) obj) : setonshakeviewlistener.onExtraCallback();
    }
}
