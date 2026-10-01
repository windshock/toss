package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class thxzb extends DefaultHandler implements thx10, XMLReader, LexicalHandler {
    private static boolean IAuthTabCallback = false;
    private static boolean IAuthTabCallbackDefault = true;
    private static boolean IAuthTabCallbackStub = true;
    private static boolean asInterface = true;
    private static boolean onExtraCallback = true;
    private static boolean onExtraCallbackWithResult = false;
    private static boolean onNavigationEvent = true;
    private static boolean onTransact = false;
    private static boolean onWarmupCompleted = false;
    private int ICustomTabsCallbackDefault;
    private String ICustomTabsCallbackStub;
    private setOuterDislike ICustomTabsCallback_Parcel;
    private String extraCallbackWithResult;
    private HashMap extraCommand;
    private setOuterDislike mayLaunchUrl;
    private thxsya newAuthTabSession;
    private setOuterDislike newSession;
    private setOuterDislike newSessionWithExtras;
    private setJsbLandingPageOpenListener onActivityResized;
    private char[] onMessageChannelReady;
    private boolean onMinimized;
    private String onRelationshipValidationResult;
    private String onUnminimized;
    private String postMessage;
    private thx9 prefetch;
    private boolean requestPostMessageChannelWithExtras;
    private static char[] asBinder = {'<', '/', '>'};
    private static String access000 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-'()+,./:=?;!*#@$_%";
    private ContentHandler onActivityLayout = this;
    private LexicalHandler ICustomTabsService = this;
    private DTDHandler onPostMessage = this;
    private ErrorHandler isEngagementSignalsApiAvailable = this;
    private EntityResolver ICustomTabsCallbackStubProxy = this;
    private boolean ICustomTabsCallback = IAuthTabCallbackStub;
    private boolean writeTypedObject = onWarmupCompleted;
    private boolean getInterfaceDescriptor = IAuthTabCallback;
    private boolean extraCallback = asInterface;
    private boolean access100 = onExtraCallback;
    private boolean requestPostMessageChannel = onTransact;
    private boolean readTypedObject = IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStubProxy = onExtraCallbackWithResult;
    private boolean IAuthTabCallback_Parcel = onNavigationEvent;

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) throws SAXException {
    }

    public thxzb() {
        HashMap map = new HashMap();
        this.extraCommand = map;
        map.put("http://xml.org/sax/features/namespaces", onExtraCallback(IAuthTabCallbackStub));
        HashMap map2 = this.extraCommand;
        Boolean bool = Boolean.FALSE;
        map2.put("http://xml.org/sax/features/namespace-prefixes", bool);
        this.extraCommand.put("http://xml.org/sax/features/external-general-entities", bool);
        this.extraCommand.put("http://xml.org/sax/features/external-parameter-entities", bool);
        this.extraCommand.put("http://xml.org/sax/features/is-standalone", bool);
        this.extraCommand.put("http://xml.org/sax/features/lexical-handler/parameter-entities", bool);
        HashMap map3 = this.extraCommand;
        Boolean bool2 = Boolean.TRUE;
        map3.put("http://xml.org/sax/features/resolve-dtd-uris", bool2);
        this.extraCommand.put("http://xml.org/sax/features/string-interning", bool2);
        this.extraCommand.put("http://xml.org/sax/features/use-attributes2", bool);
        this.extraCommand.put("http://xml.org/sax/features/use-locator2", bool);
        this.extraCommand.put("http://xml.org/sax/features/use-entity-resolver2", bool);
        this.extraCommand.put("http://xml.org/sax/features/validation", bool);
        this.extraCommand.put("http://xml.org/sax/features/xmlns-uris", bool);
        this.extraCommand.put("http://xml.org/sax/features/xmlns-uris", bool);
        this.extraCommand.put("http://xml.org/sax/features/xml-1.1", bool);
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons", onExtraCallback(onWarmupCompleted));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty", onExtraCallback(IAuthTabCallback));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/root-bogons", onExtraCallback(asInterface));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/default-attributes", onExtraCallback(onExtraCallback));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/translate-colons", onExtraCallback(onTransact));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/restart-elements", onExtraCallback(IAuthTabCallbackDefault));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace", onExtraCallback(onExtraCallbackWithResult));
        this.extraCommand.put("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements", onExtraCallback(onNavigationEvent));
        this.mayLaunchUrl = null;
        this.extraCallbackWithResult = null;
        this.onMinimized = false;
        this.onRelationshipValidationResult = null;
        this.ICustomTabsCallbackStub = null;
        this.onUnminimized = null;
        this.postMessage = null;
        this.newSession = null;
        this.newSessionWithExtras = null;
        this.ICustomTabsCallback_Parcel = null;
        this.ICustomTabsCallbackDefault = 0;
        this.requestPostMessageChannelWithExtras = true;
        this.onMessageChannelReady = new char[2000];
    }

    private static Boolean onExtraCallback(boolean z) {
        return z ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // org.xml.sax.XMLReader
    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        Boolean bool = (Boolean) this.extraCommand.get(str);
        if (bool == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unknown feature ");
            stringBuffer.append(str);
            throw new SAXNotRecognizedException(stringBuffer.toString());
        }
        return bool.booleanValue();
    }

    @Override // org.xml.sax.XMLReader
    public void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (((Boolean) this.extraCommand.get(str)) == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unknown feature ");
            stringBuffer.append(str);
            throw new SAXNotRecognizedException(stringBuffer.toString());
        }
        if (z) {
            this.extraCommand.put(str, Boolean.TRUE);
        } else {
            this.extraCommand.put(str, Boolean.FALSE);
        }
        if (str.equals("http://xml.org/sax/features/namespaces")) {
            this.ICustomTabsCallback = z;
            return;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons")) {
            this.writeTypedObject = z;
            return;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty")) {
            this.getInterfaceDescriptor = z;
            return;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/root-bogons")) {
            this.extraCallback = z;
            return;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/default-attributes")) {
            this.access100 = z;
            return;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/translate-colons")) {
            this.requestPostMessageChannel = z;
            return;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/restart-elements")) {
            this.readTypedObject = z;
        } else if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace")) {
            this.IAuthTabCallbackStubProxy = z;
        } else if (str.equals("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements")) {
            this.IAuthTabCallback_Parcel = z;
        }
    }

    @Override // org.xml.sax.XMLReader
    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (str.equals("http://xml.org/sax/properties/lexical-handler")) {
            LexicalHandler lexicalHandler = this.ICustomTabsService;
            if (lexicalHandler == this) {
                return null;
            }
            return lexicalHandler;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner")) {
            return this.prefetch;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema")) {
            return this.newAuthTabSession;
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector")) {
            return this.onActivityResized;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown property ");
        stringBuffer.append(str);
        throw new SAXNotRecognizedException(stringBuffer.toString());
    }

    @Override // org.xml.sax.XMLReader
    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (str.equals("http://xml.org/sax/properties/lexical-handler")) {
            if (obj == null) {
                this.ICustomTabsService = this;
                return;
            } else {
                if (obj instanceof LexicalHandler) {
                    this.ICustomTabsService = (LexicalHandler) obj;
                    return;
                }
                throw new SAXNotSupportedException("Your lexical handler is not a LexicalHandler");
            }
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner")) {
            if (obj instanceof thx9) {
                this.prefetch = (thx9) obj;
                return;
            }
            throw new SAXNotSupportedException("Your scanner is not a Scanner");
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema")) {
            if (obj instanceof thxsya) {
                this.newAuthTabSession = (thxsya) obj;
                return;
            }
            throw new SAXNotSupportedException("Your schema is not a Schema");
        }
        if (str.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector")) {
            if (obj instanceof setJsbLandingPageOpenListener) {
                this.onActivityResized = (setJsbLandingPageOpenListener) obj;
                return;
            }
            throw new SAXNotSupportedException("Your auto-detector is not an AutoDetector");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown property ");
        stringBuffer.append(str);
        throw new SAXNotRecognizedException(stringBuffer.toString());
    }

    @Override // org.xml.sax.XMLReader
    public void setEntityResolver(EntityResolver entityResolver) {
        if (entityResolver == null) {
            entityResolver = this;
        }
        this.ICustomTabsCallbackStubProxy = entityResolver;
    }

    @Override // org.xml.sax.XMLReader
    public EntityResolver getEntityResolver() {
        EntityResolver entityResolver = this.ICustomTabsCallbackStubProxy;
        if (entityResolver == this) {
            return null;
        }
        return entityResolver;
    }

    @Override // org.xml.sax.XMLReader
    public void setDTDHandler(DTDHandler dTDHandler) {
        if (dTDHandler == null) {
            dTDHandler = this;
        }
        this.onPostMessage = dTDHandler;
    }

    @Override // org.xml.sax.XMLReader
    public DTDHandler getDTDHandler() {
        DTDHandler dTDHandler = this.onPostMessage;
        if (dTDHandler == this) {
            return null;
        }
        return dTDHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setContentHandler(ContentHandler contentHandler) {
        if (contentHandler == null) {
            contentHandler = this;
        }
        this.onActivityLayout = contentHandler;
    }

    @Override // org.xml.sax.XMLReader
    public ContentHandler getContentHandler() {
        ContentHandler contentHandler = this.onActivityLayout;
        if (contentHandler == this) {
            return null;
        }
        return contentHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setErrorHandler(ErrorHandler errorHandler) {
        if (errorHandler == null) {
            errorHandler = this;
        }
        this.isEngagementSignalsApiAvailable = errorHandler;
    }

    @Override // org.xml.sax.XMLReader
    public ErrorHandler getErrorHandler() {
        ErrorHandler errorHandler = this.isEngagementSignalsApiAvailable;
        if (errorHandler == this) {
            return null;
        }
        return errorHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void parse(InputSource inputSource) throws SAXException, IOException {
        onExtraCallback();
        Reader readerOnExtraCallbackWithResult = onExtraCallbackWithResult(inputSource);
        this.onActivityLayout.startDocument();
        this.prefetch.onWarmupCompleted(inputSource.getPublicId(), inputSource.getSystemId());
        thx9 thx9Var = this.prefetch;
        if (thx9Var instanceof Locator) {
            this.onActivityLayout.setDocumentLocator((Locator) thx9Var);
        }
        if (!this.newAuthTabSession.onWarmupCompleted().equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
            this.onActivityLayout.startPrefixMapping(this.newAuthTabSession.IAuthTabCallback(), this.newAuthTabSession.onWarmupCompleted());
        }
        this.prefetch.onNavigationEvent(readerOnExtraCallbackWithResult, this);
    }

    @Override // org.xml.sax.XMLReader
    public void parse(String str) throws SAXException, IOException {
        parse(new InputSource(str));
    }

    private void onExtraCallback() {
        if (this.newAuthTabSession == null) {
            this.newAuthTabSession = new setDislike();
        }
        if (this.prefetch == null) {
            this.prefetch = new setVideoBusiness();
        }
        if (this.onActivityResized == null) {
            this.onActivityResized = new setVideoFrameChangeListener(this);
        }
        this.newSession = new setOuterDislike(this.newAuthTabSession.IAuthTabCallback("<root>"), this.access100);
        this.ICustomTabsCallback_Parcel = new setOuterDislike(this.newAuthTabSession.IAuthTabCallback("<pcdata>"), this.access100);
        this.mayLaunchUrl = null;
        this.extraCallbackWithResult = null;
        this.postMessage = null;
        this.newSessionWithExtras = null;
        this.ICustomTabsCallbackDefault = 0;
        this.requestPostMessageChannelWithExtras = true;
        this.ICustomTabsCallbackStub = null;
        this.onRelationshipValidationResult = null;
        this.onUnminimized = null;
    }

    private Reader onExtraCallbackWithResult(InputSource inputSource) throws SAXException, IOException {
        Reader characterStream = inputSource.getCharacterStream();
        InputStream byteStream = inputSource.getByteStream();
        String encoding = inputSource.getEncoding();
        String publicId = inputSource.getPublicId();
        String systemId = inputSource.getSystemId();
        if (characterStream != null) {
            return characterStream;
        }
        if (byteStream == null) {
            byteStream = onExtraCallbackWithResult(publicId, systemId);
        }
        if (encoding == null) {
            return this.onActivityResized.onExtraCallback(byteStream);
        }
        try {
            return new InputStreamReader(byteStream, encoding);
        } catch (UnsupportedEncodingException unused) {
            return new InputStreamReader(byteStream);
        }
    }

    private InputStream onExtraCallbackWithResult(String str, String str2) throws SAXException, IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(System.getProperty("user.dir"));
        stringBuffer.append("/.");
        return new URL(new URL("file", _UrlKt.FRAGMENT_ENCODE_SET, stringBuffer.toString()), str2).openConnection().getInputStream();
    }

    @Override // o.thx10
    public void onExtraCallbackWithResult(char[] cArr, int i, int i2) throws SAXException, ArrayIndexOutOfBoundsException {
        String str;
        setOuterDislike setouterdislike = this.mayLaunchUrl;
        if (setouterdislike == null || (str = this.extraCallbackWithResult) == null) {
            return;
        }
        setouterdislike.IAuthTabCallback(str, null, str);
        this.extraCallbackWithResult = null;
    }

    @Override // o.thx10
    public void onNavigationEvent(char[] cArr, int i, int i2) throws SAXException {
        if (this.mayLaunchUrl == null) {
            return;
        }
        this.extraCallbackWithResult = extraCallbackWithResult(cArr, i, i2).toLowerCase();
    }

    @Override // o.thx10
    public void IAuthTabCallback(char[] cArr, int i, int i2) throws SAXException, ArrayIndexOutOfBoundsException {
        if (this.mayLaunchUrl == null || this.extraCallbackWithResult == null) {
            return;
        }
        this.mayLaunchUrl.IAuthTabCallback(this.extraCallbackWithResult, null, onExtraCallback(new String(cArr, i, i2)));
        this.extraCallbackWithResult = null;
    }

    private String onExtraCallback(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            int i4 = i2 + 1;
            cArr[i2] = cCharAt;
            if (cCharAt == '&' && i == -1) {
                i2 = i4;
                i = i2;
            } else if (i == -1 || Character.isLetter(cCharAt) || Character.isDigit(cCharAt) || cCharAt == '#') {
                i2 = i4;
            } else if (cCharAt == ';') {
                int iExtraCallback = extraCallback(cArr, i, (i4 - i) - 1);
                if (iExtraCallback > 65535) {
                    int i5 = iExtraCallback - Imgproc.FLOODFILL_FIXED_RANGE;
                    cArr[i - 1] = (char) ((i5 >> 10) + 55296);
                    cArr[i] = (char) ((i5 & 1023) + 56320);
                    i++;
                } else if (iExtraCallback != 0) {
                    cArr[i - 1] = (char) iExtraCallback;
                } else {
                    i = i4;
                }
                i2 = i;
                i = -1;
            } else {
                i = -1;
                i2 = i4;
            }
        }
        return new String(cArr, 0, i2);
    }

    @Override // o.thx10
    public void asInterface(char[] cArr, int i, int i2) throws SAXException {
        this.ICustomTabsCallbackDefault = extraCallback(cArr, i, i2);
    }

    private int extraCallback(char[] cArr, int i, int i2) {
        char c;
        if (i2 <= 0) {
            return 0;
        }
        if (cArr[i] != '#') {
            return this.newAuthTabSession.onWarmupCompleted(new String(cArr, i, i2));
        }
        if (i2 > 1 && ((c = cArr[i + 1]) == 'x' || c == 'X')) {
            try {
                return Integer.parseInt(new String(cArr, i + 2, i2 - 2), 16);
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        try {
            return Integer.parseInt(new String(cArr, i + 1, i2 - 1), 10);
        } catch (NumberFormatException unused2) {
            return 0;
        }
    }

    @Override // o.thx10
    public void IAuthTabCallbackStub(char[] cArr, int i, int i2) throws Throwable {
        if (this.requestPostMessageChannelWithExtras) {
            onExtraCallback(this.ICustomTabsCallback_Parcel);
        }
        while (this.newSession.IAuthTabCallbackDefault() != null) {
            onNavigationEvent();
        }
        if (!this.newAuthTabSession.onWarmupCompleted().equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
            this.onActivityLayout.endPrefixMapping(this.newAuthTabSession.IAuthTabCallback());
        }
        this.onActivityLayout.endDocument();
    }

    @Override // o.thx10
    public void asBinder(char[] cArr, int i, int i2) throws Throwable {
        if (IAuthTabCallbackDefault(cArr, i, i2)) {
            return;
        }
        onTransact(cArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r1 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallbackDefault(char[] cArr, int i, int i2) throws SAXException {
        String strAsInterface = this.newSession.asInterface();
        if (this.IAuthTabCallback_Parcel && (this.newSession.onExtraCallback() & 2) != 0) {
            boolean z = i2 == strAsInterface.length();
            if (z) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (Character.toLowerCase(cArr[i + i3]) != Character.toLowerCase(strAsInterface.charAt(i3))) {
                        this.onActivityLayout.characters(asBinder, 0, 2);
                        this.onActivityLayout.characters(cArr, i, i2);
                        this.onActivityLayout.characters(asBinder, 2, 1);
                        this.prefetch.onWarmupCompleted();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        onNavigationEvent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onTransact(char[] cArr, int i, int i2) throws Throwable {
        String strAsInterface;
        this.mayLaunchUrl = null;
        if (i2 != 0) {
            setVastVideoHelper setvastvideohelperIAuthTabCallback = this.newAuthTabSession.IAuthTabCallback(extraCallbackWithResult(cArr, i, i2));
            if (setvastvideohelperIAuthTabCallback == null) {
                return;
            } else {
                strAsInterface = setvastvideohelperIAuthTabCallback.IAuthTabCallback();
            }
        } else {
            strAsInterface = this.newSession.asInterface();
        }
        setOuterDislike setouterdislikeIAuthTabCallbackDefault = this.newSession;
        boolean z = false;
        while (setouterdislikeIAuthTabCallbackDefault != null && !setouterdislikeIAuthTabCallbackDefault.asInterface().equals(strAsInterface)) {
            if ((setouterdislikeIAuthTabCallbackDefault.onExtraCallback() & 4) != 0) {
                z = true;
            }
            setouterdislikeIAuthTabCallbackDefault = setouterdislikeIAuthTabCallbackDefault.IAuthTabCallbackDefault();
        }
        if (setouterdislikeIAuthTabCallbackDefault == null || setouterdislikeIAuthTabCallbackDefault.IAuthTabCallbackDefault() == null || setouterdislikeIAuthTabCallbackDefault.IAuthTabCallbackDefault().IAuthTabCallbackDefault() == null) {
            return;
        }
        if (z) {
            setouterdislikeIAuthTabCallbackDefault.getInterfaceDescriptor();
        } else {
            while (this.newSession != setouterdislikeIAuthTabCallbackDefault) {
                onWarmupCompleted();
            }
            onNavigationEvent();
        }
        while (this.newSession.onWarmupCompleted()) {
            onNavigationEvent();
        }
        IAuthTabCallback((setOuterDislike) null);
    }

    private void IAuthTabCallback(setOuterDislike setouterdislike) throws SAXException, IOException, ArrayIndexOutOfBoundsException {
        while (true) {
            setOuterDislike setouterdislike2 = this.newSessionWithExtras;
            if (setouterdislike2 == null || !this.newSession.onExtraCallback(setouterdislike2)) {
                return;
            }
            if (setouterdislike != null && !this.newSessionWithExtras.onExtraCallback(setouterdislike)) {
                return;
            }
            setOuterDislike setouterdislikeIAuthTabCallbackDefault = this.newSessionWithExtras.IAuthTabCallbackDefault();
            onExtraCallbackWithResult(this.newSessionWithExtras);
            this.newSessionWithExtras = setouterdislikeIAuthTabCallbackDefault;
        }
    }

    private void onNavigationEvent() throws SAXException {
        setOuterDislike setouterdislike = this.newSession;
        if (setouterdislike == null) {
            return;
        }
        String strAsInterface = setouterdislike.asInterface();
        String strAsBinder = this.newSession.asBinder();
        String strIAuthTabCallbackStub = this.newSession.IAuthTabCallbackStub();
        String strOnNavigationEvent = onNavigationEvent(strAsInterface);
        if (!this.ICustomTabsCallback) {
            strAsBinder = _UrlKt.FRAGMENT_ENCODE_SET;
            strIAuthTabCallbackStub = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        this.onActivityLayout.endElement(strIAuthTabCallbackStub, strAsBinder, strAsInterface);
        if (onNavigationEvent(strOnNavigationEvent, strIAuthTabCallbackStub)) {
            this.onActivityLayout.endPrefixMapping(strOnNavigationEvent);
        }
        setDirectDestroyWebView setdirectdestroywebviewIAuthTabCallback = this.newSession.IAuthTabCallback();
        for (int length = setdirectdestroywebviewIAuthTabCallback.getLength() - 1; length >= 0; length--) {
            String uri = setdirectdestroywebviewIAuthTabCallback.getURI(length);
            String strOnNavigationEvent2 = onNavigationEvent(setdirectdestroywebviewIAuthTabCallback.getQName(length));
            if (onNavigationEvent(strOnNavigationEvent2, uri)) {
                this.onActivityLayout.endPrefixMapping(strOnNavigationEvent2);
            }
        }
        this.newSession = this.newSession.IAuthTabCallbackDefault();
    }

    private void onWarmupCompleted() throws Throwable {
        setOuterDislike setouterdislike = this.newSession;
        onNavigationEvent();
        if (!this.readTypedObject || (setouterdislike.onExtraCallback() & 1) == 0) {
            return;
        }
        setouterdislike.onNavigationEvent();
        setouterdislike.IAuthTabCallback(this.newSessionWithExtras);
        this.newSessionWithExtras = setouterdislike;
    }

    private void onExtraCallbackWithResult(setOuterDislike setouterdislike) throws SAXException, IOException, ArrayIndexOutOfBoundsException {
        String strAsInterface = setouterdislike.asInterface();
        String strAsBinder = setouterdislike.asBinder();
        String strIAuthTabCallbackStub = setouterdislike.IAuthTabCallbackStub();
        String strOnNavigationEvent = onNavigationEvent(strAsInterface);
        setouterdislike.onExtraCallbackWithResult();
        if (!this.ICustomTabsCallback) {
            strAsBinder = _UrlKt.FRAGMENT_ENCODE_SET;
            strIAuthTabCallbackStub = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (this.requestPostMessageChannelWithExtras && strAsBinder.equalsIgnoreCase(this.onUnminimized)) {
            try {
                this.ICustomTabsCallbackStubProxy.resolveEntity(this.onRelationshipValidationResult, this.ICustomTabsCallbackStub);
            } catch (IOException unused) {
            }
        }
        if (onNavigationEvent(strOnNavigationEvent, strIAuthTabCallbackStub)) {
            this.onActivityLayout.startPrefixMapping(strOnNavigationEvent, strIAuthTabCallbackStub);
        }
        setDirectDestroyWebView setdirectdestroywebviewIAuthTabCallback = setouterdislike.IAuthTabCallback();
        int length = setdirectdestroywebviewIAuthTabCallback.getLength();
        for (int i = 0; i < length; i++) {
            String uri = setdirectdestroywebviewIAuthTabCallback.getURI(i);
            String strOnNavigationEvent2 = onNavigationEvent(setdirectdestroywebviewIAuthTabCallback.getQName(i));
            if (onNavigationEvent(strOnNavigationEvent2, uri)) {
                this.onActivityLayout.startPrefixMapping(strOnNavigationEvent2, uri);
            }
        }
        this.onActivityLayout.startElement(strIAuthTabCallbackStub, strAsBinder, strAsInterface, setouterdislike.IAuthTabCallback());
        setouterdislike.IAuthTabCallback(this.newSession);
        this.newSession = setouterdislike;
        this.requestPostMessageChannelWithExtras = false;
        if (!this.IAuthTabCallback_Parcel || (setouterdislike.onExtraCallback() & 2) == 0) {
            return;
        }
        this.prefetch.onWarmupCompleted();
    }

    private String onNavigationEvent(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    private boolean onNavigationEvent(String str, String str2) {
        return (str.equals(_UrlKt.FRAGMENT_ENCODE_SET) || str2.equals(_UrlKt.FRAGMENT_ENCODE_SET) || str2.equals(this.newAuthTabSession.onWarmupCompleted())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // o.thx10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(char[] cArr, int i, int i2) throws SAXException, IllegalArgumentException {
        String str;
        String str2;
        String[] strArrOnExtraCallbackWithResult = onExtraCallbackWithResult(new String(cArr, i, i2));
        String str3 = null;
        if (strArrOnExtraCallbackWithResult.length <= 0 || !"DOCTYPE".equalsIgnoreCase(strArrOnExtraCallbackWithResult[0])) {
            str = null;
            str2 = null;
        } else {
            if (this.onMinimized) {
                return;
            }
            this.onMinimized = true;
            if (strArrOnExtraCallbackWithResult.length > 1) {
                str2 = strArrOnExtraCallbackWithResult[1];
                if (strArrOnExtraCallbackWithResult.length > 3 && "SYSTEM".equals(strArrOnExtraCallbackWithResult[2])) {
                    str = strArrOnExtraCallbackWithResult[3];
                } else if (strArrOnExtraCallbackWithResult.length <= 3 || !"PUBLIC".equals(strArrOnExtraCallbackWithResult[2])) {
                    str = null;
                } else {
                    str3 = strArrOnExtraCallbackWithResult[3];
                    if (strArrOnExtraCallbackWithResult.length > 4) {
                        str = strArrOnExtraCallbackWithResult[4];
                    } else {
                        str = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                }
            }
        }
        String strIAuthTabCallback = IAuthTabCallback(str3);
        String strIAuthTabCallback2 = IAuthTabCallback(str);
        if (str2 != null) {
            String strOnWarmupCompleted = onWarmupCompleted(strIAuthTabCallback);
            this.ICustomTabsService.startDTD(str2, strOnWarmupCompleted, strIAuthTabCallback2);
            this.ICustomTabsService.endDTD();
            this.onUnminimized = str2;
            this.onRelationshipValidationResult = strOnWarmupCompleted;
            thx9 thx9Var = this.prefetch;
            if (thx9Var instanceof Locator) {
                this.ICustomTabsCallbackStub = ((Locator) thx9Var).getSystemId();
                try {
                    this.ICustomTabsCallbackStub = new URL(new URL(this.ICustomTabsCallbackStub), strIAuthTabCallback2).toString();
                } catch (Exception unused) {
                }
            }
        }
    }

    private static String IAuthTabCallback(String str) {
        int length;
        char cCharAt;
        return (str == null || (length = str.length()) == 0 || (cCharAt = str.charAt(0)) != str.charAt(length - 1)) ? str : (cCharAt == '\'' || cCharAt == '\"') ? str.substring(1, str.length() - 1) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[PHI: r5 r7
      0x005a: PHI (r5v4 boolean) = (r5v1 boolean), (r5v2 boolean), (r5v1 boolean) binds: [B:32:0x0057, B:21:0x003b, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r7v3 boolean) = (r7v1 boolean), (r7v1 boolean), (r7v4 boolean) binds: [B:32:0x0057, B:21:0x003b, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] onExtraCallbackWithResult(String str) throws IllegalArgumentException {
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        int length = strTrim.length();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        char c = 0;
        boolean z2 = false;
        while (i < length) {
            char cCharAt = strTrim.charAt(i);
            if (!z && cCharAt == '\'' && c != '\\') {
                z2 = !z2;
                if (i2 < 0) {
                }
            } else if (!z2 && cCharAt == '\"' && c != '\\') {
                z = !z;
                if (i2 < 0) {
                }
            } else if (!z2 && !z) {
                if (Character.isWhitespace(cCharAt)) {
                    if (i2 >= 0) {
                        arrayList.add(strTrim.substring(i2, i));
                    }
                    i2 = -1;
                } else if (i2 < 0 && cCharAt != ' ') {
                    i2 = i;
                }
            }
            i++;
            c = cCharAt;
        }
        arrayList.add(strTrim.substring(i2, i));
        return (String[]) arrayList.toArray(new String[0]);
    }

    private String onWarmupCompleted(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        boolean z = true;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (access000.indexOf(cCharAt) != -1) {
                stringBuffer.append(cCharAt);
                z = false;
            } else if (!z) {
                stringBuffer.append(' ');
                z = true;
            }
        }
        return stringBuffer.toString().trim();
    }

    @Override // o.thx10
    public void access100(char[] cArr, int i, int i2) throws SAXException {
        String strExtraCallbackWithResult;
        if (this.mayLaunchUrl != null || (strExtraCallbackWithResult = extraCallbackWithResult(cArr, i, i2)) == null) {
            return;
        }
        setVastVideoHelper setvastvideohelperIAuthTabCallback = this.newAuthTabSession.IAuthTabCallback(strExtraCallbackWithResult);
        if (setvastvideohelperIAuthTabCallback == null) {
            if (this.writeTypedObject) {
                return;
            }
            this.newAuthTabSession.onNavigationEvent(strExtraCallbackWithResult, this.getInterfaceDescriptor ? 0 : -1, this.extraCallback ? -1 : IntCompanionObject.MAX_VALUE, 0);
            if (!this.extraCallback) {
                thxsya thxsyaVar = this.newAuthTabSession;
                thxsyaVar.onNavigationEvent(strExtraCallbackWithResult, thxsyaVar.onExtraCallback().IAuthTabCallback());
            }
            setvastvideohelperIAuthTabCallback = this.newAuthTabSession.IAuthTabCallback(strExtraCallbackWithResult);
        }
        this.mayLaunchUrl = new setOuterDislike(setvastvideohelperIAuthTabCallback, this.access100);
    }

    @Override // o.thx10
    public void getInterfaceDescriptor(char[] cArr, int i, int i2) throws Throwable {
        if (i2 != 0) {
            boolean z = true;
            for (int i3 = 0; i3 < i2; i3++) {
                if (!Character.isWhitespace(cArr[i + i3])) {
                    z = false;
                }
            }
            if (z && !this.newSession.onExtraCallback(this.ICustomTabsCallback_Parcel)) {
                if (this.IAuthTabCallbackStubProxy) {
                    this.onActivityLayout.ignorableWhitespace(cArr, i, i2);
                }
            } else {
                onExtraCallback(this.ICustomTabsCallback_Parcel);
                this.onActivityLayout.characters(cArr, i, i2);
            }
        }
    }

    @Override // o.thx10
    public void IAuthTabCallbackStubProxy(char[] cArr, int i, int i2) throws SAXException {
        if (this.mayLaunchUrl != null) {
            return;
        }
        this.postMessage = extraCallbackWithResult(cArr, i, i2).replace(':', '_');
    }

    @Override // o.thx10
    public void IAuthTabCallback_Parcel(char[] cArr, int i, int i2) throws SAXException {
        String str;
        if (this.mayLaunchUrl != null || (str = this.postMessage) == null || "xml".equalsIgnoreCase(str)) {
            return;
        }
        if (i2 > 0) {
            int i3 = i2 - 1;
            if (cArr[i3] == '?') {
                i2 = i3;
            }
        }
        this.onActivityLayout.processingInstruction(this.postMessage, new String(cArr, i, i2));
        this.postMessage = null;
    }

    @Override // o.thx10
    public void access000(char[] cArr, int i, int i2) throws Throwable {
        setOuterDislike setouterdislike = this.mayLaunchUrl;
        if (setouterdislike != null) {
            onExtraCallback(setouterdislike);
            if (this.newSession.onTransact() == 0) {
                onTransact(cArr, i, i2);
            }
        }
    }

    @Override // o.thx10
    public void writeTypedObject(char[] cArr, int i, int i2) throws Throwable {
        setOuterDislike setouterdislike = this.mayLaunchUrl;
        if (setouterdislike == null) {
            return;
        }
        onExtraCallback(setouterdislike);
        onTransact(cArr, i, i2);
    }

    @Override // o.thx10
    public void onWarmupCompleted(char[] cArr, int i, int i2) throws SAXException {
        this.ICustomTabsService.comment(cArr, i, i2);
    }

    private void onExtraCallback(setOuterDislike setouterdislike) throws Throwable {
        setOuterDislike setouterdislikeIAuthTabCallbackDefault;
        setVastVideoHelper setvastvideohelperIAuthTabCallback_Parcel;
        while (true) {
            setouterdislikeIAuthTabCallbackDefault = this.newSession;
            while (setouterdislikeIAuthTabCallbackDefault != null && !setouterdislikeIAuthTabCallbackDefault.onExtraCallback(setouterdislike)) {
                setouterdislikeIAuthTabCallbackDefault = setouterdislikeIAuthTabCallbackDefault.IAuthTabCallbackDefault();
            }
            if (setouterdislikeIAuthTabCallbackDefault != null || (setvastvideohelperIAuthTabCallback_Parcel = setouterdislike.IAuthTabCallback_Parcel()) == null) {
                break;
            }
            setOuterDislike setouterdislike2 = new setOuterDislike(setvastvideohelperIAuthTabCallback_Parcel, this.access100);
            setouterdislike2.IAuthTabCallback(setouterdislike);
            setouterdislike = setouterdislike2;
        }
        if (setouterdislikeIAuthTabCallbackDefault == null) {
            return;
        }
        while (true) {
            setOuterDislike setouterdislike3 = this.newSession;
            if (setouterdislike3 == setouterdislikeIAuthTabCallbackDefault || setouterdislike3 == null || setouterdislike3.IAuthTabCallbackDefault() == null || this.newSession.IAuthTabCallbackDefault().IAuthTabCallbackDefault() == null) {
                break;
            } else {
                onWarmupCompleted();
            }
        }
        while (setouterdislike != null) {
            setOuterDislike setouterdislikeIAuthTabCallbackDefault2 = setouterdislike.IAuthTabCallbackDefault();
            if (!setouterdislike.asInterface().equals("<pcdata>")) {
                onExtraCallbackWithResult(setouterdislike);
            }
            IAuthTabCallback(setouterdislikeIAuthTabCallbackDefault2);
            setouterdislike = setouterdislikeIAuthTabCallbackDefault2;
        }
        this.mayLaunchUrl = null;
    }

    @Override // o.thx10
    public int onExtraCallbackWithResult() {
        return this.ICustomTabsCallbackDefault;
    }

    private String extraCallbackWithResult(char[] cArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 + 2);
        boolean z = false;
        boolean z2 = true;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            char c = cArr[i];
            if (Character.isLetter(c) || c == '_') {
                stringBuffer.append(c);
            } else if (Character.isDigit(c) || c == '-' || c == '.') {
                if (z2) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(c);
            } else {
                if (c == ':' && !z) {
                    if (z2) {
                        stringBuffer.append('_');
                    }
                    stringBuffer.append(this.requestPostMessageChannel ? '_' : c);
                    z = true;
                    z2 = true;
                }
                i++;
                i2--;
            }
            z2 = false;
            i++;
            i2--;
        }
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == ':') {
            stringBuffer.append('_');
        }
        return stringBuffer.toString().intern();
    }
}
