package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.cms.ContentInfoParser;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CMSContentInfoParser {
    public ContentInfoParser _contentInfo;
    protected InputStream _data;

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    public CMSContentInfoParser(InputStream inputStream) throws CMSException {
        this._data = inputStream;
        try {
            ASN1SequenceParser object = new ASN1StreamParser(inputStream).readObject();
            if (object == null) {
                throw new CMSException("No content found.");
            }
            this._contentInfo = new ContentInfoParser(object);
        } catch (IOException e) {
            throw new CMSException("IOException reading content.", e);
        } catch (ClassCastException e2) {
            throw new CMSException("Unexpected object reading content.", e2);
        }
    }

    public void close() throws IOException {
        this._data.close();
    }
}
