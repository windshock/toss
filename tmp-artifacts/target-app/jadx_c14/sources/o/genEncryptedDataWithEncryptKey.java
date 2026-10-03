package o;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class genEncryptedDataWithEncryptKey extends ViewDataBinding {
    public final TdsImageView IAuthTabCallback;
    public final LottieAnimationView IAuthTabCallbackDefault;
    public final Typography5 asInterface;
    public final TdsButtonV1View onExtraCallbackWithResult;
    protected getKeyB onTransact;

    protected genEncryptedDataWithEncryptKey(Object obj, View view, int i, TdsButtonV1View tdsButtonV1View, TdsImageView tdsImageView, LottieAnimationView lottieAnimationView, Typography5 typography5) {
        super(obj, view, i);
        this.onExtraCallbackWithResult = tdsButtonV1View;
        this.IAuthTabCallback = tdsImageView;
        this.IAuthTabCallbackDefault = lottieAnimationView;
        this.asInterface = typography5;
    }
}
