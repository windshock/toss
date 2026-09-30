package o;

import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface adjust {

    @Deprecated
    public static final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent = new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(new Object());

    ComposableSingletonsScaffoldKtExternalSyntheticLambda3 IAuthTabCallback();

    public static final class IAuthTabCallback {
        public final long IAuthTabCallback;
        public final boolean IAuthTabCallbackDefault;
        public final float IAuthTabCallbackStub;
        public final long asBinder;
        public final SelectionManagerExternalSyntheticLambda12 asInterface;
        public final long onExtraCallback;
        public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult;
        public final long onNavigationEvent;
        public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onTransact;
        public final boolean onWarmupCompleted;

        public IAuthTabCallback(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, float f, boolean z, boolean z2, long j3, long j4) {
            this.asInterface = selectionManagerExternalSyntheticLambda12;
            this.onTransact = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
            this.onExtraCallbackWithResult = onextracallbackwithresult;
            this.onNavigationEvent = j;
            this.IAuthTabCallback = j2;
            this.IAuthTabCallbackStub = f;
            this.onWarmupCompleted = z;
            this.IAuthTabCallbackDefault = z2;
            this.asBinder = j3;
            this.onExtraCallback = j4;
        }
    }

    default void IAuthTabCallback(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        onExtraCallbackWithResult();
    }

    @Deprecated
    default void onExtraCallbackWithResult() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        onTransact();
    }

    @Deprecated
    default void onTransact() {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void onNavigationEvent(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        onWarmupCompleted();
    }

    @Deprecated
    default void onWarmupCompleted() {
        throw new IllegalStateException("onReleased not implemented");
    }

    default long onWarmupCompleted(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        return onExtraCallback();
    }

    @Deprecated
    default long onExtraCallback() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean onExtraCallback(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        return asBinder();
    }

    @Deprecated
    default boolean asBinder() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        return onWarmupCompleted(iAuthTabCallback.onNavigationEvent, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStub);
    }

    @Deprecated
    default boolean onWarmupCompleted(long j, long j2, float f) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean onExtraCallback(IAuthTabCallback iAuthTabCallback) {
        return onExtraCallback(iAuthTabCallback.onTransact, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStub, iAuthTabCallback.IAuthTabCallbackDefault, iAuthTabCallback.asBinder);
    }

    @Deprecated
    default boolean onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, float f, boolean z, long j2) {
        return onExtraCallback(j, f, z, j2);
    }

    @Deprecated
    default boolean onExtraCallback(long j, float f, boolean z, long j2) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }
}
