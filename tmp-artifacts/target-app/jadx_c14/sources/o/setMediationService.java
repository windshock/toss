package o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setMediationService {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallback = 0;
    public static final String onNavigationEvent = "titleInfo";

    @SerializedName("hasCert")
    private onExtraCallbackWithResult onExtraCallbackWithResult;

    @SerializedName("default")
    private onExtraCallbackWithResult onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public setMediationService() {
        onExtraCallbackWithResult onextracallbackwithresult = null;
        this(onextracallbackwithresult, onextracallbackwithresult, 3, onextracallbackwithresult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMediationService)) {
            return false;
        }
        setMediationService setmediationservice = (setMediationService) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, setmediationservice.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, setmediationservice.onExtraCallbackWithResult);
    }

    public int hashCode() {
        onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        int iHashCode = onextracallbackwithresult == null ? 0 : onextracallbackwithresult.hashCode();
        onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallbackWithResult;
        return (iHashCode * 31) + (onextracallbackwithresult2 != null ? onextracallbackwithresult2.hashCode() : 0);
    }

    public String toString() {
        return "VendorSelectTitleInfo(default=" + this.onWarmupCompleted + ", hasCert=" + this.onExtraCallbackWithResult + ")";
    }

    public setMediationService(@Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallbackWithResult onextracallbackwithresult2) {
        this.onWarmupCompleted = onextracallbackwithresult;
        this.onExtraCallbackWithResult = onextracallbackwithresult2;
    }

    public /* synthetic */ setMediationService(onExtraCallbackWithResult onextracallbackwithresult, onExtraCallbackWithResult onextracallbackwithresult2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onextracallbackwithresult, (i & 2) != 0 ? null : onextracallbackwithresult2);
    }

    public final onExtraCallbackWithResult onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public static final class onExtraCallbackWithResult {
        public static final int onExtraCallbackWithResult = 0;

        @SerializedName("singleSubtitle")
        private String IAuthTabCallback;

        @SerializedName("allTitle")
        private String onExtraCallback;

        @SerializedName("singleTitle")
        private String onNavigationEvent;

        @SerializedName("allButton")
        private String onWarmupCompleted;

        public onExtraCallbackWithResult() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted);
        }

        public int hashCode() {
            String str = this.onNavigationEvent;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.IAuthTabCallback;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.onExtraCallback;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.onWarmupCompleted;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "TitleSet(singleTitle=" + this.onNavigationEvent + ", singleSubtitle=" + this.IAuthTabCallback + ", allTitle=" + this.onExtraCallback + ", allButton=" + this.onWarmupCompleted + ")";
        }

        public onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.onNavigationEvent = str;
            this.IAuthTabCallback = str2;
            this.onExtraCallback = str3;
            this.onWarmupCompleted = str4;
        }

        public /* synthetic */ onExtraCallbackWithResult(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }

        public final String onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        public final String onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 829);
            jsonWriter.value(this.onWarmupCompleted);
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 387);
            jsonWriter.value(this.onExtraCallback);
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 731);
            jsonWriter.value(this.IAuthTabCallback);
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 581);
            jsonWriter.value(this.onNavigationEvent);
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 100) {
                if (!z) {
                    this.onNavigationEvent = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.onNavigationEvent = jsonReader.nextString();
                    return;
                } else {
                    this.onNavigationEvent = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 237) {
                if (!z) {
                    this.onExtraCallback = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.onExtraCallback = jsonReader.nextString();
                    return;
                } else {
                    this.onExtraCallback = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 354) {
                if (!z) {
                    this.IAuthTabCallback = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.IAuthTabCallback = jsonReader.nextString();
                    return;
                } else {
                    this.IAuthTabCallback = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i != 492) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.onWarmupCompleted = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.onWarmupCompleted = jsonReader.nextString();
            } else {
                this.onWarmupCompleted = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 768);
        onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, onExtraCallbackWithResult.class, onextracallbackwithresult).write(jsonWriter, onextracallbackwithresult);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 858);
        onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallbackWithResult;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, onExtraCallbackWithResult.class, onextracallbackwithresult2).write(jsonWriter, onextracallbackwithresult2);
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 2) {
            if (z) {
                this.onExtraCallbackWithResult = (onExtraCallbackWithResult) gson.getAdapter(onExtraCallbackWithResult.class).read(jsonReader);
                return;
            } else {
                this.onExtraCallbackWithResult = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 526) {
            jsonReader.skipValue();
        } else if (z) {
            this.onWarmupCompleted = (onExtraCallbackWithResult) gson.getAdapter(onExtraCallbackWithResult.class).read(jsonReader);
        } else {
            this.onWarmupCompleted = null;
            jsonReader.nextNull();
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0516  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x052e  */
        /* JADX WARN: Removed duplicated region for block: B:389:0x0a77  */
        /* JADX WARN: Removed duplicated region for block: B:568:0x0f92  */
        /* JADX WARN: Removed duplicated region for block: B:578:0x0faa  */
        /* JADX WARN: Removed duplicated region for block: B:767:0x14e3  */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Character] */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Byte] */
        /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Short] */
        /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r0v71 */
        /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.setMediationService onNavigationEvent(@org.jetbrains.annotations.Nullable android.content.Intent r29) {
            /*
                Method dump skipped, instructions count: 5373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMediationService.onNavigationEvent.onNavigationEvent(android.content.Intent):o.setMediationService");
        }
    }
}
