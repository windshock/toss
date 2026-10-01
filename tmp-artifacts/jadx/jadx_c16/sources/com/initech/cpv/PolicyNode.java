package com.initech.cpv;

import com.initech.asn1.ASN1OID;
import com.initech.x509.extensions.PolicyInfo;
import com.initech.x509.extensions.PolicyQualifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PolicyNode implements Cloneable {
    private PolicyNode a;
    private ArrayList b;
    private PolicyInfo c;
    private boolean d;
    private HashMap e;

    public PolicyNode() {
    }

    public PolicyNode(PolicyNode policyNode, PolicyInfo policyInfo, boolean z, HashMap map) {
        this.a = policyNode;
        this.c = policyInfo;
        this.d = z;
        this.e = map;
    }

    protected void addChild(PolicyNode policyNode) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(policyNode);
    }

    protected void addExpectedPolicy(ASN1OID asn1oid) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(asn1oid, asn1oid);
    }

    public Object clone() {
        return new PolicyNode(this.a, this.c, this.d, this.e);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof PolicyNode) && obj == this;
    }

    protected ArrayList getChildren() {
        return this.b;
    }

    protected HashMap getExpectedPolicies() {
        return this.e;
    }

    protected PolicyNode getParent() {
        return this.a;
    }

    public PolicyNode getRootNode() {
        PolicyNode policyNode = this.a;
        if (policyNode == null) {
            return this;
        }
        PolicyNode parent = policyNode.getParent();
        if (parent == null) {
            return this.a;
        }
        while (parent != null && parent.hasParent()) {
            parent = parent.getParent();
        }
        return parent;
    }

    protected PolicyInfo getValidPolicy() {
        return this.c;
    }

    public boolean hasExpectedPolicy(ASN1OID asn1oid) {
        if (this.e == null) {
            return false;
        }
        PolicyInfo policyInfo = this.c;
        return (policyInfo != null && policyInfo.getPolicyID().equals(PolicyInfo.anyPolicy)) || this.e.get(asn1oid) != null;
    }

    public boolean hasParent() {
        return this.a != null;
    }

    public boolean hasParent(PolicyNode policyNode) {
        PolicyNode parent = getParent();
        if (policyNode == null || parent == null) {
            return false;
        }
        while (!parent.equals(policyNode)) {
            parent = parent.getParent();
            if (parent == null) {
                return false;
            }
        }
        return true;
    }

    protected void indent(StringBuffer stringBuffer, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("    ");
        }
    }

    protected boolean isCritical() {
        return this.d;
    }

    public boolean isPolicy(ASN1OID asn1oid) {
        PolicyInfo policyInfo = this.c;
        return policyInfo != null && policyInfo.getPolicyID().equals(asn1oid);
    }

    public boolean isPolicy(PolicyInfo policyInfo) {
        PolicyInfo policyInfo2 = this.c;
        return policyInfo2 != null && policyInfo2.equals(policyInfo);
    }

    protected void removeChild(PolicyNode policyNode) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((PolicyNode) it.next()).equals(policyNode)) {
                    it.remove();
                }
            }
        }
    }

    protected void removeChildren() {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PolicyNode) it.next()).removeChildren();
        }
        this.b.clear();
        this.b = null;
    }

    protected void setChildren(ArrayList arrayList) {
        this.b = arrayList;
    }

    protected void setCritical(boolean z) {
        this.d = z;
    }

    protected void setExpectedPolicies(HashMap map) {
        this.e = map;
    }

    protected void setParent(PolicyNode policyNode) {
        this.a = policyNode;
    }

    protected void setValidPolicy(PolicyInfo policyInfo) {
        this.c = policyInfo;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int i) {
        StringBuffer stringBuffer = new StringBuffer(64);
        indent(stringBuffer, i);
        stringBuffer.append("Valid Policy : ");
        stringBuffer.append("\n");
        int i2 = i + 1;
        indent(stringBuffer, i2);
        stringBuffer.append(this.c.getPolicyID().toString());
        stringBuffer.append("\n");
        indent(stringBuffer, i);
        stringBuffer.append("Policy Qualifiers : ");
        stringBuffer.append("\n");
        Enumeration enumerationElementsQualifiers = this.c.elementsQualifiers();
        while (enumerationElementsQualifiers.hasMoreElements()) {
            ((PolicyQualifier) enumerationElementsQualifiers.nextElement()).toString(stringBuffer, i2);
        }
        indent(stringBuffer, i);
        stringBuffer.append("Criticality : ");
        stringBuffer.append("\n");
        indent(stringBuffer, i2);
        stringBuffer.append(this.d);
        stringBuffer.append("\n");
        indent(stringBuffer, i);
        stringBuffer.append("Expected Policy Set : ");
        stringBuffer.append("\n");
        indent(stringBuffer, i2);
        Iterator it = this.e.keySet().iterator();
        while (it.hasNext()) {
            stringBuffer.append(((ASN1OID) it.next()).toString());
            stringBuffer.append(" ");
        }
        stringBuffer.append("\n");
        stringBuffer.append("\n");
        if (this.b != null) {
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                stringBuffer.append(((PolicyNode) this.b.get(i3)).toString(i2));
            }
        }
        return stringBuffer.toString();
    }
}
