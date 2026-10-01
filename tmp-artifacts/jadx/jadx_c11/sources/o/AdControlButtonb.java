package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.rn.toss.core.common.bridge.ReactNativeJsBridgeKt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceValidation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AdControlButtonb implements setOnOutOfMemeryErrorCallback {
    private static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallbackDefault;
    private static int access000;
    private static long asInterface;
    private final drawTextBox IAuthTabCallback;
    private final Callback IAuthTabCallbackStub;
    private final setText asBinder;
    private final Map<String, Object> onExtraCallback;
    private final JsonObject onExtraCallbackWithResult;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter onNavigationEvent;
    private final Callback onTransact;
    private final String onWarmupCompleted;
    private static final byte[] $$a = {75, -35, 114, 51};
    private static final int $$b = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor = 0;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[ALCFaceValidation.values().length];
            try {
                iArr[ALCFaceValidation.ALL.ordinal()] = 1;
                int i = IAuthTabCallback + 3;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ALCFaceValidation.WITHOUT_CONTENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3 = (i * 4) + 1;
        int i4 = 97 - (b2 * 2);
        int i5 = 4 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            i2 = 0;
            int i8 = i6 + 1;
            i4 = i5 + (-i7);
            i5 = i8;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i9 = i4;
            i6 = i5;
            i5 = i9;
            int i82 = i6 + 1;
            i4 = i5 + (-i7);
            i5 = i82;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    static {
        access000 = 1;
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = getInterfaceDescriptor + 75;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public void onNavigationEvent(@NotNull String str, @NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i4 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public AdControlButtonb(@NotNull String str, @NotNull JsonObject jsonObject, @NotNull Callback callback, @NotNull Callback callback2, @Nullable Map<String, ? extends Object> map, @Nullable DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, @Nullable drawTextBox drawtextbox) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(callback, "");
        Intrinsics.checkNotNullParameter(callback2, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = jsonObject;
        this.onTransact = callback;
        this.IAuthTabCallbackStub = callback2;
        this.onExtraCallback = map;
        this.onNavigationEvent = rCTDeviceEventEmitter;
        this.IAuthTabCallback = drawtextbox;
        this.asBinder = new setText(jsonObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdControlButtonb(String str, JsonObject jsonObject, Callback callback, Callback callback2, Map map, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, drawTextBox drawtextbox, int i, DefaultConstructorMarker defaultConstructorMarker) {
        drawTextBox drawtextbox2;
        if ((i & 64) != 0) {
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 73;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 45;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            drawtextbox2 = null;
        } else {
            drawtextbox2 = drawtextbox;
        }
        this(str, jsonObject, callback, callback2, map, rCTDeviceEventEmitter, drawtextbox2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ALCFaceValidation onNavigationEvent(String str) {
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult = ALCFaceValidation.Companion;
        setText settext = this.asBinder;
        drawTextBox drawtextbox = this.IAuthTabCallback;
        if (drawtextbox != null) {
            int i4 = IAuthTabCallbackStubProxy + 113;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            aLCFaceValidationOnWarmupCompleted = drawtextbox.onWarmupCompleted(str);
            if (i5 == 0) {
                int i6 = 83 / 0;
                if (aLCFaceValidationOnWarmupCompleted == null) {
                    aLCFaceValidationOnWarmupCompleted = ALCFaceValidation.WITHOUT_CONTENTS;
                }
            } else if (aLCFaceValidationOnWarmupCompleted == null) {
            }
        }
        return onextracallbackwithresult.onExtraCallbackWithResult(settext, aLCFaceValidationOnWarmupCompleted);
    }

    public void IAuthTabCallback(@NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        ArrayList arrayList = new ArrayList(onpreviewframeArrOnExtraCallback.length);
        int length = onpreviewframeArrOnExtraCallback.length;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = IAuthTabCallback_Parcel + 107;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.add(ReactNativeJsBridgeKt.IAuthTabCallback(onpreviewframeArrOnExtraCallback[i4], "TossReactMessageCallbackProxy", access8100.onNavigationEvent(getWrite.IAuthTabCallback("messageName", this.onWarmupCompleted))));
                i4 += 22;
            } else {
                arrayList.add(ReactNativeJsBridgeKt.IAuthTabCallback(onpreviewframeArrOnExtraCallback[i4], "TossReactMessageCallbackProxy", access8100.onNavigationEvent(getWrite.IAuthTabCallback("messageName", this.onWarmupCompleted))));
                i4++;
            }
        }
        String str = this.onWarmupCompleted;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(this, str, new Object[]{onpreviewframeArrOnExtraCallback}, "onSuccess", onNavigationEvent(str), false, 16, (Object) null);
        Callback callback = this.onTransact;
        Object[] array = arrayList.toArray(new Object[0]);
        callback.invoke(Arrays.copyOf(array, array.length));
    }

    public void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str != null) {
            Object[] objArr = new Object[1];
            a(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 7 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            writableNativeMap.putString(((String) objArr[0]).intern(), str);
        }
        if (str2 != null) {
            writableNativeMap.putString("code", str2);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int i2 = IAuthTabCallbackStubProxy + 77;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String key = entry.getKey();
            String value = entry.getValue();
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            if (Intrinsics.areEqual(key, ((String) objArr2[0]).intern()) || !(!Intrinsics.areEqual(key, "code"))) {
                throw new IllegalArgumentException(("extras 에 '" + key + "' 키 사용 금지 — onError(message, code) 전용 파라미터를 사용하세요.").toString());
            }
            int i4 = IAuthTabCallbackStubProxy + 3;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
                if (value != null) {
                    writableNativeMap.putString(key, value);
                } else {
                    writableNativeMap.putNull(key);
                }
            } else if (value != null) {
                writableNativeMap.putString(key, value);
            } else {
                writableNativeMap.putNull(key);
            }
        }
        String str3 = this.onWarmupCompleted;
        onNavigationEvent(str3, new Object[]{writableNativeMap}, "onError", onNavigationEvent(str3), true);
        this.IAuthTabCallbackStub.invoke(new Object[]{writableNativeMap});
        int i6 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(AdControlButtonb adControlButtonb, String str, Map map, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 77;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i4 + 107;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            map = null;
        }
        adControlButtonb.onExtraCallback(str, map);
    }

    public final void onExtraCallback(@NotNull String str, @Nullable Map<?, ?> map) throws Throwable {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.onNavigationEvent;
            if (rCTDeviceEventEmitter != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                Object[] objArr = new Object[1];
                a(7 - Color.alpha(0), Color.alpha(0) + 4, (char) (6926 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
                writableNativeMap.putString(((String) objArr[0]).intern(), str);
                writableNativeMap.putMap("params", map != null ? r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ.onWarmupCompleted(map) : null);
                Unit unit = Unit.INSTANCE;
                rCTDeviceEventEmitter.emit("appBridgeCallback", writableNativeMap);
                int i2 = IAuthTabCallbackStubProxy + 85;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "TossReactMessageCallbackProxy");
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("eventName", str);
            if (this.onNavigationEvent != null) {
                z = true;
            } else {
                int i4 = IAuthTabCallbackStubProxy + 93;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            convertFloatArrayToByteArray.onExtraCallbackWithResult("react_native_debug", "react_callback_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("hasEventEmitter", Boolean.valueOf(z)), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59697), 16 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 46134), 30 - TextUtils.lastIndexOf("", '0'), 20219 - ImageFormat.getBitsPerPixel(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, 1494 - View.resolveSize(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 101;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 49123), Color.alpha(0) + 44, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public void onNavigationEvent(@NotNull String str, @NotNull Object[] objArr, @Nullable String str2, @NotNull ALCFaceValidation aLCFaceValidation, boolean z) throws Throwable {
        Object next;
        AdControlButtonb adControlButtonb;
        Pair pairIAuthTabCallback;
        String str3;
        Pair pairIAuthTabCallback2;
        Object next2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(aLCFaceValidation, "");
        if (aLCFaceValidation == ALCFaceValidation.DISABLED) {
            return;
        }
        int i2 = IAuthTabCallback.onExtraCallback[aLCFaceValidation.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && z) {
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object arrayList2 : objArr) {
                    if (arrayList2 instanceof WritableNativeMap) {
                        arrayList2 = ((WritableNativeMap) arrayList2).toHashMap();
                    } else if (arrayList2 instanceof WritableArray) {
                        arrayList2 = ((WritableArray) arrayList2).toArrayList();
                    }
                    arrayList.add(arrayList2);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    while (it.hasNext()) {
                        next2 = next2 + ", " + it.next();
                    }
                } else {
                    next2 = null;
                }
                pairIAuthTabCallback2 = getWrite.IAuthTabCallback(next2, (Object) null);
            } else {
                pairIAuthTabCallback2 = getWrite.IAuthTabCallback((Object) null, (Object) null);
            }
            pairIAuthTabCallback = pairIAuthTabCallback2;
        } else {
            ArrayList arrayList3 = new ArrayList(objArr.length);
            for (Object arrayList4 : objArr) {
                if (arrayList4 instanceof WritableNativeMap) {
                    arrayList4 = ((WritableNativeMap) arrayList4).toHashMap();
                } else if (arrayList4 instanceof WritableArray) {
                    int i3 = IAuthTabCallbackStubProxy + 3;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList4 = ((WritableArray) arrayList4).toArrayList();
                }
                arrayList3.add(arrayList4);
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = next + ", " + it2.next();
                }
                adControlButtonb = this;
            } else {
                int i5 = IAuthTabCallbackStubProxy + 43;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                adControlButtonb = this;
                next = null;
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(next, adControlButtonb.asBinder.onNavigationEvent(true));
        }
        Object objOnExtraCallbackWithResult = pairIAuthTabCallback.onExtraCallbackWithResult();
        JsonObject jsonObject = (JsonObject) pairIAuthTabCallback.IAuthTabCallback();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (objOnExtraCallbackWithResult != null) {
            int i7 = IAuthTabCallbackStubProxy + 65;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                objOnExtraCallbackWithResult.toString();
                throw null;
            }
            String string = objOnExtraCallbackWithResult.toString();
            int i8 = IAuthTabCallback_Parcel + 101;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 4;
            }
            str3 = string;
        } else {
            str3 = null;
        }
        Object[] objArr2 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 7, TextUtils.indexOf((CharSequence) "", '0') + 5, (char) (View.MeasureSpec.getMode(0) + 6925), objArr2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a(11 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetAfter("", 0) + 6, (char) TextUtils.getTrimmedLength(""), objArr3);
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), str2), getWrite.IAuthTabCallback("params", jsonObject != null ? jsonObject.toString() : null)});
        if (jsonObject != null) {
            int i10 = IAuthTabCallbackStubProxy + 85;
            IAuthTabCallback_Parcel = i10 % 128;
            int i11 = i10 % 2;
            mapIAuthTabCallback.put("params", jsonObject.toString());
        }
        Unit unit = Unit.INSTANCE;
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, MotionEvent.axisFromString("") + 17, (char) (11142 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr4);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), str3, mapIAuthTabCallback, (String) null, false, (String) null, 56, (Object) null);
    }

    public void onNavigationEvent(@NotNull String str, @Nullable Map<?, ?> map) throws Throwable {
        Object obj;
        Object obj2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Map<?, ?> mapOnNavigationEvent = null;
        try {
            Result.Companion companion = Result.Companion;
            Map<String, Object> map2 = this.onExtraCallback;
            if (map2 != null) {
                obj2 = map2.get(str);
                int i2 = IAuthTabCallback_Parcel + 123;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            } else {
                obj2 = null;
            }
            String asString = obj2 instanceof String ? (String) obj2 : null;
            if (asString == null) {
                int i4 = IAuthTabCallbackStubProxy + 107;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    this.asBinder.onExtraCallbackWithResult().get(str);
                    mapOnNavigationEvent.hashCode();
                    throw null;
                }
                JsonElement jsonElement = this.asBinder.onExtraCallbackWithResult().get(str);
                if (jsonElement != null) {
                    asString = jsonElement.getAsString();
                    int i5 = IAuthTabCallbackStubProxy + 111;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    asString = null;
                }
            }
            obj = Result.constructor-impl(asString);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!Result.onExtraCallback(obj))) {
            int i7 = IAuthTabCallbackStubProxy + 61;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        if (map != null) {
            mapOnNavigationEvent = ReactNativeJsBridgeKt.onNavigationEvent(map, "TossReactMessageCallbackProxy", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("messageName", this.onWarmupCompleted), getWrite.IAuthTabCallback("callbackName", str)}));
            int i9 = IAuthTabCallbackStubProxy + 61;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
        }
        onExtraCallback(str2, mapOnNavigationEvent);
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = new char[]{60857, 19913, 44375, 3279, 27733, 53227, 12129, 63159, 22208, 46660, 6100, 60838, 19913, 44375, 3273, 27736, 53240, 50736, 26201, 34513, 10075, 18371, 58464, 1253, 42366, 50676, 25142, 33417, 8984, 17311, 57389, 173, 41276};
        asInterface = 2527999578150751660L;
    }
}
