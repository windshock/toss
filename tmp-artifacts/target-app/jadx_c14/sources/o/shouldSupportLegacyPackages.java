package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class shouldSupportLegacyPackages extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public shouldSupportLegacyPackages(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.IAuthTabCallback.onNavigationEvent(jsonWriter, obj == ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.TEXT_CTA ? 394 : obj == ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.HTML ? 795 : obj == ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.LINE_THROUGH ? 797 : obj == ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.NORMAL ? 837 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        int iOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(jsonReader);
        if (iOnExtraCallbackWithResult == 184) {
            return ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.TEXT_CTA;
        }
        if (iOnExtraCallbackWithResult == 191) {
            return ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.NORMAL;
        }
        if (iOnExtraCallbackWithResult == 765) {
            return ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.LINE_THROUGH;
        }
        if (iOnExtraCallbackWithResult != 816) {
            return null;
        }
        return ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.HTML;
    }
}
