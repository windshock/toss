package org.bouncycastle.cms;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PasswordRecipientId extends RecipientId {
    public PasswordRecipientId() {
        super(3);
    }

    @Override // org.bouncycastle.cms.RecipientId
    public Object clone() {
        return new PasswordRecipientId();
    }

    public boolean equals(Object obj) {
        return obj instanceof PasswordRecipientId;
    }

    public int hashCode() {
        return 3;
    }

    public boolean match(Object obj) {
        return obj instanceof PasswordRecipientInformation;
    }
}
