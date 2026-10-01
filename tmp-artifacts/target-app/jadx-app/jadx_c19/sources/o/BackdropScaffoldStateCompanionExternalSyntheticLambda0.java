package o;

import androidx.annotation.Nullable;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldStateCompanionExternalSyntheticLambda0 extends BackdropScaffoldKtExternalSyntheticLambda26 {
    private final long onExtraCallback;
    private TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent;
    private final BackdropScaffoldKtExternalSyntheticLambda7 onWarmupCompleted;

    public void onExtraCallback() {
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onExtraCallbackWithResult() {
    }

    public static final class onExtraCallback implements BottomDrawerStateExternalSyntheticLambda2.onExtraCallback {
        private final long onExtraCallback;
        private final BackdropScaffoldKtExternalSyntheticLambda7 onWarmupCompleted;

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onExtraCallbackWithResult(SelectionRegistrarImplExternalSyntheticLambda1 selectionRegistrarImplExternalSyntheticLambda1) {
            return this;
        }

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onNavigationEvent(ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5) {
            return this;
        }

        public onExtraCallback(long j, BackdropScaffoldKtExternalSyntheticLambda7 backdropScaffoldKtExternalSyntheticLambda7) {
            this.onExtraCallback = j;
            this.onWarmupCompleted = backdropScaffoldKtExternalSyntheticLambda7;
        }

        public int[] IAuthTabCallback() {
            return new int[]{4};
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public BackdropScaffoldStateCompanionExternalSyntheticLambda0 onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            return new BackdropScaffoldStateCompanionExternalSyntheticLambda0(textFieldStateKtExternalSyntheticLambda0, this.onExtraCallback, this.onWarmupCompleted);
        }
    }

    private BackdropScaffoldStateCompanionExternalSyntheticLambda0(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, long j, BackdropScaffoldKtExternalSyntheticLambda7 backdropScaffoldKtExternalSyntheticLambda7) {
        this.onNavigationEvent = textFieldStateKtExternalSyntheticLambda0;
        this.onExtraCallback = j;
        this.onWarmupCompleted = backdropScaffoldKtExternalSyntheticLambda7;
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        onNavigationEvent(new BottomNavigationKtExternalSyntheticLambda9(this.onExtraCallback, true, false, false, null, onNavigationEvent()));
    }

    public TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent() {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0;
        synchronized (this) {
            textFieldStateKtExternalSyntheticLambda0 = this.onNavigationEvent;
        }
        return textFieldStateKtExternalSyntheticLambda0;
    }

    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onNavigationEvent().onExtraCallbackWithResult);
        if (iAuthTabCallbackDefault == null || !iAuthTabCallbackDefault.asBinder.equals(iAuthTabCallbackDefault2.asBinder) || !Objects.equals(iAuthTabCallbackDefault.onNavigationEvent, iAuthTabCallbackDefault2.onNavigationEvent)) {
            return false;
        }
        long j = iAuthTabCallbackDefault.onExtraCallbackWithResult;
        return j == -9223372036854775807L || TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j) == this.onExtraCallback;
    }

    public void onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        synchronized (this) {
            this.onNavigationEvent = textFieldStateKtExternalSyntheticLambda0;
        }
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent();
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult;
        RecordingInputConnection_androidKt.onExtraCallback(textFieldStateKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult.onNavigationEvent, "Externally loaded mediaItems require a MIME type.");
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = textFieldStateKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult;
        return new BackdropScaffoldStateExternalSyntheticLambda0(iAuthTabCallbackDefault2.asBinder, iAuthTabCallbackDefault2.onNavigationEvent, this.onWarmupCompleted);
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BackdropScaffoldStateExternalSyntheticLambda0) bottomDrawerStateCompanionExternalSyntheticLambda1).IAuthTabCallbackDefault();
    }
}
