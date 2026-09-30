package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.transfer.message_card.TransferMessageCardActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesTransferMessageCardKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted = {60839, 3114, 11954, 18704, 27530, 35351, 42233, 51050, 57855, '\r', 8853, 23810, 32548, 39337, 47151, 55967, 62743, 6025, 13943, 20727, 29479, 28126, 35907, 44762, 51375, 60198, 1453, 9240, 18125, 24840, 33791, 41587, 56528};
    private static long onExtraCallbackWithResult = -7726645049327743905L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = (b * 2) + 97;
        int i5 = 4 - (i * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = i5 + (-i7);
            int i11 = i9 + 1;
            i2 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i12 = i4;
            i9 = i5;
            i5 = i12;
            int i102 = i5 + (-i7);
            int i112 = i9 + 1;
            i2 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* renamed from: $r8$lambda$7ziFkZkbW94KqFHVo_BR-CPK0w8, reason: not valid java name */
    public static /* synthetic */ Class m247$r8$lambda$7ziFkZkbW94KqFHVo_BRCPK0w8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesTransferMessageCardKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 33, (char) TextUtils.getOffsetBefore("", 0), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferMessageCardKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM247$r8$lambda$7ziFkZkbW94KqFHVo_BRCPK0w8 = FeaturesTransferMessageCardKspDeepLinkRegistry.m247$r8$lambda$7ziFkZkbW94KqFHVo_BRCPK0w8();
                int i4 = onExtraCallback + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM247$r8$lambda$7ziFkZkbW94KqFHVo_BRCPK0w8;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        Class<TransferMessageCardActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            cls = TransferMessageCardActivity.class;
            int i4 = 28 / 0;
        } else {
            cls = TransferMessageCardActivity.class;
        }
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 71;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i / i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 59697), 16 - MotionEvent.axisFromString(""), 10973 - View.resolveSize(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46134), 31 - TextUtils.getOffsetAfter("", 0), 20219 - TextUtils.indexOf((CharSequence) "", '0', 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123);
                                int i6 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int iRgb = Color.rgb(0, 0, 0) + 16778710;
                                byte b = (byte) ($$b - 4);
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i6, iRgb, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
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
            } else {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onWarmupCompleted[i + i7])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 59697), 17 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollBarSize() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getTapTimeout() >> 16)), 31 - (ViewConfiguration.getWindowTouchSlop() >> 8), 20220 - Color.argb(0, 0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 49123);
                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 1494;
                    byte b3 = (byte) ($$b - 4);
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, iLastIndexOf, iIndexOf, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i8 = $10 + 3;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
                int i10 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493;
                byte b5 = (byte) ($$b - 4);
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, offsetBefore, i10, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }
}
