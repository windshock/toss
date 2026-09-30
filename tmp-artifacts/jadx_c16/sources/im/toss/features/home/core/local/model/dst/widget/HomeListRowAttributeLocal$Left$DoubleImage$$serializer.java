package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.property.SizeLocal;
import im.toss.features.home.core.local.model.dst.property.SizeLocal$;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BaseManifest3;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.startPage;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Left$DoubleImage$$serializer implements aeu2<HomeListRowAttributeLocal.Left.DoubleImage> {
    private static int IAuthTabCallback = 1;
    public static final HomeListRowAttributeLocal$Left$DoubleImage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return serialDescriptor;
    }

    static {
        HomeListRowAttributeLocal$Left$DoubleImage$$serializer homeListRowAttributeLocal$Left$DoubleImage$$serializer = new HomeListRowAttributeLocal$Left$DoubleImage$$serializer();
        INSTANCE = homeListRowAttributeLocal$Left$DoubleImage$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Left.DoubleImage", homeListRowAttributeLocal$Left$DoubleImage$$serializer, 4);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("size", false);
        setanimationsloop.onWarmupCompleted("firstImage", false);
        setanimationsloop.onWarmupCompleted("secondImage", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 99;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeListRowAttributeLocal$Left$DoubleImage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ?? r6 = new KSerializer[4];
            r6[1] = HomeListRowAttributeLocal.Left.DoubleImage.onWarmupCompleted()[0].getValue();
            r6[0] = SizeLocal$.serializer.INSTANCE;
            startPage startpage = startPage.onWarmupCompleted;
            r6[3] = startpage;
            r6[4] = startpage;
            kSerializerArr = r6;
        } else {
            startPage startpage2 = startPage.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{HomeListRowAttributeLocal.Left.DoubleImage.onWarmupCompleted()[0].getValue(), SizeLocal$.serializer.INSTANCE, startpage2, startpage2};
        }
        int i3 = IAuthTabCallback + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowAttributeLocal.Left.DoubleImage deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ImageAttributeLocal imageAttributeLocal;
        BaseManifest3 baseManifest3;
        ImageAttributeLocal imageAttributeLocal2;
        SizeLocal sizeLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = HomeListRowAttributeLocal.Left.DoubleImage.onWarmupCompleted();
        int i3 = 0;
        ImageAttributeLocal imageAttributeLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            BaseManifest3 baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            SizeLocal sizeLocal2 = (SizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, SizeLocal$.serializer.INSTANCE, (Object) null);
            startPage startpage = startPage.onWarmupCompleted;
            imageAttributeLocal = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, startpage, (Object) null);
            baseManifest3 = baseManifest32;
            sizeLocal = sizeLocal2;
            imageAttributeLocal2 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, startpage, (Object) null);
            i = 15;
        } else {
            int i6 = 1;
            int i7 = 0;
            BaseManifest3 baseManifest33 = null;
            ImageAttributeLocal imageAttributeLocal4 = null;
            SizeLocal sizeLocal3 = null;
            while (i6 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i6 = i3;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent != 1) {
                        int i8 = onNavigationEvent;
                        int i9 = i8 + 15;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent == 2) {
                            imageAttributeLocal3 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, startPage.onWarmupCompleted, imageAttributeLocal3);
                            i7 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i8 + 51;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            Object objOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, startPage.onWarmupCompleted, imageAttributeLocal4);
                            if (i12 == 0) {
                                imageAttributeLocal4 = (ImageAttributeLocal) objOnNavigationEvent;
                                i7 |= 36;
                            } else {
                                imageAttributeLocal4 = (ImageAttributeLocal) objOnNavigationEvent;
                                i7 |= 8;
                            }
                        }
                    } else {
                        sizeLocal3 = (SizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, SizeLocal$.serializer.INSTANCE, sizeLocal3);
                        i7 |= 2;
                    }
                    i3 = 0;
                } else {
                    baseManifest33 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, (jp) lazyArrOnWarmupCompleted[i3].getValue(), baseManifest33);
                    i7 |= 1;
                    int i13 = onNavigationEvent + 97;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            i = i7;
            imageAttributeLocal = imageAttributeLocal3;
            baseManifest3 = baseManifest33;
            imageAttributeLocal2 = imageAttributeLocal4;
            sizeLocal = sizeLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Left.DoubleImage(i, baseManifest3, sizeLocal, imageAttributeLocal, imageAttributeLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m494deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Left.DoubleImage doubleImageDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return doubleImageDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Left.DoubleImage doubleImage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(doubleImage, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Left.DoubleImage.onExtraCallback(doubleImage, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Left.DoubleImage) obj);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
