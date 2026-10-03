package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography11;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class destroyKey extends ViewDataBinding {
    public final SubTypography11 IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackDefault;
    public final TdsButtonV1View IAuthTabCallbackStub;
    public final TdsImageView IAuthTabCallback_Parcel;
    public final TdsButtonV1View access000;
    public final Space access100;
    protected CERT_DecryptPrikey asBinder;
    public final Barrier asInterface;
    public final TdsButtonV1View getInterfaceDescriptor;
    public final TdsRollingNumberV1View onExtraCallbackWithResult;
    public final LinearLayout onTransact;

    protected destroyKey(Object obj, View view, int i, SubTypography11 subTypography11, TdsRollingNumberV1View tdsRollingNumberV1View, ConstraintLayout constraintLayout, Barrier barrier, LinearLayout linearLayout, TdsButtonV1View tdsButtonV1View, Space space, TdsButtonV1View tdsButtonV1View2, TdsButtonV1View tdsButtonV1View3, TdsImageView tdsImageView) {
        super(obj, view, i);
        this.IAuthTabCallback = subTypography11;
        this.onExtraCallbackWithResult = tdsRollingNumberV1View;
        this.IAuthTabCallbackDefault = constraintLayout;
        this.asInterface = barrier;
        this.onTransact = linearLayout;
        this.IAuthTabCallbackStub = tdsButtonV1View;
        this.access100 = space;
        this.access000 = tdsButtonV1View2;
        this.getInterfaceDescriptor = tdsButtonV1View3;
        this.IAuthTabCallback_Parcel = tdsImageView;
    }
}
