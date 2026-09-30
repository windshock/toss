package com.initech.inisafesign.exception;

import com.initech.core.exception.INICoreException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class INISAFESignException extends INICoreException {
    private static ResourceBundle c = ResourceBundle.getBundle("com.initech.inisafesign.Message", Locale.getDefault());
    private String a;
    private String b;

    public INISAFESignException() {
        this.a = "SE_1100";
        this.b = null;
    }

    public INISAFESignException(String str) {
        super(str);
        this.a = "SE_1100";
        this.b = null;
    }

    public INISAFESignException(Exception exc) {
        this(exc.getMessage());
    }

    public void setErrorCode(String str) {
        this.a = str;
    }

    public String getErrorCode() {
        return this.a;
    }

    public void setErrorMessage(String str) {
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getErrorMessage() {
        ResourceBundle resourceBundle = c;
        if (resourceBundle == null) {
            return "INISAFESignException Message(ResourceBundle) is NULL";
        }
        try {
            String string = resourceBundle.getString(getErrorCode());
            if (string == null) {
                return "INISAFESignException : " + getErrorCode() + " : No text available";
            }
            return "(" + getMessage() + ") " + string;
        } catch (MissingResourceException unused) {
            return getErrorCode();
        }
    }
}
