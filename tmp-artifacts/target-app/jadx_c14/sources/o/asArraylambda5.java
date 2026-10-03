package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DynamicFromArrayCompanion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class asArraylambda5 extends Exception {
    public /* synthetic */ asArraylambda5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallback extends asArraylambda5 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = 1840589937224023668L;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final DynamicFromArrayCompanion.onExtraCallback policy;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 101;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 121;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i8 = i2 + 45;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.policy == ((onExtraCallback) obj).policy) {
                return true;
            }
            int i10 = i2 + 89;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.policy.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.policy.hashCode();
            int i3 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override // java.lang.Throwable
        public String toString() throws Throwable {
            int i = 2 % 2;
            DynamicFromArrayCompanion.onExtraCallback onextracallback = this.policy;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{43422, 55097, 44877, 43472, 53806, 42441, 639, 4675, 48150, 52243, 36856, 13422, 33297, 58995, 39344, 11780, 59468, 36932, 58259, 16446, 65139, 35747, 52568, 30169, 50317, 42441, 55149, 28644, 10930, 24552, 8478, 33170, 12419}, KeyEvent.keyCodeFromString(""), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(onextracallback);
            Object[] objArr2 = new Object[1];
            a(new char[]{46816, 33407, 3514, 46793, 20067}, ViewConfiguration.getWindowTouchSlop() >> 8, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull DynamicFromArrayCompanion.onExtraCallback onextracallback) {
            super(null);
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.policy = onextracallback;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 7;
            $11 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                    return;
                }
                int i5 = $10 + 67;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 45812), 84 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-16755983) - Color.rgb(0, 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.blue(0)), 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 8808 - (ViewConfiguration.getTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    i3 = $11 + 45;
                    $10 = i3 % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    private asArraylambda5() {
    }

    public static final class onNavigationEvent extends asArraylambda5 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 55557;
        private static int IAuthTabCallbackDefault = 1;
        private static char onExtraCallback = 54978;
        private static char onExtraCallbackWithResult = 16855;
        private static char onNavigationEvent = 6569;
        private static int onWarmupCompleted;
        private final String message;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 99;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (this != obj) {
                return (obj instanceof onNavigationEvent) && Intrinsics.areEqual(this.message, ((onNavigationEvent) obj).message);
            }
            int i5 = i2 + 71;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.message.hashCode();
            if (i3 != 0) {
                int i4 = 49 / 0;
            }
            return iHashCode;
        }

        @Override // java.lang.Throwable
        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.message;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{4520, 38088, 48102, 50094, 32573, 17271, 30386, 59440, 63458, 1101, 22379, 27655, 48536, 7429, 60912, 48386, 57885, 26780, 32365, 18710, 52018, 43171, 37297, 14206}, (ViewConfiguration.getEdgeSlop() >> 16) + 23, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new char[]{28221, 37830}, AndroidCharacter.getMirror('0') - '/', objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 67;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.message;
            int i5 = i2 + 35;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 53;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cArgb = (char) Color.argb(i3, i3, i3, i3);
                            int iGreen = 10 - Color.green(i3);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 12435;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iGreen, iIndexOf, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), View.resolveSizeAndState(0, 0, 0) + 10, (ViewConfiguration.getTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        int i10 = $11 + 19;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16015), 14 - KeyEvent.normalizeMetaState(0), ((Process.getThreadPriority(0) + 20) >> 6) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $11 + 75;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public static final class onWarmupCompleted extends asArraylambda5 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final DynamicFromArrayCompanion.onExtraCallback policy;
        private static char[] IAuthTabCallback = {64970, 64982, 64998, 64973, 64910, 64988, 64991, 64922, 64986, 64989, 64981, 64923, 64976, 64983, 64963, 64960};
        private static char onNavigationEvent = 51245;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 29;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i6 = i4 + 21;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.policy == ((onWarmupCompleted) obj).policy) {
                return true;
            }
            int i8 = i2 + 99;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DynamicFromArrayCompanion.onExtraCallback onextracallback = this.policy;
            if (i3 != 0) {
                return onextracallback.hashCode();
            }
            onextracallback.hashCode();
            throw null;
        }

        @Override // java.lang.Throwable
        public String toString() throws Throwable {
            int i = 2 % 2;
            DynamicFromArrayCompanion.onExtraCallback onextracallback = this.policy;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{1, '\n', '\f', 15, 0, '\r', '\t', 11, '\t', 0, 15, '\t', '\r', 6, 4, '\n', 0, 4, 13787}, (byte) (View.MeasureSpec.getSize(0) + 52), KeyEvent.keyCodeFromString("") + 19, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(onextracallback);
            Object[] objArr2 = new Object[1];
            a(new char[]{13790}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44), View.combineMeasuredStates(0, 0) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 53 / 0;
            }
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull DynamicFromArrayCompanion.onExtraCallback onextracallback) {
            super(null);
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.policy = onextracallback;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23139 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, 23138 - Process.getGidForName(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $11 + 67;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    i2 = i + 12;
                    cArr4[i2] = (char) (cArr[i2] + b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i6 = $10 + 23;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $11 + 91;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (KeyEvent.getMaxKeyCode() >> 16)), MotionEvent.axisFromString("") + 75, 8087 - TextUtils.indexOf((CharSequence) "", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, 19487 - MotionEvent.axisFromString(""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            String str = new String(cArr4);
            int i16 = $10 + 75;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }
}
