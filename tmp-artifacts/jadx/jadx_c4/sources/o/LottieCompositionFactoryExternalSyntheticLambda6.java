package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.LottieCompositionFactoryExternalSyntheticLambda7;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class LottieCompositionFactoryExternalSyntheticLambda6 extends LottieCompositionFactoryExternalSyntheticLambda17 {
    private final LottieCompositionFactoryExternalSyntheticLambda7 IAuthTabCallback;
    private final float onExtraCallback;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onExtraCallbackWithResult;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] onNavigationEvent = {37472, 47465, 50262, 4935, 15919, 17755, 36953, 49076, 51923, 4545, 15547, 19355, 38557, 41594, 51456, 5191, 9015, 19998, 38145, 41129, 53189, 6876, 8681, 19591, 39839, 42865, 62046, 6486, 9249, 29466, 40529, 42483, 61639, 8148, 10924, 29091, 40145, 43107, 63354, 590, 10533, 29799, 33620, 44799, 62970, 222, 17561, 28560, 4783, 50622, 59606, 37794, 18080, 26957, 7210, 51000, 59970, 40290, 16484, 29827, 8185, 49854, 62926, 39143, 17400, 30288, 6460, 52261, 63248, 39550, 19814, 29064, 9383, 53167, 62168, 42467, 18600, 29450, 9790, 51501, 64597, 42842, 18984, 32392, 8602, 54448, 65481, 41664, 21990, 30788, 9027, 54832, 63833, 44109, 60860, 50869, 48010, 27803, 16883, 14983, 61317, 49256, 46351, 28189, 17255, 13383, 59713, 56742, 46812, 27547, 23787, 12738, 60125, 57205, 45081, 25856, 24117, 13147, 58435, 55469, 36226, 26250, 23549, 3270, 57741, 55855, 36635, 24584, 21872, 3711, 58125, 55226, 35000, 32130, 22265, 3047, 64660, 53629, 35384, 32523, 20597};
    private static long onWarmupCompleted = 7200601732830971585L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        ?? r8 = 97 - (s2 * 3);
        int i4 = i * 2;
        int i5 = 3 - (s * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b = r8;
            i2 = 0;
            int i6 = i5;
            int i7 = i6;
            i3 = i5 + b;
            i5 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i5 + 1;
            i2++;
            b = bArr[i8];
            int i9 = i3;
            i6 = i8;
            i5 = i9;
            int i72 = i6;
            i3 = i5 + b;
            i5 = i72;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public LottieCompositionFactoryExternalSyntheticLambda6(@NotNull LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f) {
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        this.IAuthTabCallback = lottieCompositionFactoryExternalSyntheticLambda7;
        this.onExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.onExtraCallback = f;
    }

    @Override // o.LottieCompositionFactoryExternalSyntheticLambda17
    public SearchView onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, LottieCompositionFactoryExternalSyntheticLambda7.onExtraCallback.onExtraCallback)) {
            int i4 = asInterface + 55;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(onQueryRefine.onExtraCallbackWithResult(500, 0, getCallToActionButton.onExtraCallback.onTransact(), 2, (Object) null), 0.0f, 2, (Object) null);
        }
        return ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null), 0.0f, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[PHI: r2 r7 r8
      0x0047: PHI (r2v13 java.util.List) = (r2v4 java.util.List), (r2v14 java.util.List) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r7v7 float) = (r7v2 float), (r7v11 float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r8v10 float) = (r8v2 float), (r8v13 float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[PHI: r2 r7 r8
      0x0044: PHI (r2v5 java.util.List) = (r2v4 java.util.List), (r2v14 java.util.List) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r7v3 float) = (r7v2 float), (r7v11 float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r8v3 float) = (r8v2 float), (r8v13 float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.LottieCompositionFactoryExternalSyntheticLambda17
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<LottieCompositionFactoryExternalSyntheticLambda18> onExtraCallbackWithResult(long j, float f) throws Throwable {
        List listCreateListBuilder;
        float f2;
        float f3;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            listCreateListBuilder = CollectionsKt.createListBuilder();
            f2 = (int) (j >>> 111);
            f3 = (this.onExtraCallback % f2) * 0.0f;
            if (Intrinsics.areEqual(this.IAuthTabCallback, LottieCompositionFactoryExternalSyntheticLambda7.onExtraCallback.onExtraCallback)) {
                i = 200;
            } else {
                int i4 = IAuthTabCallbackDefault + 105;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            }
        } else {
            listCreateListBuilder = CollectionsKt.createListBuilder();
            f2 = (int) (j >> 32);
            f3 = (this.onExtraCallback - f2) / 2.0f;
            if (Intrinsics.areEqual(this.IAuthTabCallback, LottieCompositionFactoryExternalSyntheticLambda7.onExtraCallback.onExtraCallback)) {
            }
        }
        float f4 = (this.onExtraCallback * 0.7f) / 2.0f;
        long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(r9) << 32) | (Float.floatToRawIntBits(r9) & 4294967295L));
        float f5 = -f4;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = new LottieCompositionFactoryExternalSyntheticLambda12(0.0f, 1.5f, getSplitTrack.onExtraCallbackWithResult(new getStarRatingContentViewGroup(150.0d, 40.0d), i));
        float fOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f));
        getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onTransact(), i);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122 = new LottieCompositionFactoryExternalSyntheticLambda12(0.6f, 0.0f, null, 6, null);
        float f6 = f3 + f5;
        float f7 = f2 / 2.0f;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123 = new LottieCompositionFactoryExternalSyntheticLambda12(f6 + f7, 0.0f, null, 6, null);
        float f8 = f5 + f4;
        float f9 = f8 - f7;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda124 = new LottieCompositionFactoryExternalSyntheticLambda12(f9, f9 - fOnExtraCallback, getthumbpositionOnExtraCallbackWithResult);
        List list = listCreateListBuilder;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45, (char) (32732 - Color.green(0)), objArr);
        LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18 = new LottieCompositionFactoryExternalSyntheticLambda18(((String) objArr[0]).intern(), jOnWarmupCompleted, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda123, lottieCompositionFactoryExternalSyntheticLambda124, null);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda125 = new LottieCompositionFactoryExternalSyntheticLambda12(0.6f, 0.0f, null, 6, null);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda126 = new LottieCompositionFactoryExternalSyntheticLambda12(f6, f6 - fOnExtraCallback, getthumbpositionOnExtraCallbackWithResult);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda127 = new LottieCompositionFactoryExternalSyntheticLambda12(f8, 0.0f, null, 6, null);
        Object[] objArr2 = new Object[1];
        a(46 - View.MeasureSpec.getSize(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 48, (char) (43301 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr2);
        LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda182 = new LottieCompositionFactoryExternalSyntheticLambda18(((String) objArr2[0]).intern(), jOnWarmupCompleted, lottieCompositionFactoryExternalSyntheticLambda125, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda126, lottieCompositionFactoryExternalSyntheticLambda127, null);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda128 = new LottieCompositionFactoryExternalSyntheticLambda12(0.6f, 0.0f, null, 6, null);
        float f10 = f6 + f2;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda129 = new LottieCompositionFactoryExternalSyntheticLambda12(f10, fOnExtraCallback + f10, getthumbpositionOnExtraCallbackWithResult);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1210 = new LottieCompositionFactoryExternalSyntheticLambda12(f8, 0.0f, null, 6, null);
        Object[] objArr3 = new Object[1];
        a(93 - Process.getGidForName(""), 47 - Color.green(0), (char) ExpandableListView.getPackedPositionType(0L), objArr3);
        list.addAll(CollectionsKt.listOf(new LottieCompositionFactoryExternalSyntheticLambda18[]{lottieCompositionFactoryExternalSyntheticLambda18, lottieCompositionFactoryExternalSyntheticLambda182, new LottieCompositionFactoryExternalSyntheticLambda18(((String) objArr3[0]).intern(), jOnWarmupCompleted, lottieCompositionFactoryExternalSyntheticLambda128, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda129, lottieCompositionFactoryExternalSyntheticLambda1210, null)}));
        return CollectionsKt.build(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2  */
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 59696), 17 - View.resolveSizeAndState(0, 0, 0), (-16766243) - Color.rgb(0, 0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 46134), View.getDefaultSize(0, 0) + 31, 20220 - TextUtils.indexOf("", "", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 44, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $10 + 103;
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
        int i7 = $10 + 109;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ExpandableListView.getPackedPositionGroup(j)), 44 - KeyEvent.getDeadChar(0, 0), 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }
}
