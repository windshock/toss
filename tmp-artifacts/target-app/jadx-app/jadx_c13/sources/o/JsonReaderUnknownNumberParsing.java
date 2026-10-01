package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;
import o.TombstoneProtosArchitectureArchitectureVerifier;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class JsonReaderUnknownNumberParsing<T> implements r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> {
    static final int BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    protected abstract void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0);

    public static int IAuthTabCallback() {
        return BUFFER_SIZE;
    }

    public static <T, R> JsonReaderUnknownNumberParsing<R> onWarmupCompleted(deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>... r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr) {
        return onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, deserializeintnullablecollection, IAuthTabCallback());
    }

    public static <T, R> JsonReaderUnknownNumberParsing<R> onExtraCallbackWithResult(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, "sources is null");
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length == 0) {
            return onNavigationEvent();
        }
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "combiner is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallbackWithResult(new ParsingExceptionParsingStacklessException((r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk[]) r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, (deserializeIntNullableCollection) deserializeintnullablecollection, i, false));
    }

    public static <T, R> JsonReaderUnknownNumberParsing<R> onWarmupCompleted(Iterable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection) {
        return IAuthTabCallback(iterable, deserializeintnullablecollection, IAuthTabCallback());
    }

    public static <T, R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(Iterable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i) {
        floatExponent.onExtraCallbackWithResult(iterable, "sources is null");
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "combiner is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallbackWithResult(new ParsingExceptionParsingStacklessException((Iterable) iterable, (deserializeIntNullableCollection) deserializeintnullablecollection, i, false));
    }

    public static <T1, T2, R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T1> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T2> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        return onWarmupCompleted(doubleExponent.onExtraCallbackWithResult(deserializefloatnullablecollection), r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2);
    }

    public static <T1, T2, T3, R> JsonReaderUnknownNumberParsing<R> onExtraCallbackWithResult(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T1> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T2> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T3> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, deserializeLong<? super T1, ? super T2, ? super T3, ? extends R> deserializelong) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, "source3 is null");
        return onWarmupCompleted(doubleExponent.onWarmupCompleted(deserializelong), r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3);
    }

    public static <T1, T2, T3, T4, R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T1> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T2> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T3> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T4> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk4, deserializeInt<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> deserializeint) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, "source3 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk4, "source4 is null");
        return onWarmupCompleted(doubleExponent.onExtraCallbackWithResult(deserializeint), r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk4);
    }

    public static <T1, T2, T3, T4, T5, R> JsonReaderUnknownNumberParsing<R> onWarmupCompleted(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T1> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T2> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T3> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T4> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk4, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T5> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk5, deserializeIntArray<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> deserializeintarray) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, "source3 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk4, "source4 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk5, "source5 is null");
        return onWarmupCompleted(doubleExponent.onExtraCallback((deserializeIntArray) deserializeintarray), r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk4, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk5);
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        return onExtraCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2);
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>... r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr) {
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length == 0) {
            return onNavigationEvent();
        }
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length == 1) {
            return onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr[0]);
        }
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new StringCache(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, false));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback(JsonReaderWithReader<T> jsonReaderWithReader, wasNull wasnull) {
        floatExponent.onExtraCallbackWithResult(jsonReaderWithReader, "source is null");
        floatExponent.onExtraCallbackWithResult(wasnull, "mode is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new ParsingException1(jsonReaderWithReader, wasnull));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(Callable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "supplier is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new StringConverter(callable));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onNavigationEvent() {
        return RxJavaPlugins.onExtraCallbackWithResult(StringConverter3.onNavigationEvent);
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback(Callable<? extends Throwable> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "supplier is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new UnknownSerializer(callable));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> IAuthTabCallback(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "throwable is null");
        return onExtraCallback((Callable<? extends Throwable>) doubleExponent.onExtraCallback(th));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback(T... tArr) {
        floatExponent.onExtraCallbackWithResult(tArr, "items is null");
        if (tArr.length == 0) {
            return onNavigationEvent();
        }
        if (tArr.length == 1) {
            return onExtraCallback(tArr[0]);
        }
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new buildCommentList(tArr));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onNavigationEvent(Callable<? extends T> callable) {
        floatExponent.onExtraCallbackWithResult(callable, "supplier is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new buildTextNodeList(callable));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback(Future<? extends T> future) {
        floatExponent.onExtraCallbackWithResult(future, "future is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new createDocument(future, 0L, (TimeUnit) null));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onWarmupCompleted(Iterable<? extends T> iterable) {
        floatExponent.onExtraCallbackWithResult(iterable, "source is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new buildXmlFromJsonArray(iterable));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk instanceof JsonReaderUnknownNumberParsing) {
            return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk);
        }
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new mapToXml(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk));
    }

    public static JsonReaderUnknownNumberParsing<Long> onWarmupCompleted(long j, long j2, TimeUnit timeUnit) {
        return IAuthTabCallback(j, j2, timeUnit, clearTid.onNavigationEvent());
    }

    public static JsonReaderUnknownNumberParsing<Long> IAuthTabCallback(long j, long j2, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new TombstoneProtosArchitecture(Math.max(0L, j), Math.max(0L, j2), timeUnit, mapConverter));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "item is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new TombstoneProtos1(t));
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onNavigationEvent(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        return onExtraCallback((Object[]) new r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk[]{r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2}).onExtraCallback(doubleExponent.IAuthTabCallback(), false, 2);
    }

    public static <T> JsonReaderUnknownNumberParsing<T> onExtraCallback() {
        return RxJavaPlugins.onExtraCallbackWithResult(TombstoneProtosArchitecture1.onExtraCallbackWithResult);
    }

    public static JsonReaderUnknownNumberParsing<Integer> IAuthTabCallback(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return onNavigationEvent();
        }
        if (i2 == 1) {
            return onExtraCallback(Integer.valueOf(i));
        }
        if (i + (i2 - 1) > 2147483647L) {
            throw new IllegalArgumentException("Integer overflow");
        }
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new TombstoneProtosBacktraceFrame(i, i2));
    }

    public static JsonReaderUnknownNumberParsing<Long> onWarmupCompleted(long j, TimeUnit timeUnit) {
        return IAuthTabCallback(j, timeUnit, clearTid.onNavigationEvent());
    }

    public static JsonReaderUnknownNumberParsing<Long> IAuthTabCallback(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new access18600(Math.max(0L, j), timeUnit, mapConverter));
    }

    public static <T1, T2, R> JsonReaderUnknownNumberParsing<R> onExtraCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T1> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T2> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        return onExtraCallbackWithResult(doubleExponent.onExtraCallbackWithResult(deserializefloatnullablecollection), false, IAuthTabCallback(), r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2);
    }

    public static <T1, T2, T3, R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T1> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T2> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T3> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, deserializeLong<? super T1, ? super T2, ? super T3, ? extends R> deserializelong) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "source1 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, "source2 is null");
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3, "source3 is null");
        return onExtraCallbackWithResult(doubleExponent.onWarmupCompleted(deserializelong), false, IAuthTabCallback(), r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk3);
    }

    public static <T, R> JsonReaderUnknownNumberParsing<R> onExtraCallbackWithResult(deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, boolean z, int i, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>... r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr) {
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length == 0) {
            return onNavigationEvent();
        }
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "zipper is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallbackWithResult(new access18700(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, null, deserializeintnullablecollection, i, z));
    }

    public final T onWarmupCompleted() throws InterruptedException {
        access25600 access25600Var = new access25600();
        onExtraCallback((JsonReaderReadObject) access25600Var);
        T tOnWarmupCompleted = access25600Var.onWarmupCompleted();
        if (tOnWarmupCompleted != null) {
            return tOnWarmupCompleted;
        }
        throw new NoSuchElementException();
    }

    public final <U> JsonReaderUnknownNumberParsing<U> IAuthTabCallback(Class<U> cls) {
        floatExponent.onExtraCallbackWithResult(cls, "clazz is null");
        return (JsonReaderUnknownNumberParsing<U>) onNavigationEvent(doubleExponent.onExtraCallback((Class) cls));
    }

    public final <R> JsonReaderUnknownNumberParsing<R> onWarmupCompleted(writeQuotedString<? super T, ? extends R> writequotedstring) {
        return onExtraCallbackWithResult(((writeQuotedString) floatExponent.onExtraCallbackWithResult(writequotedstring, "composer is null")).apply(this));
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "other is null");
        return onExtraCallbackWithResult(this, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk);
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(long j, TimeUnit timeUnit) {
        return onNavigationEvent(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new SerializationException(this, j, timeUnit, mapConverter));
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallback(long j, TimeUnit timeUnit) {
        return onExtraCallbackWithResult(j, timeUnit, clearTid.onNavigationEvent(), false);
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new serializeShortNullable(this, Math.max(0L, j), timeUnit, mapConverter, z));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallbackStub() {
        return onWarmupCompleted(doubleExponent.IAuthTabCallback(), doubleExponent.onWarmupCompleted());
    }

    public final <K> JsonReaderUnknownNumberParsing<T> onExtraCallback(deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection) {
        return onWarmupCompleted(deserializeintnullablecollection, doubleExponent.onWarmupCompleted());
    }

    public final <K> JsonReaderUnknownNumberParsing<T> onWarmupCompleted(deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection, Callable<? extends Collection<? super K>> callable) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "keySelector is null");
        floatExponent.onExtraCallbackWithResult(callable, "collectionSupplier is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new serializeShort(this, deserializeintnullablecollection, callable));
    }

    public final JsonReaderUnknownNumberParsing<T> asInterface() {
        return onExtraCallbackWithResult(doubleExponent.IAuthTabCallback());
    }

    public final <K> JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "keySelector is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new StringConverter1(this, deserializeintnullablecollection, floatExponent.onWarmupCompleted()));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onFinally is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new deserializeNullable(this, deserializedecimalcollection));
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(deserializeDecimalCollection deserializedecimalcollection) {
        return onExtraCallbackWithResult(doubleExponent.onNavigationEvent(), doubleExponent.onExtraCallback, deserializedecimalcollection);
    }

    private JsonReaderUnknownNumberParsing<T> onExtraCallback(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onNext is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat2, "onError is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection2, "onAfterTerminate is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new StringConverter2(this, deserializefloat, deserializefloat2, deserializedecimalcollection, deserializedecimalcollection2));
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted(deserializeFloat<? super Throwable> deserializefloat) {
        deserializeFloat<? super T> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
        deserializeDecimalCollection deserializedecimalcollection = doubleExponent.onNavigationEvent;
        return onExtraCallback(deserializefloatOnNavigationEvent, deserializefloat, deserializedecimalcollection, deserializedecimalcollection);
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(deserializeFloat<? super ycxExternalSyntheticLambda1> deserializefloat, deserializeIntCollection deserializeintcollection, deserializeDecimalCollection deserializedecimalcollection) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onSubscribe is null");
        floatExponent.onExtraCallbackWithResult(deserializeintcollection, "onRequest is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onCancel is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new StringConverter4(this, deserializefloat, deserializeintcollection, deserializedecimalcollection));
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(deserializeFloat<? super T> deserializefloat) {
        deserializeFloat<? super Throwable> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
        deserializeDecimalCollection deserializedecimalcollection = doubleExponent.onNavigationEvent;
        return onExtraCallback(deserializefloat, deserializefloatOnNavigationEvent, deserializedecimalcollection, deserializedecimalcollection);
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallback(deserializeFloat<? super ycxExternalSyntheticLambda1> deserializefloat) {
        return onExtraCallbackWithResult(deserializefloat, doubleExponent.onExtraCallback, doubleExponent.onNavigationEvent);
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(deserializeDecimalCollection deserializedecimalcollection) {
        return onExtraCallback(doubleExponent.onNavigationEvent(), doubleExponent.IAuthTabCallback(deserializedecimalcollection), deserializedecimalcollection, doubleExponent.onNavigationEvent);
    }

    public final advance<T> onExtraCallback(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return RxJavaPlugins.IAuthTabCallback((advance) new TypeLookup(this, j));
    }

    public final writeRaw<T> onWarmupCompleted(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return RxJavaPlugins.onNavigationEvent(new StringConverter5(this, j, null));
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new UUIDConverter1(this, deserializelongcollection));
    }

    public final advance<T> asBinder() {
        return onExtraCallback(0L);
    }

    public final writeRaw<T> onTransact() {
        return onWarmupCompleted(0L);
    }

    public final <R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends R>> deserializeintnullablecollection) {
        return onNavigationEvent((deserializeIntNullableCollection) deserializeintnullablecollection, false, IAuthTabCallback(), IAuthTabCallback());
    }

    public final <R> JsonReaderUnknownNumberParsing<R> onExtraCallback(deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends R>> deserializeintnullablecollection, boolean z, int i) {
        return onNavigationEvent(deserializeintnullablecollection, z, i, IAuthTabCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> JsonReaderUnknownNumberParsing<R> onNavigationEvent(deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends R>> deserializeintnullablecollection, boolean z, int i, int i2) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        floatExponent.onExtraCallbackWithResult(i, "maxConcurrency");
        floatExponent.onExtraCallbackWithResult(i2, "bufferSize");
        if (this instanceof parseNegativeNumber) {
            Object objCall = ((parseNegativeNumber) this).call();
            if (objCall == null) {
                return onNavigationEvent();
            }
            return access17700.onNavigationEvent(objCall, deserializeintnullablecollection);
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new buildCDataList(this, deserializeintnullablecollection, z, i, i2));
    }

    public final wasLastName onWarmupCompleted(deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z, int i) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        floatExponent.onExtraCallbackWithResult(i, "maxConcurrency");
        return RxJavaPlugins.onExtraCallbackWithResult(new XmlConverter(this, deserializeintnullablecollection, z, i));
    }

    public final <R> JsonReaderUnknownNumberParsing<R> onWarmupCompleted(deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection) {
        return IAuthTabCallback((deserializeIntNullableCollection) deserializeintnullablecollection, false, IntCompanionObject.MAX_VALUE);
    }

    public final <R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection, boolean z, int i) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        floatExponent.onExtraCallbackWithResult(i, "maxConcurrency");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new buildXmlFromHashMap(this, deserializeintnullablecollection, z, i));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallbackDefault() {
        return RxJavaPlugins.onExtraCallbackWithResult(new registerAllExtensions(this));
    }

    public final wasLastName getInterfaceDescriptor() {
        return RxJavaPlugins.onExtraCallbackWithResult(new TombstoneProtos(this));
    }

    public final <R> JsonReaderUnknownNumberParsing<R> onNavigationEvent(deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "mapper is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new findValueByNumber(this, deserializeintnullablecollection));
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted(MapConverter mapConverter) {
        return onExtraCallbackWithResult(mapConverter, false, IAuthTabCallback());
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(MapConverter mapConverter, boolean z, int i) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return RxJavaPlugins.onExtraCallbackWithResult(new access19800(this, mapConverter, z, i));
    }

    public final <U> JsonReaderUnknownNumberParsing<U> onExtraCallback(Class<U> cls) {
        floatExponent.onExtraCallbackWithResult(cls, "clazz is null");
        return onWarmupCompleted(doubleExponent.onExtraCallbackWithResult(cls)).IAuthTabCallback(cls);
    }

    public final JsonReaderUnknownNumberParsing<T> access000() {
        return onWarmupCompleted(IAuthTabCallback(), false, true);
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted(int i, boolean z, boolean z2) {
        floatExponent.onExtraCallbackWithResult(i, "capacity");
        return RxJavaPlugins.onExtraCallbackWithResult(new access19600(this, i, z2, z, doubleExponent.onNavigationEvent));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallbackStubProxy() {
        return RxJavaPlugins.onExtraCallbackWithResult(new TombstoneProtosArmMTEMetadata(this));
    }

    public final JsonReaderUnknownNumberParsing<T> access100() {
        return RxJavaPlugins.onExtraCallbackWithResult(new access19700(this));
    }

    public final JsonReaderUnknownNumberParsing<T> onTransact(deserializeIntNullableCollection<? super Throwable, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "resumeFunction is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new parseFrom(this, deserializeintnullablecollection, false));
    }

    public final JsonReaderUnknownNumberParsing<T> asBinder(deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "valueSupplier is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new clearMemoryTags(this, deserializeintnullablecollection));
    }

    public final deserializeDoubleCollection<T> IAuthTabCallback_Parcel() {
        return onWarmupCompleted(IAuthTabCallback());
    }

    public final deserializeDoubleCollection<T> onWarmupCompleted(int i) {
        floatExponent.onExtraCallbackWithResult(i, "bufferSize");
        return getDefaultInstance.onNavigationEvent(this, i);
    }

    public final JsonReaderUnknownNumberParsing<T> asInterface(deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Object>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "handler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new TombstoneProtosArmMTEMetadataBuilder(this, deserializeintnullablecollection));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(long j) {
        return IAuthTabCallback(j, doubleExponent.onExtraCallback());
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(long j, deserializeLongCollection<? super Throwable> deserializelongcollection) {
        if (j < 0) {
            throw new IllegalArgumentException("times >= 0 required but it was " + j);
        }
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new getMemoryTags(this, j, deserializelongcollection));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallbackStub(deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Throwable>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection, "handler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new TombstoneProtosArmMTEMetadataOrBuilder(this, deserializeintnullablecollection));
    }

    public final <R> JsonReaderUnknownNumberParsing<R> IAuthTabCallback(R r, deserializeFloatNullableCollection<R, ? super T, R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(r, "initialValue is null");
        return onNavigationEvent(doubleExponent.onExtraCallback(r), deserializefloatnullablecollection);
    }

    public final <R> JsonReaderUnknownNumberParsing<R> onNavigationEvent(Callable<R> callable, deserializeFloatNullableCollection<R, ? super T, R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(callable, "seedSupplier is null");
        floatExponent.onExtraCallbackWithResult(deserializefloatnullablecollection, "accumulator is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new access17800(this, callable, deserializefloatnullablecollection));
    }

    public final JsonReaderUnknownNumberParsing<T> extraCallbackWithResult() {
        return IAuthTabCallback_Parcel().onExtraCallbackWithResult();
    }

    public final writeRaw<T> writeTypedObject() {
        return RxJavaPlugins.onNavigationEvent(new access17500(this, null));
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(long j) {
        if (j <= 0) {
            return RxJavaPlugins.onExtraCallbackWithResult(this);
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new access17600(this, j));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "other is null");
        return onExtraCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, this);
    }

    public final deserializeUriNullableCollection IAuthTabCallback(deserializeFloat<? super T> deserializefloat) {
        return onNavigationEvent(deserializefloat, doubleExponent.access100, doubleExponent.onNavigationEvent, TombstoneProtosArchitectureArchitectureVerifier.onWarmupCompleted.INSTANCE);
    }

    public final deserializeUriNullableCollection onWarmupCompleted(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2) {
        return onNavigationEvent(deserializefloat, deserializefloat2, doubleExponent.onNavigationEvent, TombstoneProtosArchitectureArchitectureVerifier.onWarmupCompleted.INSTANCE);
    }

    public final deserializeUriNullableCollection onNavigationEvent(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection) {
        return onNavigationEvent(deserializefloat, deserializefloat2, deserializedecimalcollection, TombstoneProtosArchitectureArchitectureVerifier.onWarmupCompleted.INSTANCE);
    }

    public final deserializeUriNullableCollection onNavigationEvent(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeFloat<? super ycxExternalSyntheticLambda1> deserializefloat3) {
        floatExponent.onExtraCallbackWithResult(deserializefloat, "onNext is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat2, "onError is null");
        floatExponent.onExtraCallbackWithResult(deserializedecimalcollection, "onComplete is null");
        floatExponent.onExtraCallbackWithResult(deserializefloat3, "onSubscribe is null");
        access25500 access25500Var = new access25500(deserializefloat, deserializefloat2, deserializedecimalcollection, deserializefloat3);
        onExtraCallback((JsonReaderReadObject) access25500Var);
        return access25500Var;
    }

    @Override // o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk
    public final void subscribe(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 instanceof JsonReaderReadObject) {
            onExtraCallback((JsonReaderReadObject) ycxexternalsyntheticlambda0);
        } else {
            floatExponent.onExtraCallbackWithResult(ycxexternalsyntheticlambda0, "s is null");
            onExtraCallback((JsonReaderReadObject) new clearLogs(ycxexternalsyntheticlambda0));
        }
    }

    public final void onExtraCallback(JsonReaderReadObject<? super T> jsonReaderReadObject) {
        floatExponent.onExtraCallbackWithResult(jsonReaderReadObject, "s is null");
        try {
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0OnNavigationEvent = RxJavaPlugins.onNavigationEvent(this, jsonReaderReadObject);
            floatExponent.onExtraCallbackWithResult(ycxexternalsyntheticlambda0OnNavigationEvent, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            onNavigationEvent(ycxexternalsyntheticlambda0OnNavigationEvent);
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

    public final JsonReaderUnknownNumberParsing<T> onExtraCallback(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return onWarmupCompleted(mapConverter, !(this instanceof ParsingException1));
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted(MapConverter mapConverter, boolean z) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new access18300(this, mapConverter, z));
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j);
        }
        return RxJavaPlugins.onExtraCallbackWithResult(new access18200(this, j));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "stopPredicate is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new access18000(this, deserializelongcollection));
    }

    public final JsonReaderUnknownNumberParsing<T> onExtraCallback(deserializeLongCollection<? super T> deserializelongcollection) {
        floatExponent.onExtraCallbackWithResult(deserializelongcollection, "predicate is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new access18400(this, deserializelongcollection));
    }

    public final JsonReaderUnknownNumberParsing<T> IAuthTabCallback(long j, TimeUnit timeUnit) {
        return onWarmupCompleted(j, timeUnit, clearTid.onNavigationEvent());
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "unit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new access18100(this, j, timeUnit, mapConverter));
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(long j, TimeUnit timeUnit) {
        return onExtraCallback(j, timeUnit, (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) null, clearTid.onNavigationEvent());
    }

    private JsonReaderUnknownNumberParsing<T> onExtraCallback(long j, TimeUnit timeUnit, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(timeUnit, "timeUnit is null");
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult(new access18800(this, j, timeUnit, mapConverter, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk));
    }

    public final getByteBuffer<T> extraCallback() {
        return RxJavaPlugins.onExtraCallback(new hasMemoryError(this));
    }

    public final JsonReaderUnknownNumberParsing<T> onNavigationEvent(MapConverter mapConverter) {
        floatExponent.onExtraCallbackWithResult(mapConverter, "scheduler is null");
        return RxJavaPlugins.onExtraCallbackWithResult((JsonReaderUnknownNumberParsing) new access18500(this, mapConverter));
    }

    public final <U, R> JsonReaderUnknownNumberParsing<R> onExtraCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, "other is null");
        return onExtraCallback(this, r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, deserializefloatnullablecollection);
    }
}
