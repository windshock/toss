package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaModuleWrapperMethodDescriptor implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static final String onExtraCallback;
    private static int[] onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{59614, 42245, 29497, 302, 57193, 27993, 15216, 51614, 34731, 21943, 58299, 45515, 20471, 7661, 43544, 30735, 13865, 50265, 37448, 8308, 65089, 35997, 23229, 59554, 42713, 29901, 749}, 19949 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new int[]{-1671475122, -1607811902, -649694577, -803931738, 1627479973, 58300951, 1261674804, 1145052379, 1677199791, -1269037525}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{59613, 39783, 3970, 46016, 9838, 43675, 24267, 49535, 30111, 63965, 27756, 4250, 34006, 14194, 48022, 12250, 53870, 18079, 51909, 32123, 57742, 38351, 6253, 35970, 12490, 41836}, 29611 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onTransact + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asInterface + 111;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = asInterface + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = asInterface + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onTransact + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Map<String, String> mapOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        Object obj = null;
        if (context == null) {
            int i2 = onTransact + 91;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        JsonObject jsonObjectOnExtraCallbackWithResult = new setText(jsonObject).onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        b(new int[]{702512457, 2129815950, 1078727621, 1346343647}, 6 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
        if (jsonElement != null) {
            int i3 = asInterface + 1;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!jsonElement.isJsonNull()) {
                if (!(!jsonElement.isJsonObject())) {
                    int i5 = onTransact + 49;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        JsonObject asJsonObject = jsonElement.getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        onExtraCallback(asJsonObject);
                        obj.hashCode();
                        throw null;
                    }
                    JsonObject asJsonObject2 = jsonElement.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
                    mapOnExtraCallback = onExtraCallback(asJsonObject2);
                } else {
                    if (!jsonElement.isJsonPrimitive()) {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{59645, 8213, 30982, 45578, 51974, 1073, 23871, 38498, 44844, 63551, 12567, 19024, 33614, 56412, 5427, 11856, 26478, 45163, 51553, 697, 23451, 38026, 44430, 59057, 16289, 18684, 33192, 55996, 5009, 11506, 26064, 48837, 63427, 196, 23021, 37615, 44004, 58137, 15375, 29963, 36371, 50953}, 51449 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                        onWarmupCompleted(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern());
                        return;
                    }
                    int i6 = onTransact + 31;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object objFromJson = ALCEyeBlink.onExtraCallback().fromJson(jsonElement.getAsString(), JsonObject.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                        mapOnExtraCallback = onExtraCallback((JsonObject) objFromJson);
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            Object[] objArr3 = new Object[1];
                            a(new char[]{59645, 64407, 52738, 53904, 42254, 35211, 39947, 24816, 29503, 18349, 10796, 16042, 361, 5570, 63574, 52426, 57166, 41935, 46661, 39627, 27953, 29183, 17517, 10482, 15210, 4092}, Process.getGidForName("") + 4988, objArr3);
                            message = ((String) objArr3[0]).intern();
                        }
                        onWarmupCompleted(setonoutofmemeryerrorcallback, message);
                        return;
                    }
                }
                r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.onExtraCallback onextracallback = r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion;
                Object[] objArr4 = new Object[1];
                a(new char[]{59645, 51227, 43320, 35404, 27486, 19601, 11696, 3789, 61415, 53013, 41014}, 8419 - TextUtils.getOffsetAfter("", 0), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                b(new int[]{1201127679, 332899917, 1425675482, 320276471, -1868285666, 684121834}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, objArr5);
                onextracallback.onWarmupCompleted(context, mapOnExtraCallback, access8100.onNavigationEvent(getWrite.IAuthTabCallback(strIntern, ((String) objArr5[0]).intern())));
                setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
                int i8 = onTransact + 91;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
        }
        onWarmupCompleted(setonoutofmemeryerrorcallback);
        int i10 = asInterface + 59;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JavaModuleWrapperMethodDescriptor.a(char[], int, java.lang.Object[]):void");
    }

    private final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strIntern;
        String strIntern2;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{59645, 28133, 58086, 26618, 64710, 29121, 63199, 19346, 49324, 17839, 56055, 24448, 54420, 10644, 44703, 9002, 47218, 15718, 45583, 14147, 35924, 320, 34367, 6971}, 34057 << (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1)), objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new int[]{-1671475122, -1607811902, -649694577, -803931738, 1627479973, 58300951, 1261674804, 1145052379, 1677199791, -1269037525}, 91 >> ExpandableListView.getPackedPositionGroup(0L), objArr2);
            strIntern2 = ((String) objArr2[0]).intern();
            map = null;
            i = 5;
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{59645, 28133, 58086, 26618, 64710, 29121, 63199, 19346, 49324, 17839, 56055, 24448, 54420, 10644, 44703, 9002, 47218, 15718, 45583, 14147, 35924, 320, 34367, 6971}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34057, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new int[]{-1671475122, -1607811902, -649694577, -803931738, 1627479973, 58300951, 1261674804, 1145052379, 1677199791, -1269037525}, 17 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            strIntern2 = ((String) objArr4[0]).intern();
            map = null;
            i = 4;
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, strIntern2, map, i, (Object) null);
    }

    private final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{59613, 39783, 3970, 46016, 9838, 43675, 24267, 49535, 30111, 63965, 27756, 4250, 34006, 14194, 48022, 12250, 53870, 18079, 51909, 32123, 57742, 38351, 6253, 35970, 12490, 41836}, 30412 >> TextUtils.indexOf("", "", 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{59613, 39783, 3970, 46016, 9838, 43675, 24267, 49535, 30111, 63965, 27756, 4250, 34006, 14194, 48022, 12250, 53870, 18079, 51909, 32123, 57742, 38351, 6253, 35970, 12490, 41836}, 29611 - TextUtils.indexOf("", "", 0), objArr2);
            obj = objArr2[0];
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str, ((String) obj).intern(), (Map) null, 4, (Object) null);
        int i3 = onTransact + 103;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
    }

    private final Map<String, String> onExtraCallback(JsonObject jsonObject) throws Throwable {
        Object obj;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map mapAsMap = jsonObject.asMap();
        Intrinsics.checkNotNullExpressionValue(mapAsMap, "");
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        for (Map.Entry entry : mapAsMap.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement.isJsonNull()) {
                int i4 = asInterface + 117;
                onTransact = i4 % 128;
                Object obj2 = null;
                if (i4 % 2 != 0) {
                    linkedHashMap.put(str, null);
                    obj2.hashCode();
                    throw null;
                }
                linkedHashMap.put(str, null);
            } else if (jsonElement.isJsonPrimitive()) {
                try {
                    Result.Companion companion = Result.Companion;
                    linkedHashMap.put(str, jsonElement.getAsString());
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    b(new int[]{2026845202, 1315506100, 777575402, 2066013650, -1591482566, -773251524, 1301548182, 2041463047, -223300071, 1903768760}, 19 - TextUtils.lastIndexOf("", '0'), objArr);
                    sb.append(((String) objArr[0]).intern());
                    sb.append(str);
                    Object[] objArr2 = new Object[1];
                    b(new int[]{-1741269349, 1370215379, -918057349, -804016573, -1338130444, -541513032}, Color.blue(0) + 9, objArr2);
                    sb.append(((String) objArr2[0]).intern());
                    sb.append(jsonElement);
                    Object[] objArr3 = new Object[1];
                    b(new int[]{739500620, 1102433628}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    Object[] objArr4 = new Object[1];
                    a(new char[]{59614, 42245, 29497, 302, 57193, 27993, 15216, 51614, 34731, 21943, 58299, 45515, 20471, 7661, 43544, 30735, 13865, 50265, 37448, 8308, 65089, 35997, 23229, 59554, 42713, 29901, 749}, 19948 - ImageFormat.getBitsPerPixel(0), objArr4);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), sb.toString(), th2, (Map) null, 8, (Object) null);
                }
            }
        }
        return linkedHashMap;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        int i5 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> i5), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 72, 8848 - KeyEvent.normalizeMetaState(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 47;
                $11 = i10 % 128;
                if (i10 % i2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 71 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9 >>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 72, 8848 - (ViewConfiguration.getScrollBarSize() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                i2 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.getCapsMode("", 0, 0)), 39 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.normalizeMetaState(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4033), (ViewConfiguration.getPressedStateDuration() >> 16) + 78, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = -4591050882031915590L;
        onExtraCallbackWithResult = new int[]{1513697816, 1616997101, 202162263, 904165720, -1024036106, -1346505791, -1901647843, -935291599, 1381833403, 976714694, -278488261, -1359124160, 1194421587, 1231025132, 497395704, -1652905796, -647506484, -185519821};
    }
}
