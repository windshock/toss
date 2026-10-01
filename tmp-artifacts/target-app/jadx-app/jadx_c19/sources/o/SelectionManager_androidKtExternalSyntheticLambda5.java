package o;

import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import o.BasicTextContextMenuProviderExternalSyntheticLambda0;
import o.SelectionManager_androidKtExternalSyntheticLambda5;
import o.SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
import o.SelectionRegistrarImplExternalSyntheticLambda0;
import o.SimpleLayoutKtExternalSyntheticLambda0;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda5 implements SelectionRegistrarImplExternalSyntheticLambda0 {
    volatile onNavigationEvent IAuthTabCallback;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private final HashMap<String, String> IAuthTabCallbackStub;
    private DefaultDrmSession IAuthTabCallbackStubProxy;
    private Handler IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final boolean access000;
    private byte[] access100;
    private final boolean asBinder;
    private int asInterface;
    private SelectionManagerExternalSyntheticLambda12 extraCallback;
    private final Set<onExtraCallback> extraCallbackWithResult;
    private DefaultDrmSession getInterfaceDescriptor;
    private final onTransact onActivityLayout;
    private final long onActivityResized;
    private final TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final int[] onMessageChannelReady;
    private final List<DefaultDrmSession> onMinimized;
    private final SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub onNavigationEvent;
    private final UUID onPostMessage;
    private final Set<DefaultDrmSession> onTransact;
    private SimpleLayoutKtExternalSyntheticLambda0 onWarmupCompleted;
    private Looper readTypedObject;
    private final asInterface writeTypedObject;

    public static final class onWarmupCompleted {
        private boolean IAuthTabCallback;
        private final HashMap<String, String> onNavigationEvent = new HashMap<>();
        private UUID asBinder = AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallback;
        private SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub onWarmupCompleted = SelectionRegistrarImplExternalSyntheticLambda2.onExtraCallbackWithResult;
        private int[] onTransact = new int[0];
        private boolean onExtraCallbackWithResult = true;
        private ComposableSingletonsScaffoldKtExternalSyntheticLambda5 onExtraCallback = new ComposableSingletonsScaffoldKtExternalSyntheticLambda4();
        private long IAuthTabCallbackStub = 300000;

        public onWarmupCompleted onWarmupCompleted(UUID uuid, SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub iAuthTabCallbackStub) {
            this.asBinder = (UUID) RecordingInputConnection_androidKt.onExtraCallbackWithResult(uuid);
            this.onWarmupCompleted = (SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallbackStub);
            return this;
        }

        public onWarmupCompleted onWarmupCompleted(boolean z) {
            this.IAuthTabCallback = z;
            return this;
        }

        public onWarmupCompleted IAuthTabCallback(int... iArr) {
            for (int i2 : iArr) {
                boolean z = true;
                if (i2 != 2 && i2 != 1) {
                    z = false;
                }
                RecordingInputConnection_androidKt.onNavigationEvent(z);
            }
            this.onTransact = (int[]) iArr.clone();
            return this;
        }

        public onWarmupCompleted onExtraCallbackWithResult(boolean z) {
            this.onExtraCallbackWithResult = z;
            return this;
        }

        public onWarmupCompleted onExtraCallbackWithResult(ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5) {
            this.onExtraCallback = (ComposableSingletonsScaffoldKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(composableSingletonsScaffoldKtExternalSyntheticLambda5);
            return this;
        }

        public SelectionManager_androidKtExternalSyntheticLambda5 onExtraCallback(TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1 textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1) {
            return new SelectionManager_androidKtExternalSyntheticLambda5(this.asBinder, this.onWarmupCompleted, textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1, this.onNavigationEvent, this.IAuthTabCallback, this.onTransact, this.onExtraCallbackWithResult, this.onExtraCallback, this.IAuthTabCallbackStub);
        }
    }

    public static final class onExtraCallbackWithResult extends Exception {
        private onExtraCallbackWithResult(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private SelectionManager_androidKtExternalSyntheticLambda5(UUID uuid, SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub iAuthTabCallbackStub, TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1 textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, long j) {
        RecordingInputConnection_androidKt.onExtraCallback(!AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.onPostMessage = uuid;
        this.onNavigationEvent = iAuthTabCallbackStub;
        this.onExtraCallbackWithResult = textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1;
        this.IAuthTabCallbackStub = map;
        this.asBinder = z;
        this.onMessageChannelReady = iArr;
        this.access000 = z2;
        this.IAuthTabCallbackDefault = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.writeTypedObject = new asInterface();
        this.onActivityLayout = new onTransact();
        this.asInterface = 0;
        this.onMinimized = new ArrayList();
        this.extraCallbackWithResult = Sets.newIdentityHashSet();
        this.onTransact = Sets.newIdentityHashSet();
        this.onActivityResized = j;
    }

    public void onNavigationEvent(int i2, @Nullable byte[] bArr) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onMinimized.isEmpty());
        this.asInterface = i2;
        this.access100 = bArr;
    }

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
    public final void IAuthTabCallback() {
        onNavigationEvent(true);
        int i2 = this.ICustomTabsCallback;
        this.ICustomTabsCallback = i2 + 1;
        if (i2 == 0) {
            if (this.onWarmupCompleted == null) {
                SimpleLayoutKtExternalSyntheticLambda0 simpleLayoutKtExternalSyntheticLambda0AcquireExoMediaDrm = this.onNavigationEvent.acquireExoMediaDrm(this.onPostMessage);
                this.onWarmupCompleted = simpleLayoutKtExternalSyntheticLambda0AcquireExoMediaDrm;
                simpleLayoutKtExternalSyntheticLambda0AcquireExoMediaDrm.IAuthTabCallback(new IAuthTabCallback());
            } else if (this.onActivityResized != -9223372036854775807L) {
                for (int i3 = 0; i3 < this.onMinimized.size(); i3++) {
                    this.onMinimized.get(i3).IAuthTabCallback((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) null);
                }
            }
        }
    }

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
    public final void onExtraCallbackWithResult() {
        onNavigationEvent(true);
        int i2 = this.ICustomTabsCallback - 1;
        this.ICustomTabsCallback = i2;
        if (i2 != 0) {
            return;
        }
        if (this.onActivityResized != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.onMinimized);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((DefaultDrmSession) arrayList.get(i3)).onExtraCallbackWithResult((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) null);
            }
        }
        onNavigationEvent();
        onExtraCallback();
    }

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
    public void IAuthTabCallback(Looper looper, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        onNavigationEvent(looper);
        this.extraCallback = selectionManagerExternalSyntheticLambda12;
    }

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
    public SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted onNavigationEvent(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsCallback > 0);
        RecordingInputConnection_androidKt.onWarmupCompleted(this.readTypedObject);
        onExtraCallback onextracallback = new onExtraCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        onextracallback.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        return onextracallback;
    }

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
    public DrmSession onExtraCallbackWithResult(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        onNavigationEvent(false);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsCallback > 0);
        RecordingInputConnection_androidKt.onWarmupCompleted(this.readTypedObject);
        return IAuthTabCallback(this.readTypedObject, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, basicTextContextMenuProviderKtExternalSyntheticLambda4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession IAuthTabCallback(Looper looper, @Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z) {
        List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> listOnNavigationEvent;
        IAuthTabCallback(looper);
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
        if (basicTextContextMenuProviderExternalSyntheticLambda0 == null) {
            return onExtraCallback(AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable), z);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.access100 == null) {
            listOnNavigationEvent = onNavigationEvent((BasicTextContextMenuProviderExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderExternalSyntheticLambda0), this.onPostMessage, false);
            if (listOnNavigationEvent.isEmpty()) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.onPostMessage);
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultDrmSessionMgr", "DRM error", onextracallbackwithresult);
                if (selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted != null) {
                    selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallback(onextracallbackwithresult);
                }
                return new SelectionRegistrarImplExternalSyntheticLambda3(new DrmSession.DrmSessionException(onextracallbackwithresult, 6003));
            }
        } else {
            listOnNavigationEvent = null;
        }
        if (!this.asBinder) {
            defaultDrmSession = this.getInterfaceDescriptor;
        } else {
            Iterator<DefaultDrmSession> it = this.onMinimized.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Objects.equals(next.IAuthTabCallback, listOnNavigationEvent)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionOnNavigationEvent = onNavigationEvent(listOnNavigationEvent, false, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, z);
            if (!this.asBinder) {
                this.getInterfaceDescriptor = defaultDrmSessionOnNavigationEvent;
            }
            this.onMinimized.add(defaultDrmSessionOnNavigationEvent);
            return defaultDrmSessionOnNavigationEvent;
        }
        defaultDrmSession.IAuthTabCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        return defaultDrmSession;
    }

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
    public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        onNavigationEvent(false);
        int iOnNavigationEvent = ((SimpleLayoutKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).onNavigationEvent();
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
        if (basicTextContextMenuProviderExternalSyntheticLambda0 == null) {
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.onMessageChannelReady, AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) == -1) {
                return 0;
            }
        } else if (!onWarmupCompleted(basicTextContextMenuProviderExternalSyntheticLambda0)) {
            return 1;
        }
        return iOnNavigationEvent;
    }

    private DrmSession onExtraCallback(int i2, boolean z) {
        SimpleLayoutKtExternalSyntheticLambda0 simpleLayoutKtExternalSyntheticLambda0 = (SimpleLayoutKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted);
        if ((simpleLayoutKtExternalSyntheticLambda0.onNavigationEvent() == 2 && SelectionRegistrarKtExternalSyntheticLambda0.onWarmupCompleted) || TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.onMessageChannelReady, i2) == -1 || simpleLayoutKtExternalSyntheticLambda0.onNavigationEvent() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.IAuthTabCallbackStubProxy;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionOnNavigationEvent = onNavigationEvent(ImmutableList.of(), true, null, z);
            this.onMinimized.add(defaultDrmSessionOnNavigationEvent);
            this.IAuthTabCallbackStubProxy = defaultDrmSessionOnNavigationEvent;
        } else {
            defaultDrmSession.IAuthTabCallback((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) null);
        }
        return this.IAuthTabCallbackStubProxy;
    }

    private boolean onWarmupCompleted(BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
        if (this.access100 != null) {
            return true;
        }
        if (onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0, this.onPostMessage, true).isEmpty()) {
            if (basicTextContextMenuProviderExternalSyntheticLambda0.onExtraCallback != 1 || !basicTextContextMenuProviderExternalSyntheticLambda0.onNavigationEvent(0).onExtraCallback(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult)) {
                return false;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.onPostMessage);
        }
        String str = basicTextContextMenuProviderExternalSyntheticLambda0.onWarmupCompleted;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? Build.VERSION.SDK_INT >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    @EnsuresNonNull
    private void onNavigationEvent(Looper looper) {
        synchronized (this) {
            Looper looper2 = this.readTypedObject;
            if (looper2 == null) {
                this.readTypedObject = looper;
                this.IAuthTabCallback_Parcel = new Handler(looper);
            } else {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(looper2 == looper);
            }
        }
    }

    private void IAuthTabCallback(Looper looper) {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = new onNavigationEvent(looper);
        }
    }

    private DefaultDrmSession onNavigationEvent(@Nullable List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> list, boolean z, @Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, boolean z2) {
        DefaultDrmSession defaultDrmSessionOnWarmupCompleted = onWarmupCompleted(list, z, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        if (IAuthTabCallback(defaultDrmSessionOnWarmupCompleted) && !this.onTransact.isEmpty()) {
            onWarmupCompleted();
            onNavigationEvent(defaultDrmSessionOnWarmupCompleted, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
            defaultDrmSessionOnWarmupCompleted = onWarmupCompleted(list, z, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        }
        if (!IAuthTabCallback(defaultDrmSessionOnWarmupCompleted) || !z2 || this.extraCallbackWithResult.isEmpty()) {
            return defaultDrmSessionOnWarmupCompleted;
        }
        onNavigationEvent();
        if (!this.onTransact.isEmpty()) {
            onWarmupCompleted();
        }
        onNavigationEvent(defaultDrmSessionOnWarmupCompleted, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        return onWarmupCompleted(list, z, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
    }

    private static boolean IAuthTabCallback(DrmSession drmSession) {
        if (drmSession.onNavigationEvent() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) RecordingInputConnection_androidKt.onExtraCallbackWithResult(drmSession.IAuthTabCallback())).getCause();
        return (cause instanceof ResourceBusyException) || SelectionManager_androidKtExternalSyntheticLambda9.onNavigationEvent(cause);
    }

    private void onNavigationEvent(DrmSession drmSession, @Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
        drmSession.onExtraCallbackWithResult(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        if (this.onActivityResized != -9223372036854775807L) {
            drmSession.onExtraCallbackWithResult(null);
        }
    }

    private void onWarmupCompleted() {
        UnmodifiableIterator it = ImmutableSet.copyOf(this.onTransact).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).onExtraCallbackWithResult(null);
        }
    }

    private void onNavigationEvent() {
        UnmodifiableIterator it = ImmutableSet.copyOf(this.extraCallbackWithResult).iterator();
        while (it.hasNext()) {
            ((onExtraCallback) it.next()).release();
        }
    }

    private DefaultDrmSession onWarmupCompleted(@Nullable List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> list, boolean z, @Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.onPostMessage, this.onWarmupCompleted, this.writeTypedObject, this.onActivityLayout, list, this.asInterface, this.access000 | z, z, this.access100, this.IAuthTabCallbackStub, this.onExtraCallbackWithResult, (Looper) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.readTypedObject), this.IAuthTabCallbackDefault, (SelectionManagerExternalSyntheticLambda12) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback));
        defaultDrmSession.IAuthTabCallback(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
        if (this.onActivityResized != -9223372036854775807L) {
            defaultDrmSession.IAuthTabCallback((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback() {
        if (this.onWarmupCompleted != null && this.ICustomTabsCallback == 0 && this.onMinimized.isEmpty() && this.extraCallbackWithResult.isEmpty()) {
            ((SimpleLayoutKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).onWarmupCompleted();
            this.onWarmupCompleted = null;
        }
    }

    private void onNavigationEvent(boolean z) {
        if (z && this.readTypedObject == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.readTypedObject)).getThread()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.readTypedObject.getThread().getName(), new IllegalStateException());
        }
    }

    private static List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> onNavigationEvent(BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(basicTextContextMenuProviderExternalSyntheticLambda0.onExtraCallback);
        for (int i2 = 0; i2 < basicTextContextMenuProviderExternalSyntheticLambda0.onExtraCallback; i2++) {
            BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = basicTextContextMenuProviderExternalSyntheticLambda0.onNavigationEvent(i2);
            if ((iAuthTabCallbackOnNavigationEvent.onExtraCallback(uuid) || (AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback.equals(uuid) && iAuthTabCallbackOnNavigationEvent.onExtraCallback(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult))) && (iAuthTabCallbackOnNavigationEvent.onWarmupCompleted != null || z)) {
                arrayList.add(iAuthTabCallbackOnNavigationEvent);
            }
        }
        return arrayList;
    }

    class onNavigationEvent extends Handler {
        public onNavigationEvent(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (DefaultDrmSession defaultDrmSession : SelectionManager_androidKtExternalSyntheticLambda5.this.onMinimized) {
                    if (defaultDrmSession.IAuthTabCallback(bArr)) {
                        defaultDrmSession.onWarmupCompleted(message.what);
                        return;
                    }
                }
            }
        }
    }

    class asInterface implements DefaultDrmSession.onExtraCallbackWithResult {
        private final Set<DefaultDrmSession> IAuthTabCallback = new HashSet();
        private DefaultDrmSession onNavigationEvent;

        public asInterface() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.onExtraCallbackWithResult
        public void onWarmupCompleted(DefaultDrmSession defaultDrmSession) {
            this.IAuthTabCallback.add(defaultDrmSession);
            if (this.onNavigationEvent != null) {
                return;
            }
            this.onNavigationEvent = defaultDrmSession;
            defaultDrmSession.asInterface();
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            this.onNavigationEvent = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf(this.IAuthTabCallback);
            this.IAuthTabCallback.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).IAuthTabCallbackDefault();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.onExtraCallbackWithResult
        public void IAuthTabCallback(Exception exc, boolean z) {
            this.onNavigationEvent = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf(this.IAuthTabCallback);
            this.IAuthTabCallback.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).onExtraCallbackWithResult(exc, z);
            }
        }

        public void onExtraCallbackWithResult(DefaultDrmSession defaultDrmSession) {
            this.IAuthTabCallback.remove(defaultDrmSession);
            if (this.onNavigationEvent == defaultDrmSession) {
                this.onNavigationEvent = null;
                if (this.IAuthTabCallback.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.IAuthTabCallback.iterator().next();
                this.onNavigationEvent = next;
                next.asInterface();
            }
        }
    }

    public class onTransact implements DefaultDrmSession.onNavigationEvent {
        private onTransact() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.onNavigationEvent
        public void onWarmupCompleted(DefaultDrmSession defaultDrmSession, int i2) {
            if (SelectionManager_androidKtExternalSyntheticLambda5.this.onActivityResized != -9223372036854775807L) {
                SelectionManager_androidKtExternalSyntheticLambda5.this.onTransact.remove(defaultDrmSession);
                ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallback_Parcel)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.onNavigationEvent
        public void onNavigationEvent(final DefaultDrmSession defaultDrmSession, int i2) {
            if (i2 == 1 && SelectionManager_androidKtExternalSyntheticLambda5.this.ICustomTabsCallback > 0 && SelectionManager_androidKtExternalSyntheticLambda5.this.onActivityResized != -9223372036854775807L) {
                SelectionManager_androidKtExternalSyntheticLambda5.this.onTransact.add(defaultDrmSession);
                ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallback_Parcel)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.onExtraCallbackWithResult((SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + SelectionManager_androidKtExternalSyntheticLambda5.this.onActivityResized);
            } else if (i2 == 0) {
                SelectionManager_androidKtExternalSyntheticLambda5.this.onMinimized.remove(defaultDrmSession);
                if (SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallbackStubProxy == defaultDrmSession) {
                    SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallbackStubProxy = null;
                }
                if (SelectionManager_androidKtExternalSyntheticLambda5.this.getInterfaceDescriptor == defaultDrmSession) {
                    SelectionManager_androidKtExternalSyntheticLambda5.this.getInterfaceDescriptor = null;
                }
                SelectionManager_androidKtExternalSyntheticLambda5.this.writeTypedObject.onExtraCallbackWithResult(defaultDrmSession);
                if (SelectionManager_androidKtExternalSyntheticLambda5.this.onActivityResized != -9223372036854775807L) {
                    ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallback_Parcel)).removeCallbacksAndMessages(defaultDrmSession);
                    SelectionManager_androidKtExternalSyntheticLambda5.this.onTransact.remove(defaultDrmSession);
                }
            }
            SelectionManager_androidKtExternalSyntheticLambda5.this.onExtraCallback();
        }
    }

    class IAuthTabCallback implements SimpleLayoutKtExternalSyntheticLambda0.onExtraCallbackWithResult {
        private IAuthTabCallback() {
        }

        @Override // o.SimpleLayoutKtExternalSyntheticLambda0.onExtraCallbackWithResult
        public void onNavigationEvent(SimpleLayoutKtExternalSyntheticLambda0 simpleLayoutKtExternalSyntheticLambda0, @Nullable byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
            ((onNavigationEvent) RecordingInputConnection_androidKt.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallback)).obtainMessage(i2, bArr).sendToTarget();
        }
    }

    public class onExtraCallback implements SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted {
        private final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted onExtraCallback;
        private DrmSession onNavigationEvent;
        private boolean onWarmupCompleted;

        public onExtraCallback(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
            this.onExtraCallback = selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
        }

        public void onNavigationEvent(final BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallback_Parcel)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda5.onExtraCallback.onWarmupCompleted(this.f$0, basicTextContextMenuProviderKtExternalSyntheticLambda4);
                }
            });
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            if (SelectionManager_androidKtExternalSyntheticLambda5.this.ICustomTabsCallback == 0 || onextracallback.onWarmupCompleted) {
                return;
            }
            SelectionManager_androidKtExternalSyntheticLambda5 selectionManager_androidKtExternalSyntheticLambda5 = SelectionManager_androidKtExternalSyntheticLambda5.this;
            onextracallback.onNavigationEvent = selectionManager_androidKtExternalSyntheticLambda5.IAuthTabCallback((Looper) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionManager_androidKtExternalSyntheticLambda5.readTypedObject), onextracallback.onExtraCallback, basicTextContextMenuProviderKtExternalSyntheticLambda4, false);
            SelectionManager_androidKtExternalSyntheticLambda5.this.extraCallbackWithResult.add(onextracallback);
        }

        @Override // o.SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted
        public void release() {
            Object[] objArr = {(Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda5.this.IAuthTabCallback_Parcel), new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManager_androidKtExternalSyntheticLambda5.onExtraCallback.onWarmupCompleted(this.f$0);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback) {
            if (onextracallback.onWarmupCompleted) {
                return;
            }
            DrmSession drmSession = onextracallback.onNavigationEvent;
            if (drmSession != null) {
                drmSession.onExtraCallbackWithResult(onextracallback.onExtraCallback);
            }
            SelectionManager_androidKtExternalSyntheticLambda5.this.extraCallbackWithResult.remove(onextracallback);
            onextracallback.onWarmupCompleted = true;
        }
    }
}
