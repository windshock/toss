package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ReadableNativeMapkeySetIterator1;
import o.RuntimeScheduler;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNameDistinguisher extends getSemanticsIdentifier {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long extraCommand = -3438355718062632922L;
    private static long newSession = -6356961677935456724L;
    private static int newSessionWithExtras = 0;
    private static int postMessage = 1;

    public static /* synthetic */ Unit IAuthTabCallback(String str, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 83;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(str, startrunning);
        }
        onExtraCallbackWithResult(str, startrunning);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(startrunning);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = postMessage + 23;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = postMessage + 7;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i4 = postMessage + 17;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(newSession ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(newSession)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45812), KeyEvent.keyCodeFromString("") + 84, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 14185), TextUtils.indexOf("", "", 0, 0) + 19, TextUtils.indexOf((CharSequence) "", '0') + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 39;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 42 / 0;
            objArr[0] = str;
        }
    }

    @Override // o.getSemanticsIdentifier
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new InvokeScrapingMessageHandler$.ExternalSyntheticLambda0());
        int i2 = newSessionWithExtras + 31;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (o.filterCreatePageParams.onNavigationEvent(android.net.Uri.parse(r13)) != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0133, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (o.filterCreatePageParams.onNavigationEvent(android.net.Uri.parse(r13)) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean onExtraCallbackWithResult(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNameDistinguisher.onExtraCallbackWithResult(java.lang.String, java.lang.String):boolean");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 19;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-16777192) - Color.rgb(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (extraCommand ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 59, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit IAuthTabCallback(startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        c(new char[]{5492, 54356, 38669, 22235, 4543}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49463, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c(new char[]{5474, 57905, 64485, 61617, 51309, 49450, 57052, 55217, 44923, 42022, 48592, 35481, 33350, 39721, 37086, 27025, 24913, 32278, 30686}, 63299 - TextUtils.getOffsetAfter("", 0), objArr2);
        jsonObject.addProperty(strIntern, ((String) objArr2[0]).intern());
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        startrunning.onNavigationEvent(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i2 = postMessage + 63;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        c(new char[]{5492, 54356, 38669, 22235, 4543}, 49463 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d(new char[]{1150, 9204, 29754, 32045, 1053, 38584, 7711, 25132, 53392, 43547, 19092, 36481, 44305, 32181, 26398, 46354, 31114, 4411, 37769, 57790, 22049, 9392, 51221, 3104, 8863, 63549, 58516, 14482, 65306, 37809, 4372, 26404, 52123, 42800}, View.combineMeasuredStates(0, 0), objArr2);
        jsonObject.addProperty(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        d(new char[]{28670, 49724, 28293, 956, 28563, 30585, 1206, 7343, 47903, 19451, 20512}, Process.myTid() >> 22, objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), str);
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        startrunning.onNavigationEvent(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i2 = newSessionWithExtras + 107;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        JsonArray asJsonArray;
        int i;
        JsonObject jsonObject2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity == null) {
            return;
        }
        Object[] objArr = new Object[1];
        d(new char[]{18640, 61023, 23677, 28173, 18595, 23324, 13903, 28932, 39968, 26507, 25320, 40351, 57788}, View.combineMeasuredStates(0, 0), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        d(new char[]{40416, 60829, 17711, 53168, 40336, 22748, 12054, 53436, 18703, 25692, 31627}, ExpandableListView.getPackedPositionType(0L), objArr2);
        JsonObject jsonObject3 = (JsonObject) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2139313042, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2139313040, new Object[]{settext, ((String) objArr2[0]).intern(), null, 2, null});
        JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
        Object[] objArr3 = new Object[1];
        d(new char[]{6302, 48250, 34931, 34704, 6395, 2338, 57936, 39068, 52331, 13758, 46806, 29730, 45563, 57897, 39772, 20357, 25964, 36537, 28630, 6915}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr3);
        JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr3[0]).intern());
        if (jsonElement != null) {
            asJsonArray = jsonElement.getAsJsonArray();
            int i3 = postMessage + 81;
            newSessionWithExtras = i3 % 128;
            int i4 = i3 % 2;
        } else {
            asJsonArray = null;
        }
        Object[] objArr4 = new Object[1];
        c(new char[]{5490, 55499, 36363, 31820, 9119, 4567, 50960, 46439}, 52666 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        c(new char[]{5478, 33757, 14369, 54972, 20444, 58425, 37520, 3015, 41021}, 38569 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        Object[] objArr6 = new Object[1];
        c(new char[]{5478, 35527, 10773, 51806, 27572, 2827, 43860, 18596, 59643, 34869, 10633, 51657, 26905, 2403, 44690, 19976}, KeyEvent.keyCodeFromString("") + 40883, objArr6);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr6[0]).intern(), "");
        String strIAuthTabCallbackStub = settext.IAuthTabCallbackStub();
        String str2 = (String) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1888845477, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1888845477, new Object[]{settext});
        if (strOnNavigationEvent.length() == 0) {
            settopguidebackgroundcolor.onNavigationEvent(strOnNavigationEvent2, new InvokeScrapingMessageHandler$.ExternalSyntheticLambda1());
            return;
        }
        Object[] objArr7 = new Object[1];
        d(new char[]{48111, 1222, 3211, 40915, 48031, 45449, 26299, 32966, 28447, 36133, 12842, 27715, 4763, 23187, 8121, 22486}, ViewConfiguration.getScrollBarSize() >> 8, objArr7);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr7[0]).intern(), false})).booleanValue();
        ReadableNativeMapkeySetIterator1.onExtraCallback onextracallback = ReadableNativeMapkeySetIterator1.Companion;
        JsonObject jsonObjectOnExtraCallbackWithResult2 = settext.onExtraCallbackWithResult();
        Object[] objArr8 = new Object[1];
        c(new char[]{5490, 1760, 12878, 12199, 23307, 30543, 24785, 39958, 35222, 42485, 53591}, View.combineMeasuredStates(0, 0) + 5021, objArr8);
        JsonObject jsonObject4 = jsonObjectOnExtraCallbackWithResult2.get(((String) objArr8[0]).intern());
        if (jsonObject4 instanceof JsonObject) {
            jsonObject2 = jsonObject4;
            int i5 = newSessionWithExtras + 9;
            postMessage = i5 % 128;
            i = 2;
            int i6 = i5 % 2;
        } else {
            i = 2;
            jsonObject2 = null;
        }
        ReadableNativeMapkeySetIterator1 readableNativeMapkeySetIterator1OnWarmupCompleted = onextracallback.onWarmupCompleted(jsonObject2);
        if (readableNativeMapkeySetIterator1OnWarmupCompleted != null) {
            int i7 = postMessage + 1;
            newSessionWithExtras = i7 % 128;
            int i8 = i7 % i;
            String strOnWarmupCompleted = readableNativeMapkeySetIterator1OnWarmupCompleted.onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr9 = new Object[1];
                d(new char[]{21053, 47725, 60294, 16999, 21067, 3876, 33193, 23915, 34524, 13241, 54575, 45544, 64339}, TextUtils.getOffsetAfter("", 0), objArr9);
                Pair[] pairArr = {getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), strOnWarmupCompleted)};
                Object[] objArr10 = new Object[1];
                d(new char[]{17509, 43376, 61409, 55290, 17420, 7230, 34263, 51445, 37006, 8373, 53618, 9337, 60695, 63281, 64721, 8179, 14731, 39863}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
                String strIntern = ((String) objArr10[0]).intern();
                Object[] objArr11 = new Object[1];
                d(new char[]{1150, 9204, 29754, 32045, 1053, 38584, 7711, 25132, 53392, 43547, 19092, 36481, 44305, 32181, 26398, 46354, 31114, 4411, 37769, 57790, 22049, 9392, 51221, 3104, 8863, 63549, 58516, 14482, 65306, 37809, 4372, 26404, 52123, 42800}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr11);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr11[0]).intern(), (Throwable) null, access8100.IAuthTabCallback(pairArr), 4, (Object) null);
                settopguidebackgroundcolor.onNavigationEvent(strOnNavigationEvent2, new InvokeScrapingMessageHandler$.ExternalSyntheticLambda2(strOnWarmupCompleted));
                int i9 = newSessionWithExtras + 105;
                postMessage = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        RuntimeScheduler.onExtraCallbackWithResult onextracallbackwithresult = RuntimeScheduler.Companion;
        TossCoreWebView webView = webViewContentOwner.getWebView();
        Intrinsics.checkNotNull(webView);
        onextracallbackwithresult.onWarmupCompleted(webViewContentOwner, webView, strOnNavigationEvent, jsonObject3, asJsonArray, strOnNavigationEvent3, strIAuthTabCallbackStub, str2, new onExtraCallbackWithResult(webViewContentOwner, strOnNavigationEvent, strOnNavigationEvent2, activity), readableNativeMapkeySetIterator1OnWarmupCompleted, zBooleanValue, strOnNavigationEvent4);
    }
}
