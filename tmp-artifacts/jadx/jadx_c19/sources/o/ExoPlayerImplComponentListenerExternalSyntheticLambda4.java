package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ExoPlayerImplComponentListenerExternalSyntheticLambda4 {

    public enum IAuthTabCallback {
        normal,
        italic,
        oblique
    }

    public enum IAuthTabCallbackDefault {
        sharp,
        smooth
    }

    public enum asBinder {
        left,
        right
    }

    ExoPlayerImplComponentListenerExternalSyntheticLambda4() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted none;
        public static final onWarmupCompleted normal;
        private static long onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i4 = $11 + 55;
            $10 = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                    return;
                }
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.argb(0, 0, 0, 0)), 84 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - View.getDefaultSize(0, 0)), 19 - Color.green(0), Color.blue(0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    i4 = $10 + 93;
                    $11 = i4 % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        private static /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = normal;
                onWarmupCompleted onwarmupcompleted2 = none;
                onwarmupcompletedArr = new onWarmupCompleted[2];
                onwarmupcompletedArr[0] = onwarmupcompleted;
                onwarmupcompletedArr[0] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{normal, none};
            }
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i2) {
        }

        public static onWarmupCompleted valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i5 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        static {
            onExtraCallback();
            normal = new onWarmupCompleted("normal", 0);
            Object[] objArr = new Object[1];
            a(new char[]{13790, 13744, 47438, 31398, 38607, 58716, 49714, 33757}, View.MeasureSpec.getMode(0) + 1, objArr);
            none = new onWarmupCompleted(((String) objArr[0]).intern(), 1);
            $VALUES = $values();
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        static void onExtraCallback() {
            onExtraCallback = -3983579261750335631L;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onTransact {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ onTransact[] $VALUES;
        public static final onTransact Blink;
        private static int IAuthTabCallback = 0;
        public static final onTransact LineThrough;
        public static final onTransact None;
        public static final onTransact Overline;
        public static final onTransact Underline;
        private static final Map<String, onTransact> decorationToEnum;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent;
        private static int onWarmupCompleted;
        private final String decoration;

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19627 - KeyEvent.getDeadChar(0, 0), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 59, 6383 - View.getDefaultSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i5 = $10 + 71;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i7 = $10 + 99;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 59 - Drawable.resolveOpacity(0, 0), 6383 - View.MeasureSpec.makeMeasureSpec(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        private static /* synthetic */ onTransact[] $values() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            onTransact[] ontransactArr = {None, Underline, Overline, LineThrough, Blink};
            int i6 = i3 + 103;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return ontransactArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onTransact valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onTransact ontransact = (onTransact) Enum.valueOf(onTransact.class, str);
            int i5 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
            }
            return ontransact;
        }

        public static onTransact[] values() {
            onTransact[] ontransactArr;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                ontransactArr = (onTransact[]) $VALUES.clone();
                int i4 = 26 / 0;
            } else {
                ontransactArr = (onTransact[]) $VALUES.clone();
            }
            int i5 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return ontransactArr;
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new char[]{15275, 29181, 44805, 58533}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19030, objArr);
            int i2 = 0;
            None = new onTransact("None", 0, ((String) objArr[0]).intern());
            Underline = new onTransact("Underline", 1, TtmlNode.UNDERLINE);
            Overline = new onTransact("Overline", 2, "overline");
            LineThrough = new onTransact("LineThrough", 3, "line-through");
            Blink = new onTransact("Blink", 4, "blink");
            $VALUES = $values();
            decorationToEnum = new HashMap();
            onTransact[] ontransactArrValues = values();
            int length = ontransactArrValues.length;
            int i3 = 2 % 2;
            while (i2 < length) {
                onTransact ontransact = ontransactArrValues[i2];
                decorationToEnum.put(ontransact.decoration, ontransact);
                i2++;
                int i4 = IAuthTabCallback + 15;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = IAuthTabCallback + 39;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        private onTransact(String str, int i2, String str2) {
            this.decoration = str2;
        }

        static onTransact getEnum(String str) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Map<String, onTransact> map = decorationToEnum;
                if (!map.containsKey(str)) {
                    throw new IllegalArgumentException("Unknown String Value: " + str);
                }
                onTransact ontransact = map.get(str);
                int i4 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return ontransact;
                }
                obj.hashCode();
                throw null;
            }
            decorationToEnum.containsKey(str);
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 115;
            onWarmupCompleted = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.decoration;
            int i5 = i3 + 47;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static void onNavigationEvent() {
            onNavigationEvent = 8890933511467613938L;
        }
    }

    public enum onExtraCallbackWithResult {
        Normal("normal"),
        Bold(TtmlNode.BOLD),
        w100("100"),
        w200("200"),
        w300("300"),
        w400("400"),
        w500("500"),
        w600("600"),
        w700("700"),
        w800("800"),
        w900("900"),
        Bolder("bolder"),
        Lighter("lighter");

        private static final Map<String, onExtraCallbackWithResult> weightToEnum = new HashMap();
        private final String weight;

        static {
            for (onExtraCallbackWithResult onextracallbackwithresult : values()) {
                weightToEnum.put(onextracallbackwithresult.weight, onextracallbackwithresult);
            }
        }

        onExtraCallbackWithResult(String str) {
            this.weight = str;
        }

        static boolean hasEnum(String str) {
            return weightToEnum.containsKey(str);
        }

        static onExtraCallbackWithResult get(String str) {
            return weightToEnum.get(str);
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.weight;
        }
    }
}
