package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.net.HttpCookie;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.alertWithArgs;
import o.transImportCert;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transImportCert extends Role implements transInit {
    public static final onExtraCallbackWithResult Companion;
    private static int asInterface;
    private static int onNavigationEvent;
    private final Lazy onExtraCallbackWithResult;
    private final String onWarmupCompleted;
    private static final byte[] $$a = {23, -38, -83, 70};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 105 - (b * 3);
        int i5 = (i * 3) + 1;
        int i6 = s + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i6;
            int i9 = (-i6) + i7;
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i11 = i6 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = (-i6) + i7;
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i112 = i6 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i1122 = i6 + 1;
            if (i3 == i5) {
            }
        }
    }

    static {
        asInterface = 0;
        onExtraCallbackWithResult();
        Companion = new onExtraCallbackWithResult(null);
        int i = onTransact + 119;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i4);
        int i8 = i2 | i7;
        int i9 = (~(i4 | (~i2))) | i5;
        int i10 = i5 + i2 + i + ((-1932811043) * i3) + (1521317780 * i6);
        int i11 = i10 * i10;
        int i12 = ((i5 * (-919556932)) - 154402816) + ((-919556932) * i2) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i) + ((-2098724864) * i3) + ((-1398800384) * i6) + ((-1444151296) * i11);
        int i13 = (i5 * 1794637580) + 2133191799 + (i2 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i * 1794637741) + (i3 * (-1844343719)) + (i6 * (-1188939004)) + (i11 * (-394526720));
        if (i12 + (i13 * i13 * 821297152) != 1) {
            return onNavigationEvent(objArr);
        }
        int i14 = 2 % 2;
        int i15 = IAuthTabCallback + 87;
        onExtraCallback = i15 % 128;
        int i16 = i15 % 2;
        CookieManager cookieManagerAsBinder = asBinder();
        int i17 = IAuthTabCallback + 39;
        onExtraCallback = i17 % 128;
        int i18 = i17 % 2;
        return cookieManagerAsBinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public transImportCert(@NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "");
        this.onWarmupCompleted = "Cookies";
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: run.granite.cookies.CookiesModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (CookieManager) transImportCert.IAuthTabCallback(new Object[0], alertWithArgs.onExtraCallbackWithResult(), -1516739752, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1516739753, alertWithArgs.onExtraCallbackWithResult());
            }
        });
    }

    public static final /* synthetic */ CookieManager IAuthTabCallback(transImportCert transimportcert) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CookieManager cookieManagerOnTransact = transimportcert.onTransact();
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return cookieManagerOnTransact;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final CookieManager onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallbackWithResult.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CookieManager cookieManager = (CookieManager) value;
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cookieManager;
    }

    private static final CookieManager asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        return cookieManager;
    }

    static final class onWarmupCompleted<T> implements ValueCallback {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.onWarmupCompleted;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
        }
    }

    @Override // o.transInit
    public Object onNavigationEvent(@NotNull String str, boolean z, @NotNull access13800<? super WritableMap> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String cookie = onTransact().getCookie(str);
        if (cookie != null) {
            return onExtraCallbackWithResult(cookie, str);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return writableNativeMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.transInit
    public Object onNavigationEvent(boolean z, @NotNull access13800<? super WritableMap> access13800Var) {
        int i = 2 % 2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return writableNativeMap;
    }

    static final class IAuthTabCallback<T> implements ValueCallback {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.onWarmupCompleted;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
        }
    }

    @Override // o.transInit
    public Object IAuthTabCallback(@NotNull String str, @NotNull String str2, boolean z, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = onExtraCallback(str, new transGetSignPriKey(str2, _UrlKt.FRAGMENT_ENCODE_SET, "/", (String) null, (String) null, "Thu, 01 Jan 1970 00:00:00 GMT", (Boolean) null, (Boolean) null), z, access13800Var);
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    static final class onExtraCallback<T> implements ValueCallback {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> IAuthTabCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
            this.IAuthTabCallback = mayberemoveattachstatelistener;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.IAuthTabCallback;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
        }
    }

    @Override // o.transInit
    public Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super WritableMap> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent(str, false, access13800Var);
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    @Override // o.transInit
    public Object onNavigationEvent(@NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact().flush();
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 35126), Drawable.resolveOpacity(0, 0) + 23, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 12844), (ViewConfiguration.getEdgeSlop() >> 16) + 55, 2167 - (ViewConfiguration.getPressedStateDuration() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i10 = $10 + 115;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $11 + 85;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                i4 = -1;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static final class onNavigationEvent<T> implements ValueCallback {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
            this.onNavigationEvent = mayberemoveattachstatelistener;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.onNavigationEvent;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallback(transGetSignPriKey transgetsignprikey) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(transgetsignprikey.onExtraCallbackWithResult() + "=" + transgetsignprikey.asInterface());
        String strOnNavigationEvent = transgetsignprikey.onNavigationEvent();
        if (strOnNavigationEvent != null) {
            sb.append("; path=" + strOnNavigationEvent);
        }
        String strIAuthTabCallback = transgetsignprikey.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            sb.append("; domain=" + StringsKt__StringsKt.trimStart(strIAuthTabCallback, '.'));
        }
        String strOnExtraCallback = transgetsignprikey.onExtraCallback();
        if (strOnExtraCallback != null) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Date date = (Date) IAuthTabCallback(new Object[]{this, strOnExtraCallback}, alertWithArgs.onExtraCallbackWithResult(), 1437588809, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1437588809, alertWithArgs.onExtraCallbackWithResult());
                if (date != null) {
                    sb.append("; expires=" + onWarmupCompleted(date));
                }
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Boolean boolIAuthTabCallbackStub = transgetsignprikey.IAuthTabCallbackStub();
        if (boolIAuthTabCallbackStub != null) {
            int i3 = onExtraCallback + 1;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                boolean zBooleanValue = boolIAuthTabCallbackStub.booleanValue();
                int i4 = 74 / 0;
                if (zBooleanValue) {
                    sb.append("; secure");
                }
            } else if (boolIAuthTabCallbackStub.booleanValue()) {
            }
        }
        Boolean boolOnWarmupCompleted = transgetsignprikey.onWarmupCompleted();
        if (boolOnWarmupCompleted != null && boolOnWarmupCompleted.booleanValue()) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final WritableMap onExtraCallbackWithResult(String str, String str2) throws Throwable {
        int i = 2 % 2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
            for (HttpCookie httpCookie : HttpCookie.parse(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())) {
                int i4 = onExtraCallback + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                String name = httpCookie.getName();
                if (name != null && name.length() != 0) {
                    int i6 = onExtraCallback + 107;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        httpCookie.getValue();
                        throw null;
                    }
                    String value = httpCookie.getValue();
                    if (value != null) {
                        int i7 = IAuthTabCallback + 29;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        if (value.length() != 0) {
                            Intrinsics.checkNotNull(httpCookie);
                            WritableNativeMap writableNativeMapOnExtraCallbackWithResult = onExtraCallbackWithResult(httpCookie);
                            String name2 = httpCookie.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "");
                            writableNativeMap.putMap(name2, writableNativeMapOnExtraCallbackWithResult);
                        }
                    }
                }
            }
        }
        return writableNativeMap;
    }

    private final WritableNativeMap onExtraCallbackWithResult(HttpCookie httpCookie) throws Throwable {
        String strIAuthTabCallback;
        int i = 2 % 2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 4, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, new char[]{65529, 6, 65533, 5}, true, 218 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        writableNativeMap.putString(((String) objArr[0]).intern(), httpCookie.getName());
        Object[] objArr2 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 5, 4 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{'\t', 0, 65525, '\n', 65529}, true, (Process.myTid() >> 22) + 222, objArr2);
        writableNativeMap.putString(((String) objArr2[0]).intern(), httpCookie.getValue());
        writableNativeMap.putString("domain", httpCookie.getDomain());
        writableNativeMap.putString("path", httpCookie.getPath());
        writableNativeMap.putBoolean("secure", httpCookie.getSecure());
        writableNativeMap.putBoolean("httpOnly", httpCookie.isHttpOnly());
        long maxAge = httpCookie.getMaxAge();
        if (maxAge > 0 && (strIAuthTabCallback = IAuthTabCallback(new Date(maxAge))) != null && strIAuthTabCallback.length() != 0) {
            int i2 = onExtraCallback + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            writableNativeMap.putString("expires", strIAuthTabCallback);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return writableNativeMap;
    }

    private final String IAuthTabCallback(Date date) {
        int i = 2 % 2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            String str = simpleDateFormat.format(date);
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    private final URI IAuthTabCallback(String str) {
        int i = 2 % 2;
        try {
            URI uri = new URI(str);
            String host = uri.getHost();
            if (host != null) {
                int i2 = IAuthTabCallback + 21;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (host.length() != 0) {
                    int i4 = IAuthTabCallback + 67;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return uri;
                }
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("Invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            throw new IllegalArgumentException(str2);
        } catch (Exception unused) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str3 = String.format("Invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            throw new IllegalArgumentException(str3);
        }
    }

    private final void onExtraCallback(URI uri, String str) {
        String host;
        int i = 2 % 2;
        if (str != null && str.length() != 0 && (host = uri.getHost()) != null) {
            String strTrimStart = StringsKt__StringsKt.trimStart(str, '.');
            if (!StringsKt__StringsJVMKt.endsWith$default(host, strTrimStart, false, 2, null)) {
                int i2 = onExtraCallback + 27;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(host, strTrimStart);
                    throw null;
                }
                if (!Intrinsics.areEqual(host, strTrimStart)) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format("Cookie URL host %s and domain %s mismatched", Arrays.copyOf(new Object[]{host, str}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    throw new IllegalArgumentException(str2);
                }
            }
        }
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws ParseException {
        String str = (String) objArr[1];
        int i = 2 % 2;
        try {
            try {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                    Date date = simpleDateFormat.parse(str);
                    int i2 = onExtraCallback + 65;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return date;
                    }
                    throw null;
                } catch (Exception unused) {
                    return new Date((long) Double.parseDouble(str));
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat2.parse(str);
        }
    }

    private final String onWarmupCompleted(Date date) {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    @Override // o.transInit
    public Object onExtraCallback(@NotNull String str, @NotNull transGetSignPriKey transgetsignprikey, boolean z, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        onExtraCallback(IAuthTabCallback(str), transgetsignprikey.IAuthTabCallback());
        String strOnExtraCallback = onExtraCallback(transgetsignprikey);
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        IAuthTabCallback(this).setCookie(str, strOnExtraCallback, new onWarmupCompleted(setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        Object obj = null;
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.transInit
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        IAuthTabCallback(this).removeAllCookies(new IAuthTabCallback(setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            int i5 = onExtraCallback + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return objIAuthTabCallbackDefault;
    }

    @Override // o.transInit
    public Object onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        IAuthTabCallback(this).setCookie(str, str2, new onExtraCallback(setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            int i5 = IAuthTabCallback + 15;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = onExtraCallback + 5;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return objIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.transInit
    public Object IAuthTabCallback(@NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        IAuthTabCallback(this).removeSessionCookies(new onNavigationEvent(setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return objIAuthTabCallbackDefault;
    }

    public static /* synthetic */ CookieManager IAuthTabCallback() {
        return (CookieManager) IAuthTabCallback(new Object[0], alertWithArgs.onExtraCallbackWithResult(), -1516739752, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1516739753, alertWithArgs.onExtraCallbackWithResult());
    }

    private final Date onNavigationEvent(String str) {
        return (Date) IAuthTabCallback(new Object[]{this, str}, alertWithArgs.onExtraCallbackWithResult(), 1437588809, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1437588809, alertWithArgs.onExtraCallbackWithResult());
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 478308955;
    }
}
