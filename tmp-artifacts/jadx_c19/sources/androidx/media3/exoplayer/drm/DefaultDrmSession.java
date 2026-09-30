package androidx.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DrmSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0;
import o.BadgeKtExternalSyntheticLambda0;
import o.BadgeKtExternalSyntheticLambda2;
import o.BasicTextContextMenuProviderExternalSyntheticLambda0;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent;
import o.RecordingInputConnection_androidKt;
import o.SelectionManagerExternalSyntheticLambda12;
import o.SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
import o.SelectionManager_androidKtExternalSyntheticLambda9;
import o.SimpleLayoutKtExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda10;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda11;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda18;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.TextFieldSelectionManagerExternalSyntheticLambda1;
import o.TextFieldSelectionManagerKtExternalSyntheticLambda2;
import o.TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1;
import o.TextFieldSelectionState_androidKtExternalSyntheticLambda4;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DefaultDrmSession implements DrmSession {
    public final List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda11<SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted> IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final Looper IAuthTabCallback_Parcel;
    private onExtraCallback ICustomTabsCallback;
    private final SimpleLayoutKtExternalSyntheticLambda0 access000;
    private final boolean access100;
    private DrmSession.DrmSessionException asBinder;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 asInterface;
    private int extraCallback;
    private final onNavigationEvent extraCallbackWithResult;
    private byte[] getInterfaceDescriptor;
    private byte[] onActivityLayout;
    private int onActivityResized;
    private TextFieldSelectionState_androidKtExternalSyntheticLambda4 onExtraCallback;
    private final TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final IAuthTabCallback onMessageChannelReady;
    private final UUID onMinimized;
    private SimpleLayoutKtExternalSyntheticLambda0.onExtraCallback onNavigationEvent;
    private HandlerThread onPostMessage;
    private final HashMap<String, String> onTransact;
    private SimpleLayoutKtExternalSyntheticLambda0.onTransact onWarmupCompleted;
    private final onExtraCallbackWithResult readTypedObject;
    private final SelectionManagerExternalSyntheticLambda12 writeTypedObject;

    public interface onExtraCallbackWithResult {
        void IAuthTabCallback();

        void IAuthTabCallback(Exception exc, boolean z);

        void onWarmupCompleted(DefaultDrmSession defaultDrmSession);
    }

    public interface onNavigationEvent {
        void onNavigationEvent(DefaultDrmSession defaultDrmSession, int i2);

        void onWarmupCompleted(DefaultDrmSession defaultDrmSession, int i2);
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, SimpleLayoutKtExternalSyntheticLambda0 simpleLayoutKtExternalSyntheticLambda0, onExtraCallbackWithResult onextracallbackwithresult, onNavigationEvent onnavigationevent, @Nullable List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> list, int i2, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> map, TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1 textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1, Looper looper, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        this.onMinimized = uuid;
        this.readTypedObject = onextracallbackwithresult;
        this.extraCallbackWithResult = onnavigationevent;
        this.access000 = simpleLayoutKtExternalSyntheticLambda0;
        this.IAuthTabCallbackStubProxy = i2;
        this.access100 = z;
        this.IAuthTabCallbackStub = z2;
        if (bArr != null) {
            this.getInterfaceDescriptor = bArr;
            this.IAuthTabCallback = null;
        } else {
            this.IAuthTabCallback = Collections.unmodifiableList((List) RecordingInputConnection_androidKt.onExtraCallbackWithResult(list));
        }
        this.onTransact = map;
        this.onExtraCallbackWithResult = textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1;
        this.IAuthTabCallbackDefault = new TextFieldDecoratorModifierNodeExternalSyntheticLambda11<>();
        this.asInterface = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.writeTypedObject = selectionManagerExternalSyntheticLambda12;
        this.onActivityResized = 2;
        this.IAuthTabCallback_Parcel = looper;
        this.onMessageChannelReady = new IAuthTabCallback(looper);
    }

    public boolean IAuthTabCallback(byte[] bArr) {
        access100();
        return Arrays.equals(this.onActivityLayout, bArr);
    }

    public void onWarmupCompleted(int i2) {
        if (i2 != 2) {
            return;
        }
        IAuthTabCallback_Parcel();
    }

    public void asInterface() {
        this.onWarmupCompleted = this.access000.onExtraCallback();
        Object[] objArr = {this.ICustomTabsCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((onExtraCallback) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(1, RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted), true);
    }

    public void IAuthTabCallbackDefault() {
        if (IAuthTabCallbackStubProxy()) {
            onWarmupCompleted(true);
        }
    }

    public void onExtraCallbackWithResult(Exception exc, boolean z) {
        onNavigationEvent(exc, z ? 1 : 3);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int onNavigationEvent() {
        access100();
        return this.onActivityResized;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean onTransact() {
        access100();
        return this.access100;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException IAuthTabCallback() {
        access100();
        if (this.onActivityResized == 1) {
            return this.asBinder;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID onExtraCallbackWithResult() {
        access100();
        return this.onMinimized;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final TextFieldSelectionState_androidKtExternalSyntheticLambda4 onExtraCallback() {
        access100();
        return this.onExtraCallback;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> IAuthTabCallbackStub() {
        access100();
        byte[] bArr = this.onActivityLayout;
        if (bArr == null) {
            return null;
        }
        return this.access000.onExtraCallbackWithResult(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public byte[] onWarmupCompleted() {
        access100();
        return this.getInterfaceDescriptor;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean onNavigationEvent(String str) {
        access100();
        return this.access000.onExtraCallbackWithResult((byte[]) RecordingInputConnection_androidKt.onWarmupCompleted(this.onActivityLayout), str);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void IAuthTabCallback(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
        access100();
        if (this.extraCallback < 0) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultDrmSession", "Session reference count less than zero: " + this.extraCallback);
            this.extraCallback = 0;
        }
        if (selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted != null) {
            this.IAuthTabCallbackDefault.onExtraCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        }
        int i2 = this.extraCallback + 1;
        this.extraCallback = i2;
        if (i2 == 1) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onActivityResized == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.onPostMessage = handlerThread;
            handlerThread.start();
            this.ICustomTabsCallback = new onExtraCallback(this.onPostMessage.getLooper());
            if (IAuthTabCallbackStubProxy()) {
                onWarmupCompleted(true);
            }
        } else if (selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted != null && access000() && this.IAuthTabCallbackDefault.onExtraCallbackWithResult(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) == 1) {
            selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onWarmupCompleted(this.onActivityResized);
        }
        this.extraCallbackWithResult.onWarmupCompleted(this, this.extraCallback);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void onExtraCallbackWithResult(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
        access100();
        int i2 = this.extraCallback;
        if (i2 <= 0) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.extraCallback = i3;
        if (i3 == 0) {
            this.onActivityResized = 0;
            Object[] objArr = {this.onMessageChannelReady};
            ((IAuthTabCallback) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742)).removeCallbacksAndMessages(null);
            Object[] objArr2 = {this.ICustomTabsCallback};
            ((onExtraCallback) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -1084655742)).onExtraCallback();
            this.ICustomTabsCallback = null;
            Object[] objArr3 = {this.onPostMessage};
            ((HandlerThread) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr3, -1084655742)).quit();
            this.onPostMessage = null;
            this.onExtraCallback = null;
            this.asBinder = null;
            this.onNavigationEvent = null;
            this.onWarmupCompleted = null;
            byte[] bArr = this.onActivityLayout;
            if (bArr != null) {
                this.access000.onWarmupCompleted(bArr);
                this.onActivityLayout = null;
            }
        }
        if (selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted != null) {
            this.IAuthTabCallbackDefault.onNavigationEvent(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
            if (this.IAuthTabCallbackDefault.onExtraCallbackWithResult(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) == 0) {
                selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallback();
            }
        }
        this.extraCallbackWithResult.onNavigationEvent(this, this.extraCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    @EnsuresNonNullIf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallbackStubProxy() {
        if (access000()) {
            return true;
        }
        try {
            byte[] bArrIAuthTabCallback = this.access000.IAuthTabCallback();
            this.onActivityLayout = bArrIAuthTabCallback;
            this.access000.IAuthTabCallback(bArrIAuthTabCallback, this.writeTypedObject);
            this.onExtraCallback = this.access000.IAuthTabCallback(this.onActivityLayout);
            final int i2 = 3;
            this.onActivityResized = 3;
            onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda0
                public final void accept(Object obj) {
                    ((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) obj).onWarmupCompleted(i2);
                }
            });
            return true;
        } catch (NotProvisionedException unused) {
            this.readTypedObject.onWarmupCompleted(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (!SelectionManager_androidKtExternalSyntheticLambda9.onExtraCallback(e)) {
                this.readTypedObject.onWarmupCompleted(this);
                return false;
            }
            onNavigationEvent(e, 1);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (!SelectionManager_androidKtExternalSyntheticLambda9.onExtraCallback(e)) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(Object obj, Object obj2) {
        if (obj == this.onWarmupCompleted) {
            if (this.onActivityResized == 2 || access000()) {
                this.onWarmupCompleted = null;
                if (obj2 instanceof Exception) {
                    this.readTypedObject.IAuthTabCallback((Exception) obj2, false);
                    return;
                }
                try {
                    this.access000.onExtraCallback((byte[]) obj2);
                    this.readTypedObject.IAuthTabCallback();
                } catch (Exception e) {
                    this.readTypedObject.IAuthTabCallback(e, true);
                }
            }
        }
    }

    @RequiresNonNull
    private void onWarmupCompleted(boolean z) {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        Object[] objArr = {this.onActivityLayout};
        byte[] bArr = (byte[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742);
        int i2 = this.IAuthTabCallbackStubProxy;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    IAuthTabCallback(this.getInterfaceDescriptor, 3, z);
                    return;
                }
                return;
            } else {
                if (this.getInterfaceDescriptor == null || getInterfaceDescriptor()) {
                    IAuthTabCallback(bArr, 2, z);
                    return;
                }
                return;
            }
        }
        if (this.getInterfaceDescriptor == null) {
            IAuthTabCallback(bArr, 1, z);
            return;
        }
        if (this.onActivityResized == 4 || getInterfaceDescriptor()) {
            long jAsBinder = asBinder();
            if (this.IAuthTabCallbackStubProxy != 0 || jAsBinder > 60) {
                if (jAsBinder <= 0) {
                    onNavigationEvent(new TextFieldSelectionManagerExternalSyntheticLambda1(), 2);
                    return;
                } else {
                    this.onActivityResized = 4;
                    onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda4
                        public final void accept(Object obj) {
                            ((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) obj).onExtraCallbackWithResult();
                        }
                    });
                    return;
                }
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onNavigationEvent("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jAsBinder);
            IAuthTabCallback(bArr, 2, z);
        }
    }

    @RequiresNonNull
    private boolean getInterfaceDescriptor() {
        try {
            this.access000.onWarmupCompleted(this.onActivityLayout, this.getInterfaceDescriptor);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            onNavigationEvent(e, 1);
            return false;
        }
    }

    private long asBinder() {
        if (!AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallback.equals(this.onMinimized)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TextFieldSelectionManagerKtExternalSyntheticLambda2.onExtraCallback(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void IAuthTabCallback(byte[] bArr, int i2, boolean z) {
        try {
            this.onNavigationEvent = this.access000.onNavigationEvent(bArr, this.IAuthTabCallback, i2, this.onTransact);
            Object[] objArr = {this.ICustomTabsCallback};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
            Object obj = objOnNavigationEvent;
            ((onExtraCallback) objOnNavigationEvent).onWarmupCompleted(2, RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent), z);
        } catch (Exception | NoSuchMethodError e) {
            onNavigationEvent(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(Object obj, Object obj2) {
        if (obj == this.onNavigationEvent && access000()) {
            this.onNavigationEvent = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                onNavigationEvent((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.IAuthTabCallbackStubProxy == 3) {
                    SimpleLayoutKtExternalSyntheticLambda0 simpleLayoutKtExternalSyntheticLambda0 = this.access000;
                    Object[] objArr = {this.getInterfaceDescriptor};
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
                    Object obj3 = objOnNavigationEvent;
                    simpleLayoutKtExternalSyntheticLambda0.onNavigationEvent((byte[]) objOnNavigationEvent, bArr);
                    onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda1
                        public final void accept(Object obj4) {
                            ((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) obj4).onWarmupCompleted();
                        }
                    });
                    return;
                }
                byte[] bArrOnNavigationEvent = this.access000.onNavigationEvent(this.onActivityLayout, bArr);
                int i2 = this.IAuthTabCallbackStubProxy;
                if ((i2 == 2 || (i2 == 0 && this.getInterfaceDescriptor != null)) && bArrOnNavigationEvent != null && bArrOnNavigationEvent.length != 0) {
                    this.getInterfaceDescriptor = bArrOnNavigationEvent;
                }
                this.onActivityResized = 4;
                onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda2
                    public final void accept(Object obj4) {
                        ((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) obj4).IAuthTabCallback();
                    }
                });
            } catch (Exception | NoSuchMethodError e) {
                onNavigationEvent(e, true);
            }
        }
    }

    private void IAuthTabCallback_Parcel() {
        if (this.IAuthTabCallbackStubProxy == 0 && this.onActivityResized == 4) {
            Object[] objArr = {this.onActivityLayout};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
            onWarmupCompleted(false);
        }
    }

    private void onNavigationEvent(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || SelectionManager_androidKtExternalSyntheticLambda9.onExtraCallback(th)) {
            this.readTypedObject.onWarmupCompleted(this);
        } else {
            onNavigationEvent(th, z ? 1 : 2);
        }
    }

    private void onNavigationEvent(final Throwable th, int i2) {
        this.asBinder = new DrmSession.DrmSessionException(th, SelectionManager_androidKtExternalSyntheticLambda9.onExtraCallback(th, i2));
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda3
                public final void accept(Object obj) {
                    ((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) obj).onExtraCallback((Exception) th);
                }
            });
        } else if (th instanceof Error) {
            if (!SelectionManager_androidKtExternalSyntheticLambda9.onNavigationEvent(th) && !SelectionManager_androidKtExternalSyntheticLambda9.onExtraCallback(th)) {
                throw ((Error) th);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.onActivityResized != 4) {
            this.onActivityResized = 1;
        }
    }

    @EnsuresNonNullIf
    private boolean access000() {
        int i2 = this.onActivityResized;
        return i2 == 3 || i2 == 4;
    }

    private void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda10<SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        Iterator<SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted> it = this.IAuthTabCallbackDefault.onExtraCallbackWithResult().iterator();
        while (it.hasNext()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(it.next());
        }
    }

    private void access100() {
        if (Thread.currentThread() != this.IAuthTabCallback_Parcel.getThread()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.IAuthTabCallback_Parcel.getThread().getName(), new IllegalStateException());
        }
    }

    class IAuthTabCallback extends Handler {
        public IAuthTabCallback(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 1) {
                DefaultDrmSession.this.onExtraCallback(obj, obj2);
            } else {
                if (i2 != 2) {
                    return;
                }
                DefaultDrmSession.this.onWarmupCompleted(obj, obj2);
            }
        }
    }

    class onExtraCallback extends Handler {
        private boolean onExtraCallback;

        public onExtraCallback(Looper looper) {
            super(looper);
        }

        void onWarmupCompleted(int i2, Object obj, boolean z) {
            obtainMessage(i2, new onWarmupCompleted(BadgeKtExternalSyntheticLambda0.onExtraCallback(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable thOnNavigationEvent;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) message.obj;
            try {
                int i2 = message.what;
                if (i2 == 1) {
                    thOnNavigationEvent = DefaultDrmSession.this.onExtraCallbackWithResult.onNavigationEvent(DefaultDrmSession.this.onMinimized, (SimpleLayoutKtExternalSyntheticLambda0.onTransact) onwarmupcompleted.onExtraCallback);
                } else if (i2 == 2) {
                    thOnNavigationEvent = DefaultDrmSession.this.onExtraCallbackWithResult.onNavigationEvent(DefaultDrmSession.this.onMinimized, (SimpleLayoutKtExternalSyntheticLambda0.onExtraCallback) onwarmupcompleted.onExtraCallback);
                } else {
                    throw new RuntimeException();
                }
            } catch (MediaDrmCallbackException e) {
                boolean zOnNavigationEvent = onNavigationEvent(message, e);
                thOnNavigationEvent = e;
                if (zOnNavigationEvent) {
                    return;
                }
            } catch (Exception e2) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                thOnNavigationEvent = e2;
            }
            ComposableSingletonsScaffoldKtExternalSyntheticLambda5 unused = DefaultDrmSession.this.asInterface;
            long j = onwarmupcompleted.onExtraCallbackWithResult;
            synchronized (this) {
                if (!this.onExtraCallback) {
                    DefaultDrmSession.this.onMessageChannelReady.obtainMessage(message.what, Pair.create(onwarmupcompleted.onExtraCallback, thOnNavigationEvent)).sendToTarget();
                }
            }
        }

        private boolean onNavigationEvent(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            IOException unexpectedDrmSessionException;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) message.obj;
            if (!onwarmupcompleted.IAuthTabCallback) {
                return false;
            }
            int i2 = onwarmupcompleted.onNavigationEvent + 1;
            onwarmupcompleted.onNavigationEvent = i2;
            if (i2 > DefaultDrmSession.this.asInterface.IAuthTabCallback(3)) {
                return false;
            }
            BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(onwarmupcompleted.onExtraCallbackWithResult, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - onwarmupcompleted.onWarmupCompleted, mediaDrmCallbackException.bytesLoaded);
            BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2 = new BadgeKtExternalSyntheticLambda2(3);
            if (mediaDrmCallbackException.getCause() instanceof IOException) {
                unexpectedDrmSessionException = (IOException) mediaDrmCallbackException.getCause();
            } else {
                unexpectedDrmSessionException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            long jOnWarmupCompleted = DefaultDrmSession.this.asInterface.onWarmupCompleted(new ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent(badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, unexpectedDrmSessionException, onwarmupcompleted.onNavigationEvent));
            if (jOnWarmupCompleted == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.onExtraCallback) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jOnWarmupCompleted);
                return true;
            }
        }

        public void onExtraCallback() {
            synchronized (this) {
                removeCallbacksAndMessages(null);
                this.onExtraCallback = true;
            }
        }
    }

    static final class onWarmupCompleted {
        public final boolean IAuthTabCallback;
        public final Object onExtraCallback;
        public final long onExtraCallbackWithResult;
        public int onNavigationEvent;
        public final long onWarmupCompleted;

        public onWarmupCompleted(long j, boolean z, long j2, Object obj) {
            this.onExtraCallbackWithResult = j;
            this.IAuthTabCallback = z;
            this.onWarmupCompleted = j2;
            this.onExtraCallback = obj;
        }
    }
}
