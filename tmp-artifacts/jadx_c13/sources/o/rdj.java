package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import javax.annotation.Nullable;
import kotlin.jvm.internal.CharCompanionObject;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class rdj {
    private int IAuthTabCallback;

    @Nullable
    private String IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int access000;
    private Reader access100;

    @Nullable
    private ArrayList<Integer> asBinder;
    private int asInterface;
    private String[] getInterfaceDescriptor;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private boolean onTransact;
    private char[] onWarmupCompleted;

    public rdj(Reader reader, int i) throws IOException {
        this.IAuthTabCallback = -1;
        this.getInterfaceDescriptor = new String[Imgcodecs.IMWRITE_AVIF_QUALITY];
        this.asBinder = null;
        this.IAuthTabCallbackStub = 1;
        oas.onExtraCallback(reader);
        oas.onExtraCallback(reader.markSupported());
        this.access100 = reader;
        this.onWarmupCompleted = new char[Math.min(i, 32768)];
        ICustomTabsCallbackStub();
    }

    public rdj(Reader reader) {
        this(reader, 32768);
    }

    public rdj(String str) {
        this(new StringReader(str), str.length());
    }

    public void onExtraCallback() {
        Reader reader = this.access100;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.access100 = null;
            this.onWarmupCompleted = null;
            this.getInterfaceDescriptor = null;
            throw th;
        }
        this.access100 = null;
        this.onWarmupCompleted = null;
        this.getInterfaceDescriptor = null;
    }

    private void ICustomTabsCallbackStub() throws IOException {
        int i;
        int i2;
        if (this.onTransact || (i = this.onExtraCallback) < this.onExtraCallbackWithResult) {
            return;
        }
        int i3 = this.IAuthTabCallback;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.access100.skip(j);
            this.access100.mark(32768);
            int i4 = 0;
            while (true) {
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.access100;
                char[] cArr = this.onWarmupCompleted;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.onTransact = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.access100.reset();
            if (i4 > 0) {
                oas.onExtraCallback(jSkip == j);
                this.onNavigationEvent = i4;
                this.access000 += i;
                this.onExtraCallback = i2;
                if (this.IAuthTabCallback != -1) {
                    this.IAuthTabCallback = 0;
                }
                this.onExtraCallbackWithResult = Math.min(i4, 24576);
            }
            onUnminimized();
            this.IAuthTabCallbackDefault = null;
        } catch (IOException e) {
            throw new mnf(e);
        }
    }

    public int onActivityResized() {
        return this.access000 + this.onExtraCallback;
    }

    public void onExtraCallbackWithResult(boolean z) {
        if (z && this.asBinder == null) {
            this.asBinder = new ArrayList<>(409);
            onUnminimized();
        } else {
            if (z) {
                return;
            }
            this.asBinder = null;
        }
    }

    public boolean extraCallbackWithResult() {
        return this.asBinder != null;
    }

    public int writeTypedObject() {
        if (!extraCallbackWithResult()) {
            return 1;
        }
        int iICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        if (iICustomTabsCallbackStubProxy == -1) {
            return this.IAuthTabCallbackStub;
        }
        if (iICustomTabsCallbackStubProxy < 0) {
            return (Math.abs(iICustomTabsCallbackStubProxy) + this.IAuthTabCallbackStub) - 1;
        }
        return iICustomTabsCallbackStubProxy + this.IAuthTabCallbackStub + 1;
    }

    int onExtraCallbackWithResult() {
        int iICustomTabsCallbackStubProxy;
        if (!extraCallbackWithResult() || (iICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy()) == -1) {
            int iOnActivityResized = onActivityResized();
            return iOnActivityResized + 1;
        }
        if (iICustomTabsCallbackStubProxy < 0) {
            iICustomTabsCallbackStubProxy = Math.abs(iICustomTabsCallbackStubProxy) - 2;
        }
        return (onActivityResized() - this.asBinder.get(iICustomTabsCallbackStubProxy).intValue()) + 1;
    }

    String IAuthTabCallback_Parcel() {
        return writeTypedObject() + ":" + onExtraCallbackWithResult();
    }

    private int ICustomTabsCallbackStubProxy() {
        if (extraCallbackWithResult()) {
            return Collections.binarySearch(this.asBinder, Integer.valueOf(onActivityResized()));
        }
        return 0;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    private void onUnminimized() {
        /*
            r3 = this;
            boolean r0 = r3.extraCallbackWithResult()
            if (r0 == 0) goto L63
            int r0 = r3.IAuthTabCallbackStub
            java.util.ArrayList<java.lang.Integer> r1 = r3.asBinder
            int r1 = r1.size()
            int r0 = r0 + r1
            r3.IAuthTabCallbackStub = r0
            java.util.ArrayList<java.lang.Integer> r0 = r3.asBinder
            int r0 = r0.size()
            r1 = -1
            if (r0 <= 0) goto L2d
            java.util.ArrayList<java.lang.Integer> r0 = r3.asBinder
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L2e
        L2d:
            r0 = r1
        L2e:
            java.util.ArrayList<java.lang.Integer> r2 = r3.asBinder
            r2.clear()
            if (r0 == r1) goto L44
            java.util.ArrayList<java.lang.Integer> r1 = r3.asBinder
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            int r0 = r3.IAuthTabCallbackStub
            int r0 = r0 + (-1)
            r3.IAuthTabCallbackStub = r0
        L44:
            int r0 = r3.onExtraCallback
        L46:
            int r1 = r3.onNavigationEvent
            if (r0 >= r1) goto L63
            char[] r1 = r3.onWarmupCompleted
            char r1 = r1[r0]
            r2 = 10
            if (r1 != r2) goto L60
            java.util.ArrayList<java.lang.Integer> r1 = r3.asBinder
            int r2 = r3.access000
            int r2 = r2 + 1
            int r2 = r2 + r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
        L60:
            int r0 = r0 + 1
            goto L46
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rdj.onUnminimized():void");
    }

    public boolean access000() throws IOException {
        ICustomTabsCallbackStub();
        return this.onExtraCallback >= this.onNavigationEvent;
    }

    private boolean ICustomTabsCallbackDefault() {
        return this.onExtraCallback >= this.onNavigationEvent;
    }

    public char IAuthTabCallbackStubProxy() throws IOException {
        ICustomTabsCallbackStub();
        return ICustomTabsCallbackDefault() ? CharCompanionObject.MAX_VALUE : this.onWarmupCompleted[this.onExtraCallback];
    }

    char onNavigationEvent() throws IOException {
        ICustomTabsCallbackStub();
        char c = ICustomTabsCallbackDefault() ? CharCompanionObject.MAX_VALUE : this.onWarmupCompleted[this.onExtraCallback];
        this.onExtraCallback++;
        return c;
    }

    void onMessageChannelReady() {
        int i = this.onExtraCallback;
        if (i <= 0) {
            throw new mnf(new IOException("WTF: No buffer left to unconsume."));
        }
        this.onExtraCallback = i - 1;
    }

    public void IAuthTabCallback() {
        this.onExtraCallback++;
    }

    void readTypedObject() throws IOException {
        if (this.onNavigationEvent - this.onExtraCallback < 1024) {
            this.onExtraCallbackWithResult = 0;
        }
        ICustomTabsCallbackStub();
        this.IAuthTabCallback = this.onExtraCallback;
    }

    void onMinimized() {
        this.IAuthTabCallback = -1;
    }

    void onActivityLayout() {
        int i = this.IAuthTabCallback;
        if (i == -1) {
            throw new mnf(new IOException("Mark invalid"));
        }
        this.onExtraCallback = i;
        onMinimized();
    }

    int onExtraCallback(char c) throws IOException {
        ICustomTabsCallbackStub();
        for (int i = this.onExtraCallback; i < this.onNavigationEvent; i++) {
            if (c == this.onWarmupCompleted[i]) {
                return i - this.onExtraCallback;
            }
        }
        return -1;
    }

    int IAuthTabCallback(CharSequence charSequence) throws IOException {
        ICustomTabsCallbackStub();
        char cCharAt = charSequence.charAt(0);
        int i = this.onExtraCallback;
        while (i < this.onNavigationEvent) {
            if (cCharAt != this.onWarmupCompleted[i]) {
                do {
                    i++;
                    if (i >= this.onNavigationEvent) {
                        break;
                    }
                } while (cCharAt != this.onWarmupCompleted[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.onNavigationEvent;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.onWarmupCompleted[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.onExtraCallback;
                }
            }
            i = i2;
        }
        return -1;
    }

    public String IAuthTabCallback(char c) throws IOException {
        int iOnExtraCallback = onExtraCallback(c);
        if (iOnExtraCallback != -1) {
            String strOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, this.onExtraCallback, iOnExtraCallback);
            this.onExtraCallback += iOnExtraCallback;
            return strOnWarmupCompleted;
        }
        return getInterfaceDescriptor();
    }

    String onNavigationEvent(String str) throws IOException {
        int iIAuthTabCallback = IAuthTabCallback((CharSequence) str);
        if (iIAuthTabCallback != -1) {
            String strOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, this.onExtraCallback, iIAuthTabCallback);
            this.onExtraCallback += iIAuthTabCallback;
            return strOnWarmupCompleted;
        }
        if (this.onNavigationEvent - this.onExtraCallback < str.length()) {
            return getInterfaceDescriptor();
        }
        int length = (this.onNavigationEvent - str.length()) + 1;
        char[] cArr = this.onWarmupCompleted;
        String[] strArr = this.getInterfaceDescriptor;
        int i = this.onExtraCallback;
        String strOnWarmupCompleted2 = onWarmupCompleted(cArr, strArr, i, length - i);
        this.onExtraCallback = length;
        return strOnWarmupCompleted2;
    }

    public String IAuthTabCallback(char... cArr) throws IOException {
        ICustomTabsCallbackStub();
        int i = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        char[] cArr2 = this.onWarmupCompleted;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.onExtraCallback = i3;
        return i3 > i ? onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, i3 - i) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    String onWarmupCompleted(char... cArr) throws IOException {
        ICustomTabsCallbackStub();
        int i = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        char[] cArr2 = this.onWarmupCompleted;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.onExtraCallback = i3;
        return i3 > i ? onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, i3 - i) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    String onWarmupCompleted() {
        int i = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        char[] cArr = this.onWarmupCompleted;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.onExtraCallback = i3;
        return i3 > i ? onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, i3 - i) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    String onWarmupCompleted(boolean z) {
        int i = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        char[] cArr = this.onWarmupCompleted;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c != 0) {
                if (c != '\"') {
                    if (c != '&') {
                        if (c == '\'') {
                            if (z) {
                                break;
                            }
                        } else {
                            continue;
                            i3++;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        this.onExtraCallback = i3;
        return i3 > i ? onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, i3 - i) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    String onTransact() {
        int i = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        char[] cArr = this.onWarmupCompleted;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.onExtraCallback = i3;
        return i3 > i ? onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, i3 - i) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    String access100() throws IOException {
        ICustomTabsCallbackStub();
        int i = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        char[] cArr = this.onWarmupCompleted;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.onExtraCallback = i3;
        return i3 > i ? onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, i3 - i) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    String getInterfaceDescriptor() throws IOException {
        ICustomTabsCallbackStub();
        char[] cArr = this.onWarmupCompleted;
        String[] strArr = this.getInterfaceDescriptor;
        int i = this.onExtraCallback;
        String strOnWarmupCompleted = onWarmupCompleted(cArr, strArr, i, this.onNavigationEvent - i);
        this.onExtraCallback = this.onNavigationEvent;
        return strOnWarmupCompleted;
    }

    String IAuthTabCallbackStub() throws IOException {
        char c;
        ICustomTabsCallbackStub();
        int i = this.onExtraCallback;
        while (true) {
            int i2 = this.onExtraCallback;
            if (i2 >= this.onNavigationEvent || (((c = this.onWarmupCompleted[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.onExtraCallback++;
        }
        return onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, this.onExtraCallback - i);
    }

    String asBinder() throws IOException {
        char c;
        ICustomTabsCallbackStub();
        int i = this.onExtraCallback;
        while (true) {
            int i2 = this.onExtraCallback;
            if (i2 >= this.onNavigationEvent || (((c = this.onWarmupCompleted[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.onExtraCallback++;
        }
        while (!ICustomTabsCallbackDefault()) {
            char[] cArr = this.onWarmupCompleted;
            int i3 = this.onExtraCallback;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.onExtraCallback = i3 + 1;
        }
        return onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i, this.onExtraCallback - i);
    }

    String IAuthTabCallbackDefault() throws IOException {
        int i;
        char c;
        ICustomTabsCallbackStub();
        int i2 = this.onExtraCallback;
        while (true) {
            i = this.onExtraCallback;
            if (i >= this.onNavigationEvent || (((c = this.onWarmupCompleted[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.onExtraCallback = i + 1;
        }
        return onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i2, i - i2);
    }

    String asInterface() throws IOException {
        int i;
        char c;
        ICustomTabsCallbackStub();
        int i2 = this.onExtraCallback;
        while (true) {
            i = this.onExtraCallback;
            if (i >= this.onNavigationEvent || (c = this.onWarmupCompleted[i]) < '0' || c > '9') {
                break;
            }
            this.onExtraCallback = i + 1;
        }
        return onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, i2, i - i2);
    }

    boolean onWarmupCompleted(char c) {
        return !access000() && this.onWarmupCompleted[this.onExtraCallback] == c;
    }

    boolean onExtraCallback(String str) throws IOException {
        ICustomTabsCallbackStub();
        int length = str.length();
        if (length > this.onNavigationEvent - this.onExtraCallback) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.onWarmupCompleted[this.onExtraCallback + i]) {
                return false;
            }
        }
        return true;
    }

    boolean IAuthTabCallbackStub(String str) throws IOException {
        ICustomTabsCallbackStub();
        int length = str.length();
        if (length > this.onNavigationEvent - this.onExtraCallback) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.onWarmupCompleted[this.onExtraCallback + i])) {
                return false;
            }
        }
        return true;
    }

    boolean onNavigationEvent(char... cArr) throws IOException {
        if (access000()) {
            return false;
        }
        ICustomTabsCallbackStub();
        char c = this.onWarmupCompleted[this.onExtraCallback];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    boolean onExtraCallback(char[] cArr) throws IOException {
        ICustomTabsCallbackStub();
        return !access000() && Arrays.binarySearch(cArr, this.onWarmupCompleted[this.onExtraCallback]) >= 0;
    }

    boolean onPostMessage() {
        if (access000()) {
            return false;
        }
        char c = this.onWarmupCompleted[this.onExtraCallback];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    boolean ICustomTabsCallback() {
        if (access000()) {
            return false;
        }
        char c = this.onWarmupCompleted[this.onExtraCallback];
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    boolean extraCallback() {
        char c;
        return !access000() && (c = this.onWarmupCompleted[this.onExtraCallback]) >= '0' && c <= '9';
    }

    boolean onWarmupCompleted(String str) throws IOException {
        ICustomTabsCallbackStub();
        if (!onExtraCallback(str)) {
            return false;
        }
        this.onExtraCallback += str.length();
        return true;
    }

    boolean onExtraCallbackWithResult(String str) {
        if (!IAuthTabCallbackStub(str)) {
            return false;
        }
        this.onExtraCallback += str.length();
        return true;
    }

    boolean IAuthTabCallback(String str) throws IOException {
        if (str.equals(this.IAuthTabCallbackDefault)) {
            int i = this.asInterface;
            if (i == -1) {
                return false;
            }
            if (i >= this.onExtraCallback) {
                return true;
            }
        }
        this.IAuthTabCallbackDefault = str;
        Locale locale = Locale.ENGLISH;
        int iIAuthTabCallback = IAuthTabCallback((CharSequence) str.toLowerCase(locale));
        if (iIAuthTabCallback >= 0) {
            this.asInterface = this.onExtraCallback + iIAuthTabCallback;
            return true;
        }
        int iIAuthTabCallback2 = IAuthTabCallback((CharSequence) str.toUpperCase(locale));
        boolean z = iIAuthTabCallback2 >= 0;
        this.asInterface = z ? this.onExtraCallback + iIAuthTabCallback2 : -1;
        return z;
    }

    public String toString() {
        int i = this.onNavigationEvent;
        int i2 = this.onExtraCallback;
        int i3 = i - i2;
        if (i3 < 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return new String(this.onWarmupCompleted, i2, i3);
    }

    private static String onWarmupCompleted(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 <= 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & 511;
        String str = strArr[i5];
        if (str != null && IAuthTabCallback(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    static boolean IAuthTabCallback(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (i2 != 0) {
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i++;
            i2--;
            i3++;
        }
        return true;
    }
}
