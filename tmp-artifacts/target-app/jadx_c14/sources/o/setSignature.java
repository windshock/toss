package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NextFrameEndCallbackQueueExternalSyntheticLambda1;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setSignature implements ALCFaceQuality {
    public static final onExtraCallback Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int access000;
    private static byte[] asBinder;
    private static short[] asInterface;
    private static int[] onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {96, -37, -4, -26};
    private static final int $$b = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 1;
    private static int IAuthTabCallbackStubProxy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r5 = r5 * 4
            int r5 = 115 - r5
            byte[] r1 = o.setSignature.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSignature.$$c(int, short, byte):java.lang.String");
    }

    static {
        access000 = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{-1450573932, -1439590309}, 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{1697700561, 943626757}, (-16777213) - Color.rgb(0, 0, 0), objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-111) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1849266378, (-95) - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1673118958, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{-168613113, 338349443, -1736252812, -1866317051}, 7 - ExpandableListView.getPackedPositionType(0L), objArr4);
        onExtraCallbackWithResult = ((String) objArr4[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallbackStubProxy + 25;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, AtomicBoolean atomicBoolean2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(atomicInteger, atomicBoolean, setonoutofmemeryerrorcallback, atomicBoolean2);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = access100 + 77;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = getInterfaceDescriptor + 5;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = getInterfaceDescriptor + 35;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = getInterfaceDescriptor + 69;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(AtomicBoolean atomicBoolean, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            if (!atomicBoolean.compareAndSet(true, true)) {
                return;
            }
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        int i3 = getInterfaceDescriptor + 33;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void IAuthTabCallback(AtomicBoolean atomicBoolean, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            if (!atomicBoolean.compareAndSet(false, true)) {
                return;
            }
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        int i3 = access100 + 55;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str, (String) null, (Map) null, 30, (Object) null);
        } else {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str, (String) null, (Map) null, 6, (Object) null);
        }
    }

    private static final void onExtraCallback(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, AtomicBoolean atomicBoolean2) {
        int i = 2 % 2;
        if (!(!atomicBoolean2.compareAndSet(false, true)) && atomicInteger.decrementAndGet() == 0) {
            int i2 = access100 + 33;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(atomicBoolean, setonoutofmemeryerrorcallback);
        }
        int i4 = access100 + 75;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r24, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSignature.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private final onWarmupCompleted onWarmupCompleted(JsonElement jsonElement) throws Throwable {
        Object obj;
        String strOnExtraCallback;
        Map<String, String> mapOnNavigationEvent;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(jsonElement.getAsJsonObject());
            int i4 = getInterfaceDescriptor + 53;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        String str = null;
        if (Result.onExtraCallback(obj)) {
            int i6 = access100 + 9;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            obj = null;
        }
        JsonObject jsonObject = (JsonObject) obj;
        if (jsonObject == null) {
            int i7 = getInterfaceDescriptor + 125;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Object[] objArr = new Object[1];
        a(new int[]{1697700561, 943626757}, 3 - Color.argb(0, 0, 0, 0), objArr);
        JsonElement jsonElement2 = jsonObject.get(((String) objArr[0]).intern());
        if (jsonElement2 == null || (strOnExtraCallback = onExtraCallback(jsonElement2)) == null) {
            int i8 = access100 + 3;
            getInterfaceDescriptor = i8 % 128;
            if (i8 % 2 == 0) {
                return null;
            }
            str.hashCode();
            throw null;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{-168613113, 338349443, -1736252812, -1866317051}, 7 - (Process.myTid() >> 22), objArr2);
        JsonElement jsonElement3 = jsonObject.get(((String) objArr2[0]).intern());
        if (jsonElement3 == null || (jsonElement3 instanceof JsonNull)) {
            mapOnNavigationEvent = access8100.onNavigationEvent();
        } else {
            mapOnNavigationEvent = onNavigationEvent(jsonElement3);
            if (mapOnNavigationEvent == null) {
                int i9 = getInterfaceDescriptor + 47;
                access100 = i9 % 128;
                int i10 = i9 % 2;
                return null;
            }
        }
        Object[] objArr3 = new Object[1];
        b((byte) (AndroidCharacter.getMirror('0') - '0'), (short) ((-112) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1849266379 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 94, View.combineMeasuredStates(0, 0) - 1673118959, objArr3);
        JsonElement jsonElement4 = jsonObject.get(((String) objArr3[0]).intern());
        if (jsonElement4 != null) {
            int i11 = getInterfaceDescriptor + 77;
            access100 = i11 % 128;
            if (i11 % 2 == 0) {
                boolean z = jsonElement4 instanceof JsonNull;
                throw null;
            }
            if (!(jsonElement4 instanceof JsonNull)) {
                String strOnExtraCallback2 = onExtraCallback(jsonElement4);
                if (strOnExtraCallback2 == null) {
                    return null;
                }
                str = strOnExtraCallback2;
            }
        }
        return new onWarmupCompleted(strOnExtraCallback, mapOnNavigationEvent, IAuthTabCallback.Companion.onExtraCallbackWithResult(str));
    }

    public static final class onExtraCallbackWithResult<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((onWarmupCompleted) t2).IAuthTabCallback().getOrder()), Integer.valueOf(((onWarmupCompleted) t).IAuthTabCallback().getOrder()));
        }
    }

    private final Map<String, String> onNavigationEvent(JsonElement jsonElement) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(jsonElement.getAsJsonObject());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = access100 + 47;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            obj = null;
        }
        JsonObject jsonObject = (JsonObject) obj;
        if (jsonObject == null) {
            int i4 = access100 + 9;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<Map.Entry> setEntrySet = jsonObject.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        for (Map.Entry entry : setEntrySet) {
            int i6 = access100 + 11;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.checkNotNull(entry);
            String str = (String) entry.getKey();
            JsonElement jsonElement2 = (JsonElement) entry.getValue();
            Intrinsics.checkNotNull(jsonElement2);
            String strOnExtraCallback = onExtraCallback(jsonElement2);
            if (strOnExtraCallback == null) {
                int i8 = getInterfaceDescriptor + 123;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                return null;
            }
            linkedHashMap.put(str, strOnExtraCallback);
        }
        return linkedHashMap;
    }

    private final String onExtraCallback(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (jsonElement instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) jsonElement;
                int i4 = i3 + 63;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } else {
                jsonPrimitive = null;
            }
            if (jsonPrimitive == null || (!jsonPrimitive.isString())) {
                return null;
            }
            int i6 = access100 + 111;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            String asString = jsonPrimitive.getAsString();
            if (i7 != 0) {
                int i8 = 42 / 0;
            }
            return asString;
        }
        boolean z = jsonElement instanceof JsonPrimitive;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        long j = 0;
        char c = '0';
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 73, 8849 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    c = '0';
                    i3 = -1469660336;
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
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i8]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i4, i4), (-16777144) - Color.rgb(i4, i4, i4), 8848 - TextUtils.getOffsetBefore("", i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i8++;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i9 = i4;
        System.arraycopy(iArr5, i9, iArr4, i9, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        int i10 = $10 + 95;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = $10 + 115;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < 16) {
                int i15 = $11 + 55;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 38, 10301 - (ViewConfiguration.getTouchSlop() >> 8), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14 += 53;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 22252), (ViewConfiguration.getJumpTapTimeout() >> 16) + 39, 10301 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i14++;
                }
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 78 - View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final RecomposerawaitIdle2.onNavigationEvent onNavigationEvent(RecomposerawaitIdle2.onNavigationEvent onnavigationevent, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (!map.isEmpty()) {
            NextFrameEndCallbackQueueExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = new NextFrameEndCallbackQueueExternalSyntheticLambda1.onExtraCallbackWithResult();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int i4 = getInterfaceDescriptor + 117;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                String key = entry.getKey();
                String value = entry.getValue();
                try {
                    Result.Companion companion = Result.Companion;
                    Result.constructor-impl(onextracallbackwithresult.onNavigationEvent(key, value));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            MovableContentKtExternalSyntheticLambda6.onNavigationEvent(onnavigationevent, onextracallbackwithresult.onExtraCallback());
            return onnavigationevent;
        }
        int i6 = access100;
        int i7 = i6 + 115;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i6 + 71;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        return onnavigationevent;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private final List<onWarmupCompleted> onExtraCallbackWithResult(JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObjectOnExtraCallbackWithResult = new setText(jsonObject).onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new int[]{-1450573932, -1439590309}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr);
        JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
        Object obj = null;
        if (jsonElement != null) {
            if (!jsonElement.isJsonArray()) {
                int i2 = getInterfaceDescriptor + 123;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                jsonElement = null;
            }
            if (jsonElement != null) {
                int i4 = access100 + 17;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    JsonArray<JsonElement> asJsonArray = jsonElement.getAsJsonArray();
                    if (asJsonArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (JsonElement jsonElement2 : asJsonArray) {
                            int i5 = access100 + 53;
                            getInterfaceDescriptor = i5 % 128;
                            int i6 = i5 % 2;
                            Intrinsics.checkNotNull(jsonElement2);
                            onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted(jsonElement2);
                            if (onWarmupCompleted2 == null) {
                                return null;
                            }
                            arrayList.add(onWarmupCompleted2);
                        }
                        return CollectionsKt.sortedWith(arrayList, new onExtraCallbackWithResult());
                    }
                } else {
                    jsonElement.getAsJsonArray();
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return null;
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43423), TextUtils.getCapsMode("", 0, 0) + 42, 22439 - KeyEvent.keyCodeFromString(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 81;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            char c = '0';
            if (z) {
                int i10 = $11 + 9;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843), TextUtils.lastIndexOf("", c, 0, 0) + 56, (Process.myTid() >> 22) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $11 + 15;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr3 = asBinder;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onTransact)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 43424), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 22440 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] % (-4629411779493505016L))) * ((int) (IAuthTabCallbackStub - 4629411779493505016L));
                    } else {
                        byte[] bArr4 = asBinder;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onTransact)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 43424), Process.getGidForName("") + 43, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) i6;
                } else {
                    iIntValue = (short) (((short) (asInterface[i + ((int) (onTransact ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (onTransact ^ (-4629411779493505016L)));
                if (z) {
                    int i14 = $11 + 75;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackDefault), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 87, ExpandableListView.getPackedPositionType(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = asBinder;
                if (bArr5 != null) {
                    int i16 = $11 + 123;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr6[i18] = (byte) (bArr5[i18] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i19 = $11 + 63;
                    int i20 = i19 % 128;
                    $10 = i20;
                    int i21 = i19 % 2;
                    if (z2) {
                        int i22 = i20 + 3;
                        $11 = i22 % 128;
                        if (i22 % 2 == 0) {
                            byte[] bArr7 = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr7[r7] / (-4629411779493505016L))) + s)) ^ b);
                        } else {
                            byte[] bArr8 = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr8[r7] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    static void IAuthTabCallback() {
        onExtraCallback = new int[]{-1268508722, 1752645779, 217792181, -925726321, -1906342530, -417875045, 1451938111, 893518035, -571114361, 491816563, 125322901, -2002425824, 73932737, 2035675930, -2018808573, -1353434466, -917834618, -1148239192};
        onTransact = 897693501;
        IAuthTabCallbackStub = -1538795410;
        IAuthTabCallbackDefault = -939647657;
        asBinder = new byte[]{125, 115, 111, 123, 126, 111, 122, 8};
    }

    public static final class onNavigationEvent implements RecomposerawaitIdle2.onExtraCallback {
        final /* synthetic */ AtomicBoolean IAuthTabCallback;
        final /* synthetic */ AtomicInteger IAuthTabCallbackDefault;
        final /* synthetic */ AtomicInteger IAuthTabCallbackStub;
        final /* synthetic */ AtomicBoolean IAuthTabCallback_Parcel;
        final /* synthetic */ setOnOutOfMemeryErrorCallback asBinder;
        final /* synthetic */ AtomicInteger asInterface;
        final /* synthetic */ AtomicBoolean getInterfaceDescriptor;
        final /* synthetic */ AtomicBoolean onExtraCallback;
        final /* synthetic */ AtomicBoolean onExtraCallbackWithResult;
        final /* synthetic */ setOnOutOfMemeryErrorCallback onNavigationEvent;
        final /* synthetic */ AtomicBoolean onTransact;
        final /* synthetic */ setOnOutOfMemeryErrorCallback onWarmupCompleted;

        public void onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2) {
        }

        public onNavigationEvent(AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean2, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, AtomicBoolean atomicBoolean3, AtomicInteger atomicInteger2, AtomicBoolean atomicBoolean4, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2, AtomicBoolean atomicBoolean5, AtomicInteger atomicInteger3, AtomicBoolean atomicBoolean6, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback3) {
            this.onTransact = atomicBoolean;
            this.IAuthTabCallbackDefault = atomicInteger;
            this.IAuthTabCallback = atomicBoolean2;
            this.onWarmupCompleted = setonoutofmemeryerrorcallback;
            this.getInterfaceDescriptor = atomicBoolean3;
            this.IAuthTabCallbackStub = atomicInteger2;
            this.onExtraCallback = atomicBoolean4;
            this.onNavigationEvent = setonoutofmemeryerrorcallback2;
            this.IAuthTabCallback_Parcel = atomicBoolean5;
            this.asInterface = atomicInteger3;
            this.onExtraCallbackWithResult = atomicBoolean6;
            this.asBinder = setonoutofmemeryerrorcallback3;
        }

        public void IAuthTabCallback(RecomposerawaitIdle2 recomposerawaitIdle2) {
            setSignature.onWarmupCompleted(this.IAuthTabCallbackDefault, this.IAuthTabCallback, this.onWarmupCompleted, this.onTransact);
        }

        public void onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposeraddCompositionRegistrationObserver2 recomposeraddCompositionRegistrationObserver2) {
            setSignature.onWarmupCompleted(this.IAuthTabCallbackStub, this.onExtraCallback, this.onNavigationEvent, this.getInterfaceDescriptor);
        }

        public void onNavigationEvent(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposerKt recomposerKt) {
            setSignature.onWarmupCompleted(this.asInterface, this.onExtraCallbackWithResult, this.asBinder, this.IAuthTabCallback_Parcel);
        }
    }
}
