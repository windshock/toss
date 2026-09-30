package org.bson.codecs;

import o.dv12;
import o.dv15;
import o.dv17;
import o.dv83;
import o.htfycx;
import o.jc3;
import o.setDownloadButtonData;
import o.setShownAdCount;
import o.sya21;
import org.bson.RawBsonDocument;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RawBsonDocumentCodec implements dv12<RawBsonDocument> {
    @Override // o.dv13
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, RawBsonDocument rawBsonDocument, dv15 dv15Var) {
        setDownloadButtonData setdownloadbuttondata = new setDownloadButtonData(new sya21(rawBsonDocument.onExtraCallbackWithResult()));
        try {
            jc3Var.onWarmupCompleted(setdownloadbuttondata);
        } finally {
            setdownloadbuttondata.close();
        }
    }

    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RawBsonDocument onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        dv83 dv83Var = new dv83(0);
        setShownAdCount setshownadcount = new setShownAdCount(dv83Var);
        try {
            setshownadcount.onWarmupCompleted(htfycxVar);
            return new RawBsonDocument(dv83Var.onExtraCallback(), 0, dv83Var.onExtraCallbackWithResult());
        } finally {
            setshownadcount.close();
            dv83Var.close();
        }
    }

    @Override // o.dv13
    public Class<RawBsonDocument> onNavigationEvent() {
        return RawBsonDocument.class;
    }
}
