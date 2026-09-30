package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ImageSourceLocal$Icon$$serializer implements aeu2<ImageSourceLocal.Icon> {
    private static char[] IAuthTabCallback;
    public static final ImageSourceLocal$Icon$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3 = b * 3;
        int i4 = 4 - (i * 2);
        byte[] bArr = $$a;
        int i5 = 97 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            i5 = i6;
            int i7 = i4;
            i2 = 0;
            i4++;
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i2++;
            i4++;
            i5 += -i7;
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
        int i2 = asBinder;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 1;
        onNavigationEvent();
        ImageSourceLocal$Icon$$serializer imageSourceLocal$Icon$$serializer = new ImageSourceLocal$Icon$$serializer();
        INSTANCE = imageSourceLocal$Icon$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal.Icon", imageSourceLocal$Icon$$serializer, 8);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, 3 - Color.blue(0), (char) ((-1) - MotionEvent.axisFromString("")), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("darkUri", false);
        setanimationsloop.onWarmupCompleted("opacity", true);
        setanimationsloop.onWarmupCompleted("imageAlt", false);
        setanimationsloop.onWarmupCompleted("tintColor", false);
        Object[] objArr2 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 3, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (char) KeyEvent.getDeadChar(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 111;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ImageSourceLocal$Icon$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, setvideolistener, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializer, setvideolistener, setvideolistener};
        int i4 = asBinder + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ImageSourceLocal.Icon deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        String str2;
        String str3;
        double dIAuthTabCallback;
        double d;
        String str4;
        String str5;
        double d2;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z2 = true;
        int i4 = 7;
        int i5 = 6;
        String strAsInterface = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i6 = onExtraCallback + 93;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
            str2 = str7;
            str5 = strAsInterface2;
            str4 = str6;
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
            str3 = strAsInterface3;
            str = str8;
            d = dIAuthTabCallback3;
            i = 255;
            d2 = dIAuthTabCallback2;
        } else {
            double dIAuthTabCallback4 = 0.0d;
            boolean z3 = true;
            int i8 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String strAsInterface4 = null;
            double dIAuthTabCallback5 = 0.0d;
            double dIAuthTabCallback6 = 0.0d;
            while (z3 == z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i9 = asBinder + 3;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        str11 = str11;
                        z2 = true;
                        i4 = 7;
                        i5 = 6;
                        z3 = false;
                    case 0:
                        z = true;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        z2 = z;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        z = true;
                        i8 |= 2;
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str11);
                        z2 = z;
                        i4 = 7;
                        i5 = 6;
                    case 2:
                        dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i8 |= 4;
                        z2 = true;
                        i4 = 7;
                    case 3:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str10);
                        i8 |= 8;
                        i2 = asBinder + 109;
                        onExtraCallback = i2 % 128;
                        int i11 = i2 % 2;
                        z2 = true;
                        i4 = 7;
                    case 4:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str9);
                        i8 |= 16;
                        z2 = true;
                        i4 = 7;
                    case 5:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i8 |= 32;
                        z2 = true;
                        i4 = 7;
                    case 6:
                        dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i5);
                        i8 |= 64;
                        z2 = true;
                        i4 = 7;
                    case 7:
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i4);
                        i8 |= 128;
                        i2 = onExtraCallback + 57;
                        asBinder = i2 % 128;
                        int i112 = i2 % 2;
                        z2 = true;
                        i4 = 7;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str9;
            i = i8;
            str2 = str10;
            str3 = strAsInterface;
            dIAuthTabCallback = dIAuthTabCallback4;
            d = dIAuthTabCallback5;
            str4 = str11;
            str5 = strAsInterface4;
            d2 = dIAuthTabCallback6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ImageSourceLocal.Icon(i, str5, str4, d2, str2, str, str3, d, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m506deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImageSourceLocal.Icon iconDeserialize = deserialize(decoder);
        int i4 = asBinder + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iconDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ImageSourceLocal.Icon icon) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(icon, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ImageSourceLocal.Icon.onWarmupCompleted(icon, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ImageSourceLocal.Icon) obj);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = onExtraCallback + 83;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i6 = $10 + 9;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i3 = 49123;
            i4 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59697), (Process.myPid() >> 22) + 17, 10972 - TextUtils.lastIndexOf("", '0', 0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myTid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, 20220 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 103;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (i3 - Color.green(0)), 44 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = 49123;
            i4 = -1401950695;
        }
        String str = new String(cArr);
        int i11 = $10 + 27;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{60833, 10008, 30913, 60858, 9995, 30917, 36235};
        onWarmupCompleted = 4442205512186275690L;
    }
}
