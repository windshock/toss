package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.ads_sdk.model.NativeExtension;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.addTouchables;
import o.qt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addTouchables implements KSerializer<NativeExtension> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static final SerialDescriptor onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    public static final addTouchables onWarmupCompleted;
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;

    private static String $$c(byte b, byte b2, byte b3) {
        int i = 105 - (b3 * 3);
        int i2 = b + 4;
        int i3 = b2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i += -i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i += -bArr[i2];
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(qtVar);
        int i4 = onTransact + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private addTouchables() {
    }

    public /* synthetic */ Object deserialize(Decoder decoder) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeExtension nativeExtensionOnExtraCallbackWithResult = onExtraCallbackWithResult(decoder);
        int i4 = onExtraCallback + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return nativeExtensionOnExtraCallbackWithResult;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(encoder, (NativeExtension) obj);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = onExtraCallback + 81;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStub = 0;
        onWarmupCompleted();
        onWarmupCompleted = new addTouchables();
        onExtraCallbackWithResult = ujb.IAuthTabCallback("NativeExtension", new SerialDescriptor[0], new Function1() { // from class: im.toss.ads_sdk.model.NativeExtensionSerializer$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = addTouchables.onWarmupCompleted((qt) obj);
                int i4 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 90 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        onNavigationEvent = 8;
        int i = asInterface + 109;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return serialDescriptor;
    }

    private static final Unit IAuthTabCallback(qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(qtVar, "");
        qtVar.onExtraCallback("sdkTemplateId", getWriggleLayout.onNavigationEvent.getDescriptor(), CollectionsKt.emptyList(), false);
        qtVar.onExtraCallback("schemaVersion", getDynamicHeight.onWarmupCompleted.getDescriptor(), CollectionsKt.emptyList(), true);
        List listEmptyList = CollectionsKt.emptyList();
        SerialDescriptor descriptor = JsonElement.Companion.serializer().getDescriptor();
        Object[] objArr = new Object[1];
        a(4 - View.MeasureSpec.makeMeasureSpec(0, 0), 2 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65531, 65534, 65531, 14}, true, TextUtils.getCapsMode("", 0, 0) + 238, objArr);
        qtVar.onExtraCallback(((String) objArr[0]).intern(), descriptor, listEmptyList, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[PHI: r2
      0x007a: PHI (r2v8 kotlinx.serialization.json.JsonPrimitive) = (r2v7 kotlinx.serialization.json.JsonPrimitive), (r2v9 kotlinx.serialization.json.JsonPrimitive) binds: [B:30:0x0078, B:27:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NativeExtension onExtraCallbackWithResult(@NotNull Decoder decoder) throws Throwable {
        setAnimationType setanimationtype;
        String str;
        JsonPrimitive jsonPrimitiveOnNavigationEvent;
        int i;
        Integer numAsInterface;
        int iIntValue;
        String strOnNavigationEvent;
        int i2 = 2 % 2;
        String string = "";
        Intrinsics.checkNotNullParameter(decoder, "");
        String strOnNavigationEvent2 = null;
        if (decoder instanceof setAnimationType) {
            int i3 = onTransact + 101;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                setanimationtype = (setAnimationType) decoder;
                int i4 = 68 / 0;
            } else {
                setanimationtype = (setAnimationType) decoder;
            }
        } else {
            setanimationtype = null;
        }
        if (setanimationtype == null) {
            throw new IllegalStateException("NativeExtensionSerializer only supports Json");
        }
        JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(setanimationtype.onWarmupCompleted());
        JsonElement jsonElement = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("sdkTemplateId");
        if (jsonElement != null) {
            int i5 = onTransact + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                initRenderFinish.onNavigationEvent(jsonElement);
                throw null;
            }
            JsonPrimitive jsonPrimitiveOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonElement);
            if (jsonPrimitiveOnNavigationEvent2 == null || (strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitiveOnNavigationEvent2)) == null) {
                JsonElement jsonElement2 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("narrativeId");
                if (jsonElement2 != null) {
                    int i6 = onExtraCallback + 67;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement2);
                        int i7 = 33 / 0;
                        if (jsonPrimitiveOnNavigationEvent != null) {
                            strOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonPrimitiveOnNavigationEvent);
                        }
                    } else {
                        jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement2);
                        if (jsonPrimitiveOnNavigationEvent != null) {
                        }
                    }
                }
                str = strOnNavigationEvent2;
            } else {
                str = strOnNavigationEvent;
            }
        }
        if (str != null) {
            int i8 = onTransact + 41;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (!StringsKt.isBlank(str)) {
                JsonElement jsonElement3 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("schemaVersion");
                if (jsonElement3 != null) {
                    int i10 = onTransact + 73;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    JsonPrimitive jsonPrimitiveOnNavigationEvent3 = initRenderFinish.onNavigationEvent(jsonElement3);
                    if (jsonPrimitiveOnNavigationEvent3 == null || (numAsInterface = initRenderFinish.asInterface(jsonPrimitiveOnNavigationEvent3)) == null) {
                        i = 0;
                    } else {
                        int i12 = onExtraCallback + 19;
                        onTransact = i12 % 128;
                        if (i12 % 2 == 0) {
                            iIntValue = numAsInterface.intValue();
                            int i13 = 2 / 0;
                        } else {
                            iIntValue = numAsInterface.intValue();
                        }
                        i = iIntValue;
                    }
                }
                Object[] objArr = new Object[1];
                a(4 - View.combineMeasuredStates(0, 0), 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{65531, 65534, 65531, 14}, true, 238 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                JsonElement jsonElement4 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
                if (jsonElement4 != null) {
                    int i14 = onTransact + 17;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 68 / 0;
                        if (!(jsonElement4 instanceof JsonNull)) {
                            string = jsonElement4.toString();
                            int i16 = onTransact + 85;
                            onExtraCallback = i16 % 128;
                            int i17 = i16 % 2;
                        }
                    } else if (!(jsonElement4 instanceof JsonNull)) {
                    }
                }
                return new NativeExtension(str, i, string, null, 8, null);
            }
        }
        throw new qn("nativeExtension is missing a non-blank 'sdkTemplateId'");
    }

    public void onExtraCallbackWithResult(@NotNull Encoder encoder, @NotNull NativeExtension nativeExtension) throws Throwable {
        Object obj;
        JsonNull jsonNull;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nativeExtension, "");
        skipVideo skipvideo = null;
        if (encoder instanceof skipVideo) {
            int i2 = onExtraCallback + 3;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            skipvideo = (skipVideo) encoder;
        }
        if (skipvideo == null) {
            throw new IllegalStateException("NativeExtensionSerializer only supports Json");
        }
        int i3 = onTransact + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (StringsKt.isBlank(nativeExtension.IAuthTabCallback())) {
            int i5 = onExtraCallback + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            jsonNull = JsonNull.INSTANCE;
        } else {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(skipvideo.onExtraCallback().onExtraCallback(nativeExtension.IAuthTabCallback()));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            if (kotlin.Result.onExtraCallback(obj)) {
                obj = jsonNull2;
            }
            jsonNull = (JsonElement) obj;
            int i7 = onTransact + 27;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("narrativeId", initRenderFinish.onNavigationEvent(nativeExtension.onWarmupCompleted()));
        mapOnExtraCallback.put("schemaVersion", initRenderFinish.IAuthTabCallback(Integer.valueOf(nativeExtension.onExtraCallbackWithResult())));
        if (!Intrinsics.areEqual(jsonNull, JsonNull.INSTANCE)) {
            Object[] objArr = new Object[1];
            a(4 - View.combineMeasuredStates(0, 0), 1 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65531, 65534, 65531, 14}, true, (ViewConfiguration.getLongPressTimeout() >> 16) + 238, objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), jsonNull);
        }
        skipvideo.onExtraCallbackWithResult(new JsonObject(access8100.onExtraCallbackWithResult(mapOnExtraCallback)));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16812341), 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.alpha(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 55, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i8 = $11 + 47;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i10 = $11 + 115;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 55 - KeyEvent.getDeadChar(0, 0), 2166 - TextUtils.lastIndexOf("", '0', 0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = -1;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i12 = $10 + 101;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 478309025;
    }
}
