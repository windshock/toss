package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Pose implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private final int IAuthTabCallback;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static long onNavigationEvent = 1101058248101926635L;
    private static int onWarmupCompleted = -1776194565;
    private static char IAuthTabCallbackDefault = 27643;
    private static char asBinder = '_';
    private static char onTransact = 42739;
    private static char IAuthTabCallbackStub = 48656;
    private static char asInterface = 20832;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = i2 + 109;
        int i6 = (b * 4) + 4;
        int i7 = (i * 3) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            int i9 = i6;
            int i10 = i9 + 1;
            int i11 = (-i6) + i8;
            i3 = i4;
            i5 = i11;
            i6 = i10;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i9 = i6;
            i6 = bArr[i6];
            i8 = i12;
            int i102 = i9 + 1;
            int i112 = (-i6) + i8;
            i3 = i4;
            i5 = i112;
            i6 = i102;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public Pose() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallback = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.IAuthTabCallback = linkedHashMap.size();
        linkedHashMap.put("tossSecuritiesGetTubaV2Values", getRelativeAncestorList.class);
        linkedHashMap.put("tossSecuritiesMTSNotificationConnect", onAllAnimationsComplete.class);
        Object[] objArr = new Object[1];
        a((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Process.myPid() >> 22, new char[]{5875, 43513, 42033, 46609, 38428, 19780, 28187, 5142, 59757, 51611, 18778, 38357, 18362, 21127, 8584, 18038, 19694, 54635, 21418, 59229, 25720, 28791, 63619, 48567, 46361, 54290, 50718, 62908, 25218, 56123, 8101, 53050, 57530, 2785}, new char[]{32016, 3328, 45714, 25469}, new char[]{24198, 12937, 1768, 13359}, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), getThemeData.class);
        Object[] objArr2 = new Object[1];
        a((char) TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{9299, 37582, 50563, 54087, 14037, 4195, 46817, 50137, 17016, 46496, 10643, 20343, 29800, 19661, 52165, 39480, 170, 50239, 41566, 31435, 26677, 27131, 41676, 12138, 30325, 46909, 54255, 13644, 30675, 16186, 37488, 14754, 11949, 47013}, new char[]{32016, 3328, 45714, 25469}, new char[]{46800, 56581, 18713, 22729}, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), getThemeData.class);
        Object[] objArr3 = new Object[1];
        b(new char[]{54961, 21436, 9525, 27577, 38955, 34186, 64866, 17988, 41255, 53435, 4105, 32638, 42539, 32059, 52245, 5706, 11095, 25683, 49741, 46841, 11965, 16382, 8645, 7801, 3483, 33042, 460, 62040, 6240, 6709, 26454, 15822, 54411, 30753, 43902, 44997, 12464, 47957}, 37 - (Process.myTid() >> 22), objArr3);
        linkedHashMap.put(((String) objArr3[0]).intern(), getThemeData.class);
        linkedHashMap.put("tossSecuritiesRequestPinAppWidget", prepareTextLayout.class);
        linkedHashMap.put("tossSecuritiesSetBackPressLogReferrer", prependUIBlock.class);
        linkedHashMap.put("tossSecuritiesGetViewLogReferrer", reusePreparedLayoutWithNewReactTags.class);
        linkedHashMap.put("tossSecuritiesSetViewLogReferrer", reusePreparedLayoutWithNewReactTags.class);
        linkedHashMap.put("tossSecuritiesResetViewLogReferrer", reusePreparedLayoutWithNewReactTags.class);
        linkedHashMap.put("tossSecuritiesAccountStatusChange", onRequestEventBeat.class);
        Object[] objArr4 = new Object[1];
        a((char) (ViewConfiguration.getEdgeSlop() >> 16), (-809592790) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{39616, 62585, 47336, 59815, 50381, 48235, 64790, 64739, 36784, 29818, 10636, 12585, 32737, 29485, 16298, 55217, 8035, 62322, 32590, 54098, 42641, 13602, 58581, 267, 42570, 52216, 58983, 5586, 36381, 4716, 25499, 16426, 49471}, new char[]{32016, 3328, 45714, 25469}, new char[]{11104, 48792, 28879, 51051}, objArr4);
        linkedHashMap.put(((String) objArr4[0]).intern(), onAnimationStarted.class);
        linkedHashMap.put("tossSecuritiesCertRequestSignV2", sendAccessibilityEventFromJS.class);
        linkedHashMap.put("tossSecuritiesCertRestore", setJSResponder.class);
        linkedHashMap.put("tossSecuritiesGetDeviceSession", onFabricCommitEnd.class);
        linkedHashMap.put("getKeyguardStatus", setBinding.class);
        linkedHashMap.put("tossSecuritiesLog", FabricUIManagerExternalSyntheticLambda0.class);
        linkedHashMap.put("sendNativePerformanceLog", FabricUIManagerExternalSyntheticLambda0.class);
        linkedHashMap.put("tossSecuritiesNativeEnabled", installFabricUIManager.class);
        Object[] objArr5 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), 553921924 - View.combineMeasuredStates(0, 0), new char[]{49953, 42228, 7215, 18699, 2444, 29584, 45606, 28355, 52072, 56081, 16215, 52697, 41169, 62295, 56255, 14736, 9248, 21021, 2524, 60864, 33284, 24750, 59270, 11911, 63534, 30535, 41227, 64001, 21131, 22886, 43409, 23479, 46230, 3421, 61380}, new char[]{32016, 3328, 45714, 25469}, new char[]{33935, 1069, 1825, 20618}, objArr5);
        linkedHashMap.put(((String) objArr5[0]).intern(), uninstallFabricUIManager.class);
        Object[] objArr6 = new Object[1];
        b(new char[]{1865, 36513, 47782, 47574, 48163, 46563, 39659, 47380, 22397, 65487, 64203, 36235, 22953, 16618, 37244, 63452, 6156, 3984, 43199, 36520, 15632, 30094, 44997, 8346, 54961, 21436, 49058, 58995, 30022, 46753, 57985, 15552, 1433, 47452, 41202, 24497}, 35 - Color.argb(0, 0, 0, 0), objArr6);
        linkedHashMap.put(((String) objArr6[0]).intern(), uninstallFabricUIManager.class);
        Object[] objArr7 = new Object[1];
        a((char) TextUtils.indexOf("", "", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{35006, 11866, 32241, 743, 1404, 8921, 206, 47704, 49853, 35021, 20689, 22639, 40811, 60771, 13179, 9097, 17444, 43906, 37145, 26737, 24814, 6384, 9512, 19097, 37979, 1851, 7913, 60930, 2442, 21407, 49610, 26940, 52948, 16721, 55169, 24329, 38599, 12625}, new char[]{32016, 3328, 45714, 25469}, new char[]{43342, 5036, 7054, 16899}, objArr7);
        linkedHashMap.put(((String) objArr7[0]).intern(), uninstallFabricUIManager.class);
        linkedHashMap.put("tossSecuritiesOpenOptionEducationIntroVideo", FabricUIManagerMountItemDispatchListenerExternalSyntheticLambda0.class);
        linkedHashMap.put("tossSecuritiesReceiveWarmUpComplete", drainPreallocateViewsQueue.class);
        linkedHashMap.put("tossSecuritiesRefreshAccount", setConstraints.class);
        linkedHashMap.put("tossSecuritiesRefreshTermsStates", startSurfaceWithConstraints.class);
        linkedHashMap.put("tossSecuritiesScrollToTop", reportMount.class);
        linkedHashMap.put("tossSecuritiesSetGlobalAlertEnabled", driveCxxAnimations.class);
        linkedHashMap.put("tossSecuritiesShowFullScreenImage", getStateDataImpl.class);
        linkedHashMap.put("tossSecuritiesShowFullScreenMultiImage", StateWrapperImpl.class);
        linkedHashMap.put("tossSecuritiesSimpleSignAndVid", getStateDataReferenceImpl.class);
        Object[] objArr8 = new Object[1];
        a((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 61076), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1396297955, new char[]{27110, 58107, 50195, 38311, 3418, 53502, 47861, 20505, 7986, 56614, 60632, 40884, 60268, 65420, 3591, 48864, 23593, 35002, 37504, 46253, 11437, 53416, 2556, 23387, 14957, 25232, 35234, 35381, 5234}, new char[]{32016, 3328, 45714, 25469}, new char[]{7326, 50735, 38060, 58350}, objArr8);
        linkedHashMap.put(((String) objArr8[0]).intern(), stopSurfaceWithSurfaceHandler.class);
        Object[] objArr9 = new Object[1];
        a((char) (56405 - Process.getGidForName("")), 2096193439 - ExpandableListView.getPackedPositionChild(0L), new char[]{1435, 31672, 63561, 26930, 10231, 33141, 29683, 48221, 14000, 8484, 23309, 40444, 30972, 50644, 49689, 64646, 50324, 31951, 50938, 38747, 35119, 26839, 51157, 56802, 14350, 7921, 1, 35543, 28588}, new char[]{32016, 3328, 45714, 25469}, new char[]{41207, 61791, 22140, 26076}, objArr9);
        linkedHashMap.put(((String) objArr9[0]).intern(), stopSurfaceWithSurfaceHandler.class);
        Object[] objArr10 = new Object[1];
        b(new char[]{14333, 32812, 11095, 25683, 49741, 46841, 34468, 19875, 9525, 27577, 38955, 34186, 64866, 17988, 41255, 53435, 4105, 32638, 42539, 32059, 26791, 27026, 15632, 30094, 64328, 24964, 4684, 61573, 30743, 42652, 31134, 22547}, View.resolveSizeAndState(0, 0, 0) + 32, objArr10);
        linkedHashMap.put(((String) objArr10[0]).intern(), stopSurfaceWithSurfaceHandler.class);
        linkedHashMap.put("tossSecuritiesTabVisibility", startSurfaceWithSurfaceHandler.class);
        Object[] objArr11 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (-113089319) - View.MeasureSpec.getSize(0), new char[]{2735, 9780, 46688, 2606, 25746, 2023, 57706, 39438, 62814, 8342, 32951, 35648, 46261, 53989, 28647, 1668, 63238, 47856, 40218, 14907, 23732, 8705, 59131, 38264, 54257, 2010, 14993, 63144, 49532, 3084, 21485, 19134, 8338, 10146, 3554}, new char[]{32016, 3328, 45714, 25469}, new char[]{55769, 16996, 33273, 25476}, objArr11);
        linkedHashMap.put(((String) objArr11[0]).intern(), destroyState.class);
        linkedHashMap.put("tossSecuritiesUnifiedLaunchV2", getStateMapBufferDataImpl.class);
        linkedHashMap.put("tossSecuritiesUserSettingsChanged", getStateDataReference.class);
        linkedHashMap.put("tossSecuritiesUserStatusChange", getStateData.class);
        linkedHashMap.put("tossSecuritiesGetUserTokenV2", getStateDataMapBuffer.class);
        linkedHashMap.put("tossSecuritiesSaveUserTokenV2", getStateDataMapBuffer.class);
        linkedHashMap.put("tossSecuritiesDeleteUserTokenV2", getStateDataMapBuffer.class);
        linkedHashMap.put("tossSecuritiesSetUserPublicKey", _isRunning.class);
        linkedHashMap.put("tossSecuritiesWithdrawAgreement", SurfaceHandlerBinding.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onExtraCallback.get(str);
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        }
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet;
        synchronized (this) {
            setKeySet = this.onExtraCallback.keySet();
        }
        return setKeySet;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 17;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 111;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                        int offsetBefore = 12434 - TextUtils.getOffsetBefore("", i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumDrawingCacheSize, i12, offsetBefore, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (asBinder ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 16014), 14 - View.resolveSizeAndState(0, 0, 0), 19901 - TextUtils.getTrimmedLength(""), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $11 + 41;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 42 - MotionEvent.axisFromString(""), 1451 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 49075), 43 - ExpandableListView.getPackedPositionChild(0L), 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, TextUtils.getCapsMode("", 0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45848), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, 12577 - TextUtils.getCapsMode("", 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
