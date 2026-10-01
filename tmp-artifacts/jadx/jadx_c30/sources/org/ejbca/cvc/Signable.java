package org.ejbca.cvc;

import org.ejbca.cvc.exception.ConstructionException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface Signable {
    byte[] getTBS() throws ConstructionException;
}
