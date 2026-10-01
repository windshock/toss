package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.generateAppWithState;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getDurationMs {

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onExtraCallback = 1;
        public static final onExtraCallback onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static final String onWarmupCompleted;

        public static final /* synthetic */ class onNavigationEvent {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final /* synthetic */ int[] onNavigationEvent;

            static {
                int[] iArr = new int[generateAppWithState.onWarmupCompleted.values().length];
                try {
                    iArr[generateAppWithState.onWarmupCompleted.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[generateAppWithState.onWarmupCompleted.BOTTOM.ordinal()] = 2;
                    int i = IAuthTabCallback + 91;
                    onExtraCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                onNavigationEvent = iArr;
                int i3 = onExtraCallback + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i2 = IAuthTabCallbackDefault + 83;
                IAuthTabCallbackStub = i2 % 128;
                return i2 % 2 != 0;
            }
            int i3 = IAuthTabCallbackStub + 51;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return -1697047710;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return "Rect";
            }
            throw null;
        }

        private onExtraCallback() {
        }

        public static final class IAuthTabCallback implements getAdService {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Configuration onExtraCallback;

            public IAuthTabCallback(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i4 = onNavigationEvent + 73;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return getspecialfeatureoptinstatus;
                }
                int i6 = onWarmupCompleted + 27;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i7 != 0) {
                    int i8 = 74 / 0;
                }
                return getspecialfeatureoptinstatus2;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ Configuration IAuthTabCallback;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i4 = onExtraCallback + 115;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 9;
                $10 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), ExpandableListView.getPackedPositionChild(0L) + 25, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (5407414049857832247L ^ IAuthTabCallback);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777275, 6383 - KeyEvent.normalizeMetaState(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 'H' - AndroidCharacter.getMirror('0'), 19626 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() & 5407414049857832247L & IAuthTabCallback;
                        try {
                            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.normalizeMetaState(0) + 59, 6383 - ExpandableListView.getPackedPositionGroup(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
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
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 59, 6384 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2);
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        public final isPrivate onExtraCallback(boolean z, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, int i) {
            int i2;
            isPrivate isprivate;
            int i3 = 2 % 2;
            int i4 = IAuthTabCallbackStub + 21;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (!z) {
                int i5 = onNavigationEvent.onNavigationEvent[onwarmupcompleted.ordinal()];
                if (i5 != 1) {
                    int i6 = IAuthTabCallbackDefault + 35;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    isprivate = new isPrivate(new int[]{Color.argb(20, 255, 255, 255), Color.argb(25, 0, 130, 130), Color.argb(10, 0, 142, 175), Color.argb(20, 255, 255, 255), Color.argb(15, 0, 142, 175), Color.argb(5, 0, 161, 161), Color.argb(20, 255, 255, 255)}, new float[]{0.13f, 0.26f, 0.38f, 0.61f, 0.83f, 0.92f, 1.0f}, true, 0.0f, 0.0f, 8, (DefaultConstructorMarker) null);
                } else {
                    isprivate = new isPrivate(new int[]{Color.argb(20, 255, 255, 255), Color.argb(10, 0, 142, 175), Color.argb(5, 0, 161, 161), Color.argb(20, 255, 255, 255), Color.argb(30, 0, 130, 130), Color.argb(10, 0, 142, 175), Color.argb(20, 255, 255, 255)}, new float[]{0.09f, 0.33f, 0.45f, 0.62f, 0.77f, 0.87f, 1.0f}, true, 0.0f, 0.0f, 8, (DefaultConstructorMarker) null);
                }
            } else {
                int i8 = IAuthTabCallbackDefault + 119;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 == 0 ? (i2 = onNavigationEvent.onNavigationEvent[onwarmupcompleted.ordinal()]) == 1 : (i2 = onNavigationEvent.onNavigationEvent[onwarmupcompleted.ordinal()]) == 1) {
                    isprivate = new isPrivate(new int[]{Color.argb(20, 0, 0, 0), Color.argb(25, 0, BERTags.FLAGS, 191), Color.argb(10, 0, 207, 255), Color.argb(20, 0, 0, 0), Color.argb(15, 0, Imgproc.COLOR_RGBA2YUV_YVYU, 232), Color.argb(5, 0, 201, 167), Color.argb(20, 0, 0, 0)}, new float[]{0.13f, 0.26f, 0.38f, 0.61f, 0.83f, 0.92f, 1.0f}, true, 0.0f, 180.0f, 8, (DefaultConstructorMarker) null);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    isprivate = new isPrivate(new int[]{Color.argb(20, 0, 0, 0), Color.argb(25, 0, BERTags.FLAGS, 191), Color.argb(10, 0, 207, 255), Color.argb(20, 0, 0, 0), Color.argb(15, 0, Imgproc.COLOR_RGBA2YUV_YVYU, 232), Color.argb(5, 0, 201, 167), Color.argb(20, 0, 0, 0)}, new float[]{0.13f, 0.26f, 0.38f, 0.61f, 0.83f, 0.92f, 1.0f}, true, 0.0f, 0.0f, 8, (DefaultConstructorMarker) null);
                }
            }
            isprivate.onExtraCallbackWithResult(i);
            return isprivate;
        }

        public final int onExtraCallback(boolean z) {
            int i = 2 % 2;
            if (z) {
                int i2 = IAuthTabCallbackDefault + 29;
                IAuthTabCallbackStub = i2 % 128;
                return i2 % 2 != 0 ? Color.argb(28, 19995, 26859, 8839) : Color.argb(15, 137, 216, 216);
            }
            int iArgb = Color.argb(102, 137, 216, 216);
            int i3 = IAuthTabCallbackStub + 95;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return iArgb;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            return android.graphics.Color.argb(255, org.opencv.imgproc.Imgproc.COLOR_BGRA2YUV_YV12, 167, 170);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (r7 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        
            if ((!r7) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        
            r7 = android.graphics.Color.argb(255, org.opencv.imgproc.Imgproc.COLOR_BGRA2YUV_YV12, 167, 179);
            r1 = o.getDurationMs.onExtraCallback.IAuthTabCallbackDefault + 5;
            o.getDurationMs.onExtraCallback.IAuthTabCallbackStub = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 1;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
        }

        public final int onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object obj = null;
            if (readIntokhttp.onExtraCallback(configuration)) {
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                Configuration configuration2 = resources2.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                int iOnNavigationEvent = setBodyokhttp.onNavigationEvent(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).requestPostMessageChannel().IPostMessageService_Parcel(), 0.08f);
                int i2 = IAuthTabCallbackStub + 115;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return iOnNavigationEvent;
                }
                throw null;
            }
            Resources resources3 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            Configuration configuration3 = resources3.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            int iOnNavigationEvent2 = setBodyokhttp.onNavigationEvent(new getUrlokhttp(new IAuthTabCallback(configuration3)).requestPostMessageChannel().IPostMessageService_Parcel(), 0.05f);
            int i3 = IAuthTabCallbackStub + 17;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return iOnNavigationEvent2;
            }
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback(@NotNull Context context) throws Throwable {
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (!readIntokhttp.onExtraCallback(configuration)) {
                Object[] objArr = new Object[1];
                a(new char[]{859, 51824, 37161, 22758, 10140, 60698, 46166, 33693, 19192, 4520, 57204, 42522, 28110, 13467, 543, 51582, 36908, 24551, 9886, 60424, 47894, 33501, 18854, 4267, 56951, 42240, 27856, 15245, 323, 51323, 38766, 24306, 9658, 62275, 47637, 33242, 18662, 6055, 56689, 42022, 29574, 14992, '\\', 53117, 38451, 23989, 9398, 62040, 47362, 32976, 20452, 5795, 56433, 43812, 29316, 14735, 1874, 52834, 38193, 23728, 11175, 61766, 47110}, 51511 - Color.blue(0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                int i2 = IAuthTabCallbackStub + 79;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return strIntern;
            }
            int i4 = IAuthTabCallbackDefault + 125;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(new char[]{859, 11058, 21421, 31260, 41620, 51520, 61858, 6191, 16616, 28506, 38848, 48704, 58918, 3745, 13691, 23964, 33804, 44165, 56186, 946, 10878, 21191, 30994, 41433, 51623, 61490, 6308, 18199, 28555, 38401, 48810, 58736, 3578, 13377, 23761, 33952, 45870, 56253, 517, 10900, 20822, 31202, 41064, 51431, 63323, 8079, 18002, 28218, 38562, 48434, 58752, 3097, 13465, 25470, 35760, 45693, 56002, 336, 10693, 20969, 30779, 41139, 53015, 63379, 7710, 18153, 28029, 38345, 48137, 58570, 3235, 15143}, 8806 / (ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(new char[]{859, 11058, 21421, 31260, 41620, 51520, 61858, 6191, 16616, 28506, 38848, 48704, 58918, 3745, 13691, 23964, 33804, 44165, 56186, 946, 10878, 21191, 30994, 41433, 51623, 61490, 6308, 18199, 28555, 38401, 48810, 58736, 3578, 13377, 23761, 33952, 45870, 56253, 517, 10900, 20822, 31202, 41064, 51431, 63323, 8079, 18002, 28218, 38562, 48434, 58752, 3097, 13465, 25470, 35760, 45693, 56002, 336, 10693, 20969, 30779, 41139, 53015, 63379, 7710, 18153, 28029, 38345, 48137, 58570, 3235, 15143}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10358, objArr3);
                obj = objArr3[0];
            }
            return ((String) obj).intern();
        }

        public final String IAuthTabCallback(@NotNull Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Intrinsics.checkNotNullExpressionValue(resources.getConfiguration(), "");
            if (!readIntokhttp.onExtraCallback(r6)) {
                Object[] objArr = new Object[1];
                a(new char[]{859, 30306, 59661, 23596, 55252, 19120, 48578, 14111, 43624, 7434, 36896, 3024, 32486, 61873, 27419, 56940, 20748, 50229, 16346, 45730, 9662, 40791, 4658, 34057, 63527, 29634, 59012, 22951, 54091, 18033, 47434, 11296, 43002, 6801, 36273, 1872, 31342, 60685, 24613, 56292, 20182, 49586, 15176, 44663, 8475, 38047, 4082, 33418, 62882, 28482, 57952, 21769, 51417, 17390, 46800, 10658, 41799, 5755, 35124, 64666, 30703, 60044, 23970}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29989, objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{859, 44218, 23741, 3252, 48308, 27896, 7410, 52471, 31912, 11426, 56496, 35992, 15494, 60553, 40139, 19604, 64652, 44173, 23690, 3290, 48286, 27807, 7330, 52449, 31975, 11498, 56564, 36079, 15595, 60649, 40122, 19704, 64762, 44233, 23745, 3272, 48334, 27845, 7381, 52428, 31894, 11482, 56536, 35903, 15419, 60519, 39970, 19506, 64546, 44090, 23600, 3121, 48185, 27686, 7232, 52234, 31751, 11283, 56324, 35921, 15387, 60443, 39943, 19483, 64542, 44129, 23661, 3169, 48169, 27762, 7283, 52351}, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 45054, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i4 = IAuthTabCallbackDefault + 27;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return strIntern;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            IAuthTabCallback();
            onExtraCallbackWithResult = new onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{859, 12436, 25825, 38970, 52236, 22, 13806, 27097, 40408, 53548, 1388, 14678, 28350, 41703, 54935, 2586, 15980, 29251, 42902, 56244, 3878, 17169, 30526, 42159, 55447, 3268, 16424, 29697, 43091, 56743, 4518, 17878, 31034, 44391, 57693, 5766, 19190, 32299, 45577, 58978, 7142, 20372, 33732, 46897, 60163, 7945, 19637, 32999, 46288, 59428, 7234, 20552, 34190, 47608, 60888, 8451, 21877, 35516, 48851, 62178, 9769, 23059}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13267, objArr);
            onWarmupCompleted = ((String) objArr[0]).intern();
            int i = onExtraCallback + 119;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 61;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = onWarmupCompleted;
            int i5 = i3 + 111;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = -7542059155495287292L;
        }
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onExtraCallback = 0;
        private static final String onExtraCallbackWithResult;
        public static final IAuthTabCallback onNavigationEvent;
        private static int onTransact = 1;
        private static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 71;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this != obj) {
                return obj instanceof IAuthTabCallback;
            }
            int i4 = i2 + 87;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 113;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return -1083441258;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return "Blank";
            }
            int i3 = 7 / 0;
            return "Blank";
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 103;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - ((Process.getThreadPriority(0) + 20) >> 6)), 84 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 21234 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 20, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private IAuthTabCallback() {
        }

        static {
            onExtraCallbackWithResult();
            onNavigationEvent = new IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(new char[]{2363, 2387, 32077, 15752, 15726, 60504, 7998, 19660, 35133, 14983, 30551, 28853, 33344, 61509, 45717, 46690, 55774, 36310, 60510, 3558, 8004, 19290, 10143, 17184, 21190, 192, 24903, 34531, 43087, 56909, 56465, 56437, 61395, 39894, 5711, 5098, 9586, 20926, 20916, 26898, 30966, 61242, 35632, 44174, 48702, 42163, 50872, 57887, 62969, 25150, '}', 14741, 19321, 16296, 31656, 32519, 36586, 62755, 46396, 45767, 50286, 45736, 61610, 2066, 7082, 18473, 10793, 20357, 20755, 1421, 25713, 34097, 38043, 49944, 57238, 55466, 59933, 39062}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{20134, 20174, 37481, 28085, 5166, 892, 20227, 2897, 41085, 54691, 10090, 23029, 50653, 8033, 58024, 40738, 40515, 25330, 48227, 9382, 22745, 42110, 30626, 27232, 5467, 61412, 12666, 44963, 61394, 12649, 36012, 62773, 43086, 29938, 18034, 15018, 25327, 48794, 393, 16466, 16235, 30, 56077, 34254, 63907, 19351, 38533, 52063, 45668, 36122, 20544, 4309, 3300, 53388, 11157, 22087, 51575, 6663, 58625, 39815, 33788, 23945, 41100, 8515, 23607, 42765, 31252, 26309, 5774, 60073, 13388, 44145, 54022, 11324, 36779, 61930, 44416, 30642}, 1 - Color.alpha(0), objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = onExtraCallback + 5;
            onTransact = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 13;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = onExtraCallbackWithResult;
            int i4 = i2 + 97;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 37;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = onWarmupCompleted;
            int i5 = i3 + 91;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static void onExtraCallbackWithResult() {
            IAuthTabCallback = 4844687724779924077L;
        }
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onWarmupCompleted onExtraCallbackWithResult;
        private static char[] onNavigationEvent = null;
        private static int onTransact = 1;
        private static int onWarmupCompleted = 1;

        static {
            onExtraCallback();
            onExtraCallbackWithResult = new onWarmupCompleted();
            int i = onWarmupCompleted + 53;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 49;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 115;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (obj instanceof onWarmupCompleted) {
                return true;
            }
            int i5 = i3 + 93;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return 799413966;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "Circle";
            }
            throw null;
        }

        public static final class IAuthTabCallback implements getAdService {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Configuration onNavigationEvent;

            public IAuthTabCallback(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    int i3 = onWarmupCompleted + 113;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        return getSpecialFeatureOptInStatus.Dark;
                    }
                    int i4 = 2 / 0;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                readIntokhttp.onExtraCallback(this.onNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Configuration onNavigationEvent;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i2 = onExtraCallback + 75;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus2;
            }
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
        
            return ((java.lang.String) r0[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
        
            r2 = new java.lang.Object[1];
            a(new int[]{69, 70, 111, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1}, r2);
            r8 = ((java.lang.String) r2[0]).intern();
            r1 = o.getDurationMs.onWarmupCompleted.onExtraCallback + 103;
            o.getDurationMs.onWarmupCompleted.onTransact = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
        
            r0 = 24 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r8) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r8) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
        
            r8 = o.getDurationMs.onWarmupCompleted.onExtraCallback + 109;
            o.getDurationMs.onWarmupCompleted.onTransact = r8 % 128;
            r8 = r8 % 2;
            r0 = new java.lang.Object[1];
            a(new int[]{0, 69, 77, 33}, true, null, r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String IAuthTabCallback(@NotNull Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                int i3 = 70 / 0;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                Configuration configuration2 = resources2.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
        
            return o.setBodyokhttp.onNavigationEvent(new o.getUrlokhttp(new o.getDurationMs.onWarmupCompleted.IAuthTabCallback(r5)).requestPostMessageChannel().IPostMessageService_Parcel(), 0.08f);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
        
            r5 = r5.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r5 = r5.getConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r5 = o.setBodyokhttp.onNavigationEvent(new o.getUrlokhttp(new o.getDurationMs.onWarmupCompleted.onExtraCallbackWithResult(r5)).requestPostMessageChannel().IPostMessageService_Parcel(), 0.05f);
            r1 = o.getDurationMs.onWarmupCompleted.onTransact + 99;
            o.getDurationMs.onWarmupCompleted.onExtraCallback = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x009b, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
        
            r5 = null;
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r1) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r1) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        
            r5 = r5.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r5 = r5.getConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onTransact + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                int i3 = 31 / 0;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                Configuration configuration2 = resources2.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
            }
        }

        public final maxAgeSeconds onNavigationEvent(@NotNull Context context) {
            int iOnNavigationEvent;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            getDEFAULT_CONNECTION_SPECSokhttp getdefault_connection_specsokhttp = new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration));
            int iOnWarmupCompleted = getdefault_connection_specsokhttp.onWarmupCompleted();
            getSpecialFeatureOptInStatus typedObject = getdefault_connection_specsokhttp.readTypedObject();
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (typedObject == getspecialfeatureoptinstatus) {
                int i2 = onTransact + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                iOnNavigationEvent = iOnWarmupCompleted;
            } else {
                iOnNavigationEvent = setBodyokhttp.onNavigationEvent(iOnWarmupCompleted, 0.85f);
            }
            if (getdefault_connection_specsokhttp.readTypedObject() != getspecialfeatureoptinstatus) {
                int i4 = onTransact + 39;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iOnWarmupCompleted = setBodyokhttp.onNavigationEvent(iOnWarmupCompleted, 0.0f);
            }
            return new maxAgeSeconds(new int[]{iOnNavigationEvent, iOnWarmupCompleted}, new float[]{0.7f, 1.0f}, (Float) null, (Float) null, (Float) null, 28, (DefaultConstructorMarker) null);
        }

        public final int onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (!readIntokhttp.onExtraCallback(configuration)) {
                return Color.argb(255, Imgproc.COLOR_BGRA2YUV_YV12, 167, 170);
            }
            int i2 = onTransact + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iArgb = Color.argb(255, Imgproc.COLOR_BGRA2YUV_YV12, 167, 179);
            int i4 = onExtraCallback + 89;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return iArgb;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x021f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            Throwable cause;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onNavigationEvent;
            Throwable th = null;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 36, 14239 - (ViewConfiguration.getWindowTouchSlop() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i8 = $10 + 47;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = $11 + 71;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 10935), 65 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 16719 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(th, objArr3)).charValue();
                            throw th;
                        }
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 10935), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65, Color.blue(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(th, objArr4)).charValue();
                        } catch (Throwable th3) {
                            cause = th3.getCause();
                            if (cause != null) {
                            }
                        }
                        cause = th3.getCause();
                        if (cause != null) {
                            throw th3;
                        }
                        throw cause;
                    }
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.myPid() >> 22) + 29, ExpandableListView.getPackedPositionGroup(0L) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(th, objArr5)).charValue();
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49466), 70 - View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    th = null;
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                int i14 = $11 + 109;
                $10 = i14 % 128;
                i = 2;
                int i15 = i14 % 2;
                cArr3 = cArr4;
            } else {
                i = 2;
            }
            if (i6 > 0) {
                int i16 = $11 + 69;
                $10 = i16 % 128;
                if (i16 % i != 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 1, i4);
                    System.arraycopy(cArr5, 0, cArr3, i4 * i6, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i4 + i6);
                } else {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i17 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i17, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i17);
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
            objArr[0] = new String(cArr3);
        }

        public static final class onExtraCallback implements getAdService {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Configuration IAuthTabCallback;

            public onExtraCallback(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onExtraCallbackWithResult + 13;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                readIntokhttp.onExtraCallback(this.IAuthTabCallback);
                throw null;
            }
        }

        static void onExtraCallback() {
            onNavigationEvent = new char[]{27384, 27387, 27186, 27278, 27279, 27278, 27276, 27383, 27383, 27384, 27186, 27380, 27384, 27189, 27278, 27278, 27378, 27279, 27189, 27390, 27384, 27279, 27360, 27279, 27278, 27186, 27186, 27337, 27278, 27379, 27279, 27279, 27387, 27386, 27381, 27379, 27189, 27388, 27391, 27378, 27348, 27382, 27377, 27360, 27391, 27188, 27279, 27381, 27388, 27384, 27391, 27360, 27377, 27386, 27188, 27388, 27383, 27390, 27377, 27384, 27390, 27188, 27279, 27387, 27386, 27384, 27383, 27387, 27386, 27173, 27283, 27309, 27311, 27310, 27275, 27373, 27344, 27278, 27308, 27287, 27287, 27283, 27291, 27385, 27278, 27310, 27310, 27308, 27377, 27380, 27284, 27379, 27381, 27287, 27285, 27281, 27309, 27308, 27308, 27278, 27380, 27289, 27289, 27288, 27287, 27287, 27289, 27288, 27283, 27377, 27385, 27291, 27282, 27287, 27288, 27289, 27382, 27383, 27285, 27286, 27295, 27291, 27288, 27286, 27310, 27377, 27381, 27287, 27289, 27288, 27283, 27265, 27267, 27286, 27293, 27382, 27376, 27280, 27287};
        }
    }
}
