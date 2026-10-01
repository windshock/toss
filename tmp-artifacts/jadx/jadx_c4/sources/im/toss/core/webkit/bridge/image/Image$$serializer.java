package im.toss.core.webkit.bridge.image;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Image$$serializer implements aeu2<Image> {
    private static int IAuthTabCallback = 0;
    public static final Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return serialDescriptor;
    }

    static {
        Image$$serializer image$$serializer = new Image$$serializer();
        INSTANCE = image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.webkit.bridge.image.Image", image$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("dataUri", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        setanimationsloop.onWarmupCompleted("fileSize", false);
        setanimationsloop.onWarmupCompleted("creationDate", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    private Image$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getdynamicheight, getdynamicheight, kSerializer, kSerializerIAuthTabCallback};
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        long jIAuthTabCallbackDefault;
        Long l;
        int i;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = null;
            boolean z = true;
            jIAuthTabCallbackDefault = 0;
            iOnTransact2 = 0;
            iOnTransact = 0;
            i = 0;
            l = null;
            while (!(!z)) {
                int i3 = onWarmupCompleted + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        i |= 1;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        break;
                    case 1:
                        i |= 2;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        break;
                    case 2:
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                        i |= 4;
                        int i5 = onWarmupCompleted + 119;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        break;
                    case 3:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, oty1.onExtraCallback, l);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface2;
            str2 = strAsInterface;
        } else {
            int i7 = onWarmupCompleted + 61;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, oty1.onExtraCallback, (Object) null);
            i = 63;
            str = strAsInterface3;
            str2 = strAsInterface4;
        }
        Long l2 = l;
        long j = jIAuthTabCallbackDefault;
        int i9 = iOnTransact2;
        int i10 = iOnTransact;
        int i11 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Image(i11, str, str2, i10, i9, j, l2, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m100deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Image imageDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return imageDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Image image) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(image, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Image.IAuthTabCallback(image, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Image.IAuthTabCallback(image, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Image) obj);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
