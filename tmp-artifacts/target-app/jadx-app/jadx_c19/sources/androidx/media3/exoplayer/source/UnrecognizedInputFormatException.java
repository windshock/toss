package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<ExposedDropdownMenu_androidKtExternalSyntheticLambda1> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends ExposedDropdownMenu_androidKtExternalSyntheticLambda1> list) {
        super(str, (Throwable) null, false, 1);
        this.uri = uri;
        this.sniffFailures = ImmutableList.copyOf(list);
    }
}
