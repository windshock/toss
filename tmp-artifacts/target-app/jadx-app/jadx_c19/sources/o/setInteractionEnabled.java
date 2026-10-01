package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.ResourceCallback;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.MultiParagraphIntrinsicsExternalSyntheticLambda1;
import o.SaversKtExternalSyntheticLambda57;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setInteractionEnabled<R> implements Request, setTransitionListener, ResourceCallback {
    private static final boolean onNavigationEvent = Log.isLoggable("GlideRequest", 2);
    private final Executor IAuthTabCallback;
    private Drawable IAuthTabCallbackDefault;
    private volatile SaversKtExternalSyntheticLambda57 IAuthTabCallbackStub;
    private final Object IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private final Object ICustomTabsCallback;
    private final RequestListener<R> ICustomTabsCallbackDefault;
    private final String ICustomTabsCallbackStub;
    private final Class<R> ICustomTabsCallbackStubProxy;
    private boolean access000;
    private final int access100;
    private Drawable asBinder;
    private final SaversKtExternalSyntheticLambda10 asInterface;
    private Drawable extraCallback;
    private final RequestCoordinator extraCallbackWithResult;
    private SaversKtExternalSyntheticLambda57.IAuthTabCallback getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private final setTranslationX<?> onActivityLayout;
    private Resource<R> onActivityResized;
    private final Context onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onMessageChannelReady;
    private RuntimeException onMinimized;
    private final dispatchDraw onPostMessage;
    private onExtraCallback onRelationshipValidationResult;
    private int onTransact;
    private final setTransitionDuration<R> onUnminimized;
    private final setAllowsGoneWidget<? super R> onWarmupCompleted;
    private final SaversKtExternalSyntheticLambda11 readTypedObject;
    private final List<RequestListener<R>> writeTypedObject;

    enum onExtraCallback {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public static <R> setInteractionEnabled<R> onWarmupCompleted(Context context, SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, Object obj, Object obj2, Class<R> cls, setTranslationX<?> settranslationx, int i2, int i3, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, setTransitionDuration<R> settransitionduration, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, SaversKtExternalSyntheticLambda57 saversKtExternalSyntheticLambda57, setAllowsGoneWidget<? super R> setallowsgonewidget, Executor executor) {
        return new setInteractionEnabled<>(context, saversKtExternalSyntheticLambda10, obj, obj2, cls, settranslationx, i2, i3, saversKtExternalSyntheticLambda11, settransitionduration, requestListener, list, requestCoordinator, saversKtExternalSyntheticLambda57, setallowsgonewidget, executor);
    }

    private setInteractionEnabled(Context context, SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, setTranslationX<?> settranslationx, int i2, int i3, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, setTransitionDuration<R> settransitionduration, @Nullable RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, SaversKtExternalSyntheticLambda57 saversKtExternalSyntheticLambda57, setAllowsGoneWidget<? super R> setallowsgonewidget, Executor executor) {
        this.ICustomTabsCallbackStub = onNavigationEvent ? String.valueOf(super.hashCode()) : null;
        this.onPostMessage = dispatchDraw.onWarmupCompleted();
        this.ICustomTabsCallback = obj;
        this.onExtraCallback = context;
        this.asInterface = saversKtExternalSyntheticLambda10;
        this.IAuthTabCallbackStubProxy = obj2;
        this.ICustomTabsCallbackStubProxy = cls;
        this.onActivityLayout = settranslationx;
        this.access100 = i2;
        this.IAuthTabCallback_Parcel = i3;
        this.readTypedObject = saversKtExternalSyntheticLambda11;
        this.onUnminimized = settransitionduration;
        this.ICustomTabsCallbackDefault = requestListener;
        this.writeTypedObject = list;
        this.extraCallbackWithResult = requestCoordinator;
        this.IAuthTabCallbackStub = saversKtExternalSyntheticLambda57;
        this.onWarmupCompleted = setallowsgonewidget;
        this.IAuthTabCallback = executor;
        this.onRelationshipValidationResult = onExtraCallback.PENDING;
        if (this.onMinimized == null && saversKtExternalSyntheticLambda10.onExtraCallback().onWarmupCompleted(MultiParagraphIntrinsicsExternalSyntheticLambda1.IAuthTabCallback.class)) {
            this.onMinimized = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void onNavigationEvent() {
        synchronized (this.ICustomTabsCallback) {
            IAuthTabCallbackDefault();
            this.onPostMessage.onExtraCallback();
            this.onMessageChannelReady = getSharedValues.IAuthTabCallback();
            Object obj = this.IAuthTabCallbackStubProxy;
            if (obj == null) {
                if (applyConstraintsFromLayoutParams.onExtraCallback(this.access100, this.IAuthTabCallback_Parcel)) {
                    this.isEngagementSignalsApiAvailable = this.access100;
                    this.onTransact = this.IAuthTabCallback_Parcel;
                }
                onExtraCallback(new SaversKtExternalSyntheticLambda7("Received null model"), getInterfaceDescriptor() == null ? 5 : 3);
                return;
            }
            onExtraCallback onextracallback = this.onRelationshipValidationResult;
            onExtraCallback onextracallback2 = onExtraCallback.RUNNING;
            if (onextracallback == onextracallback2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (onextracallback == onExtraCallback.COMPLETE) {
                IAuthTabCallback(this.onActivityResized, SaversKtExternalSyntheticLambda21.MEMORY_CACHE, false);
                return;
            }
            IAuthTabCallback(obj);
            this.onExtraCallbackWithResult = updateHierarchy.onWarmupCompleted("GlideRequest");
            onExtraCallback onextracallback3 = onExtraCallback.WAITING_FOR_SIZE;
            this.onRelationshipValidationResult = onextracallback3;
            if (applyConstraintsFromLayoutParams.onExtraCallback(this.access100, this.IAuthTabCallback_Parcel)) {
                onNavigationEvent(this.access100, this.IAuthTabCallback_Parcel);
            } else {
                this.onUnminimized.getSize(this);
            }
            onExtraCallback onextracallback4 = this.onRelationshipValidationResult;
            if ((onextracallback4 == onextracallback2 || onextracallback4 == onextracallback3) && access000()) {
                this.onUnminimized.onLoadStarted(ICustomTabsCallback());
            }
            if (onNavigationEvent) {
                getSharedValues.onWarmupCompleted(this.onMessageChannelReady);
            }
        }
    }

    private void IAuthTabCallback(Object obj) {
        List<RequestListener<R>> list = this.writeTypedObject;
        if (list != null) {
            for (RequestListener<R> requestListener : list) {
                if (requestListener instanceof MotionHelper) {
                }
            }
        }
    }

    private void IAuthTabCallbackStubProxy() {
        IAuthTabCallbackDefault();
        this.onPostMessage.onExtraCallback();
        this.onUnminimized.removeCallback(this);
        SaversKtExternalSyntheticLambda57.IAuthTabCallback iAuthTabCallback = this.getInterfaceDescriptor;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.IAuthTabCallback();
            this.getInterfaceDescriptor = null;
        }
    }

    private void IAuthTabCallbackDefault() {
        if (this.access000) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void onExtraCallbackWithResult() {
        synchronized (this.ICustomTabsCallback) {
            IAuthTabCallbackDefault();
            this.onPostMessage.onExtraCallback();
            onExtraCallback onextracallback = this.onRelationshipValidationResult;
            onExtraCallback onextracallback2 = onExtraCallback.CLEARED;
            if (onextracallback == onextracallback2) {
                return;
            }
            IAuthTabCallbackStubProxy();
            Resource<R> resource = this.onActivityResized;
            if (resource != null) {
                this.onActivityResized = null;
            } else {
                resource = null;
            }
            if (onTransact()) {
                this.onUnminimized.onLoadCleared(ICustomTabsCallback());
            }
            this.onRelationshipValidationResult = onextracallback2;
            if (resource != null) {
                this.IAuthTabCallbackStub.IAuthTabCallback((Resource<?>) resource);
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void asInterface() {
        synchronized (this.ICustomTabsCallback) {
            if (IAuthTabCallbackStub()) {
                onExtraCallbackWithResult();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    @Override // com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallbackStub() {
        boolean z;
        synchronized (this.ICustomTabsCallback) {
            onExtraCallback onextracallback = this.onRelationshipValidationResult;
            if (onextracallback != onExtraCallback.RUNNING) {
                z = onextracallback == onExtraCallback.WAITING_FOR_SIZE;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean asBinder() {
        boolean z;
        synchronized (this.ICustomTabsCallback) {
            z = this.onRelationshipValidationResult == onExtraCallback.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean onExtraCallback() {
        boolean z;
        synchronized (this.ICustomTabsCallback) {
            z = this.onRelationshipValidationResult == onExtraCallback.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean onWarmupCompleted() {
        boolean z;
        synchronized (this.ICustomTabsCallback) {
            z = this.onRelationshipValidationResult == onExtraCallback.COMPLETE;
        }
        return z;
    }

    private Drawable access100() {
        if (this.IAuthTabCallbackDefault == null) {
            Drawable drawableAsBinder = this.onActivityLayout.asBinder();
            this.IAuthTabCallbackDefault = drawableAsBinder;
            if (drawableAsBinder == null && this.onActivityLayout.asInterface() > 0) {
                this.IAuthTabCallbackDefault = onWarmupCompleted(this.onActivityLayout.asInterface());
            }
        }
        return this.IAuthTabCallbackDefault;
    }

    private Drawable ICustomTabsCallback() {
        if (this.extraCallback == null) {
            Drawable drawableIAuthTabCallback_Parcel = this.onActivityLayout.IAuthTabCallback_Parcel();
            this.extraCallback = drawableIAuthTabCallback_Parcel;
            if (drawableIAuthTabCallback_Parcel == null && this.onActivityLayout.IAuthTabCallbackStubProxy() > 0) {
                this.extraCallback = onWarmupCompleted(this.onActivityLayout.IAuthTabCallbackStubProxy());
            }
        }
        return this.extraCallback;
    }

    private Drawable getInterfaceDescriptor() {
        if (this.asBinder == null) {
            Drawable drawableIAuthTabCallbackStub = this.onActivityLayout.IAuthTabCallbackStub();
            this.asBinder = drawableIAuthTabCallbackStub;
            if (drawableIAuthTabCallbackStub == null && this.onActivityLayout.IAuthTabCallbackDefault() > 0) {
                this.asBinder = onWarmupCompleted(this.onActivityLayout.IAuthTabCallbackDefault());
            }
        }
        return this.asBinder;
    }

    private Drawable onWarmupCompleted(int i2) {
        return Reference.onWarmupCompleted(this.asInterface, i2, this.onActivityLayout.readTypedObject() != null ? this.onActivityLayout.readTypedObject() : this.onExtraCallback.getTheme());
    }

    private void writeTypedObject() {
        if (access000()) {
            Drawable interfaceDescriptor = this.IAuthTabCallbackStubProxy == null ? getInterfaceDescriptor() : null;
            if (interfaceDescriptor == null) {
                interfaceDescriptor = access100();
            }
            if (interfaceDescriptor == null) {
                interfaceDescriptor = ICustomTabsCallback();
            }
            this.onUnminimized.onLoadFailed(interfaceDescriptor);
        }
    }

    @Override // o.setTransitionListener
    public void onNavigationEvent(int i2, int i3) throws Throwable {
        Object obj;
        this.onPostMessage.onExtraCallback();
        Object obj2 = this.ICustomTabsCallback;
        synchronized (obj2) {
            try {
                boolean z = onNavigationEvent;
                if (z) {
                    getSharedValues.onWarmupCompleted(this.onMessageChannelReady);
                }
                if (this.onRelationshipValidationResult == onExtraCallback.WAITING_FOR_SIZE) {
                    onExtraCallback onextracallback = onExtraCallback.RUNNING;
                    this.onRelationshipValidationResult = onextracallback;
                    float fExtraCallbackWithResult = this.onActivityLayout.extraCallbackWithResult();
                    this.isEngagementSignalsApiAvailable = onExtraCallback(i2, fExtraCallbackWithResult);
                    this.onTransact = onExtraCallback(i3, fExtraCallbackWithResult);
                    if (z) {
                        getSharedValues.onWarmupCompleted(this.onMessageChannelReady);
                    }
                    obj = obj2;
                    try {
                        try {
                            this.getInterfaceDescriptor = this.IAuthTabCallbackStub.IAuthTabCallback(this.asInterface, this.IAuthTabCallbackStubProxy, this.onActivityLayout.writeTypedObject(), this.isEngagementSignalsApiAvailable, this.onTransact, this.onActivityLayout.ICustomTabsCallback(), this.ICustomTabsCallbackStubProxy, this.readTypedObject, this.onActivityLayout.onExtraCallbackWithResult(), this.onActivityLayout.onActivityResized(), this.onActivityLayout.onUnminimized(), this.onActivityLayout.ICustomTabsCallbackStub(), this.onActivityLayout.getInterfaceDescriptor(), this.onActivityLayout.onMessageChannelReady(), this.onActivityLayout.onMinimized(), this.onActivityLayout.onActivityLayout(), this.onActivityLayout.onTransact(), this, this.IAuthTabCallback);
                            if (this.onRelationshipValidationResult != onextracallback) {
                                this.getInterfaceDescriptor = null;
                            }
                            if (z) {
                                getSharedValues.onWarmupCompleted(this.onMessageChannelReady);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    private static int onExtraCallback(int i2, float f) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
    }

    private boolean IAuthTabCallback_Parcel() {
        RequestCoordinator requestCoordinator = this.extraCallbackWithResult;
        return requestCoordinator == null || requestCoordinator.onWarmupCompleted(this);
    }

    private boolean onTransact() {
        RequestCoordinator requestCoordinator = this.extraCallbackWithResult;
        return requestCoordinator == null || requestCoordinator.IAuthTabCallback(this);
    }

    private boolean access000() {
        RequestCoordinator requestCoordinator = this.extraCallbackWithResult;
        return requestCoordinator == null || requestCoordinator.onExtraCallback(this);
    }

    private boolean readTypedObject() {
        RequestCoordinator requestCoordinator = this.extraCallbackWithResult;
        return requestCoordinator == null || !requestCoordinator.IAuthTabCallback().onWarmupCompleted();
    }

    private void extraCallback() {
        RequestCoordinator requestCoordinator = this.extraCallbackWithResult;
        if (requestCoordinator != null) {
            requestCoordinator.IAuthTabCallbackDefault(this);
        }
    }

    private void extraCallbackWithResult() {
        RequestCoordinator requestCoordinator = this.extraCallbackWithResult;
        if (requestCoordinator != null) {
            requestCoordinator.onNavigationEvent(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.ResourceCallback
    public void IAuthTabCallback(Resource<?> resource, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z) throws Throwable {
        Throwable th;
        String str;
        this.onPostMessage.onExtraCallback();
        Resource<?> resource2 = null;
        try {
            synchronized (this.ICustomTabsCallback) {
                try {
                    this.getInterfaceDescriptor = null;
                    if (resource == null) {
                        onNavigationEvent(new SaversKtExternalSyntheticLambda7("Expected to receive a Resource<R> with an object of " + this.ICustomTabsCallbackStubProxy + " inside, but instead got null."));
                        return;
                    }
                    Object objIAuthTabCallback = resource.IAuthTabCallback();
                    try {
                        if (objIAuthTabCallback == null || !this.ICustomTabsCallbackStubProxy.isAssignableFrom(objIAuthTabCallback.getClass())) {
                            this.onActivityResized = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.ICustomTabsCallbackStubProxy);
                            sb.append(" but instead got ");
                            sb.append(objIAuthTabCallback != null ? objIAuthTabCallback.getClass() : "");
                            sb.append("{");
                            sb.append(objIAuthTabCallback);
                            sb.append("} inside Resource{");
                            sb.append(resource);
                            sb.append("}.");
                            if (objIAuthTabCallback != null) {
                                str = "";
                            } else {
                                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                            }
                            sb.append(str);
                            onNavigationEvent(new SaversKtExternalSyntheticLambda7(sb.toString()));
                        } else if (!IAuthTabCallback_Parcel()) {
                            this.onActivityResized = null;
                            this.onRelationshipValidationResult = onExtraCallback.COMPLETE;
                        } else {
                            onNavigationEvent(resource, objIAuthTabCallback, saversKtExternalSyntheticLambda21, z);
                            return;
                        }
                        this.IAuthTabCallbackStub.IAuthTabCallback(resource);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            resource2 = resource;
                            if (resource2 != null) {
                                this.IAuthTabCallbackStub.IAuthTabCallback(resource2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    resource = null;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private void onNavigationEvent(Resource<R> resource, R r, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z) {
        boolean zOnResourceReady;
        boolean typedObject = readTypedObject();
        this.onRelationshipValidationResult = onExtraCallback.COMPLETE;
        this.onActivityResized = resource;
        if (this.asInterface.asInterface() <= 3) {
            r.getClass().getSimpleName();
            Objects.toString(saversKtExternalSyntheticLambda21);
            Objects.toString(this.IAuthTabCallbackStubProxy);
            getSharedValues.onWarmupCompleted(this.onMessageChannelReady);
        }
        boolean z2 = true;
        this.access000 = true;
        try {
            List<RequestListener<R>> list = this.writeTypedObject;
            if (list != null) {
                Iterator<RequestListener<R>> it = list.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    zOnResourceReady |= it.next().onResourceReady(r, this.IAuthTabCallbackStubProxy, this.onUnminimized, saversKtExternalSyntheticLambda21, typedObject);
                }
            } else {
                zOnResourceReady = false;
            }
            RequestListener<R> requestListener = this.ICustomTabsCallbackDefault;
            if (requestListener == null || !requestListener.onResourceReady(r, this.IAuthTabCallbackStubProxy, this.onUnminimized, saversKtExternalSyntheticLambda21, typedObject)) {
                z2 = false;
            }
            if (!(z2 | zOnResourceReady)) {
                this.onUnminimized.onResourceReady(r, this.onWarmupCompleted.IAuthTabCallback(saversKtExternalSyntheticLambda21, typedObject));
            }
            this.access000 = false;
            extraCallback();
        } catch (Throwable th) {
            this.access000 = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onNavigationEvent(SaversKtExternalSyntheticLambda7 saversKtExternalSyntheticLambda7) {
        onExtraCallback(saversKtExternalSyntheticLambda7, 5);
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public Object IAuthTabCallback() {
        this.onPostMessage.onExtraCallback();
        return this.ICustomTabsCallback;
    }

    private void onExtraCallback(SaversKtExternalSyntheticLambda7 saversKtExternalSyntheticLambda7, int i2) {
        boolean zOnLoadFailed;
        this.onPostMessage.onExtraCallback();
        synchronized (this.ICustomTabsCallback) {
            saversKtExternalSyntheticLambda7.IAuthTabCallback(this.onMinimized);
            int iAsInterface = this.asInterface.asInterface();
            if (iAsInterface <= i2) {
                Objects.toString(this.IAuthTabCallbackStubProxy);
                if (iAsInterface <= 4) {
                    saversKtExternalSyntheticLambda7.onNavigationEvent("Glide");
                }
            }
            this.getInterfaceDescriptor = null;
            this.onRelationshipValidationResult = onExtraCallback.FAILED;
            boolean z = true;
            this.access000 = true;
            try {
                List<RequestListener<R>> list = this.writeTypedObject;
                if (list != null) {
                    Iterator<RequestListener<R>> it = list.iterator();
                    zOnLoadFailed = false;
                    while (it.hasNext()) {
                        zOnLoadFailed |= it.next().onLoadFailed(saversKtExternalSyntheticLambda7, this.IAuthTabCallbackStubProxy, this.onUnminimized, readTypedObject());
                    }
                } else {
                    zOnLoadFailed = false;
                }
                RequestListener<R> requestListener = this.ICustomTabsCallbackDefault;
                if (requestListener == null || !requestListener.onLoadFailed(saversKtExternalSyntheticLambda7, this.IAuthTabCallbackStubProxy, this.onUnminimized, readTypedObject())) {
                    z = false;
                }
                if (!(zOnLoadFailed | z)) {
                    writeTypedObject();
                }
                this.access000 = false;
                extraCallbackWithResult();
            } catch (Throwable th) {
                this.access000 = false;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public boolean onExtraCallbackWithResult(Request request) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        setTranslationX<?> settranslationx;
        SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        setTranslationX<?> settranslationx2;
        SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda112;
        int size2;
        if (!(request instanceof setInteractionEnabled)) {
            return false;
        }
        synchronized (this.ICustomTabsCallback) {
            i2 = this.access100;
            i3 = this.IAuthTabCallback_Parcel;
            obj = this.IAuthTabCallbackStubProxy;
            cls = this.ICustomTabsCallbackStubProxy;
            settranslationx = this.onActivityLayout;
            saversKtExternalSyntheticLambda11 = this.readTypedObject;
            List<RequestListener<R>> list = this.writeTypedObject;
            size = list != null ? list.size() : 0;
        }
        setInteractionEnabled setinteractionenabled = (setInteractionEnabled) request;
        synchronized (setinteractionenabled.ICustomTabsCallback) {
            i4 = setinteractionenabled.access100;
            i5 = setinteractionenabled.IAuthTabCallback_Parcel;
            obj2 = setinteractionenabled.IAuthTabCallbackStubProxy;
            cls2 = setinteractionenabled.ICustomTabsCallbackStubProxy;
            settranslationx2 = setinteractionenabled.onActivityLayout;
            saversKtExternalSyntheticLambda112 = setinteractionenabled.readTypedObject;
            List<RequestListener<R>> list2 = setinteractionenabled.writeTypedObject;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i2 == i4 && i3 == i5 && applyConstraintsFromLayoutParams.IAuthTabCallback(obj, obj2) && cls.equals(cls2) && settranslationx.equals(settranslationx2) && saversKtExternalSyntheticLambda11 == saversKtExternalSyntheticLambda112 && size == size2;
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.ICustomTabsCallback) {
            obj = this.IAuthTabCallbackStubProxy;
            cls = this.ICustomTabsCallbackStubProxy;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
