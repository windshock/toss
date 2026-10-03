package o;

import android.text.AndroidCharacter;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExternalSyntheticLambda4 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -936380359087738693L;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("action")
    private onWarmupCompleted action;

    @SerializedName("clickLogId")
    private Long clickLogId;

    @SerializedName("scheme")
    private String scheme;

    @SerializedName("title")
    private String title;

    public ImagePipelineExternalSyntheticLambda4() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ImagePipelineExternalSyntheticLambda4)) {
            return false;
        }
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4 = (ImagePipelineExternalSyntheticLambda4) obj;
        if (!Intrinsics.areEqual(this.title, imagePipelineExternalSyntheticLambda4.title)) {
            int i7 = onExtraCallback + 77;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.action != imagePipelineExternalSyntheticLambda4.action) {
            return false;
        }
        if (Intrinsics.areEqual(this.scheme, imagePipelineExternalSyntheticLambda4.scheme)) {
            return !(Intrinsics.areEqual(this.clickLogId, imagePipelineExternalSyntheticLambda4.clickLogId) ^ true);
        }
        int i9 = onNavigationEvent + 81;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        onWarmupCompleted onwarmupcompleted = this.action;
        int iHashCode3 = 0;
        int iHashCode4 = onwarmupcompleted == null ? 0 : onwarmupcompleted.hashCode();
        String str = this.scheme;
        if (str == null) {
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Long l = this.clickLogId;
        if (l != null) {
            int i7 = onNavigationEvent + 19;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                l.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = l.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanButton(title=" + this.title + ", action=" + this.action + ", scheme=" + this.scheme + ", clickLogId=" + this.clickLogId + ")";
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ImagePipelineExternalSyntheticLambda4(@NotNull String str, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable String str2, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.action = onwarmupcompleted;
        this.scheme = str2;
        this.clickLogId = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExternalSyntheticLambda4(String str, onWarmupCompleted onwarmupcompleted, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i & 1) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{25561, 8907}, 20591 - AndroidCharacter.getMirror('0'), objArr);
            str = ((String) objArr[0]).intern();
        }
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            onwarmupcompleted = null;
        }
        if ((i & 4) != 0) {
            int i3 = onExtraCallback + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            str2 = null;
        }
        if ((i & 8) != 0) {
            int i5 = onNavigationEvent + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l = null;
        }
        this(str, onwarmupcompleted, str2, l);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 63;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ImagePipelineExternalSyntheticLambda4.a(char[], int, java.lang.Object[]):void");
    }

    public final onWarmupCompleted onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.action;
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.scheme;
        int i4 = i3 + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.clickLogId;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted BACK = new onWarmupCompleted("BACK", 0);
        public static final onWarmupCompleted LANDING = new onWarmupCompleted("LANDING", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {BACK, LANDING};
            int i5 = i3 + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 125;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 33;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        if (i3 == 0) {
            jsonWriter.endObject();
            return;
        }
        jsonWriter.endObject();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 647);
        onWarmupCompleted onwarmupcompleted = this.action;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, onWarmupCompleted.class, onwarmupcompleted).write(jsonWriter, onwarmupcompleted);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 879);
        Long l = this.clickLogId;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Long.class, l).write(jsonWriter, l);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 787);
        jsonWriter.value(this.scheme);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 131);
        jsonWriter.value(this.title);
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        int i = 2 % 2;
        jsonReader.beginObject();
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 2;
        }
        while (jsonReader.hasNext()) {
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                throw null;
            }
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (jsonReader.peek() != JsonToken.NULL) {
            int i5 = onExtraCallback + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = onExtraCallback + 1;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (i == 304) {
            if (z) {
                this.clickLogId = (Long) gson.getAdapter(Long.class).read(jsonReader);
                return;
            } else {
                this.clickLogId = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 730) {
            if (!z) {
                this.scheme = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.scheme = jsonReader.nextString();
                return;
            } else {
                this.scheme = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 806) {
            if (!z) {
                this.title = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.title = jsonReader.nextString();
                return;
            } else {
                this.title = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 839) {
            jsonReader.skipValue();
            return;
        }
        if (z) {
            this.action = (onWarmupCompleted) gson.getAdapter(onWarmupCompleted.class).read(jsonReader);
            return;
        }
        this.action = null;
        jsonReader.nextNull();
        int i9 = onNavigationEvent + 19;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }
}
