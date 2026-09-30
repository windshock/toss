package o;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.ContentHandler;
import org.xml.sax.XMLReader;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class indexOfElementdefault implements Html.TagHandler {
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final Context IAuthTabCallback;
    private final CertificatePinner onExtraCallback;
    private final getSpecialFeatureOptInStatus onExtraCallbackWithResult;
    private final Function1<String, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public indexOfElementdefault(@NotNull Context context, @NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, @Nullable Function1<? super String, Unit> function1, @NotNull CertificatePinner certificatePinner) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Intrinsics.checkNotNullParameter(certificatePinner, "");
        this.IAuthTabCallback = context;
        this.onExtraCallbackWithResult = getspecialfeatureoptinstatus;
        this.onNavigationEvent = function1;
        this.onExtraCallback = certificatePinner;
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z, @Nullable String str, @Nullable Editable editable, @Nullable XMLReader xMLReader) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
            if (xMLReader == null) {
                return;
            }
        } else if (xMLReader == null) {
            return;
        }
        if (editable != null) {
            int i5 = i2 + 7;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (z && Intrinsics.areEqual(str, "ContentHandlerReplacementTag")) {
                ContentHandler contentHandler = xMLReader.getContentHandler();
                Context context = this.IAuthTabCallback;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = this.onExtraCallbackWithResult;
                Intrinsics.checkNotNull(contentHandler);
                xMLReader.setContentHandler(new Call(context, getspecialfeatureoptinstatus, contentHandler, editable, this.onNavigationEvent, this.onExtraCallback));
                int i6 = onTransact + 55;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }
}
