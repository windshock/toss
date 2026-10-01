package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class isFragmentClass extends getReturnTransition {
    private static final long serialVersionUID = -1;

    public isFragmentClass() {
        this(null);
    }

    public isFragmentClass(setOnApplyWindowInsetsListener setonapplywindowinsetslistener) {
        super(setonapplywindowinsetslistener);
        if (setonapplywindowinsetslistener == null) {
            IAuthTabCallback(new setOnApplyWindowInsetsListener(this));
        }
    }

    @Override // o.getReturnTransition
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public final setOnApplyWindowInsetsListener IAuthTabCallback() {
        return (setOnApplyWindowInsetsListener) this._objectCodec;
    }

    @Override // o.getReturnTransition
    public String onTransact() {
        return "JSON";
    }

    @Override // o.getReturnTransition
    public onCreateContextMenu onExtraCallback(onContextItemSelected oncontextitemselected) throws IOException {
        if (getClass() == isFragmentClass.class) {
            return onWarmupCompleted(oncontextitemselected);
        }
        return null;
    }
}
