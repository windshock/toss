package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.define.TossAffiliate;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceResult;
import o.ALCFaceValidation;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBarSavedState1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.PageAnimStore;
import o.Response;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UserChoiceBillingListener;
import o.access13800;
import o.access8100;
import o.castToString;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onOutOfMemory;
import o.putChannelInfo;
import o.readType;
import o.setOnOutOfMemeryErrorCallback;
import o.setRandomHost;
import o.setText;
import o.setTopGuideBackgroundColor;
import o.shouldBeKeptAsChild;
import o.strangeCodeForJackson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestPassportOcrHandler implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static final String IAuthTabCallback;
    private static int[] IAuthTabCallbackDefault = null;
    private static long IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static final String onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static int onTransact = 1;
    private static final String onWarmupCompleted;
    private final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda2
        public final Object invoke() {
            return RequestPassportOcrHandler.IAuthTabCallback();
        }
    });

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{8719, 24977, 42366, 59603, 11420, 28771, 47071, 64402, 16244, 17119, 34484, 51822, 2526, 19898, 37143, 54517, 6318, 23574, 58359, 10167, 27399, 44772, 62135, 13847, 30199}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17321, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new int[]{2096643134, -1998873150, 1430551399, -314921147, -486310354, 1992021206, -1630584938, -539978499, -953871261, -1249582600}, Color.green(0) + 19, objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{8734, 25095, 41509, 57935, 8820, 25238, 41658, 58020}, TextUtils.lastIndexOf("", '0') + 16412, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Companion = new Companion(null);
        onNavigationEvent = 8;
        int i = access100 + 73;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ readType IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        readType readtypeIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onTransact + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return readtypeIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = asInterface + 123;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RequestPassportOcrHandler requestPassportOcrHandler, WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, Context context, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(requestPassportOcrHandler, webViewContentOwner, jsonObject, settopguidebackgroundcolor, context, shouldbekeptaschild);
        int i4 = asInterface + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i4)) | i8 | (~(i5 | i4));
        int i10 = (~((~i5) | i2)) | (~(i2 | i4));
        int i11 = (~((~i4) | i7)) | i8;
        int i12 = i2 + i5 + i + (1821889583 * i3) + ((-349070011) * i6);
        int i13 = i12 * i12;
        int i14 = (575745661 * i2) + 325058560 + (1920428227 * i5) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i) + (473956352 * i3) + (1723858944 * i6) + ((-1436549120) * i13);
        int i15 = (i2 * 921699331) + 387174459 + (i5 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i * 921699455) + (i3 * 347275089) + (i6 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i16 != 3) {
            return onExtraCallback(objArr);
        }
        RequestPassportOcrHandler requestPassportOcrHandler = (RequestPassportOcrHandler) objArr[0];
        int i17 = 2 % 2;
        int i18 = onTransact + 5;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        readType readtype = (readType) requestPassportOcrHandler.onExtraCallback.getValue();
        int i20 = asInterface + 77;
        onTransact = i20 % 128;
        int i21 = i20 % 2;
        return readtype;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        RequestPassportOcrHandler requestPassportOcrHandler = (RequestPassportOcrHandler) objArr[0];
        JsonObject jsonObject = (JsonObject) objArr[1];
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[2];
        DialogInterface dialogInterface = (DialogInterface) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(requestPassportOcrHandler, jsonObject, settopguidebackgroundcolor, dialogInterface);
        }
        onWarmupCompleted(requestPassportOcrHandler, jsonObject, settopguidebackgroundcolor, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(dialogInterface);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = onTransact + 33;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(context, webViewContentOwner, dialogInterface);
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, WebViewContentOwner webViewContentOwner, RequestPassportOcrHandler requestPassportOcrHandler, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, webViewContentOwner, requestPassportOcrHandler, jsonObject, settopguidebackgroundcolor, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onTransact + 13;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return unitOnExtraCallback;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RequestPassportOcrHandler requestPassportOcrHandler = (RequestPassportOcrHandler) objArr[0];
        String str = (String) objArr[1];
        BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = (BaseRoundCornerProgressBarSavedState1.IAuthTabCallback) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Boolean bool = (Boolean) objArr[5];
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        access13800<? super JsonObject> access13800Var = (access13800) objArr[7];
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            requestPassportOcrHandler.onWarmupCompleted(str, iAuthTabCallback, zBooleanValue, iIntValue, bool, zBooleanValue2, access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = requestPassportOcrHandler.onWarmupCompleted(str, iAuthTabCallback, zBooleanValue, iIntValue, bool, zBooleanValue2, access13800Var);
        int i3 = onTransact + 49;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = asInterface + 23;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = onTransact + 125;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = onTransact + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    private static final readType IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        readType readtypeITrustedWebActivityServiceDefault = ((strangeCodeForJackson) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), strangeCodeForJackson.class)).ITrustedWebActivityServiceDefault();
        int i4 = asInterface + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return readtypeITrustedWebActivityServiceDefault;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 9;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 25, 19626 - TextUtils.indexOf((CharSequence) "", '0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777275, TextUtils.lastIndexOf("", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 59 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onTransact + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        if (i == 802) {
            IAuthTabCallback(webViewContentOwner, jsonObject, settopguidebackgroundcolor, i2, bundle);
        } else {
            if (i != 5001) {
                return;
            }
            onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor);
            int i6 = onTransact + 119;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final void IAuthTabCallback(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, int i, Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{8751, 43471, 13760, 33229, 3565, 39418, 26068, 61939, 32129, 51607}, 35831 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Integer.valueOf(i));
        Object[] objArr2 = new Object[1];
        a(new char[]{8719, 24977, 42366, 59603, 11420, 28771, 47071, 64402, 16244, 17119, 34484, 51822, 2526, 19898, 37143, 54517, 6318, 23574, 58359, 10167, 27399, 44772, 62135, 13847, 30199}, 17320 - Process.getGidForName(""), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{8754, 46306, 4030, 58957, 31085, 53281, 43725, 15747, 38049, 28541, 50725, 22723, 13282, 35509, 7519, 62486, 20333, 8654, 47242, 5053, 60012, 32017, 55261, 44799, 417}, TextUtils.indexOf("", "", 0) + 38609, objArr3);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), access8100.onNavigationEvent(pairIAuthTabCallback), (String) null, false, (String) null, 56, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(webViewContentOwner), (CoroutineContext) null, (setRandomHost) null, new RequestPassportOcrHandler$onOcrResultReceived$1(webViewContentOwner, jsonObject, i, bundle, this, settopguidebackgroundcolor, null), 3, (Object) null);
        int i3 = asInterface + 13;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackDefault;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 72 - KeyEvent.getDeadChar(0, 0), 8847 - Process.getGidForName(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackDefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 51;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, 8848 - (ViewConfiguration.getEdgeSlop() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i10++;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 22252), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39, 10301 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 4033), 78 - (ViewConfiguration.getTapTimeout() >> 16), 7398 - View.resolveSizeAndState(0, 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final Object onWarmupCompleted(String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, int i, Boolean bool, boolean z2, access13800<? super JsonObject> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new RequestPassportOcrHandler$processOcrPayload$2(str, z, i, bool, z2, iAuthTabCallback, null), access13800Var);
        int i3 = onTransact + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 15;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r5 = r10;
        r10 = o.PageAnimStore.onExtraCallback(r9);
        r3 = new java.lang.Object[1];
        b(new int[]{1755635428, -672674018, -1936115452, 1896440185, -209746242, -1728084031, 957989506, -2091405993, -1254376034, -910210939, -1339433888, -666750614, 1653566556, 952142091}, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 24, r3);
        r10 = r10.onExtraCallbackWithResult(new java.lang.String[]{((java.lang.String) r3[0]).intern()});
        r7 = new viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda0(r8, r9, r11, r12, r5);
        r10.IAuthTabCallback(new viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r10 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r10 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r9 = viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.onTransact + 35;
        viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.asInterface = r9 % 128;
        r9 = r9 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull final im.toss.core.webkit.WebViewContentOwner r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull final com.google.gson.JsonObject r11, @org.jetbrains.annotations.NotNull final o.setTopGuideBackgroundColor r12) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.onTransact
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.asInterface = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            android.content.Context r10 = r9.getContext()
            r1 = 17
            int r1 = r1 / r2
            if (r10 != 0) goto L43
            goto L39
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            android.content.Context r10 = r9.getContext()
            if (r10 != 0) goto L43
        L39:
            int r9 = viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.onTransact
            int r9 = r9 + 35
            int r10 = r9 % 128
            viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.asInterface = r10
            int r9 = r9 % r0
            return
        L43:
            r5 = r10
            com.tbruyelle.rxpermissions2.RxPermissions r10 = o.PageAnimStore.onExtraCallback(r9)
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [1755635428, -672674018, -1936115452, 1896440185, -209746242, -1728084031, 957989506, -2091405993, -1254376034, -910210939, -1339433888, -666750614, 1653566556, 952142091} // fill-array
            long r3 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            int r1 = r1 + 24
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r0, r1, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            o.getByteBuffer r10 = r10.onExtraCallbackWithResult(r0)
            viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda1 r6 = new viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda1
            viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda0 r7 = new viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            r0.<init>()
            r6.<init>()
            r10.IAuthTabCallback(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor):void");
    }

    private static final Unit onExtraCallbackWithResult(Context context, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        a(new char[]{8764, 17542, 61267, 5680, 47334, 9149, 18951, 60544, 6022, 48741, 8507, 19438, 62024, 5378, 49116, 9909, 18723, 61465, 6839, 48482, 9269, 20173, 61840, 6239, 33521, 9657, 19568, 63236, 6606, 32920, 11054, 19938, 62652, 8001, 34331, 10417, 21366, 64039, 7366, 34714, 11841, 20713, 64417, 25213, 34066}, 26293 - View.getDefaultSize(0, 0), objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(new int[]{-2070271362, -1234176042, -1745985980, 1924589369}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(webViewContentOwner, intent, 5001, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(RequestPassportOcrHandler requestPassportOcrHandler, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            requestPassportOcrHandler.onWarmupCompleted(jsonObject, settopguidebackgroundcolor);
            return Unit.INSTANCE;
        }
        requestPassportOcrHandler.onWarmupCompleted(jsonObject, settopguidebackgroundcolor);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onExtraCallback(final Context context, final WebViewContentOwner webViewContentOwner, final RequestPassportOcrHandler requestPassportOcrHandler, final JsonObject jsonObject, final setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.app_common_web_message_handlers___ead090d659));
        String string = context.getString(R.string.app_common_web_message_handlers___2be27d6afb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                Object[] objArr2 = {context, webViewContentOwner, (DialogInterface) obj};
                return (Unit) RequestPassportOcrHandler.onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), -1299441072, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 1299441073, objArr2, RNSScreenManagerDelegate.onNavigationEvent());
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = context.getString(R.string.next_time);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return RequestPassportOcrHandler.onNavigationEvent((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                Object[] objArr3 = {this.f$0, jsonObject, settopguidebackgroundcolor, (DialogInterface) obj};
                return (Unit) RequestPassportOcrHandler.onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), 1670654395, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1670654393, objArr3, RNSScreenManagerDelegate.onNavigationEvent());
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final RequestPassportOcrHandler requestPassportOcrHandler, final WebViewContentOwner webViewContentOwner, final JsonObject jsonObject, final setTopGuideBackgroundColor settopguidebackgroundcolor, final Context context, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!shouldbekeptaschild.onNavigationEvent) {
            if (!shouldbekeptaschild.onExtraCallbackWithResult) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj2) {
                        return RequestPassportOcrHandler.onWarmupCompleted(context, webViewContentOwner, requestPassportOcrHandler, jsonObject, settopguidebackgroundcolor, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    }
                });
            } else {
                int i4 = asInterface + 83;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    onJsBridgeReady.onNavigationEvent(context, context.getString(R.string.app_common_web_message_handlers___2eed444313), 1, 5, (Object) null);
                } else {
                    onJsBridgeReady.onNavigationEvent(context, context.getString(R.string.app_common_web_message_handlers___2eed444313), 0, 2, (Object) null);
                }
                requestPassportOcrHandler.onWarmupCompleted(jsonObject, settopguidebackgroundcolor);
            }
        } else {
            int i5 = asInterface + 43;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                requestPassportOcrHandler.IAuthTabCallback(webViewContentOwner, jsonObject, settopguidebackgroundcolor);
                obj.hashCode();
                throw null;
            }
            requestPassportOcrHandler.IAuthTabCallback(webViewContentOwner, jsonObject, settopguidebackgroundcolor);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 17;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private final void IAuthTabCallback(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        Object obj2;
        TossAffiliate tossAffiliate;
        TossAffiliate tossAffiliate2;
        TossAffiliate tossAffiliate3;
        Float fValueOf;
        int i = 2 % 2;
        int i2 = asInterface + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Context context = webViewContentOwner.getContext();
        if (context == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{8752, 20759, 50296, 31671, 61080, 7652, 37176}, 29483 - TextUtils.indexOf("", "", 0), objArr);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr[0]).intern(), false})).booleanValue();
        try {
            Result.Companion companion = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            b(new int[]{-639663521, 592555471, 718502225, 1156127657, -62446178, -2074032915, -38306716, 1416433711}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr2[0]).intern());
            if (jsonElement != null) {
                int i4 = asInterface + 3;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                fValueOf = Float.valueOf(jsonElement.getAsFloat());
                int i6 = onTransact + 3;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            } else {
                fValueOf = null;
            }
            obj = Result.constructor-impl(fValueOf);
            int i8 = onTransact + 95;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            int i10 = onTransact + 107;
            asInterface = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 5;
            }
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Float f = (Float) obj;
        try {
            Result.Companion companion3 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult2 = settext.onExtraCallbackWithResult();
            Object[] objArr3 = new Object[1];
            a(new char[]{8752, 20989, 50593, 31040, 60696, 24787, 38030, 2161, 48246, 12323, 42997, 56219}, View.MeasureSpec.getSize(0) + 29641, objArr3);
            JsonElement jsonElement2 = jsonObjectOnExtraCallbackWithResult2.get(((String) objArr3[0]).intern());
            obj2 = Result.constructor-impl(jsonElement2 != null ? Float.valueOf(jsonElement2.getAsFloat()) : null);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (Result.onExtraCallback(obj2)) {
            obj2 = null;
        }
        Float f2 = (Float) obj2;
        Object[] objArr4 = new Object[1];
        a(new char[]{8744, 55199, 51546, 49949, 62698, 61001}, 62897 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
        boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr4[0]).intern(), false})).booleanValue();
        Object[] objArr5 = new Object[1];
        b(new int[]{-1528935210, 1915497401, 721293335, -1038051926, -535632464, 1499788842, -143607726, -2120944755, 415996139, 740891201}, (KeyEvent.getMaxKeyCode() >> 16) + 18, objArr5);
        boolean zBooleanValue3 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr5[0]).intern(), false})).booleanValue();
        Object[] objArr6 = new Object[1];
        a(new char[]{8750, 29166, 34180, 55737, 27997, 33150, 54572, 26824, 48362, 53401, 25729, 47185, 52330, 24631, 47051, 52220, 8126, 46005, 51017, 7033, 44836, 49860}, 21468 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr6);
        boolean zBooleanValue4 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr6[0]).intern(), true})).booleanValue();
        Object[] objArr7 = new Object[1];
        a(new char[]{8756, 65019, 40370, 48454, 23904, 32000, 7362, 15596, 56473, 64581}, 57301 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
        boolean zBooleanValue5 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr7[0]).intern(), true})).booleanValue();
        TossCoreWebView webView = webViewContentOwner.getWebView();
        String url = webView != null ? webView.getUrl() : null;
        if (url != null) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 34 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 7095, -1088743663, false, "Companion", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr8 = {url};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1421773909);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 63468), Color.argb(0, 0, 0, 0) + 52, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7127, -1711174341, false, "IAuthTabCallback", new Class[]{String.class});
                }
                Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj3, objArr8);
                if (objInvoke != null) {
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(174793451);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 33 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7094, 992730235, false, "getAffiliate", new Class[0]);
                    }
                    tossAffiliate = null;
                    tossAffiliate3 = (TossAffiliate) ((Method) objOnExtraCallback3).invoke(objInvoke, null);
                } else {
                    tossAffiliate = null;
                    tossAffiliate3 = null;
                }
                if (tossAffiliate3 != null && tossAffiliate3 == TossAffiliate.SECURITIES) {
                    tossAffiliate2 = tossAffiliate3;
                }
                castToString.onWarmupCompleted(webViewContentOwner, readType.onNavigationEvent((readType) onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), -1974780639, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 1974780642, new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent()), context, zBooleanValue5, zBooleanValue, true, f, f2, (HashMap) null, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), zBooleanValue4, tossAffiliate2, 64, (Object) null), 802, setonoutofmemeryerrorcallback);
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause == null) {
                    throw th3;
                }
                throw cause;
            }
        }
        tossAffiliate = null;
        tossAffiliate2 = tossAffiliate;
        castToString.onWarmupCompleted(webViewContentOwner, readType.onNavigationEvent((readType) onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), -1974780639, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 1974780642, new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent()), context, zBooleanValue5, zBooleanValue, true, f, f2, (HashMap) null, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), zBooleanValue4, tossAffiliate2, 64, (Object) null), 802, setonoutofmemeryerrorcallback);
    }

    private final void onWarmupCompleted(JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(new int[]{2096643134, -1998873150, 1430551399, -314921147, -486310354, 1992021206, -1630584938, -539978499, -953871261, -1249582600}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, (String) null, ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
        int i4 = asInterface + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(RequestPassportOcrHandler requestPassportOcrHandler, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), 1670654395, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, -1670654393, new Object[]{requestPassportOcrHandler, jsonObject, settopguidebackgroundcolor, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), -1299441072, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, 1299441073, new Object[]{context, webViewContentOwner, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static final /* synthetic */ Object onExtraCallback(RequestPassportOcrHandler requestPassportOcrHandler, String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, int i, Boolean bool, boolean z2, access13800 access13800Var) {
        Object[] objArr = {requestPassportOcrHandler, str, iAuthTabCallback, Boolean.valueOf(z), Integer.valueOf(i), bool, Boolean.valueOf(z2), access13800Var};
        return onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), 1101065786, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1101065786, objArr, RNSScreenManagerDelegate.onNavigationEvent());
    }

    private final readType asInterface() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (readType) onNavigationEvent(RNSScreenManagerDelegate.onNavigationEvent(), -1974780639, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, 1974780642, new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent());
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = -7457023834225793174L;
        IAuthTabCallbackDefault = new int[]{1461712286, -649212724, -746933871, -1682468182, -185564049, 2113162662, -497040845, -554758976, -1982517436, -1715739349, -708247891, 1491090345, 1474619925, 988536880, 889853695, 697006913, -665852772, -1077755633};
    }
}
