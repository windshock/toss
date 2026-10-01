package o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Converter;
import retrofit2.RequestBuilder;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setBSignCertB64<T> {
    public abstract void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) throws IOException;

    setBSignCertB64() {
    }

    public final setBSignCertB64<Iterable<T>> IAuthTabCallback() {
        return new setBSignCertB64<Iterable<T>>() { // from class: o.setBSignCertB64.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.setBSignCertB64
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    Iterator<T> it = iterable.iterator();
                    while (it.hasNext()) {
                        setBSignCertB64.this.onExtraCallbackWithResult(requestBuilder, it.next());
                    }
                }
            }
        };
    }

    public final setBSignCertB64<Object> onWarmupCompleted() {
        return new setBSignCertB64<Object>() { // from class: o.setBSignCertB64.3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.setBSignCertB64
            public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        setBSignCertB64.this.onExtraCallbackWithResult(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    public static final class access100 extends setBSignCertB64<Object> {
        private final int onNavigationEvent;
        private final Method onWarmupCompleted;

        public access100(Method method, int i) {
            this.onWarmupCompleted = method;
            this.onNavigationEvent = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Object obj) {
            if (obj == null) {
                throw getDirNames.onWarmupCompleted(this.onWarmupCompleted, this.onNavigationEvent, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.onExtraCallbackWithResult(obj);
        }
    }

    public static final class IAuthTabCallback<T> extends setBSignCertB64<T> {
        private final String onExtraCallback;
        private final Converter<T, String> onExtraCallbackWithResult;
        private final boolean onNavigationEvent;

        public IAuthTabCallback(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = converter;
            this.onNavigationEvent = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.onExtraCallbackWithResult.convert(t)) == null) {
                return;
            }
            requestBuilder.onWarmupCompleted(this.onExtraCallback, strConvert, this.onNavigationEvent);
        }
    }

    public static final class asInterface<T> extends setBSignCertB64<T> {
        private final Converter<T, String> IAuthTabCallback;
        private final Method onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final boolean onWarmupCompleted;

        public asInterface(Method method, int i, String str, Converter<T, String> converter, boolean z) {
            this.onExtraCallback = method;
            this.onExtraCallbackWithResult = i;
            Objects.requireNonNull(str, "name == null");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = converter;
            this.onWarmupCompleted = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t == null) {
                throw getDirNames.onWarmupCompleted(this.onExtraCallback, this.onExtraCallbackWithResult, "Path parameter \"" + this.onNavigationEvent + "\" value must not be null.", new Object[0]);
            }
            requestBuilder.IAuthTabCallback(this.onNavigationEvent, this.IAuthTabCallback.convert(t), this.onWarmupCompleted);
        }
    }

    public static final class onTransact<T> extends setBSignCertB64<T> {
        private final String onExtraCallback;
        private final Converter<T, String> onExtraCallbackWithResult;
        private final boolean onWarmupCompleted;

        public onTransact(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = converter;
            this.onWarmupCompleted = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.onExtraCallbackWithResult.convert(t)) == null) {
                return;
            }
            requestBuilder.onNavigationEvent(this.onExtraCallback, strConvert, this.onWarmupCompleted);
        }
    }

    public static final class IAuthTabCallback_Parcel<T> extends setBSignCertB64<T> {
        private final boolean IAuthTabCallback;
        private final Converter<T, String> onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Converter<T, String> converter, boolean z) {
            this.onExtraCallbackWithResult = converter;
            this.IAuthTabCallback = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            requestBuilder.onNavigationEvent(this.onExtraCallbackWithResult.convert(t), (String) null, this.IAuthTabCallback);
        }
    }

    public static final class IAuthTabCallbackStubProxy<T> extends setBSignCertB64<Map<String, T>> {
        private final Converter<T, String> IAuthTabCallback;
        private final int onExtraCallback;
        private final Method onExtraCallbackWithResult;
        private final boolean onWarmupCompleted;

        public IAuthTabCallbackStubProxy(Method method, int i, Converter<T, String> converter, boolean z) {
            this.onExtraCallbackWithResult = method;
            this.onExtraCallback = i;
            this.IAuthTabCallback = converter;
            this.onWarmupCompleted = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw getDirNames.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw getDirNames.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw getDirNames.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.IAuthTabCallback.convert(value);
                if (strConvert == null) {
                    throw getDirNames.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, "Query map value '" + value + "' converted to null by " + this.IAuthTabCallback.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.onNavigationEvent(key, strConvert, this.onWarmupCompleted);
            }
        }
    }

    public static final class onWarmupCompleted<T> extends setBSignCertB64<Map<String, T>> {
        private final Method IAuthTabCallback;
        private final Converter<T, String> onExtraCallback;
        private final boolean onNavigationEvent;
        private final int onWarmupCompleted;

        public onWarmupCompleted(Method method, int i, Converter<T, String> converter, boolean z) {
            this.IAuthTabCallback = method;
            this.onWarmupCompleted = i;
            this.onExtraCallback = converter;
            this.onNavigationEvent = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onWarmupCompleted, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onWarmupCompleted, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onWarmupCompleted, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.onWarmupCompleted(key, this.onExtraCallback.convert(value), this.onNavigationEvent);
            }
        }
    }

    public static final class IAuthTabCallbackDefault extends setBSignCertB64<Headers> {
        private final Method IAuthTabCallback;
        private final int onWarmupCompleted;

        public IAuthTabCallbackDefault(Method method, int i) {
            this.IAuthTabCallback = method;
            this.onWarmupCompleted = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Headers headers) {
            if (headers == null) {
                throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onWarmupCompleted, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.IAuthTabCallback(headers);
        }
    }

    public static final class onExtraCallbackWithResult<T> extends setBSignCertB64<T> {
        private final boolean IAuthTabCallback;
        private final String onExtraCallback;
        private final Converter<T, String> onExtraCallbackWithResult;

        public onExtraCallbackWithResult(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = converter;
            this.IAuthTabCallback = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.onExtraCallbackWithResult.convert(t)) == null) {
                return;
            }
            requestBuilder.onExtraCallbackWithResult(this.onExtraCallback, strConvert, this.IAuthTabCallback);
        }
    }

    public static final class onExtraCallback<T> extends setBSignCertB64<Map<String, T>> {
        private final Method IAuthTabCallback;
        private final Converter<T, String> onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final boolean onWarmupCompleted;

        public onExtraCallback(Method method, int i, Converter<T, String> converter, boolean z) {
            this.IAuthTabCallback = method;
            this.onNavigationEvent = i;
            this.onExtraCallbackWithResult = converter;
            this.onWarmupCompleted = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onNavigationEvent, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onNavigationEvent, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onNavigationEvent, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.onExtraCallbackWithResult.convert(value);
                if (strConvert == null) {
                    throw getDirNames.onWarmupCompleted(this.IAuthTabCallback, this.onNavigationEvent, "Field map value '" + value + "' converted to null by " + this.onExtraCallbackWithResult.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.onExtraCallbackWithResult(key, strConvert, this.onWarmupCompleted);
            }
        }
    }

    public static final class IAuthTabCallbackStub<T> extends setBSignCertB64<T> {
        private final int IAuthTabCallback;
        private final Converter<T, RequestBody> onExtraCallback;
        private final Method onExtraCallbackWithResult;
        private final Headers onWarmupCompleted;

        public IAuthTabCallbackStub(Method method, int i, Headers headers, Converter<T, RequestBody> converter) {
            this.onExtraCallbackWithResult = method;
            this.IAuthTabCallback = i;
            this.onWarmupCompleted = headers;
            this.onExtraCallback = converter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                requestBuilder.IAuthTabCallback(this.onWarmupCompleted, this.onExtraCallback.convert(t));
            } catch (IOException e) {
                throw getDirNames.onWarmupCompleted(this.onExtraCallbackWithResult, this.IAuthTabCallback, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class getInterfaceDescriptor extends setBSignCertB64<MultipartBody.Part> {
        public static final getInterfaceDescriptor onExtraCallback = new getInterfaceDescriptor();

        private getInterfaceDescriptor() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.onExtraCallback(part);
            }
        }
    }

    public static final class asBinder<T> extends setBSignCertB64<Map<String, T>> {
        private final Converter<T, RequestBody> IAuthTabCallback;
        private final Method onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public asBinder(Method method, int i, Converter<T, RequestBody> converter, String str) {
            this.onExtraCallback = method;
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = converter;
            this.onNavigationEvent = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw getDirNames.onWarmupCompleted(this.onExtraCallback, this.onExtraCallbackWithResult, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw getDirNames.onWarmupCompleted(this.onExtraCallback, this.onExtraCallbackWithResult, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw getDirNames.onWarmupCompleted(this.onExtraCallback, this.onExtraCallbackWithResult, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.IAuthTabCallback(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.onNavigationEvent), this.IAuthTabCallback.convert(value));
            }
        }
    }

    public static final class onNavigationEvent<T> extends setBSignCertB64<T> {
        private final Method onExtraCallback;
        private final int onNavigationEvent;
        private final Converter<T, RequestBody> onWarmupCompleted;

        public onNavigationEvent(Method method, int i, Converter<T, RequestBody> converter) {
            this.onExtraCallback = method;
            this.onNavigationEvent = i;
            this.onWarmupCompleted = converter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                throw getDirNames.onWarmupCompleted(this.onExtraCallback, this.onNavigationEvent, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.onExtraCallback(this.onWarmupCompleted.convert(t));
            } catch (IOException e) {
                throw getDirNames.onExtraCallback(this.onExtraCallback, e, this.onNavigationEvent, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class access000<T> extends setBSignCertB64<T> {
        public final Class<T> onExtraCallback;

        public access000(Class<T> cls) {
            this.onExtraCallback = cls;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setBSignCertB64
        public void onExtraCallbackWithResult(RequestBuilder requestBuilder, @Nullable T t) {
            requestBuilder.onExtraCallbackWithResult(this.onExtraCallback, t);
        }
    }
}
