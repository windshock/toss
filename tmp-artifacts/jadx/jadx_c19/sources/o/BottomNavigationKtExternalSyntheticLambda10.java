package o;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.common.base.Supplier;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda1;
import o.BottomNavigationKtExternalSyntheticLambda10;
import o.BottomNavigationKtExternalSyntheticLambda4;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.SelectionManagerExternalSyntheticLambda12;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomNavigationKtExternalSyntheticLambda10 extends BackdropScaffoldKtExternalSyntheticLambda26 implements BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent {
    private final SelectionRegistrarImplExternalSyntheticLambda0 IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private long access000;
    private TextFieldSelectionStateExternalSyntheticLambda7 access100;
    private final BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent asBinder;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 asInterface;
    private boolean getInterfaceDescriptor;
    private final Supplier<ReleasableExecutor> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private onNavigationEvent onNavigationEvent;
    private TextFieldStateKtExternalSyntheticLambda0 onTransact;
    private final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onWarmupCompleted;

    public interface onNavigationEvent {
        void onExtraCallback(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4);
    }

    public void onExtraCallback() {
    }

    public static final class onExtraCallbackWithResult implements BottomDrawerStateCompanionExternalSyntheticLambda0 {
        private int IAuthTabCallback;
        private int IAuthTabCallbackDefault;
        private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackStub;
        private SelectionRegistrarImplExternalSyntheticLambda1 asBinder;
        private BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent asInterface;
        private Supplier<ReleasableExecutor> onExtraCallback;
        private final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onExtraCallbackWithResult;
        private ComposableSingletonsScaffoldKtExternalSyntheticLambda5 onTransact;

        public onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
            this(onextracallback, new DrawerKtExternalSyntheticLambda7());
        }

        public onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback, final DrawerStateExternalSyntheticLambda2 drawerStateExternalSyntheticLambda2) {
            this(onextracallback, new BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaSource$Factory$$ExternalSyntheticLambda0
                @Override // o.BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent
                public final BottomNavigationKtExternalSyntheticLambda1 createProgressiveMediaExtractor(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
                    return BottomNavigationKtExternalSyntheticLambda10.onExtraCallbackWithResult.onNavigationEvent(drawerStateExternalSyntheticLambda2, selectionManagerExternalSyntheticLambda12);
                }
            });
        }

        public static /* synthetic */ BottomNavigationKtExternalSyntheticLambda1 onNavigationEvent(DrawerStateExternalSyntheticLambda2 drawerStateExternalSyntheticLambda2, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
            return new BackdropScaffoldKtExternalSyntheticLambda27(drawerStateExternalSyntheticLambda2);
        }

        public onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback, BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent onnavigationevent) {
            this(onextracallback, onnavigationevent, new SelectionManager_androidKtExternalSyntheticLambda7(), new ComposableSingletonsScaffoldKtExternalSyntheticLambda4(), 1048576);
        }

        public onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback, BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent onnavigationevent, SelectionRegistrarImplExternalSyntheticLambda1 selectionRegistrarImplExternalSyntheticLambda1, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, int i2) {
            this.onExtraCallbackWithResult = onextracallback;
            this.asInterface = onnavigationevent;
            this.asBinder = selectionRegistrarImplExternalSyntheticLambda1;
            this.onTransact = composableSingletonsScaffoldKtExternalSyntheticLambda5;
            this.IAuthTabCallback = i2;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public onExtraCallbackWithResult onNavigationEvent(ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5) {
            this.onTransact = (ComposableSingletonsScaffoldKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallback(composableSingletonsScaffoldKtExternalSyntheticLambda5, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        onExtraCallbackWithResult onNavigationEvent(int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            this.IAuthTabCallbackDefault = i2;
            this.IAuthTabCallbackStub = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            return this;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public onExtraCallbackWithResult onExtraCallbackWithResult(SelectionRegistrarImplExternalSyntheticLambda1 selectionRegistrarImplExternalSyntheticLambda1) {
            this.asBinder = (SelectionRegistrarImplExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallback(selectionRegistrarImplExternalSyntheticLambda1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onExtraCallbackWithResult(Supplier<ReleasableExecutor> supplier) {
            this.onExtraCallback = supplier;
            return this;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public BottomNavigationKtExternalSyntheticLambda10 onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
            return new BottomNavigationKtExternalSyntheticLambda10(textFieldStateKtExternalSyntheticLambda0, this.onExtraCallbackWithResult, this.asInterface, this.asBinder.get(textFieldStateKtExternalSyntheticLambda0), this.onTransact, this.IAuthTabCallback, this.IAuthTabCallbackDefault, this.IAuthTabCallbackStub, this.onExtraCallback);
        }

        public int[] IAuthTabCallback() {
            return new int[]{4};
        }
    }

    private BottomNavigationKtExternalSyntheticLambda10(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback, BottomNavigationKtExternalSyntheticLambda1.onNavigationEvent onnavigationevent, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, int i2, int i3, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable Supplier<ReleasableExecutor> supplier) {
        this.onTransact = textFieldStateKtExternalSyntheticLambda0;
        this.onWarmupCompleted = onextracallback;
        this.asBinder = onnavigationevent;
        this.IAuthTabCallback = selectionRegistrarImplExternalSyntheticLambda0;
        this.asInterface = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.onExtraCallbackWithResult = i2;
        this.IAuthTabCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.IAuthTabCallbackDefault = i3;
        this.IAuthTabCallback_Parcel = true;
        this.access000 = -9223372036854775807L;
        this.onExtraCallback = supplier;
    }

    public TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent() {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0;
        synchronized (this) {
            textFieldStateKtExternalSyntheticLambda0 = this.onTransact;
        }
        return textFieldStateKtExternalSyntheticLambda0;
    }

    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault interfaceDescriptor = getInterfaceDescriptor();
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        return iAuthTabCallbackDefault != null && iAuthTabCallbackDefault.asBinder.equals(interfaceDescriptor.asBinder) && iAuthTabCallbackDefault.onExtraCallbackWithResult == interfaceDescriptor.onExtraCallbackWithResult && Objects.equals(iAuthTabCallbackDefault.onWarmupCompleted, interfaceDescriptor.onWarmupCompleted);
    }

    public void onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        synchronized (this) {
            this.onTransact = textFieldStateKtExternalSyntheticLambda0;
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.access100 = textFieldSelectionStateExternalSyntheticLambda7;
        this.IAuthTabCallback.IAuthTabCallback((Looper) RecordingInputConnection_androidKt.onExtraCallbackWithResult(Looper.myLooper()), IAuthTabCallbackDefault());
        this.IAuthTabCallback.IAuthTabCallback();
        IAuthTabCallback_Parcel();
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0CreateDataSource = this.onWarmupCompleted.createDataSource();
        TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7 = this.access100;
        if (textFieldSelectionStateExternalSyntheticLambda7 != null) {
            textFieldSelectionStateExternalSyntheticLambda0CreateDataSource.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
        }
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault interfaceDescriptor = getInterfaceDescriptor();
        Uri uri = interfaceDescriptor.asBinder;
        BottomNavigationKtExternalSyntheticLambda1 bottomNavigationKtExternalSyntheticLambda1CreateProgressiveMediaExtractor = this.asBinder.createProgressiveMediaExtractor(IAuthTabCallbackDefault());
        SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0 = this.IAuthTabCallback;
        SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompletedOnNavigationEvent = onNavigationEvent(onextracallbackwithresult);
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5 = this.asInterface;
        BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallbackOnExtraCallback = onExtraCallback(onextracallbackwithresult);
        String str = interfaceDescriptor.onWarmupCompleted;
        int i2 = this.onExtraCallbackWithResult;
        int i3 = this.IAuthTabCallbackDefault;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallbackStub;
        long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(interfaceDescriptor.onExtraCallbackWithResult);
        Supplier<ReleasableExecutor> supplier = this.onExtraCallback;
        return new BottomNavigationKtExternalSyntheticLambda4(uri, textFieldSelectionStateExternalSyntheticLambda0CreateDataSource, bottomNavigationKtExternalSyntheticLambda1CreateProgressiveMediaExtractor, selectionRegistrarImplExternalSyntheticLambda0, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompletedOnNavigationEvent, composableSingletonsScaffoldKtExternalSyntheticLambda5, bottomNavigationKtExternalSyntheticLambda0$onExtraCallbackOnExtraCallback, this, composableSingletonsScaffoldKtExternalSyntheticLambda3, str, i2, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4, jOnNavigationEvent, supplier != null ? (ReleasableExecutor) supplier.get() : null);
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BottomNavigationKtExternalSyntheticLambda4) bottomDrawerStateCompanionExternalSyntheticLambda1).IAuthTabCallback_Parcel();
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onExtraCallbackWithResult() {
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    public void onWarmupCompleted(onNavigationEvent onnavigationevent) {
        this.onNavigationEvent = onnavigationevent;
    }

    public void asInterface() {
        this.onNavigationEvent = null;
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent
    public void IAuthTabCallback(long j, ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.access000;
        }
        boolean zOnNavigationEvent = exposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent();
        if (!this.IAuthTabCallback_Parcel && this.access000 == j && this.IAuthTabCallbackStubProxy == zOnNavigationEvent && this.getInterfaceDescriptor == z) {
            return;
        }
        this.access000 = j;
        this.IAuthTabCallbackStubProxy = zOnNavigationEvent;
        this.getInterfaceDescriptor = z;
        this.IAuthTabCallback_Parcel = false;
        IAuthTabCallback_Parcel();
        onNavigationEvent onnavigationevent = this.onNavigationEvent;
        if (onnavigationevent != null) {
            onnavigationevent.onExtraCallback(this, exposedDropdownMenu_androidKtExternalSyntheticLambda4);
        }
    }

    private TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault getInterfaceDescriptor() {
        return (TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onNavigationEvent().onExtraCallbackWithResult);
    }

    private void IAuthTabCallback_Parcel() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 bottomNavigationKtExternalSyntheticLambda9 = new BottomNavigationKtExternalSyntheticLambda9(this.access000, this.IAuthTabCallbackStubProxy, false, this.getInterfaceDescriptor, null, onNavigationEvent());
        if (this.IAuthTabCallback_Parcel) {
            bottomNavigationKtExternalSyntheticLambda9 = new BackdropScaffoldStateExternalSyntheticLambda2(bottomNavigationKtExternalSyntheticLambda9) { // from class: o.BottomNavigationKtExternalSyntheticLambda10.1
                @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
                public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
                    super.onWarmupCompleted(i2, iAuthTabCallback, j);
                    iAuthTabCallback.IAuthTabCallbackStub = true;
                    return iAuthTabCallback;
                }

                @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
                public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
                    super.IAuthTabCallback(i2, onextracallback, z);
                    onextracallback.onWarmupCompleted = true;
                    return onextracallback;
                }
            };
        }
        onNavigationEvent(bottomNavigationKtExternalSyntheticLambda9);
    }
}
