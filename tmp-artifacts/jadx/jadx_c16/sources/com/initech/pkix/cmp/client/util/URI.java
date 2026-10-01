package com.initech.pkix.cmp.client.util;

import com.initech.inibase.logger.spi.LocationInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.BitSet;
import java.util.Hashtable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class URI {
    public static final boolean ENABLE_BACKWARDS_COMPATIBILITY = true;
    protected static final int GENERIC = 2;
    protected static final int OPAQUE = 0;
    protected static final int SEMI_GENERIC = 1;
    protected static final BitSet alphanumChar;
    private static final char[] b;
    protected static final Hashtable defaultPorts;
    public static final BitSet escpdFragChar;
    public static final BitSet escpdPathChar;
    public static final BitSet escpdQueryChar;
    protected static final BitSet hostChar;
    protected static final BitSet markChar;
    protected static final BitSet opaqueChar;
    protected static final BitSet pcharChar;
    protected static final BitSet reg_nameChar;
    protected static final BitSet reservedChar;
    public static final BitSet resvdHostChar;
    public static final BitSet resvdPathChar;
    public static final BitSet resvdQueryChar;
    public static final BitSet resvdSchemeChar;
    public static final BitSet resvdUIChar;
    protected static final BitSet schemeChar;
    protected static final BitSet unreservedChar;
    protected static final BitSet uricChar;
    protected static final BitSet userinfoChar;
    protected static final Hashtable usesGenericSyntax;
    protected static final Hashtable usesSemiGenericSyntax;
    private int a;
    protected String fragment;
    protected String host;
    protected String opaque;
    protected String path;
    protected int port;
    protected String query;
    protected String scheme;
    protected int type;
    protected URL url;
    protected String userinfo;

    static {
        Hashtable hashtable = new Hashtable();
        defaultPorts = hashtable;
        Hashtable hashtable2 = new Hashtable();
        usesGenericSyntax = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        usesSemiGenericSyntax = hashtable3;
        hashtable.put("http", 80);
        hashtable.put("shttp", 80);
        hashtable.put("http-ng", 80);
        hashtable.put("coffee", 80);
        hashtable.put("https", 443);
        hashtable.put("ftp", 21);
        hashtable.put("telnet", 23);
        hashtable.put("nntp", 119);
        hashtable.put("news", 119);
        hashtable.put("snews", 563);
        hashtable.put("hnews", 80);
        hashtable.put("smtp", 25);
        hashtable.put("gopher", 70);
        hashtable.put("wais", 210);
        hashtable.put("whois", 43);
        hashtable.put("whois++", 63);
        hashtable.put("rwhois", 4321);
        hashtable.put("imap", 143);
        hashtable.put("pop", 110);
        hashtable.put("prospero", 1525);
        hashtable.put("irc", 194);
        hashtable.put("ldap", 389);
        hashtable.put("nfs", 2049);
        hashtable.put("z39.50r", 210);
        hashtable.put("z39.50s", 210);
        hashtable.put("vemmi", 575);
        hashtable.put("videotex", 516);
        hashtable.put("cmp", 829);
        Boolean bool = Boolean.TRUE;
        hashtable2.put("http", bool);
        hashtable2.put("https", bool);
        hashtable2.put("shttp", bool);
        hashtable2.put("coffee", bool);
        hashtable2.put("ftp", bool);
        hashtable2.put("file", bool);
        hashtable2.put("nntp", bool);
        hashtable2.put("news", bool);
        hashtable2.put("snews", bool);
        hashtable2.put("hnews", bool);
        hashtable2.put("imap", bool);
        hashtable2.put("wais", bool);
        hashtable2.put("nfs", bool);
        hashtable2.put("sip", bool);
        hashtable2.put("sips", bool);
        hashtable2.put("sipt", bool);
        hashtable2.put("sipu", bool);
        hashtable3.put("ldap", bool);
        hashtable3.put("irc", bool);
        hashtable3.put("gopher", bool);
        hashtable3.put("videotex", bool);
        hashtable3.put("rwhois", bool);
        hashtable3.put("whois++", bool);
        hashtable3.put("smtp", bool);
        hashtable3.put("telnet", bool);
        hashtable3.put("prospero", bool);
        hashtable3.put("pop", bool);
        hashtable3.put("vemmi", bool);
        hashtable3.put("z39.50r", bool);
        hashtable3.put("z39.50s", bool);
        hashtable3.put("stream", bool);
        hashtable3.put("cmp", bool);
        alphanumChar = new BitSet(128);
        for (int i = 48; i <= 57; i++) {
            alphanumChar.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            alphanumChar.set(i2);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            alphanumChar.set(i3);
        }
        BitSet bitSet = new BitSet(128);
        markChar = bitSet;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(33);
        bitSet.set(126);
        bitSet.set(42);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        BitSet bitSet2 = new BitSet(128);
        reservedChar = bitSet2;
        bitSet2.set(59);
        bitSet2.set(47);
        bitSet2.set(63);
        bitSet2.set(58);
        bitSet2.set(64);
        bitSet2.set(38);
        bitSet2.set(61);
        bitSet2.set(43);
        bitSet2.set(36);
        bitSet2.set(44);
        BitSet bitSet3 = new BitSet(128);
        unreservedChar = bitSet3;
        BitSet bitSet4 = alphanumChar;
        bitSet3.or(bitSet4);
        bitSet3.or(bitSet);
        BitSet bitSet5 = new BitSet(128);
        uricChar = bitSet5;
        bitSet5.or(bitSet3);
        bitSet5.or(bitSet2);
        bitSet5.set(37);
        BitSet bitSet6 = new BitSet(128);
        pcharChar = bitSet6;
        bitSet6.or(bitSet3);
        bitSet6.set(37);
        bitSet6.set(58);
        bitSet6.set(64);
        bitSet6.set(38);
        bitSet6.set(61);
        bitSet6.set(43);
        bitSet6.set(36);
        bitSet6.set(44);
        BitSet bitSet7 = new BitSet(128);
        userinfoChar = bitSet7;
        bitSet7.or(bitSet3);
        bitSet7.set(37);
        bitSet7.set(59);
        bitSet7.set(58);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        BitSet bitSet8 = new BitSet(128);
        schemeChar = bitSet8;
        bitSet8.or(bitSet4);
        bitSet8.set(43);
        bitSet8.set(45);
        bitSet8.set(46);
        BitSet bitSet9 = new BitSet(128);
        opaqueChar = bitSet9;
        bitSet9.or(bitSet5);
        BitSet bitSet10 = new BitSet(128);
        hostChar = bitSet10;
        bitSet10.or(bitSet4);
        bitSet10.set(45);
        bitSet10.set(46);
        BitSet bitSet11 = new BitSet(128);
        reg_nameChar = bitSet11;
        bitSet11.or(bitSet3);
        bitSet11.set(36);
        bitSet11.set(44);
        bitSet11.set(59);
        bitSet11.set(58);
        bitSet11.set(64);
        bitSet11.set(38);
        bitSet11.set(61);
        bitSet11.set(43);
        BitSet bitSet12 = new BitSet(128);
        resvdSchemeChar = bitSet12;
        bitSet12.set(58);
        BitSet bitSet13 = new BitSet(128);
        resvdUIChar = bitSet13;
        bitSet13.set(64);
        BitSet bitSet14 = new BitSet(128);
        resvdHostChar = bitSet14;
        bitSet14.set(58);
        bitSet14.set(47);
        bitSet14.set(63);
        bitSet14.set(35);
        BitSet bitSet15 = new BitSet(128);
        resvdPathChar = bitSet15;
        bitSet15.set(47);
        bitSet15.set(59);
        bitSet15.set(63);
        bitSet15.set(35);
        BitSet bitSet16 = new BitSet(128);
        resvdQueryChar = bitSet16;
        bitSet16.set(35);
        BitSet bitSet17 = new BitSet(128);
        escpdPathChar = bitSet17;
        bitSet17.or(bitSet6);
        bitSet17.set(37);
        bitSet17.set(47);
        bitSet17.set(59);
        BitSet bitSet18 = new BitSet(128);
        escpdQueryChar = bitSet18;
        bitSet18.or(bitSet5);
        bitSet18.clear(35);
        BitSet bitSet19 = new BitSet(128);
        escpdFragChar = bitSet19;
        bitSet19.or(bitSet5);
        b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public URI(String str) throws ParseException {
        this((URI) null, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkix.cmp.client.util.ParseException */
    public URI(URI uri, String str) throws NumberFormatException, ParseException {
        char c;
        char c2;
        char c3;
        char c4;
        this.port = -1;
        this.url = null;
        this.a = -1;
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (i < length && Character.isWhitespace(charArray[i])) {
            i++;
        }
        while (length > 0 && Character.isWhitespace(charArray[length - 1])) {
            length--;
        }
        if (i < length - 3 && charArray[i + 3] == ':' && (((c2 = charArray[i]) == 'u' || c2 == 'U') && (((c3 = charArray[i + 1]) == 'r' || c3 == 'R') && ((c4 = charArray[i + 2]) == 'i' || c4 == 'I' || c4 == 'l' || c4 == 'L')))) {
            i += 4;
        }
        int i2 = i;
        while (i2 < length && (c = charArray[i2]) != ':' && c != '/' && c != '?' && c != '#') {
            i2++;
        }
        if (i2 < length && charArray[i2] == ':') {
            this.scheme = str.substring(i, i2).trim().toLowerCase();
            i = i2 + 1;
        }
        String str2 = this.scheme;
        if (str2 == null) {
            if (uri == null) {
                throw new ParseException("No scheme found");
            }
            str2 = uri.scheme;
        }
        int i3 = usesGenericSyntax(str2) ? 2 : usesSemiGenericSyntax(str2) ? 1 : 0;
        this.type = i3;
        if (i3 == 0) {
            if (uri != null && this.scheme == null) {
                throw new ParseException("Can't resolve relative URI for scheme " + str2);
            }
            String strEscape = escape(str.substring(i), opaqueChar, true);
            this.opaque = strEscape;
            if (strEscape.length() <= 0 || this.opaque.charAt(0) != '/') {
                return;
            }
            this.opaque = "%2F" + this.opaque.substring(1);
            return;
        }
        int i4 = i + 1;
        if (i4 < length && charArray[i] == '/' && charArray[i4] == '/') {
            int i5 = i + 2;
            int i6 = i5;
            while (i6 < length) {
                char c5 = charArray[i6];
                if (c5 == '/' || c5 == '?' || c5 == '#') {
                    break;
                } else {
                    i6++;
                }
            }
            a(str.substring(i5, i6), str2);
            i = i6;
        }
        if (this.type == 1) {
            String strEscape2 = escape(str.substring(i), uricChar, true);
            this.path = strEscape2;
            if (strEscape2.length() > 0 && this.path.charAt(0) != '/') {
                this.path = "/" + this.path;
            }
        } else {
            int i7 = i;
            while (i7 < length) {
                char c6 = charArray[i7];
                if (c6 == '?' || c6 == '#') {
                    break;
                } else {
                    i7++;
                }
            }
            this.path = escape(str.substring(i, i7), escpdPathChar, true);
            if (i7 < length && charArray[i7] == '?') {
                int i8 = i7 + 1;
                int i9 = i8;
                while (i9 < length && charArray[i9] != '#') {
                    i9++;
                }
                this.query = escape(str.substring(i8, i9), escpdQueryChar, true);
                i7 = i9;
            }
            if (i7 < length && charArray[i7] == '#') {
                this.fragment = escape(str.substring(i7 + 1, length), escpdFragChar, true);
            }
        }
        if (uri != null) {
            String str3 = this.scheme;
            if (str3 == null || str3.equals(uri.scheme)) {
                this.scheme = uri.scheme;
                if (this.host == null) {
                    this.userinfo = uri.userinfo;
                    this.host = uri.host;
                    this.port = uri.port;
                    if (this.type != 1) {
                        if (this.path.length() == 0 && this.query == null) {
                            this.path = uri.path;
                            this.query = uri.query;
                            return;
                        }
                        if (this.path.length() == 0 || this.path.charAt(0) != '/') {
                            String str4 = uri.path;
                            int iLastIndexOf = str4 != null ? str4.lastIndexOf(47) : -1;
                            if (iLastIndexOf < 0) {
                                this.path = "/" + this.path;
                            } else {
                                this.path = uri.path.substring(0, iLastIndexOf + 1) + this.path;
                            }
                            this.path = canonicalizePath(this.path);
                        }
                    }
                }
            }
        }
    }

    public static String canonicalizePath(String str) {
        int i;
        int i2;
        int length = str.length();
        int iIndexOf = str.indexOf("/.");
        if (iIndexOf == -1) {
            return str;
        }
        if (iIndexOf != length - 2) {
            int i3 = iIndexOf + 2;
            if (str.charAt(i3) != '/') {
                if (str.charAt(i3) != '.') {
                    return str;
                }
                if (iIndexOf != length - 3 && str.charAt(iIndexOf + 3) != '/') {
                    return str;
                }
            }
        }
        int length2 = str.length();
        char[] cArr = new char[length2];
        str.getChars(0, length2, cArr, 0);
        int i4 = 1;
        int i5 = 0;
        while (i4 < length) {
            if (cArr[i4] == '.') {
                int i6 = i4 - 1;
                if (cArr[i6] == '/') {
                    if (i4 == length - 1) {
                        i2 = i4 + 1;
                    } else {
                        int i7 = i4 + 1;
                        char c = cArr[i7];
                        if (c == '/') {
                            i4 = i6;
                            i2 = i7;
                        } else if (c == '.' && (i4 == length - 2 || cArr[i4 + 2] == '/')) {
                            if (i4 < i5 + 2) {
                                i5 = i4 + 2;
                            } else {
                                int i8 = i4 - 2;
                                while (i8 > i5 && cArr[i8] != '/') {
                                    i8--;
                                }
                                if (cArr[i8] == '/') {
                                    if (i4 == i) {
                                        i8++;
                                    }
                                    i2 = i4 + 2;
                                    i4 = i8;
                                }
                            }
                        }
                    }
                    System.arraycopy(cArr, i2, cArr, i4, length - i2);
                    length -= i2 - i4;
                }
            }
            i4++;
        }
        return new String(cArr, 0, length);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkix.cmp.client.util.ParseException */
    private void a(String str, String str2) throws NumberFormatException, ParseException {
        int i;
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charArray[i3] != '@') {
            i3++;
        }
        if (i3 < length && charArray[i3] == '@') {
            this.userinfo = escape(str.substring(0, i3), userinfoChar, true);
            i2 = i3 + 1;
        }
        if (i2 < length && charArray[i2] == '[') {
            int i4 = i2;
            while (i4 < length && charArray[i4] != ']') {
                i4++;
            }
            if (i4 == length) {
                throw new ParseException("No closing ']' found for opening '[' at position " + i2 + " in authority `" + str + "'");
            }
            this.host = str.substring(i2 + 1, i4);
            i = i4 + 1;
        } else {
            i = i2;
            while (i < length && charArray[i] != ':') {
                i++;
            }
            this.host = escape(str.substring(i2, i), uricChar, true);
        }
        if (i >= length - 1 || charArray[i] != ':') {
            return;
        }
        int i5 = i + 1;
        try {
            int i6 = Integer.parseInt(unescape(str.substring(i5, length), null));
            if (i6 < 0) {
                throw new NumberFormatException();
            }
            if (i6 == defaultPort(str2)) {
                this.port = -1;
            } else {
                this.port = i6;
            }
        } catch (NumberFormatException unused) {
            throw new ParseException(str.substring(i5, length) + " is an invalid port number");
        }
    }

    public URI(URL url) throws ParseException {
        this((URI) null, url.toExternalForm());
    }

    public URI(String str, String str2, String str3) throws ParseException {
        this(str, null, str2, -1, str3, null, null);
    }

    public URI(String str, String str2, int i, String str3) throws ParseException {
        this(str, null, str2, i, str3, null, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkix.cmp.client.util.ParseException */
    public URI(String str, String str2, String str3, int i, String str4, String str5, String str6) throws ParseException {
        this.port = -1;
        this.url = null;
        this.a = -1;
        if (str == null) {
            throw new ParseException("missing scheme");
        }
        this.scheme = escape(str.trim().toLowerCase(), schemeChar, true);
        if (str2 != null) {
            this.userinfo = escape(str2.trim(), userinfoChar, true);
        }
        if (str3 != null) {
            String strTrim = str3.trim();
            this.host = a(strTrim) ? strTrim : escape(strTrim, hostChar, true);
        }
        if (i != defaultPort(str)) {
            this.port = i;
        }
        if (str4 != null) {
            this.path = escape(str4.trim(), escpdPathChar, true);
        }
        if (str5 != null) {
            this.query = escape(str5.trim(), escpdQueryChar, true);
        }
        if (str6 != null) {
            this.fragment = escape(str6.trim(), escpdFragChar, true);
        }
        this.type = usesGenericSyntax(str) ? 2 : 1;
    }

    private static final boolean a(String str) {
        if (str.indexOf(58) < 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && cCharAt != ':') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkix.cmp.client.util.ParseException */
    public URI(String str, String str2) throws ParseException {
        this.port = -1;
        this.url = null;
        this.a = -1;
        if (str == null) {
            throw new ParseException("missing scheme");
        }
        this.scheme = escape(str.trim().toLowerCase(), schemeChar, true);
        this.opaque = escape(str2, opaqueChar, true);
        this.type = 0;
    }

    public static boolean usesGenericSyntax(String str) {
        return usesGenericSyntax.containsKey(str.trim().toLowerCase());
    }

    public static boolean usesSemiGenericSyntax(String str) {
        return usesSemiGenericSyntax.containsKey(str.trim().toLowerCase());
    }

    public static final int defaultPort(String str) {
        Integer num = (Integer) defaultPorts.get(str.trim().toLowerCase());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getOpaque() {
        return this.opaque;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public String getUserinfo() {
        return this.userinfo;
    }

    public String getPath() {
        return this.path;
    }

    public String getQueryString() {
        return this.query;
    }

    public String getPathAndQuery() {
        if (this.query == null) {
            return this.path;
        }
        if (this.path == null) {
            return LocationInfo.NA + this.query;
        }
        return this.path + LocationInfo.NA + this.query;
    }

    public String getFragment() {
        return this.fragment;
    }

    public boolean isGenericURI() {
        return this.type == 2;
    }

    public boolean isSemiGenericURI() {
        return this.type == 1;
    }

    public URL toURL() throws MalformedURLException {
        String str;
        URL url = this.url;
        if (url != null) {
            return url;
        }
        if (this.opaque != null) {
            URL url2 = new URL(this.scheme + ":" + this.opaque);
            this.url = url2;
            return url2;
        }
        String str2 = this.userinfo;
        if (str2 != null && this.host != null) {
            str = this.userinfo + "@" + this.host;
        } else if (str2 != null) {
            str = this.userinfo + "@";
        } else {
            str = this.host;
        }
        StringBuffer stringBuffer = new StringBuffer(100);
        a(stringBuffer, true, true, false);
        URL url3 = new URL(this.scheme, str, this.port, stringBuffer.toString());
        this.url = url3;
        return url3;
    }

    private final void a(StringBuffer stringBuffer, boolean z, boolean z2, boolean z3) {
        String str = this.path;
        if ((str == null || str.length() == 0) && z) {
            stringBuffer.append('/');
        }
        String strA = this.path;
        if (strA != null) {
            if (z3) {
                strA = a(strA, resvdPathChar);
            }
            stringBuffer.append(strA);
        }
        if (this.query != null) {
            stringBuffer.append('?');
            String strA2 = this.query;
            if (z3) {
                strA2 = a(strA2, resvdQueryChar);
            }
            stringBuffer.append(strA2);
        }
        if (this.fragment != null) {
            stringBuffer.append('#');
            String strA3 = this.fragment;
            if (z3) {
                strA3 = a(strA3, (BitSet) null);
            }
            stringBuffer.append(strA3);
        }
    }

    private final String a(boolean z) {
        StringBuffer stringBuffer = new StringBuffer(100);
        String strA = this.scheme;
        if (strA != null) {
            if (z) {
                strA = a(strA, resvdSchemeChar);
            }
            stringBuffer.append(strA);
            stringBuffer.append(':');
        }
        String strA2 = this.opaque;
        if (strA2 != null) {
            if (z) {
                strA2 = a(strA2, (BitSet) null);
            }
            stringBuffer.append(strA2);
            return stringBuffer.toString();
        }
        if (this.userinfo != null || this.host != null || this.port != -1) {
            stringBuffer.append("//");
        }
        String strA3 = this.userinfo;
        if (strA3 != null) {
            if (z) {
                strA3 = a(strA3, resvdUIChar);
            }
            stringBuffer.append(strA3);
            stringBuffer.append('@');
        }
        String str = this.host;
        if (str != null) {
            if (str.indexOf(58) < 0) {
                String strA4 = this.host;
                if (z) {
                    strA4 = a(strA4, resvdHostChar);
                }
                stringBuffer.append(strA4);
            } else {
                stringBuffer.append('[');
                stringBuffer.append(this.host);
                stringBuffer.append(']');
            }
        }
        if (this.port != -1) {
            stringBuffer.append(':');
            stringBuffer.append(this.port);
        }
        a(stringBuffer, false, true, z);
        return stringBuffer.toString();
    }

    public String toExternalForm() {
        return a(false);
    }

    public String toString() {
        return a(true);
    }

    public boolean equals(Object obj) {
        String str;
        if (obj instanceof URI) {
            URI uri = (URI) obj;
            return this.scheme.equals(uri.scheme) && ((this.type == 0 && b(this.opaque, uri.opaque)) || ((this.type == 1 && b(this.userinfo, uri.userinfo) && c(this.host, uri.host) && this.port == uri.port && b(this.path, uri.path)) || (this.type == 2 && b(this.userinfo, uri.userinfo) && c(this.host, uri.host) && this.port == uri.port && d(this.path, uri.path) && b(this.query, uri.query) && b(this.fragment, uri.fragment))));
        }
        if (obj instanceof URL) {
            URL url = (URL) obj;
            if (this.userinfo != null) {
                str = this.userinfo + "@" + this.host;
            } else {
                str = this.host;
            }
            String pathAndQuery = getPathAndQuery();
            if (this.scheme.equalsIgnoreCase(url.getProtocol()) && ((this.type == 0 && this.opaque.equals(url.getFile())) || ((this.type == 1 && c(str, url.getHost()) && ((this.port == url.getPort() || url.getPort() == defaultPort(this.scheme)) && b(pathAndQuery, url.getFile()))) || (this.type == 2 && c(str, url.getHost()) && ((this.port == url.getPort() || url.getPort() == defaultPort(this.scheme)) && d(pathAndQuery, url.getFile()) && b(this.fragment, url.getRef())))))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2) || a(str, (BitSet) null).equals(a(str2, (BitSet) null));
    }

    private static final boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2) || a(str, (BitSet) null).equalsIgnoreCase(a(str2, (BitSet) null));
    }

    private static final boolean d(String str, String str2) {
        char cCharAt;
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (str.equals(str2)) {
                return true;
            }
            int length = str.length();
            int length2 = str2.length();
            int i = 0;
            int i2 = 0;
            while (i < length && i2 < length2) {
                int i3 = i;
                while (i3 < length && (cCharAt = str.charAt(i3)) != '/' && cCharAt != ';') {
                    i3++;
                }
                int i4 = i2;
                while (i4 < length2) {
                    char cCharAt2 = str2.charAt(i4);
                    if (cCharAt2 == '/' || cCharAt2 == ';') {
                        break;
                    }
                    i4++;
                }
                if ((i3 == length && i4 < length2) || ((i4 == length2 && i3 < length) || (i3 < length && i4 < length2 && str.charAt(i3) != str2.charAt(i4)))) {
                    return false;
                }
                int i5 = i3 - i;
                if ((!str.regionMatches(i, str2, i2, i5) || i5 != i4 - i2) && !a(str.substring(i, i3), (BitSet) null).equals(a(str2.substring(i2, i4), (BitSet) null))) {
                    return false;
                }
                i = i3 + 1;
                i2 = i4 + 1;
            }
            if (i == length && i2 == length2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        if (this.a == -1) {
            String str = this.scheme;
            int iHashCode2 = str != null ? a(str, (BitSet) null).hashCode() : 0;
            if (this.type == 0) {
                String str2 = this.opaque;
                iHashCode = (str2 != null ? a(str2, (BitSet) null).hashCode() : 0) * 7;
            } else {
                String str3 = this.host;
                int iHashCode3 = str3 != null ? a(str3, (BitSet) null).toLowerCase().hashCode() : 0;
                String str4 = this.path;
                int iHashCode4 = str4 != null ? a(str4, (BitSet) null).hashCode() : 0;
                String str5 = this.query;
                iHashCode = ((str5 != null ? a(str5, (BitSet) null).hashCode() : 0) * 17) + (iHashCode3 * 7) + (iHashCode4 * 13);
            }
            this.a = iHashCode2 + iHashCode;
        }
        return this.a;
    }

    public static String escape(String str, BitSet bitSet, boolean z) {
        return new String(escape(str.toCharArray(), bitSet, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static char[] escape(char[] cArr, BitSet bitSet, boolean z) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < cArr.length; i5++) {
            if (!bitSet.get(cArr[i5])) {
                int i6 = i4 + 2;
                if (z) {
                    char c = cArr[i5];
                    if (c >= 128) {
                        i6 = i4 + 5;
                    }
                    if (c >= 2048) {
                        i6 += 3;
                    }
                    i4 = i6;
                    if ((c & 64512) == 55296 && (i2 = i5 + 1) < cArr.length && (cArr[i2] & 64512) == 56320) {
                        i4 -= 6;
                    }
                } else {
                    i4 = i6;
                }
            }
        }
        if (i4 == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length + i4];
        int iA = 0;
        while (i3 < cArr.length) {
            char c2 = cArr[i3];
            if (bitSet.get(c2)) {
                cArr2[iA] = c2;
                iA++;
            } else if (!z || c2 <= 127) {
                iA = a(cArr2, iA, c2);
            } else if (c2 <= 2047) {
                iA = a(cArr2, a(cArr2, iA, ((c2 >> 6) & 31) | 192), (c2 & '?') | 128);
            } else if ((c2 & 64512) != 55296 || (i = i3 + 1) >= cArr.length) {
                iA = a(cArr2, a(cArr2, a(cArr2, iA, ((c2 >> '\f') & 15) | 224), ((c2 >> 6) & 63) | 128), (c2 & '?') | 128);
            } else {
                char c3 = cArr[i];
                if ((c3 & 64512) == 56320) {
                    int i7 = (((c2 & 1023) << 10) | (c3 & 1023)) + 65536;
                    iA = a(cArr2, a(cArr2, a(cArr2, a(cArr2, iA, ((i7 >> 18) & 7) | 240), ((i7 >> 12) & 63) | 128), ((i7 >> 6) & 63) | 128), (i7 & 63) | 128);
                    i3 = i;
                }
            }
            i3++;
        }
        return cArr2;
    }

    private static final int a(char[] cArr, int i, int i2) {
        cArr[i] = '%';
        char[] cArr2 = b;
        cArr[i + 1] = cArr2[(i2 >> 4) & 15];
        cArr[i + 2] = cArr2[i2 & 15];
        return i + 3;
    }

    public static final String unescape(String str, BitSet bitSet) throws NumberFormatException, ParseException {
        int i;
        int i2;
        char[] cArr;
        char[] cArr2;
        int i3;
        int iA;
        int i4;
        int i5;
        char[] cArr3;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        char[] cArr4;
        if (str == null) {
            return str;
        }
        char c2 = '%';
        if (str.indexOf(37) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] cArr5 = new char[charArray.length];
        int i10 = 4;
        char[] cArr6 = new char[4];
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int iA2 = 0;
        while (i13 < charArray.length) {
            char c3 = charArray[i13];
            if (c3 == c2) {
                int i15 = i13 + 3;
                try {
                } catch (NumberFormatException unused) {
                    i4 = charArray[i13];
                }
                if (i15 > charArray.length) {
                    throw new NumberFormatException();
                }
                int i16 = Integer.parseInt(str.substring(i13 + 1, i15), 16);
                if (i16 < 0) {
                    throw new NumberFormatException();
                }
                i13 += 2;
                i4 = i16;
                int i17 = i4;
                int i18 = i13;
                if (i12 <= 0) {
                    int i19 = i14;
                    i2 = i11;
                    cArr = cArr6;
                    i5 = i10;
                    cArr3 = cArr5;
                    int i20 = i17 & 224;
                    if (i20 == 192 || (i17 & 240) == 224 || (i17 & 248) == 240) {
                        int i21 = i20 == 192 ? 2 : (i17 & 240) == 224 ? 3 : i5;
                        cArr[i2] = (char) i17;
                        i12 = i21;
                        i6 = 1;
                    } else if (bitSet != null && bitSet.get(i17)) {
                        cArr3[iA2] = charArray[i18];
                        iA2++;
                        cArr2 = cArr3;
                        i3 = i5;
                        i14 = i19;
                        i13 = i18 - 2;
                    } else {
                        cArr3[iA2] = (char) i17;
                        iA2++;
                        i6 = i19;
                    }
                    cArr2 = cArr3;
                    i3 = i5;
                    i13 = i18;
                    i14 = i6;
                } else if ((i17 & 192) != 128) {
                    iA2 = a(cArr6, i14, i17, cArr5, iA2, bitSet, false);
                    i14 = i14;
                    i2 = i11;
                    cArr = cArr6;
                    cArr2 = cArr5;
                    i13 = i18;
                    i12 = -1;
                    i3 = i10;
                } else {
                    i = i14;
                    if (i == i12 - 1) {
                        char c4 = cArr6[i11];
                        if ((c4 & 224) == 192) {
                            i8 = (c4 & 31) << 6;
                        } else {
                            if ((c4 & 240) == 224) {
                                i7 = (c4 & 15) << 12;
                                c = cArr6[1];
                            } else {
                                i7 = ((c4 & 7) << 18) | ((cArr6[1] & '?') << 12);
                                c = cArr6[2];
                            }
                            i8 = i7 | ((c & '?') << 6);
                        }
                        int i22 = i8 | (i17 & 63);
                        if (bitSet == null || !bitSet.get(i22)) {
                            i2 = i11;
                            cArr = cArr6;
                            i9 = i10;
                            cArr4 = cArr5;
                            if (i12 < i9) {
                                iA = iA2 + 1;
                                cArr4[iA2] = (char) i22;
                            } else {
                                int i23 = i22 - 65536;
                                cArr4[iA2] = (char) ((i23 >> 10) | 55296);
                                cArr4[iA2 + 1] = (char) ((i23 & 1023) | 56320);
                                iA = iA2 + 2;
                            }
                        } else {
                            i2 = i11;
                            cArr = cArr6;
                            i9 = i10;
                            cArr4 = cArr5;
                            iA = a(cArr6, i, i22, cArr5, iA2, null, true);
                        }
                        cArr2 = cArr4;
                        i3 = i9;
                        i13 = i18;
                        iA2 = iA;
                        i14 = i;
                        i12 = -1;
                    } else {
                        i2 = i11;
                        cArr = cArr6;
                        i5 = i10;
                        cArr3 = cArr5;
                        cArr[i] = (char) i17;
                        i6 = i + 1;
                        cArr2 = cArr3;
                        i3 = i5;
                        i13 = i18;
                        i14 = i6;
                    }
                }
            } else {
                i = i14;
                i2 = i11;
                cArr = cArr6;
                int i24 = i10;
                cArr2 = cArr5;
                if (i12 > 0) {
                    i3 = i24;
                    iA = a(cArr, i, c3, cArr2, iA2, bitSet, false);
                    i13 = i13;
                    iA2 = iA;
                    i14 = i;
                    i12 = -1;
                } else {
                    i3 = i24;
                    cArr2[iA2] = c3;
                    iA2++;
                    i14 = i;
                }
            }
            i13++;
            i10 = i3;
            cArr6 = cArr;
            cArr5 = cArr2;
            i11 = i2;
            c2 = '%';
        }
        int i25 = i14;
        int i26 = i11;
        char[] cArr7 = cArr6;
        char[] cArr8 = cArr5;
        if (i12 > 0) {
            iA2 = a(cArr7, i25, -1, cArr8, iA2, bitSet, false);
        }
        return new String(cArr8, i26, iA2);
    }

    private static final int a(char[] cArr, int i, int i2, char[] cArr2, int i3, BitSet bitSet, boolean z) {
        if (i2 >= 0) {
            cArr[i] = (char) i2;
            i++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if ((bitSet != null && bitSet.get(cArr[i4])) || z) {
                i3 = a(cArr2, i3, cArr[i4]);
            } else {
                cArr2[i3] = cArr[i4];
                i3++;
            }
        }
        return i3;
    }

    private static final String a(String str, BitSet bitSet) {
        try {
            return unescape(str, bitSet);
        } catch (ParseException unused) {
            return str;
        }
    }
}
