package net.sf.scuba.smartcards;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class AbstractFileSystemStructured implements FileSystemStructured {
    public static final short MF_ID = 16128;
    private ISOFileInfo fileInfo;
    private int length;
    private int p2;
    private int selectLe;
    private short selectedFID;
    private CardService service;

    public abstract byte[] readBinary(int i, int i2);

    public AbstractFileSystemStructured(CardService cardService) {
        this.selectedFID = (short) 0;
        this.length = -1;
        this.p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
    }

    public AbstractFileSystemStructured(CardService cardService, boolean z) {
        this.selectedFID = (short) 0;
        this.length = -1;
        this.p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
        this.p2 = z ? 0 : 12;
        this.selectLe = z ? 256 : 0;
    }

    public int getFileLength() throws CardServiceException {
        return this.length;
    }

    public short getSelectedFID() {
        return this.selectedFID;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.sf.scuba.smartcards.CardServiceException */
    private void selectFile(byte[] bArr, int i) throws CardServiceException {
        ResponseAPDU responseAPDUTransmit = this.service.transmit(createSelectFileAPDU(i, this.p2, bArr, this.selectLe));
        int sw = responseAPDUTransmit.getSW();
        byte[] data = responseAPDUTransmit.getData();
        if (sw != -28672) {
            throw new CardServiceException("File could not be selected.", sw);
        }
        ISOFileInfo iSOFileInfo = new ISOFileInfo(data);
        this.fileInfo = iSOFileInfo;
        short s = iSOFileInfo.fid;
        if (s != -1) {
            this.selectedFID = s;
        }
        int i2 = iSOFileInfo.fileLength;
        if (i2 != -1) {
            this.length = i2;
        }
    }

    private void selectFile(short s, int i) throws CardServiceException {
        selectFile(s == 0 ? new byte[0] : new byte[]{(byte) (s >> 8), (byte) s}, i);
    }

    public void selectFile(short s) throws CardServiceException {
        selectFile(s, 0);
    }

    public void selectMF() throws CardServiceException {
        selectFile((short) 0, 0);
    }

    public void selectParent() throws CardServiceException {
        selectFile((short) 0, 3);
    }

    public void selectEFRelative(short s) throws CardServiceException {
        selectFile(s, 2);
    }

    public void selectDFRelative(short s) throws CardServiceException {
        selectFile(s, 1);
    }

    public void selectAID(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 4);
    }

    public void selectPath(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 8);
    }

    public void selectPathRelative(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 9);
    }

    private CommandAPDU createSelectFileAPDU(int i, int i2, byte[] bArr, int i3) {
        if (i3 == 0) {
            return new CommandAPDU(0, -92, i, i2, bArr);
        }
        return new CommandAPDU(0, -92, i, i2, bArr, i3);
    }
}
