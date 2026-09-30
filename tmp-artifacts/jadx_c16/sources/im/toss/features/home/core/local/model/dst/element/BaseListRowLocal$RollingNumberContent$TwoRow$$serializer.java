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
public final /* synthetic */ class BaseListRowLocal$RollingNumberContent$TwoRow$$serializer implements aeu2<BaseListRowLocal.RollingNumberContent.TwoRow> {
    private static int IAuthTabCallback = 1;
    public static final BaseListRowLocal$RollingNumberContent$TwoRow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

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
        BaseListRowLocal$RollingNumberContent$TwoRow$$serializer baseListRowLocal$RollingNumberContent$TwoRow$$serializer = new BaseListRowLocal$RollingNumberContent$TwoRow$$serializer();
        INSTANCE = baseListRowLocal$RollingNumberContent$TwoRow$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.RollingNumberContent.TwoRow", baseListRowLocal$RollingNumberContent$TwoRow$$serializer, 4);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("row2Image", false);
        setanimationsloop.onWarmupCompleted("row2Badge", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$RollingNumberContent$TwoRow$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TextContentLocal$.serializer.INSTANCE, NumericContentLocal$.serializer.INSTANCE, sp.IAuthTabCallback(ImageWithSizeLocal$$serializer.INSTANCE), sp.IAuthTabCallback(BadgeLocal$.serializer.INSTANCE)};
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseListRowLocal.RollingNumberContent.TwoRow deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ImageWithSizeLocal imageWithSizeLocal;
        NumericContentLocal numericContentLocal;
        TextContentLocal textContentLocal;
        BadgeLocal badgeLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ImageWithSizeLocal imageWithSizeLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextContentLocal textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, (Object) null);
            NumericContentLocal numericContentLocal2 = (NumericContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, NumericContentLocal$.serializer.INSTANCE, (Object) null);
            imageWithSizeLocal = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImageWithSizeLocal$$serializer.INSTANCE, (Object) null);
            textContentLocal = textContentLocal2;
            badgeLocal = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BadgeLocal$.serializer.INSTANCE, (Object) null);
            numericContentLocal = numericContentLocal2;
            i = 15;
        } else {
            int i3 = 0;
            boolean z = true;
            NumericContentLocal numericContentLocal3 = null;
            TextContentLocal textContentLocal3 = null;
            BadgeLocal badgeLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i4 = IAuthTabCallback + 19;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (iOnNavigationEvent == 5) {
                            imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal2);
                            i3 |= 4;
                        } else {
                            if (iOnNavigationEvent == 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BadgeLocal$.serializer.INSTANCE, badgeLocal2);
                            i3 |= 8;
                        }
                    } else if (iOnNavigationEvent == 2) {
                        imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal2);
                        i3 |= 4;
                    } else if (iOnNavigationEvent == 3) {
                    }
                } else {
                    numericContentLocal3 = (NumericContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, NumericContentLocal$.serializer.INSTANCE, numericContentLocal3);
                    i3 |= 2;
                    int i5 = IAuthTabCallback + 89;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 4;
                    }
                }
            }
            i = i3;
            imageWithSizeLocal = imageWithSizeLocal2;
            numericContentLocal = numericContentLocal3;
            textContentLocal = textContentLocal3;
            badgeLocal = badgeLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.RollingNumberContent.TwoRow(i, textContentLocal, numericContentLocal, imageWithSizeLocal, badgeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m303deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.RollingNumberContent.TwoRow twoRowDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = IAuthTabCallback + 117;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return twoRowDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.RollingNumberContent.TwoRow twoRow) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(twoRow, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.RollingNumberContent.TwoRow.onWarmupCompleted(twoRow, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(twoRow, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.RollingNumberContent.TwoRow.onWarmupCompleted(twoRow, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.RollingNumberContent.TwoRow) obj);
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
