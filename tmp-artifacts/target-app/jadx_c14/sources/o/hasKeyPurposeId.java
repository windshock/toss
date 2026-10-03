package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.AlertHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasKeyPurposeId implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private static char[] onExtraCallback = {64963, 64978, 65015, 64966, 64981, 64964, 64997, 64984, 64961, 64962, 64985, 64990, 64915, 64989, 64967, 64987, 64991, 64982, 64965, 64960, 64970, 64980, 64983, 64976, 64986};
    private static char onExtraCallbackWithResult = 51244;
    private static char onWarmupCompleted = 25529;
    private static char onNavigationEvent = 55667;
    private static char IAuthTabCallback = 56494;
    private static char asInterface = 15864;

    public static /* synthetic */ Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback);
        int i4 = asBinder + 119;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(214741824, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{setonoutofmemeryerrorcallback, dialogInterface}, -214741823, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback);
        int i4 = asBinder + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, setText settext, hasKeyPurposeId haskeypurposeid, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, settext, haskeypurposeid, jsonObject, setonoutofmemeryerrorcallback, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | i;
        int i9 = ~i3;
        int i10 = i7 | i;
        int i11 = (~(i6 | i9 | i)) | (~(i10 | i3));
        int i12 = (~i10) | (~(i9 | (~i)));
        int i13 = i + i3 + i4 + (1353909401 * i5) + ((-1351514252) * i2);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i) + 799145984 + ((-1483212659) * i3) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i4) + (337379328 * i5) + ((-1540358144) * i2) + (669122560 * i14);
        int i16 = ((i * 521834465) - 1171472169) + (i3 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i4 * 521834041) + (i5 * 1123214353) + (i2 * (-684621612)) + (i14 * 1028784128);
        if (i15 + (i16 * i16 * 1635647488) != 1) {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
            int i17 = 2 % 2;
            int i18 = onTransact + 59;
            asBinder = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr2 = new Object[1];
            b(new char[]{15133, 13175, 65288, 21779, 7691, 60751, 12449, 38157, 1238, 59510, 46576, 40263, 44591, 6716, 60939, 52489}, (Process.myTid() >> 22) + 15, objArr2);
            onExtraCallbackWithResult(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern());
            Unit unit = Unit.INSTANCE;
            int i20 = asBinder + 113;
            onTransact = i20 % 128;
            int i21 = i20 % 2;
            return unit;
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = (setOnOutOfMemeryErrorCallback) objArr[0];
        int i22 = 2 % 2;
        int i23 = asBinder + 83;
        onTransact = i23 % 128;
        int i24 = i23 % 2;
        Object[] objArr3 = new Object[1];
        a(new char[]{21, 18, 20, 24, '\f', 7, 21, 14, 14, 21, 11, 23, '\t', 21, 15, 7}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 114), 16 - KeyEvent.keyCodeFromString(""), objArr3);
        onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, ((String) objArr3[0]).intern());
        Unit unit2 = Unit.INSTANCE;
        int i25 = onTransact + 35;
        asBinder = i25 % 128;
        int i26 = i25 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, dialogInterface);
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-1340851541, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{setonoutofmemeryerrorcallback}, 1340851541, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback);
        int i4 = onTransact + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = onTransact + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asBinder + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onTransact + 67;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = asBinder + 61;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asBinder + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            int i6 = 91 / 0;
        }
        int i7 = asBinder + 69;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Context context;
        JsonObject asJsonObject;
        String strIntern;
        String str2;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            int i4 = 19 / 0;
            if (context == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                return;
            }
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{19, 4, 11, 19, 13837}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14), (ViewConfiguration.getTapTimeout() >> 16) + 5, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object obj = null;
        if (strOnNavigationEvent.length() != 0) {
            JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            b(new char[]{55709, 17322, 5567, 41381, 1238, 59510, 46576, 40263, 44591, 6716, 60939, 52489}, KeyEvent.normalizeMetaState(0) + 11, objArr2);
            JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr2[0]).intern());
            if (jsonElement != null && (asJsonObject = jsonElement.getAsJsonObject()) != null) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new AlertHandler$.ExternalSyntheticLambda3(strOnNavigationEvent, settext, this, asJsonObject, setonoutofmemeryerrorcallback));
                return;
            }
            Object[] objArr3 = new Object[1];
            b(new char[]{55709, 17322, 5567, 41381, 1238, 59510, 46576, 40263, 44591, 6716, 11029, 35116, 63305, 48695, 22770, 7774, 56014, 45870, 56078, 57532}, 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr3[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            int i5 = asBinder + 29;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = onTransact + 39;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            Object[] objArr4 = new Object[1];
            a(new char[]{19, 4, 11, 19, 22, 17, 4, 24, 17, 22, '\n', 1, '\n', 24}, (byte) ((ViewConfiguration.getScrollDefaultDelay() << 23) + 83), 106 / TextUtils.indexOf("", "", 1), objArr4);
            strIntern = ((String) objArr4[0]).intern();
            str2 = null;
            map = null;
            i = 5;
        } else {
            Object[] objArr5 = new Object[1];
            a(new char[]{19, 4, 11, 19, 22, 17, 4, 24, 17, 22, '\n', 1, '\n', 24}, (byte) (51 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf("", "", 0) + 14, objArr5);
            strIntern = ((String) objArr5[0]).intern();
            str2 = null;
            map = null;
            i = 6;
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, str2, map, i, (Object) null);
        int i7 = asBinder + 41;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        a(new char[]{18, 19, 18, '\f', 13832}, (byte) (26 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getLongPressTimeout() >> 16) + 5, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), str);
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            b(new char[]{15133, 13175, 65288, 21779, 21824, 49632, 43151, 64760, 20255, 166, 64456, 39221, 49533, 45501, 21002, 63423}, 0 - Color.red(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b(new char[]{15133, 13175, 65288, 21779, 21824, 49632, 43151, 64760, 20255, 166, 64456, 39221, 49533, 45501, 21002, 63423}, 16 - Color.red(0), objArr2);
            obj = objArr2[0];
        }
        onExtraCallbackWithResult(setonoutofmemeryerrorcallback, ((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(String str, setText settext, hasKeyPurposeId haskeypurposeid, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        Object[] objArr = new Object[1];
        b(new char[]{9894, 30583, 42645, 62784, 55709, 17322, 64853, 36031, 54231, 12956, 60939, 52489}, 10 - ExpandableListView.getPackedPositionChild(0L), objArr);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(settext.onNavigationEvent(((String) objArr[0]).intern(), ""));
        Object[] objArr2 = new Object[1];
        a(new char[]{23, 20, 13824, 13824, 23, 14, 22, 1, 4, 24, 14, 21, 13810, 13810}, (byte) (9 - TextUtils.getTrimmedLength("")), KeyEvent.keyCodeFromString("") + 14, objArr2);
        Object[] objArr3 = {settext, ((String) objArr2[0]).intern(), true};
        Object[] objArr4 = {commonModule_setLeftEdgeTouchEnabled, Boolean.valueOf(((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr3)).booleanValue())};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, objArr4, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr5 = {commonModule_setLeftEdgeTouchEnabled, haskeypurposeid.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, jsonObject, new AlertHandler$.ExternalSyntheticLambda0(setonoutofmemeryerrorcallback))};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr5, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
        Object[] objArr6 = new Object[1];
        b(new char[]{54090, 37530, 50653, 48542, 64456, 39221, 49533, 45501, 21002, 63423}, TextUtils.lastIndexOf("", '0', 0, 0) + 11, objArr6);
        JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr6[0]).intern());
        JsonObject asJsonObject = null;
        if (jsonElement != null) {
            int i3 = onTransact + 45;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                jsonElement.getAsJsonObject();
                throw null;
            }
            asJsonObject = jsonElement.getAsJsonObject();
            i = onTransact + 61;
            asBinder = i % 128;
        } else {
            i = asBinder + 91;
            onTransact = i % 128;
        }
        int i4 = i % 2;
        Object[] objArr7 = {commonModule_setLeftEdgeTouchEnabled, haskeypurposeid.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, asJsonObject, new AlertHandler$.ExternalSyntheticLambda1(setonoutofmemeryerrorcallback))};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr7, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new AlertHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[PHI: r3
      0x0062: PHI (r3v8 com.google.gson.JsonElement) = (r3v7 com.google.gson.JsonElement), (r3v19 com.google.gson.JsonElement) binds: [B:10:0x0060, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.CommonModule_setLeftEdgeTouchEnabled.onExtraCallback IAuthTabCallback(o.CommonModule_setLeftEdgeTouchEnabled r20, com.google.gson.JsonObject r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hasKeyPurposeId.IAuthTabCallback(o.CommonModule_setLeftEdgeTouchEnabled, com.google.gson.JsonObject, kotlin.jvm.functions.Function0):o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback");
    }

    private static final Unit onNavigationEvent(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            function0.invoke();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 103;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i4);
                        int i11 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iResolveSize = 12434 - View.resolveSize(i4, i4);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i11, iResolveSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "") + 10, Color.blue(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 13 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r32, byte r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hasKeyPurposeId.a(char[], byte, int, java.lang.Object[]):void");
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1340851541, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{setonoutofmemeryerrorcallback}, 1340851541, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback);
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(214741824, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{setonoutofmemeryerrorcallback, dialogInterface}, -214741823, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback);
    }
}
