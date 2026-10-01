package im.toss.appsintoss.login.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GameCenterProfile$$serializer implements aeu2<GameCenterProfile> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final GameCenterProfile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        GameCenterProfile$$serializer gameCenterProfile$$serializer = new GameCenterProfile$$serializer();
        INSTANCE = gameCenterProfile$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.login.model.GameCenterProfile", gameCenterProfile$$serializer, 4);
        setanimationsloop.onWarmupCompleted("statusCode", false);
        setanimationsloop.onWarmupCompleted("nickname", false);
        setanimationsloop.onWarmupCompleted("profileImageUri", false);
        setanimationsloop.onWarmupCompleted("gameSessionId", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 39;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private GameCenterProfile$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = new KSerializer[5];
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[4] = kSerializerIAuthTabCallback2;
            kSerializerArr[5] = kSerializerIAuthTabCallback3;
        } else {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        }
        int i3 = onExtraCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056 A[PHI: r0 r2
      0x0056: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r0 r2
      0x0037: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GameCenterProfile deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        int i;
        String str;
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 5 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
                String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
                i = 15;
                str = str6;
                str2 = str4;
                str3 = str5;
            } else {
                boolean z = true;
                int i5 = 0;
                String str7 = null;
                String strAsInterface2 = null;
                str = null;
                String str8 = null;
                while (z) {
                    int i6 = onExtraCallback + 23;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i7 = onExtraCallbackWithResult;
                        int i8 = i7 + 109;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent == 0) {
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i5 |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            int i10 = i7 + 95;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 4) {
                                str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                                i5 |= 4;
                                int i11 = onExtraCallbackWithResult + 43;
                                onExtraCallback = i11 % 128;
                                int i12 = i11 % 2;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                                i5 |= 8;
                            }
                        } else {
                            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                            i5 |= 2;
                        }
                    } else {
                        z = false;
                    }
                }
                str3 = str7;
                strAsInterface = strAsInterface2;
                str2 = str8;
                i = i5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GameCenterProfile(i, strAsInterface, str2, str3, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m50deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GameCenterProfile gameCenterProfileDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return gameCenterProfileDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GameCenterProfile gameCenterProfile) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(gameCenterProfile, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GameCenterProfile.onExtraCallback(gameCenterProfile, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GameCenterProfile) obj);
        int i4 = onExtraCallbackWithResult + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
