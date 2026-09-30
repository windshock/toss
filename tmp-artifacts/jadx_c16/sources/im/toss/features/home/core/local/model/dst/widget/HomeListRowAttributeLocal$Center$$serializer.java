package im.toss.features.home.core.local.model.dst.widget;

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
import o.setVideoListener;
import o.setupProxyAndEnsureManifest;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Center$$serializer implements aeu2<HomeListRowAttributeLocal.Center> {
    private static int IAuthTabCallback = 1;
    public static final HomeListRowAttributeLocal$Center$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        HomeListRowAttributeLocal$Center$$serializer homeListRowAttributeLocal$Center$$serializer = new HomeListRowAttributeLocal$Center$$serializer();
        INSTANCE = homeListRowAttributeLocal$Center$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Center", homeListRowAttributeLocal$Center$$serializer, 6);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("text1", false);
        setanimationsloop.onWarmupCompleted("text2Space", false);
        setanimationsloop.onWarmupCompleted("text2", false);
        setanimationsloop.onWarmupCompleted("text3Space", false);
        setanimationsloop.onWarmupCompleted("text3", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 49;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HomeListRowAttributeLocal$Center$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setupProxyAndEnsureManifest setupproxyandensuremanifest = setupProxyAndEnsureManifest.onExtraCallbackWithResult;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal.Center.onWarmupCompleted()[0].getValue(), setupproxyandensuremanifest, setvideolistener, sp.IAuthTabCallback(setupproxyandensuremanifest), setvideolistener, sp.IAuthTabCallback(setupproxyandensuremanifest)};
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c A[PHI: r0 r2 r5
      0x007c: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0040, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0040, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r5v10 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v12 kotlin.Lazy[]) binds: [B:8:0x0040, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[PHI: r0 r2 r5
      0x0042: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0040, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0040, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r5v2 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v12 kotlin.Lazy[]) binds: [B:8:0x0040, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListRowAttributeLocal.Center deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        int i;
        double d;
        HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute;
        HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute2;
        BaseManifest3 baseManifest3;
        HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute3;
        double d2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = 5;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = HomeListRowAttributeLocal.Center.onWarmupCompleted();
            int i5 = 16 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                BaseManifest3 baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
                setupProxyAndEnsureManifest setupproxyandensuremanifest = setupProxyAndEnsureManifest.onExtraCallbackWithResult;
                HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute4 = (HomeListRowAttributeLocal.Center.ContentAttribute) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setupproxyandensuremanifest, (Object) null);
                double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute5 = (HomeListRowAttributeLocal.Center.ContentAttribute) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setupproxyandensuremanifest, (Object) null);
                double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute6 = (HomeListRowAttributeLocal.Center.ContentAttribute) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setupproxyandensuremanifest, (Object) null);
                i = 63;
                d = dIAuthTabCallback2;
                contentAttribute = contentAttribute5;
                contentAttribute2 = contentAttribute6;
                baseManifest3 = baseManifest32;
                contentAttribute3 = contentAttribute4;
                d2 = dIAuthTabCallback;
            } else {
                boolean z = true;
                BaseManifest3 baseManifest33 = null;
                HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute7 = null;
                double dIAuthTabCallback3 = 0.0d;
                double dIAuthTabCallback4 = 0.0d;
                HomeListRowAttributeLocal.Center.ContentAttribute contentAttribute8 = null;
                contentAttribute3 = null;
                int i6 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i4 = 5;
                        case 0:
                            baseManifest33 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), baseManifest33);
                            i6 |= 1;
                            i4 = 5;
                        case 1:
                            contentAttribute3 = (HomeListRowAttributeLocal.Center.ContentAttribute) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setupProxyAndEnsureManifest.onExtraCallbackWithResult, contentAttribute3);
                            i6 |= 2;
                            i4 = 5;
                        case 2:
                            dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                            i6 |= 4;
                            i4 = 5;
                        case 3:
                            contentAttribute8 = (HomeListRowAttributeLocal.Center.ContentAttribute) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setupProxyAndEnsureManifest.onExtraCallbackWithResult, contentAttribute8);
                            i6 |= 8;
                            i4 = 5;
                        case 4:
                            dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                            i6 |= 16;
                            int i7 = IAuthTabCallback + 21;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            i4 = 5;
                        case 5:
                            contentAttribute7 = (HomeListRowAttributeLocal.Center.ContentAttribute) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setupProxyAndEnsureManifest.onExtraCallbackWithResult, contentAttribute7);
                            i6 |= 32;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                i = i6;
                contentAttribute = contentAttribute8;
                baseManifest3 = baseManifest33;
                contentAttribute2 = contentAttribute7;
                d2 = dIAuthTabCallback3;
                d = dIAuthTabCallback4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = HomeListRowAttributeLocal.Center.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Center(i, baseManifest3, contentAttribute3, d2, contentAttribute, d, contentAttribute2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m491deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Center centerDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return centerDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Center center) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(center, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Center.IAuthTabCallback(center, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Center) obj);
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
