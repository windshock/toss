package o;

import com.fasterxml.jackson.databind.JavaType;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.Fragment;
import o.FragmentManagerExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class onStateNotSaved {
    protected final JavaType onNavigationEvent;

    public abstract nCreate IAuthTabCallback();

    public abstract Map<Object, nCreate> IAuthTabCallbackDefault();

    public nCreate IAuthTabCallbackStub() {
        return null;
    }

    public abstract Class<?> IAuthTabCallbackStubProxy();

    public abstract SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> IAuthTabCallback_Parcel();

    public abstract AngleMeasurerExternalSyntheticLambda0 ICustomTabsCallback();

    public abstract List<nSetBufferTransparency> access000();

    public abstract FragmentManagerExternalSyntheticLambda5.IAuthTabCallback access100();

    public abstract nCreate asBinder();

    public abstract SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> asInterface();

    public abstract List<internalPathIteratorRawSize<RoundedPolygonCompanion, Fragment.IAuthTabCallback>> extraCallback();

    public abstract List<nGetPreviousReleaseFenceFd> extraCallbackWithResult();

    public abstract Set<String> onActivityLayout();

    public abstract boolean onActivityResized();

    public abstract RoundedPolygonCompanion onExtraCallback();

    public abstract List<nSetBufferTransparency> onExtraCallbackWithResult();

    public abstract dump$onWarmupCompleted onExtraCallbackWithResult(dump$onWarmupCompleted dump_onwarmupcompleted);

    public abstract nTransactionReparent onMinimized();

    public abstract Object onNavigationEvent(boolean z);

    public abstract nCreate onNavigationEvent();

    public abstract nGetPreviousReleaseFenceFd onNavigationEvent(String str, Class<?>[] clsArr);

    public abstract nTransactionDelete onPostMessage();

    public abstract registerOnPreAttachListener$onExtraCallback onTransact();

    public abstract Class<?>[] onWarmupCompleted();

    public abstract List<internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback>> readTypedObject();

    public abstract RememberLifecycleOwnerKtExternalSyntheticLambda0 writeTypedObject();

    public onStateNotSaved(JavaType javaType) {
        this.onNavigationEvent = javaType;
    }

    public JavaType onMessageChannelReady() {
        return this.onNavigationEvent;
    }

    public Class<?> getInterfaceDescriptor() {
        return this.onNavigationEvent.asBinder();
    }

    public boolean ICustomTabsCallbackStubProxy() {
        return ICustomTabsCallback().access100();
    }
}
