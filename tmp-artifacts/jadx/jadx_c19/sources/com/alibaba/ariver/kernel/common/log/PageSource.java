package com.alibaba.ariver.kernel.common.log;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PageSource {
    public String sourceDesc = "";
    public String sourcePageAppLogToken = "";
    public SourceType sourceType = SourceType.UNKNOWN;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class SourceType {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ SourceType[] $VALUES;
        public static final SourceType EMBED_VIEW;
        public static final SourceType HREF_CHANGE;
        private static int IAuthTabCallback = 0;
        public static final SourceType PUSH_WINDOW;
        public static final SourceType START_APP;
        public static final SourceType SWITCH_TAB;
        public static final SourceType TAB_CLICK;
        public static final SourceType TAB_INIT;
        public static final SourceType TAB_PUSH;
        public static final SourceType UNKNOWN;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted;
        private String raw;

        public static SourceType valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            SourceType sourceType = (SourceType) Enum.valueOf(SourceType.class, str);
            if (i4 == 0) {
                return sourceType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static SourceType[] values() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            SourceType[] sourceTypeArr = $VALUES;
            if (i4 != 0) {
                return (SourceType[]) sourceTypeArr.clone();
            }
            throw null;
        }

        static {
            onNavigationEvent();
            SourceType sourceType = new SourceType("START_APP", 0, "startApp");
            START_APP = sourceType;
            SourceType sourceType2 = new SourceType("PUSH_WINDOW", 1, "pushWindow");
            PUSH_WINDOW = sourceType2;
            SourceType sourceType3 = new SourceType("SWITCH_TAB", 2, "switchTab");
            SWITCH_TAB = sourceType3;
            SourceType sourceType4 = new SourceType("TAB_CLICK", 3, "tabClick");
            TAB_CLICK = sourceType4;
            SourceType sourceType5 = new SourceType("TAB_INIT", 4, "tabInit");
            TAB_INIT = sourceType5;
            SourceType sourceType6 = new SourceType("TAB_PUSH", 5, "tabPush");
            TAB_PUSH = sourceType6;
            SourceType sourceType7 = new SourceType("EMBED_VIEW", 6, "embedView");
            EMBED_VIEW = sourceType7;
            SourceType sourceType8 = new SourceType("HREF_CHANGE", 7, "hrefChange");
            HREF_CHANGE = sourceType8;
            Object[] objArr = new Object[1];
            a(new char[]{7117, 7064, 56087, 20622, 39968, 65220, 7167, 60601, 36342, 26449, 45422}, View.resolveSize(0, 0) + 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{30503, 30546, 11775, 52675, 44519, 2060, 34450, 56670, 57660, 37273, 11267}, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            SourceType sourceType9 = new SourceType(strIntern, 8, ((String) objArr2[0]).intern());
            UNKNOWN = sourceType9;
            $VALUES = new SourceType[]{sourceType, sourceType2, sourceType3, sourceType4, sourceType5, sourceType6, sourceType7, sourceType8, sourceType9};
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        private SourceType(String str, int i2, String str2) {
            this.raw = str2;
        }

        public String getRaw() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 117;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return this.raw;
            }
            int i4 = 2 / 0;
            return this.raw;
        }

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i2);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i4 = $10 + 103;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 84, 21233 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 19, 8808 - KeyEvent.keyCodeFromString(""), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i7 = $10 + 89;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }

        static void onNavigationEvent() {
            onWarmupCompleted = 9018048569075785361L;
        }
    }
}
