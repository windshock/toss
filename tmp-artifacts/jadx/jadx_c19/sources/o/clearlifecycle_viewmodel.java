package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import o.getViewLifecycleOwner;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class clearlifecycle_viewmodel {
    protected clearlifecycle_viewmodel() {
    }

    public static void onExtraCallback(Map<String, FragmentFactory<?>> map) {
        map.put(Integer.class.getName(), new onNavigationEvent(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new onNavigationEvent(cls));
        map.put(Long.class.getName(), new asInterface(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new asInterface(cls2));
        String name = Byte.class.getName();
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallbackWithResult;
        map.put(name, onwarmupcompleted);
        map.put(Byte.TYPE.getName(), onwarmupcompleted);
        String name2 = Short.class.getName();
        asBinder asbinder = asBinder.onExtraCallback;
        map.put(name2, asbinder);
        map.put(Short.TYPE.getName(), asbinder);
        map.put(Double.class.getName(), new onExtraCallbackWithResult(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new onExtraCallbackWithResult(cls3));
        String name3 = Float.class.getName();
        onExtraCallback onextracallback = onExtraCallback.onExtraCallbackWithResult;
        map.put(name3, onextracallback);
        map.put(Float.TYPE.getName(), onextracallback);
    }

    public static abstract class IAuthTabCallback<T> extends LifecycleEffectKtExternalSyntheticLambda1<T> implements assertMainThread {
        protected final boolean _isInt;
        protected final getViewLifecycleOwner.IAuthTabCallback _numberType;
        protected final String _schemaType;

        protected IAuthTabCallback(Class<?> cls, getViewLifecycleOwner.IAuthTabCallback iAuthTabCallback, String str) {
            super(cls, false);
            this._numberType = iAuthTabCallback;
            this._schemaType = str;
            this._isInt = iAuthTabCallback == getViewLifecycleOwner.IAuthTabCallback.INT || iAuthTabCallback == getViewLifecycleOwner.IAuthTabCallback.LONG || iAuthTabCallback == getViewLifecycleOwner.IAuthTabCallback.BIG_INTEGER;
        }

        @Override // o.assertMainThread
        public FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
            registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, (Class<?>) onWarmupCompleted());
            if (registeronpreattachlistener_onextracallbackOnWarmupCompleted == null || AnonymousClass3.onNavigationEvent[registeronpreattachlistener_onextracallbackOnWarmupCompleted.onExtraCallback().ordinal()] != 1) {
                return this;
            }
            if (onWarmupCompleted() == BigDecimal.class) {
                return TransformationsswitchMap2ExternalSyntheticLambda0.onNavigationEvent();
            }
            return LifecycleEffectKtExternalSyntheticLambda13.onNavigationEvent;
        }
    }

    /* renamed from: o.clearlifecycle_viewmodel$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[registerOnPreAttachListener$onWarmupCompleted.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[registerOnPreAttachListener$onWarmupCompleted.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @FragmentManagerExternalSyntheticLambda0
    public static class asBinder extends IAuthTabCallback<Object> {
        static final asBinder onExtraCallback = new asBinder();

        public asBinder() {
            super(Short.class, getViewLifecycleOwner.IAuthTabCallback.INT, "integer");
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onNavigationEvent(((Short) obj).shortValue());
        }
    }

    @FragmentManagerExternalSyntheticLambda0
    public static class onNavigationEvent extends IAuthTabCallback<Object> {
        public onNavigationEvent(Class<?> cls) {
            super(cls, getViewLifecycleOwner.IAuthTabCallback.INT, "integer");
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onExtraCallbackWithResult(((Integer) obj).intValue());
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda1, o.FragmentFactory
        public void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
            onExtraCallback(obj, getview, fragmentManagerExternalSyntheticLambda1);
        }
    }

    @FragmentManagerExternalSyntheticLambda0
    public static class onWarmupCompleted extends IAuthTabCallback<Object> {
        static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        public onWarmupCompleted() {
            super(Number.class, getViewLifecycleOwner.IAuthTabCallback.INT, "integer");
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onExtraCallbackWithResult(((Number) obj).intValue());
        }
    }

    @FragmentManagerExternalSyntheticLambda0
    public static class asInterface extends IAuthTabCallback<Object> {
        public asInterface(Class<?> cls) {
            super(cls, getViewLifecycleOwner.IAuthTabCallback.LONG, "integer");
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onExtraCallback(((Long) obj).longValue());
        }
    }

    @FragmentManagerExternalSyntheticLambda0
    public static class onExtraCallback extends IAuthTabCallback<Object> {
        static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        public onExtraCallback() {
            super(Float.class, getViewLifecycleOwner.IAuthTabCallback.FLOAT, "number");
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onNavigationEvent(((Float) obj).floatValue());
        }
    }

    @FragmentManagerExternalSyntheticLambda0
    public static class onExtraCallbackWithResult extends IAuthTabCallback<Object> {
        public onExtraCallbackWithResult(Class<?> cls) {
            super(cls, getViewLifecycleOwner.IAuthTabCallback.DOUBLE, "number");
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onExtraCallbackWithResult(((Double) obj).doubleValue());
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda1, o.FragmentFactory
        public void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
            Double d = (Double) obj;
            if (requireActivity.onNavigationEvent(d.doubleValue())) {
                setRetainInstance setretaininstanceOnExtraCallbackWithResult = gridLayout.onExtraCallbackWithResult(getview, gridLayout.IAuthTabCallback(obj, getTargetRequestCode.VALUE_NUMBER_FLOAT));
                getview.onExtraCallbackWithResult(d.doubleValue());
                gridLayout.IAuthTabCallback(getview, setretaininstanceOnExtraCallbackWithResult);
                return;
            }
            getview.onExtraCallbackWithResult(d.doubleValue());
        }
    }
}
