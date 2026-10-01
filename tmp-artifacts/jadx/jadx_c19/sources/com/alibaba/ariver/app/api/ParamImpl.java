package com.alibaba.ariver.app.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ParamImpl {
    private Object defaultValue;
    private boolean isColor;
    private String longName;
    private String shortName;
    private RVParams.ParamType type;

    public ParamImpl(String str, String str2, RVParams.ParamType paramType, Object obj) {
        this.longName = str;
        this.shortName = str2;
        this.type = paramType;
        this.defaultValue = obj;
    }

    public ParamImpl(String str, String str2, boolean z, RVParams.ParamType paramType, Object obj) {
        this.longName = str;
        this.shortName = str2;
        this.type = paramType;
        this.defaultValue = obj;
        this.isColor = z;
    }

    public void setDefaultValue(Object obj) {
        this.defaultValue = obj;
    }

    public String getLongName() {
        return this.longName;
    }

    public String getShortName() {
        return this.shortName;
    }

    public RVParams.ParamType getType() {
        return this.type;
    }

    public void setType(RVParams.ParamType paramType) {
        this.type = paramType;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle unify(Bundle bundle, boolean z) {
        if (!z && !bundle.containsKey(this.longName) && !bundle.containsKey(this.shortName)) {
            return bundle;
        }
        RVParams.ParamType paramType = RVParams.ParamType.BOOLEAN;
        RVParams.ParamType paramType2 = this.type;
        Object obj = null;
        if (paramType == paramType2) {
            boolean zBooleanValue = ((Boolean) this.defaultValue).booleanValue();
            if (bundle.containsKey(this.shortName)) {
                obj = bundle.get(this.shortName);
            } else if (bundle.containsKey(this.longName)) {
                obj = bundle.get(this.longName);
            }
            if (obj instanceof String) {
                String strTrim = ((String) obj).trim();
                if (!RVParams.DEFAULT_LONG_PRESSO_LOGIN.equalsIgnoreCase(strTrim)) {
                    if ("NO".equalsIgnoreCase(strTrim) || "false".equalsIgnoreCase(strTrim)) {
                        zBooleanValue = false;
                    } else if ("true".equalsIgnoreCase(strTrim)) {
                        zBooleanValue = true;
                    }
                }
            } else if (obj instanceof Boolean) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            bundle.putBoolean(this.longName, zBooleanValue);
        } else if (RVParams.ParamType.STRING == paramType2) {
            String stringOnly = (String) this.defaultValue;
            if (bundle.containsKey(this.shortName)) {
                stringOnly = BundleUtils.getStringOnly(bundle, this.shortName, stringOnly);
            } else if (bundle.containsKey(this.longName)) {
                stringOnly = BundleUtils.getStringOnly(bundle, this.longName, stringOnly);
            }
            if (stringOnly != null) {
                stringOnly = stringOnly.trim();
            }
            bundle.putString(this.longName, stringOnly);
        } else if (RVParams.ParamType.INT.equals(paramType2)) {
            Integer numValueOf = (Integer) this.defaultValue;
            if (bundle.containsKey(this.shortName)) {
                obj = bundle.get(this.shortName);
            } else if (bundle.containsKey(this.longName)) {
                obj = bundle.get(this.longName);
            }
            if (obj instanceof String) {
                String strTrim2 = ((String) obj).trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    if (this.isColor) {
                        Integer colorInt = TypeUtils.parseColorInt(strTrim2);
                        if (colorInt != null) {
                            numValueOf = colorInt;
                        }
                    } else {
                        numValueOf = Integer.valueOf(TypeUtils.parseInt(strTrim2));
                    }
                }
            } else if (obj instanceof Integer) {
                numValueOf = (Integer) obj;
            }
            if (numValueOf != null) {
                bundle.putInt(this.longName, numValueOf.intValue());
            }
        } else if (RVParams.ParamType.DOUBLE.equals(this.type)) {
            double dIntValue = ((Integer) this.defaultValue).intValue();
            if (bundle.containsKey(this.shortName)) {
                obj = bundle.get(this.shortName);
            } else if (bundle.containsKey(this.longName)) {
                obj = bundle.get(this.longName);
            }
            if (obj instanceof String) {
                dIntValue = TypeUtils.parseDouble(((String) obj).trim());
            } else if (obj instanceof Double) {
                dIntValue = ((Double) obj).doubleValue();
            }
            bundle.putDouble(this.longName, dIntValue);
        }
        if (!TextUtils.equals(this.longName, this.shortName)) {
            bundle.remove(this.shortName);
        }
        return bundle;
    }
}
