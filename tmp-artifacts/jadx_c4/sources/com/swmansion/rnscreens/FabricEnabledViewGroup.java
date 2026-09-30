package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class FabricEnabledViewGroup extends ViewGroup {
    private float lastHeaderHeight;
    private float lastHeight;
    private float lastWidth;
    private CredentialProviderControllermaybeReportErrorFromResultReceiver1 mStateWrapper;

    public FabricEnabledViewGroup(@Nullable ReactContext reactContext) {
        super(reactContext);
    }

    public final void setStateWrapper(@Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        this.mStateWrapper = credentialProviderControllermaybeReportErrorFromResultReceiver1;
    }

    protected final void updateScreenSizeFabric(int i, int i2, int i3) {
        updateState(i, i2, i3);
    }

    public final void updateState(int i, int i2, int i3) {
        float fOnExtraCallback = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i);
        float fOnExtraCallback2 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i2);
        float fOnExtraCallback3 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i3);
        if (Math.abs(this.lastWidth - fOnExtraCallback) >= 0.9f || Math.abs(this.lastHeight - fOnExtraCallback2) >= 0.9f || Math.abs(this.lastHeaderHeight - fOnExtraCallback3) >= 0.9f) {
            this.lastWidth = fOnExtraCallback;
            this.lastHeight = fOnExtraCallback2;
            this.lastHeaderHeight = fOnExtraCallback3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fOnExtraCallback);
            writableNativeMap.putDouble("frameHeight", fOnExtraCallback2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", fOnExtraCallback3);
            CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1 = this.mStateWrapper;
            if (credentialProviderControllermaybeReportErrorFromResultReceiver1 != null) {
                credentialProviderControllermaybeReportErrorFromResultReceiver1.updateState(writableNativeMap);
            }
        }
    }
}
