package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ContentsHorizontalLocal$Content$Line$$serializer implements aeu2<ContentsHorizontalLocal.Content.Line> {
    private static int IAuthTabCallback = 0;
    public static final ContentsHorizontalLocal$Content$Line$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        ContentsHorizontalLocal$Content$Line$$serializer contentsHorizontalLocal$Content$Line$$serializer = new ContentsHorizontalLocal$Content$Line$$serializer();
        INSTANCE = contentsHorizontalLocal$Content$Line$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal.Content.Line", contentsHorizontalLocal$Content$Line$$serializer, 4);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("color", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 51;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    private ContentsHorizontalLocal$Content$Line$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[5] = dj3.onWarmupCompleted;
            kSerializerArr[4] = MarginLocal$$serializer.INSTANCE;
        } else {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(kSerializer), kSerializer, dj3.onWarmupCompleted, MarginLocal$$serializer.INSTANCE};
        }
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ContentsHorizontalLocal.Content.Line deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        String str;
        String str2;
        MarginLocal marginLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        onExtraCallback = i3 % 128;
        String strAsInterface = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
            str2 = str3;
            marginLocal = (MarginLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, MarginLocal$$serializer.INSTANCE, (Object) null);
            i = 15;
            str = strAsInterface2;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            String str4 = null;
            MarginLocal marginLocal2 = null;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str4);
                    i6 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i6 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                    i6 |= 4;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = onExtraCallback + 85;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, MarginLocal$$serializer.INSTANCE, marginLocal2);
                    i6 |= 8;
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            str = strAsInterface;
            str2 = str4;
            marginLocal = marginLocal2;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ContentsHorizontalLocal.Content.Line(i, str2, str, fOnWarmupCompleted, marginLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m327deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ContentsHorizontalLocal.Content.Line lineDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        int i5 = onExtraCallback + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return lineDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ContentsHorizontalLocal.Content.Line line) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(line, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ContentsHorizontalLocal.Content.Line.onWarmupCompleted(line, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ContentsHorizontalLocal.Content.Line) obj);
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
