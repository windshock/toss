package im.toss.tds.compose.foundation.anim.rally;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access15300;
import o.createUShort;
import o.getSupportedHighSpeedResolutionsFor;
import o.setByteOrder;
import o.setUseCaseDetached;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyData {
    private static int onMessageChannelReady = 1;
    private static int onMinimized;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallbackDefault;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallbackStub;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback_Parcel;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 access000;
    private final CameraPresenceProviderExternalSyntheticLambda6 access100;
    private final CameraPresenceProviderExternalSyntheticLambda6 asBinder;
    private final CameraPresenceProviderExternalSyntheticLambda6 asInterface;
    private final CameraPresenceProviderExternalSyntheticLambda6 extraCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 extraCallbackWithResult;
    private final CameraPresenceProviderExternalSyntheticLambda6 getInterfaceDescriptor;
    private final CameraPresenceProviderExternalSyntheticLambda6 onExtraCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 onExtraCallbackWithResult;
    private final CameraPresenceProviderExternalSyntheticLambda6 onNavigationEvent;
    private final im.toss.tds.foundation.anim.rally.Rally onTransact;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;
    private final CameraPresenceProviderExternalSyntheticLambda6 readTypedObject;
    private final CameraPresenceProviderExternalSyntheticLambda6 writeTypedObject;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | i3)) | i8;
        int i10 = ~i4;
        int i11 = ~(i10 | i5);
        int i12 = i8 | i11 | (~(i10 | i3));
        int i13 = (~((~i3) | i10)) | i8 | i11;
        int i14 = i5 + i4 + i6 + ((-369695973) * i2) + (1794320298 * i);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i5) + 1478230016 + (776760710 * i4) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i6) + (217841664 * i2) + ((-410517504) * i) + ((-175177728) * i15);
        int i17 = ((i5 * 1872133577) - 2052485254) + (i4 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i6 * 1872134975) + (i2 * (-1328892763)) + (i * (-1296121642)) + (i15 * (-1691287552));
        int i18 = i16 + (i17 * i17 * (-1729036288));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public RallyData(@NotNull im.toss.tds.foundation.anim.rally.Rally rally, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda62, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda63, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda64, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda65, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda66, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda67, @NotNull CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda68, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda69, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda610, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda611, @NotNull CameraPresenceProviderExternalSyntheticLambda6<createUShort> cameraPresenceProviderExternalSyntheticLambda612, @NotNull CameraPresenceProviderExternalSyntheticLambda6<setUseCaseDetached> cameraPresenceProviderExternalSyntheticLambda613, @NotNull CameraPresenceProviderExternalSyntheticLambda6<AvoidCaptureProcessProgressAvailabilityCheckQuirk> cameraPresenceProviderExternalSyntheticLambda614, @NotNull CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda615, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda616, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda617, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda618) {
        Intrinsics.checkNotNullParameter(rally, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda62, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda63, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda64, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda65, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda66, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda67, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda68, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda69, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda610, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda611, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda612, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda613, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda614, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda615, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda616, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda617, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda618, "");
        this.onTransact = rally;
        this.extraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda6;
        this.ICustomTabsCallback = cameraPresenceProviderExternalSyntheticLambda62;
        this.readTypedObject = cameraPresenceProviderExternalSyntheticLambda63;
        this.writeTypedObject = cameraPresenceProviderExternalSyntheticLambda64;
        this.access000 = cameraPresenceProviderExternalSyntheticLambda65;
        this.access100 = cameraPresenceProviderExternalSyntheticLambda66;
        this.onExtraCallback = cameraPresenceProviderExternalSyntheticLambda67;
        this.onExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda68;
        this.asBinder = cameraPresenceProviderExternalSyntheticLambda69;
        this.IAuthTabCallbackStub = cameraPresenceProviderExternalSyntheticLambda610;
        this.asInterface = cameraPresenceProviderExternalSyntheticLambda611;
        this.extraCallback = cameraPresenceProviderExternalSyntheticLambda612;
        this.IAuthTabCallbackStubProxy = cameraPresenceProviderExternalSyntheticLambda613;
        this.IAuthTabCallback_Parcel = cameraPresenceProviderExternalSyntheticLambda614;
        this.getInterfaceDescriptor = cameraPresenceProviderExternalSyntheticLambda615;
        this.onNavigationEvent = cameraPresenceProviderExternalSyntheticLambda616;
        this.IAuthTabCallbackDefault = cameraPresenceProviderExternalSyntheticLambda617;
        this.IAuthTabCallback = cameraPresenceProviderExternalSyntheticLambda618;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AnimateState.CANCELED, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimateState {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimateState[] $VALUES;
        public static final AnimateState CANCELED;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        public static final AnimateState PAUSED;
        public static final AnimateState PLAYING;
        private static int asBinder = 1;
        private static int asInterface;
        private static char onExtraCallback;
        private static char onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static char onWarmupCompleted;

        private static final /* synthetic */ AnimateState[] $values() {
            int i = 2 % 2;
            int i2 = asBinder + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            AnimateState[] animateStateArr = {PLAYING, CANCELED, PAUSED};
            int i5 = i3 + 101;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return animateStateArr;
            }
            throw null;
        }

        public static EnumEntries<AnimateState> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static AnimateState valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            AnimateState animateState = (AnimateState) Enum.valueOf(AnimateState.class, str);
            if (i3 != 0) {
                return animateState;
            }
            throw null;
        }

        public static AnimateState[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            AnimateState[] animateStateArr = (AnimateState[]) $VALUES.clone();
            int i3 = onNavigationEvent + 3;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return animateStateArr;
        }

        private AnimateState(String str, int i) {
        }

        static {
            onExtraCallbackWithResult();
            PLAYING = new AnimateState("PLAYING", 0);
            Object[] objArr = new Object[1];
            a(new char[]{30928, 30654, 11097, 58345, 25109, 56115, 24247, 64522}, 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            CANCELED = new AnimateState(((String) objArr[0]).intern(), 1);
            PAUSED = new AnimateState("PAUSED", 2);
            AnimateState[] animateStateArr$values = $values();
            $VALUES = animateStateArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(animateStateArr$values);
            int i = IAuthTabCallbackDefault + 63;
            asInterface = i % 128;
            int i2 = i % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $10 + 87;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(IAuthTabCallback);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9;
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, i10, iKeyCodeFromString, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, 12435 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.getOffsetBefore("", 0)), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i11 = $10 + 79;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = (char) 56981;
            onExtraCallback = (char) 24338;
            onExtraCallbackWithResult = (char) 41466;
            IAuthTabCallback = (char) 2916;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RallyData rallyData = (RallyData) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 51;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iICustomTabsService = rallyData.onTransact.ICustomTabsService();
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = onMessageChannelReady + 27;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(iICustomTabsService);
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 97;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.onTransact, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i4 != 0) {
        } else {
            int i5 = 68 / 0;
        }
    }

    public final RallyData access000() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 49;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            AnimateState animateState = AnimateState.CANCELED;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onExtraCallbackWithResult() == AnimateState.CANCELED) {
            onNavigationEvent(0);
        }
        onExtraCallback(AnimateState.PLAYING);
        int i3 = onMessageChannelReady + 63;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RallyData rallyData = (RallyData) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        rallyData.onExtraCallback(AnimateState.CANCELED);
        int i4 = onMessageChannelReady + 101;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return rallyData;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RallyData rallyData = (RallyData) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 111;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) rallyData.extraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
        int i4 = onMessageChannelReady + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fFloatValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.ICustomTabsCallback.onExtraCallbackWithResult()).floatValue();
        int i4 = onMessageChannelReady + 111;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.access000.onExtraCallbackWithResult()).floatValue();
        int i4 = onMessageChannelReady + 23;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            float fFloatValue = ((Number) this.access100.onExtraCallbackWithResult()).floatValue();
            int i3 = onMessageChannelReady + 79;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                return fFloatValue;
            }
            obj.hashCode();
            throw null;
        }
        ((Number) this.access100.onExtraCallbackWithResult()).floatValue();
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onExtraCallback.onExtraCallbackWithResult()).floatValue();
        int i4 = onMessageChannelReady + 25;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 81;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.asBinder.onExtraCallbackWithResult()).floatValue();
        int i4 = onMessageChannelReady + 75;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 47;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).floatValue();
        int i4 = onMinimized + 67;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallbackDefault() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            fFloatValue = ((Number) this.asInterface.onExtraCallbackWithResult()).floatValue();
            int i3 = 0 / 0;
        } else {
            fFloatValue = ((Number) this.asInterface.onExtraCallbackWithResult()).floatValue();
        }
        int i4 = onMessageChannelReady + 13;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = onMinimized + 47;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            long jOnNavigationEvent = ((createUShort) this.extraCallback.onExtraCallbackWithResult()).onNavigationEvent();
            int i3 = onMinimized + 61;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            return jOnNavigationEvent;
        }
        ((createUShort) this.extraCallback.onExtraCallbackWithResult()).onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            float fFloatValue = ((Number) this.onNavigationEvent.onExtraCallbackWithResult()).floatValue();
            int i3 = onMinimized + 15;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 21 / 0;
            }
            return fFloatValue;
        }
        ((Number) this.onNavigationEvent.onExtraCallbackWithResult()).floatValue();
        throw null;
    }

    public final AnimateState onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 91;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
            return (AnimateState) this.onWarmupCompleted.onExtraCallbackWithResult();
        }
        return (AnimateState) this.onWarmupCompleted.onExtraCallbackWithResult();
    }

    public final void onExtraCallback(@NotNull AnimateState animateState) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 83;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(animateState, "");
            this.onWarmupCompleted.IAuthTabCallback(animateState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(animateState, "");
        this.onWarmupCompleted.IAuthTabCallback(animateState);
        int i3 = onMinimized + 67;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
    }

    public final RallyData onNavigationEvent() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (RallyData) onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, 92794202, -92794202, iOnNavigationEvent2);
    }

    public final int onWarmupCompleted() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Integer) onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, 1381178092, -1381178090, iOnNavigationEvent2)).intValue();
    }

    public final float IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Float) onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, -1828117382, 1828117383, iOnNavigationEvent2)).floatValue();
    }
}
