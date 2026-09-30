package o;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.Html;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.ContentHandler;
import org.xml.sax.XMLReader;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class indexOfElement {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static final Html.TagHandler onExtraCallback = new IAuthTabCallback();
    private static final Html.TagHandler onExtraCallbackWithResult = new onExtraCallback();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final class IAuthTabCallback implements Html.TagHandler {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback() {
        }

        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            int i = 2 % 2;
            if (xMLReader != null) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (editable == null || !z) {
                    return;
                }
                int i5 = i2 + 19;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.areEqual(str, "ContentHandlerReplacementTag");
                    throw null;
                }
                if (Intrinsics.areEqual(str, "ContentHandlerReplacementTag")) {
                    ContentHandler contentHandler = xMLReader.getContentHandler();
                    Context contextIAuthTabCallbackStubProxy = getTcfVendorConsentStatus.Companion.IAuthTabCallbackStubProxy();
                    Configuration configuration = contextIAuthTabCallbackStubProxy.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = readIntokhttp.onExtraCallback(configuration) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
                    Intrinsics.checkNotNull(contentHandler);
                    xMLReader.setContentHandler(new Call(contextIAuthTabCallbackStubProxy, getspecialfeatureoptinstatus, contentHandler, editable, (Function1) null, (CertificatePinner) null, 48, (DefaultConstructorMarker) null));
                    int i6 = onExtraCallback + 117;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
    }

    static {
        int i = onNavigationEvent + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final Html.TagHandler onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Html.TagHandler tagHandler = onExtraCallback;
        int i5 = i2 + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return tagHandler;
    }

    public static final class onExtraCallback implements Html.TagHandler {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onExtraCallback() {
        }

        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            int i = 2 % 2;
            if (xMLReader != null && editable != null) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 123;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (z) {
                    int i5 = i2 + 123;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (Intrinsics.areEqual(str, "ContentHandlerReplacementTag")) {
                        ContentHandler contentHandler = xMLReader.getContentHandler();
                        Context contextIAuthTabCallbackStubProxy = getTcfVendorConsentStatus.Companion.IAuthTabCallbackStubProxy();
                        Configuration configuration = contextIAuthTabCallbackStubProxy.getResources().getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration, "");
                        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = readIntokhttp.onExtraCallback(configuration) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
                        Intrinsics.checkNotNull(contentHandler);
                        xMLReader.setContentHandler(new Call(contextIAuthTabCallbackStubProxy, getspecialfeatureoptinstatus, contentHandler, editable, (Function1) null, (CertificatePinner) null, 48, (DefaultConstructorMarker) null));
                    }
                }
            }
            int i7 = onNavigationEvent + 103;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }
}
