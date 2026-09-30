package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
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
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Right$Text$$serializer implements aeu2<HomeListRowAttributeLocal.Right.Text> {
    private static int IAuthTabCallback = 1;
    public static final HomeListRowAttributeLocal$Right$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        HomeListRowAttributeLocal$Right$Text$$serializer homeListRowAttributeLocal$Right$Text$$serializer = new HomeListRowAttributeLocal$Right$Text$$serializer();
        INSTANCE = homeListRowAttributeLocal$Right$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Right.Text", homeListRowAttributeLocal$Right$Text$$serializer, 4);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("text1", false);
        setanimationsloop.onWarmupCompleted("text2Space", false);
        setanimationsloop.onWarmupCompleted("text2", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 59;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HomeListRowAttributeLocal$Right$Text$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal.Right.Text.onExtraCallbackWithResult()[0].getValue(), serializerVar, setVideoListener.onWarmupCompleted, sp.IAuthTabCallback(serializerVar)};
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListRowAttributeLocal.Right.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextAttributeLocal textAttributeLocal;
        double d;
        TextAttributeLocal textAttributeLocal2;
        BaseManifest3 baseManifest3;
        int iOnNavigationEvent;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = HomeListRowAttributeLocal.Right.Text.onExtraCallbackWithResult();
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 17;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            BaseManifest3 baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            baseManifest3 = baseManifest32;
            textAttributeLocal2 = textAttributeLocal3;
            d = dIAuthTabCallback;
            i = 15;
        } else {
            boolean z2 = true;
            TextAttributeLocal textAttributeLocal4 = null;
            TextAttributeLocal textAttributeLocal5 = null;
            double dIAuthTabCallback2 = 0.0d;
            i = 0;
            BaseManifest3 baseManifest33 = null;
            while (z2) {
                int i7 = onExtraCallback + 59;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 52 / 0;
                    if (iOnNavigationEvent != -1) {
                        int i9 = onExtraCallbackWithResult;
                        i2 = i9 + 61;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                        if (iOnNavigationEvent != 0) {
                            int i10 = i9 + 5;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 != 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                                textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal5);
                                i |= 2;
                            } else if (iOnNavigationEvent != 2) {
                                int i11 = i9 + 59;
                                onExtraCallback = i11 % 128;
                                if (i11 % 2 != 0) {
                                    i3 = 3;
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal4);
                                    i |= 8;
                                } else {
                                    if (iOnNavigationEvent != 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    i3 = 3;
                                    textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal4);
                                    i |= 8;
                                }
                            } else {
                                dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                                i |= 4;
                            }
                            z = false;
                        } else {
                            z = false;
                            baseManifest33 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), baseManifest33);
                            i |= 1;
                        }
                    } else {
                        z2 = z;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i92 = onExtraCallbackWithResult;
                        i2 = i92 + 61;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                    } else {
                        z2 = z;
                    }
                }
            }
            textAttributeLocal = textAttributeLocal4;
            d = dIAuthTabCallback2;
            textAttributeLocal2 = textAttributeLocal5;
            baseManifest3 = baseManifest33;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Right.Text(i, baseManifest3, textAttributeLocal2, d, textAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m502deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Right.Text textDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return textDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Right.Text text) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Right.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Right.Text) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
