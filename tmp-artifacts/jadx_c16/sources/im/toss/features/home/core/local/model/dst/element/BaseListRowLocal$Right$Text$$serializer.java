package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Right$Text$$serializer implements aeu2<BaseListRowLocal.Right.Text> {
    private static int IAuthTabCallback = 0;
    public static final BaseListRowLocal$Right$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        BaseListRowLocal$Right$Text$$serializer baseListRowLocal$Right$Text$$serializer = new BaseListRowLocal$Right$Text$$serializer();
        INSTANCE = baseListRowLocal$Right$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Right.Text", baseListRowLocal$Right$Text$$serializer, 7);
        setanimationsloop.onWarmupCompleted("variant", false);
        setanimationsloop.onWarmupCompleted("topRowText", false);
        setanimationsloop.onWarmupCompleted("topRowTextAlt", false);
        setanimationsloop.onWarmupCompleted("logTopRowTextAlt", false);
        setanimationsloop.onWarmupCompleted("bottomRowText", false);
        setanimationsloop.onWarmupCompleted("bottomRowTextAlt", false);
        setanimationsloop.onWarmupCompleted("logBottomRowTextAlt", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 7;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseListRowLocal$Right$Text$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {BaseListRowLocal.Right.Text.onWarmupCompleted()[0].getValue(), getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080 A[PHI: r0 r2 r5
      0x0080: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r5v10 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v12 kotlin.Lazy[]) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r0 r2 r5
      0x0043: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r5v2 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v12 kotlin.Lazy[]) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseListRowLocal.Right.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        BaseListRowLocal.Right.Text.IAuthTabCallback iAuthTabCallback;
        String str6;
        char c;
        int i2;
        char c2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 75;
        onExtraCallback = i5 % 128;
        int i6 = 5;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = BaseListRowLocal.Right.Text.onWarmupCompleted();
            int i7 = 6 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                BaseListRowLocal.Right.Text.IAuthTabCallback iAuthTabCallback2 = (BaseListRowLocal.Right.Text.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
                String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
                String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
                String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
                String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
                i = 127;
                str = str11;
                str2 = str9;
                str3 = str8;
                str4 = strAsInterface;
                str5 = str10;
                iAuthTabCallback = iAuthTabCallback2;
                str6 = str7;
            } else {
                boolean z = true;
                String str12 = null;
                str = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String strAsInterface2 = null;
                BaseListRowLocal.Right.Text.IAuthTabCallback iAuthTabCallback3 = null;
                int i8 = 0;
                while (z) {
                    int i9 = onWarmupCompleted + 97;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % i3;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (i10 != 0) {
                        int i11 = 44 / 0;
                        switch (iOnNavigationEvent) {
                            case -1:
                                i2 = 1;
                                iAuthTabCallback3 = iAuthTabCallback3;
                                z = false;
                                i3 = 2;
                                i6 = 5;
                                break;
                            case 0:
                                i2 = 1;
                                iAuthTabCallback3 = (BaseListRowLocal.Right.Text.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), iAuthTabCallback3);
                                i8 |= 1;
                                i3 = 2;
                                i6 = 5;
                                break;
                            case 1:
                                i2 = 1;
                                c = 3;
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                                i8 |= 2;
                                i6 = 5;
                                break;
                            case 2:
                                c2 = 3;
                                str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str15);
                                i8 |= 4;
                                i6 = 5;
                                break;
                            case 3:
                                c2 = 3;
                                str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str14);
                                i8 |= 8;
                                int i12 = onWarmupCompleted + 121;
                                onExtraCallback = i12 % 128;
                                int i13 = i12 % i3;
                                i6 = 5;
                                break;
                            case 4:
                                str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str12);
                                i8 |= 16;
                                break;
                            case 5:
                                str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str13);
                                i8 |= 32;
                                break;
                            case 6:
                                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str);
                                i8 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iOnNavigationEvent);
                        }
                    } else {
                        switch (iOnNavigationEvent) {
                            case -1:
                                i2 = 1;
                                iAuthTabCallback3 = iAuthTabCallback3;
                                z = false;
                                i3 = 2;
                                i6 = 5;
                                break;
                            case 0:
                                i2 = 1;
                                iAuthTabCallback3 = (BaseListRowLocal.Right.Text.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), iAuthTabCallback3);
                                i8 |= 1;
                                i3 = 2;
                                i6 = 5;
                                break;
                            case 1:
                                c = 3;
                                i2 = 1;
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                                i8 |= 2;
                                i6 = 5;
                                break;
                            case 2:
                                c2 = 3;
                                str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str15);
                                i8 |= 4;
                                i6 = 5;
                                break;
                            case 3:
                                c2 = 3;
                                str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str14);
                                i8 |= 8;
                                int i122 = onWarmupCompleted + 121;
                                onExtraCallback = i122 % 128;
                                int i132 = i122 % i3;
                                i6 = 5;
                                break;
                            case 4:
                                str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str12);
                                i8 |= 16;
                                break;
                            case 5:
                                str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str13);
                                i8 |= 32;
                                break;
                            case 6:
                                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str);
                                i8 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iOnNavigationEvent);
                        }
                    }
                }
                iAuthTabCallback = iAuthTabCallback3;
                i = i8;
                str2 = str12;
                str5 = str13;
                str3 = str14;
                str6 = str15;
                str4 = strAsInterface2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = BaseListRowLocal.Right.Text.onWarmupCompleted();
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Right.Text(i, iAuthTabCallback, str4, str6, str3, str2, str5, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m301deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        BaseListRowLocal.Right.Text textDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return textDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Right.Text text) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BaseListRowLocal.Right.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Right.Text) obj);
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        int i3 = 2 / 0;
        return super.typeParametersSerializers();
    }
}
