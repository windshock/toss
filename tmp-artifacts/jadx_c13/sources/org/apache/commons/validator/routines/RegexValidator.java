package org.apache.commons.validator.routines;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RegexValidator implements Serializable {
    private static final long serialVersionUID = -8832409930574867162L;
    private final Pattern[] patterns;

    public RegexValidator(String str) {
        this(str, true);
    }

    public RegexValidator(String str, boolean z) {
        this(new String[]{str}, z);
    }

    public RegexValidator(String[] strArr, boolean z) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("Regular expressions are missing");
        }
        this.patterns = new Pattern[strArr.length];
        int i = z ? 0 : 2;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Regular expression[" + i2 + "] is missing");
            }
            this.patterns[i2] = Pattern.compile(strArr[i2], i);
        }
    }

    public boolean onNavigationEvent(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        while (true) {
            Pattern[] patternArr = this.patterns;
            if (i >= patternArr.length) {
                return false;
            }
            if (patternArr[i].matcher(str).matches()) {
                return true;
            }
            i++;
        }
    }

    public String[] onExtraCallbackWithResult(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Pattern[] patternArr = this.patterns;
            if (i2 >= patternArr.length) {
                return null;
            }
            Matcher matcher = patternArr[i2].matcher(str);
            if (matcher.matches()) {
                int iGroupCount = matcher.groupCount();
                String[] strArr = new String[iGroupCount];
                while (i < iGroupCount) {
                    int i3 = i + 1;
                    strArr[i] = matcher.group(i3);
                    i = i3;
                }
                return strArr;
            }
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegexValidator{");
        for (int i = 0; i < this.patterns.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.patterns[i].pattern());
        }
        sb.append("}");
        return sb.toString();
    }
}
