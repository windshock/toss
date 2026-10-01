package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.oq;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class oi implements Map.Entry<String, String>, Cloneable {
    private String asBinder;

    @Nullable
    private String onTransact;

    @Nullable
    om onWarmupCompleted;
    private static final String[] IAuthTabCallback = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern IAuthTabCallbackDefault = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    private static final Pattern onExtraCallback = Pattern.compile("[^-a-zA-Z0-9_:.]");
    private static final Pattern onNavigationEvent = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    private static final Pattern onExtraCallbackWithResult = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    public oi(String str, @Nullable String str2, @Nullable om omVar) {
        oas.onExtraCallback(str);
        String strTrim = str.trim();
        oas.onExtraCallbackWithResult(strTrim);
        this.asBinder = strTrim;
        this.onTransact = str2;
        this.onWarmupCompleted = omVar;
    }

    @Override // java.util.Map.Entry
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.asBinder;
    }

    @Override // java.util.Map.Entry
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return om.IAuthTabCallback(this.onTransact);
    }

    @Override // java.util.Map.Entry
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public String setValue(@Nullable String str) {
        int iAsInterface;
        String strOnExtraCallback = this.onTransact;
        om omVar = this.onWarmupCompleted;
        if (omVar != null && (iAsInterface = omVar.asInterface(this.asBinder)) != -1) {
            strOnExtraCallback = this.onWarmupCompleted.onExtraCallback(this.asBinder);
            this.onWarmupCompleted.onExtraCallbackWithResult[iAsInterface] = str;
        }
        this.onTransact = str;
        return om.IAuthTabCallback(strOnExtraCallback);
    }

    public String onWarmupCompleted() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        try {
            onExtraCallback(sbIAuthTabCallback, new oq(_UrlKt.FRAGMENT_ENCODE_SET).IAuthTabCallbackStub());
            return nfe.onExtraCallback(sbIAuthTabCallback);
        } catch (IOException e) {
            throw new mu(e);
        }
    }

    protected void onExtraCallback(Appendable appendable, oq.onExtraCallback onextracallback) throws IOException {
        onNavigationEvent(this.asBinder, this.onTransact, appendable, onextracallback);
    }

    protected static void onNavigationEvent(String str, @Nullable String str2, Appendable appendable, oq.onExtraCallback onextracallback) throws IOException {
        String strOnWarmupCompleted = onWarmupCompleted(str, onextracallback.IAuthTabCallbackDefault());
        if (strOnWarmupCompleted == null) {
            return;
        }
        onWarmupCompleted(strOnWarmupCompleted, str2, appendable, onextracallback);
    }

    static void onWarmupCompleted(String str, @Nullable String str2, Appendable appendable, oq.onExtraCallback onextracallback) throws IOException {
        appendable.append(str);
        if (IAuthTabCallback(str, str2, onextracallback)) {
            return;
        }
        appendable.append("=\"");
        pvm.onWarmupCompleted(appendable, om.IAuthTabCallback(str2), onextracallback, true, false, false);
        appendable.append('\"');
    }

    @Nullable
    public static String onWarmupCompleted(String str, oq.onExtraCallback.IAuthTabCallback iAuthTabCallback) {
        if (iAuthTabCallback == oq.onExtraCallback.IAuthTabCallback.xml) {
            Pattern pattern = IAuthTabCallbackDefault;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = onExtraCallback.matcher(str).replaceAll(_UrlKt.FRAGMENT_ENCODE_SET);
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (iAuthTabCallback == oq.onExtraCallback.IAuthTabCallback.html) {
            Pattern pattern2 = onNavigationEvent;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = onExtraCallbackWithResult.matcher(str).replaceAll(_UrlKt.FRAGMENT_ENCODE_SET);
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    public String toString() {
        return onWarmupCompleted();
    }

    protected static boolean IAuthTabCallback(String str, @Nullable String str2, oq.onExtraCallback onextracallback) {
        if (onextracallback.IAuthTabCallbackDefault() != oq.onExtraCallback.IAuthTabCallback.html) {
            return false;
        }
        if (str2 != null) {
            return (str2.isEmpty() || str2.equalsIgnoreCase(str)) && onNavigationEvent(str);
        }
        return true;
    }

    public static boolean onNavigationEvent(String str) {
        return Arrays.binarySearch(IAuthTabCallback, str) >= 0;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oi oiVar = (oi) obj;
            String str = this.asBinder;
            if (str == null ? oiVar.asBinder != null : !str.equals(oiVar.asBinder)) {
                return false;
            }
            String str2 = this.onTransact;
            String str3 = oiVar.onTransact;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.asBinder;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.onTransact;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public oi clone() {
        try {
            return (oi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
