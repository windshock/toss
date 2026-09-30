package o;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class requestChildOnScreen extends DefaultHandler {
    private String onExtraCallbackWithResult;
    private boolean onWarmupCompleted = false;

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    public String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (onExtraCallbackWithResult.onExtraCallback[getScrollingChildHelper.valueOf(str2).ordinal()] != 2) {
            return;
        }
        this.onWarmupCompleted = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        if (this.onWarmupCompleted) {
            this.onExtraCallbackWithResult = new String(cArr).trim();
        }
    }

    public static /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[getScrollingChildHelper.values().length];
            onExtraCallback = iArr;
            try {
                iArr[getScrollingChildHelper.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[getScrollingChildHelper.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (onExtraCallbackWithResult.onExtraCallback[getScrollingChildHelper.valueOf(str2).ordinal()] != 2) {
            return;
        }
        attributes.getValue(getDecoratedBoundsWithMarginsInt.IAuthTabCallback("\u000bD\u001cB"));
        this.onWarmupCompleted = true;
    }
}
