package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SectionWrapperResponse$$serializer implements aeu2<SectionWrapperResponse> {
    private static int IAuthTabCallback = 1;
    public static final SectionWrapperResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        SectionWrapperResponse$$serializer sectionWrapperResponse$$serializer = new SectionWrapperResponse$$serializer();
        INSTANCE = sectionWrapperResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.SectionWrapperResponse", sectionWrapperResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("sections", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private SectionWrapperResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = SectionWrapperResponse.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[0].getValue()), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[2].getValue())};
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SectionWrapperResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ColorAttributeResponse colorAttributeResponse;
        Map map;
        List list;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = SectionWrapperResponse.onExtraCallbackWithResult();
        ColorAttributeResponse colorAttributeResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            ColorAttributeResponse colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            i = 7;
            list = list2;
            colorAttributeResponse = colorAttributeResponse3;
        } else {
            boolean z = true;
            Map map2 = null;
            List list3 = null;
            int i3 = 0;
            while (z) {
                int i4 = onExtraCallback + 83;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i5 = 92 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list3);
                        i3 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse2);
                        i3 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i6 = IAuthTabCallback + 15;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), map2);
                        i3 |= 4;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            i = i3;
            colorAttributeResponse = colorAttributeResponse2;
            map = map2;
            list = list3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SectionWrapperResponse(i, list, colorAttributeResponse, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m546deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SectionWrapperResponse sectionWrapperResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return sectionWrapperResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SectionWrapperResponse sectionWrapperResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sectionWrapperResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SectionWrapperResponse.onExtraCallback(sectionWrapperResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sectionWrapperResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SectionWrapperResponse.onExtraCallback(sectionWrapperResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SectionWrapperResponse) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
