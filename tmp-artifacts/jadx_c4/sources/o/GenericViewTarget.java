package o;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.components.tuba.variable.v2.RequestVarsV2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AUTextView;
import o.GenericViewTarget;
import o.adInfo;
import o.setCompositionTask;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GenericViewTarget implements Interceptor {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static char[] asBinder = null;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static final String onExtraCallback;
    private static final wie2 onNavigationEvent;
    private static int onTransact = 1;
    private static final String onWarmupCompleted;
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.TubaVariableV2Interceptor$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setCompositionTask setcompositiontaskOnExtraCallback = GenericViewTarget.onExtraCallback();
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return setcompositiontaskOnExtraCallback;
        }
    });

    public static /* synthetic */ setCompositionTask onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setCompositionTask setcompositiontaskOnNavigationEvent = onNavigationEvent();
        int i4 = onTransact + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return setcompositiontaskOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(adinfo);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(adinfo);
        int i3 = asInterface + 109;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return unitOnNavigationEvent;
    }

    private final setCompositionTask onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        setCompositionTask setcompositiontask = (setCompositionTask) this.onExtraCallbackWithResult.getValue();
        int i3 = asInterface + 31;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return setcompositiontask;
        }
        obj.hashCode();
        throw null;
    }

    private static final setCompositionTask onNavigationEvent() {
        setCompositionTask setcompositiontaskOnActivityLayout;
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            setcompositiontaskOnActivityLayout = ((ServiceLoaderComponentRegistryExternalSyntheticLambda1) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda1.class)).onActivityLayout();
            int i3 = 92 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            setcompositiontaskOnActivityLayout = ((ServiceLoaderComponentRegistryExternalSyntheticLambda1) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda1.class)).onActivityLayout();
        }
        int i4 = asInterface + 49;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return setcompositiontaskOnActivityLayout;
        }
        throw null;
    }

    public okhttp3.Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        String[] strArrIAuthTabCallback;
        Object objCreate;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        RequestVarsV2 requestVarsV2OnWarmupCompleted = onWarmupCompleted(request);
        if (requestVarsV2OnWarmupCompleted != null) {
            int i2 = onTransact + 49;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                requestVarsV2OnWarmupCompleted.IAuthTabCallback();
                throw null;
            }
            strArrIAuthTabCallback = requestVarsV2OnWarmupCompleted.IAuthTabCallback();
        } else {
            strArrIAuthTabCallback = null;
        }
        if (strArrIAuthTabCallback != null) {
            int i3 = asInterface + 27;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int length = strArrIAuthTabCallback.length;
                throw null;
            }
            if (!(strArrIAuthTabCallback.length == 0)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length2 = strArrIAuthTabCallback.length;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = asInterface + 115;
                    onTransact = i5 % 128;
                    if (i5 % 2 == 0) {
                        onExtraCallbackWithResult().onExtraCallback(strArrIAuthTabCallback[i4]);
                        throw null;
                    }
                    String str = strArrIAuthTabCallback[i4];
                    if (onExtraCallbackWithResult().onExtraCallback(str) != null) {
                        arrayList.add(str);
                        int i6 = asInterface + 17;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        arrayList2.add(str);
                    }
                    i4++;
                    int i8 = asInterface + 43;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List<String> list = (List) pair.onExtraCallbackWithResult();
                List list2 = (List) pair.IAuthTabCallback();
                Request.Builder builderNewBuilder = request.newBuilder();
                Object[] objArr = new Object[1];
                a(new char[]{'\f', 20, 3, 23, 13839, 13839, 23, 24, '\t', 23, 22, 23, 1, 22, 7, 14}, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38), 15 - TextUtils.lastIndexOf("", '0'), objArr);
                Object[] objArr2 = new Object[1];
                a(new char[]{13806}, (byte) (56 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), -((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
                okhttp3.Response responseProceed = chain.proceed(builderNewBuilder.header(((String) objArr[0]).intern(), CollectionsKt.joinToString$default(list2, ((String) objArr2[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)).build());
                MediaType mediaTypeContentType = responseProceed.body().contentType();
                String strString = responseProceed.body().string();
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    objCreate = kotlin.Result.constructor-impl(onExtraCallbackWithResult(strString, list, mediaTypeContentType));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    objCreate = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(objCreate);
                if (th2 != null) {
                    int i10 = onTransact + 25;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a(new char[]{3, '\r', 20, 22, 1, 22, 6, 4, 22, 20, 11, 21, 3, 4, 5, 17, 6, 15, 5, 4, 21, 16, '\b', 15, 13858}, (byte) (58 - Color.blue(0)), View.combineMeasuredStates(0, 0) + 25, objArr3);
                    convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr3[0]).intern(), th2);
                    objCreate = ResponseBody.Companion.create(strString, mediaTypeContentType);
                }
                okhttp3.Response responseBuild = responseProceed.newBuilder().body((ResponseBody) objCreate).build();
                int i12 = onTransact + 55;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                return responseBuild;
            }
        }
        return chain.proceed(request);
    }

    private final ResponseBody onExtraCallbackWithResult(String str, List<String> list, MediaType mediaType) throws Throwable {
        int i = 2 % 2;
        wie2 wie2Var = onNavigationEvent;
        wie2Var.onExtraCallback();
        JsonObject jsonObject = (JsonObject) wie2Var.onExtraCallback(JsonObject.Companion.serializer(), str);
        Object[] objArr = new Object[1];
        a(new char[]{6, '\t', 20, 22, 1, 22, 7, 14}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 27), TextUtils.indexOf("", "", 0, 0) + 8, objArr);
        Object obj = jsonObject.get(((String) objArr[0]).intern());
        JsonObject jsonObject2 = obj instanceof JsonObject ? (JsonObject) obj : null;
        if (jsonObject2 != null) {
            int i2 = asInterface + 73;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(jsonObject2);
                int i3 = 11 / 0;
            } else {
                onExtraCallbackWithResult(jsonObject2);
            }
        } else {
            jsonObject2 = null;
        }
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        List<String> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj2 : list2) {
            int i4 = onTransact + 39;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            linkedHashMap.put(obj2, onExtraCallbackWithResult().onExtraCallback((String) obj2));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getValue()) != null) {
                int i6 = onTransact + 11;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            pangleEncryptManager.onExtraCallbackWithResult((String) entry2.getKey(), initRenderFinish.onNavigationEvent((String) entry2.getValue()));
        }
        if (jsonObject2 != null) {
            int i8 = onTransact + 45;
            asInterface = i8 % 128;
            if (i8 % 2 != 0) {
                jsonObject2.entrySet().iterator();
                throw null;
            }
            for (Map.Entry entry3 : jsonObject2.entrySet()) {
                pangleEncryptManager.onExtraCallbackWithResult((String) entry3.getKey(), (JsonElement) entry3.getValue());
            }
        }
        JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager.onExtraCallbackWithResult();
        ResponseBody.Companion companion = ResponseBody.Companion;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(jsonObject);
        Object[] objArr2 = new Object[1];
        a(new char[]{6, '\t', 20, 22, 1, 22, 7, 14}, (byte) (27 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.getTrimmedLength("") + 8, objArr2);
        mapOnWarmupCompleted.put(((String) objArr2[0]).intern(), jsonObjectOnExtraCallbackWithResult);
        wie2 wie2Var2 = onNavigationEvent;
        wie2Var2.onExtraCallback();
        return companion.create(wie2Var2.onWarmupCompleted(new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, JsonElement.Companion.serializer()), mapOnWarmupCompleted), mediaType);
    }

    private final void onExtraCallbackWithResult(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        int i = 2 % 2;
        if (jsonObject != null) {
            for (Map.Entry entry : jsonObject.entrySet()) {
                String str = (String) entry.getKey();
                JsonPrimitive jsonPrimitive2 = (JsonElement) entry.getValue();
                String strOnNavigationEvent = null;
                if (jsonPrimitive2 instanceof JsonPrimitive) {
                    int i2 = asInterface + 83;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    jsonPrimitive = jsonPrimitive2;
                } else {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null) {
                    int i3 = onTransact + 119;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        initRenderFinish.onNavigationEvent(jsonPrimitive);
                        throw null;
                    }
                    strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive);
                }
                if (strOnNavigationEvent != null) {
                    int i4 = asInterface + 21;
                    onTransact = i4 % 128;
                    if (i4 % 2 == 0) {
                        onExtraCallbackWithResult().onExtraCallback(str, strOnNavigationEvent);
                        int i5 = 90 / 0;
                    } else {
                        onExtraCallbackWithResult().onExtraCallback(str, strOnNavigationEvent);
                    }
                }
            }
        }
    }

    private final RequestVarsV2 onWarmupCompleted(Request request) {
        int i = 2 % 2;
        getSignatureAlgorithm getsignaturealgorithm = (getSignatureAlgorithm) request.tag(getSignatureAlgorithm.class);
        Object obj = null;
        if (getsignaturealgorithm != null) {
            int i2 = onTransact + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Method methodOnExtraCallback = getsignaturealgorithm.onExtraCallback();
            if (methodOnExtraCallback != null) {
                int i4 = asInterface + 65;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                Annotation annotation = methodOnExtraCallback.getAnnotation(RequestVarsV2.class);
                if (i5 != 0) {
                    return (RequestVarsV2) annotation;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{'\f', 20, 3, 23, 13839, 13839, 23, 24, '\t', 23, 22, 23, 1, 22, 7, 14}, (byte) (38 - View.MeasureSpec.getSize(0)), 16 - View.MeasureSpec.getSize(0), objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{6, '\t', 20, 22, 1, 22, 7, 14}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26), 8 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{3, '\r', 20, 22, 1, 22, 6, 4, 22, 20, 11, 21, 3, 4, 5, 17, 6, 15, 5, 4, 21, 16, '\b', 15, 13858}, (byte) (58 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 25 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        IAuthTabCallback = ((String) objArr3[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.components.tuba.variable.v2.TubaVariableV2Interceptor$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = GenericViewTarget.onWarmupCompleted((adInfo) obj);
                int i4 = IAuthTabCallback + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 46 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, 1, (Object) null);
        int i = getInterfaceDescriptor + 31;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.onNavigationEvent(false);
        hfzb hfzbVar = new hfzb();
        hfzbVar.IAuthTabCallback(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), GetMotionInteractionState.onExtraCallback));
        adinfo.onNavigationEvent(hfzbVar.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = asBinder;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 26 - TextUtils.getCapsMode("", 0, 0), 23138 - ((byte) KeyEvent.getModifierMetaStateMask()), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        char c = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 26 - TextUtils.getOffsetAfter("", 0), 23138 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 117;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.getSize(0)), 'z' - AndroidCharacter.getMirror(c), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 19488 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i6 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i6];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i7 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i7];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                            } else {
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = $11 + 19;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c = '0';
            }
        }
        int i12 = $11 + 21;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        asBinder = new char[]{64976, 64986, 64997, 64897, 64927, 64967, 64991, 65018, 64966, 64961, 65003, 64963, 64960, 64983, 64981, 64989, 64982, 64980, 64988, 64979, 65065, 64978, 64926, 64999, 64977};
        IAuthTabCallbackStub = (char) 51244;
    }
}
