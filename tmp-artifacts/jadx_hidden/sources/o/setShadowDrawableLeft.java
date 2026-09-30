package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.reactnativecommunity.webview.RNCWebViewClient;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.bindContext;
import o.getBooleanFromAdObject;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class setShadowDrawableLeft extends RNCWebViewClient {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static final String IAuthTabCallbackDefault;
    private static byte[] IAuthTabCallbackStubProxy = null;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static int access000 = 0;
    private static int access100 = 0;
    private static final OkHttpClient asBinder;
    private static short[] extraCallback = null;
    private static int extraCallbackWithResult = 0;
    private static int getInterfaceDescriptor = 0;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onTransact;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private boolean IAuthTabCallbackStub = true;
    private CookieManager asInterface;

    public static /* synthetic */ String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return strOnExtraCallback;
    }

    public setShadowDrawableLeft() {
        CookieManager cookieManager = CookieManager.getInstance();
        Intrinsics.checkNotNullExpressionValue(cookieManager, "");
        this.asInterface = cookieManager;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 73;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 33;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
    }

    public final void onNavigationEvent(@NotNull CookieManager cookieManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cookieManager, "");
            this.asInterface = cookieManager;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(cookieManager, "");
        this.asInterface = cookieManager;
        int i3 = writeTypedObject + 43;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest) {
        Object objShouldInterceptRequest;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(webResourceRequest, "");
        if (!(!this.IAuthTabCallbackStub) || !onExtraCallback(webResourceRequest)) {
            return super/*android.webkit.WebViewClient*/.shouldInterceptRequest(webView, webResourceRequest);
        }
        int i4 = extraCallbackWithResult + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        try {
            Result.Companion companion = Result.Companion;
            objShouldInterceptRequest = Result.constructor-impl(onNavigationEvent(webResourceRequest));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objShouldInterceptRequest = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(objShouldInterceptRequest) != null) {
            Uri url = webResourceRequest.getUrl();
            Object[] objArr = new Object[1];
            b(32 - Color.red(0), 41 - Color.blue(0), new char[]{65477, 17, 20, 6, '\t', 65477, 28, 14, 25, '\r', 20, 26, 25, 65477, 65533, 65490, 65527, '\n', 22, 26, '\n', 24, 25, '\n', '\t', 65490, 65532, 14, 25, '\r', 65503, 65477, 65515, 6, 14, 17, '\n', '\t', 65477, 25, 20}, 239 - View.resolveSize(0, 0), false, objArr);
            ((String) objArr[0]).intern();
            Objects.toString(url);
            View.MeasureSpec.getMode(0);
            ViewConfiguration.getScrollBarFadeDuration();
            ViewConfiguration.getDoubleTapTimeout();
            SystemClock.elapsedRealtime();
            TextUtils.indexOf((CharSequence) "", '0', 0);
            objShouldInterceptRequest = super/*android.webkit.WebViewClient*/.shouldInterceptRequest(webView, webResourceRequest);
            int i6 = writeTypedObject + 11;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return (WebResourceResponse) objShouldInterceptRequest;
    }

    private final WebResourceResponse onNavigationEvent(WebResourceRequest webResourceRequest) {
        String strIntern;
        int i = 2 % 2;
        OkHttpClient okHttpClient = asBinder;
        Request.Builder builder = new Request.Builder();
        String string = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Request.Builder builderUrl = builder.url(string);
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        Intrinsics.checkNotNullExpressionValue(requestHeaders, "");
        Response responseExecute = okHttpClient.newCall(builderUrl.headers(onWarmupCompleted(requestHeaders, this.asInterface.getCookie(webResourceRequest.getUrl().toString()))).get().build()).execute();
        Object[] objArr = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 10, 10 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{11, '\r', 17, 17, 65509, 65487, 22, 7, 65525, 7}, 242 - ((Process.getThreadPriority(0) + 20) >> 6), true, objArr);
        Iterator it = responseExecute.headers(((String) objArr[0]).intern()).iterator();
        int i2 = extraCallbackWithResult + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                this.asInterface.flush();
                Object[] objArr2 = new Object[1];
                c(TextUtils.lastIndexOf("", '0') - 54335488, (byte) (50 - ExpandableListView.getPackedPositionChild(0L)), KeyEvent.getDeadChar(0, 0) - 987293060, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-64) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                Pair<String, String> pairOnWarmupCompleted = onWarmupCompleted(Response.header$default(responseExecute, ((String) objArr2[0]).intern(), (String) null, 2, (Object) null));
                String str = (String) pairOnWarmupCompleted.onExtraCallbackWithResult();
                String str2 = (String) pairOnWarmupCompleted.IAuthTabCallback();
                int iCode = responseExecute.code();
                String strMessage = responseExecute.message();
                if (!StringsKt.isBlank(strMessage)) {
                    strIntern = strMessage;
                } else {
                    int i4 = extraCallbackWithResult + 101;
                    writeTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr3 = new Object[1];
                    c((-54335477) - View.combineMeasuredStates(0, 0), (byte) (MotionEvent.axisFromString("") - 109), (-987293048) - View.resolveSize(0, 0), (short) (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) - 64, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                }
                return new WebResourceResponse(str, str2, iCode, strIntern, IAuthTabCallback(responseExecute.headers()), responseExecute.body().byteStream());
            }
            int i6 = extraCallbackWithResult + 109;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                this.asInterface.setCookie(webResourceRequest.getUrl().toString(), (String) it.next());
                obj.hashCode();
                throw null;
            }
            this.asInterface.setCookie(webResourceRequest.getUrl().toString(), (String) it.next());
        }
    }

    private final boolean onExtraCallback(WebResourceRequest webResourceRequest) {
        String lowerCase;
        int i = 2 % 2;
        String method = webResourceRequest.getMethod();
        Object[] objArr = new Object[1];
        b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1, (ViewConfiguration.getPressedStateDuration() >> 16) + 3, new char[]{65531, '\n', 65533}, 222 - TextUtils.indexOf("", "", 0), false, objArr);
        if (!StringsKt.equals(method, ((String) objArr[0]).intern(), true)) {
            return false;
        }
        String scheme = webResourceRequest.getUrl().getScheme();
        if (scheme != null) {
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase = scheme.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            int i2 = writeTypedObject + 77;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            lowerCase = null;
        }
        Object[] objArr2 = new Object[1];
        c(ExpandableListView.getPackedPositionGroup(0L) - 54335493, (byte) ((-42) - ImageFormat.getBitsPerPixel(0)), (-987293024) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (ViewConfiguration.getEdgeSlop() >> 16), (-64) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        if (!Intrinsics.areEqual(lowerCase, ((String) objArr2[0]).intern())) {
            b(2 - View.MeasureSpec.getSize(0), MotionEvent.axisFromString("") + 6, new char[]{0, 3, 65528, 4, 4}, Color.blue(0) + 260, false, new Object[1]);
            if (!Intrinsics.areEqual(lowerCase, ((String) r2[0]).intern())) {
                int i4 = extraCallbackWithResult + 99;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }

    private final Headers onWarmupCompleted(Map<String, String> map, String str) {
        int i = 2 % 2;
        Headers.Builder builder = new Headers.Builder();
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object[] objArr = new Object[1];
            b(11 - TextUtils.getCapsMode("", 0, 0), 16 - View.MeasureSpec.getSize(0), new char[]{4, 5, 20, 19, 5, 21, 17, 5, 65522, 65485, 65528, '\b', 20, '\t', 65527, 65485}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 244, true, objArr);
            if (!StringsKt.equals(key, ((String) objArr[0]).intern(), true)) {
                Object[] objArr2 = new Object[1];
                b(13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{3, 5, 16, 20, 65485, 65509, 14, 3, 15, 4, '\t', 14, 7, 65505, 3}, 243 - TextUtils.lastIndexOf("", '0', 0), false, objArr2);
                if (!StringsKt.equals(key, ((String) objArr2[0]).intern(), true)) {
                    int i2 = extraCallbackWithResult + 39;
                    writeTypedObject = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr3 = new Object[1];
                    c((-54335500) - MotionEvent.axisFromString(""), (byte) (66 - (Process.myTid() >> 22)), (-987293060) - Color.green(0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-64) - TextUtils.indexOf("", "", 0), objArr3);
                    if (StringsKt.equals(key, ((String) objArr3[0]).intern(), true)) {
                        builder.add(key, value);
                        z = true;
                    } else {
                        builder.add(key, value);
                    }
                }
            }
        }
        if (!z && str != null) {
            int i4 = writeTypedObject + 35;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (str.length() != 0) {
                int i6 = writeTypedObject + 87;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr4 = new Object[1];
                c((-54335500) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (KeyEvent.getDeadChar(0, 0) + 66), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 987293060, (short) ExpandableListView.getPackedPositionGroup(0L), Color.red(0) - 64, objArr4);
                builder.add(((String) objArr4[0]).intern(), str);
            }
        }
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<java.lang.String, java.lang.String> onWarmupCompleted(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShadowDrawableLeft.onWarmupCompleted(java.lang.String):kotlin.Pair");
    }

    private static final String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        c((-54335473) - Color.alpha(0), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 987293029, (short) Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) - 64, objArr);
        String strTrim = StringsKt.trim(StringsKt.trim(StringsKt.substringAfter(str, ((String) objArr[0]).intern(), "")).toString(), new char[]{'\"'});
        Object obj = null;
        if (strTrim.length() <= 0) {
            return null;
        }
        int i4 = extraCallbackWithResult + 71;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i5 + 117;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return strTrim;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        b(View.combineMeasuredStates(0, 0) + 11, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, new char[]{4, 5, 20, 19, 5, 21, 17, 5, 65522, 65485, 65528, '\b', 20, '\t', 65527, 65485}, 245 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, objArr);
        IAuthTabCallbackDefault = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c((-54335520) - TextUtils.getTrimmedLength(""), (byte) (120 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-987293063) - ImageFormat.getBitsPerPixel(0), (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Drawable.resolveOpacity(0, 0) - 64, objArr2);
        onTransact = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        c(TextUtils.lastIndexOf("", '0') - 54335498, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 66), ((Process.getThreadPriority(0) + 20) >> 6) - 987293060, (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) - 63, objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0') + 14, 15 - View.MeasureSpec.getMode(0), new char[]{3, 5, 16, 20, 65485, 65509, 14, 3, 15, 4, '\t', 14, 7, 65505, 3}, 244 - TextUtils.indexOf("", "", 0, 0), false, objArr4);
        onExtraCallbackWithResult = ((String) objArr4[0]).intern();
        Companion = new onNavigationEvent(null);
        asBinder = new OkHttpClient.Builder().build();
        int i = ICustomTabsCallback + 71;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr2[i7] = bindContext.access000.g(cArr2[i7], access100);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i > 0) {
            int i8 = $10 + 15;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i10 = $10 + 13;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final Map<String, String> IAuthTabCallback(Headers headers) {
        int i = 2 % 2;
        Set setNames = headers.names();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(setNames, 10)), 16));
        for (Object obj : setNames) {
            int i2 = writeTypedObject + 101;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            List listValues = headers.values((String) obj);
            Object[] objArr = new Object[1];
            c((-54335465) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (82 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-987293083) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-64) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            linkedHashMap.put(obj, CollectionsKt.joinToString$default(listValues, ((String) objArr[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            int i4 = extraCallbackWithResult + 125;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        return linkedHashMap;
    }

    private static void c(int i, byte b, int i2, short s, int i3, Object[] objArr) {
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, IAuthTabCallback_Parcel);
        if (iO == -1) {
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr2 = IAuthTabCallbackStubProxy;
            if (bArr2 != null) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                }
                for (int i9 = 0; i9 < length; i9++) {
                    bArr[i9] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr2[i9]);
                }
                bArr2 = bArr;
            }
            iO = bArr2 != null ? (byte) (((byte) (IAuthTabCallbackStubProxy[getBooleanFromAdObject.onWarmupCompleted.o(i, getInterfaceDescriptor)] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L)))) : (short) (((short) (extraCallback[((int) (getInterfaceDescriptor ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            int i10 = $10 + 39;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))) + i4;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, access000, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = IAuthTabCallbackStubProxy;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = $11 + 43;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        bArr4[i12] = (byte) (bArr3[i12] * (-4629411779493505016L));
                        i12 <<= 1;
                    } else {
                        bArr4[i12] = (byte) (bArr3[i12] ^ (-4629411779493505016L));
                        i12++;
                    }
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                int i14 = $11 + 39;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                if (z) {
                    byte[] bArr5 = IAuthTabCallbackStubProxy;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = extraCallback;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }

    static void onWarmupCompleted() {
        access100 = 478309053;
        getInterfaceDescriptor = -1485127640;
        IAuthTabCallback_Parcel = -1538795465;
        access000 = -1633731121;
        IAuthTabCallbackStubProxy = new byte[]{-34, 99, -115, 98, -123, -116, Byte.MAX_VALUE, -125, -120, 114, 114, -122, -116, 83, -99, -118, -117, -116, Byte.MAX_VALUE, -121, 92, -49, -74, -76, -74, 74, 102, -51, 35, -33, -45, -59, -50, -52, 30, 28, -126, 61, 50, -54, 61, -60, 23, -53, 102, -54, -54, -63, -63, 7, -6, 9, 25, -15, 13, -53, -82};
    }
}
