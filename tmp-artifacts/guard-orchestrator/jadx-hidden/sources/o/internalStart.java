package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PKCS58;
import o.s3;
import o.s5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class internalStart {
    public /* synthetic */ internalStart(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private internalStart() {
    }

    public static final class onWarmupCompleted extends internalStart {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        static {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4267);
        }

        private onWarmupCompleted() {
            super(null);
        }
    }

    public static final class onExtraCallbackWithResult extends internalStart {
        static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
            int i2 = (~iOnWarmupCompleted) & i;
            int i3 = (~i) & iOnWarmupCompleted;
            if ((((i3 & i2) | (i2 ^ i3)) & 1) != 0) {
                throw null;
            }
        }

        private onExtraCallbackWithResult() {
            super(null);
        }
    }

    public static final class onExtraCallback extends internalStart {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final Map<String, Boolean> IAuthTabCallback;
        private final List<getExtensionManager> onExtraCallback;
        private final List<getExtensionManager> onNavigationEvent;
        private final List<getExtensionManager> onWarmupCompleted;
        private static char[] onExtraCallbackWithResult = {7261, 13768, 20235, 24948, 47783, 52226, 58959, 16323, 20964, 27424, 48275, 55002, 59396, 621, 23429, 27920, 34634, 55428, 62199, 1065, 23937, 30620, 60920, 50247, 48835, 37048, 19313, 15816, 6029, 52848, 41007, 39659, 19779, 9994, 6622, 62384, 43555, 60920, 50247, 48851, 37025, 19316, 15850, 6021, 52805, 40997, 39664, 19780, 10006, 6541, 44891, 34532, 64613, 53761, 2524, 32623, 21801, 36087, 58044, 55368, 4072, 26034, 23414, 45331, 59520, 60925};
        private static long asInterface = 3257978339945006183L;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ onExtraCallback IAuthTabCallback(onExtraCallback onextracallback, List list, List list2, List list3, Map map, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                list = onextracallback.onNavigationEvent;
                int i3 = IAuthTabCallbackStub + 121;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = IAuthTabCallbackStub + 107;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    list2 = onextracallback.onWarmupCompleted;
                    int i6 = 49 / 0;
                } else {
                    list2 = onextracallback.onWarmupCompleted;
                }
            }
            if ((i & 4) != 0) {
                int i7 = IAuthTabCallbackStub + 25;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                list3 = onextracallback.onExtraCallback;
            }
            if ((i & 8) != 0) {
                int i9 = IAuthTabCallbackStub + 35;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    map = onextracallback.IAuthTabCallback;
                    int i10 = 76 / 0;
                } else {
                    map = onextracallback.IAuthTabCallback;
                }
            }
            return onextracallback.IAuthTabCallback(list, list2, list3, map);
        }

        public final onExtraCallback IAuthTabCallback(@NotNull List<getExtensionManager> list, @NotNull List<getExtensionManager> list2, @NotNull List<getExtensionManager> list3, @NotNull Map<String, Boolean> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(map, "");
            onExtraCallback onextracallback = new onExtraCallback(list, list2, list3, map);
            int i2 = onTransact + 53;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 49;
                onTransact = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i3 = IAuthTabCallbackStub + 27;
                onTransact = i3 % 128;
                return i3 % 2 == 0;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                int i4 = IAuthTabCallbackStub + 63;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                return true;
            }
            int i6 = IAuthTabCallbackStub + 41;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
            int i4 = IAuthTabCallbackStub + 123;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            List<getExtensionManager> list = this.onNavigationEvent;
            List<getExtensionManager> list2 = this.onWarmupCompleted;
            List<getExtensionManager> list3 = this.onExtraCallback;
            Map<String, Boolean> map = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(View.getDefaultSize(0, 0), 21 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (61914 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(list);
            Object[] objArr2 = new Object[1];
            a(22 - KeyEvent.normalizeMetaState(0), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) View.getDefaultSize(0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(list2);
            Object[] objArr3 = new Object[1];
            a(37 - (ViewConfiguration.getEdgeSlop() >> 16), 13 - KeyEvent.getDeadChar(0, 0), (char) View.MeasureSpec.getSize(0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(list3);
            Object[] objArr4 = new Object[1];
            a(49 - ExpandableListView.getPackedPositionChild(0L), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (17059 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(map);
            Object[] objArr5 = new Object[1];
            a(65 - (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 1, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
            sb.append(((String) objArr5[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackStub + 27;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull List<getExtensionManager> list, @NotNull List<getExtensionManager> list2, @NotNull List<getExtensionManager> list3, @NotNull Map<String, Boolean> map) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.onNavigationEvent = list;
            this.onWarmupCompleted = list2;
            this.onExtraCallback = list3;
            this.IAuthTabCallback = map;
        }

        public final List<getExtensionManager> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 51;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            List<getExtensionManager> list = this.onNavigationEvent;
            int i5 = i2 + 93;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<getExtensionManager> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 29;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<getExtensionManager> list = this.onWarmupCompleted;
            int i4 = i3 + 21;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }

        public final List<getExtensionManager> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 75;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            List<getExtensionManager> list = this.onExtraCallback;
            int i5 = i2 + 1;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public final Map<String, Boolean> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 63;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            Map<String, Boolean> map = this.IAuthTabCallback;
            int i5 = i3 + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        private static void a(int i, int i2, char c, Object[] objArr) {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 43;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallbackWithResult[i + i6]), i6, asInterface, c);
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
            String str = new String(cArr);
            int i7 = $10 + 41;
            $11 = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class onNavigationEvent extends internalStart {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final Throwable onExtraCallbackWithResult;
        private static char[] onNavigationEvent = {64966, 64922, 64984, 64990, 64978, 64923, 64991, 64987, 64985, 64961, 64989, 64982, 64986, 65013, 64988, 64910};
        private static char IAuthTabCallback = 51245;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i6 = i2 + 53;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i7 = i4 + 17;
                onWarmupCompleted = i7 % 128;
                return i7 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onNavigationEvent) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i8 = onExtraCallback + 71;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Throwable th = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                return th.hashCode();
            }
            th.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            Throwable th = this.onExtraCallbackWithResult;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{'\f', 5, 14, 4, 1, '\b', '\t', 7, '\b', '\n', '\n', '\r', 11, '\r'}, (byte) (47 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 14 - View.resolveSize(0, 0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(th);
            Object[] objArr2 = new Object[1];
            a(new char[]{13862}, (byte) (TextUtils.getCapsMode("", 0, 0) + 115), (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallbackWithResult = th;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) {
            char[] cArr2;
            int i2;
            int i3;
            int i4;
            int i5;
            char[] cArr3;
            int length;
            char[] cArr4;
            int i6;
            int i7 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr5 = onNavigationEvent;
            int i8 = 0;
            int i9 = 1;
            if (cArr5 != null) {
                int i10 = $11 + 37;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    length = cArr5.length;
                    cArr4 = new char[length];
                    i6 = 1;
                } else {
                    length = cArr5.length;
                    cArr4 = new char[length];
                    i6 = 0;
                }
                while (i6 < length) {
                    cArr4[i6] = PKCS58.onNavigationEvent.z(cArr5[i6]);
                    i6++;
                }
                int i11 = $10 + 83;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2 = cArr4;
            } else {
                cArr2 = cArr5;
            }
            char cZ = PKCS58.onNavigationEvent.z(IAuthTabCallback);
            char[] cArr6 = new char[i];
            if (i % 2 != 0) {
                int i13 = i - 1;
                cArr6[i13] = (char) (cArr[i13] - b);
                int i14 = $10 + 109;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                i2 = i13;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i9];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i16 = $10 + 65;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i9] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        i3 = i2;
                        cArr3 = cArr6;
                        i4 = i9;
                        i5 = i8;
                    } else {
                        i3 = i2;
                        char[] cArr7 = cArr6;
                        i4 = i9;
                        i5 = i8;
                        if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i18 = $11 + 33;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                            int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3 = cArr7;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        } else {
                            cArr3 = cArr7;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i21 = $11 + 25;
                                $10 = i21 % 128;
                                int i22 = i21 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                                int i23 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i24 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i23];
                                cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i24];
                            } else {
                                int i25 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i26 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i25];
                                cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i26];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    cArr6 = cArr3;
                    i2 = i3;
                    i9 = i4;
                    i8 = i5;
                }
            }
            char[] cArr8 = cArr6;
            int i27 = i8;
            int i28 = i27;
            while (i28 < i) {
                int i29 = $11 + 123;
                $10 = i29 % 128;
                if (i29 % 2 != 0) {
                    cArr8[i28] = (char) (cArr8[i28] ^ 11475);
                    i28 += 22;
                } else {
                    cArr8[i28] = (char) (cArr8[i28] ^ 13722);
                    i28++;
                }
            }
            objArr[i27] = new String(cArr8);
        }
    }
}
