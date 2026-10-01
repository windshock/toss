package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getByteBuffer<T> implements serializeRaw<T> {
    protected abstract void IAuthTabCallback(writeQuoted<? super T> writequoted);

    public static int IAuthTabCallbackDefault() {
        return JsonReaderUnknownNumberParsing.IAuthTabCallback();
    }

    public static <T, R> getByteBuffer<R> onExtraCallback(deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, serializeRaw<? extends T>... serializerawArr) {
        return onNavigationEvent(serializerawArr, deserializeintnullablecollection, i);
    }

    public static <T, R> getByteBuffer<R> onNavigationEvent(serializeRaw<? extends T>[] serializerawArr, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i) {
        floatExponent.onExtraCallbackWithResult(serializerawArr, "sources is null");
        if (serializerawArr.length == 0) {
            return onTransact();
        }
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "combiner is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallback(new getRelPc(serializerawArr, null, deserializeintnullablecollection, i << 1, false));
    }

    public static <T1, T2, R> getByteBuffer<R> onWarmupCompleted(serializeRaw<? extends T1> serializeraw, serializeRaw<? extends T2> serializeraw2, deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        return onExtraCallback(doubleExponent.onExtraCallbackWithResult(deserializefloatnullablecollection), IAuthTabCallbackDefault(), serializeraw, serializeraw2);
    }

    public static <T1, T2, T3, R> getByteBuffer<R> onWarmupCompleted(serializeRaw<? extends T1> serializeraw, serializeRaw<? extends T2> serializeraw2, serializeRaw<? extends T3> serializeraw3, deserializeLong<? super T1, ? super T2, ? super T3, ? extends R> deserializelong) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw3, "source3 is null");
        return onExtraCallback(doubleExponent.onWarmupCompleted(deserializelong), IAuthTabCallbackDefault(), serializeraw, serializeraw2, serializeraw3);
    }

    public static <T1, T2, T3, T4, T5, R> getByteBuffer<R> IAuthTabCallback(serializeRaw<? extends T1> serializeraw, serializeRaw<? extends T2> serializeraw2, serializeRaw<? extends T3> serializeraw3, serializeRaw<? extends T4> serializeraw4, serializeRaw<? extends T5> serializeraw5, deserializeIntArray<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> deserializeintarray) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw3, "source3 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw4, "source4 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw5, "source5 is null");
        return onExtraCallback(doubleExponent.onExtraCallback((deserializeIntArray) deserializeintarray), IAuthTabCallbackDefault(), serializeraw, serializeraw2, serializeraw3, serializeraw4, serializeraw5);
    }

    public static <T> getByteBuffer<T> onExtraCallbackWithResult(serializeRaw<? extends serializeRaw<? extends T>> serializeraw) {
        return IAuthTabCallback(serializeraw, IAuthTabCallbackDefault());
    }

    public static <T> getByteBuffer<T> IAuthTabCallback(serializeRaw<? extends serializeRaw<? extends T>> serializeraw, int i) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "sources is null");
        floatExponent.onExtraCallbackWithResult(i, "prefetch");
        return RxJavaPlugins.onExtraCallback(new getPc(serializeraw, doubleExponent.IAuthTabCallback(), i, getLogsCount.IMMEDIATE));
    }

    public static <T> getByteBuffer<T> onWarmupCompleted(serializeRaw<? extends T> serializeraw, serializeRaw<? extends T> serializeraw2) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        return onExtraCallback(serializeraw, serializeraw2);
    }

    public static <T> getByteBuffer<T> onExtraCallback(serializeRaw<? extends T>... serializerawArr) {
        if (serializerawArr.length == 0) {
            return onTransact();
        }
        if (serializerawArr.length == 1) {
            return IAuthTabCallback((serializeRaw) serializerawArr[0]);
        }
        return RxJavaPlugins.onExtraCallback(new getPc(onExtraCallbackWithResult((Object[]) serializerawArr), doubleExponent.IAuthTabCallback(), IAuthTabCallbackDefault(), getLogsCount.BOUNDARY));
    }

    public static <T> getByteBuffer<T> IAuthTabCallback(serializeObject<T> serializeobject) {
        floatExponent.onExtraCallbackWithResult(serializeobject, "source is null");
        return RxJavaPlugins.onExtraCallback(new access12000(serializeobject));
    }

    public static <T> getByteBuffer<T> onWarmupCompleted(Callable<? extends serializeRaw<? extends T>> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "supplier is null");
        return RxJavaPlugins.onExtraCallback(new access12100(callable));
    }

    public static <T> getByteBuffer<T> onTransact() {
        return RxJavaPlugins.onExtraCallback(setHumanReadableBytes.IAuthTabCallback);
    }

    public static <T> getByteBuffer<T> IAuthTabCallback(Callable<? extends Throwable> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "errorSupplier is null");
        return RxJavaPlugins.onExtraCallback(new clearMemoryError(callable));
    }

    public static <T> getByteBuffer<T> onExtraCallback(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "exception is null");
        return IAuthTabCallback((Callable<? extends Throwable>) doubleExponent.onExtraCallback(th));
    }

    public static <T> getByteBuffer<T> onExtraCallbackWithResult(T... tArr) {
        floatExponent.onExtraCallbackWithResult(tArr, "items is null");
        if (tArr.length == 0) {
            return onTransact();
        }
        if (tArr.length == 1) {
            return onWarmupCompleted(tArr[0]);
        }
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosFD(tArr));
    }

    public static <T> getByteBuffer<T> onExtraCallbackWithResult(Callable<? extends T> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "supplier is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new TombstoneProtosCauseDetailsCase(callable));
    }

    public static <T> getByteBuffer<T> onExtraCallback(Iterable<? extends T> iterable) {
        floatExponent.onExtraCallbackWithResult(iterable, "source is null");
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosCauseOrBuilder(iterable));
    }

    public static getByteBuffer<Long> onNavigationEvent(long j, long j2, TimeUnit timeUnit) {
        return onExtraCallback(j, j2, timeUnit, clearTid.onNavigationEvent());
    }

    public static getByteBuffer<Long> onExtraCallback(long j, long j2, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new access23800(Math.max(0L, j), Math.max(0L, j2), timeUnit, mapConverter));
    }

    public static getByteBuffer<Long> onNavigationEvent(long j, TimeUnit timeUnit) {
        return onExtraCallback(j, j, timeUnit, clearTid.onNavigationEvent());
    }

    public static getByteBuffer<Long> onExtraCallback(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return onExtraCallback(j, j, timeUnit, mapConverter);
    }

    public static <T> getByteBuffer<T> onWarmupCompleted(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "item is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access24700(t));
    }

    public static <T> getByteBuffer<T> onExtraCallback(serializeRaw<? extends T> serializeraw, serializeRaw<? extends T> serializeraw2) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        return onExtraCallbackWithResult((Object[]) new serializeRaw[]{serializeraw, serializeraw2}).IAuthTabCallback(doubleExponent.IAuthTabCallback(), false, 2);
    }

    public static <T> getByteBuffer<T> IAuthTabCallback(serializeRaw<? extends T> serializeraw, serializeRaw<? extends T> serializeraw2) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        return onExtraCallbackWithResult((Object[]) new serializeRaw[]{serializeraw, serializeraw2}).IAuthTabCallback(doubleExponent.IAuthTabCallback(), true, 2);
    }

    public static getByteBuffer<Integer> onWarmupCompleted(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return onTransact();
        }
        if (i2 == 1) {
            return onWarmupCompleted(Integer.valueOf(i));
        }
        if (i + (i2 - 1) > 2147483647L) {
            throw new IllegalArgumentException("Integer overflow");
        }
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new clearOwner(i, i2));
    }

    public static getByteBuffer<Long> onWarmupCompleted(long j, TimeUnit timeUnit) {
        return onWarmupCompleted(j, timeUnit, clearTid.onNavigationEvent());
    }

    public static getByteBuffer<Long> onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new access8600(Math.max(j, 0L), timeUnit, mapConverter));
    }

    public static <T> getByteBuffer<T> IAuthTabCallback(serializeRaw<T> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source is null");
        if (serializeraw instanceof getByteBuffer) {
            return RxJavaPlugins.onExtraCallback((getByteBuffer) serializeraw);
        }
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosCauseBuilder(serializeraw));
    }

    public static <T1, T2, R> getByteBuffer<R> onExtraCallback(serializeRaw<? extends T1> serializeraw, serializeRaw<? extends T2> serializeraw2, deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "source1 is null");
        floatExponent.onExtraCallbackWithResult(serializeraw2, "source2 is null");
        return onExtraCallback(doubleExponent.onExtraCallbackWithResult(deserializefloatnullablecollection), false, IAuthTabCallbackDefault(), serializeraw, serializeraw2);
    }

    public static <T, R> getByteBuffer<R> onExtraCallback(deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, boolean z, int i, serializeRaw<? extends T>... serializerawArr) {
        if (serializerawArr.length == 0) {
            return onTransact();
        }
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "zipper is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access9300(serializerawArr, (Iterable) null, deserializeintnullablecollection, i, z));
    }

    public final writeRaw<Boolean> onExtraCallback(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onNavigationEvent(new getFunctionOffset(this, deserializelongcollection));
    }

    public final writeRaw<Boolean> onExtraCallbackWithResult(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onNavigationEvent(new getFunctionNameBytes(this, deserializelongcollection));
    }

    public final T asInterface() {
        tryLongFromBigDecimal trylongfrombigdecimal = new tryLongFromBigDecimal();
        subscribe(trylongfrombigdecimal);
        T t = (T) trylongfrombigdecimal.IAuthTabCallback();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    public final getByteBuffer<List<T>> onExtraCallbackWithResult(int i) {
        return IAuthTabCallback(i, i);
    }

    public final getByteBuffer<List<T>> IAuthTabCallback(int i, int i2) {
        return (getByteBuffer<List<T>>) onExtraCallback(i, i2, getLogs.asCallable());
    }

    public final <U extends Collection<? super T>> getByteBuffer<U> onExtraCallback(int i, int i2, Callable<U> callable) {
        floatExponent.onExtraCallbackWithResult(i, "count");
        floatExponent.onExtraCallbackWithResult(i2, "skip");
        floatExponent.onExtraCallbackWithResult(callable, "bufferSupplier is null");
        return RxJavaPlugins.onExtraCallback(new getFileMapOffset(this, i, i2, callable));
    }

    public final getByteBuffer<List<T>> onNavigationEvent(long j, TimeUnit timeUnit, int i) {
        return onNavigationEvent(j, timeUnit, clearTid.onNavigationEvent(), i);
    }

    public final getByteBuffer<List<T>> onNavigationEvent(long j, TimeUnit timeUnit, MapConverter mapConverter, int i) {
        return (getByteBuffer<List<T>>) onNavigationEvent(j, timeUnit, mapConverter, i, getLogs.asCallable(), false);
    }

    public final <U extends Collection<? super T>> getByteBuffer<U> onNavigationEvent(long j, TimeUnit timeUnit, MapConverter mapConverter, int i, Callable<U> callable, boolean z) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        floatExponent.onExtraCallbackWithResult(callable, "bufferSupplier is null");
        floatExponent.onExtraCallbackWithResult(i, "count");
        return RxJavaPlugins.onExtraCallback(new getSp(this, j, j, timeUnit, mapConverter, callable, i, z));
    }

    public final <B> getByteBuffer<List<T>> onWarmupCompleted(serializeRaw<B> serializeraw) {
        return (getByteBuffer<List<T>>) IAuthTabCallback(serializeraw, getLogs.asCallable());
    }

    public final <B, U extends Collection<? super T>> getByteBuffer<U> IAuthTabCallback(serializeRaw<B> serializeraw, Callable<U> callable) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "boundary is null");
        floatExponent.onExtraCallbackWithResult(callable, "bufferSupplier is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new getFunctionName(this, serializeraw, callable));
    }

    public final <U> getByteBuffer<U> onExtraCallbackWithResult(Class<U> cls) {
        floatExponent.onExtraCallbackWithResult(cls, "clazz is null");
        return (getByteBuffer<U>) asInterface(doubleExponent.onExtraCallback((Class) cls));
    }

    public final <U> writeRaw<U> onExtraCallbackWithResult(Callable<? extends U> callable, deserializeDouble<? super U, ? super T> deserializedouble) {
        floatExponent.onExtraCallbackWithResult(callable, "initialValueSupplier is null");
        floatExponent.onExtraCallbackWithResult(deserializedouble, "collector is null");
        return RxJavaPlugins.onNavigationEvent(new TombstoneProtosBacktraceFrameBuilder(this, callable, deserializedouble));
    }

    public final <U> writeRaw<U> onExtraCallbackWithResult(U u, deserializeDouble<? super U, ? super T> deserializedouble) {
        floatExponent.onExtraCallbackWithResult(u, "initialValue is null");
        return onExtraCallbackWithResult((Callable) doubleExponent.onExtraCallback(u), (deserializeDouble) deserializedouble);
    }

    public final <R> getByteBuffer<R> onExtraCallback(MapConverter1<? super T, ? extends R> mapConverter1) {
        return IAuthTabCallback(((MapConverter1) floatExponent.onExtraCallbackWithResult(mapConverter1, "composer is null")).apply(this));
    }

    public final wasLastName onExtraCallback(deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        return IAuthTabCallback(deserializeintnullablecollection, 2);
    }

    public final wasLastName IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, int i) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        floatExponent.onExtraCallbackWithResult(i, "capacityHint");
        return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) new getBuildIdBytes(this, deserializeintnullablecollection, getLogsCount.IMMEDIATE, i));
    }

    public final getByteBuffer<T> onNavigationEvent(serializeRaw<? extends T> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return onWarmupCompleted(this, serializeraw);
    }

    public final writeRaw<Boolean> onExtraCallbackWithResult(Object obj) {
        floatExponent.onExtraCallbackWithResult(obj, "element is null");
        return onExtraCallbackWithResult((deserializeLongCollection) doubleExponent.IAuthTabCallback(obj));
    }

    public final getByteBuffer<T> onExtraCallback(long j, TimeUnit timeUnit) {
        return onExtraCallbackWithResult(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final getByteBuffer<T> onExtraCallbackWithResult(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosCause(this, j, timeUnit, mapConverter));
    }

    public final getByteBuffer<T> IAuthTabCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "defaultItem is null");
        return IAuthTabCallbackStub(onWarmupCompleted(t));
    }

    public final <U> getByteBuffer<T> onWarmupCompleted(deserializeIntNullableCollection<? super T, ? extends serializeRaw<U>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "itemDelay is null");
        return (getByteBuffer<T>) IAuthTabCallback((deserializeIntNullableCollection) access24000.onExtraCallbackWithResult(deserializeintnullablecollection));
    }

    public final getByteBuffer<T> IAuthTabCallback(long j, TimeUnit timeUnit) {
        return onExtraCallback(j, timeUnit, clearTid.onNavigationEvent(), false);
    }

    public final getByteBuffer<T> IAuthTabCallback(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return onExtraCallback(j, timeUnit, mapConverter, false);
    }

    public final getByteBuffer<T> onExtraCallback(long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new access12300(this, j, timeUnit, mapConverter, z));
    }

    public final <U> getByteBuffer<T> onExtraCallback(serializeRaw<U> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access12200(this, serializeraw));
    }

    public final getByteBuffer<T> onExtraCallbackWithResult(long j, TimeUnit timeUnit) {
        return onNavigationEvent(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final getByteBuffer<T> onNavigationEvent(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return onExtraCallback(onWarmupCompleted(j, timeUnit, mapConverter));
    }

    public final getByteBuffer<T> asBinder() {
        return onNavigationEvent((deserializeIntNullableCollection) doubleExponent.IAuthTabCallback());
    }

    public final <K> getByteBuffer<T> onNavigationEvent(deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "keySelector is null");
        return RxJavaPlugins.onExtraCallback(new access12700(this, deserializeintnullablecollection, floatExponent.onWarmupCompleted()));
    }

    public final getByteBuffer<T> onExtraCallbackWithResult(deserializeFloat<? super T> deserializefloat) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onAfterNext is null");
        return RxJavaPlugins.onExtraCallback(new clearDetails(this, deserializefloat));
    }

    public final getByteBuffer<T> onExtraCallback(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onFinally is null");
        return RxJavaPlugins.onExtraCallback(new access12600(this, deserializedecimalcollection));
    }

    public final getByteBuffer<T> onNavigationEvent(deserializeDecimalCollection deserializedecimalcollection) {
        return onWarmupCompleted(doubleExponent.onNavigationEvent(), deserializedecimalcollection);
    }

    public final getByteBuffer<T> onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection) {
        return onWarmupCompleted(doubleExponent.onNavigationEvent(), doubleExponent.onNavigationEvent(), deserializedecimalcollection, doubleExponent.onNavigationEvent);
    }

    private getByteBuffer<T> onWarmupCompleted(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onNext is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat2, "onError is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection2, "onAfterTerminate is null");
        return RxJavaPlugins.onExtraCallback(new access12400(this, deserializefloat, deserializefloat2, deserializedecimalcollection, deserializedecimalcollection2));
    }

    public final getByteBuffer<T> onNavigationEvent(deserializeFloat<? super Throwable> deserializefloat) {
        deserializeFloat<? super T> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
        deserializeDecimalCollection deserializedecimalcollection = doubleExponent.onNavigationEvent;
        return onWarmupCompleted(deserializefloatOnNavigationEvent, deserializefloat, deserializedecimalcollection, deserializedecimalcollection);
    }

    public final getByteBuffer<T> onWarmupCompleted(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat, deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onSubscribe is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onDispose is null");
        return RxJavaPlugins.onExtraCallback(new access12500(this, deserializefloat, deserializedecimalcollection));
    }

    public final getByteBuffer<T> onExtraCallback(deserializeFloat<? super T> deserializefloat) {
        deserializeFloat<? super Throwable> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
        deserializeDecimalCollection deserializedecimalcollection = doubleExponent.onNavigationEvent;
        return onWarmupCompleted(deserializefloat, deserializefloatOnNavigationEvent, deserializedecimalcollection, deserializedecimalcollection);
    }

    public final getByteBuffer<T> onWarmupCompleted(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        return onWarmupCompleted(deserializefloat, doubleExponent.onNavigationEvent);
    }

    public final getByteBuffer<T> IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onTerminate is null");
        return onWarmupCompleted(doubleExponent.onNavigationEvent(), doubleExponent.IAuthTabCallback(deserializedecimalcollection), deserializedecimalcollection, doubleExponent.onNavigationEvent);
    }

    public final advance<T> onNavigationEvent(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return RxJavaPlugins.IAuthTabCallback(new mergeMemoryError(this, j));
    }

    public final writeRaw<T> onExtraCallbackWithResult(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return RxJavaPlugins.onNavigationEvent(new setHumanReadable(this, j, null));
    }

    public final getByteBuffer<T> onWarmupCompleted(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallback(new setMemoryError(this, deserializelongcollection));
    }

    public final advance<T> IAuthTabCallbackStub() {
        return onNavigationEvent(0L);
    }

    public final writeRaw<T> access100() {
        return onExtraCallbackWithResult(0L);
    }

    public final <R> getByteBuffer<R> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection) {
        return onWarmupCompleted((deserializeIntNullableCollection) deserializeintnullablecollection, false);
    }

    public final <R> getByteBuffer<R> onWarmupCompleted(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection, boolean z) {
        return IAuthTabCallback(deserializeintnullablecollection, z, IntCompanionObject.MAX_VALUE);
    }

    public final <R> getByteBuffer<R> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection, boolean z, int i) {
        return IAuthTabCallback(deserializeintnullablecollection, z, i, IAuthTabCallbackDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> getByteBuffer<R> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection, boolean z, int i, int i2) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        floatExponent.onExtraCallbackWithResult(i, "maxConcurrency");
        floatExponent.onExtraCallbackWithResult(i2, "bufferSize");
        if (this instanceof parseNegativeNumber) {
            Object objCall = ((parseNegativeNumber) this).call();
            if (objCall == null) {
                return onTransact();
            }
            return getOwner.onExtraCallbackWithResult(objCall, deserializeintnullablecollection);
        }
        return RxJavaPlugins.onExtraCallback(new getHumanReadable(this, deserializeintnullablecollection, z, i, i2));
    }

    public final <R> getByteBuffer<R> onExtraCallbackWithResult(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection, int i) {
        return IAuthTabCallback(deserializeintnullablecollection, false, i, IAuthTabCallbackDefault());
    }

    public final <U, R> getByteBuffer<R> onWarmupCompleted(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection, deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection) {
        return onExtraCallbackWithResult(deserializeintnullablecollection, deserializefloatnullablecollection, false, IAuthTabCallbackDefault(), IAuthTabCallbackDefault());
    }

    public final <U, R> getByteBuffer<R> onExtraCallbackWithResult(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection, deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection, boolean z, int i, int i2) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        floatExponent.onExtraCallbackWithResult(deserializefloatnullablecollection, "combiner is null");
        return IAuthTabCallback(access24000.onExtraCallbackWithResult(deserializeintnullablecollection, deserializefloatnullablecollection), z, i, i2);
    }

    public final wasLastName onExtraCallbackWithResult(deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        return IAuthTabCallback((deserializeIntNullableCollection) deserializeintnullablecollection, false);
    }

    public final wasLastName IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new getDetailsCase(this, deserializeintnullablecollection, z));
    }

    public final <R> getByteBuffer<R> IAuthTabCallbackDefault(deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection) {
        return onNavigationEvent((deserializeIntNullableCollection) deserializeintnullablecollection, false);
    }

    public final <R> getByteBuffer<R> onNavigationEvent(deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection, boolean z) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onExtraCallback(new getMemoryError(this, deserializeintnullablecollection, z));
    }

    public final getByteBuffer<T> getInterfaceDescriptor() {
        return RxJavaPlugins.onExtraCallback(new access24100(this));
    }

    public final wasLastName access000() {
        return RxJavaPlugins.onExtraCallbackWithResult(new access23900(this));
    }

    public final <R> getByteBuffer<R> asInterface(deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onExtraCallback(new access24600(this, deserializeintnullablecollection));
    }

    public final getByteBuffer<T> asBinder(serializeRaw<? extends T> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return onExtraCallback(this, serializeraw);
    }

    public final getByteBuffer<T> onExtraCallbackWithResult(MapConverter mapConverter) {
        return onWarmupCompleted(mapConverter, false, IAuthTabCallbackDefault());
    }

    public final getByteBuffer<T> onWarmupCompleted(MapConverter mapConverter, boolean z, int i) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallback(new access24400(this, mapConverter, z, i));
    }

    public final <U> getByteBuffer<U> onWarmupCompleted(Class<U> cls) {
        floatExponent.onExtraCallbackWithResult(cls, "clazz is null");
        return onWarmupCompleted((deserializeLongCollection) doubleExponent.onExtraCallbackWithResult(cls)).onExtraCallbackWithResult((Class) cls);
    }

    public final getByteBuffer<T> onTransact(deserializeIntNullableCollection<? super Throwable, ? extends serializeRaw<? extends T>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "resumeFunction is null");
        return RxJavaPlugins.onExtraCallback(new access24300(this, deserializeintnullablecollection, false));
    }

    public final getByteBuffer<T> asBinder(deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "valueSupplier is null");
        return RxJavaPlugins.onExtraCallback(new access24500(this, deserializeintnullablecollection));
    }

    public final access26800<T> IAuthTabCallback_Parcel() {
        return clearFd.asInterface(this);
    }

    public final <R> getByteBuffer<R> IAuthTabCallbackStub(deserializeIntNullableCollection<? super getByteBuffer<T>, ? extends serializeRaw<R>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "selector is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access24800(this, deserializeintnullablecollection));
    }

    public final getByteBuffer<T> IAuthTabCallback_Parcel(deserializeIntNullableCollection<? super getByteBuffer<Object>, ? extends serializeRaw<?>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "handler is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new setOwnerBytes(this, deserializeintnullablecollection));
    }

    public final getByteBuffer<T> asInterface(long j, TimeUnit timeUnit) {
        return asInterface(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final getByteBuffer<T> asInterface(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new setPathBytes(this, j, timeUnit, mapConverter, false));
    }

    public final getByteBuffer<T> IAuthTabCallbackStubProxy() {
        return IAuthTabCallback_Parcel().onWarmupCompleted();
    }

    public final advance<T> readTypedObject() {
        return RxJavaPlugins.IAuthTabCallback((advance) new setOwner(this));
    }

    public final writeRaw<T> extraCallback() {
        return RxJavaPlugins.onNavigationEvent(new getPathBytes(this, null));
    }

    public final getByteBuffer<T> IAuthTabCallback(long j) {
        if (j <= 0) {
            return RxJavaPlugins.onExtraCallback(this);
        }
        return RxJavaPlugins.onExtraCallback(new getOwnerBytes(this, j));
    }

    public final getByteBuffer<T> onNavigationEvent(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosHeapObject(this, deserializelongcollection));
    }

    public final getByteBuffer<T> IAuthTabCallbackDefault(serializeRaw<? extends T> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return onExtraCallback(serializeraw, this);
    }

    public final getByteBuffer<T> onNavigationEvent(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "item is null");
        return onExtraCallback(onWarmupCompleted(t), this);
    }

    public final deserializeUriNullableCollection extraCallbackWithResult() {
        return onNavigationEvent(doubleExponent.onNavigationEvent(), doubleExponent.access100, doubleExponent.onNavigationEvent, doubleExponent.onNavigationEvent());
    }

    public final deserializeUriNullableCollection IAuthTabCallback(deserializeFloat<? super T> deserializefloat) {
        return onNavigationEvent(deserializefloat, doubleExponent.access100, doubleExponent.onNavigationEvent, doubleExponent.onNavigationEvent());
    }

    public final deserializeUriNullableCollection onExtraCallbackWithResult(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2) {
        return onNavigationEvent(deserializefloat, deserializefloat2, doubleExponent.onNavigationEvent, doubleExponent.onNavigationEvent());
    }

    public final deserializeUriNullableCollection onWarmupCompleted(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection) {
        return onNavigationEvent(deserializefloat, deserializefloat2, deserializedecimalcollection, doubleExponent.onNavigationEvent());
    }

    public final deserializeUriNullableCollection onNavigationEvent(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat3) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onNext is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat2, "onError is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat3, "onSubscribe is null");
        NumberConverter1 numberConverter1 = new NumberConverter1(deserializefloat, deserializefloat2, deserializedecimalcollection, deserializefloat3);
        subscribe(numberConverter1);
        return numberConverter1;
    }

    @Override // o.serializeRaw
    public final void subscribe(writeQuoted<? super T> writequoted) {
        floatExponent.onExtraCallbackWithResult(writequoted, "observer is null");
        try {
            writeQuoted<? super T> writequotedOnNavigationEvent = RxJavaPlugins.onNavigationEvent(this, writequoted);
            floatExponent.onExtraCallbackWithResult(writequotedOnNavigationEvent, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            IAuthTabCallback((writeQuoted) writequotedOnNavigationEvent);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final getByteBuffer<T> onNavigationEvent(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosFDOrBuilder(this, mapConverter));
    }

    public final getByteBuffer<T> IAuthTabCallbackStub(serializeRaw<? extends T> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new TombstoneProtosFDBuilder(this, serializeraw));
    }

    public final getByteBuffer<T> onExtraCallback(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j);
        }
        return RxJavaPlugins.onExtraCallback(new access10300(this, j));
    }

    public final <U> getByteBuffer<T> onTransact(serializeRaw<U> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access10400(this, serializeraw));
    }

    public final getByteBuffer<T> IAuthTabCallback(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "stopPredicate is null");
        return RxJavaPlugins.onExtraCallback(new access10000(this, deserializelongcollection));
    }

    public final getByteBuffer<T> onTransact(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallback(new access10100(this, deserializelongcollection));
    }

    public final getByteBuffer<T> onTransact(long j, TimeUnit timeUnit) {
        return asBinder(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final getByteBuffer<T> asBinder(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new access10200(this, j, timeUnit, mapConverter));
    }

    public final getByteBuffer<T> IAuthTabCallbackStub(long j, TimeUnit timeUnit) {
        return asInterface(j, timeUnit);
    }

    public final getByteBuffer<T> IAuthTabCallbackDefault(long j, TimeUnit timeUnit) {
        return onWarmupCompleted(j, timeUnit, clearTid.onNavigationEvent(), false);
    }

    public final getByteBuffer<T> onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access10600(this, j, timeUnit, mapConverter, z));
    }

    public final getByteBuffer<T> asBinder(long j, TimeUnit timeUnit) {
        return onExtraCallback(j, timeUnit, (serializeRaw) null, clearTid.onNavigationEvent());
    }

    private getByteBuffer<T> onExtraCallback(long j, TimeUnit timeUnit, serializeRaw<? extends T> serializeraw, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "timeUnit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback(new access10500(this, j, timeUnit, mapConverter, serializeraw));
    }

    public final writeRaw<List<T>> writeTypedObject() {
        return onExtraCallback(16);
    }

    public final writeRaw<List<T>> onExtraCallback(int i) {
        floatExponent.onExtraCallbackWithResult(i, "capacityHint");
        return RxJavaPlugins.onNavigationEvent(new access8700(this, i));
    }

    public final <K, V> writeRaw<Map<K, V>> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends K> deserializeintnullablecollection, deserializeIntNullableCollection<? super T, ? extends V> deserializeintnullablecollection2) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "keySelector is null");
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection2, "valueSelector is null");
        return (writeRaw<Map<K, V>>) onExtraCallbackWithResult((Callable) access26300.asCallable(), (deserializeDouble) doubleExponent.onExtraCallback(deserializeintnullablecollection, deserializeintnullablecollection2));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(wasNull wasnull) {
        XmlConverter1 xmlConverter1 = new XmlConverter1(this);
        int i = AnonymousClass2.onWarmupCompleted[wasnull.ordinal()];
        if (i == 1) {
            return xmlConverter1.IAuthTabCallbackStubProxy();
        }
        if (i == 2) {
            return xmlConverter1.access100();
        }
        if (i == 3) {
            return xmlConverter1;
        }
        if (i == 4) {
            return RxJavaPlugins.onExtraCallbackWithResult(new isInRange(xmlConverter1));
        }
        return xmlConverter1.access000();
    }

    /* renamed from: o.getByteBuffer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[wasNull.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[wasNull.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[wasNull.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[wasNull.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[wasNull.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final getByteBuffer<T> onWarmupCompleted(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new access9200(this, mapConverter));
    }

    public final <U, R> getByteBuffer<R> IAuthTabCallback(serializeRaw<? extends U> serializeraw, deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return onExtraCallback(this, serializeraw, deserializefloatnullablecollection);
    }
}
