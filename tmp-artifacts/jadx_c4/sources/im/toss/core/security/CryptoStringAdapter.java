package im.toss.core.security;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRoundCornerProgressBar1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CryptoStringAdapter extends TypeAdapter<BaseRoundCornerProgressBar1> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* synthetic */ Object read(JsonReader jsonReader) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1OnExtraCallback = onExtraCallback(jsonReader);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return baseRoundCornerProgressBar1OnExtraCallback;
    }

    public /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(jsonWriter, (BaseRoundCornerProgressBar1) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(@NotNull JsonWriter jsonWriter, @Nullable BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1) {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonWriter, "");
            int i3 = 58 / 0;
            if (baseRoundCornerProgressBar1 != null) {
                int i4 = onExtraCallback + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                string = baseRoundCornerProgressBar1.toString();
                if (i5 == 0) {
                    int i6 = 19 / 0;
                }
            } else {
                string = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(jsonWriter, "");
            if (baseRoundCornerProgressBar1 != null) {
            }
        }
        jsonWriter.value(string);
    }

    public BaseRoundCornerProgressBar1 onExtraCallback(@NotNull JsonReader jsonReader) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonReader, "");
        if (jsonReader.peek() == JsonToken.NULL) {
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        Intrinsics.checkNotNullExpressionValue(strNextString, "");
        BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1 = new BaseRoundCornerProgressBar1(strNextString);
        int i6 = onExtraCallback + 91;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
        return baseRoundCornerProgressBar1;
    }
}
