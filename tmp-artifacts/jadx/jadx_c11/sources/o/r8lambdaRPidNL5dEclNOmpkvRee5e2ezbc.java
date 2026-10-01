package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.rn.toss.core.common.bridge.ReactNativeJsBridgeKt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceValidation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc implements setOnOutOfMemeryErrorCallback {
    private static final IAuthTabCallback Companion;
    private static int access000;
    private static long asInterface;
    private static char[] onTransact;
    private final JsonObject IAuthTabCallback;
    private final Function1<Object[], Unit> IAuthTabCallbackDefault;
    private final Function1<Pair<String, String>, Unit> IAuthTabCallbackStub;
    private final setText asBinder;
    private final drawTextBox onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final Function2<String, Map<?, ?>, Unit> onWarmupCompleted;
    private static final byte[] $$a = {102, -86, -98, 53};
    private static final int $$b = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallback_Parcel = 0;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[ALCFaceValidation.values().length];
            try {
                iArr[ALCFaceValidation.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ALCFaceValidation.WITHOUT_CONTENTS.ordinal()] = 2;
                int i = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i4 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = 97 - (i2 * 4);
        int i7 = b * 2;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i5;
            int i10 = 0;
            i5 += -i6;
            i4 = i9;
            i3 = i10;
            int i11 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i10 = i3 + 1;
            if (i3 == i8) {
                return new String(bArr2, 0);
            }
            i9 = i11;
            i6 = bArr[i11];
            i5 += -i6;
            i4 = i9;
            i3 = i10;
            int i112 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i10 = i3 + 1;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i6;
            int i1122 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i10 = i3 + 1;
            if (i3 == i8) {
            }
        }
    }

    static {
        access000 = 1;
        onExtraCallbackWithResult();
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallback_Parcel + 107;
        access000 = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    public void onNavigationEvent(@NotNull String str, @NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc(@NotNull String str, @NotNull JsonObject jsonObject, @NotNull Function1<? super Object[], Unit> function1, @NotNull Function1<? super Pair<String, String>, Unit> function12, @Nullable Map<String, ? extends Object> map, @Nullable Function2<? super String, ? super Map<?, ?>, Unit> function2, @Nullable drawTextBox drawtextbox) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = jsonObject;
        this.IAuthTabCallbackDefault = function1;
        this.IAuthTabCallbackStub = function12;
        this.onNavigationEvent = map;
        this.onWarmupCompleted = function2;
        this.onExtraCallback = drawtextbox;
        this.asBinder = new setText(jsonObject);
    }

    private final ALCFaceValidation onExtraCallback(String str) {
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult = ALCFaceValidation.Companion;
            throw null;
        }
        ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult2 = ALCFaceValidation.Companion;
        setText settext = this.asBinder;
        drawTextBox drawtextbox = this.onExtraCallback;
        if (drawtextbox == null || (aLCFaceValidationOnWarmupCompleted = drawtextbox.onWarmupCompleted(str)) == null) {
            aLCFaceValidationOnWarmupCompleted = ALCFaceValidation.WITHOUT_CONTENTS;
        }
        ALCFaceValidation aLCFaceValidationOnExtraCallbackWithResult = onextracallbackwithresult2.onExtraCallbackWithResult(settext, aLCFaceValidationOnWarmupCompleted);
        int i3 = getInterfaceDescriptor + 11;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return aLCFaceValidationOnExtraCallbackWithResult;
        }
        throw null;
    }

    public void IAuthTabCallback(@NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        ArrayList arrayList = new ArrayList(onpreviewframeArrOnExtraCallback.length);
        int length = onpreviewframeArrOnExtraCallback.length;
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = getInterfaceDescriptor + 103;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.add(ReactNativeJsBridgeKt.IAuthTabCallback(onpreviewframeArrOnExtraCallback[i4], "GraniteMessageCallbackProxy", access8100.onNavigationEvent(getWrite.IAuthTabCallback("messageName", this.onExtraCallbackWithResult))));
                i4 += 42;
            } else {
                arrayList.add(ReactNativeJsBridgeKt.IAuthTabCallback(onpreviewframeArrOnExtraCallback[i4], "GraniteMessageCallbackProxy", access8100.onNavigationEvent(getWrite.IAuthTabCallback("messageName", this.onExtraCallbackWithResult))));
                i4++;
            }
        }
        String str = this.onExtraCallbackWithResult;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(this, str, new Object[]{onpreviewframeArrOnExtraCallback}, "onSuccess", onExtraCallback(str), false, 16, (Object) null);
        this.IAuthTabCallbackDefault.invoke(arrayList.toArray(new Object[0]));
    }

    public void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str3 = this.onExtraCallbackWithResult;
        onNavigationEvent(str3, new Object[]{str, str2, map}, "onError", onExtraCallback(str3), true);
        if (!map.isEmpty()) {
            this.IAuthTabCallbackStub.invoke(getWrite.IAuthTabCallback("ON_ERROR", ALCFaceBox.onWarmupCompleted(str, str2, map).toString()));
            return;
        }
        int i4 = getInterfaceDescriptor + 113;
        int i5 = i4 % 128;
        access100 = i5;
        int i6 = i4 % 2;
        Function1<Pair<String, String>, Unit> function1 = this.IAuthTabCallbackStub;
        if (str2 == null) {
            int i7 = i5 + 51;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        function1.invoke(getWrite.IAuthTabCallback(str2, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWarmupCompleted(r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc r8lambdarpidnl5declnompkvree5e2ezbc, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 51;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 99;
            getInterfaceDescriptor = i6 % 128;
            map = null;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
        r8lambdarpidnl5declnompkvree5e2ezbc.onWarmupCompleted(str, map);
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable Map<?, ?> map) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Function2<String, Map<?, ?>, Unit> function2 = this.onWarmupCompleted;
            if (function2 != null) {
                function2.invoke(str, map);
                return;
            }
            int i3 = getInterfaceDescriptor + 113;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("GraniteMessageCallbackProxy", "react_callback_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("eventName", str), getWrite.IAuthTabCallback("hasCallback", Boolean.valueOf(this.onWarmupCompleted != null)), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onTransact[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 59697), (ViewConfiguration.getScrollBarSize() >> 8) + 17, 10973 - View.resolveSize(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asInterface), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46134), 31 - Color.green(0), 20220 - (ViewConfiguration.getJumpTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 49075), 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1493 - ExpandableListView.getPackedPositionChild(0L), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $10 + 67;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1494 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 - 1);
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123), 44 - Color.green(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr);
        int i6 = $11 + 83;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public void onNavigationEvent(@NotNull String str, @NotNull Object[] objArr, @Nullable String str2, @NotNull ALCFaceValidation aLCFaceValidation, boolean z) throws Throwable {
        r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc r8lambdarpidnl5declnompkvree5e2ezbc;
        Object next;
        Pair pairIAuthTabCallback;
        String string;
        Pair pairIAuthTabCallback2;
        Object next2;
        int i = 2 % 2;
        int i2 = access100 + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(aLCFaceValidation, "");
        if (aLCFaceValidation == ALCFaceValidation.DISABLED) {
            return;
        }
        int i4 = onWarmupCompleted.IAuthTabCallback[aLCFaceValidation.ordinal()];
        String string2 = null;
        if (i4 != 1) {
            if (i4 == 2 && z) {
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object arrayList2 : objArr) {
                    int i5 = getInterfaceDescriptor;
                    int i6 = i5 + 13;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    if (arrayList2 instanceof WritableNativeMap) {
                        arrayList2 = ((WritableNativeMap) arrayList2).toHashMap();
                    } else if (arrayList2 instanceof WritableArray) {
                        int i8 = i5 + 77;
                        access100 = i8 % 128;
                        if (i8 % 2 != 0) {
                            ((WritableArray) arrayList2).toArrayList();
                            throw null;
                        }
                        arrayList2 = ((WritableArray) arrayList2).toArrayList();
                    } else {
                        continue;
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
                    int i9 = access100 + 93;
                    getInterfaceDescriptor = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
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
                    int i10 = getInterfaceDescriptor + 53;
                    access100 = i10 % 128;
                    if (i10 % 2 != 0) {
                        ((WritableNativeMap) arrayList4).toHashMap();
                        throw null;
                    }
                    arrayList4 = ((WritableNativeMap) arrayList4).toHashMap();
                } else if (arrayList4 instanceof WritableArray) {
                    arrayList4 = ((WritableArray) arrayList4).toArrayList();
                }
                arrayList3.add(arrayList4);
            }
            Iterator it2 = arrayList3.iterator();
            if (!(!it2.hasNext())) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = next + ", " + it2.next();
                }
                r8lambdarpidnl5declnompkvree5e2ezbc = this;
            } else {
                int i11 = access100 + 103;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
                r8lambdarpidnl5declnompkvree5e2ezbc = this;
                next = null;
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(next, r8lambdarpidnl5declnompkvree5e2ezbc.asBinder.onNavigationEvent(true));
        }
        Object objOnExtraCallbackWithResult = pairIAuthTabCallback.onExtraCallbackWithResult();
        JsonObject jsonObject = (JsonObject) pairIAuthTabCallback.IAuthTabCallback();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (objOnExtraCallbackWithResult != null) {
            int i13 = access100 + 115;
            getInterfaceDescriptor = i13 % 128;
            if (i13 % 2 == 0) {
                objOnExtraCallbackWithResult.toString();
                throw null;
            }
            string = objOnExtraCallbackWithResult.toString();
        } else {
            string = null;
        }
        Object[] objArr2 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") + 4, (char) View.resolveSize(0, 0), objArr2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, 6 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19064), objArr3);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), str2);
        if (jsonObject != null) {
            string2 = jsonObject.toString();
            int i14 = getInterfaceDescriptor + 27;
            access100 = i14 % 128;
            int i15 = i14 % 2;
        }
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("params", string2)});
        if (jsonObject != null) {
            mapIAuthTabCallback.put("params", jsonObject.toString());
        }
        Unit unit = Unit.INSTANCE;
        Object[] objArr4 = new Object[1];
        a(10 - View.MeasureSpec.getSize(0), 16 - Color.blue(0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), string, mapIAuthTabCallback, (String) null, false, (String) null, 56, (Object) null);
    }

    public void onNavigationEvent(@NotNull String str, @Nullable Map<?, ?> map) {
        Object obj;
        String asString;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            Map<String, Object> map2 = this.onNavigationEvent;
            Object obj2 = map2 != null ? map2.get(str) : null;
            if (!(obj2 instanceof String)) {
                asString = null;
            } else {
                int i4 = getInterfaceDescriptor + 21;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    map.hashCode();
                    throw null;
                }
                asString = (String) obj2;
            }
            if (asString == null) {
                JsonElement jsonElement = this.asBinder.onExtraCallbackWithResult().get(str);
                if (jsonElement != null) {
                    int i5 = getInterfaceDescriptor + 67;
                    access100 = i5 % 128;
                    if (i5 % 2 != 0) {
                        jsonElement.getAsString();
                        map.hashCode();
                        throw null;
                    }
                    asString = jsonElement.getAsString();
                } else {
                    asString = null;
                }
            }
            obj = Result.constructor-impl(asString);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i6 = getInterfaceDescriptor + 97;
            int i7 = i6 % 128;
            access100 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 69;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        onWarmupCompleted(str2, map != null ? ReactNativeJsBridgeKt.onNavigationEvent(map, "GraniteMessageCallbackProxy", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("messageName", this.onExtraCallbackWithResult), getWrite.IAuthTabCallback("callbackName", str)})) : null);
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static void onExtraCallbackWithResult() {
        onTransact = new char[]{60858, 34708, 14843, 54226, 42975, 52713, 29596, 39355, 3909, 46460, 60853, 34693, 14822, 54229, 17698, 65304, 37238, 2900, 48313, 22178, 51446, 25310, 5174, 36381, 8310, 55902};
        asInterface = -1636249887349045259L;
    }
}
