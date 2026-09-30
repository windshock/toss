package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditChangeDetectionBannerResponse$$serializer implements aeu2<CreditChangeDetectionBannerResponse> {
    private static int IAuthTabCallback;
    public static final CreditChangeDetectionBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = b + 4;
        int i4 = i * 3;
        byte[] bArr = $$a;
        int i5 = 97 - (s * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            int i10 = (-i3) + i8;
            i2 = i9;
            int i11 = i7;
            i5 = i10;
            i3 = i11;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i3 + 1;
            int i13 = i5;
            i7 = i12;
            i3 = bArr[i12];
            i9 = i2 + 1;
            i8 = i13;
            int i102 = (-i3) + i8;
            i2 = i9;
            int i112 = i7;
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
        int i2 = asInterface + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 1;
        IAuthTabCallback();
        CreditChangeDetectionBannerResponse$$serializer creditChangeDetectionBannerResponse$$serializer = new CreditChangeDetectionBannerResponse$$serializer();
        INSTANCE = creditChangeDetectionBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditChangeDetectionBannerResponse", creditChangeDetectionBannerResponse$$serializer, 3);
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 5, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("linkUrl", false);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 82 / 0;
        }
    }

    private CreditChangeDetectionBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[4];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[3] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onWarmupCompleted + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditChangeDetectionBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            i = 7;
        } else {
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i4 = asInterface + 67;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = asInterface + 51;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (iOnNavigationEvent != 5) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i3 |= 4;
                    }
                } else {
                    strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i3 |= 2;
                }
            }
            strAsInterface = strAsInterface4;
            strAsInterface2 = strAsInterface5;
            strAsInterface3 = strAsInterface6;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditChangeDetectionBannerResponse creditChangeDetectionBannerResponse = new CreditChangeDetectionBannerResponse(i, strAsInterface, strAsInterface2, strAsInterface3, (okycx) null);
        int i7 = onWarmupCompleted + 115;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return creditChangeDetectionBannerResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m138deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CreditChangeDetectionBannerResponse creditChangeDetectionBannerResponseDeserialize = deserialize(decoder);
        int i4 = asInterface + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return creditChangeDetectionBannerResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditChangeDetectionBannerResponse creditChangeDetectionBannerResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditChangeDetectionBannerResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditChangeDetectionBannerResponse.onWarmupCompleted(creditChangeDetectionBannerResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditChangeDetectionBannerResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditChangeDetectionBannerResponse.onWarmupCompleted(creditChangeDetectionBannerResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 16 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditChangeDetectionBannerResponse) obj);
        int i4 = asInterface + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 119;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            c2 = '0';
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = $11 + 85;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 20172, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 49124), 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1494 - KeyEvent.getDeadChar(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $11 + 95;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.green(0)), 43 - TextUtils.indexOf("", c2, 0), 1493 - TextUtils.indexOf("", c2, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            c2 = '0';
        }
        String str = new String(cArr);
        int i11 = $11 + 45;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{60832, 18947, 41692, 6786, 29513};
        onNavigationEvent = -9092225970582238614L;
    }
}
