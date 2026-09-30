package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Method;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getRoleAuthorityAsString {
    private static final byte[] $$a = {62, 54, 60, ISO7816.INS_UNBLOCK_CHV};
    private static final int $$b = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static char[] onExtraCallbackWithResult = {60839, 8758, 29352, 33591, 54189, 57349, 12458, 16652, 37249, 42510, 63190, 1904, 22502, 25705};
    private static long onExtraCallback = 1719939490449072723L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = 3 - (i * 4);
        int i4 = b * 4;
        byte[] bArr = $$a;
        int i5 = 97 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i3;
            int i9 = 0;
            int i10 = i3 + i7;
            i2 = i9;
            int i11 = i8;
            i5 = i10;
            i3 = i11;
            int i12 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i5;
            i8 = i12;
            i3 = bArr[i12];
            i9 = i2 + 1;
            i7 = i13;
            int i102 = i3 + i7;
            i2 = i9;
            int i112 = i8;
            i5 = i102;
            i3 = i112;
            int i122 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public static final JsonObject onExtraCallbackWithResult(@Nullable Long l) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        JsonPrimitive jsonPrimitive = l != null ? new JsonPrimitive(Double.valueOf(l.longValue())) : JsonNull.INSTANCE;
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 14, (char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr);
        jsonObject.add(((String) objArr[0]).intern(), jsonPrimitive);
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return jsonObject;
        }
        throw null;
    }

    public static final Map<String, Double> onWarmupCompleted(@Nullable Long l) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Double dValueOf = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (l != null) {
            dValueOf = Double.valueOf(l.longValue());
            int i4 = onNavigationEvent + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
        } else {
            int i6 = i3 + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        return access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), dValueOf));
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getEdgeSlop() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 17, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46133), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31, 20219 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 45, 1494 - Color.argb(0, 0, 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $11 + 103;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $10 + 7;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 1494 - (ViewConfiguration.getEdgeSlop() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
