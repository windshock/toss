package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import im.toss.rn.toss.core.common.di.ReactCorePublicKeyEntryPoint;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.MaxAdViewImplExternalSyntheticLambda4;
import o.hExternalSyntheticLambda9;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda9 implements hExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = {27368, 27362, 27361};
    private static int asBinder = 1;
    private final Lazy IAuthTabCallback;
    private final WeakReference<? extends TossReactContentOwner> asInterface;
    private final Lazy onExtraCallback;
    private final ReactApplicationContext onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final HashMap<String, Response> onTransact;
    private final ebExternalSyntheticLambda0 onWarmupCompleted;

    public static /* synthetic */ okhttp3.OkHttpClient IAuthTabCallback() {
        okhttp3.OkHttpClient okHttpClientIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            okHttpClientIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            int i3 = 53 / 0;
        } else {
            okHttpClientIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        }
        int i4 = IAuthTabCallbackDefault + 73;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return okHttpClientIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i4) | i);
        int i11 = i9 | i10 | (~(i | i5));
        int i12 = (~(i5 | i4)) | (~(i7 | i4));
        int i13 = i8 | i10;
        int i14 = i4 + i + i2 + (793188503 * i3) + (2090109681 * i6);
        int i15 = i14 * i14;
        int i16 = (837707615 * i4) + 1286602752 + ((-1676358574) * i) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i2) + (1186463744 * i3) + (1166540800 * i6) + ((-1956446208) * i15);
        int i17 = ((i4 * 1389925299) - 652765764) + (i * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i2 * 1389926445) + (i3 * (-1551828341)) + (i6 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent();
        int i4 = asBinder + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ PublicKey onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKeyOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return publicKeyOnExtraCallbackWithResult;
        }
        throw null;
    }

    public hExternalSyntheticLambda9(@NotNull ReactApplicationContext reactApplicationContext, @NotNull WeakReference<? extends TossReactContentOwner> weakReference) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.onExtraCallbackWithResult = reactApplicationContext;
        this.asInterface = weakReference;
        this.onTransact = new HashMap<>();
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.legacy.bundle.evaluate.TossReactScriptEvaluatorImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                OkHttpClient okHttpClientIAuthTabCallback = hExternalSyntheticLambda9.IAuthTabCallback();
                int i4 = onExtraCallback + 33;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return okHttpClientIAuthTabCallback;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.legacy.bundle.evaluate.TossReactScriptEvaluatorImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallback = hExternalSyntheticLambda9.onExtraCallback();
                int i4 = onWarmupCompleted + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return strOnExtraCallback;
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.legacy.bundle.evaluate.TossReactScriptEvaluatorImpl$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                PublicKey publicKeyOnWarmupCompleted = hExternalSyntheticLambda9.onWarmupCompleted();
                int i4 = onExtraCallback + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return publicKeyOnWarmupCompleted;
            }
        });
        this.onWarmupCompleted = ebExternalSyntheticLambda0.Companion.onWarmupCompleted();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        hExternalSyntheticLambda9 hexternalsyntheticlambda9 = (hExternalSyntheticLambda9) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        HashMap<String, Response> map = hexternalsyntheticlambda9.onTransact;
        int i5 = i3 + 85;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ebExternalSyntheticLambda0 onExtraCallback(hExternalSyntheticLambda9 hexternalsyntheticlambda9) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        ebExternalSyntheticLambda0 ebexternalsyntheticlambda0 = hexternalsyntheticlambda9.onWarmupCompleted;
        int i5 = i3 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return ebexternalsyntheticlambda0;
    }

    public static final /* synthetic */ ReactApplicationContext onExtraCallbackWithResult(hExternalSyntheticLambda9 hexternalsyntheticlambda9) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ReactApplicationContext reactApplicationContext = hexternalsyntheticlambda9.onExtraCallbackWithResult;
        int i5 = i2 + 45;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return reactApplicationContext;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(hExternalSyntheticLambda9 hexternalsyntheticlambda9, String str, ReadableMap readableMap, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        Object objOnExtraCallback = onExtraCallback(-159179374, matches.onExtraCallback(), matches.onExtraCallback(), 159179375, new Object[]{hexternalsyntheticlambda9, str, readableMap, access13800Var}, iOnExtraCallback, matches.onExtraCallback());
        int i4 = IAuthTabCallbackDefault + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        hExternalSyntheticLambda9 hexternalsyntheticlambda9 = (hExternalSyntheticLambda9) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        List<String> listIAuthTabCallback = hexternalsyntheticlambda9.IAuthTabCallback(str);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 97;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return listIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        hExternalSyntheticLambda9 hexternalsyntheticlambda9 = (hExternalSyntheticLambda9) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ReadableMap readableMapIAuthTabCallback = hexternalsyntheticlambda9.IAuthTabCallback(str, str2);
        int i4 = asBinder + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return readableMapIAuthTabCallback;
    }

    public static final /* synthetic */ okhttp3.OkHttpClient onNavigationEvent(hExternalSyntheticLambda9 hexternalsyntheticlambda9) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        okhttp3.OkHttpClient okHttpClient = (okhttp3.OkHttpClient) onExtraCallback(929378433, matches.onExtraCallback(), matches.onExtraCallback(), -929378429, new Object[]{hexternalsyntheticlambda9}, iOnExtraCallback, matches.onExtraCallback());
        int i4 = IAuthTabCallbackDefault + 21;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return okHttpClient;
    }

    public static final /* synthetic */ void onNavigationEvent(hExternalSyntheticLambda9 hexternalsyntheticlambda9, Throwable th, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        hexternalsyntheticlambda9.onNavigationEvent(th, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean onNavigationEvent(hExternalSyntheticLambda9 hexternalsyntheticlambda9, File file, Response response) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return hexternalsyntheticlambda9.onExtraCallback(file, response);
        }
        hexternalsyntheticlambda9.onExtraCallback(file, response);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TossReactContentOwner asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TossReactContentOwner tossReactContentOwner = this.asInterface.get();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return tossReactContentOwner;
    }

    private final TextFieldPressGestureFilterKtExternalSyntheticLambda0 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        TossReactContentOwner tossReactContentOwnerAsInterface = asInterface();
        if (tossReactContentOwnerAsInterface == null) {
            return null;
        }
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tossReactContentOwnerAsInterface);
        int i4 = asBinder + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Promise onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ hExternalSyntheticLambda9 onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, hExternalSyntheticLambda9 hexternalsyntheticlambda9, String str, Promise promise) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = hexternalsyntheticlambda9;
            this.onNavigationEvent = str;
            this.onExtraCallbackWithResult = promise;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                hExternalSyntheticLambda9.onNavigationEvent(this.onWarmupCompleted, th, this.onNavigationEvent);
                this.onExtraCallbackWithResult.reject(th);
                int i3 = onExtraCallback + 31;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            hExternalSyntheticLambda9.onNavigationEvent(this.onWarmupCompleted, th, this.onNavigationEvent);
            this.onExtraCallbackWithResult.reject(th);
            throw null;
        }
    }

    public static final class onExtraCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ Promise onNavigationEvent;
        final /* synthetic */ hExternalSyntheticLambda9 onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, hExternalSyntheticLambda9 hexternalsyntheticlambda9, String str, Promise promise) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = hexternalsyntheticlambda9;
            this.onExtraCallbackWithResult = str;
            this.onNavigationEvent = promise;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            hExternalSyntheticLambda9.onNavigationEvent(this.onWarmupCompleted, th, this.onExtraCallbackWithResult);
            this.onNavigationEvent.reject(th);
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        okhttp3.OkHttpClient okHttpClient;
        hExternalSyntheticLambda9 hexternalsyntheticlambda9 = (hExternalSyntheticLambda9) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = hexternalsyntheticlambda9.onNavigationEvent.getValue();
        if (i3 != 0) {
            okHttpClient = (okhttp3.OkHttpClient) value;
            int i4 = 37 / 0;
        } else {
            okHttpClient = (okhttp3.OkHttpClient) value;
        }
        int i5 = IAuthTabCallbackDefault + 89;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return okHttpClient;
        }
        throw null;
    }

    private static final okhttp3.OkHttpClient IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        okhttp3.OkHttpClient okHttpClientRemoveOnConfigurationChangedListener = ((r8lambdaPQGlPE1_JTkP7q7L5MSb4Ra2PU) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), r8lambdaPQGlPE1_JTkP7q7L5MSb4Ra2PU.class)).removeOnConfigurationChangedListener();
        int i4 = asBinder + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return okHttpClientRemoveOnConfigurationChangedListener;
        }
        throw null;
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.onExtraCallback.getValue();
        int i3 = asBinder + 65;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        String strOnWarmupCompleted = ((MaxAdViewImpld) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), MaxAdViewImpld.class)).removeOnContextAvailableListener().onWarmupCompleted();
        int i4 = asBinder + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    private final PublicKey asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKey = (PublicKey) this.IAuthTabCallback.getValue();
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return publicKey;
    }

    private static final PublicKey onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        PublicKey publicKeyStartIntentSenderForResult = ((ReactCorePublicKeyEntryPoint) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ReactCorePublicKeyEntryPoint.class)).startIntentSenderForResult();
        int i4 = asBinder + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return publicKeyStartIntentSenderForResult;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<String, List<? extends String>> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        onWarmupCompleted(Object obj) {
            super(1, obj, hExternalSyntheticLambda9.class, "readAssetNames", "readAssetNames(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        public final List<String> IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            List<String> list = (List) hExternalSyntheticLambda9.onExtraCallback(1781482916, matches.onExtraCallback(), matches.onExtraCallback(), -1781482913, new Object[]{(hExternalSyntheticLambda9) ((CallableReference) this).receiver, str}, matches.onExtraCallback(), matches.onExtraCallback());
            int i4 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            List<String> listIAuthTabCallback = IAuthTabCallback((String) obj);
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return listIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // o.hExternalSyntheticLambda2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> getConstants() {
        String strOnExtraCallbackWithResult;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TossReactContentOwner tossReactContentOwnerAsInterface = asInterface();
        if (tossReactContentOwnerAsInterface == null || (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = tossReactContentOwnerAsInterface.onTransact()) == null) {
            strOnExtraCallbackWithResult = "";
        } else {
            int i4 = IAuthTabCallbackDefault + 81;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
            }
        }
        List<MaxAdViewImplExternalSyntheticLambda4> listOnWarmupCompleted = MaxAdViewImplExternalSyntheticLambda4.onWarmupCompleted.onWarmupCompleted(MaxAdViewImplExternalSyntheticLambda4.Companion, (String) null, new onWarmupCompleted(this), 1, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        int i6 = asBinder + 77;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        for (MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4 : listOnWarmupCompleted) {
            int i8 = IAuthTabCallbackDefault + 25;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            arrayList.add(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("id", maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("bundleURL", maxAdViewImplExternalSyntheticLambda4.onWarmupCompleted())}));
        }
        return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("bundleId", strOnExtraCallbackWithResult), getWrite.IAuthTabCallback("hadCrashed", Boolean.FALSE), getWrite.IAuthTabCallback("builtinBundles", arrayList), getWrite.IAuthTabCallback("distributionGroup", onTransact())});
    }

    private final List<String> IAuthTabCallback(String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            String[] list = this.onExtraCallbackWithResult.getAssets().list(str);
            if (list == null) {
                list = new String[0];
            }
            obj = Result.constructor-impl(ArraysKt.toList(list));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.onExtraCallback(obj)) {
            int i2 = IAuthTabCallbackDefault + 53;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            obj = listEmptyList;
        }
        List<String> list2 = (List) obj;
        int i4 = IAuthTabCallbackDefault + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return list2;
    }

    @Override // o.hExternalSyntheticLambda2
    @ReactMethod
    public void evaluateScript(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        onExtraCallback onextracallback = new onExtraCallback(CoroutineExceptionHandler.extraCallbackWithResult, this, str, promise);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallbackDefault != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallbackDefault, putChannelInfo.IAuthTabCallback().plus(onextracallback), (setRandomHost) null, new onNavigationEvent(str, this, promise, readableMap, (access13800) null), 2, (Object) null);
            int i2 = asBinder + 47;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = asBinder + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(File file, Response response) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte[] bArrAccess000;
        int i = 2 % 2;
        Object obj = null;
        String strHeader$default = Response.header$default(response, "X-Toss-Signature", (String) null, 2, (Object) null);
        if (strHeader$default == null) {
            int i2 = IAuthTabCallbackDefault + 71;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            strHeader$default = "";
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.Companion.onExtraCallback(strHeader$default);
        if (tTBaseLandingPageActivityOnExtraCallback != null) {
            int i4 = IAuthTabCallbackDefault + 107;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                tTBaseLandingPageActivityOnExtraCallback.access000();
                obj.hashCode();
                throw null;
            }
            bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback.access000();
            if (bArrAccess000 == null) {
                bArrAccess000 = new byte[0];
                int i5 = IAuthTabCallbackDefault + 111;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Signature signature = Signature.getInstance("SHA512withRSA");
        signature.initVerify(asBinder());
        signature.update(FilesKt.readBytes(file));
        return signature.verify(bArrAccess000);
    }

    @Override // o.hExternalSyntheticLambda2
    @ReactMethod
    public void prefetchScript(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult, this, str, promise);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallbackDefault != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallbackDefault, putChannelInfo.IAuthTabCallback().plus(iAuthTabCallback), (setRandomHost) null, new asBinder(str, readableMap, promise, null), 2, (Object) null);
        }
        int i2 = IAuthTabCallbackDefault + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ReadableMap $params;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(String str, ReadableMap readableMap, Promise promise, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$url = str;
            this.$params = readableMap;
            this.$promise = promise;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = hExternalSyntheticLambda9.this.new asBinder(this.$url, this.$params, this.$promise, access13800Var);
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return asbinderCreate.invokeSuspend(unit);
            }
            asbinderCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[PHI: r1 r5
          0x008f: PHI (r1v11 com.facebook.react.bridge.Promise) = (r1v10 com.facebook.react.bridge.Promise), (r1v16 com.facebook.react.bridge.Promise) binds: [B:19:0x008d, B:16:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008f: PHI (r5v2 o.hExternalSyntheticLambda9) = (r5v1 o.hExternalSyntheticLambda9), (r5v4 o.hExternalSyntheticLambda9) binds: [B:19:0x008d, B:16:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Promise promise;
            hExternalSyntheticLambda9 hexternalsyntheticlambda9;
            String strHeader$default;
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                hExternalSyntheticLambda9 hexternalsyntheticlambda92 = hExternalSyntheticLambda9.this;
                String str = this.$url;
                ReadableMap readableMap = this.$params;
                this.label = 1;
                if (hExternalSyntheticLambda9.onExtraCallbackWithResult(hexternalsyntheticlambda92, str, readableMap, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 1;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            Response response = (Response) ((HashMap) hExternalSyntheticLambda9.onExtraCallback(-990742605, matches.onExtraCallback(), matches.onExtraCallback(), 990742607, new Object[]{hExternalSyntheticLambda9.this}, matches.onExtraCallback(), matches.onExtraCallback())).get(this.$url);
            if (response == null) {
                throw new IllegalStateException();
            }
            int i7 = onExtraCallbackWithResult + 113;
            onExtraCallback = i7 % 128;
            String str2 = "";
            Object obj2 = null;
            if (i7 % 2 != 0) {
                promise = this.$promise;
                hexternalsyntheticlambda9 = hExternalSyntheticLambda9.this;
                strHeader$default = Response.header$default(response, "X-Toss-Deployment-Id", (String) null, 3, (Object) null);
                if (strHeader$default == null) {
                    strHeader$default = "";
                }
            } else {
                promise = this.$promise;
                hexternalsyntheticlambda9 = hExternalSyntheticLambda9.this;
                strHeader$default = Response.header$default(response, "X-Toss-Deployment-Id", (String) null, 2, (Object) null);
                if (strHeader$default == null) {
                }
            }
            String strHeader$default2 = Response.header$default(response, "X-Toss-Deployed-At", (String) null, 2, (Object) null);
            if (strHeader$default2 != null) {
                int i8 = onExtraCallback + 51;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 62 / 0;
                }
                str2 = strHeader$default2;
            }
            int iOnExtraCallback = matches.onExtraCallback();
            promise.resolve((ReadableMap) hExternalSyntheticLambda9.onExtraCallback(-1096288209, matches.onExtraCallback(), matches.onExtraCallback(), 1096288209, new Object[]{hexternalsyntheticlambda9, strHeader$default, str2}, iOnExtraCallback, matches.onExtraCallback()));
            Unit unit = Unit.INSTANCE;
            int i10 = onExtraCallbackWithResult + 47;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Response>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ReadableMap $params;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ hExternalSyntheticLambda9 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(ReadableMap readableMap, String str, hExternalSyntheticLambda9 hexternalsyntheticlambda9, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$params = readableMap;
            this.$url = str;
            this.this$0 = hexternalsyntheticlambda9;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$params, this.$url, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Response> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: Exception -> 0x00d3, PHI: r10
          0x0046: PHI (r10v9 com.facebook.react.bridge.ReadableMap) = (r10v8 com.facebook.react.bridge.ReadableMap), (r10v21 com.facebook.react.bridge.ReadableMap) binds: [B:13:0x0044, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00d3, blocks: (B:7:0x001b, B:15:0x0050, B:17:0x005c, B:18:0x0061, B:21:0x0076, B:22:0x007a, B:24:0x0086, B:25:0x008a, B:27:0x0096, B:30:0x00ab, B:34:0x00b4, B:36:0x00b8, B:38:0x00c4, B:42:0x00cd, B:43:0x00d0, B:14:0x0046, B:12:0x0034), top: B:49:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: Exception -> 0x00d3, PHI: r1 r10
          0x0050: PHI (r1v8 kotlin.reflect.KClass) = (r1v7 kotlin.reflect.KClass), (r1v16 kotlin.reflect.KClass) binds: [B:13:0x0044, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r10v11 com.facebook.react.bridge.ReadableMap) = (r10v8 com.facebook.react.bridge.ReadableMap), (r10v21 com.facebook.react.bridge.ReadableMap) binds: [B:13:0x0044, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00d3, blocks: (B:7:0x001b, B:15:0x0050, B:17:0x005c, B:18:0x0061, B:21:0x0076, B:22:0x007a, B:24:0x0086, B:25:0x008a, B:27:0x0096, B:30:0x00ab, B:34:0x00b4, B:36:0x00b8, B:38:0x00c4, B:42:0x00cd, B:43:0x00d0, B:14:0x0046, B:12:0x0034), top: B:49:0x0017 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ReadableMap readableMap;
            KClass orCreateKotlinClass;
            Boolean bool;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnNavigationEvent = null;
            ResultKt.onNavigationEvent(obj);
            try {
                if (i3 != 0) {
                    readableMap = this.$params;
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                    int i4 = 26 / 0;
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        boolOnNavigationEvent = access14000.onNavigationEvent(readableMap.getBoolean("cacheOnly"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        readableMap.getInt("cacheOnly");
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        int i5 = onNavigationEvent + 85;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        readableMap.getDouble("cacheOnly");
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        readableMap.getDouble("cacheOnly");
                    } else if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(ReadableArray.class))) {
                            int i7 = onExtraCallbackWithResult + 37;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            ReadableArray array = readableMap.getArray("cacheOnly");
                            if (!(array instanceof Boolean)) {
                                array = null;
                            }
                            bool = (Boolean) array;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(ReadableMap.class))) {
                            ReadableMap map = readableMap.getMap("cacheOnly");
                            if (!(map instanceof Boolean)) {
                                map = null;
                            }
                            bool = (Boolean) map;
                        }
                        boolOnNavigationEvent = bool;
                    } else {
                        readableMap.getString("cacheOnly");
                    }
                } else {
                    readableMap = this.$params;
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    }
                }
            } catch (Exception unused) {
            }
            Intrinsics.areEqual(boolOnNavigationEvent, access14000.onNavigationEvent(true));
            Response responseExecute = hExternalSyntheticLambda9.onNavigationEvent(this.this$0).newCall(new Request.Builder().url(this.$url).build()).execute();
            hExternalSyntheticLambda9 hexternalsyntheticlambda9 = this.this$0;
            ((HashMap) hExternalSyntheticLambda9.onExtraCallback(-990742605, matches.onExtraCallback(), matches.onExtraCallback(), 990742607, new Object[]{hexternalsyntheticlambda9}, matches.onExtraCallback(), matches.onExtraCallback())).put(this.$url, responseExecute);
            return responseExecute;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        hExternalSyntheticLambda9 hexternalsyntheticlambda9 = (hExternalSyntheticLambda9) objArr[0];
        String str = (String) objArr[1];
        ReadableMap readableMap = (ReadableMap) objArr[2];
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(readableMap, str, hexternalsyntheticlambda9, null), (access13800) objArr[3]);
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(Throwable th, String str) throws Throwable {
        int i = 2 % 2;
        if ((!(th instanceof CancellationException)) && !zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 58, 3}, true, null, objArr);
            ALCDetectionMode.IAuthTabCallback(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)));
            int i2 = IAuthTabCallbackDefault + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackDefault + 73;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final ReadableMap IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("deploymentId", str);
        writableNativeMap.putString("deployedAt", str2);
        int i2 = asBinder + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return writableNativeMap;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 35283), 34 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.getCapsMode("", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 61;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 65 - Color.green(0), 16717 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 49467), Color.green(0) + 70, (ViewConfiguration.getLongPressTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i12 = $11 + 55;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    public static final /* synthetic */ ReadableMap onNavigationEvent(hExternalSyntheticLambda9 hexternalsyntheticlambda9, String str, String str2) {
        int iOnExtraCallback = matches.onExtraCallback();
        return (ReadableMap) onExtraCallback(-1096288209, matches.onExtraCallback(), matches.onExtraCallback(), 1096288209, new Object[]{hexternalsyntheticlambda9, str, str2}, iOnExtraCallback, matches.onExtraCallback());
    }

    public static final /* synthetic */ HashMap IAuthTabCallback(hExternalSyntheticLambda9 hexternalsyntheticlambda9) {
        int iOnExtraCallback = matches.onExtraCallback();
        return (HashMap) onExtraCallback(-990742605, matches.onExtraCallback(), matches.onExtraCallback(), 990742607, new Object[]{hexternalsyntheticlambda9}, iOnExtraCallback, matches.onExtraCallback());
    }

    public static final /* synthetic */ List onExtraCallback(hExternalSyntheticLambda9 hexternalsyntheticlambda9, String str) {
        int iOnExtraCallback = matches.onExtraCallback();
        return (List) onExtraCallback(1781482916, matches.onExtraCallback(), matches.onExtraCallback(), -1781482913, new Object[]{hexternalsyntheticlambda9, str}, iOnExtraCallback, matches.onExtraCallback());
    }

    private final Object onWarmupCompleted(String str, ReadableMap readableMap, access13800<? super Response> access13800Var) {
        int iOnExtraCallback = matches.onExtraCallback();
        return onExtraCallback(-159179374, matches.onExtraCallback(), matches.onExtraCallback(), 159179375, new Object[]{this, str, readableMap, access13800Var}, iOnExtraCallback, matches.onExtraCallback());
    }

    private final okhttp3.OkHttpClient IAuthTabCallbackStub() {
        int iOnExtraCallback = matches.onExtraCallback();
        return (okhttp3.OkHttpClient) onExtraCallback(929378433, matches.onExtraCallback(), matches.onExtraCallback(), -929378429, new Object[]{this}, iOnExtraCallback, matches.onExtraCallback());
    }
}
