package o;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import o.oq;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pvm {
    private static final char[] IAuthTabCallback = {',', ';'};
    private static final HashMap<String, String> onWarmupCompleted = new HashMap<>();
    private static final oq.onExtraCallback onExtraCallback = new oq.onExtraCallback();

    public enum onExtraCallbackWithResult {
        xhtml(px.onNavigationEvent, 4),
        base(px.IAuthTabCallback, 106),
        extended(px.onExtraCallbackWithResult, 2125);

        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;

        onExtraCallbackWithResult(String str, int i) {
            pvm.onExtraCallback(this, str, i);
        }

        int codepointForName(String str) {
            int iBinarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (iBinarySearch >= 0) {
                return this.codeVals[iBinarySearch];
            }
            return -1;
        }

        String nameForCodepoint(int i) {
            int iBinarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (iBinarySearch >= 0) {
                String[] strArr = this.nameVals;
                if (iBinarySearch < strArr.length - 1) {
                    int i2 = iBinarySearch + 1;
                    if (this.codeKeys[i2] == i) {
                        return strArr[i2];
                    }
                }
                return strArr[iBinarySearch];
            }
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }

        private int size() {
            return this.nameKeys.length;
        }
    }

    public static boolean onExtraCallbackWithResult(String str) {
        return onExtraCallbackWithResult.extended.codepointForName(str) != -1;
    }

    public static boolean IAuthTabCallback(String str) {
        return onExtraCallbackWithResult.base.codepointForName(str) != -1;
    }

    public static int IAuthTabCallback(String str, int[] iArr) {
        String str2 = onWarmupCompleted.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iCodepointForName = onExtraCallbackWithResult.extended.codepointForName(str);
        if (iCodepointForName == -1) {
            return 0;
        }
        iArr[0] = iCodepointForName;
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void onWarmupCompleted(Appendable appendable, String str, oq.onExtraCallback onextracallback, boolean z, boolean z2, boolean z3) throws IOException {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onextracallback.onExtraCallback();
        CharsetEncoder charsetEncoderOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        IAuthTabCallback iAuthTabCallback = onextracallback.onNavigationEvent;
        int length = str.length();
        int iCharCount = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (z2) {
                if (!nfe.IAuthTabCallback(iCodePointAt)) {
                    z5 = false;
                    z4 = true;
                    if (iCodePointAt >= 65536) {
                    }
                } else if ((!z3 || z4) && !z5) {
                    appendable.append(' ');
                    z5 = true;
                }
            } else if (iCodePointAt >= 65536) {
                char c = (char) iCodePointAt;
                if (c == '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c == 160) {
                                if (onextracallbackwithresultOnExtraCallback != onExtraCallbackWithResult.xhtml) {
                                    appendable.append("&nbsp;");
                                } else {
                                    appendable.append("&#xa0;");
                                }
                            } else if (c < ' ' || !onNavigationEvent(iAuthTabCallback, c, charsetEncoderOnExtraCallbackWithResult)) {
                                IAuthTabCallback(appendable, onextracallbackwithresultOnExtraCallback, iCodePointAt);
                            } else {
                                appendable.append(c);
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || onextracallbackwithresultOnExtraCallback == onExtraCallbackWithResult.xhtml || onextracallback.IAuthTabCallbackDefault() == oq.onExtraCallback.IAuthTabCallback.xml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                String str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderOnExtraCallbackWithResult.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    IAuthTabCallback(appendable, onextracallbackwithresultOnExtraCallback, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    private static void IAuthTabCallback(Appendable appendable, onExtraCallbackWithResult onextracallbackwithresult, int i) throws IOException {
        String strNameForCodepoint = onextracallbackwithresult.nameForCodepoint(i);
        if (!_UrlKt.FRAGMENT_ENCODE_SET.equals(strNameForCodepoint)) {
            appendable.append('&').append(strNameForCodepoint).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* renamed from: o.pvm$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[IAuthTabCallback.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[IAuthTabCallback.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback, char c, CharsetEncoder charsetEncoder) {
        int i = AnonymousClass2.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i == 1) {
            return c < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c);
        }
        return true;
    }

    enum IAuthTabCallback {
        ascii,
        utf,
        fallback;

        static IAuthTabCallback byName(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            if (str.startsWith("UTF-")) {
                return utf;
            }
            return fallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, String str, int i) {
        int i2;
        onextracallbackwithresult.nameKeys = new String[i];
        onextracallbackwithresult.codeVals = new int[i];
        onextracallbackwithresult.codeKeys = new int[i];
        onextracallbackwithresult.nameVals = new String[i];
        rdj rdjVar = new rdj(str);
        int i3 = 0;
        while (!rdjVar.access000()) {
            try {
                String strIAuthTabCallback = rdjVar.IAuthTabCallback('=');
                rdjVar.IAuthTabCallback();
                int i4 = Integer.parseInt(rdjVar.IAuthTabCallback(IAuthTabCallback), 36);
                char cIAuthTabCallbackStubProxy = rdjVar.IAuthTabCallbackStubProxy();
                rdjVar.IAuthTabCallback();
                if (cIAuthTabCallbackStubProxy == ',') {
                    i2 = Integer.parseInt(rdjVar.IAuthTabCallback(';'), 36);
                    rdjVar.IAuthTabCallback();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(rdjVar.IAuthTabCallback('&'), 36);
                rdjVar.IAuthTabCallback();
                onextracallbackwithresult.nameKeys[i3] = strIAuthTabCallback;
                onextracallbackwithresult.codeVals[i3] = i4;
                onextracallbackwithresult.codeKeys[i5] = i4;
                onextracallbackwithresult.nameVals[i5] = strIAuthTabCallback;
                if (i2 != -1) {
                    onWarmupCompleted.put(strIAuthTabCallback, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } finally {
                rdjVar.onExtraCallback();
            }
        }
        oas.onExtraCallback(i3 == i, "Unexpected count of entities loaded");
    }
}
