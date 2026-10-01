package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import o.getBuildFingerprint;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class needWaitIpc implements getBuildFingerprint.onExtraCallback {
    public static final needWaitIpc IAuthTabCallback = new needWaitIpc();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private needWaitIpc() {
    }

    public /* synthetic */ TimeMark onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setMemoryMappings IAuthTabCallback() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(SystemClock.elapsedRealtime());
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    static final class onExtraCallbackWithResult implements setMemoryMappings {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final long onExtraCallback;
        private static char[] onExtraCallbackWithResult = {64984, 64993, 65066, 64982, 64915, 64988, 64980, 64979, 64923, 64976, 65022, 64981, 65065, 65067, 64991, 64966, 64960, 65008, 65069, 64989, 64967, 64905, 64992, 64986, 64910, 64922, 65068, 64963, 64983, 64977, 64987, 64990, 65064, 65014, 64978, 64961};
        private static char IAuthTabCallback = 51247;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i5 = i3 + 41;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            if (this.onExtraCallback != ((onExtraCallbackWithResult) obj).onExtraCallback) {
                int i6 = i3 + 35;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = i3 + 9;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Long.hashCode(this.onExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = Long.hashCode(this.onExtraCallback);
            int i3 = onNavigationEvent + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            long j = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{' ', 15, '!', 28, 15, 4, 25, 4, 4, '!', 20, 26, 19, '#', 4, '\t', '#', 30, 2, 6, 2, 15, '!', 28, 15, 4, '\"', 16, 20, 17, 17, 20, '\f', 28}, (byte) (58 - TextUtils.getTrimmedLength("")), 35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(j);
            Object[] objArr2 = new Object[1];
            a(new char[]{13777}, (byte) (31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onExtraCallbackWithResult(long j) {
            this.onExtraCallback = j;
        }

        public /* synthetic */ int compareTo(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = onExtraCallback((setMemoryMappings) obj);
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iOnExtraCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ long onNavigationEvent(setMemoryMappings setmemorymappings) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            long jIAuthTabCallback = IAuthTabCallback(setmemorymappings);
            int i4 = onNavigationEvent + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return jIAuthTabCallback;
        }

        public long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            return setCommandLine.IAuthTabCallback(i3 != 0 ? SystemClock.elapsedRealtime() / this.onExtraCallback : SystemClock.elapsedRealtime() - this.onExtraCallback, setRevision.MILLISECONDS);
        }

        public long IAuthTabCallback(@NotNull setMemoryMappings setmemorymappings) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setmemorymappings, "");
                boolean z = setmemorymappings instanceof onExtraCallbackWithResult;
                throw null;
            }
            Intrinsics.checkNotNullParameter(setmemorymappings, "");
            if (setmemorymappings instanceof onExtraCallbackWithResult) {
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jIAuthTabCallback = setCommandLine.IAuthTabCallback(this.onExtraCallback - ((onExtraCallbackWithResult) setmemorymappings).onExtraCallback, setRevision.MILLISECONDS);
                int i3 = onNavigationEvent + 75;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 84 / 0;
                }
                return jIAuthTabCallback;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{21, 16, 26, 23, 30, '#', '\b', 21, 18, 20, '\n', 0, 11, 5, 3, '\n', 1, '#', 28, '!', 5, 29, 18, 7, 2, 22, 19, '#', 4, 5, ' ', '#', 30, 5, 22, '\n', 17, 5, 1, '#', '\n', '\"', 29, 17, '\t', 5, '!', 5, 20, 21, 2, 22, 19, '#', 4, 5, 17, 4, 17, '!', 15, '\t', 22, '\n', 22, 17, 1, 22, 2, 23, 3, 28, 4, 17, 17, 22, 26, 17, '\t', 27, 13834}, (byte) ((Process.myPid() >> 22) + 80), TextUtils.indexOf((CharSequence) "", '0', 0) + 82, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(this);
            Object[] objArr2 = new Object[1];
            a(new char[]{'\n', 4, 22, 25, 13807}, (byte) (53 - (Process.myTid() >> 22)), (Process.myTid() >> 22) + 5, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(setmemorymappings);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public int onExtraCallback(@NotNull setMemoryMappings setmemorymappings) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setmemorymappings, "");
            if (setmemorymappings instanceof onExtraCallbackWithResult) {
                int i4 = onNavigationEvent + 11;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return Intrinsics.compare(this.onExtraCallback, ((onExtraCallbackWithResult) setmemorymappings).onExtraCallback);
                }
                Intrinsics.compare(this.onExtraCallback, ((onExtraCallbackWithResult) setmemorymappings).onExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{23, 11, '!', 25, '#', 30, 18, 20, '\n', 0, 21, 18, '!', 1, 1, '\"', '#', 30, 4, '\f', 5, '\n', 5, 11, '\"', 1, 29, 22, 13844, 13844, 5, '!', 1, 21, 22, 2, 21, 18, '!', 1, '\n', 22, 3, 17, '!', 11, 4, 15, 5, 22, 22, '\n', 23, 1, 22, 2, 29, 3, 13825, 13825, 29, '#', 15, 2, 22, 3}, (byte) (ExpandableListView.getPackedPositionType(0L) + 24), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 65, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(this);
            Object[] objArr2 = new Object[1];
            a(new char[]{'\n', 4, 22, 25, 13807}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 54), 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(setmemorymappings);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $10 + 73;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.getDefaultSize(0, 0) + 26, 23140 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        j = 0;
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
            try {
                Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (KeyEvent.getMaxKeyCode() >> 16) + 26, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            int i7 = $11 + 57;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 24824), Color.green(0) + 74, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), Color.red(0) + 30, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                } else {
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i14 = 0; i14 < i; i14++) {
                    int i15 = $11 + 3;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }
}
