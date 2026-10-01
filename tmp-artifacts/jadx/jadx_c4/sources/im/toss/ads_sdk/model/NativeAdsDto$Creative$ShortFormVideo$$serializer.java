package im.toss.ads_sdk.model;

import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Creative$ShortFormVideo$$serializer implements aeu2<NativeAdsDto.Creative.ShortFormVideo> {
    public static final int $stable;
    private static char IAuthTabCallback;
    public static final NativeAdsDto$Creative$ShortFormVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = 4 - (b * 2);
        byte[] bArr = $$a;
        int i4 = i * 4;
        int i5 = 110 - s;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i3;
            int i9 = 0;
            int i10 = (-i3) + i7;
            int i11 = i8 + 1;
            i2 = i9;
            i5 = i10;
            i3 = i11;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i8 = i3;
            i3 = bArr[i3];
            i9 = i2 + 1;
            i7 = i12;
            int i102 = (-i3) + i7;
            int i112 = i8 + 1;
            i2 = i9;
            i5 = i102;
            i3 = i112;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 83;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 121;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 61;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 43 - View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49123), TextUtils.lastIndexOf("", '0', 0, 0) + 45, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24020 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, ((byte) KeyEvent.getModifierMetaStateMask()) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 45848), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), AndroidCharacter.getMirror('0') + 12529, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onExtraCallbackWithResult = 1;
        onExtraCallback();
        NativeAdsDto$Creative$ShortFormVideo$$serializer nativeAdsDto$Creative$ShortFormVideo$$serializer = new NativeAdsDto$Creative$ShortFormVideo$$serializer();
        INSTANCE = nativeAdsDto$Creative$ShortFormVideo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("styleId", nativeAdsDto$Creative$ShortFormVideo$$serializer, 10);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("brandName", true);
        setanimationsloop.onWarmupCompleted("brandLogoUrl", true);
        setanimationsloop.onWarmupCompleted("thumbnailImageUrl", true);
        setanimationsloop.onWarmupCompleted("videoUrl", true);
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getTouchSlop() >> 8) + 19582), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1003009011, new char[]{4217, 16096, 19360, 33195, 62070}, new char[]{0, 0, 0, 0}, new char[]{62209, 51379, 32315, 41548}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("ctaText", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("adClearanceText", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 1;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsDto$Creative$ShortFormVideo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = asInterface + 81;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.ShortFormVideo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int iOnNavigationEvent;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 9;
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            str9 = strAsInterface4;
            str6 = strAsInterface2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, (Object) null);
            str7 = strAsInterface9;
            str8 = strAsInterface8;
            str3 = strAsInterface7;
            str5 = strAsInterface5;
            str4 = strAsInterface10;
            str2 = strAsInterface6;
            str10 = strAsInterface3;
            i = 1023;
        } else {
            boolean z = true;
            int i6 = 0;
            String str11 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            String strAsInterface18 = null;
            while (z) {
                int i7 = asInterface + 119;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 90 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i5 = 9;
                            break;
                        case 0:
                            strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            i5 = 9;
                            break;
                        case 1:
                            i3 = 1;
                            strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                            i6 |= 2;
                            i5 = 9;
                            break;
                        case 2:
                            strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                            break;
                        case 3:
                            i2 = 3;
                            strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i6 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                            break;
                        case 5:
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i6 |= 32;
                            break;
                        case 6:
                            strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                            i6 |= 64;
                            break;
                        case 7:
                            strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                            i6 |= 128;
                            break;
                        case 8:
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                            i6 |= 256;
                            break;
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                            str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str11);
                            i6 |= 512;
                            int i9 = asInterface + 17;
                            asBinder = i9 % 128;
                            int i10 = i9 % 2;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i5 = 9;
                            break;
                        case 0:
                            strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            i5 = 9;
                            break;
                        case 1:
                            i3 = 1;
                            strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                            i6 |= 2;
                            i5 = 9;
                            break;
                        case 2:
                            strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                            break;
                        case 3:
                            i2 = 3;
                            strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i6 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                            break;
                        case 5:
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i6 |= 32;
                            break;
                        case 6:
                            strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                            i6 |= 64;
                            break;
                        case 7:
                            strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                            i6 |= 128;
                            break;
                        case 8:
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                            i6 |= 256;
                            break;
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                            str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str11);
                            i6 |= 512;
                            int i92 = asInterface + 17;
                            asBinder = i92 % 128;
                            int i102 = i92 % 2;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            int i11 = asInterface + 19;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            i = i6;
            str = str11;
            str2 = strAsInterface;
            str3 = strAsInterface11;
            str4 = strAsInterface12;
            str5 = strAsInterface13;
            str6 = strAsInterface14;
            str7 = strAsInterface15;
            str8 = strAsInterface16;
            str9 = strAsInterface17;
            str10 = strAsInterface18;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.ShortFormVideo(i, str6, str10, str9, str5, str2, str3, str8, str7, str4, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m28deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.ShortFormVideo shortFormVideoDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return shortFormVideoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(shortFormVideo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Creative.ShortFormVideo.onExtraCallbackWithResult(shortFormVideo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.ShortFormVideo) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        IAuthTabCallback = (char) 22326;
    }
}
