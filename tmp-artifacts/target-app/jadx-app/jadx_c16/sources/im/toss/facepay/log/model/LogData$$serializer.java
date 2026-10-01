package im.toss.facepay.log.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.log.model.LogData;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.encryptType4;
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
public final /* synthetic */ class LogData$$serializer implements aeu2<LogData> {
    private static long IAuthTabCallback;
    public static final LogData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int[] onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {46, -95, 11, -87};
    private static final int $$b = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        int i4 = 97 - (b * 4);
        int i5 = 1 - (i * 2);
        int i6 = (s * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            int i8 = 0;
            i4 += -i6;
            i6 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i6;
            i6 = bArr[i6];
            i8 = i3;
            i4 += -i6;
            i6 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    private LogData$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 27;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 123;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 1;
        onExtraCallback();
        LogData$$serializer logData$$serializer = new LogData$$serializer();
        INSTANCE = logData$$serializer;
        Object[] objArr = new Object[1];
        a(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 33, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), logData$$serializer, 7);
        Object[] objArr2 = new Object[1];
        a(33 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getCapsMode("", 0, 0) + 6, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        b(new int[]{1489240606, 2092124618, 1435009367, 998915678, 1332419980, 1293638530}, ':' - AndroidCharacter.getMirror('0'), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(40 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (24454 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 50, 10 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22041), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        b(new int[]{2099008267, -87189739, -740597245, -296927436, -1068078142, 1623277170}, (-16777205) - Color.rgb(0, 0, 0), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), false);
        Object[] objArr7 = new Object[1];
        b(new int[]{2099008267, -87189739, -740597245, -296927436, 468660386, -259034330}, 11 - (ViewConfiguration.getEdgeSlop() >> 16), objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        b(new int[]{2099008267, -87189739, -740597245, -296927436, -105813205, 297684203}, (-16777205) - Color.rgb(0, 0, 0), objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 109;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrOnExtraCallbackWithResult = LogData.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = kSerializerArrOnExtraCallbackWithResult[0];
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializerArrOnExtraCallbackWithResult[1]);
        KSerializer<?> kSerializer2 = encryptType4.IAuthTabCallback;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer2);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, getwrigglelayout, getwrigglelayout, kSerializer2, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3};
        int i4 = IAuthTabCallbackStub + 101;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LogData deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        JsonObject jsonObject;
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        int i;
        LogStatus logStatus;
        String str;
        String str2;
        LogData.SuccessYn successYn;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        jp[] jpVarArrOnExtraCallbackWithResult = LogData.onExtraCallbackWithResult();
        int i3 = 1;
        int i4 = 6;
        String strAsInterface = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            LogStatus logStatus2 = (LogStatus) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, jpVarArrOnExtraCallbackWithResult[0], (Object) null);
            LogData.SuccessYn successYn2 = (LogData.SuccessYn) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, jpVarArrOnExtraCallbackWithResult[1], (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            encryptType4 encrypttype4 = encryptType4.IAuthTabCallback;
            JsonObject jsonObject4 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, encrypttype4, (Object) null);
            JsonObject jsonObject5 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encrypttype4, (Object) null);
            successYn = successYn2;
            logStatus = logStatus2;
            str2 = strAsInterface2;
            jsonObject2 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, encrypttype4, (Object) null);
            jsonObject3 = jsonObject5;
            str = strAsInterface3;
            jsonObject = jsonObject4;
            i = 127;
        } else {
            int i5 = IAuthTabCallbackStub + 33;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            int i7 = 0;
            JsonObject jsonObject6 = null;
            JsonObject jsonObject7 = null;
            JsonObject jsonObject8 = null;
            String strAsInterface4 = null;
            LogData.SuccessYn successYn3 = null;
            LogStatus logStatus3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i4 = 6;
                        z = false;
                        continue;
                    case 0:
                        logStatus3 = (LogStatus) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, jpVarArrOnExtraCallbackWithResult[0], logStatus3);
                        i7 |= 1;
                        i3 = 1;
                        i4 = 6;
                        break;
                    case 1:
                        successYn3 = (LogData.SuccessYn) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, jpVarArrOnExtraCallbackWithResult[i3], successYn3);
                        i7 |= 2;
                        int i8 = asBinder + 15;
                        IAuthTabCallbackStub = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 1;
                        break;
                    case 2:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        break;
                    case 3:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i7 |= 8;
                        break;
                    case 4:
                        jsonObject6 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, encryptType4.IAuthTabCallback, jsonObject6);
                        i7 |= 16;
                        break;
                    case 5:
                        jsonObject8 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, jsonObject8);
                        i7 |= 32;
                        break;
                    case 6:
                        jsonObject7 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, encryptType4.IAuthTabCallback, jsonObject7);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            LogStatus logStatus4 = logStatus3;
            jsonObject = jsonObject6;
            jsonObject2 = jsonObject7;
            jsonObject3 = jsonObject8;
            i = i7;
            logStatus = logStatus4;
            str = strAsInterface;
            LogData.SuccessYn successYn4 = successYn3;
            str2 = strAsInterface4;
            successYn = successYn4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        LogData logData = new LogData(i, logStatus, successYn, str2, str, jsonObject, jsonObject3, jsonObject2, (okycx) null);
        int i10 = IAuthTabCallbackStub + 59;
        asBinder = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
        return logData;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m63deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        LogData logDataDeserialize = deserialize(decoder);
        int i3 = asBinder + 23;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return logDataDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LogData logData) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(logData, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LogData.onWarmupCompleted(logData, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(logData, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LogData.onWarmupCompleted(logData, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LogData) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 45;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 59697), KeyEvent.getDeadChar(0, 0) + 17, 10973 - (Process.myPid() >> 22), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 46134), 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.getDefaultSize(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1493 - ImageFormat.getBitsPerPixel(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            throw th;
                        }
                        throw cause2;
                    }
                } catch (Throwable th2) {
                    Throwable cause3 = th2.getCause();
                    if (cause3 == null) {
                        throw th2;
                    }
                    throw cause3;
                }
            } catch (Throwable th3) {
                Throwable cause4 = th3.getCause();
                if (cause4 == null) {
                    throw th3;
                }
                throw cause4;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 51;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 44 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), 44 - ((Process.getThreadPriority(0) + 20) >> 6), 1493 - TextUtils.indexOf((CharSequence) "", '0'), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th4) {
                cause = th4.getCause();
                if (cause != null) {
                }
            }
            cause = th4.getCause();
            if (cause != null) {
                throw th4;
            }
            throw cause;
        }
        String str = new String(cArr);
        int i8 = $11 + 25;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        char c = '0';
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 'x' - AndroidCharacter.getMirror(c), (-16768368) - Color.rgb(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i9 = $11 + 47;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 107;
                $10 = i12 % 128;
                if (i12 % i3 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(i5, i5), 73 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), Color.alpha(0) + 72, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i11++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Gravity.getAbsoluteGravity(0, 0)), 39 - (Process.myPid() >> 22), 10300 - TextUtils.indexOf((CharSequence) "", '0'), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 78 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 7398 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{60861, 40028, 3632, 47119, 10799, 54494, 18169, 61625, 25242, 60600, 40773, 2406, 47896, 9492, 55083, 16785, 62440, 32142, 61353, 40453, 2141, 47730, 9246, 54818, 16576, 62119, 31962, 61084, 39103, 2913, 46435, 10011, 53525, 60839, 40005, 3711, 47119, 10805, 54494, 45600, 50130, 20971, 59272, 30122, 35679, 6483, 44914, 15637, 45883, 49349, 48063, 51789, 22644, 60951, 31797, 33472, 4300, 42723, 13462, 47783};
        IAuthTabCallback = 5110722192826145841L;
        onExtraCallback = new int[]{1413431193, 1611151339, -2094053217, 1118432893, -1386503506, 834078563, 1496308361, -956012986, 838139696, -726148440, 1291095590, 1401577752, 134850955, -1283716164, -1857211057, -871478919, 559914120, 930283410};
    }
}
