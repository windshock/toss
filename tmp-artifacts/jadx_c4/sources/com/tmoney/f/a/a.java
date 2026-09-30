package com.tmoney.f.a;

import com.tmoney.a.f;
import com.tmoney.a.h;
import com.tmoney.g.d;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a {
    private final String a = "TmoneyEx";

    public final byte[] getApduBalance() {
        return com.tmoney.a.a.getApduCmd(1, (byte) 0, (byte) 0, (byte) 0, 0, (byte) 0);
    }

    public final byte[] getApduCashBeeSelect() {
        return new byte[]{0, -92, 4, 0, 7, -44, 16, 0, 0, 20, 0, 1, 51};
    }

    public final byte[] getApduCashBeeSelect(int i) {
        return com.tmoney.a.a.getApduCmd(100, (byte) 0, (byte) 0, (byte) 0, i, (byte) 0);
    }

    public final byte[] getApduInitLoad(int i) {
        return com.tmoney.a.a.getApduCmd(3, (byte) 0, i);
    }

    public final byte[] getApduInitParamUp() {
        return com.tmoney.a.a.getApduCmd(8, (byte) 0, (byte) 8, (byte) 0, 0, (byte) 0);
    }

    public final byte[] getApduInitPurchase(int i) {
        return com.tmoney.a.a.getApduCmd(5, (byte) 0, i);
    }

    public final byte[] getApduInitUnLoad() {
        return com.tmoney.a.a.getApduCmd(10);
    }

    public final byte[] getApduSelect() {
        return getApduSelect(0);
    }

    public final byte[] getApduSelect(int i) {
        return com.tmoney.a.a.getApduCmd(0, (byte) 0, (byte) 0, (byte) 0, i, (byte) 0);
    }

    public final f getPurse(d dVar, int i) {
        try {
            return new f(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) (i + 1), (byte) 0, 0, (byte) 0)));
        } catch (Exception e) {
            LogHelper.exception("TmoneyEx", e);
            return null;
        }
    }

    public final byte[] getPurseByte(d dVar, int i) {
        try {
            return dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) (i + 1), (byte) 0, 0, (byte) 0));
        } catch (Exception e) {
            LogHelper.exception("TmoneyEx", e);
            return null;
        }
    }

    public final ArrayList<f> getPurseList(d dVar) {
        ArrayList<f> arrayList = new ArrayList<>();
        int i = 0;
        while (i < 20) {
            i++;
            try {
                f fVar = new f(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0)));
                if (!fVar.isbResData()) {
                    break;
                }
                arrayList.add(fVar);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }

    public final ArrayList<f> getPurseList(d dVar, int i) {
        if (i <= 0) {
            i = 1;
        }
        ArrayList<f> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < i) {
            i2++;
            try {
                f fVar = new f(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i2, (byte) 0, 0, (byte) 0)));
                if (!fVar.isbResData()) {
                    break;
                }
                arrayList.add(fVar);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }

    public final ArrayList<byte[]> getPurseListBytes(d dVar) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i = 0;
        while (i < 20) {
            i++;
            try {
                byte[] bArrTransmitAPDU = dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0));
                if (!new f(bArrTransmitAPDU).isbResData()) {
                    break;
                }
                arrayList.add(bArrTransmitAPDU);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r1 != 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<byte[]> getPurseListOrSwCode(d dVar) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            if (i >= 20) {
                break;
            }
            int i2 = i + 1;
            try {
                byte[] bArrTransmitAPDU = dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i2, (byte) 0, 0, (byte) 0));
                f fVar = new f(bArrTransmitAPDU);
                fVar.getSW();
                if (!fVar.isbResData()) {
                    break;
                }
                arrayList.add(bArrTransmitAPDU);
                i = i2;
            } catch (Exception e) {
                LogHelper.e("TmoneyEx", "getPurseListOrSwCode::" + LogHelper.printStackTraceToString(e));
            }
        }
        return arrayList;
    }

    public final f getRecentPurchase(d dVar) {
        int i = 0;
        while (i < 20) {
            i++;
            try {
                f fVar = new f(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0)));
                if (!fVar.isbResData()) {
                    return null;
                }
                if ("01".equals(fVar.getTag())) {
                    return fVar;
                }
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
                return null;
            }
        }
        return null;
    }

    public final f getRecentPurse(d dVar) {
        return getPurse(dVar, 0);
    }

    public final byte[] getRecentPurseByte(d dVar) {
        return getPurseByte(dVar, 0);
    }

    public final h getRecentTrans(d dVar) {
        return getTrans(dVar, 0);
    }

    public final byte[] getRecentTransByte(d dVar) {
        return getTransByte(dVar, 0);
    }

    public final h getTrans(d dVar, int i) {
        try {
            return new h(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) (i + 1), (byte) 0, 0, (byte) 0)));
        } catch (Exception e) {
            LogHelper.exception("TmoneyEx", e);
            return null;
        }
    }

    public final byte[] getTransByte(d dVar, int i) {
        try {
            return dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) (i + 1), (byte) 0, 0, (byte) 0));
        } catch (Exception e) {
            LogHelper.exception("TmoneyEx", e);
            return null;
        }
    }

    public final ArrayList<h> getTransList(d dVar) {
        ArrayList<h> arrayList = new ArrayList<>();
        int i = 0;
        while (i < 20) {
            i++;
            try {
                h hVar = new h(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0)));
                if (!hVar.isbResData()) {
                    break;
                }
                arrayList.add(hVar);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }

    public final ArrayList<h> getTransList(d dVar, int i) {
        if (i <= 0) {
            i = 1;
        }
        ArrayList<h> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < i) {
            i2++;
            try {
                h hVar = new h(dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) i2, (byte) 0, 0, (byte) 0)));
                if (!hVar.isbResData()) {
                    break;
                }
                arrayList.add(hVar);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }

    public final ArrayList<byte[]> getTransListBytes(d dVar) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i = 0;
        while (i < 20) {
            i++;
            try {
                byte[] bArrTransmitAPDU = dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0));
                if (!new h(bArrTransmitAPDU).isbResData()) {
                    break;
                }
                arrayList.add(bArrTransmitAPDU);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }

    public final ArrayList<byte[]> getTransListBytes(d dVar, int i) {
        if (i <= 0) {
            i = 1;
        }
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < i) {
            i2++;
            try {
                byte[] bArrTransmitAPDU = dVar.transmitAPDU(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) i2, (byte) 0, 0, (byte) 0));
                if (!new h(bArrTransmitAPDU).isbResData()) {
                    break;
                }
                arrayList.add(bArrTransmitAPDU);
            } catch (Exception e) {
                LogHelper.exception("TmoneyEx", e);
            }
        }
        return arrayList;
    }
}
