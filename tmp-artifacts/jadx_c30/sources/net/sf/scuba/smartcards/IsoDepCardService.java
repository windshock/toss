package net.sf.scuba.smartcards;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class IsoDepCardService extends CardService {
    private int apduCount = 0;
    private IsoDep isoDep;

    public IsoDepCardService(IsoDep isoDep) {
        this.isoDep = isoDep;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.sf.scuba.smartcards.CardServiceException */
    public void open() throws IOException, CardServiceException {
        if (isOpen()) {
            return;
        }
        try {
            this.isoDep.connect();
            if (!this.isoDep.isConnected()) {
                throw new CardServiceException("Failed to connect");
            }
            ((CardService) this).state = 1;
        } catch (IOException e) {
            throw new CardServiceException("Failed to connect", e);
        }
    }

    public boolean isOpen() {
        if (this.isoDep.isConnected()) {
            ((CardService) this).state = 1;
            return true;
        }
        ((CardService) this).state = 0;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.sf.scuba.smartcards.CardServiceException */
    public ResponseAPDU transmit(CommandAPDU commandAPDU) throws IOException, CardServiceException {
        try {
            if (!this.isoDep.isConnected()) {
                throw new CardServiceException("Not connected");
            }
            byte[] bArrTransceive = this.isoDep.transceive(commandAPDU.getBytes());
            if (bArrTransceive == null || bArrTransceive.length < 2) {
                throw new CardServiceException("Failed response");
            }
            ResponseAPDU responseAPDU = new ResponseAPDU(bArrTransceive);
            int i = this.apduCount + 1;
            this.apduCount = i;
            notifyExchangedAPDU(new APDUEvent(this, "ISODep", i, commandAPDU, responseAPDU));
            return responseAPDU;
        } catch (CardServiceException e) {
            throw e;
        } catch (Exception e2) {
            throw new CardServiceException("Could not tranceive APDU", e2);
        }
    }

    public byte[] getATR() {
        Tag tag;
        IsoDep isoDep = this.isoDep;
        if (isoDep == null || (tag = isoDep.getTag()) == null) {
            return null;
        }
        if (NfcA.get(tag) != null) {
            return this.isoDep.getHistoricalBytes();
        }
        if (NfcB.get(tag) != null) {
            return this.isoDep.getHiLayerResponse();
        }
        return this.isoDep.getHistoricalBytes();
    }

    public boolean isExtendedAPDULengthSupported() {
        return this.isoDep.isExtendedLengthApduSupported();
    }

    public void close() throws IOException {
        try {
            this.isoDep.close();
            ((CardService) this).state = 0;
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isConnectionLost(Exception exc) {
        if (isDirectConnectionLost(exc)) {
            return true;
        }
        Throwable th = exc;
        if (exc == null) {
            return false;
        }
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null || th == cause) {
                break;
            }
            if (isDirectConnectionLost(cause)) {
                return true;
            }
            th = cause;
        }
    }

    private boolean isDirectConnectionLost(Throwable th) {
        if (!this.isoDep.isConnected()) {
            return true;
        }
        if (th == null) {
            return false;
        }
        if (th.getClass().getName().contains("TagLostException")) {
            return true;
        }
        String message = th.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        return message.toLowerCase().contains("tag was lost");
    }
}
