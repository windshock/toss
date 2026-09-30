package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import o.FragmentFactory;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class LifecycleService extends FragmentManagerExternalSyntheticLambda1 implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient Map<Object, RepeatOnLifecycleKtrepeatOnLifecycle3111111> ICustomTabsCallback;
    protected transient getView getInterfaceDescriptor;
    protected transient ArrayList<getParentFragmentManager<?>> readTypedObject;

    public abstract LifecycleService onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, getVersion getversion);

    protected LifecycleService() {
    }

    protected LifecycleService(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, findFragmentByTag findfragmentbytag, getVersion getversion) {
        super(fragmentManagerExternalSyntheticLambda1, findfragmentbytag, getversion);
    }

    @Override // o.FragmentManagerExternalSyntheticLambda1
    public FragmentFactory<Object> onNavigationEvent(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws InvalidDefinitionException, JsonMappingException {
        FragmentFactory<?> fragmentFactory;
        if (obj == null) {
            return null;
        }
        if (obj instanceof FragmentFactory) {
            fragmentFactory = (FragmentFactory) obj;
        } else {
            if (!(obj instanceof Class)) {
                onWarmupCompleted(internalpathiteratorpeek.IAuthTabCallback(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls != FragmentFactory.onWarmupCompleted.class) {
                if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
                    if (!FragmentFactory.class.isAssignableFrom(cls)) {
                        onWarmupCompleted(internalpathiteratorpeek.IAuthTabCallback(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
                    }
                    RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = this.onExtraCallbackWithResult.access000();
                    FragmentFactory<?> fragmentFactoryOnNavigationEvent = radioButtonKtRadioButtonElement24Access000 != null ? radioButtonKtRadioButtonElement24Access000.onNavigationEvent(this.onExtraCallbackWithResult, internalpathiteratorpeek, cls) : null;
                    fragmentFactory = fragmentFactoryOnNavigationEvent == null ? (FragmentFactory) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, this.onExtraCallbackWithResult.asInterface()) : fragmentFactoryOnNavigationEvent;
                }
            }
            return null;
        }
        return onExtraCallback(fragmentFactory);
    }

    @Override // o.FragmentManagerExternalSyntheticLambda1
    public Object IAuthTabCallback(nSetBufferTransparency nsetbuffertransparency, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = this.onExtraCallbackWithResult.access000();
        Object objOnNavigationEvent = radioButtonKtRadioButtonElement24Access000 != null ? radioButtonKtRadioButtonElement24Access000.onNavigationEvent(this.onExtraCallbackWithResult, nsetbuffertransparency, cls) : null;
        return objOnNavigationEvent == null ? SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, this.onExtraCallbackWithResult.asInterface()) : objOnNavigationEvent;
    }

    @Override // o.FragmentManagerExternalSyntheticLambda1
    public boolean onNavigationEvent(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e) {
            onNavigationEvent(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), e.getClass().getName(), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e)), e);
            return false;
        }
    }

    @Override // o.FragmentManagerExternalSyntheticLambda1
    public RepeatOnLifecycleKtrepeatOnLifecycle3111111 onExtraCallbackWithResult(Object obj, getParentFragmentManager<?> getparentfragmentmanager) {
        getParentFragmentManager<?> getparentfragmentmanagerOnExtraCallbackWithResult;
        Map<Object, RepeatOnLifecycleKtrepeatOnLifecycle3111111> map = this.ICustomTabsCallback;
        if (map == null) {
            this.ICustomTabsCallback = IAuthTabCallback_Parcel();
        } else {
            RepeatOnLifecycleKtrepeatOnLifecycle3111111 repeatOnLifecycleKtrepeatOnLifecycle3111111 = map.get(obj);
            if (repeatOnLifecycleKtrepeatOnLifecycle3111111 != null) {
                return repeatOnLifecycleKtrepeatOnLifecycle3111111;
            }
        }
        ArrayList<getParentFragmentManager<?>> arrayList = this.readTypedObject;
        if (arrayList == null) {
            this.readTypedObject = new ArrayList<>(8);
        } else {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                getparentfragmentmanagerOnExtraCallbackWithResult = this.readTypedObject.get(i2);
                if (getparentfragmentmanagerOnExtraCallbackWithResult.IAuthTabCallback(getparentfragmentmanager)) {
                    break;
                }
            }
        }
        getparentfragmentmanagerOnExtraCallbackWithResult = null;
        if (getparentfragmentmanagerOnExtraCallbackWithResult == null) {
            getparentfragmentmanagerOnExtraCallbackWithResult = getparentfragmentmanager.onExtraCallbackWithResult(this);
            this.readTypedObject.add(getparentfragmentmanagerOnExtraCallbackWithResult);
        }
        RepeatOnLifecycleKtrepeatOnLifecycle3111111 repeatOnLifecycleKtrepeatOnLifecycle31111112 = new RepeatOnLifecycleKtrepeatOnLifecycle3111111(getparentfragmentmanagerOnExtraCallbackWithResult);
        this.ICustomTabsCallback.put(obj, repeatOnLifecycleKtrepeatOnLifecycle31111112);
        return repeatOnLifecycleKtrepeatOnLifecycle31111112;
    }

    protected Map<Object, RepeatOnLifecycleKtrepeatOnLifecycle3111111> IAuthTabCallback_Parcel() {
        if (IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    @Override // o.FragmentManagerExternalSyntheticLambda1
    public getView IAuthTabCallbackStub() {
        return this.getInterfaceDescriptor;
    }

    public void onExtraCallback(getView getview, Object obj) throws IOException, JsonMappingException {
        this.getInterfaceDescriptor = getview;
        if (obj == null) {
            onExtraCallbackWithResult(getview);
            return;
        }
        Class<?> cls = obj.getClass();
        FragmentFactory<Object> fragmentFactoryIAuthTabCallback = IAuthTabCallback(cls, true, (validateRequestPermissionsRequestCode) null);
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy = this.onExtraCallbackWithResult.ICustomTabsCallbackStubProxy();
        if (fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy == null) {
            if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.WRAP_ROOT_VALUE)) {
                IAuthTabCallback(getview, obj, fragmentFactoryIAuthTabCallback, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(cls));
                return;
            }
        } else if (!fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy.onExtraCallback()) {
            IAuthTabCallback(getview, obj, fragmentFactoryIAuthTabCallback, fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy);
            return;
        }
        onWarmupCompleted(getview, obj, fragmentFactoryIAuthTabCallback);
    }

    public void onExtraCallback(getView getview, Object obj, JavaType javaType) throws InvalidDefinitionException, IOException, JsonMappingException {
        this.getInterfaceDescriptor = getview;
        if (obj == null) {
            onExtraCallbackWithResult(getview);
            return;
        }
        if (!javaType.asBinder().isAssignableFrom(obj.getClass())) {
            onWarmupCompleted(obj, javaType);
        }
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = onExtraCallback(javaType, true, (validateRequestPermissionsRequestCode) null);
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy = this.onExtraCallbackWithResult.ICustomTabsCallbackStubProxy();
        if (fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy == null) {
            if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.WRAP_ROOT_VALUE)) {
                IAuthTabCallback(getview, obj, fragmentFactoryOnExtraCallback, this.onExtraCallbackWithResult.IAuthTabCallbackStub(javaType));
                return;
            }
        } else if (!fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy.onExtraCallback()) {
            IAuthTabCallback(getview, obj, fragmentFactoryOnExtraCallback, fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy);
            return;
        }
        onWarmupCompleted(getview, obj, fragmentFactoryOnExtraCallback);
    }

    public void onWarmupCompleted(getView getview, Object obj, JavaType javaType, FragmentFactory<Object> fragmentFactory) throws InvalidDefinitionException, IOException, JsonMappingException {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0IAuthTabCallbackStub;
        this.getInterfaceDescriptor = getview;
        if (obj == null) {
            onExtraCallbackWithResult(getview);
            return;
        }
        if (javaType != null && !javaType.asBinder().isAssignableFrom(obj.getClass())) {
            onWarmupCompleted(obj, javaType);
        }
        if (fragmentFactory == null) {
            fragmentFactory = onExtraCallback(javaType, true, (validateRequestPermissionsRequestCode) null);
        }
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy = this.onExtraCallbackWithResult.ICustomTabsCallbackStubProxy();
        if (fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy == null) {
            if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    fragmentKtExternalSyntheticLambda0IAuthTabCallbackStub = this.onExtraCallbackWithResult.IAuthTabCallbackDefault(obj.getClass());
                } else {
                    fragmentKtExternalSyntheticLambda0IAuthTabCallbackStub = this.onExtraCallbackWithResult.IAuthTabCallbackStub(javaType);
                }
                IAuthTabCallback(getview, obj, fragmentFactory, fragmentKtExternalSyntheticLambda0IAuthTabCallbackStub);
                return;
            }
        } else if (!fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy.onExtraCallback()) {
            IAuthTabCallback(getview, obj, fragmentFactory, fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy);
            return;
        }
        onWarmupCompleted(getview, obj, fragmentFactory);
    }

    public void onWarmupCompleted(getView getview, Object obj, JavaType javaType, FragmentFactory<Object> fragmentFactory, GridLayout gridLayout) throws InvalidDefinitionException, IOException, JsonMappingException {
        boolean zOnExtraCallbackWithResult;
        this.getInterfaceDescriptor = getview;
        if (obj == null) {
            onExtraCallbackWithResult(getview);
            return;
        }
        if (javaType != null && !javaType.asBinder().isAssignableFrom(obj.getClass())) {
            onWarmupCompleted(obj, javaType);
        }
        if (fragmentFactory == null) {
            if (javaType != null && javaType.onPostMessage()) {
                fragmentFactory = IAuthTabCallback(javaType, (validateRequestPermissionsRequestCode) null);
            } else {
                fragmentFactory = onNavigationEvent(obj.getClass(), (validateRequestPermissionsRequestCode) null);
            }
        }
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy = this.onExtraCallbackWithResult.ICustomTabsCallbackStubProxy();
        if (fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy == null) {
            zOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.WRAP_ROOT_VALUE);
            if (zOnExtraCallbackWithResult) {
                getview.getInterfaceDescriptor();
                getview.onNavigationEvent(this.onExtraCallbackWithResult.IAuthTabCallbackDefault(obj.getClass()).onExtraCallbackWithResult(this.onExtraCallbackWithResult));
            }
        } else if (fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy.onExtraCallback()) {
            zOnExtraCallbackWithResult = false;
        } else {
            getview.getInterfaceDescriptor();
            getview.onExtraCallbackWithResult(fragmentKtExternalSyntheticLambda0ICustomTabsCallbackStubProxy.onExtraCallbackWithResult());
            zOnExtraCallbackWithResult = true;
        }
        try {
            fragmentFactory.onExtraCallbackWithResult(obj, getview, this, gridLayout);
            if (zOnExtraCallbackWithResult) {
                getview.access000();
            }
        } catch (Exception e) {
            throw onExtraCallbackWithResult(getview, e);
        }
    }

    private final void IAuthTabCallback(getView getview, Object obj, FragmentFactory<Object> fragmentFactory, FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0) throws IOException {
        try {
            getview.getInterfaceDescriptor();
            getview.onNavigationEvent(fragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(this.onExtraCallbackWithResult));
            fragmentFactory.onExtraCallback(obj, getview, this);
            getview.access000();
        } catch (Exception e) {
            throw onExtraCallbackWithResult(getview, e);
        }
    }

    private final void onWarmupCompleted(getView getview, Object obj, FragmentFactory<Object> fragmentFactory) throws IOException {
        try {
            fragmentFactory.onExtraCallback(obj, getview, this);
        } catch (Exception e) {
            throw onExtraCallbackWithResult(getview, e);
        }
    }

    protected void onExtraCallbackWithResult(getView getview) throws IOException {
        try {
            asBinder().onExtraCallback(null, getview, this);
        } catch (Exception e) {
            throw onExtraCallbackWithResult(getview, e);
        }
    }

    private IOException onExtraCallbackWithResult(getView getview, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strOnExtraCallback = SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(exc);
        if (strOnExtraCallback == null) {
            strOnExtraCallback = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(getview, strOnExtraCallback, exc);
    }

    public static final class onNavigationEvent extends LifecycleService {
        private static final long serialVersionUID = 1;

        public onNavigationEvent() {
        }

        protected onNavigationEvent(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, findFragmentByTag findfragmentbytag, getVersion getversion) {
            super(fragmentManagerExternalSyntheticLambda1, findfragmentbytag, getversion);
        }

        @Override // o.LifecycleService
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onNavigationEvent onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, getVersion getversion) {
            return new onNavigationEvent(this, findfragmentbytag, getversion);
        }
    }
}
