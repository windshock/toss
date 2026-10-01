package run.granite.image;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CertToolkitMgrRevokeReason;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.getKey7;
import o.transGetSignCert;
import o.utilBinToHexString;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.imgproc.Imgproc;
import run.granite.image.GraniteImageModule$;

@ReactModule(IAuthTabCallback = "GraniteImageModule")
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteImageModule extends ReactContextBaseJavaModule {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    public static final String NAME = "GraniteImageModule";
    private static final String TAG = "GraniteImageModule";
    private static int asBinder;
    private static short[] onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final ExecutorService executor;
    private final Function0<getKey7> providerResolver;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = Imgproc.COLOR_RGB2YUV_YVYU;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = s * 2;
        int i4 = 3 - (s2 * 3);
        int i5 = 115 - (i * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i5 = i3;
            i5 += i6;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i5 += i6;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ getKey7 $r8$lambda$6PF4JPjPSvj3XMNNHYFDNXyssns() {
        getKey7 getkey7_init_$lambda$0;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            getkey7_init_$lambda$0 = _init_$lambda$0();
            int i3 = 8 / 0;
        } else {
            getkey7_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = asInterface + 65;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return getkey7_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$7aWNL0SmdATWofWKE7BQdp_Q8Z4(onExtraCallbackWithResult onextracallbackwithresult, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, GraniteImageModule graniteImageModule, AtomicInteger atomicInteger3, int i, Promise promise, boolean z, int i2, int i3, String str) {
        int i4 = 2 % 2;
        int i5 = asInterface + 45;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unitPreloadSingle$lambda$0 = preloadSingle$lambda$0(onextracallbackwithresult, atomicInteger, atomicInteger2, graniteImageModule, atomicInteger3, i, promise, z, i2, i3, str);
        int i7 = asInterface + 97;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unitPreloadSingle$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$JoJi6WOtMK32PP7JNkdHVL5RPg0(String str, Promise promise, GraniteImageModule graniteImageModule, getKey7 getkey7) throws JSONException {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        preload$lambda$0(str, promise, graniteImageModule, getkey7);
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    static {
        asBinder = 1;
        onExtraCallback();
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallbackStub + 47;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraniteImageModule(@NotNull ReactApplicationContext reactApplicationContext, @NotNull Function0<? extends getKey7> function0, @NotNull ExecutorService executorService) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        this.providerResolver = function0;
        this.executor = executorService;
    }

    public /* synthetic */ GraniteImageModule(ReactApplicationContext reactApplicationContext, Function0 function0, ExecutorService executorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: run.granite.image.GraniteImageModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GraniteImageModule.$r8$lambda$6PF4JPjPSvj3XMNNHYFDNXyssns();
                }
            };
            int i2 = asInterface + 73;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            int i4 = onTransact + 51;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            executorService = Executors.newFixedThreadPool(4);
            Intrinsics.checkNotNullExpressionValue(executorService, "");
            int i6 = onTransact + 111;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            } else {
                int i8 = 2 % 2;
            }
        }
        this(reactApplicationContext, function0, executorService);
    }

    private static final getKey7 _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getKey7 getkey7IAuthTabCallback = CertToolkitMgrRevokeReason.onExtraCallback.IAuthTabCallback();
        int i4 = asInterface + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return getkey7IAuthTabCallback;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return "GraniteImageModule";
    }

    @ReactMethod
    public final void preload(@NotNull String str, @NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(promise, "");
        getKey7 getkey7Invoke = this.providerResolver.invoke();
        if (getkey7Invoke != null) {
            this.executor.execute(new GraniteImageModule$.ExternalSyntheticLambda1(str, promise, this, getkey7Invoke));
            int i2 = asInterface + 29;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = asInterface + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        promise.reject("NO_PROVIDER", "No provider registered, cannot preload");
        int i6 = onTransact + 39;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void preload$lambda$0(String str, Promise promise, GraniteImageModule graniteImageModule, getKey7 getkey7) throws JSONException {
        int i = 2 % 2;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 0) {
                int i2 = asInterface + 27;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                promise.resolve((Object) null);
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = new AtomicInteger(0);
            AtomicInteger atomicInteger3 = new AtomicInteger(0);
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                graniteImageModule.preloadSingle(getkey7, graniteImageModule.parsePreloadSource(jSONObject), atomicInteger, atomicInteger2, atomicInteger3, length, promise);
            }
            int i5 = onTransact + 83;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            e.getMessage();
            promise.reject("PARSE_ERROR", "Failed to parse sources JSON: " + e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r20.onWarmupCompleted();
        r19.onExtraCallback(r20.onWarmupCompleted(), null, "cover", r20.onNavigationEvent(), r20.onExtraCallback(), r20.IAuthTabCallback(), null, new run.granite.image.GraniteImageModule$.ExternalSyntheticLambda2(r20, r22, r23, r18, r21, r24, r25));
        r1 = run.granite.image.GraniteImageModule.asInterface + 1;
        run.granite.image.GraniteImageModule.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r20.onWarmupCompleted().length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r20.onWarmupCompleted().length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        checkPreloadCompletion(r21, r22, r23, r24, r25);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void preloadSingle(getKey7 getkey7, onExtraCallbackWithResult onextracallbackwithresult, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, int i, Promise promise) {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
    }

    private static final Unit preloadSingle$lambda$0(onExtraCallbackWithResult onextracallbackwithresult, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, GraniteImageModule graniteImageModule, AtomicInteger atomicInteger3, int i, Promise promise, boolean z, int i2, int i3, String str) {
        int i4 = 2 % 2;
        int i5 = asInterface + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        if (z) {
            onextracallbackwithresult.onWarmupCompleted();
            atomicInteger.incrementAndGet();
            int i7 = asInterface + 51;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        } else {
            onextracallbackwithresult.onWarmupCompleted();
            atomicInteger2.incrementAndGet();
        }
        graniteImageModule.checkPreloadCompletion(atomicInteger3, atomicInteger, atomicInteger2, i, promise);
        return Unit.INSTANCE;
    }

    private final void checkPreloadCompletion(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, int i, Promise promise) {
        int i2 = 2 % 2;
        int i3 = onTransact + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (atomicInteger.incrementAndGet() == i) {
            atomicInteger2.get();
            atomicInteger3.get();
            promise.resolve((Object) null);
            int i5 = asInterface + 79;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final onExtraCallbackWithResult parsePreloadSource(JSONObject jSONObject) throws Throwable {
        transGetSignCert transgetsigncert;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((short) Color.alpha(0), (byte) ((-42) - ExpandableListView.getPackedPositionType(0L)), 288802703 - ExpandableListView.getPackedPositionChild(0L), (-175156003) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-48) - KeyEvent.getDeadChar(0, 0), objArr);
        String strOptString = jSONObject.optString(((String) objArr[0]).intern(), _UrlKt.FRAGMENT_ENCODE_SET);
        Object[] objArr2 = new Object[1];
        a((short) View.MeasureSpec.getMode(0), (byte) (35 - ExpandableListView.getPackedPositionChild(0L)), 288802706 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), View.resolveSize(0, 0) - 175156016, Color.blue(0) - 48, objArr2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(((String) objArr2[0]).intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            int i2 = onTransact + 113;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObjectOptJSONObject.getString(next));
            }
        }
        Object[] objArr3 = new Object[1];
        a((short) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (byte) (118 - Gravity.getAbsoluteGravity(0, 0)), 288802714 - (ViewConfiguration.getEdgeSlop() >> 16), (-175156007) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 47, objArr3);
        utilBinToHexString utilbintohexstringOnExtraCallbackWithResult = utilBinToHexString.Companion.onExtraCallbackWithResult(jSONObject.optString(((String) objArr3[0]).intern(), "normal"));
        String strOptString2 = jSONObject.optString("cache", _UrlKt.FRAGMENT_ENCODE_SET);
        Object obj = null;
        if (Intrinsics.areEqual(strOptString2, "cacheOnly") || !Intrinsics.areEqual(strOptString2, "web")) {
            transgetsigncert = transGetSignCert.DISK;
        } else {
            int i4 = asInterface + 57;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                transGetSignCert transgetsigncert2 = transGetSignCert.NONE;
                obj.hashCode();
                throw null;
            }
            transgetsigncert = transGetSignCert.NONE;
        }
        Intrinsics.checkNotNull(strOptString);
        if (!(true ^ linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(strOptString, linkedHashMap, utilbintohexstringOnExtraCallbackWithResult, transgetsigncert);
        int i5 = asInterface + 63;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return onextracallbackwithresult;
    }

    @ReactMethod
    public final void clearMemoryCache(@NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(promise, "");
            this.providerResolver.invoke();
            Intrinsics.checkNotNullExpressionValue(getReactApplicationContext(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(promise, "");
        getKey7 getkey7Invoke = this.providerResolver.invoke();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "");
        if (getkey7Invoke != null) {
            int i3 = onTransact + 25;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                getkey7Invoke.onExtraCallbackWithResult(reactApplicationContext);
                int i4 = 52 / 0;
            } else {
                getkey7Invoke.onExtraCallbackWithResult(reactApplicationContext);
            }
        }
        promise.resolve((Object) null);
        int i5 = onTransact + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactMethod
    public final void clearDiskCache(@NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        getKey7 getkey7Invoke = this.providerResolver.invoke();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "");
        if (getkey7Invoke != null) {
            int i4 = onTransact + 39;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            getkey7Invoke.onExtraCallback(reactApplicationContext);
            int i6 = asInterface + 35;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        promise.resolve((Object) null);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 67;
                $10 = i6 % 128;
                i4 = i6 % 2 != 0 ? 0 : 1;
            }
            if (i4 != 0) {
                byte[] bArr2 = onExtraCallbackWithResult;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 12843);
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 55;
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 2168;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, longPressTimeout, packedPositionChild, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, 22439 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), Color.rgb(0, 0, 0) + 16777302, (ViewConfiguration.getLongPressTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallbackWithResult;
                if (bArr5 != null) {
                    int i8 = $11 + 73;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i9 = 0; i9 < length; i9++) {
                        bArr[i9] = (byte) (bArr5[i9] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i10 = $11 + 33;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i12 = $11 + 89;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = 1250877560;
        IAuthTabCallback = -1538795481;
        onNavigationEvent = -1372097648;
        onExtraCallbackWithResult = new byte[]{-36, 41, 35, -48, 45, 33, 45, 47, -48, -47, -47, 123, 117, -119, 125, 120, -119, 124};
    }
}
