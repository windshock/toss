package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TransitionExternalSyntheticLambda7 {
    private final List<onNavigationEvent> IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private onExtraCallbackWithResult IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private IAuthTabCallback access000;
    private boolean access100;
    private final SaversKtExternalSyntheticLambda15 asBinder;
    private int asInterface;
    private RequestBuilder<Bitmap> extraCallback;
    private boolean extraCallbackWithResult;
    private IAuthTabCallback getInterfaceDescriptor;
    final RequestManager onExtraCallback;
    private final Savers_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult;
    private Bitmap onNavigationEvent;
    private final Handler onTransact;
    private IAuthTabCallback onWarmupCompleted;
    private SaversKtExternalSyntheticLambda29<Bitmap> readTypedObject;
    private int writeTypedObject;

    interface onExtraCallbackWithResult {
    }

    public interface onNavigationEvent {
        void IAuthTabCallbackDefault();
    }

    TransitionExternalSyntheticLambda7(Glide glide, SaversKtExternalSyntheticLambda15 saversKtExternalSyntheticLambda15, int i2, int i3, SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, Bitmap bitmap) {
        this(glide.onNavigationEvent(), Glide.IAuthTabCallback(glide.onExtraCallback()), saversKtExternalSyntheticLambda15, null, onExtraCallback(Glide.IAuthTabCallback(glide.onExtraCallback()), i2, i3), saversKtExternalSyntheticLambda29, bitmap);
    }

    TransitionExternalSyntheticLambda7(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, RequestManager requestManager, SaversKtExternalSyntheticLambda15 saversKtExternalSyntheticLambda15, Handler handler, RequestBuilder<Bitmap> requestBuilder, SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, Bitmap bitmap) {
        this.IAuthTabCallback = new ArrayList();
        this.onExtraCallback = requestManager;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new onExtraCallback()) : handler;
        this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda5;
        this.onTransact = handler;
        this.extraCallback = requestBuilder;
        this.asBinder = saversKtExternalSyntheticLambda15;
        onExtraCallbackWithResult(saversKtExternalSyntheticLambda29, bitmap);
    }

    void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, Bitmap bitmap) {
        this.readTypedObject = (SaversKtExternalSyntheticLambda29) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda29);
        this.onNavigationEvent = (Bitmap) markHierarchyDirty.onExtraCallbackWithResult(bitmap);
        this.extraCallback = this.extraCallback.IAuthTabCallback(new RequestOptions().onWarmupCompleted(saversKtExternalSyntheticLambda29));
        this.asInterface = applyConstraintsFromLayoutParams.onWarmupCompleted(bitmap);
        this.writeTypedObject = bitmap.getWidth();
        this.IAuthTabCallbackDefault = bitmap.getHeight();
    }

    Bitmap onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    void onExtraCallbackWithResult(onNavigationEvent onnavigationevent) {
        if (this.IAuthTabCallbackStub) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.IAuthTabCallback.contains(onnavigationevent)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.IAuthTabCallback.isEmpty();
        this.IAuthTabCallback.add(onnavigationevent);
        if (zIsEmpty) {
            access100();
        }
    }

    void onExtraCallback(onNavigationEvent onnavigationevent) {
        this.IAuthTabCallback.remove(onnavigationevent);
        if (this.IAuthTabCallback.isEmpty()) {
            getInterfaceDescriptor();
        }
    }

    int asInterface() {
        return this.writeTypedObject;
    }

    int IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    int onTransact() {
        return this.asBinder.onWarmupCompleted() + this.asInterface;
    }

    int onExtraCallbackWithResult() {
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback != null) {
            return iAuthTabCallback.onExtraCallback;
        }
        return -1;
    }

    ByteBuffer IAuthTabCallback() {
        return this.asBinder.onNavigationEvent().asReadOnlyBuffer();
    }

    int asBinder() {
        return this.asBinder.IAuthTabCallbackDefault();
    }

    private void access100() {
        if (this.IAuthTabCallback_Parcel) {
            return;
        }
        this.IAuthTabCallback_Parcel = true;
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback_Parcel();
    }

    private void getInterfaceDescriptor() {
        this.IAuthTabCallback_Parcel = false;
    }

    void onNavigationEvent() {
        this.IAuthTabCallback.clear();
        IAuthTabCallbackStubProxy();
        getInterfaceDescriptor();
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback != null) {
            this.onExtraCallback.onExtraCallbackWithResult(iAuthTabCallback);
            this.onWarmupCompleted = null;
        }
        IAuthTabCallback iAuthTabCallback2 = this.access000;
        if (iAuthTabCallback2 != null) {
            this.onExtraCallback.onExtraCallbackWithResult(iAuthTabCallback2);
            this.access000 = null;
        }
        IAuthTabCallback iAuthTabCallback3 = this.getInterfaceDescriptor;
        if (iAuthTabCallback3 != null) {
            this.onExtraCallback.onExtraCallbackWithResult(iAuthTabCallback3);
            this.getInterfaceDescriptor = null;
        }
        this.asBinder.IAuthTabCallback();
        this.IAuthTabCallbackStub = true;
    }

    Bitmap onExtraCallback() {
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        return iAuthTabCallback != null ? iAuthTabCallback.onExtraCallbackWithResult() : this.onNavigationEvent;
    }

    private void IAuthTabCallback_Parcel() {
        if (!this.IAuthTabCallback_Parcel || this.access100) {
            return;
        }
        if (this.extraCallbackWithResult) {
            markHierarchyDirty.onExtraCallbackWithResult(this.getInterfaceDescriptor == null, "Pending target must be null when starting from the first frame");
            this.asBinder.onTransact();
            this.extraCallbackWithResult = false;
        }
        IAuthTabCallback iAuthTabCallback = this.getInterfaceDescriptor;
        if (iAuthTabCallback != null) {
            this.getInterfaceDescriptor = null;
            onExtraCallbackWithResult(iAuthTabCallback);
            return;
        }
        this.access100 = true;
        int iAsInterface = this.asBinder.asInterface();
        this.asBinder.onExtraCallback();
        this.access000 = new IAuthTabCallback(this.onTransact, this.asBinder.onExtraCallbackWithResult(), SystemClock.uptimeMillis() + iAsInterface);
        this.extraCallback.IAuthTabCallback(RequestOptions.onWarmupCompleted(IAuthTabCallbackStub())).onExtraCallbackWithResult(this.asBinder).onNavigationEvent((RequestBuilder<Bitmap>) this.access000);
    }

    private void IAuthTabCallbackStubProxy() {
        Bitmap bitmap = this.onNavigationEvent;
        if (bitmap != null) {
            this.onExtraCallbackWithResult.onWarmupCompleted(bitmap);
            this.onNavigationEvent = null;
        }
    }

    void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        this.access100 = false;
        if (this.IAuthTabCallbackStub) {
            this.onTransact.obtainMessage(2, iAuthTabCallback).sendToTarget();
            return;
        }
        if (!this.IAuthTabCallback_Parcel) {
            if (this.extraCallbackWithResult) {
                this.onTransact.obtainMessage(2, iAuthTabCallback).sendToTarget();
                return;
            } else {
                this.getInterfaceDescriptor = iAuthTabCallback;
                return;
            }
        }
        if (iAuthTabCallback.onExtraCallbackWithResult() != null) {
            IAuthTabCallbackStubProxy();
            IAuthTabCallback iAuthTabCallback2 = this.onWarmupCompleted;
            this.onWarmupCompleted = iAuthTabCallback;
            for (int size = this.IAuthTabCallback.size() - 1; size >= 0; size--) {
                this.IAuthTabCallback.get(size).IAuthTabCallbackDefault();
            }
            if (iAuthTabCallback2 != null) {
                this.onTransact.obtainMessage(2, iAuthTabCallback2).sendToTarget();
            }
        }
        IAuthTabCallback_Parcel();
    }

    class onExtraCallback implements Handler.Callback {
        onExtraCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                TransitionExternalSyntheticLambda7.this.onExtraCallbackWithResult((IAuthTabCallback) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            TransitionExternalSyntheticLambda7.this.onExtraCallback.onExtraCallbackWithResult((IAuthTabCallback) message.obj);
            return false;
        }
    }

    static class IAuthTabCallback extends setDelayedApplicationOfInitialState<Bitmap> {
        private final Handler IAuthTabCallback;
        final int onExtraCallback;
        private final long onExtraCallbackWithResult;
        private Bitmap onNavigationEvent;

        IAuthTabCallback(Handler handler, int i2, long j) {
            this.IAuthTabCallback = handler;
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = j;
        }

        Bitmap onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        @Override // o.setTransitionDuration
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable ViewTransitionExternalSyntheticLambda0<? super Bitmap> viewTransitionExternalSyntheticLambda0) {
            this.onNavigationEvent = bitmap;
            this.IAuthTabCallback.sendMessageAtTime(this.IAuthTabCallback.obtainMessage(1, this), this.onExtraCallbackWithResult);
        }

        @Override // o.setTransitionDuration
        public void onLoadCleared(@Nullable Drawable drawable) {
            this.onNavigationEvent = null;
        }
    }

    private static RequestBuilder<Bitmap> onExtraCallback(RequestManager requestManager, int i2, int i3) {
        return requestManager.IAuthTabCallback().IAuthTabCallback(RequestOptions.onExtraCallbackWithResult(SaversKtExternalSyntheticLambda58.IAuthTabCallback).onWarmupCompleted(true).IAuthTabCallback(true).IAuthTabCallback(i2, i3));
    }

    private static SaversKtExternalSyntheticLambda26 IAuthTabCallbackStub() {
        return new setDpMargin(Double.valueOf(Math.random()));
    }
}
