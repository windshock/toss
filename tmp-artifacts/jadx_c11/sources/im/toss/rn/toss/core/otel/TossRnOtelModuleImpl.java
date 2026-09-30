package im.toss.rn.toss.core.otel;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import im.toss.rn.toss.core.otel.TossRnOtelModuleImpl$;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;
import o.r8lambdaPcakGlZym5OTGf4csKw85UwHVwY;
import o.r8lambdabY91hhYb9fPgpR0NsA2iU1y9Gc;
import o.r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossRnOtelModuleImpl extends NativeTossRnOtelModuleSpec {
    public static final onExtraCallbackWithResult Companion;
    private static final String MISSING_BRIDGE_MESSAGE = "TossRnOtelModule 의 native bridge 가 미주입 상태입니다 - host 의 TossRnOtelBridgeInstaller.install() 배선을 확인하세요";
    private static volatile r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE bridge;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = s2 + 4;
        int i3 = (b * 4) + 105;
        int i4 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 = (-i3) + i5;
            i = i6;
            int i7 = i2;
            int i8 = i3;
            bArr2[i] = (byte) i8;
            i6 = i + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            int i9 = i7 + 1;
            i2 = i9;
            i3 = bArr[i9];
            i5 = i8;
            i3 = (-i3) + i5;
            i = i6;
            int i72 = i2;
            int i82 = i3;
            bArr2[i] = (byte) i82;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            int i722 = i2;
            int i822 = i3;
            bArr2[i] = (byte) i822;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ Unit $r8$lambda$tNvATsK5eoG_hVACevCVTOG7Gsg(AtomicBoolean atomicBoolean, Promise promise, int i, Map map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            exportOtlp$lambda$2(atomicBoolean, promise, i, map);
            throw null;
        }
        Unit unitExportOtlp$lambda$2 = exportOtlp$lambda$2(atomicBoolean, promise, i, map);
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExportOtlp$lambda$2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$zv9PsovwICGKmIh2AYW1uOhFtFE(AtomicBoolean atomicBoolean, Promise promise, String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExportOtlp$lambda$3 = exportOtlp$lambda$3(atomicBoolean, promise, str, str2);
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExportOtlp$lambda$3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult = 0;
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = onExtraCallback + 61;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE getBridge() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = Companion;
        if (i3 != 0) {
            return onextracallbackwithresult.IAuthTabCallback();
        }
        onextracallbackwithresult.IAuthTabCallback();
        throw null;
    }

    public static final void setBridge(@Nullable r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1ze) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Companion.IAuthTabCallback(r8lambdafydl62igeg3pgzskft5exc3p1ze);
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossRnOtelModuleImpl(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
    }

    public static final /* synthetic */ r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE access$getBridge$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return bridge;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setBridge$cp(r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1ze) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        bridge = r8lambdafydl62igeg3pgzskft5exc3p1ze;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    protected Map<String, Object> getTypedExportedConstants() {
        Map<String, Object> mapIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Pair[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback("moduleVersion", "1.0.0");
            mapIAuthTabCallback = access8100.IAuthTabCallback(pairArr);
        } else {
            mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("moduleVersion", "1.0.0")});
        }
        int i3 = onNavigationEvent + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldSample(@NotNull ReadableMap readableMap) {
        String string;
        String string2;
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(readableMap, "");
        r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1zeRequireBridge = requireBridge();
        if (readableMap.hasKey("serviceName")) {
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            string = readableMap.getString("serviceName");
            if (string == null) {
                int i4 = onNavigationEvent + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                string = "";
            }
        }
        if (readableMap.hasKey("route") && (string2 = readableMap.getString("route")) != null) {
            str = string2;
        }
        return r8lambdafydl62igeg3pgzskft5exc3p1zeRequireBridge.onExtraCallbackWithResult(string, str);
    }

    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    public boolean shouldExportMetric() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = requireBridge().onWarmupCompleted();
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[PHI: r5
      0x0046: PHI (r5v12 java.lang.String) = (r5v8 java.lang.String), (r5v13 java.lang.String) binds: [B:15:0x003a, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WritableMap getCurrentNativeContext() {
        String strIAuthTabCallback;
        int iOnExtraCallback;
        String strOnNavigationEvent;
        int i = 2 % 2;
        r8lambdaPcakGlZym5OTGf4csKw85UwHVwY r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent = requireBridge().onNavigationEvent();
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = "";
        if (r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent == null || (strIAuthTabCallback = r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent.IAuthTabCallback()) == null) {
            strIAuthTabCallback = "";
        }
        writableMapCreateMap.putString("traceId", strIAuthTabCallback);
        if (r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent != null) {
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                strOnNavigationEvent = r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent.onNavigationEvent();
                int i3 = 3 / 0;
                if (strOnNavigationEvent == null) {
                    int i4 = IAuthTabCallback + 25;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    str = strOnNavigationEvent;
                }
            } else {
                strOnNavigationEvent = r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent.onNavigationEvent();
                if (strOnNavigationEvent == null) {
                }
            }
        }
        writableMapCreateMap.putString("spanId", str);
        if (r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent != null) {
            int i6 = IAuthTabCallback + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iOnExtraCallback = r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent.onExtraCallback();
        } else {
            int i8 = IAuthTabCallback + 95;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            iOnExtraCallback = 0;
        }
        writableMapCreateMap.putDouble("traceFlags", iOnExtraCallback);
        writableMapCreateMap.putBoolean("isRemote", r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent != null ? r8lambdapcakglzym5otgf4cskw85uwhvwyOnNavigationEvent.onExtraCallbackWithResult() : false);
        return writableMapCreateMap;
    }

    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    public WritableMap getNativeResource() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            r8lambdabY91hhYb9fPgpR0NsA2iU1y9Gc.IAuthTabCallback(requireBridge().onExtraCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WritableMap writableMapIAuthTabCallback = r8lambdabY91hhYb9fPgpR0NsA2iU1y9Gc.IAuthTabCallback(requireBridge().onExtraCallback());
        int i3 = onNavigationEvent + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return writableMapIAuthTabCallback;
    }

    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    public void exportOtlp(@NotNull String str, @NotNull String str2, @NotNull ReadableMap readableMap, @NotNull Promise promise) throws Throwable {
        String string;
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1ze = bridge;
        if (r8lambdafydl62igeg3pgzskft5exc3p1ze == null) {
            promise.reject("bridge_missing", MISSING_BRIDGE_MESSAGE);
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.makeMeasureSpec(0, 0) + 3, TextUtils.getCapsMode("", 0, 0) + 1, new char[]{4, 65531, 1}, true, 312 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String str3 = null;
            if (readableMap.hasKey(((String) objArr[0]).intern())) {
                Object[] objArr2 = new Object[1];
                a(3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{4, 65531, 1}, true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 313, objArr2);
                string = readableMap.getString(((String) objArr2[0]).intern());
            } else {
                string = null;
            }
            if (string != null && string.length() != 0) {
                str3 = string;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 2 - View.resolveSizeAndState(0, 0, 0), new char[]{'\n', 11, 0, 65533, 65529, 65532, 65533}, false, ((Process.getThreadPriority(0) + 20) >> 6) + 303, objArr3);
            if (readableMap.hasKey(((String) objArr3[0]).intern())) {
                Object[] objArr4 = new Object[1];
                a(7 - TextUtils.getOffsetBefore("", 0), MotionEvent.axisFromString("") + 3, new char[]{'\n', 11, 0, 65533, 65529, 65532, 65533}, false, 303 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
                ReadableMap map = readableMap.getMap(((String) objArr4[0]).intern());
                if (map != null) {
                    ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
                    while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                        int i2 = onNavigationEvent + 101;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                        String string2 = map.getString(strNextKey);
                        if (string2 != null) {
                            linkedHashMap.put(strNextKey, string2);
                        }
                    }
                }
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            try {
                Intrinsics.checkNotNull(bArrDecode);
                z = true;
                try {
                    r8lambdafydl62igeg3pgzskft5exc3p1ze.onExtraCallbackWithResult(str, bArrDecode, str3, linkedHashMap, new TossRnOtelModuleImpl$.ExternalSyntheticLambda0(atomicBoolean, promise), new TossRnOtelModuleImpl$.ExternalSyntheticLambda1(atomicBoolean, promise));
                } catch (Throwable th) {
                    th = th;
                    if (atomicBoolean.compareAndSet(false, z)) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "exportOtlp bridge call failed";
                        }
                        promise.reject("transport_error", message);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        } catch (IllegalArgumentException e) {
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "invalid base64 OTLP payload";
            }
            promise.reject("decode_error", message2);
            int i4 = IAuthTabCallback + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit exportOtlp$lambda$2(AtomicBoolean atomicBoolean, Promise promise, int i, Map map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (atomicBoolean.compareAndSet(false, true)) {
            int i5 = onNavigationEvent + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("status", i);
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, KeyEvent.keyCodeFromString("") + 2, new char[]{'\n', 11, 0, 65533, 65529, 65532, 65533}, false, TextUtils.getCapsMode("", 0, 0) + 303, objArr);
            writableMapCreateMap.putMap(((String) objArr[0]).intern(), r8lambdabY91hhYb9fPgpR0NsA2iU1y9Gc.IAuthTabCallback(map));
            promise.resolve(writableMapCreateMap);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 23;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit exportOtlp$lambda$3(AtomicBoolean atomicBoolean, Promise promise, String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (atomicBoolean.compareAndSet(false, true)) {
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            promise.reject(str, str2);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // im.toss.rn.toss.core.otel.NativeTossRnOtelModuleSpec
    public double getTimeOffsetMs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1zeRequireBridge = requireBridge();
        if (i3 != 0) {
            return r8lambdafydl62igeg3pgzskft5exc3p1zeRequireBridge.IAuthTabCallback();
        }
        r8lambdafydl62igeg3pgzskft5exc3p1zeRequireBridge.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE requireBridge() {
        int i = 2 % 2;
        r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1ze = bridge;
        if (r8lambdafydl62igeg3pgzskft5exc3p1ze == null) {
            throw new IllegalStateException(MISSING_BRIDGE_MESSAGE);
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdafydl62igeg3pgzskft5exc3p1ze;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1zeAccess$getBridge$cp = TossRnOtelModuleImpl.access$getBridge$cp();
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return r8lambdafydl62igeg3pgzskft5exc3p1zeAccess$getBridge$cp;
            }
            throw null;
        }

        public final void IAuthTabCallback(@Nullable r8lambdafydL62IGEG3PGZSkFT5ExC3p1ZE r8lambdafydl62igeg3pgzskft5exc3p1ze) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossRnOtelModuleImpl.access$setBridge$cp(r8lambdafydl62igeg3pgzskft5exc3p1ze);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf("", "", 0) + 23, 10277 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), 55 - KeyEvent.keyCodeFromString(""), 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $10 + 63;
                $11 = i9 % 128;
                int i10 = i9 % 2;
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
                int i11 = $11 + 125;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12843), 54 - TextUtils.indexOf("", c), (ViewConfiguration.getScrollBarSize() >> 8) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                c = '0';
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 478309102;
    }
}
