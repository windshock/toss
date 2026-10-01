package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.Layer;
import o.SaversKtExternalSyntheticLambda11;
import o.SaversKtExternalSyntheticLambda12;
import o.SaversKtExternalSyntheticLambda58;
import o.TransitionExternalSyntheticLambda6;
import o.applyConstraintsFromLayoutParams;
import o.setLastHorizontalStyle;
import o.setMaxElementsWrap;
import o.setRotation;
import o.setTransitionDuration;
import o.setVerticalStyle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestManager implements ComponentCallbacks2, Layer {
    protected final Context IAuthTabCallback;
    private final setLastHorizontalStyle IAuthTabCallbackDefault;
    private final CopyOnWriteArrayList<RequestListener<Object>> IAuthTabCallbackStub;
    private final RequestManagerTreeNode IAuthTabCallbackStubProxy;
    private RequestOptions access000;
    private final setRotation access100;
    private final Runnable asInterface;
    private final RequestTracker getInterfaceDescriptor;
    protected final Glide onExtraCallbackWithResult;
    private boolean onTransact;
    final setVerticalStyle onWarmupCompleted;
    private static final RequestOptions onNavigationEvent = RequestOptions.onNavigationEvent((Class<?>) Bitmap.class).ICustomTabsService();
    private static final RequestOptions onExtraCallback = RequestOptions.onNavigationEvent((Class<?>) TransitionExternalSyntheticLambda6.class).ICustomTabsService();
    private static final RequestOptions asBinder = RequestOptions.onExtraCallbackWithResult(SaversKtExternalSyntheticLambda58.onNavigationEvent).onWarmupCompleted(SaversKtExternalSyntheticLambda11.LOW).IAuthTabCallback(true);

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public RequestManager(@NonNull Glide glide, @NonNull setVerticalStyle setverticalstyle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        this(glide, setverticalstyle, requestManagerTreeNode, new RequestTracker(), glide.IAuthTabCallback(), context);
    }

    RequestManager(Glide glide, setVerticalStyle setverticalstyle, RequestManagerTreeNode requestManagerTreeNode, RequestTracker requestTracker, setMaxElementsWrap setmaxelementswrap, Context context) {
        this.access100 = new setRotation();
        Runnable runnable = new Runnable() { // from class: com.bumptech.glide.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager requestManager = RequestManager.this;
                requestManager.onWarmupCompleted.onNavigationEvent(requestManager);
            }
        };
        this.asInterface = runnable;
        this.onExtraCallbackWithResult = glide;
        this.onWarmupCompleted = setverticalstyle;
        this.IAuthTabCallbackStubProxy = requestManagerTreeNode;
        this.getInterfaceDescriptor = requestTracker;
        this.IAuthTabCallback = context;
        setLastHorizontalStyle setlasthorizontalstyleIAuthTabCallback = setmaxelementswrap.IAuthTabCallback(context.getApplicationContext(), new RequestManagerConnectivityListener(requestTracker));
        this.IAuthTabCallbackDefault = setlasthorizontalstyleIAuthTabCallback;
        if (applyConstraintsFromLayoutParams.IAuthTabCallback()) {
            applyConstraintsFromLayoutParams.onExtraCallbackWithResult(runnable);
        } else {
            setverticalstyle.onNavigationEvent(this);
        }
        setverticalstyle.onNavigationEvent(setlasthorizontalstyleIAuthTabCallback);
        this.IAuthTabCallbackStub = new CopyOnWriteArrayList<>(glide.asInterface().IAuthTabCallback());
        onExtraCallbackWithResult(glide.asInterface().onNavigationEvent());
        glide.onExtraCallback(this);
    }

    protected void onExtraCallbackWithResult(@NonNull RequestOptions requestOptions) {
        synchronized (this) {
            this.access000 = requestOptions.onWarmupCompleted().IAuthTabCallback();
        }
    }

    private void IAuthTabCallback(@NonNull RequestOptions requestOptions) {
        synchronized (this) {
            this.access000 = this.access000.onExtraCallback(requestOptions);
        }
    }

    public RequestManager onNavigationEvent(@NonNull RequestOptions requestOptions) {
        synchronized (this) {
            IAuthTabCallback(requestOptions);
        }
        return this;
    }

    public void onTransact() {
        synchronized (this) {
            this.getInterfaceDescriptor.onExtraCallbackWithResult();
        }
    }

    public void onExtraCallback() {
        synchronized (this) {
            this.getInterfaceDescriptor.onNavigationEvent();
        }
    }

    public void asInterface() {
        synchronized (this) {
            onExtraCallback();
            Iterator<RequestManager> it = this.IAuthTabCallbackStubProxy.onExtraCallback().iterator();
            while (it.hasNext()) {
                it.next().onExtraCallback();
            }
        }
    }

    public void IAuthTabCallbackDefault() {
        synchronized (this) {
            this.getInterfaceDescriptor.onWarmupCompleted();
        }
    }

    @Override // o.Layer
    public void onStart() {
        synchronized (this) {
            IAuthTabCallbackDefault();
            this.access100.onStart();
        }
    }

    @Override // o.Layer
    public void onStop() {
        synchronized (this) {
            onTransact();
            this.access100.onStop();
        }
    }

    @Override // o.Layer
    public void onDestroy() {
        synchronized (this) {
            this.access100.onDestroy();
            Iterator<setTransitionDuration<?>> it = this.access100.onExtraCallback().iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult(it.next());
            }
            this.access100.onWarmupCompleted();
            this.getInterfaceDescriptor.onExtraCallback();
            this.onWarmupCompleted.onExtraCallbackWithResult(this);
            this.onWarmupCompleted.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            applyConstraintsFromLayoutParams.onNavigationEvent(this.asInterface);
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(this);
        }
    }

    public RequestBuilder<Bitmap> IAuthTabCallback() {
        return onWarmupCompleted(Bitmap.class).IAuthTabCallback(onNavigationEvent);
    }

    public RequestBuilder<Drawable> onNavigationEvent() {
        return onWarmupCompleted(Drawable.class);
    }

    public RequestBuilder<Drawable> onExtraCallback(@Nullable Bitmap bitmap) {
        return onNavigationEvent().onExtraCallback(bitmap);
    }

    public RequestBuilder<Drawable> onExtraCallbackWithResult(@Nullable String str) {
        return onNavigationEvent().onExtraCallback(str);
    }

    public RequestBuilder<Drawable> onExtraCallback(@Nullable File file) {
        return onNavigationEvent().onExtraCallbackWithResult(file);
    }

    public <ResourceType> RequestBuilder<ResourceType> onWarmupCompleted(@NonNull Class<ResourceType> cls) {
        return new RequestBuilder<>(this.onExtraCallbackWithResult, this, cls, this.IAuthTabCallback);
    }

    public void onExtraCallbackWithResult(@Nullable setTransitionDuration<?> settransitionduration) {
        if (settransitionduration == null) {
            return;
        }
        onWarmupCompleted(settransitionduration);
    }

    private void onWarmupCompleted(@NonNull setTransitionDuration<?> settransitionduration) {
        boolean zOnExtraCallback = onExtraCallback(settransitionduration);
        Request request = settransitionduration.getRequest();
        if (zOnExtraCallback || this.onExtraCallbackWithResult.IAuthTabCallback(settransitionduration) || request == null) {
            return;
        }
        settransitionduration.setRequest(null);
        request.onExtraCallbackWithResult();
    }

    boolean onExtraCallback(@NonNull setTransitionDuration<?> settransitionduration) {
        synchronized (this) {
            Request request = settransitionduration.getRequest();
            if (request == null) {
                return true;
            }
            if (!this.getInterfaceDescriptor.onExtraCallbackWithResult(request)) {
                return false;
            }
            this.access100.onWarmupCompleted(settransitionduration);
            settransitionduration.setRequest(null);
            return true;
        }
    }

    void onNavigationEvent(@NonNull setTransitionDuration<?> settransitionduration, @NonNull Request request) {
        synchronized (this) {
            this.access100.IAuthTabCallback(settransitionduration);
            this.getInterfaceDescriptor.IAuthTabCallback(request);
        }
    }

    List<RequestListener<Object>> onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    RequestOptions onExtraCallbackWithResult() {
        RequestOptions requestOptions;
        synchronized (this) {
            requestOptions = this.access000;
        }
        return requestOptions;
    }

    <T> SaversKtExternalSyntheticLambda12<?, T> onNavigationEvent(Class<T> cls) {
        return this.onExtraCallbackWithResult.asInterface().onNavigationEvent(cls);
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "{tracker=" + this.getInterfaceDescriptor + ", treeNode=" + this.IAuthTabCallbackStubProxy + "}";
        }
        return str;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 == 60 && this.onTransact) {
            asInterface();
        }
    }

    class RequestManagerConnectivityListener implements setLastHorizontalStyle.onExtraCallback {
        private final RequestTracker onNavigationEvent;

        RequestManagerConnectivityListener(@NonNull RequestTracker requestTracker) {
            this.onNavigationEvent = requestTracker;
        }

        @Override // o.setLastHorizontalStyle.onExtraCallback
        public void onExtraCallbackWithResult(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    this.onNavigationEvent.IAuthTabCallback();
                }
            }
        }
    }
}
