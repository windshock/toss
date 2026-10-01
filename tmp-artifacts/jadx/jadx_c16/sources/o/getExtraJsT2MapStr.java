package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getExtraJsT2MapStr implements KSerializer<Date> {
    public static final getExtraJsT2MapStr IAuthTabCallback;
    private static int asBinder;
    private static char[] onExtraCallback;
    private static final SerialDescriptor onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final IdGeneratorExternalSyntheticLambda1 onWarmupCompleted;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3 = b * 4;
        byte[] bArr = $$a;
        int i4 = 3 - (i * 3);
        int i5 = 97 - (s * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            int i9 = 0;
            int i10 = i4 + i8;
            i2 = i9;
            int i11 = i7;
            i5 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i4 + 1;
            int i13 = i5;
            i7 = i12;
            i4 = bArr[i12];
            i9 = i2 + 1;
            i8 = i13;
            int i102 = i4 + i8;
            i2 = i9;
            int i112 = i7;
            i5 = i102;
            i4 = i112;
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

    private getExtraJsT2MapStr() {
    }

    public /* synthetic */ Object deserialize(Decoder decoder) throws qn {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Date dateOnWarmupCompleted = onWarmupCompleted(decoder);
        int i4 = onTransact + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return dateOnWarmupCompleted;
        }
        throw null;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(encoder, (Date) obj);
        int i4 = onTransact + 3;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        asBinder = 1;
        onExtraCallbackWithResult();
        IAuthTabCallback = new getExtraJsT2MapStr();
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollBarFadeDuration() >> 16, 19 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = new IdGeneratorExternalSyntheticLambda1(((String) objArr[0]).intern(), locale);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (31003 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr2);
        TimeZone timeZone = DesugarTimeZone.getTimeZone(((String) objArr2[0]).intern());
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        idGeneratorExternalSyntheticLambda1.setTimeZone(timeZone);
        onWarmupCompleted = idGeneratorExternalSyntheticLambda1;
        onExtraCallbackWithResult = ujb.onExtraCallbackWithResult("KycStatusDate", spv.IAuthTabCallbackStub.onExtraCallback);
        int i = IAuthTabCallbackDefault + 99;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public void onExtraCallback(@NotNull Encoder encoder, @NotNull Date date) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(date, "");
        String str = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "");
        encoder.onExtraCallbackWithResult(str);
        int i4 = IAuthTabCallbackStub + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    public Date onWarmupCompleted(@NotNull Decoder decoder) throws qn {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        String strIAuthTabCallback_Parcel = decoder.IAuthTabCallback_Parcel();
        Date dateOnNavigationEvent = setReferrerUID.onNavigationEvent(strIAuthTabCallback_Parcel);
        if (dateOnNavigationEvent != null) {
            return dateOnNavigationEvent;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(onWarmupCompleted.parse(strIAuthTabCallback_Parcel));
            int i2 = onTransact + 1;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!Result.onExtraCallback(obj))) {
            obj = null;
        }
        Date date = (Date) obj;
        if (date != null) {
            int i4 = onTransact + 107;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return date;
        }
        throw new qn("Invalid KYC status date: " + strIAuthTabCallback_Parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16717519) - Color.rgb(0, 0, 0)), View.combineMeasuredStates(0, 0) + 17, 10973 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46134), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getOffsetAfter("", 0) + 44, Process.getGidForName("") + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $11 + 37;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTouchSlop() >> 8)), 44 - View.combineMeasuredStates(0, 0), 1494 - KeyEvent.keyCodeFromString(""), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i6 = $11 + 91;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = new String(cArr);
        int i8 = $11 + 15;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 53 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{60845, 46242, 24499, 59008, 35269, 20690, 64451, 33424, 9672, 52279, 38754, 15929, 49448, 26669, 13163, 55896, 32030, 1112, 44713, 38030, 52659, 9912, 40835, 61660, 10711, 33520, 64457, 23746, 46372};
        onNavigationEvent = 1228938319410803931L;
    }
}
