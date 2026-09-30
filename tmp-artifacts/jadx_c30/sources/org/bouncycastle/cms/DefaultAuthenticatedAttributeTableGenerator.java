package org.bouncycastle.cms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class DefaultAuthenticatedAttributeTableGenerator implements CMSAttributeTableGenerator {
    private final Hashtable table;

    public DefaultAuthenticatedAttributeTableGenerator() {
        this.table = new Hashtable();
    }

    public DefaultAuthenticatedAttributeTableGenerator(AttributeTable attributeTable) {
        this.table = attributeTable != null ? attributeTable.toHashtable() : new Hashtable();
    }

    protected Hashtable createStandardAttributeTable(Map map) {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.table.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable.put(objNextElement, this.table.get(objNextElement));
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAttributes.contentType;
        if (!hashtable.containsKey(aSN1ObjectIdentifier)) {
            Attribute attribute = new Attribute(aSN1ObjectIdentifier, new DERSet(ASN1ObjectIdentifier.getInstance(map.get("contentType"))));
            hashtable.put(attribute.getAttrType(), attribute);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAttributes.messageDigest;
        if (!hashtable.containsKey(aSN1ObjectIdentifier2)) {
            Attribute attribute2 = new Attribute(aSN1ObjectIdentifier2, new DERSet(new DEROctetString((byte[]) map.get("digest"))));
            hashtable.put(attribute2.getAttrType(), attribute2);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAttributes.cmsAlgorithmProtect;
        if (!hashtable.contains(aSN1ObjectIdentifier3)) {
            Attribute attribute3 = new Attribute(aSN1ObjectIdentifier3, new DERSet(new CMSAlgorithmProtection((AlgorithmIdentifier) map.get("digestAlgID"), 2, (AlgorithmIdentifier) map.get("macAlgID"))));
            hashtable.put(attribute3.getAttrType(), attribute3);
        }
        return hashtable;
    }

    public AttributeTable getAttributes(Map map) {
        return new AttributeTable(createStandardAttributeTable(map));
    }
}
