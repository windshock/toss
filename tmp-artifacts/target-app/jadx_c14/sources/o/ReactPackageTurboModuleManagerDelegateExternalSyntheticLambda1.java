package o;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 {
    public static final int $stable = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("dark")
    private String dark;

    @SerializedName("light")
    private String light;

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1)) {
            return false;
        }
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 = (ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1) obj;
        if (!Intrinsics.areEqual(this.light, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.light)) {
            return false;
        }
        if (Intrinsics.areEqual(this.dark, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.dark)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.light.hashCode() * 31) + this.dark.hashCode();
        int i4 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThemeColor(light=" + this.light + ", dark=" + this.dark + ")";
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.light = str;
        this.dark = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "#00000000";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str2 = "#00000000";
        }
        this(str, str2);
    }

    public final int onWarmupCompleted(@NotNull Context context, int i) {
        String str;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int color = ContextCompat.getColor(context, i);
        try {
            if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                str = this.light;
            } else {
                str = this.dark;
                int i5 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            return Color.parseColor(str);
        } catch (Exception unused) {
            return color;
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 550);
        jsonWriter.value(this.dark);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 367);
        jsonWriter.value(this.light);
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 318) {
            if (!z) {
                this.dark = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.dark = jsonReader.nextString();
                return;
            } else {
                this.dark = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 488) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.light = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.light = jsonReader.nextString();
        } else {
            this.light = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
