package o;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.ads_sdk.NativeAdsManager;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.ads.FetchAppsInTossAdHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X509ObjectIdentifiers implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult = {27229, 27245, 27148, 27173, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199, 27140, 27144, 27170, 27176, 27180, 27178, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141, 27245, 27144, 27174, 27171, 27196, 27196, 27173, 27260, 27173, 27196, 27171, 27176, 27181, 27180};

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return X509ObjectIdentifiers.onWarmupCompleted(X509ObjectIdentifiers.this, null, null, this);
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, str2);
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i3 = IAuthTabCallback + 85;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(X509ObjectIdentifiers x509ObjectIdentifiers, NativeAdsManager nativeAdsManager, JsonObject jsonObject, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = x509ObjectIdentifiers.onWarmupCompleted(nativeAdsManager, jsonObject, access13800Var);
        int i4 = onExtraCallback + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onExtraCallback + 111;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = IAuthTabCallback + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = onExtraCallback + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
        int i6 = IAuthTabCallback + 79;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new FetchAppsInTossAdHandler$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return filterCreatePageParams.onTransact(Uri.parse(str));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        filterCreatePageParams.onTransact(Uri.parse(str));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a A[PHI: r11
      0x004a: PHI (r11v2 androidx.fragment.app.FragmentActivity) = (r11v1 androidx.fragment.app.FragmentActivity), (r11v12 androidx.fragment.app.FragmentActivity) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r12, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r13) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.X509ObjectIdentifiers.onExtraCallback
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.X509ObjectIdentifiers.IAuthTabCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            androidx.fragment.app.FragmentActivity r11 = r10.getActivity()
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            r2 = 37
            int r2 = r2 / 0
            if (r1 == 0) goto L3f
            goto L4a
        L29:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            androidx.fragment.app.FragmentActivity r11 = r10.getActivity()
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            r1 = r1 ^ 1
            if (r1 == 0) goto L4a
        L3f:
            int r11 = o.X509ObjectIdentifiers.onExtraCallback
            int r11 = r11 + 3
            int r1 = r11 % 128
            o.X509ObjectIdentifiers.IAuthTabCallback = r1
            int r11 = r11 % r0
            r11 = 0
            goto L4c
        L4a:
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
        L4c:
            if (r11 != 0) goto L4f
            return
        L4f:
            java.lang.Class<im.toss.ads_sdk.NativeAdsManager$onWarmupCompleted> r0 = im.toss.ads_sdk.NativeAdsManager.onWarmupCompleted.class
            java.lang.Object r11 = o.Response.onWarmupCompleted(r11, r0)
            im.toss.ads_sdk.NativeAdsManager$onWarmupCompleted r11 = (im.toss.ads_sdk.NativeAdsManager.onWarmupCompleted) r11
            im.toss.ads_sdk.NativeAdsManager r2 = r11.onTransact()
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r10 = o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r10)
            r11 = 0
            r6 = 0
            o.X509ObjectIdentifiers$onExtraCallbackWithResult r7 = new o.X509ObjectIdentifiers$onExtraCallbackWithResult
            r5 = 0
            r0 = r7
            r1 = r9
            r3 = r12
            r4 = r13
            r0.<init>(r2, r3, r4, r5)
            r12 = 3
            r8 = 0
            r3 = r10
            r4 = r11
            r5 = r6
            r6 = r7
            r7 = r12
            o.maybeUpdateAnimatable.onNavigationEvent(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509ObjectIdentifiers.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        final /* synthetic */ NativeAdsManager $adManager;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ JsonObject $data;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        private static char[] onWarmupCompleted = {32441, 32443, 32432, 32580, 32424, 32437, 32637, 32426, 32447, 32425, 32431, 32439, 32442, 32446, 32435, 32438, 32430, 32433, 32429, 32444, 32415, 32394, 32405};
        private static int onExtraCallbackWithResult = -1184334044;
        private static boolean IAuthTabCallback = true;
        private static boolean onNavigationEvent = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$adManager = nativeAdsManager;
            this.$data = jsonObject;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallbackDefault + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = X509ObjectIdentifiers.this.new onExtraCallbackWithResult(this.$adManager, this.$data, this.$callbackProxy, access13800Var);
            int i2 = onExtraCallback + 97;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 83;
            onExtraCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallbackDefault + 105;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    X509ObjectIdentifiers x509ObjectIdentifiers = X509ObjectIdentifiers.this;
                    NativeAdsManager nativeAdsManager = this.$adManager;
                    JsonObject jsonObject = this.$data;
                    Result.Companion companion = Result.Companion;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = X509ObjectIdentifiers.onWarmupCompleted(x509ObjectIdentifiers, nativeAdsManager, jsonObject, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 15;
                        IAuthTabCallbackDefault = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 126 - Process.getGidForName(""), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                int i7 = IAuthTabCallbackDefault + 105;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 3;
                }
            }
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            if (!(!Result.onNavigationEvent(obj2))) {
                ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, (JsonObject) obj2);
            }
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-106, -105, -106, -106, -107}, 126 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
                ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onWarmupCompleted;
            if (cArr3 != null) {
                int i3 = $10 + 39;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 76 - TextUtils.lastIndexOf("", '0', 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 74, Process.getGidForName("") + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 64, 12214 - TextUtils.indexOf("", ""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i5 = $11 + 107;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 109;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), Color.red(0) + 63, 12214 - TextUtils.getCapsMode("", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr6);
            int i11 = $10 + 105;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(im.toss.ads_sdk.NativeAdsManager r6, com.google.gson.JsonObject r7, o.access13800<? super com.google.gson.JsonObject> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof o.X509ObjectIdentifiers.onNavigationEvent
            if (r1 == 0) goto L1f
            int r1 = o.X509ObjectIdentifiers.onExtraCallback
            int r1 = r1 + 71
            int r2 = r1 % 128
            o.X509ObjectIdentifiers.IAuthTabCallback = r2
            int r1 = r1 % r0
            r1 = r8
            o.X509ObjectIdentifiers$onNavigationEvent r1 = (o.X509ObjectIdentifiers.onNavigationEvent) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L24
        L1f:
            o.X509ObjectIdentifiers$onNavigationEvent r1 = new o.X509ObjectIdentifiers$onNavigationEvent
            r1.<init>(r8)
        L24:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L6c
            int r6 = o.X509ObjectIdentifiers.IAuthTabCallback
            int r6 = r6 + 35
            int r7 = r6 % 128
            o.X509ObjectIdentifiers.onExtraCallback = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L3d
            if (r3 != r4) goto L4b
            goto L3f
        L3d:
            if (r3 != r4) goto L4b
        L3f:
            java.lang.Object r6 = r1.L$1
            com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6
            java.lang.Object r6 = r1.L$0
            im.toss.ads_sdk.NativeAdsManager r6 = (im.toss.ads_sdk.NativeAdsManager) r6
            kotlin.ResultKt.onNavigationEvent(r8)
            goto L8c
        L4b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 25
            r8 = 0
            r0 = 47
            int[] r7 = new int[]{r8, r0, r8, r7}
            byte[] r0 = new byte[r0]
            r0 = {x00a0: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1} // fill-array
            java.lang.Object[] r1 = new java.lang.Object[r4]
            a(r7, r4, r0, r1)
            r7 = r1[r8]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.intern()
            r6.<init>(r7)
            throw r6
        L6c:
            kotlin.ResultKt.onNavigationEvent(r8)
            kotlinx.serialization.json.JsonObject r8 = r5.IAuthTabCallback(r7)
            java.util.Map r0 = o.X509NameEntryConverter.IAuthTabCallback(r7)
            java.lang.Object r3 = o.access15400.onNavigationEvent(r6)
            r1.L$0 = r3
            java.lang.Object r7 = o.access15400.onNavigationEvent(r7)
            r1.L$1 = r7
            r1.label = r4
            java.lang.Object r8 = r6.onWarmupCompleted(r8, r0, r1)
            if (r8 != r2) goto L8c
            return r2
        L8c:
            kotlinx.serialization.json.JsonObject r8 = (kotlinx.serialization.json.JsonObject) r8
            java.lang.String r6 = r8.toString()
            com.google.gson.JsonElement r6 = com.google.gson.JsonParser.parseString(r6)
            com.google.gson.JsonObject r6 = r6.getAsJsonObject()
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509ObjectIdentifiers.onWarmupCompleted(im.toss.ads_sdk.NativeAdsManager, com.google.gson.JsonObject, o.access13800):java.lang.Object");
    }

    private final kotlinx.serialization.json.JsonObject IAuthTabCallback(JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObjectDeepCopy = jsonObject.deepCopy();
        Object[] objArr = new Object[1];
        a(new int[]{47, 7, 0, 3}, false, new byte[]{1, 1, 1, 1, 1, 0, 1}, objArr);
        jsonObjectDeepCopy.remove(((String) objArr[0]).intern());
        wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
        String string = jsonObjectDeepCopy.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        kotlinx.serialization.json.JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallback(string));
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return jsonObjectOnExtraCallbackWithResult;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int i6 = $11 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 35283), TextUtils.getTrimmedLength("") + 35, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 28 - TextUtils.indexOf((CharSequence) "", '0'), MotionEvent.axisFromString("") + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = $11 + 77;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10934), 64 - TextUtils.lastIndexOf("", '0', 0, 0), 16719 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, KeyEvent.keyCodeFromString("") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49467), 70 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12486 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i13 = $10 + 99;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $10 + 125;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 0, cArr3, i3 >> i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i3 - i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i16 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i16, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i16);
            }
        }
        if (z) {
            int i17 = $11 + 5;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i19 = $10 + 91;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
