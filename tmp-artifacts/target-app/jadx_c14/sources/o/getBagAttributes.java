package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getBagAttributes {
    private static boolean IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static char[] asBinder;
    private static boolean asInterface;
    public static final getBagAttributes onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    public static final int onWarmupCompleted;
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = o.getBagAttributes.$$a
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 97
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBagAttributes.$$c(short, short, byte):java.lang.String");
    }

    private getBagAttributes() {
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionGroup(0L) + 23, (char) (48862 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (57278 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        onExtraCallback = new getBagAttributes();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr3 = new Object[1];
        a(KeyEvent.keyCodeFromString(""), View.resolveSize(0, 0) + 23, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 48864), objArr3);
        asInterface = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr3[0]).intern(), false);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, View.MeasureSpec.getMode(0) + 22, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 57278), objArr4);
        IAuthTabCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onExtraCallback(((String) objArr4[0]).intern(), false);
        onWarmupCompleted = 8;
        int i = onTransact + 125;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = asInterface;
        int i5 = i2 + 67;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void onExtraCallback(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48862), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), z);
        asInterface = z;
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean z = IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return z;
    }

    public final void IAuthTabCallback(boolean z) throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub;
        Object obj;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(67 >> View.MeasureSpec.getSize(0), 90 / KeyEvent.keyCodeFromString(""), (char) ((AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)) + 57279), objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getSize(0) + 23, 22 - KeyEvent.keyCodeFromString(""), (char) (57279 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr2);
            obj = objArr2[0];
        }
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) obj).intern(), z);
        IAuthTabCallback = z;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 31;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(asBinder[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.getOffsetAfter("", 0)), (Process.myTid() >> 22) + 17, TextUtils.indexOf("", "", 0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - View.getDefaultSize(0, 0)), Color.green(0) + 31, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 44, View.resolveSize(0, 0) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $11 + 45;
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
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 44 - View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0', 0, 0) + 1495, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        asBinder = new char[]{21339, 37839, 53858, 4751, 20748, 37296, 53468, 5972, 22500, 38430, 54932, 5430, 21587, 38096, 56187, 7070, 23096, 39593, 55752, 6267, 22770, 40706, 57258, 12858, 62126, 45827, 29678, 12397, 61647, 45483, 30249, 13957, 63342, 47095, 29787, 13609, 62881, 47630, 31487, 15179, 64475, 47284, 30989, 14743, 65120};
        IAuthTabCallbackDefault = 5059392040490184002L;
    }
}
