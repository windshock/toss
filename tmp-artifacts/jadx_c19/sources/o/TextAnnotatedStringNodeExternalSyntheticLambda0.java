package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TextAnnotatedStringNodeExternalSyntheticLambda0 extends TextFieldSelectionState_androidKtExternalSyntheticLambda5 {
    public boolean IAuthTabCallback;
    public int onExtraCallbackWithResult;
    public long onNavigationEvent;

    public interface onExtraCallbackWithResult<S extends TextAnnotatedStringNodeExternalSyntheticLambda0> {
        void releaseOutputBuffer(S s);
    }

    public abstract void asInterface();

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda5
    public void onNavigationEvent() {
        super.onNavigationEvent();
        this.onNavigationEvent = 0L;
        this.onExtraCallbackWithResult = 0;
        this.IAuthTabCallback = false;
    }
}
