package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ALCFaceBox;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBarSavedState1;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.setTopGuideBackgroundColor;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestIdCardOcrHandler$onOcrResultReceived$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
    final /* synthetic */ WebViewContentOwner $contentOwner;
    final /* synthetic */ JsonObject $data;
    final /* synthetic */ int $resultCode;
    final /* synthetic */ Bundle $resultData;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    boolean Z$5;
    int label;
    final /* synthetic */ RequestIdCardOcrHandler this$0;
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] onNavigationEvent = {60855, 49375, 46956, 25990, 22620, 3762, 64967, 53266, 34467, 29980, 11157, 7721, 52569, 41947, 38525, 17605, 15188, 59836, 56517, 45932, 25075, 21524, 2733, 63858, 44035, 33511, 29054, 10124, 6691, 51389, 49117, 37413, 16564, 14089, 58793, 55518, 36692, 32166, 20491, 1693, 62774, 43073, 40645, 19822, 9093, 5656, 50365, 51526, 58401, 37780, 16758, 31997, 10844, 55599, 62633, 41498, 33730, 44719, 55580, 3065, 13942, 24797, 37810, 48651, 59529, 7024, 17890, 28736, 41754, 52644, 63494, 11002, 21870, 60857, 49375, 46968, 26019, 22545, 3751, 64975, 53335, 34498, 29980, 11153, 7735, 52553, 41925, 38026, 47598, 52825, 7346, 8505, 30612, 34009, 43364, 65498, 3125, 21126, 26369, 46206, 56051, 61275, 15750, 16912, 37032, 24068, 29543, 1227, 54789, 60321, 48412, 20038, 25571, 13657, 50849, 48118, 38557, 57630, 13266, 3666, 22760, 43904, 34316, 53434, 8963, 32212, 18553, 39703, 62868, 49214, 4810, 27997, 60859, 49360, 46917, 26008, 22542, 3753, 64986, 53266, 34541, 29952, 11142, 7733, 52551, 41939, 38524};
    private static long onExtraCallbackWithResult = -8535787551646957378L;
    private static char[] IAuthTabCallback = {32498, 32504, 32492, 32508, 32503, 32506, 32497, 32488, 32505, 32476, 32496, 32452, 32510, 32479, 32491, 32490, 32458, 32464, 32472, 32461, 32457, 32459, 32420, 32454, 32466, 32473, 32474, 32500, 32489, 32470, 32477, 32471, 32465};
    private static int onExtraCallback = -1184333979;
    private static boolean onWarmupCompleted = true;
    private static boolean IAuthTabCallbackStub = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r6 = r6 + 4
            byte[] r1 = viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$onOcrResultReceived$1.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$onOcrResultReceived$1.$$c(int, int, int):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestIdCardOcrHandler$onOcrResultReceived$1(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, int i, Bundle bundle, RequestIdCardOcrHandler requestIdCardOcrHandler, setTopGuideBackgroundColor settopguidebackgroundcolor, access13800<? super RequestIdCardOcrHandler$onOcrResultReceived$1> access13800Var) {
        super(2, access13800Var);
        this.$contentOwner = webViewContentOwner;
        this.$data = jsonObject;
        this.$resultCode = i;
        this.$resultData = bundle;
        this.this$0 = requestIdCardOcrHandler;
        this.$callbackProxy = settopguidebackgroundcolor;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RequestIdCardOcrHandler$onOcrResultReceived$1 requestIdCardOcrHandler$onOcrResultReceived$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            requestIdCardOcrHandler$onOcrResultReceived$1Create.invokeSuspend(unit);
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = requestIdCardOcrHandler$onOcrResultReceived$1Create.invokeSuspend(unit);
        int i4 = IAuthTabCallbackDefault + 111;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestIdCardOcrHandler$onOcrResultReceived$1 requestIdCardOcrHandler$onOcrResultReceived$1 = new RequestIdCardOcrHandler$onOcrResultReceived$1(this.$contentOwner, this.$data, this.$resultCode, this.$resultData, this.this$0, this.$callbackProxy, access13800Var);
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return requestIdCardOcrHandler$onOcrResultReceived$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = asBinder + 47;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return objIAuthTabCallback;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 41;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $10 + 105;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i * i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 16 - TextUtils.lastIndexOf("", '0'), View.combineMeasuredStates(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46134), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, TextUtils.getOffsetBefore("", 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 49123), 44 - Color.blue(0), Color.blue(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 59698), 17 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myTid() >> 22)), 31 - Color.green(0), TextUtils.indexOf("", "", 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback6 == null) {
                                byte b3 = (byte) (-1);
                                byte b4 = (byte) (b3 + 1);
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 49123), 43 - TextUtils.lastIndexOf("", '0', 0), 1494 - ExpandableListView.getPackedPositionGroup(0L), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i9 = $10 + 121;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49122), TextUtils.getCapsMode("", 0, 0) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i11 = $11 + 85;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        String str;
        Boolean boolOnNavigationEvent;
        BaseActivity baseActivity;
        Object objOnNavigationEvent;
        boolean z2;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            BaseActivity activity = this.$contentOwner.getActivity();
            BaseActivity baseActivity2 = activity instanceof BaseActivity ? activity : null;
            setText settext = new setText(this.$data);
            Object[] objArr = new Object[1];
            a(47 - Color.blue(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 10, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9459), objArr);
            BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = settext.onNavigationEvent(((String) objArr[0]).intern(), 0) == 1 ? BaseRoundCornerProgressBarSavedState1.IAuthTabCallback.GCM : BaseRoundCornerProgressBarSavedState1.IAuthTabCallback.CBC;
            Object[] objArr2 = new Object[1];
            b(null, new byte[]{-125, -126, -127}, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
            Object[] objArr3 = new Object[1];
            b(null, new byte[]{-112, -126, -117, -116, -113, -114, -126, -115, -116, -117, -118, -126, -119, -120, -121, -122, -123, -124}, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr3[0]).intern(), true})).booleanValue();
            Object[] objArr4 = new Object[1];
            a(57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 17, (char) (28287 - ExpandableListView.getPackedPositionType(0L)), objArr4);
            boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr4[0]).intern(), true})).booleanValue();
            Object[] objArr5 = new Object[1];
            a(TextUtils.lastIndexOf("", '0', 0) + 74, 13 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
            int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr5[0]).intern(), 0);
            Object[] objArr6 = new Object[1];
            b(null, new byte[]{-116, -112, -111, -126, -112, -120}, null, ImageFormat.getBitsPerPixel(0) + 128, objArr6);
            boolean zBooleanValue3 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr6[0]).intern(), false})).booleanValue();
            Object[] objArr7 = new Object[1];
            a((ViewConfiguration.getEdgeSlop() >> 16) + 87, 17 - TextUtils.lastIndexOf("", '0', 0), (char) (TextUtils.indexOf("", "") + 31031), objArr7);
            boolean zBooleanValue4 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr7[0]).intern(), false})).booleanValue();
            Object[] objArr8 = new Object[1];
            b(null, new byte[]{-126, -115, -116, -117, -118, -119, -126, -127, -113, -116, -110, -126, -119, -120, -121, -122, -123, -124}, null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, objArr8);
            boolean zBooleanValue5 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr8[0]).intern(), false})).booleanValue();
            Object[] objArr9 = new Object[1];
            b(null, new byte[]{-126, -115, -116, -117, -118, -126, -117, -116, -113, -114, -119, -126, -127, -113, -116, -110, -126, -119, -120, -121, -122, -123, -124}, null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
            boolean zBooleanValue6 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr9[0]).intern(), false})).booleanValue();
            if (this.$resultCode != -1) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                boolean z3 = this.$contentOwner.getWebView() != null;
                Object[] objArr10 = new Object[1];
                a(106 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ':' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 46008), objArr10);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), String.valueOf(z3));
                Object[] objArr11 = new Object[1];
                b(null, new byte[]{-113, -126, -121, -119, -123, -116, -97, -113, -122, -98, -119, -113, -116, -101, -119, -118, -99, -112, -126, -120, -100, -126, -106}, null, View.getDefaultSize(0, 0) + 127, objArr11);
                String strIntern = ((String) objArr11[0]).intern();
                Object[] objArr12 = new Object[1];
                a(View.getDefaultSize(0, 0) + 132, 15 - TextUtils.indexOf("", "", 0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr12);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr12[0]).intern(), access8100.onNavigationEvent(pairIAuthTabCallback), (String) null, false, (String) null, 56, (Object) null);
                setTopGuideBackgroundColor settopguidebackgroundcolor = this.$callbackProxy;
                Object[] objArr13 = new Object[1];
                b(null, new byte[]{-102, -109, -95, -109, -101, -96, -105, -101}, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr13);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, (String) null, ((String) objArr13[0]).intern(), (Map) null, 4, (Object) null);
                return Unit.INSTANCE;
            }
            if (baseActivity2 != null) {
                int i3 = asBinder + 79;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                    BaseActivity.IAuthTabCallback(baseActivity2, (String) null, true, 3, (Object) null);
                } else {
                    z = true;
                    BaseActivity.IAuthTabCallback(baseActivity2, (String) null, false, 3, (Object) null);
                }
            } else {
                z = true;
            }
            if ((!zBooleanValue3) == z || !zBooleanValue4) {
                str = "";
                boolOnNavigationEvent = null;
            } else {
                Bundle bundle = this.$resultData;
                if (bundle != null) {
                    int i4 = IAuthTabCallbackDefault + 75;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    str = "";
                    Object[] objArr14 = new Object[1];
                    b(null, new byte[]{-102, -106, -105, -101, -104, -102, -118, -104, -109, -103, -105, -114, -104, -111, -118, -104, -105, -106, -107, -108, -109}, null, MotionEvent.axisFromString("") + 128, objArr14);
                    z2 = bundle.getBoolean(((String) objArr14[0]).intern(), false);
                } else {
                    str = "";
                    z2 = false;
                }
                boolOnNavigationEvent = access14000.onNavigationEvent(z2);
            }
            RequestIdCardOcrHandler requestIdCardOcrHandler = this.this$0;
            this.L$0 = baseActivity2;
            this.L$1 = access15400.onNavigationEvent(settext);
            this.L$2 = access15400.onNavigationEvent(iAuthTabCallback);
            this.L$3 = access15400.onNavigationEvent(strOnNavigationEvent);
            this.L$4 = access15400.onNavigationEvent(boolOnNavigationEvent);
            this.Z$0 = zBooleanValue;
            this.Z$1 = zBooleanValue2;
            this.I$0 = iOnNavigationEvent;
            this.Z$2 = zBooleanValue3;
            this.Z$3 = zBooleanValue4;
            this.Z$4 = zBooleanValue5;
            this.Z$5 = zBooleanValue6;
            this.label = 1;
            baseActivity = baseActivity2;
            objOnNavigationEvent = RequestIdCardOcrHandler.onNavigationEvent(requestIdCardOcrHandler, strOnNavigationEvent, iAuthTabCallback, zBooleanValue, iOnNavigationEvent, zBooleanValue2, zBooleanValue5, zBooleanValue6, boolOnNavigationEvent, this);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                Object[] objArr15 = new Object[1];
                a(ViewConfiguration.getFadingEdgeLength() >> 16, (ViewConfiguration.getEdgeSlop() >> 16) + 47, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr15);
                throw new IllegalStateException(((String) objArr15[0]).intern());
            }
            BaseActivity baseActivity3 = (BaseActivity) this.L$0;
            ResultKt.onNavigationEvent(obj);
            baseActivity = baseActivity3;
            str = "";
            objOnNavigationEvent = obj;
        }
        JsonObject jsonObject = (JsonObject) objOnNavigationEvent;
        if (baseActivity != null) {
            baseActivity.bo_();
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        boolean z4 = this.$contentOwner.getWebView() != null;
        Object[] objArr16 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 105, MotionEvent.axisFromString(str) + 11, (char) (46007 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr16);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr16[0]).intern(), String.valueOf(z4));
        Object[] objArr17 = new Object[1];
        b(null, new byte[]{-113, -126, -121, -119, -123, -116, -97, -113, -122, -98, -119, -113, -116, -101, -119, -118, -99, -112, -126, -120, -100, -126, -106}, null, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, objArr17);
        String strIntern2 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a(115 - ((Process.getThreadPriority(0) + 20) >> 6), (Process.myTid() >> 22) + 17, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22093), objArr18);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, strIntern2, ((String) objArr18[0]).intern(), access8100.onNavigationEvent(pairIAuthTabCallback2), (String) null, false, (String) null, 56, (Object) null);
        ALCFaceBox.onWarmupCompleted(this.$callbackProxy, jsonObject);
        return Unit.INSTANCE;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 61;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, 20952 - View.resolveSizeAndState(0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 76 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.combineMeasuredStates(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStub) {
            int i7 = $11 + 67;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 63, 12215 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                f = 0.0f;
            }
            String str = new String(cArr4);
            int i9 = $10 + 99;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 121;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            try {
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
