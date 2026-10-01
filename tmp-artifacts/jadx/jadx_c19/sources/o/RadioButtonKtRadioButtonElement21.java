package o;

import com.alibaba.ariver.kernel.RVParams;
import com.google.android.gms.wearable.WearableStatusCodes;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RadioButtonKtRadioButtonElement21 implements applyState {
    private static final RadioButtonKtRadioButtonElement21 IAuthTabCallback = new RadioButtonKtRadioButtonElement21(2000, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, RVParams.WEBVIEW_FONT_SIZE_LARGEST);
    private static final long serialVersionUID = 1;
    protected final int _maxDeserializerCacheSize;
    protected final int _maxSerializerCacheSize;
    protected final int _maxTypeFactoryCacheSize;

    protected RadioButtonKtRadioButtonElement21(int i2, int i3, int i4) {
        this._maxDeserializerCacheSize = i2;
        this._maxSerializerCacheSize = i3;
        this._maxTypeFactoryCacheSize = i4;
    }

    public static applyState onExtraCallback() {
        return IAuthTabCallback;
    }
}
