package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.makePFX_WINS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface AppNode9 {

    public static final class onWarmupCompleted implements AppNode9 {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final onWarmupCompleted IAuthTabCallback;
        private static int asBinder = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static long onWarmupCompleted;

        static {
            onExtraCallbackWithResult();
            IAuthTabCallback = new onWarmupCompleted();
            int i = onNavigationEvent + 13;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.AppNode9.onWarmupCompleted) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 95;
            o.AppNode9.onWarmupCompleted.asBinder = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.AppNode9.onWarmupCompleted.asBinder
                int r1 = r1 + 65
                int r2 = r1 % 128
                o.AppNode9.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L16
                r1 = 26
                int r1 = r1 / r4
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r3
            L19:
                boolean r6 = r6 instanceof o.AppNode9.onWarmupCompleted
                if (r6 != 0) goto L25
                int r2 = r2 + 95
                int r6 = r2 % 128
                o.AppNode9.onWarmupCompleted.asBinder = r6
                int r2 = r2 % r0
                return r4
            L25:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppNode9.onWarmupCompleted.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 1;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 109;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return -1921554427;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{35500, 35552, 28370, 36248, 8818, 58457, 15691, 1617, 37952, 261, 46816}, -MotionEvent.axisFromString(""), objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{35500, 35552, 28370, 36248, 8818, 58457, 15691, 1617, 37952, 261, 46816}, -MotionEvent.axisFromString(""), objArr2);
            ((String) objArr2[0]).intern();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 77;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onWarmupCompleted);
                tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
                int i5 = $10 + 11;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = -5767657538132928471L;
        }
    }

    public static final class onExtraCallback implements AppNode9 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static short[] asBinder = null;
        private static int asInterface = 0;
        private static int onExtraCallback = 0;
        public static final onExtraCallback onExtraCallbackWithResult;
        private static byte[] onNavigationEvent = null;
        private static int onTransact = 1;
        private static int onWarmupCompleted;

        static {
            onExtraCallbackWithResult();
            onExtraCallbackWithResult = new onExtraCallback();
            int i = asInterface + 67;
            onTransact = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.AppNode9.onExtraCallback) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 49;
            o.AppNode9.onExtraCallback.IAuthTabCallbackStub = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if ((r2 % 2) == 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.AppNode9.onExtraCallback.IAuthTabCallbackStub
                int r1 = r1 + 17
                int r2 = r1 % 128
                o.AppNode9.onExtraCallback.IAuthTabCallbackDefault = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L16
                r1 = 56
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r6 = r6 instanceof o.AppNode9.onExtraCallback
                if (r6 != 0) goto L28
                int r2 = r2 + 49
                int r6 = r2 % 128
                o.AppNode9.onExtraCallback.IAuthTabCallbackStub = r6
                int r2 = r2 % r0
                if (r2 == 0) goto L27
                r3 = r4
            L27:
                return r3
            L28:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppNode9.onExtraCallback.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 61;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return -8508842;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) ExpandableListView.getPackedPositionType(0L), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 738182610 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 329494543, (-92) - ImageFormat.getBitsPerPixel(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = IAuthTabCallbackStub + 43;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return strIntern;
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r4
          0x003f: PHI (r4v7 byte[] A[IMMUTABLE_TYPE]) = (r4v6 byte[]), (r4v34 byte[]) binds: [B:15:0x003d, B:12:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r14, byte r15, int r16, int r17, int r18, java.lang.Object[] r19) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppNode9.onExtraCallback.a(short, byte, int, int, int, java.lang.Object[]):void");
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = 1883759141;
            IAuthTabCallback = -1538795438;
            onExtraCallback = 1209763903;
            onNavigationEvent = new byte[]{-93, 13, 12, 11, 32};
        }
    }

    public static final class onNavigationEvent implements AppNode9 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 27643;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = -1776194565;
        private static long onNavigationEvent = -6716097304802823267L;
        private static int onTransact = 1;
        private final List<getRunScene> onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(!(obj instanceof onNavigationEvent))) {
                if (Intrinsics.areEqual(this.onWarmupCompleted, ((onNavigationEvent) obj).onWarmupCompleted)) {
                    return true;
                }
                int i5 = onTransact + 1;
                onExtraCallback = i5 % 128;
                return i5 % 2 != 0;
            }
            int i6 = i2 + 25;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 + 29;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = onTransact + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            List<getRunScene> list = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((char) (((Process.getThreadPriority(0) + 20) >> 6) + 13960), (-1291496640) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{60758, 30422, 54464, 54037, 3057, 31263, 59918, 4834, 29863, 43621, 35838, 27593, 7875}, new char[]{39014, 14437, 44323, 52977}, new char[]{16803, 1363, 34995, 60726}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(list);
            Object[] objArr2 = new Object[1];
            a((char) (Color.red(0) + 31931), Color.green(0) - 55149488, new char[]{60930}, new char[]{39014, 14437, 44323, 52977}, new char[]{20549, 46716, 48124, 8316}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onExtraCallback + 29;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onNavigationEvent(@NotNull List<getRunScene> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onWarmupCompleted = list;
        }

        public final List<getRunScene> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            List<getRunScene> list = this.onWarmupCompleted;
            int i5 = i3 + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $10 + 79;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 17;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArr6);
        }
    }
}
