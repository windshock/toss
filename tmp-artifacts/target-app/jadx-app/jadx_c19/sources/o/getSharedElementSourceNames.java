package o;

import com.alibaba.griver.base.common.utils.HexStringUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum getSharedElementSourceNames {
    UTF8(HexStringUtil.DEFAULT_CHARSET_NAME, false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);

    private final boolean _bigEndian;
    private final int _bits;
    private final String _javaName;

    getSharedElementSourceNames(String str, boolean z, int i2) {
        this._javaName = str;
        this._bigEndian = z;
        this._bits = i2;
    }

    public String getJavaName() {
        return this._javaName;
    }

    public boolean isBigEndian() {
        return this._bigEndian;
    }

    public int bits() {
        return this._bits;
    }
}
