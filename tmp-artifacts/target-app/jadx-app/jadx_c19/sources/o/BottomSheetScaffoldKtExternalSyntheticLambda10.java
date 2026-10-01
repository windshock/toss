package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import o.TextFieldStateKtExternalSyntheticLambda0;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomSheetScaffoldKtExternalSyntheticLambda10 extends BackdropScaffoldKtExternalSyntheticLambda26 {
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback;
    private final TextFieldStateKtExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 IAuthTabCallbackStub;
    private final boolean asBinder;
    private TextFieldSelectionStateExternalSyntheticLambda7 asInterface;
    private final long onExtraCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda12 onExtraCallbackWithResult;
    private final Supplier<ReleasableExecutor> onNavigationEvent;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 onTransact;
    private final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onWarmupCompleted;

    public void onExtraCallback() {
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onExtraCallbackWithResult() {
    }

    public static final class IAuthTabCallback {
        private ComposableSingletonsScaffoldKtExternalSyntheticLambda5 IAuthTabCallback = new ComposableSingletonsScaffoldKtExternalSyntheticLambda4();
        private boolean asInterface = true;
        private Supplier<ReleasableExecutor> onExtraCallback;
        private String onExtraCallbackWithResult;
        private Object onNavigationEvent;
        private final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onWarmupCompleted;

        public IAuthTabCallback(TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
            this.onWarmupCompleted = (TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback);
        }

        public IAuthTabCallback IAuthTabCallback(@Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5) {
            if (composableSingletonsScaffoldKtExternalSyntheticLambda5 == null) {
                composableSingletonsScaffoldKtExternalSyntheticLambda5 = new ComposableSingletonsScaffoldKtExternalSyntheticLambda4();
            }
            this.IAuthTabCallback = composableSingletonsScaffoldKtExternalSyntheticLambda5;
            return this;
        }

        public BottomSheetScaffoldKtExternalSyntheticLambda10 onNavigationEvent(TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackStub iAuthTabCallbackStub, long j) {
            return new BottomSheetScaffoldKtExternalSyntheticLambda10(this.onExtraCallbackWithResult, iAuthTabCallbackStub, this.onWarmupCompleted, j, this.IAuthTabCallback, this.asInterface, this.onNavigationEvent, this.onExtraCallback);
        }
    }

    private BottomSheetScaffoldKtExternalSyntheticLambda10(@Nullable String str, TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackStub iAuthTabCallbackStub, TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback, long j, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, boolean z, @Nullable Object obj, @Nullable Supplier<ReleasableExecutor> supplier) {
        this.onWarmupCompleted = onextracallback;
        this.onExtraCallback = j;
        this.onTransact = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.asBinder = z;
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted = new TextFieldStateKtExternalSyntheticLambda0.onWarmupCompleted().IAuthTabCallback(Uri.EMPTY).onExtraCallback(iAuthTabCallbackStub.onTransact.toString()).onNavigationEvent(ImmutableList.of(iAuthTabCallbackStub)).onExtraCallback(obj).onWarmupCompleted();
        this.IAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault((String) MoreObjects.firstNonNull(iAuthTabCallbackStub.onNavigationEvent, "text/x-unknown")).onWarmupCompleted(iAuthTabCallbackStub.onWarmupCompleted).onActivityResized(iAuthTabCallbackStub.asInterface).readTypedObject(iAuthTabCallbackStub.onExtraCallback).IAuthTabCallback(iAuthTabCallbackStub.IAuthTabCallback);
        String str2 = iAuthTabCallbackStub.onExtraCallbackWithResult;
        this.IAuthTabCallback = onextracallbackwithresultIAuthTabCallback.onExtraCallbackWithResult(str2 == null ? str : str2).onNavigationEvent();
        this.onExtraCallbackWithResult = new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback().IAuthTabCallback(iAuthTabCallbackStub.onTransact).onExtraCallbackWithResult(1).onExtraCallbackWithResult();
        this.IAuthTabCallbackStub = new BottomNavigationKtExternalSyntheticLambda9(j, true, false, false, null, textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted);
        this.onNavigationEvent = supplier;
    }

    public TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.asInterface = textFieldSelectionStateExternalSyntheticLambda7;
        onNavigationEvent(this.IAuthTabCallbackStub);
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12 = this.onExtraCallbackWithResult;
        TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback = this.onWarmupCompleted;
        TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7 = this.asInterface;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallback;
        long j2 = this.onExtraCallback;
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5 = this.onTransact;
        BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallbackOnExtraCallback = onExtraCallback(onextracallbackwithresult);
        boolean z = this.asBinder;
        Supplier<ReleasableExecutor> supplier = this.onNavigationEvent;
        return new BottomNavigationKtExternalSyntheticLambda6(textFieldSelectionStateExternalSyntheticLambda12, onextracallback, textFieldSelectionStateExternalSyntheticLambda7, basicTextContextMenuProviderKtExternalSyntheticLambda4, j2, composableSingletonsScaffoldKtExternalSyntheticLambda5, bottomNavigationKtExternalSyntheticLambda0$onExtraCallbackOnExtraCallback, z, supplier != null ? (ReleasableExecutor) supplier.get() : null);
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BottomNavigationKtExternalSyntheticLambda6) bottomDrawerStateCompanionExternalSyntheticLambda1).IAuthTabCallbackDefault();
    }
}
