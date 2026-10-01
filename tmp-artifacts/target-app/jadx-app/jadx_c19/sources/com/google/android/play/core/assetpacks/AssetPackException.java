package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AssetPackException extends ApiException {
    public int getErrorCode() {
        return super.getStatusCode();
    }

    AssetPackException(@AssetPackErrorCode int i2) {
        super(new Status(i2, String.format(Locale.getDefault(), "Asset Pack Download Error(%d): %s", Integer.valueOf(i2), com.google.android.play.core.assetpacks.model.a.a(i2))));
        if (i2 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
