package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import io.grpc.Channel;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import j$.time.Duration;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import o.instantiatePlugin;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class findPlugin {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final getSpanId IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static char asBinder;
    private static int asInterface;
    private static final URI onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    final setEventStoreEmptyCallback<beforeValue> onExtraCallback;
    private getSpanId onWarmupCompleted;

    public static /* synthetic */ findTimestampInFilename onExtraCallbackWithResult(findTimestampInFilename findtimestampinfilename) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return findtimestampinfilename;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        onExtraCallbackWithResult = URI.create("http://localhost:4317");
        IAuthTabCallback = getSpanId.REUSABLE_DATA;
        int i = onTransact + 63;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    findPlugin(setEventStoreEmptyCallback<beforeValue> seteventstoreemptycallback, getSpanId getspanid) {
        this.onExtraCallback = seteventstoreemptycallback;
        this.onWarmupCompleted = getspanid;
        Objects.requireNonNull(seteventstoreemptycallback);
        loadPluginInternal.onNavigationEvent(new OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda1(seteventstoreemptycallback));
    }

    findPlugin() {
        this(new setEventStoreEmptyCallback("otlp", "log", 10L, onExtraCallbackWithResult, new OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0(), "/opentelemetry.proto.collector.logs.v1.LogsService/Export"), IAuthTabCallback);
    }

    public static /* synthetic */ BiFunction onExtraCallbackWithResult() {
        int i = 2 % 2;
        BiFunction biFunction = new BiFunction() { // from class: io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return instantiatePlugin.onWarmupCompleted((Channel) obj, (String) obj2);
            }
        };
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return biFunction;
    }

    public findPlugin onNavigationEvent(Duration duration) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{4, 1, 3, 2, 5, 6, 13811}, (byte) (5 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.red(0) + 7, objArr);
        Objects.requireNonNull(duration, ((String) objArr[0]).intern());
        this.onExtraCallback.onWarmupCompleted(duration);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public findPlugin onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(str, "endpoint");
        this.onExtraCallback.onExtraCallbackWithResult(str);
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public findPlugin onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(str, "compressionMethod");
        this.onExtraCallback.IAuthTabCallback(createEmptyANR.onExtraCallback(str));
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public findPlugin onExtraCallbackWithResult(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onNavigationEvent(bArr);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return this;
    }

    public findPlugin onWarmupCompleted(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onExtraCallbackWithResult(bArr, bArr2);
        if (i3 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public findPlugin onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onExtraCallbackWithResult(str, str2);
        int i4 = asInterface + 21;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public findPlugin onNavigationEvent(@Nullable RetryPolicy retryPolicy) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.onWarmupCompleted(retryPolicy);
            int i3 = 50 / 0;
        } else {
            this.onExtraCallback.onWarmupCompleted(retryPolicy);
        }
        int i4 = IAuthTabCallbackDefault + 101;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public findPlugin IAuthTabCallback(Supplier<findTimestampInFilename> supplier) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(supplier, "meterProviderSupplier");
        this.onExtraCallback.IAuthTabCallback(supplier);
        int i4 = asInterface + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return this;
    }

    public findPlugin IAuthTabCallback(getSpanId getspanid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(getspanid, "memoryMode");
            this.onWarmupCompleted = getspanid;
            int i3 = IAuthTabCallbackDefault + 83;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }
        Objects.requireNonNull(getspanid, "memoryMode");
        this.onWarmupCompleted = getspanid;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onNavigationEvent;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 41;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), View.resolveSize(0, 0) + 26, (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asBinder)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 74 - View.MeasureSpec.getMode(0), 8089 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), 30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 19488 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i6 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i6];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i7 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i7];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i8];
                                } else {
                                    int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i9];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                                }
                            }
                            int i11 = $10 + 93;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i13 = 0;
            while (i13 < i) {
                cArr4[i13] = (char) (cArr4[i13] ^ 13722);
                i13++;
                int i14 = $11 + 71;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    public OnSessionCallback onWarmupCompleted() {
        int i = 2 % 2;
        setEventStoreEmptyCallback<beforeValue> seteventstoreemptycallback = this.onExtraCallback;
        OnSessionCallback onSessionCallback = new OnSessionCallback(seteventstoreemptycallback, seteventstoreemptycallback.onExtraCallbackWithResult(), this.onWarmupCompleted);
        int i2 = IAuthTabCallbackDefault + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onSessionCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{64982, 64967, 65065, 64988, 65067, 64990, 65064, 64986, 64966};
        asBinder = (char) 51242;
    }
}
