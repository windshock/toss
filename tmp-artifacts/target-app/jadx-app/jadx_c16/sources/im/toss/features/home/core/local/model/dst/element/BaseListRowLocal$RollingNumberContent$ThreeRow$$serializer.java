package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.widget.BadgeLocal;
import im.toss.features.home.core.local.model.dst.widget.BadgeLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.NumericContentLocal;
import im.toss.features.home.core.local.model.dst.widget.NumericContentLocal$;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$RollingNumberContent$ThreeRow$$serializer implements aeu2<BaseListRowLocal.RollingNumberContent.ThreeRow> {
    private static int IAuthTabCallback = 1;
    public static final BaseListRowLocal$RollingNumberContent$ThreeRow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BaseListRowLocal$RollingNumberContent$ThreeRow$$serializer baseListRowLocal$RollingNumberContent$ThreeRow$$serializer = new BaseListRowLocal$RollingNumberContent$ThreeRow$$serializer();
        INSTANCE = baseListRowLocal$RollingNumberContent$ThreeRow$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.RollingNumberContent.ThreeRow", baseListRowLocal$RollingNumberContent$ThreeRow$$serializer, 5);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("row3", false);
        setanimationsloop.onWarmupCompleted("row3Image", false);
        setanimationsloop.onWarmupCompleted("row3Badge", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 15;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseListRowLocal$RollingNumberContent$ThreeRow$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImageWithSizeLocal$$serializer.INSTANCE);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(BadgeLocal$.serializer.INSTANCE);
            kSerializerArr = new KSerializer[2];
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            kSerializerArr[0] = serializerVar;
            kSerializerArr[1] = NumericContentLocal$.serializer.INSTANCE;
            kSerializerArr[3] = serializerVar;
            kSerializerArr[4] = kSerializerIAuthTabCallback;
            kSerializerArr[3] = kSerializerIAuthTabCallback2;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(ImageWithSizeLocal$$serializer.INSTANCE);
            KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(BadgeLocal$.serializer.INSTANCE);
            TextContentLocal$.serializer serializerVar2 = TextContentLocal$.serializer.INSTANCE;
            kSerializerArr = new KSerializer[]{serializerVar2, NumericContentLocal$.serializer.INSTANCE, serializerVar2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4};
        }
        int i3 = IAuthTabCallback + 15;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.RollingNumberContent.ThreeRow deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        BadgeLocal badgeLocal;
        TextContentLocal textContentLocal;
        ImageWithSizeLocal imageWithSizeLocal;
        NumericContentLocal numericContentLocal;
        TextContentLocal textContentLocal2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        TextContentLocal textContentLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            NumericContentLocal numericContentLocal2 = (NumericContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, NumericContentLocal$.serializer.INSTANCE, (Object) null);
            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            i = 31;
            imageWithSizeLocal = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageWithSizeLocal$$serializer.INSTANCE, (Object) null);
            badgeLocal = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BadgeLocal$.serializer.INSTANCE, (Object) null);
            textContentLocal2 = textContentLocal4;
            numericContentLocal = numericContentLocal2;
        } else {
            int i5 = 0;
            boolean z2 = true;
            BadgeLocal badgeLocal2 = null;
            ImageWithSizeLocal imageWithSizeLocal2 = null;
            NumericContentLocal numericContentLocal3 = null;
            TextContentLocal textContentLocal5 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = IAuthTabCallback + 81;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 1) {
                        numericContentLocal3 = (NumericContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, NumericContentLocal$.serializer.INSTANCE, numericContentLocal3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i5 |= 4;
                    } else if (iOnNavigationEvent == 3) {
                        imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal2);
                        i5 |= 8;
                        int i7 = IAuthTabCallback + 45;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BadgeLocal$.serializer.INSTANCE, badgeLocal2);
                        i5 |= 16;
                    }
                    z = false;
                } else {
                    textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal5);
                    i5 |= 1;
                    z = false;
                }
            }
            i = i5;
            badgeLocal = badgeLocal2;
            textContentLocal = textContentLocal3;
            imageWithSizeLocal = imageWithSizeLocal2;
            numericContentLocal = numericContentLocal3;
            textContentLocal2 = textContentLocal5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.RollingNumberContent.ThreeRow(i, textContentLocal2, numericContentLocal, textContentLocal, imageWithSizeLocal, badgeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m302deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.RollingNumberContent.ThreeRow threeRowDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return threeRowDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.RollingNumberContent.ThreeRow threeRow) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(threeRow, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BaseListRowLocal.RollingNumberContent.ThreeRow.IAuthTabCallback(threeRow, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.RollingNumberContent.ThreeRow) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
