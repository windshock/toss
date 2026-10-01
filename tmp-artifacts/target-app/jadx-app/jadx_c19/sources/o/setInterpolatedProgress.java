package o;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setInterpolatedProgress implements RequestCoordinator, Request {
    private boolean IAuthTabCallback;
    private volatile Request IAuthTabCallbackStub;
    private RequestCoordinator.RequestState asInterface;
    private volatile Request onExtraCallback;
    private RequestCoordinator.RequestState onExtraCallbackWithResult;
    private final RequestCoordinator onNavigationEvent;
    private final Object onWarmupCompleted;

    public setInterpolatedProgress(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.onExtraCallbackWithResult = requestState;
        this.asInterface = requestState;
        this.onWarmupCompleted = obj;
        this.onNavigationEvent = requestCoordinator;
    }

    public void onExtraCallback(Request request, Request request2) {
        this.onExtraCallback = request;
        this.IAuthTabCallbackStub = request2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(Request request) {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            if (IAuthTabCallbackStubProxy()) {
                if (!request.equals(this.onExtraCallback)) {
                    if (this.onExtraCallbackWithResult != RequestCoordinator.RequestState.SUCCESS) {
                    }
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private boolean IAuthTabCallbackStubProxy() {
        RequestCoordinator requestCoordinator = this.onNavigationEvent;
        return requestCoordinator == null || requestCoordinator.onWarmupCompleted(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(Request request) {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            if (!onTransact() || !request.equals(this.onExtraCallback)) {
                z = false;
            } else if (!onWarmupCompleted()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback(Request request) {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            if (!IAuthTabCallbackDefault() || !request.equals(this.onExtraCallback)) {
                z = false;
            } else if (this.onExtraCallbackWithResult != RequestCoordinator.RequestState.PAUSED) {
                z = true;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted() {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            if (!this.IAuthTabCallbackStub.onWarmupCompleted()) {
                z = this.onExtraCallback.onWarmupCompleted();
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void IAuthTabCallbackDefault(Request request) {
        synchronized (this.onWarmupCompleted) {
            if (request.equals(this.IAuthTabCallbackStub)) {
                this.asInterface = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.onExtraCallbackWithResult = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.onNavigationEvent;
            if (requestCoordinator != null) {
                requestCoordinator.IAuthTabCallbackDefault(this);
            }
            if (!this.asInterface.isComplete()) {
                this.IAuthTabCallbackStub.onExtraCallbackWithResult();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onNavigationEvent(Request request) {
        synchronized (this.onWarmupCompleted) {
            if (!request.equals(this.onExtraCallback)) {
                this.asInterface = RequestCoordinator.RequestState.FAILED;
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
        synchronized (this.onWarmupCompleted) {
            RequestCoordinator requestCoordinator = this.onNavigationEvent;
            requestCoordinatorIAuthTabCallback = requestCoordinator != null ? requestCoordinator.IAuthTabCallback() : this;
        }
        return requestCoordinatorIAuthTabCallback;
    }

    @Override // com.bumptech.glide.request.Request
    public void onNavigationEvent() {
        synchronized (this.onWarmupCompleted) {
            this.IAuthTabCallback = true;
            try {
                if (this.onExtraCallbackWithResult != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.asInterface;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.asInterface = requestState2;
                        this.IAuthTabCallbackStub.onNavigationEvent();
                    }
                }
                if (this.IAuthTabCallback) {
                    RequestCoordinator.RequestState requestState3 = this.onExtraCallbackWithResult;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.onExtraCallbackWithResult = requestState4;
                        this.onExtraCallback.onNavigationEvent();
                    }
                }
            } finally {
                this.IAuthTabCallback = false;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void onExtraCallbackWithResult() {
        synchronized (this.onWarmupCompleted) {
            this.IAuthTabCallback = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.onExtraCallbackWithResult = requestState;
            this.asInterface = requestState;
            this.IAuthTabCallbackStub.onExtraCallbackWithResult();
            this.onExtraCallback.onExtraCallbackWithResult();
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void asInterface() {
        synchronized (this.onWarmupCompleted) {
            if (!this.asInterface.isComplete()) {
                this.asInterface = RequestCoordinator.RequestState.PAUSED;
                this.IAuthTabCallbackStub.asInterface();
            }
            if (!this.onExtraCallbackWithResult.isComplete()) {
                this.onExtraCallbackWithResult = RequestCoordinator.RequestState.PAUSED;
                this.onExtraCallback.asInterface();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public boolean IAuthTabCallbackStub() {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            z = this.onExtraCallbackWithResult == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean asBinder() {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            z = this.onExtraCallbackWithResult == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean onExtraCallback() {
        boolean z;
        synchronized (this.onWarmupCompleted) {
            z = this.onExtraCallbackWithResult == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean onExtraCallbackWithResult(Request request) {
        if (!(request instanceof setInterpolatedProgress)) {
            return false;
        }
        setInterpolatedProgress setinterpolatedprogress = (setInterpolatedProgress) request;
        if (this.onExtraCallback == null) {
            if (setinterpolatedprogress.onExtraCallback != null) {
                return false;
            }
        } else if (!this.onExtraCallback.onExtraCallbackWithResult(setinterpolatedprogress.onExtraCallback)) {
            return false;
        }
        return this.IAuthTabCallbackStub == null ? setinterpolatedprogress.IAuthTabCallbackStub == null : this.IAuthTabCallbackStub.onExtraCallbackWithResult(setinterpolatedprogress.IAuthTabCallbackStub);
    }
}
