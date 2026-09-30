package o;

import com.fasterxml.jackson.databind.JavaType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.Fragment;
import o.FragmentManagerExternalSyntheticLambda5;
import o.SavedStateHandleSaverKtExternalSyntheticLambda3;
import o.startActivityFromFragment;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class nSetBuffer extends onStateNotSaved {
    private static final Class<?>[] onTransact = new Class[0];
    protected Class<?>[] IAuthTabCallback;
    protected final nSetZOrder IAuthTabCallbackDefault;
    protected List<nSetBufferTransparency> IAuthTabCallbackStub;
    protected boolean asBinder;
    protected nTransactionReparent asInterface;
    protected final RadioButtonKtRadioButtonElement27<?> onExtraCallback;
    protected final AngleMeasurerExternalSyntheticLambda0 onExtraCallbackWithResult;
    protected final startActivityFromFragment onWarmupCompleted;

    protected nSetBuffer(nSetZOrder nsetzorder, JavaType javaType, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        super(javaType);
        this.IAuthTabCallbackDefault = nsetzorder;
        RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27AsBinder = nsetzorder.asBinder();
        this.onExtraCallback = radioButtonKtRadioButtonElement27AsBinder;
        if (radioButtonKtRadioButtonElement27AsBinder == null) {
            this.onWarmupCompleted = null;
        } else {
            this.onWarmupCompleted = radioButtonKtRadioButtonElement27AsBinder.asBinder();
        }
        this.onExtraCallbackWithResult = angleMeasurerExternalSyntheticLambda0;
    }

    protected nSetBuffer(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, List<nSetBufferTransparency> list) {
        super(javaType);
        this.IAuthTabCallbackDefault = null;
        this.onExtraCallback = radioButtonKtRadioButtonElement27;
        if (radioButtonKtRadioButtonElement27 == null) {
            this.onWarmupCompleted = null;
        } else {
            this.onWarmupCompleted = radioButtonKtRadioButtonElement27.asBinder();
        }
        this.onExtraCallbackWithResult = angleMeasurerExternalSyntheticLambda0;
        this.IAuthTabCallbackStub = list;
    }

    protected nSetBuffer(nSetZOrder nsetzorder) {
        this(nsetzorder, nsetzorder.readTypedObject(), nsetzorder.onTransact());
        this.asInterface = nsetzorder.IAuthTabCallbackStubProxy();
    }

    public static nSetBuffer IAuthTabCallback(nSetZOrder nsetzorder) {
        return new nSetBuffer(nsetzorder);
    }

    public static nSetBuffer onNavigationEvent(nSetZOrder nsetzorder) {
        return new nSetBuffer(nsetzorder);
    }

    public static nSetBuffer onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        return new nSetBuffer(radioButtonKtRadioButtonElement27, javaType, angleMeasurerExternalSyntheticLambda0, Collections.EMPTY_LIST);
    }

    protected List<nSetBufferTransparency> onRelationshipValidationResult() {
        if (this.IAuthTabCallbackStub == null) {
            this.IAuthTabCallbackStub = this.IAuthTabCallbackDefault.getInterfaceDescriptor();
        }
        return this.IAuthTabCallbackStub;
    }

    public boolean onNavigationEvent(String str) {
        Iterator<nSetBufferTransparency> it = onRelationshipValidationResult().iterator();
        while (it.hasNext()) {
            if (it.next().onExtraCallbackWithResult().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // o.onStateNotSaved
    public AngleMeasurerExternalSyntheticLambda0 ICustomTabsCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.onStateNotSaved
    public nTransactionReparent onMinimized() {
        return this.asInterface;
    }

    @Override // o.onStateNotSaved
    public List<nSetBufferTransparency> access000() {
        return onRelationshipValidationResult();
    }

    @Override // o.onStateNotSaved
    public nCreate IAuthTabCallbackStub() {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder == null) {
            return null;
        }
        return nsetzorder.access100();
    }

    @Override // o.onStateNotSaved
    public nCreate asBinder() {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder == null) {
            return null;
        }
        return nsetzorder.access000();
    }

    @Override // o.onStateNotSaved
    public Set<String> onActivityLayout() {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        Set<String> setIAuthTabCallbackStub = nsetzorder == null ? null : nsetzorder.IAuthTabCallbackStub();
        return setIAuthTabCallbackStub == null ? Collections.EMPTY_SET : setIAuthTabCallbackStub;
    }

    @Override // o.onStateNotSaved
    public boolean onActivityResized() {
        return this.onExtraCallbackWithResult.getInterfaceDescriptor();
    }

    @Override // o.onStateNotSaved
    public RememberLifecycleOwnerKtExternalSyntheticLambda0 writeTypedObject() {
        return this.onExtraCallbackWithResult.onTransact();
    }

    @Override // o.onStateNotSaved
    public RoundedPolygonCompanion onExtraCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
    }

    @Override // o.onStateNotSaved
    public nCreate IAuthTabCallback() throws IllegalArgumentException {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder == null) {
            return null;
        }
        nGetPreviousReleaseFenceFd ngetpreviousreleasefencefdOnWarmupCompleted = nsetzorder.onWarmupCompleted();
        if (ngetpreviousreleasefencefdOnWarmupCompleted != null) {
            Class clsOnExtraCallbackWithResult = ngetpreviousreleasefencefdOnWarmupCompleted.onExtraCallbackWithResult(0);
            if (clsOnExtraCallbackWithResult == String.class || clsOnExtraCallbackWithResult == Object.class) {
                return ngetpreviousreleasefencefdOnWarmupCompleted;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", ngetpreviousreleasefencefdOnWarmupCompleted.onExtraCallback(), clsOnExtraCallbackWithResult.getName()));
        }
        nCreate ncreateOnExtraCallback = this.IAuthTabCallbackDefault.onExtraCallback();
        if (ncreateOnExtraCallback == null) {
            return null;
        }
        Class<?> clsOnNavigationEvent = ncreateOnExtraCallback.onNavigationEvent();
        if (Map.class.isAssignableFrom(clsOnNavigationEvent) || FragmentActivityExternalSyntheticLambda3.class.isAssignableFrom(clsOnNavigationEvent)) {
            return ncreateOnExtraCallback;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of `java.util.Map` or `JsonNode`", ncreateOnExtraCallback.onExtraCallback()));
    }

    @Override // o.onStateNotSaved
    public Map<Object, nCreate> IAuthTabCallbackDefault() {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder != null) {
            return nsetzorder.IAuthTabCallbackDefault();
        }
        return Collections.EMPTY_MAP;
    }

    @Override // o.onStateNotSaved
    public List<internalPathIteratorRawSize<RoundedPolygonCompanion, Fragment.IAuthTabCallback>> extraCallback() {
        List<RoundedPolygonCompanion> listIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
        if (listIAuthTabCallbackDefault.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (RoundedPolygonCompanion roundedPolygonCompanion : listIAuthTabCallbackDefault) {
            Fragment.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(this.onExtraCallback, roundedPolygonCompanion);
            if (iAuthTabCallbackOnWarmupCompleted != Fragment.IAuthTabCallback.DISABLED) {
                arrayList.add(internalPathIteratorRawSize.onWarmupCompleted(roundedPolygonCompanion, iAuthTabCallbackOnWarmupCompleted));
            }
        }
        return arrayList;
    }

    @Override // o.onStateNotSaved
    public nTransactionDelete onPostMessage() {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder == null) {
            return new nTransactionDelete();
        }
        return nsetzorder.IAuthTabCallback_Parcel();
    }

    @Override // o.onStateNotSaved
    public Object onNavigationEvent(boolean z) {
        RoundedPolygonCompanion roundedPolygonCompanionIAuthTabCallbackStubProxy = this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
        if (roundedPolygonCompanionIAuthTabCallbackStubProxy == null) {
            return null;
        }
        if (z) {
            roundedPolygonCompanionIAuthTabCallbackStubProxy.onExtraCallback(this.onExtraCallback.onExtraCallback(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return roundedPolygonCompanionIAuthTabCallbackStubProxy.asInterface();
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(e);
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.onExtraCallbackWithResult.onWarmupCompleted().getName() + ": (" + e.getClass().getName() + ") " + SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e), e);
        }
    }

    @Override // o.onStateNotSaved
    public nGetPreviousReleaseFenceFd onNavigationEvent(String str, Class<?>[] clsArr) {
        return this.onExtraCallbackWithResult.onWarmupCompleted(str, clsArr);
    }

    @Override // o.onStateNotSaved
    public registerOnPreAttachListener$onExtraCallback onTransact() {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder == null) {
            return registerOnPreAttachListener$onExtraCallback.onNavigationEvent();
        }
        return nsetzorder.asInterface();
    }

    @Override // o.onStateNotSaved
    public Class<?>[] onWarmupCompleted() {
        if (!this.asBinder) {
            this.asBinder = true;
            startActivityFromFragment startactivityfromfragment = this.onWarmupCompleted;
            Class<?>[] clsArrICustomTabsCallbackStub = startactivityfromfragment == null ? null : startactivityfromfragment.ICustomTabsCallbackStub(this.onExtraCallbackWithResult);
            if (clsArrICustomTabsCallbackStub == null && !this.onExtraCallback.onExtraCallback(setLayoutTransition.DEFAULT_VIEW_INCLUSION)) {
                clsArrICustomTabsCallbackStub = onTransact;
            }
            this.IAuthTabCallback = clsArrICustomTabsCallbackStub;
        }
        return this.IAuthTabCallback;
    }

    @Override // o.onStateNotSaved
    public SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> IAuthTabCallback_Parcel() {
        startActivityFromFragment startactivityfromfragment = this.onWarmupCompleted;
        if (startactivityfromfragment == null) {
            return null;
        }
        return onNavigationEvent(startactivityfromfragment.onActivityLayout(this.onExtraCallbackWithResult));
    }

    @Override // o.onStateNotSaved
    public dump$onWarmupCompleted onExtraCallbackWithResult(dump$onWarmupCompleted dump_onwarmupcompleted) {
        dump$onWarmupCompleted typedObject;
        startActivityFromFragment startactivityfromfragment = this.onWarmupCompleted;
        return (startactivityfromfragment == null || (typedObject = startactivityfromfragment.readTypedObject(this.onExtraCallbackWithResult)) == null) ? dump_onwarmupcompleted : dump_onwarmupcompleted == null ? typedObject : dump_onwarmupcompleted.onExtraCallback(typedObject);
    }

    @Override // o.onStateNotSaved
    public nCreate onNavigationEvent() throws IllegalArgumentException {
        nSetZOrder nsetzorder = this.IAuthTabCallbackDefault;
        if (nsetzorder == null) {
            return null;
        }
        nCreate ncreateOnExtraCallbackWithResult = nsetzorder.onExtraCallbackWithResult();
        if (ncreateOnExtraCallbackWithResult != null) {
            if (Map.class.isAssignableFrom(ncreateOnExtraCallbackWithResult.onNavigationEvent())) {
                return ncreateOnExtraCallbackWithResult;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", ncreateOnExtraCallbackWithResult.onExtraCallback()));
        }
        nCreate ncreateIAuthTabCallback = this.IAuthTabCallbackDefault.IAuthTabCallback();
        if (ncreateIAuthTabCallback == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(ncreateIAuthTabCallback.onNavigationEvent())) {
            return ncreateIAuthTabCallback;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", ncreateIAuthTabCallback.onExtraCallback()));
    }

    @Override // o.onStateNotSaved
    public List<nSetBufferTransparency> onExtraCallbackWithResult() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (nSetBufferTransparency nsetbuffertransparency : onRelationshipValidationResult()) {
            startActivityFromFragment.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStub = nsetbuffertransparency.IAuthTabCallbackStub();
            if (onextracallbackwithresultIAuthTabCallbackStub != null && onextracallbackwithresultIAuthTabCallbackStub.onNavigationEvent()) {
                String strOnWarmupCompleted = onextracallbackwithresultIAuthTabCallbackStub.onWarmupCompleted();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(strOnWarmupCompleted);
                } else if (!hashSet.add(strOnWarmupCompleted)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnWarmupCompleted));
                }
                arrayList.add(nsetbuffertransparency);
            }
        }
        return arrayList;
    }

    @Override // o.onStateNotSaved
    public List<nGetPreviousReleaseFenceFd> extraCallbackWithResult() {
        List<nGetPreviousReleaseFenceFd> listIAuthTabCallback_Parcel = this.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
        if (listIAuthTabCallback_Parcel.isEmpty()) {
            return listIAuthTabCallback_Parcel;
        }
        ArrayList arrayList = null;
        for (nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd : listIAuthTabCallback_Parcel) {
            if (onExtraCallback(ngetpreviousreleasefencefd)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ngetpreviousreleasefencefd);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // o.onStateNotSaved
    public List<internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback>> readTypedObject() {
        List<nGetPreviousReleaseFenceFd> listIAuthTabCallback_Parcel = this.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
        if (listIAuthTabCallback_Parcel.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Iterator<nGetPreviousReleaseFenceFd> it = listIAuthTabCallback_Parcel.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback> internalpathiteratorrawsizeOnExtraCallbackWithResult = onExtraCallbackWithResult(it.next());
            if (internalpathiteratorrawsizeOnExtraCallbackWithResult != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(internalpathiteratorrawsizeOnExtraCallbackWithResult);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    protected boolean onExtraCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
        Class clsOnExtraCallbackWithResult;
        if (!getInterfaceDescriptor().isAssignableFrom(ngetpreviousreleasefencefd.writeTypedObject())) {
            return false;
        }
        Fragment.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(this.onExtraCallback, ngetpreviousreleasefencefd);
        if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted != Fragment.IAuthTabCallback.DISABLED) {
            return true;
        }
        String strOnExtraCallback = ngetpreviousreleasefencefd.onExtraCallback();
        if ("valueOf".equals(strOnExtraCallback) && ngetpreviousreleasefencefd.access100() == 1) {
            return true;
        }
        return "fromString".equals(strOnExtraCallback) && ngetpreviousreleasefencefd.access100() == 1 && ((clsOnExtraCallbackWithResult = ngetpreviousreleasefencefd.onExtraCallbackWithResult(0)) == String.class || CharSequence.class.isAssignableFrom(clsOnExtraCallbackWithResult));
    }

    protected internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback> onExtraCallbackWithResult(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
        Class clsOnExtraCallbackWithResult;
        if (!getInterfaceDescriptor().isAssignableFrom(ngetpreviousreleasefencefd.writeTypedObject())) {
            return null;
        }
        Fragment.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(this.onExtraCallback, ngetpreviousreleasefencefd);
        if (iAuthTabCallbackOnWarmupCompleted != null) {
            if (iAuthTabCallbackOnWarmupCompleted == Fragment.IAuthTabCallback.DISABLED) {
                return null;
            }
            return internalPathIteratorRawSize.onWarmupCompleted(ngetpreviousreleasefencefd, iAuthTabCallbackOnWarmupCompleted);
        }
        String strOnExtraCallback = ngetpreviousreleasefencefd.onExtraCallback();
        if ("valueOf".equals(strOnExtraCallback) && ngetpreviousreleasefencefd.access100() == 1) {
            return internalPathIteratorRawSize.onWarmupCompleted(ngetpreviousreleasefencefd, iAuthTabCallbackOnWarmupCompleted);
        }
        if ("fromString".equals(strOnExtraCallback) && ngetpreviousreleasefencefd.access100() == 1 && ((clsOnExtraCallbackWithResult = ngetpreviousreleasefencefd.onExtraCallbackWithResult(0)) == String.class || CharSequence.class.isAssignableFrom(clsOnExtraCallbackWithResult))) {
            return internalPathIteratorRawSize.onWarmupCompleted(ngetpreviousreleasefencefd, iAuthTabCallbackOnWarmupCompleted);
        }
        return null;
    }

    @Override // o.onStateNotSaved
    public Class<?> IAuthTabCallbackStubProxy() {
        startActivityFromFragment startactivityfromfragment = this.onWarmupCompleted;
        if (startactivityfromfragment == null) {
            return null;
        }
        return startactivityfromfragment.onNavigationEvent(this.onExtraCallbackWithResult);
    }

    @Override // o.onStateNotSaved
    public FragmentManagerExternalSyntheticLambda5.IAuthTabCallback access100() {
        startActivityFromFragment startactivityfromfragment = this.onWarmupCompleted;
        if (startactivityfromfragment == null) {
            return null;
        }
        return startactivityfromfragment.IAuthTabCallback(this.onExtraCallbackWithResult);
    }

    @Override // o.onStateNotSaved
    public SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> asInterface() {
        startActivityFromFragment startactivityfromfragment = this.onWarmupCompleted;
        if (startactivityfromfragment == null) {
            return null;
        }
        return onNavigationEvent(startactivityfromfragment.onExtraCallbackWithResult((internalPathIteratorPeek) this.onExtraCallbackWithResult));
    }

    protected SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> onNavigationEvent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof SavedStateHandleSaverKtExternalSyntheticLambda3) {
            return (SavedStateHandleSaverKtExternalSyntheticLambda3) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls != SavedStateHandleSaverKtExternalSyntheticLambda3.onExtraCallbackWithResult.class) {
            if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
                if (!SavedStateHandleSaverKtExternalSyntheticLambda3.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
                }
                RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = this.onExtraCallback.access000();
                SavedStateHandleSaverKtExternalSyntheticLambda3<?, ?> savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback = radioButtonKtRadioButtonElement24Access000 != null ? radioButtonKtRadioButtonElement24Access000.onExtraCallback(this.onExtraCallback, this.onExtraCallbackWithResult, cls) : null;
                return savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback == null ? (SavedStateHandleSaverKtExternalSyntheticLambda3) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, this.onExtraCallback.asInterface()) : savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback;
            }
        }
        return null;
    }
}
