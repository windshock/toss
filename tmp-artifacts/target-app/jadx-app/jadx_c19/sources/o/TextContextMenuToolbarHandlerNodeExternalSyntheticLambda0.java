package o;

import com.google.common.collect.ImmutableList;
import java.util.List;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TextContextMenuToolbarHandlerNodeExternalSyntheticLambda0 implements AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 {
    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();

    protected abstract void onWarmupCompleted(int i2, long j, int i3, boolean z);

    public final boolean onWarmupCompleted() {
        return true;
    }

    public final void onExtraCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        onExtraCallbackWithResult((List<TextFieldStateKtExternalSyntheticLambda0>) ImmutableList.of(textFieldStateKtExternalSyntheticLambda0));
    }

    public final void onWarmupCompleted(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, long j) {
        onWarmupCompleted(ImmutableList.of(textFieldStateKtExternalSyntheticLambda0), 0, j);
    }

    public final void onExtraCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, boolean z) {
        IAuthTabCallback(ImmutableList.of(textFieldStateKtExternalSyntheticLambda0), z);
    }

    public final void onExtraCallbackWithResult(List<TextFieldStateKtExternalSyntheticLambda0> list) {
        IAuthTabCallback(list, true);
    }

    public final void onWarmupCompleted(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        IAuthTabCallback((List<TextFieldStateKtExternalSyntheticLambda0>) ImmutableList.of(textFieldStateKtExternalSyntheticLambda0));
    }

    public final void IAuthTabCallback(List<TextFieldStateKtExternalSyntheticLambda0> list) {
        onExtraCallbackWithResult(Integer.MAX_VALUE, list);
    }

    public final void onExtraCallback(int i2, int i3) {
        if (i2 != i3) {
            onExtraCallback(i2, i2 + 1, i3);
        }
    }

    public final void onExtraCallback(int i2, TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        onExtraCallbackWithResult(i2, i2 + 1, ImmutableList.of(textFieldStateKtExternalSyntheticLambda0));
    }

    public final void onExtraCallback(int i2) {
        onExtraCallbackWithResult(i2, i2 + 1);
    }

    public final void onExtraCallbackWithResult() {
        onExtraCallbackWithResult(0, Integer.MAX_VALUE);
    }

    public final boolean onExtraCallbackWithResult(int i2) {
        return onRelationshipValidationResult().onExtraCallback(i2);
    }

    public final void extraCallback() {
        IAuthTabCallback(true);
    }

    public final void readTypedObject() {
        IAuthTabCallback(false);
    }

    public final boolean IAuthTabCallback_Parcel() {
        return setEngagementSignalsCallback() == 3 && prefetchWithMultipleUrls() && validateRelationship() == 0;
    }

    public final void ICustomTabsCallback() {
        onNavigationEvent(isEngagementSignalsApiAvailable(), 4);
    }

    public final void onNavigationEvent(int i2) {
        onNavigationEvent(i2, 10);
    }

    public final void extraCallbackWithResult() {
        onWarmupCompleted(-ICustomTabsServiceDefault(), 11);
    }

    public final void writeTypedObject() {
        onWarmupCompleted(writeTypedList(), 12);
    }

    public final boolean access100() {
        return onTransact() != -1;
    }

    public final void onPostMessage() {
        access100(6);
    }

    public final void onActivityResized() {
        if (newSession().onExtraCallback() || IPostMessageServiceDefault()) {
            onTransact(7);
            return;
        }
        boolean zAccess100 = access100();
        if (access000() && !IAuthTabCallbackStubProxy()) {
            if (zAccess100) {
                access100(7);
                return;
            } else {
                onTransact(7);
                return;
            }
        }
        if (zAccess100 && ICustomTabsCallback_Parcel() <= receiveFile()) {
            access100(7);
        } else {
            onExtraCallbackWithResult(0L, 7);
        }
    }

    public final boolean IAuthTabCallbackDefault() {
        return IAuthTabCallbackStub() != -1;
    }

    public final void onMessageChannelReady() {
        asBinder(8);
    }

    public final void onActivityLayout() {
        if (newSession().onExtraCallback() || IPostMessageServiceDefault()) {
            onTransact(9);
            return;
        }
        if (IAuthTabCallbackDefault()) {
            asBinder(9);
        } else if (access000() && getInterfaceDescriptor()) {
            onNavigationEvent(isEngagementSignalsApiAvailable(), 9);
        } else {
            onTransact(9);
        }
    }

    public final void IAuthTabCallback(long j) {
        onExtraCallbackWithResult(j, 5);
    }

    public final void onExtraCallbackWithResult(int i2, long j) {
        onWarmupCompleted(i2, j, 10, false);
    }

    public final void onNavigationEvent(float f) {
        onExtraCallbackWithResult(requestPostMessageChannel().onWarmupCompleted(f));
    }

    public final int IAuthTabCallbackStub() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback()) {
            return -1;
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onNavigationEvent(isEngagementSignalsApiAvailable(), IEngagementSignalsCallbackStub(), ICustomTabsServiceStubProxy());
    }

    public final int onTransact() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback()) {
            return -1;
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), IEngagementSignalsCallbackStub(), ICustomTabsServiceStubProxy());
    }

    public final TextFieldStateKtExternalSyntheticLambda0 asInterface() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback()) {
            return null;
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).IAuthTabCallbackStubProxy;
    }

    public final int asBinder() {
        return newSession().onExtraCallbackWithResult();
    }

    public final int onExtraCallback() {
        long jOnUnminimized = onUnminimized();
        long jNewAuthTabSession = newAuthTabSession();
        if (jOnUnminimized == -9223372036854775807L || jNewAuthTabSession == -9223372036854775807L) {
            return 0;
        }
        if (jNewAuthTabSession == 0) {
            return 100;
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(jOnUnminimized, jNewAuthTabSession), 0, 100);
    }

    public final boolean getInterfaceDescriptor() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        return !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).asInterface;
    }

    public final boolean access000() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        return !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).IAuthTabCallbackStub();
    }

    public final long IAuthTabCallback() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).writeTypedObject == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.onWarmupCompleted.onWarmupCompleted() - this.onWarmupCompleted.writeTypedObject) - ICustomTabsCallbackStubProxy();
    }

    public final boolean IAuthTabCallbackStubProxy() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        return !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).IAuthTabCallbackDefault;
    }

    public final long onNavigationEvent() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback()) {
            return -9223372036854775807L;
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).IAuthTabCallback();
    }

    private int IEngagementSignalsCallbackStub() {
        int iWarmup = warmup();
        if (iWarmup == 1) {
            return 0;
        }
        return iWarmup;
    }

    private void onTransact(int i2) {
        onWarmupCompleted(-1, -9223372036854775807L, i2, false);
    }

    private void onExtraCallbackWithResult(long j, int i2) {
        onWarmupCompleted(isEngagementSignalsApiAvailable(), j, i2, false);
    }

    private void onWarmupCompleted(long j, int i2) {
        long jICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel() + j;
        long jNewAuthTabSession = newAuthTabSession();
        if (jNewAuthTabSession != -9223372036854775807L) {
            jICustomTabsCallback_Parcel = Math.min(jICustomTabsCallback_Parcel, jNewAuthTabSession);
        }
        onExtraCallbackWithResult(Math.max(jICustomTabsCallback_Parcel, 0L), i2);
    }

    private void onNavigationEvent(int i2, int i3) {
        onWarmupCompleted(i2, -9223372036854775807L, i3, false);
    }

    private void asBinder(int i2) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub == -1) {
            onTransact(i2);
        } else if (iIAuthTabCallbackStub == isEngagementSignalsApiAvailable()) {
            IAuthTabCallbackStub(i2);
        } else {
            onNavigationEvent(iIAuthTabCallbackStub, i2);
        }
    }

    private void access100(int i2) {
        int iOnTransact = onTransact();
        if (iOnTransact == -1) {
            onTransact(i2);
        } else if (iOnTransact == isEngagementSignalsApiAvailable()) {
            IAuthTabCallbackStub(i2);
        } else {
            onNavigationEvent(iOnTransact, i2);
        }
    }

    private void IAuthTabCallbackStub(int i2) {
        onWarmupCompleted(isEngagementSignalsApiAvailable(), -9223372036854775807L, i2, true);
    }
}
