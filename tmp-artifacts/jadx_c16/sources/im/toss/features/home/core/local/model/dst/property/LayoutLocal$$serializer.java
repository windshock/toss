package im.toss.features.home.core.local.model.dst.property;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LayoutLocal$$serializer implements aeu2<LayoutLocal> {
    private static int IAuthTabCallback = 1;
    public static final LayoutLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 48 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        LayoutLocal$$serializer layoutLocal$$serializer = new LayoutLocal$$serializer();
        INSTANCE = layoutLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.property.LayoutLocal", layoutLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        setanimationsloop.onWarmupCompleted("background", false);
        setanimationsloop.onWarmupCompleted("stroke", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 31;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private LayoutLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {PaddingLocal$$serializer.INSTANCE, MarginLocal$$serializer.INSTANCE, BackgroundAttributeLocal$$serializer.INSTANCE, StrokeAttributeLocal$$serializer.INSTANCE};
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        PaddingLocal paddingLocal;
        StrokeAttributeLocal strokeAttributeLocal;
        MarginLocal marginLocal;
        BackgroundAttributeLocal backgroundAttributeLocal;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, PaddingLocal$$serializer.INSTANCE, (Object) null);
            MarginLocal marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, MarginLocal$$serializer.INSTANCE, (Object) null);
            BackgroundAttributeLocal backgroundAttributeLocal2 = (BackgroundAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BackgroundAttributeLocal$$serializer.INSTANCE, (Object) null);
            paddingLocal = paddingLocal2;
            strokeAttributeLocal = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, StrokeAttributeLocal$$serializer.INSTANCE, (Object) null);
            marginLocal = marginLocal2;
            backgroundAttributeLocal = backgroundAttributeLocal2;
            i = 15;
        } else {
            int i6 = 0;
            boolean z = true;
            PaddingLocal paddingLocal3 = null;
            StrokeAttributeLocal strokeAttributeLocal2 = null;
            MarginLocal marginLocal3 = null;
            BackgroundAttributeLocal backgroundAttributeLocal3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onExtraCallback + 121;
                    int i8 = i7 % 128;
                    onExtraCallbackWithResult = i8;
                    int i9 = i7 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i10 = i8 + 57;
                        int i11 = i10 % 128;
                        onExtraCallback = i11;
                        if (i10 % 2 != 0) {
                            if (iOnNavigationEvent != 2) {
                                i2 = i11 + 27;
                                onExtraCallbackWithResult = i2 % 128;
                                if (i2 % 2 != 0) {
                                    if (iOnNavigationEvent != 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    strokeAttributeLocal2 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, StrokeAttributeLocal$$serializer.INSTANCE, strokeAttributeLocal2);
                                    i6 |= 8;
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    strokeAttributeLocal2 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, StrokeAttributeLocal$$serializer.INSTANCE, strokeAttributeLocal2);
                                    i6 |= 8;
                                }
                            } else {
                                backgroundAttributeLocal3 = (BackgroundAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BackgroundAttributeLocal$$serializer.INSTANCE, backgroundAttributeLocal3);
                                i6 |= 4;
                            }
                        } else if (iOnNavigationEvent != 2) {
                            i2 = i11 + 27;
                            onExtraCallbackWithResult = i2 % 128;
                            if (i2 % 2 != 0) {
                            }
                        } else {
                            backgroundAttributeLocal3 = (BackgroundAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BackgroundAttributeLocal$$serializer.INSTANCE, backgroundAttributeLocal3);
                            i6 |= 4;
                        }
                    } else {
                        marginLocal3 = (MarginLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, MarginLocal$$serializer.INSTANCE, marginLocal3);
                        i6 |= 2;
                    }
                } else {
                    paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                    i6 |= 1;
                }
            }
            paddingLocal = paddingLocal3;
            strokeAttributeLocal = strokeAttributeLocal2;
            marginLocal = marginLocal3;
            backgroundAttributeLocal = backgroundAttributeLocal3;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        LayoutLocal layoutLocal = new LayoutLocal(i, paddingLocal, marginLocal, backgroundAttributeLocal, strokeAttributeLocal, (okycx) null);
        int i12 = onExtraCallbackWithResult + 11;
        onExtraCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return layoutLocal;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m460deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LayoutLocal layoutLocalDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return layoutLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LayoutLocal layoutLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(layoutLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LayoutLocal.onExtraCallbackWithResult(layoutLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LayoutLocal) obj);
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
