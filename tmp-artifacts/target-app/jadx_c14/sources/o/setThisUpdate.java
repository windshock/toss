package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfiguration;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import im.toss.utils.RxUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.SetDetectableSize;
import o.setThisUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.SendPDFHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setThisUpdate implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000;
    private static boolean asBinder;
    private static boolean asInterface;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallbackStubProxy + 61;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            return (Unit) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{context, deserializeurinullablecollection}, iOnWarmupCompleted, 354313587, iOnWarmupCompleted2, -354313587, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ File onExtraCallback(String str, setThisUpdate setthisupdate, Context context, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        File fileOnNavigationEvent = onNavigationEvent(str, setthisupdate, context, str2);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return fileOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[0];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(context, setonoutofmemeryerrorcallback, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallbackWithResult(context, setonoutofmemeryerrorcallback, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(context);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        asBinder(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback, dialogInterface);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setThisUpdate setthisupdate, onExtraCallback onextracallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Context context, String str, String str2, AccessoryButtonConfiguration accessoryButtonConfiguration, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, File file) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setthisupdate, onextracallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, context, str, str2, accessoryButtonConfiguration, setonoutofmemeryerrorcallback, file);
        int i4 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted, -244839924, iOnWarmupCompleted2, 244839928, iOnWarmupCompleted3);
        int i4 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = (~(i7 | i2)) | i5;
        int i9 = ~i5;
        int i10 = ~(i7 | i9);
        int i11 = ~i2;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i2 | i9)) | (~(i7 | i11));
        int i14 = i3 + i5 + i4 + (417615942 * i6) + (566850886 * i);
        int i15 = i14 * i14;
        int i16 = (i3 * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + ((-1357469401) * i4) + (1137340586 * i6) + (304092074 * i) + (i15 * 1282146304);
        int i17 = ((-370608051) * i3) + 147849216 + ((-2147356519) * i5) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i4) + ((-354418688) * i6) + ((-85983232) * i) + ((-608960512) * i15) + (i16 * i16 * 1158414336);
        if (i17 != 1) {
            if (i17 == 2) {
                return onExtraCallback(objArr);
            }
            if (i17 == 3) {
                return onWarmupCompleted(objArr);
            }
            if (i17 != 4) {
                return i17 != 5 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
            }
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i18 = 2 % 2;
            int i19 = IAuthTabCallbackDefault + 39;
            IAuthTabCallbackStub = i19 % 128;
            int i20 = i19 % 2;
            function1.invoke(obj);
            int i21 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        setThisUpdate setthisupdate = (setThisUpdate) objArr[0];
        Context context = (Context) objArr[1];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[2];
        Throwable th = (Throwable) objArr[3];
        int i23 = 2 % 2;
        int i24 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i24 % 128;
        int i25 = i24 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a(new char[]{25825, 19555, 44046, 8471, 28967, 55011, 5621, 42526, 22373, 38177, 5381, 26544, 38795, 13446}, ((Process.getThreadPriority(0) + 20) >> 6) + 14, objArr2);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr2[0]).intern(), th);
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-124, -125, -126, -127, -115, -120, -123, -97, -116, -110, -111}, null, 127 - (Process.myTid() >> 22), objArr3);
        onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{setthisupdate, ((String) objArr3[0]).intern(), th.toString()}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1964160531, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1964160536, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        onJsBridgeReady.onNavigationEvent(context, context.getString(R.string.app_common_web_message_handlers___46eb3f116f), 0, 2, (Object) null);
        Intrinsics.checkNotNull(th);
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-98, -99, -100, -127, -101, -102, -93, -106, -94, -95, -96, -104}, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, ((String) objArr4[0]).intern(), (Map) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i26 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i26 % 128;
        int i27 = i26 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setThisUpdate setthisupdate = (setThisUpdate) objArr[0];
        Context context = (Context) objArr[1];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[2];
        Throwable th = (Throwable) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            return (Unit) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{setthisupdate, context, setonoutofmemeryerrorcallback, th}, iOnWarmupCompleted, 683001199, iOnWarmupCompleted2, -683001198, iOnWarmupCompleted3);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(File file) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(file);
        int i4 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i2 % 128;
        return i2 % 2 == 0;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(context);
        Object obj = null;
        if (baseActivityOnWarmupCompleted != null) {
            int i4 = IAuthTabCallbackStub + 121;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            BaseActivity.IAuthTabCallback(baseActivityOnWarmupCompleted, (String) null, false, 3, (Object) null);
            int i6 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        BaseActivity baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(context);
        if (baseActivityOnWarmupCompleted != null) {
            int i2 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            baseActivityOnWarmupCompleted.bo_();
            int i4 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(null, new byte[]{-124, -125, -126, -127, -123, -115, -118, -111, -123, -107, -123}, null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-98, -99, -100, -127, -101, -106, -102, -103, -104, -106, -105, -106}, null, 127 - Color.alpha(0), objArr2);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Context context, final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.app_common_web_message_handlers___5597a518a6));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.app_common_web_message_handlers___f6f60c4887));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SendPDFHandler$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return setThisUpdate.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            char c = 1;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent << 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iMyPid = 12434 - (Process.myPid() >> 22);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, pressedStateDuration, iMyPid, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12434 - TextUtils.indexOf("", "", 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 = i11 - 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 16014), Color.red(0) + 14, 19901 - Color.green(0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(o.setThisUpdate r20, o.setThisUpdate.onExtraCallback r21, o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r22, android.content.Context r23, java.lang.String r24, java.lang.String r25, im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfiguration r26, o.setOnOutOfMemeryErrorCallback r27, java.io.File r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setThisUpdate.IAuthTabCallback(o.setThisUpdate, o.setThisUpdate$onExtraCallback, o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, android.content.Context, java.lang.String, java.lang.String, im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfiguration, o.setOnOutOfMemeryErrorCallback, java.io.File):kotlin.Unit");
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
    }

    private static final Unit onNavigationEvent(File file) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        AccessoryButtonConfiguration accessoryButtonConfigurationOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i4 = IAuthTabCallbackDefault + 39;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        setText settext = new setText(jsonObject);
        String string = context.getString(R.string.app_common_web_message_handlers___15446e04ad);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        b(null, new byte[]{-123, -117, -126, -116, -123, -124, -125, -108}, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), string);
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-126, -115, -126, -122}, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-123, -124, -115, -125, -102, -126, -115, -111}, null, 127 - Color.green(0), objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        onExtraCallback.IAuthTabCallback iAuthTabCallback = onExtraCallback.Companion;
        Object[] objArr4 = new Object[1];
        a(new char[]{39652, 40228, 26547, 2448, 30888, 41361, 21104, 38535, 15376, 60320, 8032, 2715, 43815, 35847}, 12 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
        onExtraCallback onextracallbackIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(settext.onNavigationEvent(((String) objArr4[0]).intern(), ""));
        Object[] objArr5 = new Object[1];
        a(new char[]{9236, 5903, 274, 38729, 35960, 16911, 45783, 16914, 39964, 27237, 60177, 29215, 4520, 53586, 54984, 48109}, TextUtils.indexOf((CharSequence) "", '0', 0) + 16, objArr5);
        if (settext.onExtraCallbackWithResult(((String) objArr5[0]).intern())) {
            AccessoryButtonConfiguration.Companion companion = AccessoryButtonConfiguration.Companion;
            Object[] objArr6 = new Object[1];
            a(new char[]{9236, 5903, 274, 38729, 35960, 16911, 45783, 16914, 39964, 27237, 60177, 29215, 4520, 53586, 54984, 48109}, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr6);
            String string2 = settext.onExtraCallback(((String) objArr6[0]).intern(), new JsonObject()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            accessoryButtonConfigurationOnWarmupCompleted = companion.onWarmupCompleted(string2);
        } else {
            accessoryButtonConfigurationOnWarmupCompleted = null;
        }
        if (strOnNavigationEvent2.length() != 0) {
            Object[] objArr7 = new Object[1];
            b(null, new byte[]{-87, -120, -102, -115, -120, -123, -97, -116, -110, -111}, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr7);
            onWarmupCompleted(this, ((String) objArr7[0]).intern(), null, 2, null);
            Object[] objArr8 = new Object[1];
            b(null, new byte[]{-108, -122, -112}, null, 126 - Process.getGidForName(""), objArr8);
            writeRaw writerawIAuthTabCallback = onWarmupCompleted(context, strOnNavigationEvent2, IAuthTabCallback(strOnNavigationEvent, ((String) objArr8[0]).intern())).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onExtraCallback(new SendPDFHandler$.ExternalSyntheticLambda2(new SendPDFHandler$.ExternalSyntheticLambda1(context))).onWarmupCompleted(new SendPDFHandler$.ExternalSyntheticLambda3(context)).onNavigationEvent(new SendPDFHandler$.ExternalSyntheticLambda5(new SendPDFHandler$.ExternalSyntheticLambda4(this, onextracallbackIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, context, strOnNavigationEvent3, strOnNavigationEvent, accessoryButtonConfigurationOnWarmupCompleted, setonoutofmemeryerrorcallback))).onNavigationEvent(new SendPDFHandler$.ExternalSyntheticLambda7(new SendPDFHandler$.ExternalSyntheticLambda6()), new SendPDFHandler$.ExternalSyntheticLambda9(new SendPDFHandler$.ExternalSyntheticLambda8(this, context, setonoutofmemeryerrorcallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            return;
        }
        int i6 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr9 = new Object[1];
        b(null, new byte[]{-87, -115, -112, -117, -123}, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr9);
        onWarmupCompleted(this, ((String) objArr9[0]).intern(), null, 2, null);
        Object[] objArr10 = new Object[1];
        a(new char[]{13045, 64132, 51309, 20368, 42608, 55043, 44074, 47438, 34678, 18831, 44422, 59115, 35534, 33096}, 13 - TextUtils.getTrimmedLength(""), objArr10);
        String strIntern = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(new char[]{4257, 48494, 1419, 12070, 54031, 17664, 56576, 33129, 24565, 8249, 57810, 54584}, 12 - TextUtils.indexOf("", "", 0, 0), objArr11);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr11[0]).intern(), (Map) null, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onWarmupCompleted(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r17, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r18, int r19, int r20, @org.jetbrains.annotations.Nullable android.content.Intent r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setThisUpdate.onWarmupCompleted(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback, int, int, android.content.Intent):void");
    }

    static /* synthetic */ void onWarmupCompleted(setThisUpdate setthisupdate, String str, String str2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i3 + 17;
            IAuthTabCallbackDefault = i5 % 128;
            str2 = null;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{setthisupdate, str, str2}, iOnWarmupCompleted, -1964160531, iOnWarmupCompleted2, 1964160536, iOnWarmupCompleted3);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        final String str = (String) objArr[1];
        final String str2 = (String) objArr[2];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-127, -90, -91, -122, -116, -123, -92}, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr2);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr2[0]).intern(), false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SendPDFHandler$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return setThisUpdate.IAuthTabCallback(str, str2, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        int i2 = IAuthTabCallbackStub + 73;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
        return null;
    }

    private static final Unit onExtraCallback(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        b(null, new byte[]{-92, -92, -123, -120, -89, -110, -120, -112}, null, 127 - Drawable.resolveOpacity(0, 0), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), str);
        if (str2 != null) {
            int i2 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{41381, 20170, 35960, 16911, 59874, 53463, 22982, 16161}, 7 - Color.blue(0), objArr2);
            mapOnExtraCallback2.put(((String) objArr2[0]).intern(), str2);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final String IAuthTabCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{30699, 30283}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        String string = sb.toString();
        String str3 = StringsKt.take(strOnExtraCallback, 80 - string.length()) + string;
        int i2 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str3;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        if (cArr3 != null) {
            int i4 = $10 + 83;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), Color.rgb(0, 0, 0) + 16777293, 20952 - TextUtils.getTrimmedLength(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 74, (ViewConfiguration.getScrollBarSize() >> 8) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (!(!asInterface)) {
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 63 - ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i8 = $10 + 19;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i10 = $10 + 125;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 / 2;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 63 - Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getSize(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i5 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String onExtraCallback(String str) {
        String str2;
        String strSubstring;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Result.Companion companion = Result.Companion;
                Object[] objArr = new Object[1];
                a(new char[]{30699, 30283}, ExpandableListView.getPackedPositionType(0L), objArr);
                strSubstring = str.substring(1, StringsKt.lastIndexOf$default(str, ((String) objArr[0]).intern(), 0, true, 54, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            } else {
                Result.Companion companion2 = Result.Companion;
                Object[] objArr2 = new Object[1];
                a(new char[]{30699, 30283}, 1 - ExpandableListView.getPackedPositionType(0L), objArr2);
                strSubstring = str.substring(0, StringsKt.lastIndexOf$default(str, ((String) objArr2[0]).intern(), 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
            str2 = Result.constructor-impl(strSubstring);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            str2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(str2)) {
            int i3 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            str = str2;
        }
        return str;
    }

    private final String onExtraCallbackWithResult(String str, String str2) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{30699, 30283}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(str, ((String) objArr[0]).intern(), 0, false, 6, (Object) null);
        if (iLastIndexOf$default > 0) {
            int i2 = IAuthTabCallbackDefault + 39;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = iLastIndexOf$default + 1;
            if (str.length() > i4) {
                int i5 = IAuthTabCallbackStub + 25;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                String strSubstring = str.substring(i4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
        }
        return str2;
    }

    private final writeRaw<File> onWarmupCompleted(Context context, String str, String str2) {
        int i = 2 % 2;
        writeRaw<File> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new SendPDFHandler$.ExternalSyntheticLambda10(str, this, context, str2));
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final File onNavigationEvent(String str, setThisUpdate setthisupdate, Context context, String str2) throws Throwable {
        int i = 2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        File fileIAuthTabCallback = setthisupdate.IAuthTabCallback(context, new ByteArrayInputStream(Base64.decode(bytes, 0)), str2);
        int i2 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return fileIAuthTabCallback;
    }

    private final File IAuthTabCallback(Context context, InputStream inputStream, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            context.getCacheDir().exists();
            throw null;
        }
        File cacheDir = context.getCacheDir();
        if (!cacheDir.exists()) {
            int i3 = IAuthTabCallbackDefault + 83;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                cacheDir.mkdir();
                int i4 = 17 / 0;
            } else {
                cacheDir.mkdir();
            }
        }
        Intrinsics.checkNotNull(cacheDir);
        File fileOnExtraCallbackWithResult = onExtraCallbackWithResult(cacheDir, str);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOnExtraCallbackWithResult);
        try {
            try {
                ByteStreamsKt.copyTo(inputStream, fileOutputStream, 4096);
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                CloseableKt.closeFinally(inputStream, (Throwable) null);
                return fileOnExtraCallbackWithResult;
            } finally {
            }
        } finally {
        }
    }

    private final File onExtraCallbackWithResult(File file, String str) throws Throwable {
        int i = 2 % 2;
        File file2 = new File(file, new File(str).getName());
        String canonicalPath = file2.getCanonicalPath();
        Intrinsics.checkNotNull(canonicalPath);
        String canonicalPath2 = file.getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath2, "");
        Object obj = null;
        if (!StringsKt.startsWith$default(canonicalPath, canonicalPath2, false, 2, (Object) null)) {
            Object[] objArr = new Object[1];
            b(null, new byte[]{-114, -115, -116, -123, -117, -123, -120, -125, -118, -119, -123, -120, -121, -122, -123, -124, -125, -126, -127}, null, 127 - View.MeasureSpec.getMode(0), objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return file2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{context, setonoutofmemeryerrorcallback, commonModule_setLeftEdgeTouchEnabled}, iOnWarmupCompleted, -2024990329, iOnWarmupCompleted2, 2024990331, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setThisUpdate setthisupdate, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{setthisupdate, context, setonoutofmemeryerrorcallback, th}, iOnWarmupCompleted, -1891930176, iOnWarmupCompleted2, 1891930179, iOnWarmupCompleted3);
    }

    private static final Unit onExtraCallback(Context context, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{context, deserializeurinullablecollection}, iOnWarmupCompleted, 354313587, iOnWarmupCompleted2, -354313587, iOnWarmupCompleted3);
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted, -244839924, iOnWarmupCompleted2, 244839928, iOnWarmupCompleted3);
    }

    private static final Unit IAuthTabCallback(setThisUpdate setthisupdate, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{setthisupdate, context, setonoutofmemeryerrorcallback, th}, iOnWarmupCompleted, 683001199, iOnWarmupCompleted2, -683001198, iOnWarmupCompleted3);
    }

    private final void onWarmupCompleted(String str, String str2) throws Throwable {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, str, str2}, iOnWarmupCompleted, -1964160531, iOnWarmupCompleted2, 1964160536, iOnWarmupCompleted3);
    }

    static void IAuthTabCallback() {
        onExtraCallback = (char) 5004;
        onExtraCallbackWithResult = (char) 15868;
        onNavigationEvent = (char) 30340;
        onWarmupCompleted = (char) 62024;
        IAuthTabCallback = new char[]{32733, 32762, 32754, 32759, 32766, 32767, 32699, 32745, 32746, 32750, 32758, 32757, 32751, 32693, 32690, 32747, 32760, 32756, 32692, 32765, 32739, 32734, 32707, 32728, 32718, 32719, 32708, 32730, 32722, 32727, 32749, 32724, 32725, 32717, 32713, 32744, 32715, 32735, 32764, 32712, 32738};
        onTransact = -1184333925;
        asBinder = true;
        asInterface = true;
    }
}
