package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebMessageCallbackProxy$;
import im.toss.core.webkit.WebMessageCallbackProxy$invokeJsFuncAwait$3$;
import im.toss.core.webkit.WebMessageCallbackProxy$invokeWebCallbackAwait$3$;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.define.TossAffiliate;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import o.ALCFaceValidation;
import o.setTopGuideBackgroundColor;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTopGuideBackgroundColor implements setOnOutOfMemeryErrorCallback {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static byte[] IAuthTabCallbackStubProxy;
    private static short[] access100;
    private static int asInterface;
    private static int readTypedObject;
    private final WebViewContentOwner IAuthTabCallback;
    private final String asBinder;
    private final drawTextBox onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final JsonObject onNavigationEvent;
    private final Function2<setTopGuideBackgroundColor, Function1<? super TossCoreWebView, Unit>, Unit> onTransact;
    private final setText onWarmupCompleted;
    private static final byte[] $$a = {120, -46, -95, -23};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[ALCFaceValidation.values().length];
            try {
                iArr[ALCFaceValidation.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ALCFaceValidation.WITHOUT_CONTENTS.ordinal()] = 2;
                int i = onNavigationEvent + 29;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2;
        int i3 = (s * 4) + 115;
        int i4 = 1 - (b * 2);
        int i5 = 3 - (s2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            i2 = 0;
            i3 += i5;
            i5 = i6;
            i = i2;
            i2 = i + 1;
            int i7 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i5 = bArr[i7];
            i3 += i5;
            i5 = i6;
            i = i2;
            i2 = i + 1;
            int i72 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            int i722 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    static {
        readTypedObject = 1;
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = getInterfaceDescriptor + 37;
        readTypedObject = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ setTopGuideBackgroundColor(String str, JsonObject jsonObject, WebViewContentOwner webViewContentOwner, String str2, drawTextBox drawtextbox, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonObject, webViewContentOwner, str2, drawtextbox, function2);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i2 | i4));
        int i12 = i2 | i4;
        int i13 = i10 | i12;
        int i14 = (~(i3 | i2)) | (~i12);
        int i15 = i2 + i4 + i + (1068639271 * i6) + ((-1919980423) * i5);
        int i16 = i15 * i15;
        int i17 = ((i2 * 1648758371) - 594280448) + (1648758371 * i4) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i) + ((-1693188096) * i6) + (611057664 * i5) + ((-810221568) * i16);
        int i18 = (i2 * 982247175) + 1844138806 + (i4 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i * 982246413) + (i6 * 1533776379) + (i5 * 1016546853) + (i16 * (-1070530560));
        switch (i17 + (i18 * i18 * 1708326912)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, Map map, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1302457378, iOnExtraCallbackWithResult, -1302457377, new Object[]{str, str2, map, startrunning}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, String str, String str2, Map map, String str3, TossCoreWebView tossCoreWebView) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(settopguidebackgroundcolor, str, str2, map, str3, tossCoreWebView);
        }
        onExtraCallback(settopguidebackgroundcolor, str, str2, map, str3, tossCoreWebView);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(settopguidebackgroundcolor, function1);
        int i4 = access000 + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(startrunning);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 111;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        onPreviewFrame[] onpreviewframeArr = (onPreviewFrame[]) objArr[1];
        String str = (String) objArr[2];
        TossCoreWebView tossCoreWebView = (TossCoreWebView) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(settopguidebackgroundcolor, onpreviewframeArr, str, tossCoreWebView);
        }
        onWarmupCompleted(settopguidebackgroundcolor, onpreviewframeArr, str, tossCoreWebView);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        onPreviewFrame[] onpreviewframeArr = (onPreviewFrame[]) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(onpreviewframeArr, startrunning);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(onpreviewframeArr, startrunning);
        int i3 = access000 + 63;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ void onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        asInterface(settopguidebackgroundcolor, function1);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 7;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, onPreviewFrame[] onpreviewframeArr, String str, String str2, TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(settopguidebackgroundcolor, onpreviewframeArr, str, str2, tossCoreWebView);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 23;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(startrunning);
        int i4 = IAuthTabCallback_Parcel + 13;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onpreviewframeArr, startrunning);
        int i4 = access000 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        onPreviewFrame[] onpreviewframeArr = (onPreviewFrame[]) objArr[1];
        String str = (String) objArr[2];
        TossCoreWebView tossCoreWebView = (TossCoreWebView) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(settopguidebackgroundcolor, onpreviewframeArr, str, tossCoreWebView);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(settopguidebackgroundcolor, onpreviewframeArr, str, tossCoreWebView);
        int i3 = access000 + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onPreviewFrame[] onpreviewframeArr = (onPreviewFrame[]) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(onpreviewframeArr, startrunning);
        }
        onNavigationEvent(onpreviewframeArr, startrunning);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1, TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(settopguidebackgroundcolor, function1, tossCoreWebView);
        int i4 = access000 + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(startrunning);
        int i4 = IAuthTabCallback_Parcel + 117;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onTransact(settopguidebackgroundcolor, function1);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 1;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.setOnOutOfMemeryErrorCallback
    public void onNavigationEvent(@NotNull String str, @Nullable Map<?, ?> map) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private setTopGuideBackgroundColor(String str, JsonObject jsonObject, WebViewContentOwner webViewContentOwner, String str2, drawTextBox drawtextbox, Function2<? super setTopGuideBackgroundColor, ? super Function1<? super TossCoreWebView, Unit>, Unit> function2) {
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = jsonObject;
        this.IAuthTabCallback = webViewContentOwner;
        this.asBinder = str2;
        this.onExtraCallback = drawtextbox;
        this.onTransact = function2;
        this.onWarmupCompleted = new setText(jsonObject);
    }

    public static final /* synthetic */ void IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -11165754, iOnExtraCallbackWithResult, 11165756, new Object[]{settopguidebackgroundcolor, str, str2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            int i3 = 31 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -11165754, iOnExtraCallbackWithResult2, 11165756, new Object[]{settopguidebackgroundcolor, str, str2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
        int i4 = IAuthTabCallback_Parcel + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        String str = settopguidebackgroundcolor.onExtraCallbackWithResult;
        int i5 = i3 + 27;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        String str = settopguidebackgroundcolor.asBinder;
        int i5 = i3 + 57;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ WebViewContentOwner onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 111;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        WebViewContentOwner webViewContentOwner = settopguidebackgroundcolor.IAuthTabCallback;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 123;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return webViewContentOwner;
        }
        throw null;
    }

    public static final /* synthetic */ ALCFaceValidation onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, String str) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnExtraCallbackWithResult = settopguidebackgroundcolor.onExtraCallbackWithResult(str);
        int i4 = access000 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return aLCFaceValidationOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 533576206, iOnExtraCallbackWithResult, -533576202, new Object[]{settopguidebackgroundcolor, function1}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback_Parcel + 17;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setTopGuideBackgroundColor(String str, JsonObject jsonObject, WebViewContentOwner webViewContentOwner, String str2, drawTextBox drawtextbox, int i, DefaultConstructorMarker defaultConstructorMarker) {
        drawTextBox drawtextbox2;
        if ((i & 16) != 0) {
            int i2 = IAuthTabCallback_Parcel + 21;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            drawtextbox2 = null;
        } else {
            drawtextbox2 = drawtextbox;
        }
        this(str, jsonObject, webViewContentOwner, str2, drawtextbox2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setTopGuideBackgroundColor(@NotNull String str, @NotNull JsonObject jsonObject, @NotNull WebViewContentOwner webViewContentOwner, @NotNull String str2, @Nullable drawTextBox drawtextbox) {
        this(str, jsonObject, webViewContentOwner, str2, drawtextbox, new WebMessageCallbackProxy$.ExternalSyntheticLambda8());
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    private static final Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            Intrinsics.checkNotNullParameter(function1, "");
            settopguidebackgroundcolor.onExtraCallback((Function1<? super TossCoreWebView, Unit>) function1);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        Intrinsics.checkNotNullParameter(function1, "");
        settopguidebackgroundcolor.onExtraCallback((Function1<? super TossCoreWebView, Unit>) function1);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(settopguidebackgroundcolor, function1);
            int i4 = IAuthTabCallback + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }

        public final setTopGuideBackgroundColor onWarmupCompleted(@NotNull String str, @NotNull JsonObject jsonObject, @NotNull WebViewContentOwner webViewContentOwner, @NotNull String str2, @Nullable drawTextBox drawtextbox) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str2, "");
            setTopGuideBackgroundColor settopguidebackgroundcolor = new setTopGuideBackgroundColor(str, jsonObject, webViewContentOwner, str2, drawtextbox, new Function2() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 77;
                    onNavigationEvent = i3 % 128;
                    setTopGuideBackgroundColor settopguidebackgroundcolor2 = (setTopGuideBackgroundColor) obj;
                    Function1 function1 = (Function1) obj2;
                    if (i3 % 2 == 0) {
                        setTopGuideBackgroundColor.onNavigationEvent.onNavigationEvent(settopguidebackgroundcolor2, function1);
                        throw null;
                    }
                    Unit unitOnNavigationEvent = setTopGuideBackgroundColor.onNavigationEvent.onNavigationEvent(settopguidebackgroundcolor2, function1);
                    int i4 = onNavigationEvent + 69;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unitOnNavigationEvent;
                }
            }, (DefaultConstructorMarker) null);
            int i2 = onNavigationEvent + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return settopguidebackgroundcolor;
        }

        private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
                Intrinsics.checkNotNullParameter(function1, "");
                setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor, function1);
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            Intrinsics.checkNotNullParameter(function1, "");
            setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor, function1);
            Unit unit2 = Unit.INSTANCE;
            int i3 = onNavigationEvent + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit2;
            }
            throw null;
        }
    }

    private final ALCFaceValidation onExtraCallbackWithResult(String str) {
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult = ALCFaceValidation.Companion;
            throw null;
        }
        ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult2 = ALCFaceValidation.Companion;
        setText settext = this.onWarmupCompleted;
        drawTextBox drawtextbox = this.onExtraCallback;
        if (drawtextbox == null || (aLCFaceValidationOnWarmupCompleted = drawtextbox.onWarmupCompleted(str)) == null) {
            aLCFaceValidationOnWarmupCompleted = ALCFaceValidation.WITHOUT_CONTENTS;
        }
        ALCFaceValidation aLCFaceValidationOnExtraCallbackWithResult = onextracallbackwithresult2.onExtraCallbackWithResult(settext, aLCFaceValidationOnWarmupCompleted);
        int i3 = access000 + 43;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnExtraCallbackWithResult;
    }

    private final void onExtraCallbackWithResult(Function1<? super TossCoreWebView, Unit> function1) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.invoke(this, function1);
        int i4 = IAuthTabCallback_Parcel + 99;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1, TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        String strOnExtraCallbackWithResult = tossCoreWebView.onExtraCallbackWithResult();
        String url = tossCoreWebView.getUrl();
        if (!StringsKt.equals(settopguidebackgroundcolor.asBinder, strOnExtraCallbackWithResult, true)) {
            int i4 = IAuthTabCallback_Parcel + 63;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (StringsKt.equals(settopguidebackgroundcolor.asBinder, url, true)) {
                function1.invoke(tossCoreWebView);
                int i6 = access000 + 59;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = IAuthTabCallback_Parcel + 47;
                access000 = i8 % 128;
                if (i8 % 2 == 0) {
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -11165754, iOnExtraCallbackWithResult, 11165756, new Object[]{settopguidebackgroundcolor, strOnExtraCallbackWithResult, url}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                    throw null;
                }
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -11165754, iOnExtraCallbackWithResult2, 11165756, new Object[]{settopguidebackgroundcolor, strOnExtraCallbackWithResult, url}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            }
        }
        return Unit.INSTANCE;
    }

    private static final void asInterface(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        TossCoreWebView webView = settopguidebackgroundcolor.IAuthTabCallback.getWebView();
        if (webView != null) {
            int i2 = IAuthTabCallback_Parcel + 27;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(webView);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = access000 + 115;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallback(Function1<? super TossCoreWebView, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView webView = this.IAuthTabCallback.getWebView();
        if (webView != null) {
            WebMessageCallbackProxy$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new WebMessageCallbackProxy$.ExternalSyntheticLambda11(this, function1);
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                webView.post(new WebMessageCallbackProxy$.ExternalSyntheticLambda12(this, externalSyntheticLambda11));
                return;
            }
            externalSyntheticLambda11.invoke(webView);
            int i4 = access000 + 65;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView webView = settopguidebackgroundcolor.IAuthTabCallback.getWebView();
        if (webView != null) {
            int i4 = access000 + 107;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                function1.invoke(webView);
            } else {
                webView.post(new Runnable() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 53;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            setTopGuideBackgroundColor.onWarmupCompleted(this.f$0, function1);
                            throw null;
                        }
                        setTopGuideBackgroundColor.onWarmupCompleted(this.f$0, function1);
                        int i8 = onNavigationEvent + 77;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                    }
                });
                int i6 = IAuthTabCallback_Parcel + 55;
                access000 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return null;
    }

    private static final void onTransact(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        WebViewContentOwner webViewContentOwner = settopguidebackgroundcolor.IAuthTabCallback;
        if (i3 != 0) {
            webViewContentOwner.getWebView();
            throw null;
        }
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            int i4 = IAuthTabCallback_Parcel + 125;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            function1.invoke(webView);
        }
        int i6 = IAuthTabCallback_Parcel + 1;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback().onExtraCallback(), settopguidebackgroundcolor.new onExtraCallbackWithResult(function2, null), (access13800) objArr[2]);
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onExtraCallbackWithResult<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function2<TossCoreWebView, access13800<? super T>, Object> $action;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function2<? super TossCoreWebView, ? super access13800<? super T>, ? extends Object> function2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$action = function2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = setTopGuideBackgroundColor.this.new onExtraCallbackWithResult(this.$action, access13800Var);
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super T> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallback + 31;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            TossCoreWebView webView = setTopGuideBackgroundColor.onExtraCallbackWithResult(setTopGuideBackgroundColor.this).getWebView();
            if (webView == null) {
                return null;
            }
            String strOnExtraCallbackWithResult = webView.onExtraCallbackWithResult();
            String url = webView.getUrl();
            if (!StringsKt.equals(setTopGuideBackgroundColor.onExtraCallback(setTopGuideBackgroundColor.this), strOnExtraCallbackWithResult, true)) {
                int i5 = onExtraCallback + 91;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (!StringsKt.equals(setTopGuideBackgroundColor.onExtraCallback(setTopGuideBackgroundColor.this), url, true)) {
                    setTopGuideBackgroundColor.IAuthTabCallback(setTopGuideBackgroundColor.this, strOnExtraCallbackWithResult, url);
                    return null;
                }
            }
            Function2<TossCoreWebView, access13800<? super T>, Object> function2 = this.$action;
            this.L$0 = access15400.onNavigationEvent(webView);
            this.L$1 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
            this.L$2 = access15400.onNavigationEvent(url);
            this.label = 1;
            Object objInvoke = function2.invoke(webView, this);
            return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        String str;
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("message_name", settopguidebackgroundcolor.onExtraCallbackWithResult);
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ExpandableListView.getPackedPositionType(0L), 1145231961 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 257740026, (ViewConfiguration.getWindowTouchSlop() >> 8) - 59, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), settopguidebackgroundcolor.asBinder);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("current_url", str2);
        TossCoreWebView webView = settopguidebackgroundcolor.IAuthTabCallback.getWebView();
        if (webView != null) {
            int i4 = IAuthTabCallback_Parcel + 117;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                str = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{webView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                int i5 = 7 / 0;
            } else {
                str = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{webView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            }
        } else {
            str = null;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "js_callback_not_allowed", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("_webview_id", str), getWrite.IAuthTabCallback("webview_url", str3)}), (String) null, false, (String) null, 58, (Object) null);
        return null;
    }

    @Override // o.setOnOutOfMemeryErrorCallback
    public void onNavigationEvent(@NotNull String str, @NotNull Object[] objArr, @Nullable String str2, @NotNull ALCFaceValidation aLCFaceValidation, boolean z) throws Throwable {
        Object obj;
        Pair pairIAuthTabCallback;
        String string;
        Object obj2;
        char c;
        char c2;
        String str3;
        String string2;
        Object obj3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(aLCFaceValidation, "");
        if (aLCFaceValidation == ALCFaceValidation.DISABLED) {
            return;
        }
        int i2 = onWarmupCompleted.IAuthTabCallback[aLCFaceValidation.ordinal()];
        if (i2 == 1) {
            if (objArr.length == 0) {
                obj = null;
            } else {
                obj = objArr[0];
                int lastIndex = ArraysKt.getLastIndex(objArr);
                if (lastIndex > 0) {
                    int i3 = IAuthTabCallback_Parcel + 45;
                    int i4 = i3 % 128;
                    access000 = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 109;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 1;
                    while (true) {
                        obj = obj + ", " + objArr[i8];
                        if (i8 == lastIndex) {
                            break;
                        }
                        int i9 = IAuthTabCallback_Parcel + 115;
                        access000 = i9 % 128;
                        int i10 = i9 % 2;
                        i8++;
                    }
                }
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(obj, this.onWarmupCompleted.onNavigationEvent(true));
        } else if (i2 == 2 && z) {
            if (objArr.length == 0) {
                int i11 = access000 + 59;
                IAuthTabCallback_Parcel = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 9 / 0;
                }
                obj3 = null;
            } else {
                obj3 = objArr[0];
                int lastIndex2 = ArraysKt.getLastIndex(objArr);
                if (lastIndex2 > 0) {
                    int i13 = IAuthTabCallback_Parcel;
                    int i14 = i13 + 125;
                    access000 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = i13 + 25;
                    access000 = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = 1;
                    while (true) {
                        obj3 = obj3 + ", " + objArr[i18];
                        if (i18 == lastIndex2) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(obj3, (Object) null);
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback((Object) null, (Object) null);
        }
        Object objOnExtraCallbackWithResult = pairIAuthTabCallback.onExtraCallbackWithResult();
        JsonObject jsonObject = (JsonObject) pairIAuthTabCallback.IAuthTabCallback();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (objOnExtraCallbackWithResult != null) {
            int i19 = access000 + 21;
            IAuthTabCallback_Parcel = i19 % 128;
            int i20 = i19 % 2;
            string = objOnExtraCallbackWithResult.toString();
        } else {
            string = null;
        }
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getTrimmedLength(""), (byte) KeyEvent.keyCodeFromString(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 1145231964, (ViewConfiguration.getFadingEdgeLength() >> 16) + 257740018, View.MeasureSpec.getSize(0) - 58, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) KeyEvent.getDeadChar(0, 0), 1145231961 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 257740026, (-58) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), this.asBinder);
        Object[] objArr4 = new Object[1];
        a((short) ('0' - AndroidCharacter.getMirror('0')), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 1145231967 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 257740022, (-56) - TextUtils.indexOf("", ""), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str2);
        TossCoreWebView webView = this.IAuthTabCallback.getWebView();
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("_webview_id", webView != null ? (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{webView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()) : null)});
        if (jsonObject != null) {
            int i21 = access000 + 59;
            IAuthTabCallback_Parcel = i21 % 128;
            int i22 = i21 % 2;
            mapIAuthTabCallback.put("params", jsonObject.toString());
        }
        Unit unit = Unit.INSTANCE;
        Object[] objArr5 = new Object[1];
        a((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) TextUtils.getTrimmedLength(""), 1128454755 - Color.rgb(0, 0, 0), 257740004 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-47) - Process.getGidForName(""), objArr5);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr5[0]).intern(), string, mapIAuthTabCallback, (String) null, false, (String) null, 56, (Object) null);
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{this.asBinder});
        if (uri == null || !filterCreatePageParams.onWarmupCompleted(uri)) {
            obj2 = "_webview_id";
            c = '0';
            c2 = 4;
            str3 = null;
        } else {
            if (objOnExtraCallbackWithResult != null) {
                int i23 = access000 + 89;
                IAuthTabCallback_Parcel = i23 % 128;
                if (i23 % 2 != 0) {
                    objOnExtraCallbackWithResult.toString();
                    throw null;
                }
                string2 = objOnExtraCallbackWithResult.toString();
                str3 = null;
            } else {
                str3 = null;
                string2 = null;
            }
            Object[] objArr6 = new Object[1];
            a((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1145231963 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 257740018, (-59) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr6);
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), str);
            Object[] objArr7 = new Object[1];
            a((short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) View.MeasureSpec.getSize(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1145231961, 257740025 - (ViewConfiguration.getScrollDefaultDelay() >> 16), AndroidCharacter.getMirror('0') - 'k', objArr7);
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), this.asBinder);
            Object[] objArr8 = new Object[1];
            a((short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1145231966, (ViewConfiguration.getFadingEdgeLength() >> 16) + 257740022, (ViewConfiguration.getLongPressTimeout() >> 16) - 56, objArr8);
            Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), str2);
            TossCoreWebView webView2 = this.IAuthTabCallback.getWebView();
            Map mapIAuthTabCallback2 = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback("_webview_id", webView2 != null ? (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{webView2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()) : str3)});
            if (jsonObject != null) {
                mapIAuthTabCallback2.put("params", jsonObject.toString());
            }
            c = '0';
            Object[] objArr9 = new Object[1];
            a((short) ('0' - AndroidCharacter.getMirror('0')), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1145231970, 257740005 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-46) - TextUtils.getOffsetAfter("", 0), objArr9);
            c2 = 4;
            obj2 = "_webview_id";
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr9[0]).intern(), string2, mapIAuthTabCallback2, (String) null, false, "bank", 24, (Object) null);
        }
        Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{this.asBinder});
        if (uri2 == null || !filterCreatePageParams.IAuthTabCallbackStub(uri2)) {
            return;
        }
        String string3 = objOnExtraCallbackWithResult != null ? objOnExtraCallbackWithResult.toString() : str3;
        String lowerCaseName = TossAffiliate.SECURITIES.getLowerCaseName();
        Object[] objArr10 = new Object[1];
        a((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) TextUtils.getOffsetAfter("", 0), 1145231963 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 257740017, (-58) - View.combineMeasuredStates(0, 0), objArr10);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), str);
        Object[] objArr11 = new Object[1];
        a((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (AndroidCharacter.getMirror(c) - '0'), KeyEvent.normalizeMetaState(0) + 1145231961, (ViewConfiguration.getScrollBarSize() >> 8) + 257740025, Color.green(0) - 59, objArr11);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), this.asBinder);
        Object[] objArr12 = new Object[1];
        a((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) View.combineMeasuredStates(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1145231966, 257740022 - TextUtils.getOffsetAfter("", 0), (-56) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), str2);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback("content", str);
        TossCoreWebView webView3 = this.IAuthTabCallback.getWebView();
        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(obj2, webView3 != null ? (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{webView3}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()) : str3);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = pairIAuthTabCallback8;
        pairArr[1] = pairIAuthTabCallback9;
        pairArr[2] = pairIAuthTabCallback10;
        pairArr[3] = pairIAuthTabCallback11;
        pairArr[c2] = pairIAuthTabCallback12;
        Map mapIAuthTabCallback3 = access8100.IAuthTabCallback(pairArr);
        if (jsonObject != null) {
            int i24 = access000 + 49;
            IAuthTabCallback_Parcel = i24 % 128;
            int i25 = i24 % 2;
            mapIAuthTabCallback3.put("params", jsonObject.toString());
        }
        Object[] objArr13 = new Object[1];
        a((short) (TextUtils.indexOf("", c, 0) + 1), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 1145231970 + (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.green(0) + 257740005, (-47) - ExpandableListView.getPackedPositionChild(0L), objArr13);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr13[0]).intern(), string3, mapIAuthTabCallback3, (String) null, false, lowerCaseName, 24, (Object) null);
    }

    @Override // o.setOnOutOfMemeryErrorCallback
    public void IAuthTabCallback(@NotNull Function1<? super startRunning, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        final String strIAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub == null) {
            int i4 = access000 + 107;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        final onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        onExtraCallbackWithResult(new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda10
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = {this.f$0, onpreviewframeArrOnExtraCallback, strIAuthTabCallbackStub, (TossCoreWebView) obj};
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                Unit unit = (Unit) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 400444509, iOnExtraCallbackWithResult, -400444504, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                int i8 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
        });
    }

    private static final Unit asBinder(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
        }
        for (onPreviewFrame onpreviewframe : onpreviewframeArr) {
            int i3 = access000 + 117;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            startrunning.IAuthTabCallback(onpreviewframe);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, final onPreviewFrame[] onpreviewframeArr, String str, TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, settopguidebackgroundcolor.onExtraCallbackWithResult, Arrays.copyOf(onpreviewframeArr, onpreviewframeArr.length), "onSuccess", settopguidebackgroundcolor.onExtraCallbackWithResult(settopguidebackgroundcolor.onExtraCallbackWithResult), false, 16, null);
        setTopGuideFontSize.onExtraCallbackWithResult(tossCoreWebView, str, settopguidebackgroundcolor.asBinder, new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 7;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = {onpreviewframeArr, (startRunning) obj};
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    unit = (Unit) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1963710889, iOnExtraCallbackWithResult, 1963710895, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                    int i4 = 50 / 0;
                } else {
                    Object[] objArr2 = {onpreviewframeArr, (startRunning) obj};
                    int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    unit = (Unit) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1963710889, iOnExtraCallbackWithResult2, 1963710895, objArr2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                }
                int i5 = IAuthTabCallback + 17;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    @Override // o.setOnOutOfMemeryErrorCallback
    public void onExtraCallbackWithResult(@Nullable final String str, @Nullable final String str2, @NotNull final Map<String, String> map) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = {this.onWarmupCompleted};
        final String str3 = (String) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1888845477, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1888845477, objArr);
        if (str3 == null) {
            return;
        }
        onExtraCallbackWithResult(new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 11;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return setTopGuideBackgroundColor.IAuthTabCallback(this.f$0, str, str2, map, str3, (TossCoreWebView) obj);
                }
                int i6 = 24 / 0;
                return setTopGuideBackgroundColor.IAuthTabCallback(this.f$0, str, str2, map, str3, (TossCoreWebView) obj);
            }
        });
        int i4 = IAuthTabCallback_Parcel + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Map map = (Map) objArr[2];
        startRunning startrunning = (startRunning) objArr[3];
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback((JsonElement) ALCFaceBox.onWarmupCompleted(str, str2, (Map<String, String>) map));
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, final String str, final String str2, final Map map, String str3, TossCoreWebView tossCoreWebView) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        String str4 = settopguidebackgroundcolor.onExtraCallbackWithResult;
        settopguidebackgroundcolor.onNavigationEvent(str4, new Object[]{str, str2, map}, "onError", settopguidebackgroundcolor.onExtraCallbackWithResult(str4), true);
        setTopGuideFontSize.onExtraCallbackWithResult(tossCoreWebView, str3, settopguidebackgroundcolor.asBinder, new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = setTopGuideBackgroundColor.IAuthTabCallback(str, str2, map, (startRunning) obj);
                int i5 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 105;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // o.setOnOutOfMemeryErrorCallback
    public void onNavigationEvent(@NotNull final String str, @NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final String strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(str);
        if (strOnWarmupCompleted != null) {
            startRunning startrunning = new startRunning();
            function1.invoke(startrunning);
            final onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
            onExtraCallbackWithResult(new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 121;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    setTopGuideBackgroundColor settopguidebackgroundcolor = this.f$0;
                    if (i6 != 0) {
                        return setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor, onpreviewframeArrOnExtraCallback, str, strOnWarmupCompleted, (TossCoreWebView) obj);
                    }
                    Unit unitOnExtraCallbackWithResult = setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor, onpreviewframeArrOnExtraCallback, str, strOnWarmupCompleted, (TossCoreWebView) obj);
                    int i7 = 70 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
            return;
        }
        int i4 = access000 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 87;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            length = onpreviewframeArr.length;
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            length = onpreviewframeArr.length;
            i = 0;
        }
        while (i < length) {
            startrunning.IAuthTabCallback(onpreviewframeArr[i]);
            i++;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 97;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, final onPreviewFrame[] onpreviewframeArr, String str, String str2, TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, settopguidebackgroundcolor.onExtraCallbackWithResult, Arrays.copyOf(onpreviewframeArr, onpreviewframeArr.length), str, settopguidebackgroundcolor.onExtraCallbackWithResult(settopguidebackgroundcolor.onExtraCallbackWithResult), false, 16, null);
        setTopGuideFontSize.onExtraCallbackWithResult(tossCoreWebView, str2, settopguidebackgroundcolor.asBinder, new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 29;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = {onpreviewframeArr, (startRunning) obj};
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    throw null;
                }
                Object[] objArr2 = {onpreviewframeArr, (startRunning) obj};
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                Unit unit = (Unit) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 14876054, iOnExtraCallbackWithResult2, -14876051, objArr2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                int i4 = onExtraCallback + 29;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 62 / 0;
                }
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit asBinder(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.red(0)), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 79;
                $11 = i7 % 128;
                i4 = i7 % 2 == 0 ? 0 : 1;
            }
            if (i4 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = IAuthTabCallbackStubProxy;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myTid() >> 22)), 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2167 - TextUtils.indexOf("", "", 0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    i5 = 2;
                    int i10 = i9 % 2;
                    bArr = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallbackStubProxy;
                    try {
                        Object[] objArr4 = new Object[i5];
                        objArr4[1] = Integer.valueOf(asInterface);
                        objArr4[0] = Integer.valueOf(i);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 43424), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, Color.blue(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (access100[i + ((int) (asInterface ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (asInterface ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackDefault), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 86 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallbackStubProxy;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                        i11++;
                        int i12 = $11 + 93;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallbackStubProxy;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<TossCoreWebView, access13800<? super String>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $callback;
        final /* synthetic */ String $callbackName;
        final /* synthetic */ onPreviewFrame[] $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(onPreviewFrame[] onpreviewframeArr, String str, String str2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$params = onpreviewframeArr;
            this.$callbackName = str;
            this.$callback = str2;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(onpreviewframeArr, startrunning);
            }
            IAuthTabCallback(onpreviewframeArr, startrunning);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = setTopGuideBackgroundColor.this.new IAuthTabCallback(this.$params, this.$callbackName, this.$callback, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((TossCoreWebView) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(TossCoreWebView tossCoreWebView, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(tossCoreWebView, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent;
                int i6 = i5 + 15;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 99;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            setTopGuideBackgroundColor settopguidebackgroundcolor = setTopGuideBackgroundColor.this;
            String str = (String) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1431369451, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1431369443, new Object[]{settopguidebackgroundcolor}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            onPreviewFrame[] onpreviewframeArr = this.$params;
            Object[] objArrCopyOf = Arrays.copyOf(onpreviewframeArr, onpreviewframeArr.length);
            String str2 = this.$callbackName;
            setTopGuideBackgroundColor settopguidebackgroundcolor2 = setTopGuideBackgroundColor.this;
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, str, objArrCopyOf, str2, setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor2, (String) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1431369451, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1431369443, new Object[]{settopguidebackgroundcolor2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult())), false, 16, null);
            String str3 = this.$callback;
            String strOnExtraCallback = setTopGuideBackgroundColor.onExtraCallback(setTopGuideBackgroundColor.this);
            WebMessageCallbackProxy$invokeWebCallbackAwait$3$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new WebMessageCallbackProxy$invokeWebCallbackAwait$3$.ExternalSyntheticLambda0(this.$params);
            this.L$0 = access15400.onNavigationEvent(tossBridgeWebView);
            this.label = 1;
            Object objOnWarmupCompleted2 = tossBridgeWebView.onWarmupCompleted(str3, strOnExtraCallback, (Function1<? super startRunning, Unit>) externalSyntheticLambda0, (access13800<? super String>) this);
            return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
        }

        private static final Unit IAuthTabCallback(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
            int length;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                length = onpreviewframeArr.length;
                i = 1;
            } else {
                length = onpreviewframeArr.length;
                i = 0;
            }
            while (i < length) {
                int i4 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                startrunning.IAuthTabCallback(onpreviewframeArr[i]);
                i++;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallbackStub(startRunning startrunning) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            unit = Unit.INSTANCE;
            int i3 = 87 / 0;
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback_Parcel + 49;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, String str, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 47;
        access000 = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            function1 = new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 43;
                    onExtraCallbackWithResult = i5 % 128;
                    Object obj3 = null;
                    startRunning startrunning = (startRunning) obj2;
                    if (i5 % 2 != 0) {
                        setTopGuideBackgroundColor.IAuthTabCallback(startrunning);
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = setTopGuideBackgroundColor.IAuthTabCallback(startrunning);
                    int i6 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            };
        }
        settopguidebackgroundcolor.IAuthTabCallback(str, (Function1<? super startRunning, Unit>) function1);
        int i4 = IAuthTabCallback_Parcel + 121;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull final String str, @NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        final onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        onExtraCallbackWithResult(new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, onpreviewframeArrOnExtraCallback, str, (TossCoreWebView) obj};
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                Unit unit = (Unit) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -710295010, iOnExtraCallbackWithResult, 710295017, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                int i5 = onWarmupCompleted + 95;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 58 / 0;
                }
                return unit;
            }
        });
        int i2 = IAuthTabCallback_Parcel + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        int length = onpreviewframeArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = access000 + 111;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                startrunning.IAuthTabCallback(onpreviewframeArr[i4]);
                i4 += 85;
            } else {
                startrunning.IAuthTabCallback(onpreviewframeArr[i4]);
                i4++;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, final onPreviewFrame[] onpreviewframeArr, String str, TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, settopguidebackgroundcolor.onExtraCallbackWithResult, Arrays.copyOf(onpreviewframeArr, onpreviewframeArr.length), null, settopguidebackgroundcolor.onExtraCallbackWithResult(settopguidebackgroundcolor.onExtraCallbackWithResult), false, 20, null);
        setTopGuideFontSize.onExtraCallbackWithResult(tossCoreWebView, str, settopguidebackgroundcolor.asBinder, new Function1() { // from class: im.toss.core.webkit.WebMessageCallbackProxy$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = setTopGuideBackgroundColor.onExtraCallbackWithResult(onpreviewframeArr, (startRunning) obj);
                int i5 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 107;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final Object onExtraCallback(@NotNull String str, @NotNull Function1<? super startRunning, Unit> function1, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        Object[] objArr = {this, new onExtraCallback(startrunning.onExtraCallback(), str, null), access13800Var};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Object objIAuthTabCallback = IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1439717129, iOnExtraCallbackWithResult, 1439717129, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i2 = IAuthTabCallback_Parcel + 109;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<TossCoreWebView, access13800<? super String>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $functionName;
        final /* synthetic */ onPreviewFrame[] $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(onPreviewFrame[] onpreviewframeArr, String str, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$params = onpreviewframeArr;
            this.$functionName = str;
        }

        public static /* synthetic */ Unit IAuthTabCallback(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onpreviewframeArr, startrunning);
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = setTopGuideBackgroundColor.this.new onExtraCallback(this.$params, this.$functionName, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((TossCoreWebView) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(TossCoreWebView tossCoreWebView, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(tossCoreWebView, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onWarmupCompleted + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            setTopGuideBackgroundColor settopguidebackgroundcolor = setTopGuideBackgroundColor.this;
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            String str = (String) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1431369451, iOnExtraCallbackWithResult, -1431369443, new Object[]{settopguidebackgroundcolor}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            onPreviewFrame[] onpreviewframeArr = this.$params;
            Object[] objArrCopyOf = Arrays.copyOf(onpreviewframeArr, onpreviewframeArr.length);
            setTopGuideBackgroundColor settopguidebackgroundcolor2 = setTopGuideBackgroundColor.this;
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, str, objArrCopyOf, null, setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor2, (String) setTopGuideBackgroundColor.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1431369451, iOnExtraCallbackWithResult2, -1431369443, new Object[]{settopguidebackgroundcolor2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult())), false, 20, null);
            String str2 = this.$functionName;
            String strOnExtraCallback = setTopGuideBackgroundColor.onExtraCallback(setTopGuideBackgroundColor.this);
            WebMessageCallbackProxy$invokeJsFuncAwait$3$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new WebMessageCallbackProxy$invokeJsFuncAwait$3$.ExternalSyntheticLambda0(this.$params);
            this.L$0 = access15400.onNavigationEvent(tossBridgeWebView);
            this.label = 1;
            Object objOnWarmupCompleted2 = tossBridgeWebView.onWarmupCompleted(str2, strOnExtraCallback, (Function1<? super startRunning, Unit>) externalSyntheticLambda0, (access13800<? super String>) this);
            if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                return objOnWarmupCompleted2;
            }
            int i5 = onWarmupCompleted + 61;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        private static final Unit onExtraCallbackWithResult(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int length = onpreviewframeArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = onWarmupCompleted + 111;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    startrunning.IAuthTabCallback(onpreviewframeArr[i4]);
                    i4 += 109;
                } else {
                    startrunning.IAuthTabCallback(onpreviewframeArr[i4]);
                    i4++;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 14876054, iOnExtraCallbackWithResult, -14876051, new Object[]{onpreviewframeArr, startrunning}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(onPreviewFrame[] onpreviewframeArr, startRunning startrunning) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1963710889, iOnExtraCallbackWithResult, 1963710895, new Object[]{onpreviewframeArr, startrunning}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, onPreviewFrame[] onpreviewframeArr, String str, TossCoreWebView tossCoreWebView) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 400444509, iOnExtraCallbackWithResult, -400444504, new Object[]{settopguidebackgroundcolor, onpreviewframeArr, str, tossCoreWebView}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, onPreviewFrame[] onpreviewframeArr, String str, TossCoreWebView tossCoreWebView) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -710295010, iOnExtraCallbackWithResult, 710295017, new Object[]{settopguidebackgroundcolor, onpreviewframeArr, str, tossCoreWebView}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ String onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1431369451, iOnExtraCallbackWithResult, -1431369443, new Object[]{settopguidebackgroundcolor}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private final void onExtraCallbackWithResult(String str, String str2) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -11165754, iOnExtraCallbackWithResult, 11165756, new Object[]{this, str, str2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(String str, String str2, Map map, startRunning startrunning) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1302457378, iOnExtraCallbackWithResult, -1302457377, new Object[]{str, str2, map, startrunning}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private final void onNavigationEvent(Function1<? super TossCoreWebView, Unit> function1) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 533576206, iOnExtraCallbackWithResult, -533576202, new Object[]{this, function1}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private final <T> Object onWarmupCompleted(Function2<? super TossCoreWebView, ? super access13800<? super T>, ? extends Object> function2, access13800<? super T> access13800Var) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1439717129, iOnExtraCallbackWithResult, 1439717129, new Object[]{this, function2, access13800Var}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    static void IAuthTabCallback() {
        asInterface = 536542639;
        IAuthTabCallbackStub = -1538795466;
        IAuthTabCallbackDefault = 1424288628;
        IAuthTabCallbackStubProxy = new byte[]{-14, -11, -16, 4, -5, 0, -1, 10, 6, -5, -15, 0, -2, 5, -15, 1, -14, -10, 11, -13, -1, 24, -6, 8, 7, 8, 8, 8, 8};
    }
}
