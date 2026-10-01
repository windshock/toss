package im.toss.rn.toss.core.common.process;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnRemoteProcessGuardRecorder {
    public static final RnRemoteProcessGuardRecorder IAuthTabCallback;
    private static final CopyOnWriteArrayList<Violation> onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (b * 3) + 4;
        int i5 = s * 2;
        int i6 = 97 - (i * 4);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            i2 = 0;
            int i9 = i4;
            i6 += i8;
            i3 = i9 + 1;
            bArr2[i2] = (byte) i6;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i2++;
            i8 = bArr[i3];
            i9 = i3;
            i6 += i8;
            i3 = i9 + 1;
            bArr2[i2] = (byte) i6;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            bArr2[i2] = (byte) i6;
            if (i2 == i7) {
            }
        }
    }

    private RnRemoteProcessGuardRecorder() {
    }

    static {
        onExtraCallbackWithResult = 0;
        IAuthTabCallback();
        IAuthTabCallback = new RnRemoteProcessGuardRecorder();
        onExtraCallback = new CopyOnWriteArrayList<>();
        int i = onTransact + 65;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            RnProcessRuntime.onWarmupCompleted.IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (RnProcessRuntime.onWarmupCompleted.IAuthTabCallback()) {
            onExtraCallback.add(new Violation(str, map, onExtraCallback(), System.currentTimeMillis()));
            return;
        }
        int i3 = asBinder + 31;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final Void onExtraCallbackWithResult(@NotNull String str, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        onExtraCallback(str, map);
        throw new IllegalStateException("RN_REMOTE_GUARD_VIOLATION: " + str);
    }

    private final String onExtraCallback() throws Throwable {
        Object obj;
        String strIntern;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, 7 - TextUtils.getCapsMode("", 0, 0), (char) KeyEvent.getDeadChar(0, 0), objArr);
        Object objIntern = ((String) objArr[0]).intern();
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 28) {
                int i2 = IAuthTabCallbackDefault + 53;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    Application.getProcessName();
                    throw null;
                }
                strIntern = Application.getProcessName();
            } else {
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, ExpandableListView.getPackedPositionChild(0L) + 8, (char) KeyEvent.normalizeMetaState(0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                int i3 = IAuthTabCallbackDefault + 97;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            obj = Result.constructor-impl(strIntern);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!Result.onExtraCallback(obj)) {
            objIntern = obj;
        }
        String str = (String) objIntern;
        int i5 = asBinder + 79;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class Violation {
        private static int asInterface = 1;
        private static int onNavigationEvent;
        private final Map<String, String> IAuthTabCallback;
        private final long onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            int i3 = i2 % 128;
            asInterface = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Violation)) {
                int i4 = i3 + 43;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            Violation violation = (Violation) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, violation.onWarmupCompleted)) {
                int i5 = onNavigationEvent + 51;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, violation.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, violation.onExtraCallbackWithResult)) {
                return false;
            }
            if (this.onExtraCallback == violation.onExtraCallback) {
                return true;
            }
            int i7 = onNavigationEvent + 43;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Long.hashCode(this.onExtraCallback);
            int i4 = asInterface + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Violation(entryPoint=" + this.onWarmupCompleted + ", details=" + this.IAuthTabCallback + ", processName=" + this.onExtraCallbackWithResult + ", timestampMillis=" + this.onExtraCallback + ")";
            int i2 = asInterface + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public Violation(@NotNull String str, @NotNull Map<String, String> map, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = map;
            this.onExtraCallbackWithResult = str2;
            this.onExtraCallback = j;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 33;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 59698), Color.red(0) + 17, Color.rgb(0, 0, 0) + 16788189, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 46134), Process.getGidForName("") + 32, 20220 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTapTimeout() >> 16)), 44 - (ViewConfiguration.getTouchSlop() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 17 - TextUtils.getTrimmedLength(""), 10972 - ImageFormat.getBitsPerPixel(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46133), 30 - TextUtils.indexOf((CharSequence) "", '0'), 20220 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            int i7 = $11 + 83;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), 44 - Color.blue(0), 1494 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i9 = $11 + 117;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{60833, 14172, 22643, 32008, 34339, 43997, 52446};
        onWarmupCompleted = 2696500015187572530L;
    }
}
