package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import im.toss.ads_sdk.remote.api.ApiResponse;
import im.toss.ads_sdk.remote.api.ApiServerError;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeOnPageChangeListener extends RuntimeException {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static char onExtraCallback;
    private static final String onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static long onWarmupCompleted;
    private Map<String, ? extends Object> data;
    private String errorCode;
    private int errorType;
    private Request request;
    private String title;
    private String tossEventId;
    private static final byte[] $$a = {120, -46, -95, -23};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (i * 2);
        int i5 = i2 * 3;
        int i6 = b + 109;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i4;
            int i10 = i4 + (-i7);
            i3 = i8;
            int i11 = i9;
            i6 = i10;
            i4 = i11;
            int i12 = i4 + 1;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i12];
            int i13 = i6;
            i9 = i12;
            i4 = i13;
            int i102 = i4 + (-i7);
            i3 = i8;
            int i112 = i9;
            i6 = i102;
            i4 = i112;
            int i122 = i4 + 1;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i4 + 1;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1, new char[]{62115, 47608, 33849, 10291, 60939, 61669, 43058, 63288, 27211, 47391, 42833, 61208, 62688, 19266, 47273, 28154, 28098, 21934, 15964, 51569, 60283, 4178}, new char[]{6636, 6138, 64684, 46584}, new char[]{27231, 23302, 57049, 29680}, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        onNavigationEvent = 8;
        int i = asBinder + 3;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ removeOnPageChangeListener(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public static /* synthetic */ Throwable IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Throwable thOnWarmupCompleted = onWarmupCompleted(th);
        int i4 = asInterface + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return thOnWarmupCompleted;
    }

    public static /* synthetic */ Throwable IAuthTabCallback(removeOnPageChangeListener removeonpagechangelistener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Throwable thOnExtraCallback = onExtraCallback(removeonpagechangelistener);
        int i4 = asInterface + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return thOnExtraCallback;
    }

    public static /* synthetic */ Throwable onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Throwable th2 = (Throwable) onNavigationEvent(iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{th}, 1797847031, iOnNavigationEvent2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1797847031);
        int i4 = asInterface + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return th2;
    }

    public static /* synthetic */ Throwable onExtraCallbackWithResult(removeOnPageChangeListener removeonpagechangelistener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Throwable thOnWarmupCompleted = onWarmupCompleted(removeonpagechangelistener);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return thOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i6 | i)) | i3;
        int i8 = ~i6;
        int i9 = ~((~i3) | i8 | i);
        int i10 = (~(i | i3)) | (~(i8 | (~i)));
        int i11 = i6 + i3 + i4 + (1616745821 * i2) + (2077170981 * i5);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i6) + 1587019776 + (806482222 * i3) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i4) + ((-395313152) * i2) + (904921088 * i5) + (345505792 * i12);
        int i14 = (i6 * (-1558553916)) + 318941677 + (i3 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i4 * (-1558553459)) + (i2 * 397062201) + (i5 * 609114465) + (i12 * (-138936320));
        return i13 + ((i14 * i14) * 1630011392) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.errorType = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.data = map;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        this.data = map;
        int i3 = asInterface + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        this.tossEventId = str;
        int i5 = i3 + 103;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 125;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.title = str;
        int i5 = i2 + 51;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        HttpUrl httpUrlUrl;
        removeOnPageChangeListener removeonpagechangelistener = (removeOnPageChangeListener) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Request request = removeonpagechangelistener.request;
        if (request == null || (httpUrlUrl = request.url()) == null) {
            int i4 = IAuthTabCallbackDefault + 81;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i5 = IAuthTabCallbackDefault + 37;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return httpUrlUrl.toString();
        }
        httpUrlUrl.toString();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public removeOnPageChangeListener(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = "";
        this.data = access8100.onNavigationEvent();
    }

    private removeOnPageChangeListener(String str, Throwable th) {
        super(str, th);
        this.errorCode = "";
        this.data = access8100.onNavigationEvent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public removeOnPageChangeListener(@NotNull Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "");
        this.errorCode = "";
        this.data = access8100.onNavigationEvent();
    }

    private static final Throwable onExtraCallback(removeOnPageChangeListener removeonpagechangelistener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Throwable cause = removeonpagechangelistener.getCause();
        int i4 = asInterface + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return cause;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Throwable cause = th.getCause();
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return cause;
    }

    private static final Throwable onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            th.getCause();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Throwable cause = th.getCause();
        int i3 = IAuthTabCallbackDefault + 125;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return cause;
    }

    private static final Throwable onWarmupCompleted(removeOnPageChangeListener removeonpagechangelistener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Throwable cause = removeonpagechangelistener.getCause();
        int i4 = asInterface + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return cause;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        int i = 2 % 2;
        String str = "TossApiError(errorType=" + this.errorType + ", errorCode='" + this.errorCode + "', data=" + this.data + ", url=" + ((String) onNavigationEvent(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 1313231138, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1313231137)) + ", tossEventId=" + this.tossEventId + ", title=" + this.title + ", message=" + getLocalizedMessage() + ")";
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int[] onExtraCallbackWithResult = {-189658001, -91532267, 1722434914, 1052132974, -580096688, -366904191, 1253739748, -1913479222, 708414688, -1098993215, 1956510985, 1588568526, 844863963, 1138795946, 451843371, -709964710, 977973104, 1069256566};
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final removeOnPageChangeListener onExtraCallbackWithResult(@NotNull Throwable th) throws Throwable {
            removeOnPageChangeListener removeonpagechangelistener;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (th instanceof removeOnPageChangeListener) {
                int i2 = onExtraCallback + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return (removeOnPageChangeListener) th;
            }
            if (!(th instanceof HttpException)) {
                return new removeOnPageChangeListener(th);
            }
            int i4 = onWarmupCompleted + 123;
            onExtraCallback = i4 % 128;
            int iCode = i4 % 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (iCode == 0) {
                HttpException httpException = (HttpException) th;
                httpException.message();
                httpException.code();
                ((HttpException) th).response();
                throw null;
            }
            HttpException httpException2 = (HttpException) th;
            String strMessage = httpException2.message();
            iCode = httpException2.code();
            retrofit2.Response response = ((HttpException) th).response();
            if (response != null) {
                int i5 = onWarmupCompleted + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResponseBody responseBodyOnWarmupCompleted = response.onWarmupCompleted();
                Reader readerCharStream = responseBodyOnWarmupCompleted != null ? responseBodyOnWarmupCompleted.charStream() : null;
                JsonObject reader = JsonParser.parseReader(readerCharStream);
                if (reader instanceof JsonObject) {
                    Object[] objArr = new Object[1];
                    a(new int[]{1539581083, -1037820780, -158084523, -590858235}, 7 - View.resolveSizeAndState(0, 0, 0), objArr);
                    if (reader.has(((String) objArr[0]).intern())) {
                        int i7 = onWarmupCompleted + 23;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr2 = new Object[1];
                        a(new int[]{1539581083, -1037820780, -158084523, -590858235}, Color.blue(0) + 7, objArr2);
                        strMessage = reader.get(((String) objArr2[0]).intern()).getAsString();
                    }
                }
            }
            Intrinsics.checkNotNull(strMessage);
            if (strMessage.length() > 0) {
                Intrinsics.checkNotNull(strMessage);
                removeonpagechangelistener = new removeOnPageChangeListener(strMessage, th, defaultConstructorMarker);
            } else {
                removeonpagechangelistener = new removeOnPageChangeListener(th);
            }
            removeonpagechangelistener.onExtraCallback(String.valueOf(iCode));
            int i9 = onExtraCallback + 29;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 76 / 0;
            }
            return removeonpagechangelistener;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
          0x0028: PHI (r1v5 im.toss.ads_sdk.remote.api.ApiServerError) = (r1v4 im.toss.ads_sdk.remote.api.ApiServerError), (r1v7 im.toss.ads_sdk.remote.api.ApiServerError) binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final removeOnPageChangeListener onWarmupCompleted(@NotNull ApiResponse<?> apiResponse) {
            ApiServerError apiServerErrorOnWarmupCompleted;
            String strIAuthTabCallbackDefault;
            Map<String, ? extends Object> mapOnNavigationEvent;
            Map<String, Object> mapOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int iOnExtraCallbackWithResult = 0;
            String str = "";
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(apiResponse, "");
                apiServerErrorOnWarmupCompleted = apiResponse.onWarmupCompleted();
                int i3 = 29 / 0;
                if (apiServerErrorOnWarmupCompleted != null) {
                    int i4 = onWarmupCompleted + 25;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        apiServerErrorOnWarmupCompleted.onExtraCallbackWithResult();
                        throw null;
                    }
                    iOnExtraCallbackWithResult = apiServerErrorOnWarmupCompleted.onExtraCallbackWithResult();
                }
            } else {
                Intrinsics.checkNotNullParameter(apiResponse, "");
                apiServerErrorOnWarmupCompleted = apiResponse.onWarmupCompleted();
                if (apiServerErrorOnWarmupCompleted != null) {
                }
            }
            if (apiServerErrorOnWarmupCompleted != null) {
                strIAuthTabCallbackDefault = apiServerErrorOnWarmupCompleted.IAuthTabCallbackDefault();
                int i5 = onWarmupCompleted + 125;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                strIAuthTabCallbackDefault = null;
            }
            if (strIAuthTabCallbackDefault == null) {
                strIAuthTabCallbackDefault = "";
            }
            if (apiServerErrorOnWarmupCompleted != null) {
                int i7 = onWarmupCompleted + 61;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                String strOnWarmupCompleted = apiServerErrorOnWarmupCompleted.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    str = strOnWarmupCompleted;
                }
            }
            if (apiServerErrorOnWarmupCompleted == null || (mapOnExtraCallback = apiServerErrorOnWarmupCompleted.onExtraCallback()) == null || (mapOnNavigationEvent = access8100.IAuthTabCallback(mapOnExtraCallback)) == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
                int i9 = onWarmupCompleted + 47;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            removeOnPageChangeListener removeonpagechangelistener = new removeOnPageChangeListener(strIAuthTabCallbackDefault);
            removeonpagechangelistener.onNavigationEvent(iOnExtraCallbackWithResult);
            removeonpagechangelistener.onExtraCallback(str);
            removeonpagechangelistener.onWarmupCompleted(mapOnNavigationEvent);
            removeonpagechangelistener.onNavigationEvent(apiResponse.asInterface());
            removeonpagechangelistener.onExtraCallbackWithResult(apiServerErrorOnWarmupCompleted != null ? apiServerErrorOnWarmupCompleted.asInterface() : null);
            return removeonpagechangelistener;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallbackWithResult;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 13;
                    $11 = i7 % 128;
                    if (i7 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.indexOf("", "", 0) + 72, View.MeasureSpec.makeMeasureSpec(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 73, 8848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i6++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    i4 = -1469660336;
                }
                int i8 = $11 + 13;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallbackWithResult;
            if (iArr5 != null) {
                int i10 = $11 + 53;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = $11 + 49;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 73 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                    int i15 = $10 + 37;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 4 % 2;
                    }
                    i5 = 0;
                }
                iArr5 = iArr6;
            }
            int i17 = i5;
            System.arraycopy(iArr5, i17, iArr4, i17, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i17;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i17] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i18 = 0;
                for (int i19 = 16; i18 < i19; i19 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i18];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - ExpandableListView.getPackedPositionChild(0L)), (Process.myPid() >> 22) + 39, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i18++;
                }
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 4034), AndroidCharacter.getMirror('0') + 30, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i17 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 63;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maximumDrawingCacheSize = 43 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1451;
                    byte b = (byte) i3;
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, maximumDrawingCacheSize, tapTimeout, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char scrollDefaultDelay = (char) (49123 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int iMyTid = (Process.myTid() >> 22) + 44;
                    int maximumDrawingCacheSize2 = 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollDefaultDelay, iMyTid, maximumDrawingCacheSize2, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 23972);
                    int iResolveSizeAndState = View.resolveSizeAndState(i3, i3, i3) + 50;
                    int maximumFlingVelocity = 22939 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, iResolveSizeAndState, maximumFlingVelocity, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i9);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 45848);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 29;
                    int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12576;
                    c2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cKeyCodeFromString, tapTimeout2, i10, 1401536470, false, "l", clsArr4);
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Throwable onNavigationEvent(Throwable th) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Throwable) onNavigationEvent(iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{th}, 1797847031, iOnNavigationEvent2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1797847031);
    }

    public final String onExtraCallback() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (String) onNavigationEvent(iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 1313231138, iOnNavigationEvent2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1313231137);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = -2755375475603049961L;
        IAuthTabCallback = -1776194565;
        onExtraCallback = (char) 27643;
    }
}
