package o;

import android.R;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access17700 {
    public static <T, R> boolean onExtraCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends R>> deserializeintnullablecollection) {
        if (!(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk instanceof Callable)) {
            return false;
        }
        try {
            R.bool boolVar = (Object) ((Callable) r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk).call();
            if (boolVar == null) {
                access25900.complete(ycxexternalsyntheticlambda0);
                return true;
            }
            try {
                r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2 = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection.apply(boolVar), "The mapper returned a null Publisher");
                if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2).call();
                        if (objCall == null) {
                            access25900.complete(ycxexternalsyntheticlambda0);
                            return true;
                        }
                        ycxexternalsyntheticlambda0.onExtraCallback(new removeLogs(ycxexternalsyntheticlambda0, objCall));
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        access25900.error(th, ycxexternalsyntheticlambda0);
                        return true;
                    }
                } else {
                    r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk2.subscribe(ycxexternalsyntheticlambda0);
                }
                return true;
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                access25900.error(th2, ycxexternalsyntheticlambda0);
                return true;
            }
        } catch (Throwable th3) {
            NumberConverter.onWarmupCompleted(th3);
            access25900.error(th3, ycxexternalsyntheticlambda0);
            return true;
        }
    }

    public static <T, U> JsonReaderUnknownNumberParsing<U> onNavigationEvent(T t, deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U>> deserializeintnullablecollection) {
        return RxJavaPlugins.onExtraCallbackWithResult(new IAuthTabCallback(t, deserializeintnullablecollection));
    }

    static final class IAuthTabCallback<T, R> extends JsonReaderUnknownNumberParsing<R> {
        final T onExtraCallback;
        final deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends R>> onNavigationEvent;

        IAuthTabCallback(T t, deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends R>> deserializeintnullablecollection) {
            this.onExtraCallback = t;
            this.onNavigationEvent = deserializeintnullablecollection;
        }

        @Override // o.JsonReaderUnknownNumberParsing
        public void onNavigationEvent(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0) {
            try {
                r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(this.onNavigationEvent.apply(this.onExtraCallback), "The mapper returned a null Publisher");
                if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk instanceof Callable) {
                    try {
                        Object objCall = ((Callable) r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk).call();
                        if (objCall == null) {
                            access25900.complete(ycxexternalsyntheticlambda0);
                            return;
                        } else {
                            ycxexternalsyntheticlambda0.onExtraCallback(new removeLogs(ycxexternalsyntheticlambda0, objCall));
                            return;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        access25900.error(th, ycxexternalsyntheticlambda0);
                        return;
                    }
                }
                r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(ycxexternalsyntheticlambda0);
            } catch (Throwable th2) {
                access25900.error(th2, ycxexternalsyntheticlambda0);
            }
        }
    }
}
