package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ALCFocusCircle extends setFaceBox {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private final IconRoundCornerProgressBar1 onWarmupCompleted;
    private static final byte[] $$a = {102, 12, 98, 84};
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = (i * 3) + 97;
        int i5 = 3 - (i2 * 3);
        byte[] bArr = $$a;
        int i6 = b * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            i4 = i7;
            int i8 = i5;
            int i9 = 0;
            i4 += i5;
            i5 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            int i10 = i5 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i11 = i3 + 1;
            i8 = i10;
            i5 = bArr[i10];
            i9 = i11;
            i4 += i5;
            i5 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            int i102 = i5 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i1022 = i5 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        onNavigationEvent();
        Companion = new IAuthTabCallback(null);
        int i = onNavigationEvent + 39;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ALCFocusCircle() {
        IconRoundCornerProgressBar1 iconRoundCornerProgressBar1 = null;
        this(iconRoundCornerProgressBar1, 1, iconRoundCornerProgressBar1);
    }

    public ALCFocusCircle(@NotNull IconRoundCornerProgressBar1 iconRoundCornerProgressBar1) {
        Intrinsics.checkNotNullParameter(iconRoundCornerProgressBar1, "");
        this.onWarmupCompleted = iconRoundCornerProgressBar1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ALCFocusCircle(IconRoundCornerProgressBar1 iconRoundCornerProgressBar1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onTransact + 51;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                iconRoundCornerProgressBar1 = drawTopText.Companion.IAuthTabCallback();
                int i3 = IAuthTabCallbackStub + 59;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                drawTopText.Companion.IAuthTabCallback();
                throw null;
            }
        }
        this(iconRoundCornerProgressBar1);
    }

    public final IconRoundCornerProgressBar1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        IconRoundCornerProgressBar1 iconRoundCornerProgressBar1 = this.onWarmupCompleted;
        int i5 = i3 + 121;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return iconRoundCornerProgressBar1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        return onNavigationEvent(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r6.loadUrl(r7);
        r6 = o.ALCFocusCircle.onTransact + 57;
        o.ALCFocusCircle.IAuthTabCallbackStub = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, "about:blank") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r7, "about:blank")) != false) goto L9;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest) {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            string = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = 72 / 0;
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            string = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
    }

    public boolean onNavigationEvent(@NotNull WebView webView, @Nullable String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        if (str == null || URLUtil.isNetworkUrl(str)) {
            return false;
        }
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNull(uri);
        if (IAuthTabCallback(webView, uri) || onNavigationEvent(webView, uri) || onTransact(webView, uri) || IAuthTabCallbackStub(webView, uri)) {
            return true;
        }
        int i4 = onTransact + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if (onExtraCallback(webView, uri)) {
            return true;
        }
        int i6 = onTransact + 87;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        if (onWarmupCompleted(webView, uri)) {
            return true;
        }
        int i8 = IAuthTabCallbackStub + 93;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            onExtraCallbackWithResult(webView, uri);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onExtraCallbackWithResult(webView, uri) || IAuthTabCallbackDefault(webView, uri) || asBinder(webView, uri)) {
            return true;
        }
        int i9 = IAuthTabCallbackStub + 117;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    private final void IAuthTabCallback(Context context, Uri uri, String str) throws Throwable {
        int i = 2 % 2;
        try {
            Intent intentAddFlags = new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
            context.startActivity(intentAddFlags);
            Object[] objArr = new Object[1];
            a(Color.green(0) + 34, TextUtils.getOffsetAfter("", 0) + 3, (char) (ImageFormat.getBitsPerPixel(0) + 59279), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), uri.toString());
            Object[] objArr2 = new Object[1];
            a(36 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "viewUri success: " + uri, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str)}), (String) null, false, (String) null, 56, (Object) null);
            int i2 = onTransact + 81;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ActivityNotFoundException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "viewUri failed: " + uri, e, (Map) null, 8, (Object) null);
        }
    }

    public boolean IAuthTabCallback(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(uri, "");
            TextUtils.equals(uri.getScheme(), "market");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (!TextUtils.equals(uri.getScheme(), "market")) {
            return false;
        }
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        IAuthTabCallback(context, uri, "handleMarketScheme");
        int i3 = onTransact + 73;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public boolean onNavigationEvent(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (!StringsKt.startsWith$default(string, "intent:kakaolink://", false, 2, (Object) null)) {
            return false;
        }
        int i4 = IAuthTabCallbackStub + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Uri uri2 = Uri.parse(StringsKt.replace$default(string, "intent:", "", false, 4, (Object) null));
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Intrinsics.checkNotNull(uri2);
        IAuthTabCallback(context, uri2, "handleKakaolinkScheme");
        return true;
    }

    public boolean IAuthTabCallbackDefault(@NotNull WebView webView, @NotNull Uri uri) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Activity activityOnNavigationEvent = LinkGenerator1.onNavigationEvent(webView);
        if (activityOnNavigationEvent == null) {
            int i2 = IAuthTabCallbackStub + 43;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (!this.onWarmupCompleted.onExtraCallback(string)) {
            return false;
        }
        int i4 = onTransact + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return this.onWarmupCompleted.onExtraCallbackWithResult(activityOnNavigationEvent, string, onWarmupCompleted(webView));
        }
        boolean zOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(activityOnNavigationEvent, string, onWarmupCompleted(webView));
        int i5 = 16 / 0;
        return zOnExtraCallbackWithResult;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getTouchSlop() >> 8)), 16 - Process.getGidForName(""), 10973 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 46134), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 20220 - View.MeasureSpec.getSize(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
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
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $10 + 113;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.green(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 45, 1494 - Color.blue(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i7 = $10 + 73;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Bundle onWarmupCompleted(WebView webView) throws Throwable {
        String url;
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - ExpandableListView.getPackedPositionGroup(0L), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(12 - Color.blue(0), (Process.myTid() >> 22) + 7, (char) View.MeasureSpec.getMode(0), objArr2);
        bundle.putString(strIntern, ((String) objArr2[0]).intern());
        flipCamera flipcamera = webView instanceof flipCamera ? (flipCamera) webView : null;
        if (flipcamera == null || (url = flipcamera.onExtraCallbackWithResult()) == null) {
            url = webView.getUrl();
            int i2 = IAuthTabCallbackStub + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        if (url != null) {
            Object[] objArr3 = new Object[1];
            a(TextUtils.getTrimmedLength("") + 19, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 57594), objArr3);
            bundle.putString(((String) objArr3[0]).intern(), url);
        }
        int i4 = onTransact + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return bundle;
    }

    public boolean onTransact(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (TextUtils.equals(uri.getScheme(), "tel")) {
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            IAuthTabCallback(context, uri, "handleTelScheme");
            return true;
        }
        int i4 = IAuthTabCallbackStub + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected boolean IAuthTabCallback(@NotNull WebView webView, @NotNull String str) throws Throwable {
        Object obj;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intent intent = new Intent("android.intent.action.SENDTO");
        List listSplit$default = StringsKt.split$default(str, new String[]{";", "?"}, false, 0, 6, (Object) null);
        String str5 = !listSplit$default.isEmpty() ? (String) listSplit$default.get(0) : null;
        String str6 = listSplit$default.size() > 1 ? (String) listSplit$default.get(1) : null;
        if (str5 != null) {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl((String) StringsKt.split$default(str5, new String[]{"sms://", "sms:"}, false, 0, 6, (Object) null).get(1));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (!(!kotlin.Result.onExtraCallback(obj))) {
                int i2 = onTransact + 69;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                obj = null;
            }
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str6 != null) {
            int i4 = onTransact + 27;
            IAuthTabCallbackStub = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Result.Companion companion3 = kotlin.Result.Companion;
                    String[] strArr = new String[0];
                    strArr[1] = "body=";
                    str4 = (String) StringsKt.split$default(str6, strArr, false, 1, 63, (Object) null).get(0);
                } else {
                    Result.Companion companion4 = kotlin.Result.Companion;
                    str4 = (String) StringsKt.split$default(str6, new String[]{"body="}, false, 0, 6, (Object) null).get(1);
                }
                str3 = kotlin.Result.constructor-impl(str4);
            } catch (Throwable th2) {
                Result.Companion companion5 = kotlin.Result.Companion;
                str3 = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
            }
            str = kotlin.Result.onExtraCallback(str3) ? null : str3;
        }
        if (TextUtils.isEmpty(str2)) {
            intent.setData(Uri.parse("smsto:"));
            int i5 = IAuthTabCallbackStub + 125;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } else {
            intent.setData(Uri.parse("smsto:" + str2));
        }
        if (str != null) {
            int i7 = IAuthTabCallbackStub + 3;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (str.length() > 0) {
                try {
                    String strDecode = URLDecoder.decode(str, "UTF-8");
                    Intrinsics.checkNotNull(strDecode);
                    if (strDecode.length() > 0) {
                        intent.putExtra("sms_body", strDecode);
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        try {
            webView.getContext().startActivity(intent);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleSMSLink: " + intent.getData(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return true;
        } catch (Throwable th3) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleSMSLink: " + th3, (Throwable) null, (Map) null, 12, (Object) null);
            return false;
        }
    }

    public boolean IAuthTabCallbackStub(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (!TextUtils.equals(uri.getScheme(), "sms")) {
            return false;
        }
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        boolean zIAuthTabCallback = IAuthTabCallback(webView, string);
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onExtraCallback(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (!TextUtils.equals(uri.getScheme(), "mailto")) {
            int i2 = onTransact + 5;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallbackStub + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (i5 == 0) {
            IAuthTabCallback(context, uri, "handleMailScheme");
            return false;
        }
        IAuthTabCallback(context, uri, "handleMailScheme");
        return true;
    }

    public boolean onWarmupCompleted(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            if (Intrinsics.areEqual(uri.getScheme(), "intent")) {
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intent uri2 = Intent.parseUri(string, 1);
                uri2.addCategory("android.intent.category.BROWSABLE");
                uri2.setComponent(null);
                uri2.setSelector(null);
                try {
                    webView.getContext().startActivity(uri2);
                    Object[] objArr = new Object[1];
                    a(34 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - (Process.myPid() >> 22), (char) (59278 - ExpandableListView.getPackedPositionGroup(0L)), objArr);
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleIntentScheme success: " + uri, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), uri.toString())), (String) null, false, (String) null, 56, (Object) null);
                    int i4 = onTransact + 125;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                } catch (ActivityNotFoundException unused) {
                    String str = uri2.getPackage();
                    if (str != null) {
                        Context context = webView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        Uri uri3 = Uri.parse("market://details?id=" + str);
                        Intrinsics.checkNotNullExpressionValue(uri3, "");
                        try {
                            IAuthTabCallback(context, uri3, "fallback");
                            return true;
                        } catch (Exception e) {
                            e = e;
                            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleIntentScheme failed", e, (Map) null, 8, (Object) null);
                            return false;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return false;
    }

    public boolean onExtraCallbackWithResult(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            if (Intrinsics.areEqual(uri.getScheme(), "android-app")) {
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intent uri2 = Intent.parseUri(string, 2);
                uri2.addCategory("android.intent.category.BROWSABLE");
                uri2.setComponent(null);
                uri2.setSelector(null);
                try {
                    webView.getContext().startActivity(uri2);
                    Object[] objArr = new Object[1];
                    a(34 - (Process.myTid() >> 22), 3 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 59277), objArr);
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleAndroidAppScheme success: " + uri, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), uri.toString())), (String) null, false, (String) null, 56, (Object) null);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    String str = uri2.getPackage();
                    if (str != null) {
                        Context context = webView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        Uri uri3 = Uri.parse("market://details?id=" + str);
                        Intrinsics.checkNotNullExpressionValue(uri3, "");
                        try {
                            IAuthTabCallback(context, uri3, "fallback");
                            return true;
                        } catch (Exception e) {
                            e = e;
                            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleIntentScheme failed", e, (Map) null, 8, (Object) null);
                            int i4 = IAuthTabCallbackStub + 59;
                            onTransact = i4 % 128;
                            int i5 = i4 % 2;
                            return false;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeRouterWebViewClient", "handleIntentScheme failed", e, (Map) null, 8, (Object) null);
            int i42 = IAuthTabCallbackStub + 59;
            onTransact = i42 % 128;
            int i52 = i42 % 2;
            return false;
        }
        int i422 = IAuthTabCallbackStub + 59;
        onTransact = i422 % 128;
        int i522 = i422 % 2;
        return false;
    }

    public boolean asBinder(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            IAuthTabCallback(context, uri, "handleOtherScheme");
            return false;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Context context2 = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        IAuthTabCallback(context2, uri, "handleOtherScheme");
        return true;
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{60811, 4189, 5709, 5200, 6732, 6230, 7801, 7291, 613, '`', 1651, 1139, 60835, 4170, 5696, 5203, 6737, 6230, 7745, 3441, 61619, 63146, 62640, 64175, 63646, 65193, 64657, 58016, 57492, 59013, 58512, 60095, 59619, 61176, 2607, 63443, 61893, 60838, 4170, 5699, 5206, 6743, 6237};
        onExtraCallbackWithResult = -967248885381066705L;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
