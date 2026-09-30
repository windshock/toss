package o;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getCert {

    static final class asInterface implements Converter<ResponseBody, String> {
        static final asInterface onExtraCallbackWithResult = new asInterface();

        asInterface() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public String convert(ResponseBody responseBody) throws IOException {
            return responseBody.string();
        }
    }

    static final class onNavigationEvent implements Converter<ResponseBody, Boolean> {
        static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Boolean convert(ResponseBody responseBody) throws IOException {
            return Boolean.valueOf(responseBody.string());
        }
    }

    static final class IAuthTabCallback implements Converter<ResponseBody, Byte> {
        static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Byte convert(ResponseBody responseBody) throws IOException {
            return Byte.valueOf(responseBody.string());
        }
    }

    static final class onExtraCallbackWithResult implements Converter<ResponseBody, Character> {
        static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Character convert(ResponseBody responseBody) throws Throwable {
            String strString = responseBody.string();
            if (strString.length() != 1) {
                throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
            }
            return Character.valueOf(strString.charAt(0));
        }
    }

    static final class onWarmupCompleted implements Converter<ResponseBody, Double> {
        static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Double convert(ResponseBody responseBody) throws IOException {
            return Double.valueOf(responseBody.string());
        }
    }

    static final class onExtraCallback implements Converter<ResponseBody, Float> {
        static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Float convert(ResponseBody responseBody) throws IOException {
            return Float.valueOf(responseBody.string());
        }
    }

    static final class onTransact implements Converter<ResponseBody, Integer> {
        static final onTransact onExtraCallbackWithResult = new onTransact();

        onTransact() {
        }

        @Override // retrofit2.Converter
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Integer convert(ResponseBody responseBody) throws IOException {
            return Integer.valueOf(responseBody.string());
        }
    }

    static final class asBinder implements Converter<ResponseBody, Long> {
        static final asBinder onWarmupCompleted = new asBinder();

        asBinder() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Long convert(ResponseBody responseBody) throws IOException {
            return Long.valueOf(responseBody.string());
        }
    }

    static final class IAuthTabCallbackStub implements Converter<ResponseBody, Short> {
        static final IAuthTabCallbackStub onExtraCallbackWithResult = new IAuthTabCallbackStub();

        IAuthTabCallbackStub() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Short convert(ResponseBody responseBody) throws IOException {
            return Short.valueOf(responseBody.string());
        }
    }
}
