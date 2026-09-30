package io.reactivex.plugins;

import java.util.concurrent.Callable;
import o.JsonReaderDoublePrecision;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.NetConverter4;
import o.access26100;
import o.access26800;
import o.advance;
import o.approximateDouble;
import o.deserializeDecimal;
import o.deserializeDecimalNullableCollection;
import o.deserializeDoubleCollection;
import o.deserializeDoubleNullableCollection;
import o.deserializeFloat;
import o.deserializeFloatNullableCollection;
import o.deserializeIntNullableCollection;
import o.deserializeIpNullableCollection;
import o.ensureCapacity;
import o.floatExponent;
import o.getByteBuffer;
import o.wasLastName;
import o.writeQuoted;
import o.writeRaw;
import o.ycxExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxJavaPlugins {
    static volatile boolean IAuthTabCallback;
    static volatile deserializeIntNullableCollection<? super MapConverter, ? extends MapConverter> IAuthTabCallbackDefault;
    static volatile deserializeIntNullableCollection<? super access26800, ? extends access26800> IAuthTabCallbackStub;
    static volatile deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> IAuthTabCallbackStubProxy;
    static volatile deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> IAuthTabCallback_Parcel;
    static volatile deserializeIntNullableCollection<? super MapConverter, ? extends MapConverter> ICustomTabsCallback;
    static volatile deserializeFloatNullableCollection<? super JsonReaderUnknownNumberParsing, ? super ycxExternalSyntheticLambda0, ? extends ycxExternalSyntheticLambda0> access000;
    static volatile deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> access100;
    static volatile deserializeIntNullableCollection<? super deserializeDoubleCollection, ? extends deserializeDoubleCollection> asBinder;
    static volatile deserializeFloatNullableCollection<? super wasLastName, ? super JsonReaderDoublePrecision, ? extends JsonReaderDoublePrecision> asInterface;
    static volatile deserializeFloatNullableCollection<? super getByteBuffer, ? super writeQuoted, ? extends writeQuoted> extraCallback;
    static volatile deserializeIntNullableCollection<? super getByteBuffer, ? extends getByteBuffer> extraCallbackWithResult;
    static volatile deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> getInterfaceDescriptor;
    static volatile deserializeIntNullableCollection<? super Runnable, ? extends Runnable> onActivityLayout;
    static volatile deserializeFloatNullableCollection<? super writeRaw, ? super deserializeIpNullableCollection, ? extends deserializeIpNullableCollection> onActivityResized;
    static volatile deserializeFloat<? super Throwable> onExtraCallback;
    static volatile deserializeDoubleNullableCollection onExtraCallbackWithResult;
    static volatile deserializeIntNullableCollection<? super MapConverter, ? extends MapConverter> onMessageChannelReady;
    static volatile deserializeIntNullableCollection<? super writeRaw, ? extends writeRaw> onMinimized;
    static volatile deserializeIntNullableCollection<? super wasLastName, ? extends wasLastName> onNavigationEvent;
    static volatile deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing, ? extends JsonReaderUnknownNumberParsing> onTransact;
    static volatile boolean onWarmupCompleted;
    static volatile deserializeFloatNullableCollection<? super advance, ? super ensureCapacity, ? extends ensureCapacity> readTypedObject;
    static volatile deserializeIntNullableCollection<? super advance, ? extends advance> writeTypedObject;

    public static boolean onNavigationEvent() {
        return IAuthTabCallback;
    }

    public static MapConverter onWarmupCompleted(Callable<MapConverter> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "Scheduler Callable can't be null");
        deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> deserializeintnullablecollection = getInterfaceDescriptor;
        if (deserializeintnullablecollection == null) {
            return onNavigationEvent(callable);
        }
        return onNavigationEvent(deserializeintnullablecollection, callable);
    }

    public static MapConverter onExtraCallbackWithResult(Callable<MapConverter> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "Scheduler Callable can't be null");
        deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> deserializeintnullablecollection = access100;
        if (deserializeintnullablecollection == null) {
            return onNavigationEvent(callable);
        }
        return onNavigationEvent(deserializeintnullablecollection, callable);
    }

    public static MapConverter IAuthTabCallback(Callable<MapConverter> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "Scheduler Callable can't be null");
        deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> deserializeintnullablecollection = IAuthTabCallbackStubProxy;
        if (deserializeintnullablecollection == null) {
            return onNavigationEvent(callable);
        }
        return onNavigationEvent(deserializeintnullablecollection, callable);
    }

    public static MapConverter onExtraCallback(Callable<MapConverter> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "Scheduler Callable can't be null");
        deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> deserializeintnullablecollection = IAuthTabCallback_Parcel;
        if (deserializeintnullablecollection == null) {
            return onNavigationEvent(callable);
        }
        return onNavigationEvent(deserializeintnullablecollection, callable);
    }

    public static MapConverter onExtraCallback(MapConverter mapConverter) {
        deserializeIntNullableCollection<? super MapConverter, ? extends MapConverter> deserializeintnullablecollection = IAuthTabCallbackDefault;
        return deserializeintnullablecollection == null ? mapConverter : (MapConverter) onWarmupCompleted(deserializeintnullablecollection, mapConverter);
    }

    public static void onExtraCallbackWithResult(Throwable th) {
        deserializeFloat<? super Throwable> deserializefloat = onExtraCallback;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!onNavigationEvent(th)) {
            th = new deserializeDecimalNullableCollection(th);
        }
        if (deserializefloat != null) {
            try {
                deserializefloat.accept(th);
                return;
            } catch (Throwable th2) {
                IAuthTabCallback(th2);
            }
        }
        IAuthTabCallback(th);
    }

    static boolean onNavigationEvent(Throwable th) {
        return (th instanceof approximateDouble) || (th instanceof NetConverter4) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof deserializeDecimal);
    }

    static void IAuthTabCallback(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static MapConverter onNavigationEvent(MapConverter mapConverter) {
        deserializeIntNullableCollection<? super MapConverter, ? extends MapConverter> deserializeintnullablecollection = ICustomTabsCallback;
        return deserializeintnullablecollection == null ? mapConverter : (MapConverter) onWarmupCompleted(deserializeintnullablecollection, mapConverter);
    }

    public static Runnable onNavigationEvent(Runnable runnable) {
        floatExponent.onExtraCallbackWithResult(runnable, "run is null");
        deserializeIntNullableCollection<? super Runnable, ? extends Runnable> deserializeintnullablecollection = onActivityLayout;
        return deserializeintnullablecollection == null ? runnable : (Runnable) onWarmupCompleted(deserializeintnullablecollection, runnable);
    }

    public static MapConverter onWarmupCompleted(MapConverter mapConverter) {
        deserializeIntNullableCollection<? super MapConverter, ? extends MapConverter> deserializeintnullablecollection = onMessageChannelReady;
        return deserializeintnullablecollection == null ? mapConverter : (MapConverter) onWarmupCompleted(deserializeintnullablecollection, mapConverter);
    }

    public static void onWarmupCompleted(deserializeFloat<? super Throwable> deserializefloat) {
        if (onWarmupCompleted) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        onExtraCallback = deserializefloat;
    }

    public static <T> ycxExternalSyntheticLambda0<? super T> onNavigationEvent(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        deserializeFloatNullableCollection<? super JsonReaderUnknownNumberParsing, ? super ycxExternalSyntheticLambda0, ? extends ycxExternalSyntheticLambda0> deserializefloatnullablecollection = access000;
        return deserializefloatnullablecollection != null ? (ycxExternalSyntheticLambda0) onNavigationEvent(deserializefloatnullablecollection, jsonReaderUnknownNumberParsing, ycxexternalsyntheticlambda0) : ycxexternalsyntheticlambda0;
    }

    public static <T> writeQuoted<? super T> onNavigationEvent(getByteBuffer<T> getbytebuffer, writeQuoted<? super T> writequoted) {
        deserializeFloatNullableCollection<? super getByteBuffer, ? super writeQuoted, ? extends writeQuoted> deserializefloatnullablecollection = extraCallback;
        return deserializefloatnullablecollection != null ? (writeQuoted) onNavigationEvent(deserializefloatnullablecollection, getbytebuffer, writequoted) : writequoted;
    }

    public static <T> deserializeIpNullableCollection<? super T> onExtraCallbackWithResult(writeRaw<T> writeraw, deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        deserializeFloatNullableCollection<? super writeRaw, ? super deserializeIpNullableCollection, ? extends deserializeIpNullableCollection> deserializefloatnullablecollection = onActivityResized;
        return deserializefloatnullablecollection != null ? (deserializeIpNullableCollection) onNavigationEvent(deserializefloatnullablecollection, writeraw, deserializeipnullablecollection) : deserializeipnullablecollection;
    }

    public static JsonReaderDoublePrecision IAuthTabCallback(wasLastName waslastname, JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        deserializeFloatNullableCollection<? super wasLastName, ? super JsonReaderDoublePrecision, ? extends JsonReaderDoublePrecision> deserializefloatnullablecollection = asInterface;
        return deserializefloatnullablecollection != null ? (JsonReaderDoublePrecision) onNavigationEvent(deserializefloatnullablecollection, waslastname, jsonReaderDoublePrecision) : jsonReaderDoublePrecision;
    }

    public static <T> ensureCapacity<? super T> onExtraCallback(advance<T> advanceVar, ensureCapacity<? super T> ensurecapacity) {
        deserializeFloatNullableCollection<? super advance, ? super ensureCapacity, ? extends ensureCapacity> deserializefloatnullablecollection = readTypedObject;
        return deserializefloatnullablecollection != null ? (ensureCapacity) onNavigationEvent(deserializefloatnullablecollection, advanceVar, ensurecapacity) : ensurecapacity;
    }

    public static <T> advance<T> IAuthTabCallback(advance<T> advanceVar) {
        deserializeIntNullableCollection<? super advance, ? extends advance> deserializeintnullablecollection = writeTypedObject;
        return deserializeintnullablecollection != null ? (advance) onWarmupCompleted(deserializeintnullablecollection, advanceVar) : advanceVar;
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing, ? extends JsonReaderUnknownNumberParsing> deserializeintnullablecollection = onTransact;
        return deserializeintnullablecollection != null ? (JsonReaderUnknownNumberParsing) onWarmupCompleted(deserializeintnullablecollection, jsonReaderUnknownNumberParsing) : jsonReaderUnknownNumberParsing;
    }

    public static <T> deserializeDoubleCollection<T> onExtraCallbackWithResult(deserializeDoubleCollection<T> deserializedoublecollection) {
        deserializeIntNullableCollection<? super deserializeDoubleCollection, ? extends deserializeDoubleCollection> deserializeintnullablecollection = asBinder;
        return deserializeintnullablecollection != null ? (deserializeDoubleCollection) onWarmupCompleted(deserializeintnullablecollection, deserializedoublecollection) : deserializedoublecollection;
    }

    public static <T> getByteBuffer<T> onExtraCallback(getByteBuffer<T> getbytebuffer) {
        deserializeIntNullableCollection<? super getByteBuffer, ? extends getByteBuffer> deserializeintnullablecollection = extraCallbackWithResult;
        return deserializeintnullablecollection != null ? (getByteBuffer) onWarmupCompleted(deserializeintnullablecollection, getbytebuffer) : getbytebuffer;
    }

    public static <T> access26800<T> onNavigationEvent(access26800<T> access26800Var) {
        deserializeIntNullableCollection<? super access26800, ? extends access26800> deserializeintnullablecollection = IAuthTabCallbackStub;
        return deserializeintnullablecollection != null ? (access26800) onWarmupCompleted(deserializeintnullablecollection, access26800Var) : access26800Var;
    }

    public static <T> writeRaw<T> onNavigationEvent(writeRaw<T> writeraw) {
        deserializeIntNullableCollection<? super writeRaw, ? extends writeRaw> deserializeintnullablecollection = onMinimized;
        return deserializeintnullablecollection != null ? (writeRaw) onWarmupCompleted(deserializeintnullablecollection, writeraw) : writeraw;
    }

    public static wasLastName onExtraCallbackWithResult(wasLastName waslastname) {
        deserializeIntNullableCollection<? super wasLastName, ? extends wasLastName> deserializeintnullablecollection = onNavigationEvent;
        return deserializeintnullablecollection != null ? (wasLastName) onWarmupCompleted(deserializeintnullablecollection, waslastname) : waslastname;
    }

    public static boolean onWarmupCompleted() {
        deserializeDoubleNullableCollection deserializedoublenullablecollection = onExtraCallbackWithResult;
        if (deserializedoublenullablecollection == null) {
            return false;
        }
        try {
            return deserializedoublenullablecollection.onExtraCallback();
        } catch (Throwable th) {
            throw access26100.onExtraCallback(th);
        }
    }

    static <T, R> R onWarmupCompleted(deserializeIntNullableCollection<T, R> deserializeintnullablecollection, T t) {
        try {
            return deserializeintnullablecollection.apply(t);
        } catch (Throwable th) {
            throw access26100.onExtraCallback(th);
        }
    }

    static <T, U, R> R onNavigationEvent(deserializeFloatNullableCollection<T, U, R> deserializefloatnullablecollection, T t, U u) {
        try {
            return deserializefloatnullablecollection.apply(t, u);
        } catch (Throwable th) {
            throw access26100.onExtraCallback(th);
        }
    }

    static MapConverter onNavigationEvent(Callable<MapConverter> callable) {
        try {
            return (MapConverter) floatExponent.onExtraCallbackWithResult(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw access26100.onExtraCallback(th);
        }
    }

    static MapConverter onNavigationEvent(deserializeIntNullableCollection<? super Callable<MapConverter>, ? extends MapConverter> deserializeintnullablecollection, Callable<MapConverter> callable) {
        return (MapConverter) floatExponent.onExtraCallbackWithResult(onWarmupCompleted(deserializeintnullablecollection, callable), "Scheduler Callable result can't be null");
    }

    private RxJavaPlugins() {
        throw new IllegalStateException("No instances!");
    }
}
