package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addStage2Performance {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static long onExtraCallback = -2394351791992232512L;
    private static int onExtraCallbackWithResult;
    private final getCausesCount<Double> IAuthTabCallback;
    private final getCausesCount<Double> onNavigationEvent;
    private final getCausesCount<Double> onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r6 instanceof o.addStage2Performance) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r6 = (o.addStage2Performance) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r6 = o.addStage2Performance.onExtraCallbackWithResult + 11;
        o.addStage2Performance.asBinder = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if ((r6 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 125;
        o.addStage2Performance.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            int i4 = 40 / 0;
        }
    }

    public int hashCode() {
        getCausesCount<Double> getcausescount;
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = 0;
        if (i2 % 2 == 0 ? (getcausescount = this.onNavigationEvent) != null : (getcausescount = this.onNavigationEvent) != null) {
            iHashCode = getcausescount.hashCode();
        } else {
            int i5 = i3 + 9;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        }
        getCausesCount<Double> getcausescount2 = this.IAuthTabCallback;
        int iHashCode2 = getcausescount2 == null ? 0 : getcausescount2.hashCode();
        getCausesCount<Double> getcausescount3 = this.onWarmupCompleted;
        if (getcausescount3 != null) {
            int i7 = onExtraCallbackWithResult + 53;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            int iHashCode3 = getcausescount3.hashCode();
            if (i8 == 0) {
                int i9 = 7 / 0;
            }
            i4 = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i4;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        getCausesCount<Double> getcausescount = this.onNavigationEvent;
        getCausesCount<Double> getcausescount2 = this.IAuthTabCallback;
        getCausesCount<Double> getcausescount3 = this.onWarmupCompleted;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{8353, 17277, 59213, 2911, 44863, 54017, 30465, 39923, 16320, 41946, 51082, 27546, 36754, 12922, 22084, 64094, 7726, 33304, 9736, 19151, 61125, 4822, 46762, 56002, 32399, 57707, 1370, 43351, 52535, 28929, 38162, 14828, 24004, 49608, 26016, 35252, 11666, 20588, 62588, 6222, 48182, 8297}, (Process.myTid() >> 22) + 25579, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(getcausescount);
        Object[] objArr2 = new Object[1];
        a(new char[]{8411, 57306, 56990, 56761, 56505, 56275, 56042, 55768, 55550, 55264, 54812, 54548, 54274, 54058, 53816, 53513}, TextUtils.getTrimmedLength("") + 65293, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getcausescount2);
        Object[] objArr3 = new Object[1];
        a(new char[]{8411, 7124, 22145, 37265, 52360, 1949, 17078, 48534, 63630, 13198, 28288, 43450, 58554, 57252, 6820, 21991}, 15106 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(getcausescount3);
        Object[] objArr4 = new Object[1];
        a(new char[]{8414}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 49031, objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public addStage2Performance(@Nullable getCausesCount<Double> getcausescount, @Nullable getCausesCount<Double> getcausescount2, @Nullable getCausesCount<Double> getcausescount3) {
        this.onNavigationEvent = getcausescount;
        this.IAuthTabCallback = getcausescount2;
        this.onWarmupCompleted = getcausescount3;
    }

    public final getCausesCount<Double> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getCausesCount<Double> getcausescount = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return getcausescount;
    }

    public final getCausesCount<Double> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getCausesCount<Double> getcausescount = this.IAuthTabCallback;
        int i5 = i3 + 85;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return getcausescount;
    }

    public final getCausesCount<Double> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Double> getcausescount = this.onWarmupCompleted;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 31;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, View.MeasureSpec.getSize(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 58 - ExpandableListView.getPackedPositionChild(0L), 6383 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 49;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58, Color.red(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getPressedStateDuration() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i7 = $11 + 11;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i8 = 57 / 0;
            objArr[0] = str;
        }
    }
}
