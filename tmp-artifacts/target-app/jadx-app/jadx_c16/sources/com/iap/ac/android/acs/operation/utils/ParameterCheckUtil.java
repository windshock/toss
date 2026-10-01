package com.iap.ac.android.acs.operation.utils;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ParameterCheckUtil {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean intInvalid(Object obj, boolean z) {
        boolean z2;
        int i = !z ? 1 : 0;
        if (obj instanceof String) {
            try {
                if (TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                obj = new BigDecimal((String) obj);
            } catch (Exception unused) {
                return true;
            }
        }
        if (obj != null && (!((z2 = obj instanceof Integer)) || ((Integer) obj).intValue() >= i)) {
            boolean z3 = obj instanceof BigInteger;
            if (z3) {
                BigInteger bigInteger = (BigInteger) obj;
                if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) < 0 && bigInteger.compareTo(BigInteger.valueOf(i)) >= 0) {
                    boolean z4 = obj instanceof BigDecimal;
                    if (z4) {
                        BigDecimal bigDecimal = (BigDecimal) obj;
                        if (bigDecimal.compareTo(BigDecimal.valueOf(2147483647L)) < 0 && bigDecimal.compareTo(BigDecimal.valueOf(i)) >= 0) {
                            boolean z5 = obj instanceof Long;
                            if (z5) {
                                Long l = (Long) obj;
                                if (l.compareTo((Long) 2147483647L) < 0 && l.compareTo(Long.valueOf(i)) >= 0) {
                                    boolean z6 = obj instanceof Double;
                                    if (z6) {
                                        Double d = (Double) obj;
                                        if (d.compareTo(Double.valueOf(2.147483647E9d)) < 0 && d.compareTo(Double.valueOf(i)) >= 0) {
                                            if (z2 || z3 || z4 || z5 || z6) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int convert2IntValue(Object obj) {
        return convert2IntValue(obj, 0);
    }

    public static int convert2IntValue(Object obj, int i) {
        try {
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return ((Integer) obj).intValue();
        } catch (Exception e) {
            RVLogger.e("ParameterChecker", "convert2IntValue exception:" + e.getMessage());
            return i;
        }
    }

    public static boolean stringInvalid(Object obj) {
        return !(obj instanceof String) || TextUtils.isEmpty(((String) obj).trim());
    }

    public static boolean listElementStringInvalid(Object obj) {
        if (!(obj instanceof List)) {
            return true;
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            if (stringInvalid(it.next())) {
                return true;
            }
        }
        return false;
    }
}
