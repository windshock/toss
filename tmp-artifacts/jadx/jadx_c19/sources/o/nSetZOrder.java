package o;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.Fragment;
import o.GlanceAppWidgetReceiver;
import o.setShowsDialog;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class nSetZOrder {
    protected LinkedList<nCreate> IAuthTabCallback;
    protected LinkedList<nGetPreviousReleaseFenceFd> IAuthTabCallbackDefault;
    protected final RadioButtonKtRadioButtonElement27<?> IAuthTabCallbackStub;
    protected Map<FragmentKtExternalSyntheticLambda0, FragmentKtExternalSyntheticLambda0> IAuthTabCallbackStubProxy;
    protected final boolean IAuthTabCallback_Parcel;
    protected LinkedList<nCreate> ICustomTabsCallback;
    protected HashSet<String> access000;
    protected registerOnPreAttachListener$onExtraCallback access100;
    protected final AngleMeasurerExternalSyntheticLambda0 asBinder;
    protected boolean asInterface;
    protected LinkedHashMap<String, nTransactionApply> extraCallback;
    protected final boolean extraCallbackWithResult;
    protected LinkedHashMap<Object, nCreate> getInterfaceDescriptor;
    protected LinkedList<nCreate> onExtraCallback;
    protected final internalPathIteratorSize onExtraCallbackWithResult;
    protected final JavaType onMessageChannelReady;
    protected final nTransactionSetOnCommit<?> onMinimized;
    protected final startActivityFromFragment onNavigationEvent;
    protected final boolean onPostMessage;
    protected List<nTransactionApply> onTransact;
    protected LinkedList<nCreate> onWarmupCompleted;
    protected LinkedList<nCreate> readTypedObject;
    protected nTransactionDelete writeTypedObject;

    protected nSetZOrder(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, boolean z, JavaType javaType, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, internalPathIteratorSize internalpathiteratorsize) {
        this.IAuthTabCallbackStub = radioButtonKtRadioButtonElement27;
        this.IAuthTabCallback_Parcel = z;
        this.onMessageChannelReady = javaType;
        this.asBinder = angleMeasurerExternalSyntheticLambda0;
        this.extraCallbackWithResult = javaType.ICustomTabsCallbackStubProxy();
        if (radioButtonKtRadioButtonElement27.ICustomTabsCallback()) {
            this.onPostMessage = true;
            this.onNavigationEvent = radioButtonKtRadioButtonElement27.asBinder();
        } else {
            this.onPostMessage = false;
            this.onNavigationEvent = startActivityFromFragment.onNavigationEvent();
        }
        this.onMinimized = radioButtonKtRadioButtonElement27.onWarmupCompleted(javaType.asBinder(), angleMeasurerExternalSyntheticLambda0);
        this.onExtraCallbackWithResult = internalpathiteratorsize;
    }

    public RadioButtonKtRadioButtonElement27<?> asBinder() {
        return this.IAuthTabCallbackStub;
    }

    public JavaType readTypedObject() {
        return this.onMessageChannelReady;
    }

    public boolean ICustomTabsCallback() {
        return this.extraCallbackWithResult;
    }

    public AngleMeasurerExternalSyntheticLambda0 onTransact() {
        return this.asBinder;
    }

    public List<nSetBufferTransparency> getInterfaceDescriptor() {
        return new ArrayList(extraCallback().values());
    }

    public nTransactionDelete IAuthTabCallback_Parcel() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        return this.writeTypedObject;
    }

    public Map<Object, nCreate> IAuthTabCallbackDefault() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        return this.getInterfaceDescriptor;
    }

    public nCreate access100() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        LinkedList<nCreate> linkedList = this.ICustomTabsCallback;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !onWarmupCompleted(this.ICustomTabsCallback)) {
            onWarmupCompleted("Multiple 'as-key' properties defined (%s vs %s)", this.ICustomTabsCallback.get(0), this.ICustomTabsCallback.get(1));
        }
        return this.ICustomTabsCallback.get(0);
    }

    public nCreate access000() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        LinkedList<nCreate> linkedList = this.readTypedObject;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !onWarmupCompleted(this.readTypedObject)) {
            onWarmupCompleted("Multiple 'as-value' properties defined (%s vs %s)", this.readTypedObject.get(0), this.readTypedObject.get(1));
        }
        return this.readTypedObject.get(0);
    }

    public nCreate IAuthTabCallback() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        LinkedList<nCreate> linkedList = this.IAuthTabCallback;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            onWarmupCompleted("Multiple 'any-getter' fields defined (%s vs %s)", this.IAuthTabCallback.get(0), this.IAuthTabCallback.get(1));
        }
        return this.IAuthTabCallback.getFirst();
    }

    public nCreate onExtraCallbackWithResult() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        LinkedList<nCreate> linkedList = this.onWarmupCompleted;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            onWarmupCompleted("Multiple 'any-getter' methods defined (%s vs %s)", this.onWarmupCompleted.get(0), this.onWarmupCompleted.get(1));
        }
        return this.onWarmupCompleted.getFirst();
    }

    public nCreate onExtraCallback() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        LinkedList<nCreate> linkedList = this.onExtraCallback;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            onWarmupCompleted("Multiple 'any-setter' fields defined (%s vs %s)", this.onExtraCallback.get(0), this.onExtraCallback.get(1));
        }
        return this.onExtraCallback.getFirst();
    }

    public nGetPreviousReleaseFenceFd onWarmupCompleted() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        LinkedList<nGetPreviousReleaseFenceFd> linkedList = this.IAuthTabCallbackDefault;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            onWarmupCompleted("Multiple 'any-setter' methods defined (%s vs %s)", this.IAuthTabCallbackDefault.get(0), this.IAuthTabCallbackDefault.get(1));
        }
        return this.IAuthTabCallbackDefault.getFirst();
    }

    public Set<String> IAuthTabCallbackStub() {
        return this.access000;
    }

    public nTransactionReparent IAuthTabCallbackStubProxy() {
        nTransactionReparent ntransactionreparentAccess000 = this.onNavigationEvent.access000(this.asBinder);
        return ntransactionreparentAccess000 != null ? this.onNavigationEvent.onExtraCallback(this.asBinder, ntransactionreparentAccess000) : ntransactionreparentAccess000;
    }

    protected Map<String, nTransactionApply> extraCallback() {
        if (!this.asInterface) {
            onNavigationEvent();
        }
        return this.extraCallback;
    }

    public registerOnPreAttachListener$onExtraCallback asInterface() {
        if (this.access100 == null) {
            startActivityFromFragment startactivityfromfragment = this.onNavigationEvent;
            registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackAsInterface = startactivityfromfragment != null ? startactivityfromfragment.asInterface(this.asBinder) : null;
            registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent(this.onMessageChannelReady.asBinder());
            if (registeronpreattachlistener_onextracallbackOnNavigationEvent != null) {
                registeronpreattachlistener_onextracallbackAsInterface = registeronpreattachlistener_onextracallbackAsInterface == null ? registeronpreattachlistener_onextracallbackOnNavigationEvent : registeronpreattachlistener_onextracallbackAsInterface.onWarmupCompleted(registeronpreattachlistener_onextracallbackOnNavigationEvent);
            }
            if (registeronpreattachlistener_onextracallbackAsInterface == null) {
                registeronpreattachlistener_onextracallbackAsInterface = registerOnPreAttachListener$onExtraCallback.onNavigationEvent();
            }
            this.access100 = registeronpreattachlistener_onextracallbackAsInterface;
        }
        return this.access100;
    }

    protected void onNavigationEvent() {
        this.writeTypedObject = new nTransactionDelete();
        LinkedHashMap<String, nTransactionApply> linkedHashMap = new LinkedHashMap<>();
        IAuthTabCallback(linkedHashMap);
        onWarmupCompleted(linkedHashMap);
        if (!this.asBinder.access100()) {
            onExtraCallback(linkedHashMap);
        }
        onTransact(linkedHashMap);
        onNavigationEvent(linkedHashMap);
        asInterface(linkedHashMap);
        onExtraCallbackWithResult(linkedHashMap);
        Iterator<nTransactionApply> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().IAuthTabCallback(this.IAuthTabCallback_Parcel);
        }
        loadFragmentClass loadfragmentclassWriteTypedObject = writeTypedObject();
        if (loadfragmentclassWriteTypedObject != null) {
            onExtraCallbackWithResult(linkedHashMap, loadfragmentclassWriteTypedObject);
        }
        Iterator<nTransactionApply> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().requestPostMessageChannelWithExtras();
        }
        if (this.extraCallbackWithResult && !this.IAuthTabCallback_Parcel) {
            Iterator<nTransactionApply> it3 = linkedHashMap.values().iterator();
            while (it3.hasNext()) {
                it3.next().prefetch();
            }
        }
        if (this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            asBinder(linkedHashMap);
        }
        IAuthTabCallbackDefault(linkedHashMap);
        this.extraCallback = linkedHashMap;
        this.asInterface = true;
    }

    protected void IAuthTabCallback(Map<String, nTransactionApply> map) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0AsBinder;
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0IAuthTabCallback;
        boolean z;
        boolean z2;
        startActivityFromFragment startactivityfromfragment = this.onNavigationEvent;
        boolean z3 = (this.IAuthTabCallback_Parcel || this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.PROPAGATE_TRANSIENT_MARKER);
        for (RoundedPolygonKt roundedPolygonKt : this.asBinder.asInterface()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(startactivityfromfragment.onExtraCallbackWithResult(this.IAuthTabCallbackStub, (internalPathIteratorPeek) roundedPolygonKt))) {
                if (this.ICustomTabsCallback == null) {
                    this.ICustomTabsCallback = new LinkedList<>();
                }
                this.ICustomTabsCallback.add(roundedPolygonKt);
            }
            if (bool.equals(startactivityfromfragment.ICustomTabsService(roundedPolygonKt))) {
                if (this.readTypedObject == null) {
                    this.readTypedObject = new LinkedList<>();
                }
                this.readTypedObject.add(roundedPolygonKt);
            } else {
                boolean zEquals = bool.equals(startactivityfromfragment.onUnminimized(roundedPolygonKt));
                boolean zEquals2 = bool.equals(startactivityfromfragment.ICustomTabsCallbackStubProxy(roundedPolygonKt));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this.IAuthTabCallback == null) {
                            this.IAuthTabCallback = new LinkedList<>();
                        }
                        this.IAuthTabCallback.add(roundedPolygonKt);
                    }
                    if (zEquals2) {
                        if (this.onExtraCallback == null) {
                            this.onExtraCallback = new LinkedList<>();
                        }
                        this.onExtraCallback.add(roundedPolygonKt);
                    }
                } else {
                    String strOnExtraCallback = startactivityfromfragment.onExtraCallback((nCreate) roundedPolygonKt);
                    if (strOnExtraCallback == null) {
                        strOnExtraCallback = roundedPolygonKt.onExtraCallback();
                    }
                    String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(roundedPolygonKt, strOnExtraCallback);
                    if (strOnExtraCallbackWithResult != null) {
                        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0IAuthTabCallback2 = IAuthTabCallback(strOnExtraCallbackWithResult);
                        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnNavigationEvent = startactivityfromfragment.onNavigationEvent(this.IAuthTabCallbackStub, roundedPolygonKt, fragmentKtExternalSyntheticLambda0IAuthTabCallback2);
                        if (fragmentKtExternalSyntheticLambda0OnNavigationEvent != null && !fragmentKtExternalSyntheticLambda0OnNavigationEvent.equals(fragmentKtExternalSyntheticLambda0IAuthTabCallback2)) {
                            if (this.IAuthTabCallbackStubProxy == null) {
                                this.IAuthTabCallbackStubProxy = new HashMap();
                            }
                            this.IAuthTabCallbackStubProxy.put(fragmentKtExternalSyntheticLambda0OnNavigationEvent, fragmentKtExternalSyntheticLambda0IAuthTabCallback2);
                        }
                        if (this.IAuthTabCallback_Parcel) {
                            fragmentKtExternalSyntheticLambda0AsBinder = startactivityfromfragment.IAuthTabCallbackStubProxy(roundedPolygonKt);
                        } else {
                            fragmentKtExternalSyntheticLambda0AsBinder = startactivityfromfragment.asBinder((internalPathIteratorPeek) roundedPolygonKt);
                        }
                        boolean z4 = fragmentKtExternalSyntheticLambda0AsBinder != null;
                        if (z4 && fragmentKtExternalSyntheticLambda0AsBinder.onExtraCallback()) {
                            z = false;
                            fragmentKtExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(strOnExtraCallbackWithResult);
                        } else {
                            fragmentKtExternalSyntheticLambda0IAuthTabCallback = fragmentKtExternalSyntheticLambda0AsBinder;
                            z = z4;
                        }
                        boolean zIAuthTabCallback = fragmentKtExternalSyntheticLambda0IAuthTabCallback != null;
                        if (!zIAuthTabCallback) {
                            zIAuthTabCallback = this.onMinimized.IAuthTabCallback(roundedPolygonKt);
                        }
                        boolean z5 = zIAuthTabCallback;
                        boolean zOnTransact = startactivityfromfragment.onTransact((nCreate) roundedPolygonKt);
                        if (roundedPolygonKt.IAuthTabCallbackDefault() && !z4) {
                            if (zOnExtraCallback) {
                                z2 = true;
                                if (z3 || fragmentKtExternalSyntheticLambda0IAuthTabCallback != null || z2 || !Modifier.isFinal(roundedPolygonKt.onExtraCallbackWithResult())) {
                                    IAuthTabCallback(map, strOnExtraCallbackWithResult).IAuthTabCallback(roundedPolygonKt, fragmentKtExternalSyntheticLambda0IAuthTabCallback, z, z5, z2);
                                }
                            } else if (zOnTransact) {
                            }
                        }
                        z2 = zOnTransact;
                        if (z3) {
                        }
                        IAuthTabCallback(map, strOnExtraCallbackWithResult).IAuthTabCallback(roundedPolygonKt, fragmentKtExternalSyntheticLambda0IAuthTabCallback, z, z5, z2);
                    }
                }
            }
        }
    }

    protected void onExtraCallback(Map<String, nTransactionApply> map) {
        nTransactionCreate ntransactioncreateIAuthTabCallback;
        nTransactionDelete ntransactiondelete = this.writeTypedObject;
        List<nTransactionCreate> listOnExtraCallback = onExtraCallback(this.asBinder.IAuthTabCallbackDefault());
        List<nTransactionCreate> listOnExtraCallback2 = onExtraCallback((List<? extends nSetBufferTransform>) this.asBinder.IAuthTabCallback_Parcel());
        if (this.extraCallbackWithResult) {
            ntransactioncreateIAuthTabCallback = JniBindingsCompanion.onNavigationEvent(this.IAuthTabCallbackStub, this.asBinder, listOnExtraCallback);
        } else {
            ntransactioncreateIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(this.IAuthTabCallbackStub, this.asBinder, listOnExtraCallback, listOnExtraCallback2);
        }
        onExtraCallbackWithResult(listOnExtraCallback);
        onExtraCallbackWithResult(listOnExtraCallback2);
        onWarmupCompleted(listOnExtraCallback2, ntransactioncreateIAuthTabCallback);
        if (this.onPostMessage) {
            IAuthTabCallback(ntransactiondelete, listOnExtraCallback, map, false);
            IAuthTabCallback(ntransactiondelete, listOnExtraCallback2, map, ntransactiondelete.onExtraCallback());
        }
        if (!ntransactiondelete.onExtraCallback()) {
            onWarmupCompleted(ntransactiondelete, listOnExtraCallback, ntransactioncreateIAuthTabCallback);
        }
        if (ntransactioncreateIAuthTabCallback != null && (listOnExtraCallback.remove(ntransactioncreateIAuthTabCallback) || listOnExtraCallback2.remove(ntransactioncreateIAuthTabCallback))) {
            if (onExtraCallback(ntransactioncreateIAuthTabCallback)) {
                if (!ntransactiondelete.onWarmupCompleted()) {
                    ntransactiondelete.IAuthTabCallback(ntransactioncreateIAuthTabCallback);
                }
            } else if (!ntransactiondelete.onExtraCallback()) {
                ntransactiondelete.onWarmupCompleted(this.IAuthTabCallbackStub, ntransactioncreateIAuthTabCallback, "Primary");
            }
        }
        GlanceAppWidgetReceiver glanceAppWidgetReceiverOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
        if (!ntransactiondelete.onTransact() && !glanceAppWidgetReceiverOnWarmupCompleted.onWarmupCompleted() && (this.asBinder.IAuthTabCallbackStubProxy() == null || glanceAppWidgetReceiverOnWarmupCompleted.onExtraCallback())) {
            onExtraCallback(ntransactiondelete, listOnExtraCallback, map);
        }
        IAuthTabCallback(listOnExtraCallback);
        IAuthTabCallback(listOnExtraCallback2);
        ntransactiondelete.IAuthTabCallback(listOnExtraCallback, listOnExtraCallback2);
        nTransactionCreate ntransactioncreate = ntransactiondelete.onWarmupCompleted;
        if (ntransactioncreate == null) {
            this.onTransact = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.onTransact = arrayList;
        onExtraCallback(map, ntransactioncreate, arrayList);
    }

    private boolean onExtraCallback(nTransactionCreate ntransactioncreate) {
        LinkedList<nCreate> linkedList;
        int i2 = AnonymousClass2.onWarmupCompleted[ntransactioncreate.onNavigationEvent().ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || ntransactioncreate.onTransact() != 1 || (linkedList = this.readTypedObject) == null || linkedList.isEmpty()) ? false : true;
        }
        return true;
    }

    private List<nTransactionCreate> onExtraCallback(List<? extends nSetBufferTransform> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (nSetBufferTransform nsetbuffertransform : list) {
            arrayList.add(new nTransactionCreate(nsetbuffertransform, this.onPostMessage ? this.onNavigationEvent.onWarmupCompleted(this.IAuthTabCallbackStub, nsetbuffertransform) : null));
        }
        return arrayList;
    }

    private void onExtraCallbackWithResult(List<nTransactionCreate> list) {
        Iterator<nTransactionCreate> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().IAuthTabCallback() == Fragment.IAuthTabCallback.DISABLED) {
                it.remove();
            }
        }
    }

    private void IAuthTabCallback(List<nTransactionCreate> list) {
        Iterator<nTransactionCreate> it = list.iterator();
        while (it.hasNext()) {
            if (!this.onMinimized.onExtraCallback(it.next().onWarmupCompleted())) {
                it.remove();
            }
        }
    }

    private void onWarmupCompleted(List<nTransactionCreate> list, nTransactionCreate ntransactioncreate) {
        Class<?> clsOnExtraCallbackWithResult;
        Class<?> clsAsBinder = this.onMessageChannelReady.asBinder();
        Iterator<nTransactionCreate> it = list.iterator();
        while (it.hasNext()) {
            nTransactionCreate next = it.next();
            if (!next.onExtraCallback() && ntransactioncreate != next) {
                nSetBufferTransform nsetbuffertransformOnWarmupCompleted = next.onWarmupCompleted();
                if (clsAsBinder.isAssignableFrom(nsetbuffertransformOnWarmupCompleted.onNavigationEvent()) && next.onTransact() == 1) {
                    String strOnExtraCallback = nsetbuffertransformOnWarmupCompleted.onExtraCallback();
                    if ("valueOf".equals(strOnExtraCallback) || ("fromString".equals(strOnExtraCallback) && ((clsOnExtraCallbackWithResult = nsetbuffertransformOnWarmupCompleted.onExtraCallbackWithResult(0)) == String.class || CharSequence.class.isAssignableFrom(clsOnExtraCallbackWithResult)))) {
                    }
                }
                it.remove();
            }
        }
    }

    private void IAuthTabCallback(nTransactionDelete ntransactiondelete, List<nTransactionCreate> list, Map<String, nTransactionApply> map, boolean z) {
        GlanceAppWidgetReceiver glanceAppWidgetReceiverOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
        Iterator<nTransactionCreate> it = list.iterator();
        while (it.hasNext()) {
            nTransactionCreate next = it.next();
            if (next.onExtraCallback()) {
                it.remove();
                int i2 = AnonymousClass2.onWarmupCompleted[next.IAuthTabCallback().ordinal()];
                if (i2 == 1 || !(i2 == 3 || IAuthTabCallback(next, map, glanceAppWidgetReceiverOnWarmupCompleted))) {
                    ntransactiondelete.IAuthTabCallback(next);
                } else if (!z) {
                    ntransactiondelete.onWarmupCompleted(this.IAuthTabCallbackStub, next, "explicit");
                }
            }
        }
    }

    private boolean IAuthTabCallback(nTransactionCreate ntransactioncreate, Map<String, nTransactionApply> map, GlanceAppWidgetReceiver glanceAppWidgetReceiver) {
        if (ntransactioncreate.onTransact() == 1) {
            int i2 = AnonymousClass2.onExtraCallback[glanceAppWidgetReceiver.onNavigationEvent().ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            if (i2 == 3) {
                throw new IllegalArgumentException(String.format("Single-argument constructor (%s) is annotated but no 'mode' defined; `ConstructorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", ntransactioncreate.onWarmupCompleted()));
            }
        }
        ntransactioncreate.onNavigationEvent(this.IAuthTabCallbackStub);
        if (ntransactioncreate.onExtraCallbackWithResult()) {
            return true;
        }
        LinkedList<nCreate> linkedList = this.readTypedObject;
        if (linkedList != null && !linkedList.isEmpty()) {
            return false;
        }
        if (ntransactioncreate.onTransact() == 1) {
            FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = ntransactioncreate.onExtraCallbackWithResult(0);
            if (fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                nTransactionApply ntransactionapply = map.get(fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult());
                if (ntransactionapply != null) {
                    if (ntransactionapply.onUnminimized() && !ntransactionapply.ICustomTabsCallbackDefault()) {
                        return true;
                    }
                } else {
                    for (nTransactionApply ntransactionapply2 : map.values()) {
                        if (ntransactionapply2.onUnminimized() && !ntransactionapply2.ICustomTabsCallbackDefault() && ntransactionapply2.onNavigationEvent(fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult)) {
                            return true;
                        }
                    }
                }
            }
            startActivityFromFragment startactivityfromfragment = this.onNavigationEvent;
            return (startactivityfromfragment == null || startactivityfromfragment.onExtraCallbackWithResult((nCreate) ntransactioncreate.onWarmupCompleted(0)) == null) ? false : true;
        }
        return ntransactioncreate.onWarmupCompleted(this.IAuthTabCallbackStub);
    }

    /* renamed from: o.nSetZOrder$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallback;
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[GlanceAppWidgetReceiver.onWarmupCompleted.values().length];
            onExtraCallback = iArr;
            try {
                iArr[GlanceAppWidgetReceiver.onWarmupCompleted.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[GlanceAppWidgetReceiver.onWarmupCompleted.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[GlanceAppWidgetReceiver.onWarmupCompleted.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[GlanceAppWidgetReceiver.onWarmupCompleted.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Fragment.IAuthTabCallback.values().length];
            onWarmupCompleted = iArr2;
            try {
                iArr2[Fragment.IAuthTabCallback.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[Fragment.IAuthTabCallback.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[Fragment.IAuthTabCallback.PROPERTIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[Fragment.IAuthTabCallback.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void onWarmupCompleted(nTransactionDelete ntransactiondelete, List<nTransactionCreate> list, nTransactionCreate ntransactioncreate) {
        List<nTransactionCreate> listOnNavigationEvent = onNavigationEvent(list);
        if (ntransactioncreate != null && listOnNavigationEvent.contains(ntransactioncreate)) {
            ntransactiondelete.onWarmupCompleted(this.IAuthTabCallbackStub, ntransactioncreate, "implicit");
            return;
        }
        Iterator<nTransactionCreate> it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            ntransactiondelete.onWarmupCompleted(this.IAuthTabCallbackStub, it.next(), "implicit");
        }
    }

    private List<nTransactionCreate> onNavigationEvent(List<nTransactionCreate> list) {
        Iterator<nTransactionCreate> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            nTransactionCreate next = it.next();
            next.onNavigationEvent(this.IAuthTabCallbackStub);
            if (next.onExtraCallbackWithResult()) {
                it.remove();
                if (arrayList == null) {
                    arrayList = new ArrayList(4);
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    private boolean onExtraCallback(nTransactionDelete ntransactiondelete, List<nTransactionCreate> list, Map<String, nTransactionApply> map) {
        String strIAuthTabCallback;
        nTransactionApply ntransactionapply;
        if (list.size() != 1) {
            return false;
        }
        nTransactionCreate ntransactioncreate = list.get(0);
        if (!this.onMinimized.onExtraCallback(ntransactioncreate.onWarmupCompleted())) {
            return false;
        }
        ntransactioncreate.onNavigationEvent(this.IAuthTabCallbackStub);
        if (ntransactioncreate.onTransact() != 1) {
            if (!ntransactioncreate.onWarmupCompleted(this.IAuthTabCallbackStub)) {
                return false;
            }
        } else {
            startActivityFromFragment startactivityfromfragment = this.onNavigationEvent;
            if (startactivityfromfragment == null || startactivityfromfragment.onExtraCallbackWithResult((nCreate) ntransactioncreate.onWarmupCompleted(0)) == null) {
                GlanceAppWidgetReceiver glanceAppWidgetReceiverOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
                if (glanceAppWidgetReceiverOnWarmupCompleted.IAuthTabCallback() || (strIAuthTabCallback = ntransactioncreate.IAuthTabCallback(0)) == null) {
                    return false;
                }
                if (!glanceAppWidgetReceiverOnWarmupCompleted.onExtraCallback() && ((ntransactionapply = map.get(strIAuthTabCallback)) == null || !ntransactionapply.onUnminimized() || ntransactionapply.ICustomTabsCallbackDefault())) {
                    return false;
                }
            }
        }
        list.remove(0);
        ntransactiondelete.onWarmupCompleted(this.IAuthTabCallbackStub, ntransactioncreate, "implicit");
        return true;
    }

    private void onExtraCallback(Map<String, nTransactionApply> map, nTransactionCreate ntransactioncreate, List<nTransactionApply> list) {
        nTransactionApply ntransactionapply;
        int iOnTransact = ntransactioncreate.onTransact();
        for (int i2 = 0; i2 < iOnTransact; i2++) {
            nDupFenceFd ndupfencefdOnWarmupCompleted = ntransactioncreate.onWarmupCompleted(i2);
            FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnNavigationEvent = ntransactioncreate.onNavigationEvent(i2);
            FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = ntransactioncreate.onExtraCallbackWithResult(i2);
            boolean z = fragmentKtExternalSyntheticLambda0OnNavigationEvent != null;
            if (z || fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                if (fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                    fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(onExtraCallback(fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult()));
                }
                nTransactionApply ntransactionapplyIAuthTabCallback = fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult == null ? IAuthTabCallback(map, fragmentKtExternalSyntheticLambda0OnNavigationEvent) : IAuthTabCallback(map, fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                if (z) {
                    fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = fragmentKtExternalSyntheticLambda0OnNavigationEvent;
                }
                ntransactionapply = ntransactionapplyIAuthTabCallback;
                ntransactionapply.IAuthTabCallback(ndupfencefdOnWarmupCompleted, fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult, z, true, false);
            } else {
                ntransactionapply = null;
            }
            list.add(ntransactionapply);
        }
        ntransactioncreate.onNavigationEvent(list);
    }

    protected void onWarmupCompleted(Map<String, nTransactionApply> map) {
        for (nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd : this.asBinder.access000()) {
            int iAccess100 = ngetpreviousreleasefencefd.access100();
            if (iAccess100 == 0) {
                onWarmupCompleted(map, ngetpreviousreleasefencefd, this.onNavigationEvent);
            } else if (iAccess100 == 1) {
                onNavigationEvent(map, ngetpreviousreleasefencefd, this.onNavigationEvent);
            } else if (iAccess100 == 2 && Boolean.TRUE.equals(this.onNavigationEvent.ICustomTabsCallbackStubProxy(ngetpreviousreleasefencefd))) {
                if (this.IAuthTabCallbackDefault == null) {
                    this.IAuthTabCallbackDefault = new LinkedList<>();
                }
                this.IAuthTabCallbackDefault.add(ngetpreviousreleasefencefd);
            }
        }
    }

    protected void onWarmupCompleted(Map<String, nTransactionApply> map, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, startActivityFromFragment startactivityfromfragment) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0;
        boolean z;
        boolean z2;
        String strOnExtraCallback;
        boolean zOnExtraCallback;
        Class clsWriteTypedObject = ngetpreviousreleasefencefd.writeTypedObject();
        if (clsWriteTypedObject != Void.TYPE) {
            if (clsWriteTypedObject != Void.class || this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(startactivityfromfragment.onUnminimized(ngetpreviousreleasefencefd))) {
                    if (this.onWarmupCompleted == null) {
                        this.onWarmupCompleted = new LinkedList<>();
                    }
                    this.onWarmupCompleted.add(ngetpreviousreleasefencefd);
                    return;
                }
                if (bool.equals(startactivityfromfragment.onExtraCallbackWithResult(this.IAuthTabCallbackStub, (internalPathIteratorPeek) ngetpreviousreleasefencefd))) {
                    if (this.ICustomTabsCallback == null) {
                        this.ICustomTabsCallback = new LinkedList<>();
                    }
                    this.ICustomTabsCallback.add(ngetpreviousreleasefencefd);
                    return;
                }
                if (bool.equals(startactivityfromfragment.ICustomTabsService(ngetpreviousreleasefencefd))) {
                    if (this.readTypedObject == null) {
                        this.readTypedObject = new LinkedList<>();
                    }
                    this.readTypedObject.add(ngetpreviousreleasefencefd);
                    return;
                }
                FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0IAuthTabCallbackStubProxy = startactivityfromfragment.IAuthTabCallbackStubProxy(ngetpreviousreleasefencefd);
                boolean z3 = false;
                boolean z4 = fragmentKtExternalSyntheticLambda0IAuthTabCallbackStubProxy != null;
                if (!z4) {
                    strOnExtraCallback = startactivityfromfragment.onExtraCallback((nCreate) ngetpreviousreleasefencefd);
                    if (strOnExtraCallback == null) {
                        strOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(ngetpreviousreleasefencefd, ngetpreviousreleasefencefd.onExtraCallback());
                    }
                    if (strOnExtraCallback == null) {
                        strOnExtraCallback = this.onExtraCallbackWithResult.IAuthTabCallback(ngetpreviousreleasefencefd, ngetpreviousreleasefencefd.onExtraCallback());
                        if (strOnExtraCallback == null) {
                            return;
                        } else {
                            zOnExtraCallback = this.onMinimized.onExtraCallbackWithResult(ngetpreviousreleasefencefd);
                        }
                    } else {
                        zOnExtraCallback = this.onMinimized.onExtraCallback(ngetpreviousreleasefencefd);
                    }
                    fragmentKtExternalSyntheticLambda0 = fragmentKtExternalSyntheticLambda0IAuthTabCallbackStubProxy;
                    z = zOnExtraCallback;
                    z2 = z4;
                } else {
                    String strOnExtraCallback2 = startactivityfromfragment.onExtraCallback((nCreate) ngetpreviousreleasefencefd);
                    if (strOnExtraCallback2 == null && (strOnExtraCallback2 = this.onExtraCallbackWithResult.onExtraCallback(ngetpreviousreleasefencefd, ngetpreviousreleasefencefd.onExtraCallback())) == null) {
                        strOnExtraCallback2 = this.onExtraCallbackWithResult.IAuthTabCallback(ngetpreviousreleasefencefd, ngetpreviousreleasefencefd.onExtraCallback());
                    }
                    if (strOnExtraCallback2 == null) {
                        strOnExtraCallback2 = ngetpreviousreleasefencefd.onExtraCallback();
                    }
                    if (fragmentKtExternalSyntheticLambda0IAuthTabCallbackStubProxy.onExtraCallback()) {
                        fragmentKtExternalSyntheticLambda0IAuthTabCallbackStubProxy = IAuthTabCallback(strOnExtraCallback2);
                    } else {
                        z3 = z4;
                    }
                    fragmentKtExternalSyntheticLambda0 = fragmentKtExternalSyntheticLambda0IAuthTabCallbackStubProxy;
                    z = true;
                    z2 = z3;
                    strOnExtraCallback = strOnExtraCallback2;
                }
                IAuthTabCallback(map, onExtraCallback(strOnExtraCallback)).onExtraCallback(ngetpreviousreleasefencefd, fragmentKtExternalSyntheticLambda0, z2, z, startactivityfromfragment.onTransact((nCreate) ngetpreviousreleasefencefd));
            }
        }
    }

    protected void onNavigationEvent(Map<String, nTransactionApply> map, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, startActivityFromFragment startactivityfromfragment) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0;
        boolean zIAuthTabCallback;
        boolean z;
        String strOnExtraCallback;
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0AsBinder = startactivityfromfragment.asBinder((internalPathIteratorPeek) ngetpreviousreleasefencefd);
        boolean z2 = false;
        boolean z3 = fragmentKtExternalSyntheticLambda0AsBinder != null;
        if (!z3) {
            strOnExtraCallback = startactivityfromfragment.onExtraCallback((nCreate) ngetpreviousreleasefencefd);
            if (strOnExtraCallback == null) {
                strOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallbackWithResult(ngetpreviousreleasefencefd, ngetpreviousreleasefencefd.onExtraCallback());
            }
            if (strOnExtraCallback == null) {
                return;
            }
            fragmentKtExternalSyntheticLambda0 = fragmentKtExternalSyntheticLambda0AsBinder;
            z = false;
            zIAuthTabCallback = this.onMinimized.IAuthTabCallback(ngetpreviousreleasefencefd);
        } else {
            String strOnExtraCallback2 = startactivityfromfragment.onExtraCallback((nCreate) ngetpreviousreleasefencefd);
            if (strOnExtraCallback2 == null) {
                strOnExtraCallback2 = this.onExtraCallbackWithResult.onExtraCallbackWithResult(ngetpreviousreleasefencefd, ngetpreviousreleasefencefd.onExtraCallback());
            }
            if (strOnExtraCallback2 == null) {
                strOnExtraCallback2 = ngetpreviousreleasefencefd.onExtraCallback();
            }
            if (fragmentKtExternalSyntheticLambda0AsBinder.onExtraCallback()) {
                fragmentKtExternalSyntheticLambda0AsBinder = IAuthTabCallback(strOnExtraCallback2);
            } else {
                z2 = z3;
            }
            fragmentKtExternalSyntheticLambda0 = fragmentKtExternalSyntheticLambda0AsBinder;
            zIAuthTabCallback = true;
            z = z2;
            strOnExtraCallback = strOnExtraCallback2;
        }
        IAuthTabCallback(map, onExtraCallback(strOnExtraCallback)).onExtraCallbackWithResult(ngetpreviousreleasefencefd, fragmentKtExternalSyntheticLambda0, z, zIAuthTabCallback, startactivityfromfragment.onTransact((nCreate) ngetpreviousreleasefencefd));
    }

    protected void onExtraCallbackWithResult(Map<String, nTransactionApply> map) {
        Iterator<RoundedPolygonKt> it = this.asBinder.asInterface().iterator();
        while (it.hasNext()) {
            nCreate ncreate = (RoundedPolygonKt) it.next();
            onWarmupCompleted(this.onNavigationEvent.onExtraCallbackWithResult(ncreate), ncreate);
        }
        Iterator<nGetPreviousReleaseFenceFd> it2 = this.asBinder.access000().iterator();
        while (it2.hasNext()) {
            nCreate ncreate2 = (nGetPreviousReleaseFenceFd) it2.next();
            if (ncreate2.access100() == 1) {
                onWarmupCompleted(this.onNavigationEvent.onExtraCallbackWithResult(ncreate2), ncreate2);
            }
        }
    }

    protected void onWarmupCompleted(setShowsDialog.IAuthTabCallback iAuthTabCallback, nCreate ncreate) {
        if (iAuthTabCallback != null) {
            Object objOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            if (this.getInterfaceDescriptor == null) {
                this.getInterfaceDescriptor = new LinkedHashMap<>();
            }
            nCreate ncreatePut = this.getInterfaceDescriptor.put(objOnWarmupCompleted, ncreate);
            if (ncreatePut == null || ncreatePut.getClass() != ncreate.getClass()) {
                return;
            }
            onWarmupCompleted("Duplicate injectable value with id '%s' (of type %s)", objOnWarmupCompleted, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(objOnWarmupCompleted));
        }
    }

    private FragmentKtExternalSyntheticLambda0 IAuthTabCallback(String str) {
        return FragmentKtExternalSyntheticLambda0.onWarmupCompleted(str, null);
    }

    private String onExtraCallback(String str) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0;
        Map<FragmentKtExternalSyntheticLambda0, FragmentKtExternalSyntheticLambda0> map = this.IAuthTabCallbackStubProxy;
        return (map == null || (fragmentKtExternalSyntheticLambda0 = map.get(IAuthTabCallback(str))) == null) ? str : fragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult();
    }

    protected void onTransact(Map<String, nTransactionApply> map) {
        Iterator<nTransactionApply> it = map.values().iterator();
        while (it.hasNext()) {
            nTransactionApply next = it.next();
            if (!next.onUnminimized()) {
                it.remove();
            } else if (next.ICustomTabsCallbackDefault()) {
                if (ICustomTabsCallback() && !this.IAuthTabCallback_Parcel) {
                    next.newSessionWithExtras();
                    onNavigationEvent(next.onExtraCallbackWithResult());
                } else if (!next.ICustomTabsCallbackStub()) {
                    it.remove();
                    onNavigationEvent(next.onExtraCallbackWithResult());
                } else {
                    next.newSessionWithExtras();
                    if (!next.onWarmupCompleted()) {
                        onNavigationEvent(next.onExtraCallbackWithResult());
                    }
                }
            }
        }
    }

    protected void onNavigationEvent(Map<String, nTransactionApply> map) {
        boolean zOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.INFER_PROPERTY_MUTATORS);
        Iterator<nTransactionApply> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().onWarmupCompleted(zOnExtraCallback, this.IAuthTabCallback_Parcel ? null : this);
        }
    }

    protected void onNavigationEvent(String str) {
        if (this.IAuthTabCallback_Parcel || str == null) {
            return;
        }
        if (this.access000 == null) {
            this.access000 = new HashSet<>();
        }
        this.access000.add(str);
    }

    protected void asInterface(Map<String, nTransactionApply> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, nTransactionApply>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            nTransactionApply value = it.next().getValue();
            Set setIsEngagementSignalsApiAvailable = value.isEngagementSignalsApiAvailable();
            if (!setIsEngagementSignalsApiAvailable.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setIsEngagementSignalsApiAvailable.size() == 1) {
                    linkedList.add(value.onExtraCallbackWithResult((FragmentKtExternalSyntheticLambda0) setIsEngagementSignalsApiAvailable.iterator().next()));
                } else {
                    linkedList.addAll(value.onExtraCallbackWithResult(setIsEngagementSignalsApiAvailable));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                nTransactionApply ntransactionapply = (nTransactionApply) it2.next();
                String strOnExtraCallbackWithResult = ntransactionapply.onExtraCallbackWithResult();
                nTransactionApply ntransactionapply2 = map.get(strOnExtraCallbackWithResult);
                if (ntransactionapply2 == null) {
                    map.put(strOnExtraCallbackWithResult, ntransactionapply);
                } else {
                    ntransactionapply2.onNavigationEvent(ntransactionapply);
                }
                if (IAuthTabCallback(this.onTransact, ntransactionapply) && (hashSet = this.access000) != null) {
                    hashSet.remove(strOnExtraCallbackWithResult);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onExtraCallbackWithResult(Map<String, nTransactionApply> map, loadFragmentClass loadfragmentclass) {
        String strOnExtraCallbackWithResult;
        if (!this.onMessageChannelReady.onActivityLayout() || asInterface().onExtraCallback() == registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
            nTransactionApply[] ntransactionapplyArr = (nTransactionApply[]) map.values().toArray(new nTransactionApply[map.size()]);
            map.clear();
            for (nTransactionApply ntransactionapplyIAuthTabCallback : ntransactionapplyArr) {
                FragmentKtExternalSyntheticLambda0 interfaceDescriptor = ntransactionapplyIAuthTabCallback.getInterfaceDescriptor();
                if (!ntransactionapplyIAuthTabCallback.onRelationshipValidationResult() || this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                    if (this.IAuthTabCallback_Parcel) {
                        if (ntransactionapplyIAuthTabCallback.newAuthTabSession()) {
                            strOnExtraCallbackWithResult = loadfragmentclass.onExtraCallbackWithResult(this.IAuthTabCallbackStub, ntransactionapplyIAuthTabCallback.access100(), interfaceDescriptor.onExtraCallbackWithResult());
                        } else {
                            strOnExtraCallbackWithResult = ntransactionapplyIAuthTabCallback.onActivityLayout() ? loadfragmentclass.onExtraCallback(this.IAuthTabCallbackStub, ntransactionapplyIAuthTabCallback.IAuthTabCallbackStubProxy(), interfaceDescriptor.onExtraCallbackWithResult()) : null;
                        }
                    } else if (ntransactionapplyIAuthTabCallback.onMessageChannelReady()) {
                        strOnExtraCallbackWithResult = loadfragmentclass.onWarmupCompleted(this.IAuthTabCallbackStub, ntransactionapplyIAuthTabCallback.newSession(), interfaceDescriptor.onExtraCallbackWithResult());
                    } else if (ntransactionapplyIAuthTabCallback.onActivityResized()) {
                        strOnExtraCallbackWithResult = loadfragmentclass.IAuthTabCallback(this.IAuthTabCallbackStub, ntransactionapplyIAuthTabCallback.asInterface(), interfaceDescriptor.onExtraCallbackWithResult());
                    } else if (ntransactionapplyIAuthTabCallback.onActivityLayout()) {
                        strOnExtraCallbackWithResult = loadfragmentclass.onExtraCallback(this.IAuthTabCallbackStub, ntransactionapplyIAuthTabCallback.extraCommand(), interfaceDescriptor.onExtraCallbackWithResult());
                    } else if (ntransactionapplyIAuthTabCallback.newAuthTabSession()) {
                        strOnExtraCallbackWithResult = loadfragmentclass.onExtraCallbackWithResult(this.IAuthTabCallbackStub, ntransactionapplyIAuthTabCallback.ICustomTabsCallback_Parcel(), interfaceDescriptor.onExtraCallbackWithResult());
                    }
                }
                if (strOnExtraCallbackWithResult != null && !interfaceDescriptor.onWarmupCompleted(strOnExtraCallbackWithResult)) {
                    ntransactionapplyIAuthTabCallback = ntransactionapplyIAuthTabCallback.IAuthTabCallback(strOnExtraCallbackWithResult);
                } else {
                    strOnExtraCallbackWithResult = interfaceDescriptor.onExtraCallbackWithResult();
                }
                nTransactionApply ntransactionapply = map.get(strOnExtraCallbackWithResult);
                if (ntransactionapply == null) {
                    map.put(strOnExtraCallbackWithResult, ntransactionapplyIAuthTabCallback);
                } else {
                    ntransactionapply.onNavigationEvent(ntransactionapplyIAuthTabCallback);
                }
                IAuthTabCallback(this.onTransact, ntransactionapplyIAuthTabCallback);
            }
        }
    }

    protected void asBinder(Map<String, nTransactionApply> map) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault;
        Iterator<Map.Entry<String, nTransactionApply>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            nTransactionApply value = it.next().getValue();
            nCreate ncreateExtraCallback = value.extraCallback();
            if (ncreateExtraCallback != null && (fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault = this.onNavigationEvent.ICustomTabsCallbackDefault(ncreateExtraCallback)) != null && fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault.IAuthTabCallback() && !fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault.equals(value.getInterfaceDescriptor())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.onExtraCallbackWithResult(fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                nTransactionApply ntransactionapply = (nTransactionApply) it2.next();
                String strOnExtraCallbackWithResult = ntransactionapply.onExtraCallbackWithResult();
                nTransactionApply ntransactionapply2 = map.get(strOnExtraCallbackWithResult);
                if (ntransactionapply2 == null) {
                    map.put(strOnExtraCallbackWithResult, ntransactionapply);
                } else {
                    ntransactionapply2.onNavigationEvent(ntransactionapply);
                }
            }
        }
    }

    protected void IAuthTabCallbackDefault(Map<String, nTransactionApply> map) {
        boolean zBooleanValue;
        Map<? extends Object, ? extends Object> linkedHashMap;
        Collection<nTransactionApply> collectionValues;
        startActivityFromFragment startactivityfromfragment = this.onNavigationEvent;
        Boolean boolOnMessageChannelReady = startactivityfromfragment.onMessageChannelReady(this.asBinder);
        if (boolOnMessageChannelReady == null) {
            zBooleanValue = this.IAuthTabCallbackStub.onActivityLayout();
        } else {
            zBooleanValue = boolOnMessageChannelReady.booleanValue();
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(map.values());
        String[] strArrOnExtraCallbackWithResult = startactivityfromfragment.onExtraCallbackWithResult(this.asBinder);
        if (zBooleanValue || zOnExtraCallbackWithResult || this.onTransact != null || strArrOnExtraCallbackWithResult != null) {
            int size = map.size();
            if (zBooleanValue) {
                linkedHashMap = new TreeMap<>();
            } else {
                linkedHashMap = new LinkedHashMap<>(size + size);
            }
            for (nTransactionApply ntransactionapply : map.values()) {
                linkedHashMap.put(ntransactionapply.onExtraCallbackWithResult(), ntransactionapply);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(size + size);
            if (strArrOnExtraCallbackWithResult != null) {
                for (String strOnExtraCallbackWithResult : strArrOnExtraCallbackWithResult) {
                    nTransactionApply ntransactionapplyRemove = linkedHashMap.remove(strOnExtraCallbackWithResult);
                    if (ntransactionapplyRemove == null) {
                        Iterator<nTransactionApply> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            nTransactionApply next = it.next();
                            if (strOnExtraCallbackWithResult.equals(next.ICustomTabsService())) {
                                strOnExtraCallbackWithResult = next.onExtraCallbackWithResult();
                                ntransactionapplyRemove = next;
                                break;
                            }
                        }
                    }
                    if (ntransactionapplyRemove != null) {
                        linkedHashMap2.put(strOnExtraCallbackWithResult, ntransactionapplyRemove);
                    }
                }
            }
            if (zOnExtraCallbackWithResult) {
                TreeMap treeMap = new TreeMap();
                Iterator<Map.Entry<? extends Object, ? extends Object>> it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    nTransactionApply value = it2.next().getValue();
                    Integer numOnExtraCallback = value.IAuthTabCallback_Parcel().onExtraCallback();
                    if (numOnExtraCallback != null) {
                        treeMap.put(numOnExtraCallback, value);
                        it2.remove();
                    }
                }
                for (nTransactionApply ntransactionapply2 : treeMap.values()) {
                    linkedHashMap2.put(ntransactionapply2.onExtraCallbackWithResult(), ntransactionapply2);
                }
            }
            if (this.onTransact != null && (!zBooleanValue || this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zBooleanValue && !this.IAuthTabCallbackStub.onExtraCallback(setLayoutTransition.SORT_CREATOR_PROPERTIES_BY_DECLARATION_ORDER)) {
                    TreeMap treeMap2 = new TreeMap();
                    for (nTransactionApply ntransactionapply3 : this.onTransact) {
                        if (ntransactionapply3 != null) {
                            treeMap2.put(ntransactionapply3.onExtraCallbackWithResult(), ntransactionapply3);
                        }
                    }
                    collectionValues = treeMap2.values();
                } else {
                    collectionValues = this.onTransact;
                }
                for (nTransactionApply ntransactionapply4 : collectionValues) {
                    if (ntransactionapply4 != null) {
                        String strOnExtraCallbackWithResult2 = ntransactionapply4.onExtraCallbackWithResult();
                        if (linkedHashMap.containsKey(strOnExtraCallbackWithResult2)) {
                            linkedHashMap2.put(strOnExtraCallbackWithResult2, ntransactionapply4);
                        }
                    }
                }
            }
            linkedHashMap2.putAll(linkedHashMap);
            map.clear();
            map.putAll(linkedHashMap2);
        }
    }

    private boolean onExtraCallbackWithResult(Collection<nTransactionApply> collection) {
        Iterator<nTransactionApply> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().IAuthTabCallback_Parcel().onWarmupCompleted()) {
                return true;
            }
        }
        return false;
    }

    protected boolean onWarmupCompleted(List<nCreate> list) {
        do {
            nCreate ncreate = list.get(0);
            nCreate ncreate2 = list.get(1);
            if (ncreate instanceof RoundedPolygonKt) {
                if (!(ncreate2 instanceof nGetPreviousReleaseFenceFd)) {
                    return false;
                }
                list.remove(0);
            } else {
                if (!(ncreate instanceof nGetPreviousReleaseFenceFd) || !(ncreate2 instanceof RoundedPolygonKt)) {
                    return false;
                }
                list.remove(1);
            }
        } while (list.size() > 1);
        return true;
    }

    protected void onWarmupCompleted(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.asBinder + ": " + str);
    }

    protected nTransactionApply IAuthTabCallback(Map<String, nTransactionApply> map, FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0) {
        String strOnExtraCallbackWithResult = fragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult();
        nTransactionApply ntransactionapply = map.get(strOnExtraCallbackWithResult);
        if (ntransactionapply != null) {
            return ntransactionapply;
        }
        nTransactionApply ntransactionapply2 = new nTransactionApply(this.IAuthTabCallbackStub, this.onNavigationEvent, this.IAuthTabCallback_Parcel, fragmentKtExternalSyntheticLambda0);
        map.put(strOnExtraCallbackWithResult, ntransactionapply2);
        return ntransactionapply2;
    }

    protected nTransactionApply IAuthTabCallback(Map<String, nTransactionApply> map, String str) {
        nTransactionApply ntransactionapply = map.get(str);
        if (ntransactionapply != null) {
            return ntransactionapply;
        }
        nTransactionApply ntransactionapply2 = new nTransactionApply(this.IAuthTabCallbackStub, this.onNavigationEvent, this.IAuthTabCallback_Parcel, FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(str));
        map.put(str, ntransactionapply2);
        return ntransactionapply2;
    }

    private loadFragmentClass writeTypedObject() {
        loadFragmentClass loadfragmentclassIAuthTabCallback;
        Object objOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(this.asBinder);
        if (objOnWarmupCompleted == null) {
            return this.IAuthTabCallbackStub.readTypedObject();
        }
        if (objOnWarmupCompleted instanceof loadFragmentClass) {
            return (loadFragmentClass) objOnWarmupCompleted;
        }
        if (!(objOnWarmupCompleted instanceof Class)) {
            onWarmupCompleted("AnnotationIntrospector returned PropertyNamingStrategy definition of type %s; expected type `PropertyNamingStrategy` or `Class<PropertyNamingStrategy>` instead", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(objOnWarmupCompleted));
        }
        Class<?> cls = (Class) objOnWarmupCompleted;
        if (cls == loadFragmentClass.class) {
            return null;
        }
        if (!loadFragmentClass.class.isAssignableFrom(cls)) {
            onWarmupCompleted("AnnotationIntrospector returned Class %s; expected `Class<PropertyNamingStrategy>`", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls));
        }
        RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = this.IAuthTabCallbackStub.access000();
        return (radioButtonKtRadioButtonElement24Access000 == null || (loadfragmentclassIAuthTabCallback = radioButtonKtRadioButtonElement24Access000.IAuthTabCallback(this.IAuthTabCallbackStub, this.asBinder, cls)) == null) ? (loadFragmentClass) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, this.IAuthTabCallbackStub.asInterface()) : loadfragmentclassIAuthTabCallback;
    }

    protected boolean IAuthTabCallback(List<nTransactionApply> list, nTransactionApply ntransactionapply) {
        nDupFenceFd ndupfencefdAsInterface = ntransactionapply.asInterface();
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                nTransactionApply ntransactionapply2 = list.get(i2);
                if (ntransactionapply2 != null && ntransactionapply2.asInterface() == ndupfencefdAsInterface) {
                    list.set(i2, ntransactionapply);
                    return true;
                }
            }
        }
        return false;
    }
}
