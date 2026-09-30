package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getBeforeTimestamp {
    public final setWebView IAuthTabCallback = new setWebView();
    private StringBuilder onExtraCallback = new StringBuilder();
    private String onNavigationEvent;
    public int onWarmupCompleted;

    public abstract String IAuthTabCallback();

    public abstract String IAuthTabCallback(@NotNull String str, boolean z);

    public final boolean IAuthTabCallback(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public void IAuthTabCallbackStubProxy() {
    }

    public abstract int extraCallback();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract CharSequence getInterfaceDescriptor();

    public abstract byte onExtraCallback();

    public abstract void onExtraCallback(char c);

    public abstract int onNavigationEvent(int i);

    public abstract boolean onWarmupCompleted();

    public final boolean extraCallbackWithResult() {
        int iExtraCallback = extraCallback();
        CharSequence interfaceDescriptor = getInterfaceDescriptor();
        if (iExtraCallback >= interfaceDescriptor.length() || iExtraCallback == -1 || interfaceDescriptor.charAt(iExtraCallback) != ',') {
            return false;
        }
        this.onWarmupCompleted++;
        return true;
    }

    public final void access100() {
        if (onExtraCallback() == 10) {
            return;
        }
        onExtraCallbackWithResult(this, "Expected EOF after parsing, but had " + getInterfaceDescriptor().charAt(this.onWarmupCompleted - 1) + " instead", 0, null, 6, null);
        throw new setWrite();
    }

    public final StringBuilder access000() {
        return this.onExtraCallback;
    }

    public final byte onNavigationEvent(byte b) {
        byte bOnExtraCallback = onExtraCallback();
        if (bOnExtraCallback == b) {
            return bOnExtraCallback;
        }
        String strOnWarmupCompleted = getRunTime.onWarmupCompleted(b);
        int i = this.onWarmupCompleted;
        int i2 = i - 1;
        onExtraCallbackWithResult(this, "Expected " + strOnWarmupCompleted + ", but had '" + ((i == getInterfaceDescriptor().length() || i2 < 0) ? "EOF" : String.valueOf(getInterfaceDescriptor().charAt(i2))) + "' instead", i2, null, 4, null);
        throw new setWrite();
    }

    public final void onWarmupCompleted(char c) {
        int i = this.onWarmupCompleted;
        if (i > 0 && c == '\"') {
            try {
                this.onWarmupCompleted = i - 1;
                String strOnTransact = onTransact();
                this.onWarmupCompleted = i;
                if (Intrinsics.areEqual(strOnTransact, "null")) {
                    onNavigationEvent("Expected string literal but 'null' literal was found", this.onWarmupCompleted - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new setWrite();
                }
            } catch (Throwable th) {
                this.onWarmupCompleted = i;
                throw th;
            }
        }
        String strOnWarmupCompleted = getRunTime.onWarmupCompleted(getRunTime.onExtraCallback(c));
        int i2 = this.onWarmupCompleted;
        int i3 = i2 - 1;
        onExtraCallbackWithResult(this, "Expected " + strOnWarmupCompleted + ", but had '" + ((i2 == getInterfaceDescriptor().length() || i3 < 0) ? "EOF" : String.valueOf(getInterfaceDescriptor().charAt(i3))) + "' instead", i3, null, 4, null);
        throw new setWrite();
    }

    public byte IAuthTabCallback_Parcel() {
        CharSequence interfaceDescriptor = getInterfaceDescriptor();
        int i = this.onWarmupCompleted;
        while (true) {
            int iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent != -1) {
                char cCharAt = interfaceDescriptor.charAt(iOnNavigationEvent);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    this.onWarmupCompleted = iOnNavigationEvent;
                    return getRunTime.onExtraCallback(cCharAt);
                }
                i = iOnNavigationEvent + 1;
            } else {
                this.onWarmupCompleted = iOnNavigationEvent;
                return (byte) 10;
            }
        }
    }

    public static /* synthetic */ boolean onExtraCallback(getBeforeTimestamp getbeforetimestamp, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return getbeforetimestamp.IAuthTabCallback(z);
    }

    public final boolean IAuthTabCallback(boolean z) {
        int iOnNavigationEvent = onNavigationEvent(extraCallback());
        int length = getInterfaceDescriptor().length() - iOnNavigationEvent;
        if (length < 4 || iOnNavigationEvent == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != getInterfaceDescriptor().charAt(iOnNavigationEvent + i)) {
                return false;
            }
        }
        if (length > 4 && getRunTime.onExtraCallback(getInterfaceDescriptor().charAt(iOnNavigationEvent + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.onWarmupCompleted = iOnNavigationEvent + 4;
        return true;
    }

    public final String onWarmupCompleted(boolean z) {
        String strAsBinder;
        byte bIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        if (z) {
            if (bIAuthTabCallback_Parcel != 1 && bIAuthTabCallback_Parcel != 0) {
                return null;
            }
            strAsBinder = onTransact();
        } else {
            if (bIAuthTabCallback_Parcel != 1) {
                return null;
            }
            strAsBinder = asBinder();
        }
        this.onNavigationEvent = strAsBinder;
        return strAsBinder;
    }

    public final void asInterface() {
        this.onNavigationEvent = null;
    }

    public int onExtraCallbackWithResult(char c, int i) {
        return StringsKt__StringsKt.indexOf$default(getInterfaceDescriptor(), c, i, false, 4, (Object) null);
    }

    public String onWarmupCompleted(int i, int i2) {
        return getInterfaceDescriptor().subSequence(i, i2).toString();
    }

    public final String asBinder() {
        if (this.onNavigationEvent != null) {
            return writeTypedObject();
        }
        return IAuthTabCallback();
    }

    public final String IAuthTabCallback(@NotNull CharSequence charSequence, int i, int i2) {
        String strIAuthTabCallback;
        int iOnNavigationEvent;
        Intrinsics.checkNotNullParameter(charSequence, "");
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iOnNavigationEvent = onNavigationEvent(onExtraCallback(i, i2));
                if (iOnNavigationEvent == -1) {
                    onExtraCallbackWithResult(this, "Unexpected EOF", iOnNavigationEvent, null, 4, null);
                    throw new setWrite();
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    onNavigationEvent(i, i2);
                    iOnNavigationEvent = onNavigationEvent(i2);
                    if (iOnNavigationEvent == -1) {
                        onExtraCallbackWithResult(this, "Unexpected EOF", iOnNavigationEvent, null, 4, null);
                        throw new setWrite();
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            z = true;
            i = iOnNavigationEvent;
            i2 = i;
            cCharAt = charSequence.charAt(i2);
        }
        if (!z) {
            strIAuthTabCallback = onWarmupCompleted(i, i2);
        } else {
            strIAuthTabCallback = IAuthTabCallback(i, i2);
        }
        this.onWarmupCompleted = i2 + 1;
        return strIAuthTabCallback;
    }

    private final int onExtraCallback(int i, int i2) {
        onNavigationEvent(i, i2);
        return onWarmupCompleted(i2 + 1);
    }

    private final String IAuthTabCallback(int i, int i2) {
        onNavigationEvent(i, i2);
        String string = this.onExtraCallback.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.onExtraCallback.setLength(0);
        return string;
    }

    private final String writeTypedObject() {
        String str = this.onNavigationEvent;
        Intrinsics.checkNotNull(str);
        this.onNavigationEvent = null;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        String strOnTransact = onTransact();
        if (!Intrinsics.areEqual(strOnTransact, "null") || !readTypedObject()) {
            return strOnTransact;
        }
        onExtraCallbackWithResult(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new setWrite();
    }

    private final boolean readTypedObject() {
        return getInterfaceDescriptor().charAt(this.onWarmupCompleted - 1) != '\"';
    }

    public final String onTransact() {
        String strIAuthTabCallback;
        if (this.onNavigationEvent != null) {
            return writeTypedObject();
        }
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= getInterfaceDescriptor().length() || iExtraCallback == -1) {
            onExtraCallbackWithResult(this, "EOF", iExtraCallback, null, 4, null);
            throw new setWrite();
        }
        byte bOnExtraCallback = getRunTime.onExtraCallback(getInterfaceDescriptor().charAt(iExtraCallback));
        if (bOnExtraCallback == 1) {
            return asBinder();
        }
        if (bOnExtraCallback != 0) {
            onExtraCallbackWithResult(this, "Expected beginning of the string, but got " + getInterfaceDescriptor().charAt(iExtraCallback), 0, null, 6, null);
            throw new setWrite();
        }
        boolean z = false;
        while (getRunTime.onExtraCallback(getInterfaceDescriptor().charAt(iExtraCallback)) == 0) {
            iExtraCallback++;
            if (iExtraCallback >= getInterfaceDescriptor().length()) {
                onNavigationEvent(this.onWarmupCompleted, iExtraCallback);
                int iOnNavigationEvent = onNavigationEvent(iExtraCallback);
                if (iOnNavigationEvent == -1) {
                    this.onWarmupCompleted = iExtraCallback;
                    return IAuthTabCallback(0, 0);
                }
                iExtraCallback = iOnNavigationEvent;
                z = true;
            }
        }
        if (!z) {
            strIAuthTabCallback = onWarmupCompleted(this.onWarmupCompleted, iExtraCallback);
        } else {
            strIAuthTabCallback = IAuthTabCallback(this.onWarmupCompleted, iExtraCallback);
        }
        this.onWarmupCompleted = iExtraCallback;
        return strIAuthTabCallback;
    }

    protected void onNavigationEvent(int i, int i2) {
        this.onExtraCallback.append(getInterfaceDescriptor(), i, i2);
    }

    private final int onWarmupCompleted(int i) {
        int iOnNavigationEvent = onNavigationEvent(i);
        if (iOnNavigationEvent == -1) {
            onExtraCallbackWithResult(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new setWrite();
        }
        int i2 = iOnNavigationEvent + 1;
        char cCharAt = getInterfaceDescriptor().charAt(iOnNavigationEvent);
        if (cCharAt == 'u') {
            return onExtraCallbackWithResult(getInterfaceDescriptor(), i2);
        }
        char cOnWarmupCompleted = getRunTime.onWarmupCompleted(cCharAt);
        if (cOnWarmupCompleted == 0) {
            onExtraCallbackWithResult(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
            throw new setWrite();
        }
        this.onExtraCallback.append(cOnWarmupCompleted);
        return i2;
    }

    private final int onExtraCallbackWithResult(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.onWarmupCompleted = i;
            IAuthTabCallbackStubProxy();
            if (this.onWarmupCompleted + 4 >= charSequence.length()) {
                onExtraCallbackWithResult(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
                throw new setWrite();
            }
            return onExtraCallbackWithResult(charSequence, this.onWarmupCompleted);
        }
        this.onExtraCallback.append((char) ((IAuthTabCallback(charSequence, i) << 12) + (IAuthTabCallback(charSequence, i + 1) << 8) + (IAuthTabCallback(charSequence, i + 2) << 4) + IAuthTabCallback(charSequence, i + 3)));
        return i2;
    }

    private final int IAuthTabCallback(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        onExtraCallbackWithResult(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new setWrite();
    }

    public final void onNavigationEvent(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte bIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        if (bIAuthTabCallback_Parcel != 8 && bIAuthTabCallback_Parcel != 6) {
            onTransact();
            return;
        }
        while (true) {
            byte bIAuthTabCallback_Parcel2 = IAuthTabCallback_Parcel();
            if (bIAuthTabCallback_Parcel2 != 1) {
                if (bIAuthTabCallback_Parcel2 == 8 || bIAuthTabCallback_Parcel2 == 6) {
                    arrayList.add(Byte.valueOf(bIAuthTabCallback_Parcel2));
                } else if (bIAuthTabCallback_Parcel2 == 9) {
                    if (((Number) CollectionsKt___CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw setTouchStateListener.onExtraCallbackWithResult(this.onWarmupCompleted, "found ] instead of } at path: " + this.IAuthTabCallback, getInterfaceDescriptor());
                    }
                    CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
                } else if (bIAuthTabCallback_Parcel2 == 7) {
                    if (((Number) CollectionsKt___CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw setTouchStateListener.onExtraCallbackWithResult(this.onWarmupCompleted, "found } instead of ] at path: " + this.IAuthTabCallback, getInterfaceDescriptor());
                    }
                    CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
                } else if (bIAuthTabCallback_Parcel2 == 10) {
                    onExtraCallbackWithResult(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new setWrite();
                }
                onExtraCallback();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                onTransact();
            } else {
                IAuthTabCallback();
            }
        }
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) getInterfaceDescriptor()) + "', currentPosition=" + this.onWarmupCompleted + ')';
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) onWarmupCompleted(0, this.onWarmupCompleted), str, 0, false, 6, (Object) null);
        throw new JsonDecodingException("Encountered an unknown key '" + str + "' at offset " + iLastIndexOf$default + " at path: " + this.IAuthTabCallback.onExtraCallback() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) setTouchStateListener.IAuthTabCallback(getInterfaceDescriptor(), iLastIndexOf$default)));
    }

    public static /* synthetic */ Void onExtraCallbackWithResult(getBeforeTimestamp getbeforetimestamp, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = getbeforetimestamp.onWarmupCompleted;
        }
        if ((i2 & 4) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return getbeforetimestamp.onNavigationEvent(str, i, str2);
    }

    public final Void onNavigationEvent(@NotNull String str, int i, @NotNull String str2) {
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() != 0) {
            str3 = '\n' + str2;
        }
        throw setTouchStateListener.onExtraCallbackWithResult(i, str + " at path: " + this.IAuthTabCallback.onExtraCallback() + str3, getInterfaceDescriptor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        onExtraCallbackWithResult(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0206, code lost:
    
        throw new o.setWrite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011d, code lost:
    
        onExtraCallbackWithResult(r17, "Unexpected symbol '" + r3 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
    
        throw new o.setWrite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
    
        if (r5 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        if (r0 == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        if (r9 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        if (r0 == (r5 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        if (r1 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if (getInterfaceDescriptor().charAt(r5) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        onExtraCallbackWithResult(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        throw new o.setWrite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        onExtraCallbackWithResult(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        throw new o.setWrite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r17.onWarmupCompleted = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if (r10 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r0 = r11 * onExtraCallbackWithResult(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0192, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        onExtraCallbackWithResult(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        throw new o.setWrite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c9, code lost:
    
        onExtraCallbackWithResult(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
    
        throw new o.setWrite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e1, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        onExtraCallbackWithResult(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        throw new o.setWrite();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onNavigationEvent() {
        boolean z;
        int iOnNavigationEvent = onNavigationEvent(extraCallback());
        if (iOnNavigationEvent >= getInterfaceDescriptor().length() || iOnNavigationEvent == -1) {
            onExtraCallbackWithResult(this, "EOF", 0, null, 6, null);
            throw new setWrite();
        }
        if (getInterfaceDescriptor().charAt(iOnNavigationEvent) == '\"') {
            iOnNavigationEvent++;
            if (iOnNavigationEvent == getInterfaceDescriptor().length()) {
                onExtraCallbackWithResult(this, "EOF", 0, null, 6, null);
                throw new setWrite();
            }
            z = true;
        } else {
            z = false;
        }
        int i = iOnNavigationEvent;
        long j = 0;
        long j2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        loop0: while (true) {
            boolean z4 = false;
            while (i != getInterfaceDescriptor().length()) {
                char cCharAt = getInterfaceDescriptor().charAt(i);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z3) {
                    if (i == iOnNavigationEvent) {
                        onExtraCallbackWithResult(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new setWrite();
                    }
                    i++;
                    z3 = true;
                } else if (cCharAt == '-' && z3) {
                    if (i == iOnNavigationEvent) {
                        onExtraCallbackWithResult(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new setWrite();
                    }
                    i++;
                } else if (cCharAt != '+' || !z3) {
                    if (cCharAt != '-') {
                        if (getRunTime.onExtraCallback(cCharAt) != 0) {
                            break loop0;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            break loop0;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + i2;
                        } else {
                            j = (j * 10) - i2;
                            if (j > 0) {
                                onExtraCallbackWithResult(this, "Numeric value overflow", 0, null, 6, null);
                                throw new setWrite();
                            }
                        }
                    } else {
                        if (i != iOnNavigationEvent) {
                            onExtraCallbackWithResult(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new setWrite();
                        }
                        i++;
                        z2 = true;
                    }
                } else {
                    if (i == iOnNavigationEvent) {
                        onExtraCallbackWithResult(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                        throw new setWrite();
                    }
                    i++;
                }
                z4 = true;
            }
            break loop0;
        }
    }

    private static final double onExtraCallbackWithResult(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (!z) {
            throw new NoWhenBranchMatchedException();
        }
        return Math.pow(10.0d, j);
    }

    public final long IAuthTabCallbackDefault() {
        long jOnNavigationEvent = onNavigationEvent();
        if (onExtraCallback() == 10) {
            return jOnNavigationEvent;
        }
        getRunTime.onWarmupCompleted((byte) 10);
        int i = this.onWarmupCompleted;
        int i2 = i - 1;
        onExtraCallbackWithResult(this, "Expected input to contain a single valid number, but got '" + ((i == getInterfaceDescriptor().length() || i2 < 0) ? "EOF" : String.valueOf(getInterfaceDescriptor().charAt(i2))) + "' after it", i2, null, 4, null);
        throw new setWrite();
    }

    public final boolean onExtraCallbackWithResult() {
        boolean z;
        int iExtraCallback = extraCallback();
        if (iExtraCallback == getInterfaceDescriptor().length()) {
            onExtraCallbackWithResult(this, "EOF", 0, null, 6, null);
            throw new setWrite();
        }
        if (getInterfaceDescriptor().charAt(iExtraCallback) == '\"') {
            iExtraCallback++;
            z = true;
        } else {
            z = false;
        }
        boolean zOnExtraCallback = onExtraCallback(iExtraCallback);
        if (!z) {
            return zOnExtraCallback;
        }
        if (this.onWarmupCompleted == getInterfaceDescriptor().length()) {
            onExtraCallbackWithResult(this, "EOF", 0, null, 6, null);
            throw new setWrite();
        }
        if (getInterfaceDescriptor().charAt(this.onWarmupCompleted) != '\"') {
            onExtraCallbackWithResult(this, "Expected closing quotation mark", 0, null, 6, null);
            throw new setWrite();
        }
        this.onWarmupCompleted++;
        return zOnExtraCallback;
    }

    private final boolean onExtraCallback(int i) {
        int iOnNavigationEvent = onNavigationEvent(i);
        if (iOnNavigationEvent >= getInterfaceDescriptor().length() || iOnNavigationEvent == -1) {
            onExtraCallbackWithResult(this, "EOF", 0, null, 6, null);
            throw new setWrite();
        }
        int i2 = iOnNavigationEvent + 1;
        int iCharAt = getInterfaceDescriptor().charAt(iOnNavigationEvent) | ' ';
        if (iCharAt == 102) {
            onNavigationEvent("alse", i2);
            return false;
        }
        if (iCharAt == 116) {
            onNavigationEvent("rue", i2);
            return true;
        }
        onExtraCallbackWithResult(this, "Expected valid boolean literal prefix, but had '" + onTransact() + '\'', 0, null, 6, null);
        throw new setWrite();
    }

    private final void onNavigationEvent(String str, int i) {
        if (getInterfaceDescriptor().length() - i < str.length()) {
            onExtraCallbackWithResult(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new setWrite();
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (getInterfaceDescriptor().charAt(i + i2) | ' ')) {
                onExtraCallbackWithResult(this, "Expected valid boolean literal prefix, but had '" + onTransact() + '\'', 0, null, 6, null);
                throw new setWrite();
            }
        }
        this.onWarmupCompleted = i + str.length();
    }
}
