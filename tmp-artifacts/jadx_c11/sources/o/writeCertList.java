package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.writeCertList;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class writeCertList implements deprecated_maxAgeSeconds {
    public static final onExtraCallbackWithResult Companion;
    private static long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static char access000;
    private static int access100;
    public static final String onNavigationEvent;
    private final Lazy IAuthTabCallback;
    private final Function0<Boolean> asBinder;
    private final Lazy asInterface;
    private boolean onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final CacheControl onTransact;
    private boolean onWarmupCompleted;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    public interface onExtraCallback {
        @certGetAuthorityKeyIdentifier
        @initCertListOnMemory(onExtraCallbackWithResult = "{fontName}")
        getSignPrikeyCCFBPHFilename<ResponseBody> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "fontName") @NotNull String str);

        @initCertListOnMemory(onExtraCallbackWithResult = "info.json")
        getSignPrikeyCCFBPHFilename<ResponseBody> onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = 3 - (b * 4);
        byte[] bArr = $$a;
        int i4 = i + 109;
        int i5 = s * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i3;
            int i9 = (-i3) + i6;
            i2 = i7;
            int i10 = i8;
            i4 = i9;
            i3 = i10;
            int i11 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i8 = i11;
            i3 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = (-i3) + i6;
            i2 = i7;
            int i102 = i8;
            i4 = i92;
            i3 = i102;
            int i112 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i1122 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    static {
        access100 = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((char) TextUtils.indexOf("", ""), (-1828507167) + (ViewConfiguration.getScrollBarSize() >> 8), new char[]{25953, 50555, 29927, 18222, 18894, 5046, 7649, 62423, 35545, 43280, 45422, 14858, 2518, 30682, 6329, 29055, 45514, 12112, 20197, 11101, 21345, 21138, 16854, 2090, 23830, 31723, 21132, 41417, 52449, 46608, 13768, 2581, 6798, 49325, 56401, 64213, 33893}, new char[]{0, 0, 0, 0}, new char[]{57656, 817, 10899, 18142}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = IAuthTabCallback_Parcel + 55;
        access100 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public writeCertList() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | i6;
        int i9 = ~i4;
        int i10 = i7 | i6;
        int i11 = (~(i5 | i9 | i6)) | (~(i10 | i4));
        int i12 = (~i10) | (~(i9 | (~i6)));
        int i13 = i6 + i4 + i + (1353909401 * i2) + ((-1351514252) * i3);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i6) + 799145984 + ((-1483212659) * i4) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i) + (337379328 * i2) + ((-1540358144) * i3) + (669122560 * i14);
        int i16 = ((i6 * 521834465) - 1171472169) + (i4 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i * 521834041) + (i2 * 1123214353) + (i3 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        if (i17 == 1) {
            writeCertList writecertlist = (writeCertList) objArr[0];
            int i18 = 2 % 2;
            int i19 = IAuthTabCallbackStubProxy + 45;
            getInterfaceDescriptor = i19 % 128;
            int i20 = i19 % 2;
            onExtraCallback onExtraCallback2 = onExtraCallback(writecertlist);
            int i21 = getInterfaceDescriptor + 15;
            IAuthTabCallbackStubProxy = i21 % 128;
            int i22 = i21 % 2;
            return onExtraCallback2;
        }
        if (i17 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return onNavigationEvent(objArr);
            }
            writeCertList writecertlist2 = (writeCertList) objArr[0];
            int i23 = 2 % 2;
            int i24 = getInterfaceDescriptor + 49;
            IAuthTabCallbackStubProxy = i24 % 128;
            int i25 = i24 % 2;
            Retrofit retrofitIAuthTabCallback = IAuthTabCallback(writecertlist2);
            int i26 = IAuthTabCallbackStubProxy + 67;
            getInterfaceDescriptor = i26 % 128;
            int i27 = i26 % 2;
            return retrofitIAuthTabCallback;
        }
        writeCertList writecertlist3 = (writeCertList) objArr[0];
        Context context = (Context) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Function0 function0 = (Function0) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int i28 = 2 % 2;
        int i29 = getInterfaceDescriptor;
        int i30 = i29 + 79;
        IAuthTabCallbackStubProxy = i30 % 128;
        int i31 = i30 % 2;
        if (writecertlist3.onWarmupCompleted) {
            int i32 = i29 + 7;
            IAuthTabCallbackStubProxy = i32 % 128;
            int i33 = i32 % 2;
        } else {
            writecertlist3.onWarmupCompleted = true;
            writecertlist3.asBinder().onExtraCallbackWithResult(writecertlist3.onExtraCallback(context)).enqueue(new IAuthTabCallback(writecertlist3, context, jLongValue, function0, function1));
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ okhttp3.OkHttpClient IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        okhttp3.OkHttpClient okHttpClientIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return okHttpClientIAuthTabCallbackStub;
    }

    private static final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static /* synthetic */ Unit onExtraCallback(writeCertList writecertlist, Context context, Function1 function1, Function0 function0, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(writecertlist, context, function1, function0, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(writecertlist, context, function1, function0, j);
        int i3 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackDefault;
    }

    public static /* synthetic */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact();
        int i4 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    private static final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        return i2 % 2 != 0;
    }

    public writeCertList(@NotNull CacheControl cacheControl, @NotNull Function0<Boolean> function0, @NotNull Function0<? extends okhttp3.OkHttpClient> function02) {
        Intrinsics.checkNotNullParameter(cacheControl, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.onTransact = cacheControl;
        this.asBinder = function0;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(function02);
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                Retrofit retrofit;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    retrofit = (Retrofit) writeCertList.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -981225918, new Object[]{this.f$0}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 981225923);
                    int i3 = 21 / 0;
                } else {
                    retrofit = (Retrofit) writeCertList.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -981225918, new Object[]{this.f$0}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 981225923);
                }
                int i4 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return retrofit;
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                writeCertList.onExtraCallback onextracallback = (writeCertList.onExtraCallback) writeCertList.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -910103577, new Object[]{this.f$0}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 910103578);
                int i4 = onWarmupCompleted + 89;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return onextracallback;
                }
                throw null;
            }
        });
    }

    public static final /* synthetic */ void onExtraCallback(writeCertList writecertlist, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        writecertlist.onExtraCallback = z;
        int i5 = i3 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(writeCertList writecertlist, Context context, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(j);
        if (i3 != 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1158979258, new Object[]{writecertlist, context, lValueOf}, iOnExtraCallbackWithResult, 1158979260);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1158979258, new Object[]{writecertlist, context, lValueOf}, iOnExtraCallbackWithResult2, 1158979260);
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        writeCertList writecertlist = (writeCertList) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            writecertlist.onExtraCallback(context);
            throw null;
        }
        String strOnExtraCallback = writecertlist.onExtraCallback(context);
        int i3 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(writeCertList writecertlist, Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        writecertlist.IAuthTabCallbackDefault(context);
        int i4 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(writeCertList writecertlist, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        writecertlist.onWarmupCompleted = z;
        if (i4 != 0) {
            int i5 = 4 / 0;
        }
        int i6 = i3 + 95;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ Object onWarmupCompleted(writeCertList writecertlist, Context context, byte[] bArr, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return writecertlist.IAuthTabCallback(context, bArr, access13800Var);
        }
        writecertlist.IAuthTabCallback(context, bArr, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ writeCertList(CacheControl cacheControl, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        cacheControl = (i & 1) != 0 ? new CacheControl() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // o.CacheControl
            public final boolean check() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnExtraCallbackWithResult = writeCertList.onExtraCallbackWithResult();
                int i5 = onExtraCallbackWithResult + 41;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return zOnExtraCallbackWithResult;
            }
        } : cacheControl;
        function0 = (i & 2) != 0 ? new Function0() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(writeCertList.onNavigationEvent());
                int i5 = IAuthTabCallback + 79;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }
        } : function0;
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    OkHttpClient okHttpClientIAuthTabCallback;
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 85;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        okHttpClientIAuthTabCallback = writeCertList.IAuthTabCallback();
                        int i4 = 86 / 0;
                    } else {
                        okHttpClientIAuthTabCallback = writeCertList.IAuthTabCallback();
                    }
                    int i5 = onNavigationEvent + 77;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return okHttpClientIAuthTabCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            int i2 = getInterfaceDescriptor + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this(cacheControl, function0, function02);
    }

    private static final okhttp3.OkHttpClient IAuthTabCallbackStub() {
        int i = 2 % 2;
        okhttp3.OkHttpClient okHttpClient = new okhttp3.OkHttpClient();
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return okHttpClient;
    }

    private final okhttp3.OkHttpClient access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        okhttp3.OkHttpClient okHttpClient = (okhttp3.OkHttpClient) this.onExtraCallbackWithResult.getValue();
        int i3 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return okHttpClient;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        writeCertList writecertlist = (writeCertList) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = writecertlist.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        Retrofit retrofit = (Retrofit) value;
        int i4 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return retrofit;
    }

    private static final Retrofit IAuthTabCallback(writeCertList writecertlist) throws Throwable {
        int i = 2 % 2;
        Retrofit.Builder builderOnExtraCallbackWithResult = new Retrofit.Builder().onExtraCallbackWithResult(writecertlist.access100());
        Object[] objArr = new Object[1];
        a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1828507167) - TextUtils.getCapsMode("", 0, 0), new char[]{25953, 50555, 29927, 18222, 18894, 5046, 7649, 62423, 35545, 43280, 45422, 14858, 2518, 30682, 6329, 29055, 45514, 12112, 20197, 11101, 21345, 21138, 16854, 2090, 23830, 31723, 21132, 41417, 52449, 46608, 13768, 2581, 6798, 49325, 56401, 64213, 33893}, new char[]{0, 0, 0, 0}, new char[]{57656, 817, 10899, 18142}, objArr);
        Retrofit retrofitIAuthTabCallback = builderOnExtraCallbackWithResult.IAuthTabCallback(((String) objArr[0]).intern()).IAuthTabCallback();
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return retrofitIAuthTabCallback;
    }

    private final onExtraCallback asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        onExtraCallback onextracallback = (onExtraCallback) value;
        int i4 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    private static final onExtraCallback onExtraCallback(writeCertList writecertlist) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {writecertlist};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        onExtraCallback onextracallback = (onExtraCallback) ((Retrofit) IAuthTabCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 1523259036, objArr, iOnExtraCallbackWithResult, -1523259033)).onNavigationEvent(onExtraCallback.class);
        int i4 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    private final String onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Companion.onExtraCallback(context);
            throw null;
        }
        String strOnExtraCallback = Companion.onExtraCallback(context);
        int i3 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    @Override // o.deprecated_maxAgeSeconds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(@NotNull final Context context, boolean z, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function02) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function02, "");
        if (!((Boolean) this.asBinder.invoke()).booleanValue()) {
            if (z) {
                int i4 = IAuthTabCallbackStubProxy + 103;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                if (this.onTransact.check()) {
                }
            } else if (onWarmupCompleted(context)) {
                onExtraCallback(context, new Function1() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) throws Throwable {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 47;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            return writeCertList.onExtraCallback(this.f$0, context, function1, function0, ((Long) obj).longValue());
                        }
                        writeCertList.onExtraCallback(this.f$0, context, function1, function0, ((Long) obj).longValue());
                        throw null;
                    }
                }, function02, function1);
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            getTcfVendorConsentStatus.Companion.getInterfaceDescriptor().onExtraCallback();
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStubProxy + 69;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 52 / 0;
            }
            return unit;
        }
        getTcfVendorConsentStatus.Companion.getInterfaceDescriptor().onExtraCallback();
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onWarmupCompleted(writeCertList writecertlist, Context context, Function1 function1, final Function0 function0, long j) throws Throwable {
        int i = 2 % 2;
        IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1019824452, new Object[]{writecertlist, context, Long.valueOf(j), new Function0() { // from class: im.toss.tds.foundation.font.typeface.DefaultTossFaceLoader$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 107;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = writeCertList.IAuthTabCallback(function0);
                int i5 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, function1}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1019824456);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
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
            int i4 = $11 + 77;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 43 - TextUtils.getOffsetAfter("", 0), 1451 - Drawable.resolveOpacity(0, 0), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, View.getDefaultSize(0, 0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 50, 22939 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 45848), Process.getGidForName("") + 30, 12576 - TextUtils.indexOf((CharSequence) "", '0', 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 113;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Override // o.deprecated_maxAgeSeconds
    public Font rm_(@NotNull Context context) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        File fileOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        Object obj2 = null;
        if (fileOnExtraCallbackWithResult == null) {
            return null;
        }
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(matches.rh_(fileOnExtraCallbackWithResult).build());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.exceptionOrNull-impl(obj);
        if (Result.onExtraCallback(obj)) {
            int i6 = getInterfaceDescriptor + 71;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
        } else {
            obj2 = obj;
        }
        Font fontRg_ = readCertificateList.rg_(obj2);
        int i7 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return fontRg_;
    }

    private final void onExtraCallback(Context context, Function1<? super Long, Unit> function1, Function0<Unit> function0, Function1<? super Throwable, Unit> function12) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 29;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (!this.onExtraCallback) {
            this.onExtraCallback = true;
            asBinder().onNavigationEvent().enqueue(new onWarmupCompleted(function12, function0, this, context, function1));
        } else {
            int i5 = i2 + 73;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // o.deprecated_maxAgeSeconds
    public File onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        try {
            File file = new File(context.getFilesDir(), onExtraCallback(context));
            if (file.exists()) {
                int i2 = getInterfaceDescriptor + 87;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 != 0) {
                    return file;
                }
                throw null;
            }
        } catch (Exception unused) {
        }
        int i3 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Companion.IAuthTabCallback(context);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        long jIAuthTabCallback = Companion.IAuthTabCallback(context);
        int i3 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return jIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            if (System.currentTimeMillis() * context.getSharedPreferences("uikit.pref_toss_face_info", 0).getLong("uikit.pref_key_toss_face_last_synced_at", -1L) > 86400000) {
                try {
                    boolean z = true;
                    if (context.getFilesDir().getFreeSpace() < 20971520) {
                        int i3 = IAuthTabCallbackStubProxy;
                        int i4 = i3 + 95;
                        getInterfaceDescriptor = i4 % 128;
                        z = true ^ (i4 % 2 == 0);
                        int i5 = i3 + 3;
                        getInterfaceDescriptor = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 52 / 0;
                        }
                    }
                    return z;
                } catch (Exception unused) {
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            if (System.currentTimeMillis() - context.getSharedPreferences("uikit.pref_toss_face_info", 0).getLong("uikit.pref_key_toss_face_last_synced_at", -1L) > 86400000) {
            }
        }
        int i7 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ byte[] $byteArray;
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ writeCertList this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(byte[] bArr, Context context, writeCertList writecertlist, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$byteArray = bArr;
            this.$context = context;
            this.this$0 = writecertlist;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$byteArray, this.$context, this.this$0, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            int i5 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$byteArray == null) {
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                int i3 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 42 / 0;
                }
                return boolOnNavigationEvent;
            }
            File file = new File(this.$context.getFilesDir(), "tossface-font.download.tmp");
            Context context = this.$context;
            writeCertList writecertlist = this.this$0;
            byte[] bArr = this.$byteArray;
            try {
                Result.Companion companion = Result.Companion;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                } finally {
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (!file.renameTo(new File(context.getFilesDir(), writeCertList.onWarmupCompleted(writecertlist, context)))) {
                throw new IllegalStateException("TossFace font rename failed");
            }
            int i5 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                Result.constructor-impl(unit);
                obj3.hashCode();
                throw null;
            }
            obj2 = Result.constructor-impl(unit);
            if (Result.exceptionOrNull-impl(obj2) != null) {
                file.delete();
                int i6 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return access14000.onNavigationEvent(Result.onNavigationEvent(obj2));
        }
    }

    private final Object IAuthTabCallback(Context context, byte[] bArr, access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(bArr, context, this, null), access13800Var);
        int i2 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Context context = (Context) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        context.getSharedPreferences("uikit.pref_toss_face_info", 0).edit().putLong("uikit.pref_key_toss_face_last_updated_at", jLongValue).putLong("uikit.pref_key_toss_face_last_synced_at", System.currentTimeMillis()).apply();
        int i4 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallbackDefault(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        (i2 % 2 != 0 ? context.getSharedPreferences("uikit.pref_toss_face_info", 0) : context.getSharedPreferences("uikit.pref_toss_face_info", 0)).edit().putLong("uikit.pref_key_toss_face_last_synced_at", System.currentTimeMillis()).apply();
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final String onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                String string = context.getSharedPreferences("uikit.pref_toss_face_info", 1).getString("uikit.pref_key_toss_face_file_name", null);
                if (string != null) {
                    return string;
                }
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                String string2 = context.getSharedPreferences("uikit.pref_toss_face_info", 0).getString("uikit.pref_key_toss_face_file_name", null);
                if (string2 != null) {
                    return string2;
                }
            }
            int i3 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return "TossFaceFontAndroid.ttf";
        }

        public final long IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            long j = context.getSharedPreferences("uikit.pref_toss_face_info", 0).getLong("uikit.pref_key_toss_face_last_updated_at", -1L);
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ onExtraCallback onExtraCallbackWithResult(writeCertList writecertlist) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onExtraCallback) IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -910103577, new Object[]{writecertlist}, iOnExtraCallbackWithResult, 910103578);
    }

    public static /* synthetic */ Retrofit onWarmupCompleted(writeCertList writecertlist) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Retrofit) IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -981225918, new Object[]{writecertlist}, iOnExtraCallbackWithResult, 981225923);
    }

    public static final /* synthetic */ String onWarmupCompleted(writeCertList writecertlist, Context context) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -616975340, new Object[]{writecertlist, context}, iOnExtraCallbackWithResult, 616975340);
    }

    private final Retrofit access000() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Retrofit) IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1523259036, new Object[]{this}, iOnExtraCallbackWithResult, -1523259033);
    }

    private final void onExtraCallback(Context context, long j, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) throws Throwable {
        IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1019824452, new Object[]{this, context, Long.valueOf(j), function0, function1}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1019824456);
    }

    private final void onExtraCallback(Context context, long j) throws Throwable {
        IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1158979258, new Object[]{this, context, Long.valueOf(j)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1158979260);
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = 7798559133331975163L;
        IAuthTabCallbackStub = -614487149;
        access000 = (char) 27643;
    }
}
