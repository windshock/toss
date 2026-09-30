package o;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setScaleY implements RequestCoordinator, Request {
    private volatile Request IAuthTabCallback;
    private final Object IAuthTabCallbackStub;
    private RequestCoordinator.RequestState onExtraCallback;
    private RequestCoordinator.RequestState onExtraCallbackWithResult;
    private final RequestCoordinator onNavigationEvent;
    private volatile Request onWarmupCompleted;

    public setScaleY(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.onExtraCallback = requestState;
        this.onExtraCallbackWithResult = requestState;
        this.IAuthTabCallbackStub = obj;
        this.onNavigationEvent = requestCoordinator;
    }

    public void onNavigationEvent(Request request, Request request2) {
        this.onWarmupCompleted = request;
        this.IAuthTabCallback = request2;
    }

    @Override // com.bumptech.glide.request.Request
    public void onNavigationEvent() {
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator.RequestState requestState = this.onExtraCallback;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.onExtraCallback = requestState2;
                this.onWarmupCompleted.onNavigationEvent();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void onExtraCallbackWithResult() {
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.onExtraCallback = requestState;
            this.onWarmupCompleted.onExtraCallbackWithResult();
            if (this.onExtraCallbackWithResult != requestState) {
                this.onExtraCallbackWithResult = requestState;
                this.IAuthTabCallback.onExtraCallbackWithResult();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void asInterface() {
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator.RequestState requestState = this.onExtraCallback;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.onExtraCallback = RequestCoordinator.RequestState.PAUSED;
                this.onWarmupCompleted.asInterface();
            }
            if (this.onExtraCallbackWithResult == requestState2) {
                this.onExtraCallbackWithResult = RequestCoordinator.RequestState.PAUSED;
                this.IAuthTabCallback.asInterface();
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
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator.RequestState requestState = this.onExtraCallback;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                z = this.onExtraCallbackWithResult == requestState2;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    @Override // com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean asBinder() {
        boolean z;
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator.RequestState requestState = this.onExtraCallback;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2) {
                z = this.onExtraCallbackWithResult == requestState2;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    @Override // com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback() {
        boolean z;
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator.RequestState requestState = this.onExtraCallback;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            if (requestState == requestState2) {
                z = this.onExtraCallbackWithResult == requestState2;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean onExtraCallbackWithResult(Request request) {
        if (!(request instanceof setScaleY)) {
            return false;
        }
        setScaleY setscaley = (setScaleY) request;
        return this.onWarmupCompleted.onExtraCallbackWithResult(setscaley.onWarmupCompleted) && this.IAuthTabCallback.onExtraCallbackWithResult(setscaley.IAuthTabCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(Request request) {
        boolean z;
        synchronized (this.IAuthTabCallbackStub) {
            if (getInterfaceDescriptor()) {
                z = asInterface(request);
            }
        }
        return z;
    }

    private boolean getInterfaceDescriptor() {
        RequestCoordinator requestCoordinator = this.onNavigationEvent;
        return requestCoordinator == null || requestCoordinator.onWarmupCompleted(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(Request request) {
        boolean z;
        synchronized (this.IAuthTabCallbackStub) {
            if (onTransact()) {
                z = asInterface(request);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback(Request request) {
        boolean z;
        synchronized (this.IAuthTabCallbackStub) {
            if (IAuthTabCallbackDefault()) {
                z = asInterface(request);
            }
        }
        return z;
    }

    private boolean IAuthTabCallbackDefault() {
        RequestCoordinator requestCoordinator = this.onNavigationEvent;
        return requestCoordinator == null || requestCoordinator.IAuthTabCallback(this);
    }

    private boolean onTransact() {
        RequestCoordinator requestCoordinator = this.onNavigationEvent;
        return requestCoordinator == null || requestCoordinator.onExtraCallback(this);
    }

    private boolean asInterface(Request request) {
        if (request.equals(this.onWarmupCompleted)) {
            return true;
        }
        return this.onExtraCallback == RequestCoordinator.RequestState.FAILED && request.equals(this.IAuthTabCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted() {
        boolean z;
        synchronized (this.IAuthTabCallbackStub) {
            if (!this.onWarmupCompleted.onWarmupCompleted()) {
                z = this.IAuthTabCallback.onWarmupCompleted();
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void IAuthTabCallbackDefault(Request request) {
        synchronized (this.IAuthTabCallbackStub) {
            if (request.equals(this.onWarmupCompleted)) {
                this.onExtraCallback = RequestCoordinator.RequestState.SUCCESS;
            } else if (request.equals(this.IAuthTabCallback)) {
                this.onExtraCallbackWithResult = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.onNavigationEvent;
            if (requestCoordinator != null) {
                requestCoordinator.IAuthTabCallbackDefault(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onNavigationEvent(Request request) {
        synchronized (this.IAuthTabCallbackStub) {
            if (!request.equals(this.IAuthTabCallback)) {
                this.onExtraCallback = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.onExtraCallbackWithResult;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.onExtraCallbackWithResult = requestState2;
                    this.IAuthTabCallback.onNavigationEvent();
                }
                return;
            }
            this.onExtraCallbackWithResult = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.onNavigationEvent;
            if (requestCoordinator != null) {
                requestCoordinator.onNavigationEvent(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator IAuthTabCallback() {
        RequestCoordinator requestCoordinatorIAuthTabCallback;
        synchronized (this.IAuthTabCallbackStub) {
            RequestCoordinator requestCoordinator = this.onNavigationEvent;
            requestCoordinatorIAuthTabCallback = requestCoordinator != null ? requestCoordinator.IAuthTabCallback() : this;
        }
        return requestCoordinatorIAuthTabCallback;
    }
}
