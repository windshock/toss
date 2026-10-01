package o;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted {
    public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult IAuthTabCallback;
    public final int onExtraCallbackWithResult;
    private final CopyOnWriteArrayList<onExtraCallback> onWarmupCompleted;

    public SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted(CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList, int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onWarmupCompleted = copyOnWriteArrayList;
        this.onExtraCallbackWithResult = i2;
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    public SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return new SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted(this.onWarmupCompleted, i2, onextracallbackwithresult);
    }

    public void onWarmupCompleted(Handler handler, SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8) {
        this.onWarmupCompleted.add(new onExtraCallback(handler, selectionManager_androidKtExternalSyntheticLambda8));
    }

    public void onWarmupCompleted(SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8) {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            if (next.onWarmupCompleted == selectionManager_androidKtExternalSyntheticLambda8) {
                this.onWarmupCompleted.remove(next);
            }
        }
    }

    public void onWarmupCompleted(final int i2) {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8 = next.onWarmupCompleted;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.f$0;
                    selectionManager_androidKtExternalSyntheticLambda8.IAuthTabCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback, i2);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    public void IAuthTabCallback() {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8 = next.onWarmupCompleted;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.f$0;
                    selectionManager_androidKtExternalSyntheticLambda8.onWarmupCompleted(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    public void onExtraCallback(final Exception exc) {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8 = next.onWarmupCompleted;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.f$0;
                    selectionManager_androidKtExternalSyntheticLambda8.onNavigationEvent(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback, exc);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    public void onExtraCallbackWithResult() {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8 = next.onWarmupCompleted;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.f$0;
                    selectionManager_androidKtExternalSyntheticLambda8.IAuthTabCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    public void onWarmupCompleted() {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8 = next.onWarmupCompleted;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.f$0;
                    selectionManager_androidKtExternalSyntheticLambda8.onNavigationEvent(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    public void onExtraCallback() {
        Iterator<onExtraCallback> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8 = next.onWarmupCompleted;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.f$0;
                    selectionManager_androidKtExternalSyntheticLambda8.onExtraCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    static final class onExtraCallback {
        public Handler onExtraCallback;
        public SelectionManager_androidKtExternalSyntheticLambda8 onWarmupCompleted;

        public onExtraCallback(Handler handler, SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8) {
            this.onExtraCallback = handler;
            this.onWarmupCompleted = selectionManager_androidKtExternalSyntheticLambda8;
        }
    }
}
