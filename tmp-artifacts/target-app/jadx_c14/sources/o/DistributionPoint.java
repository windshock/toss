package o;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DistributionPoint {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderUnknownNumberParsing<String> onWarmupCompleted(wasLastName waslastname) {
        JsonReaderUnknownNumberParsing<String> jsonReaderUnknownNumberParsingAsBinder;
        if (waslastname != null && (jsonReaderUnknownNumberParsingAsBinder = waslastname.asBinder()) != null) {
            return jsonReaderUnknownNumberParsingAsBinder;
        }
        JsonReaderUnknownNumberParsing<String> jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onExtraCallback("");
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        return jsonReaderUnknownNumberParsingOnExtraCallback;
    }
}
