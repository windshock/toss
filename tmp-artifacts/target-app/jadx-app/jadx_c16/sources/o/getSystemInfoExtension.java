package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getSystemInfoExtension extends onReceiveCdp<AmountTopLocal.Title> {
    public static final getSystemInfoExtension IAuthTabCallback;
    private static char[] onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4 = 4 - (b * 4);
        int i5 = 97 - (i * 2);
        byte[] bArr = $$a;
        int i6 = 1 - (i2 * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i4;
            i4++;
            i5 = i8 + i7;
            int i9 = i5;
            int i10 = i4;
            bArr2[i3] = (byte) i9;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i10];
            i8 = i9;
            i4 = i10;
            i4++;
            i5 = i8 + i7;
            int i92 = i5;
            int i102 = i4;
            bArr2[i3] = (byte) i92;
            i3++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i922 = i5;
            int i1022 = i4;
            bArr2[i3] = (byte) i922;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    static {
        onWarmupCompleted = 1;
        onWarmupCompleted();
        IAuthTabCallback = new getSystemInfoExtension();
        int i = onExtraCallback + 21;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private getSystemInfoExtension() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AmountTopLocal.Title.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("TEXT", Reflection.getOrCreateKotlinClass(AmountTopLocal.Title.Text.class)), getWrite.IAuthTabCallback("NUMERIC", Reflection.getOrCreateKotlinClass(AmountTopLocal.Title.Numeric.class))};
        Object[] objArr = new Object[1];
        a(View.combineMeasuredStates(0, 0), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 22919), objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onWarmupCompleted(pairArr), (String) null, 8, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019e  */
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
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 59697), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, 10974 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 46135), ExpandableListView.getPackedPositionGroup(0L) + 31, (Process.myPid() >> 22) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0)), 44 - View.getDefaultSize(0, 0), TextUtils.getOffsetAfter("", 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49124), 44 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            j = 0;
        }
        String str = new String(cArr);
        int i7 = $11 + 51;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{46119, 56747, 26401, 34997};
        onNavigationEvent = 5561199896140219477L;
    }
}
