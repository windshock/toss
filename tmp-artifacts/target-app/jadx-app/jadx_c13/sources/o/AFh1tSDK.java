package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1tSDK implements KSerializer<ZonedDateTime> {
    private static long IAuthTabCallback;
    private static int asInterface;
    public static final int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    public static final AFh1tSDK onNavigationEvent;
    private static final SerialDescriptor onWarmupCompleted;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = (s2 * 4) + 97;
        int i5 = s + 4;
        byte[] bArr = $$a;
        int i6 = 1 - (i * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 = (-i4) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i4;
            i4 = bArr[i5];
            i4 = (-i4) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
            }
        }
    }

    private AFh1tSDK() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult = onExtraCallbackWithResult(decoder);
        int i3 = IAuthTabCallbackStub + 91;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return zonedDateTimeOnExtraCallbackWithResult;
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(encoder, (ZonedDateTime) obj);
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = onWarmupCompleted;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        asInterface = 1;
        onWarmupCompleted();
        onNavigationEvent = new AFh1tSDK();
        onWarmupCompleted = ujb.onExtraCallbackWithResult("Instant", spv.IAuthTabCallbackStub.onExtraCallback);
        onExtraCallback = 8;
        int i = IAuthTabCallbackDefault + 115;
        asInterface = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
    }

    public void onNavigationEvent(@NotNull Encoder encoder, @Nullable ZonedDateTime zonedDateTime) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        if (zonedDateTime == null) {
            encoder.onWarmupCompleted();
            return;
        }
        int i4 = onTransact + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            String string = zonedDateTime.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            encoder.onExtraCallbackWithResult(string);
        } else {
            String string2 = zonedDateTime.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            encoder.onExtraCallbackWithResult(string2);
            throw null;
        }
    }

    public ZonedDateTime onExtraCallbackWithResult(@NotNull Decoder decoder) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(decoder.IAuthTabCallback_Parcel());
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (40638 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr);
            ZonedDateTime zonedDateTimeL = zonedDateTime.l(ZoneId.of(((String) objArr[0]).intern()));
            int i4 = onTransact + 103;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return zonedDateTimeL;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        double d;
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            d = 0.0d;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $11 + 97;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i >> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 59697), View.resolveSizeAndState(0, 0, 0) + 17, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.argb(0, 0, 0, 0)), 31 - View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') + 20172, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char cLastIndexOf = (char) (49122 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0));
                        int keyRepeatTimeout = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int offsetBefore = 1494 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0);
                        byte b = (byte) (-$$a[0]);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, keyRepeatTimeout, offsetBefore, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 17 - View.getDefaultSize(0, 0), Color.red(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46134), 31 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), ExpandableListView.getPackedPositionGroup(0L) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    char fadingEdgeLength = (char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int trimmedLength = TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 44;
                    int i7 = 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b3 = (byte) (-$$a[0]);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, trimmedLength, i7, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49123);
                int i10 = 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1));
                int iAxisFromString = MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 1495;
                byte b5 = (byte) (-$$a[0]);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i10, iAxisFromString, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i11 = $11 + 35;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            d = 0.0d;
        }
        String str = new String(cArr);
        int i13 = $11 + 37;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{29483, 11656, 52769, 26808, 2305, 44012, 17513, 59122, 34711, 8223};
        IAuthTabCallback = 1658893123584308037L;
    }
}
