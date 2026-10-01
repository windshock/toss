package o;

import org.xml.sax.Attributes;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDirectDestroyWebView implements Attributes {
    String[] onExtraCallback;
    int onWarmupCompleted;

    public setDirectDestroyWebView() {
        this.onWarmupCompleted = 0;
        this.onExtraCallback = null;
    }

    public setDirectDestroyWebView(Attributes attributes) {
        onNavigationEvent(attributes);
    }

    @Override // org.xml.sax.Attributes
    public int getLength() {
        return this.onWarmupCompleted;
    }

    @Override // org.xml.sax.Attributes
    public String getURI(int i) {
        if (i < 0 || i >= this.onWarmupCompleted) {
            return null;
        }
        return this.onExtraCallback[i * 5];
    }

    @Override // org.xml.sax.Attributes
    public String getLocalName(int i) {
        if (i < 0 || i >= this.onWarmupCompleted) {
            return null;
        }
        return this.onExtraCallback[(i * 5) + 1];
    }

    @Override // org.xml.sax.Attributes
    public String getQName(int i) {
        if (i < 0 || i >= this.onWarmupCompleted) {
            return null;
        }
        return this.onExtraCallback[(i * 5) + 2];
    }

    @Override // org.xml.sax.Attributes
    public String getType(int i) {
        if (i < 0 || i >= this.onWarmupCompleted) {
            return null;
        }
        return this.onExtraCallback[(i * 5) + 3];
    }

    @Override // org.xml.sax.Attributes
    public String getValue(int i) {
        if (i < 0 || i >= this.onWarmupCompleted) {
            return null;
        }
        return this.onExtraCallback[(i * 5) + 4];
    }

    @Override // org.xml.sax.Attributes
    public int getIndex(String str, String str2) {
        int i = this.onWarmupCompleted;
        for (int i2 = 0; i2 < i * 5; i2 += 5) {
            if (this.onExtraCallback[i2].equals(str) && this.onExtraCallback[i2 + 1].equals(str2)) {
                return i2 / 5;
            }
        }
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public int getIndex(String str) {
        int i = this.onWarmupCompleted;
        for (int i2 = 0; i2 < i * 5; i2 += 5) {
            if (this.onExtraCallback[i2 + 2].equals(str)) {
                return i2 / 5;
            }
        }
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public String getType(String str, String str2) {
        int i = this.onWarmupCompleted;
        for (int i2 = 0; i2 < i * 5; i2 += 5) {
            if (this.onExtraCallback[i2].equals(str) && this.onExtraCallback[i2 + 1].equals(str2)) {
                return this.onExtraCallback[i2 + 3];
            }
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getType(String str) {
        int i = this.onWarmupCompleted;
        for (int i2 = 0; i2 < i * 5; i2 += 5) {
            if (this.onExtraCallback[i2 + 2].equals(str)) {
                return this.onExtraCallback[i2 + 3];
            }
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getValue(String str, String str2) {
        int i = this.onWarmupCompleted;
        for (int i2 = 0; i2 < i * 5; i2 += 5) {
            if (this.onExtraCallback[i2].equals(str) && this.onExtraCallback[i2 + 1].equals(str2)) {
                return this.onExtraCallback[i2 + 4];
            }
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getValue(String str) {
        int i = this.onWarmupCompleted;
        for (int i2 = 0; i2 < i * 5; i2 += 5) {
            if (this.onExtraCallback[i2 + 2].equals(str)) {
                return this.onExtraCallback[i2 + 4];
            }
        }
        return null;
    }

    public void onExtraCallbackWithResult() {
        if (this.onExtraCallback != null) {
            for (int i = 0; i < this.onWarmupCompleted * 5; i++) {
                this.onExtraCallback[i] = null;
            }
        }
        this.onWarmupCompleted = 0;
    }

    public void onNavigationEvent(Attributes attributes) {
        onExtraCallbackWithResult();
        int length = attributes.getLength();
        this.onWarmupCompleted = length;
        if (length > 0) {
            this.onExtraCallback = new String[length * 5];
            for (int i = 0; i < this.onWarmupCompleted; i++) {
                int i2 = i * 5;
                this.onExtraCallback[i2] = attributes.getURI(i);
                this.onExtraCallback[i2 + 1] = attributes.getLocalName(i);
                this.onExtraCallback[i2 + 2] = attributes.getQName(i);
                this.onExtraCallback[i2 + 3] = attributes.getType(i);
                this.onExtraCallback[i2 + 4] = attributes.getValue(i);
            }
        }
    }

    public void onWarmupCompleted(String str, String str2, String str3, String str4, String str5) {
        onExtraCallback(this.onWarmupCompleted + 1);
        String[] strArr = this.onExtraCallback;
        int i = this.onWarmupCompleted;
        int i2 = i * 5;
        strArr[i2] = str;
        strArr[i2 + 1] = str2;
        strArr[i2 + 2] = str3;
        strArr[i2 + 3] = str4;
        strArr[i2 + 4] = str5;
        this.onWarmupCompleted = i + 1;
    }

    public void onNavigationEvent(int i, String str, String str2, String str3, String str4, String str5) throws ArrayIndexOutOfBoundsException {
        if (i >= 0 && i < this.onWarmupCompleted) {
            String[] strArr = this.onExtraCallback;
            int i2 = i * 5;
            strArr[i2] = str;
            strArr[i2 + 1] = str2;
            strArr[i2 + 2] = str3;
            strArr[i2 + 3] = str4;
            strArr[i2 + 4] = str5;
            return;
        }
        IAuthTabCallback(i);
    }

    public void onWarmupCompleted(int i) throws ArrayIndexOutOfBoundsException {
        int i2;
        if (i >= 0 && i < (i2 = this.onWarmupCompleted)) {
            if (i < i2 - 1) {
                String[] strArr = this.onExtraCallback;
                System.arraycopy(strArr, (i + 1) * 5, strArr, i * 5, ((i2 - i) - 1) * 5);
            }
            int i3 = this.onWarmupCompleted - 1;
            int i4 = i3 * 5;
            String[] strArr2 = this.onExtraCallback;
            strArr2[i4] = null;
            strArr2[i4 + 1] = null;
            strArr2[i4 + 2] = null;
            strArr2[i4 + 3] = null;
            strArr2[i4 + 4] = null;
            this.onWarmupCompleted = i3;
            return;
        }
        IAuthTabCallback(i);
    }

    private void onExtraCallback(int i) {
        int length;
        if (i > 0) {
            String[] strArr = this.onExtraCallback;
            if (strArr == null || strArr.length == 0) {
                length = 25;
            } else if (strArr.length >= i * 5) {
                return;
            } else {
                length = strArr.length;
            }
            while (length < i * 5) {
                length <<= 1;
            }
            String[] strArr2 = new String[length];
            int i2 = this.onWarmupCompleted;
            if (i2 > 0) {
                System.arraycopy(this.onExtraCallback, 0, strArr2, 0, i2 * 5);
            }
            this.onExtraCallback = strArr2;
        }
    }

    private void IAuthTabCallback(int i) throws ArrayIndexOutOfBoundsException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Attempt to modify attribute at illegal index: ");
        stringBuffer.append(i);
        throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
    }
}
