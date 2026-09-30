package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import java.util.List;
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
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Left$Image$Corner$Bezier$$serializer implements aeu2<BaseListRowLocal.Left.Image.Corner.Bezier> {
    private static int IAuthTabCallback = 0;
    public static final BaseListRowLocal$Left$Image$Corner$Bezier$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BaseListRowLocal$Left$Image$Corner$Bezier$$serializer baseListRowLocal$Left$Image$Corner$Bezier$$serializer = new BaseListRowLocal$Left$Image$Corner$Bezier$$serializer();
        INSTANCE = baseListRowLocal$Left$Image$Corner$Bezier$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Left.Image.Corner.Bezier", baseListRowLocal$Left$Image$Corner$Bezier$$serializer, 2);
        setanimationsloop.onWarmupCompleted("radius", false);
        setanimationsloop.onWarmupCompleted("corners", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Left$Image$Corner$Bezier$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {setVideoListener.onWarmupCompleted, BaseListRowLocal.Left.Image.Corner.Bezier.onWarmupCompleted()[1].getValue()};
        int i4 = IAuthTabCallback + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseListRowLocal.Left.Image.Corner.Bezier deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        double dIAuthTabCallback;
        int i;
        List list;
        Lazy lazy;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = BaseListRowLocal.Left.Image.Corner.Bezier.onWarmupCompleted();
        List list2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 117;
            IAuthTabCallback = i5 % 128;
            i = 3;
            if (i5 % 2 != 0) {
                dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                lazy = lazyArrOnWarmupCompleted[0];
            } else {
                dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                lazy = lazyArrOnWarmupCompleted[1];
            }
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazy.getValue(), (Object) null);
        } else {
            boolean z = true;
            dIAuthTabCallback = 0.0d;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallback + 11;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 51 / 0;
                        if (iOnNavigationEvent == 0) {
                            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                            i |= 1;
                        } else {
                            if (iOnNavigationEvent == 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list2);
                            i |= 2;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                    }
                } else {
                    int i8 = onWarmupCompleted + 99;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
            }
            list = list2;
        }
        int i10 = i;
        double d = dIAuthTabCallback;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        BaseListRowLocal.Left.Image.Corner.Bezier bezier = new BaseListRowLocal.Left.Image.Corner.Bezier(i10, d, list, (okycx) null);
        int i11 = onWarmupCompleted + 17;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 1 / 0;
        }
        return bezier;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m293deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.Left.Image.Corner.Bezier bezierDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bezierDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Left.Image.Corner.Bezier bezier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bezier, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Left.Image.Corner.Bezier.IAuthTabCallback(bezier, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bezier, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Left.Image.Corner.Bezier.IAuthTabCallback(bezier, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Left.Image.Corner.Bezier) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
