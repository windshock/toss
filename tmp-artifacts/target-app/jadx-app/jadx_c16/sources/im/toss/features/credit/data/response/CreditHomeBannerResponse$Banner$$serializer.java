package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.credit.data.response.CreditHomeBannerResponse;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
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
public final /* synthetic */ class CreditHomeBannerResponse$Banner$$serializer implements aeu2<CreditHomeBannerResponse.Banner> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final CreditHomeBannerResponse$Banner$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = (i2 * 3) + 4;
        byte[] bArr = $$a;
        int i5 = 115 - (i * 3);
        int i6 = s * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            int i10 = i7;
            i5 = (-i5) + i10;
            i4 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i11 = bArr[i4];
            int i12 = i4;
            i10 = i5;
            i5 = i11;
            i8 = i12;
            i5 = (-i5) + i10;
            i4 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onExtraCallbackWithResult();
        CreditHomeBannerResponse$Banner$$serializer creditHomeBannerResponse$Banner$$serializer = new CreditHomeBannerResponse$Banner$$serializer();
        INSTANCE = creditHomeBannerResponse$Banner$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHomeBannerResponse.Banner", creditHomeBannerResponse$Banner$$serializer, 8);
        Object[] objArr = new Object[1];
        a((short) Color.alpha(0), (byte) (80 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1682594163) - TextUtils.lastIndexOf("", '0'), 515059006 + ((byte) KeyEvent.getModifierMetaStateMask()), (-65) - Color.blue(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-53) - TextUtils.getOffsetAfter("", 0)), (-1682594157) - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 515059023, Color.argb(0, 0, 0, 0) - 66, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("iconFormat", true);
        setanimationsloop.onWarmupCompleted("logType", true);
        setanimationsloop.onWarmupCompleted("isBannerUpperPosition", true);
        setanimationsloop.onWarmupCompleted("iconTintColor", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private CreditHomeBannerResponse$Banner$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) CreditHomeBannerResponse.Banner.onExtraCallbackWithResult(new Object[0], GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 516762979, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -516762979);
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CreditHomeBannerResponse$Banner$Button$$serializer.INSTANCE);
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback((KSerializer) lazyArr[4].getValue()), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(kSerializer)};
        int i4 = asBinder + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHomeBannerResponse.Banner deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        Boolean bool;
        String str2;
        String str3;
        CreditHomeBannerResponse.Banner.Button button;
        CreditHomeBannerResponse.Banner.IconFormat iconFormat;
        String str4;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) CreditHomeBannerResponse.Banner.onExtraCallbackWithResult(new Object[0], GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 516762979, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -516762979);
        int i3 = 7;
        int i4 = 6;
        String strAsInterface2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String strAsInterface3 = null;
            str2 = null;
            bool = null;
            str = null;
            strAsInterface = null;
            CreditHomeBannerResponse.Banner.Button button2 = null;
            int i5 = 0;
            CreditHomeBannerResponse.Banner.IconFormat iconFormat2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        i5 |= 1;
                        button2 = (CreditHomeBannerResponse.Banner.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditHomeBannerResponse$Banner$Button$$serializer.INSTANCE, button2);
                        i3 = 7;
                        i4 = 6;
                        continue;
                    case 1:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        i5 |= 8;
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        break;
                    case 4:
                        iconFormat2 = (CreditHomeBannerResponse.Banner.IconFormat) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArr[4].getValue(), iconFormat2);
                        i5 |= 16;
                        break;
                    case 5:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str);
                        i5 |= 32;
                        break;
                    case 6:
                        bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getBgColor.IAuthTabCallback, bool);
                        i5 |= 64;
                        int i6 = asBinder + 59;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                        break;
                    case 7:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 128;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 7;
            }
            int i8 = asBinder + 107;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            iconFormat = iconFormat2;
            str4 = strAsInterface3;
            i = i5;
            button = button2;
            str3 = strAsInterface2;
        } else {
            int i10 = onTransact + 37;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            CreditHomeBannerResponse.Banner.Button button3 = (CreditHomeBannerResponse.Banner.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditHomeBannerResponse$Banner$Button$$serializer.INSTANCE, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            CreditHomeBannerResponse.Banner.IconFormat iconFormat3 = (CreditHomeBannerResponse.Banner.IconFormat) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArr[4].getValue(), (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            str3 = strAsInterface4;
            button = button3;
            iconFormat = iconFormat3;
            str4 = strAsInterface5;
            i = 255;
        }
        Boolean bool2 = bool;
        String str5 = str;
        String str6 = strAsInterface;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHomeBannerResponse.Banner(i, button, str6, str3, str4, iconFormat, str5, bool2, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m152deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHomeBannerResponse.Banner banner) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(banner, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditHomeBannerResponse.Banner.onNavigationEvent(banner, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHomeBannerResponse.Banner) obj);
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0228 A[PHI: r0
      0x0228: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:54:0x0226, B:51:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022a A[PHI: r0
      0x022a: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:54:0x0226, B:51:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        byte b2;
        long j;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 43424), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 22439 - TextUtils.getOffsetBefore("", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 117;
                int i8 = i7 % 128;
                $11 = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 101;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            float f = 0.0f;
            if (z) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = $11 + 85;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 3 / 4;
                    }
                    int i14 = 0;
                    while (i14 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char defaultSize = (char) (View.getDefaultSize(0, 0) + 12843);
                                int i15 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 55;
                                int i16 = 2168 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1));
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, i15, i16, -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i14] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i14++;
                            j2 = 0;
                            f = 0.0f;
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
                if (bArr != null) {
                    int i17 = $10 + 65;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 42, 22439 - View.MeasureSpec.makeMeasureSpec(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] / (-4629411779493505016L));
                        j = IAuthTabCallback - (-4629411779493505016L);
                    } else {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getSize(0)), TextUtils.getCapsMode("", 0, 0) + 42, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L));
                        j = IAuthTabCallback ^ (-4629411779493505016L);
                    }
                    iIntValue = (byte) (b2 + ((int) j));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i18 = $11 + 35;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    i4 = ((i >>> iIntValue) << 2) << ((int) (onExtraCallbackWithResult | (-4629411779493505016L)));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 86, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onWarmupCompleted;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr6[i19] = (byte) (bArr5[i19] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr7 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
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

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -1072856710;
        IAuthTabCallback = -1538795441;
        onNavigationEvent = 1158351661;
        onWarmupCompleted = new byte[]{-90, -94, 89, -90, 74, 58, 59, -56, 54, 8, 8};
    }
}
