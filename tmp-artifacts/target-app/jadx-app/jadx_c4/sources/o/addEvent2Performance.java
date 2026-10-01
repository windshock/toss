package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addEvent2Performance {
    private final addStage2Performance IAuthTabCallback;
    private final performanceLog onExtraCallback;
    private final track onExtraCallbackWithResult;
    private final addData2Performance onNavigationEvent;
    private static final byte[] $$a = {102, -86, -98, 53};
    private static final int $$b = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 478308952;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = (s * 3) + 105;
        byte[] bArr = $$a;
        int i5 = (s2 * 4) + 1;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += i6;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i8 = i6 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i8;
            i6 = bArr[i8];
            i4 += i6;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i82 = i6 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i822 = i6 + 1;
            if (i3 == i5) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addEvent2Performance)) {
            return false;
        }
        addEvent2Performance addevent2performance = (addEvent2Performance) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, addevent2performance.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, addevent2performance.onNavigationEvent)) {
            int i2 = IAuthTabCallbackDefault + 83;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, addevent2performance.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackDefault + 49;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, addevent2performance.IAuthTabCallback)) {
            return true;
        }
        int i6 = IAuthTabCallbackDefault + 113;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onExtraCallback.hashCode();
        addData2Performance adddata2performance = this.onNavigationEvent;
        int iHashCode3 = 0;
        if (adddata2performance == null) {
            int i4 = IAuthTabCallbackDefault + 117;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = adddata2performance.hashCode();
        }
        track trackVar = this.onExtraCallbackWithResult;
        int iHashCode4 = trackVar == null ? 0 : trackVar.hashCode();
        addStage2Performance addstage2performance = this.IAuthTabCallback;
        if (addstage2performance != null) {
            int i6 = IAuthTabCallbackDefault + 71;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                addstage2performance.hashCode();
                throw null;
            }
            iHashCode3 = addstage2performance.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        performanceLog performancelog = this.onExtraCallback;
        addData2Performance adddata2performance = this.onNavigationEvent;
        track trackVar = this.onExtraCallbackWithResult;
        addStage2Performance addstage2performance = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(24 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionType(0L) + 4, new char[]{'\r', 5, 14, 65500, 65525, 0, 11, '\b', 3, 0, 19, '\b', 14, '\r', 65512, '\r', 5, 14, 65479, '\f', 4, 19, 0, 65512}, false, 210 - ExpandableListView.getPackedPositionType(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(performancelog);
        Object[] objArr2 = new Object[1];
        a(10 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 9, new char[]{26, 65525, 17, 15, '\r', 18, 65484, 65496, 65513, 27, 18}, true, 197 - ExpandableListView.getPackedPositionType(0L), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(adddata2performance);
        Object[] objArr3 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 14, 4 - View.MeasureSpec.getSize(0), new char[]{22, 20, 65476, 65488, 65505, 19, '\n', 18, 65517, 23, 23, '\t', 7, 19}, true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 205, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(trackVar);
        Object[] objArr4 = new Object[1];
        a(16 - TextUtils.getTrimmedLength(""), 5 - KeyEvent.getDeadChar(0, 0), new char[]{3, 22, 21, 65474, 65486, 65503, 17, '\b', 16, 65515, 27, 22, 11, 14, 11, 4}, true, (-16777009) - Color.rgb(0, 0, 0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(addstage2performance);
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 1, (KeyEvent.getMaxKeyCode() >> 16) + 1, new char[]{0}, false, 154 - View.MeasureSpec.getMode(0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return string;
    }

    public addEvent2Performance(@NotNull performanceLog performancelog, @Nullable addData2Performance adddata2performance, @Nullable track trackVar, @Nullable addStage2Performance addstage2performance) {
        Intrinsics.checkNotNullParameter(performancelog, "");
        this.onExtraCallback = performancelog;
        this.onNavigationEvent = adddata2performance;
        this.onExtraCallbackWithResult = trackVar;
        this.IAuthTabCallback = addstage2performance;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addEvent2Performance(performanceLog performancelog, addData2Performance adddata2performance, track trackVar, addStage2Performance addstage2performance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asBinder + 97;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                performancelog = RVPerformanceTracker.onWarmupCompleted();
                int i3 = 24 / 0;
            } else {
                performancelog = RVPerformanceTracker.onWarmupCompleted();
            }
            int i4 = asBinder + 41;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(performancelog, adddata2performance, trackVar, addstage2performance);
    }

    public final performanceLog onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final addData2Performance onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        addData2Performance adddata2performance = this.onNavigationEvent;
        int i5 = i3 + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return adddata2performance;
    }

    public final track onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 31;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        track trackVar = this.onExtraCallbackWithResult;
        int i4 = i2 + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return trackVar;
    }

    public final addStage2Performance IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        addStage2Performance addstage2performance = this.IAuthTabCallback;
        int i5 = i2 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return addstage2performance;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 45;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35125), 22 - ((byte) KeyEvent.getModifierMetaStateMask()), ImageFormat.getBitsPerPixel(0) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.indexOf((CharSequence) "", '0') + 56, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), 55 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "") + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
