package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class wasLastName implements JsonReaderErrorInfo {
    protected abstract void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision);

    public static wasLastName IAuthTabCallback() {
        return RxJavaPlugins.onExtraCallbackWithResult(NumberConverter20.onExtraCallbackWithResult);
    }

    public static wasLastName onExtraCallbackWithResult(JsonReaderErrorInfo... jsonReaderErrorInfoArr) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfoArr, "sources is null");
        if (jsonReaderErrorInfoArr.length == 0) {
            return IAuthTabCallback();
        }
        if (jsonReaderErrorInfoArr.length == 1) {
            return IAuthTabCallback(jsonReaderErrorInfoArr[0]);
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter14(jsonReaderErrorInfoArr));
    }

    public static wasLastName onNavigationEvent(Iterable<? extends JsonReaderErrorInfo> iterable) {
        floatExponent.onExtraCallbackWithResult(iterable, "sources is null");
        return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) new NumberConverter17(iterable));
    }

    public static wasLastName onExtraCallbackWithResult(fillInStackTrace fillinstacktrace) {
        floatExponent.onExtraCallbackWithResult(fillinstacktrace, "source is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter21(fillinstacktrace));
    }

    public static wasLastName onExtraCallbackWithResult(Callable<? extends JsonReaderErrorInfo> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "completableSupplier");
        return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) new NumberConverter22(callable));
    }

    public static wasLastName onNavigationEvent(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "error is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter27(th));
    }

    public static wasLastName onExtraCallbackWithResult(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "run is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter26(deserializedecimalcollection));
    }

    public static wasLastName onNavigationEvent(Callable<?> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "callable is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter23(callable));
    }

    public static wasLastName onExtraCallback(Future<?> future) {
        floatExponent.onExtraCallbackWithResult(future, "future is null");
        return onExtraCallbackWithResult(doubleExponent.IAuthTabCallback(future));
    }

    public static <T> wasLastName IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "publisher is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter25(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk));
    }

    public static wasLastName onExtraCallback(JsonReaderErrorInfo... jsonReaderErrorInfoArr) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfoArr, "sources is null");
        if (jsonReaderErrorInfoArr.length == 0) {
            return IAuthTabCallback();
        }
        if (jsonReaderErrorInfoArr.length == 1) {
            return IAuthTabCallback(jsonReaderErrorInfoArr[0]);
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter28(jsonReaderErrorInfoArr));
    }

    public static wasLastName onExtraCallbackWithResult(Iterable<? extends JsonReaderErrorInfo> iterable) {
        floatExponent.onExtraCallbackWithResult(iterable, "sources is null");
        return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) new NumberConverter4(iterable));
    }

    public static wasLastName onWarmupCompleted(JsonReaderErrorInfo... jsonReaderErrorInfoArr) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfoArr, "sources is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter5(jsonReaderErrorInfoArr));
    }

    public static wasLastName onNavigationEvent(long j, TimeUnit timeUnit) {
        return IAuthTabCallback(j, timeUnit, clearTid.onNavigationEvent());
    }

    public static wasLastName IAuthTabCallback(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new serializeNullableMap(j, timeUnit, mapConverter));
    }

    private static NullPointerException onExtraCallbackWithResult(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static wasLastName IAuthTabCallback(JsonReaderErrorInfo jsonReaderErrorInfo) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfo, "source is null");
        if (jsonReaderErrorInfo instanceof wasLastName) {
            return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) jsonReaderErrorInfo);
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter6(jsonReaderErrorInfo));
    }

    public final <T> getByteBuffer<T> onExtraCallbackWithResult(serializeRaw<T> serializeraw) {
        floatExponent.onExtraCallbackWithResult(serializeraw, "next is null");
        return RxJavaPlugins.onExtraCallback((getByteBuffer) new setFileNameBytes(this, serializeraw));
    }

    public final <T> writeRaw<T> onExtraCallbackWithResult(deserializeIp<T> deserializeip) {
        floatExponent.onExtraCallbackWithResult(deserializeip, "next is null");
        return RxJavaPlugins.onNavigationEvent(new access9400(deserializeip, this));
    }

    public final wasLastName onExtraCallback(JsonReaderErrorInfo jsonReaderErrorInfo) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfo, "next is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter15(this, jsonReaderErrorInfo));
    }

    public final void onExtraCallback() throws InterruptedException {
        write4 write4Var = new write4();
        onExtraCallbackWithResult(write4Var);
        write4Var.onExtraCallbackWithResult();
    }

    public final Throwable bH_() {
        write4 write4Var = new write4();
        onExtraCallbackWithResult(write4Var);
        return write4Var.IAuthTabCallback();
    }

    public final wasLastName IAuthTabCallback(JsonReaderBindObject jsonReaderBindObject) {
        return IAuthTabCallback(((JsonReaderBindObject) floatExponent.onExtraCallbackWithResult(jsonReaderBindObject, "transformer is null")).apply(this));
    }

    public final wasLastName IAuthTabCallback(long j, TimeUnit timeUnit) {
        return onWarmupCompleted(j, timeUnit, clearTid.onNavigationEvent(), false);
    }

    public final wasLastName onExtraCallback(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return onWarmupCompleted(j, timeUnit, mapConverter, false);
    }

    public final wasLastName onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) new NumberConverter19(this, j, timeUnit, mapConverter, z));
    }

    public final wasLastName IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection) {
        deserializeFloat<? super deserializeUriNullableCollection> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
        deserializeFloat<? super Throwable> deserializefloatOnNavigationEvent2 = doubleExponent.onNavigationEvent();
        deserializeDecimalCollection deserializedecimalcollection2 = doubleExponent.onNavigationEvent;
        return onExtraCallback(deserializefloatOnNavigationEvent, deserializefloatOnNavigationEvent2, deserializedecimalcollection, deserializedecimalcollection2, deserializedecimalcollection2, deserializedecimalcollection2);
    }

    public final wasLastName onExtraCallbackWithResult(deserializeFloat<? super Throwable> deserializefloat) {
        deserializeFloat<? super deserializeUriNullableCollection> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
        deserializeDecimalCollection deserializedecimalcollection = doubleExponent.onNavigationEvent;
        return onExtraCallback(deserializefloatOnNavigationEvent, deserializefloat, deserializedecimalcollection, deserializedecimalcollection, deserializedecimalcollection, deserializedecimalcollection);
    }

    private wasLastName onExtraCallback(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2, deserializeDecimalCollection deserializedecimalcollection3, deserializeDecimalCollection deserializedecimalcollection4) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onSubscribe is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat2, "onError is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection2, "onTerminate is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection3, "onAfterTerminate is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection4, "onDispose is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter9(this, deserializefloat, deserializefloat2, deserializedecimalcollection, deserializedecimalcollection2, deserializedecimalcollection3, deserializedecimalcollection4));
    }

    public final wasLastName onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onFinally is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter2(this, deserializedecimalcollection));
    }

    public final wasLastName onWarmupCompleted(JsonReaderErrorInfo jsonReaderErrorInfo) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfo, "other is null");
        return onExtraCallback(this, jsonReaderErrorInfo);
    }

    public final wasLastName onNavigationEvent(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter3(this, mapConverter));
    }

    public final wasLastName onNavigationEvent() {
        return onNavigationEvent(doubleExponent.onExtraCallback());
    }

    public final wasLastName onNavigationEvent(deserializeLongCollection<? super Throwable> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new ObjectConverter(this, deserializelongcollection));
    }

    public final wasLastName onExtraCallbackWithResult(deserializeIntNullableCollection<? super Throwable, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "errorMapper is null");
        return RxJavaPlugins.onExtraCallbackWithResult((wasLastName) new NumberConverter8(this, deserializeintnullablecollection));
    }

    public final wasLastName IAuthTabCallback(long j) {
        return IAuthTabCallback((r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) asBinder().IAuthTabCallback(j));
    }

    public final wasLastName onNavigationEvent(deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Throwable>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        return IAuthTabCallback((r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) asBinder().IAuthTabCallbackStub(deserializeintnullablecollection));
    }

    public final wasLastName onNavigationEvent(JsonReaderErrorInfo jsonReaderErrorInfo) {
        floatExponent.onExtraCallbackWithResult(jsonReaderErrorInfo, "other is null");
        return onExtraCallbackWithResult(jsonReaderErrorInfo, this);
    }

    public final deserializeUriNullableCollection bK_() {
        NumberConverter12 numberConverter12 = new NumberConverter12();
        onExtraCallbackWithResult(numberConverter12);
        return numberConverter12;
    }

    @Override // o.JsonReaderErrorInfo
    public final void onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        floatExponent.onExtraCallbackWithResult(jsonReaderDoublePrecision, "observer is null");
        try {
            JsonReaderDoublePrecision jsonReaderDoublePrecisionIAuthTabCallback = RxJavaPlugins.IAuthTabCallback(this, jsonReaderDoublePrecision);
            floatExponent.onExtraCallbackWithResult(jsonReaderDoublePrecisionIAuthTabCallback, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            IAuthTabCallback(jsonReaderDoublePrecisionIAuthTabCallback);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
            throw onExtraCallbackWithResult(th);
        }
    }

    public final deserializeUriNullableCollection onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection, deserializeFloat<? super Throwable> deserializefloat) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onError is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        write3 write3Var = new write3(deserializefloat, deserializedecimalcollection);
        onExtraCallbackWithResult((JsonReaderDoublePrecision) write3Var);
        return write3Var;
    }

    public final deserializeUriNullableCollection onExtraCallback(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        write3 write3Var = new write3(deserializedecimalcollection);
        onExtraCallbackWithResult((JsonReaderDoublePrecision) write3Var);
        return write3Var;
    }

    public final wasLastName onWarmupCompleted(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverter7(this, mapConverter));
    }

    public final wasLastName onExtraCallback(long j, TimeUnit timeUnit) {
        return IAuthTabCallback(j, timeUnit, clearTid.onNavigationEvent(), null);
    }

    public final wasLastName onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        return IAuthTabCallback(j, timeUnit, mapConverter, null);
    }

    private wasLastName IAuthTabCallback(long j, TimeUnit timeUnit, MapConverter mapConverter, JsonReaderErrorInfo jsonReaderErrorInfo) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new NumberConverterNumberInfo(this, j, timeUnit, mapConverter, jsonReaderErrorInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> JsonReaderUnknownNumberParsing<T> asBinder() {
        if (this instanceof parseLongGeneric) {
            return ((parseLongGeneric) this).onExtraCallbackWithResult();
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new deserializeNullableMapCollection(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> getByteBuffer<T> IAuthTabCallbackDefault() {
        if (this instanceof parseNegativeDecimal) {
            return ((parseNegativeDecimal) this).onWarmupCompleted();
        }
        return RxJavaPlugins.onExtraCallback(new ObjectConverter1(this));
    }

    public final <T> writeRaw<T> IAuthTabCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "completionValue is null");
        return RxJavaPlugins.onNavigationEvent(new deserializeMapCollection(this, null, t));
    }
}
