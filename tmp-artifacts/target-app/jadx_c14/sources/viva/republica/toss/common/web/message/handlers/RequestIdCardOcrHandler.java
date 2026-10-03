package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
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
import o.IconRoundCornerProgressBarSavedState;
import o.PageAnimStore;
import o.Response;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.UserChoiceBillingListener;
import o.access13800;
import o.access8100;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.filterCreatePageParams;
import o.getByteBuffer;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onOutOfMemory;
import o.putChannelInfo;
import o.readType;
import o.setOnOutOfMemeryErrorCallback;
import o.setRandomHost;
import o.setTopGuideBackgroundColor;
import o.shouldBeKeptAsChild;
import o.strangeCodeForJackson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestIdCardOcrHandler implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    public static final int IAuthTabCallback;
    private static long IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100 = 0;
    private static int asBinder = 0;
    private static long asInterface = 0;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onTransact = 1;
    private static final String onWarmupCompleted;
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda6
        public final Object invoke() {
            return RequestIdCardOcrHandler.onWarmupCompleted();
        }
    });

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{63801, 61181, 55036, 48839, 42690, 36519, 30381, 24199, 18071, 11939, 5748, 65128, 58987, 52851, 46658, 40484, 34323, 28201, 22035, 15878, 10235, 4065, 63483}, 6131 - TextUtils.indexOf("", "", 0), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{63803, 39937, 13159, 54955, 28062, 211, 42530, 15723, 53340, 30594, 2786, 41020, 18202, 55874, 29116, 5353, 43983, 16689, 58465}, TextUtils.lastIndexOf("", '0', 0) + 25904, objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new char[]{63768, 63835, 33018, 29830, 62517, 40404, 7450, 16627, 11109, 45759, 9925, 12988}, Gravity.getAbsoluteGravity(0, 0), objArr3);
        onNavigationEvent = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(new char[]{12204, 12265, 58920, 54394, 37620, 15668, 30323, 11158, 64966, 54381, 34338, 23005, 35731, 35401, 45299, 29750, 22859, 31105, 25250}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr4);
        onWarmupCompleted = ((String) objArr4[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackStubProxy + 99;
        access100 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return ((Boolean) onExtraCallback(iOnNavigationEvent2, -494844072, 494844073, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{str, str2}, iOnNavigationEvent3)).booleanValue();
        }
        int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        ((Boolean) onExtraCallback(iOnNavigationEvent5, -494844072, 494844073, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, new Object[]{str, str2}, iOnNavigationEvent6)).booleanValue();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i2 | i3);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i2 + i3 + i + ((-1585779005) * i6) + (640148872 * i4);
        int i17 = i16 * i16;
        int i18 = (i2 * 308833806) + 153878528 + (308833806 * i3) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i) + (1159200768 * i6) + ((-734003200) * i4) + (2089549824 * i17);
        int i19 = (i2 * (-1291220770)) + 263398195 + (i3 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i * (-1291221671)) + (i6 * (-1079815989)) + (i4 * 669414472) + (i17 * 145489920);
        int i20 = i18 + (i19 * i19 * (-1699479552));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = onTransact + 59;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(context, webViewContentOwner, dialogInterface);
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(RequestIdCardOcrHandler requestIdCardOcrHandler, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(requestIdCardOcrHandler, jsonObject, settopguidebackgroundcolor, dialogInterface);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(requestIdCardOcrHandler, jsonObject, settopguidebackgroundcolor, dialogInterface);
        int i3 = onTransact + 83;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onExtraCallback(iOnNavigationEvent2, -2020510181, 2020510181, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{dialogInterface}, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RequestIdCardOcrHandler requestIdCardOcrHandler, WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, Context context, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(iOnNavigationEvent2, -1329495976, 1329495978, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{requestIdCardOcrHandler, webViewContentOwner, jsonObject, settopguidebackgroundcolor, context, shouldbekeptaschild}, iOnNavigationEvent3);
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, WebViewContentOwner webViewContentOwner, RequestIdCardOcrHandler requestIdCardOcrHandler, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(context, webViewContentOwner, requestIdCardOcrHandler, jsonObject, settopguidebackgroundcolor, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ readType onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        readType readtypeAsBinder = asBinder();
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return readtypeAsBinder;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        return true ^ (i2 % 2 == 0);
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 15;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 65;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 45812), 84 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 14186), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20, View.resolveSize(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final /* synthetic */ Object onNavigationEvent(RequestIdCardOcrHandler requestIdCardOcrHandler, String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, int i, boolean z2, boolean z3, boolean z4, Boolean bool, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = asBinder + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = requestIdCardOcrHandler.onWarmupCompleted(str, iAuthTabCallback, z, i, z2, z3, z4, bool, access13800Var);
        int i5 = onTransact + 1;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onTransact + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = asBinder + 23;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    private final readType IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        readType readtype = (readType) this.IAuthTabCallbackStub.getValue();
        int i4 = onTransact + 55;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return readtype;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final readType asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        if (i3 != 0) {
            int i4 = 52 / 0;
            return ((strangeCodeForJackson) Response.onExtraCallback(contextOnExtraCallback, strangeCodeForJackson.class)).ITrustedWebActivityServiceDefault();
        }
        return ((strangeCodeForJackson) Response.onExtraCallback(contextOnExtraCallback, strangeCodeForJackson.class)).ITrustedWebActivityServiceDefault();
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new RequestIdCardOcrHandler$.ExternalSyntheticLambda2());
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return iAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (42122 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, Color.blue(0) + 6934), 3);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2047150232);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 12 - Process.getGidForName(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 6998, 1262876168, false, "HANA_BANK", (Class[]) null);
        }
        objArr2[0] = ((Field) objOnExtraCallback).get(null);
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1927274998);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6997, 1134501734, false, "SUHYUP_BANK", (Class[]) null);
        }
        objArr2[1] = ((Field) objOnExtraCallback2).get(null);
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1753585977);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 13 - Color.alpha(0), View.resolveSize(0, 0) + 6997, 1506109353, false, "PEOPLEFUND", (Class[]) null);
        }
        objArr2[2] = ((Field) objOnExtraCallback3).get(null);
        boolean zOnExtraCallback$19226060 = filterCreatePageParams.onExtraCallback$19226060(uri, objArr2) | zOnTransact;
        int i4 = onTransact + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnExtraCallback$19226060);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 5;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 24, Color.alpha(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (asInterface ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 59 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 97;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 59, 6383 - ExpandableListView.getPackedPositionType(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = 76 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), MotionEvent.axisFromString("") + 60, 6382 - MotionEvent.axisFromString(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        String str = new String(cArr2);
        int i8 = $11 + 51;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        int i4 = asBinder + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        if (i == 800) {
            onNavigationEvent(webViewContentOwner, jsonObject, settopguidebackgroundcolor, i2, bundle);
            return;
        }
        if (i == 5001) {
            onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor);
            return;
        }
        int i6 = onTransact + 63;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, int i, Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{63769, 5911, 9514, 13141, 16739, 24418, 28094, 31659, 35271, 42991}, Color.blue(0) + 60953, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Integer.valueOf(i));
        Object[] objArr2 = new Object[1];
        a(new char[]{63801, 61181, 55036, 48839, 42690, 36519, 30381, 24199, 18071, 11939, 5748, 65128, 58987, 52851, 46658, 40484, 34323, 28201, 22035, 15878, 10235, 4065, 63483}, 6131 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{63748, 17718, 33100, 52625, 2515, 22013, 36911, 56423, 6279, 25817, 41159, 61247, 11132, 30601, 46029, 65506, 14971, 34426, 49816, 3777, 19186, 35117, 54655, 4507, 24007}, 48179 - (Process.myTid() >> 22), objArr3);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), access8100.onNavigationEvent(pairIAuthTabCallback), (String) null, false, (String) null, 56, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(webViewContentOwner), (CoroutineContext) null, (setRandomHost) null, new RequestIdCardOcrHandler$onOcrResultReceived$1(webViewContentOwner, jsonObject, i, bundle, this, settopguidebackgroundcolor, null), 3, (Object) null);
        int i3 = asBinder + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private final Object onWarmupCompleted(String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, int i, boolean z2, boolean z3, boolean z4, Boolean bool, access13800<? super JsonObject> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new RequestIdCardOcrHandler$processOcrPayload$2(str, z, z4, z2, i, bool, z3, iAuthTabCallback, null), access13800Var);
        int i3 = asBinder + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 79;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Context context, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        b(new char[]{35793, 35760, 589, 30052, 30381, 39964, 975, 24087, 22918, 12290, 10028, 11267, 12242, 28214, 4580, 417, 64784, 40437, 50111, 55278, 49951, 52098, 44464, 42261, 36997, 63810, 39019, 31564, 26325, 5946, 19007, 18811, 13318, 17151, 13565, 7849, 6736, 28842, 59020, 60662, 59510, 44664, 53581, 49721, 48565, 56410, 33566, 36946, 33770}, ExpandableListView.getPackedPositionChild(0L) + 1, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(new char[]{25177, 25129, 21980, 27074, 8499, 32957, 36326, 53287, 45056, 26514, 15244, 41534}, (-1) - TextUtils.lastIndexOf("", '0', 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(webViewContentOwner, intent, 5001, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(RequestIdCardOcrHandler requestIdCardOcrHandler, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        requestIdCardOcrHandler.onExtraCallback(jsonObject, settopguidebackgroundcolor);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 109;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final Context context, final WebViewContentOwner webViewContentOwner, final RequestIdCardOcrHandler requestIdCardOcrHandler, final JsonObject jsonObject, final setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.app_common_web_message_handlers___5fe974728a));
        String string = context.getString(R.string.app_common_web_message_handlers___2be27d6afb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return RequestIdCardOcrHandler.onExtraCallback(context, webViewContentOwner, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = context.getString(R.string.next_time);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return RequestIdCardOcrHandler.onExtraCallbackWithResult((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return RequestIdCardOcrHandler.onExtraCallback(this.f$0, jsonObject, settopguidebackgroundcolor, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i;
        final RequestIdCardOcrHandler requestIdCardOcrHandler = (RequestIdCardOcrHandler) objArr[0];
        final WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
        final JsonObject jsonObject = (JsonObject) objArr[2];
        final setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[3];
        final Context context = (Context) objArr[4];
        shouldBeKeptAsChild shouldbekeptaschild = (shouldBeKeptAsChild) objArr[5];
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (shouldbekeptaschild.onNavigationEvent) {
            requestIdCardOcrHandler.onExtraCallbackWithResult(webViewContentOwner, jsonObject, settopguidebackgroundcolor);
        } else {
            if (shouldbekeptaschild.onExtraCallbackWithResult) {
                onJsBridgeReady.onNavigationEvent(context, context.getString(R.string.app_common_web_message_handlers___2eed444313), 0, 2, (Object) null);
                requestIdCardOcrHandler.onExtraCallback(jsonObject, settopguidebackgroundcolor);
                i = onTransact + 55;
            } else {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj) {
                        return RequestIdCardOcrHandler.onNavigationEvent(context, webViewContentOwner, requestIdCardOcrHandler, jsonObject, settopguidebackgroundcolor, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                i = onTransact + 73;
            }
            asBinder = i % 128;
            int i5 = i % 2;
        }
        return Unit.INSTANCE;
    }

    public void onExtraCallbackWithResult(@NotNull final WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull final JsonObject jsonObject, @NotNull final setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        final Context context = webViewContentOwner.getContext();
        if (context == null) {
            return;
        }
        RxPermissions rxPermissionsOnExtraCallback = PageAnimStore.onExtraCallback(webViewContentOwner);
        Object[] objArr = new Object[1];
        b(new char[]{40850, 40947, 45101, 57241, 50381, 14049, 34552, 56096, 19909, 33378, 36305, 43316, 15250, 56406, 47903, 33935, 59731, 12168, 26966, 21187, 55069, 31181, 1843, 8241, 33995, 19238, 12944, 65128, 29315}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr);
        getByteBuffer getbytebufferOnExtraCallbackWithResult = rxPermissionsOnExtraCallback.onExtraCallbackWithResult(new String[]{((String) objArr[0]).intern()});
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return RequestIdCardOcrHandler.onExtraCallbackWithResult(this.f$0, webViewContentOwner, jsonObject, settopguidebackgroundcolor, context, (shouldBeKeptAsChild) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallbackWithResult.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                Object[] objArr2 = {function1, obj};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                RequestIdCardOcrHandler.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -427667917, 427667920, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, objArr2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, webViewContentOwner);
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner r29, com.google.gson.JsonObject r30, o.setTopGuideBackgroundColor r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, com.google.gson.JsonObject, o.setTopGuideBackgroundColor):void");
    }

    private final void onExtraCallback(JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{63803, 39937, 13159, 54955, 28062, 211, 42530, 15723, 53340, 30594, 2786, 41020, 18202, 55874, 29116, 5353, 43983, 16689, 58465}, 25903 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, (String) null, ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
        int i4 = asBinder + 111;
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

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent2, -427667917, 427667920, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{function1, obj}, iOnNavigationEvent3);
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onExtraCallback(iOnNavigationEvent2, -494844072, 494844073, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{str, str2}, iOnNavigationEvent3)).booleanValue();
    }

    private static final Unit onNavigationEvent(RequestIdCardOcrHandler requestIdCardOcrHandler, WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, Context context, shouldBeKeptAsChild shouldbekeptaschild) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(iOnNavigationEvent2, -1329495976, 1329495978, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{requestIdCardOcrHandler, webViewContentOwner, jsonObject, settopguidebackgroundcolor, context, shouldbekeptaschild}, iOnNavigationEvent3);
    }

    private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(iOnNavigationEvent2, -2020510181, 2020510181, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, new Object[]{dialogInterface}, iOnNavigationEvent3);
    }

    static void IAuthTabCallback() {
        asInterface = 5940422370576071772L;
        IAuthTabCallbackDefault = -3661042148967903358L;
    }
}
