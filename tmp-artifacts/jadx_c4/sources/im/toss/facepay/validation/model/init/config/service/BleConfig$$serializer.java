package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class BleConfig$$serializer implements aeu2<BleConfig> {
    private static char[] IAuthTabCallback;
    public static final BleConfig$$serializer INSTANCE;
    private static boolean asInterface;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 4 - (b * 4);
        int i6 = (i2 * 3) + 1;
        int i7 = 97 - (i * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i7 = (-i7) + i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = i7;
            i7 = bArr[i5];
            i7 = (-i7) + i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    private BleConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 71;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return serialDescriptor;
    }

    static {
        onTransact = 0;
        onExtraCallbackWithResult();
        BleConfig$$serializer bleConfig$$serializer = new BleConfig$$serializer();
        INSTANCE = bleConfig$$serializer;
        Object[] objArr = new Object[1];
        a((-1) - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 62, (char) (47757 - Drawable.resolveOpacity(0, 0)), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), bleConfig$$serializer, 11);
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-122, -123, -124, -124, -125, -126, -127}, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 62, 10 - (KeyEvent.getMaxKeyCode() >> 16), (char) (42870 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-117, -123, -118, -119, -125, -124, -120, -127, -121}, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(72 - Color.red(0), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (28250 - View.MeasureSpec.getMode(0)), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        b(null, new byte[]{-127, -122, -123, -112, -123, -108, -112, -121, -124, -109, -123, -126, -124, -125, -112, -127, -121, -110, -111, -112, -121, -113, -121, -114, -115, -122, -116}, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        Object[] objArr7 = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 103, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29022), objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        b(null, new byte[]{-117, -123, -118, -119, -125, -124, -120, -117, -118, -115, -106, -127, -123, -122, -106, -107, -111, -112, -121, -113, -121, -114, -115, -122, -116}, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), true);
        Object[] objArr9 = new Object[1];
        a((-16777083) - Color.rgb(0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), true);
        Object[] objArr10 = new Object[1];
        b(null, new byte[]{-112, -124, -123, -124, -115, -116, -114, -120, -127, -127, -115, -103, -106, -112, -125, -104, -127, -115, -105, -111, -112, -121, -113, -121, -114, -115, -122, -116}, null, Color.green(0) + 127, objArr10);
        setanimationsloop.onWarmupCompleted(((String) objArr10[0]).intern(), true);
        Object[] objArr11 = new Object[1];
        a(168 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 39 - Color.argb(0, 0, 0, 0), (char) ((Process.myTid() >> 22) + 41882), objArr11);
        setanimationsloop.onWarmupCompleted(((String) objArr11[0]).intern(), true);
        Object[] objArr12 = new Object[1];
        a(207 - (ViewConfiguration.getWindowTouchSlop() >> 8), 31 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36546), objArr12);
        setanimationsloop.onWarmupCompleted(((String) objArr12[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 37;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {ScannerConfig$$serializer.INSTANCE, AdvertiserConfig$$serializer.INSTANCE, getbgcolor, setvideolistener, setvideolistener, setvideolistener, getbgcolor, setvideolistener, setvideolistener, setvideolistener, setvideolistener};
        int i4 = IAuthTabCallbackDefault + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BleConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        ScannerConfig scannerConfig;
        int i;
        boolean z;
        AdvertiserConfig advertiserConfig;
        boolean z2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = asBinder + 87;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            ScannerConfig scannerConfig2 = (ScannerConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ScannerConfig$$serializer.INSTANCE, (Object) null);
            AdvertiserConfig advertiserConfig2 = (AdvertiserConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, AdvertiserConfig$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            double dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
            double dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            double dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
            double dIAuthTabCallback7 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 8);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 9);
            z2 = zOnExtraCallbackWithResult2;
            d5 = dIAuthTabCallback5;
            d2 = dIAuthTabCallback7;
            d4 = dIAuthTabCallback4;
            d = dIAuthTabCallback6;
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 10);
            z = zOnExtraCallbackWithResult;
            scannerConfig = scannerConfig2;
            i = 2047;
            advertiserConfig = advertiserConfig2;
            d3 = dIAuthTabCallback3;
        } else {
            int i8 = IAuthTabCallbackDefault + 107;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            double dIAuthTabCallback8 = 0.0d;
            ScannerConfig scannerConfig3 = null;
            boolean z3 = true;
            boolean zOnExtraCallbackWithResult3 = false;
            boolean zOnExtraCallbackWithResult4 = false;
            double dIAuthTabCallback9 = 0.0d;
            double dIAuthTabCallback10 = 0.0d;
            double dIAuthTabCallback11 = 0.0d;
            double dIAuthTabCallback12 = 0.0d;
            double dIAuthTabCallback13 = 0.0d;
            double dIAuthTabCallback14 = 0.0d;
            int i10 = 0;
            AdvertiserConfig advertiserConfig3 = null;
            while (z3) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z3 = false;
                        i2 = 2;
                        i5 = 9;
                    case 0:
                        scannerConfig3 = (ScannerConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ScannerConfig$$serializer.INSTANCE, scannerConfig3);
                        i10 |= 1;
                        i2 = 2;
                        i4 = 10;
                        i5 = 9;
                    case 1:
                        advertiserConfig3 = (AdvertiserConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, AdvertiserConfig$$serializer.INSTANCE, advertiserConfig3);
                        i10 |= 2;
                        i4 = 10;
                    case 2:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2);
                        i10 |= 4;
                        i4 = 10;
                    case 3:
                        dIAuthTabCallback11 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                        i10 |= 8;
                        i4 = 10;
                    case 4:
                        dIAuthTabCallback12 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                        i10 |= 16;
                        int i11 = asBinder + 23;
                        IAuthTabCallbackDefault = i11 % 128;
                        int i12 = i11 % 2;
                        i4 = 10;
                    case 5:
                        dIAuthTabCallback9 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                        i10 |= 32;
                    case 6:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
                        i10 |= 64;
                    case 7:
                        dIAuthTabCallback13 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
                        i10 |= 128;
                    case 8:
                        dIAuthTabCallback10 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 8);
                        i10 |= 256;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        dIAuthTabCallback8 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i5);
                        i10 |= 512;
                    case 10:
                        dIAuthTabCallback14 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i4);
                        i10 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            dIAuthTabCallback = dIAuthTabCallback14;
            dIAuthTabCallback2 = dIAuthTabCallback8;
            scannerConfig = scannerConfig3;
            i = i10;
            double d6 = dIAuthTabCallback9;
            z = zOnExtraCallbackWithResult3;
            boolean z4 = zOnExtraCallbackWithResult4;
            advertiserConfig = advertiserConfig3;
            double d7 = dIAuthTabCallback12;
            z2 = z4;
            d = dIAuthTabCallback13;
            d2 = dIAuthTabCallback10;
            d3 = dIAuthTabCallback11;
            d4 = d7;
            d5 = d6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BleConfig(i, scannerConfig, advertiserConfig, z, d3, d4, d5, z2, d, d2, dIAuthTabCallback2, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m329deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BleConfig bleConfigDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return bleConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BleConfig bleConfig) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bleConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BleConfig.IAuthTabCallback(bleConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BleConfig) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 123;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 67;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 59697), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 10972 - TextUtils.indexOf((CharSequence) "", '0'), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 20220 - View.getDefaultSize(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 45, 1494 - (Process.myTid() >> 22), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 59698), 16 - TextUtils.lastIndexOf("", '0', 0), (Process.myPid() >> 22) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, Gravity.getAbsoluteGravity(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback6 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1494 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback6).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49122), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 1493 - TextUtils.indexOf((CharSequence) "", '0'), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        char c = '0';
        float f = 0.0f;
        if (cArr3 != null) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c) + 1), 77 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    int i5 = $11 + 25;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 / 3;
                    }
                    c = '0';
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 75 - (ViewConfiguration.getEdgeSlop() >> 16), 16037 - (ViewConfiguration.getTouchSlop() >> 8), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i7 = 1052772399;
            if (asInterface) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $10 + 113;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] * iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 63 - View.resolveSizeAndState(0, 0, 0), 12214 - View.getDefaultSize(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 62 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 5;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] >> iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 62 - ((byte) KeyEvent.getModifierMetaStateMask()), Drawable.resolveOpacity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62, KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    i7 = 1052772399;
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{22320, 5901, 55045, 38790, 22482, 5687, 54908, 38648, 22263, 5433, 54528, 38223, 21893, 5597, 54334, 37920, 21695, 5361, 54071, 37643, 21321, 5013, 54219, 37423, 21102, 4774, 53949, 37175, 20746, 4424, 53650, 37330, 20567, 4201, 53413, 37115, 24361, 8010, 57164, 40857, 24543, 7710, 56938, 40621, 24251, 7471, 56578, 40284, 23967, 7641, 56344, 40039, 23779, 7382, 56115, 39683, 23394, 7047, 56285, 39452, 23148, 6827, 19136, 2812, 51877, 35439, 18999, 3016, 52126, 35677, 19212, 2258, 33790, 50117, 915, 17245, 33539, 49918, 689, 17013, 33343, 49614, 452, 16781, 33104, 49412, 241, 16570, 32886, 49171, 2020, 18375, 34719, 51024, 1792, 18174, 34490, 50811, 1545, 17896, 34246, 50590, 1362, 17690, 40186, 56513, 7319, 23641, 39943, 56826, 7605, 23921, 40251, 57037, 7897, 24215, 40519, 56835, 8128, 24501, 40808, 57126, 6395, 22745, 39057, 55371, 6152, 23000, 39351, 55663, 6437, 23291, 39621, 60836, 44447, 28105, 11527, 60761, 44196, 27883, 11311, 60517, 44956, 28545, 12244, 61226, 44884, 28332, 12006, 60982, 44664, 27064, 10636, 59845, 43307, 26945, 10424, 59621, 43012, 26730, 11160, 60294, 43972, 27447, 11094, 60032, 43752, 27188, 20030, 3589, 52819, 36509, 20163, 3902, 53105, 36789, 20479, 3086, 52250, 35929, 19600, 3268, 52537, 36221, 19852, 3554, 51754, 35344, 19016, 2694, 51910, 35634, 19315, 2957, 52215, 34878, 18459, 2170, 51348, 35046, 18688, 2418, 51601, 35296, 17982, 1558, 50762, 25447, 9052, 58122, 41924, 25498, 8807, 57896, 41708, 25254, 8535, 57667, 41216, 25033, 8605, 57440, 40996, 24791, 8383, 59233, 42820, 26415, 10197, 59266, 42619, 26122, 9982, 59053, 42363, 25925, 9479, 58839, 42372};
        onExtraCallback = 2064281872337972717L;
        onNavigationEvent = new char[]{32451, 32467, 32477, 32456, 32465, 32460, 32469, 32433, 32476, 32458, 32466, 32462, 32463, 32454, 32457, 32450, 32453, 32434, 32417, 32425, 32418, 32470, 32437, 32430, 32426};
        onWarmupCompleted = -1184333954;
        onExtraCallbackWithResult = true;
        asInterface = true;
    }
}
