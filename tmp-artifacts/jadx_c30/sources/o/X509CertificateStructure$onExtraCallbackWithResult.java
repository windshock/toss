package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.authenticator;
import o.callTimeoutMillis;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class X509CertificateStructure$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 26709;
    private static int asInterface = 1;
    private static char onExtraCallback = 56028;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 27126;
    private static char onWarmupCompleted = 50328;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageData;
    final /* synthetic */ String $message;
    final /* synthetic */ setText $parsedMessage;
    final /* synthetic */ String $referrer;
    final /* synthetic */ String $referrerButton;
    final /* synthetic */ String $serviceReferrer;
    final /* synthetic */ String $title;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ X509CertificateStructure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X509CertificateStructure$onExtraCallbackWithResult(String str, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, X509CertificateStructure x509CertificateStructure, Context context, String str2, String str3, String str4, String str5, String str6, setText settext, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super X509CertificateStructure$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.$imageData = str;
        this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.this$0 = x509CertificateStructure;
        this.$context = context;
        this.$referrer = str2;
        this.$serviceReferrer = str3;
        this.$referrerButton = str4;
        this.$title = str5;
        this.$message = str6;
        this.$parsedMessage = settext;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = asInterface + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        X509CertificateStructure$onExtraCallbackWithResult x509CertificateStructure$onExtraCallbackWithResult = new X509CertificateStructure$onExtraCallbackWithResult(this.$imageData, this.$contentOwner, this.this$0, this.$context, this.$referrer, this.$serviceReferrer, this.$referrerButton, this.$title, this.$message, this.$parsedMessage, this.$callbackProxy, access13800Var);
        x509CertificateStructure$onExtraCallbackWithResult.L$0 = obj;
        int i2 = onExtraCallbackWithResult + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return x509CertificateStructure$onExtraCallbackWithResult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallbackWithResult + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    static final class onNavigationEvent implements Function1<Throwable, Unit> {
        final /* synthetic */ setOnOutOfMemeryErrorCallback onNavigationEvent;

        onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
            this.onNavigationEvent = setonoutofmemeryerrorcallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Throwable th) {
            Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
            ALCFaceBox.onExtraCallbackWithResult(this.onNavigationEvent, th, (String) null, (Map) null, 6, (Object) null);
        }
    }

    static final class onWarmupCompleted implements Function1<String, Unit> {
        final /* synthetic */ setOnOutOfMemeryErrorCallback IAuthTabCallback;

        onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
            this.IAuthTabCallback = setonoutofmemeryerrorcallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((String) obj);
            return Unit.INSTANCE;
        }

        public final void IAuthTabCallback(String str) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            ALCFaceBox.onExtraCallback(this.IAuthTabCallback, str);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 95;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = $11 + 35;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 58224;
            int i11 = i3;
            while (i11 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i12 = (c3 + i10) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i3) + 10;
                        int bitsPerPixel = 12433 - ImageFormat.getBitsPerPixel(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, offsetBefore, bitsPerPixel, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i14 = i11;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11 = i14 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getTouchSlop() >> 8)), (-16777202) - Color.rgb(0, 0, 0), 19901 - View.MeasureSpec.getMode(0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112 A[Catch: Exception -> 0x0200, CancellationException -> 0x020c, WebResourceResponseModel -> 0x020e, TryCatch #4 {CancellationException -> 0x020c, Exception -> 0x0200, WebResourceResponseModel -> 0x020e, blocks: (B:7:0x0047, B:54:0x0173, B:56:0x017d, B:61:0x0198, B:64:0x01ab, B:65:0x01b8, B:67:0x01be, B:69:0x01cc, B:70:0x01d0, B:12:0x008d, B:28:0x00f7, B:34:0x010e, B:36:0x0112, B:38:0x0118, B:40:0x0120, B:47:0x0134, B:50:0x013f, B:48:0x0138, B:27:0x00ed), top: B:87:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: Exception -> 0x0200, CancellationException -> 0x020c, WebResourceResponseModel -> 0x020e, TryCatch #4 {CancellationException -> 0x020c, Exception -> 0x0200, WebResourceResponseModel -> 0x020e, blocks: (B:7:0x0047, B:54:0x0173, B:56:0x017d, B:61:0x0198, B:64:0x01ab, B:65:0x01b8, B:67:0x01be, B:69:0x01cc, B:70:0x01d0, B:12:0x008d, B:28:0x00f7, B:34:0x010e, B:36:0x0112, B:38:0x0118, B:40:0x0120, B:47:0x0134, B:50:0x013f, B:48:0x0138, B:27:0x00ed), top: B:87:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be A[Catch: Exception -> 0x0200, CancellationException -> 0x020c, WebResourceResponseModel -> 0x020e, TryCatch #4 {CancellationException -> 0x020c, Exception -> 0x0200, WebResourceResponseModel -> 0x020e, blocks: (B:7:0x0047, B:54:0x0173, B:56:0x017d, B:61:0x0198, B:64:0x01ab, B:65:0x01b8, B:67:0x01be, B:69:0x01cc, B:70:0x01d0, B:12:0x008d, B:28:0x00f7, B:34:0x010e, B:36:0x0112, B:38:0x0118, B:40:0x0120, B:47:0x0134, B:50:0x013f, B:48:0x0138, B:27:0x00ed), top: B:87:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Throwable th;
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        Context context;
        String str;
        String str2;
        String str3;
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback;
        Object obj3;
        X509CertificateStructure x509CertificateStructure;
        Object obj4;
        List listEmptyList;
        Context context2;
        String str4;
        Uri uri;
        String str5;
        getHostnameVerifierokhttp gethostnameverifierokhttp;
        Object objOnNavigationEvent;
        String str6;
        String str7;
        String str8;
        Iterator it;
        int i;
        int i2 = 2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (i3 != 0) {
            int i4 = onExtraCallbackWithResult + 5;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{1829, 59969, 51780, 3588, 46052, 37298, 35825, 10111, 26344, 59793, 54936, 14348, 53561, 14781, 41475, 36603, 25137, 14261, 64034, 36040, 56576, 31348, 40021, 23176, 63282, 24148, 37873, 43363, 28214, 1123, 41475, 36603, 32886, 29198, 6068, 40053, 30688, 18066, 38986, 17848, 57930, 61007, 45357, 64980, 57246, 16130, 42041, 2639}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            listEmptyList = (List) this.L$10;
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = (setOnOutOfMemeryErrorCallback) this.L$8;
            str6 = (String) this.L$7;
            str8 = (String) this.L$6;
            str7 = (String) this.L$5;
            str2 = (String) this.L$4;
            str = (String) this.L$3;
            context = (Context) this.L$2;
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) this.L$1;
            ResultKt.onNavigationEvent(obj);
            setonoutofmemeryerrorcallback = setonoutofmemeryerrorcallback2;
            gethostnameverifierokhttp = null;
            objOnNavigationEvent = obj;
        } else {
            ResultKt.onNavigationEvent(obj);
            String str9 = this.$imageData;
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq = this.$contentOwner;
            X509CertificateStructure x509CertificateStructure2 = this.this$0;
            context = this.$context;
            str = this.$referrer;
            str2 = this.$serviceReferrer;
            str3 = this.$referrerButton;
            String str10 = this.$title;
            String str11 = this.$message;
            setText settext = this.$parsedMessage;
            setonoutofmemeryerrorcallback = this.$callbackProxy;
            Result.Companion companion3 = Result.Companion;
            try {
                JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
                obj3 = objOnWarmupCompleted;
                x509CertificateStructure = x509CertificateStructure2;
                try {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{9988, 48975, 52515, 36701, 63674, 36823, 54936, 14348}, 8 - (Process.myTid() >> 22), objArr2);
                    JsonArray asJsonArray = jsonObjectOnExtraCallbackWithResult.get(((String) objArr2[0]).intern()).getAsJsonArray();
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, BuildConfig.FLAVOR);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = asJsonArray.iterator();
                    while (it2.hasNext()) {
                        String asString = ((JsonElement) it2.next()).getAsString();
                        if (asString != null) {
                            arrayList.add(asString);
                        }
                    }
                    obj4 = Result.constructor-impl(arrayList);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion4 = Result.Companion;
                    obj4 = Result.constructor-impl(ResultKt.createFailure(th));
                    if (Result.onExtraCallback(obj4)) {
                    }
                    listEmptyList = (List) obj4;
                    if (listEmptyList == null) {
                    }
                    if (str9 != null) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj3 = objOnWarmupCompleted;
                x509CertificateStructure = x509CertificateStructure2;
            }
            if (Result.onExtraCallback(obj4)) {
                int i6 = onExtraCallbackWithResult + 11;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 53 / 0;
                }
                obj4 = null;
            }
            listEmptyList = (List) obj4;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (str9 != null) {
                context2 = context;
                str4 = str10;
                uri = null;
                str5 = str11;
                authenticator.onWarmupCompleted onwarmupcompleted = authenticator.Companion;
                ArrayList arrayList2 = new ArrayList();
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    deprecated_readTimeoutMillis deprecated_readtimeoutmillisOnExtraCallback = deprecated_readTimeoutMillis.Companion.onExtraCallback((String) it.next());
                    if (deprecated_readtimeoutmillisOnExtraCallback != null) {
                        arrayList2.add(deprecated_readtimeoutmillisOnExtraCallback);
                    }
                }
                callTimeoutMillis.onNavigationEvent.IAuthTabCallback(callTimeoutMillis.Companion, context2, authenticator.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, context2, str4, str5, uri, new certificateChainCleaner(str, str2, str3), arrayList2, false, false, 128, (Object) null), (String) null, new onWarmupCompleted(setonoutofmemeryerrorcallback), new onNavigationEvent(setonoutofmemeryerrorcallback), 4, (Object) null);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback3 = this.$callbackProxy;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a(new char[]{40123, 28995, 37461, 50364, 38761, 45314, 54936, 14348, 35981, 19242, 45269, 33766, 57726, 19985, 38050, 31185, 25714, 26818, 32474, 37204}, (ViewConfiguration.getLongPressTimeout() >> 16) + 19, objArr3);
                    convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr3[0]).intern(), th);
                    ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback3, th, (String) null, (Map) null, 6, (Object) null);
                }
                return Unit.INSTANCE;
            }
            getHostnameVerifierokhttp activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = activity instanceof getHostnameVerifierokhttp ? activity : null;
            if (gethostnameverifierokhttp2 != null) {
                int i8 = asInterface + 47;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    gethostnameverifierokhttp = null;
                    getHostnameVerifierokhttp.onNavigationEvent(gethostnameverifierokhttp2, (String) null, 1, (Object) null);
                } else {
                    gethostnameverifierokhttp = null;
                    getHostnameVerifierokhttp.onNavigationEvent(gethostnameverifierokhttp2, (String) null, 1, (Object) null);
                }
            } else {
                gethostnameverifierokhttp = null;
            }
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.L$2 = context;
            this.L$3 = str;
            this.L$4 = str2;
            this.L$5 = str3;
            this.L$6 = str10;
            this.L$7 = str11;
            this.L$8 = setonoutofmemeryerrorcallback;
            this.L$9 = access15400.onNavigationEvent(this);
            this.L$10 = listEmptyList;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            objOnNavigationEvent = X509CertificateStructure.onNavigationEvent(x509CertificateStructure, context, str9, this);
            Object obj5 = obj3;
            if (objOnNavigationEvent == obj5) {
                return obj5;
            }
            str6 = str11;
            str7 = str3;
            str8 = str10;
        }
        Uri uri2 = (Uri) objOnNavigationEvent;
        FragmentActivity activity2 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity2 instanceof getHostnameVerifierokhttp) {
            gethostnameverifierokhttp = (getHostnameVerifierokhttp) activity2;
            i = 2;
        } else {
            int i9 = asInterface + 11;
            onExtraCallbackWithResult = i9 % 128;
            i = 2;
            int i10 = i9 % 2;
        }
        if (gethostnameverifierokhttp != null) {
            int i11 = onExtraCallbackWithResult + 35;
            asInterface = i11 % 128;
            int i12 = i11 % i;
            gethostnameverifierokhttp.dismissLoadingIndicator();
        }
        uri = uri2;
        str5 = str6;
        str4 = str8;
        str3 = str7;
        context2 = context;
        authenticator.onWarmupCompleted onwarmupcompleted2 = authenticator.Companion;
        ArrayList arrayList22 = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
        }
        callTimeoutMillis.onNavigationEvent.IAuthTabCallback(callTimeoutMillis.Companion, context2, authenticator.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted2, context2, str4, str5, uri, new certificateChainCleaner(str, str2, str3), arrayList22, false, false, 128, (Object) null), (String) null, new onWarmupCompleted(setonoutofmemeryerrorcallback), new onNavigationEvent(setonoutofmemeryerrorcallback), 4, (Object) null);
        obj2 = Result.constructor-impl(Unit.INSTANCE);
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback32 = this.$callbackProxy;
        th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
        }
        return Unit.INSTANCE;
    }
}
