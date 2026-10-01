package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class writeRaw<T> implements deserializeIp<T> {
    protected abstract void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection);

    public static <T> writeRaw<T> onNavigationEvent(NetConverter<T> netConverter) {
        floatExponent.onExtraCallbackWithResult(netConverter, "source is null");
        return RxJavaPlugins.onNavigationEvent(new access9000(netConverter));
    }

    public static <T> writeRaw<T> IAuthTabCallback(Callable<? extends deserializeIp<? extends T>> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "singleSupplier is null");
        return RxJavaPlugins.onNavigationEvent((writeRaw) new access8900(callable));
    }

    public static <T> writeRaw<T> onExtraCallbackWithResult(Callable<? extends Throwable> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "errorSupplier is null");
        return RxJavaPlugins.onNavigationEvent(new addAllAllocationBacktrace(callable));
    }

    public static <T> writeRaw<T> onExtraCallbackWithResult(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "exception is null");
        return onExtraCallbackWithResult((Callable<? extends Throwable>) doubleExponent.onExtraCallback(th));
    }

    public static <T> writeRaw<T> onNavigationEvent(Callable<? extends T> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "callable is null");
        return RxJavaPlugins.onNavigationEvent(new clearAllocationBacktrace(callable));
    }

    public static <T> writeRaw<T> onExtraCallback(Future<? extends T> future) {
        return onWarmupCompleted(JsonReaderUnknownNumberParsing.onExtraCallback((Future) future));
    }

    public static <T> writeRaw<T> onExtraCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "item is null");
        return RxJavaPlugins.onNavigationEvent(new clearAllocationTid(t));
    }

    public static <T> writeRaw<T> onExtraCallback() {
        return RxJavaPlugins.onNavigationEvent(clearSize.onExtraCallbackWithResult);
    }

    public static writeRaw<Long> onExtraCallback(long j, TimeUnit timeUnit) {
        return IAuthTabCallback(j, timeUnit, clearTid.onNavigationEvent());
    }

    public static writeRaw<Long> IAuthTabCallback(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onNavigationEvent(new setAllocationTid(j, timeUnit, mapConverter));
    }

    public static <T> writeRaw<T> onNavigationEvent(deserializeIp<T> deserializeip) {
        floatExponent.onExtraCallbackWithResult(deserializeip, "source is null");
        if (deserializeip instanceof writeRaw) {
            return RxJavaPlugins.onNavigationEvent((writeRaw) deserializeip);
        }
        return RxJavaPlugins.onNavigationEvent(new clearAddress(deserializeip));
    }

    public static <T, R> writeRaw<R> IAuthTabCallback(Iterable<? extends deserializeIp<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "zipper is null");
        floatExponent.onExtraCallbackWithResult(iterable, "sources is null");
        return RxJavaPlugins.onNavigationEvent(new getAllocationBacktraceList(iterable, deserializeintnullablecollection));
    }

    public static <T1, T2, R> writeRaw<R> IAuthTabCallback(deserializeIp<? extends T1> deserializeip, deserializeIp<? extends T2> deserializeip2, deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeip, "source1 is null");
        floatExponent.onExtraCallbackWithResult(deserializeip2, "source2 is null");
        return onExtraCallbackWithResult(doubleExponent.onExtraCallbackWithResult(deserializefloatnullablecollection), deserializeip, deserializeip2);
    }

    public static <T1, T2, T3, R> writeRaw<R> IAuthTabCallback(deserializeIp<? extends T1> deserializeip, deserializeIp<? extends T2> deserializeip2, deserializeIp<? extends T3> deserializeip3, deserializeLong<? super T1, ? super T2, ? super T3, ? extends R> deserializelong) {
        floatExponent.onExtraCallbackWithResult(deserializeip, "source1 is null");
        floatExponent.onExtraCallbackWithResult(deserializeip2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(deserializeip3, "source3 is null");
        return onExtraCallbackWithResult(doubleExponent.onWarmupCompleted(deserializelong), deserializeip, deserializeip2, deserializeip3);
    }

    public static <T1, T2, T3, T4, R> writeRaw<R> onExtraCallbackWithResult(deserializeIp<? extends T1> deserializeip, deserializeIp<? extends T2> deserializeip2, deserializeIp<? extends T3> deserializeip3, deserializeIp<? extends T4> deserializeip4, deserializeInt<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> deserializeint) {
        floatExponent.onExtraCallbackWithResult(deserializeip, "source1 is null");
        floatExponent.onExtraCallbackWithResult(deserializeip2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(deserializeip3, "source3 is null");
        floatExponent.onExtraCallbackWithResult(deserializeip4, "source4 is null");
        return onExtraCallbackWithResult(doubleExponent.onExtraCallbackWithResult(deserializeint), deserializeip, deserializeip2, deserializeip3, deserializeip4);
    }

    public static <T, R> writeRaw<R> onExtraCallbackWithResult(deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, deserializeIp<? extends T>... deserializeipArr) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "zipper is null");
        floatExponent.onExtraCallbackWithResult(deserializeipArr, "sources is null");
        if (deserializeipArr.length == 0) {
            return onExtraCallbackWithResult(new NoSuchElementException());
        }
        return RxJavaPlugins.onNavigationEvent(new setAddress(deserializeipArr, deserializeintnullablecollection));
    }

    public final <R> writeRaw<R> IAuthTabCallback(deserializeUri<? super T, ? extends R> deserializeuri) {
        return onNavigationEvent(((deserializeUri) floatExponent.onExtraCallbackWithResult(deserializeuri, "transformer is null")).apply(this));
    }

    public final <U> writeRaw<U> onExtraCallback(Class<? extends U> cls) {
        floatExponent.onExtraCallbackWithResult(cls, "clazz is null");
        return (writeRaw<U>) onWarmupCompleted((deserializeIntNullableCollection) doubleExponent.onExtraCallback((Class) cls));
    }

    public final writeRaw<T> IAuthTabCallback(long j, TimeUnit timeUnit) {
        return onWarmupCompleted(j, timeUnit, clearTid.onNavigationEvent(), false);
    }

    public final writeRaw<T> onNavigationEvent(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return onWarmupCompleted(j, timeUnit, mapConverter, false);
    }

    public final writeRaw<T> onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onNavigationEvent(new access9100(this, j, timeUnit, mapConverter, z));
    }

    public final <U> writeRaw<T> onNavigationEvent(serializeRaw<U> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "other is null");
        return RxJavaPlugins.onNavigationEvent((writeRaw) new access9700(this, serializeraw));
    }

    public final writeRaw<T> onExtraCallbackWithResult(long j, TimeUnit timeUnit) {
        return onExtraCallbackWithResult(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final writeRaw<T> onExtraCallbackWithResult(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return onNavigationEvent(getByteBuffer.onWarmupCompleted(j, timeUnit, mapConverter));
    }

    public final writeRaw<T> onNavigationEvent(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onAfterTerminate is null");
        return RxJavaPlugins.onNavigationEvent((writeRaw) new access9800(this, deserializedecimalcollection));
    }

    public final writeRaw<T> onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onFinally is null");
        return RxJavaPlugins.onNavigationEvent(new access9600(this, deserializedecimalcollection));
    }

    public final writeRaw<T> onExtraCallback(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onSubscribe is null");
        return RxJavaPlugins.onNavigationEvent(new addAllocationBacktrace(this, deserializefloat));
    }

    public final writeRaw<T> onNavigationEvent(deserializeFloat<? super T> deserializefloat) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onSuccess is null");
        return RxJavaPlugins.onNavigationEvent(new addAllDeallocationBacktrace(this, deserializefloat));
    }

    public final writeRaw<T> onWarmupCompleted(deserializeFloat<? super Throwable> deserializefloat) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onError is null");
        return RxJavaPlugins.onNavigationEvent(new access9500(this, deserializefloat));
    }

    public final advance<T> onExtraCallbackWithResult(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.IAuthTabCallback(new clearFileName(this, deserializelongcollection));
    }

    public final <R> writeRaw<R> onExtraCallbackWithResult(deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onNavigationEvent(new access9900(this, deserializeintnullablecollection));
    }

    public final <R> advance<R> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends writeAscii<? extends R>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.IAuthTabCallback((advance) new clearDeallocationTid(this, deserializeintnullablecollection));
    }

    public final <R> getByteBuffer<R> onExtraCallback(deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onExtraCallback(new setRelPc(this, deserializeintnullablecollection));
    }

    public final wasLastName onNavigationEvent(deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new addDeallocationBacktrace(this, deserializeintnullablecollection));
    }

    public final T onNavigationEvent() {
        write4 write4Var = new write4();
        IAuthTabCallback(write4Var);
        return (T) write4Var.onExtraCallbackWithResult();
    }

    public final <R> writeRaw<R> onWarmupCompleted(deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onNavigationEvent(new clearDeallocationBacktrace(this, deserializeintnullablecollection));
    }

    public final writeRaw<T> IAuthTabCallback(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onNavigationEvent(new ensureAllocationBacktraceIsMutable(this, mapConverter));
    }

    public final writeRaw<T> asInterface(deserializeIntNullableCollection<Throwable, ? extends T> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "resumeFunction is null");
        return RxJavaPlugins.onNavigationEvent(new ensureDeallocationBacktraceIsMutable(this, deserializeintnullablecollection, null));
    }

    public final writeRaw<T> onWarmupCompleted(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "value is null");
        return RxJavaPlugins.onNavigationEvent(new ensureDeallocationBacktraceIsMutable(this, null, t));
    }

    public final writeRaw<T> asBinder(deserializeIntNullableCollection<? super Throwable, ? extends deserializeIp<? extends T>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "resumeFunctionInCaseOfError is null");
        return RxJavaPlugins.onNavigationEvent(new removeDeallocationBacktrace(this, deserializeintnullablecollection));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallbackDefault(deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Object>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        return bG_().asInterface(deserializeintnullablecollection);
    }

    public final writeRaw<T> IAuthTabCallback(long j) {
        return onWarmupCompleted((JsonReaderUnknownNumberParsing) bG_().IAuthTabCallback(j));
    }

    public final writeRaw<T> IAuthTabCallbackStub(deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Throwable>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        return onWarmupCompleted((JsonReaderUnknownNumberParsing) bG_().IAuthTabCallbackStub(deserializeintnullablecollection));
    }

    public final deserializeUriNullableCollection IAuthTabCallback() {
        return onNavigationEvent(doubleExponent.onNavigationEvent(), doubleExponent.access100);
    }

    public final deserializeUriNullableCollection onNavigationEvent(deserializeDouble<? super T, ? super Throwable> deserializedouble) {
        floatExponent.onExtraCallbackWithResult(deserializedouble, "onCallback is null");
        read4 read4Var = new read4(deserializedouble);
        IAuthTabCallback(read4Var);
        return read4Var;
    }

    public final deserializeUriNullableCollection onExtraCallbackWithResult(deserializeFloat<? super T> deserializefloat) {
        return onNavigationEvent(deserializefloat, doubleExponent.access100);
    }

    public final deserializeUriNullableCollection onNavigationEvent(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onSuccess is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat2, "onError is null");
        writeBuf writebuf = new writeBuf(deserializefloat, deserializefloat2);
        IAuthTabCallback(writebuf);
        return writebuf;
    }

    @Override // o.deserializeIp
    public final void IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeipnullablecollection, "observer is null");
        deserializeIpNullableCollection<? super T> deserializeipnullablecollectionOnExtraCallbackWithResult = RxJavaPlugins.onExtraCallbackWithResult(this, deserializeipnullablecollection);
        floatExponent.onExtraCallbackWithResult(deserializeipnullablecollectionOnExtraCallbackWithResult, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            onExtraCallbackWithResult(deserializeipnullablecollectionOnExtraCallbackWithResult);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final writeRaw<T> onNavigationEvent(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onNavigationEvent(new removeAllocationBacktrace(this, mapConverter));
    }

    public final writeRaw<T> onWarmupCompleted(long j, TimeUnit timeUnit) {
        return IAuthTabCallback(j, timeUnit, clearTid.onNavigationEvent(), (deserializeIp) null);
    }

    public final writeRaw<T> onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return IAuthTabCallback(j, timeUnit, mapConverter, (deserializeIp) null);
    }

    private writeRaw<T> IAuthTabCallback(long j, TimeUnit timeUnit, MapConverter mapConverter, deserializeIp<? extends T> deserializeip) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onNavigationEvent(new setDeallocationTid(this, j, timeUnit, mapConverter, deserializeip));
    }

    public final wasLastName bI_() {
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter24(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonReaderUnknownNumberParsing<T> bG_() {
        if (this instanceof parseLongGeneric) {
            return ((parseLongGeneric) this).onExtraCallbackWithResult();
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new setDeallocationBacktrace(this));
    }

    public final advance<T> asInterface() {
        if (this instanceof numberException) {
            return ((numberException) this).onExtraCallback();
        }
        return RxJavaPlugins.IAuthTabCallback((advance) new clearBuildId(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getByteBuffer<T> IAuthTabCallbackStub() {
        if (this instanceof parseNegativeDecimal) {
            return ((parseNegativeDecimal) this).onWarmupCompleted();
        }
        return RxJavaPlugins.onExtraCallback(new setAllocationBacktrace(this));
    }

    public final <U, R> writeRaw<R> onExtraCallbackWithResult(deserializeIp<U> deserializeip, deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection) {
        return IAuthTabCallback(this, deserializeip, deserializefloatnullablecollection);
    }

    private static <T> writeRaw<T> onWarmupCompleted(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        return RxJavaPlugins.onNavigationEvent(new access17500(jsonReaderUnknownNumberParsing, null));
    }
}
