package net.sf.scuba.smartcards;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class WrappingCardService extends CardService {
    private boolean enabled;
    private CardService service;
    private APDUWrapper wrapper;

    public WrappingCardService(CardService cardService, APDUWrapper aPDUWrapper) {
        this.service = cardService;
        this.wrapper = aPDUWrapper;
    }

    public void open() throws CardServiceException {
        this.service.open();
    }

    public boolean isOpen() {
        return this.service.isOpen();
    }

    public ResponseAPDU transmit(CommandAPDU commandAPDU) throws CardServiceException {
        if (isEnabled()) {
            return this.wrapper.unwrap(this.service.transmit(this.wrapper.wrap(commandAPDU)));
        }
        return this.service.transmit(commandAPDU);
    }

    public byte[] getATR() throws CardServiceException {
        return this.service.getATR();
    }

    public void close() {
        this.service.close();
    }

    public void enable() {
        this.enabled = true;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void disable() {
        this.enabled = false;
    }

    public boolean isConnectionLost(Exception exc) {
        return this.service.isConnectionLost(exc);
    }
}
