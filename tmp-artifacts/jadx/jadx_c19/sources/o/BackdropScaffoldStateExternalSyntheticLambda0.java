package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.BackdropScaffoldKtExternalSyntheticLambda7;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BackdropScaffoldStateExternalSyntheticLambda0 implements BottomDrawerStateCompanionExternalSyntheticLambda1 {
    private final byte[] IAuthTabCallback;
    private final Uri asBinder;
    private final BottomSheetScaffoldKtExternalSyntheticLambda11 asInterface;
    private final BackdropScaffoldKtExternalSyntheticLambda7 onExtraCallback;
    private final AtomicBoolean onExtraCallbackWithResult;
    private final AtomicReference<Throwable> onNavigationEvent;
    private final ArrayList<IAuthTabCallback> onTransact;
    private ListenableFuture<?> onWarmupCompleted;

    public void IAuthTabCallback(long j) {
    }

    public long IAuthTabCallbackStub() {
        return -9223372036854775807L;
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        return j;
    }

    public void onExtraCallback(long j, boolean z) {
    }

    public void onNavigationEvent() {
    }

    public BackdropScaffoldStateExternalSyntheticLambda0(Uri uri, String str, BackdropScaffoldKtExternalSyntheticLambda7 backdropScaffoldKtExternalSyntheticLambda7) {
        this.asBinder = uri;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault(str).onNavigationEvent();
        this.onExtraCallback = backdropScaffoldKtExternalSyntheticLambda7;
        this.asInterface = new BottomSheetScaffoldKtExternalSyntheticLambda11(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent}));
        this.IAuthTabCallback = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.onExtraCallbackWithResult = new AtomicBoolean();
        this.onNavigationEvent = new AtomicReference<>();
        this.onTransact = new ArrayList<>();
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted.IAuthTabCallback(this);
        ListenableFuture<?> listenableFutureOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(new BackdropScaffoldKtExternalSyntheticLambda7.onNavigationEvent(this.asBinder));
        this.onWarmupCompleted = listenableFutureOnExtraCallbackWithResult;
        Futures.addCallback(listenableFutureOnExtraCallbackWithResult, new FutureCallback<Object>() { // from class: o.BackdropScaffoldStateExternalSyntheticLambda0.1
            public void onSuccess(@Nullable Object obj) {
                BackdropScaffoldStateExternalSyntheticLambda0.this.onExtraCallbackWithResult.set(true);
            }

            public void onFailure(Throwable th) {
                BackdropScaffoldStateExternalSyntheticLambda0.this.onNavigationEvent.set(th);
            }
        }, MoreExecutors.directExecutor());
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        return this.asInterface;
    }

    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        for (int i2 = 0; i2 < colorsKtExternalSyntheticLambda0Arr.length; i2++) {
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 = bottomNavigationKtExternalSyntheticLambda5Arr[i2];
            if (bottomNavigationKtExternalSyntheticLambda5 != null && (colorsKtExternalSyntheticLambda0Arr[i2] == null || !zArr[i2])) {
                this.onTransact.remove(bottomNavigationKtExternalSyntheticLambda5);
                bottomNavigationKtExternalSyntheticLambda5Arr[i2] = null;
            }
            if (bottomNavigationKtExternalSyntheticLambda5Arr[i2] == null && colorsKtExternalSyntheticLambda0Arr[i2] != null) {
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
                this.onTransact.add(iAuthTabCallback);
                bottomNavigationKtExternalSyntheticLambda5Arr[i2] = iAuthTabCallback;
                zArr2[i2] = true;
            }
        }
        return j;
    }

    public long onExtraCallbackWithResult(long j) {
        for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
            this.onTransact.get(i2).onExtraCallback();
        }
        return j;
    }

    public long onWarmupCompleted() {
        return this.onExtraCallbackWithResult.get() ? Long.MIN_VALUE : 0L;
    }

    public long onExtraCallback() {
        return this.onExtraCallbackWithResult.get() ? Long.MIN_VALUE : 0L;
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        return !this.onExtraCallbackWithResult.get();
    }

    public boolean IAuthTabCallback() {
        return !this.onExtraCallbackWithResult.get();
    }

    public void IAuthTabCallbackDefault() {
        ListenableFuture<?> listenableFuture = this.onWarmupCompleted;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    final class IAuthTabCallback implements BottomNavigationKtExternalSyntheticLambda5 {
        private int onNavigationEvent = 0;

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onExtraCallbackWithResult(long j) {
            return 0;
        }

        public IAuthTabCallback() {
        }

        public void onExtraCallback() {
            if (this.onNavigationEvent == 2) {
                this.onNavigationEvent = 1;
            }
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public boolean onWarmupCompleted() {
            return BackdropScaffoldStateExternalSyntheticLambda0.this.onExtraCallbackWithResult.get();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public void onExtraCallbackWithResult() throws IOException {
            Throwable th = (Throwable) BackdropScaffoldStateExternalSyntheticLambda0.this.onNavigationEvent.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
            int i3 = this.onNavigationEvent;
            if (i3 == 2) {
                selectionControllerExternalSyntheticLambda2.onWarmupCompleted(4);
                return -4;
            }
            if ((i2 & 2) != 0 || i3 == 0) {
                androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted = BackdropScaffoldStateExternalSyntheticLambda0.this.asInterface.onWarmupCompleted(0).IAuthTabCallback(0);
                this.onNavigationEvent = 1;
                return -5;
            }
            if (!BackdropScaffoldStateExternalSyntheticLambda0.this.onExtraCallbackWithResult.get()) {
                return -3;
            }
            int length = BackdropScaffoldStateExternalSyntheticLambda0.this.IAuthTabCallback.length;
            selectionControllerExternalSyntheticLambda2.onWarmupCompleted(1);
            selectionControllerExternalSyntheticLambda2.onWarmupCompleted = 0L;
            if ((i2 & 4) == 0) {
                selectionControllerExternalSyntheticLambda2.IAuthTabCallback(length);
                selectionControllerExternalSyntheticLambda2.onExtraCallback.put(BackdropScaffoldStateExternalSyntheticLambda0.this.IAuthTabCallback, 0, length);
            }
            if ((i2 & 1) == 0) {
                this.onNavigationEvent = 2;
            }
            return -4;
        }
    }
}
