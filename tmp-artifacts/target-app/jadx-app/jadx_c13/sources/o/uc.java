package o;

import java.io.IOException;
import o.szb;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
enum uc {
    Data { // from class: o.uc.2
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onNavigationEvent(rdjVar.onNavigationEvent());
            } else {
                if (cIAuthTabCallbackStubProxy == '&') {
                    uhsVar.onWarmupCompleted(uc.CharacterReferenceInData);
                    return;
                }
                if (cIAuthTabCallbackStubProxy == '<') {
                    uhsVar.onWarmupCompleted(uc.TagOpen);
                } else if (cIAuthTabCallbackStubProxy == 65535) {
                    uhsVar.onExtraCallbackWithResult(new szb.onWarmupCompleted());
                } else {
                    uhsVar.IAuthTabCallback(rdjVar.onWarmupCompleted());
                }
            }
        }
    },
    CharacterReferenceInData { // from class: o.uc.15
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            uc.readCharRef(uhsVar, uc.Data);
        }
    },
    Rcdata { // from class: o.uc.25
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == 0) {
                uhsVar.onExtraCallback(this);
                rdjVar.IAuthTabCallback();
                uhsVar.onNavigationEvent(uc.replacementChar);
            } else {
                if (cIAuthTabCallbackStubProxy == '&') {
                    uhsVar.onWarmupCompleted(uc.CharacterReferenceInRcdata);
                    return;
                }
                if (cIAuthTabCallbackStubProxy == '<') {
                    uhsVar.onWarmupCompleted(uc.RcdataLessthanSign);
                } else if (cIAuthTabCallbackStubProxy == 65535) {
                    uhsVar.onExtraCallbackWithResult(new szb.onWarmupCompleted());
                } else {
                    uhsVar.IAuthTabCallback(rdjVar.onWarmupCompleted());
                }
            }
        }
    },
    CharacterReferenceInRcdata { // from class: o.uc.33
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            uc.readCharRef(uhsVar, uc.Rcdata);
        }
    },
    Rawtext { // from class: o.uc.44
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.readRawData(uhsVar, rdjVar, this, uc.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: o.uc.57
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.readRawData(uhsVar, rdjVar, this, uc.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: o.uc.62
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == 0) {
                uhsVar.onExtraCallback(this);
                rdjVar.IAuthTabCallback();
                uhsVar.onNavigationEvent(uc.replacementChar);
            } else if (cIAuthTabCallbackStubProxy == 65535) {
                uhsVar.onExtraCallbackWithResult(new szb.onWarmupCompleted());
            } else {
                uhsVar.IAuthTabCallback(rdjVar.IAuthTabCallback((char) 0));
            }
        }
    },
    TagOpen { // from class: o.uc.68
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == '!') {
                uhsVar.onWarmupCompleted(uc.MarkupDeclarationOpen);
                return;
            }
            if (cIAuthTabCallbackStubProxy == '/') {
                uhsVar.onWarmupCompleted(uc.EndTagOpen);
                return;
            }
            if (cIAuthTabCallbackStubProxy == '?') {
                uhsVar.onExtraCallbackWithResult();
                uhsVar.IAuthTabCallback(uc.BogusComment);
            } else if (rdjVar.ICustomTabsCallback()) {
                uhsVar.onExtraCallbackWithResult(true);
                uhsVar.IAuthTabCallback(uc.TagName);
            } else {
                uhsVar.onExtraCallback(this);
                uhsVar.onNavigationEvent('<');
                uhsVar.IAuthTabCallback(uc.Data);
            }
        }
    },
    EndTagOpen { // from class: o.uc.66
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.access000()) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback("</");
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (rdjVar.ICustomTabsCallback()) {
                uhsVar.onExtraCallbackWithResult(false);
                uhsVar.IAuthTabCallback(uc.TagName);
            } else if (rdjVar.onWarmupCompleted('>')) {
                uhsVar.onExtraCallback(this);
                uhsVar.onWarmupCompleted(uc.Data);
            } else {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult();
                uhsVar.onExtraCallback.onExtraCallbackWithResult('/');
                uhsVar.IAuthTabCallback(uc.BogusComment);
            }
        }
    },
    TagName { // from class: o.uc.3
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uhsVar.IAuthTabCallbackStub.onExtraCallback(rdjVar.access100());
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.IAuthTabCallbackStub.onExtraCallback(uc.replacementStr);
                return;
            }
            if (cOnNavigationEvent != ' ') {
                if (cOnNavigationEvent == '/') {
                    uhsVar.IAuthTabCallback(uc.SelfClosingStartTag);
                    return;
                }
                if (cOnNavigationEvent == '<') {
                    rdjVar.onMessageChannelReady();
                    uhsVar.onExtraCallback(this);
                } else if (cOnNavigationEvent != '>') {
                    if (cOnNavigationEvent == 65535) {
                        uhsVar.onNavigationEvent(this);
                        uhsVar.IAuthTabCallback(uc.Data);
                        return;
                    } else if (cOnNavigationEvent != '\t' && cOnNavigationEvent != '\n' && cOnNavigationEvent != '\f' && cOnNavigationEvent != '\r') {
                        uhsVar.IAuthTabCallbackStub.onNavigationEvent(cOnNavigationEvent);
                        return;
                    }
                }
                uhsVar.IAuthTabCallbackStub();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.IAuthTabCallback(uc.BeforeAttributeName);
        }
    },
    RcdataLessthanSign { // from class: o.uc.1
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.onWarmupCompleted('/')) {
                uhsVar.asBinder();
                uhsVar.onWarmupCompleted(uc.RCDATAEndTagOpen);
            } else if (rdjVar.ICustomTabsCallback() && uhsVar.onWarmupCompleted() != null && !rdjVar.IAuthTabCallback(uhsVar.IAuthTabCallback())) {
                uhsVar.IAuthTabCallbackStub = uhsVar.onExtraCallbackWithResult(false).onWarmupCompleted(uhsVar.onWarmupCompleted());
                uhsVar.IAuthTabCallbackStub();
                uhsVar.IAuthTabCallback(uc.TagOpen);
            } else {
                uhsVar.IAuthTabCallback("<");
                uhsVar.IAuthTabCallback(uc.Rcdata);
            }
        }
    },
    RCDATAEndTagOpen { // from class: o.uc.5
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.ICustomTabsCallback()) {
                uhsVar.onExtraCallbackWithResult(false);
                uhsVar.IAuthTabCallbackStub.onNavigationEvent(rdjVar.IAuthTabCallbackStubProxy());
                uhsVar.onWarmupCompleted.append(rdjVar.IAuthTabCallbackStubProxy());
                uhsVar.onWarmupCompleted(uc.RCDATAEndTagName);
                return;
            }
            uhsVar.IAuthTabCallback("</");
            uhsVar.IAuthTabCallback(uc.Rcdata);
        }
    },
    RCDATAEndTagName { // from class: o.uc.4
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            if (rdjVar.ICustomTabsCallback()) {
                String strIAuthTabCallbackStub = rdjVar.IAuthTabCallbackStub();
                uhsVar.IAuthTabCallbackStub.onExtraCallback(strIAuthTabCallbackStub);
                uhsVar.onWarmupCompleted.append(strIAuthTabCallbackStub);
                return;
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                if (uhsVar.onTransact()) {
                    uhsVar.IAuthTabCallback(uc.BeforeAttributeName);
                    return;
                } else {
                    anythingElse(uhsVar, rdjVar);
                    return;
                }
            }
            if (cOnNavigationEvent == '/') {
                if (uhsVar.onTransact()) {
                    uhsVar.IAuthTabCallback(uc.SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(uhsVar, rdjVar);
                    return;
                }
            }
            if (cOnNavigationEvent == '>') {
                if (uhsVar.onTransact()) {
                    uhsVar.IAuthTabCallbackStub();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                } else {
                    anythingElse(uhsVar, rdjVar);
                    return;
                }
            }
            anythingElse(uhsVar, rdjVar);
        }

        private void anythingElse(uhs uhsVar, rdj rdjVar) {
            uhsVar.IAuthTabCallback("</");
            uhsVar.IAuthTabCallback(uhsVar.onWarmupCompleted);
            rdjVar.onMessageChannelReady();
            uhsVar.IAuthTabCallback(uc.Rcdata);
        }
    },
    RawtextLessthanSign { // from class: o.uc.8
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.onWarmupCompleted('/')) {
                uhsVar.asBinder();
                uhsVar.onWarmupCompleted(uc.RawtextEndTagOpen);
            } else {
                uhsVar.onNavigationEvent('<');
                uhsVar.IAuthTabCallback(uc.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: o.uc.6
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            uc.readEndTag(uhsVar, rdjVar, uc.RawtextEndTagName, uc.Rawtext);
        }
    },
    RawtextEndTagName { // from class: o.uc.7
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.handleDataEndTag(uhsVar, rdjVar, uc.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: o.uc.9
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '!') {
                uhsVar.IAuthTabCallback("<!");
                uhsVar.IAuthTabCallback(uc.ScriptDataEscapeStart);
                return;
            }
            if (cOnNavigationEvent == '/') {
                uhsVar.asBinder();
                uhsVar.IAuthTabCallback(uc.ScriptDataEndTagOpen);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.IAuthTabCallback("<");
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                uhsVar.IAuthTabCallback("<");
                rdjVar.onMessageChannelReady();
                uhsVar.IAuthTabCallback(uc.ScriptData);
            }
        }
    },
    ScriptDataEndTagOpen { // from class: o.uc.10
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            uc.readEndTag(uhsVar, rdjVar, uc.ScriptDataEndTagName, uc.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: o.uc.12
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.handleDataEndTag(uhsVar, rdjVar, uc.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: o.uc.11
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.onWarmupCompleted('-')) {
                uhsVar.onNavigationEvent('-');
                uhsVar.onWarmupCompleted(uc.ScriptDataEscapeStartDash);
            } else {
                uhsVar.IAuthTabCallback(uc.ScriptData);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: o.uc.13
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.onWarmupCompleted('-')) {
                uhsVar.onNavigationEvent('-');
                uhsVar.onWarmupCompleted(uc.ScriptDataEscapedDashDash);
            } else {
                uhsVar.IAuthTabCallback(uc.ScriptData);
            }
        }
    },
    ScriptDataEscaped { // from class: o.uc.14
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            if (rdjVar.access000()) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == 0) {
                uhsVar.onExtraCallback(this);
                rdjVar.IAuthTabCallback();
                uhsVar.onNavigationEvent(uc.replacementChar);
            } else if (cIAuthTabCallbackStubProxy == '-') {
                uhsVar.onNavigationEvent('-');
                uhsVar.onWarmupCompleted(uc.ScriptDataEscapedDash);
            } else if (cIAuthTabCallbackStubProxy == '<') {
                uhsVar.onWarmupCompleted(uc.ScriptDataEscapedLessthanSign);
            } else {
                uhsVar.IAuthTabCallback(rdjVar.IAuthTabCallback('-', '<', 0));
            }
        }
    },
    ScriptDataEscapedDash { // from class: o.uc.18
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            if (rdjVar.access000()) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onNavigationEvent(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.ScriptDataEscaped);
            } else if (cOnNavigationEvent == '-') {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataEscapedDashDash);
            } else if (cOnNavigationEvent == '<') {
                uhsVar.IAuthTabCallback(uc.ScriptDataEscapedLessthanSign);
            } else {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedDashDash { // from class: o.uc.19
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            if (rdjVar.access000()) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onNavigationEvent(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.ScriptDataEscaped);
            } else {
                if (cOnNavigationEvent == '-') {
                    uhsVar.onNavigationEvent(cOnNavigationEvent);
                    return;
                }
                if (cOnNavigationEvent == '<') {
                    uhsVar.IAuthTabCallback(uc.ScriptDataEscapedLessthanSign);
                } else if (cOnNavigationEvent == '>') {
                    uhsVar.onNavigationEvent(cOnNavigationEvent);
                    uhsVar.IAuthTabCallback(uc.ScriptData);
                } else {
                    uhsVar.onNavigationEvent(cOnNavigationEvent);
                    uhsVar.IAuthTabCallback(uc.ScriptDataEscaped);
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign { // from class: o.uc.16
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.ICustomTabsCallback()) {
                uhsVar.asBinder();
                uhsVar.onWarmupCompleted.append(rdjVar.IAuthTabCallbackStubProxy());
                uhsVar.IAuthTabCallback("<");
                uhsVar.onNavigationEvent(rdjVar.IAuthTabCallbackStubProxy());
                uhsVar.onWarmupCompleted(uc.ScriptDataDoubleEscapeStart);
                return;
            }
            if (rdjVar.onWarmupCompleted('/')) {
                uhsVar.asBinder();
                uhsVar.onWarmupCompleted(uc.ScriptDataEscapedEndTagOpen);
            } else {
                uhsVar.onNavigationEvent('<');
                uhsVar.IAuthTabCallback(uc.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: o.uc.20
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.ICustomTabsCallback()) {
                uhsVar.onExtraCallbackWithResult(false);
                uhsVar.IAuthTabCallbackStub.onNavigationEvent(rdjVar.IAuthTabCallbackStubProxy());
                uhsVar.onWarmupCompleted.append(rdjVar.IAuthTabCallbackStubProxy());
                uhsVar.onWarmupCompleted(uc.ScriptDataEscapedEndTagName);
                return;
            }
            uhsVar.IAuthTabCallback("</");
            uhsVar.IAuthTabCallback(uc.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: o.uc.17
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.handleDataEndTag(uhsVar, rdjVar, uc.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: o.uc.23
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.handleDataDoubleEscapeTag(uhsVar, rdjVar, uc.ScriptDataDoubleEscaped, uc.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: o.uc.24
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == 0) {
                uhsVar.onExtraCallback(this);
                rdjVar.IAuthTabCallback();
                uhsVar.onNavigationEvent(uc.replacementChar);
            } else if (cIAuthTabCallbackStubProxy == '-') {
                uhsVar.onNavigationEvent(cIAuthTabCallbackStubProxy);
                uhsVar.onWarmupCompleted(uc.ScriptDataDoubleEscapedDash);
            } else if (cIAuthTabCallbackStubProxy == '<') {
                uhsVar.onNavigationEvent(cIAuthTabCallbackStubProxy);
                uhsVar.onWarmupCompleted(uc.ScriptDataDoubleEscapedLessthanSign);
            } else if (cIAuthTabCallbackStubProxy == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                uhsVar.IAuthTabCallback(rdjVar.IAuthTabCallback('-', '<', 0));
            }
        }
    },
    ScriptDataDoubleEscapedDash { // from class: o.uc.21
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onNavigationEvent(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscaped);
            } else if (cOnNavigationEvent == '-') {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscapedDashDash);
            } else if (cOnNavigationEvent == '<') {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscapedLessthanSign);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: o.uc.22
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onNavigationEvent(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscaped);
                return;
            }
            if (cOnNavigationEvent == '-') {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                return;
            }
            if (cOnNavigationEvent == '<') {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscapedLessthanSign);
            } else if (cOnNavigationEvent == '>') {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptData);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                uhsVar.onNavigationEvent(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: o.uc.27
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.onWarmupCompleted('/')) {
                uhsVar.onNavigationEvent('/');
                uhsVar.asBinder();
                uhsVar.onWarmupCompleted(uc.ScriptDataDoubleEscapeEnd);
                return;
            }
            uhsVar.IAuthTabCallback(uc.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: o.uc.26
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uc.handleDataDoubleEscapeTag(uhsVar, rdjVar, uc.ScriptDataEscaped, uc.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: o.uc.29
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                rdjVar.onMessageChannelReady();
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.extraCallbackWithResult();
                uhsVar.IAuthTabCallback(uc.AttributeName);
                return;
            }
            if (cOnNavigationEvent != ' ') {
                if (cOnNavigationEvent != '\"' && cOnNavigationEvent != '\'') {
                    if (cOnNavigationEvent == '/') {
                        uhsVar.IAuthTabCallback(uc.SelfClosingStartTag);
                        return;
                    }
                    if (cOnNavigationEvent == 65535) {
                        uhsVar.onNavigationEvent(this);
                        uhsVar.IAuthTabCallback(uc.Data);
                        return;
                    }
                    if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r') {
                        return;
                    }
                    switch (cOnNavigationEvent) {
                        case Imgproc.COLOR_HLS2BGR /* 60 */:
                            rdjVar.onMessageChannelReady();
                            uhsVar.onExtraCallback(this);
                            break;
                        case Imgproc.COLOR_HLS2RGB /* 61 */:
                            break;
                        case '>':
                            break;
                        default:
                            uhsVar.IAuthTabCallbackStub.extraCallbackWithResult();
                            rdjVar.onMessageChannelReady();
                            uhsVar.IAuthTabCallback(uc.AttributeName);
                            return;
                    }
                    uhsVar.IAuthTabCallbackStub();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                }
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.extraCallbackWithResult();
                uhsVar.IAuthTabCallbackStub.onWarmupCompleted(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.AttributeName);
            }
        }
    },
    AttributeName { // from class: o.uc.30
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uhsVar.IAuthTabCallbackStub.onNavigationEvent(rdjVar.onWarmupCompleted(uc.attributeNameCharsSorted));
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(uc.AfterAttributeName);
                return;
            }
            if (cOnNavigationEvent != '\"' && cOnNavigationEvent != '\'') {
                if (cOnNavigationEvent == '/') {
                    uhsVar.IAuthTabCallback(uc.SelfClosingStartTag);
                    return;
                }
                if (cOnNavigationEvent != 65535) {
                    switch (cOnNavigationEvent) {
                        case Imgproc.COLOR_HLS2BGR /* 60 */:
                            break;
                        case Imgproc.COLOR_HLS2RGB /* 61 */:
                            uhsVar.IAuthTabCallback(uc.BeforeAttributeValue);
                            break;
                        case '>':
                            uhsVar.IAuthTabCallbackStub();
                            uhsVar.IAuthTabCallback(uc.Data);
                            break;
                        default:
                            uhsVar.IAuthTabCallbackStub.onWarmupCompleted(cOnNavigationEvent);
                            break;
                    }
                    return;
                }
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.IAuthTabCallbackStub.onWarmupCompleted(cOnNavigationEvent);
        }
    },
    AfterAttributeName { // from class: o.uc.28
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.onWarmupCompleted(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.AttributeName);
                return;
            }
            if (cOnNavigationEvent != ' ') {
                if (cOnNavigationEvent != '\"' && cOnNavigationEvent != '\'') {
                    if (cOnNavigationEvent == '/') {
                        uhsVar.IAuthTabCallback(uc.SelfClosingStartTag);
                        return;
                    }
                    if (cOnNavigationEvent == 65535) {
                        uhsVar.onNavigationEvent(this);
                        uhsVar.IAuthTabCallback(uc.Data);
                        return;
                    }
                    if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r') {
                        return;
                    }
                    switch (cOnNavigationEvent) {
                        case Imgproc.COLOR_HLS2BGR /* 60 */:
                            break;
                        case Imgproc.COLOR_HLS2RGB /* 61 */:
                            uhsVar.IAuthTabCallback(uc.BeforeAttributeValue);
                            break;
                        case '>':
                            uhsVar.IAuthTabCallbackStub();
                            uhsVar.IAuthTabCallback(uc.Data);
                            break;
                        default:
                            uhsVar.IAuthTabCallbackStub.extraCallbackWithResult();
                            rdjVar.onMessageChannelReady();
                            uhsVar.IAuthTabCallback(uc.AttributeName);
                            break;
                    }
                    return;
                }
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.extraCallbackWithResult();
                uhsVar.IAuthTabCallbackStub.onWarmupCompleted(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.AttributeName);
            }
        }
    },
    BeforeAttributeValue { // from class: o.uc.31
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.onExtraCallback(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.AttributeValue_unquoted);
                return;
            }
            if (cOnNavigationEvent != ' ') {
                if (cOnNavigationEvent == '\"') {
                    uhsVar.IAuthTabCallback(uc.AttributeValue_doubleQuoted);
                    return;
                }
                if (cOnNavigationEvent != '`') {
                    if (cOnNavigationEvent == 65535) {
                        uhsVar.onNavigationEvent(this);
                        uhsVar.IAuthTabCallbackStub();
                        uhsVar.IAuthTabCallback(uc.Data);
                        return;
                    }
                    if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r') {
                        return;
                    }
                    if (cOnNavigationEvent == '&') {
                        rdjVar.onMessageChannelReady();
                        uhsVar.IAuthTabCallback(uc.AttributeValue_unquoted);
                        return;
                    }
                    if (cOnNavigationEvent == '\'') {
                        uhsVar.IAuthTabCallback(uc.AttributeValue_singleQuoted);
                        return;
                    }
                    switch (cOnNavigationEvent) {
                        case Imgproc.COLOR_HLS2BGR /* 60 */:
                        case Imgproc.COLOR_HLS2RGB /* 61 */:
                            break;
                        case '>':
                            uhsVar.onExtraCallback(this);
                            uhsVar.IAuthTabCallbackStub();
                            uhsVar.IAuthTabCallback(uc.Data);
                            break;
                        default:
                            rdjVar.onMessageChannelReady();
                            uhsVar.IAuthTabCallback(uc.AttributeValue_unquoted);
                            break;
                    }
                    return;
                }
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.onExtraCallback(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.AttributeValue_unquoted);
            }
        }
    },
    AttributeValue_doubleQuoted { // from class: o.uc.32
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            String strOnWarmupCompleted = rdjVar.onWarmupCompleted(false);
            if (strOnWarmupCompleted.length() > 0) {
                uhsVar.IAuthTabCallbackStub.IAuthTabCallback(strOnWarmupCompleted);
            } else {
                uhsVar.IAuthTabCallbackStub.onMinimized();
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.onExtraCallback(uc.replacementChar);
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.IAuthTabCallback(uc.AfterAttributeValue_quoted);
                return;
            }
            if (cOnNavigationEvent != '&') {
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                } else {
                    uhsVar.IAuthTabCallbackStub.onExtraCallback(cOnNavigationEvent);
                    return;
                }
            }
            int[] iArrOnWarmupCompleted = uhsVar.onWarmupCompleted((Character) '\"', true);
            if (iArrOnWarmupCompleted != null) {
                uhsVar.IAuthTabCallbackStub.onWarmupCompleted(iArrOnWarmupCompleted);
            } else {
                uhsVar.IAuthTabCallbackStub.onExtraCallback('&');
            }
        }
    },
    AttributeValue_singleQuoted { // from class: o.uc.34
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            String strOnWarmupCompleted = rdjVar.onWarmupCompleted(true);
            if (strOnWarmupCompleted.length() > 0) {
                uhsVar.IAuthTabCallbackStub.IAuthTabCallback(strOnWarmupCompleted);
            } else {
                uhsVar.IAuthTabCallbackStub.onMinimized();
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackStub.onExtraCallback(uc.replacementChar);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent != '&') {
                if (cOnNavigationEvent == '\'') {
                    uhsVar.IAuthTabCallback(uc.AfterAttributeValue_quoted);
                    return;
                } else {
                    uhsVar.IAuthTabCallbackStub.onExtraCallback(cOnNavigationEvent);
                    return;
                }
            }
            int[] iArrOnWarmupCompleted = uhsVar.onWarmupCompleted((Character) '\'', true);
            if (iArrOnWarmupCompleted != null) {
                uhsVar.IAuthTabCallbackStub.onWarmupCompleted(iArrOnWarmupCompleted);
            } else {
                uhsVar.IAuthTabCallbackStub.onExtraCallback('&');
            }
        }
    },
    AttributeValue_unquoted { // from class: o.uc.35
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            String strOnWarmupCompleted = rdjVar.onWarmupCompleted(uc.attributeValueUnquoted);
            if (strOnWarmupCompleted.length() > 0) {
                uhsVar.IAuthTabCallbackStub.IAuthTabCallback(strOnWarmupCompleted);
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent != 0) {
                if (cOnNavigationEvent != ' ') {
                    if (cOnNavigationEvent != '\"' && cOnNavigationEvent != '`') {
                        if (cOnNavigationEvent == 65535) {
                            uhsVar.onNavigationEvent(this);
                            uhsVar.IAuthTabCallback(uc.Data);
                            return;
                        }
                        if (cOnNavigationEvent != '\t' && cOnNavigationEvent != '\n' && cOnNavigationEvent != '\f' && cOnNavigationEvent != '\r') {
                            if (cOnNavigationEvent == '&') {
                                int[] iArrOnWarmupCompleted = uhsVar.onWarmupCompleted((Character) '>', true);
                                if (iArrOnWarmupCompleted != null) {
                                    uhsVar.IAuthTabCallbackStub.onWarmupCompleted(iArrOnWarmupCompleted);
                                    return;
                                } else {
                                    uhsVar.IAuthTabCallbackStub.onExtraCallback('&');
                                    return;
                                }
                            }
                            if (cOnNavigationEvent != '\'') {
                                switch (cOnNavigationEvent) {
                                    case Imgproc.COLOR_HLS2BGR /* 60 */:
                                    case Imgproc.COLOR_HLS2RGB /* 61 */:
                                        break;
                                    case '>':
                                        uhsVar.IAuthTabCallbackStub();
                                        uhsVar.IAuthTabCallback(uc.Data);
                                        break;
                                    default:
                                        uhsVar.IAuthTabCallbackStub.onExtraCallback(cOnNavigationEvent);
                                        break;
                                }
                                return;
                            }
                        }
                    }
                    uhsVar.onExtraCallback(this);
                    uhsVar.IAuthTabCallbackStub.onExtraCallback(cOnNavigationEvent);
                    return;
                }
                uhsVar.IAuthTabCallback(uc.BeforeAttributeName);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.IAuthTabCallbackStub.onExtraCallback(uc.replacementChar);
        }
    },
    AfterAttributeValue_quoted { // from class: o.uc.40
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(uc.BeforeAttributeName);
                return;
            }
            if (cOnNavigationEvent == '/') {
                uhsVar.IAuthTabCallback(uc.SelfClosingStartTag);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.IAuthTabCallbackStub();
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                rdjVar.onMessageChannelReady();
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.BeforeAttributeName);
            }
        }
    },
    SelfClosingStartTag { // from class: o.uc.39
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '>') {
                uhsVar.IAuthTabCallbackStub.onWarmupCompleted = true;
                uhsVar.IAuthTabCallbackStub();
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                rdjVar.onMessageChannelReady();
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.BeforeAttributeName);
            }
        }
    },
    BogusComment { // from class: o.uc.36
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uhsVar.onExtraCallback.onExtraCallbackWithResult(rdjVar.IAuthTabCallback('>'));
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == '>' || cIAuthTabCallbackStubProxy == 65535) {
                rdjVar.onNavigationEvent();
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            }
        }
    },
    MarkupDeclarationOpen { // from class: o.uc.37
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.onWarmupCompleted("--")) {
                uhsVar.onNavigationEvent();
                uhsVar.IAuthTabCallback(uc.CommentStart);
            } else {
                if (rdjVar.onExtraCallbackWithResult("DOCTYPE")) {
                    uhsVar.IAuthTabCallback(uc.Doctype);
                    return;
                }
                if (rdjVar.onWarmupCompleted("[CDATA[")) {
                    uhsVar.asBinder();
                    uhsVar.IAuthTabCallback(uc.CdataSection);
                } else {
                    uhsVar.onExtraCallback(this);
                    uhsVar.onExtraCallbackWithResult();
                    uhsVar.IAuthTabCallback(uc.BogusComment);
                }
            }
        }
    },
    CommentStart { // from class: o.uc.38
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.Comment);
                return;
            }
            if (cOnNavigationEvent == '-') {
                uhsVar.IAuthTabCallback(uc.CommentStartDash);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                rdjVar.onMessageChannelReady();
                uhsVar.IAuthTabCallback(uc.Comment);
            }
        }
    },
    CommentStartDash { // from class: o.uc.41
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.Comment);
                return;
            }
            if (cOnNavigationEvent == '-') {
                uhsVar.IAuthTabCallback(uc.CommentStartDash);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                uhsVar.onExtraCallback.onExtraCallbackWithResult(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.Comment);
            }
        }
    },
    Comment { // from class: o.uc.42
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
            if (cIAuthTabCallbackStubProxy == 0) {
                uhsVar.onExtraCallback(this);
                rdjVar.IAuthTabCallback();
                uhsVar.onExtraCallback.onExtraCallbackWithResult(uc.replacementChar);
            } else if (cIAuthTabCallbackStubProxy == '-') {
                uhsVar.onWarmupCompleted(uc.CommentEndDash);
            } else {
                if (cIAuthTabCallbackStubProxy == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.IAuthTabCallbackDefault();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                }
                uhsVar.onExtraCallback.onExtraCallbackWithResult(rdjVar.IAuthTabCallback('-', 0));
            }
        }
    },
    CommentEndDash { // from class: o.uc.43
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult('-').onExtraCallbackWithResult(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.Comment);
            } else {
                if (cOnNavigationEvent == '-') {
                    uhsVar.IAuthTabCallback(uc.CommentEnd);
                    return;
                }
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.IAuthTabCallbackDefault();
                    uhsVar.IAuthTabCallback(uc.Data);
                } else {
                    uhsVar.onExtraCallback.onExtraCallbackWithResult('-').onExtraCallbackWithResult(cOnNavigationEvent);
                    uhsVar.IAuthTabCallback(uc.Comment);
                }
            }
        }
    },
    CommentEnd { // from class: o.uc.45
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult("--").onExtraCallbackWithResult(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.Comment);
                return;
            }
            if (cOnNavigationEvent == '!') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.CommentEndBang);
                return;
            }
            if (cOnNavigationEvent == '-') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult('-');
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult("--").onExtraCallbackWithResult(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.Comment);
            }
        }
    },
    CommentEndBang { // from class: o.uc.47
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback.onExtraCallbackWithResult("--!").onExtraCallbackWithResult(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.Comment);
                return;
            }
            if (cOnNavigationEvent == '-') {
                uhsVar.onExtraCallback.onExtraCallbackWithResult("--!");
                uhsVar.IAuthTabCallback(uc.CommentEndDash);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            } else if (cOnNavigationEvent != 65535) {
                uhsVar.onExtraCallback.onExtraCallbackWithResult("--!").onExtraCallbackWithResult(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.Comment);
            } else {
                uhsVar.onNavigationEvent(this);
                uhsVar.IAuthTabCallbackDefault();
                uhsVar.IAuthTabCallback(uc.Data);
            }
        }
    },
    Doctype { // from class: o.uc.48
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(uc.BeforeDoctypeName);
                return;
            }
            if (cOnNavigationEvent != '>') {
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                } else {
                    uhsVar.onExtraCallback(this);
                    uhsVar.IAuthTabCallback(uc.BeforeDoctypeName);
                    return;
                }
            }
            uhsVar.onExtraCallback(this);
            uhsVar.onExtraCallback();
            uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
            uhsVar.asInterface();
            uhsVar.IAuthTabCallback(uc.Data);
        }
    },
    BeforeDoctypeName { // from class: o.uc.50
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            if (rdjVar.ICustomTabsCallback()) {
                uhsVar.onExtraCallback();
                uhsVar.IAuthTabCallback(uc.DoctypeName);
                return;
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallback();
                uhsVar.onExtraCallbackWithResult.onNavigationEvent.append(uc.replacementChar);
                uhsVar.IAuthTabCallback(uc.DoctypeName);
                return;
            }
            if (cOnNavigationEvent != ' ') {
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.onExtraCallback();
                    uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                    uhsVar.asInterface();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                }
                if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r') {
                    return;
                }
                uhsVar.onExtraCallback();
                uhsVar.onExtraCallbackWithResult.onNavigationEvent.append(cOnNavigationEvent);
                uhsVar.IAuthTabCallback(uc.DoctypeName);
            }
        }
    },
    DoctypeName { // from class: o.uc.49
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            if (rdjVar.onPostMessage()) {
                uhsVar.onExtraCallbackWithResult.onNavigationEvent.append(rdjVar.IAuthTabCallbackStub());
                return;
            }
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent != 0) {
                if (cOnNavigationEvent != ' ') {
                    if (cOnNavigationEvent == '>') {
                        uhsVar.asInterface();
                        uhsVar.IAuthTabCallback(uc.Data);
                        return;
                    }
                    if (cOnNavigationEvent == 65535) {
                        uhsVar.onNavigationEvent(this);
                        uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                        uhsVar.asInterface();
                        uhsVar.IAuthTabCallback(uc.Data);
                        return;
                    }
                    if (cOnNavigationEvent != '\t' && cOnNavigationEvent != '\n' && cOnNavigationEvent != '\f' && cOnNavigationEvent != '\r') {
                        uhsVar.onExtraCallbackWithResult.onNavigationEvent.append(cOnNavigationEvent);
                        return;
                    }
                }
                uhsVar.IAuthTabCallback(uc.AfterDoctypeName);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.onExtraCallbackWithResult.onNavigationEvent.append(uc.replacementChar);
        }
    },
    AfterDoctypeName { // from class: o.uc.46
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) {
            if (rdjVar.access000()) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (rdjVar.onNavigationEvent('\t', '\n', '\r', '\f', ' ')) {
                rdjVar.IAuthTabCallback();
                return;
            }
            if (rdjVar.onWarmupCompleted('>')) {
                uhsVar.asInterface();
                uhsVar.onWarmupCompleted(uc.Data);
                return;
            }
            if (rdjVar.onExtraCallbackWithResult("PUBLIC")) {
                uhsVar.onExtraCallbackWithResult.onExtraCallback = "PUBLIC";
                uhsVar.IAuthTabCallback(uc.AfterDoctypePublicKeyword);
            } else if (rdjVar.onExtraCallbackWithResult("SYSTEM")) {
                uhsVar.onExtraCallbackWithResult.onExtraCallback = "SYSTEM";
                uhsVar.IAuthTabCallback(uc.AfterDoctypeSystemKeyword);
            } else {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.onWarmupCompleted(uc.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: o.uc.52
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(uc.BeforeDoctypePublicIdentifier);
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
            uhsVar.IAuthTabCallback(uc.BogusDoctype);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: o.uc.54
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.IAuthTabCallback(uc.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.IAuthTabCallback(uc.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
            uhsVar.IAuthTabCallback(uc.BogusDoctype);
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: o.uc.53
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.onWarmupCompleted.append(uc.replacementChar);
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.IAuthTabCallback(uc.AfterDoctypePublicIdentifier);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallbackWithResult.onWarmupCompleted.append(cOnNavigationEvent);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: o.uc.51
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.onWarmupCompleted.append(uc.replacementChar);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.IAuthTabCallback(uc.AfterDoctypePublicIdentifier);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallbackWithResult.onWarmupCompleted.append(cOnNavigationEvent);
        }
    },
    AfterDoctypePublicIdentifier { // from class: o.uc.55
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(uc.BetweenDoctypePublicAndSystemIdentifiers);
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                    uhsVar.asInterface();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                }
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.IAuthTabCallback(uc.BogusDoctype);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: o.uc.60
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                    uhsVar.asInterface();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                }
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.IAuthTabCallback(uc.BogusDoctype);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: o.uc.59
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(uc.BeforeDoctypeSystemIdentifier);
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
            uhsVar.asInterface();
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: o.uc.58
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.IAuthTabCallback(uc.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallback(this);
            uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
            uhsVar.IAuthTabCallback(uc.BogusDoctype);
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: o.uc.56
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.asInterface.append(uc.replacementChar);
                return;
            }
            if (cOnNavigationEvent == '\"') {
                uhsVar.IAuthTabCallback(uc.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallbackWithResult.asInterface.append(cOnNavigationEvent);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: o.uc.63
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == 0) {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.asInterface.append(uc.replacementChar);
                return;
            }
            if (cOnNavigationEvent == '\'') {
                uhsVar.IAuthTabCallback(uc.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.onExtraCallback(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            if (cOnNavigationEvent == 65535) {
                uhsVar.onNavigationEvent(this);
                uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
                return;
            }
            uhsVar.onExtraCallbackWithResult.asInterface.append(cOnNavigationEvent);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: o.uc.64
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                return;
            }
            if (cOnNavigationEvent == '>') {
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                if (cOnNavigationEvent == 65535) {
                    uhsVar.onNavigationEvent(this);
                    uhsVar.onExtraCallbackWithResult.IAuthTabCallback = true;
                    uhsVar.asInterface();
                    uhsVar.IAuthTabCallback(uc.Data);
                    return;
                }
                uhsVar.onExtraCallback(this);
                uhsVar.IAuthTabCallback(uc.BogusDoctype);
            }
        }
    },
    BogusDoctype { // from class: o.uc.61
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '>') {
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
            } else {
                if (cOnNavigationEvent != 65535) {
                    return;
                }
                uhsVar.asInterface();
                uhsVar.IAuthTabCallback(uc.Data);
            }
        }
    },
    CdataSection { // from class: o.uc.65
        @Override // o.uc
        void read(uhs uhsVar, rdj rdjVar) throws IOException {
            uhsVar.onWarmupCompleted.append(rdjVar.onNavigationEvent("]]>"));
            if (rdjVar.onWarmupCompleted("]]>") || rdjVar.access000()) {
                uhsVar.onExtraCallbackWithResult(new szb.IAuthTabCallback(uhsVar.onWarmupCompleted.toString()));
                uhsVar.IAuthTabCallback(uc.Data);
            }
        }
    };

    private static final char eof = 65535;
    static final char nullChar = 0;
    private static final char replacementChar = 65533;
    static final char[] attributeNameCharsSorted = {'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    private static final String replacementStr = "�";

    abstract void read(uhs uhsVar, rdj rdjVar);

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataEndTag(uhs uhsVar, rdj rdjVar, uc ucVar) throws IOException {
        if (rdjVar.onPostMessage()) {
            String strIAuthTabCallbackStub = rdjVar.IAuthTabCallbackStub();
            uhsVar.IAuthTabCallbackStub.onExtraCallback(strIAuthTabCallbackStub);
            uhsVar.onWarmupCompleted.append(strIAuthTabCallbackStub);
            return;
        }
        if (uhsVar.onTransact() && !rdjVar.access000()) {
            char cOnNavigationEvent = rdjVar.onNavigationEvent();
            if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ') {
                uhsVar.IAuthTabCallback(BeforeAttributeName);
                return;
            }
            if (cOnNavigationEvent == '/') {
                uhsVar.IAuthTabCallback(SelfClosingStartTag);
                return;
            } else {
                if (cOnNavigationEvent == '>') {
                    uhsVar.IAuthTabCallbackStub();
                    uhsVar.IAuthTabCallback(Data);
                    return;
                }
                uhsVar.onWarmupCompleted.append(cOnNavigationEvent);
            }
        }
        uhsVar.IAuthTabCallback("</");
        uhsVar.IAuthTabCallback(uhsVar.onWarmupCompleted);
        uhsVar.IAuthTabCallback(ucVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readRawData(uhs uhsVar, rdj rdjVar, uc ucVar, uc ucVar2) throws IOException {
        char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
        if (cIAuthTabCallbackStubProxy == 0) {
            uhsVar.onExtraCallback(ucVar);
            rdjVar.IAuthTabCallback();
            uhsVar.onNavigationEvent(replacementChar);
        } else if (cIAuthTabCallbackStubProxy == '<') {
            uhsVar.onWarmupCompleted(ucVar2);
        } else if (cIAuthTabCallbackStubProxy == 65535) {
            uhsVar.onExtraCallbackWithResult(new szb.onWarmupCompleted());
        } else {
            uhsVar.IAuthTabCallback(rdjVar.onTransact());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readCharRef(uhs uhsVar, uc ucVar) {
        int[] iArrOnWarmupCompleted = uhsVar.onWarmupCompleted((Character) null, false);
        if (iArrOnWarmupCompleted == null) {
            uhsVar.onNavigationEvent('&');
        } else {
            uhsVar.onWarmupCompleted(iArrOnWarmupCompleted);
        }
        uhsVar.IAuthTabCallback(ucVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readEndTag(uhs uhsVar, rdj rdjVar, uc ucVar, uc ucVar2) {
        if (rdjVar.ICustomTabsCallback()) {
            uhsVar.onExtraCallbackWithResult(false);
            uhsVar.IAuthTabCallback(ucVar);
        } else {
            uhsVar.IAuthTabCallback("</");
            uhsVar.IAuthTabCallback(ucVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(uhs uhsVar, rdj rdjVar, uc ucVar, uc ucVar2) throws IOException {
        if (rdjVar.onPostMessage()) {
            String strIAuthTabCallbackStub = rdjVar.IAuthTabCallbackStub();
            uhsVar.onWarmupCompleted.append(strIAuthTabCallbackStub);
            uhsVar.IAuthTabCallback(strIAuthTabCallbackStub);
            return;
        }
        char cOnNavigationEvent = rdjVar.onNavigationEvent();
        if (cOnNavigationEvent == '\t' || cOnNavigationEvent == '\n' || cOnNavigationEvent == '\f' || cOnNavigationEvent == '\r' || cOnNavigationEvent == ' ' || cOnNavigationEvent == '/' || cOnNavigationEvent == '>') {
            if (uhsVar.onWarmupCompleted.toString().equals("script")) {
                uhsVar.IAuthTabCallback(ucVar);
            } else {
                uhsVar.IAuthTabCallback(ucVar2);
            }
            uhsVar.onNavigationEvent(cOnNavigationEvent);
            return;
        }
        rdjVar.onMessageChannelReady();
        uhsVar.IAuthTabCallback(ucVar2);
    }
}
