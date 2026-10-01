package o;

import com.google.android.gms.internal.ads.zzgc;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.onResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onResponse {
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static int asBinder = 1;
    private static ALCFaceSDK2 asInterface;
    private static Function0<? extends ALCFaceSDK4ExternalSyntheticLambda1> onExtraCallback;
    private static ALCFaceSDK4ExternalSyntheticLambda1 onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static final AppSetIdAndScope1 onTransact;
    public static final onResponse onWarmupCompleted;

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            zBooleanValue = ((Boolean) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1264870653, new Object[]{function1, obj}, -1264870652, iOnExtraCallbackWithResult2)).booleanValue();
            int i3 = 7 / 0;
        } else {
            int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
            zBooleanValue = ((Boolean) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, 1264870653, new Object[]{function1, obj}, -1264870652, iOnExtraCallbackWithResult5)).booleanValue();
        }
        int i4 = IAuthTabCallbackDefault + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(byte b) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Byte.valueOf(b)};
        if (i3 == 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            return (CharSequence) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), -1562799086, objArr, 1562799089, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i11 = ~i2;
        int i12 = (~(i11 | i8 | i5)) | (~(i7 | i11 | i4));
        int i13 = i5 + i4 + i6 + ((-195996979) * i3) + ((-904719387) * i);
        int i14 = i13 * i13;
        int i15 = (i5 * 1886715248) + 940376064 + (1886715248 * i4) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i6) + ((-1389494272) * i3) + (1623064576 * i) + (1510801408 * i14);
        int i16 = (i5 * 1590984816) + 1398186415 + (i4 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i6 * 1590985553) + (i3 * (-1025631779)) + (i * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        JsonObject jsonObject = (JsonObject) objArr[0];
        String str = (String) objArr[1];
        Map.Entry entry = (Map.Entry) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(jsonObject, str, entry);
        int i4 = asBinder + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private onResponse() {
    }

    static {
        onResponse onresponse = new onResponse();
        onWarmupCompleted = onresponse;
        String simpleName = onresponse.getClass().getSimpleName();
        onNavigationEvent = simpleName;
        onTransact = ea10.onExtraCallbackWithResult(simpleName);
        int i = access000 + 1;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = IAuthTabCallback;
        int i5 = i3 + 55;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return z;
    }

    public final void onExtraCallbackWithResult(@NotNull ALCFaceSDK2 aLCFaceSDK2, @NotNull ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1, @NotNull Function0<? extends ALCFaceSDK4ExternalSyntheticLambda1> function0) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceSDK2, "");
        Intrinsics.checkNotNullParameter(aLCFaceSDK4ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        asInterface = aLCFaceSDK2;
        onExtraCallbackWithResult = aLCFaceSDK4ExternalSyntheticLambda1;
        onExtraCallback = function0;
        IAuthTabCallback = true;
        int i4 = asBinder + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aLCFaceSDK4ExternalSyntheticLambda1 = null;
        }
        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = asBinder + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aLCFaceSDK4ExternalSyntheticLambda1 = null;
        }
        String str = (String) aLCFaceSDK4ExternalSyntheticLambda1.onNavigationEvent("__CDN_ETAG__", String.class, null);
        int i3 = IAuthTabCallbackDefault + 73;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda1 == null) {
            int i2 = asBinder + 33;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asBinder + 41;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            aLCFaceSDK4ExternalSyntheticLambda1 = null;
        }
        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback("__CDN_ETAG__", str);
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = null;
        if (str == null) {
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda12 = onExtraCallbackWithResult;
            if (aLCFaceSDK4ExternalSyntheticLambda12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i2 = asBinder + 53;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
            } else {
                aLCFaceSDK4ExternalSyntheticLambda1 = aLCFaceSDK4ExternalSyntheticLambda12;
            }
            aLCFaceSDK4ExternalSyntheticLambda1.onExtraCallbackWithResult("__OVERLAY_DIGEST__");
            return;
        }
        int i4 = asBinder + 29;
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda13 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            int i6 = i5 + 45;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            aLCFaceSDK4ExternalSyntheticLambda1 = aLCFaceSDK4ExternalSyntheticLambda13;
        }
        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback("__OVERLAY_DIGEST__", str);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 31;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda1 == null) {
            int i4 = i2 + 83;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            aLCFaceSDK4ExternalSyntheticLambda1 = null;
        }
        String str = (String) aLCFaceSDK4ExternalSyntheticLambda1.onNavigationEvent("__OVERLAY_DIGEST__", String.class, null);
        int i6 = asBinder + 83;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final JsonElement IAuthTabCallback(@NotNull String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (IAuthTabCallback) {
            Function0<? extends ALCFaceSDK4ExternalSyntheticLambda1> function0 = onExtraCallback;
            if (function0 == null) {
                int i3 = asBinder + 33;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                function0 = null;
            }
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = (ALCFaceSDK4ExternalSyntheticLambda1) function0.invoke();
            if (aLCFaceSDK4ExternalSyntheticLambda1 != null) {
                int i4 = asBinder + 81;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str);
                    obj2.hashCode();
                    throw null;
                }
                if (aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str)) {
                    try {
                        Result.Companion companion = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(onExtraCallbackWithResult(aLCFaceSDK4ExternalSyntheticLambda1, str));
                    } catch (Throwable th) {
                        Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (kotlin.Result.onExtraCallback(obj)) {
                        int i5 = IAuthTabCallbackDefault + 61;
                        asBinder = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        obj2 = obj;
                    }
                    JsonElement jsonElement = (JsonElement) obj2;
                    if (jsonElement != null) {
                        return jsonElement;
                    }
                }
            }
        }
        return ALCAntiSpoofingFaceQuality.onExtraCallback.onWarmupCompleted(str);
    }

    private final JsonElement onExtraCallbackWithResult(ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1, String str) {
        int i = 2 % 2;
        ALCFaceSDK2 aLCFaceSDK2 = asInterface;
        if (aLCFaceSDK2 == null) {
            int i2 = IAuthTabCallbackDefault + 59;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IAuthTabCallbackDefault + 43;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            aLCFaceSDK2 = null;
        }
        Object obj = aLCFaceSDK2.onWarmupCompleted().get(str);
        if (obj != null) {
            return ALCFaceSDK5.onExtraCallback(aLCFaceSDK4ExternalSyntheticLambda1, str, obj);
        }
        String str2 = (String) aLCFaceSDK4ExternalSyntheticLambda1.onNavigationEvent(str, String.class, null);
        if (str2 != null) {
            return startSDK.onNavigationEvent(str2);
        }
        return null;
    }

    public final List<ALCFaceSDK4ExternalSyntheticLambda1> onWarmupCompleted(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!IAuthTabCallback) {
            throw new IllegalStateException("Check failed.");
        }
        ArrayList arrayList = new ArrayList();
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = null;
        if (z2) {
            Function0<? extends ALCFaceSDK4ExternalSyntheticLambda1> function0 = onExtraCallback;
            if (function0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                function0 = null;
            }
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda12 = (ALCFaceSDK4ExternalSyntheticLambda1) function0.invoke();
            if (aLCFaceSDK4ExternalSyntheticLambda12 != null) {
                arrayList.add(aLCFaceSDK4ExternalSyntheticLambda12);
            }
        }
        if (z) {
            int i4 = IAuthTabCallbackDefault;
            int i5 = i4 + 81;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda13 = onExtraCallbackWithResult;
            if (aLCFaceSDK4ExternalSyntheticLambda13 == null) {
                int i7 = i4 + 65;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                aLCFaceSDK4ExternalSyntheticLambda1 = aLCFaceSDK4ExternalSyntheticLambda13;
            }
            arrayList.add(aLCFaceSDK4ExternalSyntheticLambda1);
        }
        return arrayList;
    }

    private final int onWarmupCompleted(final JsonObject jsonObject, final String str) {
        int i = 2 % 2;
        Objects.toString(jsonObject);
        if (!IAuthTabCallback) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = asBinder + 113;
        IAuthTabCallbackDefault = i2 % 128;
        ALCFaceSDK2 aLCFaceSDK2 = null;
        if (i2 % 2 == 0) {
            System.currentTimeMillis();
            ALCFaceSDK2 aLCFaceSDK22 = asInterface;
            if (aLCFaceSDK22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                aLCFaceSDK2 = aLCFaceSDK22;
            }
            Stream<Map.Entry<String, Object>> streamParallelStream = aLCFaceSDK2.onWarmupCompleted().entrySet().parallelStream();
            final Function1 function1 = new Function1() { // from class: im.toss.core.tuba.TubaVarsV1Manager$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 17;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    JsonObject jsonObject2 = jsonObject;
                    if (i5 != 0) {
                        Object[] objArr = {jsonObject2, str, (Map.Entry) obj};
                        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                        return Boolean.valueOf(((Boolean) onResponse.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), -1025395943, objArr, 1025395945, iOnExtraCallbackWithResult2)).booleanValue());
                    }
                    Object[] objArr2 = {jsonObject2, str, (Map.Entry) obj};
                    int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
                    Boolean.valueOf(((Boolean) onResponse.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, JsParamKeys.onExtraCallbackWithResult(), -1025395943, objArr2, 1025395945, iOnExtraCallbackWithResult4)).booleanValue());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            int iCount = (int) streamParallelStream.filter(new Predicate() { // from class: im.toss.core.tuba.TubaVarsV1Manager$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted + 15;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    boolean zIAuthTabCallback = onResponse.IAuthTabCallback(function1, obj);
                    int i6 = onWarmupCompleted + 33;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return zIAuthTabCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }).count();
            System.currentTimeMillis();
            jsonObject.size();
            int i3 = IAuthTabCallbackDefault + 97;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return iCount;
        }
        System.currentTimeMillis();
        throw null;
    }

    private static final boolean onNavigationEvent(JsonObject jsonObject, String str, String str2, Object obj) {
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1;
        int i = 2 % 2;
        JsonElement jsonElement = (JsonElement) jsonObject.get(str2);
        Object obj2 = null;
        if (jsonElement == null) {
            int i2 = IAuthTabCallbackDefault + 43;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        onResponse onresponse = onWarmupCompleted;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda12 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda12 == null) {
            int i3 = asBinder + 87;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 != 0) {
                throw null;
            }
            aLCFaceSDK4ExternalSyntheticLambda1 = null;
        } else {
            aLCFaceSDK4ExternalSyntheticLambda1 = aLCFaceSDK4ExternalSyntheticLambda12;
        }
        return onresponse.onExtraCallbackWithResult(str2, aLCFaceSDK4ExternalSyntheticLambda1, obj, jsonElement, str);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private static final boolean onExtraCallback(JsonObject jsonObject, String str, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(jsonObject, str, (String) entry.getKey(), entry.getValue());
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(jsonObject, str, (String) entry.getKey(), entry.getValue());
        int i3 = IAuthTabCallbackDefault + 41;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
        return zOnNavigationEvent;
    }

    private final JsonObject onNavigationEvent(JsonObject jsonObject, JsonObject jsonObject2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(jsonObject);
            for (Map.Entry entry : jsonObject2.entrySet()) {
                mapOnWarmupCompleted.put((String) entry.getKey(), (JsonElement) entry.getValue());
                int i3 = asBinder + 121;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            }
            return new JsonObject(mapOnWarmupCompleted);
        }
        access8100.onWarmupCompleted(jsonObject);
        jsonObject2.entrySet().iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject, "");
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = onExtraCallbackWithResult;
        if (aLCFaceSDK4ExternalSyntheticLambda1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = asBinder + 57;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            aLCFaceSDK4ExternalSyntheticLambda1 = null;
        }
        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback();
        onWarmupCompleted(jsonObject, "unified");
        ALCAntiSpoofingFaceQuality.onExtraCallback.onExtraCallback(jsonObject);
        int i5 = IAuthTabCallbackDefault + 79;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        byte bByteValue = ((Byte) objArr[0]).byteValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bByteValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = IAuthTabCallbackDefault + 9;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    public final String onExtraCallback(@NotNull JsonObject jsonObject) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        try {
            Result.Companion companion = kotlin.Result.Companion;
            String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.sorted(jsonObject.keySet()), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = strJoinToString$default.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
            obj = kotlin.Result.constructor-impl(ArraysKt.joinToString$default(bArrDigest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.core.tuba.TubaVarsV1Manager$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 97;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    byte bByteValue = ((Byte) obj2).byteValue();
                    if (i4 != 0) {
                        onResponse.onWarmupCompleted(bByteValue);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    CharSequence charSequenceOnWarmupCompleted = onResponse.onWarmupCompleted(bByteValue);
                    int i5 = onExtraCallback + 111;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return charSequenceOnWarmupCompleted;
                }
            }, 30, (Object) null));
            int i2 = IAuthTabCallbackDefault + 77;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = IAuthTabCallbackDefault + 53;
            asBinder = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            obj = null;
        }
        return (String) obj;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable JsonObject jsonObject, @NotNull JsonObject jsonObject2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject2, "");
        if (jsonObject != null) {
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda12 = onExtraCallbackWithResult;
            if (aLCFaceSDK4ExternalSyntheticLambda12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aLCFaceSDK4ExternalSyntheticLambda12 = null;
            }
            aLCFaceSDK4ExternalSyntheticLambda12.IAuthTabCallback();
            onWarmupCompleted(jsonObject, "cdn");
            onWarmupCompleted(str);
            onExtraCallbackWithResult(onExtraCallback(jsonObject2));
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda13 = onExtraCallbackWithResult;
            if (aLCFaceSDK4ExternalSyntheticLambda13 == null) {
                int i3 = IAuthTabCallbackDefault + 27;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = 67 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                int i5 = IAuthTabCallbackDefault + 69;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            } else {
                aLCFaceSDK4ExternalSyntheticLambda1 = aLCFaceSDK4ExternalSyntheticLambda13;
            }
            aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback("__CDN_ETAG__", str);
        }
        onWarmupCompleted(jsonObject2, "overlay");
        if (jsonObject == null) {
            ALCAntiSpoofingFaceQuality.onExtraCallback.onExtraCallbackWithResult(jsonObject2);
        } else {
            ALCAntiSpoofingFaceQuality.onExtraCallback.onExtraCallback(onNavigationEvent(jsonObject, jsonObject2));
        }
    }

    private final boolean onExtraCallbackWithResult(String str, ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1, Object obj, JsonElement jsonElement, String str2) throws Throwable {
        int i = 2 % 2;
        if (jsonElement instanceof JsonNull) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str3 = onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, str3, "null value received for key=" + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            aLCFaceSDK4ExternalSyntheticLambda1.onExtraCallbackWithResult(str);
            return true;
        }
        if (jsonElement instanceof JsonPrimitive) {
            int i2 = asBinder + 17;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            JsonPrimitive jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement);
            initRenderFinish.onNavigationEvent(jsonPrimitiveOnNavigationEvent);
            if (!(!jsonPrimitiveOnNavigationEvent.onExtraCallbackWithResult())) {
                int i4 = IAuthTabCallbackDefault + 63;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (obj instanceof String) {
                    aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, jsonPrimitiveOnNavigationEvent.onWarmupCompleted());
                    jsonPrimitiveOnNavigationEvent.onWarmupCompleted();
                    return true;
                }
                auth.onNavigationEvent.IAuthTabCallback(new IllegalArgumentException("illegal local type for jsonString. key=" + str + ", value=" + jsonElement), access8100.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement)));
            } else if (initRenderFinish.onExtraCallbackWithResult(jsonPrimitiveOnNavigationEvent) == null) {
                Double dOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonPrimitiveOnNavigationEvent);
                if (dOnWarmupCompleted != null) {
                    int i6 = IAuthTabCallbackDefault + 3;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        boolean z = obj instanceof Integer;
                        throw null;
                    }
                    if (obj instanceof Integer) {
                        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, Integer.valueOf((int) dOnWarmupCompleted.doubleValue()));
                        Objects.toString(dOnWarmupCompleted);
                    } else if (obj instanceof Long) {
                        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, Long.valueOf((long) dOnWarmupCompleted.doubleValue()));
                        Objects.toString(dOnWarmupCompleted);
                    } else if (obj instanceof Float) {
                        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, Float.valueOf((float) dOnWarmupCompleted.doubleValue()));
                        Objects.toString(dOnWarmupCompleted);
                    } else if (obj instanceof Double) {
                        aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, dOnWarmupCompleted);
                        Objects.toString(dOnWarmupCompleted);
                    }
                    return true;
                }
                auth.onNavigationEvent.IAuthTabCallback(new IllegalArgumentException("illegal local type for jsonBoolean. key=" + str + ", value=" + jsonElement), access8100.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement)));
            } else {
                if (obj instanceof Boolean) {
                    aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, Boolean.valueOf(initRenderFinish.IAuthTabCallback(jsonPrimitiveOnNavigationEvent)));
                    return true;
                }
                auth.onNavigationEvent.IAuthTabCallback(new IllegalArgumentException("illegal local type for jsonBoolean. key=" + str + ", value=" + jsonElement), access8100.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement)));
            }
        } else if (jsonElement instanceof JsonObject) {
            int i7 = IAuthTabCallbackDefault + 65;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (obj instanceof String) {
                aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, initRenderFinish.onExtraCallbackWithResult(jsonElement).toString());
                return true;
            }
            if (obj instanceof JsonObject) {
                JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(jsonElement);
                aLCFaceSDK4ExternalSyntheticLambda1.IAuthTabCallback(str, jsonObjectOnExtraCallbackWithResult);
                Objects.toString(jsonObjectOnExtraCallbackWithResult);
                int i9 = IAuthTabCallbackDefault + 11;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            auth.onNavigationEvent.IAuthTabCallback(new IllegalArgumentException("illegal local type for jsonObject. key=" + str + ", value=" + jsonElement), access8100.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement)));
        } else if (jsonElement instanceof JsonArray) {
            auth.onNavigationEvent.IAuthTabCallback(new IllegalArgumentException("jsonArray is unsupported. key=" + str + ", value=" + jsonElement), access8100.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement)));
        } else {
            auth.onNavigationEvent.IAuthTabCallback(new IllegalArgumentException("unknown json element type. key=" + str + ", value=" + jsonElement), access8100.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement)));
        }
        int i10 = asBinder + 83;
        IAuthTabCallbackDefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public static /* synthetic */ boolean IAuthTabCallback(JsonObject jsonObject, String str, Map.Entry entry) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -1025395943, new Object[]{jsonObject, str, entry}, 1025395945, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private static final boolean onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1264870653, new Object[]{function1, obj}, -1264870652, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private static final CharSequence onNavigationEvent(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (CharSequence) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), -1562799086, objArr, 1562799089, iOnExtraCallbackWithResult2);
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 999611841, new Object[]{this}, -999611841, iOnExtraCallbackWithResult2);
    }
}
