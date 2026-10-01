package viva.republica.toss.network.model.ars;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import o.AdSettingsApi;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReportAccountArsAgreementResp extends BaseApiResponse<Success> {

    public static final class Success {

        @SerializedName("status")
        private final AdSettingsApi status = AdSettingsApi.UNDEFINED;
    }
}
