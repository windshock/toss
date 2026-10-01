package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o.Fragment;
import o.FragmentActivityExternalSyntheticLambda1;
import o.FragmentFactory;
import o.FragmentManagerExternalSyntheticLambda4;
import o.FragmentManagerExternalSyntheticLambda5;
import o.SavedStateHandleSaverKtExternalSyntheticLambda3;
import o.callStartTransitionListener;
import o.destroyItem;
import o.getAnimatingAway;
import o.getEnterTransition;
import o.getFragmentManager;
import o.getNextTransition;
import o.restoreViewState;
import o.setDrawDisappearingViewsLast;
import o.setShowsDialog;
import o.startActivityFromFragment;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class nSetScale extends startActivityFromFragment implements Serializable {
    private static final internalConicToQuadratics onNavigationEvent;
    private static final long serialVersionUID = 1;
    protected transient SavedStateHandleSaverKtExternalSyntheticLambda5<String, Boolean> IAuthTabCallback = new SavedStateHandleSaverKtExternalSyntheticLambda5<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;
    private static final Class<? extends Annotation>[] onWarmupCompleted = {destroyItem.class, getLoaderManager.class, registerOnPreAttachListener.class, getFragmentManager.class, getExitAnim.class, getExitTransitionCallback.class, r8lambdafb2iz_9i0AeQEy2DZBRxlwOv0g.class, getArguments.class};
    private static final Class<? extends Annotation>[] onExtraCallback = {FragmentStatePagerAdapter.class, getLoaderManager.class, registerOnPreAttachListener.class, getFragmentManager.class, getExitTransitionCallback.class, r8lambdafb2iz_9i0AeQEy2DZBRxlwOv0g.class, getArguments.class, getAllowReturnTransitionOverlap.class};

    @Override // o.startActivityFromFragment
    public FragmentKtExternalSyntheticLambda0 onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, RoundedPolygonKt roundedPolygonKt, FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0) {
        return null;
    }

    static {
        internalConicToQuadratics internalconictoquadraticsIAuthTabCallback;
        try {
            internalconictoquadraticsIAuthTabCallback = internalConicToQuadratics.IAuthTabCallback();
        } catch (Throwable th) {
            SavedStateHandleSaverKtExternalSyntheticLambda0.onWarmupCompleted(th);
            internalconictoquadraticsIAuthTabCallback = null;
        }
        onNavigationEvent = internalconictoquadraticsIAuthTabCallback;
    }

    protected Object readResolve() {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = new SavedStateHandleSaverKtExternalSyntheticLambda5<>(48, 48);
        }
        return this;
    }

    @Override // o.startActivityFromFragment
    public boolean onWarmupCompleted(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        String name = clsAnnotationType.getName();
        Boolean boolOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(name);
        if (boolOnExtraCallbackWithResult == null) {
            boolOnExtraCallbackWithResult = Boolean.valueOf(clsAnnotationType.getAnnotation(requireComponentDialog.class) != null);
            this.IAuthTabCallback.onExtraCallback(name, boolOnExtraCallbackWithResult);
        }
        return boolOnExtraCallbackWithResult.booleanValue();
    }

    @Override // o.startActivityFromFragment
    public String[] onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, Enum<?>[] enumArr, String[] strArr) {
        String strOnTransact;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (RoundedPolygonKt roundedPolygonKt : angleMeasurerExternalSyntheticLambda0.asInterface()) {
            getAnimatingAway getanimatingawayOnWarmupCompleted = roundedPolygonKt.onWarmupCompleted(getAnimatingAway.class);
            if (getanimatingawayOnWarmupCompleted != null && (strOnTransact = getanimatingawayOnWarmupCompleted.onTransact()) != null && !strOnTransact.isEmpty()) {
                linkedHashMap.put(roundedPolygonKt.onExtraCallback(), strOnTransact);
            }
        }
        int length = enumArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = (String) linkedHashMap.get(enumArr[i2].name());
            if (str != null) {
                strArr[i2] = str;
            }
        }
        return strArr;
    }

    @Override // o.startActivityFromFragment
    @Deprecated
    public void onExtraCallback(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        requireDialog annotation;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (annotation = field.getAnnotation(requireDialog.class)) != null) {
                String[] strArrOnExtraCallbackWithResult = annotation.onExtraCallbackWithResult();
                if (strArrOnExtraCallbackWithResult.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (name.equals(enumArr[i2].name())) {
                            strArr[i2] = strArrOnExtraCallbackWithResult;
                        }
                    }
                }
            }
        }
    }

    @Override // o.startActivityFromFragment
    public void onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, Enum<?>[] enumArr, String[][] strArr) {
        HashMap map = new HashMap();
        for (RoundedPolygonKt roundedPolygonKt : angleMeasurerExternalSyntheticLambda0.asInterface()) {
            requireDialog requiredialogOnWarmupCompleted = roundedPolygonKt.onWarmupCompleted(requireDialog.class);
            if (requiredialogOnWarmupCompleted != null) {
                map.putIfAbsent(roundedPolygonKt.onExtraCallback(), requiredialogOnWarmupCompleted.onExtraCallbackWithResult());
            }
        }
        int length = enumArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = (String[]) map.getOrDefault(enumArr[i2].name(), new String[0]);
        }
    }

    @Override // o.startActivityFromFragment
    @Deprecated
    public Enum<?> IAuthTabCallback(Class<Enum<?>> cls) {
        return SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(cls, ensureAnimationInfo.class);
    }

    @Override // o.startActivityFromFragment
    public Enum<?> onExtraCallback(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, Enum<?>[] enumArr) {
        Iterator<RoundedPolygonKt> it = angleMeasurerExternalSyntheticLambda0.asInterface().iterator();
        while (it.hasNext()) {
            internalPathIteratorPeek internalpathiteratorpeek = (internalPathIteratorPeek) it.next();
            if (internalpathiteratorpeek.IAuthTabCallback().onActivityLayout() && onExtraCallback(internalpathiteratorpeek, ensureAnimationInfo.class) != null) {
                for (Enum<?> r3 : enumArr) {
                    if (r3.name().equals(internalpathiteratorpeek.onExtraCallback())) {
                        return r3;
                    }
                }
            }
        }
        return null;
    }

    @Override // o.startActivityFromFragment
    public FragmentKtExternalSyntheticLambda0 onExtraCallback(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        getEnterAnim getenteranimOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<getEnterAnim>) getEnterAnim.class);
        if (getenteranimOnExtraCallback == null) {
            return null;
        }
        String strOnExtraCallback = getenteranimOnExtraCallback.onExtraCallback();
        return FragmentKtExternalSyntheticLambda0.onWarmupCompleted(getenteranimOnExtraCallback.onWarmupCompleted(), (strOnExtraCallback == null || !strOnExtraCallback.isEmpty()) ? strOnExtraCallback : null);
    }

    @Override // o.startActivityFromFragment
    public Boolean onTransact(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        generateActivityResultKey generateactivityresultkeyOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<generateActivityResultKey>) generateActivityResultKey.class);
        if (generateactivityresultkeyOnExtraCallback == null) {
            return null;
        }
        return Boolean.valueOf(generateactivityresultkeyOnExtraCallback.onExtraCallback());
    }

    @Override // o.startActivityFromFragment
    public restoreViewState.onExtraCallbackWithResult onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek) {
        restoreViewState restoreviewstateOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<restoreViewState>) restoreViewState.class);
        if (restoreviewstateOnExtraCallback == null) {
            return restoreViewState.onExtraCallbackWithResult.onWarmupCompleted();
        }
        return restoreViewState.onExtraCallbackWithResult.onNavigationEvent(restoreviewstateOnExtraCallback);
    }

    @Override // o.startActivityFromFragment
    @Deprecated
    public restoreViewState.onExtraCallbackWithResult extraCallback(internalPathIteratorPeek internalpathiteratorpeek) {
        return onNavigationEvent((RadioButtonKtRadioButtonElement27<?>) null, internalpathiteratorpeek);
    }

    @Override // o.startActivityFromFragment
    public callStartTransitionListener.onNavigationEvent onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek) {
        callStartTransitionListener callstarttransitionlistenerOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<callStartTransitionListener>) callStartTransitionListener.class);
        if (callstarttransitionlistenerOnExtraCallback == null) {
            return callStartTransitionListener.onNavigationEvent.onExtraCallbackWithResult();
        }
        return callStartTransitionListener.onNavigationEvent.onExtraCallbackWithResult(callstarttransitionlistenerOnExtraCallback);
    }

    @Override // o.startActivityFromFragment
    public Object IAuthTabCallback(internalPathIteratorPeek internalpathiteratorpeek) {
        initLifecycle initlifecycleOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<initLifecycle>) initLifecycle.class);
        if (initlifecycleOnExtraCallback == null) {
            return null;
        }
        String strOnExtraCallbackWithResult = initlifecycleOnExtraCallback.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult.isEmpty()) {
            return null;
        }
        return strOnExtraCallbackWithResult;
    }

    @Override // o.startActivityFromFragment
    public Object onWarmupCompleted(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        FragmentManager6 fragmentManager6OnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<FragmentManager6>) FragmentManager6.class);
        if (fragmentManager6OnExtraCallback == null) {
            return null;
        }
        return fragmentManager6OnExtraCallback.onWarmupCompleted();
    }

    @Override // o.startActivityFromFragment
    public Object onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        FragmentManagerExternalSyntheticLambda3 fragmentManagerExternalSyntheticLambda3OnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<FragmentManagerExternalSyntheticLambda3>) FragmentManagerExternalSyntheticLambda3.class);
        if (fragmentManagerExternalSyntheticLambda3OnExtraCallback == null) {
            return null;
        }
        return fragmentManagerExternalSyntheticLambda3OnExtraCallback.IAuthTabCallback();
    }

    @Override // o.startActivityFromFragment
    public nTransactionSetOnCommit<?> IAuthTabCallback(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, nTransactionSetOnCommit<?> ntransactionsetoncommit) {
        getMinimumMaxLifecycleState getminimummaxlifecyclestateOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<getMinimumMaxLifecycleState>) getMinimumMaxLifecycleState.class);
        return getminimummaxlifecyclestateOnExtraCallback == null ? ntransactionsetoncommit : ntransactionsetoncommit.IAuthTabCallback(getminimummaxlifecyclestateOnExtraCallback);
    }

    @Override // o.startActivityFromFragment
    public String onExtraCallback(nCreate ncreate) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0MayLaunchUrl = mayLaunchUrl(ncreate);
        if (fragmentKtExternalSyntheticLambda0MayLaunchUrl == null) {
            return null;
        }
        return fragmentKtExternalSyntheticLambda0MayLaunchUrl.onExtraCallbackWithResult();
    }

    @Override // o.startActivityFromFragment
    public List<FragmentKtExternalSyntheticLambda0> getInterfaceDescriptor(internalPathIteratorPeek internalpathiteratorpeek) {
        requireDialog requiredialogOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<requireDialog>) requireDialog.class);
        if (requiredialogOnExtraCallback == null) {
            return null;
        }
        String[] strArrOnExtraCallbackWithResult = requiredialogOnExtraCallback.onExtraCallbackWithResult();
        int length = strArrOnExtraCallbackWithResult.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrOnExtraCallbackWithResult) {
            arrayList.add(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(str));
        }
        return arrayList;
    }

    @Override // o.startActivityFromFragment
    public boolean onTransact(nCreate ncreate) {
        return isEngagementSignalsApiAvailable(ncreate);
    }

    @Override // o.startActivityFromFragment
    public Boolean IAuthTabCallbackDefault(nCreate ncreate) {
        getAnimatingAway getanimatingawayOnExtraCallback = onExtraCallback(ncreate, (Class<getAnimatingAway>) getAnimatingAway.class);
        if (getanimatingawayOnExtraCallback != null) {
            return Boolean.valueOf(getanimatingawayOnExtraCallback.onExtraCallback());
        }
        return null;
    }

    @Override // o.startActivityFromFragment
    public getAnimatingAway.IAuthTabCallback IAuthTabCallback_Parcel(internalPathIteratorPeek internalpathiteratorpeek) {
        getAnimatingAway getanimatingawayOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAnimatingAway>) getAnimatingAway.class);
        if (getanimatingawayOnExtraCallback != null) {
            return getanimatingawayOnExtraCallback.onNavigationEvent();
        }
        return null;
    }

    @Override // o.startActivityFromFragment
    public String extraCallbackWithResult(internalPathIteratorPeek internalpathiteratorpeek) {
        getActivity getactivityOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getActivity>) getActivity.class);
        if (getactivityOnExtraCallback == null) {
            return null;
        }
        return getactivityOnExtraCallback.onWarmupCompleted();
    }

    @Override // o.startActivityFromFragment
    public Integer writeTypedObject(internalPathIteratorPeek internalpathiteratorpeek) {
        int iOnWarmupCompleted;
        getAnimatingAway getanimatingawayOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAnimatingAway>) getAnimatingAway.class);
        if (getanimatingawayOnExtraCallback == null || (iOnWarmupCompleted = getanimatingawayOnExtraCallback.onWarmupCompleted()) == -1) {
            return null;
        }
        return Integer.valueOf(iOnWarmupCompleted);
    }

    @Override // o.startActivityFromFragment
    public String ICustomTabsCallback(internalPathIteratorPeek internalpathiteratorpeek) {
        getAnimatingAway getanimatingawayOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAnimatingAway>) getAnimatingAway.class);
        if (getanimatingawayOnExtraCallback == null) {
            return null;
        }
        String strIAuthTabCallback = getanimatingawayOnExtraCallback.IAuthTabCallback();
        if (strIAuthTabCallback.isEmpty()) {
            return null;
        }
        return strIAuthTabCallback;
    }

    @Override // o.startActivityFromFragment
    public registerOnPreAttachListener$onExtraCallback asInterface(internalPathIteratorPeek internalpathiteratorpeek) {
        registerOnPreAttachListener registeronpreattachlistenerOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<registerOnPreAttachListener>) registerOnPreAttachListener.class);
        if (registeronpreattachlistenerOnExtraCallback == null) {
            return null;
        }
        return registerOnPreAttachListener$onExtraCallback.onNavigationEvent(registeronpreattachlistenerOnExtraCallback);
    }

    @Override // o.startActivityFromFragment
    public startActivityFromFragment.onExtraCallbackWithResult onNavigationEvent(nCreate ncreate) {
        getArguments getargumentsOnExtraCallback = onExtraCallback(ncreate, (Class<getArguments>) getArguments.class);
        if (getargumentsOnExtraCallback != null) {
            return startActivityFromFragment.onExtraCallbackWithResult.onExtraCallbackWithResult(getargumentsOnExtraCallback.onWarmupCompleted());
        }
        r8lambdafb2iz_9i0AeQEy2DZBRxlwOv0g r8lambdafb2iz_9i0aeqey2dzbrxlwov0gOnExtraCallback = onExtraCallback(ncreate, (Class<r8lambdafb2iz_9i0AeQEy2DZBRxlwOv0g>) r8lambdafb2iz_9i0AeQEy2DZBRxlwOv0g.class);
        if (r8lambdafb2iz_9i0aeqey2dzbrxlwov0gOnExtraCallback != null) {
            return startActivityFromFragment.onExtraCallbackWithResult.onNavigationEvent(r8lambdafb2iz_9i0aeqey2dzbrxlwov0gOnExtraCallback.onNavigationEvent());
        }
        return null;
    }

    @Override // o.startActivityFromFragment
    public AsyncTaskLoader asInterface(nCreate ncreate) {
        getExitTransitionCallback getexittransitioncallbackOnExtraCallback = onExtraCallback(ncreate, (Class<getExitTransitionCallback>) getExitTransitionCallback.class);
        if (getexittransitioncallbackOnExtraCallback == null || !getexittransitioncallbackOnExtraCallback.onExtraCallback()) {
            return null;
        }
        return AsyncTaskLoader.onWarmupCompleted(getexittransitioncallbackOnExtraCallback.onExtraCallbackWithResult(), getexittransitioncallbackOnExtraCallback.onWarmupCompleted());
    }

    @Override // o.startActivityFromFragment
    public setShowsDialog.IAuthTabCallback onExtraCallbackWithResult(nCreate ncreate) {
        String name;
        setShowsDialog setshowsdialogOnExtraCallback = onExtraCallback(ncreate, (Class<setShowsDialog>) setShowsDialog.class);
        if (setshowsdialogOnExtraCallback == null) {
            return null;
        }
        setShowsDialog.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = setShowsDialog.IAuthTabCallback.onWarmupCompleted(setshowsdialogOnExtraCallback);
        if (iAuthTabCallbackOnWarmupCompleted.IAuthTabCallback()) {
            return iAuthTabCallbackOnWarmupCompleted;
        }
        if (!(ncreate instanceof nGetPreviousReleaseFenceFd)) {
            name = ncreate.onNavigationEvent().getName();
        } else {
            nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd = (nGetPreviousReleaseFenceFd) ncreate;
            if (ngetpreviousreleasefencefd.access100() == 0) {
                name = ncreate.onNavigationEvent().getName();
            } else {
                name = ngetpreviousreleasefencefd.onExtraCallbackWithResult(0).getName();
            }
        }
        return iAuthTabCallbackOnWarmupCompleted.onExtraCallbackWithResult(name);
    }

    @Override // o.startActivityFromFragment
    @Deprecated
    public Object IAuthTabCallback(nCreate ncreate) {
        setShowsDialog.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(ncreate);
        if (iAuthTabCallbackOnExtraCallbackWithResult == null) {
            return null;
        }
        return iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted();
    }

    @Override // o.startActivityFromFragment
    public Class<?>[] ICustomTabsCallbackStub(internalPathIteratorPeek internalpathiteratorpeek) {
        getLoaderManager getloadermanagerOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getLoaderManager>) getLoaderManager.class);
        if (getloadermanagerOnExtraCallback == null) {
            return null;
        }
        return getloadermanagerOnExtraCallback.onNavigationEvent();
    }

    @Override // o.startActivityFromFragment
    public nGetPreviousReleaseFenceFd onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd2) {
        Class clsOnExtraCallbackWithResult = ngetpreviousreleasefencefd.onExtraCallbackWithResult(0);
        Class clsOnExtraCallbackWithResult2 = ngetpreviousreleasefencefd2.onExtraCallbackWithResult(0);
        if (clsOnExtraCallbackWithResult.isPrimitive()) {
            if (clsOnExtraCallbackWithResult2.isPrimitive()) {
                return null;
            }
        } else {
            if (!clsOnExtraCallbackWithResult2.isPrimitive()) {
                if (clsOnExtraCallbackWithResult == String.class) {
                    if (clsOnExtraCallbackWithResult2 != String.class) {
                    }
                } else if (clsOnExtraCallbackWithResult2 == String.class) {
                }
                return null;
            }
            return ngetpreviousreleasefencefd2;
        }
        return ngetpreviousreleasefencefd;
    }

    @Override // o.startActivityFromFragment
    public getFragmentManager.IAuthTabCallback IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek) {
        getFragmentManager getfragmentmanagerOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getFragmentManager>) getFragmentManager.class);
        if (getfragmentmanagerOnExtraCallback == null) {
            return null;
        }
        return getFragmentManager.IAuthTabCallback.onExtraCallbackWithResult(getfragmentmanagerOnExtraCallback);
    }

    @Override // o.startActivityFromFragment
    public setPrinter<?> onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, JavaType javaType) {
        return onExtraCallbackWithResult(radioButtonKtRadioButtonElement27, (internalPathIteratorPeek) angleMeasurerExternalSyntheticLambda0, javaType);
    }

    @Override // o.startActivityFromFragment
    public setPrinter<?> onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nCreate ncreate, JavaType javaType) {
        if (javaType.onPostMessage() || javaType.IAuthTabCallback()) {
            return null;
        }
        return onExtraCallbackWithResult(radioButtonKtRadioButtonElement27, ncreate, javaType);
    }

    @Override // o.startActivityFromFragment
    public setPrinter<?> onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nCreate ncreate, JavaType javaType) {
        if (javaType.IAuthTabCallbackStub() == null) {
            throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
        }
        return onExtraCallbackWithResult(radioButtonKtRadioButtonElement27, ncreate, javaType);
    }

    @Override // o.startActivityFromFragment
    public List<SurfaceControlV33TransactionExternalSyntheticLambda1> onRelationshipValidationResult(internalPathIteratorPeek internalpathiteratorpeek) {
        getEnterTransition getentertransitionOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getEnterTransition>) getEnterTransition.class);
        if (getentertransitionOnExtraCallback == null) {
            return null;
        }
        getEnterTransition.onExtraCallback[] onextracallbackArrOnExtraCallback = getentertransitionOnExtraCallback.onExtraCallback();
        if (getentertransitionOnExtraCallback.onNavigationEvent()) {
            return IAuthTabCallback(internalpathiteratorpeek.onExtraCallback(), onextracallbackArrOnExtraCallback);
        }
        ArrayList arrayList = new ArrayList(onextracallbackArrOnExtraCallback.length);
        for (getEnterTransition.onExtraCallback onextracallback : onextracallbackArrOnExtraCallback) {
            arrayList.add(new SurfaceControlV33TransactionExternalSyntheticLambda1(onextracallback.onExtraCallback(), onextracallback.onExtraCallbackWithResult()));
            for (String str : onextracallback.IAuthTabCallback()) {
                arrayList.add(new SurfaceControlV33TransactionExternalSyntheticLambda1(onextracallback.onExtraCallback(), str));
            }
        }
        return arrayList;
    }

    private List<SurfaceControlV33TransactionExternalSyntheticLambda1> IAuthTabCallback(String str, getEnterTransition.onExtraCallback[] onextracallbackArr) {
        ArrayList arrayList = new ArrayList(onextracallbackArr.length);
        HashSet hashSet = new HashSet();
        for (getEnterTransition.onExtraCallback onextracallback : onextracallbackArr) {
            String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
            if (!strOnExtraCallbackWithResult.isEmpty() && hashSet.contains(strOnExtraCallbackWithResult)) {
                throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + strOnExtraCallbackWithResult + "]");
            }
            hashSet.add(strOnExtraCallbackWithResult);
            arrayList.add(new SurfaceControlV33TransactionExternalSyntheticLambda1(onextracallback.onExtraCallback(), strOnExtraCallbackWithResult));
            for (String str2 : onextracallback.IAuthTabCallback()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + str2 + "]");
                }
                hashSet.add(str2);
                arrayList.add(new SurfaceControlV33TransactionExternalSyntheticLambda1(onextracallback.onExtraCallback(), str2));
            }
        }
        return arrayList;
    }

    @Override // o.startActivityFromFragment
    public String asBinder(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        getExitTransition getexittransitionOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<getExitTransition>) getExitTransition.class);
        if (getexittransitionOnExtraCallback == null) {
            return null;
        }
        return getexittransitionOnExtraCallback.onWarmupCompleted();
    }

    @Override // o.startActivityFromFragment
    public Boolean IAuthTabCallbackStub(nCreate ncreate) {
        return Boolean.valueOf(onExtraCallbackWithResult(ncreate, getHost.class));
    }

    @Override // o.startActivityFromFragment
    public nTransactionReparent access000(internalPathIteratorPeek internalpathiteratorpeek) {
        getTargetFragment gettargetfragmentOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getTargetFragment>) getTargetFragment.class);
        if (gettargetfragmentOnExtraCallback == null || gettargetfragmentOnExtraCallback.onNavigationEvent() == getNextTransition.onExtraCallbackWithResult.class) {
            return null;
        }
        return new nTransactionReparent(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(gettargetfragmentOnExtraCallback.onExtraCallbackWithResult()), gettargetfragmentOnExtraCallback.onExtraCallback(), gettargetfragmentOnExtraCallback.onNavigationEvent(), gettargetfragmentOnExtraCallback.onWarmupCompleted());
    }

    @Override // o.startActivityFromFragment
    public nTransactionReparent onExtraCallback(internalPathIteratorPeek internalpathiteratorpeek, nTransactionReparent ntransactionreparent) {
        instantiate instantiateVarOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<instantiate>) instantiate.class);
        if (instantiateVarOnExtraCallback == null) {
            return ntransactionreparent;
        }
        if (ntransactionreparent == null) {
            ntransactionreparent = nTransactionReparent.IAuthTabCallback();
        }
        return ntransactionreparent.onExtraCallback(instantiateVarOnExtraCallback.onExtraCallbackWithResult());
    }

    @Override // o.startActivityFromFragment
    public Object onActivityResized(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsIAuthTabCallbackStubProxy;
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback != null && (clsIAuthTabCallbackStubProxy = destroyitemOnExtraCallback.IAuthTabCallbackStubProxy()) != FragmentFactory.onWarmupCompleted.class) {
            return clsIAuthTabCallbackStubProxy;
        }
        getExitAnim getexitanimOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getExitAnim>) getExitAnim.class);
        if (getexitanimOnExtraCallback == null || !getexitanimOnExtraCallback.onNavigationEvent()) {
            return null;
        }
        return new RawSerializer(internalpathiteratorpeek.onNavigationEvent());
    }

    @Override // o.startActivityFromFragment
    public Object IAuthTabCallbackStub(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsIAuthTabCallbackDefault;
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback == null || (clsIAuthTabCallbackDefault = destroyitemOnExtraCallback.IAuthTabCallbackDefault()) == FragmentFactory.onWarmupCompleted.class) {
            return null;
        }
        return clsIAuthTabCallbackDefault;
    }

    @Override // o.startActivityFromFragment
    public Object onNavigationEvent(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsIAuthTabCallback;
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback == null || (clsIAuthTabCallback = destroyitemOnExtraCallback.IAuthTabCallback()) == FragmentFactory.onWarmupCompleted.class) {
            return null;
        }
        return clsIAuthTabCallback;
    }

    @Override // o.startActivityFromFragment
    public Object access100(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsIAuthTabCallbackStub;
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback == null || (clsIAuthTabCallbackStub = destroyitemOnExtraCallback.IAuthTabCallbackStub()) == FragmentFactory.onWarmupCompleted.class) {
            return null;
        }
        return clsIAuthTabCallbackStub;
    }

    @Override // o.startActivityFromFragment
    public dump$onWarmupCompleted readTypedObject(internalPathIteratorPeek internalpathiteratorpeek) {
        dump dumpVarOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<dump>) dump.class);
        dump$onWarmupCompleted dump_onwarmupcompletedOnNavigationEvent = dumpVarOnExtraCallback == null ? dump$onWarmupCompleted.onNavigationEvent() : dump$onWarmupCompleted.onExtraCallback(dumpVarOnExtraCallback);
        return dump_onwarmupcompletedOnNavigationEvent.onExtraCallbackWithResult() == dump$onExtraCallback.USE_DEFAULTS ? onWarmupCompleted(internalpathiteratorpeek, dump_onwarmupcompletedOnNavigationEvent) : dump_onwarmupcompletedOnNavigationEvent;
    }

    private dump$onWarmupCompleted onWarmupCompleted(internalPathIteratorPeek internalpathiteratorpeek, dump$onWarmupCompleted dump_onwarmupcompleted) {
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback != null) {
            int i2 = AnonymousClass3.onNavigationEvent[destroyitemOnExtraCallback.onTransact().ordinal()];
            if (i2 == 1) {
                return dump_onwarmupcompleted.onNavigationEvent(dump$onExtraCallback.ALWAYS);
            }
            if (i2 == 2) {
                return dump_onwarmupcompleted.onNavigationEvent(dump$onExtraCallback.NON_NULL);
            }
            if (i2 == 3) {
                return dump_onwarmupcompleted.onNavigationEvent(dump$onExtraCallback.NON_DEFAULT);
            }
            if (i2 == 4) {
                return dump_onwarmupcompleted.onNavigationEvent(dump$onExtraCallback.NON_EMPTY);
            }
        }
        return dump_onwarmupcompleted;
    }

    /* renamed from: o.nSetScale$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[destroyItem.onExtraCallbackWithResult.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[destroyItem.onExtraCallbackWithResult.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[destroyItem.onExtraCallbackWithResult.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[destroyItem.onExtraCallbackWithResult.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[destroyItem.onExtraCallbackWithResult.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[destroyItem.onExtraCallbackWithResult.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // o.startActivityFromFragment
    public destroyItem.onExtraCallback onMinimized(internalPathIteratorPeek internalpathiteratorpeek) {
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback == null) {
            return null;
        }
        return destroyitemOnExtraCallback.asBinder();
    }

    @Override // o.startActivityFromFragment
    public Object onActivityLayout(internalPathIteratorPeek internalpathiteratorpeek) {
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback == null) {
            return null;
        }
        return onExtraCallbackWithResult(destroyitemOnExtraCallback.onWarmupCompleted(), SavedStateHandleSaverKtExternalSyntheticLambda3.onExtraCallbackWithResult.class);
    }

    @Override // o.startActivityFromFragment
    public Object asBinder(nCreate ncreate) {
        destroyItem destroyitemOnExtraCallback = onExtraCallback(ncreate, (Class<destroyItem>) destroyItem.class);
        if (destroyitemOnExtraCallback == null) {
            return null;
        }
        return onExtraCallbackWithResult(destroyitemOnExtraCallback.onNavigationEvent(), SavedStateHandleSaverKtExternalSyntheticLambda3.onExtraCallbackWithResult.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    @Override // o.startActivityFromFragment
    public JavaType onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeIsEngagementSignalsApiAvailable;
        JavaType javaTypeIsEngagementSignalsApiAvailable2;
        LifecycleEffectKtExternalSyntheticLambda4 lifecycleEffectKtExternalSyntheticLambda4ExtraCallback = radioButtonKtRadioButtonElement27.extraCallback();
        destroyItem destroyitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<destroyItem>) destroyItem.class);
        Class<?> clsOnNavigationEvent = destroyitemOnExtraCallback == null ? null : onNavigationEvent(destroyitemOnExtraCallback.onExtraCallback());
        if (clsOnNavigationEvent != null) {
            if (javaType.onNavigationEvent(clsOnNavigationEvent)) {
                javaType = javaType.isEngagementSignalsApiAvailable();
            } else {
                Class<?> clsAsBinder = javaType.asBinder();
                try {
                    if (clsOnNavigationEvent.isAssignableFrom(clsAsBinder)) {
                        javaType = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.onWarmupCompleted(javaType, clsOnNavigationEvent);
                    } else if (clsAsBinder.isAssignableFrom(clsOnNavigationEvent)) {
                        javaType = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.IAuthTabCallback(javaType, clsOnNavigationEvent);
                    } else if (IAuthTabCallback(clsAsBinder, clsOnNavigationEvent)) {
                        javaType = javaType.isEngagementSignalsApiAvailable();
                    } else {
                        throw onExtraCallbackWithResult(String.format("Cannot refine serialization type %s into %s; types not related", javaType, clsOnNavigationEvent.getName()));
                    }
                } catch (IllegalArgumentException e) {
                    throw onWarmupCompleted(e, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, clsOnNavigationEvent.getName(), internalpathiteratorpeek.onExtraCallback(), e.getMessage()));
                }
            }
        }
        if (javaType.onUnminimized()) {
            JavaType javaTypeAsInterface = javaType.asInterface();
            Class<?> clsOnNavigationEvent2 = destroyitemOnExtraCallback == null ? null : onNavigationEvent(destroyitemOnExtraCallback.asInterface());
            if (clsOnNavigationEvent2 != null) {
                if (javaTypeAsInterface.onNavigationEvent(clsOnNavigationEvent2)) {
                    javaTypeIsEngagementSignalsApiAvailable2 = javaTypeAsInterface.isEngagementSignalsApiAvailable();
                } else {
                    Class<?> clsAsBinder2 = javaTypeAsInterface.asBinder();
                    try {
                        if (clsOnNavigationEvent2.isAssignableFrom(clsAsBinder2)) {
                            javaTypeIsEngagementSignalsApiAvailable2 = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.onWarmupCompleted(javaTypeAsInterface, clsOnNavigationEvent2);
                        } else if (clsAsBinder2.isAssignableFrom(clsOnNavigationEvent2)) {
                            javaTypeIsEngagementSignalsApiAvailable2 = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.IAuthTabCallback(javaTypeAsInterface, clsOnNavigationEvent2);
                        } else if (IAuthTabCallback(clsAsBinder2, clsOnNavigationEvent2)) {
                            javaTypeIsEngagementSignalsApiAvailable2 = javaTypeAsInterface.isEngagementSignalsApiAvailable();
                        } else {
                            throw onExtraCallbackWithResult(String.format("Cannot refine serialization key type %s into %s; types not related", javaTypeAsInterface, clsOnNavigationEvent2.getName()));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw onWarmupCompleted(e2, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsOnNavigationEvent2.getName(), internalpathiteratorpeek.onExtraCallback(), e2.getMessage()));
                    }
                }
                javaType = ((MapLikeType) javaType).onExtraCallbackWithResult(javaTypeIsEngagementSignalsApiAvailable2);
            }
        }
        JavaType javaTypeIAuthTabCallbackStub = javaType.IAuthTabCallbackStub();
        if (javaTypeIAuthTabCallbackStub != null) {
            Class<?> clsOnNavigationEvent3 = destroyitemOnExtraCallback != null ? onNavigationEvent(destroyitemOnExtraCallback.onExtraCallbackWithResult()) : null;
            if (clsOnNavigationEvent3 != null) {
                if (javaTypeIAuthTabCallbackStub.onNavigationEvent(clsOnNavigationEvent3)) {
                    javaTypeIsEngagementSignalsApiAvailable = javaTypeIAuthTabCallbackStub.isEngagementSignalsApiAvailable();
                } else {
                    Class<?> clsAsBinder3 = javaTypeIAuthTabCallbackStub.asBinder();
                    try {
                        if (clsOnNavigationEvent3.isAssignableFrom(clsAsBinder3)) {
                            javaTypeIsEngagementSignalsApiAvailable = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.onWarmupCompleted(javaTypeIAuthTabCallbackStub, clsOnNavigationEvent3);
                        } else if (clsAsBinder3.isAssignableFrom(clsOnNavigationEvent3)) {
                            javaTypeIsEngagementSignalsApiAvailable = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.IAuthTabCallback(javaTypeIAuthTabCallbackStub, clsOnNavigationEvent3);
                        } else if (IAuthTabCallback(clsAsBinder3, clsOnNavigationEvent3)) {
                            javaTypeIsEngagementSignalsApiAvailable = javaTypeIAuthTabCallbackStub.isEngagementSignalsApiAvailable();
                        } else {
                            throw onExtraCallbackWithResult(String.format("Cannot refine serialization content type %s into %s; types not related", javaTypeIAuthTabCallbackStub, clsOnNavigationEvent3.getName()));
                        }
                    } catch (IllegalArgumentException e3) {
                        throw onWarmupCompleted(e3, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsOnNavigationEvent3.getName(), internalpathiteratorpeek.onExtraCallback(), e3.getMessage()));
                    }
                }
                return javaType.IAuthTabCallback(javaTypeIsEngagementSignalsApiAvailable);
            }
        }
        return javaType;
    }

    @Override // o.startActivityFromFragment
    public String[] onExtraCallbackWithResult(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        getChildFragmentManager getchildfragmentmanagerOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<getChildFragmentManager>) getChildFragmentManager.class);
        if (getchildfragmentmanagerOnExtraCallback == null) {
            return null;
        }
        return getchildfragmentmanagerOnExtraCallback.onExtraCallbackWithResult();
    }

    @Override // o.startActivityFromFragment
    public Boolean onMessageChannelReady(internalPathIteratorPeek internalpathiteratorpeek) {
        return ICustomTabsCallback_Parcel(internalpathiteratorpeek);
    }

    private final Boolean ICustomTabsCallback_Parcel(internalPathIteratorPeek internalpathiteratorpeek) {
        getChildFragmentManager getchildfragmentmanagerOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getChildFragmentManager>) getChildFragmentManager.class);
        if (getchildfragmentmanagerOnExtraCallback == null || !getchildfragmentmanagerOnExtraCallback.onWarmupCompleted()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // o.startActivityFromFragment
    public void onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, List<LifecycleEventObserver> list) {
        FragmentManagerExternalSyntheticLambda4 fragmentManagerExternalSyntheticLambda4OnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<FragmentManagerExternalSyntheticLambda4>) FragmentManagerExternalSyntheticLambda4.class);
        if (fragmentManagerExternalSyntheticLambda4OnExtraCallback != null) {
            boolean zOnExtraCallbackWithResult = fragmentManagerExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult();
            FragmentManagerExternalSyntheticLambda4.onExtraCallback[] onextracallbackArrOnWarmupCompleted = fragmentManagerExternalSyntheticLambda4OnExtraCallback.onWarmupCompleted();
            int length = onextracallbackArrOnWarmupCompleted.length;
            JavaType javaTypeIAuthTabCallback = null;
            for (int i2 = 0; i2 < length; i2++) {
                if (javaTypeIAuthTabCallback == null) {
                    javaTypeIAuthTabCallback = radioButtonKtRadioButtonElement27.IAuthTabCallback(Object.class);
                }
                LifecycleEventObserver lifecycleEventObserverOnWarmupCompleted = onWarmupCompleted(onextracallbackArrOnWarmupCompleted[i2], radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0, javaTypeIAuthTabCallback);
                if (zOnExtraCallbackWithResult) {
                    list.add(i2, lifecycleEventObserverOnWarmupCompleted);
                } else {
                    list.add(lifecycleEventObserverOnWarmupCompleted);
                }
            }
            FragmentManagerExternalSyntheticLambda4.onNavigationEvent[] onnavigationeventArrOnExtraCallback = fragmentManagerExternalSyntheticLambda4OnExtraCallback.onExtraCallback();
            int length2 = onnavigationeventArrOnExtraCallback.length;
            for (int i3 = 0; i3 < length2; i3++) {
                LifecycleEventObserver lifecycleEventObserverOnWarmupCompleted2 = onWarmupCompleted(onnavigationeventArrOnExtraCallback[i3], radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0);
                if (zOnExtraCallbackWithResult) {
                    list.add(i3, lifecycleEventObserverOnWarmupCompleted2);
                } else {
                    list.add(lifecycleEventObserverOnWarmupCompleted2);
                }
            }
        }
    }

    protected LifecycleEventObserver onWarmupCompleted(FragmentManagerExternalSyntheticLambda4.onExtraCallback onextracallback, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, JavaType javaType) {
        onFragmentResult onfragmentresult = onextracallback.onNavigationEvent() ? onFragmentResult.onWarmupCompleted : onFragmentResult.onExtraCallbackWithResult;
        String strOnExtraCallback = onextracallback.onExtraCallback();
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(onextracallback.IAuthTabCallback(), onextracallback.onExtraCallbackWithResult());
        if (!fragmentKtExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback()) {
            fragmentKtExternalSyntheticLambda0OnNavigationEvent = FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallback);
        }
        return onInactive.onExtraCallbackWithResult(strOnExtraCallback, onCancelLoad.IAuthTabCallback(radioButtonKtRadioButtonElement27, new nTransactionSetOnComplete(angleMeasurerExternalSyntheticLambda0, angleMeasurerExternalSyntheticLambda0.onNavigationEvent(), strOnExtraCallback, javaType), fragmentKtExternalSyntheticLambda0OnNavigationEvent, onfragmentresult, onextracallback.onWarmupCompleted()), angleMeasurerExternalSyntheticLambda0.onTransact(), javaType);
    }

    protected LifecycleEventObserver onWarmupCompleted(FragmentManagerExternalSyntheticLambda4.onNavigationEvent onnavigationevent, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        onFragmentResult onfragmentresult = onnavigationevent.onExtraCallback() ? onFragmentResult.onWarmupCompleted : onFragmentResult.onExtraCallbackWithResult;
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.IAuthTabCallback());
        JavaType javaTypeIAuthTabCallback = radioButtonKtRadioButtonElement27.IAuthTabCallback(onnavigationevent.onNavigationEvent());
        onCancelLoad oncancelloadIAuthTabCallback = onCancelLoad.IAuthTabCallback(radioButtonKtRadioButtonElement27, new nTransactionSetOnComplete(angleMeasurerExternalSyntheticLambda0, angleMeasurerExternalSyntheticLambda0.onNavigationEvent(), fragmentKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(), javaTypeIAuthTabCallback), fragmentKtExternalSyntheticLambda0OnNavigationEvent, onfragmentresult, onnavigationevent.onWarmupCompleted());
        Class<?> clsIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
        RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = radioButtonKtRadioButtonElement27.access000();
        observeForever observeforeverIAuthTabCallback = radioButtonKtRadioButtonElement24Access000 == null ? null : radioButtonKtRadioButtonElement24Access000.IAuthTabCallback(radioButtonKtRadioButtonElement27, clsIAuthTabCallbackStub);
        if (observeforeverIAuthTabCallback == null) {
            observeforeverIAuthTabCallback = (observeForever) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(clsIAuthTabCallbackStub, radioButtonKtRadioButtonElement27.asInterface());
        }
        return observeforeverIAuthTabCallback.onExtraCallbackWithResult(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0, oncancelloadIAuthTabCallback, javaTypeIAuthTabCallback);
    }

    @Override // o.startActivityFromFragment
    public FragmentKtExternalSyntheticLambda0 IAuthTabCallbackStubProxy(internalPathIteratorPeek internalpathiteratorpeek) {
        boolean z;
        prepareCallInternal preparecallinternalOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<prepareCallInternal>) prepareCallInternal.class);
        if (preparecallinternalOnExtraCallback != null) {
            String strOnExtraCallback = preparecallinternalOnExtraCallback.onExtraCallback();
            if (!strOnExtraCallback.isEmpty()) {
                return FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallback);
            }
            z = true;
        } else {
            z = false;
        }
        getAnimatingAway getanimatingawayOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAnimatingAway>) getAnimatingAway.class);
        if (getanimatingawayOnExtraCallback != null) {
            String strOnExtraCallbackWithResult = getanimatingawayOnExtraCallback.onExtraCallbackWithResult();
            return FragmentKtExternalSyntheticLambda0.onWarmupCompleted(getanimatingawayOnExtraCallback.onTransact(), (strOnExtraCallbackWithResult == null || !strOnExtraCallbackWithResult.isEmpty()) ? strOnExtraCallbackWithResult : null);
        }
        if (z || onExtraCallback(internalpathiteratorpeek, onWarmupCompleted)) {
            return FragmentKtExternalSyntheticLambda0.onNavigationEvent;
        }
        return null;
    }

    @Override // o.startActivityFromFragment
    public Boolean onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek) {
        getAllowEnterTransitionOverlap getallowentertransitionoverlapOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAllowEnterTransitionOverlap>) getAllowEnterTransitionOverlap.class);
        if (getallowentertransitionoverlapOnExtraCallback == null) {
            return null;
        }
        return Boolean.valueOf(getallowentertransitionoverlapOnExtraCallback.onWarmupCompleted());
    }

    @Override // o.startActivityFromFragment
    public Boolean ICustomTabsService(internalPathIteratorPeek internalpathiteratorpeek) {
        getFocusedView getfocusedviewOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getFocusedView>) getFocusedView.class);
        if (getfocusedviewOnExtraCallback == null) {
            return null;
        }
        return Boolean.valueOf(getfocusedviewOnExtraCallback.onWarmupCompleted());
    }

    @Override // o.startActivityFromFragment
    public Boolean onUnminimized(internalPathIteratorPeek internalpathiteratorpeek) {
        setStyle setstyleOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<setStyle>) setStyle.class);
        if (setstyleOnExtraCallback == null) {
            return null;
        }
        return Boolean.valueOf(setstyleOnExtraCallback.onNavigationEvent());
    }

    @Override // o.startActivityFromFragment
    @Deprecated
    public boolean onExtraCallbackWithResult(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
        return onExtraCallbackWithResult((internalPathIteratorPeek) ngetpreviousreleasefencefd, setStyle.class);
    }

    @Override // o.startActivityFromFragment
    @Deprecated
    public boolean onExtraCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
        getFocusedView getfocusedviewOnExtraCallback = onExtraCallback((internalPathIteratorPeek) ngetpreviousreleasefencefd, (Class<getFocusedView>) getFocusedView.class);
        return getfocusedviewOnExtraCallback != null && getfocusedviewOnExtraCallback.onWarmupCompleted();
    }

    @Override // o.startActivityFromFragment
    public Object onExtraCallback(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsIAuthTabCallbackStub;
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        if (fragmentStatePagerAdapterOnExtraCallback == null || (clsIAuthTabCallbackStub = fragmentStatePagerAdapterOnExtraCallback.IAuthTabCallbackStub()) == FragmentActivityExternalSyntheticLambda1.onNavigationEvent.class) {
            return null;
        }
        return clsIAuthTabCallbackStub;
    }

    @Override // o.startActivityFromFragment
    public Object onTransact(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsOnTransact;
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        if (fragmentStatePagerAdapterOnExtraCallback == null || (clsOnTransact = fragmentStatePagerAdapterOnExtraCallback.onTransact()) == setDrawDisappearingViewsLast.onNavigationEvent.class) {
            return null;
        }
        return clsOnTransact;
    }

    @Override // o.startActivityFromFragment
    public Object onWarmupCompleted(internalPathIteratorPeek internalpathiteratorpeek) {
        Class clsOnNavigationEvent;
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        if (fragmentStatePagerAdapterOnExtraCallback == null || (clsOnNavigationEvent = fragmentStatePagerAdapterOnExtraCallback.onNavigationEvent()) == FragmentActivityExternalSyntheticLambda1.onNavigationEvent.class) {
            return null;
        }
        return clsOnNavigationEvent;
    }

    @Override // o.startActivityFromFragment
    public Object onExtraCallbackWithResult(internalPathIteratorPeek internalpathiteratorpeek) {
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        if (fragmentStatePagerAdapterOnExtraCallback == null) {
            return null;
        }
        return onExtraCallbackWithResult(fragmentStatePagerAdapterOnExtraCallback.IAuthTabCallbackDefault(), SavedStateHandleSaverKtExternalSyntheticLambda3.onExtraCallbackWithResult.class);
    }

    @Override // o.startActivityFromFragment
    public Object onWarmupCompleted(nCreate ncreate) {
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(ncreate, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        if (fragmentStatePagerAdapterOnExtraCallback == null) {
            return null;
        }
        return onExtraCallbackWithResult(fragmentStatePagerAdapterOnExtraCallback.onWarmupCompleted(), SavedStateHandleSaverKtExternalSyntheticLambda3.onExtraCallbackWithResult.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    @Override // o.startActivityFromFragment
    public JavaType IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek, JavaType javaType) throws JsonMappingException {
        LifecycleEffectKtExternalSyntheticLambda4 lifecycleEffectKtExternalSyntheticLambda4ExtraCallback = radioButtonKtRadioButtonElement27.extraCallback();
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        Class<?> clsOnNavigationEvent = fragmentStatePagerAdapterOnExtraCallback == null ? null : onNavigationEvent(fragmentStatePagerAdapterOnExtraCallback.onExtraCallbackWithResult());
        if (clsOnNavigationEvent != null && !javaType.onNavigationEvent(clsOnNavigationEvent) && !IAuthTabCallback(javaType, clsOnNavigationEvent)) {
            try {
                javaType = lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.IAuthTabCallback(javaType, clsOnNavigationEvent);
            } catch (IllegalArgumentException e) {
                throw onWarmupCompleted(e, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, clsOnNavigationEvent.getName(), internalpathiteratorpeek.onExtraCallback(), e.getMessage()));
            }
        }
        if (javaType.onUnminimized()) {
            JavaType javaTypeAsInterface = javaType.asInterface();
            Class<?> clsOnNavigationEvent2 = fragmentStatePagerAdapterOnExtraCallback == null ? null : onNavigationEvent(fragmentStatePagerAdapterOnExtraCallback.asBinder());
            if (clsOnNavigationEvent2 != null && !IAuthTabCallback(javaTypeAsInterface, clsOnNavigationEvent2)) {
                try {
                    javaType = ((MapLikeType) javaType).onExtraCallbackWithResult(lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.IAuthTabCallback(javaTypeAsInterface, clsOnNavigationEvent2));
                } catch (IllegalArgumentException e2) {
                    throw onWarmupCompleted(e2, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsOnNavigationEvent2.getName(), internalpathiteratorpeek.onExtraCallback(), e2.getMessage()));
                }
            }
        }
        JavaType javaTypeIAuthTabCallbackStub = javaType.IAuthTabCallbackStub();
        if (javaTypeIAuthTabCallbackStub != null) {
            Class<?> clsOnNavigationEvent3 = fragmentStatePagerAdapterOnExtraCallback != null ? onNavigationEvent(fragmentStatePagerAdapterOnExtraCallback.IAuthTabCallback()) : null;
            if (clsOnNavigationEvent3 != null && !IAuthTabCallback(javaTypeIAuthTabCallbackStub, clsOnNavigationEvent3)) {
                try {
                    return javaType.IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda4ExtraCallback.IAuthTabCallback(javaTypeIAuthTabCallbackStub, clsOnNavigationEvent3));
                } catch (IllegalArgumentException e3) {
                    throw onWarmupCompleted(e3, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsOnNavigationEvent3.getName(), internalpathiteratorpeek.onExtraCallback(), e3.getMessage()));
                }
            }
        }
        return javaType;
    }

    @Override // o.startActivityFromFragment
    public Object IAuthTabCallbackDefault(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        finishUpdate finishupdateOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<finishUpdate>) finishUpdate.class);
        if (finishupdateOnExtraCallback == null) {
            return null;
        }
        return finishupdateOnExtraCallback.onExtraCallback();
    }

    @Override // o.startActivityFromFragment
    public Class<?> onNavigationEvent(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        FragmentStatePagerAdapter fragmentStatePagerAdapterOnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<FragmentStatePagerAdapter>) FragmentStatePagerAdapter.class);
        if (fragmentStatePagerAdapterOnExtraCallback == null) {
            return null;
        }
        return onNavigationEvent(fragmentStatePagerAdapterOnExtraCallback.onExtraCallback());
    }

    @Override // o.startActivityFromFragment
    public FragmentManagerExternalSyntheticLambda5.IAuthTabCallback IAuthTabCallback(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        FragmentManagerExternalSyntheticLambda5 fragmentManagerExternalSyntheticLambda5OnExtraCallback = onExtraCallback(angleMeasurerExternalSyntheticLambda0, (Class<FragmentManagerExternalSyntheticLambda5>) FragmentManagerExternalSyntheticLambda5.class);
        if (fragmentManagerExternalSyntheticLambda5OnExtraCallback == null) {
            return null;
        }
        return new FragmentManagerExternalSyntheticLambda5.IAuthTabCallback(fragmentManagerExternalSyntheticLambda5OnExtraCallback);
    }

    @Override // o.startActivityFromFragment
    public FragmentKtExternalSyntheticLambda0 asBinder(internalPathIteratorPeek internalpathiteratorpeek) {
        boolean z;
        getEnterTransitionCallback getentertransitioncallbackOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getEnterTransitionCallback>) getEnterTransitionCallback.class);
        if (getentertransitioncallbackOnExtraCallback != null) {
            String strOnExtraCallbackWithResult = getentertransitioncallbackOnExtraCallback.onExtraCallbackWithResult();
            if (!strOnExtraCallbackWithResult.isEmpty()) {
                return FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult);
            }
            z = true;
        } else {
            z = false;
        }
        getAnimatingAway getanimatingawayOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAnimatingAway>) getAnimatingAway.class);
        if (getanimatingawayOnExtraCallback != null) {
            String strOnExtraCallbackWithResult2 = getanimatingawayOnExtraCallback.onExtraCallbackWithResult();
            return FragmentKtExternalSyntheticLambda0.onWarmupCompleted(getanimatingawayOnExtraCallback.onTransact(), (strOnExtraCallbackWithResult2 == null || !strOnExtraCallbackWithResult2.isEmpty()) ? strOnExtraCallbackWithResult2 : null);
        }
        if (z || onExtraCallback(internalpathiteratorpeek, onExtraCallback)) {
            return FragmentKtExternalSyntheticLambda0.onNavigationEvent;
        }
        return null;
    }

    @Override // o.startActivityFromFragment
    public Boolean ICustomTabsCallbackStubProxy(internalPathIteratorPeek internalpathiteratorpeek) {
        showNow shownowOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<showNow>) showNow.class);
        if (shownowOnExtraCallback == null) {
            return null;
        }
        return Boolean.valueOf(shownowOnExtraCallback.IAuthTabCallback());
    }

    @Override // o.startActivityFromFragment
    public getEnterTransitionCallback$onExtraCallbackWithResult onPostMessage(internalPathIteratorPeek internalpathiteratorpeek) {
        return getEnterTransitionCallback$onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback(internalpathiteratorpeek, getEnterTransitionCallback.class));
    }

    @Override // o.startActivityFromFragment
    public Boolean IAuthTabCallbackDefault(internalPathIteratorPeek internalpathiteratorpeek) {
        getAllowReturnTransitionOverlap getallowreturntransitionoverlapOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<getAllowReturnTransitionOverlap>) getAllowReturnTransitionOverlap.class);
        if (getallowreturntransitionoverlapOnExtraCallback == null) {
            return null;
        }
        return getallowreturntransitionoverlapOnExtraCallback.onExtraCallbackWithResult().asBoolean();
    }

    @Override // o.startActivityFromFragment
    public Fragment.IAuthTabCallback onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek) {
        Fragment.IAuthTabCallback iAuthTabCallbackOnNavigationEvent;
        internalConicToQuadratics internalconictoquadratics;
        Boolean boolOnWarmupCompleted;
        Fragment fragmentOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<Fragment>) Fragment.class);
        if (fragmentOnExtraCallback == null) {
            iAuthTabCallbackOnNavigationEvent = null;
        } else {
            iAuthTabCallbackOnNavigationEvent = fragmentOnExtraCallback.onNavigationEvent();
            if (iAuthTabCallbackOnNavigationEvent != Fragment.IAuthTabCallback.DEFAULT) {
                return iAuthTabCallbackOnNavigationEvent;
            }
        }
        return (this._cfgConstructorPropertiesImpliesCreator && radioButtonKtRadioButtonElement27.onExtraCallback(setLayoutTransition.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (internalpathiteratorpeek instanceof RoundedPolygonCompanion) && (internalconictoquadratics = onNavigationEvent) != null && (boolOnWarmupCompleted = internalconictoquadratics.onWarmupCompleted(internalpathiteratorpeek)) != null && boolOnWarmupCompleted.booleanValue()) ? Fragment.IAuthTabCallback.PROPERTIES : iAuthTabCallbackOnNavigationEvent;
    }

    protected boolean isEngagementSignalsApiAvailable(internalPathIteratorPeek internalpathiteratorpeek) {
        Boolean boolOnExtraCallback;
        findFragmentByWho findfragmentbywhoOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<findFragmentByWho>) findFragmentByWho.class);
        if (findfragmentbywhoOnExtraCallback != null) {
            return findfragmentbywhoOnExtraCallback.onWarmupCompleted();
        }
        internalConicToQuadratics internalconictoquadratics = onNavigationEvent;
        if (internalconictoquadratics == null || (boolOnExtraCallback = internalconictoquadratics.onExtraCallback(internalpathiteratorpeek)) == null) {
            return false;
        }
        return boolOnExtraCallback.booleanValue();
    }

    protected Class<?> onNavigationEvent(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
            return null;
        }
        return cls;
    }

    protected Class<?> onExtraCallbackWithResult(Class<?> cls, Class<?> cls2) {
        Class<?> clsOnNavigationEvent = onNavigationEvent(cls);
        if (clsOnNavigationEvent == null || clsOnNavigationEvent == cls2) {
            return null;
        }
        return clsOnNavigationEvent;
    }

    protected FragmentKtExternalSyntheticLambda0 onNavigationEvent(String str, String str2) {
        if (str.isEmpty()) {
            return FragmentKtExternalSyntheticLambda0.onNavigationEvent;
        }
        if (str2 == null || str2.isEmpty()) {
            return FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(str);
        }
        return FragmentKtExternalSyntheticLambda0.onWarmupCompleted(str, str2);
    }

    protected FragmentKtExternalSyntheticLambda0 mayLaunchUrl(internalPathIteratorPeek internalpathiteratorpeek) {
        internalConicToQuadratics internalconictoquadratics;
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        if (!(internalpathiteratorpeek instanceof nDupFenceFd)) {
            return null;
        }
        nDupFenceFd ndupfencefd = (nDupFenceFd) internalpathiteratorpeek;
        if (ndupfencefd.IAuthTabCallbackDefault() == null || (internalconictoquadratics = onNavigationEvent) == null || (fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = internalconictoquadratics.onExtraCallbackWithResult(ndupfencefd)) == null) {
            return null;
        }
        return fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult;
    }

    protected setPrinter<?> onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek, JavaType javaType) {
        setPrinter<?> setprinterOnNavigationEvent;
        getFragmentManager.IAuthTabCallback IAuthTabCallback = IAuthTabCallback(radioButtonKtRadioButtonElement27, internalpathiteratorpeek);
        startUpdate startupdateOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<startUpdate>) startUpdate.class);
        if (startupdateOnExtraCallback != null) {
            if (IAuthTabCallback == null) {
                return null;
            }
            setprinterOnNavigationEvent = radioButtonKtRadioButtonElement27.onNavigationEvent(internalpathiteratorpeek, startupdateOnExtraCallback.onWarmupCompleted());
        } else {
            if (IAuthTabCallback == null) {
                return null;
            }
            if (IAuthTabCallback.onNavigationEvent() == getFragmentManager.onExtraCallbackWithResult.NONE) {
                return IAuthTabCallback();
            }
            setprinterOnNavigationEvent = onNavigationEvent(radioButtonKtRadioButtonElement27, IAuthTabCallback, javaType);
        }
        setPrimaryItem setprimaryitemOnExtraCallback = onExtraCallback(internalpathiteratorpeek, (Class<setPrimaryItem>) setPrimaryItem.class);
        setColumnOrderPreserved setcolumnorderpreservedOnExtraCallbackWithResult = setprimaryitemOnExtraCallback != null ? radioButtonKtRadioButtonElement27.onExtraCallbackWithResult(internalpathiteratorpeek, setprimaryitemOnExtraCallback.onExtraCallbackWithResult()) : null;
        if (IAuthTabCallback.IAuthTabCallback() == getFragmentManager.onWarmupCompleted.EXTERNAL_PROPERTY && (internalpathiteratorpeek instanceof AngleMeasurerExternalSyntheticLambda0)) {
            IAuthTabCallback = IAuthTabCallback.onNavigationEvent(getFragmentManager.onWarmupCompleted.PROPERTY);
        }
        Class clsOnExtraCallbackWithResult = IAuthTabCallback.onExtraCallbackWithResult();
        if (clsOnExtraCallbackWithResult != null && clsOnExtraCallbackWithResult != getFragmentManager.onExtraCallback.class && !clsOnExtraCallbackWithResult.isAnnotation()) {
            IAuthTabCallback = IAuthTabCallback.onNavigationEvent(clsOnExtraCallbackWithResult);
        }
        return setprinterOnNavigationEvent.onWarmupCompleted(IAuthTabCallback, setcolumnorderpreservedOnExtraCallbackWithResult);
    }

    protected setPrinter<?> onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, getFragmentManager.IAuthTabCallback iAuthTabCallback, JavaType javaType) {
        return new WakefulBroadcastReceiver(iAuthTabCallback);
    }

    protected WakefulBroadcastReceiver IAuthTabCallback() {
        return WakefulBroadcastReceiver.onExtraCallback();
    }

    private boolean IAuthTabCallback(Class<?> cls, Class<?> cls2) {
        return cls.isPrimitive() ? cls == SavedStateHandleImplExternalSyntheticLambda0.onActivityLayout(cls2) : cls2.isPrimitive() && cls2 == SavedStateHandleImplExternalSyntheticLambda0.onActivityLayout(cls);
    }

    private boolean IAuthTabCallback(JavaType javaType, Class<?> cls) {
        if (javaType.ICustomTabsCallbackStub()) {
            return javaType.onNavigationEvent(SavedStateHandleImplExternalSyntheticLambda0.onActivityLayout(cls));
        }
        return cls.isPrimitive() && cls == SavedStateHandleImplExternalSyntheticLambda0.onActivityLayout(javaType.asBinder());
    }

    private JsonMappingException onExtraCallbackWithResult(String str) {
        return new JsonMappingException((Closeable) null, str);
    }

    private JsonMappingException onWarmupCompleted(Throwable th, String str) {
        return new JsonMappingException((Closeable) null, str, th);
    }
}
