package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import im.toss.core.webkit.bridge.RemoveHighlightV3Handler;
import im.toss.core.webkit.bridge.RequestPermissionHandler;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceQualities implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private final Map<String, Class<? extends drawTextBox>> IAuthTabCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private static final byte[] $$a = {40, AbstractSmartcard.BYTE_RESPONSE_LENGTH, -113, 75};
    private static final int $$b = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static char[] onWarmupCompleted = {17504, 47227, 48206, 45150, 46113, 43055, 44050, 41212, 42199, 39128, 40121, 37030, 43820, 22307, 21272, 24340, 23361, 18266, 17233, 20410, 19352, 30602, 29667, 32746, 31680, 26165, 25093, 28178, 27245, 60860, 4521, 5528, 6541, 7626, 465, 1498, 2353, 3347, 12545, 13672, 14689, 15691, 8382, 9358, 10393, 11494, 56683, 8553, 9540, 10615, 11583, 12565, 13584, 14833, 15850, 457, 1462, 2486, 3469, 4207, 5224, 6257, 7222, 24621, 25618, 26632, 27885, 28888, 60861, 4531, 5551, 6559, 7661, 448, 1481, 2314, 3345, 12550, 13678, 14701, 15703, 8376, 9353, 10390, 11509, 20706, 21712, 22733, 23584, 60839, 4520, 5523, 6559, 7622, 450, 1477, 2364, 3347, 12549};
    private static long onNavigationEvent = 8519774107590529472L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = s * 3;
        int i4 = (i * 3) + 97;
        byte[] bArr = $$a;
        int i5 = 3 - (b * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            int i8 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i5 = bArr[i8];
            i4 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            int i82 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            int i822 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    public FaceQualities() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.IAuthTabCallback = linkedHashMap;
        this.onExtraCallback = access8100.onNavigationEvent();
        this.onExtraCallbackWithResult = linkedHashMap.size();
        linkedHashMap.put("requestAccessibilityFocus", stopTimer.class);
        linkedHashMap.put("getFontScale", ALCTimerLabel1.class);
        linkedHashMap.put("getContactsPermission", startTimer.class);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getEdgeSlop() >> 16, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43480), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), ALCTimerLabelExternalSyntheticLambda0.class);
        linkedHashMap.put("copyToClipboard", getBytesToBitmap.class);
        linkedHashMap.put("cropImage", flippingBitmap.class);
        linkedHashMap.put("generateFeedback", getFaceBitmap.class);
        linkedHashMap.put("generateHapticFeedback", ALCFaceClip.class);
        linkedHashMap.put("getColorSchemePreference", changeBitmapContrastBrightness.class);
        linkedHashMap.put("showHighlight", base64StringImage.class);
        linkedHashMap.put("showHighlightV3", getFaceBitmapToByteArray.class);
        Object[] objArr2 = new Object[1];
        a(12 - Color.blue(0), ExpandableListView.getPackedPositionGroup(0L) + 17, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18058), objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), getImageToBitmap.class);
        Object[] objArr3 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 29, 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), objArr3);
        linkedHashMap.put(((String) objArr3[0]).intern(), getImageToBitmap.class);
        linkedHashMap.put("playNotificationSound", getFaceYuvToByteArray.class);
        linkedHashMap.put("removeHighlightV3", RemoveHighlightV3Handler.class);
        linkedHashMap.put("requestContactsPermission", RequestPermissionHandler.class);
        linkedHashMap.put("setBackPressHandler", ALCImageUtil.class);
        linkedHashMap.put("setPageReady", croppedFace.class);
        linkedHashMap.put("setScreenBrightness", cropBitmap.class);
        Object[] objArr4 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 47, 'F' - AndroidCharacter.getMirror('0'), (char) (12492 - (Process.myTid() >> 22)), objArr4);
        linkedHashMap.put(((String) objArr4[0]).intern(), cropImage.class);
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 68, 21 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
        linkedHashMap.put(((String) objArr5[0]).intern(), cropImage.class);
        Object[] objArr6 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 89, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, (char) View.resolveSizeAndState(0, 0, 0), objArr6);
        linkedHashMap.put(((String) objArr6[0]).intern(), decodeNV21.class);
        linkedHashMap.put("showPointToast", degreeToRadians.class);
        linkedHashMap.put("testActivityResults", ALCTimerLabelCallBack.class);
        linkedHashMap.put("updateHistoryState", dpToPx.class);
        linkedHashMap.put("addAccessoryButton", imageBase64String.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallback;
        int i5 = i2 + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.IAuthTabCallback.get(str);
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
            setKeySet = this.IAuthTabCallback.keySet();
        }
        return setKeySet;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getTapTimeout() >> 16) + 17, 10973 - View.combineMeasuredStates(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 46134), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49122), 44 - TextUtils.getOffsetAfter("", 0), ImageFormat.getBitsPerPixel(0) + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 1;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.combineMeasuredStates(0, 0)), TextUtils.lastIndexOf("", '0') + 45, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 84 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49123), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1494 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }
}
