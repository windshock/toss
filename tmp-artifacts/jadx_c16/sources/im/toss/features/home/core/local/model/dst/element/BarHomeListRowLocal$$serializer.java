package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BarHomeListRowLocal$$serializer implements aeu2<BarHomeListRowLocal> {
    private static int IAuthTabCallback = 0;
    public static final BarHomeListRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BarHomeListRowLocal$$serializer barHomeListRowLocal$$serializer = new BarHomeListRowLocal$$serializer();
        INSTANCE = barHomeListRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BarHomeListRowLocal", barHomeListRowLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("isTop", false);
        setanimationsloop.onWarmupCompleted("isBottom", false);
        setanimationsloop.onWarmupCompleted("barImage", false);
        setanimationsloop.onWarmupCompleted("homeListRow", false);
        setanimationsloop.onWarmupCompleted("barImageAlignment", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 7;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private BarHomeListRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            return new KSerializer[]{getbgcolor, getbgcolor, kSerializerIAuthTabCallback, HomeListRowAttributeLocal$$serializer.INSTANCE, kSerializerIAuthTabCallback2};
        }
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        getBgColor getbgcolor2 = getBgColor.IAuthTabCallback;
        kSerializerArr[1] = getbgcolor2;
        kSerializerArr[1] = getbgcolor2;
        kSerializerArr[4] = kSerializerIAuthTabCallback3;
        kSerializerArr[3] = HomeListRowAttributeLocal$$serializer.INSTANCE;
        kSerializerArr[5] = kSerializerIAuthTabCallback4;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BarHomeListRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        HomeListRowAttributeLocal homeListRowAttributeLocal;
        String str;
        int i;
        ImageSourceLocal imageSourceLocal;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z2 = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, (Object) null);
            z = zOnExtraCallbackWithResult2;
            homeListRowAttributeLocal = (HomeListRowAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeListRowAttributeLocal$$serializer.INSTANCE, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, (Object) null);
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult3;
            i = 31;
        } else {
            boolean z3 = true;
            boolean zOnExtraCallbackWithResult4 = false;
            zOnExtraCallbackWithResult = false;
            int i4 = 0;
            ImageSourceLocal imageSourceLocal2 = null;
            HomeListRowAttributeLocal homeListRowAttributeLocal2 = null;
            String str2 = null;
            while (z3) {
                int i5 = onNavigationEvent + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallback;
                    int i8 = i7 + 87;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                            i4 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                            i4 |= 4;
                        } else if (iOnNavigationEvent != 3) {
                            int i9 = i7 + 43;
                            onNavigationEvent = i9 % 128;
                            if (i9 % 2 != 0) {
                                i2 = 4;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str2);
                                i4 |= 16;
                                int i10 = onExtraCallback + 75;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                            } else {
                                if (iOnNavigationEvent != 5) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                i2 = 4;
                                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str2);
                                i4 |= 16;
                                int i102 = onExtraCallback + 75;
                                onNavigationEvent = i102 % 128;
                                int i112 = i102 % 2;
                            }
                        } else {
                            homeListRowAttributeLocal2 = (HomeListRowAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeListRowAttributeLocal$$serializer.INSTANCE, homeListRowAttributeLocal2);
                            i4 |= 8;
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i4 |= 1;
                    }
                } else {
                    z3 = z2;
                }
            }
            homeListRowAttributeLocal = homeListRowAttributeLocal2;
            str = str2;
            i = i4;
            imageSourceLocal = imageSourceLocal2;
            z = zOnExtraCallbackWithResult4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BarHomeListRowLocal(i, z, zOnExtraCallbackWithResult, imageSourceLocal, homeListRowAttributeLocal, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m287deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BarHomeListRowLocal barHomeListRowLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return barHomeListRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BarHomeListRowLocal barHomeListRowLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(barHomeListRowLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BarHomeListRowLocal.onExtraCallbackWithResult(barHomeListRowLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BarHomeListRowLocal) obj);
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
