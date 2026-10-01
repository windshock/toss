package o;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getImageToBitmap implements ALCFaceQuality {
    private static final byte[] $$a = {52, -58, -85, 74};
    private static final int $$b = 119;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onNavigationEvent = {22124, 20233, 25811, 7552, 13166, 10284, 49645, 59039, 39952, 46544, 43664, 16510, 31075, 7923, 14242, 11592, 49873, 64409, 37241, 46692, 45018, 17570, 31257, 5058, 2198, 11900, 50952, 64765, 38333, 35587, 41169, 22925, 32611, 5159, 3583, 8888, 55310, 60839, 62709, 57129, 42616, 35006, 37848, 31252, 23874, 10235, 3620, 4474, 64414, 49879, 42255, 35944, 38642, 31030, 60860, 62708, 57122, 42602, 35006, 37848, 31252, 23874, 10235, 3620, 4474, 64414, 49879, 42255, 35944, 38642, 31030};
    private static long IAuthTabCallback = -4256563948432001891L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = s * 4;
        int i5 = b + 4;
        byte[] bArr = $$a;
        int i6 = 97 - (i * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            i5 += -i6;
            i3 = i8;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            int i10 = i3 + 1;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            int i11 = i2 + 1;
            i8 = i10;
            i6 = bArr[i10];
            i9 = i11;
            i5 += -i6;
            i3 = i8;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            int i102 = i3 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            i5 = i6;
            bArr2[i2] = (byte) i5;
            int i1022 = i3 + 1;
            if (i2 == i7) {
            }
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i3 = onWarmupCompleted + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onExtraCallback + 11;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strIntern;
        String str2;
        Map map;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setCallBack setcallbackIAuthTabCallback = PageAnimStore.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        if (setcallbackIAuthTabCallback == null) {
            int i3 = onExtraCallback + 99;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(TextUtils.getTrimmedLength(""), 97 << (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 52) + 48123), objArr);
                strIntern = ((String) objArr[0]).intern();
                str2 = null;
                map = null;
                i = 107;
            } else {
                Object[] objArr2 = new Object[1];
                a(TextUtils.getTrimmedLength(""), 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (48123 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                str2 = null;
                map = null;
                i = 6;
            }
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, str2, map, i, null);
            int i4 = onWarmupCompleted + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Object[] objArr3 = new Object[1];
        a(36 - ExpandableListView.getPackedPositionChild(0L), Color.argb(0, 0, 0, 0) + 17, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr3);
        if (Intrinsics.areEqual(str, ((String) objArr3[0]).intern())) {
            setcallbackIAuthTabCallback.setAppBarLayoutVisibility(true);
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, 1, null);
            return;
        }
        Object[] objArr4 = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53, KeyEvent.getDeadChar(0, 0) + 17, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        if (!Intrinsics.areEqual(str, ((String) objArr4[0]).intern())) {
            return;
        }
        int i6 = onExtraCallback + 29;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        setcallbackIAuthTabCallback.setAppBarLayoutVisibility(false);
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, 10973 - (ViewConfiguration.getTapTimeout() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, 20219 - TextUtils.lastIndexOf("", '0', 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16728093) - Color.rgb(0, 0, 0)), 44 - Color.argb(0, 0, 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $10 + 11;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char fadingEdgeLength = (char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 45;
                int i7 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 1493;
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, iIndexOf, i7, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            j = 0;
        }
        objArr[0] = new String(cArr);
    }
}
