package o;

import com.google.common.base.Supplier;
import com.google.common.primitives.Ints;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.BackdropScaffoldKtExternalSyntheticLambda9;
import o.BackdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda10;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda0;
import o.RippleKtExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted {
    private final DrawerStateExternalSyntheticLambda2 IAuthTabCallback;
    private ComposableSingletonsScaffoldKtExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private RippleKtExternalSyntheticLambda0.onExtraCallback asInterface;
    private SelectionRegistrarImplExternalSyntheticLambda1 onExtraCallback;
    private ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted onExtraCallbackWithResult;
    private TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onNavigationEvent;
    private int onWarmupCompleted;
    private final Map<Integer, Supplier<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback>> onTransact = new HashMap();
    private final Map<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> asBinder = new HashMap();
    private boolean IAuthTabCallbackStub = true;

    public BackdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted(DrawerStateExternalSyntheticLambda2 drawerStateExternalSyntheticLambda2, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda2;
        this.asInterface = onextracallback;
    }

    public int[] onWarmupCompleted() {
        onExtraCallback();
        return Ints.toArray(this.onTransact.keySet());
    }

    public BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onNavigationEvent(int i2) throws ClassNotFoundException {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onextracallback = this.asBinder.get(Integer.valueOf(i2));
        if (onextracallback != null) {
            return onextracallback;
        }
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onextracallback2 = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallback) onExtraCallback(i2).get();
        ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        if (onwarmupcompleted != null) {
            onextracallback2.onExtraCallbackWithResult(onwarmupcompleted);
        }
        SelectionRegistrarImplExternalSyntheticLambda1 selectionRegistrarImplExternalSyntheticLambda1 = this.onExtraCallback;
        if (selectionRegistrarImplExternalSyntheticLambda1 != null) {
            onextracallback2.onExtraCallbackWithResult(selectionRegistrarImplExternalSyntheticLambda1);
        }
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5 = this.IAuthTabCallbackDefault;
        if (composableSingletonsScaffoldKtExternalSyntheticLambda5 != null) {
            onextracallback2.onNavigationEvent(composableSingletonsScaffoldKtExternalSyntheticLambda5);
        }
        onextracallback2.onNavigationEvent(this.asInterface);
        onextracallback2.IAuthTabCallback(this.IAuthTabCallbackStub);
        onextracallback2.onNavigationEvent(this.onWarmupCompleted);
        this.asBinder.put(Integer.valueOf(i2), onextracallback2);
        return onextracallback2;
    }

    public void onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
        if (onextracallback != this.onNavigationEvent) {
            this.onNavigationEvent = onextracallback;
            this.onTransact.clear();
            this.asBinder.clear();
        }
    }

    public void onNavigationEvent(boolean z) {
        this.IAuthTabCallbackStub = z;
        this.IAuthTabCallback.onExtraCallback(z);
        Iterator<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> it = this.asBinder.values().iterator();
        while (it.hasNext()) {
            it.next().IAuthTabCallback(z);
        }
    }

    public void onWarmupCompleted(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this.asInterface = onextracallback;
        this.IAuthTabCallback.onExtraCallbackWithResult(onextracallback);
        Iterator<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> it = this.asBinder.values().iterator();
        while (it.hasNext()) {
            it.next().onNavigationEvent(onextracallback);
        }
    }

    public void IAuthTabCallback(int i2) {
        this.onWarmupCompleted = i2;
        this.IAuthTabCallback.onExtraCallback(i2);
    }

    public void onWarmupCompleted(ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
        this.onExtraCallbackWithResult = onwarmupcompleted;
        Iterator<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> it = this.asBinder.values().iterator();
        while (it.hasNext()) {
            it.next().onExtraCallbackWithResult(onwarmupcompleted);
        }
    }

    public void IAuthTabCallback(SelectionRegistrarImplExternalSyntheticLambda1 selectionRegistrarImplExternalSyntheticLambda1) {
        this.onExtraCallback = selectionRegistrarImplExternalSyntheticLambda1;
        Iterator<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> it = this.asBinder.values().iterator();
        while (it.hasNext()) {
            it.next().onExtraCallbackWithResult(selectionRegistrarImplExternalSyntheticLambda1);
        }
    }

    public void onExtraCallback(ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5) {
        this.IAuthTabCallbackDefault = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        Iterator<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> it = this.asBinder.values().iterator();
        while (it.hasNext()) {
            it.next().onNavigationEvent(composableSingletonsScaffoldKtExternalSyntheticLambda5);
        }
    }

    public void onWarmupCompleted(int i2) {
        DrawerStateExternalSyntheticLambda2 drawerStateExternalSyntheticLambda2 = this.IAuthTabCallback;
        if (drawerStateExternalSyntheticLambda2 instanceof DrawerKtExternalSyntheticLambda7) {
            ((DrawerKtExternalSyntheticLambda7) drawerStateExternalSyntheticLambda2).onExtraCallbackWithResult(i2);
        }
    }

    private void onExtraCallback() {
        onExtraCallbackWithResult(0);
        onExtraCallbackWithResult(1);
        onExtraCallbackWithResult(2);
        onExtraCallbackWithResult(3);
        onExtraCallbackWithResult(4);
    }

    private Supplier<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> onExtraCallbackWithResult(int i2) {
        try {
            return onExtraCallback(i2);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Supplier<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> onExtraCallback(int i2) throws ClassNotFoundException {
        Supplier<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> supplier;
        Supplier<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> supplier2;
        Supplier<BottomDrawerStateExternalSyntheticLambda2.onExtraCallback> supplier3 = this.onTransact.get(Integer.valueOf(i2));
        if (supplier3 != null) {
            return supplier3;
        }
        final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback = (TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent);
        if (i2 == 0) {
            final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(BottomDrawerStateExternalSyntheticLambda2.onExtraCallback.class);
            supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                public final Object get() {
                    return BackdropScaffoldKtExternalSyntheticLambda9.IAuthTabCallback(clsAsSubclass, onextracallback);
                }
            };
        } else if (i2 == 1) {
            final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(BottomDrawerStateExternalSyntheticLambda2.onExtraCallback.class);
            supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1
                public final Object get() {
                    return BackdropScaffoldKtExternalSyntheticLambda9.IAuthTabCallback(clsAsSubclass2, onextracallback);
                }
            };
        } else if (i2 == 2) {
            final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(BottomDrawerStateExternalSyntheticLambda2.onExtraCallback.class);
            supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda2
                public final Object get() {
                    return BackdropScaffoldKtExternalSyntheticLambda9.IAuthTabCallback(clsAsSubclass3, onextracallback);
                }
            };
        } else {
            if (i2 == 3) {
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(BottomDrawerStateExternalSyntheticLambda2.onExtraCallback.class);
                supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda3
                    public final Object get() {
                        return BackdropScaffoldKtExternalSyntheticLambda9.onWarmupCompleted(clsAsSubclass4);
                    }
                };
            } else if (i2 == 4) {
                supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda4
                    public final Object get() {
                        return BackdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted.onExtraCallbackWithResult(this.f$0, onextracallback);
                    }
                };
            } else {
                throw new IllegalArgumentException("Unrecognized contentType: " + i2);
            }
            this.onTransact.put(Integer.valueOf(i2), supplier2);
            return supplier2;
        }
        supplier2 = supplier;
        this.onTransact.put(Integer.valueOf(i2), supplier2);
        return supplier2;
    }

    public static /* synthetic */ BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onExtraCallbackWithResult(BackdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted backdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted, TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
        return new BottomNavigationKtExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallback, backdropScaffoldKtExternalSyntheticLambda9$onWarmupCompleted.IAuthTabCallback);
    }
}
