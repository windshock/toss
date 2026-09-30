package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import o.oq;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class om implements Iterable<oi>, Cloneable {
    private int IAuthTabCallback = 0;
    String[] onNavigationEvent = new String[3];
    String[] onExtraCallbackWithResult = new String[3];

    private void onExtraCallback(int i) {
        oas.onExtraCallback(i >= this.IAuthTabCallback);
        String[] strArr = this.onNavigationEvent;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.IAuthTabCallback << 1 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.onNavigationEvent = (String[]) Arrays.copyOf(strArr, i);
        this.onExtraCallbackWithResult = (String[]) Arrays.copyOf(this.onExtraCallbackWithResult, i);
    }

    int asInterface(String str) {
        oas.onExtraCallback(str);
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            if (str.equals(this.onNavigationEvent[i])) {
                return i;
            }
        }
        return -1;
    }

    private int onTransact(String str) {
        oas.onExtraCallback(str);
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            if (str.equalsIgnoreCase(this.onNavigationEvent[i])) {
                return i;
            }
        }
        return -1;
    }

    static String IAuthTabCallback(@Nullable String str) {
        return str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
    }

    public String onExtraCallback(String str) {
        int iAsInterface = asInterface(str);
        return iAsInterface == -1 ? _UrlKt.FRAGMENT_ENCODE_SET : IAuthTabCallback(this.onExtraCallbackWithResult[iAsInterface]);
    }

    public String onNavigationEvent(String str) {
        int iOnTransact = onTransact(str);
        return iOnTransact == -1 ? _UrlKt.FRAGMENT_ENCODE_SET : IAuthTabCallback(this.onExtraCallbackWithResult[iOnTransact]);
    }

    public om onWarmupCompleted(String str, @Nullable String str2) {
        onExtraCallback(this.IAuthTabCallback + 1);
        String[] strArr = this.onNavigationEvent;
        int i = this.IAuthTabCallback;
        strArr[i] = str;
        this.onExtraCallbackWithResult[i] = str2;
        this.IAuthTabCallback = i + 1;
        return this;
    }

    public om onExtraCallbackWithResult(String str, @Nullable String str2) {
        oas.onExtraCallback(str);
        int iAsInterface = asInterface(str);
        if (iAsInterface != -1) {
            this.onExtraCallbackWithResult[iAsInterface] = str2;
            return this;
        }
        onWarmupCompleted(str, str2);
        return this;
    }

    void IAuthTabCallback(String str, @Nullable String str2) {
        int iOnTransact = onTransact(str);
        if (iOnTransact != -1) {
            this.onExtraCallbackWithResult[iOnTransact] = str2;
            if (this.onNavigationEvent[iOnTransact].equals(str)) {
                return;
            }
            this.onNavigationEvent[iOnTransact] = str;
            return;
        }
        onWarmupCompleted(str, str2);
    }

    public om onNavigationEvent(oi oiVar) {
        oas.onExtraCallback(oiVar);
        onExtraCallbackWithResult(oiVar.getKey(), oiVar.getValue());
        oiVar.onWarmupCompleted = this;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(int i) {
        oas.IAuthTabCallback(i >= this.IAuthTabCallback);
        int i2 = (this.IAuthTabCallback - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.onNavigationEvent;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.onExtraCallbackWithResult;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.IAuthTabCallback - 1;
        this.IAuthTabCallback = i4;
        this.onNavigationEvent[i4] = null;
        this.onExtraCallbackWithResult[i4] = null;
    }

    public boolean onExtraCallbackWithResult(String str) {
        return asInterface(str) != -1;
    }

    public boolean asBinder(String str) {
        return onTransact(str) != -1;
    }

    public int asInterface() {
        return this.IAuthTabCallback;
    }

    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback == 0;
    }

    public void IAuthTabCallback(om omVar) {
        if (omVar.asInterface() != 0) {
            onExtraCallback(this.IAuthTabCallback + omVar.IAuthTabCallback);
            Iterator<oi> it = omVar.iterator();
            while (it.hasNext()) {
                onNavigationEvent(it.next());
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<oi> iterator() {
        return new Iterator<oi>() { // from class: o.om.2
            int onExtraCallback = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.onExtraCallback < om.this.IAuthTabCallback) {
                    om omVar = om.this;
                    if (!omVar.IAuthTabCallbackDefault(omVar.onNavigationEvent[this.onExtraCallback])) {
                        break;
                    }
                    this.onExtraCallback++;
                }
                return this.onExtraCallback < om.this.IAuthTabCallback;
            }

            @Override // java.util.Iterator
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public oi next() {
                om omVar = om.this;
                String[] strArr = omVar.onNavigationEvent;
                int i = this.onExtraCallback;
                oi oiVar = new oi(strArr[i], omVar.onExtraCallbackWithResult[i], omVar);
                this.onExtraCallback++;
                return oiVar;
            }

            @Override // java.util.Iterator
            public void remove() {
                om omVar = om.this;
                int i = this.onExtraCallback - 1;
                this.onExtraCallback = i;
                omVar.onWarmupCompleted(i);
            }
        };
    }

    public List<oi> onWarmupCompleted() {
        ArrayList arrayList = new ArrayList(this.IAuthTabCallback);
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            if (!IAuthTabCallbackDefault(this.onNavigationEvent[i])) {
                arrayList.add(new oi(this.onNavigationEvent[i], this.onExtraCallbackWithResult[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String onNavigationEvent() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        try {
            onNavigationEvent(sbIAuthTabCallback, new oq(_UrlKt.FRAGMENT_ENCODE_SET).IAuthTabCallbackStub());
            return nfe.onExtraCallback(sbIAuthTabCallback);
        } catch (IOException e) {
            throw new mu(e);
        }
    }

    final void onNavigationEvent(Appendable appendable, oq.onExtraCallback onextracallback) throws IOException {
        String strOnWarmupCompleted;
        int i = this.IAuthTabCallback;
        for (int i2 = 0; i2 < i; i2++) {
            if (!IAuthTabCallbackDefault(this.onNavigationEvent[i2]) && (strOnWarmupCompleted = oi.onWarmupCompleted(this.onNavigationEvent[i2], onextracallback.IAuthTabCallbackDefault())) != null) {
                oi.onWarmupCompleted(strOnWarmupCompleted, this.onExtraCallbackWithResult[i2], appendable.append(' '), onextracallback);
            }
        }
    }

    public String toString() {
        return onNavigationEvent();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        om omVar = (om) obj;
        if (this.IAuthTabCallback != omVar.IAuthTabCallback) {
            return false;
        }
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            int iAsInterface = omVar.asInterface(this.onNavigationEvent[i]);
            if (iAsInterface == -1) {
                return false;
            }
            String str = this.onExtraCallbackWithResult[i];
            String str2 = omVar.onExtraCallbackWithResult[iAsInterface];
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.IAuthTabCallback * 31) + Arrays.hashCode(this.onNavigationEvent)) * 31) + Arrays.hashCode(this.onExtraCallbackWithResult);
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public om clone() {
        try {
            om omVar = (om) super.clone();
            omVar.IAuthTabCallback = this.IAuthTabCallback;
            this.onNavigationEvent = (String[]) Arrays.copyOf(this.onNavigationEvent, this.IAuthTabCallback);
            this.onExtraCallbackWithResult = (String[]) Arrays.copyOf(this.onExtraCallbackWithResult, this.IAuthTabCallback);
            return omVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void IAuthTabCallback() {
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            String[] strArr = this.onNavigationEvent;
            strArr[i] = oiz.onExtraCallbackWithResult(strArr[i]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int IAuthTabCallback(sjd sjdVar) {
        String str;
        int i = 0;
        if (onExtraCallbackWithResult()) {
            return 0;
        }
        boolean zOnNavigationEvent = sjdVar.onNavigationEvent();
        int i2 = 0;
        while (i < this.onNavigationEvent.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.onNavigationEvent;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (!zOnNavigationEvent || !strArr[i].equals(str)) {
                    if (!zOnNavigationEvent) {
                        String[] strArr2 = this.onNavigationEvent;
                        if (strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            i2++;
                            onWarmupCompleted(i4);
                            i4--;
                        }
                    }
                }
                i4++;
            }
            i = i3;
        }
        return i2;
    }

    static String onWarmupCompleted(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IAuthTabCallbackDefault(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }
}
