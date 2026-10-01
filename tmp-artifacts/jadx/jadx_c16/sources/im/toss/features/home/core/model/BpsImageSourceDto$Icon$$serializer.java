package im.toss.features.home.core.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.model.BpsImageSourceDto;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
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
public final /* synthetic */ class BpsImageSourceDto$Icon$$serializer implements aeu2<BpsImageSourceDto.Icon> {
    private static int IAuthTabCallback;
    public static final BpsImageSourceDto$Icon$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {23, 124, -70, -17};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = (b * 4) + 4;
        int i3 = s2 * 3;
        int i4 = 115 - (s * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = i3;
            i = 0;
            i2++;
            i4 = i5 + i6;
            int i7 = i2;
            int i8 = i4;
            bArr2[i] = (byte) i8;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i++;
            i6 = bArr[i7];
            i2 = i7;
            i5 = i8;
            i2++;
            i4 = i5 + i6;
            int i72 = i2;
            int i82 = i4;
            bArr2[i] = (byte) i82;
            if (i == i3) {
            }
        } else {
            i = 0;
            int i722 = i2;
            int i822 = i4;
            bArr2[i] = (byte) i822;
            if (i == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 63;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asInterface = 1;
        onWarmupCompleted();
        BpsImageSourceDto$Icon$$serializer bpsImageSourceDto$Icon$$serializer = new BpsImageSourceDto$Icon$$serializer();
        INSTANCE = bpsImageSourceDto$Icon$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.model.BpsImageSourceDto.Icon", bpsImageSourceDto$Icon$$serializer, 3);
        Object[] objArr = new Object[1];
        a((short) KeyEvent.getDeadChar(0, 0), (byte) Color.red(0), 1974806316 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) - 548660206, (-85) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("darkUri", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 25;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private BpsImageSourceDto$Icon$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(BpsBackgroundColorDto$$serializer.INSTANCE)};
        int i4 = asBinder + 57;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BpsImageSourceDto.Icon deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BpsBackgroundColorDto bpsBackgroundColorDto;
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            bpsBackgroundColorDto = (BpsBackgroundColorDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BpsBackgroundColorDto$$serializer.INSTANCE, (Object) null);
            str = str4;
            str2 = str3;
            i = 7;
        } else {
            int i3 = IAuthTabCallbackDefault + 89;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            BpsBackgroundColorDto bpsBackgroundColorDto2 = null;
            String str5 = null;
            String str6 = null;
            while (!(!z)) {
                int i6 = IAuthTabCallbackDefault + 57;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent != 1) {
                        int i7 = IAuthTabCallbackDefault;
                        int i8 = i7 + 15;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i7 + 91;
                        asBinder = i10 % 128;
                        if (i10 % 2 == 0) {
                            bpsBackgroundColorDto2 = (BpsBackgroundColorDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BpsBackgroundColorDto$$serializer.INSTANCE, bpsBackgroundColorDto2);
                        } else {
                            bpsBackgroundColorDto2 = (BpsBackgroundColorDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BpsBackgroundColorDto$$serializer.INSTANCE, bpsBackgroundColorDto2);
                            i5 |= 4;
                        }
                    } else {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                    }
                    i5 |= 2;
                } else {
                    str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                    i5 |= 1;
                    int i11 = IAuthTabCallbackDefault + 41;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            bpsBackgroundColorDto = bpsBackgroundColorDto2;
            str = str5;
            str2 = str6;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BpsImageSourceDto.Icon(i, str2, str, bpsBackgroundColorDto, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m513deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BpsImageSourceDto.Icon iconDeserialize = deserialize(decoder);
        int i4 = asBinder + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iconDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BpsImageSourceDto.Icon icon) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(icon, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BpsImageSourceDto.Icon.onExtraCallbackWithResult(icon, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BpsImageSourceDto.Icon) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asBinder + 47;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[PHI: r4
      0x0091: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v21 byte[]) binds: [B:18:0x008f, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        byte b2;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ((Process.getThreadPriority(0) + 20) >> 6)), 42 - ExpandableListView.getPackedPositionGroup(0L), 22439 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 25;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i8 = $10 + 113;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    bArr = onExtraCallbackWithResult;
                    int i9 = 48 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetAfter("", 0)), 55 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2166, -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 41 - TextUtils.lastIndexOf("", '0'), (Process.myTid() >> 22) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), Color.alpha(0) + 86, AndroidCharacter.getMirror('0') + 9519, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int i11 = $10 + 89;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    int i14 = $10 + 5;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $11 + 117;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i18 = $11;
                    int i19 = i18 + 35;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    if (z) {
                        int i21 = i18 + 15;
                        $10 = i21 % 128;
                        if (i21 % 2 != 0) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            int i22 = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i22;
                            b2 = bArr6[i22];
                        } else {
                            byte[] bArr7 = onExtraCallbackWithResult;
                            int i23 = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i23 - 1;
                            b2 = bArr7[i23];
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (b2 ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallback = 772604124;
        IAuthTabCallback = -1538795440;
        onWarmupCompleted = -2064368533;
        onExtraCallbackWithResult = new byte[]{-1, -11, 8};
    }
}
