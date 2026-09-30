package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AdNativeComponentView extends BaseApiResponse<onExtraCallback> {

    public static final class onExtraCallback {

        @SerializedName("requestId")
        private final String requestId = BuildConfig.FLAVOR;
    }
}
