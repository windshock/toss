package o;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class generateKeyPair extends ViewDataBinding {
    public final TdsButtonV1View IAuthTabCallback;
    public final TdsImageView IAuthTabCallbackDefault;
    protected androidustk IAuthTabCallbackStub;
    public final TdsTextButtonV0View asBinder;
    public final TdsRoundLayout asInterface;
    public final Typography6 onExtraCallbackWithResult;

    protected generateKeyPair(Object obj, View view, int i, TdsButtonV1View tdsButtonV1View, Typography6 typography6, TdsRoundLayout tdsRoundLayout, TdsImageView tdsImageView, TdsTextButtonV0View tdsTextButtonV0View) {
        super(obj, view, i);
        this.IAuthTabCallback = tdsButtonV1View;
        this.onExtraCallbackWithResult = typography6;
        this.asInterface = tdsRoundLayout;
        this.IAuthTabCallbackDefault = tdsImageView;
        this.asBinder = tdsTextButtonV0View;
    }
}
