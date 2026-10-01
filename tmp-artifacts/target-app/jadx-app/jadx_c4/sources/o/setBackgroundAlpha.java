package o;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.esafirm.rxdownloader.RxDownloader;
import com.horcrux.svg.SvgPackage;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.tmoney.a;
import im.toss.core.webkit.TossDownloadListener$;
import im.toss.extensions.RxPermissionsKt;
import im.toss.uikit.R;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.Cookies_clearAll;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setBackgroundAlpha implements DownloadListener {
    public static final IAuthTabCallback Companion;
    private static long IAuthTabCallbackStub;
    private static int access100;
    private static char asInterface;
    private static final String onExtraCallbackWithResult;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final onExtraCallbackWithResult onExtraCallback;
    private final List<String> onNavigationEvent;
    private final WebView onWarmupCompleted;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = b * 4;
        int i5 = 110 - s;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            int i9 = i6;
            i5 = (-i5) + i9;
            i3 = i7;
            i2 = i8;
            int i10 = i3 + 1;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i11 = bArr[i10];
            i9 = i5;
            i5 = i11;
            i7 = i10;
            i5 = (-i5) + i9;
            i3 = i7;
            i2 = i8;
            int i102 = i3 + 1;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i3 + 1;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(th);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i3 = IAuthTabCallbackDefault + 21;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, UIKitBaseActivity uIKitBaseActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(function0, uIKitBaseActivity, bool);
        }
        onExtraCallbackWithResult(function0, uIKitBaseActivity, bool);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 27 / 0;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, setBackgroundAlpha setbackgroundalpha, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, setbackgroundalpha, str);
        int i4 = asBinder + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = asBinder + 11;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~(i5 | i6);
        int i8 = (~i3) | (~i6);
        int i9 = (~i8) | i5;
        int i10 = (~(i6 | i3)) | (~((~i5) | i3)) | (~(i8 | i5));
        int i11 = i3 + i5 + i2 + ((-101282902) * i4) + ((-829309908) * i);
        int i12 = i11 * i11;
        int i13 = ((i3 * 42798203) - 224002048) + (42798203 * i5) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i2) + (1710751744 * i4) + ((-1643118592) * i) + ((-1134166016) * i12);
        int i14 = (i3 * 1745018779) + 1790267665 + (i5 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i2 * 1745018721) + (i4 * (-1587019414)) + (i * (-1871011668)) + (i12 * 1017511936);
        switch (i13 + (i14 * i14 * (-1139146752))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                String str = (String) objArr[0];
                setBackgroundAlpha setbackgroundalpha = (setBackgroundAlpha) objArr[1];
                String str2 = (String) objArr[2];
                String str3 = (String) objArr[3];
                String str4 = (String) objArr[4];
                UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[5];
                int i15 = 2 % 2;
                int i16 = asBinder + 27;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnExtraCallback = onExtraCallback(str, setbackgroundalpha, str2, str3, str4, uIKitBaseActivity);
                int i18 = IAuthTabCallbackDefault + 3;
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                return unitOnExtraCallback;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onTransact(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setBackgroundAlpha setbackgroundalpha, String str, UIKitBaseActivity uIKitBaseActivity, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setbackgroundalpha, str, uIKitBaseActivity, str2}, 1905215869, iOnExtraCallbackWithResult3, -1905215863, iOnExtraCallbackWithResult);
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ String onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder(function1, obj);
        int i4 = asBinder + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(UIKitBaseActivity uIKitBaseActivity, Intent intent, TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(uIKitBaseActivity, intent, tdsToastV1);
        }
        onExtraCallback(uIKitBaseActivity, intent, tdsToastV1);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = asBinder + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(uIKitBaseActivity, th);
        int i4 = IAuthTabCallbackDefault + 37;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = asBinder + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public setBackgroundAlpha(@NotNull WebView webView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = webView;
        this.IAuthTabCallback = str;
        this.onNavigationEvent = CollectionsKt.listOf(new String[]{"png", "jpg", "jpeg", "pdf"});
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.onExtraCallback = onextracallbackwithresult;
        webView.addJavascriptInterface(onextracallbackwithresult, "Base64Downloader");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setBackgroundAlpha setbackgroundalpha = (setBackgroundAlpha) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setbackgroundalpha.onExtraCallbackWithResult(bArr, str);
        int i4 = IAuthTabCallbackDefault + 17;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WebView onNavigationEvent(setBackgroundAlpha setbackgroundalpha) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        WebView webView = setbackgroundalpha.onWarmupCompleted;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 115;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return webView;
    }

    public static final /* synthetic */ void onNavigationEvent(setBackgroundAlpha setbackgroundalpha, String str, String str2, String str3, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setbackgroundalpha.IAuthTabCallback(str, str2, str3, th);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 17;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public onExtraCallbackWithResult() {
        }

        @JavascriptInterface
        public final void convertBase64ToFile(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            String lowerCase = StringsKt.substringAfter$default(str2, '/', (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), System.currentTimeMillis() + "." + lowerCase);
            byte[] bArrDecode = Base64.decode(StringsKt.substringAfter$default(str, "base64,", (String) null, 2, (Object) null), 0);
            if (Intrinsics.areEqual(lowerCase, "png")) {
                String str4 = System.currentTimeMillis() + ".jpg";
                setBackgroundAlpha setbackgroundalpha = setBackgroundAlpha.this;
                Intrinsics.checkNotNull(bArrDecode);
                int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
                setBackgroundAlpha.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{setbackgroundalpha, bArrDecode, str4}, -817941082, SvgPackage.21.onExtraCallbackWithResult(), 817941087, iOnExtraCallbackWithResult);
                return;
            }
            Context context = setBackgroundAlpha.onNavigationEvent(setBackgroundAlpha.this).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback instanceof UIKitBaseActivity) {
                int i2 = onNavigationEvent + 91;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 69;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                textFieldScrollKtExternalSyntheticLambda0 = (UIKitBaseActivity) textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback;
            } else {
                textFieldScrollKtExternalSyntheticLambda0 = null;
            }
            if (textFieldScrollKtExternalSyntheticLambda0 == null) {
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onWarmupCompleted(file, setBackgroundAlpha.this, str, str2, str3, bArrDecode, textFieldScrollKtExternalSyntheticLambda0, (access13800) null), 2, (Object) null);
        }

        @JavascriptInterface
        public final void notifyFailure(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            setBackgroundAlpha.onNavigationEvent(setBackgroundAlpha.this, str, str2, str3, new Exception("Javascript failed to download blob file."));
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        UIKitBaseActivity uIKitBaseActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (IAuthTabCallback()) {
            int i2 = IAuthTabCallbackDefault + 37;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Context context = this.onWarmupCompleted.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback instanceof UIKitBaseActivity) {
                int i4 = asBinder + 31;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    uIKitBaseActivity = (UIKitBaseActivity) activityIAuthTabCallback;
                    int i5 = 84 / 0;
                } else {
                    uIKitBaseActivity = (UIKitBaseActivity) activityIAuthTabCallback;
                }
            } else {
                uIKitBaseActivity = null;
            }
            if (uIKitBaseActivity != null) {
                IAuthTabCallback(uIKitBaseActivity, (Function0<Unit>) new TossDownloadListener$.ExternalSyntheticLambda1(str, this, str4, str2, str3, uIKitBaseActivity));
                return;
            }
        }
        int i6 = IAuthTabCallbackDefault + 5;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 43;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 43;
                    int i6 = 1450 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b = $$a[0];
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), iKeyCodeFromString, i6, 228868077, false, $$c(b2, b2, (byte) (-b)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 49123);
                    int i7 = 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1494;
                    byte b3 = $$a[0];
                    byte b4 = (byte) (b3 - 1);
                    byte b5 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, i7, i8, 1533236389, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getPressedStateDuration() >> 16)), 50 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 22939 - Gravity.getAbsoluteGravity(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45848), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, (KeyEvent.getMaxKeyCode() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((int) (onTransact ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i9 = $11 + 115;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    private static final String asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = asBinder + 121;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!(!StringsKt.startsWith$default(str, "file://", false, 2, (Object) null))) {
                str = str.substring(7);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.startsWith$default(str, "file://", false, 2, (Object) null)) {
            }
        }
        int i3 = asBinder + 3;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        setBackgroundAlpha setbackgroundalpha = (setBackgroundAlpha) objArr[0];
        String str = (String) objArr[1];
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            Intrinsics.checkNotNull(str2);
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
            onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setbackgroundalpha, str, uIKitBaseActivity, str2}, -1275650430, iOnExtraCallbackWithResult3, 1275650431, iOnExtraCallbackWithResult);
            int i4 = asBinder + 9;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (UnsupportedEncodingException e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str3 = onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            convertFloatArrayToByteArray.IAuthTabCallback(str3, e);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(UIKitBaseActivity uIKitBaseActivity, Throwable th) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = asBinder + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str = onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(str, "");
            convertFloatArrayToByteArray.IAuthTabCallback(str, th);
            i = R.string.media_save_fail;
            i2 = 0;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str2 = onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            convertFloatArrayToByteArray2.IAuthTabCallback(str2, th);
            i = R.string.media_save_fail;
            i2 = 1;
        }
        Toast.makeText((Context) uIKitBaseActivity, i, i2).show();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:3:0x000d, B:6:0x001f, B:10:0x003f, B:11:0x0046, B:12:0x004e, B:13:0x004f, B:15:0x0058, B:19:0x0078, B:20:0x0086, B:21:0x0091), top: B:28:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, setBackgroundAlpha setbackgroundalpha, String str2, String str3, String str4, UIKitBaseActivity uIKitBaseActivity) throws Throwable {
        int i;
        Object obj;
        int i2 = 2 % 2;
        try {
            obj = null;
        } catch (Throwable th) {
            setbackgroundalpha.IAuthTabCallback(str, str2, str3, th);
            i = IAuthTabCallbackDefault + 15;
            asBinder = i % 128;
        }
        if (new Regex("data:[^/]+/[^;]+;base64").onExtraCallback(str)) {
            List<String> list = setbackgroundalpha.onNavigationEvent;
            String lowerCase = StringsKt.substringAfter$default(str2, '/', (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (list.contains(lowerCase)) {
                int i3 = asBinder + 33;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    setbackgroundalpha.onExtraCallback.convertBase64ToFile(str, str2, str3);
                    obj.hashCode();
                    throw null;
                }
                setbackgroundalpha.onExtraCallback.convertBase64ToFile(str, str2, str3);
            } else {
                if (StringsKt.startsWith$default(str, "blob", false, 2, (Object) null)) {
                    List<String> list2 = setbackgroundalpha.onNavigationEvent;
                    String lowerCase2 = StringsKt.substringAfter$default(str2, '/', (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (list2.contains(lowerCase2)) {
                        int i4 = asBinder + 121;
                        IAuthTabCallbackDefault = i4 % 128;
                        if (i4 % 2 == 0) {
                            setbackgroundalpha.onWarmupCompleted.loadUrl(setbackgroundalpha.onExtraCallbackWithResult(str, str2, str3));
                            int i5 = 48 / 0;
                        } else {
                            setbackgroundalpha.onWarmupCompleted.loadUrl(setbackgroundalpha.onExtraCallbackWithResult(str, str2, str3));
                        }
                    }
                }
                String strIAuthTabCallback = getSafeHandlerThread.IAuthTabCallback(mergeParams.onExtraCallback(str4, null, 1, null), (String) null, str, str2);
                Uri uri = Uri.parse(str);
                String cookie = CookieManager.getInstance().getCookie(uri.getScheme() + "://" + uri.getHost());
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setDescription("Downloading file...");
                request.setMimeType(str2);
                Object[] objArr = new Object[1];
                a((char) (11662 - Color.blue(0)), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{19064, 41828, 60603, 14477, 27757, 16704}, new char[]{0, 0, 0, 0}, new char[]{59741, 49181, 36462, 31789}, objArr);
                request.addRequestHeader(((String) objArr[0]).intern(), cookie);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strIAuthTabCallback);
                request.setNotificationVisibility(1);
                getByteBuffer getbytebufferOnExtraCallbackWithResult = new RxDownloader(uIKitBaseActivity).onExtraCallback(request).asInterface(new TossDownloadListener$.ExternalSyntheticLambda9(new TossDownloadListener$.ExternalSyntheticLambda8())).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
                Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
                setMessageBytes.onExtraCallbackWithResult(getbytebufferOnExtraCallbackWithResult, new TossDownloadListener$.ExternalSyntheticLambda10(uIKitBaseActivity), (Function0) null, new TossDownloadListener$.ExternalSyntheticLambda11(setbackgroundalpha, str2, uIKitBaseActivity), 2, (Object) null);
                i = asBinder + 11;
                IAuthTabCallbackDefault = i % 128;
                int i6 = i % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private final String onExtraCallbackWithResult(String str, String str2, String str3) {
        int i = 2 % 2;
        String str4 = "javascript: var xhr = new XMLHttpRequest();xhr.open('GET', '" + str + "', true);xhr.setRequestHeader('Content-type','" + str2 + "');xhr.responseType = 'blob';xhr.onload = function(e) {    if (this.status == 200) {        var blobPdf = this.response;        var reader = new FileReader();        reader.readAsDataURL(blobPdf);        reader.onloadend = function() {            base64data = reader.result;            Base64Downloader.convertBase64ToFile(base64data, '" + str2 + "', '" + str3 + "');        }    } else {        Base64Downloader.notifyFailure('" + str + "', '" + str2 + "', '" + str3 + "')    }};xhr.send();";
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str4;
    }

    private final void IAuthTabCallback(String str, String str2, String str3, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            try {
                Toast.makeText(this.onWarmupCompleted.getContext(), R.string.media_save_fail, 1).show();
                kotlin.Result.constructor-impl(Unit.INSTANCE);
                int i4 = IAuthTabCallbackDefault + 29;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 3;
                }
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String message = th.getMessage();
                Object[] objArr = new Object[1];
                a((char) (55327 - Gravity.getAbsoluteGravity(0, 0)), 826920604 - TextUtils.lastIndexOf("", '0'), new char[]{61618, 59578, 41400}, new char[]{0, 0, 0, 0}, new char[]{40384, 18894, 7985, 13016}, objArr);
                convertFloatArrayToByteArray.onExtraCallbackWithResult("unsupportedDownload", message, th, access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("mimeType", str2), getWrite.IAuthTabCallback("userAgent", str3), getWrite.IAuthTabCallback("throwable", th)}));
            }
        } catch (Throwable th3) {
            th = th3;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String message2 = th.getMessage();
        Object[] objArr2 = new Object[1];
        a((char) (55327 - Gravity.getAbsoluteGravity(0, 0)), 826920604 - TextUtils.lastIndexOf("", '0'), new char[]{61618, 59578, 41400}, new char[]{0, 0, 0, 0}, new char[]{40384, 18894, 7985, 13016}, objArr2);
        convertFloatArrayToByteArray2.onExtraCallbackWithResult("unsupportedDownload", message2, th, access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback("mimeType", str2), getWrite.IAuthTabCallback("userAgent", str3), getWrite.IAuthTabCallback("throwable", th)}));
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        setBackgroundAlpha setbackgroundalpha = (setBackgroundAlpha) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Uri uriForFile = FileProvider.getUriForFile((Context) objArr[2], setbackgroundalpha.IAuthTabCallback, new File(URLDecoder.decode((String) objArr[3], "UTF-8")));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.setDataAndType(uriForFile, str);
        Context context = setbackgroundalpha.onWarmupCompleted.getContext();
        if (context != null) {
            int i2 = IAuthTabCallbackDefault + 53;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            try {
                context.startActivity(intent);
                int i4 = asBinder + 125;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return null;
            } catch (ActivityNotFoundException e) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String str2 = onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                convertFloatArrayToByteArray.IAuthTabCallback(str2, e);
            }
        }
        return null;
    }

    private final void onExtraCallbackWithResult(byte[] bArr, String str) {
        int i = 2 % 2;
        Context context = this.onWarmupCompleted.getContext();
        Cookies_clearAll.onWarmupCompleted onwarmupcompleted = Cookies_clearAll.Companion;
        Intrinsics.checkNotNull(context);
        onwarmupcompleted.IAuthTabCallback(context).onWarmupCompleted(str).onNavigationEvent(Bitmap.CompressFormat.JPEG).onWarmupCompleted(95).IAuthTabCallback(bArr).onExtraCallbackWithResult().onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new TossDownloadListener$.ExternalSyntheticLambda5(new TossDownloadListener$.ExternalSyntheticLambda4(context, this)), new TossDownloadListener$.ExternalSyntheticLambda7(new TossDownloadListener$.ExternalSyntheticLambda6()));
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity, Intent intent, TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsToastV1, "");
        uIKitBaseActivity.startActivity(intent);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(Context context, setBackgroundAlpha setbackgroundalpha, String str) {
        Uri uri;
        UIKitBaseActivity uIKitBaseActivity;
        int i = 2 % 2;
        Object obj = null;
        if (str == null || StringsKt.isBlank(str)) {
            uri = Uri.EMPTY;
            int i2 = asBinder + 7;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallbackDefault + 11;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                Uri.parse(str);
                throw null;
            }
            uri = Uri.parse(str);
        }
        if (Intrinsics.areEqual(uri, Uri.EMPTY)) {
            Toast.makeText(context, R.string.media_save_fail, 1).show();
        } else {
            Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(uri, "image/*");
            Intrinsics.checkNotNullExpressionValue(dataAndType, "");
            context.grantUriPermission(context.getPackageName(), uri, 1);
            Context context2 = setbackgroundalpha.onWarmupCompleted.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            UIKitBaseActivity uIKitBaseActivityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context2);
            if (uIKitBaseActivityIAuthTabCallback instanceof UIKitBaseActivity) {
                int i5 = asBinder + 63;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    uIKitBaseActivity = uIKitBaseActivityIAuthTabCallback;
                    int i6 = 73 / 0;
                } else {
                    uIKitBaseActivity = uIKitBaseActivityIAuthTabCallback;
                }
            } else {
                int i7 = asBinder + 105;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 5;
                }
                uIKitBaseActivity = null;
            }
            if (uIKitBaseActivity == null) {
                int i9 = IAuthTabCallbackDefault + 5;
                asBinder = i9 % 128;
                if (i9 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNull(context);
            Object[] objArr = {new TdsToastV1.onNavigationEvent(uIKitBaseActivity, WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallbackWithResult(context, R.string.media_save_success, context.getString(R.string.uikit_gallery))), Integer.valueOf(R.string.uikit_open), new TossDownloadListener$.ExternalSyntheticLambda0(uIKitBaseActivity, dataAndType)};
            int iOnWarmupCompleted = a.AnonymousClass3.onWarmupCompleted();
            ((TdsToastV1.onNavigationEvent) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.AnonymousClass3.onWarmupCompleted(), -936884656, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), objArr, 936884670, iOnWarmupCompleted)).onNavigationEvent();
            int i10 = IAuthTabCallbackDefault + 93;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 37;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback("파일을 다운로드 받기 위해 저장소 권한이 필요합니다.");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unit;
    }

    private final void IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 47) {
            function0.invoke();
            int i3 = asBinder + 93;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
                return;
            }
            return;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = RxPermissionsKt.onExtraCallbackWithResult(new RxPermissions((FragmentActivity) uIKitBaseActivity), uIKitBaseActivity, "android.permission.WRITE_EXTERNAL_STORAGE").onExtraCallbackWithResult(new TossDownloadListener$.ExternalSyntheticLambda3(new TossDownloadListener$.ExternalSyntheticLambda2(function0, uIKitBaseActivity)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) uIKitBaseActivity);
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, UIKitBaseActivity uIKitBaseActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue()) {
            function0.invoke();
        } else {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(uIKitBaseActivity, new TossDownloadListener$.ExternalSyntheticLambda12());
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    private final boolean IAuthTabCallback() {
        int i = 2 % 2;
        Context context = this.onWarmupCompleted.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback == null) {
            int i2 = IAuthTabCallbackDefault + 91;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean z = !activityIAuthTabCallback.isFinishing();
        int i4 = asBinder + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        access100 = 0;
        onExtraCallbackWithResult();
        Companion = new IAuthTabCallback(null);
        onExtraCallbackWithResult = setBackgroundAlpha.class.getSimpleName();
        int i = IAuthTabCallback_Parcel + 33;
        access100 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 478205847, iOnExtraCallbackWithResult3, -478205845, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String IAuthTabCallback(String str) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{str}, 175342179, iOnExtraCallbackWithResult3, -175342176, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, setBackgroundAlpha setbackgroundalpha, String str2, String str3, String str4, UIKitBaseActivity uIKitBaseActivity) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{str, setbackgroundalpha, str2, str3, str4, uIKitBaseActivity}, -137019418, iOnExtraCallbackWithResult3, 137019422, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{th}, -257084049, iOnExtraCallbackWithResult3, 257084049, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onWarmupCompleted(setBackgroundAlpha setbackgroundalpha, byte[] bArr, String str) throws Throwable {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setbackgroundalpha, bArr, str}, -817941082, iOnExtraCallbackWithResult3, 817941087, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallback(String str, Context context, String str2) throws Throwable {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, str, context, str2}, -1275650430, iOnExtraCallbackWithResult3, 1275650431, iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(setBackgroundAlpha setbackgroundalpha, String str, UIKitBaseActivity uIKitBaseActivity, String str2) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setbackgroundalpha, str, uIKitBaseActivity, str2}, 1905215869, iOnExtraCallbackWithResult3, -1905215863, iOnExtraCallbackWithResult);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = 7798559133331975163L;
        onTransact = -1776194565;
        asInterface = (char) 20685;
    }
}
