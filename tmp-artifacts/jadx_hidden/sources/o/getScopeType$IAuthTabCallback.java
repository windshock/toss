package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import o.s3;
import o.s5a;

/* loaded from: classes.dex */
public final class getScopeType$IAuthTabCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    public static final /* synthetic */ getScopeType$IAuthTabCallback onExtraCallback;
    private static final List<String> onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static long onWarmupCompleted;

    private getScopeType$IAuthTabCallback() {
    }

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new getScopeType$IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{15169, 57291, 62030, 38648, 43388, 19866, 24593, 1193, 7993, 12881, 54979, 59758, 36342, 40982, 17556, 24358}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58511, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{15169, 10167, 694, 28044, 18572, 44014, 38649, 61925, 56537, 16349, 6699, 1338, 24614, 17154, 44556, 35194, 62587, 55137, 12848}, (Process.myPid() >> 22) + 7411, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{15169, 18153, 49162, 16978, 52724, 20272, 51525, 21755, 54825, 20547, 54167, 23844, 57164, 23188, 58417, 26211, 57750, 25376, 60796, 26774, 60100, 29804, 63365, 29137}, Color.green(0) + 32173, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(ExpandableListView.getPackedPositionChild(0L) + 31, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new char[]{15169, 4307, 27774, 47504, 38172, 58018, 16065, 2662, 26601, 45848, 34983, 58427, 12361, 3563, 22815, 46728, 33335, 56908, 11230, 1908, 23706, 43062, 34225, 53697, 11637, 31480, 22038, 41899, 65497, 52045, 8435, 31753, 18877, 42284, 61780}, ExpandableListView.getPackedPositionChild(0L) + 11160, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{15192, 65056, 45485, 27423, 11935, 57358, 39913, 23919, 4345, 51780, 36291, 18252, 31277, 15805, 63287, 43660, 27665, 10117, 55649, 40169}, 50548 - ExpandableListView.getPackedPositionChild(0L), objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(new char[]{15175, 14692, 16186, 15816, 13205, 12718, 13945, 13364, 10964, 10394, 11945, 9072, 8484, 10188, 9612}, 563 - View.resolveSizeAndState(0, 0, 0), objArr7);
        String strIntern7 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new char[]{15184, 7976, 29610, 22074, 43684, 36108, 57757, 50202, 6287, 29446, 22507, 43635, 36583, 57697, 50635, 6208, 31951, 22350}, 9337 - ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
        String strIntern8 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51230), TextUtils.getTrimmedLength("") + 30, objArr9);
        String strIntern9 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b((ViewConfiguration.getWindowTouchSlop() >> 8) + 19, (char) (32735 - Drawable.resolveOpacity(0, 0)), KeyEvent.keyCodeFromString("") + 52, objArr10);
        String strIntern10 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b(14 - TextUtils.getOffsetAfter("", 0), (char) (2639 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 71 - (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
        String strIntern11 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 13, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.blue(0) + 85, objArr12);
        onExtraCallbackWithResult = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, ((String) objArr12[0]).intern()});
        int i = IAuthTabCallbackStub + 111;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 67;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) % (IAuthTabCallback - 5407414049857832247L);
            } else {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (5407414049857832247L ^ IAuthTabCallback) ^ s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 63;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $11 + 123;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i5] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i2 >>> i5]), i5, onWarmupCompleted, c);
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i2 + i6]), i6, onWarmupCompleted, c);
            }
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = -6232000364490605021L;
        onNavigationEvent = new char[]{60801, 56744, 36296, 32017, 11568, 7501, 52355, 48307, 27889, 23579, 3129, 64610, 44941, 40892, 20469, 16133, 61255, 57191, 36504, 32453, 12006, 7689, 52803, 48758, 27061, 22986, 2559, 63791, 43346, 39194, 9615, 5538, 17887, 46346, 58671, 54610, 1180, 29869, 42213, 37912, 50225, 13434, 26517, 22451, 34799, 63258, 10068, 5988, 18066, 46796, 59123, 54802, 37464, 41570, 61968, 730, 21225, 25246, 45911, 50038, 4910, 9172, 29676, 33707, 53342, 57441, 12348, 16587, 36996, 41128, 61791, 59337, 55288, 34710, 30539, 10094, 5912, 50880, 46826, 26287, 22083, 1642, 63025, 42444, 38388, 60807, 56752, 36291, 32007, 11579, 7497, 52383, 48308, 27901, 23575, 3106, 64611};
        onWarmupCompleted = -2007263571845980680L;
    }
}
