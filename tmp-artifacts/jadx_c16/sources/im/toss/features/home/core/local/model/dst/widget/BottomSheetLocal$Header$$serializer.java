package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.widget.BottomSheetLocal;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetLocal$Header$$serializer implements aeu2<BottomSheetLocal.Header> {
    private static long IAuthTabCallback;
    public static final BottomSheetLocal$Header$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = (b2 * 3) + 1;
        byte[] bArr = $$a;
        int i5 = (i * 4) + 97;
        int i6 = (b * 2) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            i3 = 0;
            i5 = (-i5) + i8;
            i6 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i6];
            int i9 = i6;
            i8 = i5;
            i5 = b3;
            i7 = i9;
            i5 = (-i5) + i8;
            i6 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult = 1;
        onNavigationEvent();
        BottomSheetLocal$Header$$serializer bottomSheetLocal$Header$$serializer = new BottomSheetLocal$Header$$serializer();
        INSTANCE = bottomSheetLocal$Header$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.BottomSheetLocal.Header", bottomSheetLocal$Header$$serializer, 6);
        Object[] objArr = new Object[1];
        a(KeyEvent.getMaxKeyCode() >> 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4, (char) ((-1) - MotionEvent.axisFromString("")), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("logTitleAlt", false);
        Object[] objArr2 = new Object[1];
        a((-16777211) - Color.rgb(0, 0, 0), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 11354), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("descriptionAlt", false);
        setanimationsloop.onWarmupCompleted("logDescriptionAlt", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 7;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    private BottomSheetLocal$Header$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onNavigationEvent + 103;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BottomSheetLocal.Header deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 5;
        String str7 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 85;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str5 = str9;
            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str2 = str10;
            str6 = str11;
            str3 = str8;
            i = 63;
        } else {
            boolean z = true;
            int i6 = 0;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            while (z) {
                int i7 = asBinder + 51;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i8 != 0) {
                    int i9 = 24 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i3 = 5;
                            break;
                        case 0:
                            c = 3;
                            str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str16);
                            i6 |= 1;
                            i3 = 5;
                            break;
                        case 1:
                            c = 3;
                            str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str15);
                            i6 |= 2;
                            int i10 = onNavigationEvent + 99;
                            asBinder = i10 % 128;
                            int i11 = i10 % 2;
                            i3 = 5;
                            break;
                        case 2:
                            c2 = 3;
                            str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str14);
                            i6 |= 4;
                            break;
                        case 3:
                            c2 = 3;
                            str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str7);
                            i6 |= 8;
                            break;
                        case 4:
                            str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str13);
                            i6 |= 16;
                            break;
                        case 5:
                            str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str12);
                            i6 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            break;
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i6;
            str = str16;
            String str17 = str13;
            str2 = str7;
            str3 = str15;
            str4 = str12;
            str5 = str14;
            str6 = str17;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BottomSheetLocal.Header(i, str, str3, str5, str2, str6, str4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m475deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetLocal.Header headerDeserialize = deserialize(decoder);
        int i4 = asBinder + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return headerDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BottomSheetLocal.Header header) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(header, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BottomSheetLocal.Header.onNavigationEvent(header, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(header, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BottomSheetLocal.Header.onNavigationEvent(header, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 44 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BottomSheetLocal.Header) obj);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = onNavigationEvent + 31;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bd  */
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
        int i6 = $11 + 29;
        while (true) {
            $10 = i6 % 128;
            int i7 = i6 % 2;
            i3 = -1401950695;
            i4 = 4;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i10])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 59697), View.resolveSize(0, 0) + 17, 10972 - TextUtils.lastIndexOf("", '0', 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i10), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46134), ImageFormat.getBitsPerPixel(0) + 32, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) "", '0'));
                    int bitsPerPixel = 43 - ImageFormat.getBitsPerPixel(0);
                    int capsMode = 1494 - TextUtils.getCapsMode("", 0, 0);
                    byte b = (byte) ($$b - 4);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, bitsPerPixel, capsMode, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i6 = $11 + 73;
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
        int i11 = $11 + 25;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i13 = $11 + 81;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 49123);
                int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                int iMyTid = (Process.myTid() >> 22) + 1494;
                byte b3 = (byte) ($$b - i4);
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, packedPositionGroup, iMyTid, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
            i4 = 4;
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{60832, 15319, 16756, 28294, 46105, 49642, 6017, 27945, 17107, 38996, 61941, 51074, 7452, 29367, 18523, 41412};
        IAuthTabCallback = -1328860284579464258L;
    }
}
