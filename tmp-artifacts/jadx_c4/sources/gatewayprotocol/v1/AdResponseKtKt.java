package gatewayprotocol.v1;

import android.os.Process;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdResponseKtKt {
    public static int IAuthTabCallback;
    public static int onExtraCallback;

    /* renamed from: -initializeadResponse, reason: not valid java name */
    public static final AdResponseOuterClass.AdResponse m10initializeadResponse(@NotNull Function1<? super AdResponseKt.Dsl, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder builderNewBuilder = AdResponseOuterClass.AdResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "");
        AdResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        function1.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdResponseOuterClass.AdResponse copy(@NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull Function1<? super AdResponseKt.Dsl, Unit> function1) {
        Intrinsics.checkNotNullParameter(adResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder builder = adResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "");
        AdResponseKt.Dsl dsl_create = companion._create(builder);
        function1.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(@NotNull AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adResponseOrBuilder, "");
        if (adResponseOrBuilder.hasWebviewConfiguration()) {
            return adResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adResponseOrBuilder, "");
        if (adResponseOrBuilder.hasError()) {
            return adResponseOrBuilder.getError();
        }
        return null;
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(@NotNull AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adResponseOrBuilder, "");
        if (adResponseOrBuilder.hasCampaignMetadata()) {
            return adResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    public static int IAuthTabCallback() {
        int i = IAuthTabCallback;
        int i2 = i % 5974562;
        IAuthTabCallback = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int iMyPid = Process.myPid();
        onExtraCallback = iMyPid;
        return iMyPid;
    }
}
