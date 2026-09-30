package o;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.SaversKtExternalSyntheticLambda56;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda52<Transcode> {
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private Class<?> IAuthTabCallbackStubProxy;
    private Object IAuthTabCallback_Parcel;
    private SaversKtExternalSyntheticLambda11 access000;
    private SaversKtExternalSyntheticLambda26 access100;
    private boolean asInterface;
    private int extraCallback;
    private Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> extraCallbackWithResult;
    private SaversKtExternalSyntheticLambda30 getInterfaceDescriptor;
    private SaversKtExternalSyntheticLambda56.onExtraCallback onExtraCallback;
    private SaversKtExternalSyntheticLambda58 onExtraCallbackWithResult;
    private SaversKtExternalSyntheticLambda10 onNavigationEvent;
    private boolean onTransact;
    private int onWarmupCompleted;
    private Class<Transcode> writeTypedObject;
    private final List<ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?>> asBinder = new ArrayList();
    private final List<SaversKtExternalSyntheticLambda26> IAuthTabCallback = new ArrayList();

    SaversKtExternalSyntheticLambda52() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void onWarmupCompleted(SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, Object obj, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, int i2, int i3, SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58, Class<?> cls, Class<R> cls2, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> map, boolean z, boolean z2, SaversKtExternalSyntheticLambda56.onExtraCallback onextracallback) {
        this.onNavigationEvent = saversKtExternalSyntheticLambda10;
        this.IAuthTabCallback_Parcel = obj;
        this.access100 = saversKtExternalSyntheticLambda26;
        this.extraCallback = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallbackWithResult = saversKtExternalSyntheticLambda58;
        this.IAuthTabCallbackStubProxy = cls;
        this.onExtraCallback = onextracallback;
        this.writeTypedObject = cls2;
        this.access000 = saversKtExternalSyntheticLambda11;
        this.getInterfaceDescriptor = saversKtExternalSyntheticLambda30;
        this.extraCallbackWithResult = map;
        this.IAuthTabCallbackDefault = z;
        this.asInterface = z2;
    }

    void onExtraCallback() {
        this.onNavigationEvent = null;
        this.IAuthTabCallback_Parcel = null;
        this.access100 = null;
        this.IAuthTabCallbackStubProxy = null;
        this.writeTypedObject = null;
        this.getInterfaceDescriptor = null;
        this.access000 = null;
        this.extraCallbackWithResult = null;
        this.onExtraCallbackWithResult = null;
        this.asBinder.clear();
        this.onTransact = false;
        this.IAuthTabCallback.clear();
        this.IAuthTabCallbackStub = false;
    }

    public LayoutIntrinsics_androidKtExternalSyntheticLambda0 onWarmupCompleted() {
        return this.onExtraCallback.onExtraCallback();
    }

    SaversKtExternalSyntheticLambda58 IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    <T> SaversKtExternalSyntheticLambda33<T> onWarmupCompleted(T t) {
        return this.onNavigationEvent.asBinder().onExtraCallbackWithResult(t);
    }

    public SaversKtExternalSyntheticLambda11 IAuthTabCallbackDefault() {
        return this.access000;
    }

    public SaversKtExternalSyntheticLambda30 onTransact() {
        return this.getInterfaceDescriptor;
    }

    public SaversKtExternalSyntheticLambda26 access100() {
        return this.access100;
    }

    public int access000() {
        return this.extraCallback;
    }

    public int IAuthTabCallbackStub() {
        return this.onWarmupCompleted;
    }

    public Savers_androidKtExternalSyntheticLambda6 onExtraCallbackWithResult() {
        return this.onNavigationEvent.onWarmupCompleted();
    }

    public Class<?> IAuthTabCallback_Parcel() {
        return this.writeTypedObject;
    }

    public Class<?> asBinder() {
        return this.IAuthTabCallback_Parcel.getClass();
    }

    public List<Class<?>> getInterfaceDescriptor() {
        return this.onNavigationEvent.asBinder().onExtraCallback(this.IAuthTabCallback_Parcel.getClass(), this.IAuthTabCallbackStubProxy, this.writeTypedObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onExtraCallbackWithResult(Class<?> cls) {
        return onNavigationEvent(cls) != null;
    }

    <Data> Savers_androidKtExternalSyntheticLambda2<Data, ?, Transcode> onNavigationEvent(Class<Data> cls) {
        return this.onNavigationEvent.asBinder().onNavigationEvent(cls, this.IAuthTabCallbackStubProxy, this.writeTypedObject);
    }

    boolean IAuthTabCallbackStubProxy() {
        return this.asInterface;
    }

    public <Z> SaversKtExternalSyntheticLambda29<Z> onWarmupCompleted(Class<Z> cls) {
        SaversKtExternalSyntheticLambda29<Z> saversKtExternalSyntheticLambda29 = (SaversKtExternalSyntheticLambda29) this.extraCallbackWithResult.get(cls);
        if (saversKtExternalSyntheticLambda29 == null) {
            Iterator<Map.Entry<Class<?>, SaversKtExternalSyntheticLambda29<?>>> it = this.extraCallbackWithResult.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, SaversKtExternalSyntheticLambda29<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    saversKtExternalSyntheticLambda29 = (SaversKtExternalSyntheticLambda29) next.getValue();
                    break;
                }
            }
        }
        if (saversKtExternalSyntheticLambda29 != null) {
            return saversKtExternalSyntheticLambda29;
        }
        if (this.extraCallbackWithResult.isEmpty() && this.IAuthTabCallbackDefault) {
            throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        }
        return AndroidViewHolder.onWarmupCompleted();
    }

    boolean onExtraCallbackWithResult(Resource<?> resource) {
        return this.onNavigationEvent.asBinder().onExtraCallback(resource);
    }

    <Z> ResourceEncoder<Z> onExtraCallback(Resource<Z> resource) {
        return this.onNavigationEvent.asBinder().onWarmupCompleted(resource);
    }

    public List<ShaderBrushSpanExternalSyntheticLambda0<File, ?>> onExtraCallbackWithResult(File file) throws Registry.NoModelLoaderAvailableException {
        return this.onNavigationEvent.asBinder().onNavigationEvent((com.bumptech.glide.Registry) file);
    }

    boolean onExtraCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        List<ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?>> listAsInterface = asInterface();
        int size = listAsInterface.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (listAsInterface.get(i2).IAuthTabCallback.equals(saversKtExternalSyntheticLambda26)) {
                return true;
            }
        }
        return false;
    }

    List<ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?>> asInterface() {
        if (!this.onTransact) {
            this.onTransact = true;
            this.asBinder.clear();
            List listOnNavigationEvent = this.onNavigationEvent.asBinder().onNavigationEvent((com.bumptech.glide.Registry) this.IAuthTabCallback_Parcel);
            int size = listOnNavigationEvent.size();
            for (int i2 = 0; i2 < size; i2++) {
                ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresultOnNavigationEvent = ((ShaderBrushSpanExternalSyntheticLambda0) listOnNavigationEvent.get(i2)).onNavigationEvent(this.IAuthTabCallback_Parcel, this.extraCallback, this.onWarmupCompleted, this.getInterfaceDescriptor);
                if (onextracallbackwithresultOnNavigationEvent != null) {
                    this.asBinder.add(onextracallbackwithresultOnNavigationEvent);
                }
            }
        }
        return this.asBinder;
    }

    public List<SaversKtExternalSyntheticLambda26> onNavigationEvent() {
        if (!this.IAuthTabCallbackStub) {
            this.IAuthTabCallbackStub = true;
            this.IAuthTabCallback.clear();
            List<ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?>> listAsInterface = asInterface();
            int size = listAsInterface.size();
            for (int i2 = 0; i2 < size; i2++) {
                ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult = listAsInterface.get(i2);
                if (!this.IAuthTabCallback.contains(onextracallbackwithresult.IAuthTabCallback)) {
                    this.IAuthTabCallback.add(onextracallbackwithresult.IAuthTabCallback);
                }
                for (int i3 = 0; i3 < onextracallbackwithresult.onWarmupCompleted.size(); i3++) {
                    if (!this.IAuthTabCallback.contains(onextracallbackwithresult.onWarmupCompleted.get(i3))) {
                        this.IAuthTabCallback.add(onextracallbackwithresult.onWarmupCompleted.get(i3));
                    }
                }
            }
        }
        return this.IAuthTabCallback;
    }

    <X> SaversKtExternalSyntheticLambda24<X> IAuthTabCallback(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.onNavigationEvent.asBinder().onExtraCallback((com.bumptech.glide.Registry) x);
    }
}
