package o;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.EngineConfig1;
import o.makePFX_WINS;
import o.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface AppNode61 {

    public static final class onWarmupCompleted implements AppNode61 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onWarmupCompleted = {27260, 27172, 27170, 27143, 27145, 27171, 27171, 27175, 27175, 27163, 27156, 27153, 27145, 27157, 27169, 27226};
        private final int onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (this.onExtraCallback == ((onWarmupCompleted) obj).onExtraCallback) {
                return true;
            }
            int i3 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onExtraCallback;
            if (i3 != 0) {
                return Integer.hashCode(i4);
            }
            Integer.hashCode(i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{0, 15, 1, 12}, true, new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(i2);
            Object[] objArr2 = new Object[1];
            a(new int[]{15, 1, 0, 1}, false, new byte[]{1}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i3 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(int i) {
            this.onExtraCallback = i;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i3 + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            int length;
            char[] cArr;
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onWarmupCompleted;
            if (cArr2 != null) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 0;
                }
                while (i < length) {
                    int i8 = $10 + 21;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr[i] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i]);
                    i++;
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i10 = $10 + 75;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    int i11 = i4 / i6;
                    System.arraycopy(cArr5, 1, cArr3, i11, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i11);
                } else {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i12 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i12, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i12);
                }
            }
            if (z) {
                char[] cArr7 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr7;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            String str = new String(cArr3);
            int i13 = $10 + 27;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        }
    }

    public static final class onExtraCallback implements AppNode61 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = 8904320259514575233L;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String IAuthTabCallback;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.AppNode61.onExtraCallback) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r1 = r1 + 9;
            o.AppNode61.onExtraCallback.onExtraCallbackWithResult = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if ((r1 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, ((o.AppNode61.onExtraCallback) r6).IAuthTabCallback) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        
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
                int r1 = o.AppNode61.onExtraCallback.onWarmupCompleted
                int r2 = r1 + 13
                int r3 = r2 % 128
                o.AppNode61.onExtraCallback.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L16
                r2 = 80
                int r2 = r2 / r4
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r3
            L19:
                boolean r2 = r6 instanceof o.AppNode61.onExtraCallback
                if (r2 != 0) goto L28
                int r1 = r1 + 9
                int r6 = r1 % 128
                o.AppNode61.onExtraCallback.onExtraCallbackWithResult = r6
                int r1 = r1 % r0
                if (r1 == 0) goto L27
                return r3
            L27:
                return r4
            L28:
                o.AppNode61$onExtraCallback r6 = (o.AppNode61.onExtraCallback) r6
                java.lang.String r0 = r5.IAuthTabCallback
                java.lang.String r6 = r6.IAuthTabCallback
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
                if (r6 != 0) goto L35
                return r4
            L35:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppNode61.onExtraCallback.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.IAuthTabCallback.hashCode();
                int i3 = 52 / 0;
            } else {
                iHashCode = this.IAuthTabCallback.hashCode();
            }
            int i4 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{44281, 35445, 57769, 55497, 13927, 28084, 17613, 41593, 39355, 61579, 11783, 1466, 31938, 23066, 45485, 59632, 50779}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9900, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new char[]{44191}, 55073 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 73;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallback ^ 5407414049857832247L);
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = $10 + 27;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static final class onNavigationEvent implements AppNode61 {
        private static final byte[] $$a;
        private static final int $$b = 33;
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static int onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static int onWarmupCompleted;
        private final String onExtraCallback;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, int r6, short r7) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = r6 * 2
                int r0 = r6 + 11
                byte[] r1 = o.AppNode61.onNavigationEvent.$$a
                int r5 = r5 * 3
                int r5 = r5 + 102
                byte[] r0 = new byte[r0]
                int r6 = r6 + 10
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r1[r7]
            L28:
                int r5 = r5 + r4
                int r7 = r7 + 1
                int r5 = r5 + 2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AppNode61.onNavigationEvent.$$c(int, int, short):java.lang.String");
        }

        public static native char l(int i, int i2);

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onExtraCallbackWithResult + 43;
                IAuthTabCallbackDefault = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, ((onNavigationEvent) obj).onExtraCallback)) {
                return false;
            }
            int i3 = onExtraCallbackWithResult + 7;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 57;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((char) (37538 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{64822, 23041, 45808, 41852, 28050, 13732, 35076, 54200, 6993, 55831, 63561, 5155, 65135, 62958}, new char[]{0, 0, 0, 0}, new char[]{45652, 29241, 41872, 14994}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14217), Drawable.resolveOpacity(0, 0) + 2072264677, new char[]{18096}, new char[]{0, 0, 0, 0}, new char[]{58791, 33855, 35195, 3383}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackDefault + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 37;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 57;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
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
                int i3 = $10 + 47;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 81;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 3;
                }
            }
            String str = new String(cArr6);
            int i7 = $10 + 75;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        static {
            byte[] bArr = {34, -56, 26, -92, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
            $$a = bArr;
            ClassLoader parent = onNavigationEvent.class.getClassLoader().getParent();
            try {
                byte b = (byte) (bArr[4] - 1);
                byte b2 = b;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
                onExtraCallbackWithResult = 0;
                IAuthTabCallbackDefault = 1;
                IAuthTabCallback = 7798559133331975163L;
                onWarmupCompleted = -1776194565;
                onNavigationEvent = (char) 46773;
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
