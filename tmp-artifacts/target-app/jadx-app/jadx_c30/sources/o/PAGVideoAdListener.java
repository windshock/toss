package o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import net.sf.scuba.smartcards.BuildConfig;
import org.apache.commons.digester.Rule;
import org.apache.commons.digester.Rules;
import org.apache.commons.digester.RulesBase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGVideoAdListener extends DefaultHandler {
    protected boolean IAuthTabCallback;
    protected List<InputSource> IAuthTabCallbackDefault;
    protected HashMap<String, URL> IAuthTabCallbackStub;
    protected Log IAuthTabCallbackStubProxy;
    protected Stack<List<Rule>> IAuthTabCallback_Parcel;
    protected Stack<Object> ICustomTabsCallback;
    protected boolean ICustomTabsCallbackDefault;
    protected boolean ICustomTabsCallbackStub;
    protected PAGNativeAdsManager ICustomTabsCallbackStubProxy;
    private ContentHandler ICustomTabsCallback_Parcel;
    protected boolean access000;
    protected HashMap<String, Stack<String>> access100;
    protected Locator asBinder;
    protected ErrorHandler asInterface;
    protected Object extraCallback;
    protected String extraCallbackWithResult;
    private HashMap<String, Stack<Object>> extraCommand;
    protected String getInterfaceDescriptor;
    private PAGNativeRequest isEngagementSignalsApiAvailable;

    @Deprecated
    protected String onActivityLayout;
    protected Rules onActivityResized;
    protected ClassLoader onExtraCallback;
    protected StringBuffer onExtraCallbackWithResult;
    protected Log onMessageChannelReady;

    @Deprecated
    protected String onMinimized;
    protected Stack<StringBuffer> onNavigationEvent;
    protected Schema onPostMessage;
    protected Stack<Object> onRelationshipValidationResult;
    protected SAXParserFactory onTransact;
    protected boolean onUnminimized;

    @Deprecated
    protected String onWarmupCompleted;
    protected SAXParser readTypedObject;
    protected XMLReader writeTypedObject;

    public PAGVideoAdListener() {
        this.onExtraCallbackWithResult = new StringBuffer();
        this.onNavigationEvent = new Stack<>();
        this.IAuthTabCallback_Parcel = new Stack<>();
        this.onExtraCallback = null;
        this.IAuthTabCallback = false;
        this.IAuthTabCallbackStub = new HashMap<>();
        this.asInterface = null;
        this.onTransact = null;
        this.onWarmupCompleted = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
        this.asBinder = null;
        this.getInterfaceDescriptor = BuildConfig.FLAVOR;
        this.access000 = false;
        this.access100 = new HashMap<>();
        this.ICustomTabsCallbackStub = false;
        this.ICustomTabsCallback = new Stack<>();
        this.readTypedObject = null;
        this.extraCallbackWithResult = null;
        this.writeTypedObject = null;
        this.extraCallback = null;
        this.onActivityResized = null;
        this.onMinimized = "http://www.w3.org/2001/XMLSchema";
        this.onActivityLayout = null;
        this.onPostMessage = null;
        this.onRelationshipValidationResult = new Stack<>();
        this.onUnminimized = false;
        this.ICustomTabsCallbackDefault = false;
        this.IAuthTabCallbackStubProxy = LogFactory.getLog("org.apache.commons.digester.Digester");
        this.onMessageChannelReady = LogFactory.getLog("org.apache.commons.digester.Digester.sax");
        this.extraCommand = new HashMap<>();
        this.ICustomTabsCallback_Parcel = null;
        this.isEngagementSignalsApiAvailable = null;
        this.IAuthTabCallbackDefault = new ArrayList(5);
    }

    public PAGVideoAdListener(SAXParser sAXParser) {
        this.onExtraCallbackWithResult = new StringBuffer();
        this.onNavigationEvent = new Stack<>();
        this.IAuthTabCallback_Parcel = new Stack<>();
        this.onExtraCallback = null;
        this.IAuthTabCallback = false;
        this.IAuthTabCallbackStub = new HashMap<>();
        this.asInterface = null;
        this.onTransact = null;
        this.onWarmupCompleted = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
        this.asBinder = null;
        this.getInterfaceDescriptor = BuildConfig.FLAVOR;
        this.access000 = false;
        this.access100 = new HashMap<>();
        this.ICustomTabsCallbackStub = false;
        this.ICustomTabsCallback = new Stack<>();
        this.readTypedObject = null;
        this.extraCallbackWithResult = null;
        this.writeTypedObject = null;
        this.extraCallback = null;
        this.onActivityResized = null;
        this.onMinimized = "http://www.w3.org/2001/XMLSchema";
        this.onActivityLayout = null;
        this.onPostMessage = null;
        this.onRelationshipValidationResult = new Stack<>();
        this.onUnminimized = false;
        this.ICustomTabsCallbackDefault = false;
        this.IAuthTabCallbackStubProxy = LogFactory.getLog("org.apache.commons.digester.Digester");
        this.onMessageChannelReady = LogFactory.getLog("org.apache.commons.digester.Digester.sax");
        this.extraCommand = new HashMap<>();
        this.ICustomTabsCallback_Parcel = null;
        this.isEngagementSignalsApiAvailable = null;
        this.IAuthTabCallbackDefault = new ArrayList(5);
        this.readTypedObject = sAXParser;
    }

    public PAGVideoAdListener(XMLReader xMLReader) {
        this.onExtraCallbackWithResult = new StringBuffer();
        this.onNavigationEvent = new Stack<>();
        this.IAuthTabCallback_Parcel = new Stack<>();
        this.onExtraCallback = null;
        this.IAuthTabCallback = false;
        this.IAuthTabCallbackStub = new HashMap<>();
        this.asInterface = null;
        this.onTransact = null;
        this.onWarmupCompleted = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
        this.asBinder = null;
        this.getInterfaceDescriptor = BuildConfig.FLAVOR;
        this.access000 = false;
        this.access100 = new HashMap<>();
        this.ICustomTabsCallbackStub = false;
        this.ICustomTabsCallback = new Stack<>();
        this.readTypedObject = null;
        this.extraCallbackWithResult = null;
        this.writeTypedObject = null;
        this.extraCallback = null;
        this.onActivityResized = null;
        this.onMinimized = "http://www.w3.org/2001/XMLSchema";
        this.onActivityLayout = null;
        this.onPostMessage = null;
        this.onRelationshipValidationResult = new Stack<>();
        this.onUnminimized = false;
        this.ICustomTabsCallbackDefault = false;
        this.IAuthTabCallbackStubProxy = LogFactory.getLog("org.apache.commons.digester.Digester");
        this.onMessageChannelReady = LogFactory.getLog("org.apache.commons.digester.Digester.sax");
        this.extraCommand = new HashMap<>();
        this.ICustomTabsCallback_Parcel = null;
        this.isEngagementSignalsApiAvailable = null;
        this.IAuthTabCallbackDefault = new ArrayList(5);
        this.writeTypedObject = xMLReader;
    }

    public int IAuthTabCallback() {
        return this.onRelationshipValidationResult.size();
    }

    public Rules onNavigationEvent() {
        if (this.onActivityResized == null) {
            RulesBase rulesBase = new RulesBase();
            this.onActivityResized = rulesBase;
            rulesBase.onExtraCallbackWithResult(this);
        }
        return this.onActivityResized;
    }

    public PAGNativeAdsManager onWarmupCompleted() {
        return this.ICustomTabsCallbackStubProxy;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        ContentHandler contentHandler = this.ICustomTabsCallback_Parcel;
        if (contentHandler != null) {
            contentHandler.characters(cArr, i, i2);
            return;
        }
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("characters(" + new String(cArr, i, i2) + ")");
        }
        this.onExtraCallbackWithResult.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            if (IAuthTabCallback() > 1) {
                this.onMessageChannelReady.debug("endDocument():  " + IAuthTabCallback() + " elements left");
            } else {
                this.onMessageChannelReady.debug("endDocument()");
            }
        }
        for (Rule rule : onNavigationEvent().onExtraCallback()) {
        }
        onExtraCallback();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        ContentHandler contentHandler = this.ICustomTabsCallback_Parcel;
        if (contentHandler != null) {
            contentHandler.endElement(str, str2, str3);
            return;
        }
        boolean zIsDebugEnabled = this.IAuthTabCallbackStubProxy.isDebugEnabled();
        if (zIsDebugEnabled) {
            if (this.onMessageChannelReady.isDebugEnabled()) {
                this.onMessageChannelReady.debug("endElement(" + str + "," + str2 + "," + str3 + ")");
            }
            this.IAuthTabCallbackStubProxy.debug("  match='" + this.getInterfaceDescriptor + "'");
            this.IAuthTabCallbackStubProxy.debug("  bodyText='" + ((Object) this.onExtraCallbackWithResult) + "'");
        }
        List<Rule> listPop = this.IAuthTabCallback_Parcel.pop();
        if (listPop != null && listPop.size() > 0) {
            onWarmupCompleted();
            for (int i = 0; i < listPop.size(); i++) {
                try {
                    Rule rule = listPop.get(i);
                    if (zIsDebugEnabled) {
                        this.IAuthTabCallbackStubProxy.debug("  Fire body() for " + rule);
                    }
                } catch (Error e) {
                    this.IAuthTabCallbackStubProxy.error("Body event threw error", e);
                    throw e;
                } catch (Exception e2) {
                    this.IAuthTabCallbackStubProxy.error("Body event threw exception", e2);
                    throw onWarmupCompleted(e2);
                }
            }
        } else if (zIsDebugEnabled) {
            this.IAuthTabCallbackStubProxy.debug("  No rules found matching '" + this.getInterfaceDescriptor + "'.");
        }
        this.onExtraCallbackWithResult = this.onNavigationEvent.pop();
        if (zIsDebugEnabled) {
            this.IAuthTabCallbackStubProxy.debug("  Popping body text '" + this.onExtraCallbackWithResult.toString() + "'");
        }
        if (listPop != null) {
            for (int i2 = 0; i2 < listPop.size(); i2++) {
                try {
                    Rule rule2 = listPop.get((listPop.size() - i2) - 1);
                    if (zIsDebugEnabled) {
                        this.IAuthTabCallbackStubProxy.debug("  Fire end() for " + rule2);
                    }
                } catch (Error e3) {
                    this.IAuthTabCallbackStubProxy.error("End event threw error", e3);
                    throw e3;
                } catch (Exception e4) {
                    this.IAuthTabCallbackStubProxy.error("End event threw exception", e4);
                    throw onWarmupCompleted(e4);
                }
            }
        }
        int iLastIndexOf = this.getInterfaceDescriptor.lastIndexOf(47);
        if (iLastIndexOf >= 0) {
            this.getInterfaceDescriptor = this.getInterfaceDescriptor.substring(0, iLastIndexOf);
        } else {
            this.getInterfaceDescriptor = BuildConfig.FLAVOR;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("endPrefixMapping(" + str + ")");
        }
        Stack<String> stack = this.access100.get(str);
        if (stack != null) {
            try {
                stack.pop();
                if (stack.empty()) {
                    this.access100.remove(str);
                }
            } catch (EmptyStackException unused) {
                throw onExtraCallback("endPrefixMapping popped too many times");
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("ignorableWhitespace(" + new String(cArr, i, i2) + ")");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        ContentHandler contentHandler = this.ICustomTabsCallback_Parcel;
        if (contentHandler != null) {
            contentHandler.processingInstruction(str, str2);
            return;
        }
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("processingInstruction('" + str + "','" + str2 + "')");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("setDocumentLocator(" + locator + ")");
        }
        this.asBinder = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("skippedEntity(" + str + ")");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("startDocument()");
        }
        onExtraCallbackWithResult();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        boolean zIsDebugEnabled = this.IAuthTabCallbackStubProxy.isDebugEnabled();
        ContentHandler contentHandler = this.ICustomTabsCallback_Parcel;
        if (contentHandler != null) {
            contentHandler.startElement(str, str2, str3, attributes);
            return;
        }
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("startElement(" + str + "," + str2 + "," + str3 + ")");
        }
        this.onNavigationEvent.push(this.onExtraCallbackWithResult);
        if (zIsDebugEnabled) {
            this.IAuthTabCallbackStubProxy.debug("  Pushing body text '" + this.onExtraCallbackWithResult.toString() + "'");
        }
        this.onExtraCallbackWithResult = new StringBuffer();
        if (str2 == null || str2.length() <= 0) {
            str2 = str3;
        }
        StringBuffer stringBuffer = new StringBuffer(this.getInterfaceDescriptor);
        if (this.getInterfaceDescriptor.length() > 0) {
            stringBuffer.append('/');
        }
        stringBuffer.append(str2);
        this.getInterfaceDescriptor = stringBuffer.toString();
        if (zIsDebugEnabled) {
            this.IAuthTabCallbackStubProxy.debug("  New match='" + this.getInterfaceDescriptor + "'");
        }
        List<Rule> listOnWarmupCompleted = onNavigationEvent().onWarmupCompleted(str, this.getInterfaceDescriptor);
        this.IAuthTabCallback_Parcel.push(listOnWarmupCompleted);
        if (listOnWarmupCompleted == null || listOnWarmupCompleted.size() <= 0) {
            if (zIsDebugEnabled) {
                this.IAuthTabCallbackStubProxy.debug("  No rules found matching '" + this.getInterfaceDescriptor + "'.");
                return;
            }
            return;
        }
        onWarmupCompleted();
        for (int i = 0; i < listOnWarmupCompleted.size(); i++) {
            try {
                Rule rule = listOnWarmupCompleted.get(i);
                if (zIsDebugEnabled) {
                    this.IAuthTabCallbackStubProxy.debug("  Fire begin() for " + rule);
                }
            } catch (Error e) {
                this.IAuthTabCallbackStubProxy.error("Begin event threw error", e);
                throw e;
            } catch (Exception e2) {
                this.IAuthTabCallbackStubProxy.error("Begin event threw exception", e2);
                throw onWarmupCompleted(e2);
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("startPrefixMapping(" + str + "," + str2 + ")");
        }
        Stack<String> stack = this.access100.get(str);
        if (stack == null) {
            stack = new Stack<>();
            this.access100.put(str, stack);
        }
        stack.push(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("notationDecl(" + str + "," + str2 + "," + str3 + ")");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("unparsedEntityDecl(" + str + "," + str2 + "," + str3 + "," + str4 + ")");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) throws SAXException {
        if (this.onMessageChannelReady.isDebugEnabled()) {
            this.onMessageChannelReady.debug("resolveEntity('" + str + "', '" + str2 + "')");
        }
        if (str != null) {
            this.extraCallbackWithResult = str;
        }
        URL url = str != null ? this.IAuthTabCallbackStub.get(str) : null;
        if (this.onActivityLayout != null && url == null && str2 != null) {
            url = this.IAuthTabCallbackStub.get(str2);
        }
        if (url == null) {
            if (str2 == null) {
                if (this.IAuthTabCallbackStubProxy.isDebugEnabled()) {
                    this.IAuthTabCallbackStubProxy.debug(" Cannot resolve null entity, returning null InputSource");
                }
                return null;
            }
            if (this.IAuthTabCallbackStubProxy.isDebugEnabled()) {
                this.IAuthTabCallbackStubProxy.debug(" Trying to resolve using system ID '" + str2 + "'");
            }
            try {
                url = new URL(str2);
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException("Malformed URL '" + str2 + "' : " + e.getMessage());
            }
        }
        if (this.IAuthTabCallbackStubProxy.isDebugEnabled()) {
            this.IAuthTabCallbackStubProxy.debug(" Resolving to alternate DTD '" + url + "'");
        }
        try {
            return onNavigationEvent(url);
        } catch (Exception e2) {
            throw onWarmupCompleted(e2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        this.IAuthTabCallbackStubProxy.error("Parse Error at line " + sAXParseException.getLineNumber() + " column " + sAXParseException.getColumnNumber() + ": " + sAXParseException.getMessage(), sAXParseException);
        ErrorHandler errorHandler = this.asInterface;
        if (errorHandler != null) {
            errorHandler.error(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        this.IAuthTabCallbackStubProxy.error("Parse Fatal Error at line " + sAXParseException.getLineNumber() + " column " + sAXParseException.getColumnNumber() + ": " + sAXParseException.getMessage(), sAXParseException);
        ErrorHandler errorHandler = this.asInterface;
        if (errorHandler != null) {
            errorHandler.fatalError(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        if (this.asInterface != null) {
            this.IAuthTabCallbackStubProxy.warn("Parse Warning Error at line " + sAXParseException.getLineNumber() + " column " + sAXParseException.getColumnNumber() + ": " + sAXParseException.getMessage(), sAXParseException);
            this.asInterface.warning(sAXParseException);
        }
    }

    public InputSource onNavigationEvent(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        InputSource inputSource = new InputSource(uRLConnectionOpenConnection.getInputStream());
        inputSource.setSystemId(url.toExternalForm());
        this.IAuthTabCallbackDefault.add(inputSource);
        return inputSource;
    }

    public void onExtraCallback() {
        this.getInterfaceDescriptor = BuildConfig.FLAVOR;
        this.onNavigationEvent.clear();
        this.ICustomTabsCallback.clear();
        this.extraCallbackWithResult = null;
        this.onRelationshipValidationResult.clear();
        this.extraCommand.clear();
        this.ICustomTabsCallback_Parcel = null;
    }

    protected void onExtraCallbackWithResult() {
        if (this.IAuthTabCallback) {
            return;
        }
        this.IAuthTabCallback = true;
    }

    public SAXException IAuthTabCallback(String str, Exception exc) {
        Throwable targetException;
        if (exc != null && (exc instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) exc).getTargetException()) != null && (targetException instanceof Exception)) {
            exc = (Exception) targetException;
        }
        if (this.asBinder != null) {
            String str2 = "Error at line " + this.asBinder.getLineNumber() + " char " + this.asBinder.getColumnNumber() + ": " + str;
            if (exc != null) {
                return new SAXParseException(str2, this.asBinder, exc);
            }
            return new SAXParseException(str2, this.asBinder);
        }
        this.IAuthTabCallbackStubProxy.error("No Locator!");
        if (exc != null) {
            return new SAXException(str, exc);
        }
        return new SAXException(str);
    }

    public SAXException onWarmupCompleted(Exception exc) {
        Throwable targetException;
        if ((exc instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) exc).getTargetException()) != null && (targetException instanceof Exception)) {
            exc = (Exception) targetException;
        }
        return IAuthTabCallback(exc.getMessage(), exc);
    }

    public SAXException onExtraCallback(String str) {
        return IAuthTabCallback(str, null);
    }
}
