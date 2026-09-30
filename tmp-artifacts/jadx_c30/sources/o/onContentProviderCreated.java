package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onContentProviderCreated extends BaseApiResponse<onWarmupCompleted> {
    public static final int $stable = 8;

    public static final class onWarmupCompleted {
        public static final int $stable = 8;

        @SerializedName("info")
        private final setHorizonWorldUrlLauncher info;
    }
}
