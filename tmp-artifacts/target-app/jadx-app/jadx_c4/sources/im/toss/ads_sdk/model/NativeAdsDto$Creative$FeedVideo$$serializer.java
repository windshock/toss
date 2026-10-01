package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
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
public final /* synthetic */ class NativeAdsDto$Creative$FeedVideo$$serializer implements aeu2<NativeAdsDto.Creative.FeedVideo> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final NativeAdsDto$Creative$FeedVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE};
    private static final int $$b = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 4;
        int i4 = s + 109;
        int i5 = (i * 2) + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            i2 = 0;
            i5++;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i5];
            i5++;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int defaultSize = 43 - View.getDefaultSize(0, 0);
                    int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1450;
                    byte b = $$a[0];
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, defaultSize, i6, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cNormalizeMetaState = (char) (49123 - KeyEvent.normalizeMetaState(0));
                    int iIndexOf = 44 - TextUtils.indexOf("", "");
                    int iBlue = 1494 - Color.blue(0);
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, iIndexOf, iBlue, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (Process.myPid() >> 22)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (-16777187) - Color.rgb(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 125;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        onNavigationEvent = 0;
        onExtraCallbackWithResult();
        NativeAdsDto$Creative$FeedVideo$$serializer nativeAdsDto$Creative$FeedVideo$$serializer = new NativeAdsDto$Creative$FeedVideo$$serializer();
        INSTANCE = nativeAdsDto$Creative$FeedVideo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("styleId", nativeAdsDto$Creative$FeedVideo$$serializer, 11);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("brandName", true);
        setanimationsloop.onWarmupCompleted("brandLogoUrl", true);
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54094), 392179845 - ImageFormat.getBitsPerPixel(0), new char[]{24706, 48775, 45068, 7628, 8842}, new char[]{0, 0, 0, 0}, new char[]{34381, 24624, 19991, 28627}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("videoUrl", true);
        setanimationsloop.onWarmupCompleted("thumbnailImageUrl", true);
        setanimationsloop.onWarmupCompleted("ctaText", true);
        setanimationsloop.onWarmupCompleted("ctaTextColor", true);
        setanimationsloop.onWarmupCompleted("ctaBackgroundColor", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 91;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsDto$Creative$FeedVideo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer};
        int i4 = asInterface + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.FeedVideo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String strAsInterface;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 10;
        int i4 = 0;
        String str11 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i5 = asInterface + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, (Object) null);
            str = strAsInterface4;
            str3 = strAsInterface2;
            str4 = strAsInterface3;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            str2 = str12;
            str5 = strAsInterface9;
            str6 = strAsInterface8;
            str7 = strAsInterface5;
            str8 = strAsInterface10;
            str9 = strAsInterface7;
            str10 = strAsInterface6;
            i = 2047;
        } else {
            boolean z = true;
            String strAsInterface11 = null;
            String str13 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            String strAsInterface18 = null;
            String strAsInterface19 = null;
            while (!(!z)) {
                int i7 = asInterface + 117;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        String strAsInterface20 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                        int i8 = asInterface + 89;
                        onTransact = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 5 / 2;
                        }
                        str13 = strAsInterface20;
                        i3 = 10;
                    case 1:
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 |= 2;
                    case 2:
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i4 |= 4;
                    case 3:
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        strAsInterface19 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i4 |= 32;
                    case 6:
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i4 |= 64;
                    case 7:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i4 |= 128;
                    case 8:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        i4 |= 256;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str11);
                        i4 |= 512;
                    case 10:
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                        i4 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface11;
            i = i4;
            str2 = str11;
            str3 = str13;
            str4 = strAsInterface12;
            strAsInterface = strAsInterface13;
            str5 = strAsInterface14;
            str6 = strAsInterface15;
            str7 = strAsInterface16;
            str8 = strAsInterface17;
            str9 = strAsInterface18;
            str10 = strAsInterface19;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.FeedVideo(i, str3, str4, str, str7, str10, str9, str6, str5, str8, str2, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m21deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.FeedVideo feedVideoDeserialize = deserialize(decoder);
        int i4 = onTransact + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return feedVideoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.FeedVideo feedVideo) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(feedVideo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NativeAdsDto.Creative.FeedVideo.onNavigationEvent(feedVideo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(feedVideo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        NativeAdsDto.Creative.FeedVideo.onNavigationEvent(feedVideo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onTransact + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.FeedVideo) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 7798559133331975163L;
        IAuthTabCallback = -1037087892;
        onExtraCallbackWithResult = (char) 27643;
    }
}
