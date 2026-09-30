package androidx.media3.exoplayer.hls;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import o.AlertDialogKtExternalSyntheticLambda1;
import o.AlertDialogKtExternalSyntheticLambda3;
import o.AlertDialogKtExternalSyntheticLambda4;
import o.AlertDialogKtExternalSyntheticLambda5;
import o.AlertDialogKtExternalSyntheticLambda6;
import o.BackdropScaffoldKtExternalSyntheticLambda26;
import o.BackdropScaffoldKtExternalSyntheticLambda3;
import o.BackdropScaffoldKtExternalSyntheticLambda8;
import o.BottomDrawerStateCompanionExternalSyntheticLambda0;
import o.BottomDrawerStateCompanionExternalSyntheticLambda1;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
import o.BottomNavigationKtExternalSyntheticLambda9;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda0;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda3;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda4;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5;
import o.HandwritingDetectorNodeExternalSyntheticLambda0;
import o.RecordingInputConnection_androidKt;
import o.RippleKtExternalSyntheticLambda0;
import o.SelectionManager_androidKtExternalSyntheticLambda7;
import o.SelectionRegistrarImplExternalSyntheticLambda0;
import o.SelectionRegistrarImplExternalSyntheticLambda1;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.TextFieldSelectionManagerKtExternalSyntheticLambda3;
import o.TextFieldSelectionManagerKtExternalSyntheticLambda4;
import o.TextFieldSelectionManagerKtExternalSyntheticLambda5;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda11;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda2;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda8;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda7;
import o.TextFieldStateKtExternalSyntheticLambda0;
import o.TextSelectionColorsKtExternalSyntheticLambda0;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class HlsMediaSource extends BackdropScaffoldKtExternalSyntheticLambda26 implements HlsPlaylistTracker.IAuthTabCallback {
    private final TextFieldSelectionManagerKtExternalSyntheticLambda4 IAuthTabCallback;
    private TextFieldStateKtExternalSyntheticLambda0.onTransact IAuthTabCallbackDefault;
    private TextFieldStateKtExternalSyntheticLambda0 IAuthTabCallbackStub;
    private TextFieldSelectionStateExternalSyntheticLambda7 IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private final long access000;
    private final HlsPlaylistTracker access100;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 asBinder;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda11 asInterface;
    private final boolean getInterfaceDescriptor;
    private final SelectionRegistrarImplExternalSyntheticLambda0 onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final BackdropScaffoldKtExternalSyntheticLambda3 onNavigationEvent;
    private final long onTransact;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda0 onWarmupCompleted;

    static {
        HandwritingDetectorNodeExternalSyntheticLambda0.onExtraCallback("media3.exoplayer.hls");
    }

    public static final class Factory implements BottomDrawerStateCompanionExternalSyntheticLambda0 {
        private ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted IAuthTabCallback;
        private SelectionRegistrarImplExternalSyntheticLambda1 IAuthTabCallbackDefault;
        private long IAuthTabCallbackStub;
        private AlertDialogKtExternalSyntheticLambda5 IAuthTabCallbackStubProxy;
        private HlsPlaylistTracker.onWarmupCompleted IAuthTabCallback_Parcel;
        private RippleKtExternalSyntheticLambda0.onExtraCallback ICustomTabsCallback;
        private boolean access000;
        private int access100;
        private final TextFieldSelectionManagerKtExternalSyntheticLambda4 asBinder;
        private TextFieldSelectionManager_androidKtExternalSyntheticLambda11 asInterface;
        private long extraCallback;
        private boolean extraCallbackWithResult;
        private ComposableSingletonsScaffoldKtExternalSyntheticLambda5 getInterfaceDescriptor;
        private int onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private BackdropScaffoldKtExternalSyntheticLambda3 onTransact;

        public Factory(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
            this((TextFieldSelectionManagerKtExternalSyntheticLambda4) new TextFieldSelectionManagerKtExternalSyntheticLambda5(onextracallback));
        }

        public Factory(TextFieldSelectionManagerKtExternalSyntheticLambda4 textFieldSelectionManagerKtExternalSyntheticLambda4) {
            this.asBinder = (TextFieldSelectionManagerKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionManagerKtExternalSyntheticLambda4);
            this.IAuthTabCallbackDefault = new SelectionManager_androidKtExternalSyntheticLambda7();
            this.IAuthTabCallbackStubProxy = new AlertDialogKtExternalSyntheticLambda1();
            this.IAuthTabCallback_Parcel = TextSelectionColorsKtExternalSyntheticLambda0.onWarmupCompleted;
            this.getInterfaceDescriptor = new ComposableSingletonsScaffoldKtExternalSyntheticLambda4();
            this.onTransact = new BackdropScaffoldKtExternalSyntheticLambda8();
            this.access100 = 1;
            this.IAuthTabCallbackStub = -9223372036854775807L;
            this.onExtraCallbackWithResult = true;
            IAuthTabCallback(true);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Factory onNavigationEvent(ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5) {
            this.getInterfaceDescriptor = (ComposableSingletonsScaffoldKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallback(composableSingletonsScaffoldKtExternalSyntheticLambda5, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Factory onNavigationEvent(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
            this.ICustomTabsCallback = onextracallback;
            return this;
        }

        @Deprecated
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Factory IAuthTabCallback(boolean z) {
            this.access000 = z;
            return this;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Factory onNavigationEvent(int i2) {
            this.onExtraCallback = i2;
            return this;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Factory onExtraCallbackWithResult(ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
            this.IAuthTabCallback = (ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onwarmupcompleted);
            return this;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Factory onExtraCallbackWithResult(SelectionRegistrarImplExternalSyntheticLambda1 selectionRegistrarImplExternalSyntheticLambda1) {
            this.IAuthTabCallbackDefault = (SelectionRegistrarImplExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallback(selectionRegistrarImplExternalSyntheticLambda1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
            if (this.asInterface == null) {
                this.asInterface = new TextFieldSelectionManagerKtExternalSyntheticLambda3();
            }
            RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback = this.ICustomTabsCallback;
            if (onextracallback != null) {
                this.asInterface.onExtraCallback(onextracallback);
            }
            this.asInterface.onNavigationEvent(this.access000);
            this.asInterface.IAuthTabCallback(this.onExtraCallback);
            TextFieldSelectionManager_androidKtExternalSyntheticLambda11 textFieldSelectionManager_androidKtExternalSyntheticLambda11 = this.asInterface;
            AlertDialogKtExternalSyntheticLambda5 alertDialogKtExternalSyntheticLambda5 = this.IAuthTabCallbackStubProxy;
            List list = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult.asInterface;
            AlertDialogKtExternalSyntheticLambda5 alertDialogKtExternalSyntheticLambda4 = !list.isEmpty() ? new AlertDialogKtExternalSyntheticLambda4(alertDialogKtExternalSyntheticLambda5, list) : alertDialogKtExternalSyntheticLambda5;
            ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback;
            ComposableSingletonsScaffoldKtExternalSyntheticLambda0 composableSingletonsScaffoldKtExternalSyntheticLambda0CreateCmcdConfiguration = onwarmupcompleted == null ? null : onwarmupcompleted.createCmcdConfiguration(textFieldStateKtExternalSyntheticLambda0);
            TextFieldSelectionManagerKtExternalSyntheticLambda4 textFieldSelectionManagerKtExternalSyntheticLambda4 = this.asBinder;
            BackdropScaffoldKtExternalSyntheticLambda3 backdropScaffoldKtExternalSyntheticLambda3 = this.onTransact;
            SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0 = this.IAuthTabCallbackDefault.get(textFieldStateKtExternalSyntheticLambda0);
            ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5 = this.getInterfaceDescriptor;
            return new HlsMediaSource(textFieldStateKtExternalSyntheticLambda0, textFieldSelectionManagerKtExternalSyntheticLambda4, textFieldSelectionManager_androidKtExternalSyntheticLambda11, backdropScaffoldKtExternalSyntheticLambda3, composableSingletonsScaffoldKtExternalSyntheticLambda0CreateCmcdConfiguration, selectionRegistrarImplExternalSyntheticLambda0, composableSingletonsScaffoldKtExternalSyntheticLambda5, this.IAuthTabCallback_Parcel.createTracker(this.asBinder, composableSingletonsScaffoldKtExternalSyntheticLambda5, alertDialogKtExternalSyntheticLambda4, composableSingletonsScaffoldKtExternalSyntheticLambda0CreateCmcdConfiguration), this.IAuthTabCallbackStub, this.onExtraCallbackWithResult, this.access100, this.extraCallbackWithResult, this.extraCallback);
        }

        public int[] IAuthTabCallback() {
            return new int[]{2};
        }
    }

    private HlsMediaSource(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, TextFieldSelectionManagerKtExternalSyntheticLambda4 textFieldSelectionManagerKtExternalSyntheticLambda4, TextFieldSelectionManager_androidKtExternalSyntheticLambda11 textFieldSelectionManager_androidKtExternalSyntheticLambda11, BackdropScaffoldKtExternalSyntheticLambda3 backdropScaffoldKtExternalSyntheticLambda3, @Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda0 composableSingletonsScaffoldKtExternalSyntheticLambda0, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i2, boolean z2, long j2) {
        this.IAuthTabCallbackStub = textFieldStateKtExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.IAuthTabCallback;
        this.IAuthTabCallback = textFieldSelectionManagerKtExternalSyntheticLambda4;
        this.asInterface = textFieldSelectionManager_androidKtExternalSyntheticLambda11;
        this.onNavigationEvent = backdropScaffoldKtExternalSyntheticLambda3;
        this.onWarmupCompleted = composableSingletonsScaffoldKtExternalSyntheticLambda0;
        this.onExtraCallback = selectionRegistrarImplExternalSyntheticLambda0;
        this.asBinder = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.access100 = hlsPlaylistTracker;
        this.onTransact = j;
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallback_Parcel = i2;
        this.getInterfaceDescriptor = z2;
        this.access000 = j2;
    }

    public TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent() {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0;
        synchronized (this) {
            textFieldStateKtExternalSyntheticLambda0 = this.IAuthTabCallbackStub;
        }
        return textFieldStateKtExternalSyntheticLambda0;
    }

    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent();
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = (TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult);
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        return iAuthTabCallbackDefault2 != null && iAuthTabCallbackDefault2.asBinder.equals(iAuthTabCallbackDefault.asBinder) && iAuthTabCallbackDefault2.asInterface.equals(iAuthTabCallbackDefault.asInterface) && Objects.equals(iAuthTabCallbackDefault2.IAuthTabCallback, iAuthTabCallbackDefault.IAuthTabCallback) && textFieldStateKtExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback.equals(textFieldStateKtExternalSyntheticLambda0.IAuthTabCallback);
    }

    public void onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        synchronized (this) {
            this.IAuthTabCallbackStub = textFieldStateKtExternalSyntheticLambda0;
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.IAuthTabCallbackStubProxy = textFieldSelectionStateExternalSyntheticLambda7;
        this.onExtraCallback.IAuthTabCallback((Looper) RecordingInputConnection_androidKt.onExtraCallbackWithResult(Looper.myLooper()), IAuthTabCallbackDefault());
        this.onExtraCallback.IAuthTabCallback();
        this.access100.onNavigationEvent(((TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onNavigationEvent().onExtraCallbackWithResult)).asBinder, onExtraCallback(null), this);
    }

    public void onExtraCallback() throws IOException {
        this.access100.onWarmupCompleted();
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallbackOnExtraCallback = onExtraCallback(onextracallbackwithresult);
        return new TextFieldSelectionManager_androidKtExternalSyntheticLambda8(this.asInterface, this.access100, this.IAuthTabCallback, this.IAuthTabCallbackStubProxy, this.onWarmupCompleted, this.onExtraCallback, onNavigationEvent(onextracallbackwithresult), this.asBinder, bottomNavigationKtExternalSyntheticLambda0$onExtraCallbackOnExtraCallback, composableSingletonsScaffoldKtExternalSyntheticLambda3, this.onNavigationEvent, this.onExtraCallbackWithResult, this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor, IAuthTabCallbackDefault(), this.access000);
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((TextFieldSelectionManager_androidKtExternalSyntheticLambda8) bottomDrawerStateCompanionExternalSyntheticLambda1).onTransact();
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onExtraCallbackWithResult() {
        this.access100.onExtraCallbackWithResult();
        this.onExtraCallback.onExtraCallbackWithResult();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.IAuthTabCallback
    public void onNavigationEvent(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3) {
        BottomNavigationKtExternalSyntheticLambda9 bottomNavigationKtExternalSyntheticLambda9OnExtraCallback;
        long jOnExtraCallback = alertDialogKtExternalSyntheticLambda3.asInterface ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(alertDialogKtExternalSyntheticLambda3.writeTypedObject) : -9223372036854775807L;
        int i2 = alertDialogKtExternalSyntheticLambda3.onTransact;
        long j = (i2 == 2 || i2 == 1) ? jOnExtraCallback : -9223372036854775807L;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda2 textFieldSelectionManager_androidKtExternalSyntheticLambda2 = new TextFieldSelectionManager_androidKtExternalSyntheticLambda2((AlertDialogKtExternalSyntheticLambda6) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100.IAuthTabCallback()), alertDialogKtExternalSyntheticLambda3);
        if (this.access100.onExtraCallback()) {
            bottomNavigationKtExternalSyntheticLambda9OnExtraCallback = onExtraCallbackWithResult(alertDialogKtExternalSyntheticLambda3, j, jOnExtraCallback, textFieldSelectionManager_androidKtExternalSyntheticLambda2);
        } else {
            bottomNavigationKtExternalSyntheticLambda9OnExtraCallback = onExtraCallback(alertDialogKtExternalSyntheticLambda3, j, jOnExtraCallback, textFieldSelectionManager_androidKtExternalSyntheticLambda2);
        }
        onNavigationEvent(bottomNavigationKtExternalSyntheticLambda9OnExtraCallback);
    }

    private BottomNavigationKtExternalSyntheticLambda9 onExtraCallbackWithResult(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j, long j2, TextFieldSelectionManager_androidKtExternalSyntheticLambda2 textFieldSelectionManager_androidKtExternalSyntheticLambda2) {
        long jIAuthTabCallback;
        long jOnNavigationEvent = alertDialogKtExternalSyntheticLambda3.writeTypedObject - this.access100.onNavigationEvent();
        long j3 = alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult ? jOnNavigationEvent + alertDialogKtExternalSyntheticLambda3.IAuthTabCallback : -9223372036854775807L;
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(alertDialogKtExternalSyntheticLambda3);
        long j4 = this.IAuthTabCallbackDefault.IAuthTabCallbackStub;
        if (j4 != -9223372036854775807L) {
            jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j4);
        } else {
            jIAuthTabCallback = IAuthTabCallback(alertDialogKtExternalSyntheticLambda3, jOnExtraCallbackWithResult);
        }
        onWarmupCompleted(alertDialogKtExternalSyntheticLambda3, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(jIAuthTabCallback, jOnExtraCallbackWithResult, alertDialogKtExternalSyntheticLambda3.IAuthTabCallback + jOnExtraCallbackWithResult));
        return new BottomNavigationKtExternalSyntheticLambda9(j, j2, -9223372036854775807L, j3, alertDialogKtExternalSyntheticLambda3.IAuthTabCallback, jOnNavigationEvent, onExtraCallbackWithResult(alertDialogKtExternalSyntheticLambda3, jOnExtraCallbackWithResult), true, !alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult, alertDialogKtExternalSyntheticLambda3.onTransact == 2 && alertDialogKtExternalSyntheticLambda3.onNavigationEvent, textFieldSelectionManager_androidKtExternalSyntheticLambda2, onNavigationEvent(), this.IAuthTabCallbackDefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BottomNavigationKtExternalSyntheticLambda9 onExtraCallback(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j, long j2, TextFieldSelectionManager_androidKtExternalSyntheticLambda2 textFieldSelectionManager_androidKtExternalSyntheticLambda2) {
        long j3;
        if (alertDialogKtExternalSyntheticLambda3.extraCallback == -9223372036854775807L || alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.isEmpty()) {
            j3 = 0;
        } else if (!alertDialogKtExternalSyntheticLambda3.access100) {
            long j4 = alertDialogKtExternalSyntheticLambda3.extraCallback;
            if (j4 == alertDialogKtExternalSyntheticLambda3.IAuthTabCallback) {
                j3 = alertDialogKtExternalSyntheticLambda3.extraCallback;
            } else {
                j3 = onExtraCallback(alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor, j4).getInterfaceDescriptor;
            }
        }
        long j5 = alertDialogKtExternalSyntheticLambda3.IAuthTabCallback;
        return new BottomNavigationKtExternalSyntheticLambda9(j, j2, -9223372036854775807L, j5, j5, 0L, j3, true, false, true, textFieldSelectionManager_androidKtExternalSyntheticLambda2, onNavigationEvent(), null);
    }

    private long onExtraCallbackWithResult(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3) {
        if (!alertDialogKtExternalSyntheticLambda3.asInterface) {
            return 0L;
        }
        Object[] objArr = {Long.valueOf(this.onTransact)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(((Long) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1157693761, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 1157693769)).longValue()) - alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult();
    }

    private long onExtraCallbackWithResult(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j) {
        long jOnNavigationEvent = alertDialogKtExternalSyntheticLambda3.extraCallback;
        if (jOnNavigationEvent == -9223372036854775807L) {
            jOnNavigationEvent = (alertDialogKtExternalSyntheticLambda3.IAuthTabCallback + j) - TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallbackDefault.IAuthTabCallbackStub);
        }
        if (alertDialogKtExternalSyntheticLambda3.access100) {
            return jOnNavigationEvent;
        }
        AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult, jOnNavigationEvent);
        if (iAuthTabCallbackOnExtraCallbackWithResult != null) {
            return iAuthTabCallbackOnExtraCallbackWithResult.getInterfaceDescriptor;
        }
        if (alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.isEmpty()) {
            return 0L;
        }
        AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor, jOnNavigationEvent);
        AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult2 = onExtraCallbackWithResult(onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult, jOnNavigationEvent);
        if (iAuthTabCallbackOnExtraCallbackWithResult2 != null) {
            return iAuthTabCallbackOnExtraCallbackWithResult2.getInterfaceDescriptor;
        }
        return onextracallbackwithresultOnExtraCallback.getInterfaceDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onWarmupCompleted(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j) {
        boolean z;
        TextFieldStateKtExternalSyntheticLambda0.onTransact ontransact = onNavigationEvent().IAuthTabCallback;
        if (ontransact.IAuthTabCallback == -3.4028235E38f && ontransact.onWarmupCompleted == -3.4028235E38f) {
            AlertDialogKtExternalSyntheticLambda3.IAuthTabCallbackDefault iAuthTabCallbackDefault = alertDialogKtExternalSyntheticLambda3.IAuthTabCallback_Parcel;
            if (iAuthTabCallbackDefault.IAuthTabCallback == -9223372036854775807L && iAuthTabCallbackDefault.onExtraCallback == -9223372036854775807L) {
                z = true;
            }
        } else {
            z = false;
        }
        this.IAuthTabCallbackDefault = new TextFieldStateKtExternalSyntheticLambda0.onTransact.onWarmupCompleted().onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j)).onExtraCallbackWithResult(z ? 1.0f : this.IAuthTabCallbackDefault.IAuthTabCallback).onNavigationEvent(z ? 1.0f : this.IAuthTabCallbackDefault.onWarmupCompleted).onNavigationEvent();
    }

    private static long IAuthTabCallback(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j) {
        long j2;
        AlertDialogKtExternalSyntheticLambda3.IAuthTabCallbackDefault iAuthTabCallbackDefault = alertDialogKtExternalSyntheticLambda3.IAuthTabCallback_Parcel;
        long j3 = alertDialogKtExternalSyntheticLambda3.extraCallback;
        if (j3 != -9223372036854775807L) {
            j2 = alertDialogKtExternalSyntheticLambda3.IAuthTabCallback - j3;
        } else {
            long j4 = iAuthTabCallbackDefault.onExtraCallback;
            if (j4 == -9223372036854775807L || alertDialogKtExternalSyntheticLambda3.asBinder == -9223372036854775807L) {
                long j5 = iAuthTabCallbackDefault.IAuthTabCallback;
                j2 = j5 == -9223372036854775807L ? alertDialogKtExternalSyntheticLambda3.ICustomTabsCallback * 3 : j5;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    private static AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback onExtraCallbackWithResult(List<AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback> list, long j) {
        AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback2 = list.get(i2);
            long j2 = iAuthTabCallback2.getInterfaceDescriptor;
            if (j2 > j || !iAuthTabCallback2.onExtraCallbackWithResult) {
                if (j2 > j) {
                    break;
                }
            } else {
                iAuthTabCallback = iAuthTabCallback2;
            }
        }
        return iAuthTabCallback;
    }

    private static AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult onExtraCallback(List<AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult> list, long j) {
        return list.get(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(list, Long.valueOf(j), true, true));
    }
}
