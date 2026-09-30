package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.getFileNames;
import o.getSignCertFilename;
import o.getSignPrikeyFHFilename;
import o.getSubjectDN;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.url._UrlKt;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Retrofit {

    @Nullable
    final Executor IAuthTabCallback;
    final boolean IAuthTabCallbackDefault;
    private final ConcurrentHashMap<Method, Object> IAuthTabCallbackStub = new ConcurrentHashMap<>();
    final int asBinder;
    final int asInterface;
    final HttpUrl onExtraCallback;
    final List<CallAdapter.Factory> onExtraCallbackWithResult;
    public final Call.Factory onNavigationEvent;
    final List<Converter.Factory> onWarmupCompleted;

    Retrofit(Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, int i, List<CallAdapter.Factory> list2, int i2, @Nullable Executor executor, boolean z) {
        this.onNavigationEvent = factory;
        this.onExtraCallback = httpUrl;
        this.onWarmupCompleted = list;
        this.asBinder = i;
        this.onExtraCallbackWithResult = list2;
        this.asInterface = i2;
        this.IAuthTabCallback = executor;
        this.IAuthTabCallbackDefault = z;
    }

    public <T> T onNavigationEvent(final Class<T> cls) throws SecurityException {
        onExtraCallback(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final Object[] onWarmupCompleted = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            @Nullable
            public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.onWarmupCompleted;
                }
                Reflection reflection = getSubjectDN.onNavigationEvent;
                if (reflection.onNavigationEvent(method)) {
                    return reflection.onExtraCallbackWithResult(method, cls, obj, objArr);
                }
                return Retrofit.this.IAuthTabCallback(cls, method).onExtraCallbackWithResult(obj, objArr);
            }
        });
    }

    private void onExtraCallback(Class<?> cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.IAuthTabCallbackDefault) {
            Reflection reflection = getSubjectDN.onNavigationEvent;
            for (Method method : cls.getDeclaredMethods()) {
                if (!reflection.onNavigationEvent(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    IAuthTabCallback(cls, method);
                }
            }
        }
    }

    getFileNames<?> IAuthTabCallback(Class<?> cls, Method method) {
        while (true) {
            Object obj = this.IAuthTabCallbackStub.get(method);
            if (obj instanceof getFileNames) {
                return (getFileNames) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    Object objPutIfAbsent = this.IAuthTabCallbackStub.putIfAbsent(method, obj2);
                    if (objPutIfAbsent == null) {
                        try {
                            getFileNames<?> getfilenamesOnExtraCallback = getFileNames.onExtraCallback(this, cls, method);
                            this.IAuthTabCallbackStub.put(method, getfilenamesOnExtraCallback);
                            return getfilenamesOnExtraCallback;
                        } catch (Throwable th) {
                            this.IAuthTabCallbackStub.remove(method);
                            throw th;
                        }
                    }
                    obj = objPutIfAbsent;
                }
            }
            synchronized (obj) {
                Object obj3 = this.IAuthTabCallbackStub.get(method);
                if (obj3 != null) {
                    return (getFileNames) obj3;
                }
            }
        }
    }

    public CallAdapter<?, ?> IAuthTabCallback(Type type, Annotation[] annotationArr) {
        return onWarmupCompleted(null, type, annotationArr);
    }

    public CallAdapter<?, ?> onWarmupCompleted(@Nullable CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.onExtraCallbackWithResult.indexOf(factory) + 1;
        int size = this.onExtraCallbackWithResult.size();
        for (int i = iIndexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapter = this.onExtraCallbackWithResult.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.onExtraCallbackWithResult.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.onExtraCallbackWithResult.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.onExtraCallbackWithResult.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, RequestBody> onExtraCallbackWithResult(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return IAuthTabCallback(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<T, RequestBody> IAuthTabCallback(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.onWarmupCompleted.indexOf(factory) + 1;
        int size = this.onWarmupCompleted.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.onWarmupCompleted.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.onWarmupCompleted.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.onWarmupCompleted.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.onWarmupCompleted.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<ResponseBody, T> onWarmupCompleted(Type type, Annotation[] annotationArr) {
        return onNavigationEvent(null, type, annotationArr);
    }

    public <T> Converter<ResponseBody, T> onNavigationEvent(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.onWarmupCompleted.indexOf(factory) + 1;
        int size = this.onWarmupCompleted.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.onWarmupCompleted.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.onWarmupCompleted.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.onWarmupCompleted.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.onWarmupCompleted.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, String> onNavigationEvent(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.onWarmupCompleted.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.onWarmupCompleted.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return getSignCertFilename.IAuthTabCallback.IAuthTabCallback;
    }

    public static final class Builder {

        @Nullable
        private Call.Factory IAuthTabCallback;
        private boolean asBinder;

        @Nullable
        private Executor onExtraCallbackWithResult;

        @Nullable
        private HttpUrl onNavigationEvent;
        private final List<Converter.Factory> onExtraCallback = new ArrayList();
        private final List<CallAdapter.Factory> onWarmupCompleted = new ArrayList();

        public Builder() {
        }

        Builder(Retrofit retrofit) {
            this.IAuthTabCallback = retrofit.onNavigationEvent;
            this.onNavigationEvent = retrofit.onExtraCallback;
            int size = retrofit.onWarmupCompleted.size();
            int i = retrofit.asBinder;
            for (int i2 = 1; i2 < size - i; i2++) {
                this.onExtraCallback.add(retrofit.onWarmupCompleted.get(i2));
            }
            int size2 = retrofit.onExtraCallbackWithResult.size();
            int i3 = retrofit.asInterface;
            for (int i4 = 0; i4 < size2 - i3; i4++) {
                this.onWarmupCompleted.add(retrofit.onExtraCallbackWithResult.get(i4));
            }
            this.onExtraCallbackWithResult = retrofit.IAuthTabCallback;
            this.asBinder = retrofit.IAuthTabCallbackDefault;
        }

        public Builder onExtraCallbackWithResult(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return onExtraCallback(okHttpClient);
        }

        public Builder onExtraCallback(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.IAuthTabCallback = factory;
            return this;
        }

        public Builder IAuthTabCallback(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return IAuthTabCallback(HttpUrl.get(str));
        }

        public Builder IAuthTabCallback(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            if (!_UrlKt.FRAGMENT_ENCODE_SET.equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
            }
            this.onNavigationEvent = httpUrl;
            return this;
        }

        public Builder onExtraCallback(Converter.Factory factory) {
            List<Converter.Factory> list = this.onExtraCallback;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder onNavigationEvent(CallAdapter.Factory factory) {
            List<CallAdapter.Factory> list = this.onWarmupCompleted;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Retrofit IAuthTabCallback() {
            if (this.onNavigationEvent == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.IAuthTabCallback;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.onExtraCallbackWithResult;
            if (executor == null) {
                executor = getSubjectDN.onExtraCallback;
            }
            Executor executor2 = executor;
            getSignPrikeyFHFilename getsignprikeyfhfilename = getSubjectDN.onExtraCallbackWithResult;
            ArrayList arrayList = new ArrayList(this.onWarmupCompleted);
            List<? extends CallAdapter.Factory> listIAuthTabCallback = getsignprikeyfhfilename.IAuthTabCallback(executor2);
            arrayList.addAll(listIAuthTabCallback);
            List<? extends Converter.Factory> listOnNavigationEvent = getsignprikeyfhfilename.onNavigationEvent();
            int size = listOnNavigationEvent.size();
            ArrayList arrayList2 = new ArrayList(this.onExtraCallback.size() + 1 + size);
            arrayList2.add(new getSignCertFilename());
            arrayList2.addAll(this.onExtraCallback);
            arrayList2.addAll(listOnNavigationEvent);
            return new Retrofit(factory, this.onNavigationEvent, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listIAuthTabCallback.size(), executor2, this.asBinder);
        }
    }
}
