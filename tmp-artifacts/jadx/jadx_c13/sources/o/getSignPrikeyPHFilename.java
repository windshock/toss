package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.getDirNames;
import okhttp3.Call;
import okhttp3.ResponseBody;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.RequestFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class getSignPrikeyPHFilename<ResponseT, ReturnT> extends getFileNames<ReturnT> {
    private final Call.Factory onExtraCallback;
    private final Converter<ResponseBody, ResponseT> onExtraCallbackWithResult;
    private final RequestFactory onNavigationEvent;

    @Nullable
    protected abstract ReturnT onNavigationEvent(getSignPrikeyCCFBPHFilename<ResponseT> getsignprikeyccfbphfilename, Object[] objArr);

    static <ResponseT, ReturnT> getSignPrikeyPHFilename<ResponseT, ReturnT> onExtraCallbackWithResult(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean zOnExtraCallback;
        boolean z3 = requestFactory.onExtraCallback;
        Annotation[] annotations = method.getAnnotations();
        if (z3) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            z = true;
            Type typeOnNavigationEvent = getDirNames.onNavigationEvent(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (getDirNames.onWarmupCompleted(typeOnNavigationEvent) == Response.class && (typeOnNavigationEvent instanceof ParameterizedType)) {
                typeOnNavigationEvent = getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) typeOnNavigationEvent);
                zOnExtraCallback = false;
            } else {
                if (getDirNames.onWarmupCompleted(typeOnNavigationEvent) == getSignPrikeyCCFBPHFilename.class) {
                    throw getDirNames.IAuthTabCallback(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) typeOnNavigationEvent));
                }
                zOnExtraCallback = getDirNames.onExtraCallback(typeOnNavigationEvent);
                z = false;
            }
            genericReturnType = new getDirNames.onNavigationEvent(null, getSignPrikeyCCFBPHFilename.class, typeOnNavigationEvent);
            annotations = isEqual.onExtraCallback(annotations);
            z2 = zOnExtraCallback;
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
            z2 = false;
        }
        CallAdapter callAdapterOnNavigationEvent = onNavigationEvent(retrofit, method, genericReturnType, annotations);
        Type typeResponseType = callAdapterOnNavigationEvent.responseType();
        if (typeResponseType == okhttp3.Response.class) {
            throw getDirNames.IAuthTabCallback(method, "'" + getDirNames.onWarmupCompleted(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == Response.class) {
            throw getDirNames.IAuthTabCallback(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.onNavigationEvent.equals("HEAD") && !Void.class.equals(typeResponseType) && !getDirNames.onExtraCallback(typeResponseType)) {
            throw getDirNames.IAuthTabCallback(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        Converter converterOnExtraCallback = onExtraCallback(retrofit, method, typeResponseType);
        Call.Factory factory = retrofit.onNavigationEvent;
        if (!z3) {
            return new onExtraCallbackWithResult(requestFactory, factory, converterOnExtraCallback, callAdapterOnNavigationEvent);
        }
        if (z) {
            return new IAuthTabCallback(requestFactory, factory, converterOnExtraCallback, callAdapterOnNavigationEvent);
        }
        return new onNavigationEvent(requestFactory, factory, converterOnExtraCallback, callAdapterOnNavigationEvent, false, z2);
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> onNavigationEvent(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.IAuthTabCallback(type, annotationArr);
        } catch (RuntimeException e) {
            throw getDirNames.onWarmupCompleted(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<ResponseBody, ResponseT> onExtraCallback(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.onWarmupCompleted(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw getDirNames.onWarmupCompleted(method, e, "Unable to create converter for %s", type);
        }
    }

    getSignPrikeyPHFilename(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter) {
        this.onNavigationEvent = requestFactory;
        this.onExtraCallback = factory;
        this.onExtraCallbackWithResult = converter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getFileNames
    @Nullable
    public final ReturnT onExtraCallbackWithResult(Object obj, Object[] objArr) {
        return onNavigationEvent(new initCert(this.onNavigationEvent, obj, objArr, this.onExtraCallback, this.onExtraCallbackWithResult), objArr);
    }

    static final class onExtraCallbackWithResult<ResponseT, ReturnT> extends getSignPrikeyPHFilename<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> onExtraCallbackWithResult;

        onExtraCallbackWithResult(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, factory, converter);
            this.onExtraCallbackWithResult = callAdapter;
        }

        @Override // o.getSignPrikeyPHFilename
        protected ReturnT onNavigationEvent(getSignPrikeyCCFBPHFilename<ResponseT> getsignprikeyccfbphfilename, Object[] objArr) {
            return this.onExtraCallbackWithResult.adapt(getsignprikeyccfbphfilename);
        }
    }

    static final class IAuthTabCallback<ResponseT> extends getSignPrikeyPHFilename<ResponseT, Object> {
        private final CallAdapter<ResponseT, getSignPrikeyCCFBPHFilename<ResponseT>> onNavigationEvent;

        IAuthTabCallback(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, getSignPrikeyCCFBPHFilename<ResponseT>> callAdapter) {
            super(requestFactory, factory, converter);
            this.onNavigationEvent = callAdapter;
        }

        @Override // o.getSignPrikeyPHFilename
        protected Object onNavigationEvent(getSignPrikeyCCFBPHFilename<ResponseT> getsignprikeyccfbphfilename, Object[] objArr) {
            getSignPrikeyCCFBPHFilename<ResponseT> getsignprikeyccfbphfilenameAdapt = this.onNavigationEvent.adapt(getsignprikeyccfbphfilename);
            access13800 access13800Var = (access13800) objArr[objArr.length - 1];
            try {
                return getSubjectKeyIdentifier.onNavigationEvent(getsignprikeyccfbphfilenameAdapt, access13800Var);
            } catch (Exception e) {
                return getSubjectKeyIdentifier.onNavigationEvent(e, access13800Var);
            }
        }
    }

    static final class onNavigationEvent<ResponseT> extends getSignPrikeyPHFilename<ResponseT, Object> {
        private final CallAdapter<ResponseT, getSignPrikeyCCFBPHFilename<ResponseT>> onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final boolean onNavigationEvent;

        onNavigationEvent(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, getSignPrikeyCCFBPHFilename<ResponseT>> callAdapter, boolean z, boolean z2) {
            super(requestFactory, factory, converter);
            this.onExtraCallback = callAdapter;
            this.onNavigationEvent = z;
            this.onExtraCallbackWithResult = z2;
        }

        @Override // o.getSignPrikeyPHFilename
        protected Object onNavigationEvent(getSignPrikeyCCFBPHFilename<ResponseT> getsignprikeyccfbphfilename, Object[] objArr) {
            getSignPrikeyCCFBPHFilename<ResponseT> getsignprikeyccfbphfilenameAdapt = this.onExtraCallback.adapt(getsignprikeyccfbphfilename);
            access13800 access13800Var = (access13800) objArr[objArr.length - 1];
            try {
                if (this.onExtraCallbackWithResult) {
                    return getSubjectKeyIdentifier.onWarmupCompleted(getsignprikeyccfbphfilenameAdapt, access13800Var);
                }
                if (this.onNavigationEvent) {
                    return getSubjectKeyIdentifier.IAuthTabCallback(getsignprikeyccfbphfilenameAdapt, access13800Var);
                }
                return getSubjectKeyIdentifier.onExtraCallbackWithResult(getsignprikeyccfbphfilenameAdapt, access13800Var);
            } catch (LinkageError e) {
                throw e;
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (VirtualMachineError e3) {
                throw e3;
            } catch (Throwable th) {
                return getSubjectKeyIdentifier.onNavigationEvent(th, access13800Var);
            }
        }
    }
}
