package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class doubleExponent {
    static final deserializeIntNullableCollection<Object, Object> IAuthTabCallbackStub = new extraCallbackWithResult();
    public static final Runnable onTransact = new access100();
    public static final deserializeDecimalCollection onNavigationEvent = new asBinder();
    static final deserializeFloat<Object> onExtraCallbackWithResult = new asInterface();
    public static final deserializeFloat<Throwable> asBinder = new getInterfaceDescriptor();
    public static final deserializeFloat<Throwable> access100 = new onMinimized();
    public static final deserializeIntCollection onExtraCallback = new access000();
    static final deserializeLongCollection<Object> onWarmupCompleted = new onMessageChannelReady();
    static final deserializeLongCollection<Object> IAuthTabCallback = new IAuthTabCallback_Parcel();
    static final Callable<Object> IAuthTabCallbackDefault = new onActivityResized();
    static final Comparator<Object> asInterface = new onPostMessage();
    public static final deserializeFloat<ycxExternalSyntheticLambda1> IAuthTabCallbackStubProxy = new extraCallback();

    public static <T1, T2, R> deserializeIntNullableCollection<Object[], R> onExtraCallbackWithResult(deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializefloatnullablecollection, "f is null");
        return new onNavigationEvent(deserializefloatnullablecollection);
    }

    public static <T1, T2, T3, R> deserializeIntNullableCollection<Object[], R> onWarmupCompleted(deserializeLong<T1, T2, T3, R> deserializelong) {
        floatExponent.onExtraCallbackWithResult(deserializelong, "f is null");
        return new onWarmupCompleted(deserializelong);
    }

    public static <T1, T2, T3, T4, R> deserializeIntNullableCollection<Object[], R> onExtraCallbackWithResult(deserializeInt<T1, T2, T3, T4, R> deserializeint) {
        floatExponent.onExtraCallbackWithResult(deserializeint, "f is null");
        return new onExtraCallback(deserializeint);
    }

    public static <T1, T2, T3, T4, T5, R> deserializeIntNullableCollection<Object[], R> onExtraCallback(deserializeIntArray<T1, T2, T3, T4, T5, R> deserializeintarray) {
        floatExponent.onExtraCallbackWithResult(deserializeintarray, "f is null");
        return new onExtraCallbackWithResult(deserializeintarray);
    }

    public static <T> deserializeIntNullableCollection<T, T> IAuthTabCallback() {
        return (deserializeIntNullableCollection<T, T>) IAuthTabCallbackStub;
    }

    public static <T> deserializeFloat<T> onNavigationEvent() {
        return (deserializeFloat<T>) onExtraCallbackWithResult;
    }

    public static <T> deserializeLongCollection<T> onExtraCallback() {
        return (deserializeLongCollection<T>) onWarmupCompleted;
    }

    public static deserializeDecimalCollection IAuthTabCallback(Future<?> future) {
        return new writeTypedObject(future);
    }

    static final class ICustomTabsCallback<T, U> implements Callable<U>, deserializeIntNullableCollection<T, U> {
        final U IAuthTabCallback;

        ICustomTabsCallback(U u) {
            this.IAuthTabCallback = u;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.IAuthTabCallback;
        }

        @Override // o.deserializeIntNullableCollection
        public U apply(T t) throws Exception {
            return this.IAuthTabCallback;
        }
    }

    public static <T> Callable<T> onExtraCallback(T t) {
        return new ICustomTabsCallback(t);
    }

    public static <T, U> deserializeIntNullableCollection<T, U> onNavigationEvent(U u) {
        return new ICustomTabsCallback(u);
    }

    static final class onTransact<T, U> implements deserializeIntNullableCollection<T, U> {
        final Class<U> onExtraCallbackWithResult;

        onTransact(Class<U> cls) {
            this.onExtraCallbackWithResult = cls;
        }

        @Override // o.deserializeIntNullableCollection
        public U apply(T t) throws Exception {
            return this.onExtraCallbackWithResult.cast(t);
        }
    }

    public static <T, U> deserializeIntNullableCollection<T, U> onExtraCallback(Class<U> cls) {
        return new onTransact(cls);
    }

    static final class IAuthTabCallbackDefault<T> implements Callable<List<T>> {
        final int IAuthTabCallback;

        IAuthTabCallbackDefault(int i) {
            this.IAuthTabCallback = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.IAuthTabCallback);
        }
    }

    public static <T> Callable<List<T>> onNavigationEvent(int i) {
        return new IAuthTabCallbackDefault(i);
    }

    public static <T> deserializeLongCollection<T> IAuthTabCallback(T t) {
        return new IAuthTabCallbackStubProxy(t);
    }

    public static <T> Callable<Set<T>> onWarmupCompleted() {
        return readTypedObject.INSTANCE;
    }

    public static <T> deserializeFloat<T> IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection) {
        return new IAuthTabCallback(deserializedecimalcollection);
    }

    static final class IAuthTabCallbackStub<T, U> implements deserializeLongCollection<T> {
        final Class<U> onExtraCallback;

        IAuthTabCallbackStub(Class<U> cls) {
            this.onExtraCallback = cls;
        }

        @Override // o.deserializeLongCollection
        public boolean test(T t) throws Exception {
            return this.onExtraCallback.isInstance(t);
        }
    }

    public static <T, U> deserializeLongCollection<T> onExtraCallbackWithResult(Class<U> cls) {
        return new IAuthTabCallbackStub(cls);
    }

    public static <T, K, V> deserializeDouble<Map<K, V>, T> onExtraCallback(deserializeIntNullableCollection<? super T, ? extends K> deserializeintnullablecollection, deserializeIntNullableCollection<? super T, ? extends V> deserializeintnullablecollection2) {
        return new onActivityLayout(deserializeintnullablecollection2, deserializeintnullablecollection);
    }

    static final class onNavigationEvent<T1, T2, R> implements deserializeIntNullableCollection<Object[], R> {
        final deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> onNavigationEvent;

        onNavigationEvent(deserializeFloatNullableCollection<? super T1, ? super T2, ? extends R> deserializefloatnullablecollection) {
            this.onNavigationEvent = deserializefloatnullablecollection;
        }

        @Override // o.deserializeIntNullableCollection
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 2) {
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            }
            return this.onNavigationEvent.apply(objArr[0], objArr[1]);
        }
    }

    static final class onWarmupCompleted<T1, T2, T3, R> implements deserializeIntNullableCollection<Object[], R> {
        final deserializeLong<T1, T2, T3, R> onNavigationEvent;

        onWarmupCompleted(deserializeLong<T1, T2, T3, R> deserializelong) {
            this.onNavigationEvent = deserializelong;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.deserializeIntNullableCollection
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            return (R) this.onNavigationEvent.apply(objArr[0], objArr[1], objArr[2]);
        }
    }

    static final class onExtraCallback<T1, T2, T3, T4, R> implements deserializeIntNullableCollection<Object[], R> {
        final deserializeInt<T1, T2, T3, T4, R> onNavigationEvent;

        onExtraCallback(deserializeInt<T1, T2, T3, T4, R> deserializeint) {
            this.onNavigationEvent = deserializeint;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.deserializeIntNullableCollection
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return (R) this.onNavigationEvent.onWarmupCompleted(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    static final class onExtraCallbackWithResult<T1, T2, T3, T4, T5, R> implements deserializeIntNullableCollection<Object[], R> {
        private final deserializeIntArray<T1, T2, T3, T4, T5, R> onExtraCallbackWithResult;

        onExtraCallbackWithResult(deserializeIntArray<T1, T2, T3, T4, T5, R> deserializeintarray) {
            this.onExtraCallbackWithResult = deserializeintarray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.deserializeIntNullableCollection
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return (R) this.onExtraCallbackWithResult.onWarmupCompleted(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    static final class extraCallbackWithResult implements deserializeIntNullableCollection<Object, Object> {
        @Override // o.deserializeIntNullableCollection
        public Object apply(Object obj) {
            return obj;
        }

        extraCallbackWithResult() {
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    static final class access100 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        access100() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    static final class asBinder implements deserializeDecimalCollection {
        @Override // o.deserializeDecimalCollection
        public void run() {
        }

        asBinder() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    static final class asInterface implements deserializeFloat<Object> {
        @Override // o.deserializeFloat
        public void accept(Object obj) {
        }

        asInterface() {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    static final class getInterfaceDescriptor implements deserializeFloat<Throwable> {
        getInterfaceDescriptor() {
        }

        @Override // o.deserializeFloat
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    static final class onMinimized implements deserializeFloat<Throwable> {
        onMinimized() {
        }

        @Override // o.deserializeFloat
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            RxJavaPlugins.onExtraCallbackWithResult(new approximateDouble(th));
        }
    }

    static final class access000 implements deserializeIntCollection {
        access000() {
        }
    }

    static final class onMessageChannelReady implements deserializeLongCollection<Object> {
        @Override // o.deserializeLongCollection
        public boolean test(Object obj) {
            return true;
        }

        onMessageChannelReady() {
        }
    }

    static final class IAuthTabCallback_Parcel implements deserializeLongCollection<Object> {
        @Override // o.deserializeLongCollection
        public boolean test(Object obj) {
            return false;
        }

        IAuthTabCallback_Parcel() {
        }
    }

    static final class onActivityResized implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }

        onActivityResized() {
        }
    }

    static final class onPostMessage implements Comparator<Object> {
        onPostMessage() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class extraCallback implements deserializeFloat<ycxExternalSyntheticLambda1> {
        extraCallback() {
        }

        @Override // o.deserializeFloat
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public void accept(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) throws Exception {
            ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
        }
    }
}
