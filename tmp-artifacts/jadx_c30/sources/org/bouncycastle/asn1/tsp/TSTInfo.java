package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TSTInfo extends ASN1Object {
    private Accuracy accuracy;
    private Extensions extensions;
    private ASN1GeneralizedTime genTime;
    private MessageImprint messageImprint;
    private ASN1Integer nonce;
    private ASN1Boolean ordering;
    private ASN1Integer serialNumber;
    private GeneralName tsa;
    private ASN1ObjectIdentifier tsaPolicyId;
    private ASN1Integer version;

    public TSTInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, MessageImprint messageImprint, ASN1Integer aSN1Integer, ASN1GeneralizedTime aSN1GeneralizedTime, Accuracy accuracy, ASN1Boolean aSN1Boolean, ASN1Integer aSN1Integer2, GeneralName generalName, Extensions extensions) {
        this.version = new ASN1Integer(1L);
        this.tsaPolicyId = aSN1ObjectIdentifier;
        this.messageImprint = messageImprint;
        this.serialNumber = aSN1Integer;
        this.genTime = aSN1GeneralizedTime;
        this.accuracy = accuracy;
        this.ordering = aSN1Boolean;
        this.nonce = aSN1Integer2;
        this.tsa = generalName;
        this.extensions = extensions;
    }

    private TSTInfo(ASN1Sequence aSN1Sequence) {
        ASN1TaggedObject aSN1TaggedObject;
        Enumeration objects = aSN1Sequence.getObjects();
        this.version = ASN1Integer.getInstance(objects.nextElement());
        this.tsaPolicyId = ASN1ObjectIdentifier.getInstance(objects.nextElement());
        this.messageImprint = MessageImprint.getInstance(objects.nextElement());
        this.serialNumber = ASN1Integer.getInstance(objects.nextElement());
        this.genTime = ASN1GeneralizedTime.getInstance(objects.nextElement());
        ASN1Boolean aSN1Boolean = ASN1Boolean.getInstance(false);
        while (true) {
            this.ordering = aSN1Boolean;
            while (objects.hasMoreElements()) {
                aSN1TaggedObject = (ASN1Object) objects.nextElement();
                if (aSN1TaggedObject instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject2 = aSN1TaggedObject;
                    int tagNo = aSN1TaggedObject2.getTagNo();
                    if (tagNo == 0) {
                        this.tsa = GeneralName.getInstance(aSN1TaggedObject2, true);
                    } else {
                        if (tagNo != 1) {
                            throw new IllegalArgumentException("Unknown tag value " + aSN1TaggedObject2.getTagNo());
                        }
                        this.extensions = Extensions.getInstance(aSN1TaggedObject2, false);
                    }
                } else if ((aSN1TaggedObject instanceof ASN1Sequence) || (aSN1TaggedObject instanceof Accuracy)) {
                    this.accuracy = Accuracy.getInstance(aSN1TaggedObject);
                } else if (aSN1TaggedObject instanceof ASN1Boolean) {
                    break;
                } else if (aSN1TaggedObject instanceof ASN1Integer) {
                    this.nonce = ASN1Integer.getInstance(aSN1TaggedObject);
                }
            }
            return;
            aSN1Boolean = ASN1Boolean.getInstance(aSN1TaggedObject);
        }
    }

    public static TSTInfo getInstance(Object obj) {
        if (obj instanceof TSTInfo) {
            return (TSTInfo) obj;
        }
        if (obj != null) {
            return new TSTInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Accuracy getAccuracy() {
        return this.accuracy;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public ASN1GeneralizedTime getGenTime() {
        return this.genTime;
    }

    public MessageImprint getMessageImprint() {
        return this.messageImprint;
    }

    public ASN1Integer getNonce() {
        return this.nonce;
    }

    public ASN1Boolean getOrdering() {
        return this.ordering;
    }

    public ASN1ObjectIdentifier getPolicy() {
        return this.tsaPolicyId;
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public GeneralName getTsa() {
        return this.tsa;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.tsaPolicyId);
        aSN1EncodableVector.add(this.messageImprint);
        aSN1EncodableVector.add(this.serialNumber);
        aSN1EncodableVector.add(this.genTime);
        Accuracy accuracy = this.accuracy;
        if (accuracy != null) {
            aSN1EncodableVector.add(accuracy);
        }
        ASN1Boolean aSN1Boolean = this.ordering;
        if (aSN1Boolean != null && aSN1Boolean.isTrue()) {
            aSN1EncodableVector.add(this.ordering);
        }
        ASN1Integer aSN1Integer = this.nonce;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        GeneralName generalName = this.tsa;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, generalName));
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
