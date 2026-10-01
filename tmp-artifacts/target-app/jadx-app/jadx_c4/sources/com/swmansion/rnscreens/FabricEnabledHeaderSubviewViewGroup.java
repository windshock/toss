package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class FabricEnabledHeaderSubviewViewGroup extends ViewGroup {
    public static final Companion Companion = new Companion(null);
    private static final float DELTA = 0.9f;
    private float lastHeight;
    private float lastOffsetX;
    private float lastOffsetY;
    private float lastWidth;
    private CredentialProviderControllermaybeReportErrorFromResultReceiver1 mStateWrapper;

    public FabricEnabledHeaderSubviewViewGroup(@Nullable Context context) {
        super(context);
    }

    public final void setStateWrapper(@Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        this.mStateWrapper = credentialProviderControllermaybeReportErrorFromResultReceiver1;
    }

    protected final void updateSubviewFrameState(int i, int i2, int i3, int i4) {
        updateState(i, i2, i3, i4);
    }

    public final void updateState(int i, int i2, int i3, int i4) {
        float fOnExtraCallback = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i);
        float fOnExtraCallback2 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i2);
        float fOnExtraCallback3 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i3);
        float fOnExtraCallback4 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(i4);
        if (Math.abs(this.lastWidth - fOnExtraCallback) >= DELTA || Math.abs(this.lastHeight - fOnExtraCallback2) >= DELTA || Math.abs(this.lastOffsetX - fOnExtraCallback3) >= DELTA || Math.abs(this.lastOffsetY - fOnExtraCallback4) >= DELTA) {
            this.lastWidth = fOnExtraCallback;
            this.lastHeight = fOnExtraCallback2;
            this.lastOffsetX = fOnExtraCallback3;
            this.lastOffsetY = fOnExtraCallback4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fOnExtraCallback);
            writableNativeMap.putDouble("frameHeight", fOnExtraCallback2);
            writableNativeMap.putDouble("contentOffsetX", fOnExtraCallback3);
            writableNativeMap.putDouble("contentOffsetY", fOnExtraCallback4);
            CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1 = this.mStateWrapper;
            if (credentialProviderControllermaybeReportErrorFromResultReceiver1 != null) {
                credentialProviderControllermaybeReportErrorFromResultReceiver1.updateState(writableNativeMap);
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
