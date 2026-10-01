package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import im.toss.define.TossAffiliate;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setText {
    private final JsonObject IAuthTabCallback;
    private JsonObject onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final JsonObject onWarmupCompleted;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static char[] onNavigationEvent = {25810, 37802, 35369, 33459, 47419, 45490, 43022, 41100};
    private static long IAuthTabCallbackStub = -2898013313865540946L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        int i4 = (i * 3) + 1;
        int i5 = 97 - (s * 4);
        int i6 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            i3 = 0;
            int i9 = i6 + i8;
            i2 = i3;
            int i10 = i7;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i11 = i6 + 1;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i7 = i11;
            i6 = bArr[i11];
            i8 = i12;
            int i92 = i6 + i8;
            i2 = i3;
            int i102 = i7;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i112 = i6 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i1122 = i6 + 1;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i6)) | (~(i8 | i6));
        int i10 = ~(i4 | i7);
        int i11 = i6 | i10 | (~(i8 | i2));
        int i12 = i6 + i2 + i5 + (1997535707 * i) + (1930545336 * i3);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i6) + 1468203008 + ((-417352845) * i2) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i5) + ((-1408630784) * i) + ((-2070937600) * i3) + (392888320 * i13);
        int i15 = (i6 * (-2054695253)) + 138751921 + (i2 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i5 * (-2054694363)) + (i * 1502648999) + (i3 * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public setText(@NotNull JsonObject jsonObject) {
        JsonObject jsonObject2;
        JsonObject asJsonObject;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.onWarmupCompleted = jsonObject;
        if (jsonObject.has("params") && jsonObject.get("params").isJsonObject()) {
            jsonObject2 = jsonObject.get("params").getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(jsonObject2, "");
        } else {
            jsonObject2 = new JsonObject();
            int i = 2 % 2;
        }
        this.onExtraCallback = jsonObject2;
        String asString = null;
        if (jsonObject.has("callbacks") && jsonObject.get("callbacks").isJsonObject()) {
            asJsonObject = jsonObject.get("callbacks").getAsJsonObject();
            int i2 = onTransact + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            asJsonObject = null;
        }
        this.IAuthTabCallback = asJsonObject;
        if (jsonObject.has("onError")) {
            int i5 = onTransact + 79;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            JsonElement jsonElement = jsonObject.get("onError");
            if (i6 == 0) {
                jsonElement.getAsString();
                throw null;
            }
            asString = jsonElement.getAsString();
            int i7 = 2 % 2;
        }
        this.onExtraCallbackWithResult = asString;
    }

    public final JsonObject onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        JsonObject jsonObject = this.onExtraCallback;
        int i5 = i3 + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r5 = new java.lang.Object[]{r5};
        r7 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2094228247);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r7 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r7 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.text.TextUtils.indexOf("", "", 0, 0), 45 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 7049, 1301519751, false, "onExtraCallback", new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        r0 = (im.toss.define.TossAffiliate) ((java.lang.reflect.Method) r7).invoke(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        r2 = o.setText.onTransact + 99;
        o.setText.asInterface = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if ((r2 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r15.onWarmupCompleted.has(im.toss.define.TossAffiliate.EXTRA_KEY) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((!r15.onWarmupCompleted.has(im.toss.define.TossAffiliate.EXTRA_KEY)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r2 = im.toss.define.TossAffiliate.Companion;
        r5 = r15.onWarmupCompleted.get(im.toss.define.TossAffiliate.EXTRA_KEY).getAsString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TossAffiliate onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 45;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Deprecated
    public final String onExtraCallback() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            JsonObject jsonObject = this.onExtraCallback;
            a((-1) << ((byte) KeyEvent.getModifierMetaStateMask()), 122 << TextUtils.getOffsetBefore("", 1), (char) ((TypedValue.complexToFraction(1, 0.0f, 0.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(1, 0.0f, 0.0f) == 2.0f ? 0 : -1)) + 35173), new Object[1]);
            if (!jsonObject.has(((String) r10[0]).intern())) {
                return null;
            }
        } else {
            JsonObject jsonObject2 = this.onExtraCallback;
            Object[] objArr = new Object[1];
            a((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getOffsetBefore("", 0) + 8, (char) (35173 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
            if (!jsonObject2.has(((String) objArr[0]).intern())) {
                return null;
            }
        }
        int i3 = asInterface + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject3 = this.onExtraCallback;
        if (i4 != 0) {
            Object[] objArr2 = new Object[1];
            a((-1) << Process.getGidForName(""), 0 % View.resolveSize(0, 0), (char) (35173 - (Process.getThreadPriority(1) >> 74)), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a((-1) - Process.getGidForName(""), 8 - View.resolveSize(0, 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 35173), objArr3);
            obj = objArr3[0];
        }
        return jsonObject3.get(((String) obj).intern()).getAsString();
    }

    public final String onWarmupCompleted(@NotNull String str) {
        JsonElement jsonElement;
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObject = this.IAuthTabCallback;
        if (jsonObject == null || (jsonElement = jsonObject.get(str)) == null) {
            jsonElement = this.onExtraCallback.get(str);
        }
        if (jsonElement == null) {
            return null;
        }
        int i4 = onTransact + 3;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonElement.getAsString();
        }
        int i5 = 43 / 0;
        return jsonElement.getAsString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5.onExtraCallback.has("onSuccess") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((!r5.onExtraCallback.has("onSuccess")) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r1 = r5.onExtraCallback.get("onSuccess").getAsString();
        r3 = o.setText.asInterface + 113;
        o.setText.onTransact = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
    }

    public final String IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        String strOnTransact = onTransact();
        if (strOnTransact == null) {
            int i2 = onTransact + 71;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            strOnTransact = onExtraCallback();
        }
        int i4 = asInterface + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.onExtraCallback.has("onError"))) {
            return this.onExtraCallback.get("onError").getAsString();
        }
        int i4 = onTransact + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setText settext = (setText) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            settext.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnWarmupCompleted = settext.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            return strOnWarmupCompleted;
        }
        int i3 = onTransact + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return settext.onExtraCallback();
    }

    public final String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return onWarmupCompleted(this.onExtraCallback.get(str), str2);
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strOnWarmupCompleted = onWarmupCompleted(this.onExtraCallback.get(str), str2);
        int i3 = 92 / 0;
        return strOnWarmupCompleted;
    }

    public final int onNavigationEvent(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return onNavigationEvent(this.onExtraCallback.get(str), i);
        }
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent(this.onExtraCallback.get(str), i);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setText settext = (setText) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        long jOnExtraCallbackWithResult = settext.onExtraCallbackWithResult(settext.onExtraCallback.get(str), jLongValue);
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jOnExtraCallbackWithResult);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setText settext = (setText) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            settext.onWarmupCompleted(settext.onExtraCallback.get(str), fFloatValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        float fOnWarmupCompleted = settext.onWarmupCompleted(settext.onExtraCallback.get(str), fFloatValue);
        int i3 = asInterface + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return Float.valueOf(fOnWarmupCompleted);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean zOnExtraCallback;
        setText settext = (setText) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            zOnExtraCallback = settext.onExtraCallback(settext.onExtraCallback.get(str), zBooleanValue);
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            zOnExtraCallback = settext.onExtraCallback(settext.onExtraCallback.get(str), zBooleanValue);
        }
        return Boolean.valueOf(zOnExtraCallback);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setText settext = (setText) objArr[0];
        String str = (String) objArr[1];
        JsonObject jsonObject = (JsonObject) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 2) != 0) {
            jsonObject = new JsonObject();
        }
        JsonObject jsonObjectOnExtraCallback = settext.onExtraCallback(str, jsonObject);
        int i4 = onTransact + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return jsonObjectOnExtraCallback;
    }

    public final JsonObject onExtraCallback(@NotNull String str, @NotNull JsonObject jsonObject) {
        JsonObject asJsonObject;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = this.onExtraCallback.get(str);
        if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
            return jsonObject;
        }
        int i2 = asInterface;
        int i3 = i2 + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return asJsonObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonArray onExtraCallbackWithResult(@NotNull String str, @NotNull JsonArray jsonArray) {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonArray, "");
            Result.Companion companion2 = kotlin.Result.Companion;
            this.onExtraCallback.get(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        Result.Companion companion3 = kotlin.Result.Companion;
        JsonElement jsonElement = this.onExtraCallback.get(str);
        obj = kotlin.Result.constructor-impl(jsonElement != null ? jsonElement.getAsJsonArray() : null);
        if (kotlin.Result.onExtraCallback(obj)) {
            int i3 = onTransact + 51;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } else {
            obj2 = obj;
        }
        JsonArray jsonArray2 = (JsonArray) obj2;
        return jsonArray2 != null ? jsonArray2 : jsonArray;
    }

    public final JsonElement onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        JsonNull jsonNull = this.onExtraCallback.get(str);
        if (jsonNull == null) {
            int i2 = asInterface + 113;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            jsonNull = JsonNull.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(jsonNull, "");
        }
        int i4 = onTransact + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return jsonNull;
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zHas = this.onExtraCallback.has(str);
        int i4 = asInterface + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zHas;
    }

    public final JsonObject onNavigationEvent(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (!z) {
            return this.onExtraCallback;
        }
        int i5 = i3 + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        JsonObject jsonObjectDeepCopy = this.onExtraCallback.deepCopy();
        Object[] objArr = new Object[1];
        a(Process.getGidForName("") + 1, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8, (char) (ImageFormat.getBitsPerPixel(0) + 35174), objArr);
        Iterator it = CollectionsKt.listOf(new String[]{((String) objArr[0]).intern(), "onSuccess", "onError"}).iterator();
        while (it.hasNext()) {
            int i7 = asInterface + 113;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            jsonObjectDeepCopy.remove((String) it.next());
        }
        Intrinsics.checkNotNull(jsonObjectDeepCopy);
        return jsonObjectDeepCopy;
    }

    private final String onWarmupCompleted(JsonElement jsonElement, String str) {
        Object obj;
        int i = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(jsonElement != null ? jsonElement.getAsString() : null);
            int i2 = onTransact + 33;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 5;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = onTransact + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            obj2 = obj;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            return str;
        }
        int i6 = asInterface + 45;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return str2;
    }

    private final int onNavigationEvent(JsonElement jsonElement, int i) {
        Object obj;
        int i2 = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(jsonElement != null ? Integer.valueOf(jsonElement.getAsInt()) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i3 = onTransact + 115;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 19;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        } else {
            obj2 = obj;
        }
        Integer num = (Integer) obj2;
        if (num == null) {
            return i;
        }
        int iIntValue = num.intValue();
        int i8 = asInterface + 75;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return iIntValue;
    }

    private final float onWarmupCompleted(JsonElement jsonElement, float f) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(jsonElement != null ? Float.valueOf(jsonElement.getAsFloat()) : null);
            int i2 = onTransact + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Float f2 = (Float) (kotlin.Result.onExtraCallback(obj) ? null : obj);
        if (f2 == null) {
            return f;
        }
        int i4 = asInterface + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return f2.floatValue();
    }

    private final long onExtraCallbackWithResult(JsonElement jsonElement, long j) {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 == 0) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj2.hashCode();
            throw null;
        }
        Result.Companion companion3 = kotlin.Result.Companion;
        obj = kotlin.Result.constructor-impl(jsonElement != null ? Long.valueOf(jsonElement.getAsLong()) : null);
        if (kotlin.Result.onExtraCallback(obj)) {
            int i3 = asInterface + 65;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } else {
            obj2 = obj;
        }
        Long l = (Long) obj2;
        return l != null ? l.longValue() : j;
    }

    private final boolean onExtraCallback(JsonElement jsonElement, boolean z) {
        Object obj;
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            if (jsonElement != null) {
                boolValueOf = Boolean.valueOf(jsonElement.getAsBoolean());
            } else {
                int i4 = onTransact + 23;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                boolValueOf = null;
            }
            obj = kotlin.Result.constructor-impl(boolValueOf);
            int i6 = onTransact + 11;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = (Boolean) (kotlin.Result.onExtraCallback(obj) ? null : obj);
        return bool != null ? bool.booleanValue() : z;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59745 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, TextUtils.lastIndexOf("", '0', 0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 20220 - TextUtils.indexOf("", "", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1493 - TextUtils.indexOf((CharSequence) "", '0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 61;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ExpandableListView.getPackedPositionType(j)), 44 - Gravity.getAbsoluteGravity(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $11 + 67;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                j = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ JsonObject onWarmupCompleted(setText settext, String str, JsonObject jsonObject, int i, Object obj) {
        Object[] objArr = {settext, str, jsonObject, Integer.valueOf(i), obj};
        return (JsonObject) onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2139313042, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2139313040, objArr);
    }

    public final float onExtraCallbackWithResult(@NotNull String str, float f) {
        Object[] objArr = {this, str, Float.valueOf(f)};
        return ((Float) onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, objArr)).floatValue();
    }

    public final long onWarmupCompleted(@NotNull String str, long j) {
        Object[] objArr = {this, str, Long.valueOf(j)};
        return ((Long) onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr)).longValue();
    }

    public final boolean onExtraCallback(@NotNull String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        return ((Boolean) onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr)).booleanValue();
    }

    public final String asInterface() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (String) onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1888845477, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1888845477, new Object[]{this});
    }
}
